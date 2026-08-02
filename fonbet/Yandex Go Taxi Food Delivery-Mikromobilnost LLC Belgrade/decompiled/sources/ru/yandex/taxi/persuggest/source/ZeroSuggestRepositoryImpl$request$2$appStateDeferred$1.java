package ru.yandex.taxi.persuggest.source;

import defpackage.jl40;
import defpackage.lk6;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.o2s;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lv03;", "<anonymous>", "(Ltse;)Lv03;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.persuggest.source.ZeroSuggestRepositoryImpl$request$2$appStateDeferred$1", f = "ZeroSuggestRepositoryImpl.kt", l = {43, 41}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ZeroSuggestRepositoryImpl$request$2$appStateDeferred$1 extends SuspendLambda implements wls {
    final /* synthetic */ noh $geoInfoDeferred;
    final /* synthetic */ RoutePointType $pointType;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZeroSuggestRepositoryImpl$request$2$appStateDeferred$1(m mVar, RoutePointType routePointType, noh nohVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mVar;
        this.$pointType = routePointType;
        this.$geoInfoDeferred = nohVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ZeroSuggestRepositoryImpl$request$2$appStateDeferred$1(this.this$0, this.$pointType, this.$geoInfoDeferred, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ZeroSuggestRepositoryImpl$request$2$appStateDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r3 == r11) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        String str;
        Object k;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            m mVar = this.this$0;
            aVar = mVar.d;
            o2s o2sVar = mVar.f;
            RoutePointType routePointType = this.$pointType;
            o2sVar.getClass();
            str = jl40.l(routePointType.getType(), RoutePointType.SERVICE_NAVIGATOR_B.getType()) ? "navigator" : null;
            noh nohVar = this.$geoInfoDeferred;
            this.L$0 = aVar;
            this.L$1 = str;
            this.label = 1;
            k = nohVar.k(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) this.L$1;
            a aVar2 = (a) this.L$0;
            kotlin.b.b(obj);
            aVar = aVar2;
            k = obj;
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        Object b = a.b(aVar, str, null, null, null, null, null, (lk6) k, false, this, 62);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
