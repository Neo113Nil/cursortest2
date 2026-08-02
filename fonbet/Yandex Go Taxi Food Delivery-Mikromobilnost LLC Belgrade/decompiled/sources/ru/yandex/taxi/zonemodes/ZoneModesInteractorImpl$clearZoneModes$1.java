package ru.yandex.taxi.zonemodes;

import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sd61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.zonemodes.ZoneModesInteractorImpl$clearZoneModes$1", f = "ZoneModesInteractorImpl.kt", l = {191}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ZoneModesInteractorImpl$clearZoneModes$1 extends SuspendLambda implements wls {
    final /* synthetic */ Set<String> $ordersForRemove;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoneModesInteractorImpl$clearZoneModes$1(j jVar, Set set, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
        this.$ordersForRemove = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ZoneModesInteractorImpl$clearZoneModes$1(this.this$0, this.$ordersForRemove, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ZoneModesInteractorImpl$clearZoneModes$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            sd61 sd61Var = this.this$0.a;
            Set<String> set = this.$ordersForRemove;
            this.label = 1;
            sd61Var.a.getClass();
            sjh sjhVar = uyj.a;
            Object k0 = tje.k0(mdh.b, new ZoneModesStorage$removeAll$2(set, sd61Var, null), this);
            if (k0 != coroutineSingletons) {
                k0 = zy11Var;
            }
            if (k0 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11Var;
    }
}
