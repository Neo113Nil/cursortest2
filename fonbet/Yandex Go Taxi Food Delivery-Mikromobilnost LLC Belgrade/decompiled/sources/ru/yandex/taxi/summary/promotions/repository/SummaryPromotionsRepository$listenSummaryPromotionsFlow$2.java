package ru.yandex.taxi.summary.promotions.repository;

import defpackage.bgx0;
import defpackage.evu0;
import defpackage.gw00;
import defpackage.h73;
import defpackage.jnv0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s5r;
import defpackage.tcc;
import defpackage.tls;
import defpackage.umv0;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lumv0;", "dto", "Lzy11;", "<anonymous>", "(Lumv0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.promotions.repository.SummaryPromotionsRepository$listenSummaryPromotionsFlow$2", f = "SummaryPromotionsRepository.kt", l = {470}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class SummaryPromotionsRepository$listenSummaryPromotionsFlow$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryPromotionsRepository$listenSummaryPromotionsFlow$2(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SummaryPromotionsRepository$listenSummaryPromotionsFlow$2 summaryPromotionsRepository$listenSummaryPromotionsFlow$2 = new SummaryPromotionsRepository$listenSummaryPromotionsFlow$2(this.this$0, continuation);
        summaryPromotionsRepository$listenSummaryPromotionsFlow$2.L$0 = obj;
        return summaryPromotionsRepository$listenSummaryPromotionsFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryPromotionsRepository$listenSummaryPromotionsFlow$2) create((umv0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map f;
        umv0 umv0Var = (umv0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (!umv0Var.b) {
                a aVar = this.this$0.g;
                SummaryPromotionsResponse summaryPromotionsResponse = umv0Var.a;
                this.L$0 = umv0Var;
                this.label = 1;
                if (aVar.b(summaryPromotionsResponse, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        final e eVar = this.this$0;
        bgx0 bgx0Var = eVar.l;
        SummaryPromotionsResponse.d dVar = umv0Var.a.a.a;
        List list = dVar.b;
        List list2 = dVar.a;
        if (list.isEmpty() || list2.isEmpty()) {
            f = kotlin.collections.b.f();
        } else {
            final Map a = eVar.f.a();
            List list3 = list2;
            int d = gw00.d(tcc.n(list3, 10));
            if (d < 16) {
                d = 16;
            }
            final LinkedHashMap linkedHashMap = new LinkedHashMap(d);
            for (Object obj2 : list3) {
                linkedHashMap.put(((SummaryPromotionsResponse.a) obj2).getA(), obj2);
            }
            f = kotlin.collections.b.r(kotlin.sequences.b.o(new h73(1, dVar.b), new tls() { // from class: ru.yandex.taxi.summary.promotions.repository.b
                @Override // defpackage.tls
                public final Object invoke(Object obj3) {
                    Object obj4;
                    SummaryPromotionsResponse.a.d j;
                    SummaryPromotionsResponse.a.d.C0119a a2;
                    String a3;
                    SummaryPromotionsResponse.g gVar = (SummaryPromotionsResponse.g) obj3;
                    s5r s5rVar = new s5r(kotlin.sequences.b.o(new h73(1, gVar.getB()), new SummaryPromotionsRepository$computeTariffIconOverrides$1$tag$1(linkedHashMap)));
                    while (true) {
                        if (!s5rVar.hasNext()) {
                            obj4 = null;
                            break;
                        }
                        obj4 = s5rVar.next();
                        List list4 = jnv0.a;
                        List list5 = jnv0.c;
                        eVar.getClass();
                        if (e.c((SummaryPromotionsResponse.a) obj4, a, list4, list5, false)) {
                            break;
                        }
                    }
                    SummaryPromotionsResponse.a aVar2 = (SummaryPromotionsResponse.a) obj4;
                    if (aVar2 != null && (j = aVar2.getJ()) != null && (a2 = j.getA()) != null && (a3 = a2.getA()) != null) {
                        if (evu0.J(a3)) {
                            a3 = null;
                        }
                        if (a3 != null) {
                            return new Pair(gVar.getA(), a3);
                        }
                    }
                    return null;
                }
            }));
        }
        r0 r0Var = bgx0Var.a;
        r0Var.getClass();
        r0Var.m(null, f);
        return zy11.a;
    }
}
