package defpackage;

import com.yandex.go.promocodes.base.impl.discounts.presentation.ui.details.DiscountsPromoCodeDetailsModalView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final /* synthetic */ class uqj implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ DiscountsPromoCodeDetailsModalView b;

    public /* synthetic */ uqj(DiscountsPromoCodeDetailsModalView discountsPromoCodeDetailsModalView, int i) {
        this.a = i;
        this.b = discountsPromoCodeDetailsModalView;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 buttonsAdapter$lambda$0$0;
        zy11 buttonsAdapter$lambda$0$1;
        zy11 buttonsAdapter$lambda$0$2;
        zy11 infoAdapter$lambda$0$0;
        switch (this.a) {
            case 0:
                buttonsAdapter$lambda$0$0 = DiscountsPromoCodeDetailsModalView.buttonsAdapter$lambda$0$0(this.b, (ButtonComponent) obj, (hrj) obj2);
                return buttonsAdapter$lambda$0$0;
            case 1:
                buttonsAdapter$lambda$0$1 = DiscountsPromoCodeDetailsModalView.buttonsAdapter$lambda$0$1(this.b, (ButtonComponent) obj, (irj) obj2);
                return buttonsAdapter$lambda$0$1;
            case 2:
                buttonsAdapter$lambda$0$2 = DiscountsPromoCodeDetailsModalView.buttonsAdapter$lambda$0$2(this.b, (ButtonComponent) obj, (grj) obj2);
                return buttonsAdapter$lambda$0$2;
            default:
                infoAdapter$lambda$0$0 = DiscountsPromoCodeDetailsModalView.infoAdapter$lambda$0$0(this.b, (RobotoTextView) obj, (CharSequence) obj2);
                return infoAdapter$lambda$0$0;
        }
    }
}
