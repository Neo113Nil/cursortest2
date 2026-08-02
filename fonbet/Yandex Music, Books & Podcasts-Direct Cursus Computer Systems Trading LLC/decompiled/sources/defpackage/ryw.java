package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class ryw extends etn {
    public static void p0(Context context, fxw fxwVar, IntentFilter intentFilter) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            context.registerReceiver(fxwVar, intentFilter, i >= 33 ? 2 : 0);
        } else {
            context.registerReceiver(fxwVar, intentFilter);
        }
    }
}
