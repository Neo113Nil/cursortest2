package defpackage;

import ru.yandex.taxi.preorder.summary.selector.ui.ribbon.TariffsRibbonView;

/* loaded from: classes6.dex */
public final /* synthetic */ class zrx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TariffsRibbonView b;

    public /* synthetic */ zrx0(TariffsRibbonView tariffsRibbonView, int i) {
        this.a = i;
        this.b = tariffsRibbonView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        TariffsRibbonView tariffsRibbonView = this.b;
        switch (i) {
            case 0:
                TariffsRibbonView.invalidateTariffs$lambda$0$3(tariffsRibbonView);
                break;
            default:
                tariffsRibbonView.onSelectorCellsChanged();
                break;
        }
    }
}
