package defpackage;

import android.view.View;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class xqm0 implements zo31 {
    public final GoLinearLayout a;
    public final LinearProgressIndicator b;
    public final RobotoTextView c;
    public final RobotoTextView d;

    public xqm0(GoLinearLayout goLinearLayout, LinearProgressIndicator linearProgressIndicator, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = goLinearLayout;
        this.b = linearProgressIndicator;
        this.c = robotoTextView;
        this.d = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
