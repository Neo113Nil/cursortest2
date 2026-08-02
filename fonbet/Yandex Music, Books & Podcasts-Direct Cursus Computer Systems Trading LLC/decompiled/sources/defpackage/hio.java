package defpackage;

import com.connectsdk.service.airplay.PListParser;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import java.util.Locale;

/* loaded from: classes.dex */
public final class hio implements nio {
    public final mio a;
    public azs b;
    public int c;
    public long d = -9223372036854775807L;
    public int e = -1;
    public long f;
    public int g;

    public hio(mio mioVar) {
        this.a = mioVar;
    }

    @Override // defpackage.nio
    public final void b(long j, long j2) {
        this.d = j;
        this.f = j2;
        this.g = 0;
    }

    @Override // defpackage.nio
    public final void c(t2c t2cVar, int i) {
        azs M = t2cVar.M(i, 2);
        this.b = M;
        int i2 = dvt.a;
        M.d(this.a.c);
    }

    @Override // defpackage.nio
    public final void e(d7k d7kVar, long j, int i, boolean z) {
        int i2;
        int a;
        vq1.B(this.b);
        int i3 = this.e;
        if (i3 != -1 && i != (a = kio.a(i3))) {
            int i4 = dvt.a;
            Locale locale = Locale.US;
            vq1.n0("RtpMpeg4Reader", dfi.f("Received RTP packet with unexpected sequence number. Expected: ", a, i, "; received: ", ". Dropping packet."));
        }
        int a2 = d7kVar.a();
        this.b.b(d7kVar, a2, 0);
        if (this.g == 0) {
            byte[] bArr = d7kVar.a;
            byte[] bArr2 = {0, 0, 1, -74};
            o2g.O(bArr, PListParser.TAG_ARRAY);
            int i5 = 0;
            loop0: while (true) {
                if (i5 >= bArr.length - 3) {
                    i5 = -1;
                    break;
                }
                for (int i6 = 0; i6 < 4; i6++) {
                    if (bArr[i5 + i6] != bArr2[i6]) {
                        break;
                    }
                }
                break loop0;
                i5++;
            }
            if (i5 != -1) {
                d7kVar.H(i5 + 4);
                if ((d7kVar.e() >> 6) == 0) {
                    i2 = 1;
                    this.c = i2;
                }
            }
            i2 = 0;
            this.c = i2;
        }
        this.g += a2;
        if (z) {
            if (this.d == -9223372036854775807L) {
                this.d = j;
            }
            this.b.a(o2g.l0(this.f, j, ScreenMirroringConfig.Video.CLOCK_RATE, this.d), this.c, this.g, 0, null);
            this.g = 0;
        }
        this.e = i;
    }

    @Override // defpackage.nio
    public final void d(long j) {
    }
}
