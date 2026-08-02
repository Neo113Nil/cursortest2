package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageButton;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.masstransit.ui.route.modal.expanded.MtExpandedRoutesView;
import ru.yandex.taxi.widget.ButtonsView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class qj30 implements zo31 {
    public final MtExpandedRoutesView a;
    public final FloatButtonIconComponent b;
    public final GoLinearLayout c;
    public final GoImageView d;
    public final ListItemComponent e;
    public final RecyclerView f;
    public final ButtonsView g;
    public final GoImageButton h;
    public final GoConstraintLayout i;
    public final GoImageButton j;
    public final RobotoTextView k;

    public qj30(MtExpandedRoutesView mtExpandedRoutesView, FloatButtonIconComponent floatButtonIconComponent, GoLinearLayout goLinearLayout, GoImageView goImageView, FloatButtonIconComponent floatButtonIconComponent2, ListItemComponent listItemComponent, RecyclerView recyclerView, ButtonsView buttonsView, GoImageButton goImageButton, GoConstraintLayout goConstraintLayout, GoImageButton goImageButton2, RobotoTextView robotoTextView) {
        this.a = mtExpandedRoutesView;
        this.b = floatButtonIconComponent;
        this.c = goLinearLayout;
        this.d = goImageView;
        this.e = listItemComponent;
        this.f = recyclerView;
        this.g = buttonsView;
        this.h = goImageButton;
        this.i = goConstraintLayout;
        this.j = goImageButton2;
        this.k = robotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
