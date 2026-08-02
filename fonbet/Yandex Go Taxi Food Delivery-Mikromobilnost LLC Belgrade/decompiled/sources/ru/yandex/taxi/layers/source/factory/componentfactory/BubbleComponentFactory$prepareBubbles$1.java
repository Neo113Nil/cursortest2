package ru.yandex.taxi.layers.source.factory.componentfactory;

import defpackage.bvf0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.om6;
import defpackage.qn6;
import defpackage.qoh;
import defpackage.rl6;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lom6;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.source.factory.componentfactory.BubbleComponentFactory$prepareBubbles$1", f = "BubbleComponentFactory.kt", l = {174}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class BubbleComponentFactory$prepareBubbles$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<rl6> $bubbles;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ r this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.layers.source.factory.componentfactory.BubbleComponentFactory$prepareBubbles$1$1", f = "BubbleComponentFactory.kt", l = {183, 183, 183, 183}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.layers.source.factory.componentfactory.BubbleComponentFactory$prepareBubbles$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ vpr $$this$flow;
        final /* synthetic */ List<rl6> $bubbles;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
        Object L$14;
        Object L$15;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        final /* synthetic */ r this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List list, vpr vprVar, r rVar, Continuation continuation) {
            super(2, continuation);
            this.$bubbles = list;
            this.$$this$flow = vprVar;
            this.this$0 = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$bubbles, this.$$this$flow, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x01aa, code lost:
        
            if (r8 != r2) goto L24;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0132  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0214  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x021f  */
        /* JADX WARN: Type inference failed for: r11v16, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r12v10, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r12v13, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r15v13, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0214 -> B:8:0x0217). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            vpr vprVar;
            r rVar;
            ArrayList arrayList;
            Iterator it;
            ArrayList arrayList2;
            Iterator it2;
            rl6 rl6Var;
            vpr vprVar2;
            List list;
            List list2;
            vpr vprVar3;
            Object obj2;
            r rVar2;
            Collection collection;
            om6 om6Var;
            r rVar3;
            r rVar4;
            vpr vprVar4;
            ArrayList arrayList3;
            Iterator it3;
            rl6 rl6Var2;
            Object obj3;
            noh nohVar;
            Object obj4;
            noh nohVar2;
            tse tseVar = (tse) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            zy11 zy11Var = zy11.a;
            int i2 = 3;
            if (i == 0) {
                kotlin.b.b(obj);
                List<rl6> list3 = this.$bubbles;
                vprVar = this.$$this$flow;
                rVar = this.this$0;
                arrayList = new ArrayList(tcc.n(list3, 10));
                it = list3.iterator();
                if (!it.hasNext()) {
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        collection = (Collection) this.L$14;
                        List list4 = (List) this.L$13;
                        vpr vprVar5 = (vpr) this.L$12;
                        noh nohVar3 = (noh) this.L$11;
                        rl6Var2 = (rl6) this.L$8;
                        Iterator it4 = (Iterator) this.L$6;
                        ?? r12 = (Collection) this.L$5;
                        r rVar5 = (r) this.L$3;
                        vprVar4 = (vpr) this.L$2;
                        kotlin.b.b(obj);
                        rVar4 = rVar5;
                        arrayList3 = r12;
                        it3 = it4;
                        list = list4;
                        vprVar = vprVar5;
                        nohVar = nohVar3;
                        obj3 = obj;
                        List list5 = (List) obj3;
                        this.L$0 = tseVar;
                        this.L$1 = null;
                        this.L$2 = vprVar4;
                        this.L$3 = rVar4;
                        this.L$4 = null;
                        this.L$5 = arrayList3;
                        this.L$6 = it3;
                        this.L$7 = null;
                        this.L$8 = rl6Var2;
                        this.L$9 = null;
                        this.L$10 = null;
                        this.L$11 = null;
                        this.L$12 = vprVar;
                        this.L$13 = list;
                        this.L$14 = list5;
                        this.L$15 = collection;
                        this.label = 3;
                        obj2 = nohVar.k(this);
                        if (obj2 != coroutineSingletons) {
                            Iterator it5 = it3;
                            vprVar2 = vprVar;
                            rVar2 = rVar4;
                            arrayList2 = arrayList3;
                            rl6Var = rl6Var2;
                            list2 = list5;
                            vprVar3 = vprVar4;
                            it2 = it5;
                            om6Var = new om6(list, list2, (qn6) obj2, rl6Var);
                            this.L$0 = tseVar;
                            this.L$1 = null;
                            this.L$2 = vprVar3;
                            this.L$3 = rVar2;
                            this.L$4 = null;
                            this.L$5 = arrayList2;
                            this.L$6 = it2;
                            this.L$7 = null;
                            this.L$8 = null;
                            this.L$9 = null;
                            this.L$10 = null;
                            this.L$11 = null;
                            this.L$12 = collection;
                            this.L$13 = null;
                            this.L$14 = null;
                            this.L$15 = null;
                            this.label = 4;
                            if (vprVar2.emit(om6Var, this) != coroutineSingletons) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (i == 3) {
                        collection = (Collection) this.L$15;
                        list2 = (List) this.L$14;
                        list = (List) this.L$13;
                        vprVar2 = (vpr) this.L$12;
                        rl6Var = (rl6) this.L$8;
                        it2 = (Iterator) this.L$6;
                        ?? r15 = (Collection) this.L$5;
                        rVar2 = (r) this.L$3;
                        vpr vprVar6 = (vpr) this.L$2;
                        kotlin.b.b(obj);
                        vprVar3 = vprVar6;
                        obj2 = obj;
                        arrayList2 = r15;
                        om6Var = new om6(list, list2, (qn6) obj2, rl6Var);
                        this.L$0 = tseVar;
                        this.L$1 = null;
                        this.L$2 = vprVar3;
                        this.L$3 = rVar2;
                        this.L$4 = null;
                        this.L$5 = arrayList2;
                        this.L$6 = it2;
                        this.L$7 = null;
                        this.L$8 = null;
                        this.L$9 = null;
                        this.L$10 = null;
                        this.L$11 = null;
                        this.L$12 = collection;
                        this.L$13 = null;
                        this.L$14 = null;
                        this.L$15 = null;
                        this.label = 4;
                        if (vprVar2.emit(om6Var, this) != coroutineSingletons) {
                            rVar3 = rVar2;
                            vprVar = vprVar3;
                            arrayList = arrayList2;
                            collection.add(zy11Var);
                            rVar = rVar3;
                            it = it2;
                            i2 = 3;
                            if (!it.hasNext()) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    collection = (Collection) this.L$12;
                    Iterator it6 = (Iterator) this.L$6;
                    ?? r11 = (Collection) this.L$5;
                    rVar3 = (r) this.L$3;
                    vpr vprVar7 = (vpr) this.L$2;
                    kotlin.b.b(obj);
                    it2 = it6;
                    arrayList = r11;
                    vprVar = vprVar7;
                    collection.add(zy11Var);
                    rVar = rVar3;
                    it = it2;
                    i2 = 3;
                    if (!it.hasNext()) {
                        return zy11Var;
                    }
                    rl6Var2 = (rl6) it.next();
                    qoh h = tje.h(tseVar, null, null, new BubbleComponentFactory$prepareBubbles$1$1$1$content$1(rl6Var2, rVar, null), i2);
                    qoh h2 = tje.h(tseVar, null, null, new BubbleComponentFactory$prepareBubbles$1$1$1$selectedContent$1(rl6Var2, rVar, null), i2);
                    qoh h3 = tje.h(tseVar, null, null, new BubbleComponentFactory$prepareBubbles$1$1$1$overlay$1(rl6Var2, rVar, null), i2);
                    this.L$0 = tseVar;
                    this.L$1 = null;
                    this.L$2 = vprVar;
                    this.L$3 = rVar;
                    this.L$4 = null;
                    this.L$5 = arrayList;
                    this.L$6 = it;
                    this.L$7 = null;
                    this.L$8 = rl6Var2;
                    this.L$9 = null;
                    this.L$10 = h2;
                    this.L$11 = h3;
                    this.L$12 = vprVar;
                    this.L$13 = arrayList;
                    this.label = 1;
                    obj4 = h.s(this);
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (obj4 != coroutineSingletons) {
                        vprVar4 = vprVar;
                        rVar4 = rVar;
                        nohVar = h3;
                        arrayList3 = arrayList;
                        nohVar2 = h2;
                        it3 = it;
                        collection = arrayList3;
                        list = (List) obj4;
                        this.L$0 = tseVar;
                        this.L$1 = null;
                        this.L$2 = vprVar4;
                        this.L$3 = rVar4;
                        this.L$4 = null;
                        this.L$5 = arrayList3;
                        this.L$6 = it3;
                        this.L$7 = null;
                        this.L$8 = rl6Var2;
                        this.L$9 = null;
                        this.L$10 = null;
                        this.L$11 = nohVar;
                        this.L$12 = vprVar;
                        this.L$13 = list;
                        this.L$14 = collection;
                        this.label = 2;
                        obj3 = nohVar2.k(this);
                    }
                    return coroutineSingletons;
                }
                collection = (Collection) this.L$13;
                vprVar = (vpr) this.L$12;
                nohVar = (noh) this.L$11;
                nohVar2 = (noh) this.L$10;
                rl6Var2 = (rl6) this.L$8;
                Iterator it7 = (Iterator) this.L$6;
                ?? r122 = (Collection) this.L$5;
                r rVar6 = (r) this.L$3;
                vprVar4 = (vpr) this.L$2;
                kotlin.b.b(obj);
                rVar4 = rVar6;
                arrayList3 = r122;
                it3 = it7;
                obj4 = obj;
                list = (List) obj4;
                this.L$0 = tseVar;
                this.L$1 = null;
                this.L$2 = vprVar4;
                this.L$3 = rVar4;
                this.L$4 = null;
                this.L$5 = arrayList3;
                this.L$6 = it3;
                this.L$7 = null;
                this.L$8 = rl6Var2;
                this.L$9 = null;
                this.L$10 = null;
                this.L$11 = nohVar;
                this.L$12 = vprVar;
                this.L$13 = list;
                this.L$14 = collection;
                this.label = 2;
                obj3 = nohVar2.k(this);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BubbleComponentFactory$prepareBubbles$1(List list, r rVar, Continuation continuation) {
        super(2, continuation);
        this.$bubbles = list;
        this.this$0 = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BubbleComponentFactory$prepareBubbles$1 bubbleComponentFactory$prepareBubbles$1 = new BubbleComponentFactory$prepareBubbles$1(this.$bubbles, this.this$0, continuation);
        bubbleComponentFactory$prepareBubbles$1.L$0 = obj;
        return bubbleComponentFactory$prepareBubbles$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BubbleComponentFactory$prepareBubbles$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$bubbles, vprVar, this.this$0, null);
            this.L$0 = null;
            this.label = 1;
            if (bvf0.n(anonymousClass1, this) == coroutineSingletons) {
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
