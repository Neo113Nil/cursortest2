package ru.yandex.taxi.layers.source.factory.componentfactory;

import defpackage.bvf0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.om6;
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
import ru.cprocsp.NGate.tools.Constants;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lom6;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.source.factory.componentfactory.AdvertBubbleComponentFactory$createBubbleConfig$1", f = "AdvertBubbleComponentFactory.kt", l = {113}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AdvertBubbleComponentFactory$createBubbleConfig$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<rl6> $bubbles;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.layers.source.factory.componentfactory.AdvertBubbleComponentFactory$createBubbleConfig$1$1", f = "AdvertBubbleComponentFactory.kt", l = {Constants.VPN_TRAFFIC, Constants.VPN_TRAFFIC, Constants.VPN_TRAFFIC}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.layers.source.factory.componentfactory.AdvertBubbleComponentFactory$createBubbleConfig$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ vpr $$this$flow;
        final /* synthetic */ List<rl6> $bubbles;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        final /* synthetic */ e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List list, vpr vprVar, e eVar, Continuation continuation) {
            super(2, continuation);
            this.$bubbles = list;
            this.$$this$flow = vprVar;
            this.this$0 = eVar;
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

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0149, code lost:
        
            if (r10 != r2) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0180  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0178 -> B:7:0x017a). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Collection arrayList;
            Iterator it;
            vpr vprVar;
            e eVar;
            vpr vprVar2;
            Collection collection;
            Object obj2;
            List list;
            rl6 rl6Var;
            Collection collection2;
            noh nohVar;
            Object obj3;
            tse tseVar = (tse) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            zy11 zy11Var = zy11.a;
            int i2 = 1;
            if (i == 0) {
                kotlin.b.b(obj);
                List<rl6> list2 = this.$bubbles;
                vpr vprVar3 = this.$$this$flow;
                e eVar2 = this.this$0;
                arrayList = new ArrayList(tcc.n(list2, 10));
                it = list2.iterator();
                vprVar = vprVar3;
                eVar = eVar2;
                collection2 = arrayList;
                if (!it.hasNext()) {
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        collection2 = (Collection) this.L$13;
                        list = (List) this.L$12;
                        vpr vprVar4 = (vpr) this.L$11;
                        rl6 rl6Var2 = (rl6) this.L$8;
                        Iterator it2 = (Iterator) this.L$6;
                        Collection collection3 = (Collection) this.L$5;
                        e eVar3 = (e) this.L$3;
                        vprVar2 = (vpr) this.L$2;
                        kotlin.b.b(obj);
                        rl6Var = rl6Var2;
                        it = it2;
                        collection = collection3;
                        eVar = eVar3;
                        vprVar = vprVar4;
                        obj2 = obj;
                        om6 om6Var = new om6(list, (List) obj2, null, rl6Var);
                        this.L$0 = tseVar;
                        this.L$1 = null;
                        this.L$2 = vprVar2;
                        this.L$3 = eVar;
                        this.L$4 = null;
                        this.L$5 = collection;
                        this.L$6 = it;
                        this.L$7 = null;
                        this.L$8 = null;
                        this.L$9 = null;
                        this.L$10 = null;
                        this.L$11 = collection2;
                        this.L$12 = null;
                        this.L$13 = null;
                        this.label = 3;
                        if (vprVar.emit(om6Var, this) != coroutineSingletons) {
                            arrayList = collection;
                            vprVar = vprVar2;
                            collection2.add(zy11Var);
                            i2 = 1;
                            collection2 = arrayList;
                            if (!it.hasNext()) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    collection2 = (Collection) this.L$11;
                    Iterator it3 = (Iterator) this.L$6;
                    arrayList = (Collection) this.L$5;
                    e eVar4 = (e) this.L$3;
                    vpr vprVar5 = (vpr) this.L$2;
                    kotlin.b.b(obj);
                    eVar = eVar4;
                    vprVar = vprVar5;
                    it = it3;
                    collection2.add(zy11Var);
                    i2 = 1;
                    collection2 = arrayList;
                    if (!it.hasNext()) {
                        return zy11Var;
                    }
                    rl6Var = (rl6) it.next();
                    qoh h = tje.h(tseVar, null, null, new AdvertBubbleComponentFactory$createBubbleConfig$1$1$1$content$1(rl6Var, eVar, null), 3);
                    nohVar = tje.h(tseVar, null, null, new AdvertBubbleComponentFactory$createBubbleConfig$1$1$1$selectedContent$1(rl6Var, eVar, null), 3);
                    this.L$0 = tseVar;
                    this.L$1 = null;
                    this.L$2 = vprVar;
                    this.L$3 = eVar;
                    this.L$4 = null;
                    this.L$5 = collection2;
                    this.L$6 = it;
                    this.L$7 = null;
                    this.L$8 = rl6Var;
                    this.L$9 = null;
                    this.L$10 = nohVar;
                    this.L$11 = vprVar;
                    this.L$12 = collection2;
                    this.label = i2;
                    obj3 = h.s(this);
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (obj3 != coroutineSingletons) {
                        collection = collection2;
                        vprVar2 = vprVar;
                        list = (List) obj3;
                        this.L$0 = tseVar;
                        this.L$1 = null;
                        this.L$2 = vprVar2;
                        this.L$3 = eVar;
                        this.L$4 = null;
                        this.L$5 = collection;
                        this.L$6 = it;
                        this.L$7 = null;
                        this.L$8 = rl6Var;
                        this.L$9 = null;
                        this.L$10 = null;
                        this.L$11 = vprVar;
                        this.L$12 = list;
                        this.L$13 = collection2;
                        this.label = 2;
                        obj2 = nohVar.k(this);
                    }
                    return coroutineSingletons;
                }
                collection2 = (Collection) this.L$12;
                vpr vprVar6 = (vpr) this.L$11;
                noh nohVar2 = (noh) this.L$10;
                rl6 rl6Var3 = (rl6) this.L$8;
                it = (Iterator) this.L$6;
                collection = (Collection) this.L$5;
                eVar = (e) this.L$3;
                vpr vprVar7 = (vpr) this.L$2;
                kotlin.b.b(obj);
                vprVar2 = vprVar7;
                vprVar = vprVar6;
                rl6Var = rl6Var3;
                nohVar = nohVar2;
                obj3 = obj;
                list = (List) obj3;
                this.L$0 = tseVar;
                this.L$1 = null;
                this.L$2 = vprVar2;
                this.L$3 = eVar;
                this.L$4 = null;
                this.L$5 = collection;
                this.L$6 = it;
                this.L$7 = null;
                this.L$8 = rl6Var;
                this.L$9 = null;
                this.L$10 = null;
                this.L$11 = vprVar;
                this.L$12 = list;
                this.L$13 = collection2;
                this.label = 2;
                obj2 = nohVar.k(this);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvertBubbleComponentFactory$createBubbleConfig$1(List list, e eVar, Continuation continuation) {
        super(2, continuation);
        this.$bubbles = list;
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AdvertBubbleComponentFactory$createBubbleConfig$1 advertBubbleComponentFactory$createBubbleConfig$1 = new AdvertBubbleComponentFactory$createBubbleConfig$1(this.$bubbles, this.this$0, continuation);
        advertBubbleComponentFactory$createBubbleConfig$1.L$0 = obj;
        return advertBubbleComponentFactory$createBubbleConfig$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AdvertBubbleComponentFactory$createBubbleConfig$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
