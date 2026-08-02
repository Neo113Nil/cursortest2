package com.google.android.gms.common;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.os.BundleKt;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.concurrent.atomic.AtomicBoolean;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public class GoogleApiAvailabilityLight {
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE;
    public static final GoogleApiAvailabilityLight zza;

    static {
        AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.sCanceledAvailabilityNotification;
        GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;
        zza = new GoogleApiAvailabilityLight();
    }

    public static int getApkVersion(Context context) {
        AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.sCanceledAvailabilityNotification;
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    public Intent getErrorResolutionIntent(Context context, int i, String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && BundleKt.isWearableWithoutPlayStore(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(GOOGLE_PLAY_SERVICES_VERSION_CODE);
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
                sb.append(Wrappers.packageManager(context).getPackageInfo(0, context.getPackageName()).versionCode);
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
        intent3.addFlags(PKIFailureInfo.signerNotTrusted);
        return intent3;
    }

    public int isGooglePlayServicesAvailable(Context context, int i) {
        int isGooglePlayServicesAvailable = GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context, i);
        if (isGooglePlayServicesAvailable != 18 ? isGooglePlayServicesAvailable == 1 ? GooglePlayServicesUtilLight.zza(context) : false : true) {
            return 18;
        }
        return isGooglePlayServicesAvailable;
    }
}
