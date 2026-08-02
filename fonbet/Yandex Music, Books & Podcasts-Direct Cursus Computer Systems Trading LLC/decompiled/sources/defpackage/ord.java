package defpackage;

import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
public final class ord implements q2b {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final y8p a;
    public final d7k b;
    public final boolean[] c = new boolean[4];
    public final mrd d;
    public final csb e;
    public nrd f;
    public long g;
    public String h;
    public azs i;
    public boolean j;
    public long k;

    public ord(y8p y8pVar) {
        this.a = y8pVar;
        mrd mrdVar = new mrd();
        mrdVar.e = new byte[128];
        this.d = mrdVar;
        this.k = -9223372036854775807L;
        this.e = new csb(178);
        this.b = new d7k();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013e  */
    @Override // defpackage.q2b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(d7k d7kVar) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        float f;
        vq1.B(this.f);
        vq1.B(this.i);
        int i5 = d7kVar.b;
        int i6 = d7kVar.c;
        byte[] bArr = d7kVar.a;
        this.g += d7kVar.a();
        int i7 = 0;
        this.i.b(d7kVar, d7kVar.a(), 0);
        while (true) {
            int z2 = zc4.z(bArr, i5, i6, this.c);
            mrd mrdVar = this.d;
            csb csbVar = this.e;
            if (z2 == i6) {
                if (!this.j) {
                    mrdVar.a(bArr, i5, i6);
                }
                this.f.a(bArr, i5, i6);
                if (csbVar != null) {
                    csbVar.a(bArr, i5, i6);
                    return;
                }
                return;
            }
            int i8 = z2 + 3;
            byte b = d7kVar.a[i8];
            int i9 = b & 255;
            int i10 = z2 - i5;
            if (this.j) {
                i = i6;
                i2 = i8;
            } else {
                if (i10 > 0) {
                    mrdVar.a(bArr, i5, z2);
                }
                int i11 = i10 < 0 ? -i10 : i7;
                int i12 = mrdVar.b;
                if (i12 != 0) {
                    i = i6;
                    if (i12 == 1) {
                        i2 = i8;
                        i4 = 0;
                        if (i9 != 181) {
                            vq1.n0("H263Reader", "Unexpected start code value");
                            mrdVar.a = false;
                            mrdVar.c = 0;
                            mrdVar.b = 0;
                        } else {
                            mrdVar.b = 2;
                        }
                    } else if (i12 != 2) {
                        i2 = i8;
                        if (i12 != 3) {
                            if (i12 != 4) {
                                e7o.n();
                                return;
                            }
                            if (i9 == 179 || i9 == 181) {
                                mrdVar.c -= i11;
                                mrdVar.a = false;
                                azs azsVar = this.i;
                                int i13 = mrdVar.d;
                                String str = this.h;
                                str.getClass();
                                byte[] copyOf = Arrays.copyOf(mrdVar.e, mrdVar.c);
                                v94 v94Var = new v94(copyOf, copyOf.length);
                                v94Var.u(i13);
                                v94Var.u(4);
                                v94Var.s();
                                v94Var.t(8);
                                if (v94Var.h()) {
                                    v94Var.t(4);
                                    v94Var.t(3);
                                }
                                int i14 = v94Var.i(4);
                                if (i14 == 15) {
                                    int i15 = v94Var.i(8);
                                    int i16 = v94Var.i(8);
                                    if (i16 == 0) {
                                        vq1.n0("H263Reader", "Invalid aspect ratio");
                                        f = 1.0f;
                                        if (v94Var.h()) {
                                            v94Var.t(2);
                                            v94Var.t(1);
                                            if (v94Var.h()) {
                                                v94Var.t(15);
                                                v94Var.s();
                                                v94Var.t(15);
                                                v94Var.s();
                                                v94Var.t(15);
                                                v94Var.s();
                                                v94Var.t(3);
                                                v94Var.t(11);
                                                v94Var.s();
                                                v94Var.t(15);
                                                v94Var.s();
                                            }
                                        }
                                        if (v94Var.i(2) != 0) {
                                            vq1.n0("H263Reader", "Unhandled video object layer shape");
                                        }
                                        v94Var.s();
                                        int i17 = v94Var.i(16);
                                        v94Var.s();
                                        if (v94Var.h()) {
                                            if (i17 == 0) {
                                                vq1.n0("H263Reader", "Invalid vop_increment_time_resolution");
                                            } else {
                                                int i18 = 0;
                                                for (int i19 = i17 - 1; i19 > 0; i19 >>= 1) {
                                                    i18++;
                                                }
                                                v94Var.t(i18);
                                            }
                                        }
                                        v94Var.s();
                                        int i20 = v94Var.i(13);
                                        v94Var.s();
                                        int i21 = v94Var.i(13);
                                        v94Var.s();
                                        v94Var.s();
                                        bsc bscVar = new bsc();
                                        bscVar.a = str;
                                        bscVar.l = l5i.p("video/mp2t");
                                        bscVar.m = l5i.p("video/mp4v-es");
                                        bscVar.t = i20;
                                        bscVar.u = i21;
                                        bscVar.x = f;
                                        bscVar.p = Collections.singletonList(copyOf);
                                        eta.o(bscVar, azsVar);
                                        this.j = true;
                                    } else {
                                        f = i15 / i16;
                                        if (v94Var.h()) {
                                        }
                                        if (v94Var.i(2) != 0) {
                                        }
                                        v94Var.s();
                                        int i172 = v94Var.i(16);
                                        v94Var.s();
                                        if (v94Var.h()) {
                                        }
                                        v94Var.s();
                                        int i202 = v94Var.i(13);
                                        v94Var.s();
                                        int i212 = v94Var.i(13);
                                        v94Var.s();
                                        v94Var.s();
                                        bsc bscVar2 = new bsc();
                                        bscVar2.a = str;
                                        bscVar2.l = l5i.p("video/mp2t");
                                        bscVar2.m = l5i.p("video/mp4v-es");
                                        bscVar2.t = i202;
                                        bscVar2.u = i212;
                                        bscVar2.x = f;
                                        bscVar2.p = Collections.singletonList(copyOf);
                                        eta.o(bscVar2, azsVar);
                                        this.j = true;
                                    }
                                } else if (i14 < 7) {
                                    f = l[i14];
                                    if (v94Var.h()) {
                                    }
                                    if (v94Var.i(2) != 0) {
                                    }
                                    v94Var.s();
                                    int i1722 = v94Var.i(16);
                                    v94Var.s();
                                    if (v94Var.h()) {
                                    }
                                    v94Var.s();
                                    int i2022 = v94Var.i(13);
                                    v94Var.s();
                                    int i2122 = v94Var.i(13);
                                    v94Var.s();
                                    v94Var.s();
                                    bsc bscVar22 = new bsc();
                                    bscVar22.a = str;
                                    bscVar22.l = l5i.p("video/mp2t");
                                    bscVar22.m = l5i.p("video/mp4v-es");
                                    bscVar22.t = i2022;
                                    bscVar22.u = i2122;
                                    bscVar22.x = f;
                                    bscVar22.p = Collections.singletonList(copyOf);
                                    eta.o(bscVar22, azsVar);
                                    this.j = true;
                                } else {
                                    vq1.n0("H263Reader", "Invalid aspect ratio");
                                    f = 1.0f;
                                    if (v94Var.h()) {
                                    }
                                    if (v94Var.i(2) != 0) {
                                    }
                                    v94Var.s();
                                    int i17222 = v94Var.i(16);
                                    v94Var.s();
                                    if (v94Var.h()) {
                                    }
                                    v94Var.s();
                                    int i20222 = v94Var.i(13);
                                    v94Var.s();
                                    int i21222 = v94Var.i(13);
                                    v94Var.s();
                                    v94Var.s();
                                    bsc bscVar222 = new bsc();
                                    bscVar222.a = str;
                                    bscVar222.l = l5i.p("video/mp2t");
                                    bscVar222.m = l5i.p("video/mp4v-es");
                                    bscVar222.t = i20222;
                                    bscVar222.u = i21222;
                                    bscVar222.x = f;
                                    bscVar222.p = Collections.singletonList(copyOf);
                                    eta.o(bscVar222, azsVar);
                                    this.j = true;
                                }
                            } else {
                                i4 = 0;
                            }
                        } else if ((b & 240) != 32) {
                            vq1.n0("H263Reader", "Unexpected start code value");
                            i4 = 0;
                            mrdVar.a = false;
                            mrdVar.c = 0;
                            mrdVar.b = 0;
                        } else {
                            i4 = 0;
                            mrdVar.d = mrdVar.c;
                            mrdVar.b = 4;
                        }
                    } else {
                        i2 = i8;
                        i4 = 0;
                        if (i9 > 31) {
                            vq1.n0("H263Reader", "Unexpected start code value");
                            mrdVar.a = false;
                            mrdVar.c = 0;
                            mrdVar.b = 0;
                        } else {
                            mrdVar.b = 3;
                        }
                    }
                } else {
                    i = i6;
                    i2 = i8;
                    i4 = 0;
                    if (i9 == 176) {
                        mrdVar.b = 1;
                        mrdVar.a = true;
                    }
                }
                mrdVar.a(mrd.f, i4, 3);
            }
            this.f.a(bArr, i5, z2);
            if (csbVar != null) {
                if (i10 > 0) {
                    csbVar.a(bArr, i5, z2);
                    i3 = 0;
                } else {
                    i3 = -i10;
                }
                if (csbVar.d(i3)) {
                    int d0 = zc4.d0(csbVar.c, (byte[]) csbVar.f);
                    int i22 = dvt.a;
                    byte[] bArr2 = (byte[]) csbVar.f;
                    d7k d7kVar2 = this.b;
                    d7kVar2.F(d0, bArr2);
                    this.a.c(this.k, d7kVar2);
                }
                if (i9 == 178) {
                    z = true;
                    if (d7kVar.a[z2 + 2] == 1) {
                        csbVar.g(i9);
                    }
                    int i23 = i - z2;
                    this.f.b(i23, this.g - i23, this.j);
                    nrd nrdVar = this.f;
                    long j = this.k;
                    nrdVar.e = i9;
                    nrdVar.d = false;
                    nrdVar.b = (i9 != 182 || i9 == 179) ? z : false;
                    nrdVar.c = i9 != 182 ? z : false;
                    i7 = 0;
                    nrdVar.f = 0;
                    nrdVar.h = j;
                    i6 = i;
                    i5 = i2;
                }
            }
            z = true;
            int i232 = i - z2;
            this.f.b(i232, this.g - i232, this.j);
            nrd nrdVar2 = this.f;
            long j2 = this.k;
            nrdVar2.e = i9;
            nrdVar2.d = false;
            nrdVar2.b = (i9 != 182 || i9 == 179) ? z : false;
            nrdVar2.c = i9 != 182 ? z : false;
            i7 = 0;
            nrdVar2.f = 0;
            nrdVar2.h = j2;
            i6 = i;
            i5 = i2;
        }
    }

