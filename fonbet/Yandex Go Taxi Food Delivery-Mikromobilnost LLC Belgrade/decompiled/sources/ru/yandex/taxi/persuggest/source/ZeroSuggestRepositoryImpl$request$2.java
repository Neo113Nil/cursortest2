package ru.yandex.taxi.persuggest.source;

import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Lkotlin/Pair;", "Llk6;", "Lv03;", "<anonymous>", "(Ltse;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.persuggest.source.ZeroSuggestRepositoryImpl$request$2", f = "ZeroSuggestRepositoryImpl.kt", l = {47, 47}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ZeroSuggestRepositoryImpl$request$2 extends SuspendLambda implements wls {
    final /* synthetic */ RoutePointType $pointType;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZeroSuggestRepositoryImpl$request$2(m mVar, RoutePointType routePointType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mVar;
        this.$pointType = routePointType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ZeroSuggestRepositoryImpl$request$2 zeroSuggestRepositoryImpl$request$2 = new ZeroSuggestRepositoryImpl$request$2(this.this$0, this.$pointType, continuation);
        zeroSuggestRepositoryImpl$request$2.L$0 = obj;
        return zeroSuggestRepositoryImpl$request$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ZeroSuggestRepositoryImpl$request$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r10 == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        Object obj2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h2 = tje.h(tseVar, null, null, new ZeroSuggestRepositoryImpl$request$2$geoInfoDeferred$1(this.this$0, null), 3);
            h = tje.h(tseVar, null, null, new ZeroSuggestRepositoryImpl$request$2$appStateDeferred$1(this.this$0, this.$pointType, h2, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.label = 1;
            obj = h2.s(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.L$3;
                kotlin.b.b(obj);
                return new Pair(obj2, obj);
            }
            h = (noh) this.L$2;
            kotlin.b.b(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = obj;
        this.label = 2;
        Object k = h.k(this);
        if (k != coroutineSingletons) {
            obj2 = obj;
            obj = k;
            return new Pair(obj2, obj);
        }
        return coroutineSingletons;
    }
}
