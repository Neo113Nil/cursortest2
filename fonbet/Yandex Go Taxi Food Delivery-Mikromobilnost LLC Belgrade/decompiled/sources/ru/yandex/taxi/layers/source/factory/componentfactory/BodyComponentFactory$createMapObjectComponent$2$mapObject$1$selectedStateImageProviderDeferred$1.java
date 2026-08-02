package ru.yandex.taxi.layers.source.factory.componentfactory;

import defpackage.fkp;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/runtime/image/ImageProvider;", "<anonymous>", "(Ltse;)Lcom/yandex/runtime/image/ImageProvider;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.source.factory.componentfactory.BodyComponentFactory$createMapObjectComponent$2$mapObject$1$selectedStateImageProviderDeferred$1", f = "BodyComponentFactory.kt", l = {72}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class BodyComponentFactory$createMapObjectComponent$2$mapObject$1$selectedStateImageProviderDeferred$1 extends SuspendLambda implements wls {
    final /* synthetic */ fkp $feature;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BodyComponentFactory$createMapObjectComponent$2$mapObject$1$selectedStateImageProviderDeferred$1(m mVar, fkp fkpVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mVar;
        this.$feature = fkpVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BodyComponentFactory$createMapObjectComponent$2$mapObject$1$selectedStateImageProviderDeferred$1(this.this$0, this.$feature, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BodyComponentFactory$createMapObjectComponent$2$mapObject$1$selectedStateImageProviderDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        m mVar = this.this$0;
        fkp fkpVar = this.$feature;
        this.label = 1;
        Object f = m.f(mVar, fkpVar, this);
        return f == coroutineSingletons ? coroutineSingletons : f;
    }
}
