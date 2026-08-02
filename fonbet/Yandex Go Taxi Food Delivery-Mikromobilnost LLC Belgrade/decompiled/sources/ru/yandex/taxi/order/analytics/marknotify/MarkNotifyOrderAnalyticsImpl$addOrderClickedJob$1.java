package ru.yandex.taxi.order.analytics.marknotify;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.oo70;
import defpackage.r8x;
import defpackage.tse;
import defpackage.w4j0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.order.analytics.marknotify.MarkNotifyOrderAnalyticsImpl$addOrderClickedJob$1", f = "MarkNotifyOrderAnalyticsImpl.kt", l = {HProv.PROV_GOST_2001_DH}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MarkNotifyOrderAnalyticsImpl$addOrderClickedJob$1 extends SuspendLambda implements wls {
    final /* synthetic */ oo70 $orderClickInfo;
    final /* synthetic */ String $screenType;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarkNotifyOrderAnalyticsImpl$addOrderClickedJob$1(a aVar, String str, oo70 oo70Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$screenType = str;
        this.$orderClickInfo = oo70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MarkNotifyOrderAnalyticsImpl$addOrderClickedJob$1(this.this$0, this.$screenType, this.$orderClickInfo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MarkNotifyOrderAnalyticsImpl$addOrderClickedJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0.b;
            String str = this.$screenType;
            oo70 oo70Var = this.$orderClickInfo;
            this.label = 1;
            if (bVar.a(str, oo70Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        ru.yandex.taxi.jobs.b bVar2 = this.this$0.c;
        r8x r8xVar = new r8x();
        r8xVar.f("ORDER_SCREEN_TYPE_VALUE_ARG", this.$screenType);
        bVar2.e(new w4j0("send_clicked_orders", 0L, r8xVar, null, null, false, false, 0L, null, 2040));
        return zy11.a;
    }
}
