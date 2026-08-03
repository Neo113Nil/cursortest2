package com.onesignal.common.events;

import ac.o;
import hc.j;
import oc.e;
import yc.a0;
import yc.i0;
import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class a implements c {
    private Object callback;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.common.events.a$a, reason: collision with other inner class name */
    public static final class C0002a extends j implements oc.c {
        final /* synthetic */ oc.c $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0002a(oc.c cVar, fc.d dVar) {
            super(1, dVar);
            this.$callback = cVar;
        }

        @Override // hc.a
        public final fc.d create(fc.d dVar) {
            return a.this.new C0002a(this.$callback, dVar);
        }

        @Override // oc.c
        public final Object invoke(fc.d dVar) {
            return ((C0002a) create(dVar)).invokeSuspend(o.f277a);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
            if (a.this.callback != null) {
                oc.c cVar = this.$callback;
                Object obj2 = a.this.callback;
                pc.j.b(obj2);
                cVar.invoke(obj2);
            }
            return o.f277a;
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends j implements e {
        final /* synthetic */ e $callback;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e eVar, a aVar, fc.d dVar) {
            super(2, dVar);
            this.$callback = eVar;
            this.this$0 = aVar;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return new b(this.$callback, this.this$0, dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                e eVar = this.$callback;
                Object obj2 = this.this$0.callback;
                pc.j.b(obj2);
                this.label = 1;
                Object invoke = eVar.invoke(obj2, this);
                gc.a aVar = gc.a.f2559g;
                if (invoke == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
            }
            return o.f277a;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((b) create(yVar, dVar)).invokeSuspend(o.f277a);
        }
    }

    public final void fire(oc.c cVar) {
        pc.j.e(cVar, "callback");
        Object obj = this.callback;
        if (obj != null) {
            pc.j.b(obj);
            cVar.invoke(obj);
        }
    }

    public final void fireOnMain(oc.c cVar) {
        pc.j.e(cVar, "callback");
        com.onesignal.common.threading.b.suspendifyOnMain(new C0002a(cVar, null));
    }

    @Override // com.onesignal.common.events.c
    public boolean getHasCallback() {
        return this.callback != null;
    }

    @Override // com.onesignal.common.events.c
    public void set(Object obj) {
        this.callback = obj;
    }

    public final Object suspendingFire(e eVar, fc.d dVar) {
        Object obj = this.callback;
        o oVar = o.f277a;
        if (obj != null) {
            pc.j.b(obj);
            Object invoke = eVar.invoke(obj, dVar);
            if (invoke == gc.a.f2559g) {
                return invoke;
            }
        }
        return oVar;
    }

    public final Object suspendingFireOnMain(e eVar, fc.d dVar) {
        if (this.callback != null) {
            fd.e eVar2 = i0.f8859a;
            Object A = a0.A(dd.o.f1880a, new b(eVar, this, null), dVar);
            if (A == gc.a.f2559g) {
                return A;
            }
        }
        return o.f277a;
    }
}
