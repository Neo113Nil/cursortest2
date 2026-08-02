package defpackage;

import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.settings.info.modal.MenuInfoModalView;

/* loaded from: classes6.dex */
public final class xk10 implements bl10 {
    public final /* synthetic */ MenuInfoModalView a;

    public xk10(MenuInfoModalView menuInfoModalView) {
        this.a = menuInfoModalView;
    }

    @Override // defpackage.bl10
    public final void wd(al10 al10Var) {
        ListItemComponent listItemComponent;
        ListItemComponent listItemComponent2;
        MenuInfoModalView menuInfoModalView = this.a;
        listItemComponent = menuInfoModalView.tariffsView;
        listItemComponent.setVisibility(al10Var.a ? 0 : 8);
        listItemComponent2 = menuInfoModalView.parksView;
        listItemComponent2.setVisibility(al10Var.b ? 0 : 8);
        menuInfoModalView.setupClickListeners(al10Var);
    }
}
