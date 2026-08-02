package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;

/* renamed from: io.appmetrica.analytics.impl.de, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0202de extends AbstractC0768x3 {
    public C0202de(Context context, Xh xh, ReporterConfig reporterConfig, C0237el c0237el, Ua ua) {
        this(context, c0237el, reporterConfig, new C0351ik(xh, new CounterConfiguration(reporterConfig), new L9(new C0702uo(LoggerStorage.getOrCreatePublicLogger(reporterConfig.apiKey), "Crash Environment")), reporterConfig.userProfileID), ua, R4.l().n(), new Wq(), new C0322hj(), new C0512o7(), new C0303h0(), new C0291gh(ua));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0768x3
    public final String j() {
        return "[ManualReporter]";
    }

    public C0202de(Context context, C0237el c0237el, ReporterConfig reporterConfig, C0351ik c0351ik, Ua ua, C0396k7 c0396k7, Wq wq, C0322hj c0322hj, C0512o7 c0512o7, C0303h0 c0303h0, C0291gh c0291gh) {
        super(context, c0237el, c0351ik, ua, c0396k7, wq, c0322hj, c0512o7, c0303h0, c0291gh);
        C0777xc o = R4.l().o();
        if (o != null) {
            o.a(reporterConfig.apiKey, new C0230ee(context, reporterConfig, c0237el), this);
        }
    }
}
