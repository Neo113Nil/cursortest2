package Y5;

import com.google.android.gms.internal.ads.CL;
import q7.EnumC4937f;
import u8.s;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f4016g = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public u8.e f4017a = new u8.e();

    /* renamed from: b, reason: collision with root package name */
    public u8.e f4018b = new u8.e();

    /* renamed from: c, reason: collision with root package name */
    public final u8.d f4019c = new u8.d();

    /* renamed from: d, reason: collision with root package name */
    public byte[] f4020d = f4016g;

    /* renamed from: e, reason: collision with root package name */
    public int f4021e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f4022f;

    public m() {
        EnumC4937f enumC4937f = EnumC4937f.f40160u;
        this.f4022f = com.bumptech.glide.e.p(enumC4937f, new k());
        com.bumptech.glide.e.p(enumC4937f, new l(0, this));
    }

    public final void a() {
        byte[] bArr = this.f4020d;
        byte[] bArr2 = f4016g;
        if (bArr == bArr2) {
            return;
        }
        this.f4019c.close();
        this.f4018b.H(this.f4021e);
        this.f4018b.W(this.f4017a);
        u8.e eVar = this.f4017a;
        this.f4017a = this.f4018b;
        this.f4018b = eVar;
        this.f4020d = bArr2;
        this.f4021e = 0;
    }

    public final void b(int i) {
        if (this.f4021e >= i) {
            return;
        }
        a();
        u8.e eVar = this.f4018b;
        u8.d dVar = this.f4019c;
        byte[] bArr = v8.a.f41375a;
        u8.d dVar2 = dVar == u8.b.f41263a ? new u8.d() : dVar;
        if (dVar2.f41272n != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        dVar2.f41272n = eVar;
        dVar2.f41273u = true;
        if (i <= 0) {
            throw new IllegalArgumentException(CL.i(i, "minByteCount <= 0: ").toString());
        }
        if (i > 8192) {
            throw new IllegalArgumentException(CL.i(i, "minByteCount > Segment.SIZE: ").toString());
        }
        u8.e eVar2 = dVar.f41272n;
        if (eVar2 == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!dVar.f41273u) {
            throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
        }
        long j9 = eVar2.f41277u;
        s J = eVar2.J(i);
        int i4 = 8192 - J.f41313c;
        J.f41313c = 8192;
        eVar2.f41277u = i4 + j9;
        byte[] bArr2 = J.f41311a;
        dVar.f41274v = bArr2;
        dVar.f41275w = 8192;
        if (j9 == 0) {
            kotlin.jvm.internal.h.b(bArr2);
            if (8192 == bArr2.length) {
                byte[] bArr3 = dVar.f41274v;
                kotlin.jvm.internal.h.b(bArr3);
                this.f4020d = bArr3;
                this.f4021e = dVar.f41275w;
                return;
            }
        }
        throw new IllegalStateException("Check failed.");
    }
}
