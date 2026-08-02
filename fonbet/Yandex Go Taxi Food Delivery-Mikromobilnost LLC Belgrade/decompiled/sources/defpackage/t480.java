package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.ModalItemDto$DefaultItem;
import com.yandex.go.taxi.order.models.api.response.ModalItemDto$RobotaxiItem;
import com.yandex.go.taxi.order.models.api.response.ModalItemDto$ShareOrderItem;
import com.yandex.go.taxi.order.models.api.response.ModalItemDto$StepsInstructionsItem;
import com.yandex.go.taxi.order.models.api.response.PopupModalImage$Default;
import com.yandex.go.taxi.order.models.api.response.TotwPromotionWidgets;
import com.yandex.go.taxi.order.models.api.response.q3;
import com.yandex.go.taxi.order.models.api.response.u0;
import com.yandex.go.taxi.order.promotions.model.TaxiOrderPopupModalBehaviourType;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.order.OrderFragment;

/* loaded from: classes14.dex */
public final /* synthetic */ class t480 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ TaxiOrder b;

    public /* synthetic */ t480(TaxiOrder taxiOrder, int i) {
        this.a = i;
        this.b = taxiOrder;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Object e4y0Var;
        int i = this.a;
        TaxiOrder taxiOrder = this.b;
        switch (i) {
            case 0:
                CommunicationItem communicationItem = (CommunicationItem) obj;
                String str = taxiOrder.a;
                String str2 = communicationItem.a;
                TaxiOrderPopupModalBehaviourType taxiOrderPopupModalBehaviourType = TaxiOrderPopupModalBehaviourType.TAXI_SEARCH;
                o8s0 o8s0Var = communicationItem.h;
                FormattedText formattedText = communicationItem.b;
                c4v c4vVar = communicationItem.d;
                h9e0 h9e0Var = q3.Companion;
                c4v c4vVar2 = communicationItem.e;
                h9e0Var.getClass();
                PopupModalImage$Default popupModalImage$Default = new PopupModalImage$Default(c4vVar2.a, c4vVar2.b);
                FormattedText formattedText2 = communicationItem.c;
                CommunicationItem.a aVar = communicationItem.g;
                return new d4y0(str, str2, o8s0Var, taxiOrderPopupModalBehaviourType, new e480(str2, formattedText, formattedText2, popupModalImage$Default, c4vVar, aVar != null ? new h480(aVar.e) : null));
            case 1:
                u0 u0Var = (u0) obj;
                if (u0Var instanceof ModalItemDto$DefaultItem) {
                    String str3 = taxiOrder.a;
                    ModalItemDto$DefaultItem modalItemDto$DefaultItem = (ModalItemDto$DefaultItem) u0Var;
                    String str4 = modalItemDto$DefaultItem.a;
                    e4y0Var = new d4y0(str3, str4, modalItemDto$DefaultItem.d, TaxiOrderPopupModalBehaviourType.RIDE_AUTO, new e480(str4, modalItemDto$DefaultItem.b, modalItemDto$DefaultItem.f, modalItemDto$DefaultItem.h, modalItemDto$DefaultItem.g, new h480(modalItemDto$DefaultItem.e.a)));
                } else {
                    if (u0Var instanceof ModalItemDto$StepsInstructionsItem) {
                        return null;
                    }
                    if (!(u0Var instanceof ModalItemDto$ShareOrderItem)) {
                        if (!(u0Var instanceof ModalItemDto$RobotaxiItem)) {
                            w511.b();
                            return null;
                        }
                        ModalItemDto$RobotaxiItem modalItemDto$RobotaxiItem = (ModalItemDto$RobotaxiItem) u0Var;
                        TotwPromotionWidgets totwPromotionWidgets = modalItemDto$RobotaxiItem.e;
                        h480 h480Var = new h480(totwPromotionWidgets.a);
                        qos0 qos0Var = totwPromotionWidgets.b;
                        i480 i480Var = qos0Var != null ? new i480(qos0Var) : null;
                        String str5 = taxiOrder.a;
                        String str6 = modalItemDto$RobotaxiItem.a;
                        return new f4y0(str5, str6, modalItemDto$RobotaxiItem.d, TaxiOrderPopupModalBehaviourType.RIDE_AUTO, new g480(str6, modalItemDto$RobotaxiItem.b, modalItemDto$RobotaxiItem.f, modalItemDto$RobotaxiItem.g, h480Var, i480Var));
                    }
                    String str7 = taxiOrder.a;
                    ModalItemDto$ShareOrderItem modalItemDto$ShareOrderItem = (ModalItemDto$ShareOrderItem) u0Var;
                    String str8 = modalItemDto$ShareOrderItem.a;
                    e4y0Var = new e4y0(str7, str8, modalItemDto$ShareOrderItem.d, TaxiOrderPopupModalBehaviourType.RIDE_AUTO, new f480(str8, modalItemDto$ShareOrderItem.b, modalItemDto$ShareOrderItem.f, modalItemDto$ShareOrderItem.g, new h480(modalItemDto$ShareOrderItem.e.a)));
                }
                return e4y0Var;
            default:
                String str9 = taxiOrder.V().q0;
                y4c0 y4c0Var = ((azx0) obj).a;
                y4c0Var.r(new qu(9));
                h2r h2rVar = (h2r) y4c0Var.F;
                OrderFragment.showChat$lambda$0((OrderFragment) h2rVar.b, (o2y0) h2rVar.c, str9);
                return zy11.a;
        }
    }
}
