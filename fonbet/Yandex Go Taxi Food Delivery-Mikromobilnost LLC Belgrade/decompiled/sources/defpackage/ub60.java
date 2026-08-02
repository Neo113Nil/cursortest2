package defpackage;

import android.view.View;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.chargers.order.active.d;
import com.yandex.go.order.tariffs_suggest.ui.OrderWithTariffButtonView;
import com.yandex.go.places.common.ui.gallery.a;
import com.yandex.go.places.impl.ui.organizations.OrganizationsModalView;
import com.yandex.go.places.impl.ui.organizations.e;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v1.c;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v2.OrganizationCardPageView;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v2.OrganizationCardsSliderModalView;
import com.yandex.go.places.organization.card.impl.ui.gallery.OrganizationCardGalleryView;
import com.yandex.go.superapp.order.multi.old.h;
import com.yandex.go.superapp.order.multi.old.view.OrderViewContainer;
import com.yandex.go.taxi.order.superapp.orders.ui.OrdersListModalView;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.map.VisibleRegion;
import com.ybsdk.widgets.common.keyboard.NumberKeyboardView;
import java.util.Iterator;
import ru.rt.ebs.cryptosdk.presentation.error.noInternetConnection.NoInternetConnectionFragment;
import ru.yandex.taxi.design.ListItemCheckComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationItemComponent;
import ru.yandex.taxi.design.NotificationStackComponent;
import ru.yandex.taxi.design.m;
import ru.yandex.taxi.order.overlay.OrderBubblesOverlay;
import ru.yandex.taxi.order.view.OrderView;
import ru.yandex.taxi.summary.requirements.list.recycler.g;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes13.dex */
public final /* synthetic */ class ub60 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ub60(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 initView$lambda$1;
        boolean addUpdate$lambda$0;
        zy11 createKey$lambda$12$lambda$11;
        zy11 throttle$lambda$0;
        boolean _init_$lambda$0;
        boolean onAttachedToWindow$lambda$0;
        boolean _init_$lambda$02;
        zy11 insetsType$lambda$0;
        zy11 organizationImagesSliderAdapter_delegate$lambda$0$0;
        zy11 applyTheme$lambda$0;
        zy11 _init_$lambda$2;
        zy11 adapter_delegate$lambda$0$0;
        int i = this.a;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                initView$lambda$1 = NoInternetConnectionFragment.initView$lambda$1((NoInternetConnectionFragment) obj4, (View) obj);
                return initView$lambda$1;
            case 1:
                addUpdate$lambda$0 = NotificationStackComponent.addUpdate$lambda$0((NotificationItemComponent) obj4, (m) obj);
                return Boolean.valueOf(addUpdate$lambda$0);
            case 2:
                createKey$lambda$12$lambda$11 = NumberKeyboardView.createKey$lambda$12$lambda$11((NumberKeyboardView) obj4, ((Character) obj).charValue());
                return createKey$lambda$12$lambda$11;
            case 3:
                EditText editText = (EditText) obj4;
                char charValue = ((Character) obj).charValue();
                editText.requestFocus();
                if (editText.getSelectionStart() > editText.getSelectionEnd()) {
                    x4c.g("Selection start more than selection end (for EditText)", null, oyr.h(editText.getSelectionStart(), editText.getSelectionEnd(), "selectionStart = ", ", selectionEnd = "), null, 10);
                }
                int min = Math.min(editText.getSelectionStart(), editText.getSelectionEnd());
                int max = Math.max(editText.getSelectionStart(), editText.getSelectionEnd());
                if (min == max) {
                    editText.getText().insert(min, String.valueOf(charValue));
                } else {
                    editText.getText().replace(min, max, String.valueOf(charValue));
                }
                if (min < evu0.C(editText.getText())) {
                    editText.setSelection(min + 1);
                }
                return zy11.a;
            case 4:
                return obj == ((mp60) obj4) ? "(this)" : String.valueOf(obj);
            case 5:
                return (r3q0) obj4;
            case 6:
                ((ej1) obj4).r(new my30((String) obj, 9));
                return zy11.a;
            case 7:
                throttle$lambda$0 = OrderBubblesOverlay.throttle$lambda$0((OrderBubblesOverlay) obj4, obj);
                return throttle$lambda$0;
            case 8:
                return new fj70((ConstraintLayout) obj, (d) obj4);
            case 9:
                return new g((ListItemComponent) obj, (tij0) obj4);
            case 10:
                String str = (String) obj;
                Iterator it = ((o4s0) obj4).a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (jl40.l(((w201) next).getId(), str)) {
                            obj2 = next;
                        }
                    }
                }
                return (w201) obj2;
            case 11:
                _init_$lambda$0 = OrderView._init_$lambda$0((OrderView) obj4, (t1w) obj);
                return Boolean.valueOf(_init_$lambda$0);
            case 12:
                onAttachedToWindow$lambda$0 = OrderViewContainer.onAttachedToWindow$lambda$0((OrderViewContainer) obj4, (t1w) obj);
                return Boolean.valueOf(onAttachedToWindow$lambda$0);
            case 13:
                _init_$lambda$02 = OrderWithTariffButtonView._init_$lambda$0((OrderWithTariffButtonView) obj4, (t1w) obj);
                return Boolean.valueOf(_init_$lambda$02);
            case 14:
                insetsType$lambda$0 = OrdersListModalView.insetsType$lambda$0((OrdersListModalView) obj4, (t1w) obj);
                return insetsType$lambda$0;
            case 15:
                String str2 = (String) obj;
                Iterator it2 = ((h) obj4).G.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (jl40.l(((w201) next2).getId(), str2)) {
                            obj3 = next2;
                        }
                    }
                }
                return (w201) obj3;
            case 16:
                ((a) obj4).b.setCurrentMediaProgressPercent(((Long) obj).longValue() / 10000.0f).invalidateComponent();
                return zy11.a;
            case 17:
                ne80 ne80Var = (ne80) obj;
                ((xe80) obj4).W(new qg80(ne80Var.e, ne80Var.a, ne80Var.b, ne80Var.c, ne80Var.d, ne80Var.g, ne80Var.h));
                return zy11.a;
            case 18:
                c cVar = (c) obj4;
                String str3 = (String) obj;
                Iterator it3 = cVar.f0.iterator();
                int i2 = 0;
                while (true) {
                    if (it3.hasNext()) {
                        mi80 mi80Var = (mi80) it3.next();
                        ki80 ki80Var = mi80Var instanceof ki80 ? (ki80) mi80Var : null;
                        k7v k7vVar = ki80Var != null ? ki80Var.a : null;
                        if (!jl40.l(k7vVar != null ? k7vVar.a : null, str3)) {
                            i2++;
                        }
                    } else {
                        i2 = -1;
                    }
                }
                ye80 ye80Var = (ye80) cVar.Dg();
                if (i2 <= 0) {
                    i2 = 0;
                }
                ye80Var.selectGalleryItem(i2, false);
                return zy11.a;
            case 19:
                organizationImagesSliderAdapter_delegate$lambda$0$0 = OrganizationCardGalleryView.organizationImagesSliderAdapter_delegate$lambda$0$0((OrganizationCardGalleryView) obj4, (mi80) obj);
                return organizationImagesSliderAdapter_delegate$lambda$0$0;
            case 20:
                vf80 vf80Var = (vf80) obj4;
                ((gh00) ((ah00) vf80Var.b)).e(vf80Var.H);
                return zy11.a;
            case 21:
                applyTheme$lambda$0 = OrganizationCardsSliderModalView.applyTheme$lambda$0((ThemeType) obj4, (OrganizationCardPageView) obj);
                return applyTheme$lambda$0;
            case 22:
                _init_$lambda$2 = OrganizationCardsSliderModalView._init_$lambda$2((OrganizationCardsSliderModalView) obj4, (OrganizationCardPageView) obj);
                return _init_$lambda$2;
            case 23:
                ((ani) obj4).d0(ek80.a);
                return zy11.a;
            case 24:
                do80 do80Var = (do80) obj4;
                ((gh00) ((ah00) do80Var.b)).e(do80Var.H);
                return zy11.a;
            case 25:
                com.yandex.go.places.impl.ui.organizations.map.overlay.c cVar2 = (com.yandex.go.places.impl.ui.organizations.map.overlay.c) obj4;
                ah00 ah00Var = cVar2.D;
                VisibleRegion a = ((gh00) ah00Var).e.a();
                float j = ((gh00) ah00Var).j();
                if (!cVar2.F) {
                    cVar2.A.c(j, ru.yandex.taxi.map.utils.a.D(a));
                }
                return zy11.a;
            case 26:
                adapter_delegate$lambda$0$0 = OrganizationsModalView.adapter_delegate$lambda$0$0((OrganizationsModalView) obj4, (fr) obj);
                return adapter_delegate$lambda$0$0;
            case 27:
                com.yandex.go.places.impl.ui.organizations.d dVar = (com.yandex.go.places.impl.ui.organizations.d) obj4;
                Throwable th = (Throwable) obj;
                ip80 a2 = dVar.L.a();
                a2.getClass();
                cp80 cp80Var = a2 instanceof cp80 ? (cp80) a2 : null;
                if (th == null && cp80Var != null) {
                    dVar.Rg(cp80Var.a);
                }
                return zy11.a;
            case 28:
                return new com.yandex.go.places.impl.ui.sorting.recycler.viewholders.a((ListItemCheckComponent) obj, (lz70) obj4);
            default:
                e eVar = (e) obj4;
                BoundingBox boundingBox = (BoundingBox) obj;
                if (eVar.h) {
                    eVar.h = false;
                    eVar.i = true;
                    ((gh00) eVar.f.a).F(boundingBox);
                }
                return zy11.a;
        }
    }
}
