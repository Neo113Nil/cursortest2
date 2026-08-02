package defpackage;

import android.text.Spannable;
import android.text.Spanned;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.compose.runtime.internal.a;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.multimodal_route.network.models.MultimodalRoutesOrderDto;
import com.yandex.go.multimodal_route.network.models.MultimodalRoutesOrderPartDto;
import com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.taxi.order.models.api.preorder.SelectedTariffInfo;
import com.yandex.go.taxi.order.models.api.preorder.TollRoads;
import com.yandex.passport.common.network.r;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.plus.home.api.config.PlusHomeBundle;
import com.ybsdk.feature.main.internal.widgets.ProductCardView;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.Triple;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes13.dex */
public final /* synthetic */ class rs5 implements tls {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ rs5(i461 i461Var, Spannable spannable, String str, CharSequence charSequence, CharSequence charSequence2, n7f0 n7f0Var, ProductCardView productCardView) {
        this.a = 8;
        this.b = i461Var;
        this.w = spannable;
        this.c = str;
        this.x = charSequence;
        this.y = charSequence2;
        this.z = n7f0Var;
        this.A = productCardView;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str;
        Address b;
        zy11 accessibilityState$lambda$14$lambda$13$lambda$12;
        int i = 0;
        switch (this.a) {
            case 0:
                bt5 bt5Var = (bt5) this.b;
                String str2 = (String) this.c;
                String str3 = (String) this.w;
                String str4 = (String) this.x;
                String str5 = (String) this.y;
                r89 r89Var = (r89) this.z;
                us20 us20Var = (us20) this.A;
                rka0 rka0Var = (rka0) obj;
                if (!bt5Var.p) {
                    yhw0 yhw0Var = new yhw0(bt5Var.a.b, rka0Var.a, rka0Var.b, str3, 1, str2);
                    nhj nhjVar = bt5Var.d;
                    break;
                } else if (str2 != null && !str2.equals("")) {
                    break;
                } else {
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                jxm jxmVar = (jxm) this.b;
                Triple triple = (Triple) this.c;
                tls tlsVar = (tls) this.w;
                tls tlsVar2 = (tls) this.x;
                tls tlsVar3 = (tls) this.y;
                sls slsVar = (sls) this.z;
                sls slsVar2 = (sls) this.A;
                c2q0 c2q0Var = (c2q0) obj;
                c2q0.a(c2q0Var, null, null, false, null, new a(947828536, new b0(jxmVar, triple, tlsVar, tlsVar2, tlsVar3), true), 31);
                c2q0.a(c2q0Var, null, null, false, null, new a(-1477468511, new gxm(i, jxmVar, slsVar, slsVar2), true), 31);
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                ks40 ks40Var = (ks40) this.b;
                String str6 = (String) this.c;
                TollRoads tollRoads = (TollRoads) this.x;
                String str7 = (String) this.w;
                ZoneAddress zoneAddress = (ZoneAddress) this.y;
                Address address = (Address) this.z;
                SelectedTariffInfo selectedTariffInfo = (SelectedTariffInfo) this.A;
                Result result = (Result) obj;
                Object value = result.getValue();
                if (!(value instanceof Result.Failure)) {
                    ((kpi0) ks40Var.P.get()).b();
                    Preorder preorder = ((dqe0) ks40Var.M.get()).a;
                    preorder.b = str6;
                    preorder.d0 = tollRoads;
                    preorder.W = new ur40("multimodal_taxi_transport").a();
                    preorder.Z = false;
                    if (str7 != null && (b = preorder.G.b()) != null) {
                        ((Map) ks40Var.V.c.getValue()).put(str7, b);
                    }
                    if (((c) ks40Var.Q.get()).d(((dqe0) ks40Var.M.get()).c())) {
                        preorder.y = ((c) ks40Var.Q.get()).g();
                    }
                    if (zoneAddress != null) {
                        preorder.o(zoneAddress);
                    }
                    if (address != null) {
                        preorder.p(Collections.singletonList(address));
                    }
                    if (str7 != null) {
                        yu40 yu40Var = (yu40) ks40Var.U.get();
                        Iterator it = yu40Var.d().iterator();
                        while (it.hasNext()) {
                            if (evu0.y(((MultimodalRoutesOrderDto) it.next()).b.a, TariffOrderFlow.ORDER_FLOW_TAXI_KEY, false)) {
                                it.remove();
                            }
                        }
                        yu40Var.i();
                        yu40Var.f();
                        yu40Var.d().add(new MultimodalRoutesOrderDto(new MultimodalRoutesOrderPartDto(TariffOrderFlow.ORDER_FLOW_TAXI_KEY, null, str6), str7));
                        yu40Var.i();
                        yu40Var.f();
                        es40 es40Var = ks40Var.W;
                        is40 is40Var = (is40) ks40Var.x;
                        if (is40Var == null || (str = is40Var.b) == null) {
                            str = "";
                        }
                        String str8 = str6 != null ? str6 : "";
                        es40Var.getClass();
                        HashMap hashMap = new HashMap();
                        hashMap.put("multimodal_id", str7);
                        hashMap.put("mm_name", str);
                        es40Var.a.a("MultimodalRoute.DetailsScreen.Tapped.OrderTapped", hashMap, 1, x4e.q(hashMap, "offer_id", str8, Constants.KEY_SERVICE, TariffOrderFlow.ORDER_FLOW_TAXI_KEY));
                    }
                    if (selectedTariffInfo != null) {
                        preorder.m(selectedTariffInfo);
                    }
                    ks40Var.R.b((m950) ks40Var.L.get(), new b5y0("Open from Multimodal routes", preorder));
                }
                Throwable a = Result.a(result.getValue());
                if (a != null) {
                    xby.l(jst.e, "MultimodalRoutes.MultimodalRouteDetailedCardRouter.Error", null, null, "Error while authRouter is opening " + a, 6);
                }
                break;
            case 7:
                aia0 aia0Var = (aia0) this.b;
                String str9 = (String) this.c;
                String str10 = (String) this.w;
                String str11 = (String) this.x;
                sae saeVar = (sae) this.z;
                ljh ljhVar = (ljh) this.A;
                String str12 = (String) this.y;
                bt5 bt5Var2 = aia0Var.a;
                rwo rwoVar = bt5Var2.g;
                sv90 sv90Var = qv90.a;
                boolean z = bt5Var2.p;
                sv90Var.getClass();
                iho c = y891.c(z ? "sbp_token_payment_v2" : "sbp_token_payment", vfc.i(0, "sbp_token_id", str9, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, b64.l("Оплата СБП токеном ", str9, " ", z ? "через PSP" : "через Trust")));
                md51 a2 = bt5Var2.a(str10);
                rs5 rs5Var = new rs5(bt5Var2, null, str9, str11, str12, saeVar, ljhVar, 0);
                ymx ymxVar = (ymx) a2;
                ymxVar.getClass();
                md51 j = ymx.j(ymxVar, rs5Var, null, 5);
                ((y22) rwoVar).b(c, j);
                break;
            case 8:
                accessibilityState$lambda$14$lambda$13$lambda$12 = ProductCardView.setAccessibilityState$lambda$14$lambda$13$lambda$12((i461) this.b, (Spanned) this.w, (String) this.c, (CharSequence) this.x, (CharSequence) this.y, (n7f0) this.z, (ProductCardView) this.A, ((Boolean) obj).booleanValue());
                break;
            case 9:
                tls tlsVar4 = (tls) this.b;
                zls zlsVar = (zls) this.c;
                wls wlsVar = (wls) this.w;
                sls slsVar3 = (sls) this.x;
                sls slsVar4 = (sls) this.y;
                tls tlsVar5 = (tls) this.z;
                tls tlsVar6 = (tls) this.A;
                n70 n70Var = (n70) obj;
                n70Var.W(new at5(n70Var, tlsVar4, zlsVar, wlsVar, slsVar3, slsVar4, 12));
                n70Var.a0(new kqe0(20, tlsVar5, n70Var, tlsVar6));
                break;
            case 10:
                sls slsVar5 = (sls) this.b;
                sls slsVar6 = (sls) this.c;
                sls slsVar7 = (sls) this.w;
                sls slsVar8 = (sls) this.x;
                sls slsVar9 = (sls) this.y;
                tls tlsVar7 = (tls) this.z;
                tls tlsVar8 = (tls) this.A;
                n70 n70Var2 = (n70) obj;
                n70Var2.W(new q70(n70Var2, slsVar5, 2));
                n70Var2.a0(new gn(n70Var2, slsVar6, slsVar7, slsVar8, slsVar9, tlsVar7, tlsVar8, 5));
                break;
            case 11:
                PlusHomeBundle plusHomeBundle = (PlusHomeBundle) this.b;
                ru.yandex.taxi.plus.sdk.modal.a aVar = (ru.yandex.taxi.plus.sdk.modal.a) this.x;
                ContextThemeWrapper contextThemeWrapper = (ContextThemeWrapper) this.y;
                Lifecycle lifecycle = (Lifecycle) this.z;
                String str13 = (String) this.c;
                String str14 = (String) this.w;
                d59 d59Var = (d59) this.A;
                r4d0 r4d0Var = (r4d0) obj;
                r4d0Var.a(plusHomeBundle);
                r4d0Var.b(new tpp0(aVar, contextThemeWrapper, lifecycle, str13, str14, d59Var));
                break;
            case 12:
                cex0 cex0Var = (cex0) this.b;
                f530 f530Var = (f530) this.c;
                qor qorVar = (qor) this.w;
                tls tlsVar9 = (tls) this.x;
                m3u0 m3u0Var = (m3u0) this.y;
                yur yurVar = (yur) this.z;
                lz40 lz40Var = (lz40) this.A;
                u6y u6yVar = (u6y) obj;
                bpl0 bpl0Var = cex0Var.d;
                List list = bpl0Var.a;
                wls wlsVar2 = bpl0Var.b;
                ((m6y) u6yVar).f(list.size(), wlsVar2 != null ? new qq5(9, wlsVar2, list) : null, new pcx0(list, i), new a(-930734472, new qcx0(list, f530Var, qorVar, tlsVar9, m3u0Var, yurVar, lz40Var), true));
                break;
            default:
                String str15 = (String) this.c;
                String str16 = (String) this.w;
                String str17 = (String) this.x;
                String str18 = (String) this.y;
                String str19 = (String) this.b;
                String str20 = (String) this.z;
                Map map = (Map) this.A;
                r rVar = (r) obj;
                rVar.c("/1/external_auth_by_external_token");
                rVar.f("client_id", str15);
                rVar.f("client_secret", str16);
                rVar.f(AuthSdkActivity.RESPONSE_TYPE_TOKEN, str17);
                rVar.f("provider", str18);
                rVar.f(ClidProvider.APPLICATION, str19);
                rVar.f("scope", str20);
                rVar.e(map);
                break;
        }
        return zy11.a;
    }

    public /* synthetic */ rs5(aia0 aia0Var, String str, String str2, String str3, sae saeVar, ljh ljhVar, String str4) {
        this.a = 7;
        this.b = aia0Var;
        this.c = str;
        this.w = str2;
        this.x = str3;
        this.z = saeVar;
        this.A = ljhVar;
        this.y = str4;
    }

    public /* synthetic */ rs5(ks40 ks40Var, String str, TollRoads tollRoads, String str2, ZoneAddress zoneAddress, Address address, SelectedTariffInfo selectedTariffInfo) {
        this.a = 6;
        this.b = ks40Var;
        this.c = str;
        this.x = tollRoads;
        this.w = str2;
        this.y = zoneAddress;
        this.z = address;
        this.A = selectedTariffInfo;
    }

    public /* synthetic */ rs5(PlusHomeBundle plusHomeBundle, ru.yandex.taxi.plus.sdk.modal.a aVar, ContextThemeWrapper contextThemeWrapper, Lifecycle lifecycle, String str, String str2, d59 d59Var) {
        this.a = 11;
        this.b = plusHomeBundle;
        this.x = aVar;
        this.y = contextThemeWrapper;
        this.z = lifecycle;
        this.c = str;
        this.w = str2;
        this.A = d59Var;
    }

    public /* synthetic */ rs5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
        this.y = obj5;
        this.z = obj6;
        this.A = obj7;
    }

    public /* synthetic */ rs5(String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        this.a = 13;
        this.c = str;
        this.w = str2;
        this.x = str3;
        this.y = str4;
        this.b = str5;
        this.z = str6;
        this.A = map;
    }
}
