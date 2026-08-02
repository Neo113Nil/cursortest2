package defpackage;

import com.yandex.go.feedback_common.data.FeedbackApi;
import com.yandex.go.feedback_common.services.FeedbackQueueService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes12.dex */
public final class ztq implements quq {
    public final lvq a;
    public final FeedbackApi b;
    public final AtomicBoolean c;
    public final /* synthetic */ FeedbackQueueService d;

    public ztq(FeedbackQueueService feedbackQueueService, lvq lvqVar, FeedbackApi feedbackApi, AtomicBoolean atomicBoolean) {
        this.d = feedbackQueueService;
        this.a = lvqVar;
        this.b = feedbackApi;
        this.c = atomicBoolean;
    }

    public final void a() {
        this.c.set(false);
        this.d.stopSelf();
    }

    public final void b() {
        this.c.set(false);
        this.a.remove();
        this.d.executeNext();
    }
}
