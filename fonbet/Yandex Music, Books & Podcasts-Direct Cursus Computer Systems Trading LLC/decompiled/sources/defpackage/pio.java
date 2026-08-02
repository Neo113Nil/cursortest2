package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import java.util.Locale;

/* loaded from: classes.dex */
public final class pio implements nio {
    public final mio a;
    public azs b;
    public long c = -9223372036854775807L;
    public int d = -1;
    public int e = -1;
    public long f = -9223372036854775807L;
    public long g = 0;
    public boolean h;
    public boolean i;
    public boolean j;

    public pio(mio mioVar) {
        this.a = mioVar;
    }

    @Override // defpackage.nio
    public final void b(long j, long j2) {
        this.c = j;
        this.e = -1;
        this.g = j2;
    }

    @Override // defpackage.nio
    public final void c(t2c t2cVar, int i) {
        azs M = t2cVar.M(i, 2);
        this.b = M;
        M.d(this.a.c);
    }

    @Override // defpackage.nio
    public final void d(long j) {
        vq1.A(this.c == -9223372036854775807L);
        this.c = j;
    }

    @Override // defpackage.nio
    public final void e(d7k d7kVar, long j, int i, boolean z) {
        vq1.B(this.b);
        int v = d7kVar.v();
        if ((v & 16) == 16 && (v & 7) == 0) {
            if (this.h && this.e > 0) {
                azs azsVar = this.b;
                azsVar.getClass();
                azsVar.a(this.f, this.i ? 1 : 0, this.e, 0, null);
                this.e = -1;
                this.f = -9223372036854775807L;
                this.h = false;
            }
            this.h = true;
        } else {
            if (!this.h) {
                vq1.n0("RtpVP8Reader", "RTP packet is not the start of a new VP8 partition, skipping.");
                return;
            }
            int a = kio.a(this.d);
            if (i < a) {
                int i2 = dvt.a;
                Locale locale = Locale.US;
                vq1.n0("RtpVP8Reader", dfi.f("Received RTP packet with unexpected sequence number. Expected: ", a, i, "; received: ", ". Dropping packet."));
                return;
            }
        }
        if ((v & 128) != 0) {
            int v2 = d7kVar.v();
            if ((v2 & 128) != 0 && (d7kVar.v() & 128) != 0) {
                d7kVar.I(1);
            }
            if ((v2 & 64) != 0) {
                d7kVar.I(1);
            }
            if ((v2 & 32) != 0 || (v2 & 16) != 0) {
                d7kVar.I(1);
            }
        }
        if (this.e == -1 && this.h) {
            this.i = (d7kVar.e() & 1) == 0;
        }
        if (!this.j) {
            int i3 = d7kVar.b;
            d7kVar.H(i3 + 6);
            int o = d7kVar.o() & 16383;
            int o2 = d7kVar.o() & 16383;
            d7kVar.H(i3);
            dsc dscVar = this.a.c;
            if (o != dscVar.u || o2 != dscVar.v) {
                azs azsVar2 = this.b;
                bsc a2 = dscVar.a();
                a2.t = o;
                a2.u = o2;
                eta.o(a2, azsVar2);
            }
            this.j = true;
        }
        int a3 = d7kVar.a();
        this.b.b(d7kVar, a3, 0);
        int i4 = this.e;
        if (i4 == -1) {
            this.e = a3;
        } else {
            this.e = i4 + a3;
        }
        this.f = o2g.l0(this.g, j, ScreenMirroringConfig.Video.CLOCK_RATE, this.c);
        if (z) {
            azs azsVar3 = this.b;
            azsVar3.getClass();
            azsVar3.a(this.f, this.i ? 1 : 0, this.e, 0, null);
            this.e = -1;
            this.f = -9223372036854775807L;
            this.h = false;
        }
        this.d = i;
    }
}
