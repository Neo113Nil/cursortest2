package ru.yandex.taxi.widgets.data.datasources.fallback;

import defpackage.c551;
import defpackage.hst;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o801;
import defpackage.tse;
import defpackage.vpr;
import defpackage.wls;
import defpackage.x251;
import defpackage.zy11;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.widgets.data.datasources.fallback.TimedFallback$launchTimedFallbackJob$1", f = "TimedFallback.kt", l = {29, 34}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class TimedFallback$launchTimedFallbackJob$1 extends SuspendLambda implements wls {
    final /* synthetic */ vpr $fallbackCollector;
    final /* synthetic */ Map<o801, List<x251>> $lastWidgetsResponse;
    final /* synthetic */ c551 $request;
    final /* synthetic */ boolean $useAggregationApi;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimedFallback$launchTimedFallbackJob$1(c551 c551Var, a aVar, vpr vprVar, Map map, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$request = c551Var;
        this.this$0 = aVar;
        this.$fallbackCollector = vprVar;
        this.$lastWidgetsResponse = map;
        this.$useAggregationApi = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TimedFallback$launchTimedFallbackJob$1(this.$request, this.this$0, this.$fallbackCollector, this.$lastWidgetsResponse, this.$useAggregationApi, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TimedFallback$launchTimedFallbackJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006b, code lost:
    
        if (r7.emit(r1, r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (kotlinx.coroutines.a.i(10000, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            hst hstVar = jst.e;
            String str = this.$request.a;
            hstVar.getClass();
            this.this$0.getClass();
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        jst.e.d("TimedFallback", "Timed fallback was triggered after 10000 ms for " + this.$request.a + " screen");
        vpr vprVar = this.$fallbackCollector;
        Map b = this.this$0.a.b(this.$request, this.$lastWidgetsResponse, this.$useAggregationApi);
        this.label = 2;
    }
}
