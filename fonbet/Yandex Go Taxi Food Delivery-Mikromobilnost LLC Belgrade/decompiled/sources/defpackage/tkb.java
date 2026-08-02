package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class tkb implements zo31 {
    public final GoLinearLayout a;
    public final ListItemComponent b;
    public final GoLinearLayout c;
    public final ListItemComponent d;
    public final ListItemComponent e;
    public final RobotoTextView f;

    public tkb(GoLinearLayout goLinearLayout, ListItemComponent listItemComponent, GoLinearLayout goLinearLayout2, ListItemComponent listItemComponent2, ListItemComponent listItemComponent3, RobotoTextView robotoTextView) {
        this.a = goLinearLayout;
        this.b = listItemComponent;
        this.c = goLinearLayout2;
        this.d = listItemComponent2;
        this.e = listItemComponent3;
        this.f = robotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
