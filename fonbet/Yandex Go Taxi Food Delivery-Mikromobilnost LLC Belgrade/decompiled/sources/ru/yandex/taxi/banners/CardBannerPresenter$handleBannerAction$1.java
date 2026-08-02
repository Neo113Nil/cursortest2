package ru.yandex.taxi.banners;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.ar4;
import defpackage.avj0;
import defpackage.br4;
import defpackage.cr4;
import defpackage.dr4;
import defpackage.fb8;
import defpackage.gw00;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.taxi.communications.api.dto.BannerWidgets;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.banners.CardBannerPresenter$handleBannerAction$1", f = "CardBannerPresenter.kt", l = {250}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class CardBannerPresenter$handleBannerAction$1 extends SuspendLambda implements wls {
    final /* synthetic */ BannerWidgets.b $actionButton;
    final /* synthetic */ BannerWidgets.a $baseAction;
    final /* synthetic */ BannerWidgets.c $payload;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardBannerPresenter$handleBannerAction$1(d dVar, BannerWidgets.b bVar, BannerWidgets.c cVar, BannerWidgets.a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$actionButton = bVar;
        this.$payload = cVar;
        this.$baseAction = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardBannerPresenter$handleBannerAction$1(this.this$0, this.$actionButton, this.$payload, this.$baseAction, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardBannerPresenter$handleBannerAction$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, ru.yandex.taxi.communications.api.dto.BannerWidgets$b] */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, ru.yandex.taxi.communications.api.dto.BannerWidgets$b] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BannerWidgets.c cVar;
        Ref$ObjectRef ref$ObjectRef;
        d dVar;
        BannerWidgets.c cVar2;
        BannerWidgets.b bVar;
        d dVar2;
        BannerWidgets.a aVar;
        BannerWidgets.b bVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                this.this$0.B = null;
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                ref$ObjectRef2.element = this.$actionButton;
                ?? a = BannerWidgets.b.a(this.$actionButton, null, new BannerWidgets.a(BannerWidgets.ActionType.SAVE_BENEFIT, BannerWidgets.c.a(this.$payload, ((avj0) this.this$0.v.a).h(kyh0.promocodes_scooters_use_button_loading), null)), false, true, MSException.RPC_S_SERVER_TOO_BUSY);
                d dVar3 = this.this$0;
                ((fb8) dVar3.a).updateButton((BannerWidgets.b) ref$ObjectRef2.element, a, dVar3.e.s.a());
                ref$ObjectRef2.element = a;
                d dVar4 = this.this$0;
                cVar = this.$payload;
                BannerWidgets.b bVar3 = this.$actionButton;
                BannerWidgets.a aVar2 = this.$baseAction;
                try {
                    com.yandex.go.benefits_center.activation.data.b bVar4 = dVar4.t;
                    String str = cVar.e;
                    this.L$0 = ref$ObjectRef2;
                    this.L$1 = null;
                    this.L$2 = dVar4;
                    this.L$3 = cVar;
                    this.L$4 = bVar3;
                    this.L$5 = aVar2;
                    this.L$6 = cVar;
                    this.L$7 = dVar4;
                    this.L$8 = bVar3;
                    this.label = 1;
                    Object a2 = bVar4.a(str, this);
                    if (a2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = a2;
                    ref$ObjectRef = ref$ObjectRef2;
                    dVar2 = dVar4;
                    aVar = aVar2;
                    bVar2 = bVar3;
                } catch (Throwable unused) {
                    ref$ObjectRef = ref$ObjectRef2;
                    dVar = dVar4;
                    cVar2 = cVar;
                    bVar = bVar3;
                    ((fb8) dVar.a).updateButton((BannerWidgets.b) ref$ObjectRef.element, BannerWidgets.b.a(bVar, null, new BannerWidgets.a(BannerWidgets.ActionType.SAVE_BENEFIT, BannerWidgets.c.a(cVar2, ((avj0) dVar.v.a).h(kyh0.try_again), ((avj0) dVar.v.a).h(kyh0.benefits_center_promo_promocode_error_subtitle))), true, false, 3771), dVar.e.s.a());
                    dVar.B = PromoBannerActivationStatus.ERROR;
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar = (BannerWidgets.b) this.L$8;
                d dVar5 = (d) this.L$7;
                cVar2 = (BannerWidgets.c) this.L$6;
                BannerWidgets.a aVar3 = (BannerWidgets.a) this.L$5;
                BannerWidgets.b bVar5 = (BannerWidgets.b) this.L$4;
                BannerWidgets.c cVar3 = (BannerWidgets.c) this.L$3;
                d dVar6 = (d) this.L$2;
                ref$ObjectRef = (Ref$ObjectRef) this.L$0;
                try {
                    kotlin.b.b(obj);
                    dVar2 = dVar6;
                    bVar2 = bVar5;
                    cVar = cVar3;
                    aVar = aVar3;
                } catch (Throwable unused2) {
                    dVar = dVar5;
                    ((fb8) dVar.a).updateButton((BannerWidgets.b) ref$ObjectRef.element, BannerWidgets.b.a(bVar, null, new BannerWidgets.a(BannerWidgets.ActionType.SAVE_BENEFIT, BannerWidgets.c.a(cVar2, ((avj0) dVar.v.a).h(kyh0.try_again), ((avj0) dVar.v.a).h(kyh0.benefits_center_promo_promocode_error_subtitle))), true, false, 3771), dVar.e.s.a());
                    dVar.B = PromoBannerActivationStatus.ERROR;
                    return zy11.a;
                }
            }
            dr4 dr4Var = (dr4) obj;
            if (dr4Var instanceof cr4) {
                ((fb8) dVar2.a).updateButton((BannerWidgets.b) ref$ObjectRef.element, BannerWidgets.b.a(bVar2, cVar.d, new BannerWidgets.a(BannerWidgets.ActionType.DEEPLINK, new BannerWidgets.c(dVar2.u.a(gw00.e(new Pair(AuthSdkActivity.RESPONSE_TYPE_CODE, cVar.e))), false, 1022)), true, false, MSException.RPC_S_SERVER_TOO_BUSY), dVar2.e.s.a());
                dVar2.B = PromoBannerActivationStatus.ACTIVATED;
            } else if (dr4Var instanceof br4) {
                String str2 = ((br4) dr4Var).a;
                if (str2 == null) {
                    str2 = ((avj0) dVar2.v.a).h(kyh0.benefits_center_promo_default_error);
                }
                ((fb8) dVar2.a).updateButton((BannerWidgets.b) ref$ObjectRef.element, BannerWidgets.b.a(bVar2, str2, aVar, false, false, 3771), dVar2.e.s.a());
            } else {
                if (!jl40.l(dr4Var, ar4.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((fb8) dVar2.a).updateButton((BannerWidgets.b) ref$ObjectRef.element, BannerWidgets.b.a(bVar2, null, new BannerWidgets.a(BannerWidgets.ActionType.SAVE_BENEFIT, BannerWidgets.c.a(cVar, ((avj0) dVar2.v.a).h(kyh0.try_again), ((avj0) dVar2.v.a).h(kyh0.benefits_center_promo_promocode_error_subtitle))), true, false, 3771), dVar2.e.s.a());
                dVar2.B = PromoBannerActivationStatus.ERROR;
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
