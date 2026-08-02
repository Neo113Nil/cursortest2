package io.appmetrica.analytics.impl;

import android.os.Bundle;
import defpackage.tls;
import defpackage.zy11;
import io.appmetrica.analytics.MviEventsReporter;
import io.appmetrica.analytics.MviMetricsReporter;
import io.appmetrica.analytics.MviScreen;
import io.appmetrica.analytics.MviTimestamp;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.impl.vf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0796vf extends Lambda implements tls {
    public final /* synthetic */ MviScreen a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ MviTimestamp c;
    public final /* synthetic */ MviMetricsReporter.StartupType d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0796vf(MviScreen mviScreen, Bundle bundle, MviTimestamp mviTimestamp, MviMetricsReporter.StartupType startupType, boolean z) {
        super(1);
        this.a = mviScreen;
        this.b = bundle;
        this.c = mviTimestamp;
        this.d = startupType;
        this.e = z;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((MviEventsReporter) obj).onCreate(this.a, this.b, this.c, this.d, this.e);
        return zy11.a;
    }
}
