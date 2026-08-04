package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:31)
    */
/* JADX INFO: loaded from: classes.dex */
public final class AFd1sSDK implements AFd1rSDK {
    private final f.a AFAdRevenueData;
    private final AFd1mSDK<SharedPreferences> getMonetizationNetwork;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1sSDK$5, reason: invalid class name */
    @Metadata
    public static final class AnonymousClass5 extends m.d implements Function0<SharedPreferences> {
        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: t_, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            return (SharedPreferences) AFd1sSDK.this.getMonetizationNetwork.getCurrencyIso4217Code.invoke();
        }
    }

    public AFd1sSDK(AFd1mSDK<SharedPreferences> aFd1mSDK) {
        Intrinsics.checkNotNullParameter(aFd1mSDK, "");
        this.getMonetizationNetwork = aFd1mSDK;
        this.AFAdRevenueData = f.b.a(new AnonymousClass5());
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    public final void AFAdRevenueData(String str) {
        ((SharedPreferences) ((f.g) this.AFAdRevenueData).a()).edit().remove(str).apply();
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    public final int getMediationNetwork(String str, int i2) {
        try {
            return ((SharedPreferences) ((f.g) this.AFAdRevenueData).a()).getInt(str, i2);
        } catch (ClassCastException e2) {
            AFh1uSDK.e$default(AFLogger.INSTANCE, AFh1vSDK.PREFERENCES, "Unexpected data type found for key " + str, e2, false, false, false, false, 120, null);
            return i2;
        }
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    public final void getRevenue(String str, boolean z) {
        ((SharedPreferences) ((f.g) this.AFAdRevenueData).a()).edit().putBoolean(str, z).apply();
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    public final void AFAdRevenueData(String str, int i2) {
        ((SharedPreferences) ((f.g) this.AFAdRevenueData).a()).edit().putInt(str, i2).apply();
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    public final long getMediationNetwork(String str, long j2) {
        try {
            return ((SharedPreferences) ((f.g) this.AFAdRevenueData).a()).getLong(str, j2);
        } catch (ClassCastException e2) {
            AFh1uSDK.e$default(AFLogger.INSTANCE, AFh1vSDK.PREFERENCES, "Unexpected data type found for key " + str, e2, false, false, false, false, 120, null);
            return j2;
        }
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    public final String getMonetizationNetwork(String str, String str2) {
        try {
            return ((SharedPreferences) ((f.g) this.AFAdRevenueData).a()).getString(str, str2);
        } catch (ClassCastException e2) {
            AFh1uSDK.e$default(AFLogger.INSTANCE, AFh1vSDK.PREFERENCES, "Unexpected data type found for key " + str, e2, false, false, false, false, 120, null);
            return str2;
        }
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    public final void AFAdRevenueData(String str, String str2) {
        ((SharedPreferences) ((f.g) this.AFAdRevenueData).a()).edit().putString(str, str2).apply();
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    public final boolean getMediationNetwork(String str) {
        try {
            return ((SharedPreferences) ((f.g) this.AFAdRevenueData).a()).getBoolean(str, false);
        } catch (ClassCastException e2) {
            AFh1uSDK.e$default(AFLogger.INSTANCE, AFh1vSDK.PREFERENCES, "Unexpected data type found for key " + str, e2, false, false, false, false, 120, null);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    public final void getMonetizationNetwork(String str, long j2) {
        ((SharedPreferences) ((f.g) this.AFAdRevenueData).a()).edit().putLong(str, j2).apply();
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    public final boolean getMonetizationNetwork(String str) {
        return ((SharedPreferences) ((f.g) this.AFAdRevenueData).a()).contains(str);
    }
}
