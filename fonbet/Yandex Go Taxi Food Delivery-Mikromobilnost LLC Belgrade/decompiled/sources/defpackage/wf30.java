package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoConstraintLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class wf30 implements zo31 {
    public final GoConstraintLayout a;
    public final RecyclerView b;
    public final RobotoTextView c;

    public wf30(GoConstraintLayout goConstraintLayout, RecyclerView recyclerView, RobotoTextView robotoTextView) {
        this.a = goConstraintLayout;
        this.b = recyclerView;
        this.c = robotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
