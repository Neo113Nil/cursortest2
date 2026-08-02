package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class xx7 implements zo31 {
    public final ConstraintLayout a;
    public final LinearLayout b;
    public final ListItemInputComponent c;
    public final ButtonComponent d;
    public final RecyclerView e;
    public final RobotoTextView f;

    public xx7(ConstraintLayout constraintLayout, LinearLayout linearLayout, ListItemInputComponent listItemInputComponent, ButtonComponent buttonComponent, RecyclerView recyclerView, RobotoTextView robotoTextView) {
        this.a = constraintLayout;
        this.b = linearLayout;
        this.c = listItemInputComponent;
        this.d = buttonComponent;
        this.e = recyclerView;
        this.f = robotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
