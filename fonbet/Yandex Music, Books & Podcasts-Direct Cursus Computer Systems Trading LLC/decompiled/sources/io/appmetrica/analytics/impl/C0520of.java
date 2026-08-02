package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import defpackage.xq0;
import io.appmetrica.analytics.MviEventsReporter;
import io.appmetrica.analytics.MviMetricsReporter;
import io.appmetrica.analytics.MviScreen;
import io.appmetrica.analytics.MviTimestamp;
import io.appmetrica.analytics.MviTouchEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.of, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0520of implements MviEventsReporter {
    public final ArrayList a = new ArrayList();

    public final void a(@NotNull MviEventsReporter mviEventsReporter) {
        if (!Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
            xq0.q("Should be called on main thread");
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(mviEventsReporter);
        }
        this.a.clear();
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void confirmReporting(@NotNull MviScreen mviScreen) {
        a(new C0203df(mviScreen));
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onCreate(@NotNull MviScreen mviScreen, Bundle bundle, @NotNull MviTimestamp mviTimestamp, MviMetricsReporter.StartupType startupType, boolean z) {
        a(new C0289gf(mviScreen, bundle, mviTimestamp, startupType, z));
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onDestroy(@NotNull MviScreen mviScreen) {
        a(new C0318hf(mviScreen));
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onFirstFrameDrawn(@NotNull MviScreen mviScreen, @NotNull MviTimestamp mviTimestamp) {
        a(new Cif(mviScreen, mviTimestamp));
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onFullyDrawn(@NotNull MviScreen mviScreen, @NotNull MviTimestamp mviTimestamp) {
        a(new C0375jf(mviScreen, mviTimestamp));
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onKeyEvent(@NotNull MviScreen mviScreen, @NotNull KeyEvent keyEvent) {
        a(new C0404kf(mviScreen, keyEvent));
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onStart(@NotNull MviScreen mviScreen, @NotNull MviTimestamp mviTimestamp) {
        a(new C0433lf(mviScreen, mviTimestamp));
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onStop(@NotNull MviScreen mviScreen) {
        a(new C0462mf(mviScreen));
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onTouchEvent(@NotNull MviScreen mviScreen, @NotNull MviTouchEvent mviTouchEvent) {
        a(new C0491nf(mviScreen, mviTouchEvent));
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void confirmReporting(@NotNull MviScreen mviScreen, @NotNull Set<String> set) {
        a(new C0231ef(mviScreen, set));
    }

    @Override // io.appmetrica.analytics.MviEventsReporter
    public final void onCreate(@NotNull MviScreen mviScreen, Bundle bundle, @NotNull MviTimestamp mviTimestamp, MviMetricsReporter.StartupType startupType) {
        a(new C0260ff(mviScreen, bundle, mviTimestamp, startupType));
    }

    public final void a(Function1 function1) {
        if (Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
            this.a.add(function1);
        } else {
            xq0.q("Should be called on main thread");
        }
    }
}
