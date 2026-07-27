package com.onesignal.common.events;

import B7.h;
import I7.l;
import I7.p;
import S7.AbstractC0406y;
import S7.F;
import S7.InterfaceC0404w;
import X7.o;
import Z7.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import u7.v;
import v7.AbstractC5129j;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public class b implements d {
    private final List<Object> subscribers;

    public static final class a extends h implements l {
        final /* synthetic */ l $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l lVar, InterfaceC5267d interfaceC5267d) {
            super(1, interfaceC5267d);
            this.$callback = lVar;
        }

        @Override // B7.a
        public final InterfaceC5267d create(InterfaceC5267d interfaceC5267d) {
            return b.this.new a(this.$callback, interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            List L6;
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            List list = b.this.subscribers;
            b bVar = b.this;
            synchronized (list) {
                L6 = AbstractC5129j.L(bVar.subscribers);
            }
            Iterator it = L6.iterator();
            while (it.hasNext()) {
                this.$callback.invoke(it.next());
            }
            return v.f41350a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5267d interfaceC5267d) {
            return ((a) create(interfaceC5267d)).invokeSuspend(v.f41350a);
        }
    }

    /* renamed from: com.onesignal.common.events.b$b, reason: collision with other inner class name */
    public static final class C0177b extends B7.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0177b(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.suspendingFire(null, this);
        }
    }

    public static final class c extends h implements p {
        final /* synthetic */ p $callback;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(p pVar, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$callback = pVar;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return b.this.new c(this.$callback, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((c) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(v.f41350a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            List L6;
            Iterator it;
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.d.k(obj);
                List list = b.this.subscribers;
                b bVar = b.this;
                synchronized (list) {
                    L6 = AbstractC5129j.L(bVar.subscribers);
                }
                it = L6.iterator();
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$0;
                com.bumptech.glide.d.k(obj);
            }
            while (it.hasNext()) {
                Object next = it.next();
                p pVar = this.$callback;
                this.L$0 = it;
                this.label = 1;
                if (pVar.invoke(next, this) == aVar) {
                    return aVar;
                }
            }
            return v.f41350a;
        }
    }

    public b() {
        List<Object> synchronizedList = Collections.synchronizedList(new ArrayList());
        kotlin.jvm.internal.h.d(synchronizedList, "synchronizedList(...)");
        this.subscribers = synchronizedList;
    }

    public final void fire(l callback) {
        List L6;
        kotlin.jvm.internal.h.e(callback, "callback");
        synchronized (this.subscribers) {
            L6 = AbstractC5129j.L(this.subscribers);
        }
        Iterator it = L6.iterator();
        while (it.hasNext()) {
            callback.invoke(it.next());
        }
    }

    public final void fireOnMain(l callback) {
        kotlin.jvm.internal.h.e(callback, "callback");
        com.onesignal.common.threading.c.suspendifyOnMain(new a(callback, null));
    }

    @Override // com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        kotlin.jvm.internal.h.e(this.subscribers, "<this>");
        return !r0.isEmpty();
    }

    @Override // com.onesignal.common.events.d
    public void subscribe(Object obj) {
        synchronized (this.subscribers) {
            this.subscribers.add(obj);
        }
    }

    public final void subscribeAll(b from) {
        kotlin.jvm.internal.h.e(from, "from");
        synchronized (this.subscribers) {
            Iterator<Object> it = from.subscribers.iterator();
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
    public final Object suspendingFire(p pVar, InterfaceC5267d interfaceC5267d) {
        C0177b c0177b;
        int i;
        List L6;
        p pVar2;
        Iterator it;
        if (interfaceC5267d instanceof C0177b) {
            c0177b = (C0177b) interfaceC5267d;
            int i6 = c0177b.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c0177b.label = i6 - Integer.MIN_VALUE;
                Object obj = c0177b.result;
                A7.a aVar = A7.a.f58n;
                i = c0177b.label;
                if (i != 0) {
                    com.bumptech.glide.d.k(obj);
                    synchronized (this.subscribers) {
                        L6 = AbstractC5129j.L(this.subscribers);
                    }
                    pVar2 = pVar;
                    it = L6.iterator();
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) c0177b.L$1;
                    p pVar3 = (p) c0177b.L$0;
                    com.bumptech.glide.d.k(obj);
                    pVar2 = pVar3;
                }
                while (it.hasNext()) {
                    Object next = it.next();
                    c0177b.L$0 = pVar2;
                    c0177b.L$1 = it;
                    c0177b.label = 1;
                    if (pVar2.invoke(next, c0177b) == aVar) {
                        return aVar;
                    }
                }
                return v.f41350a;
            }
        }
        c0177b = new C0177b(interfaceC5267d);
        Object obj2 = c0177b.result;
        A7.a aVar2 = A7.a.f58n;
        i = c0177b.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return v.f41350a;
    }

    public final Object suspendingFireOnMain(p pVar, InterfaceC5267d interfaceC5267d) {
        e eVar = F.f2915a;
        Object y7 = AbstractC0406y.y(o.f3856a, new c(pVar, null), interfaceC5267d);
        return y7 == A7.a.f58n ? y7 : v.f41350a;
    }

    @Override // com.onesignal.common.events.d
    public void unsubscribe(Object obj) {
        synchronized (this.subscribers) {
            this.subscribers.remove(obj);
        }
    }
}
