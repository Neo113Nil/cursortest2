package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import defpackage.c82;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.sls;
import io.appmetrica.analytics.MviMetricsReporter;

/* renamed from: io.appmetrica.analytics.impl.gg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0364gg {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static MviMetricsReporter.KeyMetric a(String str) {
        switch (str.hashCode()) {
            case -1108178707:
                if (str.equals("FirstFrameDrawn")) {
                    return MviMetricsReporter.KeyMetric.FIRST_CONTENTFUL_PAINT;
                }
                break;
            case -975769734:
                if (str.equals("TimeToInteractive")) {
                    return MviMetricsReporter.KeyMetric.TIME_TO_INTERACTIVE;
                }
                break;
            case -827002978:
                if (str.equals("InteractionToNextPaint")) {
                    return MviMetricsReporter.KeyMetric.INTERACTION_TO_NEXT_PAINT;
                }
                break;
            case 526629350:
                if (str.equals("TotalBlockingTime")) {
                    return MviMetricsReporter.KeyMetric.TOTAL_BLOCKING_TIME;
                }
                break;
            case 548637321:
                if (str.equals("FirstInputDelay")) {
                    return MviMetricsReporter.KeyMetric.FIRST_INPUT_DELAY;
                }
                break;
            case 1538138824:
                if (str.equals("FirstContentShown")) {
                    return MviMetricsReporter.KeyMetric.LARGEST_CONTENTFUL_PAINT;
                }
                break;
        }
        ny61.f("invalid key metric string: ".concat(str));
        return null;
    }

    public static final void b(sls slsVar) {
        slsVar.invoke();
    }

    public static void a(sls slsVar) {
        if (jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
            slsVar.invoke();
        } else {
            new Handler(Looper.getMainLooper()).post(new c82(7, slsVar));
        }
    }
}
