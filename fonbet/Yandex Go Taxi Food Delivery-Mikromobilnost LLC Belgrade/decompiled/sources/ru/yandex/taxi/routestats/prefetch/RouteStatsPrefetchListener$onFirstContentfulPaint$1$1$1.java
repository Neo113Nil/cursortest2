package ru.yandex.taxi.routestats.prefetch;

import defpackage.boe0;
import defpackage.cbl0;
import defpackage.coe0;
import defpackage.lbl0;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.yne0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.routestats.prefetch.RouteStatsPrefetchListener$onFirstContentfulPaint$1$1$1", f = "RouteStatsPrefetchListener.kt", l = {HProv.ALG_SID_SHA3_224, 81}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RouteStatsPrefetchListener$onFirstContentfulPaint$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<coe0> $destinationsInfo;
    final /* synthetic */ boe0 $prefetchRouteStats;
    Object L$0;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteStatsPrefetchListener$onFirstContentfulPaint$1$1$1(l lVar, List list, boe0 boe0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
        this.$destinationsInfo = list;
        this.$prefetchRouteStats = boe0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteStatsPrefetchListener$onFirstContentfulPaint$1$1$1(this.this$0, this.$destinationsInfo, this.$prefetchRouteStats, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteStatsPrefetchListener$onFirstContentfulPaint$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0093, code lost:
    
        if (r1.c(r4, r11) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0095, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0033, code lost:
    
        if (r12 == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.taxi.tariffs.internal.routestats.factory.a aVar = this.this$0.d;
            List<coe0> list = this.$destinationsInfo;
            long j = this.$prefetchRouteStats.d;
            this.label = 1;
            obj = aVar.b(list, j, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        List<yne0> list2 = (List) obj;
        l lVar = this.this$0;
        for (yne0 yne0Var : list2) {
            m mVar = lVar.e;
            lbl0 lbl0Var = yne0Var.a;
            cbl0 cbl0Var = yne0Var.b;
            tse tseVar = lVar.a;
            mVar.b.getClass();
            sjh sjhVar = uyj.a;
            tje.N(tseVar, mdh.b, null, new RouteStatsPrefetchRepositoryImpl$prefetch$1(mVar, cbl0Var, lbl0Var, null), 2);
        }
        m mVar2 = this.this$0.e;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((yne0) it.next()).b);
        }
        this.L$0 = null;
        this.label = 2;
    }
}
