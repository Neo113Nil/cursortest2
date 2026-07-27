package com.appsflyer.internal;

import androidx.compose.material3.MenuKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0014\b'\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJO\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0016\u0010\fJ)\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0017\u0010\fJ)\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0018\u0010\fJ\u001d\u0010\u001a\u001a\u00020\u0006*\u0004\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\u0004H\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001c\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\b8\u0017X\u0096D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lcom/appsflyer/internal/AFh1uSDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFh1vSDK;", "tag", "", "msg", "", "shouldRemoteDebug", "", "d", "(Lcom/appsflyer/internal/AFh1vSDK;Ljava/lang/String;Z)V", "", "throwable", "printMsg", "printThrowable", "shouldReportToExManager", "e", "(Lcom/appsflyer/internal/AFh1vSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "force", "(Lcom/appsflyer/internal/AFh1vSDK;Ljava/lang/String;)V", "i", "v", "w", "p0", "getRevenue", "(Ljava/lang/String;Lcom/appsflyer/internal/AFh1vSDK;)Ljava/lang/String;", "withTag$SDK_prodRelease", "shouldExtendMsg", "Z", "getShouldExtendMsg", "()Z", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class AFh1uSDK {
    private final boolean shouldExtendMsg;
    public static long AFAdRevenueData = System.currentTimeMillis();

    public void d(AFh1vSDK tag, String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    public void e(AFh1vSDK tag, String msg, Throwable throwable, boolean printMsg, boolean printThrowable, boolean shouldReportToExManager, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        Intrinsics.checkNotNullParameter(throwable, "");
    }

    public void force(AFh1vSDK tag, String msg) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    public void i(AFh1vSDK tag, String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    public void v(AFh1vSDK tag, String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    public void w(AFh1vSDK tag, String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    public boolean getShouldExtendMsg() {
        return this.shouldExtendMsg;
    }

    public static /* synthetic */ void d$default(AFh1uSDK aFh1uSDK, AFh1vSDK aFh1vSDK, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        aFh1uSDK.d(aFh1vSDK, str, z);
    }

    public static /* synthetic */ void e$default(AFh1uSDK aFh1uSDK, AFh1vSDK aFh1vSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        aFh1uSDK.e(aFh1vSDK, str, th, (i & 8) != 0 ? true : z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? true : z3, (i & 64) != 0 ? true : z4);
    }

    public static /* synthetic */ void i$default(AFh1uSDK aFh1uSDK, AFh1vSDK aFh1vSDK, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        aFh1uSDK.i(aFh1vSDK, str, z);
    }

    public static /* synthetic */ void w$default(AFh1uSDK aFh1uSDK, AFh1vSDK aFh1vSDK, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        aFh1uSDK.w(aFh1vSDK, str, z);
    }

    public static /* synthetic */ void v$default(AFh1uSDK aFh1uSDK, AFh1vSDK aFh1vSDK, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        aFh1uSDK.v(aFh1vSDK, str, z);
    }

    protected final String getRevenue(String str, AFh1vSDK aFh1vSDK) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        String str2 = str;
        if (str2 == null || StringsKt.isBlank(str2)) {
            str = "null";
        }
        String withTag$SDK_prodRelease = withTag$SDK_prodRelease(str, aFh1vSDK);
        if (!getShouldExtendMsg()) {
            return withTag$SDK_prodRelease;
        }
        return "(" + (System.currentTimeMillis() - AFAdRevenueData) + ") [" + Thread.currentThread().getName() + "] " + withTag$SDK_prodRelease;
    }

    public final String withTag$SDK_prodRelease(String str, AFh1vSDK aFh1vSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        return "[" + aFh1vSDK.getMediationNetwork + "] " + str;
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

    public final void i(AFh1vSDK aFh1vSDK, String str) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        i$default(this, aFh1vSDK, str, false, 4, null);
    }

    public final void e(AFh1vSDK aFh1vSDK, String str, Throwable th) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFh1vSDK, str, th, false, false, false, false, MenuKt.InTransitionDuration, null);
    }

    public final void e(AFh1vSDK aFh1vSDK, String str, Throwable th, boolean z) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFh1vSDK, str, th, z, false, false, false, 112, null);
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

    public final void d(AFh1vSDK aFh1vSDK, String str) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        d$default(this, aFh1vSDK, str, false, 4, null);
    }
}
