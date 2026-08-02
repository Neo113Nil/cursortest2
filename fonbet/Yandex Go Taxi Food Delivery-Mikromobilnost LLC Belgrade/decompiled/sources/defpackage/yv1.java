package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.design.view.GoView;
import com.yandex.go.navigator.alt_select.AddressStateView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes12.dex */
public final class yv1 implements zo31 {
    public final GoLinearLayout a;
    public final GoLinearLayout b;
    public final ListItemComponent c;
    public final dv1 d;
    public final GoFrameLayout e;
    public final ButtonComponent f;
    public final RecyclerView g;
    public final GoLinearLayout h;
    public final GoFrameLayout i;
    public final AddressStateView j;
    public final GoView k;

    public yv1(GoLinearLayout goLinearLayout, GoLinearLayout goLinearLayout2, ListItemComponent listItemComponent, dv1 dv1Var, GoFrameLayout goFrameLayout, ButtonComponent buttonComponent, RecyclerView recyclerView, GoLinearLayout goLinearLayout3, GoFrameLayout goFrameLayout2, AddressStateView addressStateView, GoView goView) {
        this.a = goLinearLayout;
        this.b = goLinearLayout2;
        this.c = listItemComponent;
        this.d = dv1Var;
        this.e = goFrameLayout;
        this.f = buttonComponent;
        this.g = recyclerView;
        this.h = goLinearLayout3;
        this.i = goFrameLayout2;
        this.j = addressStateView;
        this.k = goView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
