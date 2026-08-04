package com.appsflyer.internal;

import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.gamericefishpro.space.ph.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata
public abstract class AFe1rSDK {
    public static final AFa1ySDK AFa1ySDK = new AFa1ySDK(null);
    private static final List<String> getMediationNetwork = x.f(AFInAppEventType.ACHIEVEMENT_UNLOCKED, AFInAppEventType.AD_CLICK, AFInAppEventType.AD_VIEW, AFInAppEventType.ADD_PAYMENT_INFO, AFInAppEventType.ADD_TO_CART, AFInAppEventType.ADD_TO_WISH_LIST, AFInAppEventType.COMPLETE_REGISTRATION, AFInAppEventType.CONTENT_VIEW, AFInAppEventType.INITIATED_CHECKOUT, AFInAppEventType.INVITE, AFInAppEventType.LEVEL_ACHIEVED, AFInAppEventType.LIST_VIEW, AFInAppEventType.LOGIN, AFInAppEventType.OPENED_FROM_PUSH_NOTIFICATION, AFInAppEventType.PURCHASE, AFInAppEventType.RATE, AFInAppEventType.RE_ENGAGE, AFInAppEventType.SEARCH, AFInAppEventType.SHARE, AFInAppEventType.SPENT_CREDIT, AFInAppEventType.START_TRIAL, AFInAppEventType.SUBSCRIBE, AFInAppEventType.TRAVEL_BOOKING, AFInAppEventType.TUTORIAL_COMPLETION, AFInAppEventType.UPDATE);
    public final String getRevenue;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    @Metadata
    public static final class AFa1tSDK extends AFe1rSDK {
        public static final AFa1tSDK INSTANCE = new AFa1tSDK();

        private AFa1tSDK() {
            super("install");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    @Metadata
    public static final class AFa1uSDK extends AFe1rSDK {
        public static final AFa1uSDK INSTANCE = new AFa1uSDK();

        private AFa1uSDK() {
            super("af_sandbox_revenue");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    @Metadata
    public static final class AFa1ySDK {
        private AFa1ySDK() {
        }

        /* JADX WARN: Code duplicated, block: B:21:0x004b  */
        public static AFe1rSDK getMediationNetwork(AFh1mSDK aFh1mSDK) {
            Float fValueOf;
            String string;
            Object obj;
            String string2;
            Intrinsics.checkNotNullParameter(aFh1mSDK, "");
            if (aFh1mSDK.AFAdRevenueData() == AFe1pSDK.CONVERSION) {
                return AFa1tSDK.INSTANCE;
            }
            Integer intOrNull = null;
            if (aFh1mSDK.AFAdRevenueData() != AFe1pSDK.INAPP || !AFe1rSDK.getMediationNetwork.contains(aFh1mSDK.areAllFieldsValid)) {
                return null;
            }
            Map<String, Object> map = aFh1mSDK.getRevenue;
            if (map == null || (obj = map.get(AFInAppEventParameterName.REVENUE)) == null || (string2 = obj.toString()) == null) {
                fValueOf = null;
            } else {
                Intrinsics.checkNotNullParameter(string2, "<this>");
                try {
                    if (kotlin.text.c.e(string2)) {
                        fValueOf = Float.valueOf(Float.parseFloat(string2));
                    } else {
                        fValueOf = null;
                    }
                } catch (NumberFormatException unused) {
                }
            }
            Object obj2 = aFh1mSDK.AFAdRevenueData.get("iaecounter");
            if (obj2 != null && (string = obj2.toString()) != null) {
                intOrNull = StringsKt.toIntOrNull(string);
            }
            String str = aFh1mSDK.areAllFieldsValid;
            Intrinsics.checkNotNullExpressionValue(str, "");
            return new AFa1zSDK(str, fValueOf, intOrNull);
        }

        public /* synthetic */ AFa1ySDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class AFa1zSDK extends AFe1rSDK {
        public final Integer AFAdRevenueData;
        public final Float getCurrencyIso4217Code;
        private final String getMediationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AFa1zSDK(String str, Float f, Integer num) {
            super(str);
            Intrinsics.checkNotNullParameter(str, "");
            this.getMediationNetwork = str;
            this.getCurrencyIso4217Code = f;
            this.AFAdRevenueData = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1zSDK)) {
                return false;
            }
            AFa1zSDK aFa1zSDK = (AFa1zSDK) obj;
            return Intrinsics.a(this.getMediationNetwork, aFa1zSDK.getMediationNetwork) && Intrinsics.a(this.getCurrencyIso4217Code, aFa1zSDK.getCurrencyIso4217Code) && Intrinsics.a(this.AFAdRevenueData, aFa1zSDK.AFAdRevenueData);
        }

        public final int hashCode() {
            int iHashCode = this.getMediationNetwork.hashCode() * 31;
            Float f = this.getCurrencyIso4217Code;
            int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
            Integer num = this.AFAdRevenueData;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            return "PredefinedInAppEvent(name=" + this.getMediationNetwork + ", eventRevenue=" + this.getCurrencyIso4217Code + ", eventCounter=" + this.AFAdRevenueData + ")";
        }
    }

    public AFe1rSDK(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getRevenue = str;
    }
}
