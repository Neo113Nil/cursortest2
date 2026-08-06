package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;

/* renamed from: io.appmetrica.analytics.impl.yc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0897yc extends I2 {
    public C0897yc(Context context, Bf bf, ReporterConfig reporterConfig, C0851wi c0851wi, M9 m9) {
        this(context, c0851wi, new Fh(bf, new CounterConfiguration(reporterConfig), new D8(new C0724rl(LoggerStorage.getOrCreatePublicLogger(reporterConfig.apiKey), "Crash Environment")), reporterConfig.userProfileID), m9, C0294b4.l().n(), new Rn(), new Eg(), new C0813v6(), new C0342d0(), new Je(m9));
    }

    @Override // io.appmetrica.analytics.impl.I2
    public final String j() {
        return "[ManualReporter]";
    }

    public C0897yc(Context context, C0851wi c0851wi, Fh fh, M9 m9, C0709r6 c0709r6, Rn rn, Eg eg, C0813v6 c0813v6, C0342d0 c0342d0, Je je) {
        super(context, c0851wi, fh, m9, c0709r6, rn, eg, c0813v6, c0342d0, je);
        C0294b4.l().getClass();
    }
}