    @Override // defpackage.q2b
    public final void c() {
        zc4.t(this.c);
        mrd mrdVar = this.d;
        mrdVar.a = false;
        mrdVar.c = 0;
        mrdVar.b = 0;
        nrd nrdVar = this.f;
        if (nrdVar != null) {
            nrdVar.b = false;
            nrdVar.c = false;
            nrdVar.d = false;
            nrdVar.e = -1;
        }
        csb csbVar = this.e;
        if (csbVar != null) {
            csbVar.f();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    @Override // defpackage.q2b
    public final void d(boolean z) {
        vq1.B(this.f);
        if (z) {
            this.f.b(0, this.g, this.j);
            nrd nrdVar = this.f;
            nrdVar.b = false;
            nrdVar.c = false;
            nrdVar.d = false;
            nrdVar.e = -1;
        }
    }

    @Override // defpackage.q2b
    public final void e(t2c t2cVar, cp2 cp2Var) {
        cp2Var.g();
        cp2Var.i();
        this.h = (String) cp2Var.e;
        cp2Var.i();
        azs M = t2cVar.M(cp2Var.c, 2);
        this.i = M;
        this.f = new nrd(M);
        this.a.e(t2cVar, cp2Var);
    }

    @Override // defpackage.q2b
    public final void f(int i, long j) {
        this.k = j;
    }
}
