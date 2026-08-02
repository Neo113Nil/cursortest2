package ru.yandex.taxi.layers.source.factory.componentfactory;

import defpackage.bvf0;
import defpackage.fkp;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vm00;
import defpackage.wls;
import defpackage.ym00;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lym00;", "<anonymous>", "(Ltse;)Lym00;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.source.factory.componentfactory.BodyComponentFactory$createMapObjectComponent$2", f = "BodyComponentFactory.kt", l = {70}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class BodyComponentFactory$createMapObjectComponent$2 extends SuspendLambda implements wls {
    final /* synthetic */ vm00 $animation;
    final /* synthetic */ fkp $feature;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BodyComponentFactory$createMapObjectComponent$2(m mVar, fkp fkpVar, vm00 vm00Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mVar;
        this.$feature = fkpVar;
        this.$animation = vm00Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BodyComponentFactory$createMapObjectComponent$2(this.this$0, this.$feature, this.$animation, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BodyComponentFactory$createMapObjectComponent$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            BodyComponentFactory$createMapObjectComponent$2$mapObject$1 bodyComponentFactory$createMapObjectComponent$2$mapObject$1 = new BodyComponentFactory$createMapObjectComponent$2$mapObject$1(this.this$0, this.$feature, this.$animation, null);
            this.label = 1;
            obj = bvf0.n(bodyComponentFactory$createMapObjectComponent$2$mapObject$1, this);
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
        return (ym00) obj;
    }
}
