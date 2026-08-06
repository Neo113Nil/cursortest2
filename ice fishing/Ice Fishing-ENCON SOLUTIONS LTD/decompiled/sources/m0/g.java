package m0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import com.watchfacestudio.spraktum.R;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p0.AbstractC1021r;
import u0.C1051b;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8174a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f8175b;

    static {
        AtomicBoolean atomicBoolean = i.f8176a;
        f8174a = 12451000;
        f8175b = new g();
    }

    public Intent a(Context context, String str, int i2) {
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && R1.l.s(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(f8174a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                G0.b a2 = C1051b.a(context);
                sb.append(a2.f642a.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String sb2 = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(sb2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x023c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x023d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int b(Context context, int i2) {
        Object[] objArr;
        PackageInfo packageInfo;
        Bundle bundle;
        boolean z2 = true;
        int i3 = 0;
        Object[] objArr2 = 0;
        AtomicBoolean atomicBoolean = i.f8176a;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !i.f8177b.get()) {
            synchronized (AbstractC1021r.f8406a) {
                try {
                    if (!AbstractC1021r.f8407b) {
                        AbstractC1021r.f8407b = true;
                        try {
                            bundle = C1051b.a(context).f642a.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                        } catch (PackageManager.NameNotFoundException e2) {
                            Log.wtf("MetadataValueReader", "This should never happen.", e2);
                        }
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            AbstractC1021r.f8408c = bundle.getInt("com.google.android.gms.version");
                        }
                    }
                } finally {
                }
            }
            int i4 = AbstractC1021r.f8408c;
            if (i4 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i4 != 12451000) {
                throw new GooglePlayServicesIncorrectManifestValueException("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected " + f8174a + " but found " + i4 + ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            }
        }
        if (!R1.l.s(context)) {
            if (R1.l.f1768g == null) {
                R1.l.f1768g = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
            }
            if (!R1.l.f1768g.booleanValue()) {
                objArr = true;
                if (i2 >= 0) {
                    throw new IllegalArgumentException();
                }
                String packageName = context.getPackageName();
                PackageManager packageManager = context.getPackageManager();
                int i5 = 9;
                if (objArr == true) {
                    try {
                        packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
                    } catch (PackageManager.NameNotFoundException unused2) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
                    }
                } else {
                    packageInfo = null;
                }
                try {
                    PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
                    synchronized (j.class) {
                        if (j.f8179b == null) {
                            m mVar = q.f8191a;
                            synchronized (q.class) {
                                if (q.f8193c == null) {
                                    q.f8193c = context.getApplicationContext();
                                } else {
                                    Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                                }
                            }
                            j jVar = new j(i3, (boolean) (objArr2 == true ? 1 : 0));
                            context.getApplicationContext();
                            j.f8179b = jVar;
                        }
                    }
                    if (j.p(packageInfo2)) {
                        if (objArr != false) {
                            AbstractC1021r.c(packageInfo);
                            if (!j.p(packageInfo)) {
                                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                            }
                        }
                        if (!objArr == true || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                            int i6 = packageInfo2.versionCode;
                            if ((i6 == -1 ? -1 : i6 / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT) < (i2 != -1 ? i2 / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT : -1)) {
                                Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i2 + " but found " + i6);
                                i5 = 2;
                            } else {
                                ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                                if (applicationInfo == null) {
                                    try {
                                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                    } catch (PackageManager.NameNotFoundException e3) {
                                        Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e3);
                                        i5 = 1;
                                        if (i5 != 18) {
                                        }
                                        if (z2) {
                                        }
                                    }
                                }
                                i5 = !applicationInfo.enabled ? 3 : 0;
                            }
                        } else {
                            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                        }
                    } else {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
                    }
                } catch (PackageManager.NameNotFoundException unused3) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
                }
                if (i5 != 18) {
                    if (i5 == 1) {
                        try {
                            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z2 = context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
                                    break;
                                }
                                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                                    break;
                                }
                            }
                        } catch (PackageManager.NameNotFoundException | Exception unused4) {
                        }
                    }
                    z2 = false;
                }
                if (z2) {
                    return i5;
                }
                return 18;
            }
        }
        objArr = false;
        if (i2 >= 0) {
        }
    }
}
