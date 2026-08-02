package com.yandex.plus.home.common.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.view.WindowMetrics;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.uf6;
import defpackage.y2x;
import defpackage.z7o;
import java.util.LinkedHashSet;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class a {
    public static final int a(Context context, int i) {
        context.getClass();
        return context.getColor(i);
    }

    public static final int b(Context context, int i) {
        context.getClass();
        Resources.Theme theme = context.getTheme();
        theme.getClass();
        return com.yandex.plus.bdui.plus.analytics.b.v(i, theme).data;
    }

    public static final float c(Context context) {
        context.getClass();
        Point f = f(context);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        displayMetrics.getClass();
        double d = displayMetrics.xdpi;
        context.getResources().getDisplayMetrics().getClass();
        float hypot = (float) Math.hypot(f.x / d, f.y / r7.ydpi);
        Float valueOf = Float.valueOf(hypot);
        if (Math.abs(hypot) > Float.MAX_VALUE) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.floatValue();
        }
        return 0.0f;
    }

    public static final int d(Context context, int i) {
        context.getClass();
        return context.getResources().getDimensionPixelSize(i);
    }

    public static final Drawable e(Context context, int i) {
        context.getClass();
        return y2x.w(context, i);
    }

    public static final Point f(Context context) {
        context.getClass();
        context.getClass();
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        WindowManager windowManager = (WindowManager) systemService;
        Point point = new Point();
        if (Build.VERSION.SDK_INT < 30) {
            windowManager.getDefaultDisplay().getRealSize(point);
            return point;
        }
        WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        currentWindowMetrics.getClass();
        point.x = currentWindowMetrics.getBounds().width();
        point.y = currentWindowMetrics.getBounds().height();
        return point;
    }

    public static final Long g(Context context) {
        Object t7oVar;
        context.getClass();
        try {
            r7o r7oVar = z7o.b;
            t7oVar = Long.valueOf(Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L)).getLongVersionCode() : context.getPackageManager().getPackageInfo(context.getPackageName(), 0).getLongVersionCode());
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        if (t7oVar instanceof t7o) {
            t7oVar = null;
        }
        return (Long) t7oVar;
    }

    public static final String h(Context context) {
        Object t7oVar;
        context.getClass();
        try {
            r7o r7oVar = z7o.b;
            t7oVar = Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L)).versionName : context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        if (t7oVar instanceof t7o) {
            t7oVar = null;
        }
        String str = (String) t7oVar;
        return str == null ? "" : str;
    }

    public static final boolean i(Context context) {
        context.getClass();
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static final boolean j(Context context) {
        context.getClass();
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public static final int k(Resources resources, int i) {
        resources.getClass();
        return (int) (i / resources.getDisplayMetrics().density);
    }

    public static final Activity l(Context context) {
        context.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (linkedHashSet.contains(context)) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        linkedHashSet.add(context);
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        baseContext.getClass();
        return l(baseContext);
    }

    public static final Context m(Context context, Locale locale) {
        locale.getClass();
        Configuration configuration = context.getResources().getConfiguration();
        configuration.getClass();
        Locale[] availableLocales = Locale.getAvailableLocales();
        availableLocales.getClass();
        for (Locale locale2 : availableLocales) {
            if (Intrinsics.d(locale2.getLanguage(), locale.getLanguage())) {
                configuration.setLocale(locale);
                Context createConfigurationContext = context.createConfigurationContext(configuration);
                createConfigurationContext.getClass();
                return createConfigurationContext;
            }
        }
        return context;
    }

    public static final Context n(Context context, int... iArr) {
        context.getClass();
        int length = iArr.length;
        int i = 0;
        while (i < length) {
            uf6 uf6Var = new uf6(context, iArr[i]);
            i++;
            context = uf6Var;
        }
        return context;
    }
}
