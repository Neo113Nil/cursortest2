package ru.yandex.taxi.perf;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import defpackage.by2;
import defpackage.cy2;
import defpackage.jl40;
import defpackage.w511;
import io.appmetrica.analytics.AppMetricaYandex;
import io.appmetrica.analytics.MviEventsReporter;
import io.appmetrica.analytics.MviMetricsReporter;
import io.appmetrica.analytics.MviScreen;
import io.appmetrica.analytics.MviTimestamp;

/* loaded from: classes9.dex */
public final class c implements by2 {
    public final ComponentActivity a;
    public final b b;
    public final MviEventsReporter c = AppMetricaYandex.getMviEventsReporter();
    public final MviScreen.MviScreenActivity d;

    public c(ComponentActivity componentActivity, b bVar) {
        this.a = componentActivity;
        this.b = bVar;
        this.d = new MviScreen.MviScreenActivity(componentActivity);
    }

    public final void a(Bundle bundle, long j) {
        Intent intent;
        b bVar = this.b;
        int i = bVar.f;
        bVar.f = i + 1;
        MviMetricsReporter.StartupType startupType = null;
        boolean z = false;
        if (i == 0) {
            ComponentActivity componentActivity = this.a;
            Intent intent2 = componentActivity.getIntent();
            if (jl40.l(intent2 != null ? intent2.getAction() : null, "android.intent.action.MAIN") && (intent = componentActivity.getIntent()) != null && intent.hasCategory("android.intent.category.LAUNCHER")) {
                z = true;
            }
        }
        bVar.e = z;
        bVar.c = j;
        bVar.f(StartupEvent.ActivityCreated);
        int i2 = cy2.a[bVar.b().ordinal()];
        if (i2 == 1) {
            startupType = MviMetricsReporter.StartupType.COLD;
        } else if (i2 == 2) {
            startupType = MviMetricsReporter.StartupType.WARM;
        } else if (i2 == 3) {
            startupType = MviMetricsReporter.StartupType.HOT;
        } else if (i2 != 4) {
            w511.b();
            return;
        }
        if (startupType != null) {
            this.c.onCreate(this.d, bundle, MviTimestamp.now(), startupType);
        }
    }

    public final void b(long j) {
        b bVar = this.b;
        if (bVar.b() == AppStartupInfoType.Abandoned) {
            return;
        }
        bVar.d = j;
        bVar.f(StartupEvent.ActivityStarted);
        this.c.onStart(this.d, MviTimestamp.now());
    }
}
