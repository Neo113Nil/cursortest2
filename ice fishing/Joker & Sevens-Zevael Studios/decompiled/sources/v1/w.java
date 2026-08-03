package v1;

import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class w implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7158a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f7159b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f7160c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7161d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f0 f7162e;

    public /* synthetic */ w(f0 f0Var, a0 a0Var, int i10, f0 f0Var2, int i11) {
        this.f7158a = i11;
        this.f7160c = a0Var;
        this.f7161d = i10;
        this.f7162e = f0Var2;
        this.f7159b = f0Var;
    }

    @Override // v1.f0
    public final Map a() {
        switch (this.f7158a) {
        }
        return this.f7159b.a();
    }

    @Override // v1.f0
    public final void b() {
        switch (this.f7158a) {
            case 0:
                int i10 = this.f7161d;
                a0 a0Var = this.f7160c;
                a0Var.f7056k = i10;
                this.f7162e.b();
                s.g0 g0Var = a0Var.f7063r;
                long[] jArr = g0Var.f6266a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j3 = jArr[i11];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((255 & j3) < 128) {
                                    int i14 = (i11 << 3) + i13;
                                    Object obj = g0Var.f6267b[i14];
                                    q0 q0Var = (q0) g0Var.f6268c[i14];
                                    int i15 = a0Var.f7064s.i(obj);
                                    if (i15 < 0 || i15 >= a0Var.f7056k) {
                                        q0Var.a();
                                        g0Var.l(i14);
                                    }
                                }
                                j3 >>= 8;
                            }
                            if (i12 != 8) {
                                break;
                            }
                        }
                        if (i11 == length) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                break;
            default:
                int i16 = this.f7161d;
                a0 a0Var2 = this.f7160c;
                a0Var2.f7055j = i16;
                this.f7162e.b();
                a0Var2.c(a0Var2.f7055j);
                break;
        }
    }

    @Override // v1.f0
    public final int c() {
        switch (this.f7158a) {
        }
        return this.f7159b.c();
    }

    @Override // v1.f0
    public final oc.c d() {
        switch (this.f7158a) {
        }
        return this.f7159b.d();
    }

    @Override // v1.f0
    public final int e() {
        switch (this.f7158a) {
        }
        return this.f7159b.e();
    }
}
