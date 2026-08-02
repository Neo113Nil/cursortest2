package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes.dex */
public final class zth {
    public static final boolean b = Log.isLoggable("MediaSessionManager", 3);
    public static final Object c = new Object();
    public static volatile zth d;
    public tth a;

    public static zth a(Context context) {
        zth zthVar;
        if (context == null) {
            xq0.x("context cannot be null");
            return null;
        }
        synchronized (c) {
            try {
                if (d == null) {
                    Context applicationContext = context.getApplicationContext();
                    zth zthVar2 = new zth();
                    if (Build.VERSION.SDK_INT >= 28) {
                        vth vthVar = new vth(applicationContext);
                        zthVar2.a = vthVar;
                    } else {
                        zthVar2.a = new tth(applicationContext);
                    }
                    d = zthVar2;
                }
                zthVar = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zthVar;
    }

    public final boolean b(xth xthVar) {
        if (xthVar == null) {
            xq0.x("userInfo should not be null");
            return false;
        }
        tth tthVar = this.a;
        wth wthVar = xthVar.a;
        Context context = tthVar.a;
        int i = wthVar.b;
        String str = wthVar.a;
        int i2 = wthVar.c;
        if (context.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", i, i2) != 0) {
            try {
                if (tthVar.a.getPackageManager().getApplicationInfo(str, 0) == null) {
                    return false;
                }
                if (!tthVar.a(wthVar, "android.permission.STATUS_BAR_SERVICE") && !tthVar.a(wthVar, "android.permission.MEDIA_CONTENT_CONTROL") && i2 != 1000) {
                    String string = Settings.Secure.getString(tthVar.b, "enabled_notification_listeners");
                    if (string == null) {
                        return false;
                    }
                    for (String str2 : string.split(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str2);
                        if (unflattenFromString == null || !unflattenFromString.getPackageName().equals(str)) {
                        }
                    }
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                if (!tth.c) {
                    return false;
                }
                Log.d("MediaSessionManager", "Package " + str + " doesn't exist");
                return false;
            }
        }
        return true;
    }
}
