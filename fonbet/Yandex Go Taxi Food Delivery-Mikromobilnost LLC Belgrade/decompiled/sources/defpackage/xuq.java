package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackSettingsParams$Screen;

@gsq0
/* loaded from: classes6.dex */
public final class xuq {
    public static final vuq Companion = new vuq();
    public static final i3y[] c = {a.b(LazyThreadSafetyMode.PUBLICATION, new nsq(13)), null};
    public final FeedbackSettingsParams$Screen a;
    public final String b;

    public /* synthetic */ xuq(int i, FeedbackSettingsParams$Screen feedbackSettingsParams$Screen, String str) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, uuq.a.getDescriptor());
            throw null;
        }
        this.a = feedbackSettingsParams$Screen;
        this.b = str;
    }

    public xuq(FeedbackSettingsParams$Screen feedbackSettingsParams$Screen, String str) {
        this.a = feedbackSettingsParams$Screen;
        this.b = str;
    }
}
