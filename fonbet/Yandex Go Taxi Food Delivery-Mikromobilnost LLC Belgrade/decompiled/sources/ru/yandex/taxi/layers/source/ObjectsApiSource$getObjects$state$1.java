package ru.yandex.taxi.layers.source;

import defpackage.aq00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ll3u0;", "<anonymous>", "(Ltse;)Ll3u0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.source.ObjectsApiSource$getObjects$state$1", f = "ObjectsApiSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class ObjectsApiSource$getObjects$state$1 extends SuspendLambda implements wls {
    final /* synthetic */ zzs $location;
    final /* synthetic */ aq00 $params;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObjectsApiSource$getObjects$state$1(f fVar, zzs zzsVar, aq00 aq00Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$location = zzsVar;
        this.$params = aq00Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ObjectsApiSource$getObjects$state$1(this.this$0, this.$location, this.$params, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ObjectsApiSource$getObjects$state$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        f fVar = this.this$0;
        zzs zzsVar = this.$location;
        aq00 aq00Var = this.$params;
        return fVar.b(zzsVar, aq00Var.a, aq00Var.b, aq00Var.c);
    }
}
