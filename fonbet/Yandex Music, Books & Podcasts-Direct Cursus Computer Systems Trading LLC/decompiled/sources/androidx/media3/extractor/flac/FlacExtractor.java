package androidx.media3.extractor.flac;

import androidx.media3.extractor.FlacStreamMetadata;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import defpackage.azs;
import defpackage.bkp;
import defpackage.bq0;
import defpackage.bsc;
import defpackage.ci0;
import defpackage.d7k;
import defpackage.dsc;
import defpackage.dvt;
import defpackage.e7o;
import defpackage.eta;
import defpackage.fap;
import defpackage.g3a;
import defpackage.gm7;
import defpackage.l5i;
import defpackage.o03;
import defpackage.ogc;
import defpackage.pgc;
import defpackage.qwp;
import defpackage.r2c;
import defpackage.r7k;
import defpackage.s2c;
import defpackage.szf;
import defpackage.t2c;
import defpackage.u2i;
import defpackage.v94;
import defpackage.yde;
import defpackage.zg2;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class FlacExtractor implements r2c {
    public t2c e;
    public azs f;
    public u2i h;
    public FlacStreamMetadata i;
    public int j;
    public int k;
    public pgc l;
    public int m;
    public long n;
    public final byte[] a = new byte[42];
    public final d7k b = new d7k(new byte[SQLiteDatabase.OPEN_NOMUTEX], 0);
    public final boolean c = false;
    public final ci0 d = new ci0();
    public int g = 0;

    @Override // defpackage.r2c
    public final void a() {
    }

    @Override // defpackage.r2c
    public final void b(long j, long j2) {
        if (j == 0) {
            this.g = 0;
        } else {
            pgc pgcVar = this.l;
            if (pgcVar != null) {
                pgcVar.B(j2);
            }
        }
        this.n = j2 != 0 ? -1L : 0L;
        this.m = 0;
        this.b.E(0);
    }

    @Override // defpackage.r2c
    public final boolean d(s2c s2cVar) {
        qwp.j0(s2cVar, false);
        d7k d7kVar = new d7k(4);
        ((gm7) s2cVar).l(d7kVar.a, 0, 4, false);
        return d7kVar.x() == 1716281667;
    }

    @Override // defpackage.r2c
    public final int h(s2c s2cVar, ci0 ci0Var) {
        fap zg2Var;
        long j;
        boolean z;
        int i = this.g;
        if (i == 0) {
            boolean z2 = !this.c;
            s2cVar.n();
            long s = s2cVar.s();
            u2i j0 = qwp.j0(s2cVar, z2);
            s2cVar.y((int) (s2cVar.s() - s));
            this.h = j0;
            this.g = 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (i == 1) {
            s2cVar.A(bArr, 0, bArr.length);
            s2cVar.n();
            this.g = 2;
            return 0;
        }
        if (i == 2) {
            d7k d7kVar = new d7k(4);
            s2cVar.readFully(d7kVar.a, 0, 4);
            if (d7kVar.x() != 1716281667) {
                throw r7k.a(null, "Failed to read FLAC stream marker.");
            }
            this.g = 3;
            return 0;
        }
        if (i == 3) {
            FlacStreamMetadata flacStreamMetadata = this.i;
            boolean z3 = false;
            while (!z3) {
                s2cVar.n();
                byte[] bArr2 = new byte[4];
                v94 v94Var = new v94(bArr2, 4);
                s2cVar.A(bArr2, 0, 4);
                boolean h = v94Var.h();
                int i2 = v94Var.i(7);
                int i3 = v94Var.i(24) + 4;
                if (i2 == 0) {
                    byte[] bArr3 = new byte[38];
                    s2cVar.readFully(bArr3, 0, 38);
                    flacStreamMetadata = new FlacStreamMetadata(bArr3, 4);
                } else {
                    if (flacStreamMetadata == null) {
                        e7o.e();
                        return 0;
                    }
                    if (i2 == 3) {
                        d7k d7kVar2 = new d7k(i3);
                        s2cVar.readFully(d7kVar2.a, 0, i3);
                        flacStreamMetadata = flacStreamMetadata.copyWithSeekTable(qwp.m0(d7kVar2));
                    } else if (i2 == 4) {
                        d7k d7kVar3 = new d7k(i3);
                        s2cVar.readFully(d7kVar3.a, 0, i3);
                        d7kVar3.I(4);
                        flacStreamMetadata = flacStreamMetadata.copyWithVorbisComments(Arrays.asList(szf.n0(d7kVar3, false, false).a));
                    } else if (i2 == 6) {
                        d7k d7kVar4 = new d7k(i3);
                        s2cVar.readFully(d7kVar4.a, 0, i3);
                        d7kVar4.I(4);
                        flacStreamMetadata = flacStreamMetadata.copyWithPictureFrames(yde.y(PictureFrame.fromPictureBlock(d7kVar4)));
                    } else {
                        s2cVar.y(i3);
                    }
                }
                int i4 = dvt.a;
                this.i = flacStreamMetadata;
                z3 = h;
            }
            this.i.getClass();
            this.j = Math.max(this.i.minFrameSize, 6);
            dsc format = this.i.getFormat(bArr, this.h);
            azs azsVar = this.f;
            int i5 = dvt.a;
            bsc a = format.a();
            a.l = l5i.p("audio/flac");
            eta.o(a, azsVar);
            azs azsVar2 = this.f;
            this.i.getDurationUs();
            azsVar2.getClass();
            this.g = 4;
            return 0;
        }
        long j2 = 0;
        if (i == 4) {
            s2cVar.n();
            d7k d7kVar5 = new d7k(2);
            s2cVar.A(d7kVar5.a, 0, 2);
            int B = d7kVar5.B();
            if ((B >> 2) != 16382) {
                s2cVar.n();
                throw r7k.a(null, "First frame does not start with sync code.");
            }
            s2cVar.n();
            this.k = B;
            t2c t2cVar = this.e;
            int i6 = dvt.a;
            long position = s2cVar.getPosition();
            long length = s2cVar.getLength();
            this.i.getClass();
            FlacStreamMetadata flacStreamMetadata2 = this.i;
            if (flacStreamMetadata2.seekTable != null) {
                zg2Var = new zg2(flacStreamMetadata2, position, 1);
            } else if (length == -1 || flacStreamMetadata2.totalSamples <= 0) {
                zg2Var = new zg2(flacStreamMetadata2.getDurationUs());
            } else {
                pgc pgcVar = new pgc(new g3a(15, flacStreamMetadata2), new ogc(flacStreamMetadata2, this.k), flacStreamMetadata2.getDurationUs(), flacStreamMetadata2.totalSamples, position, length, flacStreamMetadata2.getApproxBytesPerFrame(), Math.max(6, flacStreamMetadata2.minFrameSize));
                this.l = pgcVar;
                zg2Var = (o03) pgcVar.c;
            }
            t2cVar.E(zg2Var);
            this.g = 5;
            return 0;
        }
        if (i != 5) {
            e7o.n();
            return 0;
        }
        this.f.getClass();
        this.i.getClass();
        pgc pgcVar2 = this.l;
        if (pgcVar2 != null && ((bq0) pgcVar2.e) != null) {
            return pgcVar2.t(s2cVar, ci0Var);
        }
        if (this.n == -1) {
            FlacStreamMetadata flacStreamMetadata3 = this.i;
            s2cVar.n();
            s2cVar.u(1);
            byte[] bArr4 = new byte[1];
            s2cVar.A(bArr4, 0, 1);
            boolean z4 = (bArr4[0] & 1) == 1;
            s2cVar.u(2);
            int i7 = z4 ? 7 : 6;
            d7k d7kVar6 = new d7k(i7);
            byte[] bArr5 = d7kVar6.a;
            int i8 = 0;
            while (i8 < i7) {
                int w = s2cVar.w(bArr5, i8, i7 - i8);
                if (w == -1) {
                    break;
                }
                i8 += w;
            }
            d7kVar6.G(i8);
            s2cVar.n();
            try {
                long C = d7kVar6.C();
                if (!z4) {
                    C *= flacStreamMetadata3.maxBlockSizeSamples;
                }
                j2 = C;
            } catch (NumberFormatException unused) {
                r3 = false;
            }
            if (!r3) {
                throw r7k.a(null, null);
            }
            this.n = j2;
        } else {
            d7k d7kVar7 = this.b;
            int i9 = d7kVar7.c;
            if (i9 < 32768) {
                int read = s2cVar.read(d7kVar7.a, i9, SQLiteDatabase.OPEN_NOMUTEX - i9);
                r3 = read == -1;
                if (!r3) {
                    d7kVar7.G(i9 + read);
                } else if (d7kVar7.a() == 0) {
                    long j3 = this.n * 1000000;
                    FlacStreamMetadata flacStreamMetadata4 = this.i;
                    int i10 = dvt.a;
                    this.f.a(j3 / flacStreamMetadata4.sampleRate, 1, this.m, 0, null);
                    return -1;
                }
            } else {
                r3 = false;
            }
            int i11 = d7kVar7.b;
            int i12 = this.m;
            int i13 = this.j;
            if (i12 < i13) {
                d7kVar7.I(Math.min(i13 - i12, d7kVar7.a()));
            }
            this.i.getClass();
            int i14 = d7kVar7.b;
            while (true) {
                int i15 = d7kVar7.c - 16;
                ci0 ci0Var2 = this.d;
                if (i14 <= i15) {
                    d7kVar7.H(i14);
                    if (bkp.Z(d7kVar7, this.i, this.k, ci0Var2)) {
                        d7kVar7.H(i14);
                        j = ci0Var2.a;
                        break;
                    }
                    i14++;
                } else {
                    if (r3) {
                        while (true) {
                            int i16 = d7kVar7.c;
                            if (i14 > i16 - this.j) {
                                d7kVar7.H(i16);
                                break;
                            }
                            d7kVar7.H(i14);
                            try {
                                z = bkp.Z(d7kVar7, this.i, this.k, ci0Var2);
                            } catch (IndexOutOfBoundsException unused2) {
                                z = false;
                            }
                            if (d7kVar7.b > d7kVar7.c) {
                                z = false;
                            }
                            if (z) {
                                d7kVar7.H(i14);
                                j = ci0Var2.a;
                                break;
                            }
                            i14++;
                        }
                    } else {
                        d7kVar7.H(i14);
                    }
                    j = -1;
                }
            }
            int i17 = d7kVar7.b - i11;
            d7kVar7.H(i11);
            this.f.b(d7kVar7, i17, 0);
            int i18 = this.m + i17;
            this.m = i18;
            if (j != -1) {
                long j4 = this.n * 1000000;
                FlacStreamMetadata flacStreamMetadata5 = this.i;
                int i19 = dvt.a;
                this.f.a(j4 / flacStreamMetadata5.sampleRate, 1, i18, 0, null);
                this.m = 0;
                this.n = j;
            }
            int length2 = d7kVar7.a.length - d7kVar7.c;
            if (d7kVar7.a() < 16 && length2 < 16) {
                int a2 = d7kVar7.a();
                byte[] bArr6 = d7kVar7.a;
                System.arraycopy(bArr6, d7kVar7.b, bArr6, 0, a2);
                d7kVar7.H(0);
                d7kVar7.G(a2);
            }
        }
        return 0;
    }

    @Override // defpackage.r2c
    public final void l(t2c t2cVar) {
        this.e = t2cVar;
        this.f = t2cVar.M(0, 1);
        t2cVar.K();
    }
}
