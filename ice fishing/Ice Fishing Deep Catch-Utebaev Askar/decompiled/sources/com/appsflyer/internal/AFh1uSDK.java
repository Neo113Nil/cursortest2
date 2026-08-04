package com.appsflyer.internal;

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
public abstract class AFh1uSDK {
    private final boolean shouldExtendMsg;
    public static final Companion Companion = new Companion(null);
    public static long AFAdRevenueData = System.currentTimeMillis();

    @Metadata
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ void d$default(AFh1uSDK aFh1uSDK, AFh1vSDK aFh1vSDK, String str, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        aFh1uSDK.d(aFh1vSDK, str, z);
    }

    public static /* synthetic */ void e$default(AFh1uSDK aFh1uSDK, AFh1vSDK aFh1vSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        aFh1uSDK.e(aFh1vSDK, str, th, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? true : z2, (i2 & 32) != 0 ? true : z3, (i2 & 64) != 0 ? true : z4);
    }

    public static /* synthetic */ void i$default(AFh1uSDK aFh1uSDK, AFh1vSDK aFh1vSDK, String str, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        aFh1uSDK.i(aFh1vSDK, str, z);
    }

    public static /* synthetic */ void v$default(AFh1uSDK aFh1uSDK, AFh1vSDK aFh1vSDK, String str, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        aFh1uSDK.v(aFh1vSDK, str, z);
    }

    public static /* synthetic */ void w$default(AFh1uSDK aFh1uSDK, AFh1vSDK aFh1vSDK, String str, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        aFh1uSDK.w(aFh1vSDK, str, z);
    }

    public final void d(AFh1vSDK aFh1vSDK, String str) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        d$default(this, aFh1vSDK, str, false, 4, null);
    }

    public final void e(AFh1vSDK aFh1vSDK, String str, Throwable th) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFh1vSDK, str, th, false, false, false, false, 120, null);
    }

    public void force(AFh1vSDK aFh1vSDK, String str) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public final String getRevenue(String str, AFh1vSDK aFh1vSDK) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        if (str == null || kotlin.text.o.b(str)) {
            str = "null";
        }
        String strWithTag$SDK_prodRelease = withTag$SDK_prodRelease(str, aFh1vSDK);
        if (!getShouldExtendMsg()) {
            return strWithTag$SDK_prodRelease;
        }
        return "(" + (System.currentTimeMillis() - AFAdRevenueData) + ") [" + Thread.currentThread().getName() + "] " + strWithTag$SDK_prodRelease;
    }

    public boolean getShouldExtendMsg() {
        return this.shouldExtendMsg;
    }

    public final void i(AFh1vSDK aFh1vSDK, String str) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        i$default(this, aFh1vSDK, str, false, 4, null);
    }

    public final void v(AFh1vSDK aFh1vSDK, String str) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        v$default(this, aFh1vSDK, str, false, 4, null);
    }

    public final void w(AFh1vSDK aFh1vSDK, String str) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        w$default(this, aFh1vSDK, str, false, 4, null);
    }

    public final String withTag$SDK_prodRelease(String str, AFh1vSDK aFh1vSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        return "[" + aFh1vSDK.AFAdRevenueData + "] " + str;
    }

    public void d(AFh1vSDK aFh1vSDK, String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public final void e(AFh1vSDK aFh1vSDK, String str, Throwable th, boolean z) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFh1vSDK, str, th, z, false, false, false, 112, null);
    }

    public void i(AFh1vSDK aFh1vSDK, String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public void v(AFh1vSDK aFh1vSDK, String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public void w(AFh1vSDK aFh1vSDK, String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public final void e(AFh1vSDK aFh1vSDK, String str, Throwable th, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFh1vSDK, str, th, z, z2, false, false, 96, null);
    }

    public final void e(AFh1vSDK aFh1vSDK, String str, Throwable th, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFh1vSDK, str, th, z, z2, z3, false, 64, null);
    }

    public void e(AFh1vSDK aFh1vSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
    }
}
