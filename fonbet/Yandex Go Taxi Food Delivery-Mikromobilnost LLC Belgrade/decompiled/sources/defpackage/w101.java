package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.widget.BottomEdgeButtonLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class w101 implements zo31 {
    public final LinearLayout a;
    public final BottomEdgeButtonLayout b;
    public final RobotoTextView c;
    public final GoImageView d;
    public final RobotoTextView e;

    public w101(LinearLayout linearLayout, BottomEdgeButtonLayout bottomEdgeButtonLayout, RobotoTextView robotoTextView, GoImageView goImageView, RobotoTextView robotoTextView2) {
        this.a = linearLayout;
        this.b = bottomEdgeButtonLayout;
        this.c = robotoTextView;
        this.d = goImageView;
        this.e = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
