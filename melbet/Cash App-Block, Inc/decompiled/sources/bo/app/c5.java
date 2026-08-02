package bo.app;

import android.app.ActivityManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class c5 implements g9 {
    public final Context a;
    public final BrazeConfigurationProvider b;
    public final String c;
    public final b5 d;
    public PackageInfo e;

    public c5(Context context, BrazeConfigurationProvider brazeConfigurationProvider) {
        context.getClass();
        brazeConfigurationProvider.getClass();
        this.a = context;
        this.b = brazeConfigurationProvider;
        PackageInfo j = j();
        this.c = j != null ? j.versionName : null;
        this.d = new b5(context);
    }

    public static final String a(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Unable to inspect package [", str, "]");
    }

    public static final String g() {
        return "Failed to collect background restriction information from Activity Manager";
    }

    public static final String i() {
        return "Caught exception while reading the phone carrier name.";
    }

    public final x4 b() {
        BrazeConfigurationProvider brazeConfigurationProvider = this.b;
        brazeConfigurationProvider.getClass();
        String valueOf = String.valueOf(Build.VERSION.SDK_INT);
        String h = h();
        String str = Build.BRAND;
        if (str == null || StringsKt.isBlank(str)) {
            str = null;
        }
        String str2 = Build.MODEL;
        Locale locale = Locale.getDefault();
        locale.getClass();
        locale.getClass();
        String locale2 = locale.toString();
        locale2.getClass();
        TimeZone timeZone = TimeZone.getDefault();
        timeZone.getClass();
        return new x4(brazeConfigurationProvider, valueOf, h, str, str2, locale2, timeZone.getID(), Boolean.valueOf(d()), Boolean.valueOf(f()), this.d.readString(DataStoreKey.GOOGLE_ADVERTISING_ID, null), this.d.readBoolean(DataStoreKey.AD_TRACKING_ENABLED, null));
    }

    public final String c() {
        PackageInfo j = j();
        if (j == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda3(29), 7, (Object) null);
            return null;
        }
        return j.getLongVersionCode() + ".0.0.0";
    }

    public final boolean d() {
        Object systemService = this.a.getSystemService("notification");
        systemService.getClass();
        return ((NotificationManager) systemService).areNotificationsEnabled();
    }

    public final boolean f() {
        try {
            Object systemService = this.a.getSystemService("activity");
            systemService.getClass();
            return ((ActivityManager) systemService).isBackgroundRestricted();
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new b$$ExternalSyntheticLambda3(27), 4, (Object) null);
            return false;
        }
    }

    public final String h() {
        try {
            Object systemService = this.a.getSystemService("phone");
            systemService.getClass();
            String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
            if (networkOperatorName != null) {
                return StringsKt.trim(networkOperatorName).toString();
            }
            return null;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new b$$ExternalSyntheticLambda3(28), 4, (Object) null);
            return null;
        }
    }

    public final PackageInfo j() {
        PackageInfo packageInfo = this.e;
        if (packageInfo != null) {
            return packageInfo;
        }
        String packageName = this.a.getPackageName();
        try {
            int i = Build.VERSION.SDK_INT;
            Context context = this.a;
            PackageInfo packageInfo2 = i >= 33 ? context.getPackageManager().getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(0L)) : context.getPackageManager().getPackageInfo(packageName, 0);
            this.e = packageInfo2;
            return packageInfo2;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new b9$$ExternalSyntheticLambda0(packageName, 5), 4, (Object) null);
            ApplicationInfo applicationInfo = this.a.getApplicationInfo();
            int i2 = Build.VERSION.SDK_INT;
            Context context2 = this.a;
            PackageInfo packageArchiveInfo = i2 >= 33 ? context2.getPackageManager().getPackageArchiveInfo(applicationInfo.sourceDir, PackageManager.PackageInfoFlags.of(0L)) : context2.getPackageManager().getPackageArchiveInfo(applicationInfo.sourceDir, 0);
            this.e = packageArchiveInfo;
            return packageArchiveInfo;
        }
    }

    public static final String a() {
        return "App version code could not be read. Returning null";
    }
}
