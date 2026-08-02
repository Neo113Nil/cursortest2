package ru.kinopoisk.sdk.easylogin.internal;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.aae;
import defpackage.b2c;
import defpackage.b6e;
import defpackage.cma;
import defpackage.d85;
import defpackage.f8g;
import defpackage.ghh;
import defpackage.grb;
import defpackage.hq5;
import defpackage.iz2;
import defpackage.k5r;
import defpackage.oq5;
import defpackage.ouj;
import defpackage.sn5;
import defpackage.u7g;
import defpackage.ug3;
import defpackage.ugo;
import defpackage.vci;
import defpackage.wg3;
import defpackage.wn5;
import defpackage.wp5;
import defpackage.xcs;
import defpackage.xmn;
import defpackage.xp5;
import defpackage.yci;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.R;
import ru.kinopoisk.sdk.easylogin.internal.Kb;

/* loaded from: classes5.dex */
public final class Qb {
    public static final float a = 44;

    /* JADX WARN: Removed duplicated region for block: B:100:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, boolean z, boolean z2, long j, long j2, long j3, long j4, float f, float f2, Function0 function0, Function0 function02, Kb kb, vci vciVar, @NotNull sn5 sn5Var, hq5 hq5Var, int i, int i2, int i3) {
        String str2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        int i7;
        Function0 function03;
        int i8;
        int i9;
        Function0 function04;
        int i10;
        int i11;
        vci vciVar2;
        long j5;
        Kb kb2;
        int i12;
        vci vciVar3;
        vci vciVar4;
        Kb kb3;
        Function0 function05;
        Function0 function06;
        long j6;
        long j7;
        long j8;
        float f3;
        float f4;
        boolean z5;
        long j9;
        int i13;
        float a2;
        int i14;
        Function0 function07;
        boolean z6;
        long j10;
        oq5 oq5Var;
        String str3;
        long j11;
        long j12;
        boolean z7;
        long j13;
        Kb kb4;
        vci vciVar5;
        float f5;
        Function0 function08;
        xmn r;
        int i15;
        sn5Var.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-2072781287);
        int i16 = i3 & 1;
        if (i16 != 0) {
            i4 = i | 6;
            str2 = str;
        } else if ((i & 6) == 0) {
            str2 = str;
            i4 = (oq5Var2.f(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i4 = i;
        }
        int i17 = i4 | 48;
        int i18 = i3 & 4;
        if (i18 != 0) {
            i17 = i4 | 432;
        } else if ((i & 384) == 0) {
            z3 = z;
            i17 |= oq5Var2.g(z3) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i17 |= 3072;
            } else if ((i & 3072) == 0) {
                z4 = z2;
                i17 |= oq5Var2.g(z4) ? 2048 : 1024;
                i6 = i17 | 920346624;
                i7 = i3 & 1024;
                if (i7 != 0) {
                    i8 = i2 | 6;
                    function03 = function0;
                } else {
                    function03 = function0;
                    if ((i2 & 6) == 0) {
                        i8 = i2 | (oq5Var2.h(function03) ? 4 : 2);
                    } else {
                        i8 = i2;
                    }
                }
                i9 = i3 & 2048;
                if (i9 != 0) {
                    i8 |= 48;
                    function04 = function02;
                } else {
                    function04 = function02;
                    if ((i2 & 48) == 0) {
                        i8 |= oq5Var2.h(function04) ? 32 : 16;
                    }
                }
                if ((i2 & 384) == 0) {
                    if ((i3 & 4096) == 0 && oq5Var2.f(kb)) {
                        i15 = 256;
                        i8 |= i15;
                    }
                    i15 = 128;
                    i8 |= i15;
                }
                int i19 = i8 | 3072;
                if ((i2 & 24576) == 0) {
                    i10 = i19 | (oq5Var2.h(sn5Var) ? 16384 : RemoteCameraConfig.Notification.ID);
                } else {
                    i10 = i19;
                }
                if ((i6 & 306783379) != 306783378 && (i10 & 9363) == 9362 && oq5Var2.z()) {
                    oq5Var2.S();
                    j12 = j4;
                    f5 = f;
                    kb4 = kb;
                    vciVar5 = vciVar;
                    oq5Var = oq5Var2;
                    function07 = function03;
                    str3 = str2;
                    z6 = z3;
                    z7 = z4;
                    j10 = j;
                    j13 = j2;
                    j11 = j3;
                    function08 = function04;
                    f4 = f2;
                } else {
                    oq5Var2.U();
                    i11 = i & 1;
                    vciVar2 = vci.a;
                    if (i11 != 0 || oq5Var2.y()) {
                        if (i16 != 0) {
                            str2 = null;
                        }
                        if (i18 != 0) {
                            z3 = true;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        }
                        j5 = d85.n;
                        if (i7 != 0) {
                            function03 = null;
                        }
                        if (i9 != 0) {
                            function04 = null;
                        }
                        if ((i3 & 4096) != 0) {
                            kb2 = new Kb.b(0.0f, 1, null);
                            i10 &= -897;
                        } else {
                            kb2 = kb;
                        }
                        i12 = i10;
                        vciVar3 = vciVar2;
                        vciVar4 = vciVar3;
                        kb3 = kb2;
                        function05 = function03;
                        function06 = function04;
                        j6 = j5;
                        j7 = j6;
                        j8 = j7;
                        f3 = Float.NaN;
                        f4 = Float.NaN;
                    } else {
                        oq5Var2.S();
                        if ((i3 & 4096) != 0) {
                            i10 &= -897;
                        }
                        j5 = j2;
                        j7 = j3;
                        j8 = j4;
                        vciVar3 = vciVar;
                        i12 = i10;
                        vciVar4 = vciVar2;
                        function05 = function03;
                        function06 = function04;
                        j6 = j;
                        f3 = f;
                        f4 = f2;
                        kb3 = kb;
                    }
                    oq5Var2.q();
                    long j14 = j7;
                    oq5Var2.a0(-270021222);
                    boolean z8 = !z4 && B8.b((Context) oq5Var2.j(AndroidCompositionLocals_androidKt.b));
                    oq5Var2.p(false);
                    boolean z9 = z8 ? false : z3;
                    yci d = androidx.compose.foundation.layout.d.d(vciVar3, 1.0f);
                    oq5Var2.a0(-270015042);
                    String str4 = str2;
                    boolean z10 = z3;
                    if (d85.c(j6, d85.n)) {
                        z5 = false;
                        j9 = C1210rc.a(oq5Var2, 0).j();
                    } else {
                        z5 = false;
                        j9 = j6;
                    }
                    oq5Var2.p(z5);
                    oq5Var2.a0(-270009548);
                    float E = cma.a(f3, Float.NaN) ? u7g.E(R.dimen.space_medium_2, oq5Var2) : f3;
                    long j15 = j6;
                    oq5Var2.p(false);
                    oq5Var2.a0(-270001872);
                    float E2 = cma.a(f4, Float.NaN) ? u7g.E(R.dimen.space_medium_2, oq5Var2) : f4;
                    oq5Var2.p(false);
                    yci b = androidx.compose.foundation.a.b(d, j9, ugo.c(E, E2));
                    oq5Var2.a0(733328855);
                    iz2 iz2Var = b2c.b;
                    wg3 e = ug3.e(iz2Var, false, oq5Var2, 0);
                    oq5Var2.a0(-1323940314);
                    i13 = oq5Var2.P;
                    androidx.compose.runtime.internal.a l = oq5Var2.l();
                    wp5 wp5Var = xp5.T;
                    wp5Var.getClass();
                    grb grbVar = wp5.b;
                    vci vciVar6 = vciVar3;
                    wn5 A = ghh.A(b);
                    oq5Var2.d0();
                    float f6 = f3;
                    if (oq5Var2.O) {
                        oq5Var2.k(grbVar);
                    } else {
                        oq5Var2.n0();
                    }
                    Function2 a3 = Lb.a(wp5Var, oq5Var2, e, oq5Var2, l);
                    if (!oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i13))) {
                        Mb.a(i13, oq5Var2, i13, a3);
                    }
                    ouj.z(oq5Var2, 0, A, oq5Var2, 2058660585);
                    int i20 = i6 << 3;
                    int i21 = i12 << 9;
                    androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.a;
                    Function0 function09 = function05;
                    Function0 function010 = function06;
                    a(bVar, str4, z9, function09, function010, j5, j14, j8, oq5Var2, (i20 & 234881024) | (i20 & 112) | 6 | (i21 & 7168) | (57344 & i21) | ((i6 << 12) & 458752) | (3670016 & i20) | (29360128 & i20));
                    if (kb3 instanceof Kb.a) {
                        a2 = kb3.getA();
                    } else {
                        if (!(kb3 instanceof Kb.b)) {
                            b6e.s();
                            return;
                        }
                        a2 = kb3.getA() + a;
                    }
                    Kb kb5 = kb3;
                    yci d2 = androidx.compose.foundation.layout.d.d(androidx.compose.foundation.layout.a.q(vciVar4, 0.0f, a2, 0.0f, 0.0f, 13), 1.0f);
                    oq5Var2.a0(733328855);
                    wg3 e2 = ug3.e(iz2Var, false, oq5Var2, 0);
                    oq5Var2.a0(-1323940314);
                    i14 = oq5Var2.P;
                    androidx.compose.runtime.internal.a l2 = oq5Var2.l();
                    wn5 A2 = ghh.A(d2);
                    oq5Var2.d0();
                    if (oq5Var2.O) {
                        oq5Var2.k(grbVar);
                    } else {
                        oq5Var2.n0();
                    }
                    Function2 a4 = Lb.a(wp5Var, oq5Var2, e2, oq5Var2, l2);
                    if (!oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i14))) {
                        Mb.a(i14, oq5Var2, i14, a4);
                    }
                    ouj.z(oq5Var2, 0, A2, oq5Var2, 2058660585);
                    ((wn5) sn5Var).invoke(bVar, oq5Var2, Integer.valueOf(6 | ((i12 >> 9) & 112)));
                    k5r.s(oq5Var2, false, true, false, false);
                    k5r.s(oq5Var2, false, true, false, false);
                    function07 = function09;
                    z6 = z10;
                    j10 = j15;
                    oq5Var = oq5Var2;
                    str3 = str4;
                    j11 = j14;
                    j12 = j8;
                    z7 = z4;
                    j13 = j5;
                    kb4 = kb5;
                    vciVar5 = vciVar6;
                    f5 = f6;
                    function08 = function010;
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new Pb(str3, z6, z7, j10, j13, j11, j12, f5, f4, function07, function08, kb4, vciVar5, sn5Var, i, i2, i3);
                    return;
                }
                return;
            }
            z4 = z2;
            i6 = i17 | 920346624;
            i7 = i3 & 1024;
            if (i7 != 0) {
            }
            i9 = i3 & 2048;
            if (i9 != 0) {
            }
            if ((i2 & 384) == 0) {
            }
            int i192 = i8 | 3072;
            if ((i2 & 24576) == 0) {
            }
            if ((i6 & 306783379) != 306783378) {
            }
            oq5Var2.U();
            i11 = i & 1;
            vciVar2 = vci.a;
            if (i11 != 0) {
            }
            if (i16 != 0) {
            }
            if (i18 != 0) {
            }
            if (i5 != 0) {
            }
            j5 = d85.n;
            if (i7 != 0) {
            }
            if (i9 != 0) {
            }
            if ((i3 & 4096) != 0) {
            }
            i12 = i10;
            vciVar3 = vciVar2;
            vciVar4 = vciVar3;
            kb3 = kb2;
            function05 = function03;
            function06 = function04;
            j6 = j5;
            j7 = j6;
            j8 = j7;
            f3 = Float.NaN;
            f4 = Float.NaN;
            oq5Var2.q();
            long j142 = j7;
            oq5Var2.a0(-270021222);
            if (z4) {
            }
            oq5Var2.p(false);
            boolean z92 = z8 ? false : z3;
            yci d3 = androidx.compose.foundation.layout.d.d(vciVar3, 1.0f);
            oq5Var2.a0(-270015042);
            String str42 = str2;
            boolean z102 = z3;
            if (d85.c(j6, d85.n)) {
            }
            oq5Var2.p(z5);
            oq5Var2.a0(-270009548);
            if (cma.a(f3, Float.NaN)) {
            }
            long j152 = j6;
            oq5Var2.p(false);
            oq5Var2.a0(-270001872);
            if (cma.a(f4, Float.NaN)) {
            }
            oq5Var2.p(false);
            yci b2 = androidx.compose.foundation.a.b(d3, j9, ugo.c(E, E2));
            oq5Var2.a0(733328855);
            iz2 iz2Var2 = b2c.b;
            wg3 e3 = ug3.e(iz2Var2, false, oq5Var2, 0);
            oq5Var2.a0(-1323940314);
            i13 = oq5Var2.P;
            androidx.compose.runtime.internal.a l3 = oq5Var2.l();
            wp5 wp5Var2 = xp5.T;
            wp5Var2.getClass();
            grb grbVar2 = wp5.b;
            vci vciVar62 = vciVar3;
            wn5 A3 = ghh.A(b2);
            oq5Var2.d0();
            float f62 = f3;
            if (oq5Var2.O) {
            }
            Function2 a32 = Lb.a(wp5Var2, oq5Var2, e3, oq5Var2, l3);
            if (!oq5Var2.O) {
            }
            Mb.a(i13, oq5Var2, i13, a32);
            ouj.z(oq5Var2, 0, A3, oq5Var2, 2058660585);
            int i202 = i6 << 3;
            int i212 = i12 << 9;
            androidx.compose.foundation.layout.b bVar2 = androidx.compose.foundation.layout.b.a;
            Function0 function092 = function05;
            Function0 function0102 = function06;
            a(bVar2, str42, z92, function092, function0102, j5, j142, j8, oq5Var2, (i202 & 234881024) | (i202 & 112) | 6 | (i212 & 7168) | (57344 & i212) | ((i6 << 12) & 458752) | (3670016 & i202) | (29360128 & i202));
            if (kb3 instanceof Kb.a) {
            }
            Kb kb52 = kb3;
            yci d22 = androidx.compose.foundation.layout.d.d(androidx.compose.foundation.layout.a.q(vciVar4, 0.0f, a2, 0.0f, 0.0f, 13), 1.0f);
            oq5Var2.a0(733328855);
            wg3 e22 = ug3.e(iz2Var2, false, oq5Var2, 0);
            oq5Var2.a0(-1323940314);
            i14 = oq5Var2.P;
            androidx.compose.runtime.internal.a l22 = oq5Var2.l();
            wn5 A22 = ghh.A(d22);
            oq5Var2.d0();
            if (oq5Var2.O) {
            }
            Function2 a42 = Lb.a(wp5Var2, oq5Var2, e22, oq5Var2, l22);
            if (!oq5Var2.O) {
            }
            Mb.a(i14, oq5Var2, i14, a42);
            ouj.z(oq5Var2, 0, A22, oq5Var2, 2058660585);
            ((wn5) sn5Var).invoke(bVar2, oq5Var2, Integer.valueOf(6 | ((i12 >> 9) & 112)));
            k5r.s(oq5Var2, false, true, false, false);
            k5r.s(oq5Var2, false, true, false, false);
            function07 = function092;
            z6 = z102;
            j10 = j152;
            oq5Var = oq5Var2;
            str3 = str42;
            j11 = j142;
            j12 = j8;
            z7 = z4;
            j13 = j5;
            kb4 = kb52;
            vciVar5 = vciVar62;
            f5 = f62;
            function08 = function0102;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        z3 = z;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z4 = z2;
        i6 = i17 | 920346624;
        i7 = i3 & 1024;
        if (i7 != 0) {
        }
        i9 = i3 & 2048;
        if (i9 != 0) {
        }
        if ((i2 & 384) == 0) {
        }
        int i1922 = i8 | 3072;
        if ((i2 & 24576) == 0) {
        }
        if ((i6 & 306783379) != 306783378) {
        }
        oq5Var2.U();
        i11 = i & 1;
        vciVar2 = vci.a;
        if (i11 != 0) {
        }
        if (i16 != 0) {
        }
        if (i18 != 0) {
        }
        if (i5 != 0) {
        }
        j5 = d85.n;
        if (i7 != 0) {
        }
        if (i9 != 0) {
        }
        if ((i3 & 4096) != 0) {
        }
        i12 = i10;
        vciVar3 = vciVar2;
        vciVar4 = vciVar3;
        kb3 = kb2;
        function05 = function03;
        function06 = function04;
        j6 = j5;
        j7 = j6;
        j8 = j7;
        f3 = Float.NaN;
        f4 = Float.NaN;
        oq5Var2.q();
        long j1422 = j7;
        oq5Var2.a0(-270021222);
        if (z4) {
        }
        oq5Var2.p(false);
        boolean z922 = z8 ? false : z3;
        yci d32 = androidx.compose.foundation.layout.d.d(vciVar3, 1.0f);
        oq5Var2.a0(-270015042);
        String str422 = str2;
        boolean z1022 = z3;
        if (d85.c(j6, d85.n)) {
        }
        oq5Var2.p(z5);
        oq5Var2.a0(-270009548);
        if (cma.a(f3, Float.NaN)) {
        }
        long j1522 = j6;
        oq5Var2.p(false);
        oq5Var2.a0(-270001872);
        if (cma.a(f4, Float.NaN)) {
        }
        oq5Var2.p(false);
        yci b22 = androidx.compose.foundation.a.b(d32, j9, ugo.c(E, E2));
        oq5Var2.a0(733328855);
        iz2 iz2Var22 = b2c.b;
        wg3 e32 = ug3.e(iz2Var22, false, oq5Var2, 0);
        oq5Var2.a0(-1323940314);
        i13 = oq5Var2.P;
        androidx.compose.runtime.internal.a l32 = oq5Var2.l();
        wp5 wp5Var22 = xp5.T;
        wp5Var22.getClass();
        grb grbVar22 = wp5.b;
        vci vciVar622 = vciVar3;
        wn5 A32 = ghh.A(b22);
        oq5Var2.d0();
        float f622 = f3;
        if (oq5Var2.O) {
        }
        Function2 a322 = Lb.a(wp5Var22, oq5Var2, e32, oq5Var2, l32);
        if (!oq5Var2.O) {
        }
        Mb.a(i13, oq5Var2, i13, a322);
        ouj.z(oq5Var2, 0, A32, oq5Var2, 2058660585);
        int i2022 = i6 << 3;
        int i2122 = i12 << 9;
        androidx.compose.foundation.layout.b bVar22 = androidx.compose.foundation.layout.b.a;
        Function0 function0922 = function05;
        Function0 function01022 = function06;
        a(bVar22, str422, z922, function0922, function01022, j5, j1422, j8, oq5Var2, (i2022 & 234881024) | (i2022 & 112) | 6 | (i2122 & 7168) | (57344 & i2122) | ((i6 << 12) & 458752) | (3670016 & i2022) | (29360128 & i2022));
        if (kb3 instanceof Kb.a) {
        }
        Kb kb522 = kb3;
        yci d222 = androidx.compose.foundation.layout.d.d(androidx.compose.foundation.layout.a.q(vciVar4, 0.0f, a2, 0.0f, 0.0f, 13), 1.0f);
        oq5Var2.a0(733328855);
        wg3 e222 = ug3.e(iz2Var22, false, oq5Var2, 0);
        oq5Var2.a0(-1323940314);
        i14 = oq5Var2.P;
        androidx.compose.runtime.internal.a l222 = oq5Var2.l();
        wn5 A222 = ghh.A(d222);
        oq5Var2.d0();
        if (oq5Var2.O) {
        }
        Function2 a422 = Lb.a(wp5Var22, oq5Var2, e222, oq5Var2, l222);
        if (!oq5Var2.O) {
        }
        Mb.a(i14, oq5Var2, i14, a422);
        ouj.z(oq5Var2, 0, A222, oq5Var2, 2058660585);
        ((wn5) sn5Var).invoke(bVar22, oq5Var2, Integer.valueOf(6 | ((i12 >> 9) & 112)));
        k5r.s(oq5Var2, false, true, false, false);
        k5r.s(oq5Var2, false, true, false, false);
        function07 = function0922;
        z6 = z1022;
        j10 = j1522;
        oq5Var = oq5Var2;
        str3 = str422;
        j11 = j1422;
        j12 = j8;
        z7 = z4;
        j13 = j5;
        kb4 = kb522;
        vciVar5 = vciVar622;
        f5 = f622;
        function08 = function01022;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final void a(androidx.compose.foundation.layout.b bVar, String str, boolean z, Function0 function0, Function0 function02, long j, long j2, long j3, hq5 hq5Var, int i) {
        int i2;
        boolean z2;
        oq5 oq5Var;
        int i3;
        vci vciVar;
        int i4;
        vci vciVar2;
        long j4;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-997532591);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.h(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var2.h(function02) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var2.f(null) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            i2 |= oq5Var2.e(j) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= oq5Var2.e(j2) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((100663296 & i) == 0) {
            i2 |= oq5Var2.e(j3) ? 67108864 : 33554432;
        }
        if ((38347923 & i2) == 38347922 && oq5Var2.z()) {
            oq5Var2.S();
            j4 = j3;
            oq5Var = oq5Var2;
        } else {
            oq5Var2.a0(127908094);
            vci vciVar3 = vci.a;
            if (str != null) {
                i3 = i2;
                vciVar = vciVar3;
                z2 = false;
                xcs.b(str, androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(androidx.compose.foundation.layout.d.d(vciVar3, 1.0f), u7g.E(R.dimen.space_medium_2, oq5Var2), 21, 0.0f, 0.0f, 12), "UiKitBottomSheetHeader-Text"), C1210rc.a(oq5Var2, 0).f(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, C1210rc.b(oq5Var2, 0).getY(), oq5Var2, ((i2 >> 3) & 14) | ((i2 << 12) & 1879048192), 0, 65016);
                oq5Var = oq5Var2;
            } else {
                z2 = false;
                oq5Var = oq5Var2;
                i3 = i2;
                vciVar = vciVar3;
            }
            oq5Var.p(z2);
            oq5Var.a0(127924154);
            if (function0 != null) {
                vciVar2 = vciVar;
                i4 = i3;
                oq5 oq5Var3 = oq5Var;
                Ub.a(androidx.compose.ui.platform.a.a(f8g.g0(androidx.compose.foundation.layout.a.m(bVar.a(vciVar2, b2c.d), 6), 2.0f), "UiKitBottomSheetHeader-UiKitCloseButton"), j, j2, function0, oq5Var3, ((i3 >> 15) & 1008) | (i4 & 7168));
                oq5Var = oq5Var3;
            } else {
                i4 = i3;
                vciVar2 = vciVar;
            }
            oq5Var.p(z2);
            oq5Var.a0(127937272);
            if (function02 != null) {
                aae.a(function02, androidx.compose.ui.platform.a.a(f8g.g0(androidx.compose.foundation.layout.a.m(bVar.a(vciVar2, b2c.b), 6), 2.0f), "UiKitBottomSheetHeader-UiKitBackButton"), false, C1241u1.a(), oq5Var, ((i4 >> 12) & 14) | 24576, 12);
            }
            oq5Var.p(z2);
            if (z) {
                j4 = j3;
                C1071hc.a(f8g.g0(androidx.compose.foundation.layout.a.q(bVar.a(vciVar2, b2c.c), 0.0f, 6, 0.0f, 0.0f, 13), 2.0f), j4, oq5Var, (i4 >> 21) & 112);
            } else {
                j4 = j3;
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Ob(bVar, str, z, function0, function02, j, j2, j4, i);
        }
    }
}
