package com.appsflyer;

import com.appsflyer.internal.AFc1kSDK;
import com.appsflyer.internal.AFg1cSDK;
import com.appsflyer.internal.AFh1ySDK;
import com.gamericefishpro.space.ei.l;
import com.gamericefishpro.space.oh.h;
import com.gamericefishpro.space.oh.i;
import com.gamericefishpro.space.ph.u;
import com.gamericefishpro.space.ph.v;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
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
public final class AFLogger extends AFh1ySDK {
    public static final AFLogger INSTANCE = new AFLogger();
    private static final h getMediationNetwork = i.b(AnonymousClass7.getRevenue);
    private static final h getCurrencyIso4217Code = i.b(AnonymousClass5.AFAdRevenueData);

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    @Metadata
    public static final class AnonymousClass1 extends l implements Function1<AFh1ySDK, Unit> {
        private /* synthetic */ boolean $AFAdRevenueData;
        private /* synthetic */ String $getCurrencyIso4217Code;
        private /* synthetic */ AFg1cSDK $getMonetizationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AFg1cSDK aFg1cSDK, String str, boolean z) {
            super(1);
            this.$getMonetizationNetwork = aFg1cSDK;
            this.$getCurrencyIso4217Code = str;
            this.$AFAdRevenueData = z;
        }

