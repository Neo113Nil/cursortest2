package androidx.versionedparcelable;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import com.icecatchpuzzle.puzzleicecatch.R;
import java.util.Iterator;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class GoldenVectorSyntaxTokenDmY0Zrl65ST9l6Ogow21684126180116 {
    public static final int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    static {
        int i = FrostBridgeCoordinatorTokenFv2A1GqQiEVjnGtbUX29181017692665.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
        ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = 12451000;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(Context context, int i) {
        boolean z;
        PackageInfo packageInfo;
        Bundle bundle;
        int i2 = FrostBridgeCoordinatorTokenFv2A1GqQiEVjnGtbUX29181017692665.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
        }
        boolean z2 = true;
        if (!"com.google.android.gms".equals(context.getPackageName()) && !FrostBridgeCoordinatorTokenFv2A1GqQiEVjnGtbUX29181017692665.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.get()) {
            synchronized (ObsidianEngineTranspilerWorkerEHoOsrsySnsoA9iWxm35468870095129.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834) {
                try {
                    if (!ObsidianEngineTranspilerWorkerEHoOsrsySnsoA9iWxm35468870095129.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170) {
                        ObsidianEngineTranspilerWorkerEHoOsrsySnsoA9iWxm35468870095129.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170 = true;
                        try {
                            bundle = CrimsonRouteExecutorAttributeMomQaj3H5PMvlUqGgR26107891851468.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(context).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            ObsidianEngineTranspilerWorkerEHoOsrsySnsoA9iWxm35468870095129.EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111 = bundle.getInt("com.google.android.gms.version");
                        }
                    }
                } finally {
                }
            }
            int i3 = ObsidianEngineTranspilerWorkerEHoOsrsySnsoA9iWxm35468870095129.EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111;
            if (i3 == 0) {
                throw new GooglePlayServicesMissingManifestValueException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            }
            if (i3 != 12451000) {
                throw new GooglePlayServicesIncorrectManifestValueException("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected " + ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 + " but found " + i3 + ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            }
        }
        int i4 = 0;
        if (!DeltaSignalNormalizationJITQ7KMe5q3hsuA9VOtI478044089954652.GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178(context)) {
            if (DeltaSignalNormalizationJITQ7KMe5q3hsuA9VOtI478044089954652.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571 == null) {
                DeltaSignalNormalizationJITQ7KMe5q3hsuA9VOtI478044089954652.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571 = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
            }
            if (!DeltaSignalNormalizationJITQ7KMe5q3hsuA9VOtI478044089954652.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571.booleanValue()) {
                z = true;
                if (i >= 0) {
                    throw new IllegalArgumentException();
                }
                String packageName = context.getPackageName();
                PackageManager packageManager = context.getPackageManager();
                int i5 = 9;
                if (z) {
                    try {
                        packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
                    } catch (PackageManager.NameNotFoundException unused3) {
                        String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing.");
                    }
                } else {
                    packageInfo = null;
                }
                try {
                    PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
                    synchronized (YellowLoopObserverMacroJFTEe2n8YRXorwgZDZ47084730441310.class) {
                        if (YellowLoopObserverMacroJFTEe2n8YRXorwgZDZ47084730441310.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 == null) {
                            XenoGridProtocolStreamYMzeRaH9kWdvLVfDaS50475074964073 xenoGridProtocolStreamYMzeRaH9kWdvLVfDaS50475074964073 = HeliosRuntimeBitwiseJSONSdpmfFeWx7DadMRk2R14536754080360.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                            synchronized (HeliosRuntimeBitwiseJSONSdpmfFeWx7DadMRk2R14536754080360.class) {
                                try {
                                    if (HeliosRuntimeBitwiseJSONSdpmfFeWx7DadMRk2R14536754080360.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 == null) {
                                        HeliosRuntimeBitwiseJSONSdpmfFeWx7DadMRk2R14536754080360.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = context.getApplicationContext();
                                    }
                                } finally {
                                }
                            }
                            YellowLoopObserverMacroJFTEe2n8YRXorwgZDZ47084730441310 yellowLoopObserverMacroJFTEe2n8YRXorwgZDZ47084730441310 = new YellowLoopObserverMacroJFTEe2n8YRXorwgZDZ47084730441310(i4);
                            context.getApplicationContext();
                            YellowLoopObserverMacroJFTEe2n8YRXorwgZDZ47084730441310.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = yellowLoopObserverMacroJFTEe2n8YRXorwgZDZ47084730441310;
                        }
                    }
                    if (YellowLoopObserverMacroJFTEe2n8YRXorwgZDZ47084730441310.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(packageInfo2)) {
                        if (z) {
                            YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036(packageInfo);
                            if (!YellowLoopObserverMacroJFTEe2n8YRXorwgZDZ47084730441310.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(packageInfo)) {
                                String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid.");
                            }
                        }
                        if (!z || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                            int i6 = packageInfo2.versionCode;
                            if ((i6 == -1 ? -1 : i6 / 1000) < (i != -1 ? i / 1000 : -1)) {
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

    public Intent ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(int i, Context context, String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && DeltaSignalNormalizationJITQ7KMe5q3hsuA9VOtI478044089954652.GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
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
                CrimsonRouteOverloadingParserEf1cTBqIw4ptdNpbZO76582539155700 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002 = CrimsonRouteExecutorAttributeMomQaj3H5PMvlUqGgR26107891851468.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(context);
                sb.append(ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
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
}
