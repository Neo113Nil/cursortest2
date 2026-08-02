package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class scw implements zo31 {
    public final GoConstraintLayout a;
    public final GoLinearLayout b;
    public final ButtonComponent c;
    public final ListItemInputComponent d;
    public final ButtonComponent e;
    public final RecyclerView f;
    public final RobotoTextView g;

    public scw(GoConstraintLayout goConstraintLayout, GoLinearLayout goLinearLayout, ButtonComponent buttonComponent, ListItemInputComponent listItemInputComponent, ButtonComponent buttonComponent2, RecyclerView recyclerView, RobotoTextView robotoTextView) {
        this.a = goConstraintLayout;
        this.b = goLinearLayout;
        this.c = buttonComponent;
        this.d = listItemInputComponent;
        this.e = buttonComponent2;
        this.f = recyclerView;
        this.g = robotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
