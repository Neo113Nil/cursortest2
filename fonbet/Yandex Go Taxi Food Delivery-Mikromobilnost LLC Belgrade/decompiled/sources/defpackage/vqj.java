package defpackage;

import com.yandex.go.promocodes.base.impl.discounts.presentation.ui.details.DiscountsPromoCodeDetailsModalView;

/* loaded from: classes13.dex */
public final /* synthetic */ class vqj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ drj b;

    public /* synthetic */ vqj(drj drjVar, int i) {
        this.a = i;
        this.b = drjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        drj drjVar = this.b;
        switch (i) {
            case 0:
                DiscountsPromoCodeDetailsModalView.bindActivationButton$activationButtonClicked(drjVar);
                break;
            default:
                DiscountsPromoCodeDetailsModalView._init_$backButtonClicked(drjVar);
                break;
        }
    }
}
