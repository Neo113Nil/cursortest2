package ru.yandex.taxi.communications;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.iux0;
import defpackage.m4b1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.sls;
import defpackage.tse;
import defpackage.v770;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.banners.BannerType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.communications.BannerDeeplinkRouterImpl$launchAddCreditCard$1", f = "BannerDeeplinkRouterImpl.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class BannerDeeplinkRouterImpl$launchAddCreditCard$1 extends SuspendLambda implements wls {
    final /* synthetic */ BannerType $bannerType;
    final /* synthetic */ sls $onClose;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerDeeplinkRouterImpl$launchAddCreditCard$1(a aVar, BannerType bannerType, sls slsVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$bannerType = bannerType;
        this.$onClose = slsVar;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BannerDeeplinkRouterImpl$launchAddCreditCard$1(this.this$0, this.$bannerType, this.$onClose, this.$url, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BannerDeeplinkRouterImpl$launchAddCreditCard$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                com.yandex.go.payments.deeplink.a aVar = (com.yandex.go.payments.deeplink.a) this.this$0.e.get();
                oep0 oep0Var = this.this$0.d;
                v770 c = m4b1.c(this.$bannerType);
                sls slsVar = this.$onClose;
                this.label = 1;
                Object a = aVar.a(oep0Var, c, slsVar, this);
                this = a;
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                this = this;
            }
        } catch (Throwable th) {
            ((iux0) this.this$0.b).b(this.$url, th);
        }
        return zy11.a;
    }
}
