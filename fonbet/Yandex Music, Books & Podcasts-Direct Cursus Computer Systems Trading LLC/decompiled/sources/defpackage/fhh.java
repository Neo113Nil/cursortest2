package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class fhh {
    public static final boolean b = Log.isLoggable("MediaBrowserCompat", 3);
    public final chh a;

    public fhh(Context context, ComponentName componentName, ime imeVar, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new dhh(context, componentName, imeVar, bundle);
        } else {
            this.a = new chh(context, componentName, imeVar, bundle);
        }
    }
}
