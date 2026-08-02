package ru.yandex.taxi.persuggest.domain;

import defpackage.eyc;
import defpackage.fyc;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u0018\u0012\u0014\u0012\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001j\u0002`\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lvpr;", "Ltpr;", "Lkotlin/Result;", "Lg2t;", "Lru/yandex/taxi/persuggest/domain/GeoSuggestInteractorImpl$NextRequestSharedFlows$ResponseFlow;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.persuggest.domain.GeoSuggestInteractorImpl$listenToSuggest$1", f = "GeoSuggestInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class GeoSuggestInteractorImpl$listenToSuggest$1 extends SuspendLambda implements wls {
    final /* synthetic */ RoutePointType $forPointType;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeoSuggestInteractorImpl$listenToSuggest$1(g gVar, RoutePointType routePointType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$forPointType = routePointType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GeoSuggestInteractorImpl$listenToSuggest$1(this.this$0, this.$forPointType, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        GeoSuggestInteractorImpl$listenToSuggest$1 geoSuggestInteractorImpl$listenToSuggest$1 = (GeoSuggestInteractorImpl$listenToSuggest$1) create((vpr) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        geoSuggestInteractorImpl$listenToSuggest$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        g gVar = this.this$0;
        eyc eycVar = (eyc) gVar.k.get(this.$forPointType);
        zy11 zy11Var = zy11.a;
        if (eycVar != null) {
            ((fyc) eycVar).T(zy11Var);
        }
        return zy11Var;
    }
}
