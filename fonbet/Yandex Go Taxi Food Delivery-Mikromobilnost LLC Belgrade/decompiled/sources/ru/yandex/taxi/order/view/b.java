package ru.yandex.taxi.order.view;

import com.yandex.go.payments.data.model.response.CashLikeAccount;
import com.yandex.go.payments.data.model.response.CorpAccount;
import com.yandex.go.payments.data.model.response.DeliveryPaymentMethod;
import com.yandex.go.payments.data.model.response.FastshiftAccount;
import com.yandex.go.payments.data.model.response.Kaspi;
import com.yandex.go.payments.data.model.response.MBankAccount;
import com.yandex.go.payments.data.model.response.NequiToken;
import com.yandex.go.payments.data.model.response.PaymentMethods;
import com.yandex.go.payments.data.model.response.PersonalAccount;
import com.yandex.go.payments.data.model.response.SbpBindToken;
import com.yandex.go.payments.data.model.response.SbpToken;
import com.yandex.go.payments.data.model.response.SharedAccount;
import com.yandex.go.payments.data.model.response.YangoPaySimpleIntegrationDto;
import com.yandex.go.payments.data.model.response.YapeToken;
import com.yandex.go.payments.data.model.response.y1;
import com.yandex.go.payments.paymentlist.ui.IconType;
import com.yandex.go.payments.ui.PaymentIconInfoType;
import com.yandex.go.yb.api.domain.model.YbSdkPaymentMethodInfo$ProductType;
import defpackage.avj0;
import defpackage.dyc;
import defpackage.eq51;
import defpackage.fga0;
import defpackage.fl8;
import defpackage.jst;
import defpackage.kyh0;
import defpackage.lz90;
import defpackage.ny61;
import defpackage.o8a0;
import defpackage.p8a0;
import defpackage.q0a0;
import defpackage.t0a0;
import defpackage.tma0;
import defpackage.u19;
import defpackage.uma0;
import defpackage.uyz;
import defpackage.v8a0;
import defpackage.w511;
import defpackage.xku0;
import defpackage.xvz;
import defpackage.yu0;
import defpackage.yy51;
import defpackage.zuj0;
import java.math.BigDecimal;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.gopayments.dto.SharedAccountType;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class b implements o8a0 {
    public final fga0 a;
    public final xku0 b;
    public final zuj0 c;
    public final tma0 d;
    public final eq51 e;
    public final com.yandex.go.payments.common.a f;

    public b(fga0 fga0Var, xku0 xku0Var, zuj0 zuj0Var, tma0 tma0Var, eq51 eq51Var, com.yandex.go.payments.common.a aVar) {
        this.a = fga0Var;
        this.b = xku0Var;
        this.c = zuj0Var;
        this.d = tma0Var;
        this.e = eq51Var;
        this.f = aVar;
    }

    public final v8a0 b(int i) {
        return new v8a0(((avj0) this.c).h(i), xvz.g(IconType.CASH_LIKE, this.f));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(BigDecimal bigDecimal, String str, ContinuationImpl continuationImpl) {
        PaymentMethodViewModelProviderImpl$getCashViewModel$1 paymentMethodViewModelProviderImpl$getCashViewModel$1;
        int i;
        String str2;
        if (continuationImpl instanceof PaymentMethodViewModelProviderImpl$getCashViewModel$1) {
            paymentMethodViewModelProviderImpl$getCashViewModel$1 = (PaymentMethodViewModelProviderImpl$getCashViewModel$1) continuationImpl;
            int i2 = paymentMethodViewModelProviderImpl$getCashViewModel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodViewModelProviderImpl$getCashViewModel$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodViewModelProviderImpl$getCashViewModel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodViewModelProviderImpl$getCashViewModel$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    xku0 xku0Var = this.b;
                    lz90 lz90Var = xku0Var.c;
                    PaymentMethods g = xku0Var.a.b.g();
                    lz90Var.getClass();
                    PaymentMethods.LocationInfo locationInfo = g.o;
                    u19 u19Var = new u19(locationInfo != null ? locationInfo.b : null);
                    String h = ((avj0) this.c).h(kyh0.summary_payment_cash);
                    paymentMethodViewModelProviderImpl$getCashViewModel$1.L$0 = null;
                    paymentMethodViewModelProviderImpl$getCashViewModel$1.L$1 = null;
                    paymentMethodViewModelProviderImpl$getCashViewModel$1.L$2 = null;
                    paymentMethodViewModelProviderImpl$getCashViewModel$1.L$3 = h;
                    paymentMethodViewModelProviderImpl$getCashViewModel$1.label = 1;
                    Object b = this.f.b(u19Var, bigDecimal, str, paymentMethodViewModelProviderImpl$getCashViewModel$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = b;
                    str2 = h;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) paymentMethodViewModelProviderImpl$getCashViewModel$1.L$3;
                    kotlin.b.b(obj);
                }
                return new v8a0(str2, (t0a0) obj);
            }
        }
        paymentMethodViewModelProviderImpl$getCashViewModel$1 = new PaymentMethodViewModelProviderImpl$getCashViewModel$1(this, continuationImpl);
        Object obj2 = paymentMethodViewModelProviderImpl$getCashViewModel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodViewModelProviderImpl$getCashViewModel$1.label;
        if (i != 0) {
        }
        return new v8a0(str2, (t0a0) obj2);
    }

    public final Object d(PaymentMethod$Type paymentMethod$Type, String str, BigDecimal bigDecimal, String str2, ContinuationImpl continuationImpl) {
        String str3;
        String h;
        DeliveryPaymentMethod.Display display;
        String h2;
        q0a0 g;
        String h3;
        SharedAccount.Details details;
        String str4;
        t0a0 g2;
        String h4;
        t0a0 g3;
        String h5;
        t0a0 g4;
        String h6;
        t0a0 g5;
        String h7;
        t0a0 g6;
        String h8;
        t0a0 g7;
        String h9;
        t0a0 g8;
        String h10;
        if (paymentMethod$Type != null) {
            int i = p8a0.a[paymentMethod$Type.ordinal()];
            int i2 = 2;
            xku0 xku0Var = this.b;
            fga0 fga0Var = this.a;
            zuj0 zuj0Var = this.c;
            com.yandex.go.payments.common.a aVar = this.f;
            switch (i) {
                case 1:
                    Object c = c(bigDecimal, str2, continuationImpl);
                    return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : (v8a0) c;
                case 2:
                    fl8 a = str != null ? xku0Var.a(str) : null;
                    if (a != null) {
                        uma0 uma0Var = (uma0) this.d;
                        if (uma0Var.b(a).length() != 0) {
                            return new v8a0(uma0Var.b(a), aVar.e(PaymentIconInfoType.CARD_BANK_NAME, a.i, new yu0(18, a)));
                        }
                    }
                    return new v8a0(((avj0) zuj0Var).h(kyh0.summary_payment_card), xvz.g(IconType.GENERIC_CARD, aVar));
                case 3:
                    CorpAccount j = fga0Var.j(str);
                    return (j == null || (str3 = j.b) == null || str3.length() == 0) ? new v8a0(((avj0) zuj0Var).h(kyh0.summary_payment_corp), xvz.g(IconType.CORP, aVar)) : new v8a0(str3, xvz.g(IconType.CORP, aVar));
                case 4:
                    DeliveryPaymentMethod h11 = fga0Var.h(str);
                    if (h11 == null || (display = h11.b) == null || (h = display.c) == null) {
                        h = ((avj0) zuj0Var).h(kyh0.summary_payment_cargocorp);
                    }
                    return new v8a0(h, xvz.g(IconType.CARGO_CORP, aVar));
                case 5:
                    return new v8a0(((avj0) zuj0Var).h(kyh0.google_pay), xvz.g(IconType.GOOGLE_PAY, aVar));
                case 6:
                    PersonalAccount r = fga0Var.r(str);
                    if (r == null || (h2 = r.b) == null || h2.length() == 0) {
                        h2 = ((avj0) zuj0Var).h(kyh0.paymentmethod_personal_wallet);
                    }
                    return new v8a0(h2, xvz.g(IconType.PERSONAL_WALLET, aVar));
                case 7:
                    SharedAccount o = fga0Var.o(str);
                    if (o == null || (str4 = (details = o.h).a) == null || str4.length() == 0) {
                        g = xvz.g(IconType.SHARED_FAMILY, aVar);
                        h3 = ((avj0) zuj0Var).h(kyh0.shared_payment);
                    } else {
                        g = xvz.g(o.n() == SharedAccountType.BUSINESS ? IconType.SHARED_BUSINESS : IconType.SHARED_FAMILY, aVar);
                        h3 = details.a;
                    }
                    return new v8a0(h3, g);
                case 8:
                    if (str == null) {
                        str = "";
                    }
                    yy51 b = xku0Var.b(str);
                    eq51 eq51Var = this.e;
                    if (b != null) {
                        return new v8a0(eq51Var.a(b).b, aVar.e(PaymentIconInfoType.CARD_BANK_NAME, b.d, new uyz(IconType.GENERIC_CARD, i2)));
                    }
                    String a2 = eq51Var.b.a(kyh0.yandex_pay_card_title_fallback);
                    YbSdkPaymentMethodInfo$ProductType ybSdkPaymentMethodInfo$ProductType = YbSdkPaymentMethodInfo$ProductType.WALLET;
                    return new v8a0(a2, xvz.g(IconType.GENERIC_CARD, aVar));
                case 9:
                    SbpToken v = fga0Var.v(str);
                    if (v == null || (h4 = v.d) == null || h4.length() == 0) {
                        g2 = xvz.g(IconType.SBP_TOKEN, aVar);
                        h4 = ((avj0) zuj0Var).h(kyh0.sbp_payment_full_title);
                    } else {
                        g2 = aVar.e(PaymentIconInfoType.SBP_TOKEN_BANK_NAME, v.c, new uyz(IconType.SBP_TOKEN, i2));
                    }
                    return new v8a0(h4, g2);
                case 10:
                    MBankAccount n = fga0Var.n(str);
                    if (n == null || (h5 = n.b) == null || h5.length() == 0) {
                        g3 = xvz.g(IconType.MBANK_ACCOUNT, aVar);
                        h5 = ((avj0) zuj0Var).h(kyh0.mbank_account_payment_method_name);
                    } else {
                        g3 = aVar.e(PaymentIconInfoType.CARD_BANK_NAME, n.d, new dyc(2));
                    }
                    return new v8a0(h5, g3);
                case 11:
                    YapeToken y = fga0Var.y(str);
                    if (y == null || (h6 = y.b) == null || h6.length() == 0) {
                        g4 = xvz.g(IconType.YAPE_TOKEN, aVar);
                        h6 = ((avj0) zuj0Var).h(kyh0.yape_token_payment_method_name);
                    } else {
                        g4 = aVar.e(PaymentIconInfoType.ICON_TAG, y.d, new uyz(IconType.YAPE_TOKEN, i2));
                    }
                    return new v8a0(h6, g4);
                case 12:
                    NequiToken p = fga0Var.p(str);
                    if (p == null || (h7 = p.b) == null || h7.length() == 0) {
                        g5 = xvz.g(IconType.NEQUI_TOKEN, aVar);
                        h7 = ((avj0) zuj0Var).h(kyh0.nequi_token_payment_method_name);
                    } else {
                        g5 = aVar.e(PaymentIconInfoType.ICON_TAG, p.d, new uyz(IconType.NEQUI_TOKEN, i2));
                    }
                    return new v8a0(h7, g5);
                case 13:
                    SbpBindToken u = fga0Var.u(str);
                    if (u == null || (h8 = u.b) == null || h8.length() == 0) {
                        g6 = xvz.g(IconType.SBP_BIND_TOKEN, aVar);
                        h8 = ((avj0) zuj0Var).h(kyh0.sbp_bind_token_payment_method_name);
                    } else {
                        g6 = aVar.e(PaymentIconInfoType.ICON_TAG, u.d, new uyz(IconType.SBP_BIND_TOKEN, i2));
                    }
                    return new v8a0(h8, g6);
                case 14:
                    Kaspi m = fga0Var.m(str);
                    if (m == null || (h9 = m.b) == null || h9.length() == 0) {
                        g7 = xvz.g(IconType.KASPI, aVar);
                        h9 = ((avj0) zuj0Var).h(kyh0.kaspi_payment_method_name);
                    } else {
                        g7 = aVar.e(PaymentIconInfoType.ICON_TAG, m.d, new uyz(IconType.KASPI, i2));
                    }
                    return new v8a0(h9, g7);
                case 15:
                    return b(kyh0.click_wallet_payment_method_name);
                case 16:
                    return b(kyh0.easypaisa_wallet_payment_method_name);
                case 17:
                    return b(kyh0.jazzcash_wallet_payment_method_name);
                case 18:
                    FastshiftAccount k = fga0Var.k(str);
                    if (k == null || (h10 = k.b) == null || h10.length() == 0) {
                        g8 = xvz.g(IconType.FASTSHIFT_ACCOUNT, aVar);
                        h10 = ((avj0) zuj0Var).h(kyh0.fastshift_account_payment_method_name);
                    } else {
                        g8 = aVar.e(PaymentIconInfoType.ICON_TAG, k.d, new uyz(IconType.FASTSHIFT_ACCOUNT, i2));
                    }
                    return new v8a0(h10, g8);
                case 19:
                    y1 x = fga0Var.x(str);
                    if (str == null || !(x instanceof YangoPaySimpleIntegrationDto)) {
                        return new v8a0(((avj0) zuj0Var).h(kyh0.yango_wallet_card_title_fallback), xvz.g(IconType.YANGO_WALLET, aVar));
                    }
                    YangoPaySimpleIntegrationDto yangoPaySimpleIntegrationDto = (YangoPaySimpleIntegrationDto) x;
                    return new v8a0(yangoPaySimpleIntegrationDto.b, aVar.e(PaymentIconInfoType.ICON_TAG, yangoPaySimpleIntegrationDto.c, new uyz(IconType.CASH_LIKE, i2)));
                case 20:
                    CashLikeAccount i3 = fga0Var.i(str);
                    return i3 != null ? new v8a0(i3.b, aVar.e(PaymentIconInfoType.ICON_TAG, i3.c, new uyz(IconType.CASH_LIKE, i2))) : new v8a0(((avj0) zuj0Var).h(kyh0.summary_payment_method_title), xvz.g(IconType.CASH_LIKE, aVar));
                case 21:
                    jst.e.s(new IllegalStateException("Transport cards are not supported in /paymentmethods request"));
                    return new v8a0("", xvz.g(IconType.GENERIC_CARD, aVar));
                case 22:
                    break;
                case 23:
                    return new v8a0("", xvz.g(IconType.GENERIC_CARD, aVar));
                default:
                    w511.b();
                    return null;
            }
        }
        return null;
    }
}
