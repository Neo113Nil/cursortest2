package defpackage;

import com.yandex.go.taxi.summary.api.model.MobilityHubSourceType;
import com.yandex.go.taxi.summary.mobilityhub.analytics.TransitRoutesHubAnalytics$MobilityHubOrigin;

/* loaded from: classes6.dex */
public abstract class rnb1 {
    public static mgv a;

    public static final TransitRoutesHubAnalytics$MobilityHubOrigin a(a2v a2vVar) {
        return a2vVar.b == MobilityHubSourceType.TRANSPORT ? TransitRoutesHubAnalytics$MobilityHubOrigin.Transport : TransitRoutesHubAnalytics$MobilityHubOrigin.Hub;
    }

    public static String b(int i) {
        return i == 1 ? "Clip" : i == 2 ? "Ellipsis" : i == 5 ? "MiddleEllipsis" : i == 3 ? "Visible" : i == 4 ? "StartEllipsis" : "Invalid";
    }
}
