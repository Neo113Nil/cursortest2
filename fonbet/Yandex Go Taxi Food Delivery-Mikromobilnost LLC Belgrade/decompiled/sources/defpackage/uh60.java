package defpackage;

import android.app.AlarmManager;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.yandex.go.places.organization.card.impl.ui.card.flex.actions.open_delivery.a;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v2.OrganizationCardsSliderModalView;
import com.yandex.go.superapp.orders.card.header.trails.OrderCardIconStackView;
import com.yandex.go.taxi.order.info.OrderInfoContentView;
import com.yandex.go.taxi.order.info.OrderInfoModalView;
import com.yandex.go.taxi.order.map.curtain.view.BannerContainerView;
import com.yandex.go.taxi.order.models.api.response.OrderCommitResponse;
import com.yandex.go.taxi.order.search.overlay.ordinary.mvp.c;
import com.yandex.go.vault.flexsdk.descriptors.widget.actions.b;
import com.yandex.messenger.websdk.api.Cancelable;
import com.ybsdk.feature.kycesia.internal.screens.browser.OpenEsiaFragment;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import ru.domesticroots.webview.d;
import ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.j;
import ru.yandex.taxi.design.NotificationItemComponent;
import ru.yandex.taxi.order.f;
import ru.yandex.taxi.order.overlay.OrderBubblesOverlay;
import ru.yandex.taxi.widget.AnimatedCircularHoleFogView;
import ru.yandex.taxi.widget.RoundedCornersImageView;

/* loaded from: classes14.dex */
public final /* synthetic */ class uh60 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uh60(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 _init_$lambda$0;
        zy11 viewBinding$lambda$2$lambda$1;
        zy11 attachStyledBubble$lambda$0;
        zy11 render$lambda$0$1;
        zy11 fillKisArt$lambda$0;
        View insetsType$lambda$0;
        qra0 peekTransformer_delegate$lambda$0;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                yx1 yx1Var = ((vh60) obj).e;
                yx1Var.getClass();
                jl40.m();
                LinkedHashMap linkedHashMap = (LinkedHashMap) yx1Var.g;
                Set<s221> keySet = linkedHashMap.keySet();
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    ((Cancelable) ((Map.Entry) it.next()).getValue()).cancel();
                }
                linkedHashMap.clear();
                for (s221 s221Var : keySet) {
                    linkedHashMap.put(s221Var, ((jid) yx1Var.f).invoke(s221Var, Boolean.FALSE));
                }
                return zy11Var;
            case 1:
                _init_$lambda$0 = NotificationItemComponent._init_$lambda$0((NotificationItemComponent) obj);
                return _init_$lambda$0;
            case 2:
                return (AlarmManager) ((yj60) obj).a.getSystemService("alarm");
            case 3:
                Context context = ((ul60) obj).b;
                return new d(context.getApplicationContext(), new rl60(context), new ql60());
            case 4:
                EditText editText = (EditText) obj;
                editText.requestFocus();
                int selectionStart = editText.getSelectionStart();
                int selectionEnd = editText.getSelectionEnd();
                if (selectionStart != selectionEnd || selectionStart != 0) {
                    if (selectionStart != selectionEnd) {
                        editText.getText().delete(selectionStart, selectionEnd);
                        if (selectionStart < evu0.C(editText.getText())) {
                            editText.setSelection(selectionStart);
                        }
                    } else {
                        int i2 = selectionStart - 1;
                        editText.getText().delete(i2, selectionStart);
                        if (selectionStart < evu0.C(editText.getText())) {
                            editText.setSelection(i2);
                        }
                    }
                }
                return zy11Var;
            case 5:
                return ((a) obj).a;
            case 6:
                viewBinding$lambda$2$lambda$1 = OpenEsiaFragment.getViewBinding$lambda$2$lambda$1((OpenEsiaFragment) obj);
                return viewBinding$lambda$2$lambda$1;
            case 7:
                return (dw) ((jg9) obj).b.get();
            case 8:
                return ((com.yandex.go.places.organization.card.impl.ui.card.flex.actions.open_navigator.a) obj).a;
            case 9:
                return ((com.yandex.go.places.organization.card.impl.ui.card.flex.actions.open_organization.a) obj).a;
            case 10:
                return ((com.yandex.go.superapp.discovery.map.impl.ui.main.v2.flex.actions.open_organizations.a) obj).a;
            case 11:
                j jVar = (j) obj;
                String str = jVar.l;
                if (str != null) {
                    jVar.h.c.b.a(str);
                    jVar.l = null;
                }
                qhw0 qhw0Var = jVar.j;
                if (qhw0Var != null) {
                    qhw0Var.a(null);
                }
                jVar.j = null;
                qhw0 qhw0Var2 = jVar.k;
                if (qhw0Var2 != null) {
                    qhw0Var2.a(null);
                }
                jVar.k = null;
                jVar.e.b();
                return zy11Var;
            case 12:
                return ((b) obj).b;
            case 13:
                return ((com.yandex.go.superapp.discovery.map.impl.ui.main.v2.flex.actions.open_service.a) obj).a;
            case 14:
                return ((com.yandex.go.places.organization.card.impl.ui.card.flex.actions.open_taxi.a) obj).a;
            case 15:
                return ((b) obj).b;
            case 16:
                attachStyledBubble$lambda$0 = OrderBubblesOverlay.attachStyledBubble$lambda$0((OrderBubblesOverlay) obj);
                return attachStyledBubble$lambda$0;
            case 17:
                render$lambda$0$1 = OrderCardIconStackView.render$lambda$0$1((RoundedCornersImageView) obj);
                return render$lambda$0$1;
            case 18:
                return Boolean.valueOf(((f) obj).u());
            case 19:
                fillKisArt$lambda$0 = OrderInfoContentView.fillKisArt$lambda$0((OrderInfoContentView) obj);
                return fillKisArt$lambda$0;
            case 20:
                insetsType$lambda$0 = OrderInfoModalView.insetsType$lambda$0((OrderInfoModalView) obj);
                return insetsType$lambda$0;
            case 21:
                return (lfn) ((yy70) obj).J.get();
            case 22:
                return (BannerContainerView) ((tz70) obj).a.inflate();
            case 23:
                return (o2y0) obj;
            case 24:
                m880 m880Var = (m880) obj;
                ((lit) ((pit) ((zrm) m880Var.z.c).b).g.b).openOrderPaymentMethods(m880Var.x);
                return zy11Var;
            case 25:
                ((com.yandex.go.order.tariffs_suggest.ui.a) obj).Ng();
                return zy11Var;
            case 26:
                return oyr.p("Order ", ((OrderCommitResponse) obj).a, " was created twice");
            case 27:
                c cVar = (c) obj;
                a3y0 a3y0Var = cVar.H;
                ViewGroup a = cVar.C.a();
                if (a == null) {
                    a3y0.k(a3y0Var, null, new s780(25), 3);
                }
                AnimatedCircularHoleFogView animatedCircularHoleFogView = a != null ? (AnimatedCircularHoleFogView) a.findViewById(p8h0.search_animated_fog) : null;
                if (animatedCircularHoleFogView == null) {
                    a3y0.k(a3y0Var, null, new s780(26), 3);
                }
                return animatedCircularHoleFogView;
            case 28:
                ((com.yandex.go.places.common.ui.gallery.a) obj).c.invoke();
                return zy11Var;
            default:
                peekTransformer_delegate$lambda$0 = OrganizationCardsSliderModalView.peekTransformer_delegate$lambda$0((OrganizationCardsSliderModalView) obj);
                return peekTransformer_delegate$lambda$0;
        }
    }
}
