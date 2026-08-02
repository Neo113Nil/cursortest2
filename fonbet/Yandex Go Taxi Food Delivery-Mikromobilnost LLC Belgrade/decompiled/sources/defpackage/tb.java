package defpackage;

import android.net.Uri;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.pickup_from_photo.navigation.c;
import com.yandex.go.taxi.order.multi.shortcuts.f;
import com.yandex.go.taxi.order.superapp.orders.n;
import com.yandex.go.zone.model.Zone;
import java.util.function.Consumer;
import ru.yandex.taxi.combo.ui.AcceptComboOrderModalView;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.preorder.source.domain.p;
import ru.yandex.taxi.preorder.source.domain.u;
import ru.yandex.taxi.preorder.source.domain.v;
import ru.yandex.taxi.promotions.model.Promotion;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.ScootersOrderSelectorView;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.summary.solid.modal_on_order.domain.a;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final /* synthetic */ class tb implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tb(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        int i2 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                AcceptComboOrderModalView.initSelector$lambda$2((xb) obj3, (AcceptComboOrderModalView) obj2, (Integer) obj);
                break;
            case 1:
                md mdVar = (md) ((a) obj3).b;
                ((com.yandex.go.agreement.interactor.a) mdVar.a).a((dd) obj);
                mdVar.c.b("acceptEula", true);
                ((x880) obj2).n();
                break;
            case 2:
                zw6 zw6Var = (zw6) obj3;
                Uri uri = (Uri) obj;
                zw6Var.e.c(uri, (DeeplinkSource) obj2, new yw6(zw6Var, uri, i2));
                break;
            case 3:
                ((qa0) obj3).accept((pv0) obj);
                ((Runnable) obj2).run();
                break;
            case 4:
                kz00 kz00Var = (kz00) obj;
                kz00Var.a = (String) obj3;
                kz00Var.d = (String) obj2;
                break;
            case 5:
                oh70 oh70Var = (oh70) obj3;
                f fVar = oh70Var.b;
                PointType pointType = (PointType) obj2;
                Address address = (Address) obj;
                if (pointType != PointType.SOURCE) {
                    if (pointType == PointType.DESTINATION) {
                        fVar.d(address, true);
                        break;
                    }
                } else {
                    oh70Var.d.m(new ZoneAddress(address, (Zone) null), null);
                    fVar.d(oh70Var.e.d(), true);
                    break;
                }
                break;
            case 6:
                ((bd80) obj3).c.b("createDraft", new IllegalStateException("Double order draft creation detected"), new xc8((String) obj2, 18));
                break;
            case 7:
                c cVar = (c) obj3;
                ru.yandex.taxi.banners.c.m(cVar.E, (Promotion) obj, "pickup_photo_recognition_onboarding", new sob0(cVar, (sls) obj2), new esc(true), 16);
                break;
            case 8:
                ((ScootersOrderSelectorView) obj3).updateSelectorItemTextColor((RobotoTextView) obj2);
                break;
            case 9:
                ScootersOrderSelectorView.render$lambda$2((ScootersOrderSelectorView) obj3, (vgn0) obj2, (Integer) obj);
                break;
            case 10:
                jst.e.s(new IllegalArgumentException(g8e.o("Can't proceed sdc action's unavailable_reason_fullscreen_id: ", (String) obj3)));
                ((xlp0) obj2).invoke();
                break;
            case 11:
                com.yandex.go.shortcuts.impl.view.a aVar = (com.yandex.go.shortcuts.impl.view.a) obj2;
                View view = (View) obj;
                if (((RecyclerView) obj3).getChildViewHolder(view) instanceof umw0) {
                    com.yandex.go.shortcuts.impl.view.a.r(view, aVar.c);
                    break;
                }
                break;
            case 12:
                cht0 cht0Var = (cht0) obj2;
                if (((oce0) obj3).k) {
                    cht0Var.a();
                    break;
                }
                break;
            case 13:
                u uVar = (u) obj3;
                bov0 bov0Var = (bov0) obj2;
                rjt0 rjt0Var = uVar.e;
                rjt0Var.b.a("Routes.EditDone", rjt0Var.o.getModeName());
                p pVar = uVar.m;
                if (bov0Var == null) {
                    bov0 a = uVar.c.a();
                    if (a == null) {
                        a = bov0.e;
                    }
                    bov0Var = a;
                }
                pVar.a(bov0Var, true);
                break;
            case 14:
                v vVar = (v) obj3;
                vVar.e.b((Zone) obj, null);
                ((p) vVar.f.get()).a((bov0) obj2, false);
                break;
            case 15:
                ((v) obj3).g.b((Throwable) obj, true);
                ((m8t0) obj2).run();
                break;
            case 16:
                com.yandex.go.taxi.order.superapp.orders.v vVar2 = (com.yandex.go.taxi.order.superapp.orders.v) obj3;
                n nVar = (n) obj2;
                q6y0 q6y0Var = (q6y0) obj;
                ic00 ic00Var = ((kc00) vVar2.l).a;
                ic00Var.getClass();
                if (!(ic00Var instanceof hc00)) {
                    vVar2.b(nVar.a(), q6y0Var);
                    break;
                }
                break;
            case 17:
                Consumer consumer = (Consumer) obj2;
                q6y0 q6y0Var2 = (q6y0) obj;
                if (!((n) obj3).l.a()) {
                    consumer.accept(q6y0Var2);
                    break;
                }
                break;
            default:
                ru.yandex.taxi.banners.c.m((ru.yandex.taxi.banners.c) ((dd31) obj3).O.get(), (Promotion) obj, "order_summary", new bd31((wp01) obj2), null, 24);
                break;
        }
    }
}
