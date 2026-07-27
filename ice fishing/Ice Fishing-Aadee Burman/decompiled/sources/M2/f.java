package M2;

import P2.w;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import com.icefishing.icefishinglive2.C5275R;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final int f1843a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f1844b;

    static {
        int i = h.f1847c;
        f1843a = 12451000;
        f1844b = new f();
    }

    public static int a(Context context) {
        int i = h.f1847c;
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    public Intent b(Context context, String str, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && T2.b.i(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(f1843a);
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
                sb.append(V2.c.a(context).c(0, context.getPackageName()).versionCode);
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

    /* JADX WARN: Can't wrap try/catch for region: R(18:0|1|(2:2|3)|4|(4:8|2e|15|(2:17|(2:19|20))(2:22|23))|39|(4:41|(3:43|(1:45)(1:47)|46)|48|(15:50|(1:52)(1:134)|53|(4:126|127|(1:129)(1:132)|130)(1:55)|56|57|(1:59)(1:124)|60|61|129|80|(1:82)(2:(2:92|(1:94))|(4:100|(1:102)(1:119)|(1:104)|(1:106)(4:107|(2:113|114)|109|(1:111)(1:112)))(1:99))|83|(1:85)(1:(1:90))|(1:87)(1:88)))|135|(0)(0)|53|(0)(0)|56|57|(0)(0)|60|61|129|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x022d, code lost:
    
        android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(r3).concat(" requires Google Play services, but they are missing."));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x024b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x024c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0243  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int c(Context context, int i) {
        Object[] objArr;
        PackageInfo packageInfo;
        Bundle bundle;
        boolean z3 = false;
        Object[] objArr2 = 0;
        int i6 = h.f1847c;
        try {
            context.getResources().getString(C5275R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !h.f1846b.get()) {
            synchronized (w.f2554a) {
                try {
                    if (!w.f2555b) {
                        w.f2555b = true;
                        try {
                            bundle = V2.c.a(context).b(128, context.getPackageName()).metaData;
                        } catch (PackageManager.NameNotFoundException e9) {
                            Log.wtf("MetadataValueReader", "This should never happen.", e9);
                        }
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            w.f2556c = bundle.getInt("com.google.android.gms.version");
                        }
                    }
                } finally {
                }
            }
            int i9 = w.f2556c;
            if (i9 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i9 != 12451000) {
                int i10 = f1843a;
                StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 104 + String.valueOf(i9).length() + 194);
                u1.h.h(sb, "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ", i10, " but found ", i9);
                sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new GooglePlayServicesIncorrectManifestValueException(sb.toString());
            }
        }
        if (!T2.b.i(context)) {
            if (T2.b.f3083f == null) {
                T2.b.f3083f = Boolean.valueOf(T2.b.f() ? context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") : context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
            }
            if (!T2.b.f3083f.booleanValue()) {
                objArr = true;
                w.b(i < 0);
                String packageName = context.getPackageName();
                PackageManager packageManager = context.getPackageManager();
                int i11 = 9;
                if (objArr == true) {
                    packageInfo = null;
                } else {
                    try {
                        packageInfo = packageManager.getPackageInfo("com.android.vending", Build.VERSION.SDK_INT >= 28 ? 134225984 : 8256);
                    } catch (PackageManager.NameNotFoundException unused2) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
                    }
                }
                PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT < 28 ? 134217792 : 64);
                synchronized (i.class) {
                    if (i.f1848u == null) {
                        l lVar = p.f1863a;
                        synchronized (p.class) {
                            if (p.f1865c == null) {
                                p.f1865c = context.getApplicationContext();
                            } else {
                                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                            }
                        }
                        i iVar = new i(objArr2 == true ? 1 : 0);
                        context.getApplicationContext();
                        i.f1848u = iVar;
                    }
                }
                if (i.s(packageInfo2)) {
                    if (objArr != false) {
                        w.h(packageInfo);
                        if (!i.s(packageInfo)) {
                            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                        }
                    }
                    if (!objArr == true || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                        int i12 = packageInfo2.versionCode;
                        if ((i12 == -1 ? -1 : i12 / 1000) < (i != -1 ? i / 1000 : -1)) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i).length() + 11 + String.valueOf(i12).length());
                            sb2.append("Google Play services out of date for ");
                            sb2.append(packageName);
                            sb2.append(".  Requires ");
                            sb2.append(i);
                            sb2.append(" but found ");
                            sb2.append(i12);
                            Log.w("GooglePlayServicesUtil", sb2.toString());
                            i11 = 2;
                        } else {
                            ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                            if (applicationInfo == null) {
                                try {
                                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                } catch (PackageManager.NameNotFoundException e10) {
                                    Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e10);
                                    i11 = 1;
                                    if (i11 != 18) {
                                    }
                                    if (z3) {
                                    }
                                }
                            }
                            i11 = !applicationInfo.enabled ? 3 : 0;
                        }
                    } else {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                    }
                } else {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
                }
                if (i11 != 18) {
                    z3 = true;
                } else if (i11 == 1) {
                    z3 = h.a(context);
                }
                if (z3) {
                    return i11;
                }
                return 18;
            }
        }
        objArr = false;
        w.b(i < 0);
        String packageName2 = context.getPackageName();
        PackageManager packageManager2 = context.getPackageManager();
        int i112 = 9;
        if (objArr == true) {
        }
        PackageInfo packageInfo22 = packageManager2.getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT < 28 ? 134217792 : 64);
        synchronized (i.class) {
        }
    }
}
