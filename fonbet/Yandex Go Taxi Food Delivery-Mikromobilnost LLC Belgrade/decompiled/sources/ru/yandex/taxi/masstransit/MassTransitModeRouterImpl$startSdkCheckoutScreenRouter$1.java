package ru.yandex.taxi.masstransit;

import android.content.Context;
import com.yandex.fintechsdk.entities.theme.Theme;
import com.yandex.fintechsdk.flows.payment.kit.api.model.AdditionalSettings;
import com.yandex.fintechsdk.flows.payment.kit.api.model.ConsoleLoggingMode;
import com.yandex.fintechsdk.flows.payment.kit.api.model.Merchant;
import com.yandex.fintechsdk.flows.payment.kit.api.model.Payer;
import com.yandex.fintechsdk.flows.payment.kit.api.model.PaymentKitEnvironment;
import com.yandex.go.masstransit.sdk.checkout.impl.checkout.domain.k;
import com.yandex.go.masstransit.sdk.checkout.impl.checkout.domain.s;
import com.yandex.go.masstransit.sdk.checkout.impl.checkout.i;
import com.yandex.go.masstransit.sdk.core.MasstransitSdkEnvironment;
import defpackage.b0a0;
import defpackage.c0g;
import defpackage.c29;
import defpackage.cjb;
import defpackage.cot;
import defpackage.d0g;
import defpackage.djb;
import defpackage.dmb;
import defpackage.e310;
import defpackage.ejb;
import defpackage.enb;
import defpackage.fjb;
import defpackage.fnb;
import defpackage.fq30;
import defpackage.g010;
import defpackage.gl21;
import defpackage.h410;
import defpackage.hhw;
import defpackage.i3g;
import defpackage.jo0;
import defpackage.md30;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p370;
import defpackage.po21;
import defpackage.pwy0;
import defpackage.q1j0;
import defpackage.sb0;
import defpackage.tse;
import defpackage.w030;
import defpackage.w310;
import defpackage.w511;
import defpackage.wls;
import defpackage.yq30;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.masstransit.domain.h;
import ru.yandex.taxi.masstransit.domain.i0;
import ru.yandex.taxi.masstransit.model.MtCheckoutDeeplinkStatus;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.MassTransitModeRouterImpl$startSdkCheckoutScreenRouter$1", f = "MassTransitModeRouterImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MassTransitModeRouterImpl$startSdkCheckoutScreenRouter$1 extends SuspendLambda implements wls {
    final /* synthetic */ MtCheckoutDeeplinkStatus $deeplinkStatus;
    final /* synthetic */ yq30 $originScreen;
    final /* synthetic */ dmb $payload;
    final /* synthetic */ q1j0 $replaceStrategy;
    final /* synthetic */ e310 $this_startSdkCheckoutScreenRouter;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MassTransitModeRouterImpl$startSdkCheckoutScreenRouter$1(MtCheckoutDeeplinkStatus mtCheckoutDeeplinkStatus, e310 e310Var, d dVar, dmb dmbVar, q1j0 q1j0Var, yq30 yq30Var, Continuation continuation) {
        super(2, continuation);
        this.$deeplinkStatus = mtCheckoutDeeplinkStatus;
        this.$this_startSdkCheckoutScreenRouter = e310Var;
        this.this$0 = dVar;
        this.$payload = dmbVar;
        this.$replaceStrategy = q1j0Var;
        this.$originScreen = yq30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MassTransitModeRouterImpl$startSdkCheckoutScreenRouter$1(this.$deeplinkStatus, this.$this_startSdkCheckoutScreenRouter, this.this$0, this.$payload, this.$replaceStrategy, this.$originScreen, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MassTransitModeRouterImpl$startSdkCheckoutScreenRouter$1 massTransitModeRouterImpl$startSdkCheckoutScreenRouter$1 = (MassTransitModeRouterImpl$startSdkCheckoutScreenRouter$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        massTransitModeRouterImpl$startSdkCheckoutScreenRouter$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Theme theme;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        md30 md30Var = MtCheckoutDeeplinkStatus.Companion;
        d0g d0gVar = ((c0g) ((i3g) this.$this_startSdkCheckoutScreenRouter).a).A.a;
        c0g c0gVar = d0gVar.b;
        h410 h410Var = (h410) c0gVar.lz.get();
        Context context = (Context) c0gVar.U.get();
        w030 w030Var = (w030) c0gVar.o0.get();
        i0 i0Var = new i0((po21) d0gVar.a.Y1.get());
        ru.yandex.taxi.masstransit.domain.e eVar = new ru.yandex.taxi.masstransit.domain.e(c0gVar.n0, new h((fq30) d0gVar.Z4.get()));
        w310 w310Var = (w310) d0gVar.b5.get();
        fjb fjbVar = (fjb) ((cjb) h410Var.b.getValue());
        fjbVar.getClass();
        fnb fnbVar = new fnb();
        hhw hhwVar = fjbVar.a;
        int i = ejb.a[((pwy0) hhwVar.j).getThemeType().ordinal()];
        int i2 = 2;
        int i3 = 1;
        if (i == 1) {
            theme = Theme.DAY;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            theme = Theme.NIGHT;
        }
        MasstransitSdkEnvironment masstransitSdkEnvironment = (MasstransitSdkEnvironment) hhwVar.b;
        masstransitSdkEnvironment.getClass();
        PaymentKitEnvironment paymentKitEnvironment = masstransitSdkEnvironment == MasstransitSdkEnvironment.PRODUCTION ? PaymentKitEnvironment.PRODUCTION : PaymentKitEnvironment.TESTING;
        b0a0 b0a0Var = new b0a0();
        b0a0Var.a = context.getApplicationContext();
        b0a0Var.b = paymentKitEnvironment;
        b0a0Var.c = ConsoleLoggingMode.AUTOMATIC;
        p370 a = b0a0Var.a();
        AdditionalSettings.a aVar = new AdditionalSettings.a();
        aVar.a = Boolean.FALSE;
        aVar.b = theme;
        s sVar = new s(context, a.h(aVar.a(), new Merchant("transport_payment_1ce163f7af7d64eea2728f0fcdd2c4da"), new Payer(null, null, null, null, null, ((gl21) hhwVar.c).a)));
        com.yandex.go.masstransit.sdk.checkout.impl.checkout.analytics.a aVar2 = new com.yandex.go.masstransit.sdk.checkout.impl.checkout.analytics.a(w310Var, fnbVar, sVar);
        k kVar = new k(fnbVar, fnbVar, new enb(), sVar, (com.yandex.go.masstransit.sdk.client_api.a) fjbVar.b.getValue(), i0Var);
        com.yandex.go.masstransit.sdk.checkout.impl.checkout.a aVar3 = new com.yandex.go.masstransit.sdk.checkout.impl.checkout.a(context, w030Var, kotlin.a.a(new djb(fjbVar, context, w030Var, 0)), kotlin.a.a(new djb(fjbVar, context, w030Var, i3)), kotlin.a.a(new sb0(fjbVar, context, w030Var, w310Var, 15)), kotlin.a.a(new djb(fjbVar, context, w030Var, i2)), kotlin.a.a(new jo0(fjbVar, context, w030Var, w310Var, 8)), new c29(21, kVar), new com.yandex.go.masstransit.sdk.checkout.impl.checkout.h(fnbVar, new i((zuj0) hhwVar.m, (ru.yandex.taxi.widget.c) hhwVar.n, (cot) hhwVar.l)), kVar, sVar, eVar, aVar2);
        d dVar = this.this$0;
        dVar.B(aVar3, this.$payload, new g010(this.$originScreen, aVar3, dVar, this.$this_startSdkCheckoutScreenRouter), this.$replaceStrategy);
        return zy11.a;
    }
}
