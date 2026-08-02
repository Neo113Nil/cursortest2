package defpackage;

import ru.yandex.taxi.contacts.g;
import ru.yandex.taxi.delivery.contacts.DeliveryContactsModalView;
import ru.yandex.taxi.delivery.contacts.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class y0i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DeliveryContactsModalView b;

    public /* synthetic */ y0i(DeliveryContactsModalView deliveryContactsModalView, int i) {
        this.a = i;
        this.b = deliveryContactsModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar;
        int i = this.a;
        DeliveryContactsModalView deliveryContactsModalView = this.b;
        switch (i) {
            case 0:
                DeliveryContactsModalView.initViews$lambda$0(deliveryContactsModalView);
                break;
            case 1:
                DeliveryContactsModalView.setupContactsButton$lambda$0(deliveryContactsModalView);
                break;
            default:
                aVar = deliveryContactsModalView.presenter;
                g gVar = aVar.A;
                gVar.e = new amh(11, aVar);
                gVar.a();
                break;
        }
    }
}
