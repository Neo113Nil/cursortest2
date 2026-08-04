package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
public final class AFg1sSDK {
    public static final AFa1vSDK AFa1vSDK = new AFa1vSDK(null);
    private static final long getRevenue = TimeUnit.HOURS.toSeconds(24);
    private final AFd1qSDK AFAdRevenueData;
    private final AFg1vSDK getCurrencyIso4217Code;
    private final f.a getMediationNetwork;
    private final f.a getMonetizationNetwork;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFg1sSDK$2, reason: invalid class name */
    @Metadata
    public static final class AnonymousClass2 extends m.d implements Function0<Boolean> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFg1sSDK.this.AFAdRevenueData.getRevenue("com.appsflyer.rc.sandbox")));
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFg1sSDK$5, reason: invalid class name */
    @Metadata
    public static final class AnonymousClass5 extends m.d implements Function0<Boolean> {
        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFg1sSDK.this.AFAdRevenueData.getRevenue("com.appsflyer.rc.staging")));
        }
    }

    @Metadata
    public static final class AFa1vSDK {
        private AFa1vSDK() {
        }

        public /* synthetic */ AFa1vSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AFg1sSDK(AFd1qSDK aFd1qSDK, AFg1vSDK aFg1vSDK) {
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
        Intrinsics.checkNotNullParameter(aFg1vSDK, "");
        this.AFAdRevenueData = aFd1qSDK;
        this.getCurrencyIso4217Code = aFg1vSDK;
        this.getMediationNetwork = f.b.a(new AnonymousClass2());
        this.getMonetizationNetwork = f.b.a(new AnonymousClass5());
    }

    public final long AFAdRevenueData() {
        Object objC;
        String revenue = this.AFAdRevenueData.getRevenue("com.appsflyer.rc.cache.max-age-fallback");
        if (revenue == null) {
            return getRevenue;
        }
        try {
            f.d dVar = f.f.f121a;
            objC = Long.valueOf(Long.parseLong(revenue));
        } catch (Throwable th) {
            f.d dVar2 = f.f.f121a;
            objC = a.c.c(th);
        }
        Throwable thA = f.f.a(objC);
        if (thA != null) {
            AFLogger.afErrorLog("Can't read maxAgeFallback from Manifest: " + thA.getMessage(), thA);
            objC = Long.valueOf(getRevenue);
        }
        return ((Number) objC).longValue();
    }

    public final boolean getCurrencyIso4217Code() {
        return ((Boolean) ((f.g) this.getMediationNetwork).a()).booleanValue();
    }

    public final boolean getMediationNetwork() {
        return ((Boolean) ((f.g) this.getMonetizationNetwork).a()).booleanValue();
    }

    public final boolean getRevenue() {
        AFi1uSDK aFi1uSDK;
        AFi1vSDK aFi1vSDK = this.getCurrencyIso4217Code.getRevenue;
        if (aFi1vSDK == null) {
            AFh1uSDK.i$default(AFLogger.INSTANCE, AFh1vSDK.REMOTE_CONTROL, "active config is missing - fetching from CDN", false, 4, null);
            return true;
        }
        AFh1cSDK aFh1cSDK = aFi1vSDK.getRevenue;
        boolean currencyIso4217Code = (aFh1cSDK == null || (aFi1uSDK = aFh1cSDK.getCurrencyIso4217Code) == null) ? false : aFi1uSDK.getCurrencyIso4217Code();
        long jCurrentTimeMillis = System.currentTimeMillis();
        AFg1vSDK aFg1vSDK = this.getCurrencyIso4217Code;
        return currencyIso4217Code || jCurrentTimeMillis - aFg1vSDK.getCurrencyIso4217Code > TimeUnit.SECONDS.toMillis(aFg1vSDK.getMonetizationNetwork);
    }
}
