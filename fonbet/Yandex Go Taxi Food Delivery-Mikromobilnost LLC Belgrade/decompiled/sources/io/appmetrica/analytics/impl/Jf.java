package io.appmetrica.analytics.impl;

import defpackage.bd20;
import defpackage.ffp0;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.w511;
import io.appmetrica.analytics.MviMetricsReporter;
import io.appmetrica.analytics.MviScreen;
import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class Jf implements bd20 {
    public final bd20 a;
    public final MviMetricsReporter b;

    public Jf(Mf mf, MviMetricsReporter mviMetricsReporter) {
        this.a = mf;
        this.b = mviMetricsReporter;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    @Override // defpackage.bd20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void reportAdditionalMetric(ffp0 ffp0Var, String str, long j, String str2, String str3) {
        MviMetricsReporter.AdditionalMetric additionalMetric;
        MviMetricsReporter.StartupType startupType;
        int i;
        MviMetricsReporter mviMetricsReporter = this.b;
        MviScreen mviScreen = ((Wf) ffp0Var).a;
        if (jl40.l(str, "FirstInputTime")) {
            additionalMetric = MviMetricsReporter.AdditionalMetric.FIRST_INPUT_TIME;
        } else {
            if (!jl40.l(str, "InteractionCount")) {
                ny61.f(g8e.o("invalid additional metric string: ", str));
                return;
            }
            additionalMetric = MviMetricsReporter.AdditionalMetric.INTERACTION_COUNT;
        }
        Long valueOf = Long.valueOf(j);
        int hashCode = str3.hashCode();
        if (hashCode == 103501) {
            if (str3.equals("hot")) {
                startupType = MviMetricsReporter.StartupType.HOT;
                i = If.a[mviMetricsReporter.reportAdditionalMetric(mviScreen, additionalMetric, valueOf, startupType).ordinal()];
                if (i == 1) {
                }
            }
            ny61.f("invalid startup type string: ".concat(str3));
        }
        if (hashCode == 3059428) {
            if (str3.equals("cold")) {
                startupType = MviMetricsReporter.StartupType.COLD;
                i = If.a[mviMetricsReporter.reportAdditionalMetric(mviScreen, additionalMetric, valueOf, startupType).ordinal()];
                if (i == 1) {
                }
            }
            ny61.f("invalid startup type string: ".concat(str3));
        }
        if (hashCode == 3641989 && str3.equals("warm")) {
            startupType = MviMetricsReporter.StartupType.WARM;
            i = If.a[mviMetricsReporter.reportAdditionalMetric(mviScreen, additionalMetric, valueOf, startupType).ordinal()];
            if (i == 1) {
                this.a.reportAdditionalMetric(ffp0Var, str, j, str2, str3);
                return;
            } else {
                if (i == 2) {
                    return;
                }
                w511.b();
                return;
            }
        }
        ny61.f("invalid startup type string: ".concat(str3));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    @Override // defpackage.bd20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void reportKeyMetric(ffp0 ffp0Var, String str, long j, double d, String str2, String str3) {
        MviMetricsReporter.StartupType startupType;
        int i;
        MviMetricsReporter mviMetricsReporter = this.b;
        MviScreen mviScreen = ((Wf) ffp0Var).a;
        MviMetricsReporter.KeyMetric a = AbstractC0364gg.a(str);
        Long valueOf = Long.valueOf(j);
        Double valueOf2 = Double.valueOf(d);
        int hashCode = str3.hashCode();
        if (hashCode == 103501) {
            if (str3.equals("hot")) {
                startupType = MviMetricsReporter.StartupType.HOT;
                i = If.a[mviMetricsReporter.reportKeyMetric(mviScreen, a, valueOf, valueOf2, str2, startupType).ordinal()];
                if (i == 1) {
                }
            }
            ny61.f("invalid startup type string: ".concat(str3));
        }
        if (hashCode == 3059428) {
            if (str3.equals("cold")) {
                startupType = MviMetricsReporter.StartupType.COLD;
                i = If.a[mviMetricsReporter.reportKeyMetric(mviScreen, a, valueOf, valueOf2, str2, startupType).ordinal()];
                if (i == 1) {
                }
            }
            ny61.f("invalid startup type string: ".concat(str3));
        }
        if (hashCode == 3641989 && str3.equals("warm")) {
            startupType = MviMetricsReporter.StartupType.WARM;
            i = If.a[mviMetricsReporter.reportKeyMetric(mviScreen, a, valueOf, valueOf2, str2, startupType).ordinal()];
            if (i == 1) {
                this.a.reportKeyMetric(ffp0Var, str, j, d, str2, str3);
                return;
            } else {
                if (i == 2) {
                    return;
                }
                w511.b();
                return;
            }
        }
        ny61.f("invalid startup type string: ".concat(str3));
    }

    @Deprecated
    public /* bridge */ /* synthetic */ void reportTotalScore(ffp0 ffp0Var, double d, Map map) {
    }

    @Override // defpackage.bd20
    public final void reportTotalScore(ffp0 ffp0Var, String str, double d, Map map) {
    }

    @Override // defpackage.bd20
    public final void reportTotalScoreStartupSpecific(ffp0 ffp0Var, String str, double d, Map map, String str2) {
        MviMetricsReporter.StartupType startupType;
        MviMetricsReporter.ReportToPulseTotal reportTotalScoreV2;
        MviMetricsReporter.StartupType startupType2;
        boolean l = jl40.l(str, "");
        MviMetricsReporter mviMetricsReporter = this.b;
        if (l) {
            MviScreen mviScreen = ((Wf) ffp0Var).a;
            Double valueOf = Double.valueOf(d);
            EnumMap enumMap = new EnumMap(MviMetricsReporter.KeyMetric.class);
            for (Map.Entry entry : map.entrySet()) {
                enumMap.put((EnumMap) AbstractC0364gg.a((String) entry.getKey()), (MviMetricsReporter.KeyMetric) entry.getValue());
            }
            int hashCode = str2.hashCode();
            if (hashCode == 103501) {
                if (str2.equals("hot")) {
                    startupType2 = MviMetricsReporter.StartupType.HOT;
                    reportTotalScoreV2 = mviMetricsReporter.reportTotalScore(mviScreen, valueOf, enumMap, startupType2);
                }
                ny61.f("invalid startup type string: ".concat(str2));
                return;
            }
            if (hashCode == 3059428) {
                if (str2.equals("cold")) {
                    startupType2 = MviMetricsReporter.StartupType.COLD;
                    reportTotalScoreV2 = mviMetricsReporter.reportTotalScore(mviScreen, valueOf, enumMap, startupType2);
                }
                ny61.f("invalid startup type string: ".concat(str2));
                return;
            }
            if (hashCode == 3641989 && str2.equals("warm")) {
                startupType2 = MviMetricsReporter.StartupType.WARM;
                reportTotalScoreV2 = mviMetricsReporter.reportTotalScore(mviScreen, valueOf, enumMap, startupType2);
            }
            ny61.f("invalid startup type string: ".concat(str2));
            return;
        }
        MviScreen mviScreen2 = ((Wf) ffp0Var).a;
        Double valueOf2 = Double.valueOf(d);
        EnumMap enumMap2 = new EnumMap(MviMetricsReporter.KeyMetric.class);
        for (Map.Entry entry2 : map.entrySet()) {
            enumMap2.put((EnumMap) AbstractC0364gg.a((String) entry2.getKey()), (MviMetricsReporter.KeyMetric) entry2.getValue());
        }
        int hashCode2 = str2.hashCode();
        if (hashCode2 == 103501) {
            if (str2.equals("hot")) {
                startupType = MviMetricsReporter.StartupType.HOT;
                reportTotalScoreV2 = mviMetricsReporter.reportTotalScoreV2(mviScreen2, valueOf2, enumMap2, startupType);
            }
            ny61.f("invalid startup type string: ".concat(str2));
            return;
        }
        if (hashCode2 == 3059428) {
            if (str2.equals("cold")) {
                startupType = MviMetricsReporter.StartupType.COLD;
                reportTotalScoreV2 = mviMetricsReporter.reportTotalScoreV2(mviScreen2, valueOf2, enumMap2, startupType);
            }
            ny61.f("invalid startup type string: ".concat(str2));
            return;
        }
        if (hashCode2 == 3641989 && str2.equals("warm")) {
            startupType = MviMetricsReporter.StartupType.WARM;
            reportTotalScoreV2 = mviMetricsReporter.reportTotalScoreV2(mviScreen2, valueOf2, enumMap2, startupType);
        }
        ny61.f("invalid startup type string: ".concat(str2));
        return;
        MviMetricsReporter.ReportToPulseTotal reportToPulseTotal = reportTotalScoreV2;
        int[] iArr = If.b;
        int i = iArr[reportToPulseTotal.ordinal()];
        if (i == 1 || i == 2) {
            this.a.reportTotalScoreStartupSpecific(ffp0Var, str, d, map, str2);
        } else if (i != 3) {
            w511.b();
            return;
        }
        int i2 = iArr[reportToPulseTotal.ordinal()];
        if (i2 == 1) {
            this.a.reportTotalScore(ffp0Var, str, d, map);
        } else {
            if (i2 == 2 || i2 == 3) {
                return;
            }
            w511.b();
        }
    }

    @Deprecated
    public /* bridge */ /* synthetic */ void reportAdditionalMetric(ffp0 ffp0Var, String str, long j, String str2) {
    }

    @Deprecated
    public /* bridge */ /* synthetic */ void reportTotalScoreStartupSpecific(ffp0 ffp0Var, double d, Map map, String str) {
    }
}
