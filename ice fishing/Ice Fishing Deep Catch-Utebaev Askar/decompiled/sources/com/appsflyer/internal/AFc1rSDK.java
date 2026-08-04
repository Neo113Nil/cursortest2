package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AFKeystoreWrapper;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.security.KeyStoreException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class AFc1rSDK {
    public static final AFc1rSDK INSTANCE = new AFc1rSDK();

    private AFc1rSDK() {
    }

    public static String getCurrencyIso4217Code() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerId");
    }

    public static String getMonetizationNetwork() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerRICounter");
    }

    public static final void getMonetizationNetwork(AFd1nSDK aFd1nSDK, AFd1rSDK aFd1rSDK) {
        int i2;
        Intrinsics.checkNotNullParameter(aFd1nSDK, "");
        Intrinsics.checkNotNullParameter(aFd1rSDK, "");
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        if (AFb1qSDK.getMediationNetwork()) {
            AFLogger.afRDLog("OPPO device found");
            i2 = 23;
        } else {
            i2 = 18;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < i2 || appsFlyerProperties.getBoolean(AppsFlyerProperties.DISABLE_KEYSTORE, true)) {
            AFLogger.afRDLog("OS SDK is=" + i3 + "; no KeyStore usage");
            return;
        }
        AFLogger.afRDLog("OS SDK is=" + i3 + "; use KeyStore");
        AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(aFd1nSDK.AFAdRevenueData);
        if (aFKeystoreWrapper.getRevenue()) {
            String strAFAdRevenueData = aFKeystoreWrapper.AFAdRevenueData();
            synchronized (aFKeystoreWrapper.AFAdRevenueData) {
                aFKeystoreWrapper.getCurrencyIso4217Code++;
                AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(strAFAdRevenueData)));
                try {
                    synchronized (aFKeystoreWrapper.AFAdRevenueData) {
                        aFKeystoreWrapper.getMonetizationNetwork.deleteEntry(strAFAdRevenueData);
                    }
                } catch (KeyStoreException e2) {
                    StringBuilder sb = new StringBuilder("Exception ");
                    sb.append(e2.getMessage());
                    sb.append(" occurred");
                    AFLogger.afErrorLog(sb.toString(), e2);
                }
            }
        } else {
            aFKeystoreWrapper.getRevenue = AFb1iSDK.getCurrencyIso4217Code(aFd1nSDK, aFd1rSDK);
            aFKeystoreWrapper.getCurrencyIso4217Code = 0;
        }
        aFKeystoreWrapper.getCurrencyIso4217Code(aFKeystoreWrapper.AFAdRevenueData());
        appsFlyerProperties.set("KSAppsFlyerId", aFKeystoreWrapper.getMonetizationNetwork());
        appsFlyerProperties.set("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.getMediationNetwork()));
    }
}
