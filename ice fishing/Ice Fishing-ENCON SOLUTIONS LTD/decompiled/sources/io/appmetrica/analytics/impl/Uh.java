package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;

/* loaded from: classes.dex */
public final class Uh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReporterConfig f5173a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0437gi f5174b;

    public Uh(C0437gi c0437gi, ReporterConfig reporterConfig) {
        this.f5174b = c0437gi;
        this.f5173a = reporterConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0437gi c0437gi = this.f5174b;
        ReporterConfig reporterConfig = this.f5173a;
        C0911z0 c0911z0 = c0437gi.f6082a;
        Context context = c0437gi.f6085d;
        c0911z0.getClass();
        C0885y0.a(context).f().a(reporterConfig);
    }
}
