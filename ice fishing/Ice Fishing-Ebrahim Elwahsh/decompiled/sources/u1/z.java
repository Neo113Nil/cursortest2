package u1;

import com.google.android.gms.internal.ads.C3112dq;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;
import s1.InterfaceC4992e;
import v1.C5120d;
import v1.C5121e;

/* loaded from: classes.dex */
public final class z implements InterfaceC4992e {

    /* renamed from: j, reason: collision with root package name */
    public static final N1.l f41209j = new N1.l(50, 0);

    /* renamed from: b, reason: collision with root package name */
    public final C3112dq f41210b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4992e f41211c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC4992e f41212d;

    /* renamed from: e, reason: collision with root package name */
    public final int f41213e;

    /* renamed from: f, reason: collision with root package name */
    public final int f41214f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f41215g;

    /* renamed from: h, reason: collision with root package name */
    public final s1.h f41216h;
    public final s1.l i;

    public z(C3112dq c3112dq, InterfaceC4992e interfaceC4992e, InterfaceC4992e interfaceC4992e2, int i, int i4, s1.l lVar, Class cls, s1.h hVar) {
        this.f41210b = c3112dq;
        this.f41211c = interfaceC4992e;
        this.f41212d = interfaceC4992e2;
        this.f41213e = i;
        this.f41214f = i4;
        this.i = lVar;
        this.f41215g = cls;
        this.f41216h = hVar;
    }

    @Override // s1.InterfaceC4992e
    public final void a(MessageDigest messageDigest) {
        Object h9;
        C3112dq c3112dq = this.f41210b;
        synchronized (c3112dq) {
            C5121e c5121e = (C5121e) c3112dq.f30235w;
            v1.g gVar = (v1.g) ((ArrayDeque) c5121e.f37200u).poll();
            if (gVar == null) {
                gVar = c5121e.m();
            }
            C5120d c5120d = (C5120d) gVar;
            c5120d.f41336b = 8;
            c5120d.f41337c = byte[].class;
            h9 = c3112dq.h(c5120d, byte[].class);
        }
        byte[] bArr = (byte[]) h9;
        ByteBuffer.wrap(bArr).putInt(this.f41213e).putInt(this.f41214f).array();
        this.f41212d.a(messageDigest);
        this.f41211c.a(messageDigest);
        messageDigest.update(bArr);
        s1.l lVar = this.i;
        if (lVar != null) {
            lVar.a(messageDigest);
        }
        this.f41216h.a(messageDigest);
        N1.l lVar2 = f41209j;
        Class cls = this.f41215g;
        byte[] bArr2 = (byte[]) lVar2.b(cls);
        if (bArr2 == null) {
            bArr2 = cls.getName().getBytes(InterfaceC4992e.f40420a);
            lVar2.f(cls, bArr2);
        }
        messageDigest.update(bArr2);
        this.f41210b.k(bArr);
    }

    @Override // s1.InterfaceC4992e
    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.f41214f == zVar.f41214f && this.f41213e == zVar.f41213e && N1.p.b(this.i, zVar.i) && this.f41215g.equals(zVar.f41215g) && this.f41211c.equals(zVar.f41211c) && this.f41212d.equals(zVar.f41212d) && this.f41216h.equals(zVar.f41216h)) {
                return true;
            }
        }
        return false;
    }

    @Override // s1.InterfaceC4992e
    public final int hashCode() {
        int hashCode = ((((this.f41212d.hashCode() + (this.f41211c.hashCode() * 31)) * 31) + this.f41213e) * 31) + this.f41214f;
        s1.l lVar = this.i;
        if (lVar != null) {
            hashCode = (hashCode * 31) + lVar.hashCode();
        }
        return this.f41216h.f40426b.hashCode() + ((this.f41215g.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f41211c + ", signature=" + this.f41212d + ", width=" + this.f41213e + ", height=" + this.f41214f + ", decodedResourceClass=" + this.f41215g + ", transformation='" + this.i + "', options=" + this.f41216h + '}';
    }
}
