package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import yads.q91;

/* loaded from: classes7.dex */
public final class xk61 {
    public final be81 a = new be81();

    public final void a(Context context) {
        try {
            ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.yandex.mobile.ads.common.AdActivity"), 0);
            this.a.getClass();
            be81.a(activityInfo);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new q91("There is no presence of com.yandex.mobile.ads.common.AdActivity activity in AndroidManifest file.");
        }
    }
}
