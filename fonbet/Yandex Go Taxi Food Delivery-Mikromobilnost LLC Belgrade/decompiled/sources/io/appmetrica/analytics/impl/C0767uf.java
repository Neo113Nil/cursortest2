package io.appmetrica.analytics.impl;

import android.os.Bundle;
import defpackage.tls;
import defpackage.zy11;
import io.appmetrica.analytics.MviEventsReporter;
import io.appmetrica.analytics.MviMetricsReporter;
import io.appmetrica.analytics.MviScreen;
import io.appmetrica.analytics.MviTimestamp;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.impl.uf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0767uf extends Lambda implements tls {
    public final /* synthetic */ MviScreen a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ MviTimestamp c;
    public final /* synthetic */ MviMetricsReporter.StartupType d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0767uf(MviScreen mviScreen, Bundle bundle, MviTimestamp mviTimestamp, MviMetricsReporter.StartupType startupType) {
        super(1);
        this.a = mviScreen;
        this.b = bundle;
        this.c = mviTimestamp;
        this.d = startupType;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((MviEventsReporter) obj).onCreate(this.a, this.b, this.c, this.d);
        return zy11.a;
    }
}
