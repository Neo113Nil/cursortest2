package defpackage;

import android.view.View;
import com.yandex.go.superapp.orders.card.OrderCardView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class tdc implements uji0 {
    public final /* synthetic */ udc a;

    public tdc(udc udcVar) {
        this.a = udcVar;
    }

    @Override // defpackage.uji0
    public final void a(View view) {
        OrderCardView orderCardView = (OrderCardView) view.findViewById(dgh0.order_card);
        if (orderCardView == null) {
            return;
        }
        this.a.b.removeIf(new sdc(0, new vqb(10, orderCardView)));
    }

    @Override // defpackage.uji0
    public final void b(View view) {
        OrderCardView orderCardView = (OrderCardView) view.findViewById(dgh0.order_card);
        if (orderCardView == null) {
            return;
        }
        udc udcVar = this.a;
        udcVar.b.add(new WeakReference(orderCardView));
        udcVar.a(orderCardView);
    }
}
