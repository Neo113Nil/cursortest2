package ru.yandex.taxi.analytics;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.analytics.AnalyticsManager$reportEvent$1", f = "AnalyticsManager.kt", l = {161}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class AnalyticsManager$reportEvent$1 extends SuspendLambda implements wls {
    final /* synthetic */ kotlinx.serialization.json.c $attrs;
    final /* synthetic */ String $eventName;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsManager$reportEvent$1(j jVar, kotlinx.serialization.json.c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
        this.$attrs = cVar;
        this.$eventName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AnalyticsManager$reportEvent$1(this.this$0, this.$attrs, this.$eventName, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AnalyticsManager$reportEvent$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g gVar = (g) this.this$0.g.get();
            this.label = 1;
            obj = gVar.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.$attrs);
        linkedHashMap.put("CommonParams", (kotlinx.serialization.json.c) obj);
        kotlinx.serialization.json.c cVar = new kotlinx.serialization.json.c(linkedHashMap);
        q qVar = this.this$0.m;
        String str = this.$eventName;
        qVar.getClass();
        qVar.a(new MetricaWrapper$reportEvent$2(cVar, str, qVar, null));
        return zy11.a;
    }
}
