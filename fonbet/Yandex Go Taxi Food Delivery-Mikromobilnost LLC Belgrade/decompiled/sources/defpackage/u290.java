package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.Editable;
import android.view.View;
import androidx.compose.foundation.pager.d;
import androidx.compose.foundation.pager.e;
import androidx.compose.ui.semantics.f;
import com.yandex.fintechsdk.flows.payment.kit.api.widget.PaymentKitWidget;
import com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.widget.payment.method.c;
import com.yandex.go.payments.design.composite.CompositePaymentIconsView;
import com.yandex.go.payments.paymentlist.details.PaymentMethodDetailsModalView;
import com.yandex.go.payments.paymentlist.domain.converter.i;
import com.yandex.go.places.impl.navigation.payments.processing.PaymentsProcessingNavigator$ErrorType;
import com.yandex.go.places.impl.ui.payments.info.PaymentsInfoModalView;
import com.yandex.mapkit.road_events.RoadEventsManager;
import com.yandex.messaging.ChatRequest;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.core.data.a;
import com.yandex.payment.sdk.ui.payment.PaymentActivity;
import com.yandex.xplat.common.YSError;
import com.ybsdk.core.design.theme.ThemeType;
import com.ybsdk.feature.partnerpayments.internal.screens.save.presentation.PartnerSaveFragment;
import com.ybsdk.feature.partnerselection.api.SelectedPartner;
import com.ybsdk.feature.partnerselection.internal.screens.partners.presentation.PartnersFragment;
import com.ybsdk.feature.pdf.internal.ui.PdfLoaderFragment;
import com.ybsdk.widgets.common.PageIndicatorView;
import com.ybsdk.widgets.common.g;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.ShimmeringImageView;

