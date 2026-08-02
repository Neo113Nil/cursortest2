package defpackage;

import ru.yandex.taxi.preorder.summary.selector.ui.verticals.VerticalInternalTariffView;

/* loaded from: classes6.dex */
public final /* synthetic */ class re31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VerticalInternalTariffView b;
    public final /* synthetic */ int c;

    public /* synthetic */ re31(VerticalInternalTariffView verticalInternalTariffView, int i, int i2) {
        this.a = i2;
        this.b = verticalInternalTariffView;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.c;
        VerticalInternalTariffView verticalInternalTariffView = this.b;
        switch (i) {
            case 0:
                VerticalInternalTariffView.internalUpdateVerticalItems$lambda$0$3(verticalInternalTariffView, i2);
                break;
            default:
                verticalInternalTariffView.onHighlightedAppear(i2);
                break;
        }
    }
}
