package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.b;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersLocationCardButtonNameV3;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersOfferCardButtonNameV6;
import com.yandex.go.chargers.background.ChargersBackgroundModalView;
import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountTypeDto;
import com.yandex.go.chargers.discounts.data.models.ChargersProgressDiscountDetailsDto;
import com.yandex.go.chargers.discounts.data.models.ChargersPromoDetailsDto;
import com.yandex.go.chargers.discounts.data.models.ChargersTaskDiscountDetailsDto;
import com.yandex.go.chargers.offer.ui.mvp.ChargersOfferModalView;
import com.yandex.go.chargers.surge.domain.ChargersScreenWithSurge;
import com.yandex.go.taxi.order.details.v1.ui.CarPlateLayout;
import com.yandex.mapkit.ScreenRect;
import com.yandex.payment.sdk.ui.view.card.CardNumberInput;
import com.yandex.xplat.common.YSError;
import com.ybsdk.feature.card.internal.presentation.cardterm.CardSettingsTermFragment;
import com.ybsdk.feature.change.payment.method.internal.ui.ChangePaymentMethodFragment;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.banners.d;
import ru.yandex.taxi.cashback.analytics.CashbackAnalyticsImpl$CashbackNotificationContext;
import ru.yandex.taxi.communications.api.dto.BannerWidgets;
import ru.yandex.taxi.communications.banners.a;

