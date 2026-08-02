package c6;

import N3.C;
import com.google.android.gms.internal.ads.Wv;
import u7.EnumC5080f;
import y8.s;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f5787g = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public y8.e f5788a = new y8.e();

    /* renamed from: b, reason: collision with root package name */
    public y8.e f5789b = new y8.e();

    /* renamed from: c, reason: collision with root package name */
    public final y8.d f5790c = new y8.d();

    /* renamed from: d, reason: collision with root package name */
    public byte[] f5791d = f5787g;

    /* renamed from: e, reason: collision with root package name */
    public int f5792e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f5793f;

    public m() {
        EnumC5080f enumC5080f = EnumC5080f.f41050u;
        this.f5793f = C.N(enumC5080f, new k());
        C.N(enumC5080f, new l(0, this));
    }

    public final void a() {
        byte[] bArr = this.f5791d;
        byte[] bArr2 = f5787g;
        if (bArr == bArr2) {
            return;
        }
        this.f5790c.close();
        this.f5789b.H(this.f5792e);
        this.f5789b.W(this.f5788a);
        y8.e eVar = this.f5788a;
        this.f5788a = this.f5789b;
        this.f5789b = eVar;
        this.f5791d = bArr2;
        this.f5792e = 0;
    }

    public final void b(int i) {
        if (this.f5792e >= i) {
            return;
        }
        a();
        y8.e eVar = this.f5789b;
        y8.d dVar = this.f5790c;
        byte[] bArr = z8.a.f42244a;
        y8.d dVar2 = dVar == y8.b.f41910a ? new y8.d() : dVar;
        if (dVar2.f41919n != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        dVar2.f41919n = eVar;
        dVar2.f41920u = true;
        if (i <= 0) {
            throw new IllegalArgumentException(Wv.f(i, "minByteCount <= 0: ").toString());
        }
        if (i > 8192) {
            throw new IllegalArgumentException(Wv.f(i, "minByteCount > Segment.SIZE: ").toString());
        }
        y8.e eVar2 = dVar.f41919n;
        if (eVar2 == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!dVar.f41920u) {
            throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
        }
        long j6 = eVar2.f41924u;
        s J = eVar2.J(i);
        int i4 = 8192 - J.f41960c;
        J.f41960c = 8192;
        eVar2.f41924u = i4 + j6;
        byte[] bArr2 = J.f41958a;
        dVar.f41921v = bArr2;
        dVar.f41922w = 8192;
        if (j6 == 0) {
            kotlin.jvm.internal.h.b(bArr2);
            if (8192 == bArr2.length) {
                byte[] bArr3 = dVar.f41921v;
                kotlin.jvm.internal.h.b(bArr3);
                this.f5791d = bArr3;
                this.f5792e = dVar.f41922w;
                return;
            }
        }
        throw new IllegalStateException("Check failed.");
    }
}
