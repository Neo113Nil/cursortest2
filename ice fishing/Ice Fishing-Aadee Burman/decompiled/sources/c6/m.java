package c6;

import a.AbstractC0422a;
import com.icefishing.icefishinglive2.AbstractC4404f;
import u7.EnumC5088f;
import y8.s;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f5611g = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public y8.e f5612a = new y8.e();

    /* renamed from: b, reason: collision with root package name */
    public y8.e f5613b = new y8.e();

    /* renamed from: c, reason: collision with root package name */
    public final y8.d f5614c = new y8.d();

    /* renamed from: d, reason: collision with root package name */
    public byte[] f5615d = f5611g;

    /* renamed from: e, reason: collision with root package name */
    public int f5616e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f5617f;

    public m() {
        EnumC5088f enumC5088f = EnumC5088f.f41327u;
        this.f5617f = AbstractC0422a.p(enumC5088f, new k());
        AbstractC0422a.p(enumC5088f, new l(0, this));
    }

    public final void a() {
        byte[] bArr = this.f5615d;
        byte[] bArr2 = f5611g;
        if (bArr == bArr2) {
            return;
        }
        this.f5614c.close();
        this.f5613b.H(this.f5616e);
        this.f5613b.W(this.f5612a);
        y8.e eVar = this.f5612a;
        this.f5612a = this.f5613b;
        this.f5613b = eVar;
        this.f5615d = bArr2;
        this.f5616e = 0;
    }

    public final void b(int i) {
        if (this.f5616e >= i) {
            return;
        }
        a();
        y8.e eVar = this.f5613b;
        y8.d dVar = this.f5614c;
        byte[] bArr = z8.a.f42272a;
        y8.d dVar2 = dVar == y8.b.f41936a ? new y8.d() : dVar;
        if (dVar2.f41945n != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        dVar2.f41945n = eVar;
        dVar2.f41946u = true;
        if (i <= 0) {
            throw new IllegalArgumentException(AbstractC4404f.e(i, "minByteCount <= 0: ").toString());
        }
        if (i > 8192) {
            throw new IllegalArgumentException(AbstractC4404f.e(i, "minByteCount > Segment.SIZE: ").toString());
        }
        y8.e eVar2 = dVar.f41945n;
        if (eVar2 == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!dVar.f41946u) {
            throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
        }
        long j6 = eVar2.f41950u;
        s J = eVar2.J(i);
        int i6 = 8192 - J.f41986c;
        J.f41986c = 8192;
        eVar2.f41950u = i6 + j6;
        byte[] bArr2 = J.f41984a;
        dVar.f41947v = bArr2;
        dVar.f41948w = 8192;
        if (j6 == 0) {
            kotlin.jvm.internal.h.b(bArr2);
            if (8192 == bArr2.length) {
                byte[] bArr3 = dVar.f41947v;
                kotlin.jvm.internal.h.b(bArr3);
                this.f5615d = bArr3;
                this.f5616e = dVar.f41948w;
                return;
            }
        }
        throw new IllegalStateException("Check failed.");
    }
}
