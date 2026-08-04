package com.appsflyer.internal;

import com.appsflyer.internal.AFe1oSDK.AnonymousClass1;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class AFe1sSDK {
    public final AFc1hSDK AFAdRevenueData;
    private final AFe1oSDK component3;
    private final AFf1eSDK component4;
    private final AFc1oSDK getCurrencyIso4217Code;
    private final AFg1nSDK getMediationNetwork;
    public final AFc1qSDK getMonetizationNetwork;
    private final ExecutorService getRevenue;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1sSDK$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    @Metadata
    public static final class AnonymousClass1 extends com.gamericefishpro.space.ei.l implements Function1<AFe1uSDK, Unit> {
        public AnonymousClass1() {
            super(1);
        }

        public final void getRevenue(AFe1uSDK aFe1uSDK) {
            Intrinsics.checkNotNullParameter(aFe1uSDK, "");
            if (aFe1uSDK == AFe1uSDK.SUCCESS) {
                AFe1sSDK.this.getMonetizationNetwork.AFAdRevenueData("didSendRevenueTriggerOnLastBackground", true);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getRevenue((AFe1uSDK) obj);
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1sSDK$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    @Metadata
    public static final class AnonymousClass4 extends com.gamericefishpro.space.ei.l implements Function1<AFe1uSDK, Unit> {
        public static final AnonymousClass4 getCurrencyIso4217Code = new AnonymousClass4();

        public AnonymousClass4() {
            super(1);
        }

        public final void AFAdRevenueData(AFe1uSDK aFe1uSDK) {
            Intrinsics.checkNotNullParameter(aFe1uSDK, "");
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            AFAdRevenueData((AFe1uSDK) obj);
            return Unit.a;
        }
    }

    public AFe1sSDK(AFc1qSDK aFc1qSDK, AFc1hSDK aFc1hSDK, AFc1oSDK aFc1oSDK, ExecutorService executorService, AFg1nSDK aFg1nSDK, AFf1eSDK aFf1eSDK, AFe1oSDK aFe1oSDK) {
        Intrinsics.checkNotNullParameter(aFc1qSDK, "");
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFg1nSDK, "");
        Intrinsics.checkNotNullParameter(aFf1eSDK, "");
        Intrinsics.checkNotNullParameter(aFe1oSDK, "");
        this.getMonetizationNetwork = aFc1qSDK;
        this.AFAdRevenueData = aFc1hSDK;
        this.getCurrencyIso4217Code = aFc1oSDK;
        this.getRevenue = executorService;
        this.getMediationNetwork = aFg1nSDK;
        this.component4 = aFf1eSDK;
        this.component3 = aFe1oSDK;
    }

    public final void AFAdRevenueData(AFe1rSDK aFe1rSDK, Function1<? super AFe1uSDK, Unit> function1) {
        Intrinsics.checkNotNullParameter(aFe1rSDK, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AFf1wSDK aFf1wSDK = new AFf1wSDK(aFe1rSDK, this.getRevenue, this.getCurrencyIso4217Code, this.AFAdRevenueData, this.getMediationNetwork, this.component4, function1);
        AFe1oSDK aFe1oSDK = this.component3;
        aFe1oSDK.getCurrencyIso4217Code.execute(aFe1oSDK.new AnonymousClass1(aFf1wSDK));
    }

    public final void getMediationNetwork() {
        if (this.getMonetizationNetwork.getMediationNetwork("didSendRevenueTriggerOnLastBackground", true) || !AFj1kSDK.getRevenue(this.AFAdRevenueData.getMonetizationNetwork)) {
            return;
        }
        AFAdRevenueData(AFe1rSDK.AFa1uSDK.INSTANCE, new AnonymousClass1());
    }
}
