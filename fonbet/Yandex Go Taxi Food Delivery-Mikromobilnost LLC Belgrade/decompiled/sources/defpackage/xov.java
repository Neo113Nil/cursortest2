package defpackage;

import com.yandex.go.navigator.repository.ReportStatus$Error$ErrorType;
import com.yandex.mapkit.road_events.FeedbackSession;
import com.yandex.mapkit.road_events.RoadEventFailedError;
import com.yandex.runtime.Error;
import kotlin.Pair;

/* loaded from: classes12.dex */
public final class xov implements FeedbackSession.FeedbackListener {
    public final /* synthetic */ yov a;

    public xov(yov yovVar) {
        this.a = yovVar;
    }

    @Override // com.yandex.mapkit.road_events.FeedbackSession.FeedbackListener
    public final void onFeedbackCompleted() {
        this.a.c.g(fvq.a);
    }

    @Override // com.yandex.mapkit.road_events.FeedbackSession.FeedbackListener
    public final void onFeedbackError(Error error) {
        Pair pair;
        ReportStatus$Error$ErrorType reportStatus$Error$ErrorType;
        boolean z = error instanceof RoadEventFailedError;
        yov yovVar = this.a;
        if (z) {
            RoadEventFailedError roadEventFailedError = (RoadEventFailedError) error;
            int i = wov.a[roadEventFailedError.getCode().ordinal()];
            if (i == 1) {
                reportStatus$Error$ErrorType = ReportStatus$Error$ErrorType.Unknown;
            } else if (i == 2) {
                reportStatus$Error$ErrorType = ReportStatus$Error$ErrorType.BannedUser;
            } else if (i == 3) {
                reportStatus$Error$ErrorType = ReportStatus$Error$ErrorType.TooFar;
            } else if (i == 4) {
                reportStatus$Error$ErrorType = ReportStatus$Error$ErrorType.TooOften;
            } else {
                if (i != 5) {
                    w511.b();
                    return;
                }
                reportStatus$Error$ErrorType = ReportStatus$Error$ErrorType.LegalReason;
            }
            pair = new Pair(reportStatus$Error$ErrorType, roadEventFailedError.getDescription());
        } else {
            pair = new Pair(ReportStatus$Error$ErrorType.Unknown, ((avj0) yovVar.b).h(kyh0.navigator_incidents_report_notification_negative));
        }
        ReportStatus$Error$ErrorType reportStatus$Error$ErrorType2 = (ReportStatus$Error$ErrorType) pair.getFirst();
        String str = (String) pair.getSecond();
        jst.e.getClass();
        yovVar.c.g(new dvq(reportStatus$Error$ErrorType2, str));
    }
}
