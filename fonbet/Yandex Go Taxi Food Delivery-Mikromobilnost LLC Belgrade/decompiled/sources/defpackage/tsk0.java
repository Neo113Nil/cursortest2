package defpackage;

import com.yandex.mapkit.road_events.FeedbackSession;
import com.yandex.runtime.Error;

/* loaded from: classes15.dex */
public final class tsk0 implements FeedbackSession.FeedbackListener {
    public final /* synthetic */ ba20 a;

    public tsk0(ba20 ba20Var) {
        this.a = ba20Var;
    }

    @Override // com.yandex.mapkit.road_events.FeedbackSession.FeedbackListener
    public final void onFeedbackCompleted() {
        this.a.success(null);
    }

    @Override // com.yandex.mapkit.road_events.FeedbackSession.FeedbackListener
    public final void onFeedbackError(Error error) {
        this.a.error("roadEventsManager", "Error vote down", error.toString());
    }
}
