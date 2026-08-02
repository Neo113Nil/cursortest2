package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class pf6 {
    public static final phm a = new phm(14, true);
    public static final df6 b;

    static {
        long j = d85.f;
        long j2 = d85.b;
        b = new df6(j, j2, j2, d85.b(j2, 0.38f, 0.0f, 0.0f, 0.0f, 14), d85.b(j2, 0.38f, 0.0f, 0.0f, 0.0f, 14));
    }

    public static final void a(df6 df6Var, wn5 wn5Var, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-921259293);
        int i2 = (oq5Var.f(df6Var) ? 4 : 2) | i;
        vci vciVar = vci.a;
        int i3 = i2 | (oq5Var.f(vciVar) ? 32 : 16);
        if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
            yci Q = bfg.Q(a.o(a.r(androidx.compose.foundation.a.b(y1g.d0(vciVar, jf6.d, ugo.a(jf6.e), false, 28), df6Var.a, vnj.i), hxe.b), 0.0f, jf6.i, 1), bfg.C(oq5Var), false, 14);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, Q);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            wn5Var.invoke(wa5.a, oq5Var, 54);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new s30(df6Var, wn5Var, i, 16);
        }
    }

    public static final void b(String str, df6 df6Var, Function0 function0, hq5 hq5Var, int i) {
        int i2;
        int i3;
        String str2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(791018367);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2;
        if ((i & 48) == 0) {
            i3 = (oq5Var.g(true) ? 32 : 16) | i4;
        } else {
            i3 = i4;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.f(df6Var) ? 256 : 128;
        }
        int i5 = i & 3072;
        vci vciVar = vci.a;
        if (i5 == 0) {
            i3 |= oq5Var.f(vciVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= oq5Var.h(null) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i3 |= oq5Var.h(function0) ? 131072 : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        int i6 = i3;
        if (oq5Var.P(i6 & 1, (74899 & i6) != 74898)) {
            hz2 hz2Var = jf6.f;
            x2i x2iVar = qx0.a;
            float f = jf6.h;
            nx0 g = qx0.g(f);
            boolean z = ((i6 & 112) == 32) | ((458752 & i6) == 131072);
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new of6(0, function0);
                oq5Var.k0(K);
            }
            yci d = d.d(androidx.compose.foundation.a.e(vciVar, true, str, null, (Function0) K, 4), 1.0f);
            float f2 = jf6.a;
            float f3 = jf6.b;
            float f4 = jf6.c;
            yci o = a.o(d.p(d, f2, f4, f3, f4), f, 0.0f, 2);
            nho a2 = lho.a(g, hz2Var, oq5Var, 54);
            int i7 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, o);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                ouj.x(i7, oq5Var, i7, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            oq5Var.Z(554788141);
            oq5Var.p(false);
            ges gesVar = new ges(df6Var.b, jf6.j, jf6.k, null, null, null, null, jf6.m, null, jf6.g, jf6.l, null, null, 0, 16613240);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            str2 = str;
            j66.g(str2, new LayoutWeightElement(true, 1.0f), gesVar, null, 0, false, 1, 0, null, oq5Var, (i6 & 14) | ScreenMirroringConfig.Video.BITRATE_1_5MB, 952);
            oq5Var.p(true);
        } else {
            str2 = str;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ig0(str2, df6Var, function0, i);
        }
    }

    public static final void c(ohm ohmVar, Function0 function0, df6 df6Var, Function1 function1, hq5 hq5Var, int i) {
        int i2;
        Function0 function02;
        ohm ohmVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1447189339);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(ohmVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(vci.a) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(df6Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.h(function1) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if (oq5Var.P(i2 & 1, (i2 & 9363) != 9362)) {
            function02 = function0;
            bi0.a(ohmVar, function02, a, ild.C(795909757, new s30(df6Var, function1), oq5Var), oq5Var, (i2 & 14) | 3456 | (i2 & 112), 0);
            ohmVar2 = ohmVar;
        } else {
            function02 = function0;
            ohmVar2 = ohmVar;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new un5(ohmVar2, function02, df6Var, function1, i);
        }
    }

    public static final void d(ohm ohmVar, Function0 function0, Function1 function1, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(712057293);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(ohmVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(vci.a) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(function1) ? 2048 : 1024;
        }
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
            boolean f = oq5Var.f((Configuration) oq5Var.j(AndroidCompositionLocals_androidKt.a)) | oq5Var.f(context);
            Object K = oq5Var.K();
            if (f || K == gq5.a) {
                df6 df6Var = b;
                long j = df6Var.a;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Widget.PopupMenu, new int[]{R.attr.colorBackground});
                int U = c3x.U(j);
                int color = obtainStyledAttributes.getColor(0, U);
                obtainStyledAttributes.recycle();
                if (color != U) {
                    j = c3x.f(color);
                }
                long j2 = j;
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(R.style.TextAppearance.Widget.PopupMenu.Large, new int[]{R.attr.textColorPrimary});
                ColorStateList colorStateList = obtainStyledAttributes2.getColorStateList(0);
                obtainStyledAttributes2.recycle();
                long j3 = df6Var.b;
                int U2 = c3x.U(j3);
                Integer valueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, U2)) : null;
                if (valueOf != null && valueOf.intValue() != U2) {
                    j3 = c3x.f(valueOf.intValue());
                }
                long j4 = j3;
                long j5 = df6Var.d;
                int U3 = c3x.U(j5);
                Integer valueOf2 = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, U3)) : null;
                if (valueOf2 != null && valueOf2.intValue() != U3) {
                    j5 = c3x.f(valueOf2.intValue());
                }
                long j6 = j5;
                df6 df6Var2 = new df6(j2, j4, j4, j6, j6);
                oq5Var.k0(df6Var2);
                K = df6Var2;
            }
            c(ohmVar, function0, (df6) K, function1, oq5Var, (i2 & 1022) | ((i2 << 3) & 57344));
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ig0(ohmVar, function0, function1, i);
        }
    }
}
