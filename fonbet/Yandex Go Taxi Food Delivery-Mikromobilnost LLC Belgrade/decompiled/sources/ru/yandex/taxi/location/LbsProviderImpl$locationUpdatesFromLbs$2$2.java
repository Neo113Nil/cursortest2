package ru.yandex.taxi.location;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import io.appmetrica.analytics.BuildConfig;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.analytics.o;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Landroid/location/Location;", "", "th", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.location.LbsProviderImpl$locationUpdatesFromLbs$2$2", f = "LbsProviderImpl.kt", l = {BuildConfig.API_LEVEL}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class LbsProviderImpl$locationUpdatesFromLbs$2$2 extends SuspendLambda implements zls {
    final /* synthetic */ String $subscriberName;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LbsProviderImpl$locationUpdatesFromLbs$2$2(g gVar, String str, Continuation continuation) {
        super(3, continuation);
        this.this$0 = gVar;
        this.$subscriberName = str;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LbsProviderImpl$locationUpdatesFromLbs$2$2 lbsProviderImpl$locationUpdatesFromLbs$2$2 = new LbsProviderImpl$locationUpdatesFromLbs$2$2(this.this$0, this.$subscriberName, (Continuation) obj3);
        lbsProviderImpl$locationUpdatesFromLbs$2$2.L$0 = (Throwable) obj2;
        return lbsProviderImpl$locationUpdatesFromLbs$2$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th = (Throwable) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            o oVar = this.this$0.l;
            String str = this.$subscriberName;
            this.L$0 = null;
            this.label = 1;
            if (oVar.f(str, th, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
