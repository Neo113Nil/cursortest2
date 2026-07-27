package kotlin.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.catchingfish.fishcatcherpro.R;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class CatchingFishFABKtor {
    public static final int CatchingFishParcelableFAB;
    public static final CatchingFishFABKtor CatchingFishSnackbar;

    static {
        AtomicBoolean atomicBoolean = CatchingFishFluxParcelable.CatchingFishParcelableFAB;
        CatchingFishParcelableFAB = 12451000;
        CatchingFishSnackbar = new CatchingFishFABKtor();
    }

    public Intent CatchingFishParcelableFAB(int i, Context context, String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && CatchingFishFirebaseDagger.CatchingFishEspressoMockk(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(CatchingFishParcelableFAB);
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
                CatchingFishFluxDataStore CatchingFishParcelableFAB2 = CatchingFishHiltSnackbarMVP.CatchingFishParcelableFAB(context);
                sb.append(CatchingFishParcelableFAB2.CatchingFishParcelableFAB.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
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

    /* JADX WARN: Removed duplicated region for block: B:101:0x0228 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0229 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int CatchingFishSnackbar(Context context, int i) {
        boolean z;
        PackageInfo packageInfo;
        Bundle bundle;
        AtomicBoolean atomicBoolean = CatchingFishFluxParcelable.CatchingFishParcelableFAB;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
        }
        boolean z2 = true;
        if (!"com.google.android.gms".equals(context.getPackageName()) && !CatchingFishFluxParcelable.CatchingFishSnackbar.get()) {
            synchronized (CatchingFishGsonCardView.CatchingFishNavigation) {
                try {
                    if (!CatchingFishGsonCardView.CatchingFish) {
                        CatchingFishGsonCardView.CatchingFish = true;
                        try {
                            bundle = CatchingFishHiltSnackbarMVP.CatchingFishParcelableFAB(context).CatchingFishParcelableFAB.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            CatchingFishGsonCardView.CatchingFishJetpackCompose = bundle.getInt("com.google.android.gms.version");
                        }
                    }
                } finally {
                }
            }
            int i2 = CatchingFishGsonCardView.CatchingFishJetpackCompose;
            if (i2 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i2 != 12451000) {
                int i3 = CatchingFishParcelableFAB;
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 104 + String.valueOf(i2).length() + 194);
                sb.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                sb.append(i3);
                sb.append(" but found ");
                sb.append(i2);
                sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new GooglePlayServicesIncorrectManifestValueException(sb.toString());
            }
        }
        int i4 = 0;
        if (!CatchingFishFirebaseDagger.CatchingFishEspressoMockk(context)) {
            if (CatchingFishFirebaseDagger.CatchingFish == null) {
                CatchingFishFirebaseDagger.CatchingFish = Boolean.valueOf(CatchingFishHiltMVPToast.CatchingFishSpannableWidget() ? context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") : context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
            }
            if (!CatchingFishFirebaseDagger.CatchingFish.booleanValue()) {
                z = true;
                if (i >= 0) {
                    throw new IllegalArgumentException();
                }
                String packageName = context.getPackageName();
                PackageManager packageManager = context.getPackageManager();
                int i5 = 9;
                if (z) {
                    try {
                        packageInfo = packageManager.getPackageInfo("com.android.vending", Build.VERSION.SDK_INT >= 28 ? 134225984 : 8256);
                    } catch (PackageManager.NameNotFoundException unused3) {
                        String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing.");
                    }
                } else {
                    packageInfo = null;
                }
                try {
                    PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                    synchronized (CatchingFishMoshiFluxMoshi.class) {
                        if (CatchingFishMoshiFluxMoshi.CatchingFishDaggerWebsocket == null) {
                            CatchingFishGlidePicassoFAB catchingFishGlidePicassoFAB = CatchingFishLiveDataMVVM.CatchingFishParcelableFAB;
                            synchronized (CatchingFishLiveDataMVVM.class) {
                                try {
                                    if (CatchingFishLiveDataMVVM.CatchingFishCoroutine == null) {
                                        CatchingFishLiveDataMVVM.CatchingFishCoroutine = context.getApplicationContext();
                                    }
                                } finally {
                                }
                            }
                            CatchingFishMoshiFluxMoshi catchingFishMoshiFluxMoshi = new CatchingFishMoshiFluxMoshi(i4);
                            context.getApplicationContext();
                            CatchingFishMoshiFluxMoshi.CatchingFishDaggerWebsocket = catchingFishMoshiFluxMoshi;
                        }
                    }
                    if (CatchingFishMoshiFluxMoshi.CatchingFishOkHttp(packageInfo2)) {
                        if (z) {
                            CatchingFishToastHiltBundle.CatchingFishAnimationMockk(packageInfo);
                            if (!CatchingFishMoshiFluxMoshi.CatchingFishOkHttp(packageInfo)) {
                                String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid.");
                            }
                        }
                        if (!z || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                            int i6 = packageInfo2.versionCode;
                            if ((i6 == -1 ? -1 : i6 / 1000) < (i != -1 ? i / 1000 : -1)) {
                                new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i).length() + 11 + String.valueOf(i6).length());
                                i5 = 2;
                            } else {
                                ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                                if (applicationInfo == null) {
                                    try {
                                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                    } catch (PackageManager.NameNotFoundException unused4) {
                                        String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info.");
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
                            String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services.");
                        }
                    } else {
                        String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid.");
                    }
                } catch (PackageManager.NameNotFoundException unused5) {
                    String.valueOf(packageName).concat(" requires Google Play services, but they are missing.");
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
                        } catch (PackageManager.NameNotFoundException | Exception unused6) {
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
        z = false;
        if (i >= 0) {
        }
    }
}
