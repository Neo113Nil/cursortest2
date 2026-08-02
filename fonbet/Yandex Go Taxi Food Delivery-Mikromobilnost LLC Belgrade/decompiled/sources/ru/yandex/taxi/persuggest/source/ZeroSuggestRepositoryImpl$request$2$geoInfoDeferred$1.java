package ru.yandex.taxi.persuggest.source;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Llk6;", "<anonymous>", "(Ltse;)Llk6;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.persuggest.source.ZeroSuggestRepositoryImpl$request$2$geoInfoDeferred$1", f = "ZeroSuggestRepositoryImpl.kt", l = {39}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ZeroSuggestRepositoryImpl$request$2$geoInfoDeferred$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZeroSuggestRepositoryImpl$request$2$geoInfoDeferred$1(m mVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ZeroSuggestRepositoryImpl$request$2$geoInfoDeferred$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ZeroSuggestRepositoryImpl$request$2$geoInfoDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        ru.yandex.taxi.preorder.source.userposition.b bVar = this.this$0.b;
        this.label = 1;
        Object a = bVar.a(this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
