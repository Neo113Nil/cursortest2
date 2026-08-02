package ru.yandex.taxi.controller;

import defpackage.l8x;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ns70;
import defpackage.ny61;
import defpackage.o2y0;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.controller.StartNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2", f = "StartNextControllerDelegateImpl.kt", l = {176, 110}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class StartNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        StartNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2 startNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2 = new StartNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2(this.this$0, continuation);
        startNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2.L$0 = obj;
        return startNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StartNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        noh nohVar;
        noh nohVar2;
        l8x l8xVar;
        l8x l8xVar2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h = tje.h(tseVar, null, null, new StartNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2$resolveStartupBehaviourJob$1(this.this$0, null), 3);
            qoh h2 = tje.h(tseVar, null, null, new StartNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2$superappMainScreenLeftJob$1(this.this$0, null), 3);
            qoh h3 = tje.h(tseVar, null, null, new StartNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2$superappMainScreenOverlappedJob$1(this.this$0, null), 3);
            qoh h4 = tje.h(tseVar, null, null, new StartNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2$awaitContainerModalShownJob$1(this.this$0, null), 3);
            kotlinx.coroutines.selects.b bVar = new kotlinx.coroutines.selects.b(get_context());
            bVar.h(h.H(), new StartNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2$result$1$1(2, null));
            bVar.h(h2.H(), new StartNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2$result$1$2(2, null));
            bVar.h(h3.H(), new StartNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2$result$1$3(2, null));
            bVar.h(h4.H(), new StartNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2$result$1$4(2, null));
            this.L$0 = null;
            this.L$1 = h;
            this.L$2 = h2;
            this.L$3 = h3;
            this.L$4 = h4;
            this.L$5 = null;
            this.label = 1;
            Object e = bVar.e(this);
            if (e != coroutineSingletons) {
                nohVar = h2;
                obj = e;
                nohVar2 = h3;
                l8xVar2 = h4;
                l8xVar = h;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return zy11Var;
        }
        l8x l8xVar3 = (noh) this.L$4;
        nohVar2 = (noh) this.L$3;
        nohVar = (noh) this.L$2;
        l8x l8xVar4 = (noh) this.L$1;
        kotlin.b.b(obj);
        l8xVar2 = l8xVar3;
        l8xVar = l8xVar4;
        Pair pair = (Pair) obj;
        l8xVar.a(null);
        nohVar.a(null);
        nohVar2.a(null);
        l8xVar2.a(null);
        if (pair != null) {
            ns70 ns70Var = (ns70) pair.getFirst();
            o2y0 o2y0Var = (o2y0) pair.getSecond();
            a aVar = this.this$0;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.L$7 = null;
            this.label = 2;
            if (aVar.c(ns70Var, o2y0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
