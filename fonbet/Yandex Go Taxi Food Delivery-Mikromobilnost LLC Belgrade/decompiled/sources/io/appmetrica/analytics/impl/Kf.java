package io.appmetrica.analytics.impl;

import defpackage.ak00;
import defpackage.fv20;
import defpackage.gw00;
import defpackage.lwa0;
import defpackage.pbp0;
import defpackage.qbp0;
import defpackage.s59;
import defpackage.tcc;
import defpackage.thw0;
import defpackage.vg10;
import defpackage.w511;
import io.appmetrica.analytics.MviConfig;
import io.appmetrica.analytics.MviMetricsReporter;
import io.appmetrica.analytics.impl.Kf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes9.dex */
public final class Kf {
    public final Nf a;

    public Kf(Nf nf) {
        this.a = nf;
    }

    public static final Map b(MviConfig.MetricWeightsProvider metricWeightsProvider) {
        String str;
        Map<MviMetricsReporter.KeyMetric, Double> metricWeights = metricWeightsProvider.getMetricWeights();
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(metricWeights.size()));
        Iterator<T> it = metricWeights.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            switch (AbstractC0335fg.a[((MviMetricsReporter.KeyMetric) entry.getKey()).ordinal()]) {
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
                    w511.b();
                    return null;
            }
            linkedHashMap.put(str, entry.getValue());
        }
        return linkedHashMap;
    }

    public static final List c(MviConfig.ScorePointListProvider scorePointListProvider) {
        List<MviConfig.ScorePoint> scorePoints = scorePointListProvider.getScorePoints();
        ArrayList arrayList = new ArrayList(tcc.n(scorePoints, 10));
        for (MviConfig.ScorePoint scorePoint : scorePoints) {
            arrayList.add(new qbp0(scorePoint.getValue(), scorePoint.getScore()));
        }
        return arrayList;
    }

    public static final List d(MviConfig.ScorePointListProvider scorePointListProvider) {
        List<MviConfig.ScorePoint> scorePoints = scorePointListProvider.getScorePoints();
        ArrayList arrayList = new ArrayList(tcc.n(scorePoints, 10));
        for (MviConfig.ScorePoint scorePoint : scorePoints) {
            arrayList.add(new qbp0(scorePoint.getValue(), scorePoint.getScore()));
        }
        return arrayList;
    }

    public static final List e(MviConfig.ScorePointListProvider scorePointListProvider) {
        List<MviConfig.ScorePoint> scorePoints = scorePointListProvider.getScorePoints();
        ArrayList arrayList = new ArrayList(tcc.n(scorePoints, 10));
        for (MviConfig.ScorePoint scorePoint : scorePoints) {
            arrayList.add(new qbp0(scorePoint.getValue(), scorePoint.getScore()));
        }
        return arrayList;
    }

    public static final List f(MviConfig.ScorePointListProvider scorePointListProvider) {
        List<MviConfig.ScorePoint> scorePoints = scorePointListProvider.getScorePoints();
        ArrayList arrayList = new ArrayList(tcc.n(scorePoints, 10));
        for (MviConfig.ScorePoint scorePoint : scorePoints) {
            arrayList.add(new qbp0(scorePoint.getValue(), scorePoint.getScore()));
        }
        return arrayList;
    }

    public final Ff a(MviConfig mviConfig) {
        thw0 thw0Var;
        thw0 thw0Var2;
        thw0 thw0Var3;
        final int i;
        thw0 thw0Var4;
        thw0 thw0Var5;
        thw0 thw0Var6;
        this.a.getClass();
        Mf mf = new Mf();
        MviMetricsReporter customMetricsReporter = mviConfig.getCustomMetricsReporter();
        Uf uf = new Uf(customMetricsReporter != null ? new Jf(mf, customMetricsReporter) : mf);
        mf.a = uf;
        lwa0 lwa0Var = new lwa0(mviConfig.getApplicationStartUptimeTimestamp().getUptimeMillis());
        thw0 vg10Var = new vg10(4);
        thw0 vg10Var2 = new vg10(4);
        thw0 vg10Var3 = new vg10(3);
        vg10 vg10Var4 = new vg10(2);
        vg10 vg10Var5 = new vg10(5);
        thw0 vg10Var6 = new vg10(6);
        thw0 vg10Var7 = new vg10(7);
        thw0 vg10Var8 = new vg10(8);
        thw0 vg10Var9 = new vg10(9);
        thw0 thw0Var7 = vg10Var6;
        long max = Math.max(mviConfig.getMinLongTaskDurationMillis(), 0L);
        long max2 = Math.max(mviConfig.getMinInteractiveWindowMillis(), 0L);
        long waitOptionalMetricsTimeoutMs = mviConfig.getWaitOptionalMetricsTimeoutMs();
        boolean isEarlyLongTaskMonitoringEnabled = mviConfig.isEarlyLongTaskMonitoringEnabled();
        boolean isChoreographerLongTaskMonitorEnabled = mviConfig.isChoreographerLongTaskMonitorEnabled();
        boolean isResponsivenessTrackingEnabled = mviConfig.isResponsivenessTrackingEnabled();
        Hf hf = new Hf();
        final MviConfig.ScorePointListProvider firstContentfulPaintScoreIntervals = mviConfig.getFirstContentfulPaintScoreIntervals();
        final int i2 = 0;
        if (firstContentfulPaintScoreIntervals != null) {
            thw0Var = vg10Var2;
            vg10Var = new pbp0(new thw0() { // from class: qlx
                @Override // defpackage.thw0
                public final Object get() {
                    int i3 = i2;
                    MviConfig.ScorePointListProvider scorePointListProvider = firstContentfulPaintScoreIntervals;
                    switch (i3) {
                        case 0:
                            return Kf.d(scorePointListProvider);
                        case 1:
                            return Kf.e(scorePointListProvider);
                        case 2:
                            return Kf.f(scorePointListProvider);
                        case 3:
                            return Kf.a(scorePointListProvider);
                        case 4:
                            return Kf.b(scorePointListProvider);
                        default:
                            return Kf.c(scorePointListProvider);
                    }
                }
            }, new vg10(4));
        } else {
            thw0Var = vg10Var2;
        }
        final MviConfig.ScorePointListProvider largestContentfulPaintScoreIntervals = mviConfig.getLargestContentfulPaintScoreIntervals();
        final int i3 = 1;
        if (largestContentfulPaintScoreIntervals != null) {
            thw0Var2 = vg10Var;
            thw0Var3 = new pbp0(new thw0() { // from class: qlx
                @Override // defpackage.thw0
                public final Object get() {
                    int i32 = i3;
                    MviConfig.ScorePointListProvider scorePointListProvider = largestContentfulPaintScoreIntervals;
                    switch (i32) {
                        case 0:
                            return Kf.d(scorePointListProvider);
                        case 1:
                            return Kf.e(scorePointListProvider);
                        case 2:
                            return Kf.f(scorePointListProvider);
                        case 3:
                            return Kf.a(scorePointListProvider);
                        case 4:
                            return Kf.b(scorePointListProvider);
                        default:
                            return Kf.c(scorePointListProvider);
                    }
                }
            }, new vg10(4));
        } else {
            thw0Var2 = vg10Var;
            thw0Var3 = thw0Var;
        }
        final MviConfig.ScorePointListProvider totalBlockingTimeScoreIntervals = mviConfig.getTotalBlockingTimeScoreIntervals();
        if (totalBlockingTimeScoreIntervals != null) {
            final int i4 = 2;
            i = 3;
            vg10Var3 = new pbp0(new thw0() { // from class: qlx
                @Override // defpackage.thw0
                public final Object get() {
                    int i32 = i4;
                    MviConfig.ScorePointListProvider scorePointListProvider = totalBlockingTimeScoreIntervals;
                    switch (i32) {
                        case 0:
                            return Kf.d(scorePointListProvider);
                        case 1:
                            return Kf.e(scorePointListProvider);
                        case 2:
                            return Kf.f(scorePointListProvider);
                        case 3:
                            return Kf.a(scorePointListProvider);
                        case 4:
                            return Kf.b(scorePointListProvider);
                        default:
                            return Kf.c(scorePointListProvider);
                    }
                }
            }, new vg10(3));
        } else {
            i = 3;
        }
        final MviConfig.ScorePointListProvider timeToInteractiveScoreIntervals = mviConfig.getTimeToInteractiveScoreIntervals();
        if (timeToInteractiveScoreIntervals != null) {
            thw0Var4 = thw0Var3;
            thw0Var5 = new pbp0(new thw0() { // from class: qlx
                @Override // defpackage.thw0
                public final Object get() {
                    int i32 = i;
                    MviConfig.ScorePointListProvider scorePointListProvider = timeToInteractiveScoreIntervals;
                    switch (i32) {
                        case 0:
                            return Kf.d(scorePointListProvider);
                        case 1:
                            return Kf.e(scorePointListProvider);
                        case 2:
                            return Kf.f(scorePointListProvider);
                        case 3:
                            return Kf.a(scorePointListProvider);
                        case 4:
                            return Kf.b(scorePointListProvider);
                        default:
                            return Kf.c(scorePointListProvider);
                    }
                }
            }, new vg10(2));
        } else {
            thw0Var4 = thw0Var3;
            thw0Var5 = vg10Var4;
        }
        final MviConfig.ScorePointListProvider firstInputDelayScoreIntervals = mviConfig.getFirstInputDelayScoreIntervals();
        if (firstInputDelayScoreIntervals != null) {
            final int i5 = 4;
            thw0Var6 = new pbp0(new thw0() { // from class: qlx
                @Override // defpackage.thw0
                public final Object get() {
                    int i32 = i5;
                    MviConfig.ScorePointListProvider scorePointListProvider = firstInputDelayScoreIntervals;
                    switch (i32) {
                        case 0:
                            return Kf.d(scorePointListProvider);
                        case 1:
                            return Kf.e(scorePointListProvider);
                        case 2:
                            return Kf.f(scorePointListProvider);
                        case 3:
                            return Kf.a(scorePointListProvider);
                        case 4:
                            return Kf.b(scorePointListProvider);
                        default:
                            return Kf.c(scorePointListProvider);
                    }
                }
            }, new ak00(13));
        } else {
            thw0Var6 = vg10Var5;
        }
        final MviConfig.ScorePointListProvider interactionToNextPaintScoreIntervals = mviConfig.getInteractionToNextPaintScoreIntervals();
        if (interactionToNextPaintScoreIntervals != null) {
            final int i6 = 5;
            thw0Var7 = new pbp0(new thw0() { // from class: qlx
                @Override // defpackage.thw0
                public final Object get() {
                    int i32 = i6;
                    MviConfig.ScorePointListProvider scorePointListProvider = interactionToNextPaintScoreIntervals;
                    switch (i32) {
                        case 0:
                            return Kf.d(scorePointListProvider);
                        case 1:
                            return Kf.e(scorePointListProvider);
                        case 2:
                            return Kf.f(scorePointListProvider);
                        case 3:
                            return Kf.a(scorePointListProvider);
                        case 4:
                            return Kf.b(scorePointListProvider);
                        default:
                            return Kf.c(scorePointListProvider);
                    }
                }
            }, new ak00(14));
        }
        final MviConfig.MetricWeightsProvider metricWeightsProvider = mviConfig.getMetricWeightsProvider();
        if (metricWeightsProvider != null) {
            final int i7 = 0;
            vg10Var7 = new thw0() { // from class: rlx
                @Override // defpackage.thw0
                public final Object get() {
                    int i8 = i7;
                    MviConfig.MetricWeightsProvider metricWeightsProvider2 = metricWeightsProvider;
                    switch (i8) {
                        case 0:
                            return Kf.a(metricWeightsProvider2);
                        default:
                            return Kf.b(metricWeightsProvider2);
                    }
                }
            };
        }
        final MviConfig.MetricWeightsProvider metricWeightsProviderV2 = mviConfig.getMetricWeightsProviderV2();
        if (metricWeightsProviderV2 != null) {
            final int i8 = 1;
            vg10Var8 = new thw0() { // from class: rlx
                @Override // defpackage.thw0
                public final Object get() {
                    int i82 = i8;
                    MviConfig.MetricWeightsProvider metricWeightsProvider2 = metricWeightsProviderV2;
                    switch (i82) {
                        case 0:
                            return Kf.a(metricWeightsProvider2);
                        default:
                            return Kf.b(metricWeightsProvider2);
                    }
                }
            };
        }
        thw0 thw0Var8 = vg10Var8;
        MviConfig.OptionalMetricsProvider optionalMetricsProvider = mviConfig.getOptionalMetricsProvider();
        if (optionalMetricsProvider != null) {
            vg10Var9 = new s59(optionalMetricsProvider);
        }
        return new Ff(new fv20(uf, lwa0Var, max, max2, thw0Var2, thw0Var4, vg10Var3, thw0Var5, thw0Var6, thw0Var7, vg10Var7, thw0Var8, vg10Var9, waitOptionalMetricsTimeoutMs, isEarlyLongTaskMonitoringEnabled, isChoreographerLongTaskMonitorEnabled, isResponsivenessTrackingEnabled, hf), uf);
    }

    public static final List b(MviConfig.ScorePointListProvider scorePointListProvider) {
        List<MviConfig.ScorePoint> scorePoints = scorePointListProvider.getScorePoints();
        ArrayList arrayList = new ArrayList(tcc.n(scorePoints, 10));
        for (MviConfig.ScorePoint scorePoint : scorePoints) {
            arrayList.add(new qbp0(scorePoint.getValue(), scorePoint.getScore()));
        }
        return arrayList;
    }

    public static final List a(MviConfig.ScorePointListProvider scorePointListProvider) {
        List<MviConfig.ScorePoint> scorePoints = scorePointListProvider.getScorePoints();
        ArrayList arrayList = new ArrayList(tcc.n(scorePoints, 10));
        for (MviConfig.ScorePoint scorePoint : scorePoints) {
            arrayList.add(new qbp0(scorePoint.getValue(), scorePoint.getScore()));
        }
        return arrayList;
    }

    public static final Map a(MviConfig.MetricWeightsProvider metricWeightsProvider) {
        String str;
        Map<MviMetricsReporter.KeyMetric, Double> metricWeights = metricWeightsProvider.getMetricWeights();
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(metricWeights.size()));
        Iterator<T> it = metricWeights.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            switch (AbstractC0335fg.a[((MviMetricsReporter.KeyMetric) entry.getKey()).ordinal()]) {
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
                    w511.b();
                    return null;
            }
            linkedHashMap.put(str, entry.getValue());
        }
        return linkedHashMap;
    }

    public static final Set a(MviConfig.OptionalMetricsProvider optionalMetricsProvider) {
        String str;
        Set<MviMetricsReporter.KeyMetric> optionalMetrics = optionalMetricsProvider.getOptionalMetrics();
        ArrayList arrayList = new ArrayList(tcc.n(optionalMetrics, 10));
        Iterator<T> it = optionalMetrics.iterator();
        while (it.hasNext()) {
            switch (AbstractC0335fg.a[((MviMetricsReporter.KeyMetric) it.next()).ordinal()]) {
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
                    w511.b();
                    return null;
            }
            arrayList.add(str);
        }
        return kotlin.collections.a.N0(arrayList);
    }
}
