package com.gamericefishpro.space.dc;

import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.k0;
import com.gamericefishpro.space.pi.x;
import com.gamericefishpro.space.ui.m;
import com.gamericefishpro.space.vh.i;
import com.gamericefishpro.space.wi.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class a implements c {
    private Object callback;

    /* JADX INFO: renamed from: com.gamericefishpro.space.dc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0007a extends i implements Function1 {
        final /* synthetic */ Function1<Object, Unit> $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0007a(Function1<Object, Unit> function1, com.gamericefishpro.space.th.a aVar) {
            super(1, aVar);
            this.$callback = function1;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return a.this.new C0007a(this.$callback, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((C0007a) create(aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            if (a.this.callback != null) {
                Function1<Object, Unit> function1 = this.$callback;
                Object obj2 = a.this.callback;
                Intrinsics.b(obj2);
                function1.invoke(obj2);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends i implements Function2 {
        final /* synthetic */ Function2<Object, com.gamericefishpro.space.th.a, Object> $callback;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function2<Object, ? super com.gamericefishpro.space.th.a, ? extends Object> function2, a aVar, com.gamericefishpro.space.th.a aVar2) {
            super(2, aVar2);
            this.$callback = function2;
            this.this$0 = aVar;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return new b(this.$callback, this.this$0, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((b) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                Function2<Object, com.gamericefishpro.space.th.a, Object> function2 = this.$callback;
                Object obj2 = this.this$0.callback;
                Intrinsics.b(obj2);
                this.label = 1;
                if (function2.invoke(obj2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
            }
            return Unit.a;
        }
    }

    public final void fire(Function1<Object, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Object obj = this.callback;
        if (obj != null) {
            Intrinsics.b(obj);
            callback.invoke(obj);
        }
    }

    public final void fireOnMain(Function1<Object, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        com.gamericefishpro.space.ic.b.suspendifyOnMain(new C0007a(callback, null));
    }

    @Override // com.gamericefishpro.space.dc.c
    public boolean getHasCallback() {
        return this.callback != null;
    }

    @Override // com.gamericefishpro.space.dc.c
    public void set(Object obj) {
        this.callback = obj;
    }

    public final Object suspendingFire(Function2<Object, ? super com.gamericefishpro.space.th.a, ? extends Object> function2, com.gamericefishpro.space.th.a aVar) {
        Object obj = this.callback;
        if (obj == null) {
            return Unit.a;
        }
        Intrinsics.b(obj);
        Object objInvoke = function2.invoke(obj, aVar);
        return objInvoke == com.gamericefishpro.space.uh.a.d ? objInvoke : Unit.a;
    }

    public final Object suspendingFireOnMain(Function2<Object, ? super com.gamericefishpro.space.th.a, ? extends Object> function2, com.gamericefishpro.space.th.a aVar) {
        if (this.callback == null) {
            return Unit.a;
        }
        e eVar = k0.a;
        Object objD = a0.D(m.a, new b(function2, this, null), aVar);
        return objD == com.gamericefishpro.space.uh.a.d ? objD : Unit.a;
    }
}
