package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.yandex.go.mainscreen.superapp.impl.foundation.data.repository.i;
import com.yandex.go.superapp.searchbar.impl.domain.h;
import com.yandex.go.superapp.searchbar.impl.router.a;
import com.yandex.go.superapp.searchbar.impl.ui.SuperappSearchbarContainerView;
import com.yandex.go.superapp.searchbar.impl.ui.scroll_up.ScrollUpButtonView;
import ru.yandex.taxi.widget.c;

/* loaded from: classes8.dex */
public final class xdw0 extends h55 {
    public final vdw0 D;
    public final pdw0 E;
    public SuperappSearchbarContainerView F;

    public xdw0(vdw0 vdw0Var, pdw0 pdw0Var) {
        super(null);
        this.D = vdw0Var;
        this.E = pdw0Var;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        SuperappSearchbarContainerView superappSearchbarContainerView = this.F;
        ViewParent parent = superappSearchbarContainerView != null ? superappSearchbarContainerView.getParent() : null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.F);
        }
        this.F = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        wdw0 wdw0Var = (wdw0) obj;
        i b = wdw0Var.b();
        a aVar = new a(this, wdw0Var);
        yuf0 yuf0Var = this.D.a;
        com.yandex.go.superapp.searchbar.impl.presentation.a aVar2 = new com.yandex.go.superapp.searchbar.impl.presentation.a((h) ((xvf0) yuf0Var.a).get(), (k7x0) ((xvf0) yuf0Var.b).get(), (c) ((xvf0) yuf0Var.c).get(), (pwy0) ((xvf0) yuf0Var.d).get(), (ibw0) ((xvf0) yuf0Var.e).get(), (com.yandex.go.superapp.searchbar.impl.domain.c) ((rmv0) yuf0Var.f).get(), b, aVar);
        v66 a = wdw0Var.a();
        jec0 jec0Var = this.E.a;
        SuperappSearchbarContainerView superappSearchbarContainerView = new SuperappSearchbarContainerView((Context) jec0Var.a.get(), (ScrollUpButtonView) jec0Var.b.get(), (lew0) jec0Var.c.a, aVar2, a);
        this.F = superappSearchbarContainerView;
        wdw0Var.c().addView(superappSearchbarContainerView, new ViewGroup.LayoutParams(-1, -1));
    }
}
