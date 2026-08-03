package com.onesignal.common.events;

import ac.o;
import bc.m;
import hc.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import oc.e;
import yc.a0;
import yc.i0;
import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class b implements d {
    private final List<Object> subscribers;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends j implements oc.c {
        final /* synthetic */ oc.c $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(oc.c cVar, fc.d dVar) {
            super(1, dVar);
            this.$callback = cVar;
        }

        @Override // hc.a
        public final fc.d create(fc.d dVar) {
            return b.this.new a(this.$callback, dVar);
        }

        @Override // oc.c
        public final Object invoke(fc.d dVar) {
            return ((a) create(dVar)).invokeSuspend(o.f277a);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            List e02;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
            List list = b.this.subscribers;
            b bVar = b.this;
            synchronized (list) {
                e02 = m.e0(bVar.subscribers);
            }
            Iterator it = e02.iterator();
            while (it.hasNext()) {
                this.$callback.invoke(it.next());
            }
            return o.f277a;
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.common.events.b$b, reason: collision with other inner class name */
    public static final class C0003b extends hc.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0003b(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.suspendingFire(null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class c extends j implements e {
        final /* synthetic */ e $callback;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e eVar, fc.d dVar) {
            super(2, dVar);
            this.$callback = eVar;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return b.this.new c(this.$callback, dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            List e02;
            Iterator it;
            gc.a aVar = gc.a.f2559g;
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                List list = b.this.subscribers;
                b bVar = b.this;
                synchronized (list) {
                    e02 = m.e0(bVar.subscribers);
                }
                it = e02.iterator();
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$0;
                v6.a.W(obj);
            }
            while (it.hasNext()) {
                Object next = it.next();
                e eVar = this.$callback;
                this.L$0 = it;
                this.label = 1;
                if (eVar.invoke(next, this) == aVar) {
                    return aVar;
                }
            }
            return o.f277a;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((c) create(yVar, dVar)).invokeSuspend(o.f277a);
        }
    }

    public b() {
        List<Object> synchronizedList = Collections.synchronizedList(new ArrayList());
        pc.j.d(synchronizedList, "synchronizedList(mutableListOf())");
        this.subscribers = synchronizedList;
    }

    public final void fire(oc.c cVar) {
        List e02;
        pc.j.e(cVar, "callback");
        synchronized (this.subscribers) {
            e02 = m.e0(this.subscribers);
        }
        Iterator it = e02.iterator();
        while (it.hasNext()) {
            cVar.invoke(it.next());
        }
    }

    public final void fireOnMain(oc.c cVar) {
        pc.j.e(cVar, "callback");
        com.onesignal.common.threading.b.suspendifyOnMain(new a(cVar, null));
    }

    @Override // com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        pc.j.e(this.subscribers, "<this>");
        return !r0.isEmpty();
    }

    @Override // com.onesignal.common.events.d
    public void subscribe(Object obj) {
        synchronized (this.subscribers) {
            this.subscribers.add(obj);
        }
    }

    public final void subscribeAll(b bVar) {
        pc.j.e(bVar, "from");
        synchronized (this.subscribers) {
            Iterator<Object> it = bVar.subscribers.iterator();
            while (it.hasNext()) {
                subscribe(it.next());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object suspendingFire(e eVar, fc.d dVar) {
        C0003b c0003b;
        int i10;
        List e02;
        e eVar2;
        Iterator it;
        if (dVar instanceof C0003b) {
            c0003b = (C0003b) dVar;
            int i11 = c0003b.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0003b.label = i11 - Integer.MIN_VALUE;
                Object obj = c0003b.result;
                gc.a aVar = gc.a.f2559g;
                i10 = c0003b.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    synchronized (this.subscribers) {
                        e02 = m.e0(this.subscribers);
                    }
                    eVar2 = eVar;
                    it = e02.iterator();
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) c0003b.L$1;
                    e eVar3 = (e) c0003b.L$0;
                    v6.a.W(obj);
                    eVar2 = eVar3;
                }
                while (it.hasNext()) {
                    Object next = it.next();
                    c0003b.L$0 = eVar2;
                    c0003b.L$1 = it;
                    c0003b.label = 1;
                    if (eVar2.invoke(next, c0003b) == aVar) {
                        return aVar;
                    }
                }
                return o.f277a;
            }
        }
        c0003b = new C0003b(dVar);
        Object obj2 = c0003b.result;
        gc.a aVar2 = gc.a.f2559g;
        i10 = c0003b.label;
        if (i10 != 0) {
        }
        while (it.hasNext()) {
        }
        return o.f277a;
    }

    public final Object suspendingFireOnMain(e eVar, fc.d dVar) {
        fd.e eVar2 = i0.f8859a;
        Object A = a0.A(dd.o.f1880a, new c(eVar, null), dVar);
        return A == gc.a.f2559g ? A : o.f277a;
    }

    @Override // com.onesignal.common.events.d
    public void unsubscribe(Object obj) {
        synchronized (this.subscribers) {
            this.subscribers.remove(obj);
        }
    }
}
