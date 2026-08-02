package com.yandex.passport.internal.report;

import defpackage.f1d;
import defpackage.mlr;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class df extends ef {
    public final Throwable d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public df(Throwable th) {
        super(th, "host.crash.uncaught: ".concat(r0 != null ? mlr.K(50, r0) : "unknown"));
        String message = th.getMessage();
        this.d = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof df) && Intrinsics.d(this.d, ((df) obj).d);
    }

    public final int hashCode() {
        Throwable th = this.d;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public final String toString() {
        return f1d.k(new StringBuilder("HostCrashUncaught(exception="), this.d, ')');
    }
}