/* loaded from: classes10.dex */
public final /* synthetic */ class u08 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u08(b bVar, UUID uuid) {
        this.a = 1;
        this.b = bVar;
        this.c = uuid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v31, types: [uj9] */
    /* JADX WARN: Type inference failed for: r2v33, types: [uj9] */
    @Override // defpackage.sls
    public final Object invoke() {
        zy11 carPlateClickListener$lambda$0;
        View bottomSheetState$lambda$6;
        Object value;
        Set M0;
        svp0 i;
        View renderBottomSheet$lambda$12;
        Object obj;
        fo9 fo9Var;
        uj9 uj9Var;
        uj9 uj9Var2;
        zy11 renderSuccess$lambda$0;
        int i2 = this.a;
        int i3 = 0;
        c21 c21Var = sy60.Q2;
        tj9 tj9Var = tj9.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i2) {
            case 0:
                b bVar = (b) obj2;
                WorkDatabase workDatabase = bVar.c;
                workDatabase.P0(new gtg(5, new v08(workDatabase, (String) obj3, bVar, i3)));
                pom0.b(bVar.b, workDatabase, bVar.e);
                return zy11Var;
            case 1:
                b bVar2 = (b) obj2;
                WorkDatabase workDatabase2 = bVar2.c;
                workDatabase2.P0(new gtg(5, new nm7(13, bVar2, (UUID) obj3)));
                pom0.b(bVar2.b, workDatabase2, bVar2.e);
                return zy11Var;
            case 2:
                carPlateClickListener$lambda$0 = CarPlateLayout.setCarPlateClickListener$lambda$0((View.OnClickListener) obj3, (CarPlateLayout) obj2);
                return carPlateClickListener$lambda$0;
            case 3:
                ((a) ((d) obj3).y).a((BannerWidgets.OnCloseEffect) obj2);
                return zy11Var;
            case 4:
                ((lh8) obj3).invoke(((YSError) obj2).getMessage());
                return zy11Var;
            case 5:
                ((lh8) obj3).invoke((foz0) obj2);
                return zy11Var;
            case 6:
                new Handler(Looper.getMainLooper()).post(new nm7(21, (CardNumberInput) obj3, (mh8) obj2));
                return zy11Var;
            case 7:
                bottomSheetState$lambda$6 = CardSettingsTermFragment.getBottomSheetState$lambda$6((CardSettingsTermFragment) obj3, (xo8) obj2);
                return bottomSheetState$lambda$6;
            case 8:
                ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar = (ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a) obj3;
                r9x0 r9x0Var = (r9x0) obj2;
                htg htgVar = aVar.d;
                htgVar.getClass();
                if (vng.I() - htgVar.a >= 300) {
                    aVar.c.b(r9x0Var);
                }
                htgVar.a = vng.I();
                return zy11Var;
            case 9:
                fhu fhuVar = ((ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a) obj3).e;
                String str = ((m8q0) obj2).a;
                r0 r0Var = fhuVar.a;
                do {
                    value = r0Var.getValue();
                    M0 = kotlin.collections.a.M0((Set) value);
                    M0.add(str);
                } while (!r0Var.k(value, M0));
                return zy11Var;
            case 10:
                ScreenRect screenRect = (ScreenRect) obj2;
                xz4 n = ((f09) obj3).w.n();
                if (n != null && (i = n.i()) != null) {
                    i.b9(screenRect);
                }
                return zy11Var;
            case 11:
                ((tls) obj3).invoke(((y09) obj2).i);
                return zy11Var;
            case 12:
                x39 x39Var = (x39) obj3;
                x39Var.a.c("cashback_payment_changed_to_wallet");
                x39Var.c.b.k(CashbackAnalyticsImpl$CashbackNotificationContext.PAYMENT_METHOD_CHANGE.getContext(), null);
                ((wnb0) obj2).run();
                return zy11Var;
            case 13:
                renderBottomSheet$lambda$12 = ChangePaymentMethodFragment.renderBottomSheet$lambda$12((ChangePaymentMethodFragment) obj3, (jd9) obj2);
                return renderBottomSheet$lambda$12;
            case 14:
                gn9 gn9Var = (gn9) obj2;
                rn9 rn9Var = ((com.yandex.go.chargers.attention.presentation.b) obj3).a;
                io9 io9Var = rn9Var.z;
                km9 km9Var = gn9Var.d;
                c29 c29Var = ((bx9) io9Var.a).D;
                if (km9Var instanceof hm9) {
                    hx9 hx9Var = (hx9) c29Var.b;
                    hx9Var.A((m950) ((yvf0) hx9Var.L).get(), new dn9((hm9) km9Var), c21Var);
                } else if (km9Var instanceof jm9) {
                    jm9 jm9Var = (jm9) km9Var;
                    c29Var.getClass();
                    Iterator it = ChargersDiscountTypeDto.b().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (jl40.l(((ChargersDiscountTypeDto) obj).name(), jm9Var.a)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    ChargersDiscountTypeDto chargersDiscountTypeDto = (ChargersDiscountTypeDto) obj;
                    if (chargersDiscountTypeDto != null) {
                        ((hx9) c29Var.b).r(new fx9(new ir9(chargersDiscountTypeDto, jm9Var.b, null), i3));
                    }
                } else if (!(km9Var instanceof im9)) {
                    w511.b();
                    return null;
                }
                em9 em9Var = rn9Var.x;
                String str2 = gn9Var.e;
                em9Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("promo_offer_id", str2);
                em9Var.a.a("Chargers.MainScreen.OfferNotch.Tapped", hashMap, 1, new HashMap());
                return zy11Var;
            case 15:
                fo9Var = ((ChargersBackgroundModalView) obj3).chargersBackgroundPresenter;
                hwa hwaVar = ((lwa) obj2).x;
                ChargersScreenWithSurge chargersScreenWithSurge = (ChargersScreenWithSurge) e.d(fo9Var.y.b).a.getValue();
                int i4 = chargersScreenWithSurge == null ? -1 : do9.a[chargersScreenWithSurge.ordinal()];
                if (i4 != -1) {
                    if (i4 == 1) {
                        fo9Var.A.a(ChargersAnalytics$ChargersLocationCardButtonNameV3.Surge);
                    } else {
                        if (i4 != 2) {
                            w511.b();
                            return null;
                        }
                        em9.p(fo9Var.x, ChargersAnalytics$ChargersOfferCardButtonNameV6.Surge, null, null, null, null, null, 62);
                    }
                }
                jo9 jo9Var = (jo9) fo9Var.B.a;
                jo9Var.A(jo9Var.H.a(jo9Var.F), hwaVar, c21Var);
                return zy11Var;
            case 16:
                ((tls) obj3).invoke((qo9) obj2);
                return zy11Var;
            case 17:
                tls tlsVar = (tls) obj3;
                ?? r2 = ((mya) obj2).l.d;
                if (r2 != 0) {
                    tj9Var = r2;
                }
                tlsVar.invoke(new es9(tj9Var));
                return zy11Var;
            case 18:
                tls tlsVar2 = (tls) obj3;
                ?? r22 = ((kna) obj2).m.d;
                if (r22 != 0) {
                    tj9Var = r22;
                }
                tlsVar2.invoke(new es9(tj9Var));
                return zy11Var;
            case 19:
                nu9 nu9Var = (nu9) obj3;
                tls tlsVar3 = (tls) obj2;
                ChargersPromoDetailsDto chargersPromoDetailsDto = nu9Var.f;
                if (chargersPromoDetailsDto != null) {
                    tlsVar3.invoke(new sv9(chargersPromoDetailsDto, nu9Var.a));
                }
                return zy11Var;
            case 20:
                pu9 pu9Var = (pu9) obj3;
                tls tlsVar4 = (tls) obj2;
                ChargersProgressDiscountDetailsDto chargersProgressDiscountDetailsDto = pu9Var.k;
                if (chargersProgressDiscountDetailsDto != null) {
                    tlsVar4.invoke(new sv9(chargersProgressDiscountDetailsDto, pu9Var.a));
                }
                return zy11Var;
            case 21:
                ru9 ru9Var = (ru9) obj3;
                tls tlsVar5 = (tls) obj2;
                ChargersPromoDetailsDto chargersPromoDetailsDto2 = ru9Var.h;
                if (chargersPromoDetailsDto2 != null) {
                    tlsVar5.invoke(new sv9(chargersPromoDetailsDto2, ru9Var.a));
                }
                return zy11Var;
            case 22:
                su9 su9Var = (su9) obj3;
                tls tlsVar6 = (tls) obj2;
                ChargersTaskDiscountDetailsDto chargersTaskDiscountDetailsDto = su9Var.l;
                if (chargersTaskDiscountDetailsDto != null) {
                    tlsVar6.invoke(new sv9(chargersTaskDiscountDetailsDto, su9Var.a));
                }
                return zy11Var;
            case 23:
                tls tlsVar7 = (tls) obj3;
                tsa tsaVar = ((n7u0) obj2).a;
                if (tsaVar != null) {
                    tlsVar7.invoke(new xs9(tsaVar));
                }
                return zy11Var;
            case 24:
                dw9 dw9Var = (dw9) obj3;
                tls tlsVar8 = (tls) obj2;
                if (dw9Var instanceof yv9) {
                    uo9 uo9Var = ((yv9) dw9Var).d;
                    if (uo9Var != null && (uj9Var2 = uo9Var.d) != null) {
                        tlsVar8.invoke(new pv9(uj9Var2));
                    }
                } else if (dw9Var instanceof aw9) {
                    uo9 uo9Var2 = ((aw9) dw9Var).d;
                    if (uo9Var2 != null && (uj9Var = uo9Var2.d) != null) {
                        tlsVar8.invoke(new pv9(uj9Var));
                    }
                } else if (!(dw9Var instanceof zv9) && !(dw9Var instanceof cw9) && !(dw9Var instanceof bw9)) {
                    w511.b();
                    return null;
                }
                return zy11Var;
            case 25:
                ((tls) obj3).invoke((yy9) obj2);
                return zy11Var;
            case 26:
                tls tlsVar9 = (tls) obj2;
                xy9 xy9Var = ((ty9) obj3).e;
                if (xy9Var != null) {
                    tlsVar9.invoke(xy9Var);
                }
                return zy11Var;
            case 27:
                ((tls) obj3).invoke(((w7a) obj2).g);
                return zy11Var;
            case 28:
                a8a a8aVar = (a8a) obj2;
                ((tls) obj3).invoke(new daa(a8aVar.g, a8aVar.h));
                return zy11Var;
            default:
                renderSuccess$lambda$0 = ChargersOfferModalView.renderSuccess$lambda$0((ChargersOfferModalView) obj3, (oaa) obj2);
                return renderSuccess$lambda$0;
        }
    }

    public /* synthetic */ u08(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
