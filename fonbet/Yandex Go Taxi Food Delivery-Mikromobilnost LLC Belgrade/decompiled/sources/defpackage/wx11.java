package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.semantics.f;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.domain.entities.UserPhotoButtonAction;
import com.yandex.go.domain.interactor.d;
import com.yandex.go.multimodal_route.api.MultimodalRouteRootPayload$Source;
import com.yandex.go.taxi.order.models.api.preorder.SelectedTariffInfo;
import com.yandex.go.taxi.order.models.api.preorder.TollRoads;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui.VerticalHubV1ModalView;
import com.yandex.go.ui.UserPhotoUploadingModalView;
import com.yandex.go.universal_qr_scanner.presentation.UniversalQrScannerModalView;
import com.yandex.go.vault.flexsdk.descriptors.widget.view.VaultsPagerView;
import com.yandex.mapkit.Time;
import com.yandex.mapkit.transport.masstransit.MasstransitLayer;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.mapkit.transport.masstransit.TravelEstimation;
import com.yandex.messenger.websdk.api.UserUnreadCounters;
import com.yandex.payment.sdk.ui.ViewBindingActivityImpl;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.UpsaleFragment;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import com.ybsdk.feature.main.internal.screens.userCards.b;
import com.ybsdk.screens.upgrade.presentation.edit.UpgradeEditFragment;
import com.ybsdk.screens.upgrade.presentation.main.UpgradeFragment;
import com.ybsdk.widgets.common.YbButtonView;
import defpackage.q021;
import defpackage.tje;
import defpackage.w021;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.HexString;
import ru.yandex.taxi.masstransit.overlay.e;
import ru.yandex.taxi.messenger.unreadcount.a;

