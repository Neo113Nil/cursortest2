package ru.yandex.taxi.bubbles.interactors;

import defpackage.cn6;
import defpackage.dn6;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldn6;", "pinAbsenceBubble", "geoSharingBubble", "<anonymous>", "(Ldn6;Ldn6;)Ldn6;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.bubbles.interactors.BubbleModelRepositoryImpl$activeBubbleModelFlow$1", f = "BubbleModelRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class BubbleModelRepositoryImpl$activeBubbleModelFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BubbleModelRepositoryImpl$activeBubbleModelFlow$1 bubbleModelRepositoryImpl$activeBubbleModelFlow$1 = new BubbleModelRepositoryImpl$activeBubbleModelFlow$1(3, (Continuation) obj3);
        bubbleModelRepositoryImpl$activeBubbleModelFlow$1.L$0 = (dn6) obj;
        bubbleModelRepositoryImpl$activeBubbleModelFlow$1.L$1 = (dn6) obj2;
        return bubbleModelRepositoryImpl$activeBubbleModelFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        dn6 dn6Var = (dn6) this.L$0;
        dn6 dn6Var2 = (dn6) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        dn6.a.getClass();
        return !jl40.l(dn6Var2, cn6.b) ? dn6Var2 : dn6Var;
    }
}
