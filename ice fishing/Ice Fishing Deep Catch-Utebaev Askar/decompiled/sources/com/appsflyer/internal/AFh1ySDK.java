package com.appsflyer.internal;

import android.util.Log;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata
public final class AFh1ySDK extends AFh1uSDK {
    public static final AFa1ySDK AFa1ySDK = new AFa1ySDK(null);

    public /* synthetic */ class AFa1vSDK {
        public static final /* synthetic */ int[] getMediationNetwork;

        static {
            int[] iArr = new int[AFLogger.LogLevel.values().length];
            try {
                iArr[AFLogger.LogLevel.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFLogger.LogLevel.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFLogger.LogLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AFLogger.LogLevel.VERBOSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AFLogger.LogLevel.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AFLogger.LogLevel.NONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            getMediationNetwork = iArr;
        }
    }

    @Metadata
    public static final class AFa1ySDK {
        private AFa1ySDK() {
        }

        public /* synthetic */ AFa1ySDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static boolean AFAdRevenueData(AFLogger.LogLevel logLevel) {
        return logLevel.getLevel() <= AppsFlyerProperties.getInstance().getLogLevel();
    }

    private final void getRevenue(AFLogger.LogLevel logLevel, AFh1vSDK aFh1vSDK, String str, Throwable th) {
        if (AFAdRevenueData(logLevel)) {
            String revenue = getRevenue(str, aFh1vSDK);
            int i2 = AFa1vSDK.getMediationNetwork[logLevel.ordinal()];
            if (i2 == 1) {
                Log.d("AppsFlyer_6.15.2", revenue);
                return;
            }
            if (i2 == 2) {
                Log.i("AppsFlyer_6.15.2", revenue);
                return;
            }
            if (i2 == 3) {
                Log.w("AppsFlyer_6.15.2", revenue);
            } else if (i2 == 4) {
                Log.v("AppsFlyer_6.15.2", revenue);
            } else {
                if (i2 != 5) {
                    return;
                }
                Log.e("AppsFlyer_6.15.2", revenue, th);
            }
        }
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void d(AFh1vSDK aFh1vSDK, String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        getRevenue(AFLogger.LogLevel.DEBUG, aFh1vSDK, str, null);
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void e(AFh1vSDK aFh1vSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        if (z2) {
            getRevenue(AFLogger.LogLevel.ERROR, aFh1vSDK, str, th);
        } else if (z) {
            getRevenue(AFLogger.LogLevel.DEBUG, aFh1vSDK, str, null);
        }
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void force(AFh1vSDK aFh1vSDK, String str) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (AppsFlyerProperties.getInstance().isLogsDisabledCompletely()) {
            return;
        }
        Log.d("AppsFlyer_6.15.2", withTag$SDK_prodRelease(str, aFh1vSDK));
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final boolean getShouldExtendMsg() {
        return AFLogger.LogLevel.VERBOSE.getLevel() <= AppsFlyerProperties.getInstance().getLogLevel();
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void i(AFh1vSDK aFh1vSDK, String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        getRevenue(AFLogger.LogLevel.INFO, aFh1vSDK, str, null);
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void v(AFh1vSDK aFh1vSDK, String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        getRevenue(AFLogger.LogLevel.VERBOSE, aFh1vSDK, str, null);
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void w(AFh1vSDK aFh1vSDK, String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        getRevenue(AFLogger.LogLevel.WARNING, aFh1vSDK, str, null);
    }
}
