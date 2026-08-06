package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;

/* loaded from: classes.dex */
public final class Th implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReporterConfig f5117a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0437gi f5118b;

    public Th(C0437gi c0437gi, ReporterConfig reporterConfig) {
        this.f5118b = c0437gi;
        this.f5117a = reporterConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0437gi c0437gi = this.f5118b;
        ReporterConfig reporterConfig = this.f5117a;
        C0911z0 c0911z0 = c0437gi.f6082a;
        Context context = c0437gi.f6085d;
        c0911z0.getClass();
        C0885y0.a(context).f().a(reporterConfig);
    }
}
