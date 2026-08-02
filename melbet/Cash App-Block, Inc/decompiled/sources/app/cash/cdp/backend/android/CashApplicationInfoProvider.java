package app.cash.cdp.backend.android;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import app.cash.cdp.api.providers.ApplicationInfo;

/* loaded from: classes.dex */
public final class CashApplicationInfoProvider {
    public final Context context;

    public CashApplicationInfoProvider(Context context) {
        this.context = context;
    }

    public final ApplicationInfo getApplicationInfo() {
        Context context = this.context;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            String str = packageInfo.versionName;
            if (str == null) {
                str = "";
            }
            String valueOf = String.valueOf(packageInfo.getLongVersionCode());
            String str2 = packageInfo.packageName;
            str2.getClass();
            return new ApplicationInfo(str, valueOf, str2);
        } catch (PackageManager.NameNotFoundException unused) {
            String packageName = context.getPackageName();
            packageName.getClass();
            return new ApplicationInfo("", "", packageName);
        }
    }
}
