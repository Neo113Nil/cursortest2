package defpackage;

import com.yandex.go.superapp.order_tracking.eats.presentation.ui.EatsOrderDetailsModalView;

/* loaded from: classes14.dex */
public final class yen implements afn {
    public final /* synthetic */ EatsOrderDetailsModalView a;

    public yen(EatsOrderDetailsModalView eatsOrderDetailsModalView) {
        this.a = eatsOrderDetailsModalView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        kfn kfnVar;
        kfn kfnVar2;
        zn70 zn70Var = (zn70) obj;
        EatsOrderDetailsModalView eatsOrderDetailsModalView = this.a;
        kfnVar = eatsOrderDetailsModalView.binding;
        kfnVar.c.setState(zn70Var);
        if (zn70Var instanceof yn70) {
            kfnVar2 = eatsOrderDetailsModalView.binding;
            kfnVar2.b.setBadgeText(((yn70) zn70Var).i);
        }
    }
}
