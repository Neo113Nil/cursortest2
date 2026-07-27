package com.onesignal.common.events;

import B7.h;
import I7.l;
import I7.p;
import S7.AbstractC0406y;
import S7.F;
import S7.InterfaceC0404w;
import X7.o;
import Z7.e;
import u7.v;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public class a implements c {
    private Object callback;

    /* renamed from: com.onesignal.common.events.a$a, reason: collision with other inner class name */
    public static final class C0176a extends h implements l {
        final /* synthetic */ l $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0176a(l lVar, InterfaceC5267d interfaceC5267d) {
            super(1, interfaceC5267d);
            this.$callback = lVar;
        }

        @Override // B7.a
        public final InterfaceC5267d create(InterfaceC5267d interfaceC5267d) {
            return a.this.new C0176a(this.$callback, interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            if (a.this.callback != null) {
                l lVar = this.$callback;
                Object obj2 = a.this.callback;
                kotlin.jvm.internal.h.b(obj2);
                lVar.invoke(obj2);
            }
            return v.f41350a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5267d interfaceC5267d) {
            return ((C0176a) create(interfaceC5267d)).invokeSuspend(v.f41350a);
        }
    }

    public static final class b extends h implements p {
        final /* synthetic */ p $callback;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p pVar, a aVar, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$callback = pVar;
            this.this$0 = aVar;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return new b(this.$callback, this.this$0, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((b) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(v.f41350a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.d.k(obj);
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
                com.bumptech.glide.d.k(obj);
            }
            return v.f41350a;
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

    public final Object suspendingFire(p pVar, InterfaceC5267d interfaceC5267d) {
        Object obj = this.callback;
        v vVar = v.f41350a;
        if (obj != null) {
            kotlin.jvm.internal.h.b(obj);
            Object invoke = pVar.invoke(obj, interfaceC5267d);
            if (invoke == A7.a.f58n) {
                return invoke;
            }
        }
        return vVar;
    }

    public final Object suspendingFireOnMain(p pVar, InterfaceC5267d interfaceC5267d) {
        Object obj = this.callback;
        v vVar = v.f41350a;
        if (obj != null) {
            e eVar = F.f2915a;
            Object y7 = AbstractC0406y.y(o.f3856a, new b(pVar, this, null), interfaceC5267d);
            if (y7 == A7.a.f58n) {
                return y7;
            }
        }
        return vVar;
    }
}