/* loaded from: classes14.dex */
public final /* synthetic */ class wx11 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wx11(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010d  */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        zy11 insetsType$lambda$0;
        YbButtonView.a render$lambda$9$lambda$5;
        YbButtonView.a render$lambda$8$lambda$7;
        zy11 onViewCreated$lambda$2;
        zy11 onViewCreated$lambda$8;
        r0 r0Var;
        Object value;
        zy11 linkMovementMethod_delegate$lambda$0$0;
        zy11 adapter$lambda$0;
        zy11 insetsType$lambda$02;
        Route route;
        Long l;
        Iterator it;
        Object obj2;
        z6l0 z6l0Var;
        kz6 kz6Var;
        lz6 lz6Var;
        Time arrivalTime;
        Time departureTime;
        zy11 observeViewModel$lambda$0;
        int i = this.a;
        boolean z = true;
        aw40 aw40Var = null;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                f.l((mnq0) obj, ((f711) obj3).b.toString());
                return zy11Var;
            case 1:
                f.l((mnq0) obj, ((g711) obj3).c);
                return zy11Var;
            case 2:
                insetsType$lambda$0 = UniversalQrScannerModalView.insetsType$lambda$0((UniversalQrScannerModalView) obj3, (t1w) obj);
                return insetsType$lambda$0;
            case 3:
                final w021 w021Var = (w021) obj3;
                yfd yfdVar = (yfd) obj;
                final v021 v021Var = new v021(w021Var);
                u021 u021Var = (u021) ((agd) yfdVar).a;
                agd agdVar = (agd) yfdVar;
                agdVar.c = new g92(2, new x021(u021Var.a, u021Var.b));
                agdVar.e = new tls() { // from class: com.yandex.go.universal_qr_scanner.presentation.qr.not.supported.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj4) {
                        w021 w021Var2 = w021.this;
                        tje.N(w021Var2.o(), null, null, new UniversalQrScannerQrNotSupportedRouter$content$1$1$1(w021Var2, (q021) obj4, v021Var, null), 3);
                        return zy11.a;
                    }
                };
                bfd.a.getClass();
                agdVar.g = bfd.b;
                return zy11Var;
            case 4:
                w221 w221Var = (w221) obj3;
                t221 t221Var = (t221) obj;
                Handler handler = t221Var.c;
                if (handler != null) {
                    handler.post(new t601(12, t221Var, w221Var));
                }
                return zy11Var;
            case 5:
                r0 r0Var2 = ((a) obj3).a;
                Integer num = ((UserUnreadCounters) obj).c;
                x4e.z(num != null ? num.intValue() : 0, r0Var2, null);
                return zy11Var;
            case 6:
                a921 a921Var = (a921) obj3;
                if (((Boolean) obj).booleanValue()) {
                    a921Var.x.invoke();
                }
                a921Var.h();
                return zy11Var;
            case 7:
                render$lambda$9$lambda$5 = UpgradeEditFragment.render$lambda$9$lambda$5((ea21) obj3, (YbButtonView.a) obj);
                return render$lambda$9$lambda$5;
            case 8:
                render$lambda$8$lambda$7 = UpgradeFragment.render$lambda$8$lambda$7((zb21) obj3, (YbButtonView.a) obj);
                return render$lambda$8$lambda$7;
            case 9:
                onViewCreated$lambda$2 = UpsaleFragment.onViewCreated$lambda$2((UpsaleFragment) obj3, (mx60) obj);
                return onViewCreated$lambda$2;
            case 10:
                onViewCreated$lambda$8 = UrbanAdsBottomSheetFragment.onViewCreated$lambda$8((UrbanAdsBottomSheetFragment) obj3, (pey) obj);
                return onViewCreated$lambda$8;
            case 11:
                lur0 lur0Var = (lur0) obj;
                pz40 Y = ((b) obj3).Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, tk21.b((tk21) value, null, null, lur0Var, 27)));
                return zy11Var;
            case 12:
                return bvf0.c((ksq) obj3);
            case 13:
                ((eq21) obj3).getClass();
                return eq21.a((UserPhotoButtonAction) obj);
            case 14:
                iwd iwdVar = (iwd) obj;
                eq21 eq21Var = ((d) obj3).e;
                int i2 = iwdVar.a;
                int i3 = iwdVar.b;
                cug cugVar = eq21Var.b;
                Integer valueOf = Integer.valueOf(i2);
                Double valueOf2 = Double.valueOf(Double.parseDouble(String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(i3 / 1048576.0d)}, 1)).replace(HexString.CHAR_COMMA, '.')));
                cugVar.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("compressions_count", valueOf);
                hashMap.put("photo_size", valueOf2);
                cugVar.a.a("UserPhotoUploading.PhotoCompression", hashMap, 1, new HashMap());
                return zy11Var;
            case 15:
                linkMovementMethod_delegate$lambda$0$0 = UserPhotoUploadingModalView.linkMovementMethod_delegate$lambda$0$0((UserPhotoUploadingModalView) obj3, (String) obj);
                return linkMovementMethod_delegate$lambda$0$0;
            case 16:
                sb2.L((GoFrameLayout) ((f331) obj3).a().b, 0, ((t1w) obj).b, 0, 0, 13);
                return Boolean.TRUE;
            case 17:
                return ((l2m) obj3).b((u1m) obj, null, null);
            case 18:
                ((AppCompatTextView) obj3).setAlpha(1.0f - ((Float) obj).floatValue());
                return zy11Var;
            case 19:
                nsz nszVar = (nsz) obj;
                LottieAnimationView lottieAnimationView = ((a431) obj3).P;
                (lottieAnimationView != null ? lottieAnimationView : null).setComposition(nszVar);
                return zy11Var;
            case 20:
                ((e331) obj3).invoke((Bitmap) obj);
                return zy11Var;
            case 21:
                adapter$lambda$0 = VaultsPagerView.adapter$lambda$0((VaultsPagerView) obj3, ((Integer) obj).intValue());
                return adapter$lambda$0;
            case 22:
                MasstransitLayer masstransitLayer = (MasstransitLayer) obj;
                masstransitLayer.removeListener(((e) obj3).h);
                masstransitLayer.clearLineFilter();
                masstransitLayer.setVehiclesVisible(false);
                masstransitLayer.setVehicleTapListener(null);
                return zy11Var;
            case 23:
                qam.t((qam) obj, (ml6) obj3, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (r8.c() >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (r8.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), 0.0f, null, 0, 120);
                return zy11Var;
            case 24:
                insetsType$lambda$02 = VerticalHubV1ModalView.insetsType$lambda$0((VerticalHubV1ModalView) obj3, (t1w) obj);
                return insetsType$lambda$02;
            case 25:
                vyu vyuVar = (vyu) obj3;
                vw20 vw20Var = (vw20) obj;
                ww20 ww20Var = vw20Var.a;
                j2v j2vVar = vw20Var.b;
                List list = vyuVar.e;
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        route = ww20.W(((z6l0) it2.next()).b());
                        if (route != null) {
                        }
                    } else {
                        route = null;
                    }
                }
                ArrayList arrayList = new ArrayList();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    Route W = ww20.W(((z6l0) it3.next()).b());
                    if (W != null) {
                        arrayList.add(W);
                    }
                }
                Route route2 = (Route) kotlin.collections.a.b0(arrayList);
                if (route != null && route2 != null) {
                    TravelEstimation estimation = route.getMetadata().getEstimation();
                    Long valueOf3 = (estimation == null || (departureTime = estimation.getDepartureTime()) == null) ? null : Long.valueOf(departureTime.getValue());
                    TravelEstimation estimation2 = route2.getMetadata().getEstimation();
                    Long valueOf4 = (estimation2 == null || (arrivalTime = estimation2.getArrivalTime()) == null) ? null : Long.valueOf(arrivalTime.getValue());
                    if (valueOf3 != null && valueOf4 != null) {
                        l = Long.valueOf((valueOf4.longValue() - valueOf3.longValue()) * 1000);
                        MultimodalRouteRootPayload$Source multimodalRouteRootPayload$Source = !jl40.l(ww20Var.F, "transport") ? MultimodalRouteRootPayload$Source.Transport : MultimodalRouteRootPayload$Source.Hub;
                        m950 m950Var = (m950) ww20Var.L.get();
                        it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = null;
                            } else {
                                obj2 = it.next();
                                if (((z6l0) obj2).b() instanceof xsj0) {
                                }
                            }
                        }
                        z6l0Var = (z6l0) obj2;
                        if (z6l0Var != null || (r8 = z6l0Var.getRouteUri()) == null) {
                            String str = "";
                        }
                        String str2 = str;
                        String str3 = vyuVar.a;
                        String str4 = vyuVar.b;
                        String str5 = vyuVar.c;
                        kz6Var = vyuVar.d;
                        if (kz6Var == null) {
                            CharSequence charSequence = kz6Var.b;
                            pzu pzuVar = kz6Var.c;
                            if (pzuVar instanceof izu) {
                                izu izuVar = (izu) pzuVar;
                                String str6 = izuVar.a;
                                TollRoads tollRoads = izuVar.b;
                                SelectedTariffInfo selectedTariffInfo = izuVar.c;
                                as40 as40Var = izuVar.d;
                                String str7 = izuVar.e;
                                String str8 = izuVar.f;
                                Long l2 = izuVar.g;
                                aw40Var = new aw40(str6, tollRoads, selectedTariffInfo, as40Var, str7, str8, l2 != null ? l2.longValue() : 0L);
                            }
                            lz6Var = new lz6(charSequence, aw40Var);
                        } else {
                            lz6Var = null;
                        }
                        ww20Var.E(m950Var, new fu40(str2, str3, str4, str5, lz6Var, vyuVar.f, multimodalRouteRootPayload$Source, vyuVar.i, l), new uw20(ww20Var, j2vVar, 0), hxx.a);
                        return zy11Var;
                    }
                }
                l = null;
                MultimodalRouteRootPayload$Source multimodalRouteRootPayload$Source2 = !jl40.l(ww20Var.F, "transport") ? MultimodalRouteRootPayload$Source.Transport : MultimodalRouteRootPayload$Source.Hub;
                m950 m950Var2 = (m950) ww20Var.L.get();
                it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                z6l0Var = (z6l0) obj2;
                if (z6l0Var != null) {
                }
                String str9 = "";
                String str22 = str9;
                String str32 = vyuVar.a;
                String str42 = vyuVar.b;
                String str52 = vyuVar.c;
                kz6Var = vyuVar.d;
                if (kz6Var == null) {
                }
                ww20Var.E(m950Var2, new fu40(str22, str32, str42, str52, lz6Var, vyuVar.f, multimodalRouteRootPayload$Source2, vyuVar.i, l), new uw20(ww20Var, j2vVar, 0), hxx.a);
                return zy11Var;
            case 26:
                f.l((mnq0) obj, ((hj31) obj3).i);
                return zy11Var;
            case 27:
                ek31 ek31Var = (ek31) obj3;
                ik31 ik31Var = (ik31) obj;
                ik31 ik31Var2 = ek31Var.a;
                if (ik31Var2 != null && ik31Var2.c == ik31Var.c) {
                    z = false;
                }
                ek31Var.a = ik31Var;
                return Long.valueOf(z ? 0L : 100L);
            case 28:
                View asView = ((kk31) ((zr01) obj3).invoke()).asView();
                x4e.y(-1, -2, asView);
                return asView;
            default:
                observeViewModel$lambda$0 = ViewBindingActivityImpl.observeViewModel$lambda$0((ViewBindingActivityImpl) obj3, (f950) obj);
                return observeViewModel$lambda$0;
        }
    }
}
