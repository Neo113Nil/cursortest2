package ru.yandex.taxi.layers.source;

import defpackage.l5e0;
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
@mvg(c = "ru.yandex.taxi.layers.source.PolylinesApiSource$getPolylines$state$1", f = "PolylinesApiSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PolylinesApiSource$getPolylines$state$1 extends SuspendLambda implements wls {
    final /* synthetic */ zzs $location;
    final /* synthetic */ l5e0 $params;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolylinesApiSource$getPolylines$state$1(n nVar, zzs zzsVar, l5e0 l5e0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nVar;
        this.$location = zzsVar;
        this.$params = l5e0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PolylinesApiSource$getPolylines$state$1(this.this$0, this.$location, this.$params, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PolylinesApiSource$getPolylines$state$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        n nVar = this.this$0;
        zzs zzsVar = this.$location;
        l5e0 l5e0Var = this.$params;
        return nVar.b(zzsVar, l5e0Var.a, l5e0Var.b, false);
    }
}
