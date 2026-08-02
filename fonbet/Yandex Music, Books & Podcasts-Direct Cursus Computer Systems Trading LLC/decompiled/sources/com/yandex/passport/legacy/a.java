package com.yandex.passport.legacy;

import android.util.Log;
import com.yandex.passport.api.q;
import com.yandex.passport.api.v0;
import com.yandex.passport.internal.analytics.v;
import com.yandex.passport.internal.analytics.w;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.provider.InternalProvider;

/* loaded from: classes4.dex */
public final class a {
    public static q a;

    public static final void a(String str) {
        str.getClass();
        e(3, str, null);
    }

    public static final void b(String str) {
        str.getClass();
        e(6, str, null);
    }

    public static final void c(String str, Throwable th) {
        th.getClass();
        e(6, str, th);
    }

    public static void d(Exception exc) {
        w analyticsTrackerWrapper;
        StringBuilder sb = new StringBuilder("throwIfDebug: isInPassportProcess=");
        boolean z = InternalProvider.d;
        sb.append(InternalProvider.d);
        Log.e("a", sb.toString(), exc);
        if (InternalProvider.d) {
            try {
                PassportProcessGlobalComponent passportProcessGlobalComponent = com.yandex.passport.internal.di.a.a;
                if (passportProcessGlobalComponent == null || (analyticsTrackerWrapper = passportProcessGlobalComponent.getAnalyticsTrackerWrapper()) == null) {
                    Log.e("a", "throwIfDebug: something very wrong just happened");
                } else {
                    analyticsTrackerWrapper.d(v.a, exc);
                }
            } catch (Exception e) {
                Log.e("a", "throwIfDebug: something very wrong just happened", e);
            }
        }
    }

    public static void e(int i, String str, Throwable th) {
        v0 v0Var;
        q qVar = q.a;
        v0[] values = v0.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                v0Var = null;
                break;
            }
            v0Var = values[i2];
            if (v0Var.a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (v0Var == null) {
            return;
        }
        if (th == null) {
            q qVar2 = a;
            if (qVar2 != null) {
                qVar = qVar2;
            }
            qVar.f(v0Var, "Passport", str);
            return;
        }
        q qVar3 = a;
        if (qVar3 != null) {
            qVar = qVar3;
        }
        qVar.g(v0Var, "Passport", str, th);
    }
}
