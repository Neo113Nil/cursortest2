package com.appsflyer.internal;

import android.graphics.PointF;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.gamericefishpro.space.ph.l0;
import com.gamericefishpro.space.ph.m0;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

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
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class AFd1wSDK implements AFd1xSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFKeystoreWrapper = 1;
    private static char copy = 10357;
    private static int copydefault = 0;
    private static char equals = 787;
    private static char hashCode = 7956;
    private static char toString = 48673;
    private AFd1zSDK AFAdRevenueData;
    private final com.gamericefishpro.space.oh.h areAllFieldsValid;
    private AFd1xSDK.AFa1vSDK component1;
    private final com.gamericefishpro.space.oh.h component2;
    private final com.gamericefishpro.space.oh.h component3;
    private final String component4;
    private final com.gamericefishpro.space.oh.h getCurrencyIso4217Code;
    private final com.gamericefishpro.space.oh.h getMediationNetwork;
    private final com.gamericefishpro.space.oh.h getMonetizationNetwork;
    private final com.gamericefishpro.space.oh.h getRevenue;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1wSDK$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    @Metadata
    public static final class AnonymousClass1 extends com.gamericefishpro.space.ei.l implements Function0<AFd1ySDK> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final AFd1ySDK invoke() {
            AFc1hSDK aFc1hSDKAFInAppEventParameterName = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).AFInAppEventParameterName();
            Intrinsics.checkNotNullExpressionValue(aFc1hSDKAFInAppEventParameterName, "");
            return new AFd1ySDK(aFc1hSDKAFInAppEventParameterName);
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1wSDK$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    @Metadata
    public static final class AnonymousClass2 extends com.gamericefishpro.space.ei.l implements Function0<AFc1qSDK> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final AFc1qSDK invoke() {
            AFc1qSDK aFc1qSDKComponent4 = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).component4();
            Intrinsics.checkNotNullExpressionValue(aFc1qSDKComponent4, "");
            return aFc1qSDKComponent4;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1wSDK$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    @Metadata
    public static final class AnonymousClass3 extends com.gamericefishpro.space.ei.l implements Function0<AFc1oSDK> {
        public AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final AFc1oSDK invoke() {
            AFc1oSDK aFc1oSDKAFAdRevenueData = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).AFAdRevenueData();
            Intrinsics.checkNotNullExpressionValue(aFc1oSDKAFAdRevenueData, "");
            return aFc1oSDKAFAdRevenueData;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1wSDK$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    @Metadata
    public static final class AnonymousClass4 extends com.gamericefishpro.space.ei.l implements Function0<AFf1kSDK> {
        public AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final AFf1kSDK invoke() {
            AFf1kSDK aFf1kSDKComponent1 = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).component1();
            Intrinsics.checkNotNullExpressionValue(aFf1kSDKComponent1, "");
            return aFf1kSDKComponent1;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1wSDK$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    @Metadata
    public static final class AnonymousClass5 extends com.gamericefishpro.space.ei.l implements Function0<ExecutorService> {
        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            ExecutorService monetizationNetwork = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).getMonetizationNetwork();
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
            return monetizationNetwork;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1wSDK$6, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    @Metadata
    public static final class AnonymousClass6 extends com.gamericefishpro.space.ei.l implements Function0<AFf1eSDK> {
        public AnonymousClass6() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final AFf1eSDK invoke() {
            AFf1eSDK aFf1eSDKAFInAppEventType = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).AFInAppEventType();
            Intrinsics.checkNotNullExpressionValue(aFf1eSDKAFInAppEventType, "");
            return aFf1eSDKAFInAppEventType;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1wSDK$7, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    @Metadata
    public static final class AnonymousClass7 extends com.gamericefishpro.space.ei.l implements Function0<AFd1vSDK> {
        public AnonymousClass7() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final AFd1vSDK invoke() {
            return new AFd1vSDK(AFd1wSDK.this.getRevenue());
        }
    }

    public AFd1wSDK(AFd1zSDK aFd1zSDK) {
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        this.AFAdRevenueData = aFd1zSDK;
        this.getRevenue = com.gamericefishpro.space.oh.i.b(new AnonymousClass4());
        this.getMediationNetwork = com.gamericefishpro.space.oh.i.b(new AnonymousClass3());
        this.getMonetizationNetwork = com.gamericefishpro.space.oh.i.b(new AnonymousClass2());
        this.getCurrencyIso4217Code = com.gamericefishpro.space.oh.i.b(new AnonymousClass6());
        this.component2 = com.gamericefishpro.space.oh.i.b(new AnonymousClass5());
        this.component4 = "6.17.5";
        this.component3 = com.gamericefishpro.space.oh.i.b(new AnonymousClass1());
        this.areAllFieldsValid = com.gamericefishpro.space.oh.i.b(new AnonymousClass7());
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFi1zSDK aFi1zSDK;
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        AFKeystoreWrapper = (copydefault + 77) % 128;
        AFi1vSDK aFi1vSDK = aFd1wSDK.getCurrencyIso4217Code().AFAdRevenueData.getCurrencyIso4217Code;
        if (aFi1vSDK == null || (aFi1zSDK = aFi1vSDK.getMonetizationNetwork) == null) {
            return null;
        }
        int i = AFKeystoreWrapper + 109;
        copydefault = i % 128;
        if (i % 2 == 0) {
            return aFi1zSDK.getCurrencyIso4217Code;
        }
        AFh1aSDK aFh1aSDK = aFi1zSDK.getCurrencyIso4217Code;
        throw null;
    }

    private final ExecutorService areAllFieldsValid() {
        copydefault = (AFKeystoreWrapper + 53) % 128;
        ExecutorService executorService = (ExecutorService) this.component2.getValue();
        AFKeystoreWrapper = (copydefault + 119) % 128;
        return executorService;
    }

    private final AFf1eSDK component1() {
        AFKeystoreWrapper = (copydefault + 109) % 128;
        AFf1eSDK aFf1eSDK = (AFf1eSDK) this.getCurrencyIso4217Code.getValue();
        copydefault = (AFKeystoreWrapper + 117) % 128;
        return aFf1eSDK;
    }

    private final AFc1qSDK component2() {
        return (AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this));
    }

    private AFd1uSDK component3() {
        copydefault = (AFKeystoreWrapper + 75) % 128;
        AFd1uSDK aFd1uSDK = (AFd1uSDK) this.areAllFieldsValid.getValue();
        int i = copydefault + 77;
        AFKeystoreWrapper = i % 128;
        if (i % 2 == 0) {
            int i2 = 15 / 0;
        }
        return aFd1uSDK;
    }

    private final AFh1aSDK component4() {
        return (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if (getMediationNetwork(r0) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        com.appsflyer.internal.AFd1wSDK.copydefault = (com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper + 121) % 128;
        r1 = component1().getMediationNetwork();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        r0 = new org.json.JSONObject(getMonetizationNetwork(getRevenue(r0), getRevenue().getRevenue())).toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        getMediationNetwork(new java.lang.Object[]{r10, r0, r1}, -1856843688, 1856843689, java.lang.System.identityHashCode(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0081, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0082, code lost:
    
        com.appsflyer.internal.AFh1ySDK.v$default(com.appsflyer.AFLogger.INSTANCE, com.appsflyer.internal.AFg1cSDK.AFKeystoreWrapper, "skipping", false, 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008f, code lost:
    
        r0 = com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper + 3;
        com.appsflyer.internal.AFd1wSDK.copydefault = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0099, code lost:
    
        if ((r0 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009b, code lost:
    
        r0 = 18 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r0 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void copy() {
        AFh1aSDK aFh1aSDK;
        int i = copydefault + 15;
        AFKeystoreWrapper = i % 128;
        if (i % 2 == 0) {
            aFh1aSDK = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
            int i2 = 33 / 0;
        } else {
            aFh1aSDK = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x0140 A[Catch: all -> 0x0022, PHI: r6
      0x0140: PHI (r6v9 java.lang.String) = (r6v8 java.lang.String), (r6v11 java.lang.String) binds: [B:69:0x013e, B:64:0x0137] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0001, B:5:0x001f, B:9:0x0027, B:11:0x003b, B:14:0x0063, B:16:0x0074, B:18:0x007b, B:20:0x008e, B:22:0x0092, B:24:0x00a4, B:26:0x00ae, B:28:0x00b2, B:30:0x00c0, B:32:0x00c6, B:34:0x00d4, B:36:0x00d8, B:38:0x00de, B:40:0x00e9, B:45:0x00f3, B:47:0x00fe, B:49:0x0102, B:51:0x0108, B:53:0x010e, B:55:0x0111, B:57:0x0117, B:59:0x0127, B:61:0x0132, B:70:0x0140, B:72:0x0146, B:74:0x0156, B:76:0x015a, B:78:0x0165, B:79:0x016a, B:83:0x0171, B:88:0x0191, B:93:0x01f8, B:95:0x01fc, B:97:0x020c, B:98:0x0210, B:90:0x01ab, B:91:0x01c3, B:86:0x0179, B:68:0x013c, B:67:0x013b, B:92:0x01de, B:63:0x0136, B:80:0x016d, B:42:0x00ee), top: B:105:0x0001, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0145  */
    private final synchronized void copydefault() {
        Integer numValueOf;
        Pair<Integer, Integer> monetizationNetwork;
        String str;
        String str2;
        String str3;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        String str4;
        Integer intOrNull;
        String str5;
        Integer intOrNull2;
        String str6;
        try {
            copydefault = (AFKeystoreWrapper + 13) % 128;
            AFh1aSDK aFh1aSDK = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
            if ((aFh1aSDK != null ? aFh1aSDK.getMonetizationNetwork : -1L) < TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
                AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "TTL is already passed", false, 4, null);
                ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
                getRevenue().getCurrencyIso4217Code();
                return;
            }
            AFh1aSDK aFh1aSDK2 = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
            if (aFh1aSDK2 == null || !getMonetizationNetwork(aFh1aSDK2)) {
                ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
                getRevenue().getCurrencyIso4217Code();
            } else {
                AFh1aSDK aFh1aSDK3 = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
                Pair<Integer, Integer> pairAFAdRevenueData = null;
                try {
                    if (aFh1aSDK3 == null || (str3 = aFh1aSDK3.getRevenue) == null) {
                        numValueOf = null;
                    } else {
                        Intrinsics.checkNotNullParameter(str3, "");
                        com.gamericefishpro.space.a8.c cVarB = new Regex("(\\d+).(\\d+).(\\d+).*").b(str3);
                        if (cVarB != null) {
                            MatchGroup matchGroupC = ((com.gamericefishpro.space.mi.d) cVarB.v).c(1);
                            if (matchGroupC == null || (str6 = matchGroupC.a) == null) {
                                iIntValue2 = 0;
                            } else {
                                copydefault = (AFKeystoreWrapper + 109) % 128;
                                Integer intOrNull3 = StringsKt.toIntOrNull(str6);
                                if (intOrNull3 != null) {
                                    iIntValue2 = intOrNull3.intValue();
                                } else {
                                    iIntValue2 = 0;
                                }
                            }
                            int i = iIntValue2 * 1000000;
                            MatchGroup matchGroupC2 = ((com.gamericefishpro.space.mi.d) cVarB.v).c(2);
                            if (matchGroupC2 == null || (str5 = matchGroupC2.a) == null || (intOrNull2 = StringsKt.toIntOrNull(str5)) == null) {
                                iIntValue3 = 0;
                            } else {
                                int i2 = copydefault + 123;
                                AFKeystoreWrapper = i2 % 128;
                                if (i2 % 2 == 0) {
                                    throw null;
                                }
                                iIntValue3 = intOrNull2.intValue();
                            }
                            int i3 = (iIntValue3 * 1000) + i;
                            MatchGroup matchGroupC3 = ((com.gamericefishpro.space.mi.d) cVarB.v).c(3);
                            iIntValue = i3 + ((matchGroupC3 == null || (str4 = matchGroupC3.a) == null || (intOrNull = StringsKt.toIntOrNull(str4)) == null) ? 0 : intOrNull.intValue());
                        } else {
                            iIntValue = -1;
                        }
                        numValueOf = Integer.valueOf(iIntValue);
                    }
                    AFh1aSDK aFh1aSDK4 = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
                    if (aFh1aSDK4 != null) {
                        int i4 = copydefault + 15;
                        AFKeystoreWrapper = i4 % 128;
                        if (i4 % 2 == 0) {
                            str2 = aFh1aSDK4.getRevenue;
                            int i5 = 29 / 0;
                            if (str2 != null) {
                                monetizationNetwork = AFd1rSDK.getMonetizationNetwork(str2);
                            } else {
                                monetizationNetwork = null;
                            }
                        } else {
                            str2 = aFh1aSDK4.getRevenue;
                            if (str2 != null) {
                                monetizationNetwork = AFd1rSDK.getMonetizationNetwork(str2);
                            } else {
                                monetizationNetwork = null;
                            }
                        }
                    } else {
                        monetizationNetwork = null;
                    }
                    AFh1aSDK aFh1aSDK5 = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
                    if (aFh1aSDK5 != null && (str = aFh1aSDK5.getRevenue) != null) {
                        int i6 = AFKeystoreWrapper + 99;
                        copydefault = i6 % 128;
                        if (i6 % 2 != 0) {
                            AFd1rSDK.AFAdRevenueData(str);
                            throw null;
                        }
                        pairAFAdRevenueData = AFd1rSDK.AFAdRevenueData(str);
                    }
                    if ((numValueOf == null || numValueOf.intValue() != -1) && monetizationNetwork == null) {
                        AFKeystoreWrapper = (copydefault + 59) % 128;
                        getRevenue().getMonetizationNetwork(this.component4);
                    } else if (monetizationNetwork != null) {
                        getRevenue().getCurrencyIso4217Code(((Number) monetizationNetwork.d).intValue(), ((Number) monetizationNetwork.e).intValue());
                    } else if (pairAFAdRevenueData != null) {
                        getRevenue().getCurrencyIso4217Code(((Number) pairAFAdRevenueData.d).intValue(), ((Number) pairAFAdRevenueData.e).intValue());
                    } else {
                        ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
                        getRevenue().getCurrencyIso4217Code();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            AFd1xSDK.AFa1vSDK aFa1vSDK = this.component1;
            if (aFa1vSDK != null) {
                AFh1aSDK aFh1aSDK6 = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
                aFa1vSDK.onConfigurationChanged(aFh1aSDK6 != null ? AFAdRevenueData(aFh1aSDK6) : false);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void equals() {
        boolean zAFAdRevenueData;
        try {
            copydefault = (AFKeystoreWrapper + 119) % 128;
            AFh1aSDK aFh1aSDK = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
            if (aFh1aSDK != null) {
                if (aFh1aSDK.getMediationNetwork == -1) {
                    ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
                } else if (((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).getMonetizationNetwork("af_send_exc_to_server_window", -1L) == -1) {
                    AFKeystoreWrapper = (copydefault + 21) % 128;
                    getCurrencyIso4217Code(aFh1aSDK);
                }
                zAFAdRevenueData = AFAdRevenueData(aFh1aSDK);
            } else {
                zAFAdRevenueData = false;
            }
            AFd1xSDK.AFa1vSDK aFa1vSDK = this.component1;
            if (aFa1vSDK != null) {
                aFa1vSDK.onConfigurationChanged(zAFAdRevenueData);
                int i = AFKeystoreWrapper + 111;
                copydefault = i % 128;
                if (i % 2 == 0) {
                } else {
                    throw null;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrencyIso4217Code(AFd1wSDK aFd1wSDK, Throwable th, String str) {
        Intrinsics.checkNotNullParameter(aFd1wSDK, "");
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        AFh1aSDK aFh1aSDK = (AFh1aSDK) getMediationNetwork(new Object[]{aFd1wSDK}, -2108652204, 2108652208, System.identityHashCode(aFd1wSDK));
        if (aFh1aSDK != null) {
            int i = copydefault + 99;
            AFKeystoreWrapper = i % 128;
            if (i % 2 != 0 ? !aFd1wSDK.AFAdRevenueData(aFh1aSDK) : aFd1wSDK.AFAdRevenueData(aFh1aSDK)) {
                AFKeystoreWrapper = (copydefault + 49) % 128;
            } else {
                AFKeystoreWrapper = (copydefault + 91) % 128;
                aFd1wSDK.getRevenue().AFAdRevenueData(th, str);
            }
        }
    }

    public static /* synthetic */ Object getMediationNetwork(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~((~i) | (~i2));
        int i5 = ~i3;
        int i6 = ((i | i2 | i3) * 220) + (((~(i5 | i2)) | i) * (-440)) + ((i4 | (~(i5 | i | i2))) * 220) + (i2 * (-219)) + (i * 221);
        if (i6 == 1) {
            return getCurrencyIso4217Code(objArr);
        }
        if (i6 == 2) {
            return getRevenue(objArr);
        }
        if (i6 != 3) {
            return i6 != 4 ? getMonetizationNetwork(objArr) : AFAdRevenueData(objArr);
        }
        return getMediationNetwork(objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFd1wSDK aFd1wSDK) {
        int i = copydefault + 13;
        AFKeystoreWrapper = i % 128;
        if (i % 2 != 0) {
            Intrinsics.checkNotNullParameter(aFd1wSDK, "");
            aFd1wSDK.copydefault();
        } else {
            Intrinsics.checkNotNullParameter(aFd1wSDK, "");
            aFd1wSDK.copydefault();
            throw null;
        }
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        int i = copydefault + 25;
        AFKeystoreWrapper = i % 128;
        int i2 = i % 2;
        AFc1qSDK aFc1qSDK = (AFc1qSDK) aFd1wSDK.getMonetizationNetwork.getValue();
        if (i2 == 0) {
            int i3 = 60 / 0;
        }
        AFKeystoreWrapper = (copydefault + 51) % 128;
        return aFc1qSDK;
    }

    private static void a(String str, int i, Object[] objArr) {
        char[] charArray;
        if (str != null) {
            $11 = ($10 + 51) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        AFk1qSDK aFk1qSDK = new AFk1qSDK();
        char[] cArr2 = new char[cArr.length];
        aFk1qSDK.getRevenue = 0;
        char[] cArr3 = new char[2];
        while (true) {
            int i2 = aFk1qSDK.getRevenue;
            if (i2 >= cArr.length) {
                break;
            }
            cArr3[0] = cArr[i2];
            cArr3[1] = cArr[i2 + 1];
            int i3 = 58224;
            for (int i4 = 0; i4 < 16; i4++) {
                char c = cArr3[1];
                char c2 = cArr3[0];
                char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + ((char) (((long) toString) ^ (-1199070254561146252L))))) ^ ((c2 >>> 5) + ((char) (((long) copy) ^ (-1199070254561146252L))))));
                cArr3[1] = c3;
                cArr3[0] = (char) (c2 - (((c3 >>> 5) + ((char) (((long) hashCode) ^ (-1199070254561146252L)))) ^ ((c3 + i3) ^ ((c3 << 4) + ((char) (((long) equals) ^ (-1199070254561146252L)))))));
                i3 -= 40503;
            }
            int i5 = aFk1qSDK.getRevenue;
            cArr2[i5] = cArr3[0];
            cArr2[i5 + 1] = cArr3[1];
            aFk1qSDK.getRevenue = i5 + 2;
        }
        String str2 = new String(cArr2, 0, i);
        int i6 = $10 + 97;
        $11 = i6 % 128;
        if (i6 % 2 != 0) {
            objArr[0] = str2;
        } else {
            int i7 = 2 / 0;
            objArr[0] = str2;
        }
    }

    private final AFc1oSDK getMediationNetwork() {
        copydefault = (AFKeystoreWrapper + 9) % 128;
        AFc1oSDK aFc1oSDK = (AFc1oSDK) this.getMediationNetwork.getValue();
        copydefault = (AFKeystoreWrapper + 21) % 128;
        return aFc1oSDK;
    }

    public final AFc1cSDK getRevenue() {
        copydefault = (AFKeystoreWrapper + 93) % 128;
        AFc1cSDK aFc1cSDK = (AFc1cSDK) this.component3.getValue();
        int i = copydefault + 121;
        AFKeystoreWrapper = i % 128;
        if (i % 2 == 0) {
            int i2 = 3 / 0;
        }
        return aFc1cSDK;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        Throwable th = (Throwable) objArr[1];
        String str = (String) objArr[2];
        AFKeystoreWrapper = (copydefault + 49) % 128;
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        aFd1wSDK.areAllFieldsValid().execute(new d(aFd1wSDK, th, str, 1));
        int i = copydefault + 41;
        AFKeystoreWrapper = i % 128;
        if (i % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRevenue(AFd1wSDK aFd1wSDK) {
        int i = AFKeystoreWrapper + 61;
        copydefault = i % 128;
        if (i % 2 == 0) {
            Intrinsics.checkNotNullParameter(aFd1wSDK, "");
            aFd1wSDK.equals();
            copydefault = (AFKeystoreWrapper + 99) % 128;
        } else {
            Intrinsics.checkNotNullParameter(aFd1wSDK, "");
            aFd1wSDK.equals();
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFd1wSDK aFd1wSDK) {
        AFKeystoreWrapper = (copydefault + 83) % 128;
        Intrinsics.checkNotNullParameter(aFd1wSDK, "");
        aFd1wSDK.copy();
        AFKeystoreWrapper = (copydefault + 45) % 128;
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getMonetizationNetwork(AFd1xSDK.AFa1vSDK aFa1vSDK) {
        int i = AFKeystoreWrapper + 31;
        copydefault = i % 128;
        if (i % 2 == 0) {
            this.component1 = aFa1vSDK;
            areAllFieldsValid().execute(new l(this, 0));
        } else {
            this.component1 = aFa1vSDK;
            areAllFieldsValid().execute(new l(this, 0));
            throw null;
        }
    }

    public static final /* synthetic */ AFd1zSDK getCurrencyIso4217Code(AFd1wSDK aFd1wSDK) {
        int i = copydefault + 101;
        AFKeystoreWrapper = i % 128;
        int i2 = i % 2;
        AFd1zSDK aFd1zSDK = aFd1wSDK.AFAdRevenueData;
        if (i2 != 0) {
            return aFd1zSDK;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void AFAdRevenueData() {
        int i = AFKeystoreWrapper + 97;
        copydefault = i % 128;
        if (i % 2 != 0) {
            areAllFieldsValid().execute(new l(this, 1));
            int i2 = 82 / 0;
        } else {
            areAllFieldsValid().execute(new l(this, 1));
        }
        copydefault = (AFKeystoreWrapper + 119) % 128;
    }

    private final AFf1kSDK getCurrencyIso4217Code() {
        copydefault = (AFKeystoreWrapper + 1) % 128;
        AFf1kSDK aFf1kSDK = (AFf1kSDK) this.getRevenue.getValue();
        int i = AFKeystoreWrapper + 1;
        copydefault = i % 128;
        if (i % 2 == 0) {
            return aFf1kSDK;
        }
        throw null;
    }

    private final Map<String, String> getRevenue(AFh1aSDK aFh1aSDK) {
        Object[] objArr = new Object[1];
        a("炜桪ꪴ鐅⠖ᰫ", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 5, objArr);
        Map<String, String> mapE = m0.e(new Pair(((String) objArr[0]).intern(), Build.BRAND), new Pair("model", Build.MODEL), new Pair("app_id", getMediationNetwork().getCurrencyIso4217Code.getMonetizationNetwork.getPackageName()), new Pair("p_ex", new AFa1uSDK().AFAdRevenueData()), new Pair("api", String.valueOf(Build.VERSION.SDK_INT)), new Pair("sdk", this.component4), new Pair("uid", AFb1kSDK.getCurrencyIso4217Code(getMediationNetwork().getMediationNetwork)), new Pair("exc_config", aFh1aSDK.AFAdRevenueData()));
        int i = AFKeystoreWrapper + 111;
        copydefault = i % 128;
        if (i % 2 == 0) {
            return mapE;
        }
        throw null;
    }

    private final void getCurrencyIso4217Code(AFh1aSDK aFh1aSDK) {
        copydefault = (AFKeystoreWrapper + 97) % 128;
        int i = aFh1aSDK.getCurrencyIso4217Code;
        long millis = TimeUnit.DAYS.toMillis(aFh1aSDK.getMediationNetwork) + System.currentTimeMillis();
        AFc1qSDK aFc1qSDK = (AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this));
        aFc1qSDK.AFAdRevenueData("af_send_exc_to_server_window", millis);
        aFc1qSDK.getMediationNetwork("af_send_exc_min", i);
        int i2 = AFKeystoreWrapper + 17;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        if (r0 == (-1)) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0066, code lost:
    
        if (r0 >= r7) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        r0 = ((com.appsflyer.internal.AFc1qSDK) getMediationNetwork(new java.lang.Object[]{r13}, 1891172040, -1891172038, java.lang.System.identityHashCode(r13))).getRevenue("af_send_exc_min", -1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        if (r0 == (-1)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0080, code lost:
    
        r1 = com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper + 31;
        com.appsflyer.internal.AFd1wSDK.copydefault = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        if ((r1 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008c, code lost:
    
        r2 = 95 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0097, code lost:
    
        if (getRevenue().getMediationNetwork() >= r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a2, code lost:
    
        if (getRevenue().getMediationNetwork() >= r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a9, code lost:
    
        return getMonetizationNetwork(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ab, code lost:
    
        r14 = com.appsflyer.internal.AFd1wSDK.copydefault + 63;
        com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b5, code lost:
    
        if ((r14 % 2) == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b7, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003a, code lost:
    
        if (r14.getMonetizationNetwork < java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(r7)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005d, code lost:
    
        if (r14.getMonetizationNetwork < java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(r7)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005f, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean getMediationNetwork(AFh1aSDK aFh1aSDK) {
        long jCurrentTimeMillis;
        long monetizationNetwork;
        int i = copydefault + 19;
        AFKeystoreWrapper = i % 128;
        if (i % 2 == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
            monetizationNetwork = ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).getMonetizationNetwork("af_send_exc_to_server_window", -1L);
            int i2 = 9 / 0;
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
            monetizationNetwork = ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).getMonetizationNetwork("af_send_exc_to_server_window", -1L);
        }
    }

    private final boolean AFAdRevenueData(AFh1aSDK aFh1aSDK) {
        AFKeystoreWrapper = (copydefault + 29) % 128;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long monetizationNetwork = ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).getMonetizationNetwork("af_send_exc_to_server_window", -1L);
        if (aFh1aSDK.getMonetizationNetwork >= TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis) && monetizationNetwork != -1) {
            AFKeystoreWrapper = (copydefault + 123) % 128;
            if (monetizationNetwork >= jCurrentTimeMillis) {
                return getMonetizationNetwork(aFh1aSDK);
            }
        }
        return false;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        int i = AFKeystoreWrapper + 77;
        copydefault = i % 128;
        if (i % 2 != 0) {
            aFd1wSDK.areAllFieldsValid().execute(new l(aFd1wSDK, 2));
            int i2 = 69 / 0;
            return null;
        }
        aFd1wSDK.areAllFieldsValid().execute(new l(aFd1wSDK, 2));
        return null;
    }

    private static Map<String, Object> getMonetizationNetwork(Map<String, ? extends Object> map, List<AFc1aSDK> list) {
        AFKeystoreWrapper = (copydefault + 121) % 128;
        Map<String, Object> mapE = m0.e(new Pair("deviceInfo", map), new Pair("excs", AFd1qSDK.getMediationNetwork(list)));
        copydefault = (AFKeystoreWrapper + 15) % 128;
        return mapE;
    }

    private static Object getCurrencyIso4217Code(Object[] objArr) {
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        copydefault = (AFKeystoreWrapper + 61) % 128;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        aFd1wSDK.component3().getMonetizationNetwork(bytes, l0.b(new Pair("Authorization", AFj1dSDK.getMonetizationNetwork(str, str2))), 2000);
        int i = AFKeystoreWrapper + 69;
        copydefault = i % 128;
        if (i % 2 != 0) {
            int i2 = 36 / 0;
        }
        return null;
    }

    private final boolean getMonetizationNetwork(AFh1aSDK aFh1aSDK) {
        new AFd1pSDK();
        String str = this.component4;
        String str2 = aFh1aSDK.getRevenue;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        boolean currencyIso4217Code = AFd1pSDK.getCurrencyIso4217Code(str, str2);
        int i = copydefault + 97;
        AFKeystoreWrapper = i % 128;
        if (i % 2 == 0) {
            int i2 = 79 / 0;
        }
        return currencyIso4217Code;
    }

    private final void getMediationNetwork(String str, String str2) {
        getMediationNetwork(new Object[]{this, str, str2}, -1856843688, 1856843689, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getMonetizationNetwork() {
        getMediationNetwork(new Object[]{this}, 452613973, -452613973, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getMonetizationNetwork(Throwable th, String str) {
        getMediationNetwork(new Object[]{this, th, str}, -1045855402, 1045855405, System.identityHashCode(this));
    }
}
