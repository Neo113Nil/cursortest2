package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class vmv0 implements zo31 {
    public final LinearLayout a;
    public final LinearLayout b;
    public final AppCompatImageView c;
    public final RobotoTextView d;
    public final RobotoTextView e;

    public vmv0(LinearLayout linearLayout, LinearLayout linearLayout2, AppCompatImageView appCompatImageView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = linearLayout;
        this.b = linearLayout2;
        this.c = appCompatImageView;
        this.d = robotoTextView;
        this.e = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
