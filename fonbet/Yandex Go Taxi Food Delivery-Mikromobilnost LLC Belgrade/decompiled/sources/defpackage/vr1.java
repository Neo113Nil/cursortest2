package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class vr1 implements zo31 {
    public final LinearLayout a;
    public final GoImageView b;
    public final RobotoTextView c;

    public vr1(LinearLayout linearLayout, GoImageView goImageView, GoView goView, RobotoTextView robotoTextView) {
        this.a = linearLayout;
        this.b = goImageView;
        this.c = robotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
