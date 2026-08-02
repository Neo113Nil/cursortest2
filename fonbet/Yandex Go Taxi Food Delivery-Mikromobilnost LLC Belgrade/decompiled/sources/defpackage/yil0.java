package defpackage;

import androidx.media3.common.a;
import java.util.Locale;

/* loaded from: classes10.dex */
public final class yil0 implements wil0 {
    public final vil0 a;
    public g001 b;
    public long c = -9223372036854775807L;
    public int d = -1;
    public int e = -1;
    public long f = -9223372036854775807L;
    public long g = 0;
    public boolean h;
    public boolean i;
    public boolean j;

    public yil0(vil0 vil0Var) {
        this.a = vil0Var;
    }

    @Override // defpackage.wil0
    public final void a(long j, long j2) {
        this.c = j;
        this.e = -1;
        this.g = j2;
    }

    @Override // defpackage.wil0
    public final void b(long j) {
        d6z.x(this.c == -9223372036854775807L);
        this.c = j;
    }

    @Override // defpackage.wil0
    public final void c(ef90 ef90Var, long j, int i, boolean z) {
        d6z.z(this.b);
        int y = ef90Var.y();
        if ((y & 16) == 16 && (y & 7) == 0) {
            if (this.h && this.e > 0) {
                g001 g001Var = this.b;
                g001Var.getClass();
                g001Var.c(this.f, this.i ? 1 : 0, this.e, 0, null);
                this.e = -1;
                this.f = -9223372036854775807L;
                this.h = false;
            }
            this.h = true;
        } else {
            if (!this.h) {
                lk91.j("RTP packet is not the start of a new VP8 partition, skipping.");
                return;
            }
            int a = sil0.a(this.d);
            if (i < a) {
                int i2 = tw21.a;
                Locale locale = Locale.US;
                lk91.j("Received RTP packet with unexpected sequence number. Expected: " + a + "; received: " + i + ". Dropping packet.");
                return;
            }
        }
        if ((y & 128) != 0) {
            int y2 = ef90Var.y();
            if ((y2 & 128) != 0 && (ef90Var.y() & 128) != 0) {
                ef90Var.L(1);
            }
            if ((y2 & 64) != 0) {
                ef90Var.L(1);
            }
            if ((y2 & 32) != 0 || (y2 & 16) != 0) {
                ef90Var.L(1);
            }
        }
        if (this.e == -1 && this.h) {
            this.i = (ef90Var.h() & 1) == 0;
        }
        if (!this.j) {
            int i3 = ef90Var.b;
            ef90Var.K(i3 + 6);
            int r = ef90Var.r() & 16383;
            int r2 = ef90Var.r() & 16383;
            ef90Var.K(i3);
            a aVar = this.a.c;
            if (r != aVar.u || r2 != aVar.v) {
                g001 g001Var2 = this.b;
                f7s a2 = aVar.a();
                a2.t = r;
                a2.u = r2;
                smw0.u(a2, g001Var2);
            }
            this.j = true;
        }
        int a3 = ef90Var.a();
        this.b.a(ef90Var, a3, 0);
        int i4 = this.e;
        if (i4 == -1) {
            this.e = a3;
        } else {
            this.e = i4 + a3;
        }
        this.f = qva1.d(90000, this.g, j, this.c);
        if (z) {
            g001 g001Var3 = this.b;
            g001Var3.getClass();
            g001Var3.c(this.f, this.i ? 1 : 0, this.e, 0, null);
            this.e = -1;
            this.f = -9223372036854775807L;
            this.h = false;
        }
        this.d = i;
    }

    @Override // defpackage.wil0
    public final void d(d5p d5pVar, int i) {
        g001 B = d5pVar.B(i, 2);
        this.b = B;
        B.d(this.a.c);
    }
}
