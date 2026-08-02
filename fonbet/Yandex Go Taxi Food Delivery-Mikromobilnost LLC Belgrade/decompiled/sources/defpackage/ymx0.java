package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.summary.requirements.list.recycler.k;

/* loaded from: classes6.dex */
public final class ymx0 extends lys {
    public static final /* synthetic */ int Z = 0;
    public final pav S;
    public final qmx0 T;
    public final tls U;
    public final k V;
    public dij0 W;

    public ymx0(ListItemComponent listItemComponent, pav pavVar, qmx0 qmx0Var, tls tlsVar) {
        super(listItemComponent);
        this.S = pavVar;
        this.T = qmx0Var;
        this.U = tlsVar;
        this.V = new k(this, 1);
    }

    @Override // defpackage.wys
    public final boolean X() {
        return false;
    }

    @Override // defpackage.wys
    public final void Y() {
        super.Y();
        ((ListItemComponent) ((View) this.R)).getViewTreeObserver().removeOnDrawListener(this.V);
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        dij0 dij0Var = (dij0) obj;
        this.W = dij0Var;
        ListItemComponent listItemComponent = (ListItemComponent) ((View) this.R);
        anx0 anx0Var = dij0Var.a;
        boolean z = dij0Var.c;
        listItemComponent.setTitle(anx0Var.a);
        anx0 anx0Var2 = dij0Var.a;
        listItemComponent.setSubtitle(anx0Var2.b);
        String str = anx0Var2.c;
        if (str == null || str.length() == 0) {
            listItemComponent.getLeadImageView().setImageDrawable(null);
        } else {
            a0(((nac) this.S.a(listItemComponent.getLeadImageView())).c(str));
        }
        zmx0 zmx0Var = anx0Var2.e;
        if (zmx0Var instanceof zmx0) {
            listItemComponent.setTrailMode(2);
            listItemComponent.setOnClickListener(new tai0(26, this, zmx0Var));
        } else {
            listItemComponent.setTrailMode(0);
            listItemComponent.setOnClickListener(null);
        }
        ViewTreeObserver viewTreeObserver = listItemComponent.getViewTreeObserver();
        k kVar = this.V;
        viewTreeObserver.removeOnDrawListener(kVar);
        if (z) {
            listItemComponent.getViewTreeObserver().addOnDrawListener(kVar);
        }
        listItemComponent.setDividers(z ? DividerPosition.NONE : DividerPosition.BOTTOM, DividerType.ICON_MARGIN);
    }
}
