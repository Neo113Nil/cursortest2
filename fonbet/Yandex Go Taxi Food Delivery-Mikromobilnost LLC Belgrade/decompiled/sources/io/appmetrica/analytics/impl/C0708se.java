package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;

/* renamed from: io.appmetrica.analytics.impl.se, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0708se extends AbstractC0842x3 {
    public C0708se(Context context, C0597oi c0597oi, ReporterConfig reporterConfig, C0600ol c0600ol, C0244cb c0244cb) {
        this(context, c0600ol, reporterConfig, new C0714sk(c0597oi, new CounterConfiguration(reporterConfig), new R9(new Po(LoggerStorage.getOrCreatePublicLogger(reporterConfig.apiKey), "Crash Environment")), reporterConfig.userProfileID), c0244cb, V4.l().n(), new C0635pr(), new C0569nj(), new C0730t7(), new C0434j0(), new C0827wh(c0244cb));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0842x3
    public final String j() {
        return "[ManualReporter]";
    }

    public C0708se(Context context, C0600ol c0600ol, ReporterConfig reporterConfig, C0714sk c0714sk, C0244cb c0244cb, C0615p7 c0615p7, C0635pr c0635pr, C0569nj c0569nj, C0730t7 c0730t7, C0434j0 c0434j0, C0827wh c0827wh) {
        super(context, c0600ol, c0714sk, c0244cb, c0615p7, c0635pr, c0569nj, c0730t7, c0434j0, c0827wh);
        Nc o = V4.l().o();
        if (o != null) {
            o.a(reporterConfig.apiKey, new C0737te(context, reporterConfig, c0600ol), this);
        }
    }
}
