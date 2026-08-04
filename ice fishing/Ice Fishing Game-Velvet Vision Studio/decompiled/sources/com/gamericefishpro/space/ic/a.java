package com.gamericefishpro.space.ic;

import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.x;
import com.gamericefishpro.space.vh.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final a INSTANCE = new a();
    private static final x mainScope = a0.b(a0.v("OSPrimaryCoroutineScope"));

    /* JADX INFO: renamed from: com.gamericefishpro.space.ic.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0021a extends i implements Function2 {
        final /* synthetic */ Function1<com.gamericefishpro.space.th.a, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0021a(Function1<? super com.gamericefishpro.space.th.a, ? extends Object> function1, com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
            this.$block = function1;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return new C0021a(this.$block, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((C0021a) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                Function1<com.gamericefishpro.space.th.a, Object> function1 = this.$block;
                this.label = 1;
                if (function1.invoke(this) == aVar) {
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

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends i implements Function2 {
        int label;

        public b(com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return new b(aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((b) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            return Unit.a;
        }
    }

    private a() {
    }

    public final void execute(Function1<? super com.gamericefishpro.space.th.a, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        a0.u(mainScope, null, new C0021a(block, null), 3);
    }

    public final Object waitForIdle(com.gamericefishpro.space.th.a aVar) {
        Object objY = a0.u(mainScope, null, new b(null), 3).y(aVar);
        return objY == com.gamericefishpro.space.uh.a.d ? objY : Unit.a;
    }
}
