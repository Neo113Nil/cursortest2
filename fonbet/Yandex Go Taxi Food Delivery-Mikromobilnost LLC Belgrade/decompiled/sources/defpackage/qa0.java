package defpackage;

import android.app.NotificationChannel;
import android.util.SparseArray;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.search.common.presenter.favorites.b;
import com.yandex.go.overdraft.f;
import com.yandex.go.payments.api.exception.PaymentChangeException;
import com.yandex.go.scooters.discovery.m;
import com.yandex.go.taxi.main.ShortcutsMainScreen;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.Consumer;
import kotlin.Pair;
import ru.cprocsp.NGate.tls.SecureTLSContext;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.banners.CardBannerV2ModalView;
import ru.yandex.taxi.banners.e;
import ru.yandex.taxi.contacts.SelectContactView;
import ru.yandex.taxi.contacts.d;
import ru.yandex.taxi.delivery.contacts.DeliveryContactsModalView;
import ru.yandex.taxi.delivery.contacts.a;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.promotions.model.Promotion;
import ru.yandex.taxi.routeselector.presentation.s;
import ru.yandex.taxi.routeselector.view.RouteSelectorModalView;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.search.fragment.AddressMapPickerFragment;
import ru.yandex.taxi.summary.requirements.list.carousel.view.CarouselButton;

/* loaded from: classes13.dex */
public final /* synthetic */ class qa0 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qa0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Pair pair;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ymu ymuVar = ra0.p;
                ((ra0) obj2).g((mb8) obj);
                break;
            case 1:
                AddressMapPickerFragment.addressMapPickerClarificationPayload$lambda$1((AddressMapPickerFragment) obj2, (Address) obj);
                break;
            case 2:
                xvy0.a(c.c(xng0.bgMain, ((dy4) obj2).a), (View) obj);
                break;
            case 3:
                CardBannerV2ModalView.setImage$lambda$0((CardBannerV2ModalView) obj2, ((Long) obj).longValue());
                break;
            case 4:
                ((CarouselButton) obj2).changeBackgroundColor(((Integer) obj).intValue());
                break;
            case 5:
                ((wzb) obj2).h.a((String) obj);
                break;
            case 6:
                DeliveryContactsModalView.initViews$onContactClick((a) obj2, (dde) obj);
                break;
            case 7:
                b bVar = (b) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    bVar.Z = true;
                    ((pep0) bVar.O).f(bVar.N.b(true), new nc60((String) null), hxx.a);
                    break;
                } else {
                    bVar.xh();
                    break;
                }
            case 8:
                ((dr7) obj2).r(new qu(9));
                break;
            case 9:
                ((LottieAnimationView) obj2).setComposition((nsz) obj);
                break;
            case 10:
                View view = (View) obj;
                lx00 lx00Var = ((vyt0) obj2).b;
                efs0 efs0Var = lx00Var.a;
                LinkedHashSet linkedHashSet = lx00Var.b;
                int T = kotlin.collections.a.T(linkedHashSet, qoi0.a(view.getClass()));
                if (T == -1) {
                    linkedHashSet.add(qoi0.a(view.getClass()));
                    T = linkedHashSet.size() - 1;
                    SparseArray sparseArray = efs0Var.a;
                    Pair pair2 = (Pair) sparseArray.get(T, null);
                    if (pair2 == null) {
                        pair = new Pair(15, new ArrayList());
                    } else {
                        List list = (List) pair2.f();
                        while (list.size() > 15) {
                            list.remove(scc.f(list));
                        }
                        pair = new Pair(15, list);
                    }
                    sparseArray.put(T, pair);
                }
                efs0Var.a(T, view);
                break;
            case 11:
                ((k200) obj2).invoke(obj);
                break;
            case 12:
                w220 w220Var = (w220) obj2;
                String id = ((NotificationChannel) obj).getId();
                if (evu0.y(id, "messenger-chat-v2", false)) {
                    w220Var.a(-1, id);
                    w220Var.g.c(id);
                    break;
                }
                break;
            case 13:
                e eVar = (e) obj2;
                String str = (String) obj;
                if (str != null && str.hashCode() == 2049324434 && str.equals("superapp_main")) {
                    eVar.g();
                    eVar.h.closeNotification(eVar.f());
                    break;
                }
                break;
            case 14:
                ((dv51) ((cv51) ((com.yandex.go.superapp.order.multi.old.router.a) obj2).d.get())).b(new fv51(((n6y0) obj).d, false), new bgc(12));
                break;
            case 15:
                rvx rvxVar = (rvx) obj2;
                TaxiOrder taxiOrder = (TaxiOrder) obj;
                if (taxiOrder.h.b == DriveState.PREORDER) {
                    taxiOrder.T(rvxVar.b);
                    break;
                }
                break;
            case 16:
                ((TaxiOrder) obj).X((v780) obj2);
                break;
            case 17:
                ((f) obj2).invoke((String) obj);
                break;
            case 18:
                ((rif0) obj2).O0(new PaymentChangeException((Throwable) obj));
                break;
            case 19:
                ((HashSet) obj2).remove((wpb0) obj);
                break;
            case 20:
                qht0 qht0Var = (qht0) ((uli0) obj2).a;
                qht0Var.getClass();
                qht0Var.h(new rce0((uqb0) obj), new bgc(12));
                break;
            case 21:
                RouteSelectorModalView.showAnotherAddressPicker$onSuggestSelected((s) obj2, (pv0) obj);
                break;
            case 22:
                hd30 hd30Var = (hd30) obj2;
                ru.yandex.taxi.banners.c.m((ru.yandex.taxi.banners.c) hd30Var.E, (Promotion) obj, "discovery_scooters", new a0n0(hd30Var), null, 24);
                break;
            case 23:
                ((m) obj2).D.h();
                break;
            case 24:
                ((z3o0) obj2).b.h();
                break;
            case 25:
                rfp0 rfp0Var = (rfp0) obj2;
                Integer num = (Integer) obj;
                if (num != null && num.intValue() == 1) {
                    rfp0Var.c.g(pfp0.a);
                    break;
                }
                break;
            case 26:
                SecureTLSContext.lambda$createSSLContext$0((KeyStore) obj2, (Certificate) obj);
                break;
            case 27:
                SelectContactView.contactsAdapter$onContactClick((d) obj2, (dde) obj);
                break;
            case 28:
                ((com.yandex.go.taxi.main.shortcuts.interactors.b) obj2).s.a(SourcePicker.B_FROM_HOME, PointType.DESTINATION);
                break;
            default:
                v3s0 v3s0Var = (v3s0) obj2;
                boolean z = v3s0Var.K;
                h3y h3yVar = v3s0Var.S;
                if (!z) {
                    ((ShortcutsMainScreen) h3yVar.get()).ensureAutolocateButton$impl();
                    break;
                } else {
                    ((ShortcutsMainScreen) h3yVar.get()).removeAutolocateButton$impl();
                    break;
                }
        }
    }
}
