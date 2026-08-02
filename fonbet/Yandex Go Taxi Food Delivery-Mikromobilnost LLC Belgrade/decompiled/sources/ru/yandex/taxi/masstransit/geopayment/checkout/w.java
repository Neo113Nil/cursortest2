package ru.yandex.taxi.masstransit.geopayment.checkout;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.yandex.payment.sdk.core.data.Merchant;
import com.yandex.payment.sdk.core.data.Payer;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.core.data.PaymentMethodsFilter;
import com.yandex.payment.sdk.model.data.AdditionalSettings;
import com.yandex.payment.sdk.model.data.DefaultLegalUrlId;
import com.yandex.payment.sdk.model.data.PreselectButtonState;
import com.yandex.payment.sdk.ui.BaseActivity;
import com.yandex.payment.sdk.ui.DefaultTheme;
import com.yandex.payment.sdk.ui.preselect.PreselectActivity;
import defpackage.a60;
import defpackage.bd90;
import defpackage.c0a0;
import defpackage.ddi0;
import defpackage.dia0;
import defpackage.dy40;
import defpackage.h55;
import defpackage.jst;
import defpackage.kj;
import defpackage.ksi0;
import defpackage.ny61;
import defpackage.o3a0;
import defpackage.p3a0;
import defpackage.qje;
import defpackage.r40;
import defpackage.tje;
import defpackage.tls;
import defpackage.u290;
import defpackage.vfa0;
import defpackage.vp21;
import defpackage.xl51;
import defpackage.xng0;
import defpackage.y50;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class w extends h55 {
    public final Context D;
    public final y50 E;
    public final ru.yandex.taxi.activity.g F;
    public final c0a0 G;
    public final ru.yandex.taxi.am.g H;
    public final vp21 I;
    public final e J;
    public final xl51 K;
    public final ddi0 L;
    public ksi0 M;
    public final p3a0 N;

    public w(Context context, y50 y50Var, ru.yandex.taxi.activity.g gVar, c0a0 c0a0Var, ru.yandex.taxi.am.g gVar2, vp21 vp21Var, e eVar, xl51 xl51Var) {
        super(null);
        this.D = context;
        this.E = y50Var;
        this.F = gVar;
        this.G = c0a0Var;
        this.H = gVar2;
        this.I = vp21Var;
        this.J = eVar;
        this.K = xl51Var;
        this.L = new ddi0();
        this.N = new p3a0(new tls() { // from class: ru.yandex.taxi.masstransit.geopayment.checkout.v
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                w wVar = w.this;
                tje.N(wVar.o(), null, null, new PaymentRouter$selectedMethodObserver$1$1(wVar, (PaymentMethod) obj, null), 3);
                return zy11.a;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(w wVar, vfa0 vfa0Var, ContinuationImpl continuationImpl) {
        PaymentRouter$onLaunchSuspend$1 paymentRouter$onLaunchSuspend$1;
        int i;
        ksi0 a;
        int i2;
        Context context = wVar.D;
        p3a0 p3a0Var = wVar.N;
        if (continuationImpl instanceof PaymentRouter$onLaunchSuspend$1) {
            paymentRouter$onLaunchSuspend$1 = (PaymentRouter$onLaunchSuspend$1) continuationImpl;
            int i3 = paymentRouter$onLaunchSuspend$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                paymentRouter$onLaunchSuspend$1.label = i3 - Integer.MIN_VALUE;
                Object obj = paymentRouter$onLaunchSuspend$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentRouter$onLaunchSuspend$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.am.g gVar = wVar.H;
                    kj Ig = gVar.a.Ig();
                    if (Ig == null) {
                        jst.e.s(new IllegalStateException("PaymentApi require authorized user"));
                        a = null;
                    } else {
                        Payer payer = new Payer(gVar.b(), Ig.g, String.valueOf(Ig.a), Ig.e, Ig.f, ((ru.yandex.taxi.startup.launch.h) wVar.I).Og());
                        PaymentMethodsFilter paymentMethodsFilter = new PaymentMethodsFilter(true, false, true, true, true, true);
                        AdditionalSettings.a aVar = new AdditionalSettings.a();
                        aVar.b = paymentMethodsFilter;
                        aVar.h = true;
                        Pair pair = new Pair(DefaultLegalUrlId.CONDITIONS_OF_USE.getKey(), "https://yandex.ru/legal/tickets_booking_conditions/ru/");
                        String key = DefaultLegalUrlId.PRIVACY_POLICY.getKey();
                        xl51 xl51Var = wVar.K;
                        xl51Var.getClass();
                        aVar.q = kotlin.collections.b.i(pair, new Pair(key, xl51Var.a(xl51Var.e)));
                        a = wVar.G.a(payer, new Merchant("transport_payment_1ce163f7af7d64eea2728f0fcdd2c4da"), aVar.a(), qje.s(xng0.themeDarkMode, context) ? DefaultTheme.DARK : DefaultTheme.LIGHT, null);
                    }
                    wVar.M = a;
                    if (a == null) {
                        return zy11Var;
                    }
                    o3a0 o3a0Var = o3a0.b;
                    o3a0Var.a.m(null);
                    dy40 dy40Var = new dy40();
                    o3a0Var.a = dy40Var;
                    dy40Var.g(p3a0Var);
                    ddi0 ddi0Var = wVar.L;
                    double d = vfa0Var.a;
                    PackageManager packageManager = context.getPackageManager();
                    ddi0Var.getClass();
                    Intent putExtra = a.f(PreselectActivity.class, null).putExtra(BaseActivity.EXTRA_PRESELECT_BUTTON_STATE, new PreselectButtonState(true, d, null)).putExtra(BaseActivity.BIND_NEW_CARD_BEFORE_PAYMENT, true);
                    if (putExtra.resolveActivity(packageManager) == null) {
                        putExtra = null;
                    }
                    if (putExtra != null) {
                        a60 a60Var = (a60) wVar.E;
                        a60Var.getClass();
                        try {
                            a60Var.e(144, putExtra);
                        } catch (ActivityNotFoundException unused) {
                        }
                        ru.yandex.taxi.activity.g gVar2 = wVar.F;
                        paymentRouter$onLaunchSuspend$1.L$0 = null;
                        paymentRouter$onLaunchSuspend$1.L$1 = null;
                        paymentRouter$onLaunchSuspend$1.L$2 = null;
                        paymentRouter$onLaunchSuspend$1.label = 1;
                        obj = gVar2.d(144, paymentRouter$onLaunchSuspend$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                r40 r40Var = (r40) obj;
                o3a0 o3a0Var2 = o3a0.b;
                o3a0Var2.a.j(p3a0Var);
                o3a0Var2.a.m(null);
                i2 = r40Var.a;
                Intent intent = r40Var.c;
                if (i2 != -1) {
                    wVar.r(new bd90(29));
                } else if (intent == null || !intent.hasExtra("ERROR")) {
                    wVar.r(new dia0(0));
                } else {
                    wVar.r(new u290(23, (PaymentKitError) intent.getParcelableExtra("ERROR")));
                }
                return zy11Var;
            }
        }
        paymentRouter$onLaunchSuspend$1 = new PaymentRouter$onLaunchSuspend$1(wVar, continuationImpl);
        Object obj2 = paymentRouter$onLaunchSuspend$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentRouter$onLaunchSuspend$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        r40 r40Var2 = (r40) obj2;
        o3a0 o3a0Var22 = o3a0.b;
        o3a0Var22.a.j(p3a0Var);
        o3a0Var22.a.m(null);
        i2 = r40Var2.a;
        Intent intent2 = r40Var2.c;
        if (i2 != -1) {
        }
        return zy11Var2;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new PaymentRouter$onLaunch$1(this, (vfa0) obj, null), 3);
    }
}
