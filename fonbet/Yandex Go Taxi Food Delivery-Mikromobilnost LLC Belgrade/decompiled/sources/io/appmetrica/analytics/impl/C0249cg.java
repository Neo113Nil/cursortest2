package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ny61;
import io.appmetrica.analytics.MviEventsReporter;
import io.appmetrica.analytics.MviMetricsReporter;
import io.appmetrica.analytics.MviScreen;
import io.appmetrica.analytics.MviTimestamp;
import io.appmetrica.analytics.MviTouchEvent;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.cg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0249cg implements MviEventsReporter {
    public static MviEventsReporter b;
    public static final C0249cg a = new C0249cg();
    public static final i3y c = kotlin.a.a(Xf.a);

    public static MviEventsReporter b() {
        if (jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
            MviEventsReporter mviEventsReporter = b;
            return mviEventsReporter == null ? (Df) c.getValue() : mviEventsReporter;
        }
        ny61.r("Should be called on main thread");
        return null;
    }

    public final void a(C0306eg c0306eg, Ff ff) {
        AbstractC0364gg.a(new C0191ag(c0306eg, ff));
    }

    public final void c() {
        AbstractC0364gg.a(C0220bg.a);
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void confirmReporting(MviScreen mviScreen) {
        b().confirmReporting(mviScreen);
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onCreate(MviScreen mviScreen, Bundle bundle, MviTimestamp mviTimestamp, MviMetricsReporter.StartupType startupType) {
        b().onCreate(mviScreen, bundle, mviTimestamp, startupType);
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onDestroy(MviScreen mviScreen) {
        b().onDestroy(mviScreen);
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onFirstFrameDrawn(MviScreen mviScreen, MviTimestamp mviTimestamp) {
        AbstractC0364gg.a(new Yf(mviScreen, mviTimestamp));
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onFullyDrawn(MviScreen mviScreen, MviTimestamp mviTimestamp) {
        AbstractC0364gg.a(new Zf(mviScreen, mviTimestamp));
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onKeyEvent(MviScreen mviScreen, KeyEvent keyEvent) {
        b().onKeyEvent(mviScreen, keyEvent);
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onStart(MviScreen mviScreen, MviTimestamp mviTimestamp) {
        b().onStart(mviScreen, mviTimestamp);
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onStop(MviScreen mviScreen) {
        b().onStop(mviScreen);
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onTouchEvent(MviScreen mviScreen, MviTouchEvent mviTouchEvent) {
        b().onTouchEvent(mviScreen, mviTouchEvent);
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void confirmReporting(MviScreen mviScreen, Set<String> set) {
        b().confirmReporting(mviScreen, set);
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onCreate(MviScreen mviScreen, Bundle bundle, MviTimestamp mviTimestamp, MviMetricsReporter.StartupType startupType, boolean z) {
        b().onCreate(mviScreen, bundle, mviTimestamp, startupType, z);
    }

    public static final /* synthetic */ MviEventsReporter a(C0249cg c0249cg) {
        c0249cg.getClass();
        return b();
    }

    public static final Df b(C0249cg c0249cg) {
        c0249cg.getClass();
        return (Df) c.getValue();
    }
}
