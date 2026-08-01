package u1;

import com.google.android.gms.internal.ads.C2941aq;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;
import s1.InterfaceC4970e;
import v1.C5107d;
import v1.C5108e;

/* loaded from: classes.dex */
public final class z implements InterfaceC4970e {

    /* renamed from: j, reason: collision with root package name */
    public static final N1.l f41194j = new N1.l(50, 0);

    /* renamed from: b, reason: collision with root package name */
    public final C2941aq f41195b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4970e f41196c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC4970e f41197d;

    /* renamed from: e, reason: collision with root package name */
    public final int f41198e;

    /* renamed from: f, reason: collision with root package name */
    public final int f41199f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f41200g;

    /* renamed from: h, reason: collision with root package name */
    public final s1.h f41201h;
    public final s1.l i;

    public z(C2941aq c2941aq, InterfaceC4970e interfaceC4970e, InterfaceC4970e interfaceC4970e2, int i, int i6, s1.l lVar, Class cls, s1.h hVar) {
        this.f41195b = c2941aq;
        this.f41196c = interfaceC4970e;
        this.f41197d = interfaceC4970e2;
        this.f41198e = i;
        this.f41199f = i6;
        this.i = lVar;
        this.f41200g = cls;
        this.f41201h = hVar;
    }

    @Override // s1.InterfaceC4970e
    public final void a(MessageDigest messageDigest) {
        Object h9;
        C2941aq c2941aq = this.f41195b;
        synchronized (c2941aq) {
            C5108e c5108e = (C5108e) c2941aq.f29134w;
            v1.g gVar = (v1.g) ((ArrayDeque) c5108e.f1720u).poll();
            if (gVar == null) {
                gVar = c5108e.m();
            }
            C5107d c5107d = (C5107d) gVar;
            c5107d.f41366b = 8;
            c5107d.f41367c = byte[].class;
            h9 = c2941aq.h(c5107d, byte[].class);
        }
        byte[] bArr = (byte[]) h9;
        ByteBuffer.wrap(bArr).putInt(this.f41198e).putInt(this.f41199f).array();
        this.f41197d.a(messageDigest);
        this.f41196c.a(messageDigest);
        messageDigest.update(bArr);
        s1.l lVar = this.i;
        if (lVar != null) {
            lVar.a(messageDigest);
        }
        this.f41201h.a(messageDigest);
        N1.l lVar2 = f41194j;
        Class cls = this.f41200g;
        byte[] bArr2 = (byte[]) lVar2.a(cls);
        if (bArr2 == null) {
            bArr2 = cls.getName().getBytes(InterfaceC4970e.f40451a);
            lVar2.f(cls, bArr2);
        }
        messageDigest.update(bArr2);
        this.f41195b.k(bArr);
    }

    @Override // s1.InterfaceC4970e
    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.f41199f == zVar.f41199f && this.f41198e == zVar.f41198e && N1.p.b(this.i, zVar.i) && this.f41200g.equals(zVar.f41200g) && this.f41196c.equals(zVar.f41196c) && this.f41197d.equals(zVar.f41197d) && this.f41201h.equals(zVar.f41201h)) {
                return true;
            }
        }
        return false;
    }

    @Override // s1.InterfaceC4970e
    public final int hashCode() {
        int hashCode = ((((this.f41197d.hashCode() + (this.f41196c.hashCode() * 31)) * 31) + this.f41198e) * 31) + this.f41199f;
        s1.l lVar = this.i;
        if (lVar != null) {
            hashCode = (hashCode * 31) + lVar.hashCode();
        }
        return this.f41201h.f40457b.hashCode() + ((this.f41200g.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f41196c + ", signature=" + this.f41197d + ", width=" + this.f41198e + ", height=" + this.f41199f + ", decodedResourceClass=" + this.f41200g + ", transformation='" + this.i + "', options=" + this.f41201h + '}';
    }
}
