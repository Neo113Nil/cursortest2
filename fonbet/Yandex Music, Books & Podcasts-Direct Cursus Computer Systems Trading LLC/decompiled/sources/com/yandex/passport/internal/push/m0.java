package com.yandex.passport.internal.push;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.ve;
import defpackage.u75;
import defpackage.uah;
import io.appmetrica.analytics.IReporterYandex;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes4.dex */
public abstract class m0 {
    public static final n0 a = new n0();

    public static final boolean b(h0 h0Var) {
        h0Var.getClass();
        Long l = h0Var.r;
        return System.currentTimeMillis() < (l != null ? l.longValue() : Long.MAX_VALUE);
    }

    public static void d(IReporterYandex iReporterYandex, Bundle bundle, long j, j0 j0Var) {
        String str;
        bundle.getClass();
        j0Var.getClass();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            str = bundle.getString("push_id");
        } catch (Exception unused) {
            str = null;
        }
        if (str == null) {
            str = "unknown";
        }
        iReporterYandex.reportEvent("push_loading_time", uah.e(new Pair("push_id", str), new Pair("host_process_started", Long.valueOf(j)), new Pair("passport_process_started", Long.valueOf(j0Var.b)), new Pair("passport_process_finished", Long.valueOf(j0Var.c)), new Pair("host_process_finished", Long.valueOf(elapsedRealtimeNanos))));
    }

    public static final List e(c0 c0Var) {
        c0Var.getClass();
        return u75.h(new ve(c0Var.d, 13), new com.yandex.passport.internal.report.c("pushService", c0Var.f), new com.yandex.passport.internal.report.c("eventName", String.valueOf(c0Var.e)), new com.yandex.passport.internal.report.c("timestamp", String.valueOf(c0Var.q)), new com.yandex.passport.internal.report.c(Long.valueOf(c0Var.a)), new ve(c0Var.c, 11), new com.yandex.passport.internal.report.c("isSilent", String.valueOf(c0Var.p)), new ff(c0Var.b, 14), new com.yandex.passport.internal.report.c("expireAt", String.valueOf(c0Var.i)));
    }

    public static final List f(h0 h0Var) {
        h0Var.getClass();
        return u75.h(new ve(h0Var.a, 13), new com.yandex.passport.internal.report.c("passpAmProto", String.valueOf(h0Var.b)), new com.yandex.passport.internal.report.c("pushService", String.valueOf(h0Var.c)), new com.yandex.passport.internal.report.c("eventName", String.valueOf(h0Var.d)), new com.yandex.passport.internal.report.c("timestamp", String.valueOf(h0Var.e)), new com.yandex.passport.internal.report.c(Long.valueOf(h0Var.f)), new ve(h0Var.g, 11), new com.yandex.passport.internal.report.c("minAmVersion", String.valueOf(h0Var.k)), new com.yandex.passport.internal.report.c("isSilent", String.valueOf(h0Var.l)), new com.yandex.passport.internal.report.c("requireWebAuth", String.valueOf(h0Var.n)), new ff(h0Var.p, 14), new com.yandex.passport.internal.report.c("showCodeInNotification", String.valueOf(h0Var.q)), new com.yandex.passport.internal.report.c("expireAt", String.valueOf(h0Var.r)));
    }

    public abstract Intent a();

    public abstract x c();
}
