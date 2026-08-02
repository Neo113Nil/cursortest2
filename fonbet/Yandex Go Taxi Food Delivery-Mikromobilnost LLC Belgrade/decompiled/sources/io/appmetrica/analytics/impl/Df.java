package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.tls;
import io.appmetrica.analytics.MviEventsReporter;
import io.appmetrica.analytics.MviMetricsReporter;
import io.appmetrica.analytics.MviScreen;
import io.appmetrica.analytics.MviTimestamp;
import io.appmetrica.analytics.MviTouchEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes9.dex */
public final class Df implements MviEventsReporter {
    public final ArrayList a = new ArrayList();

    public final void a(MviEventsReporter mviEventsReporter) {
        if (!jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
            ny61.r("Should be called on main thread");
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((tls) it.next()).invoke(mviEventsReporter);
        }
        this.a.clear();
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void confirmReporting(MviScreen mviScreen) {
        a(new C0709sf(mviScreen));
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onCreate(MviScreen mviScreen, Bundle bundle, MviTimestamp mviTimestamp, MviMetricsReporter.StartupType startupType, boolean z) {
        a(new C0796vf(mviScreen, bundle, mviTimestamp, startupType, z));
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onDestroy(MviScreen mviScreen) {
        a(new C0825wf(mviScreen));
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onFirstFrameDrawn(MviScreen mviScreen, MviTimestamp mviTimestamp) {
        a(new C0854xf(mviScreen, mviTimestamp));
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onFullyDrawn(MviScreen mviScreen, MviTimestamp mviTimestamp) {
        a(new C0883yf(mviScreen, mviTimestamp));
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onKeyEvent(MviScreen mviScreen, KeyEvent keyEvent) {
        a(new C0912zf(mviScreen, keyEvent));
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onStart(MviScreen mviScreen, MviTimestamp mviTimestamp) {
        a(new Af(mviScreen, mviTimestamp));
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onStop(MviScreen mviScreen) {
        a(new Bf(mviScreen));
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onTouchEvent(MviScreen mviScreen, MviTouchEvent mviTouchEvent) {
        a(new Cf(mviScreen, mviTouchEvent));
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void confirmReporting(MviScreen mviScreen, Set<String> set) {
        a(new C0738tf(mviScreen, set));
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onCreate(MviScreen mviScreen, Bundle bundle, MviTimestamp mviTimestamp, MviMetricsReporter.StartupType startupType) {
        a(new C0767uf(mviScreen, bundle, mviTimestamp, startupType));
    }

    public final void a(tls tlsVar) {
        if (jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
            this.a.add(tlsVar);
        } else {
            ny61.r("Should be called on main thread");
        }
    }
}
