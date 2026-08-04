package com.appsflyer.internal;

import android.content.Intent;
import android.os.Parcelable;
import com.appsflyer.AFLogger;
import com.gamericefishpro.space.ei.b0;
import com.gamericefishpro.space.ph.v;
import com.gamericefishpro.space.t0.y0;
import java.util.ConcurrentModificationException;
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
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class AFj1gSDK {
    final Intent getCurrencyIso4217Code;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1gSDK$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    @Metadata
    public static final class AnonymousClass2<T> extends com.gamericefishpro.space.ei.l implements Function0<T> {
        private /* synthetic */ String $getMonetizationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str) {
            super(0);
            this.$getMonetizationNetwork = str;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: J_, reason: merged with bridge method [inline-methods] */
        public final Parcelable invoke() {
            return AFj1gSDK.this.getCurrencyIso4217Code.getParcelableExtra(this.$getMonetizationNetwork);
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1gSDK$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    @Metadata
    public static final class AnonymousClass3 extends com.gamericefishpro.space.ei.l implements Function0<String> {
        private /* synthetic */ String $AFAdRevenueData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str) {
            super(0);
            this.$AFAdRevenueData = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return AFj1gSDK.this.getCurrencyIso4217Code.getStringExtra(this.$AFAdRevenueData);
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1gSDK$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    @Metadata
    public static final class AnonymousClass4 extends com.gamericefishpro.space.ei.l implements Function0<Boolean> {
        private /* synthetic */ String $getMonetizationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str) {
            super(0);
            this.$getMonetizationNetwork = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(AFj1gSDK.this.getCurrencyIso4217Code.hasExtra(this.$getMonetizationNetwork));
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1gSDK$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    @Metadata
    public static final class AnonymousClass5 extends com.gamericefishpro.space.ei.l implements Function0<Intent> {
        private /* synthetic */ long $AFAdRevenueData;
        private /* synthetic */ String $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str, long j) {
            super(0);
            this.$getRevenue = str;
            this.$AFAdRevenueData = j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: K_, reason: merged with bridge method [inline-methods] */
        public final Intent invoke() {
            return AFj1gSDK.this.getCurrencyIso4217Code.putExtra(this.$getRevenue, this.$AFAdRevenueData);
        }
    }

    public AFj1gSDK(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        this.getCurrencyIso4217Code = intent;
    }

    private final <T> T getRevenue(Function0<? extends T> function0, String str, T t, boolean z) {
        Object objQ;
        Object objQ2;
        synchronized (this.getCurrencyIso4217Code) {
            try {
                com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
                objQ = function0.invoke();
            } catch (Throwable th) {
                com.gamericefishpro.space.oh.n nVar2 = com.gamericefishpro.space.oh.p.d;
                objQ = com.gamericefishpro.space.wa.b.q(th);
            }
            com.gamericefishpro.space.ki.b[] bVarArr = {b0.a(ConcurrentModificationException.class), b0.a(ArrayIndexOutOfBoundsException.class)};
            Throwable thA = com.gamericefishpro.space.oh.p.a(objQ);
            if (thA != null) {
                try {
                    if (!v.n(bVarArr, b0.a(thA.getClass()))) {
                        throw thA;
                    }
                    if (z) {
                        objQ2 = getRevenue(function0, str, t, false);
                    } else {
                        AFLogger.afErrorLog(str, thA, false, false);
                        objQ2 = t;
                    }
                    objQ = objQ2;
                } catch (Throwable th2) {
                    com.gamericefishpro.space.oh.n nVar3 = com.gamericefishpro.space.oh.p.d;
                    objQ2 = com.gamericefishpro.space.wa.b.q(th2);
                }
            }
            Throwable thA2 = com.gamericefishpro.space.oh.p.a(objQ);
            if (thA2 == null) {
                t = (T) objQ;
            } else {
                AFLogger.afErrorLog(str, thA2, false, false);
            }
        }
        return t;
    }

    public final String AFAdRevenueData(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (String) getRevenue(new AnonymousClass3(str), y0.g("Error while trying to read ", str, " extra from intent"), null, true);
    }

    public final <T extends Parcelable> T H_(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (T) getRevenue(new AnonymousClass2(str), y0.g("Error while trying to read ", str, " extra from intent"), null, true);
    }

    public final Intent I_(String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return (Intent) getRevenue(new AnonymousClass5(str, j), y0.g("Error while trying to write ", str, " extra to intent"), null, true);
    }

    public final boolean getMediationNetwork(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Boolean bool = (Boolean) getRevenue(new AnonymousClass4(str), y0.g("Error while trying to check presence of ", str, " extra from intent"), Boolean.TRUE, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}
