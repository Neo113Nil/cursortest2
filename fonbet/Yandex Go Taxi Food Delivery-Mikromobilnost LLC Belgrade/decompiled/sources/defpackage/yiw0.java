package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class yiw0 implements zo31 {
    public final GoLinearLayout a;
    public final m2y b;
    public final LinearLayout c;
    public final RobotoTextView d;
    public final RobotoTextView e;

    public yiw0(GoLinearLayout goLinearLayout, m2y m2yVar, LinearLayout linearLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = goLinearLayout;
        this.b = m2yVar;
        this.c = linearLayout;
        this.d = robotoTextView;
        this.e = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
