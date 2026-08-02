package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;
import java.util.LinkedHashSet;

/* loaded from: classes10.dex */
public abstract class st7 {
    public static final xs7 a;

    static {
        ws7 ws7Var = new ws7();
        ws7Var.b(2);
        a = ws7Var.a();
    }

    public static void a(Context context, us7 us7Var, xs7 xs7Var) {
        Integer b;
        if (Build.VERSION.SDK_INT >= 34 && sg.c(context) != 0) {
            LinkedHashSet c = us7Var.c();
            sg.c(context);
            c.size();
            sgb1.g(3, "CameraValidator");
            return;
        }
        IllegalArgumentException e = null;
        if (xs7Var != null) {
            try {
                b = xs7Var.b();
                if (b == null) {
                    sgb1.g(5, "CameraValidator");
                    return;
                }
            } catch (IllegalStateException e2) {
                sgb1.e("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e2);
                return;
            }
        } else {
            b = null;
        }
        String str = Build.DEVICE;
        sgb1.g(3, "CameraValidator");
        PackageManager packageManager = context.getPackageManager();
        int i = 0;
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera")) {
                if (xs7Var != null) {
                    if (b.intValue() == 1) {
                    }
                }
                xs7.c.c(us7Var.c());
                i = 1;
            }
        } catch (IllegalArgumentException e3) {
            e = e3;
            sgb1.g(5, "CameraValidator");
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
                if (xs7Var != null) {
                    if (b.intValue() == 0) {
                    }
                }
                xs7.b.c(us7Var.c());
                i++;
            }
        } catch (IllegalArgumentException e4) {
            e = e4;
            sgb1.g(5, "CameraValidator");
        }
        try {
            a.c(us7Var.c());
            sgb1.g(3, "CameraValidator");
            i++;
        } catch (IllegalArgumentException unused) {
        }
        if (e == null) {
            return;
        }
        sgb1.d("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + us7Var.c());
        throw new CameraValidator$CameraIdListIncorrectException(i, e);
    }
}
