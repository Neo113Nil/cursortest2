package ru.yandex.taxi.order.services;

import defpackage.jc4;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rgx;
import defpackage.s66;
import defpackage.tgx;
import defpackage.tse;
import defpackage.wls;
import defpackage.ygx;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.order.services.KeepAliveServicePresenter$attachView$2", f = "KeepAliveServicePresenter.kt", l = {82}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class KeepAliveServicePresenter$attachView$2 extends SuspendLambda implements wls {
    final /* synthetic */ rgx $mvpView;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeepAliveServicePresenter$attachView$2(d dVar, rgx rgxVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$mvpView = rgxVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new KeepAliveServicePresenter$attachView$2(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((KeepAliveServicePresenter$attachView$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            s66 s66Var = this.this$0.h;
            this.label = 1;
            obj = s66Var.b.b(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        String str = ((ygx) obj).e;
        if (str != null && str.length() != 0) {
            tgx tgxVar = this.this$0.f;
            String serviceName = this.$mvpView.getServiceName();
            jc4 jc4Var = tgxVar.b;
            jc4Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("service_name", serviceName);
            hashMap.put("metricaTag", str);
            jc4Var.a.a("KeepAliveServiceAnalytics.Create", hashMap, 1, new HashMap());
        }
        this.this$0.s = str;
        return zy11.a;
    }
}
