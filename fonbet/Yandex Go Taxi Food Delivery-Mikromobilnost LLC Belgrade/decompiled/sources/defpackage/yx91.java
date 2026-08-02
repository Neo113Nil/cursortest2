package defpackage;

import androidx.compose.ui.graphics.vector.b;
import com.google.ar.core.ImageMetadata;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import skeletor.render.SkeletonContentView;

/* loaded from: classes11.dex */
public abstract class yx91 {
    public static final b8m a = new b8m(128.0f);

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(kx91 kx91Var, f530 f530Var, long j, sls slsVar, rtm rtmVar, rtm rtmVar2, rtm rtmVar3, rtm rtmVar4, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        int i4;
        rtm rtmVar5;
        int i5;
        int i6;
        rtm rtmVar6;
        int i7;
        rtm rtmVar7;
        rtm rtmVar8;
        rtm rtmVar9;
        long j2;
        f530 f530Var3;
        bts btsVar;
        f530 f530Var4;
        long j3;
        rtm rtmVar10;
        rtm rtmVar11;
        rtm rtmVar12;
        aii0 v;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1835675800);
        if ((i & 6) == 0) {
            i3 = (btsVar2.k(ntm.a) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar2.e(kx91Var) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar2.k(f530Var2) ? 256 : 128;
            if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                i3 |= 1024;
            }
            if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                i3 |= btsVar2.e(slsVar) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= ImageMetadata.EDGE_MODE;
            } else if ((196608 & i) == 0) {
                rtmVar5 = rtmVar;
                i3 |= btsVar2.k(rtmVar5) ? 131072 : 65536;
                i5 = i3 | 114819072;
                if ((38347923 & i5) == 38347922 || !btsVar2.E()) {
                    btsVar2.a0();
                    i6 = i & 1;
                    rtmVar6 = qtm.a;
                    if (i6 != 0 || btsVar2.C()) {
                        f530 f530Var5 = i8 != 0 ? c530.a : f530Var2;
                        qnm qnmVar = qnm.a;
                        long a2 = qnm.c(btsVar2).a();
                        i7 = i5 & (-7169);
                        if (i4 != 0) {
                            rtmVar5 = rtmVar6;
                        }
                        rtmVar7 = rtmVar6;
                        rtmVar8 = rtmVar7;
                        rtmVar9 = rtmVar8;
                        j2 = a2;
                        f530Var3 = f530Var5;
                    } else {
                        btsVar2.Y();
                        i7 = i5 & (-7169);
                        j2 = j;
                        rtmVar7 = rtmVar2;
                        rtmVar8 = rtmVar3;
                        rtmVar9 = rtmVar4;
                        f530Var3 = f530Var2;
                    }
                    rtm rtmVar13 = rtmVar5;
                    btsVar2.u();
                    btsVar2.e0(1147134291);
                    if (slsVar != null) {
                        qnm qnmVar2 = qnm.a;
                        mgv mgvVar = jlb1.a;
                        if (mgvVar == null) {
                            lgv lgvVar = new lgv("ChevronLeftOutlineMd", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                            a6t0 a6t0Var = new a6t0(rzo.f(SkeletonContentView.HUNDRED_PERCENTS_ALPHA));
                            uq90 uq90Var = new uq90();
                            uq90Var.j(9.75f, 12.0f);
                            uq90Var.h(17.0f, 21.0f);
                            uq90Var.f(14.25f);
                            uq90Var.h(7.0f, 12.0f);
                            uq90Var.h(14.25f, 3.0f);
                            uq90Var.f(17.0f);
                            uq90Var.h(9.75f, 12.0f);
                            uq90Var.c();
                            lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", uq90Var.a);
                            mgvVar = lgvVar.d();
                            jlb1.a = mgvVar;
                        }
                        b c = ba91.c(mgvVar, btsVar2);
                        btsVar2.e0(-1040960805);
                        btsVar2.e0(966458015);
                        String e = ohb1.e(btsVar2, gzh0.atoms_back_button);
                        btsVar2.t(false);
                        btsVar2.t(false);
                        rtmVar6 = new ptm(c, e, slsVar);
                    }
                    btsVar2.t(false);
                    int i9 = (i7 & 14) | 384 | (i7 & 112);
                    int i10 = i7 << 3;
                    btsVar = btsVar2;
                    rx91.a(kx91Var, false, f530Var3, j2, rtmVar6, rtmVar13, rtmVar7, rtmVar8, rtmVar9, btsVar, i9 | (i10 & 7168) | (3670016 & i10) | (29360128 & i10) | (234881024 & i10) | (i10 & 1879048192));
                    f530Var4 = f530Var3;
                    j3 = j2;
                    rtmVar5 = rtmVar13;
                    rtmVar10 = rtmVar7;
                    rtmVar11 = rtmVar8;
                    rtmVar12 = rtmVar9;
                } else {
                    btsVar2.Y();
                    rtmVar10 = rtmVar2;
                    rtmVar11 = rtmVar3;
                    rtmVar12 = rtmVar4;
                    btsVar = btsVar2;
                    f530Var4 = f530Var2;
                    j3 = j;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new mo1(kx91Var, f530Var4, j3, slsVar, rtmVar5, rtmVar10, rtmVar11, rtmVar12, i, i2);
                    return;
                }
                return;
            }
            rtmVar5 = rtmVar;
            i5 = i3 | 114819072;
            if ((38347923 & i5) == 38347922) {
            }
            btsVar2.a0();
            i6 = i & 1;
            rtmVar6 = qtm.a;
            if (i6 != 0) {
            }
            if (i8 != 0) {
            }
            qnm qnmVar3 = qnm.a;
            long a22 = qnm.c(btsVar2).a();
            i7 = i5 & (-7169);
            if (i4 != 0) {
            }
            rtmVar7 = rtmVar6;
            rtmVar8 = rtmVar7;
            rtmVar9 = rtmVar8;
            j2 = a22;
            f530Var3 = f530Var5;
            rtm rtmVar132 = rtmVar5;
            btsVar2.u();
            btsVar2.e0(1147134291);
            if (slsVar != null) {
            }
            btsVar2.t(false);
            int i92 = (i7 & 14) | 384 | (i7 & 112);
            int i102 = i7 << 3;
            btsVar = btsVar2;
            rx91.a(kx91Var, false, f530Var3, j2, rtmVar6, rtmVar132, rtmVar7, rtmVar8, rtmVar9, btsVar, i92 | (i102 & 7168) | (3670016 & i102) | (29360128 & i102) | (234881024 & i102) | (i102 & 1879048192));
            f530Var4 = f530Var3;
            j3 = j2;
            rtmVar5 = rtmVar132;
            rtmVar10 = rtmVar7;
            rtmVar11 = rtmVar8;
            rtmVar12 = rtmVar9;
            v = btsVar.v();
            if (v != null) {
            }
        }
        f530Var2 = f530Var;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        rtmVar5 = rtmVar;
        i5 = i3 | 114819072;
        if ((38347923 & i5) == 38347922) {
        }
        btsVar2.a0();
        i6 = i & 1;
        rtmVar6 = qtm.a;
        if (i6 != 0) {
        }
        if (i8 != 0) {
        }
        qnm qnmVar32 = qnm.a;
        long a222 = qnm.c(btsVar2).a();
        i7 = i5 & (-7169);
        if (i4 != 0) {
        }
        rtmVar7 = rtmVar6;
        rtmVar8 = rtmVar7;
        rtmVar9 = rtmVar8;
        j2 = a222;
        f530Var3 = f530Var5;
        rtm rtmVar1322 = rtmVar5;
        btsVar2.u();
        btsVar2.e0(1147134291);
        if (slsVar != null) {
        }
        btsVar2.t(false);
        int i922 = (i7 & 14) | 384 | (i7 & 112);
        int i1022 = i7 << 3;
        btsVar = btsVar2;
        rx91.a(kx91Var, false, f530Var3, j2, rtmVar6, rtmVar1322, rtmVar7, rtmVar8, rtmVar9, btsVar, i922 | (i1022 & 7168) | (3670016 & i1022) | (29360128 & i1022) | (234881024 & i1022) | (i1022 & 1879048192));
        f530Var4 = f530Var3;
        j3 = j2;
        rtmVar5 = rtmVar1322;
        rtmVar10 = rtmVar7;
        rtmVar11 = rtmVar8;
        rtmVar12 = rtmVar9;
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static f530 b(f530 f530Var, tb2 tb2Var) {
        return f530Var.k(new uvd0(tb2Var));
    }

    public static final fl51 c(el51 el51Var) {
        return new fl51(rzo.X(el51Var.c()), rzo.X(el51Var.d()), rzo.X(el51Var.b()), rzo.X(el51Var.a()), rzo.X(el51Var.f()), rzo.X(el51Var.g()), rzo.X(el51Var.n()), rzo.X(el51Var.o()), rzo.X(el51Var.m()), rzo.X(el51Var.p()), rzo.X(el51Var.q()), rzo.X(el51Var.j()), rzo.X(el51Var.k()), rzo.X(el51Var.l()), rzo.X(((ldc) el51Var.o.getValue()).a), rzo.X(((ldc) el51Var.p.getValue()).a), rzo.X(((ldc) el51Var.q.getValue()).a), rzo.X(el51Var.i()), rzo.X(((ldc) el51Var.s.getValue()).a), rzo.X(el51Var.e()), rzo.X(el51Var.h()));
    }
}
