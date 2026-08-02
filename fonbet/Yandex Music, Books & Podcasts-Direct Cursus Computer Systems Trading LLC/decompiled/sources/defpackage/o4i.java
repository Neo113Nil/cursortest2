package defpackage;

import java.util.Map;

/* loaded from: classes5.dex */
public interface o4i {
    void reportAdditionalMetric(gvo gvoVar, String str, long j, String str2, String str3);

    void reportKeyMetric(gvo gvoVar, String str, long j, double d, String str2, String str3);

    void reportTotalScore(gvo gvoVar, String str, double d, Map map);

    void reportTotalScoreStartupSpecific(gvo gvoVar, String str, double d, Map map, String str2);
}
