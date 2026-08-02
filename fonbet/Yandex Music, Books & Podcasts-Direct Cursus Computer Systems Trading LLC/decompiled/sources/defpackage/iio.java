package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class iio implements nio {
    public final mio a;
    public azs b;
    public long d;
    public boolean f;
    public boolean g;
    public long c = -1;
    public int e = -1;

    public iio(mio mioVar) {
        this.a = mioVar;
    }

    @Override // defpackage.nio
    public final void b(long j, long j2) {
        this.c = j;
        this.d = j2;
    }

    @Override // defpackage.nio
    public final void c(t2c t2cVar, int i) {
        azs M = t2cVar.M(i, 1);
        this.b = M;
        M.d(this.a.c);
    }

    @Override // defpackage.nio
    public final void d(long j) {
        this.c = j;
    }

    @Override // defpackage.nio
    public final void e(d7k d7kVar, long j, int i, boolean z) {
        vq1.B(this.b);
        if (!this.f) {
            int i2 = d7kVar.b;
            vq1.u("ID Header has insufficient data", d7kVar.c > 18);
            vq1.u("ID Header missing", d7kVar.t(8, StandardCharsets.UTF_8).equals("OpusHead"));
            vq1.u("version number must always be 1", d7kVar.v() == 1);
            d7kVar.H(i2);
            ArrayList A = u7g.A(d7kVar.a);
            bsc a = this.a.c.a();
            a.p = A;
            eta.o(a, this.b);
            this.f = true;
        } else if (this.g) {
            int a2 = kio.a(this.e);
            if (i != a2) {
                int i3 = dvt.a;
                Locale locale = Locale.US;
                vq1.n0("RtpOpusReader", dfi.f("Received RTP packet with unexpected sequence number. Expected: ", a2, i, "; received: ", "."));
            }
            int a3 = d7kVar.a();
            this.b.b(d7kVar, a3, 0);
            this.b.a(o2g.l0(this.d, j, ScreenMirroringConfig.Audio.SAMPLING_RATE, this.c), 1, a3, 0, null);
        } else {
            vq1.u("Comment Header has insufficient data", d7kVar.c >= 8);
            vq1.u("Comment Header should follow ID Header", d7kVar.t(8, StandardCharsets.UTF_8).equals("OpusTags"));
            this.g = true;
        }
        this.e = i;
    }
}
