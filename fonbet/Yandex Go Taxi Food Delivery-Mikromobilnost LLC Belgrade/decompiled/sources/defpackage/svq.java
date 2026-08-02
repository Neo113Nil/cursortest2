package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.order.view.FeedbackMvpView;

/* loaded from: classes14.dex */
public final class svq implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ FeedbackMvpView b;

    public /* synthetic */ svq(FeedbackMvpView feedbackMvpView, int i) {
        this.a = i;
        this.b = feedbackMvpView;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        FeedbackMvpView feedbackMvpView = this.b;
        switch (i) {
            case 0:
                feedbackMvpView.showTipsInput((String) obj);
                break;
            case 1:
                feedbackMvpView.updateFeedbackQuestion((xtq) obj);
                break;
            default:
                feedbackMvpView.setRatingVisibility(((Boolean) obj).booleanValue());
                break;
        }
        return zy11Var;
    }
}
