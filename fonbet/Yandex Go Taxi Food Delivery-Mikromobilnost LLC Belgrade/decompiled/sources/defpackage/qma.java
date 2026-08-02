package defpackage;

import com.yandex.go.chargers.misc.popup.ChargersPopupModalView;

/* loaded from: classes12.dex */
public final class qma implements tma {
    public final /* synthetic */ ChargersPopupModalView a;

    public qma(ChargersPopupModalView chargersPopupModalView) {
        this.a = chargersPopupModalView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        rma binding;
        g18 g18Var;
        g18 g18Var2;
        pav pavVar;
        zma zmaVar = (zma) obj;
        ChargersPopupModalView chargersPopupModalView = this.a;
        binding = chargersPopupModalView.getBinding();
        binding.e.setText(zmaVar.b);
        binding.b.setText(zmaVar.c);
        g18Var = chargersPopupModalView.iconCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        String str = zmaVar.a;
        if (str != null) {
            pavVar = chargersPopupModalView.imageLoader;
            g18Var2 = ((nac) pavVar.a(binding.d)).c(str);
        } else {
            g18Var2 = null;
        }
        chargersPopupModalView.iconCancellable = g18Var2;
    }
}
