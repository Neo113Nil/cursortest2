package io.appmetrica.analytics.impl;

import defpackage.b6e;
import defpackage.f1d;
import defpackage.gvo;
import defpackage.o4i;
import defpackage.xq0;
import io.appmetrica.analytics.MviMetricsReporter;
import io.appmetrica.analytics.MviScreen;
import java.util.EnumMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.uf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0693uf implements o4i {
    public final o4i a;
    public final MviMetricsReporter b;

    public C0693uf(C0780xf c0780xf, MviMetricsReporter mviMetricsReporter) {
        this.a = c0780xf;
        this.b = mviMetricsReporter;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    @Override // defpackage.o4i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void reportAdditionalMetric(gvo gvoVar, String str, long j, String str2, String str3) {
        MviMetricsReporter.AdditionalMetric additionalMetric;
        MviMetricsReporter.StartupType startupType;
        int i;
        MviMetricsReporter mviMetricsReporter = this.b;
        MviScreen mviScreen = ((Hf) gvoVar).a;
        if (Intrinsics.d(str, "FirstInputTime")) {
            additionalMetric = MviMetricsReporter.AdditionalMetric.FIRST_INPUT_TIME;
        } else {
            if (!Intrinsics.d(str, "InteractionCount")) {
                xq0.w(f1d.g("invalid additional metric string: ", str));
                return;
            }
            additionalMetric = MviMetricsReporter.AdditionalMetric.INTERACTION_COUNT;
        }
        Long valueOf = Long.valueOf(j);
        int hashCode = str3.hashCode();
        if (hashCode == 103501) {
            if (str3.equals("hot")) {
                startupType = MviMetricsReporter.StartupType.HOT;
                i = AbstractC0664tf.a[mviMetricsReporter.reportAdditionalMetric(mviScreen, additionalMetric, valueOf, startupType).ordinal()];
                if (i == 1) {
                }
            }
            xq0.w("invalid startup type string: ".concat(str3));
        }
        if (hashCode == 3059428) {
            if (str3.equals("cold")) {
                startupType = MviMetricsReporter.StartupType.COLD;
                i = AbstractC0664tf.a[mviMetricsReporter.reportAdditionalMetric(mviScreen, additionalMetric, valueOf, startupType).ordinal()];
                if (i == 1) {
                }
            }
            xq0.w("invalid startup type string: ".concat(str3));
        }
        if (hashCode == 3641989 && str3.equals("warm")) {
            startupType = MviMetricsReporter.StartupType.WARM;
            i = AbstractC0664tf.a[mviMetricsReporter.reportAdditionalMetric(mviScreen, additionalMetric, valueOf, startupType).ordinal()];
            if (i == 1) {
                this.a.reportAdditionalMetric(gvoVar, str, j, str2, str3);
                return;
            } else {
                if (i == 2) {
                    return;
                }
                b6e.s();
                return;
            }
        }
        xq0.w("invalid startup type string: ".concat(str3));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    @Override // defpackage.o4i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void reportKeyMetric(gvo gvoVar, String str, long j, double d, String str2, String str3) {
        MviMetricsReporter.StartupType startupType;
        int i;
        MviMetricsReporter mviMetricsReporter = this.b;
        MviScreen mviScreen = ((Hf) gvoVar).a;
        MviMetricsReporter.KeyMetric a = Rf.a(str);
        Long valueOf = Long.valueOf(j);
        Double valueOf2 = Double.valueOf(d);
        int hashCode = str3.hashCode();
        if (hashCode == 103501) {
            if (str3.equals("hot")) {
                startupType = MviMetricsReporter.StartupType.HOT;
                i = AbstractC0664tf.a[mviMetricsReporter.reportKeyMetric(mviScreen, a, valueOf, valueOf2, str2, startupType).ordinal()];
                if (i == 1) {
                }
            }
            xq0.w("invalid startup type string: ".concat(str3));
        }
        if (hashCode == 3059428) {
            if (str3.equals("cold")) {
                startupType = MviMetricsReporter.StartupType.COLD;
                i = AbstractC0664tf.a[mviMetricsReporter.reportKeyMetric(mviScreen, a, valueOf, valueOf2, str2, startupType).ordinal()];
                if (i == 1) {
                }
            }
            xq0.w("invalid startup type string: ".concat(str3));
        }
        if (hashCode == 3641989 && str3.equals("warm")) {
            startupType = MviMetricsReporter.StartupType.WARM;
            i = AbstractC0664tf.a[mviMetricsReporter.reportKeyMetric(mviScreen, a, valueOf, valueOf2, str2, startupType).ordinal()];
            if (i == 1) {
                this.a.reportKeyMetric(gvoVar, str, j, d, str2, str3);
                return;
            } else {
                if (i == 2) {
                    return;
                }
                b6e.s();
                return;
            }
        }
        xq0.w("invalid startup type string: ".concat(str3));
    }

    @Deprecated
    public /* bridge */ /* synthetic */ void reportTotalScore(gvo gvoVar, double d, Map map) {
    }

    @Override // defpackage.o4i
    public final void reportTotalScoreStartupSpecific(gvo gvoVar, String str, double d, Map map, String str2) {
        MviMetricsReporter.StartupType startupType;
        MviMetricsReporter.ReportToPulseTotal reportTotalScoreV2;
        MviMetricsReporter.StartupType startupType2;
        boolean d2 = Intrinsics.d(str, "");
        MviMetricsReporter mviMetricsReporter = this.b;
        if (d2) {
            MviScreen mviScreen = ((Hf) gvoVar).a;
            Double valueOf = Double.valueOf(d);
            EnumMap enumMap = new EnumMap(MviMetricsReporter.KeyMetric.class);
            for (Map.Entry entry : map.entrySet()) {
                enumMap.put((EnumMap) Rf.a((String) entry.getKey()), (MviMetricsReporter.KeyMetric) entry.getValue());
            }
            int hashCode = str2.hashCode();
            if (hashCode == 103501) {
                if (str2.equals("hot")) {
                    startupType2 = MviMetricsReporter.StartupType.HOT;
                    reportTotalScoreV2 = mviMetricsReporter.reportTotalScore(mviScreen, valueOf, enumMap, startupType2);
                }
                xq0.w("invalid startup type string: ".concat(str2));
                return;
            }
            if (hashCode == 3059428) {
                if (str2.equals("cold")) {
                    startupType2 = MviMetricsReporter.StartupType.COLD;
                    reportTotalScoreV2 = mviMetricsReporter.reportTotalScore(mviScreen, valueOf, enumMap, startupType2);
                }
                xq0.w("invalid startup type string: ".concat(str2));
                return;
            }
            if (hashCode == 3641989 && str2.equals("warm")) {
                startupType2 = MviMetricsReporter.StartupType.WARM;
                reportTotalScoreV2 = mviMetricsReporter.reportTotalScore(mviScreen, valueOf, enumMap, startupType2);
            }
            xq0.w("invalid startup type string: ".concat(str2));
            return;
        }
        MviScreen mviScreen2 = ((Hf) gvoVar).a;
        Double valueOf2 = Double.valueOf(d);
        EnumMap enumMap2 = new EnumMap(MviMetricsReporter.KeyMetric.class);
        for (Map.Entry entry2 : map.entrySet()) {
            enumMap2.put((EnumMap) Rf.a((String) entry2.getKey()), (MviMetricsReporter.KeyMetric) entry2.getValue());
        }
        int hashCode2 = str2.hashCode();
        if (hashCode2 == 103501) {
            if (str2.equals("hot")) {
                startupType = MviMetricsReporter.StartupType.HOT;
                reportTotalScoreV2 = mviMetricsReporter.reportTotalScoreV2(mviScreen2, valueOf2, enumMap2, startupType);
            }
            xq0.w("invalid startup type string: ".concat(str2));
            return;
        }
        if (hashCode2 == 3059428) {
            if (str2.equals("cold")) {
                startupType = MviMetricsReporter.StartupType.COLD;
                reportTotalScoreV2 = mviMetricsReporter.reportTotalScoreV2(mviScreen2, valueOf2, enumMap2, startupType);
            }
            xq0.w("invalid startup type string: ".concat(str2));
            return;
        }
        if (hashCode2 == 3641989 && str2.equals("warm")) {
            startupType = MviMetricsReporter.StartupType.WARM;
            reportTotalScoreV2 = mviMetricsReporter.reportTotalScoreV2(mviScreen2, valueOf2, enumMap2, startupType);
        }
        xq0.w("invalid startup type string: ".concat(str2));
        return;
        MviMetricsReporter.ReportToPulseTotal reportToPulseTotal = reportTotalScoreV2;
        int[] iArr = AbstractC0664tf.b;
        int i = iArr[reportToPulseTotal.ordinal()];
        if (i == 1 || i == 2) {
            this.a.reportTotalScoreStartupSpecific(gvoVar, str, d, map, str2);
        } else if (i != 3) {
            b6e.s();
            return;
        }
        int i2 = iArr[reportToPulseTotal.ordinal()];
        if (i2 == 1) {
            this.a.reportTotalScore(gvoVar, str, d, map);
        } else {
            if (i2 == 2 || i2 == 3) {
                return;
            }
            b6e.s();
        }
    }

    @Override // defpackage.o4i
    public final void reportTotalScore(gvo gvoVar, String str, double d, Map map) {
    }

    @Deprecated
    public /* bridge */ /* synthetic */ void reportAdditionalMetric(gvo gvoVar, String str, long j, String str2) {
    }

    @Deprecated
    public /* bridge */ /* synthetic */ void reportTotalScoreStartupSpecific(gvo gvoVar, double d, Map map, String str) {
    }
}
