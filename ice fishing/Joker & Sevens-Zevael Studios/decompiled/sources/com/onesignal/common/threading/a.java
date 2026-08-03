package com.onesignal.common.threading;

import ac.o;
import hc.j;
import oc.e;
import yc.a0;
import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {
    public static final a INSTANCE = new a();
    private static final y mainScope = a0.a(a0.r("OSPrimaryCoroutineScope"));

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.common.threading.a$a, reason: collision with other inner class name */
    public static final class C0004a extends j implements e {
        final /* synthetic */ oc.c $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0004a(oc.c cVar, fc.d dVar) {
            super(2, dVar);
            this.$block = cVar;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return new C0004a(this.$block, dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                oc.c cVar = this.$block;
                this.label = 1;
                Object invoke = cVar.invoke(this);
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
            return ((C0004a) create(yVar, dVar)).invokeSuspend(o.f277a);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends j implements e {
        int label;

        public b(fc.d dVar) {
            super(2, dVar);
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return new b(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
            return o.f277a;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((b) create(yVar, dVar)).invokeSuspend(o.f277a);
        }
    }

    private a() {
    }

    public final void execute(oc.c cVar) {
        pc.j.e(cVar, "block");
        a0.q(mainScope, null, new C0004a(cVar, null), 3);
    }

    public final Object waitForIdle(fc.d dVar) {
        Object j3 = a0.q(mainScope, null, new b(null), 3).j(dVar);
        return j3 == gc.a.f2559g ? j3 : o.f277a;
    }
}
