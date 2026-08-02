package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.PulseConfig;
import io.appmetrica.analytics.ReporterYandexExtension;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.qe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC0651qe extends InterfaceC0446jc, ReporterYandexExtension {
    /* synthetic */ void a(Activity activity);

    /* synthetic */ void a(AnrListener anrListener);

    /* synthetic */ void a(ExternalAttribution externalAttribution);

    void a(PulseConfig pulseConfig);

    /* synthetic */ void a(ls lsVar);

    /* synthetic */ void a(EnumC0578o enumC0578o);

    /* synthetic */ void a(String str, boolean z);

    /* synthetic */ void b();

    /* synthetic */ void b(Activity activity);

    /* synthetic */ List c();
}
