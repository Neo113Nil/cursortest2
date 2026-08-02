package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class qil0 implements wil0 {
    public final vil0 a;
    public g001 b;
    public long d;
    public boolean f;
    public boolean g;
    public long c = -1;
    public int e = -1;

    public qil0(vil0 vil0Var) {
        this.a = vil0Var;
    }

    @Override // defpackage.wil0
    public final void a(long j, long j2) {
        this.c = j;
        this.d = j2;
    }

    @Override // defpackage.wil0
    public final void b(long j) {
        this.c = j;
    }

    @Override // defpackage.wil0
    public final void c(ef90 ef90Var, long j, int i, boolean z) {
        d6z.z(this.b);
        if (!this.f) {
            int i2 = ef90Var.b;
            d6z.k("ID Header has insufficient data", ef90Var.c > 18);
            d6z.k("ID Header missing", ef90Var.w(8, StandardCharsets.UTF_8).equals("OpusHead"));
            d6z.k("version number must always be 1", ef90Var.y() == 1);
            ef90Var.K(i2);
            ArrayList a = xub1.a(ef90Var.a);
            f7s a2 = this.a.c.a();
            a2.p = a;
            smw0.u(a2, this.b);
            this.f = true;
        } else if (this.g) {
            int a3 = sil0.a(this.e);
            if (i != a3) {
                int i3 = tw21.a;
                Locale locale = Locale.US;
                lk91.j("Received RTP packet with unexpected sequence number. Expected: " + a3 + "; received: " + i + Extension.DOT_CHAR);
            }
            int a4 = ef90Var.a();
            this.b.a(ef90Var, a4, 0);
            this.b.c(qva1.d(48000, this.d, j, this.c), 1, a4, 0, null);
        } else {
            d6z.k("Comment Header has insufficient data", ef90Var.c >= 8);
            d6z.k("Comment Header should follow ID Header", ef90Var.w(8, StandardCharsets.UTF_8).equals("OpusTags"));
            this.g = true;
        }
        this.e = i;
    }

    @Override // defpackage.wil0
    public final void d(d5p d5pVar, int i) {
        g001 B = d5pVar.B(i, 1);
        this.b = B;
        B.d(this.a.c);
    }
}
