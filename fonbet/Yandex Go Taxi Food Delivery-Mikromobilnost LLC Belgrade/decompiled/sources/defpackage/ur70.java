package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.semantics.f;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v2.bottom_panel.OrganizationCardBottomPanelView;
import com.yandex.go.scooters.passes.v2.list.ScootersPackageView;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.models.api.response.u0;
import com.yandex.go.taxi.order.promotions.modal_default.OrderDefaultModalView;
import defpackage.v4j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.sequences.b;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.design.ListItemCheckComponent;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes14.dex */
public final /* synthetic */ class ur70 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ ur70(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v14, types: [android.view.View, java.lang.Object, ru.yandex.taxi.design.ListItemComponent] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, java.lang.Object, ru.yandex.taxi.design.ListItemComponent] */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 onAttachedToWindow$lambda$0;
        ?? r0;
        List list;
        zy11 _init_$lambda$0;
        zy11 _init_$lambda$1;
        int i = 0;
        switch (this.a) {
            case 0:
                ((ir70) obj).N();
                return zy11.a;
            case 1:
                onAttachedToWindow$lambda$0 = OrderDefaultModalView.onAttachedToWindow$lambda$0((nqs0) obj);
                return onAttachedToWindow$lambda$0;
            case 2:
                ?? listItemComponent = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                int u = tje.u(16, listItemComponent.getContext());
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                marginLayoutParams.setMargins(u, 0, u, 0);
                listItemComponent.setLayoutParams(marginLayoutParams);
                listItemComponent.setLeadFrameMinimumWidth(tje.u(56, listItemComponent.getContext()));
                listItemComponent.setBackgroundResource(dzg0.bg_transparent_ripple);
                return listItemComponent;
            case 3:
                ListItemComponent listItemComponent2 = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                listItemComponent2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                listItemComponent2.setBackgroundResource(dzg0.bg_transparent_ripple);
                return listItemComponent2;
            case 4:
                ViewGroup viewGroup = (ViewGroup) obj;
                ?? r12 = qdj0.o(LayoutInflater.from(viewGroup.getContext()), viewGroup).b;
                int u2 = tje.u(16, r12.getContext());
                ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
                marginLayoutParams2.setMargins(u2, 0, u2, 0);
                r12.setLayoutParams(marginLayoutParams2);
                r12.setLeadFrameMinimumWidth(tje.u(56, r12.getContext()));
                return r12;
            case 5:
                ViewGroup viewGroup2 = (ViewGroup) obj;
                return qdj0.o(LayoutInflater.from(viewGroup2.getContext()), viewGroup2).b;
            case 6:
                return ((o2y0) obj).b().V();
            case 7:
                return ((o2y0) obj).c();
            case 8:
                return ((yz70) obj).u;
            case 9:
                ((v4j0.a) obj).a = false;
                return zy11.a;
            case 10:
                TaxiOrder taxiOrder = (TaxiOrder) obj;
                yw01 yw01Var = new yw01(b.g(b.g(new h73(r2 ? 1 : 0, taxiOrder.V().g()), new ur70(11)), new ur70(12)), new t480(taxiOrder, i));
                OrderStatusInfo.ModalsContent modalsContent = taxiOrder.V().s0;
                if (modalsContent == null || (list = modalsContent.a) == null) {
                    r0 = EmptyList.a;
                } else {
                    List list2 = list;
                    r0 = new ArrayList(tcc.n(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        r0.add(((OrderStatusInfo.Modal) it.next()).a);
                    }
                }
                return b.p(yw01Var, b.i(new yw01(b.g(new h73(r2 ? 1 : 0, (Iterable) r0), new ur70(13)), new t480(taxiOrder, r2 ? 1 : 0))));
            case 11:
                return Boolean.valueOf(((CommunicationItem) obj).i instanceof n0e);
            case 12:
                jsq0 jsq0Var = ((CommunicationItem) obj).j;
                return Boolean.valueOf(jsq0Var != null && jsq0Var.contains(CommunicationItem.DisplayOnType.TAXI_SEARCH));
            case 13:
                jsq0 c = ((u0) obj).getC();
                return Boolean.valueOf(c != null && c.contains(CommunicationItem.DisplayOnType.RIDE_AUTO));
            case 14:
                return ((TaxiOrder) obj).h.getB();
            case 15:
                return ((TaxiOrder) obj).V().I.b;
            case 16:
                return ((TaxiOrder) obj).V().P.b("cashback");
            case 17:
                return ((TaxiOrder) obj).V().P.b("multiclass_assign");
            case 18:
                return Boolean.valueOf(((o2y0) obj).b().l.X);
            case 19:
                _init_$lambda$0 = OrganizationCardBottomPanelView._init_$lambda$0((fr) obj);
                return _init_$lambda$0;
            case 20:
                _init_$lambda$1 = OrganizationCardBottomPanelView._init_$lambda$1((kr) obj);
                return _init_$lambda$1;
            case 21:
                ((no80) obj).a.invoke();
                return zy11.a;
            case 22:
                ListItemCheckComponent listItemCheckComponent = new ListItemCheckComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                listItemCheckComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return listItemCheckComponent;
            case 23:
                ((oo80) obj).a.invoke();
                return zy11.a;
            case 24:
                r1b0 r1b0Var = (r1b0) obj;
                int i2 = db2.a;
                a7u0 a7u0Var = AndroidCompositionLocals_androidKt.b;
                r1b0Var.getClass();
                Context context = (Context) uh6.L(r1b0Var, a7u0Var);
                fwi fwiVar = (fwi) uh6.L(r1b0Var, j.h);
                k290 k290Var = (k290) uh6.L(r1b0Var, l290.a);
                if (k290Var == null) {
                    return null;
                }
                return new i92(context, fwiVar, k290Var.a, k290Var.b);
            case 25:
                c590 c590Var = new c590((ScootersPackageView) obj);
                ((ScootersPackageView) ((View) c590Var.R)).setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return c590Var;
            case 26:
                ((v2w) obj).getClass();
                return zy11.a;
            case 27:
                ((sy60) obj).a();
                return zy11.a;
            case 28:
                f.d((mnq0) obj);
                return zy11.a;
            default:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
        }
    }
}
