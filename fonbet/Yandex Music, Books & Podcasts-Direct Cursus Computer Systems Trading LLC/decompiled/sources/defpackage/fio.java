package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import java.util.Locale;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class fio implements nio {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public int f;
    public long g;
    public int h;
    public int i;
    public long j;

    public fio(mio mioVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new d7k();
                this.c = new d7k(zc4.h);
                this.d = mioVar;
                this.g = -9223372036854775807L;
                this.h = -1;
                break;
            default:
                this.c = new d7k(zc4.h);
                this.d = mioVar;
                this.b = new d7k();
                this.g = -9223372036854775807L;
                this.h = -1;
                break;
        }
    }

    @Override // defpackage.nio
    public void b(long j, long j2) {
        switch (this.a) {
            case 0:
                this.g = j;
                this.i = 0;
                this.j = j2;
                break;
            default:
                this.g = j;
                this.i = 0;
                this.j = j2;
                break;
        }
    }

    @Override // defpackage.nio
    public void c(t2c t2cVar, int i) {
        switch (this.a) {
            case 0:
                azs M = t2cVar.M(i, 2);
                this.e = M;
                int i2 = dvt.a;
                M.d(((mio) this.d).c);
                break;
            default:
                azs M2 = t2cVar.M(i, 2);
                this.e = M2;
                M2.d(((mio) this.d).c);
                break;
        }
    }

    @Override // defpackage.nio
    public void d(long j) {
        int i = this.a;
    }

    @Override // defpackage.nio
    public void e(d7k d7kVar, long j, int i, boolean z) {
        int i2;
        int i3 = this.a;
        Object obj = this.b;
        int i4 = 1;
        switch (i3) {
            case 0:
                try {
                    int i5 = d7kVar.a[0] & 31;
                    vq1.B((azs) this.e);
                    if (i5 > 0 && i5 < 24) {
                        int a = d7kVar.a();
                        this.i = g() + this.i;
                        ((azs) this.e).b(d7kVar, a, 0);
                        this.i += a;
                        this.f = (d7kVar.a[0] & 31) == 5 ? 1 : 0;
                    } else if (i5 == 24) {
                        d7kVar.v();
                        while (d7kVar.a() > 4) {
                            int B = d7kVar.B();
                            this.i = g() + this.i;
                            ((azs) this.e).b(d7kVar, B, 0);
                            this.i += B;
                        }
                        this.f = 0;
                    } else {
                        if (i5 != 28) {
                            throw r7k.b(String.format("RTP H264 packetization mode [%d] not supported.", Integer.valueOf(i5)), null);
                        }
                        d7k d7kVar2 = (d7k) obj;
                        byte[] bArr = d7kVar.a;
                        byte b = bArr[0];
                        byte b2 = bArr[1];
                        int i6 = (b & 224) | (b2 & 31);
                        boolean z2 = (b2 & 128) > 0;
                        boolean z3 = (b2 & 64) > 0;
                        if (z2) {
                            this.i = g() + this.i;
                            byte[] bArr2 = d7kVar.a;
                            i2 = 1;
                            bArr2[1] = (byte) i6;
                            d7kVar2.getClass();
                            d7kVar2.F(bArr2.length, bArr2);
                            d7kVar2.H(1);
                        } else {
                            i2 = 1;
                            int a2 = kio.a(this.h);
                            if (i != a2) {
                                int i7 = dvt.a;
                                Locale locale = Locale.US;
                                vq1.n0("RtpH264Reader", dfi.f("Received RTP packet with unexpected sequence number. Expected: ", a2, i, "; received: ", ". Dropping packet."));
                            } else {
                                byte[] bArr3 = d7kVar.a;
                                d7kVar2.getClass();
                                d7kVar2.F(bArr3.length, bArr3);
                                d7kVar2.H(2);
                            }
                        }
                        int a3 = d7kVar2.a();
                        ((azs) this.e).b(d7kVar2, a3, 0);
                        this.i += a3;
                        if (z3) {
                            this.f = (i6 & 31) == 5 ? i2 : 0;
                        }
                    }
                    if (z) {
                        if (this.g == -9223372036854775807L) {
                            this.g = j;
                        }
                        ((azs) this.e).a(o2g.l0(this.j, j, ScreenMirroringConfig.Video.CLOCK_RATE, this.g), this.f, this.i, 0, null);
                        this.i = 0;
                    }
                    this.h = i;
                    return;
                } catch (IndexOutOfBoundsException e) {
                    throw r7k.b(null, e);
                }
            default:
                d7k d7kVar3 = (d7k) this.c;
                byte[] bArr4 = d7kVar.a;
                if (bArr4.length == 0) {
                    throw r7k.b("Empty RTP data packet.", null);
                }
                int i8 = (bArr4[0] >> 1) & 63;
                vq1.B((azs) this.e);
                if (i8 >= 0 && i8 < 48) {
                    int a4 = d7kVar.a();
                    int i9 = this.i;
                    d7kVar3.H(0);
                    int a5 = d7kVar3.a();
                    azs azsVar = (azs) this.e;
                    azsVar.getClass();
                    azsVar.b(d7kVar3, a5, 0);
                    this.i = a5 + i9;
                    ((azs) this.e).b(d7kVar, a4, 0);
                    this.i += a4;
                    int i10 = (d7kVar.a[0] >> 1) & 63;
                    if (i10 != 19 && i10 != 20) {
                        i4 = 0;
                    }
                    this.f = i4;
                } else {
                    if (i8 == 48) {
                        qq6.d("need to implement processAggregationPacket");
                        return;
                    }
                    if (i8 != 49) {
                        throw r7k.b(String.format("RTP H265 payload type [%d] not supported.", Integer.valueOf(i8)), null);
                    }
                    d7k d7kVar4 = (d7k) obj;
                    byte[] bArr5 = d7kVar.a;
                    if (bArr5.length < 3) {
                        throw r7k.b("Malformed FU header.", null);
                    }
                    int i11 = bArr5[1] & 7;
                    byte b3 = bArr5[2];
                    int i12 = b3 & 63;
                    boolean z4 = (b3 & 128) > 0;
                    boolean z5 = (b3 & 64) > 0;
                    if (z4) {
                        int i13 = this.i;
                        d7kVar3.H(0);
                        int a6 = d7kVar3.a();
                        azs azsVar2 = (azs) this.e;
                        azsVar2.getClass();
                        azsVar2.b(d7kVar3, a6, 0);
                        this.i = a6 + i13;
                        byte[] bArr6 = d7kVar.a;
                        bArr6[1] = (byte) ((i12 << 1) & 127);
                        bArr6[2] = (byte) i11;
                        d7kVar4.getClass();
                        d7kVar4.F(bArr6.length, bArr6);
                        d7kVar4.H(1);
                    } else {
                        int i14 = (this.h + 1) % 65535;
                        if (i != i14) {
                            int i15 = dvt.a;
                            Locale locale2 = Locale.US;
                            vq1.n0("RtpH265Reader", dfi.f("Received RTP packet with unexpected sequence number. Expected: ", i14, i, "; received: ", ". Dropping packet."));
                        } else {
                            d7kVar4.getClass();
                            d7kVar4.F(bArr5.length, bArr5);
                            d7kVar4.H(3);
                        }
                    }
                    int a7 = d7kVar4.a();
                    ((azs) this.e).b(d7kVar4, a7, 0);
                    this.i += a7;
                    if (z5) {
                        this.f = (i12 == 19 || i12 == 20) ? 1 : 0;
                    }
                }
                if (z) {
                    if (this.g == -9223372036854775807L) {
                        this.g = j;
                    }
                    ((azs) this.e).a(o2g.l0(this.j, j, ScreenMirroringConfig.Video.CLOCK_RATE, this.g), this.f, this.i, 0, null);
                    this.i = 0;
                }
                this.h = i;
                return;
        }
    }

    public int g() {
        d7k d7kVar = (d7k) this.c;
        d7kVar.H(0);
        int a = d7kVar.a();
        azs azsVar = (azs) this.e;
        azsVar.getClass();
        azsVar.b(d7kVar, a, 0);
        return a;
    }

    private final void a(long j) {
    }

    private final void f(long j) {
    }

    public fio(String str, String str2, long j, int i, int i2, int i3, int[] iArr, TreeMap treeMap) {
        this.a = 2;
        this.b = str;
        this.c = str2;
        this.g = j;
        this.j = 0L;
        this.f = i;
        this.h = i2;
        this.i = i3;
        this.d = iArr;
        this.e = treeMap;
    }
}
