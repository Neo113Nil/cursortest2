package com.appsflyer;

import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import f.g;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.o;
import m.d;

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
public final class AFLogger extends AFh1uSDK {
    public static final AFLogger INSTANCE = new AFLogger();
    private static final f.a getRevenue = f.b.a(AnonymousClass7.getMonetizationNetwork);
    private static final f.a getCurrencyIso4217Code = f.b.a(AnonymousClass2.getRevenue);

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$1, reason: invalid class name */
    @Metadata
    public static final class AnonymousClass1 extends d implements Function1<AFh1uSDK, Unit> {
        private /* synthetic */ AFh1vSDK $getMediationNetwork;
        private /* synthetic */ String $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AFh1vSDK aFh1vSDK, String str) {
            super(1);
            this.$getMediationNetwork = aFh1vSDK;
            this.$getRevenue = str;
        }

        public final void getMediationNetwork(AFh1uSDK aFh1uSDK) {
            Intrinsics.checkNotNullParameter(aFh1uSDK, "");
            aFh1uSDK.force(this.$getMediationNetwork, this.$getRevenue);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getMediationNetwork((AFh1uSDK) obj);
            return Unit.f157a;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$2, reason: invalid class name */
    @Metadata
    public static final class AnonymousClass2 extends d implements Function0<ExecutorService> {
        public static final AnonymousClass2 getRevenue = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return Executors.newSingleThreadExecutor();
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$3, reason: invalid class name */
    @Metadata
    public static final class AnonymousClass3 extends d implements Function1<AFh1uSDK, Unit> {
        private /* synthetic */ boolean $AFAdRevenueData;
        private /* synthetic */ boolean $component3;
        private /* synthetic */ boolean $component4;
        private /* synthetic */ Throwable $getCurrencyIso4217Code;
        private /* synthetic */ AFh1vSDK $getMediationNetwork;
        private /* synthetic */ boolean $getMonetizationNetwork;
        private /* synthetic */ String $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AFh1vSDK aFh1vSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
            super(1);
            this.$getMediationNetwork = aFh1vSDK;
            this.$getRevenue = str;
            this.$getCurrencyIso4217Code = th;
            this.$getMonetizationNetwork = z;
            this.$AFAdRevenueData = z2;
            this.$component4 = z3;
            this.$component3 = z4;
        }

        public final void AFAdRevenueData(AFh1uSDK aFh1uSDK) {
            Intrinsics.checkNotNullParameter(aFh1uSDK, "");
            aFh1uSDK.e(this.$getMediationNetwork, this.$getRevenue, this.$getCurrencyIso4217Code, this.$getMonetizationNetwork, this.$AFAdRevenueData, this.$component4, this.$component3);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            AFAdRevenueData((AFh1uSDK) obj);
            return Unit.f157a;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$4, reason: invalid class name */
    @Metadata
    public static final class AnonymousClass4 extends d implements Function1<AFh1uSDK, Unit> {
        private /* synthetic */ boolean $AFAdRevenueData;
        private /* synthetic */ String $getMonetizationNetwork;
        private /* synthetic */ AFh1vSDK $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(AFh1vSDK aFh1vSDK, String str, boolean z) {
            super(1);
            this.$getRevenue = aFh1vSDK;
            this.$getMonetizationNetwork = str;
            this.$AFAdRevenueData = z;
        }

        public final void getCurrencyIso4217Code(AFh1uSDK aFh1uSDK) {
            Intrinsics.checkNotNullParameter(aFh1uSDK, "");
            aFh1uSDK.i(this.$getRevenue, this.$getMonetizationNetwork, this.$AFAdRevenueData);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getCurrencyIso4217Code((AFh1uSDK) obj);
            return Unit.f157a;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$5, reason: invalid class name */
    @Metadata
    public static final class AnonymousClass5 extends d implements Function1<AFh1uSDK, Unit> {
        private /* synthetic */ String $AFAdRevenueData;
        private /* synthetic */ boolean $getMediationNetwork;
        private /* synthetic */ AFh1vSDK $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(AFh1vSDK aFh1vSDK, String str, boolean z) {
            super(1);
            this.$getRevenue = aFh1vSDK;
            this.$AFAdRevenueData = str;
            this.$getMediationNetwork = z;
        }

        public final void getMonetizationNetwork(AFh1uSDK aFh1uSDK) {
            Intrinsics.checkNotNullParameter(aFh1uSDK, "");
            aFh1uSDK.d(this.$getRevenue, this.$AFAdRevenueData, this.$getMediationNetwork);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getMonetizationNetwork((AFh1uSDK) obj);
            return Unit.f157a;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$6, reason: invalid class name */
    @Metadata
    public static final class AnonymousClass6 extends d implements Function1<AFh1uSDK, Unit> {
        private /* synthetic */ boolean $AFAdRevenueData;
        private /* synthetic */ AFh1vSDK $getCurrencyIso4217Code;
        private /* synthetic */ String $getMediationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(AFh1vSDK aFh1vSDK, String str, boolean z) {
            super(1);
            this.$getCurrencyIso4217Code = aFh1vSDK;
            this.$getMediationNetwork = str;
            this.$AFAdRevenueData = z;
        }

        public final void getRevenue(AFh1uSDK aFh1uSDK) {
            Intrinsics.checkNotNullParameter(aFh1uSDK, "");
            aFh1uSDK.v(this.$getCurrencyIso4217Code, this.$getMediationNetwork, this.$AFAdRevenueData);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getRevenue((AFh1uSDK) obj);
            return Unit.f157a;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$7, reason: invalid class name */
    @Metadata
    public static final class AnonymousClass7 extends d implements Function0<Set<AFh1uSDK>> {
        public static final AnonymousClass7 getMonetizationNetwork = new AnonymousClass7();

        public AnonymousClass7() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final Set<AFh1uSDK> invoke() {
            return Collections.synchronizedSet(new LinkedHashSet());
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$9, reason: invalid class name */
    @Metadata
    public static final class AnonymousClass9 extends d implements Function1<AFh1uSDK, Unit> {
        private /* synthetic */ boolean $AFAdRevenueData;
        private /* synthetic */ String $getCurrencyIso4217Code;
        private /* synthetic */ AFh1vSDK $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(AFh1vSDK aFh1vSDK, String str, boolean z) {
            super(1);
            this.$getRevenue = aFh1vSDK;
            this.$getCurrencyIso4217Code = str;
            this.$AFAdRevenueData = z;
        }

        public final void getCurrencyIso4217Code(AFh1uSDK aFh1uSDK) {
            Intrinsics.checkNotNullParameter(aFh1uSDK, "");
            aFh1uSDK.w(this.$getRevenue, this.$getCurrencyIso4217Code, this.$AFAdRevenueData);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getCurrencyIso4217Code((AFh1uSDK) obj);
            return Unit.f157a;
        }
    }

    @Metadata
    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);

        private final int level;

        LogLevel(int i2) {
            this.level = i2;
        }

        public final int getLevel() {
            return this.level;
        }
    }

    private AFLogger() {
    }

    public static final void afDebugLog(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.d(AFh1vSDK.OTHER, str, true);
    }

    public static final void afErrorLog(String str, Throwable th) {
        AFLogger aFLogger = INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.OTHER;
        if (str == null || o.b(str)) {
            str = "null";
        }
        String str2 = str;
        if (th == null) {
            th = new NullPointerException("Invoked with null Throwable");
        }
        AFh1uSDK.e$default(aFLogger, aFh1vSDK, str2, th, false, false, false, false, 120, null);
    }

    public static final void afErrorLogForExcManagerOnly(String str, Throwable th) {
        AFLogger aFLogger = INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.OTHER;
        if (str == null || o.b(str)) {
            str = "null";
        }
        String str2 = str;
        if (th == null) {
            th = new NullPointerException("Invoked with null Throwable");
        }
        AFh1uSDK.e$default(aFLogger, aFh1vSDK, str2, th, false, false, true, false, 64, null);
    }

    public static final void afInfoLog(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.i(AFh1vSDK.OTHER, str, true);
    }

    public static final void afLogForce(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.force(AFh1vSDK.OTHER, str);
    }

    public static final void afRDLog(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.v(AFh1vSDK.OTHER, str, true);
    }

    public static final void afVerboseLog(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.v(AFh1vSDK.OTHER, str, false);
    }

    public static final void afWarnLog(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AFh1uSDK.w$default(INSTANCE, AFh1vSDK.OTHER, str, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrencyIso4217Code(AFh1uSDK[] aFh1uSDKArr) {
        Intrinsics.checkNotNullParameter(aFh1uSDKArr, "");
        f.a aVar = getRevenue;
        Object objA = ((g) aVar).a();
        Intrinsics.checkNotNullExpressionValue(objA, "");
        synchronized (((Set) objA)) {
            Object objA2 = ((g) aVar).a();
            Intrinsics.checkNotNullExpressionValue(objA2, "");
            ((Set) objA2).removeAll(m.c(aFh1uSDKArr));
            Unit unit = Unit.f157a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        f.a aVar = getRevenue;
        Object objA = ((g) aVar).a();
        Intrinsics.checkNotNullExpressionValue(objA, "");
        synchronized (((Set) objA)) {
            Object objA2 = ((g) aVar).a();
            Intrinsics.checkNotNullExpressionValue(objA2, "");
            Iterator it = ((Set) objA2).iterator();
            while (it.hasNext()) {
                function1.invoke((AFh1uSDK) it.next());
            }
            Unit unit = Unit.f157a;
        }
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void d(AFh1vSDK aFh1vSDK, String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) ((g) getCurrencyIso4217Code).a()).execute(new a(new AnonymousClass5(aFh1vSDK, str, z), 2));
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void e(AFh1vSDK aFh1vSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        ((ExecutorService) ((g) getCurrencyIso4217Code).a()).execute(new a(new AnonymousClass3(aFh1vSDK, str, th, z, z2, z3, z4), 0));
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void force(AFh1vSDK aFh1vSDK, String str) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) ((g) getCurrencyIso4217Code).a()).execute(new a(new AnonymousClass1(aFh1vSDK, str), 3));
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void i(AFh1vSDK aFh1vSDK, String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) ((g) getCurrencyIso4217Code).a()).execute(new a(new AnonymousClass4(aFh1vSDK, str, z), 4));
    }

    public final void registerClient(AFh1uSDK... aFh1uSDKArr) {
        Intrinsics.checkNotNullParameter(aFh1uSDKArr, "");
        ((ExecutorService) ((g) getCurrencyIso4217Code).a()).execute(new b(aFh1uSDKArr, 0));
    }

    public final void unregisterClient(AFh1uSDK... aFh1uSDKArr) {
        Intrinsics.checkNotNullParameter(aFh1uSDKArr, "");
        ((ExecutorService) ((g) getCurrencyIso4217Code).a()).execute(new b(aFh1uSDKArr, 1));
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void v(AFh1vSDK aFh1vSDK, String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) ((g) getCurrencyIso4217Code).a()).execute(new a(new AnonymousClass6(aFh1vSDK, str, z), 1));
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void w(AFh1vSDK aFh1vSDK, String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) ((g) getCurrencyIso4217Code).a()).execute(new a(new AnonymousClass9(aFh1vSDK, str, z), 5));
    }

    public static final void afDebugLog(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.d(AFh1vSDK.OTHER, str, z);
    }

    public static final void afErrorLog(String str, Throwable th, boolean z) {
        AFLogger aFLogger = INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.OTHER;
        if (str == null || o.b(str)) {
            str = "null";
        }
        String str2 = str;
        if (th == null) {
            th = new NullPointerException("Invoked with null Throwable");
        }
        AFh1uSDK.e$default(aFLogger, aFh1vSDK, str2, th, false, z, false, false, 104, null);
    }

    public static final void afErrorLogForExcManagerOnly(String str, Throwable th, boolean z) {
        AFLogger aFLogger = INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.OTHER;
        if (str == null || o.b(str)) {
            str = "null";
        }
        if (th == null) {
            th = new NullPointerException("Invoked with null Throwable");
        }
        AFh1uSDK.e$default(aFLogger, aFh1vSDK, str, th, false, false, !z, false, 64, null);
    }

    public static final void afInfoLog(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.i(AFh1vSDK.OTHER, str, z);
    }

    public static final void afWarnLog(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.w(AFh1vSDK.OTHER, str, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFh1uSDK[] elements) {
        Intrinsics.checkNotNullParameter(elements, "");
        f.a aVar = getRevenue;
        Object objA = ((g) aVar).a();
        Intrinsics.checkNotNullExpressionValue(objA, "");
        synchronized (((Set) objA)) {
            Object objA2 = ((g) aVar).a();
            Intrinsics.checkNotNullExpressionValue(objA2, "");
            Set set = (Set) objA2;
            Intrinsics.checkNotNullParameter(set, "<this>");
            Intrinsics.checkNotNullParameter(elements, "elements");
            Intrinsics.checkNotNullParameter(elements, "<this>");
            List listAsList = Arrays.asList(elements);
            Intrinsics.checkNotNullExpressionValue(listAsList, "asList(this)");
            set.addAll(listAsList);
            Unit unit = Unit.f157a;
        }
    }

    public static final void afErrorLog(String str, Throwable th, boolean z, boolean z2) {
        AFLogger aFLogger = INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.OTHER;
        if (str == null || o.b(str)) {
            str = "null";
        }
        String str2 = str;
        if (th == null) {
            th = new NullPointerException("Invoked with null Throwable");
        }
        AFh1uSDK.e$default(aFLogger, aFh1vSDK, str2, th, false, z, z2, false, 72, null);
    }

    public static final void afErrorLog(String str, Throwable th, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        AFh1uSDK.e$default(INSTANCE, AFh1vSDK.OTHER, str, th, z, z2, z3, false, 64, null);
    }
}
