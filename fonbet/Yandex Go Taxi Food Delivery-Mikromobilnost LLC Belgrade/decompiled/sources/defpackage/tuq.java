package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackAttachments;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ltuq;", "", "Companion", "ruq", "suq", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class tuq {
    public static final suq Companion = new suq();
    public static final i3y[] d = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new nsq(12))};
    public final String a;
    public final FeedbackAttachments b;
    public final List c;

    public tuq(int i, String str, FeedbackAttachments feedbackAttachments, List list) {
        this.a = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            FeedbackAttachments.Companion.getClass();
            this.b = FeedbackAttachments.d;
        } else {
            this.b = feedbackAttachments;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    public tuq() {
        FeedbackAttachments.Companion.getClass();
        FeedbackAttachments feedbackAttachments = FeedbackAttachments.d;
        this.a = null;
        this.b = feedbackAttachments;
        this.c = EmptyList.a;
    }
}
