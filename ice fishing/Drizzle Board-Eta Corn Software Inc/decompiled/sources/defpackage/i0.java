package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;
import defpackage.f00;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class i0 {
    public static void MdtA4re8(Resources.Theme theme) {
        theme.rebase();
    }

    public static Insets NCTxEWno(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static String qoPGr6Ce(Context context) {
        return context.getOpPackageName();
    }

    public static final void wxUZMvaN(Activity activity, f00.qoPGr6Ce qopgr6ce) {
        activity.registerActivityLifecycleCallbacks(qopgr6ce);
    }
}
