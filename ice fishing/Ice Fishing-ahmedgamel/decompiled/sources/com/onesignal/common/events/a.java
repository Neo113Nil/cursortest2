package com.onesignal.common.events;

import B7.h;
import I7.l;
import I7.p;
import S7.AbstractC0410y;
import S7.F;
import S7.InterfaceC0408w;
import X7.o;
import Z7.e;
import u7.v;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public class a implements c {
    private Object callback;

    /* renamed from: com.onesignal.common.events.a$a, reason: collision with other inner class name */
    public static final class C0176a extends h implements l {
        final /* synthetic */ l $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0176a(l lVar, InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
            this.$callback = lVar;
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return a.this.new C0176a(this.$callback, interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q3.b.s(obj);
            if (a.this.callback != null) {
                l lVar = this.$callback;
                Object obj2 = a.this.callback;
                kotlin.jvm.internal.h.b(obj2);
                lVar.invoke(obj2);
            }
            return v.f41073a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((C0176a) create(interfaceC5240d)).invokeSuspend(v.f41073a);
        }
    }

    public static final class b extends h implements p {
        final /* synthetic */ p $callback;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p pVar, a aVar, InterfaceC5240d interfaceC5240d) {
            super(2, interfaceC5240d);
            this.$callback = pVar;
            this.this$0 = aVar;
        }

        @Override // B7.a
        public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
            return new b(this.$callback, this.this$0, interfaceC5240d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
            return ((b) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(v.f41073a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i == 0) {
                Q3.b.s(obj);
                p pVar = this.$callback;
                Object obj2 = this.this$0.callback;
                kotlin.jvm.internal.h.b(obj2);
                this.label = 1;
                if (pVar.invoke(obj2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q3.b.s(obj);
            }
            return v.f41073a;
        }
    }

    public final void fire(l callback) {
        kotlin.jvm.internal.h.e(callback, "callback");
        Object obj = this.callback;
        if (obj != null) {
            kotlin.jvm.internal.h.b(obj);
            callback.invoke(obj);
        }
    }

    public final void fireOnMain(l callback) {
        kotlin.jvm.internal.h.e(callback, "callback");
        com.onesignal.common.threading.c.suspendifyOnMain(new C0176a(callback, null));
    }

    @Override // com.onesignal.common.events.c
    public boolean getHasCallback() {
        return this.callback != null;
    }

    @Override // com.onesignal.common.events.c
    public void set(Object obj) {
        this.callback = obj;
    }

    public final Object suspendingFire(p pVar, InterfaceC5240d interfaceC5240d) {
        Object obj = this.callback;
        v vVar = v.f41073a;
        if (obj != null) {
            kotlin.jvm.internal.h.b(obj);
            Object invoke = pVar.invoke(obj, interfaceC5240d);
            if (invoke == A7.a.f215n) {
                return invoke;
            }
        }
        return vVar;
    }

    public final Object suspendingFireOnMain(p pVar, InterfaceC5240d interfaceC5240d) {
        Object obj = this.callback;
        v vVar = v.f41073a;
        if (obj != null) {
            e eVar = F.f2998a;
            Object y7 = AbstractC0410y.y(o.f3811a, new b(pVar, this, null), interfaceC5240d);
            if (y7 == A7.a.f215n) {
                return y7;
            }
        }
        return vVar;
    }
}
