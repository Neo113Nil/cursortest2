package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import defpackage.arf;
import defpackage.btf;
import defpackage.xq0;
import io.appmetrica.analytics.MviEventsReporter;
import io.appmetrica.analytics.MviMetricsReporter;
import io.appmetrica.analytics.MviScreen;
import io.appmetrica.analytics.MviTimestamp;
import io.appmetrica.analytics.MviTouchEvent;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Nf implements MviEventsReporter {
    public static MviEventsReporter b;

    @NotNull
    public static final Nf a = new Nf();
    public static final arf c = btf.b(If.a);

    public static MviEventsReporter b() {
        if (Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
            MviEventsReporter mviEventsReporter = b;
            return mviEventsReporter == null ? (C0520of) c.getValue() : mviEventsReporter;
        }
        xq0.q("Should be called on main thread");
        return null;
    }

    public final void a(@NotNull Pf pf, @NotNull C0578qf c0578qf) {
        Rf.a(new Lf(pf, c0578qf));
    }

    public final void c() {
        Rf.a(Mf.a);
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void confirmReporting(@NotNull MviScreen mviScreen) {
        b().confirmReporting(mviScreen);
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onCreate(@NotNull MviScreen mviScreen, Bundle bundle, @NotNull MviTimestamp mviTimestamp, MviMetricsReporter.StartupType startupType, boolean z) {
        b().onCreate(mviScreen, bundle, mviTimestamp, startupType, z);
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onDestroy(@NotNull MviScreen mviScreen) {
        b().onDestroy(mviScreen);
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onFirstFrameDrawn(@NotNull MviScreen mviScreen, @NotNull MviTimestamp mviTimestamp) {
        Rf.a(new Jf(mviScreen, mviTimestamp));
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onFullyDrawn(@NotNull MviScreen mviScreen, @NotNull MviTimestamp mviTimestamp) {
        Rf.a(new Kf(mviScreen, mviTimestamp));
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onKeyEvent(@NotNull MviScreen mviScreen, @NotNull KeyEvent keyEvent) {
        b().onKeyEvent(mviScreen, keyEvent);
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onStart(@NotNull MviScreen mviScreen, @NotNull MviTimestamp mviTimestamp) {
        b().onStart(mviScreen, mviTimestamp);
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onStop(@NotNull MviScreen mviScreen) {
        b().onStop(mviScreen);
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onTouchEvent(@NotNull MviScreen mviScreen, @NotNull MviTouchEvent mviTouchEvent) {
        b().onTouchEvent(mviScreen, mviTouchEvent);
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void confirmReporting(@NotNull MviScreen mviScreen, @NotNull Set<String> set) {
        b().confirmReporting(mviScreen, set);
    }

    public static final /* synthetic */ MviEventsReporter a(Nf nf) {
        nf.getClass();
        return b();
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onCreate(@NotNull MviScreen mviScreen, Bundle bundle, @NotNull MviTimestamp mviTimestamp, MviMetricsReporter.StartupType startupType) {
        b().onCreate(mviScreen, bundle, mviTimestamp, startupType);
    }

    public static final C0520of b(Nf nf) {
        nf.getClass();
        return (C0520of) c.getValue();
    }
}
