package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.payments.data.model.ListPaymentMethodsParams;
import com.yandex.go.payments.data.model.ListPaymentMethodsResponse;
import com.yandex.go.payments.data.model.PaymentsBindingInProgress$$serializer;
import com.yandex.go.payments.data.model.v;
import com.yandex.go.payments.data.model.w;
import com.yandex.go.places.organization.card.impl.data.entities.network.search.LoadOrganizationCardsListResponse;
import com.yandex.go.places.organization.card.impl.data.entities.network.search.OrganizationCardItem$$serializer;
import com.yandex.go.places.organization.card.impl.data.entities.network.search.b;
import com.yandex.payment.sdk.flex.impl.customview.views.webview.UrlMatch;
import java.lang.annotation.Annotation;
import java.util.Locale;
import kotlin.collections.builders.MapBuilder;
import kotlinx.serialization.KSerializer;
import ru.CryptoPro.JCP.tools.LicenseUtility;
import ru.yandex.taxi.linked_order.models.net.dto.LinkedOrderIconTypeDto;
import ru.yandex.taxi.linked_order.models.net.dto.LinkedOrderStatusDto;
import ru.yandex.taxi.linked_order.models.net.dto.LinkedOrderTypeDto;
import ru.yandex.taxi.masstransit.geopayment.linkcard.network.model.LinkCardStatusResponse$LinkCardStatus;
import ru.yandex.taxi.payments.ListPaymentMethodDtoType;
import ru.yandex.video.m3.list_player_manager.model.StreamType;

/* loaded from: classes5.dex */
public final /* synthetic */ class wky implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ wky(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return vez0.g("ru.yandex.taxi.masstransit.geopayment.linkcard.network.model.LinkCardStatusResponse.LinkCardStatus", LinkCardStatusResponse$LinkCardStatus.values(), new String[]{"in_progress", "success", "error", "cancelled"}, new Annotation[][]{null, null, null, null});
            case 1:
                cmy cmyVar = fmy.Companion;
                return new p53(gmy.a, 0);
            case 2:
                tmy tmyVar = umy.Companion;
                return LinkedOrderStatusDto.Companion.serializer();
            case 3:
                wmy wmyVar = xmy.Companion;
                return LinkedOrderIconTypeDto.Companion.serializer();
            case 4:
                return vez0.g("ru.yandex.taxi.linked_order.models.net.dto.LinkedOrderIconTypeDto", LinkedOrderIconTypeDto.values(), new String[]{"c2c", "b2c"}, new Annotation[][]{null, null});
            case 5:
                noy noyVar = ooy.Companion;
                return new p53(Address.Companion.serializer(), 0);
            case 6:
                return vez0.g("ru.yandex.taxi.linked_order.models.net.dto.LinkedOrderStatusDto", LinkedOrderStatusDto.values(), new String[]{"preorder", "search", "scheduling", "scheduled", "driving", "waiting", "transporting", "complete", "cancelled", "failed", "expired"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null});
            case 7:
                mpy mpyVar = npy.Companion;
                return new p53(opy.a, 0);
            case 8:
                return vez0.g("ru.yandex.taxi.linked_order.models.net.dto.LinkedOrderTypeDto", LinkedOrderTypeDto.values(), new String[]{"ambulance", null}, new Annotation[][]{null, null});
            case 9:
                throw new IllegalStateException("No ListItem.Size provided");
            case 10:
                return vez0.g("ru.yandex.taxi.payments.ListPaymentMethodDtoType", ListPaymentMethodDtoType.values(), new String[]{"cash", "card", "corp", "googlepay", "personal_wallet", "family", "business", "sbp_token", "yandex_card", "mbank_account", "yape_token", "transport_card", "transport_external", "nequi_token", "sbp", "kaspi", "click_wallet", "easypaisa_wallet", "jazzcash_wallet", "fastshift_account", "cash_like"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 11:
                v vVar = ListPaymentMethodsParams.Companion;
                return new p53(e6m.a, 0);
            case 12:
                v vVar2 = ListPaymentMethodsParams.Companion;
                return new p53(auu0.a, 1);
            case 13:
                w wVar = ListPaymentMethodsResponse.Companion;
                return new p53(bty.f, 0);
            case 14:
                w wVar2 = ListPaymentMethodsResponse.Companion;
                return new p53(PaymentsBindingInProgress$$serializer.INSTANCE, 0);
            case 15:
                MapBuilder mapBuilder = new MapBuilder();
                for (StreamType streamType : yty.b) {
                    String name = streamType.name();
                    Locale locale = Locale.ROOT;
                    mapBuilder.put(name.toUpperCase(locale), streamType);
                    mapBuilder.put(streamType.name().toLowerCase(locale), streamType);
                }
                return mapBuilder.j();
            case 16:
                return UrlMatch.Companion.serializer();
            case 17:
                return com.yandex.fintechsdk.features.bdui.internal.presentation.customview.webview.model.UrlMatch.Companion.serializer();
            case 18:
                return new oke(qoi0.a(hlk.class), dlk.a, new KSerializer[0]);
            case 19:
                b bVar = LoadOrganizationCardsListResponse.Companion;
                return new p53(OrganizationCardItem$$serializer.INSTANCE, 0);
            case 20:
                return new oke(qoi0.a(hlk.class), dlk.a, new KSerializer[0]);
            case 21:
                throw new IllegalStateException("No MessengerActivityComponent was provided via LocalActivityComponent");
            case 22:
                qwd qwdVar = r1z.a;
                return null;
            case 23:
                a7u0 a7u0Var = s1z.a;
                return Boolean.TRUE;
            case 24:
                o2z o2zVar = new o2z(new oz2());
                org.k(o2zVar);
                ooc.f(o2zVar, LicenseUtility.SEPARATOR);
                org.m(o2zVar);
                ooc.f(o2zVar, LicenseUtility.SEPARATOR);
                krg.q(o2zVar);
                return new p2z(o2zVar.build());
            case 25:
                o2z o2zVar2 = new o2z(new oz2());
                org.k(o2zVar2);
                org.m(o2zVar2);
                krg.q(o2zVar2);
                return new p2z(o2zVar2.build());
            case 26:
                v2z v2zVar = new v2z(new oz2());
                v2zVar.d(((p2z) ((e7) q2z.a.getValue())).a);
                ooc.b(v2zVar, new tls[]{new xpy(16)}, new xpy(17));
                v2zVar.c(((v4z) w4z.a.getValue()).a);
                return new w2z(v2zVar.build());
            case 27:
                return new wky(28);
            case 28:
                a7u0 a7u0Var2 = c3z.a;
                return zy11.a;
            default:
                a7u0 a7u0Var3 = g3z.a;
                return jvn.a;
        }
    }
}
