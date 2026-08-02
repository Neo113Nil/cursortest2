package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class gwq {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d = 16;
    public static final float e = 24;

    static {
        float f = 56;
        a = f;
        float f2 = 8;
        b = f2;
        c = f - f2;
    }

    public static final void a(int i, Function0 function0, String str, Function0 function02, d85 d85Var, yci yciVar, hq5 hq5Var, int i2, int i3) {
        int i4;
        Function0 function03;
        yci yciVar2;
        function0.getClass();
        function02.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-757763579);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.d(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.h(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= oq5Var.f(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= oq5Var.h(function02) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= oq5Var.f(d85Var) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i5 = i3 & 32;
        int i6 = i4 | (i5 != 0 ? 196608 : oq5Var.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        if ((74899 & i6) == 74898 && oq5Var.z()) {
            oq5Var.S();
            function03 = function02;
            yciVar2 = yciVar;
        } else {
            if (i5 != 0) {
                yciVar = vci.a;
            }
            yci yciVar3 = yciVar;
            function03 = function02;
            b(function03, yciVar3, ild.C(-1451877285, new hon(29, str, d85Var), oq5Var), ild.C(-1202598884, new i80(i, 4, function0, false), oq5Var), oq5Var, ((i6 >> 9) & 14) | 3456 | ((i6 >> 12) & 112), 0);
            yciVar2 = yciVar3;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ctb(i, function0, str, function03, d85Var, yciVar2, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(Function0 function0, yci yciVar, Function2 function2, Function2 function22, hq5 hq5Var, int i, int i2) {
        int i3;
        Function2 function23;
        int i4;
        Function2 function24;
        int i5;
        Object K;
        int i6;
        int i7;
        Function2 function25;
        Function2 function26;
        xmn r;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1199935166);
        if ((i & 6) == 0) {
            i3 = (oq5Var.h(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            function23 = function2;
            i3 |= oq5Var.h(function23) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                Function2 function27 = function22;
                i3 |= oq5Var.h(function27) ? 2048 : 1024;
                function24 = function27;
                if ((i3 & 1171) == 1170 || !oq5Var.z()) {
                    Function2 function28 = i8 != 0 ? vut.e : function23;
                    if (i4 != 0) {
                        function24 = vut.f;
                    }
                    yci d2 = d.d(yciVar, 1.0f);
                    float f = a;
                    yci e2 = d.e(d2, f);
                    iz2 iz2Var = b2c.e;
                    kfh d3 = ug3.d(iz2Var, false);
                    i5 = oq5Var.P;
                    a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, e2);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    kb5 kb5Var = wp5.f;
                    g0g.U(oq5Var, d3, kb5Var);
                    kb5 kb5Var2 = wp5.e;
                    g0g.U(oq5Var, l, kb5Var2);
                    kb5 kb5Var3 = wp5.g;
                    if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                        ouj.x(i5, oq5Var, i5, kb5Var3);
                    }
                    kb5 kb5Var4 = wp5.d;
                    g0g.U(oq5Var, H, kb5Var4);
                    b bVar = b.a;
                    vci vciVar = vci.a;
                    yci a2 = bVar.a(vciVar, iz2Var);
                    K = oq5Var.K();
                    int i9 = i3;
                    if (K == gq5.a) {
                        K = new xnq(18);
                        oq5Var.k0(K);
                    }
                    float f2 = 16;
                    bcx.c(function0, f8g.g0(androidx.compose.foundation.layout.a.q(nfp.b(a2, false, (Function1) K), f2, 0.0f, 0.0f, 0.0f, 14), 1.0f), oq5Var, i9 & 14);
                    yci n = androidx.compose.foundation.layout.a.n(d.e(f8g.g0(bVar.a(vciVar, b2c.c), 0.0f), f), 58, b);
                    iz2 iz2Var2 = b2c.b;
                    kfh d4 = ug3.d(iz2Var2, false);
                    i6 = oq5Var.P;
                    a l2 = oq5Var.l();
                    yci H2 = vnj.H(oq5Var, n);
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, d4, kb5Var);
                    g0g.U(oq5Var, l2, kb5Var2);
                    if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                        ouj.x(i6, oq5Var, i6, kb5Var3);
                    }
                    g0g.U(oq5Var, H2, kb5Var4);
                    function28.invoke(oq5Var, Integer.valueOf((i9 >> 6) & 14));
                    oq5Var.p(true);
                    yci q = androidx.compose.foundation.layout.a.q(f8g.g0(bVar.a(vciVar, b2c.g), 1.0f), 0.0f, 0.0f, f2, 0.0f, 11);
                    kfh d5 = ug3.d(iz2Var2, false);
                    i7 = oq5Var.P;
                    a l3 = oq5Var.l();
                    yci H3 = vnj.H(oq5Var, q);
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, d5, kb5Var);
                    g0g.U(oq5Var, l3, kb5Var2);
                    if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                        ouj.x(i7, oq5Var, i7, kb5Var3);
                    }
                    g0g.U(oq5Var, H3, kb5Var4);
                    function24.invoke(oq5Var, Integer.valueOf((i9 >> 9) & 14));
                    oq5Var.p(true);
                    oq5Var.p(true);
                    function25 = function28;
                    function26 = function24;
                } else {
                    oq5Var.S();
                    function25 = function23;
                    function26 = function24;
                }
                Function2 function29 = function26;
                r = oq5Var.r();
                if (r != null) {
                    r.d = new hq((Object) function0, yciVar, (Object) function25, (Object) function29, i, i2, 21);
                    return;
                }
                return;
            }
            function24 = function22;
            if ((i3 & 1171) == 1170) {
            }
            if (i8 != 0) {
            }
            if (i4 != 0) {
            }
            yci d22 = d.d(yciVar, 1.0f);
            float f3 = a;
            yci e22 = d.e(d22, f3);
            iz2 iz2Var3 = b2c.e;
            kfh d32 = ug3.d(iz2Var3, false);
            i5 = oq5Var.P;
            a l4 = oq5Var.l();
            yci H4 = vnj.H(oq5Var, e22);
            xp5.T.getClass();
            grb grbVar2 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
            }
            kb5 kb5Var5 = wp5.f;
            g0g.U(oq5Var, d32, kb5Var5);
            kb5 kb5Var22 = wp5.e;
            g0g.U(oq5Var, l4, kb5Var22);
            kb5 kb5Var32 = wp5.g;
            if (!oq5Var.O) {
            }
            ouj.x(i5, oq5Var, i5, kb5Var32);
            kb5 kb5Var42 = wp5.d;
            g0g.U(oq5Var, H4, kb5Var42);
            b bVar2 = b.a;
            vci vciVar2 = vci.a;
            yci a22 = bVar2.a(vciVar2, iz2Var3);
            K = oq5Var.K();
            int i92 = i3;
            if (K == gq5.a) {
            }
            float f22 = 16;
            bcx.c(function0, f8g.g0(androidx.compose.foundation.layout.a.q(nfp.b(a22, false, (Function1) K), f22, 0.0f, 0.0f, 0.0f, 14), 1.0f), oq5Var, i92 & 14);
            yci n2 = androidx.compose.foundation.layout.a.n(d.e(f8g.g0(bVar2.a(vciVar2, b2c.c), 0.0f), f3), 58, b);
            iz2 iz2Var22 = b2c.b;
            kfh d42 = ug3.d(iz2Var22, false);
            i6 = oq5Var.P;
            a l22 = oq5Var.l();
            yci H22 = vnj.H(oq5Var, n2);
            oq5Var.d0();
            if (oq5Var.O) {
            }
            g0g.U(oq5Var, d42, kb5Var5);
            g0g.U(oq5Var, l22, kb5Var22);
            if (!oq5Var.O) {
            }
            ouj.x(i6, oq5Var, i6, kb5Var32);
            g0g.U(oq5Var, H22, kb5Var42);
            function28.invoke(oq5Var, Integer.valueOf((i92 >> 6) & 14));
            oq5Var.p(true);
            yci q2 = androidx.compose.foundation.layout.a.q(f8g.g0(bVar2.a(vciVar2, b2c.g), 1.0f), 0.0f, 0.0f, f22, 0.0f, 11);
            kfh d52 = ug3.d(iz2Var22, false);
            i7 = oq5Var.P;
            a l32 = oq5Var.l();
            yci H32 = vnj.H(oq5Var, q2);
            oq5Var.d0();
            if (oq5Var.O) {
            }
            g0g.U(oq5Var, d52, kb5Var5);
            g0g.U(oq5Var, l32, kb5Var22);
            if (!oq5Var.O) {
            }
            ouj.x(i7, oq5Var, i7, kb5Var32);
            g0g.U(oq5Var, H32, kb5Var42);
            function24.invoke(oq5Var, Integer.valueOf((i92 >> 9) & 14));
            oq5Var.p(true);
            oq5Var.p(true);
            function25 = function28;
            function26 = function24;
            Function2 function292 = function26;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        function23 = function2;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function24 = function22;
        if ((i3 & 1171) == 1170) {
        }
        if (i8 != 0) {
        }
        if (i4 != 0) {
        }
        yci d222 = d.d(yciVar, 1.0f);
        float f32 = a;
        yci e222 = d.e(d222, f32);
        iz2 iz2Var32 = b2c.e;
        kfh d322 = ug3.d(iz2Var32, false);
        i5 = oq5Var.P;
        a l42 = oq5Var.l();
        yci H42 = vnj.H(oq5Var, e222);
        xp5.T.getClass();
        grb grbVar22 = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
        }
        kb5 kb5Var52 = wp5.f;
        g0g.U(oq5Var, d322, kb5Var52);
        kb5 kb5Var222 = wp5.e;
        g0g.U(oq5Var, l42, kb5Var222);
        kb5 kb5Var322 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i5, oq5Var, i5, kb5Var322);
        kb5 kb5Var422 = wp5.d;
        g0g.U(oq5Var, H42, kb5Var422);
        b bVar22 = b.a;
        vci vciVar22 = vci.a;
        yci a222 = bVar22.a(vciVar22, iz2Var32);
        K = oq5Var.K();
        int i922 = i3;
        if (K == gq5.a) {
        }
        float f222 = 16;
        bcx.c(function0, f8g.g0(androidx.compose.foundation.layout.a.q(nfp.b(a222, false, (Function1) K), f222, 0.0f, 0.0f, 0.0f, 14), 1.0f), oq5Var, i922 & 14);
        yci n22 = androidx.compose.foundation.layout.a.n(d.e(f8g.g0(bVar22.a(vciVar22, b2c.c), 0.0f), f32), 58, b);
        iz2 iz2Var222 = b2c.b;
        kfh d422 = ug3.d(iz2Var222, false);
        i6 = oq5Var.P;
        a l222 = oq5Var.l();
        yci H222 = vnj.H(oq5Var, n22);
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, d422, kb5Var52);
        g0g.U(oq5Var, l222, kb5Var222);
        if (!oq5Var.O) {
        }
        ouj.x(i6, oq5Var, i6, kb5Var322);
        g0g.U(oq5Var, H222, kb5Var422);
        function28.invoke(oq5Var, Integer.valueOf((i922 >> 6) & 14));
        oq5Var.p(true);
        yci q22 = androidx.compose.foundation.layout.a.q(f8g.g0(bVar22.a(vciVar22, b2c.g), 1.0f), 0.0f, 0.0f, f222, 0.0f, 11);
        kfh d522 = ug3.d(iz2Var222, false);
        i7 = oq5Var.P;
        a l322 = oq5Var.l();
        yci H322 = vnj.H(oq5Var, q22);
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, d522, kb5Var52);
        g0g.U(oq5Var, l322, kb5Var222);
        if (!oq5Var.O) {
        }
        ouj.x(i7, oq5Var, i7, kb5Var322);
        g0g.U(oq5Var, H322, kb5Var422);
        function24.invoke(oq5Var, Integer.valueOf((i922 >> 9) & 14));
        oq5Var.p(true);
        oq5Var.p(true);
        function25 = function28;
        function26 = function24;
        Function2 function2922 = function26;
        r = oq5Var.r();
        if (r != null) {
        }
    }
}
