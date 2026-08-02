package ru.yandex.taxi.order.feedback;

import android.view.View;
import defpackage.s8i0;
import java.util.List;
import ru.yandex.taxi.order.feedback.FeedbackStrategy;

/* loaded from: classes14.dex */
public interface b {
    void animateFirstData();

    FeedbackStrategy.FeedbackType getRatingType();

    View getView();

    void setData(List list);

    void setOnReasonClickListener(s8i0 s8i0Var);

    void setVisibility(int i);
}
