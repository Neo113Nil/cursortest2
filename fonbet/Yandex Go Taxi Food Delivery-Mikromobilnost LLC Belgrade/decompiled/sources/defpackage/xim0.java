package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class xim0 implements zo31 {
    public final ConstraintLayout a;
    public final RobotoTextView b;

    public xim0(ConstraintLayout constraintLayout, RobotoTextView robotoTextView) {
        this.a = constraintLayout;
        this.b = robotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
