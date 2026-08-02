package ru.yandex.taxi.hiredriver;

import com.yandex.go.hiredriver.api.HireDriverOpenReason;
import defpackage.gku;
import defpackage.hku;
import defpackage.jku;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.yju;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.hiredriver.HireDriverRouterImpl$onLaunch$1", f = "HireDriverRouterImpl.kt", l = {41}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class HireDriverRouterImpl$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ jku $payload;
    Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HireDriverRouterImpl$onLaunch$1(d dVar, jku jkuVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$payload = jkuVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HireDriverRouterImpl$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((HireDriverRouterImpl$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        d dVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar2 = this.this$0;
            gku gkuVar = dVar2.E;
            this.L$0 = dVar2;
            this.label = 1;
            Object y = e.y(new b(gkuVar.a.a.a(), gkuVar), this);
            if (y == coroutineSingletons) {
                return coroutineSingletons;
            }
            dVar = dVar2;
            obj = y;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dVar = (d) this.L$0;
            kotlin.b.b(obj);
        }
        dVar.P((yju) obj, HireDriverOpenReason.DEEPLINK, ((hku) this.$payload).a);
        return zy11.a;
    }
}
