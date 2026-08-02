package defpackage;

import ru.yandex.taxi.preorder.summary.selector.ui.ribbon.TariffsRibbonView;

/* loaded from: classes6.dex */
public final /* synthetic */ class yrx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TariffsRibbonView b;
    public final /* synthetic */ int c;

    public /* synthetic */ yrx0(TariffsRibbonView tariffsRibbonView, int i, int i2) {
        this.a = i2;
        this.b = tariffsRibbonView;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.c;
        TariffsRibbonView tariffsRibbonView = this.b;
        switch (i) {
            case 0:
                TariffsRibbonView.invalidateTariffs$lambda$0$2(tariffsRibbonView, i2);
                break;
            default:
                tariffsRibbonView.onHighlightedAppear(i2);
                break;
        }
    }
}
