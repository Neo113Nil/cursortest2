package ru.yandex.taxi.shortcuts.router;

import com.yandex.go.dto.response.Action$TaxiExpectedDestination;
import com.yandex.go.mainscreen.superapp.impl.foundation.domain.e;
import com.yandex.go.taxi.summary.experiments.SummaryPerformanceOptimisationsExperiment;
import defpackage.hst;
import defpackage.jst;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.o820;
import defpackage.spo;
import defpackage.sxg;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.ynv0;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lspo;", "<anonymous>", "(Ltse;)Lspo;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.shortcuts.router.ExpectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$obtainDecodeResultWithOrigin$2", f = "ExpectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl.kt", l = {49, 52, 53}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class ExpectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$obtainDecodeResultWithOrigin$2 extends SuspendLambda implements wls {
    final /* synthetic */ Action$TaxiExpectedDestination $action;
    final /* synthetic */ o820 $shortcutAnalyticsInfo;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$obtainDecodeResultWithOrigin$2(a aVar, Action$TaxiExpectedDestination action$TaxiExpectedDestination, o820 o820Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$action = action$TaxiExpectedDestination;
        this.$shortcutAnalyticsInfo = o820Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ExpectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$obtainDecodeResultWithOrigin$2 expectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$obtainDecodeResultWithOrigin$2 = new ExpectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$obtainDecodeResultWithOrigin$2(this.this$0, this.$action, this.$shortcutAnalyticsInfo, continuation);
        expectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$obtainDecodeResultWithOrigin$2.L$0 = obj;
        return expectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$obtainDecodeResultWithOrigin$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExpectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$obtainDecodeResultWithOrigin$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0091, code lost:
    
        if (r10 == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        if (r10.a(r9) == r1) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        noh h2;
        sxg sxgVar;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            h = tje.h(tseVar, null, null, new ExpectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$obtainDecodeResultWithOrigin$2$decodeResultAsync$1(this.this$0, this.$action, this.$shortcutAnalyticsInfo, null), 3);
            h2 = tje.h(tseVar, null, null, new ExpectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$obtainDecodeResultWithOrigin$2$originAsync$1(this.this$0, null), 3);
            if (!((SummaryPerformanceOptimisationsExperiment) this.this$0.f.a.b.b()).e) {
                e eVar = this.this$0.d;
                this.L$0 = null;
                this.L$1 = h;
                this.L$2 = h2;
                this.label = 1;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sxgVar = (sxg) this.L$3;
                    b.b(obj);
                    ynv0 ynv0Var = (ynv0) obj;
                    hst hstVar = jst.e;
                    String.format("expected destination decode result %s with blockedZone=%s and origin=%s", Arrays.copyOf(new Object[]{sxgVar.a.a, Boolean.valueOf(sxgVar.b), ynv0Var}, 3));
                    hstVar.getClass();
                    return new spo(sxgVar, ynv0Var);
                }
                h2 = (noh) this.L$2;
                b.b(obj);
                sxg sxgVar2 = (sxg) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = sxgVar2;
                this.label = 3;
                Object k = h2.k(this);
                if (k != coroutineSingletons) {
                    sxgVar = sxgVar2;
                    obj = k;
                    ynv0 ynv0Var2 = (ynv0) obj;
                    hst hstVar2 = jst.e;
                    String.format("expected destination decode result %s with blockedZone=%s and origin=%s", Arrays.copyOf(new Object[]{sxgVar.a.a, Boolean.valueOf(sxgVar.b), ynv0Var2}, 3));
                    hstVar2.getClass();
                    return new spo(sxgVar, ynv0Var2);
                }
                return coroutineSingletons;
            }
            h2 = (noh) this.L$2;
            h = (noh) this.L$1;
            b.b(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = h2;
        this.label = 2;
        obj = h.k(this);
    }
}