/* loaded from: classes13.dex */
public final /* synthetic */ class u290 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u290(e eVar, iip0 iip0Var) {
        this.a = 3;
        this.b = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.CharSequence] */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 attachToRecyclerView$lambda$1;
        zy11 onCreate$lambda$5;
        stz0 render$lambda$19$lambda$12;
        zy11 inputWatcher$lambda$2;
        g render$lambda$19$lambda$17$lambda$15$lambda$14;
        zy11 onCreate$lambda$1;
        l4a0 binding;
        zy11 onAttachedToWindow$lambda$0$0;
        stz0 renderToolbar$lambda$8;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                w290 w290Var = (w290) obj2;
                RoadEventsManager roadEventsManager = (RoadEventsManager) obj;
                if (bvf0.D(w290Var.Jg())) {
                    roadEventsManager.requestEventInfo(w290Var.y.a, w290Var.J);
                }
                return zy11Var;
            case 1:
                v2w v2wVar = (v2w) obj;
                v2wVar.getClass();
                v2wVar.a.b("paddingValues", (j690) obj2);
                return zy11Var;
            case 2:
                attachToRecyclerView$lambda$1 = PageIndicatorView.attachToRecyclerView$lambda$1((PageIndicatorView) obj2, ((Integer) obj).intValue());
                return attachToRecyclerView$lambda$1;
            case 3:
                float floatValue = ((Float) obj).floatValue();
                d dVar = ((e) obj2).b;
                dVar.q.setIntValue(dVar.j(dVar.k() + m810.b(dVar.q() != 0 ? floatValue / dVar.q() : 0.0f)));
                return zy11Var;
            case 4:
                v990 v990Var = (v990) obj2;
                mnq0 mnq0Var = (mnq0) obj;
                CharSequence charSequence = v990Var.a;
                ?? r7 = v990Var.b;
                f.l(mnq0Var, ((Object) charSequence) + " " + ((Object) (r7 != 0 ? r7 : "")));
                return zy11Var;
            case 5:
                ((lgt0) ((yb90) obj2).b).a((zzs) obj, "manual.panorama_pickup_point");
                return zy11Var;
            case 6:
                onCreate$lambda$5 = PartnerSaveFragment.onCreate$lambda$5((PartnerSaveFragment) obj2, (SelectedPartner) obj);
                return onCreate$lambda$5;
            case 7:
                render$lambda$19$lambda$12 = PartnersFragment.render$lambda$19$lambda$12((rj90) obj2, (stz0) obj);
                return render$lambda$19$lambda$12;
            case 8:
                inputWatcher$lambda$2 = PartnersFragment.inputWatcher$lambda$2((PartnersFragment) obj2, (Editable) obj);
                return inputWatcher$lambda$2;
            case 9:
                render$lambda$19$lambda$17$lambda$15$lambda$14 = PartnersFragment.render$lambda$19$lambda$17$lambda$15$lambda$14((qj90) obj2, (g) obj);
                return render$lambda$19$lambda$17$lambda$15$lambda$14;
            case 10:
                return Boolean.valueOf(evu0.y(((si90) obj).a.a, ((fj90) obj2).c, true));
            case 11:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((uti) obj2).g.invoke(bool);
                return zy11Var;
            case 12:
                onCreate$lambda$1 = PaymentActivity.onCreate$lambda$1((PaymentActivity) obj2, (mx60) obj);
                return onCreate$lambda$1;
            case 13:
                cx90 cx90Var = (cx90) obj2;
                mnq0 mnq0Var2 = (mnq0) obj;
                f.p(mnq0Var2, 0);
                f.l(mnq0Var2, cx90Var.c + Extension.FIX_SPACE + cx90Var.d);
                return zy11Var;
            case 14:
                return Boolean.valueOf(((xop0) obj2).a() == ThemeType.DARK);
            case 15:
                binding = ((PaymentMethodDetailsModalView) obj2).getBinding();
                binding.k.setLeadTint((ColorStateList) null);
                return zy11Var;
            case 16:
                ((com.yandex.go.payments.paymentlist.navigation.d) obj).n1((bjm0) obj2);
                return zy11Var;
            case 17:
                o7a0 o7a0Var = (o7a0) obj2;
                mnq0 mnq0Var3 = (mnq0) obj;
                String str = o7a0Var.a;
                String str2 = o7a0Var.b;
                f.l(mnq0Var3, str + Extension.FIX_SPACE + (str2 != null ? str2 : "") + Extension.DOT_CHAR);
                return zy11Var;
            case 18:
                c cVar = (c) obj2;
                Object d = ((c231) obj).d();
                Boolean bool2 = d instanceof Boolean ? (Boolean) d : null;
                if (bool2 != null) {
                    boolean booleanValue = bool2.booleanValue();
                    CompositePaymentIconsView compositePaymentIconsView = cVar.a0;
                    ListItemComponent listItemComponent = cVar.R;
                    listItemComponent.setEnabled(!booleanValue);
                    View trailViewAs = listItemComponent.getTrailViewAs(View.class);
                    if (booleanValue) {
                        listItemComponent.setTitleColorAttr(xng0.textMinor);
                        compositePaymentIconsView.setAlpha(0.5f);
                        if (trailViewAs != null) {
                            trailViewAs.setAlpha(0.5f);
                        }
                    } else {
                        listItemComponent.setTitleColorAttr(xng0.textMain);
                        compositePaymentIconsView.setAlpha(1.0f);
                        if (trailViewAs != null) {
                            trailViewAs.setAlpha(1.0f);
                        }
                    }
                }
                return zy11Var;
            case 19:
                return ((i) obj2).a.h ? new afa0(null) : zea0.a;
            case 20:
                ((aii) obj2).l();
                return zy11Var;
            case 21:
                ((ShimmeringImageView) obj2).setLoading(false);
                return zy11Var;
            case 22:
                n891.n(new xw90(7, (p370) obj2, (YSError) obj));
                return zy11Var;
            case 23:
                ce30 ce30Var = (ce30) obj;
                if (((PaymentKitError) obj2) == null) {
                    PaymentKitError.Companion.getClass();
                    a.a("Unknown error");
                }
                zsa zsaVar = ce30Var.a;
                zsaVar.r(new qu(9));
                ((m020) zsaVar.G).invoke();
                return zy11Var;
            case 24:
                return (PaymentKitWidget) obj2;
            case 25:
                onAttachedToWindow$lambda$0$0 = PaymentsInfoModalView.onAttachedToWindow$lambda$0$0((PaymentsInfoModalView) obj2, (lea0) obj);
                return onAttachedToWindow$lambda$0$0;
            case 26:
                aq80 aq80Var = ((kma0) obj).c;
                aq80Var.getClass();
                int i2 = jma0.a[((PaymentsProcessingNavigator$ErrorType) obj2).ordinal()];
                lma0 lma0Var = (lma0) aq80Var.a;
                Context context = lma0Var.E;
                lma0Var.A((m950) lma0Var.K.get(), i2 == 1 ? new ena0(context.getString(kyh0.discovery_payments_failure_title), context.getString(kyh0.discovery_payments_failure_subtitle), true) : new ena0(context.getString(kyh0.discovery_payments_error_common), context.getString(kyh0.discovery_payments_error_common_subtitle), false), sy60.Q2);
                return zy11Var;
            case 27:
                renderToolbar$lambda$8 = PdfLoaderFragment.renderToolbar$lambda$8((rtz0) obj2, (stz0) obj);
                return renderToolbar$lambda$8;
            case 28:
                f.l((mnq0) obj, ((r611) obj2).d);
                return zy11Var;
            default:
                nsa0 nsa0Var = (nsa0) obj2;
                ull0 T0 = ((oll0) obj).T0("SELECT * FROM pending_chat_requests");
                try {
                    int r = eja1.r(T0, "chat_request_id");
                    int r2 = eja1.r(T0, "chat_request_json");
                    ArrayList arrayList = new ArrayList();
                    while (T0.q()) {
                        String Y1 = T0.Y1(r);
                        ChatRequest chatRequest = (ChatRequest) ((r8b) nsa0Var.i.getValue()).l(T0.isNull(r2) ? null : T0.Y1(r2));
                        if (chatRequest == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.yandex.messaging.ChatRequest', but it was NULL.");
                        }
                        arrayList.add(new wra0(chatRequest, Y1));
                    }
                    T0.close();
                    return arrayList;
                } catch (Throwable th) {
                    T0.close();
                    throw th;
                }
        }
    }

    public /* synthetic */ u290(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