        public final void AFAdRevenueData(AFh1ySDK aFh1ySDK) {
            Intrinsics.checkNotNullParameter(aFh1ySDK, "");
            aFh1ySDK.i(this.$getMonetizationNetwork, this.$getCurrencyIso4217Code, this.$AFAdRevenueData);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            AFAdRevenueData((AFh1ySDK) obj);
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$10, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    @Metadata
    public static final class AnonymousClass10 extends l implements Function1<AFh1ySDK, Unit> {
        private /* synthetic */ String $getCurrencyIso4217Code;
        private /* synthetic */ AFg1cSDK $getMonetizationNetwork;
        private /* synthetic */ boolean $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(AFg1cSDK aFg1cSDK, String str, boolean z) {
            super(1);
            this.$getMonetizationNetwork = aFg1cSDK;
            this.$getCurrencyIso4217Code = str;
            this.$getRevenue = z;
        }

        public final void getMediationNetwork(AFh1ySDK aFh1ySDK) {
            Intrinsics.checkNotNullParameter(aFh1ySDK, "");
            aFh1ySDK.v(this.$getMonetizationNetwork, this.$getCurrencyIso4217Code, this.$getRevenue);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getMediationNetwork((AFh1ySDK) obj);
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    @Metadata
    public static final class AnonymousClass2 extends l implements Function1<AFh1ySDK, Unit> {
        private /* synthetic */ boolean $getCurrencyIso4217Code;
        private /* synthetic */ AFg1cSDK $getMonetizationNetwork;
        private /* synthetic */ String $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AFg1cSDK aFg1cSDK, String str, boolean z) {
            super(1);
            this.$getMonetizationNetwork = aFg1cSDK;
            this.$getRevenue = str;
            this.$getCurrencyIso4217Code = z;
        }

        public final void getCurrencyIso4217Code(AFh1ySDK aFh1ySDK) {
            Intrinsics.checkNotNullParameter(aFh1ySDK, "");
            aFh1ySDK.d(this.$getMonetizationNetwork, this.$getRevenue, this.$getCurrencyIso4217Code);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getCurrencyIso4217Code((AFh1ySDK) obj);
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    @Metadata
    public static final class AnonymousClass3 extends l implements Function1<AFh1ySDK, Unit> {
        private /* synthetic */ String $AFAdRevenueData;
        private /* synthetic */ boolean $areAllFieldsValid;
        private /* synthetic */ boolean $component1;
        private /* synthetic */ AFg1cSDK $getCurrencyIso4217Code;
        private /* synthetic */ boolean $getMediationNetwork;
        private /* synthetic */ Throwable $getMonetizationNetwork;
        private /* synthetic */ boolean $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
            super(1);
            this.$getCurrencyIso4217Code = aFg1cSDK;
            this.$AFAdRevenueData = str;
            this.$getMonetizationNetwork = th;
            this.$getMediationNetwork = z;
            this.$getRevenue = z2;
            this.$component1 = z3;
            this.$areAllFieldsValid = z4;
        }

        public final void getRevenue(AFh1ySDK aFh1ySDK) {
            Intrinsics.checkNotNullParameter(aFh1ySDK, "");
            aFh1ySDK.e(this.$getCurrencyIso4217Code, this.$AFAdRevenueData, this.$getMonetizationNetwork, this.$getMediationNetwork, this.$getRevenue, this.$component1, this.$areAllFieldsValid);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getRevenue((AFh1ySDK) obj);
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    @Metadata
    public static final class AnonymousClass4 extends l implements Function1<AFh1ySDK, Unit> {
        private /* synthetic */ AFg1cSDK $getMonetizationNetwork;
        private /* synthetic */ String $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(AFg1cSDK aFg1cSDK, String str) {
            super(1);
            this.$getMonetizationNetwork = aFg1cSDK;
            this.$getRevenue = str;
        }

        public final void getMonetizationNetwork(AFh1ySDK aFh1ySDK) {
            Intrinsics.checkNotNullParameter(aFh1ySDK, "");
            aFh1ySDK.force(this.$getMonetizationNetwork, this.$getRevenue);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getMonetizationNetwork((AFh1ySDK) obj);
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    @Metadata
    public static final class AnonymousClass5 extends l implements Function0<ExecutorService> {
        public static final AnonymousClass5 AFAdRevenueData = new AnonymousClass5();

        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return AFc1kSDK.getMediationNetwork();
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$7, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    @Metadata
    public static final class AnonymousClass7 extends l implements Function0<Set<AFh1ySDK>> {
        public static final AnonymousClass7 getRevenue = new AnonymousClass7();

        public AnonymousClass7() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final Set<AFh1ySDK> invoke() {
            return new LinkedHashSet();
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$9, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    @Metadata
    public static final class AnonymousClass9 extends l implements Function1<AFh1ySDK, Unit> {
        private /* synthetic */ String $AFAdRevenueData;
        private /* synthetic */ AFg1cSDK $getMediationNetwork;
        private /* synthetic */ boolean $getMonetizationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(AFg1cSDK aFg1cSDK, String str, boolean z) {
            super(1);
            this.$getMediationNetwork = aFg1cSDK;
            this.$AFAdRevenueData = str;
            this.$getMonetizationNetwork = z;
        }

        public final void AFAdRevenueData(AFh1ySDK aFh1ySDK) {
            Intrinsics.checkNotNullParameter(aFh1ySDK, "");
            aFh1ySDK.w(this.$getMediationNetwork, this.$AFAdRevenueData, this.$getMonetizationNetwork);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            AFAdRevenueData((AFh1ySDK) obj);
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    @Metadata
    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);

        private final int level;

        LogLevel(int i) {
            this.level = i;
        }

        public final int getLevel() {
            return this.level;
        }
    }

    private AFLogger() {
    }

    @com.gamericefishpro.space.oh.a
    public static final void afDebugLog(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.d(AFg1cSDK.OTHER, str, z);
    }

    @com.gamericefishpro.space.oh.a
    public static final void afErrorLog(String str, Throwable th, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        AFh1ySDK.e$default(INSTANCE, AFg1cSDK.OTHER, str, th, z, z2, z3, false, 64, null);
    }

    @com.gamericefishpro.space.oh.a
    public static final void afErrorLogForExcManagerOnly(String str, Throwable th) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (str == null || StringsKt.u(str)) {
            str = "null";
        }
        String str2 = str;
        if (th == null) {
            th = new NullPointerException("Invoked with null Throwable");
        }
        AFh1ySDK.e$default(aFLogger, aFg1cSDK, str2, th, false, false, true, false, 64, null);
    }

    @com.gamericefishpro.space.oh.a
    public static final void afInfoLog(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.i(AFg1cSDK.OTHER, str, z);
    }

    @com.gamericefishpro.space.oh.a
    public static final void afLogForce(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.force(AFg1cSDK.OTHER, str);
    }

    @com.gamericefishpro.space.oh.a
    public static final void afRDLog(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.v(AFg1cSDK.OTHER, str, true);
    }

    @com.gamericefishpro.space.oh.a
    public static final void afVerboseLog(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.v(AFg1cSDK.OTHER, str, false);
    }

    @com.gamericefishpro.space.oh.a
    public static final void afWarnLog(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.w(AFg1cSDK.OTHER, str, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrencyIso4217Code(AFh1ySDK[] elements) {
        Intrinsics.checkNotNullParameter(elements, "");
        Set set = (Set) getMediationNetwork.getValue();
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        set.addAll(u.b(elements));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFh1ySDK[] aFh1ySDKArr) {
        Intrinsics.checkNotNullParameter(aFh1ySDKArr, "");
        ((Set) getMediationNetwork.getValue()).removeAll(v.x(aFh1ySDKArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator it = ((Set) getMediationNetwork.getValue()).iterator();
        while (it.hasNext()) {
            function1.invoke((AFh1ySDK) it.next());
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void d(AFg1cSDK aFg1cSDK, String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new a(0, new AnonymousClass2(aFg1cSDK, str, z)));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void e(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new a(0, new AnonymousClass3(aFg1cSDK, str, th, z, z2, z3, z4)));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void force(AFg1cSDK aFg1cSDK, String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new a(0, new AnonymousClass4(aFg1cSDK, str)));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void i(AFg1cSDK aFg1cSDK, String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new a(0, new AnonymousClass1(aFg1cSDK, str, z)));
    }

    public final void registerClient(AFh1ySDK... aFh1ySDKArr) {
        Intrinsics.checkNotNullParameter(aFh1ySDKArr, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new b(aFh1ySDKArr, 1));
    }

    public final void unregisterClient(AFh1ySDK... aFh1ySDKArr) {
        Intrinsics.checkNotNullParameter(aFh1ySDKArr, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new b(aFh1ySDKArr, 0));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void v(AFg1cSDK aFg1cSDK, String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new a(0, new AnonymousClass10(aFg1cSDK, str, z)));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void w(AFg1cSDK aFg1cSDK, String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new a(0, new AnonymousClass9(aFg1cSDK, str, z)));
    }

    @com.gamericefishpro.space.oh.a
    public static final void afDebugLog(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.d(AFg1cSDK.OTHER, str, true);
    }

    @com.gamericefishpro.space.oh.a
    public static final void afInfoLog(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.i(AFg1cSDK.OTHER, str, true);
    }

    @com.gamericefishpro.space.oh.a
    public static final void afWarnLog(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AFh1ySDK.w$default(INSTANCE, AFg1cSDK.OTHER, str, false, 4, null);
    }

    @com.gamericefishpro.space.oh.a
    public static final void afErrorLog(String str, Throwable th) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (str == null || StringsKt.u(str)) {
            str = "null";
        }
        String str2 = str;
        if (th == null) {
            th = new NullPointerException("Invoked with null Throwable");
        }
        AFh1ySDK.e$default(aFLogger, aFg1cSDK, str2, th, false, false, false, false, 120, null);
    }

    @com.gamericefishpro.space.oh.a
    public static final void afErrorLogForExcManagerOnly(String str, Throwable th, boolean z) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (str == null || StringsKt.u(str)) {
            str = "null";
        }
        String str2 = str;
        if (th == null) {
            th = new NullPointerException("Invoked with null Throwable");
        }
        AFh1ySDK.e$default(aFLogger, aFg1cSDK, str2, th, false, false, !z, false, 64, null);
    }

    @com.gamericefishpro.space.oh.a
    public static final void afErrorLog(String str, Throwable th, boolean z) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (str == null || StringsKt.u(str)) {
            str = "null";
        }
        String str2 = str;
        if (th == null) {
            th = new NullPointerException("Invoked with null Throwable");
        }
        AFh1ySDK.e$default(aFLogger, aFg1cSDK, str2, th, false, z, false, false, 104, null);
    }

    @com.gamericefishpro.space.oh.a
    public static final void afErrorLog(String str, Throwable th, boolean z, boolean z2) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (str == null || StringsKt.u(str)) {
            str = "null";
        }
        String str2 = str;
        if (th == null) {
            th = new NullPointerException("Invoked with null Throwable");
        }
        AFh1ySDK.e$default(aFLogger, aFg1cSDK, str2, th, false, z, z2, false, 72, null);
    }
}
