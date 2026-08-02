package w1;

import com.google.android.gms.internal.ads.C2964aq;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;
import u1.InterfaceC5066e;
import x1.C5187e;
import x1.C5188f;

/* loaded from: classes.dex */
public final class y implements InterfaceC5066e {

    /* renamed from: j, reason: collision with root package name */
    public static final P1.l f41577j = new P1.l(50, 0);

    /* renamed from: b, reason: collision with root package name */
    public final C2964aq f41578b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC5066e f41579c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC5066e f41580d;

    /* renamed from: e, reason: collision with root package name */
    public final int f41581e;

    /* renamed from: f, reason: collision with root package name */
    public final int f41582f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f41583g;

    /* renamed from: h, reason: collision with root package name */
    public final u1.h f41584h;
    public final u1.l i;

    public y(C2964aq c2964aq, InterfaceC5066e interfaceC5066e, InterfaceC5066e interfaceC5066e2, int i, int i4, u1.l lVar, Class cls, u1.h hVar) {
        this.f41578b = c2964aq;
        this.f41579c = interfaceC5066e;
        this.f41580d = interfaceC5066e2;
        this.f41581e = i;
        this.f41582f = i4;
        this.i = lVar;
        this.f41583g = cls;
        this.f41584h = hVar;
    }

    @Override // u1.InterfaceC5066e
    public final void b(MessageDigest messageDigest) {
        Object h3;
        C2964aq c2964aq = this.f41578b;
        synchronized (c2964aq) {
            C5188f c5188f = (C5188f) c2964aq.f29919w;
            x1.i iVar = (x1.i) ((ArrayDeque) c5188f.f67u).poll();
            if (iVar == null) {
                iVar = c5188f.m();
            }
            C5187e c5187e = (C5187e) iVar;
            c5187e.f41820b = 8;
            c5187e.f41821c = byte[].class;
            h3 = c2964aq.h(c5187e, byte[].class);
        }
        byte[] bArr = (byte[]) h3;
        ByteBuffer.wrap(bArr).putInt(this.f41581e).putInt(this.f41582f).array();
        this.f41580d.b(messageDigest);
        this.f41579c.b(messageDigest);
        messageDigest.update(bArr);
        u1.l lVar = this.i;
        if (lVar != null) {
            lVar.b(messageDigest);
        }
        this.f41584h.b(messageDigest);
        P1.l lVar2 = f41577j;
        Class cls = this.f41583g;
        byte[] bArr2 = (byte[]) lVar2.a(cls);
        if (bArr2 == null) {
            bArr2 = cls.getName().getBytes(InterfaceC5066e.f41005a);
            lVar2.f(cls, bArr2);
        }
        messageDigest.update(bArr2);
        this.f41578b.k(bArr);
    }

    @Override // u1.InterfaceC5066e
    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (this.f41582f == yVar.f41582f && this.f41581e == yVar.f41581e && P1.p.b(this.i, yVar.i) && this.f41583g.equals(yVar.f41583g) && this.f41579c.equals(yVar.f41579c) && this.f41580d.equals(yVar.f41580d) && this.f41584h.equals(yVar.f41584h)) {
                return true;
            }
        }
        return false;
    }

    @Override // u1.InterfaceC5066e
    public final int hashCode() {
        int hashCode = ((((this.f41580d.hashCode() + (this.f41579c.hashCode() * 31)) * 31) + this.f41581e) * 31) + this.f41582f;
        u1.l lVar = this.i;
        if (lVar != null) {
            hashCode = (hashCode * 31) + lVar.hashCode();
        }
        return this.f41584h.f41011b.hashCode() + ((this.f41583g.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f41579c + ", signature=" + this.f41580d + ", width=" + this.f41581e + ", height=" + this.f41582f + ", decodedResourceClass=" + this.f41583g + ", transformation='" + this.i + "', options=" + this.f41584h + '}';
    }
}
