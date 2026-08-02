package defpackage;

import com.connectsdk.service.DeviceService;

/* loaded from: classes.dex */
public final class gio implements nio {
    public final mio a;
    public final int b;
    public azs c;
    public long d;
    public int e;
    public int f;
    public long g;
    public long h;

    public gio(mio mioVar) {
        this.a = mioVar;
        try {
            this.b = a(mioVar.d);
            this.d = -9223372036854775807L;
            this.e = -1;
            this.f = 0;
            this.g = 0L;
            this.h = -9223372036854775807L;
        } catch (r7k e) {
            xq0.t(e);
            throw null;
        }
    }

    public static int a(cee ceeVar) {
        String str = (String) ceeVar.get(DeviceService.KEY_CONFIG);
        int i = 0;
        i = 0;
        if (str != null && str.length() % 2 == 0) {
            byte[] w = dvt.w(str);
            v94 v94Var = new v94(w, w.length);
            int i2 = v94Var.i(1);
            if (i2 != 0) {
                throw new r7k(k5r.i(i2, "unsupported audio mux version: "), null, true, 0);
            }
            vq1.u("Only supports allStreamsSameTimeFraming.", v94Var.i(1) == 1);
            int i3 = v94Var.i(6);
            vq1.u("Only suppors one program.", v94Var.i(4) == 0);
            vq1.u("Only suppors one layer.", v94Var.i(3) == 0);
            i = i3;
        }
        return i + 1;
    }

    @Override // defpackage.nio
    public final void b(long j, long j2) {
        this.d = j;
        this.f = 0;
        this.g = j2;
    }

    @Override // defpackage.nio
    public final void c(t2c t2cVar, int i) {
        azs M = t2cVar.M(i, 2);
        this.c = M;
        int i2 = dvt.a;
        M.d(this.a.c);
    }

    @Override // defpackage.nio
    public final void d(long j) {
        vq1.A(this.d == -9223372036854775807L);
        this.d = j;
    }

    @Override // defpackage.nio
    public final void e(d7k d7kVar, long j, int i, boolean z) {
        vq1.B(this.c);
        int a = kio.a(this.e);
        if (this.f > 0 && a < i) {
            azs azsVar = this.c;
            azsVar.getClass();
            azsVar.a(this.h, 1, this.f, 0, null);
            this.f = 0;
            this.h = -9223372036854775807L;
        }
        for (int i2 = 0; i2 < this.b; i2++) {
            int i3 = 0;
            while (d7kVar.b < d7kVar.c) {
                int v = d7kVar.v();
                i3 += v;
                if (v != 255) {
                    break;
                }
            }
            this.c.b(d7kVar, i3, 0);
            this.f += i3;
        }
        this.h = o2g.l0(this.g, j, this.a.b, this.d);
        if (z) {
            azs azsVar2 = this.c;
            azsVar2.getClass();
            azsVar2.a(this.h, 1, this.f, 0, null);
            this.f = 0;
            this.h = -9223372036854775807L;
        }
        this.e = i;
    }
}
