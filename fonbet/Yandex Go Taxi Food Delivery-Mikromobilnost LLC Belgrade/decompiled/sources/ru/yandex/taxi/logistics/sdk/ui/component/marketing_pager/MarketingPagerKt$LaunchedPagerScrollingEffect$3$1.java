package ru.yandex.taxi.logistics.sdk.ui.component.marketing_pager;

import androidx.compose.foundation.pager.d;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.sls;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.ui.component.marketing_pager.MarketingPagerKt$LaunchedPagerScrollingEffect$3$1", f = "MarketingPager.kt", l = {281}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class MarketingPagerKt$LaunchedPagerScrollingEffect$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<Long> $animationDurations;
    final /* synthetic */ sls $onAutoScrollStarted;
    final /* synthetic */ sls $onManualScrollStarted;
    final /* synthetic */ d $pagerState;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketingPagerKt$LaunchedPagerScrollingEffect$3$1(d dVar, List list, sls slsVar, sls slsVar2, Continuation continuation) {
        super(2, continuation);
        this.$pagerState = dVar;
        this.$animationDurations = list;
        this.$onAutoScrollStarted = slsVar;
        this.$onManualScrollStarted = slsVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MarketingPagerKt$LaunchedPagerScrollingEffect$3$1 marketingPagerKt$LaunchedPagerScrollingEffect$3$1 = new MarketingPagerKt$LaunchedPagerScrollingEffect$3$1(this.$pagerState, this.$animationDurations, this.$onAutoScrollStarted, this.$onManualScrollStarted, continuation);
        marketingPagerKt$LaunchedPagerScrollingEffect$3$1.L$0 = obj;
        return marketingPagerKt$LaunchedPagerScrollingEffect$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MarketingPagerKt$LaunchedPagerScrollingEffect$3$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [T, pzt0] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            Ref$ObjectRef z = qv10.z(obj);
            z.element = tje.N(tseVar, null, null, new MarketingPagerKt$LaunchedPagerScrollingEffect$launchScrollJob$1(this.$pagerState, this.$animationDurations, this.$onAutoScrollStarted, null), 3);
            d dVar = this.$pagerState;
            sls slsVar = this.$onManualScrollStarted;
            List<Long> list = this.$animationDurations;
            sls slsVar2 = this.$onAutoScrollStarted;
            n0 n0Var = dVar.p.a;
            a aVar = new a(slsVar, z, tseVar, dVar, list, slsVar2);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.I$0 = 0;
            this.label = 1;
            n0Var.getClass();
            if (n0.m(n0Var, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
