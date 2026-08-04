package com.appsflyer.internal;

import android.content.Intent;
import android.os.Parcelable;
import com.appsflyer.AFLogger;
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
/* JADX INFO: loaded from: classes.dex */
public final class AFj1iSDK {
    final Intent getMediationNetwork;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1iSDK$1, reason: invalid class name */
    @Metadata
    public static final class AnonymousClass1 extends m.d implements Function0<String> {
        private /* synthetic */ String $getMonetizationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(0);
            this.$getMonetizationNetwork = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return AFj1iSDK.this.getMediationNetwork.getStringExtra(this.$getMonetizationNetwork);
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1iSDK$2, reason: invalid class name */
    @Metadata
    public static final class AnonymousClass2 extends m.d implements Function0<Intent> {
        private /* synthetic */ String $getCurrencyIso4217Code;
        private /* synthetic */ long $getMediationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, long j2) {
            super(0);
            this.$getCurrencyIso4217Code = str;
            this.$getMediationNetwork = j2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: M_, reason: merged with bridge method [inline-methods] */
        public final Intent invoke() {
            return AFj1iSDK.this.getMediationNetwork.putExtra(this.$getCurrencyIso4217Code, this.$getMediationNetwork);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1iSDK$4, reason: invalid class name */
    @Metadata
    public static final class AnonymousClass4<T> extends m.d implements Function0<T> {
        private /* synthetic */ String $getMediationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str) {
            super(0);
            this.$getMediationNetwork = str;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: L_, reason: merged with bridge method [inline-methods] */
        public final Parcelable invoke() {
            return AFj1iSDK.this.getMediationNetwork.getParcelableExtra(this.$getMediationNetwork);
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1iSDK$5, reason: invalid class name */
    @Metadata
    public static final class AnonymousClass5 extends m.d implements Function0<Boolean> {
        private /* synthetic */ String $getMediationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str) {
            super(0);
            this.$getMediationNetwork = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(AFj1iSDK.this.getMediationNetwork.hasExtra(this.$getMediationNetwork));
        }
    }

    public AFj1iSDK(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        this.getMediationNetwork = intent;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006f A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:23:0x0061, B:25:0x006f, B:26:0x0073), top: B:39:0x0061, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #0 {all -> 0x0074, blocks: (B:23:0x0061, B:25:0x006f, B:26:0x0073), top: B:39:0x0061, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0080 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:34:0x0082 A[Catch: all -> 0x0087, TRY_ENTER, TryCatch #1 {, blocks: (B:8:0x0011, B:20:0x0050, B:30:0x007c, B:34:0x0082, B:35:0x0086, B:28:0x0075, B:18:0x0049, B:7:0x000b, B:23:0x0061, B:25:0x006f, B:26:0x0073, B:11:0x002d, B:14:0x003d, B:15:0x0042, B:16:0x0047, B:4:0x0003), top: B:40:0x0003, inners: #0, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final <T> T getCurrencyIso4217Code(Function0<? extends T> function0, String str, T t, boolean z) {
        T tC;
        Object objC;
        o.a[] aVarArr;
        Throwable thA;
        synchronized (this.getMediationNetwork) {
            try {
                f.d dVar = f.f.f121a;
                tC = function0.invoke();
            } catch (Throwable th) {
                f.d dVar2 = f.f.f121a;
                tC = a.c.c(th);
            }
            o.a[] aVarArr2 = {m.f.a(ConcurrentModificationException.class), m.f.a(ArrayIndexOutOfBoundsException.class)};
            Throwable thA2 = f.f.a(tC);
            if (thA2 == null) {
                aVarArr = new o.a[]{m.f.a(RuntimeException.class)};
                thA = f.f.a(tC);
                if (thA != null) {
                    try {
                        if (kotlin.collections.m.a(aVarArr, m.f.a(thA.getClass()))) {
                            throw thA;
                        }
                        AFLogger.afErrorLog(str, thA, false, false);
                        tC = t;
                    } catch (Throwable th2) {
                        f.d dVar3 = f.f.f121a;
                        t = (T) a.c.c(th2);
                    }
                }
                if (!(tC instanceof f.e)) {
                    throw ((f.e) tC).f120a;
                }
            } else {
                try {
                    if (!kotlin.collections.m.a(aVarArr2, m.f.a(thA2.getClass()))) {
                        throw thA2;
                    }
                    if (z) {
                        objC = getCurrencyIso4217Code(function0, str, t, false);
                        tC = objC;
                    } else {
                        AFLogger.afErrorLog(str, thA2, false, false);
                        tC = t;
                    }
                    aVarArr = new o.a[]{m.f.a(RuntimeException.class)};
                    thA = f.f.a(tC);
                    if (thA != null) {
                        if (kotlin.collections.m.a(aVarArr, m.f.a(thA.getClass()))) {
                            throw thA;
                        }
                        AFLogger.afErrorLog(str, thA, false, false);
                        tC = t;
                    }
                    if (!(tC instanceof f.e)) {
                        throw ((f.e) tC).f120a;
                    }
                } catch (Throwable th3) {
                    f.d dVar4 = f.f.f121a;
                    objC = a.c.c(th3);
                }
            }
            throw th;
        }
        return (T) tC;
    }

    public final String AFAdRevenueData(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (String) getCurrencyIso4217Code(new AnonymousClass1(str), "Error while trying to read " + str + " extra from intent", null, true);
    }

    public final <T extends Parcelable> T J_(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (T) getCurrencyIso4217Code(new AnonymousClass4(str), "Error while trying to read " + str + " extra from intent", null, true);
    }

    public final Intent K_(String str, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        return (Intent) getCurrencyIso4217Code(new AnonymousClass2(str, j2), "Error while trying to write " + str + " extra to intent", null, true);
    }

    public final boolean getMediationNetwork(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Boolean bool = (Boolean) getCurrencyIso4217Code(new AnonymousClass5(str), "Error while trying to check presence of " + str + " extra from intent", Boolean.TRUE, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}
