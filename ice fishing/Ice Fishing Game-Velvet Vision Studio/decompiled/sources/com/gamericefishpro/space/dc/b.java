package com.gamericefishpro.space.dc;

import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.k0;
import com.gamericefishpro.space.pi.x;
import com.gamericefishpro.space.ui.m;
import com.gamericefishpro.space.vh.i;
import com.gamericefishpro.space.wi.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class b implements d {
    private final List<Object> subscribers;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a extends i implements Function1 {
        final /* synthetic */ Function1<Object, Unit> $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1<Object, Unit> function1, com.gamericefishpro.space.th.a aVar) {
            super(1, aVar);
            this.$callback = function1;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return b.this.new a(this.$callback, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((a) create(aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            List listL;
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            List list = b.this.subscribers;
            b bVar = b.this;
            synchronized (list) {
                listL = CollectionsKt.L(bVar.subscribers);
            }
            Iterator it = listL.iterator();
            while (it.hasNext()) {
                this.$callback.invoke(it.next());
            }
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: com.gamericefishpro.space.dc.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0008b extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0008b(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.suspendingFire(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class c extends i implements Function2 {
        final /* synthetic */ Function2<Object, com.gamericefishpro.space.th.a, Object> $callback;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function2<Object, ? super com.gamericefishpro.space.th.a, ? extends Object> function2, com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
            this.$callback = function2;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return b.this.new c(this.$callback, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((c) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            List listL;
            Iterator it;
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                List list = b.this.subscribers;
                b bVar = b.this;
                synchronized (list) {
                    listL = CollectionsKt.L(bVar.subscribers);
                }
                it = listL.iterator();
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$0;
                com.gamericefishpro.space.wa.b.P(obj);
            }
            while (it.hasNext()) {
                Object next = it.next();
                Function2<Object, com.gamericefishpro.space.th.a, Object> function2 = this.$callback;
                this.L$0 = it;
                this.label = 1;
                if (function2.invoke(next, this) == aVar) {
                    return aVar;
                }
            }
            return Unit.a;
        }
    }

    public b() {
        List<Object> listSynchronizedList = Collections.synchronizedList(new ArrayList());
        Intrinsics.checkNotNullExpressionValue(listSynchronizedList, "synchronizedList(...)");
        this.subscribers = listSynchronizedList;
    }

    public final void fire(Function1<Object, Unit> callback) {
        List listL;
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.subscribers) {
            listL = CollectionsKt.L(this.subscribers);
        }
        Iterator it = listL.iterator();
        while (it.hasNext()) {
            callback.invoke(it.next());
        }
    }

    public final void fireOnMain(Function1<Object, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        com.gamericefishpro.space.ic.b.suspendifyOnMain(new a(callback, null));
    }

    @Override // com.gamericefishpro.space.dc.d
    public boolean getHasSubscribers() {
        List<Object> list = this.subscribers;
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list != null ? !list.isEmpty() : list.iterator().hasNext();
    }

    @Override // com.gamericefishpro.space.dc.d
    public void subscribe(Object obj) {
        synchronized (this.subscribers) {
            this.subscribers.add(obj);
        }
    }

    public final void subscribeAll(b from) {
        Intrinsics.checkNotNullParameter(from, "from");
        synchronized (this.subscribers) {
            try {
                Iterator<Object> it = from.subscribers.iterator();
                while (it.hasNext()) {
                    subscribe(it.next());
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object suspendingFire(Function2<Object, ? super com.gamericefishpro.space.th.a, ? extends Object> function2, com.gamericefishpro.space.th.a aVar) {
        C0008b c0008b;
        List listL;
        Function2<Object, ? super com.gamericefishpro.space.th.a, ? extends Object> function3;
        Iterator it;
        if (aVar instanceof C0008b) {
            c0008b = (C0008b) aVar;
            int i = c0008b.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0008b.label = i - Integer.MIN_VALUE;
            } else {
                c0008b = new C0008b(aVar);
            }
        } else {
            c0008b = new C0008b(aVar);
        }
        Object obj = c0008b.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = c0008b.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            synchronized (this.subscribers) {
                listL = CollectionsKt.L(this.subscribers);
            }
            function3 = function2;
            it = listL.iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) c0008b.L$1;
            Function2<Object, ? super com.gamericefishpro.space.th.a, ? extends Object> function4 = (Function2) c0008b.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
            function3 = function4;
        }
        while (it.hasNext()) {
            Object next = it.next();
            c0008b.L$0 = function3;
            c0008b.L$1 = it;
            c0008b.label = 1;
            if (function3.invoke(next, c0008b) == aVar2) {
                return aVar2;
            }
        }
        return Unit.a;
    }

    public final Object suspendingFireOnMain(Function2<Object, ? super com.gamericefishpro.space.th.a, ? extends Object> function2, com.gamericefishpro.space.th.a aVar) {
        e eVar = k0.a;
        Object objD = a0.D(m.a, new c(function2, null), aVar);
        return objD == com.gamericefishpro.space.uh.a.d ? objD : Unit.a;
    }

    @Override // com.gamericefishpro.space.dc.d
    public void unsubscribe(Object obj) {
        synchronized (this.subscribers) {
            this.subscribers.remove(obj);
        }
    }
}
