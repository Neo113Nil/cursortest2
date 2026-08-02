package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public final class bma {
    public final jyr a;

    public bma(Context context) {
        this.a = btf.b(new vw1(context, 2));
    }

    public final Boolean a() {
        int i = Build.VERSION.SDK_INT;
        jyr jyrVar = this.a;
        if (i >= 33) {
            return Boolean.valueOf(((PowerManager) jyrVar.getValue()).isDeviceLightIdleMode());
        }
        try {
            Object invoke = ((PowerManager) jyrVar.getValue()).getClass().getDeclaredMethod("isLightDeviceIdleMode", null).invoke((PowerManager) jyrVar.getValue(), null);
            invoke.getClass();
            return (Boolean) invoke;
        } catch (IllegalAccessException e) {
            ssg.a(6, "DozeModeInfoProvider", "Reflection failed for isLightDeviceIdleMode: " + e, null);
            return null;
        } catch (NoSuchMethodException e2) {
            ssg.a(6, "DozeModeInfoProvider", "Reflection failed for isLightDeviceIdleMode: " + e2, null);
            return null;
        } catch (SecurityException e3) {
            ssg.a(6, "DozeModeInfoProvider", "Reflection failed for isLightDeviceIdleMode: " + e3, null);
            return null;
        } catch (InvocationTargetException e4) {
            ssg.a(6, "DozeModeInfoProvider", "Reflection failed for isLightDeviceIdleMode: " + e4, null);
            return null;
        }
    }
}
