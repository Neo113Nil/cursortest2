package ru.yandex.taxi.logistics.sdk.ui.component.marketing_pager;

import androidx.compose.foundation.pager.d;
import defpackage.bvf0;
import defpackage.ck11;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sb2;
import defpackage.sbn;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.ui.component.marketing_pager.MarketingPagerKt$LaunchedPagerScrollingEffect$launchScrollJob$1", f = "MarketingPager.kt", l = {263, 265}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class MarketingPagerKt$LaunchedPagerScrollingEffect$launchScrollJob$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<Long> $animationDurations;
    final /* synthetic */ sls $onAutoScrollStarted;
    final /* synthetic */ d $pagerState;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketingPagerKt$LaunchedPagerScrollingEffect$launchScrollJob$1(d dVar, List list, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.$pagerState = dVar;
        this.$animationDurations = list;
        this.$onAutoScrollStarted = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MarketingPagerKt$LaunchedPagerScrollingEffect$launchScrollJob$1 marketingPagerKt$LaunchedPagerScrollingEffect$launchScrollJob$1 = new MarketingPagerKt$LaunchedPagerScrollingEffect$launchScrollJob$1(this.$pagerState, this.$animationDurations, this.$onAutoScrollStarted, continuation);
        marketingPagerKt$LaunchedPagerScrollingEffect$launchScrollJob$1.L$0 = obj;
        return marketingPagerKt$LaunchedPagerScrollingEffect$launchScrollJob$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MarketingPagerKt$LaunchedPagerScrollingEffect$launchScrollJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0083, code lost:
    
        if (androidx.compose.foundation.pager.d.g(r10.$pagerState, (r5 + 1) % r2, r7, r10, 2) != r1) goto L26;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0083 -> B:8:0x0086). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            int k = this.$pagerState.k();
            i2 = this.$pagerState.o();
            i = k;
            if (bvf0.D(tseVar)) {
            }
            return zy11.a;
        }
        if (i2 == 1) {
            i2 = this.I$1;
            i = this.I$0;
            kotlin.b.b(obj);
            this.$onAutoScrollStarted.invoke();
            ck11 K = sb2.K(800, 0, sbn.a, 2);
            this.L$0 = tseVar;
            this.I$0 = i;
            this.I$1 = i2;
            this.label = 2;
        } else {
            if (i2 != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i3 = this.I$1;
            int i4 = this.I$0;
            kotlin.b.b(obj);
            i = this.$pagerState.k();
            i2 = this.$pagerState.o();
            if (bvf0.D(tseVar) || i < 0 || i >= this.$animationDurations.size()) {
                return zy11.a;
            }
            long longValue = this.$animationDurations.get(i).longValue();
            this.L$0 = tseVar;
            this.I$0 = i;
            this.I$1 = i2;
            this.label = 1;
            if (kotlinx.coroutines.a.i(longValue, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            this.$onAutoScrollStarted.invoke();
            ck11 K2 = sb2.K(800, 0, sbn.a, 2);
            this.L$0 = tseVar;
            this.I$0 = i;
            this.I$1 = i2;
            this.label = 2;
        }
    }
}
