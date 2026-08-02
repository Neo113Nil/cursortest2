package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.TechEvents$TechConfigStateReason;
import com.ybsdk.rconfig.RemoteConfigReporter$ReportReason;
import java.util.LinkedHashMap;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes8.dex */
public final class vui0 {
    public final AppAnalyticsReporter a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();

    public vui0(AppAnalyticsReporter appAnalyticsReporter) {
        this.a = appAnalyticsReporter;
    }

    public final void a(RemoteConfigReporter$ReportReason remoteConfigReporter$ReportReason, LinkedHashMap linkedHashMap) {
        fcy0 fcy0Var = this.a.m0;
        TechEvents$TechConfigStateReason reason = remoteConfigReporter$ReportReason.getReason();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(3);
        if (reason != null) {
            linkedHashMap2.put(CRLReasonCodeExtension.REASON, reason.getOriginalValue());
        }
        linkedHashMap2.put(ClidProvider.STATE, linkedHashMap);
        fcy0Var.a.a("tech.config_state", linkedHashMap2);
    }
}
