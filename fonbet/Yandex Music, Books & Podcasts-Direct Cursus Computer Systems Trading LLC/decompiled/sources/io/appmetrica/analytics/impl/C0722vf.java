package io.appmetrica.analytics.impl;

import defpackage.b6e;
import defpackage.fai;
import defpackage.luo;
import defpackage.nkk;
import defpackage.tah;
import defpackage.tuh;
import defpackage.v75;
import defpackage.wge;
import defpackage.zqr;
import io.appmetrica.analytics.MviConfig;
import io.appmetrica.analytics.MviMetricsReporter;
import io.appmetrica.analytics.impl.C0722vf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* renamed from: io.appmetrica.analytics.impl.vf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0722vf {
    public final C0808yf a;

    public C0722vf(C0808yf c0808yf) {
        this.a = c0808yf;
    }

    public static final Map b(MviConfig.MetricWeightsProvider metricWeightsProvider) {
        String str;
        Map<MviMetricsReporter.KeyMetric, Double> metricWeights = metricWeightsProvider.getMetricWeights();
        LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(metricWeights.size()));
        Iterator<T> it = metricWeights.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            switch (Qf.a[((MviMetricsReporter.KeyMetric) entry.getKey()).ordinal()]) {
                case 1:
                    str = "FirstFrameDrawn";
                    break;
                case 2:
                    str = "FirstContentShown";
                    break;
                case 3:
                    str = "TimeToInteractive";
                    break;
                case 4:
                    str = "TotalBlockingTime";
                    break;
                case 5:
                    str = "FirstInputDelay";
                    break;
                case 6:
                    str = "InteractionToNextPaint";
                    break;
                default:
                    b6e.s();
                    return null;
            }
            linkedHashMap.put(str, entry.getValue());
        }
        return linkedHashMap;
    }

    public static final List c(MviConfig.ScorePointListProvider scorePointListProvider) {
        List<MviConfig.ScorePoint> scorePoints = scorePointListProvider.getScorePoints();
        ArrayList arrayList = new ArrayList(v75.o(scorePoints, 10));
        for (MviConfig.ScorePoint scorePoint : scorePoints) {
            arrayList.add(new luo(scorePoint.getValue(), scorePoint.getScore()));
        }
        return arrayList;
    }

    public static final List d(MviConfig.ScorePointListProvider scorePointListProvider) {
        List<MviConfig.ScorePoint> scorePoints = scorePointListProvider.getScorePoints();
        ArrayList arrayList = new ArrayList(v75.o(scorePoints, 10));
        for (MviConfig.ScorePoint scorePoint : scorePoints) {
            arrayList.add(new luo(scorePoint.getValue(), scorePoint.getScore()));
        }
        return arrayList;
    }

    public static final List e(MviConfig.ScorePointListProvider scorePointListProvider) {
        List<MviConfig.ScorePoint> scorePoints = scorePointListProvider.getScorePoints();
        ArrayList arrayList = new ArrayList(v75.o(scorePoints, 10));
        for (MviConfig.ScorePoint scorePoint : scorePoints) {
            arrayList.add(new luo(scorePoint.getValue(), scorePoint.getScore()));
        }
        return arrayList;
    }

    public static final List f(MviConfig.ScorePointListProvider scorePointListProvider) {
        List<MviConfig.ScorePoint> scorePoints = scorePointListProvider.getScorePoints();
        ArrayList arrayList = new ArrayList(v75.o(scorePoints, 10));
        for (MviConfig.ScorePoint scorePoint : scorePoints) {
            arrayList.add(new luo(scorePoint.getValue(), scorePoint.getScore()));
        }
        return arrayList;
    }

    public final C0578qf a(MviConfig mviConfig) {
        long j;
        zqr zqrVar;
        zqr zqrVar2;
        this.a.getClass();
        C0780xf c0780xf = new C0780xf();
        MviMetricsReporter customMetricsReporter = mviConfig.getCustomMetricsReporter();
        Ff ff = new Ff(customMetricsReporter != null ? new C0693uf(c0780xf, customMetricsReporter) : c0780xf);
        c0780xf.a = ff;
        nkk nkkVar = new nkk(mviConfig.getApplicationStartUptimeTimestamp().getUptimeMillis());
        tuh tuhVar = new tuh(15);
        zqr tuhVar2 = new tuh(15);
        zqr tuhVar3 = new tuh(14);
        zqr tuhVar4 = new tuh(13);
        zqr tuhVar5 = new tuh(16);
        zqr tuhVar6 = new tuh(17);
        zqr tuhVar7 = new tuh(18);
        zqr tuhVar8 = new tuh(19);
        zqr tuhVar9 = new tuh(20);
        long max = Math.max(mviConfig.getMinLongTaskDurationMillis(), 0L);
        long max2 = Math.max(mviConfig.getMinInteractiveWindowMillis(), 0L);
        long waitOptionalMetricsTimeoutMs = mviConfig.getWaitOptionalMetricsTimeoutMs();
        boolean isEarlyLongTaskMonitoringEnabled = mviConfig.isEarlyLongTaskMonitoringEnabled();
        boolean isChoreographerLongTaskMonitorEnabled = mviConfig.isChoreographerLongTaskMonitorEnabled();
        boolean isResponsivenessTrackingEnabled = mviConfig.isResponsivenessTrackingEnabled();
        ExecutorC0635sf executorC0635sf = new ExecutorC0635sf();
        final MviConfig.ScorePointListProvider firstContentfulPaintScoreIntervals = mviConfig.getFirstContentfulPaintScoreIntervals();
        if (firstContentfulPaintScoreIntervals != null) {
            j = max2;
            final int i = 0;
            zqrVar = new wge(new zqr() { // from class: wvw
                @Override // defpackage.zqr
                public final Object get() {
                    switch (i) {
                        case 0:
                            return C0722vf.d(firstContentfulPaintScoreIntervals);
                        case 1:
                            return C0722vf.e(firstContentfulPaintScoreIntervals);
                        case 2:
                            return C0722vf.f(firstContentfulPaintScoreIntervals);
                        case 3:
                            return C0722vf.a(firstContentfulPaintScoreIntervals);
                        case 4:
                            return C0722vf.b(firstContentfulPaintScoreIntervals);
                        default:
                            return C0722vf.c(firstContentfulPaintScoreIntervals);
                    }
                }
            }, new tuh(15));
        } else {
            j = max2;
            zqrVar = tuhVar;
        }
        final MviConfig.ScorePointListProvider largestContentfulPaintScoreIntervals = mviConfig.getLargestContentfulPaintScoreIntervals();
        if (largestContentfulPaintScoreIntervals != null) {
            final int i2 = 1;
            tuhVar2 = new wge(new zqr() { // from class: wvw
                @Override // defpackage.zqr
                public final Object get() {
                    switch (i2) {
                        case 0:
                            return C0722vf.d(largestContentfulPaintScoreIntervals);
                        case 1:
                            return C0722vf.e(largestContentfulPaintScoreIntervals);
                        case 2:
                            return C0722vf.f(largestContentfulPaintScoreIntervals);
                        case 3:
                            return C0722vf.a(largestContentfulPaintScoreIntervals);
                        case 4:
                            return C0722vf.b(largestContentfulPaintScoreIntervals);
                        default:
                            return C0722vf.c(largestContentfulPaintScoreIntervals);
                    }
                }
            }, new tuh(15));
        }
        final MviConfig.ScorePointListProvider totalBlockingTimeScoreIntervals = mviConfig.getTotalBlockingTimeScoreIntervals();
        if (totalBlockingTimeScoreIntervals != null) {
            final int i3 = 2;
            tuhVar3 = new wge(new zqr() { // from class: wvw
                @Override // defpackage.zqr
                public final Object get() {
                    switch (i3) {
                        case 0:
                            return C0722vf.d(totalBlockingTimeScoreIntervals);
                        case 1:
                            return C0722vf.e(totalBlockingTimeScoreIntervals);
                        case 2:
                            return C0722vf.f(totalBlockingTimeScoreIntervals);
                        case 3:
                            return C0722vf.a(totalBlockingTimeScoreIntervals);
                        case 4:
                            return C0722vf.b(totalBlockingTimeScoreIntervals);
                        default:
                            return C0722vf.c(totalBlockingTimeScoreIntervals);
                    }
                }
            }, new tuh(14));
        }
        final MviConfig.ScorePointListProvider timeToInteractiveScoreIntervals = mviConfig.getTimeToInteractiveScoreIntervals();
        if (timeToInteractiveScoreIntervals != null) {
            final int i4 = 3;
            zqrVar2 = new wge(new zqr() { // from class: wvw
                @Override // defpackage.zqr
                public final Object get() {
                    switch (i4) {
                        case 0:
                            return C0722vf.d(timeToInteractiveScoreIntervals);
                        case 1:
                            return C0722vf.e(timeToInteractiveScoreIntervals);
                        case 2:
                            return C0722vf.f(timeToInteractiveScoreIntervals);
                        case 3:
                            return C0722vf.a(timeToInteractiveScoreIntervals);
                        case 4:
                            return C0722vf.b(timeToInteractiveScoreIntervals);
                        default:
                            return C0722vf.c(timeToInteractiveScoreIntervals);
                    }
                }
            }, new tuh(13));
        } else {
            zqrVar2 = tuhVar4;
        }
        final MviConfig.ScorePointListProvider firstInputDelayScoreIntervals = mviConfig.getFirstInputDelayScoreIntervals();
        if (firstInputDelayScoreIntervals != null) {
            final int i5 = 4;
            tuhVar5 = new wge(new zqr() { // from class: wvw
                @Override // defpackage.zqr
                public final Object get() {
                    switch (i5) {
                        case 0:
                            return C0722vf.d(firstInputDelayScoreIntervals);
                        case 1:
                            return C0722vf.e(firstInputDelayScoreIntervals);
                        case 2:
                            return C0722vf.f(firstInputDelayScoreIntervals);
                        case 3:
                            return C0722vf.a(firstInputDelayScoreIntervals);
                        case 4:
                            return C0722vf.b(firstInputDelayScoreIntervals);
                        default:
                            return C0722vf.c(firstInputDelayScoreIntervals);
                    }
                }
            }, new tuh(16));
        }
        zqr zqrVar3 = tuhVar5;
        final MviConfig.ScorePointListProvider interactionToNextPaintScoreIntervals = mviConfig.getInteractionToNextPaintScoreIntervals();
        if (interactionToNextPaintScoreIntervals != null) {
            final int i6 = 5;
            tuhVar6 = new wge(new zqr() { // from class: wvw
                @Override // defpackage.zqr
                public final Object get() {
                    switch (i6) {
                        case 0:
                            return C0722vf.d(interactionToNextPaintScoreIntervals);
                        case 1:
                            return C0722vf.e(interactionToNextPaintScoreIntervals);
                        case 2:
                            return C0722vf.f(interactionToNextPaintScoreIntervals);
                        case 3:
                            return C0722vf.a(interactionToNextPaintScoreIntervals);
                        case 4:
                            return C0722vf.b(interactionToNextPaintScoreIntervals);
                        default:
                            return C0722vf.c(interactionToNextPaintScoreIntervals);
                    }
                }
            }, new tuh(17));
        }
        zqr zqrVar4 = tuhVar6;
        final MviConfig.MetricWeightsProvider metricWeightsProvider = mviConfig.getMetricWeightsProvider();
        if (metricWeightsProvider != null) {
            final int i7 = 0;
            tuhVar7 = new zqr() { // from class: xvw
                @Override // defpackage.zqr
                public final Object get() {
                    switch (i7) {
                        case 0:
                            return C0722vf.a(metricWeightsProvider);
                        default:
                            return C0722vf.b(metricWeightsProvider);
                    }
                }
            };
        }
        final MviConfig.MetricWeightsProvider metricWeightsProviderV2 = mviConfig.getMetricWeightsProviderV2();
        if (metricWeightsProviderV2 != null) {
            final int i8 = 1;
            tuhVar8 = new zqr() { // from class: xvw
                @Override // defpackage.zqr
                public final Object get() {
                    switch (i8) {
                        case 0:
                            return C0722vf.a(metricWeightsProviderV2);
                        default:
                            return C0722vf.b(metricWeightsProviderV2);
                    }
                }
            };
        }
        MviConfig.OptionalMetricsProvider optionalMetricsProvider = mviConfig.getOptionalMetricsProvider();
        if (optionalMetricsProvider != null) {
            tuhVar9 = new com.yandex.passport.sloth.ui.c(24, optionalMetricsProvider);
        }
        return new C0578qf(new fai(ff, nkkVar, max, j, zqrVar, tuhVar2, tuhVar3, zqrVar2, zqrVar3, zqrVar4, tuhVar7, tuhVar8, tuhVar9, waitOptionalMetricsTimeoutMs, isEarlyLongTaskMonitoringEnabled, isChoreographerLongTaskMonitorEnabled, isResponsivenessTrackingEnabled, executorC0635sf), ff);
    }

    public static final List b(MviConfig.ScorePointListProvider scorePointListProvider) {
        List<MviConfig.ScorePoint> scorePoints = scorePointListProvider.getScorePoints();
        ArrayList arrayList = new ArrayList(v75.o(scorePoints, 10));
        for (MviConfig.ScorePoint scorePoint : scorePoints) {
            arrayList.add(new luo(scorePoint.getValue(), scorePoint.getScore()));
        }
        return arrayList;
    }

    public static final List a(MviConfig.ScorePointListProvider scorePointListProvider) {
        List<MviConfig.ScorePoint> scorePoints = scorePointListProvider.getScorePoints();
        ArrayList arrayList = new ArrayList(v75.o(scorePoints, 10));
        for (MviConfig.ScorePoint scorePoint : scorePoints) {
            arrayList.add(new luo(scorePoint.getValue(), scorePoint.getScore()));
        }
        return arrayList;
    }

    public static final Map a(MviConfig.MetricWeightsProvider metricWeightsProvider) {
        String str;
        Map<MviMetricsReporter.KeyMetric, Double> metricWeights = metricWeightsProvider.getMetricWeights();
        LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(metricWeights.size()));
        Iterator<T> it = metricWeights.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            switch (Qf.a[((MviMetricsReporter.KeyMetric) entry.getKey()).ordinal()]) {
                case 1:
                    str = "FirstFrameDrawn";
                    break;
                case 2:
                    str = "FirstContentShown";
                    break;
                case 3:
                    str = "TimeToInteractive";
                    break;
                case 4:
                    str = "TotalBlockingTime";
                    break;
                case 5:
                    str = "FirstInputDelay";
                    break;
                case 6:
                    str = "InteractionToNextPaint";
                    break;
                default:
                    b6e.s();
                    return null;
            }
            linkedHashMap.put(str, entry.getValue());
        }
        return linkedHashMap;
    }

    public static final Set a(MviConfig.OptionalMetricsProvider optionalMetricsProvider) {
        String str;
        Set<MviMetricsReporter.KeyMetric> optionalMetrics = optionalMetricsProvider.getOptionalMetrics();
        ArrayList arrayList = new ArrayList(v75.o(optionalMetrics, 10));
        Iterator<T> it = optionalMetrics.iterator();
        while (it.hasNext()) {
            switch (Qf.a[((MviMetricsReporter.KeyMetric) it.next()).ordinal()]) {
                case 1:
                    str = "FirstFrameDrawn";
                    break;
                case 2:
                    str = "FirstContentShown";
                    break;
                case 3:
                    str = "TimeToInteractive";
                    break;
                case 4:
                    str = "TotalBlockingTime";
                    break;
                case 5:
                    str = "FirstInputDelay";
                    break;
                case 6:
                    str = "InteractionToNextPaint";
                    break;
                default:
                    b6e.s();
                    return null;
            }
            arrayList.add(str);
        }
        return CollectionsKt.A0(arrayList);
    }
}
