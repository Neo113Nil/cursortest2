package defpackage;

import androidx.media3.exoplayer.trackselection.a;
import java.util.Objects;

/* loaded from: classes.dex */
public final class bt7 extends at7 {
    public final boolean e;
    public final a f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final boolean p;
    public final int q;
    public final boolean r;
    public final int s;
    public final boolean t;
    public final boolean u;
    public final int v;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0113 A[EDGE_INSN: B:142:0x0113->B:80:0x0113 BREAK  A[LOOP:1: B:72:0x00f8->B:140:0x0110], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bt7(int i, xvs xvsVar, int i2, a aVar, int i3, String str, int i4, boolean z) {
        super(i, xvsVar, i2);
        boolean z2;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        dsc dscVar;
        String str2;
        int i9;
        boolean z4;
        a aVar2;
        boolean z5;
        int i10;
        dsc dscVar2;
        int i11;
        int i12;
        float f;
        int i13;
        dsc dscVar3;
        int i14;
        int i15;
        int i16;
        this.f = aVar;
        boolean z6 = aVar.q0;
        yde ydeVar = aVar.m;
        yde ydeVar2 = aVar.n;
        int i17 = z6 ? 24 : 16;
        int i18 = 0;
        this.r = false;
        if (z && (((i14 = (dscVar3 = this.d).u) == -1 || i14 <= aVar.a) && ((i15 = dscVar3.v) == -1 || i15 <= aVar.b))) {
            float f2 = dscVar3.w;
            if ((f2 == -1.0f || f2 <= aVar.c) && ((i16 = dscVar3.j) == -1 || i16 <= aVar.d)) {
                z2 = true;
                this.e = z2;
                if (z && (((i11 = (dscVar2 = this.d).u) == -1 || i11 >= aVar.e) && ((i12 = dscVar2.v) == -1 || i12 >= aVar.f))) {
                    f = dscVar2.w;
                    if ((f != -1.0f || f >= aVar.g) && ((i13 = dscVar2.j) == -1 || i13 >= aVar.h)) {
                        z3 = true;
                        this.g = z3;
                        this.h = at2.o(i3, false);
                        dsc dscVar4 = this.d;
                        float f3 = dscVar4.w;
                        this.i = f3 == -1.0f && f3 >= 10.0f;
                        this.j = dscVar4.j;
                        int i19 = dscVar4.u;
                        this.k = (i19 != -1 || (i10 = dscVar4.v) == -1) ? -1 : i19 * i10;
                        i5 = 0;
                        while (true) {
                            i6 = Integer.MAX_VALUE;
                            if (i5 < ydeVar2.size()) {
                                i7 = 0;
                                i5 = Integer.MAX_VALUE;
                                break;
                            } else {
                                i7 = ct7.c(this.d, (String) ydeVar2.get(i5), false);
                                if (i7 > 0) {
                                    break;
                                } else {
                                    i5++;
                                }
                            }
                        }
                        this.m = i5;
                        this.n = i7;
                        int i20 = this.d.f;
                        int i21 = aVar.o;
                        zwj zwjVar = ct7.j;
                        this.o = (i20 == 0 && i20 == i21) ? Integer.MAX_VALUE : Integer.bitCount(i20 & i21);
                        int i22 = this.d.f;
                        this.p = (i22 == 0 && (i22 & 1) == 0) ? false : true;
                        this.q = ct7.c(this.d, str, ct7.f(str) != null);
                        i8 = 0;
                        while (true) {
                            if (i8 < ydeVar.size()) {
                                String str3 = this.d.n;
                                if (str3 != null && str3.equals(ydeVar.get(i8))) {
                                    i6 = i8;
                                    break;
                                }
                                i8++;
                            } else {
                                break;
                            }
                        }
                        this.l = i6;
                        this.t = (i3 & 384) != 128;
                        this.u = (i3 & 64) != 64;
                        dscVar = this.d;
                        str2 = dscVar.n;
                        if (str2 != null) {
                            i9 = 4;
                            switch (str2.hashCode()) {
                                case -1851077871:
                                    if (str2.equals("video/dolby-vision")) {
                                        z5 = false;
                                        break;
                                    }
                                    z5 = -1;
                                    break;
                                case -1662735862:
                                    if (str2.equals("video/av01")) {
                                        z5 = true;
                                        break;
                                    }
                                    z5 = -1;
                                    break;
                                case -1662541442:
                                    if (str2.equals("video/hevc")) {
                                        z5 = 2;
                                        break;
                                    }
                                    z5 = -1;
                                    break;
                                case 1331836730:
                                    if (str2.equals("video/avc")) {
                                        z5 = 3;
                                        break;
                                    }
                                    z5 = -1;
                                    break;
                                case 1599127257:
                                    if (str2.equals("video/x-vnd.on2.vp9")) {
                                        z5 = 4;
                                        break;
                                    }
                                    z5 = -1;
                                    break;
                                default:
                                    z5 = -1;
                                    break;
                            }
                            switch (z5) {
                                case false:
                                    i9 = 5;
                                    break;
                                case true:
                                    i9 = 3;
                                    break;
                                case true:
                                    i9 = 1;
                                    break;
                                case true:
                                    i9 = 2;
                                    break;
                            }
                            this.v = i9;
                            z4 = this.e;
                            aVar2 = this.f;
                            if ((dscVar.f & 16384) == 0 && at2.o(i3, aVar2.u0) && (z4 || aVar2.p0)) {
                                i18 = (at2.o(i3, false) || !this.g || !z4 || dscVar.j == -1 || aVar2.C || aVar2.B || (i17 & i3) == 0) ? 1 : 2;
                            }
                            this.s = i18;
                        }
                        i9 = 0;
                        this.v = i9;
                        z4 = this.e;
                        aVar2 = this.f;
                        if ((dscVar.f & 16384) == 0) {
                            if (at2.o(i3, false)) {
                            }
                        }
                        this.s = i18;
                    }
                }
                z3 = false;
                this.g = z3;
                this.h = at2.o(i3, false);
                dsc dscVar42 = this.d;
                float f32 = dscVar42.w;
                this.i = f32 == -1.0f && f32 >= 10.0f;
                this.j = dscVar42.j;
                int i192 = dscVar42.u;
                this.k = (i192 != -1 || (i10 = dscVar42.v) == -1) ? -1 : i192 * i10;
                i5 = 0;
                while (true) {
                    i6 = Integer.MAX_VALUE;
                    if (i5 < ydeVar2.size()) {
                    }
                    i5++;
                }
                this.m = i5;
                this.n = i7;
                int i202 = this.d.f;
                int i212 = aVar.o;
                zwj zwjVar2 = ct7.j;
                this.o = (i202 == 0 && i202 == i212) ? Integer.MAX_VALUE : Integer.bitCount(i202 & i212);
                int i222 = this.d.f;
                this.p = (i222 == 0 && (i222 & 1) == 0) ? false : true;
                this.q = ct7.c(this.d, str, ct7.f(str) != null);
                i8 = 0;
                while (true) {
                    if (i8 < ydeVar.size()) {
                    }
                    i8++;
                }
                this.l = i6;
                this.t = (i3 & 384) != 128;
                this.u = (i3 & 64) != 64;
                dscVar = this.d;
                str2 = dscVar.n;
                if (str2 != null) {
                }
                i9 = 0;
                this.v = i9;
                z4 = this.e;
                aVar2 = this.f;
                if ((dscVar.f & 16384) == 0) {
                }
                this.s = i18;
            }
        }
        z2 = false;
        this.e = z2;
        if (z) {
            f = dscVar2.w;
            if (f != -1.0f) {
            }
            z3 = true;
            this.g = z3;
            this.h = at2.o(i3, false);
            dsc dscVar422 = this.d;
            float f322 = dscVar422.w;
            this.i = f322 == -1.0f && f322 >= 10.0f;
            this.j = dscVar422.j;
            int i1922 = dscVar422.u;
            this.k = (i1922 != -1 || (i10 = dscVar422.v) == -1) ? -1 : i1922 * i10;
            i5 = 0;
            while (true) {
                i6 = Integer.MAX_VALUE;
                if (i5 < ydeVar2.size()) {
                }
                i5++;
            }
            this.m = i5;
            this.n = i7;
            int i2022 = this.d.f;
            int i2122 = aVar.o;
            zwj zwjVar22 = ct7.j;
            this.o = (i2022 == 0 && i2022 == i2122) ? Integer.MAX_VALUE : Integer.bitCount(i2022 & i2122);
            int i2222 = this.d.f;
            this.p = (i2222 == 0 && (i2222 & 1) == 0) ? false : true;
            this.q = ct7.c(this.d, str, ct7.f(str) != null);
            i8 = 0;
            while (true) {
                if (i8 < ydeVar.size()) {
                }
                i8++;
            }
            this.l = i6;
            this.t = (i3 & 384) != 128;
            this.u = (i3 & 64) != 64;
            dscVar = this.d;
            str2 = dscVar.n;
            if (str2 != null) {
            }
            i9 = 0;
            this.v = i9;
            z4 = this.e;
            aVar2 = this.f;
            if ((dscVar.f & 16384) == 0) {
            }
            this.s = i18;
        }
        z3 = false;
        this.g = z3;
        this.h = at2.o(i3, false);
        dsc dscVar4222 = this.d;
        float f3222 = dscVar4222.w;
        this.i = f3222 == -1.0f && f3222 >= 10.0f;
        this.j = dscVar4222.j;
        int i19222 = dscVar4222.u;
        this.k = (i19222 != -1 || (i10 = dscVar4222.v) == -1) ? -1 : i19222 * i10;
        i5 = 0;
        while (true) {
            i6 = Integer.MAX_VALUE;
            if (i5 < ydeVar2.size()) {
            }
            i5++;
        }
        this.m = i5;
        this.n = i7;
        int i20222 = this.d.f;
        int i21222 = aVar.o;
        zwj zwjVar222 = ct7.j;
        this.o = (i20222 == 0 && i20222 == i21222) ? Integer.MAX_VALUE : Integer.bitCount(i20222 & i21222);
        int i22222 = this.d.f;
        this.p = (i22222 == 0 && (i22222 & 1) == 0) ? false : true;
        this.q = ct7.c(this.d, str, ct7.f(str) != null);
        i8 = 0;
        while (true) {
            if (i8 < ydeVar.size()) {
            }
            i8++;
        }
        this.l = i6;
        this.t = (i3 & 384) != 128;
        this.u = (i3 & 64) != 64;
        dscVar = this.d;
        str2 = dscVar.n;
        if (str2 != null) {
        }
        i9 = 0;
        this.v = i9;
        z4 = this.e;
        aVar2 = this.f;
        if ((dscVar.f & 16384) == 0) {
        }
        this.s = i18;
    }

    public static int c(bt7 bt7Var, bt7 bt7Var2) {
        dl5 c = dl5.a.c(bt7Var.h, bt7Var2.h);
        Integer valueOf = Integer.valueOf(bt7Var.m);
        Integer valueOf2 = Integer.valueOf(bt7Var2.m);
        gdo gdoVar = gdo.a;
        dl5 b = c.b(valueOf, valueOf2, gdoVar).a(bt7Var.n, bt7Var2.n).a(bt7Var.o, bt7Var2.o).c(bt7Var.p, bt7Var2.p).a(bt7Var.q, bt7Var2.q).c(bt7Var.i, bt7Var2.i).c(bt7Var.e, bt7Var2.e).c(bt7Var.g, bt7Var2.g).b(Integer.valueOf(bt7Var.l), Integer.valueOf(bt7Var2.l), gdoVar);
        boolean z = bt7Var.t;
        dl5 c2 = b.c(z, bt7Var2.t);
        boolean z2 = bt7Var.u;
        dl5 c3 = c2.c(z2, bt7Var2.u);
        if (z && z2) {
            c3 = c3.a(bt7Var.v, bt7Var2.v);
        }
        return c3.e();
    }

    @Override // defpackage.at7
    public final int a() {
        return this.s;
    }

    @Override // defpackage.at7
    public final boolean b(at7 at7Var) {
        bt7 bt7Var = (bt7) at7Var;
        if (!this.r && !Objects.equals(this.d.n, bt7Var.d.n)) {
            return false;
        }
        this.f.getClass();
        return this.t == bt7Var.t && this.u == bt7Var.u;
    }
}
