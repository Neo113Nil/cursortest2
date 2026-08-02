package defpackage;

import yads.io2;
import yads.n62;
import yads.wk2;

/* loaded from: classes7.dex */
public final class s671 extends t371 {
    public final boolean A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final boolean F;
    public final boolean G;
    public final int H;
    public final boolean I;
    public final boolean J;
    public final int K;
    public final boolean x;
    public final zu81 y;
    public final boolean z;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00d5 A[EDGE_INSN: B:130:0x00d5->B:70:0x00d5 BREAK  A[LOOP:0: B:62:0x00ba->B:128:0x00d2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s671(int i, tu71 tu71Var, int i2, zu81 zu81Var, int i3, int i4, boolean z) {
        super(i, tu71Var, i2);
        boolean z2;
        boolean z3;
        int i5;
        wk2 wk2Var;
        qd81 qd81Var;
        String str;
        int i6;
        zu81 zu81Var2;
        boolean z4;
        int i7;
        qd81 qd81Var2;
        int i8;
        int i9;
        float f;
        int i10;
        qd81 qd81Var3;
        int i11;
        int i12;
        int i13;
        this.y = zu81Var;
        int i14 = zu81Var.V ? 24 : 16;
        int i15 = 1;
        this.G = zu81Var.U && (i4 & i14) != 0;
        if (z && (((i11 = (qd81Var3 = this.w).J) == -1 || i11 <= zu81Var.a) && ((i12 = qd81Var3.K) == -1 || i12 <= zu81Var.b))) {
            float f2 = qd81Var3.L;
            if ((f2 == -1.0f || f2 <= zu81Var.c) && ((i13 = qd81Var3.A) == -1 || i13 <= zu81Var.w)) {
                z2 = true;
                this.x = z2;
                if (z && (((i8 = (qd81Var2 = this.w).J) == -1 || i8 >= zu81Var.x) && ((i9 = qd81Var2.K) == -1 || i9 >= zu81Var.y))) {
                    f = qd81Var2.L;
                    if ((f != -1.0f || f >= zu81Var.z) && ((i10 = qd81Var2.A) == -1 || i10 >= zu81Var.A)) {
                        z3 = true;
                        this.z = z3;
                        this.A = ba71.g(i3, false);
                        qd81 qd81Var4 = this.w;
                        this.B = qd81Var4.A;
                        int i16 = qd81Var4.J;
                        this.C = (i16 != -1 || (i7 = qd81Var4.K) == -1) ? -1 : i16 * i7;
                        int i17 = qd81Var4.x;
                        int i18 = zu81Var.F;
                        int i19 = Integer.MAX_VALUE;
                        this.E = (i17 == 0 && i17 == i18) ? Integer.MAX_VALUE : Integer.bitCount(i17 & i18);
                        int i20 = this.w.x;
                        this.F = (i20 == 0 && (i20 & 1) == 0) ? false : true;
                        i5 = 0;
                        while (true) {
                            wk2Var = zu81Var.E;
                            if (i5 < wk2Var.w) {
                                String str2 = this.w.E;
                                if (str2 != null && str2.equals(wk2Var.get(i5))) {
                                    i19 = i5;
                                    break;
                                }
                                i5++;
                            } else {
                                break;
                            }
                        }
                        this.D = i19;
                        this.I = gy61.a(i3) != 128;
                        this.J = gy61.b(i3) != 64;
                        qd81Var = this.w;
                        str = qd81Var.E;
                        if (str != null) {
                            i6 = 3;
                            switch (str.hashCode()) {
                                case -1662735862:
                                    if (str.equals("video/av01")) {
                                        z4 = false;
                                        break;
                                    }
                                    z4 = -1;
                                    break;
                                case -1662541442:
                                    if (str.equals("video/hevc")) {
                                        z4 = true;
                                        break;
                                    }
                                    z4 = -1;
                                    break;
                                case 1331836730:
                                    if (str.equals("video/avc")) {
                                        z4 = 2;
                                        break;
                                    }
                                    z4 = -1;
                                    break;
                                case 1599127257:
                                    if (str.equals("video/x-vnd.on2.vp9")) {
                                        z4 = 3;
                                        break;
                                    }
                                    z4 = -1;
                                    break;
                                default:
                                    z4 = -1;
                                    break;
                            }
                            switch (z4) {
                                case false:
                                    i6 = 4;
                                    break;
                                case true:
                                    i6 = 1;
                                    break;
                                case true:
                                    i6 = 2;
                                    break;
                            }
                            this.K = i6;
                            if ((qd81Var.x & 16384) != 0 || !ba71.g(i3, this.y.f0) || (!this.x && !this.y.T)) {
                                i15 = 0;
                            } else if (ba71.g(i3, false) && this.z && this.x && this.w.A != -1) {
                                zu81Var2 = this.y;
                                if (!zu81Var2.Q && !zu81Var2.P && (i14 & i3) != 0) {
                                    i15 = 2;
                                }
                            }
                            this.H = i15;
                        }
                        i6 = 0;
                        this.K = i6;
                        if ((qd81Var.x & 16384) != 0) {
                            if (ba71.g(i3, false)) {
                                zu81Var2 = this.y;
                                if (!zu81Var2.Q) {
                                    i15 = 2;
                                }
                            }
                            this.H = i15;
                        }
                        i15 = 0;
                        this.H = i15;
                    }
                }
                z3 = false;
                this.z = z3;
                this.A = ba71.g(i3, false);
                qd81 qd81Var42 = this.w;
                this.B = qd81Var42.A;
                int i162 = qd81Var42.J;
                this.C = (i162 != -1 || (i7 = qd81Var42.K) == -1) ? -1 : i162 * i7;
                int i172 = qd81Var42.x;
                int i182 = zu81Var.F;
                int i192 = Integer.MAX_VALUE;
                this.E = (i172 == 0 && i172 == i182) ? Integer.MAX_VALUE : Integer.bitCount(i172 & i182);
                int i202 = this.w.x;
                this.F = (i202 == 0 && (i202 & 1) == 0) ? false : true;
                i5 = 0;
                while (true) {
                    wk2Var = zu81Var.E;
                    if (i5 < wk2Var.w) {
                    }
                    i5++;
                }
                this.D = i192;
                this.I = gy61.a(i3) != 128;
                this.J = gy61.b(i3) != 64;
                qd81Var = this.w;
                str = qd81Var.E;
                if (str != null) {
                }
                i6 = 0;
                this.K = i6;
                if ((qd81Var.x & 16384) != 0) {
                }
                i15 = 0;
                this.H = i15;
            }
        }
        z2 = false;
        this.x = z2;
        if (z) {
            f = qd81Var2.L;
            if (f != -1.0f) {
            }
            z3 = true;
            this.z = z3;
            this.A = ba71.g(i3, false);
            qd81 qd81Var422 = this.w;
            this.B = qd81Var422.A;
            int i1622 = qd81Var422.J;
            this.C = (i1622 != -1 || (i7 = qd81Var422.K) == -1) ? -1 : i1622 * i7;
            int i1722 = qd81Var422.x;
            int i1822 = zu81Var.F;
            int i1922 = Integer.MAX_VALUE;
            this.E = (i1722 == 0 && i1722 == i1822) ? Integer.MAX_VALUE : Integer.bitCount(i1722 & i1822);
            int i2022 = this.w.x;
            this.F = (i2022 == 0 && (i2022 & 1) == 0) ? false : true;
            i5 = 0;
            while (true) {
                wk2Var = zu81Var.E;
                if (i5 < wk2Var.w) {
                }
                i5++;
            }
            this.D = i1922;
            this.I = gy61.a(i3) != 128;
            this.J = gy61.b(i3) != 64;
            qd81Var = this.w;
            str = qd81Var.E;
            if (str != null) {
            }
            i6 = 0;
            this.K = i6;
            if ((qd81Var.x & 16384) != 0) {
            }
            i15 = 0;
            this.H = i15;
        }
        z3 = false;
        this.z = z3;
        this.A = ba71.g(i3, false);
        qd81 qd81Var4222 = this.w;
        this.B = qd81Var4222.A;
        int i16222 = qd81Var4222.J;
        this.C = (i16222 != -1 || (i7 = qd81Var4222.K) == -1) ? -1 : i16222 * i7;
        int i17222 = qd81Var4222.x;
        int i18222 = zu81Var.F;
        int i19222 = Integer.MAX_VALUE;
        this.E = (i17222 == 0 && i17222 == i18222) ? Integer.MAX_VALUE : Integer.bitCount(i17222 & i18222);
        int i20222 = this.w.x;
        this.F = (i20222 == 0 && (i20222 & 1) == 0) ? false : true;
        i5 = 0;
        while (true) {
            wk2Var = zu81Var.E;
            if (i5 < wk2Var.w) {
            }
            i5++;
        }
        this.D = i19222;
        this.I = gy61.a(i3) != 128;
        this.J = gy61.b(i3) != 64;
        qd81Var = this.w;
        str = qd81Var.E;
        if (str != null) {
        }
        i6 = 0;
        this.K = i6;
        if ((qd81Var.x & 16384) != 0) {
        }
        i15 = 0;
        this.H = i15;
    }

    public static int c(s671 s671Var, s671 s671Var2) {
        wd81 e = u681.g(ena1.a(s671Var.A, s671Var2.A)).b(s671Var.E, s671Var2.E).e(s671Var.F, s671Var2.F).e(s671Var.x, s671Var2.x).e(s671Var.z, s671Var2.z);
        Integer valueOf = Integer.valueOf(s671Var.D);
        Integer valueOf2 = Integer.valueOf(s671Var2.D);
        n62.a.getClass();
        wd81 d = e.d(valueOf, valueOf2, io2.a);
        boolean z = s671Var.I;
        wd81 e2 = d.e(z, s671Var2.I);
        boolean z2 = s671Var.J;
        wd81 e3 = e2.e(z2, s671Var2.J);
        if (z && z2) {
            e3 = e3.b(s671Var.K, s671Var2.K);
        }
        return e3.a();
    }

    @Override // defpackage.t371
    public final int a() {
        return this.H;
    }

    @Override // defpackage.t371
    public final boolean b(t371 t371Var) {
        s671 s671Var = (s671) t371Var;
        if (!this.G && !rf71.o(this.w.E, s671Var.w.E)) {
            return false;
        }
        if (this.y.W) {
            return true;
        }
        return this.I == s671Var.I && this.J == s671Var.J;
    }
}
