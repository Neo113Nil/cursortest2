package defpackage;

import android.os.SystemClock;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class dio implements r2c {
    public final nio a;
    public final d7k b;
    public final d7k c;
    public final int d;
    public final Object e;
    public final krd f;
    public t2c g;
    public boolean h;
    public volatile long i;
    public volatile int j;
    public boolean k;
    public long l;
    public long m;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public dio(mio mioVar, int i) {
        char c;
        nio eioVar;
        nio nioVar;
        this.d = i;
        String str = mioVar.c.n;
        str.getClass();
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1606874997:
                if (str.equals("audio/amr-wb")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1503095341:
                if (str.equals("audio/3gpp")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                eioVar = new eio(mioVar, 0);
                nioVar = eioVar;
                break;
            case 1:
                eioVar = new fio(mioVar, 1);
                nioVar = eioVar;
                break;
            case 2:
            case '\b':
                eioVar = new zho(mioVar);
                nioVar = eioVar;
                break;
            case 3:
                eioVar = mioVar.e.equals("MP4A-LATM") ? new gio(mioVar) : new xho(mioVar);
                nioVar = eioVar;
                break;
            case 4:
                eioVar = new yho(mioVar);
                nioVar = eioVar;
                break;
            case 5:
            case '\f':
            case '\r':
                eioVar = new oio(mioVar);
                nioVar = eioVar;
                break;
            case 6:
                eioVar = new hio(mioVar);
                nioVar = eioVar;
                break;
            case 7:
                eioVar = new fio(mioVar, 0);
                nioVar = eioVar;
                break;
            case '\t':
                eioVar = new iio(mioVar);
                nioVar = eioVar;
                break;
            case '\n':
                eioVar = new pio(mioVar);
                nioVar = eioVar;
                break;
            case 11:
                eioVar = new eio(mioVar, 1);
                nioVar = eioVar;
                break;
            default:
                nioVar = null;
                break;
        }
        nioVar.getClass();
        this.a = nioVar;
        this.b = new d7k(65507);
        this.c = new d7k();
        this.e = new Object();
        krd krdVar = new krd();
        krdVar.d = new TreeSet(new mj(27));
        krdVar.e();
        this.f = krdVar;
        this.i = -9223372036854775807L;
        this.j = -1;
        this.l = -9223372036854775807L;
        this.m = -9223372036854775807L;
    }

    @Override // defpackage.r2c
    public final void b(long j, long j2) {
        synchronized (this.e) {
            try {
                if (!this.k) {
                    this.k = true;
                }
                this.l = j;
                this.m = j2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.r2c
    public final boolean d(s2c s2cVar) {
        throw new UnsupportedOperationException("RTP packets are transmitted in a packet stream do not support sniffing.");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00cc  */
    @Override // defpackage.r2c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(s2c s2cVar, ci0 ci0Var) {
        boolean z;
        this.g.getClass();
        int read = s2cVar.read(this.b.a, 0, 65507);
        if (read == -1) {
            return -1;
        }
        if (read == 0) {
            return 0;
        }
        this.b.H(0);
        this.b.G(read);
        d7k d7kVar = this.b;
        byte[] bArr = kio.g;
        kio kioVar = null;
        if (d7kVar.a() >= 12) {
            int v = d7kVar.v();
            byte b = (byte) (v >> 6);
            byte b2 = (byte) (v & 15);
            boolean z2 = ((v >> 4) & 1) == 1;
            if (b == 2) {
                int v2 = d7kVar.v();
                boolean z3 = ((v2 >> 7) & 1) == 1;
                byte b3 = (byte) (v2 & 127);
                int B = d7kVar.B();
                long x = d7kVar.x();
                int h = d7kVar.h();
                if (b2 > 0) {
                    byte[] bArr2 = new byte[b2 * 4];
                    z = true;
                    for (int i = 0; i < b2; i++) {
                        d7kVar.f(bArr2, i * 4, 4);
                    }
                } else {
                    z = true;
                }
                if (z2) {
                    d7kVar.I(2);
                    short s = d7kVar.s();
                    if (s != 0) {
                        d7kVar.I(s * 4);
                    }
                }
                byte[] bArr3 = new byte[d7kVar.a()];
                d7kVar.f(bArr3, 0, d7kVar.a());
                jio jioVar = new jio();
                jioVar.f = bArr;
                jioVar.a = z3;
                jioVar.b = b3;
                vq1.v((B < 0 || B > 65535) ? false : z);
                jioVar.c = 65535 & B;
                jioVar.d = x;
                jioVar.e = h;
                jioVar.f = bArr3;
                kioVar = new kio(jioVar);
                if (kioVar != null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = elapsedRealtime - 30;
                    krd krdVar = this.f;
                    synchronized (krdVar) {
                        if (((TreeSet) krdVar.d).size() >= 5000) {
                            throw new IllegalStateException("Queue size limit of 5000 reached.");
                        }
                        int i2 = kioVar.c;
                        if (!krdVar.c) {
                            krdVar.e();
                            krdVar.b = pd.Q(i2 - 1);
                            krdVar.c = z;
                            krdVar.a(new lio(kioVar, elapsedRealtime));
                        } else if (Math.abs(krd.b(i2, kio.a(krdVar.a))) >= 1000) {
                            krdVar.b = pd.Q(i2 - 1);
                            ((TreeSet) krdVar.d).clear();
                            krdVar.a(new lio(kioVar, elapsedRealtime));
                        } else if (krd.b(i2, krdVar.b) > 0) {
                            krdVar.a(new lio(kioVar, elapsedRealtime));
                        }
                    }
                    kio d = this.f.d(j);
                    if (d != null) {
                        if (!this.h) {
                            if (this.i == -9223372036854775807L) {
                                this.i = d.d;
                            }
                            if (this.j == -1) {
                                this.j = d.c;
                            }
                            this.a.d(this.i);
                            this.h = true;
                        }
                        synchronized (this.e) {
                            try {
                                if (!this.k) {
                                    do {
                                        d7k d7kVar2 = this.c;
                                        byte[] bArr4 = d.f;
                                        d7kVar2.getClass();
                                        d7kVar2.F(bArr4.length, bArr4);
                                        this.a.e(this.c, d.d, d.c, d.a);
                                        d = this.f.d(j);
                                    } while (d != null);
                                } else if (this.l != -9223372036854775807L && this.m != -9223372036854775807L) {
                                    this.f.e();
                                    this.a.b(this.l, this.m);
                                    this.k = false;
                                    this.l = -9223372036854775807L;
                                    this.m = -9223372036854775807L;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return 0;
                    }
                }
                return 0;
            }
        }
        z = true;
        if (kioVar != null) {
        }
        return 0;
    }

    @Override // defpackage.r2c
    public final void l(t2c t2cVar) {
        this.a.c(t2cVar, this.d);
        t2cVar.K();
        t2cVar.E(new zg2(-9223372036854775807L));
        this.g = t2cVar;
    }

    @Override // defpackage.r2c
    public final void a() {
    }
}
