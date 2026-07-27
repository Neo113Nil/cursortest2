package com.onesignal.common.events;

import E7.l;
import E7.p;
import O7.AbstractC0399y;
import O7.F;
import O7.InterfaceC0397w;
import T7.o;
import V7.e;
import com.bumptech.glide.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import q7.v;
import r7.AbstractC4979j;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.AbstractC5219c;
import x7.h;

/* loaded from: classes2.dex */
public class b implements d {
    private final List<Object> subscribers;

    public static final class a extends h implements l {
        final /* synthetic */ l $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l lVar, InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
            this.$callback = lVar;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return b.this.new a(this.$callback, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            List R8;
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.r(obj);
            List list = b.this.subscribers;
            b bVar = b.this;
            synchronized (list) {
                R8 = AbstractC4979j.R(bVar.subscribers);
            }
            Iterator it = R8.iterator();
            while (it.hasNext()) {
                this.$callback.invoke(it.next());
            }
            return v.f40183a;
        }

        @Override // E7.l
        public final Object invoke(InterfaceC5133d interfaceC5133d) {
            return ((a) create(interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    /* renamed from: com.onesignal.common.events.b$b, reason: collision with other inner class name */
    public static final class C0176b extends AbstractC5219c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0176b(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
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
        public c(p pVar, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$callback = pVar;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return b.this.new c(this.$callback, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((c) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            List R8;
            Iterator it;
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i == 0) {
                f.r(obj);
                List list = b.this.subscribers;
                b bVar = b.this;
                synchronized (list) {
                    R8 = AbstractC4979j.R(bVar.subscribers);
                }
                it = R8.iterator();
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$0;
                f.r(obj);
            }
            while (it.hasNext()) {
                Object next = it.next();
                p pVar = this.$callback;
                this.L$0 = it;
                this.label = 1;
                if (pVar.invoke(next, this) == enumC5179a) {
                    return enumC5179a;
                }
            }
            return v.f40183a;
        }
    }

    public b() {
        List<Object> synchronizedList = Collections.synchronizedList(new ArrayList());
        kotlin.jvm.internal.h.d(synchronizedList, "synchronizedList(...)");
        this.subscribers = synchronizedList;
    }

    public final void fire(l callback) {
        List R8;
        kotlin.jvm.internal.h.e(callback, "callback");
        synchronized (this.subscribers) {
            R8 = AbstractC4979j.R(this.subscribers);
        }
        Iterator it = R8.iterator();
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
    public final Object suspendingFire(p pVar, InterfaceC5133d interfaceC5133d) {
        C0176b c0176b;
        int i;
        List R8;
        p pVar2;
        Iterator it;
        if (interfaceC5133d instanceof C0176b) {
            c0176b = (C0176b) interfaceC5133d;
            int i4 = c0176b.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0176b.label = i4 - Integer.MIN_VALUE;
                Object obj = c0176b.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = c0176b.label;
                if (i != 0) {
                    f.r(obj);
                    synchronized (this.subscribers) {
                        R8 = AbstractC4979j.R(this.subscribers);
                    }
                    pVar2 = pVar;
                    it = R8.iterator();
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) c0176b.L$1;
                    p pVar3 = (p) c0176b.L$0;
                    f.r(obj);
                    pVar2 = pVar3;
                }
                while (it.hasNext()) {
                    Object next = it.next();
                    c0176b.L$0 = pVar2;
                    c0176b.L$1 = it;
                    c0176b.label = 1;
                    if (pVar2.invoke(next, c0176b) == enumC5179a) {
                        return enumC5179a;
                    }
                }
                return v.f40183a;
            }
        }
        c0176b = new C0176b(interfaceC5133d);
        Object obj2 = c0176b.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = c0176b.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return v.f40183a;
    }

    public final Object suspendingFireOnMain(p pVar, InterfaceC5133d interfaceC5133d) {
        e eVar = F.f2551a;
        Object y6 = AbstractC0399y.y(o.f3162a, new c(pVar, null), interfaceC5133d);
        return y6 == EnumC5179a.f41704n ? y6 : v.f40183a;
    }

    @Override // com.onesignal.common.events.d
    public void unsubscribe(Object obj) {
        synchronized (this.subscribers) {
            this.subscribers.remove(obj);
        }
    }
}
