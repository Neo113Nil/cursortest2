package com.yandex.passport.internal.ui.util;

import android.content.Context;
import com.yandex.passport.R;
import com.yandex.passport.api.y1;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.b6e;
import defpackage.hq0;

/* loaded from: classes4.dex */
public abstract class s {
    public static final y1 a(Context context) {
        int i = context.getResources().getConfiguration().uiMode & 48;
        return i != 16 ? i != 32 ? y1.a : y1.b : y1.a;
    }

    public static final String b(y1 y1Var) {
        y1Var.getClass();
        int ordinal = y1Var.ordinal();
        if (ordinal == 0) {
            return "light";
        }
        if (ordinal == 1) {
            return "dark";
        }
        if (ordinal == 2) {
            return "light";
        }
        if (ordinal == 3) {
            return b(a(com.yandex.plus.pay.ui.core.b.u()));
        }
        b6e.s();
        return null;
    }

    public static final int c(y1 y1Var, com.yandex.passport.internal.ui.base.e eVar) {
        y1Var.getClass();
        int ordinal = y1Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return R.style.Passport_Theme_AutoLoginDialog_Dark;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return c(a(eVar), eVar);
                }
                b6e.s();
                return 0;
            }
        }
        return R.style.Passport_Theme_AutoLoginDialog_Light;
    }

    public static final int d(y1 y1Var, com.yandex.passport.internal.ui.c cVar) {
        y1Var.getClass();
        int ordinal = y1Var.ordinal();
        if (ordinal == 0) {
            return R.style.PassportNext_Theme_Light_Immersive;
        }
        if (ordinal == 1) {
            return R.style.PassportNext_Theme_Dark_Immersive;
        }
        if (ordinal == 2) {
            return R.style.PassportNext_Theme_Custom_Immersive;
        }
        if (ordinal == 3) {
            return d(a(cVar), cVar);
        }
        b6e.s();
        return 0;
    }

    public static final int e(y1 y1Var, AuthSdkActivity authSdkActivity) {
        y1Var.getClass();
        int ordinal = y1Var.ordinal();
        if (ordinal == 0) {
            return R.style.Passport_Theme_Light;
        }
        if (ordinal == 1) {
            return R.style.Passport_Theme_Dark;
        }
        if (ordinal == 2) {
            return R.style.Passport_Theme_Light;
        }
        if (ordinal == 3) {
            return e(a(authSdkActivity), authSdkActivity);
        }
        b6e.s();
        return 0;
    }

    public static final int f(y1 y1Var, hq0 hq0Var) {
        y1Var.getClass();
        int ordinal = y1Var.ordinal();
        if (ordinal == 0) {
            return R.style.PassportNext_Theme_Light_Transparent_Paranja;
        }
        if (ordinal == 1) {
            return R.style.PassportNext_Theme_Dark_Transparent_Paranja;
        }
        if (ordinal == 2) {
            return R.style.PassportNext_Theme_Custom_Transparent_Paranja;
        }
        if (ordinal == 3) {
            return f(a(hq0Var), hq0Var);
        }
        b6e.s();
        return 0;
    }
}
