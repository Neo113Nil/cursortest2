package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* loaded from: classes11.dex */
public abstract class xqc {
    public static final ga0 a = new ga0("CommonUtils", "");

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            String concat = "Exception thrown when trying to get app version ".concat(e.toString());
            ga0 ga0Var = a;
            if (!Log.isLoggable(ga0Var.a, 6)) {
                return "";
            }
            String str = ga0Var.b;
            if (str != null) {
                concat = str.concat(concat);
            }
            Log.e("CommonUtils", concat);
            return "";
        }
    }
}
