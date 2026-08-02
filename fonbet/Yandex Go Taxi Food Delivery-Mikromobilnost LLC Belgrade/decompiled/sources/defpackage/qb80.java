package defpackage;

import com.yandex.go.order.tariffs_suggest.adapter.a;
import com.yandex.go.order.tariffs_suggest.ui.OrderWithTariffSuggestView;

/* loaded from: classes12.dex */
public final class qb80 implements nb80 {
    public final /* synthetic */ OrderWithTariffSuggestView a;

    public qb80(OrderWithTariffSuggestView orderWithTariffSuggestView) {
        this.a = orderWithTariffSuggestView;
    }

    @Override // defpackage.nb80
    public final void E4(b47 b47Var) {
        this.a.updateAcceptButton(b47Var);
    }

    @Override // defpackage.nb80
    public final void G3(ip8 ip8Var) {
        a aVar;
        j1y j1yVar;
        j1y j1yVar2;
        OrderWithTariffSuggestView orderWithTariffSuggestView = this.a;
        aVar = orderWithTariffSuggestView.adapter;
        aVar.submitList(ip8Var.c, null);
        j1yVar = orderWithTariffSuggestView.binding;
        j1yVar.c.setTitle(ip8Var.a);
        j1yVar2 = orderWithTariffSuggestView.binding;
        j1yVar2.c.setSubtitle(ip8Var.b);
    }
}
