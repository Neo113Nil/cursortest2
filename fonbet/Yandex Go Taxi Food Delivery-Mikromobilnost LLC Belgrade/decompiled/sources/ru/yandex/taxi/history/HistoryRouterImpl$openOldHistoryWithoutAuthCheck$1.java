package ru.yandex.taxi.history;

import defpackage.avj0;
import defpackage.dt41;
import defpackage.fmu;
import defpackage.hxx;
import defpackage.kyh0;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.web.UiWebViewConfig;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.history.HistoryRouterImpl$openOldHistoryWithoutAuthCheck$1", f = "HistoryRouterImpl.kt", l = {HProv.PP_PASSWD_TERM}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class HistoryRouterImpl$openOldHistoryWithoutAuthCheck$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $extraActivity;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryRouterImpl$openOldHistoryWithoutAuthCheck$1(b bVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$extraActivity = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HistoryRouterImpl$openOldHistoryWithoutAuthCheck$1(this.this$0, this.$extraActivity, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((HistoryRouterImpl$openOldHistoryWithoutAuthCheck$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.am.token.a aVar = this.this$0.I;
            this.label = 1;
            d = aVar.d(false, this);
            if (d == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            d = ((Result) obj).getValue();
        }
        Object obj2 = d instanceof Result.Failure ? null : d;
        ru.yandex.taxi.web.b bVar = UiWebViewConfig.Companion;
        String b = this.this$0.G.b();
        String h = ((avj0) this.this$0.J).h(kyh0.settings_order_history);
        bVar.getClass();
        UiWebViewConfig a = ru.yandex.taxi.web.b.a(b, h, (String) obj2, false, false);
        boolean z = this.$extraActivity;
        b bVar2 = this.this$0;
        if (z) {
            dt41 dt41Var = (dt41) bVar2.E.get();
            b bVar3 = this.this$0;
            bVar3.A(dt41Var, a, new fmu(bVar3, 1));
        } else {
            bVar2.E((m950) bVar2.F.get(), a, new fmu(this.this$0, 2), hxx.a);
        }
        return zy11.a;
    }
}
