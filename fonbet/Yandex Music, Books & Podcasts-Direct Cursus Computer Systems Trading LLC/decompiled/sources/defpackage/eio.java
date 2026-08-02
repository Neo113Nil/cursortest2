package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import java.util.Locale;

/* loaded from: classes.dex */
public final class eio implements nio {
    public final /* synthetic */ int a;
    public final mio b;
    public azs c;
    public long d;
    public long e;
    public int f;
    public int g;
    public long h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;

    public eio(mio mioVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = mioVar;
                this.d = -9223372036854775807L;
                this.g = -1;
                this.h = -9223372036854775807L;
                this.e = 0L;
                this.f = -1;
                this.i = -1;
                this.j = -1;
                break;
            default:
                this.b = mioVar;
                this.d = -9223372036854775807L;
                this.g = -1;
                break;
        }
    }

    @Override // defpackage.nio
    public final void b(long j, long j2) {
        switch (this.a) {
            case 0:
                this.d = j;
                this.f = 0;
                this.e = j2;
                break;
            default:
                this.d = j;
                this.g = -1;
                this.e = j2;
                break;
        }
    }

    @Override // defpackage.nio
    public final void c(t2c t2cVar, int i) {
        switch (this.a) {
            case 0:
                azs M = t2cVar.M(i, 2);
                this.c = M;
                M.d(this.b.c);
                break;
            default:
                azs M2 = t2cVar.M(i, 2);
                this.c = M2;
                M2.d(this.b.c);
                break;
        }
    }

    @Override // defpackage.nio
    public final void d(long j) {
        switch (this.a) {
            case 0:
                vq1.A(this.d == -9223372036854775807L);
                this.d = j;
                break;
            default:
                vq1.A(this.d == -9223372036854775807L);
                this.d = j;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nio
    public final void e(d7k d7kVar, long j, int i, boolean z) {
        int i2;
        int i3;
        int i4 = this.a;
        mio mioVar = this.b;
        switch (i4) {
            case 0:
                vq1.B(this.c);
                int i5 = d7kVar.b;
                int B = d7kVar.B();
                Object[] objArr = (B & 1024) > 0;
                if ((B & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 || (B & 504) != 0 || (B & 7) != 0) {
                    vq1.n0("RtpH263Reader", "Dropping packet: video reduncancy coding is not supported, packet header VRC, or PLEN or PEBIT is non-zero");
                    break;
                } else {
                    boolean z2 = this.m;
                    if (objArr == true) {
                        if (z2 && this.f > 0) {
                            azs azsVar = this.c;
                            azsVar.getClass();
                            azsVar.a(this.h, this.k ? 1 : 0, this.f, 0, null);
                            this.f = 0;
                            this.h = -9223372036854775807L;
                            this.k = false;
                            this.m = false;
                        }
                        this.m = true;
                        if ((d7kVar.e() & 252) < 128) {
                            vq1.n0("RtpH263Reader", "Picture start Code (PSC) missing, dropping packet.");
                            break;
                        } else {
                            byte[] bArr = d7kVar.a;
                            bArr[i5] = 0;
                            bArr[i5 + 1] = 0;
                            d7kVar.H(i5);
                        }
                    } else if (z2) {
                        int a = kio.a(this.g);
                        if (i < a) {
                            int i6 = dvt.a;
                            Locale locale = Locale.US;
                            vq1.n0("RtpH263Reader", dfi.f("Received RTP packet with unexpected sequence number. Expected: ", a, i, "; received: ", ". Dropping packet."));
                            break;
                        }
                    } else {
                        vq1.n0("RtpH263Reader", "First payload octet of the H263 packet is not the beginning of a new H263 partition, Dropping current packet.");
                        break;
                    }
                    if (this.f == 0) {
                        boolean z3 = this.l;
                        int i7 = d7kVar.b;
                        if (((d7kVar.x() >> 10) & 63) == 32) {
                            int e = d7kVar.e();
                            int i8 = (e >> 1) & 1;
                            if (!z3 && i8 == 0) {
                                int i9 = (e >> 2) & 7;
                                if (i9 == 1) {
                                    this.i = 128;
                                    this.j = 96;
                                } else {
                                    int i10 = i9 - 2;
                                    this.i = 176 << i10;
                                    this.j = 144 << i10;
                                }
                            }
                            d7kVar.H(i7);
                            this.k = i8 == 0;
                        } else {
                            d7kVar.H(i7);
                            this.k = false;
                        }
                        if (!this.l && this.k) {
                            int i11 = this.i;
                            dsc dscVar = mioVar.c;
                            if (i11 != dscVar.u || this.j != dscVar.v) {
                                azs azsVar2 = this.c;
                                bsc a2 = dscVar.a();
                                a2.t = this.i;
                                a2.u = this.j;
                                eta.o(a2, azsVar2);
                            }
                            this.l = true;
                        }
                    }
                    int a3 = d7kVar.a();
                    this.c.b(d7kVar, a3, 0);
                    this.f += a3;
                    this.h = o2g.l0(this.e, j, ScreenMirroringConfig.Video.CLOCK_RATE, this.d);
                    if (z) {
                        azs azsVar3 = this.c;
                        azsVar3.getClass();
                        azsVar3.a(this.h, this.k ? 1 : 0, this.f, 0, null);
                        this.f = 0;
                        this.h = -9223372036854775807L;
                        this.k = false;
                        this.m = false;
                    }
                    this.g = i;
                    break;
                }
                break;
            default:
                vq1.B(this.c);
                int v = d7kVar.v();
                int i12 = v & 8;
                boolean z4 = this.k;
                if (i12 == 8) {
                    if (z4 && this.g > 0) {
                        azs azsVar4 = this.c;
                        azsVar4.getClass();
                        azsVar4.a(this.h, this.m ? 1 : 0, this.g, 0, null);
                        this.g = -1;
                        this.h = -9223372036854775807L;
                        this.k = false;
                    }
                    this.k = true;
                } else if (z4) {
                    int a4 = kio.a(this.f);
                    if (i < a4) {
                        int i13 = dvt.a;
                        Locale locale2 = Locale.US;
                        vq1.n0("RtpVp9Reader", dfi.f("Received RTP packet with unexpected sequence number. Expected: ", a4, i, "; received: ", ". Dropping packet."));
                        break;
                    }
                } else {
                    vq1.n0("RtpVp9Reader", "First payload octet of the RTP packet is not the beginning of a new VP9 partition, Dropping current packet.");
                    break;
                }
                if ((v & 128) == 0 || (d7kVar.v() & 128) == 0 || d7kVar.a() >= 1) {
                    int i14 = v & 16;
                    vq1.u("VP9 flexible mode is not supported.", i14 == 0);
                    if ((v & 32) != 0) {
                        d7kVar.I(1);
                        if (d7kVar.a() >= 1) {
                            if (i14 == 0) {
                                d7kVar.I(1);
                            }
                        }
                    }
                    if ((v & 2) != 0) {
                        int v2 = d7kVar.v();
                        int i15 = (v2 >> 5) & 7;
                        if ((v2 & 16) != 0) {
                            int i16 = i15 + 1;
                            if (d7kVar.a() >= i16 * 4) {
                                for (int i17 = 0; i17 < i16; i17++) {
                                    this.i = d7kVar.B();
                                    this.j = d7kVar.B();
                                }
                            }
                        }
                        if ((v2 & 8) != 0) {
                            int v3 = d7kVar.v();
                            if (d7kVar.a() >= v3) {
                                for (int i18 = 0; i18 < v3; i18++) {
                                    int B2 = (d7kVar.B() & 12) >> 2;
                                    if (d7kVar.a() < B2) {
                                        break;
                                    } else {
                                        d7kVar.I(B2);
                                    }
                                }
                            }
                        }
                    }
                    if (this.g == -1 && this.k) {
                        this.m = (d7kVar.e() & 4) == 0;
                    }
                    if (!this.l && (i2 = this.i) != -1 && (i3 = this.j) != -1) {
                        dsc dscVar2 = mioVar.c;
                        if (i2 != dscVar2.u || i3 != dscVar2.v) {
                            azs azsVar5 = this.c;
                            bsc a5 = dscVar2.a();
                            a5.t = this.i;
                            a5.u = this.j;
                            eta.o(a5, azsVar5);
                        }
                        this.l = true;
                    }
                    int a6 = d7kVar.a();
                    this.c.b(d7kVar, a6, 0);
                    int i19 = this.g;
                    if (i19 == -1) {
                        this.g = a6;
                    } else {
                        this.g = i19 + a6;
                    }
                    this.h = o2g.l0(this.e, j, ScreenMirroringConfig.Video.CLOCK_RATE, this.d);
                    if (z) {
                        azs azsVar6 = this.c;
                        azsVar6.getClass();
                        azsVar6.a(this.h, this.m ? 1 : 0, this.g, 0, null);
                        this.g = -1;
                        this.h = -9223372036854775807L;
                        this.k = false;
                    }
                    this.f = i;
                    break;
                }
                break;
        }
    }
}
