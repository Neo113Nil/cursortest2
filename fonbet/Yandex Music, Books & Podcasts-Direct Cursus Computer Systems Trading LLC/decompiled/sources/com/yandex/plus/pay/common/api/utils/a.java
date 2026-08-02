package com.yandex.plus.pay.common.api.utils;

import android.content.Context;
import android.os.Build;
import android.view.Window;
import android.view.WindowInsetsController;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.hq0;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;

/* loaded from: classes5.dex */
public abstract class a {
    public static final boolean a(Context context) {
        Object t7oVar;
        context.getClass();
        try {
            r7o r7oVar = z7o.b;
            t7oVar = Boolean.valueOf((Build.VERSION.SDK_INT >= 30 ? context.getPackageManager().getInstallSourceInfo(context.getPackageName()).getInstallingPackageName() : context.getPackageManager().getInstallerPackageName(context.getPackageName())) != null);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        if (z7o.a(t7oVar) != null) {
            t7oVar = Boolean.FALSE;
        }
        return ((Boolean) t7oVar).booleanValue();
    }

    public static final void b(hq0 hq0Var) {
        hq0Var.getClass();
        if ((hq0Var.getResources().getConfiguration().uiMode & 48) == 32) {
            c(hq0Var);
            return;
        }
        if (Build.VERSION.SDK_INT < 30) {
            Window window = hq0Var.getWindow();
            window.getClass();
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | RemoteCameraConfig.Notification.ID);
        } else {
            WindowInsetsController insetsController = hq0Var.getWindow().getInsetsController();
            if (insetsController != null) {
                insetsController.setSystemBarsAppearance(8, 8);
            }
        }
    }

    public static final void c(hq0 hq0Var) {
        hq0Var.getClass();
        if (Build.VERSION.SDK_INT < 30) {
            Window window = hq0Var.getWindow();
            window.getClass();
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & (-8193));
        } else {
            WindowInsetsController insetsController = hq0Var.getWindow().getInsetsController();
            if (insetsController != null) {
                insetsController.setSystemBarsAppearance(0, 8);
            }
        }
    }
}
