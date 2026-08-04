package com.gamericefishpro.space.lg;

import com.gamericefishpro.space.vh.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class a implements com.gamericefishpro.space.kg.a {
    private final com.gamericefishpro.space.og.b _outcomeController;

    /* JADX INFO: renamed from: com.gamericefishpro.space.lg.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0034a extends i implements Function1 {
        final /* synthetic */ String $name;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0034a(String str, com.gamericefishpro.space.th.a aVar) {
            super(1, aVar);
            this.$name = str;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return a.this.new C0034a(this.$name, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((C0034a) create(aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.og.b bVar = a.this._outcomeController;
                String str = this.$name;
                this.label = 1;
                if (bVar.sendOutcomeEvent(str, this) == aVar) {
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
    public static final class b extends i implements Function1 {
        final /* synthetic */ String $name;
        final /* synthetic */ float $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, float f, com.gamericefishpro.space.th.a aVar) {
            super(1, aVar);
            this.$name = str;
            this.$value = f;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return a.this.new b(this.$name, this.$value, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((b) create(aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.og.b bVar = a.this._outcomeController;
                String str = this.$name;
                float f = this.$value;
                this.label = 1;
                if (bVar.sendOutcomeEventWithValue(str, f, this) == aVar) {
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
    public static final class c extends i implements Function1 {
        final /* synthetic */ String $name;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, com.gamericefishpro.space.th.a aVar) {
            super(1, aVar);
            this.$name = str;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return a.this.new c(this.$name, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((c) create(aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.og.b bVar = a.this._outcomeController;
                String str = this.$name;
                this.label = 1;
                if (bVar.sendUniqueOutcomeEvent(str, this) == aVar) {
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

    public a(com.gamericefishpro.space.og.b _outcomeController) {
        Intrinsics.checkNotNullParameter(_outcomeController, "_outcomeController");
        this._outcomeController = _outcomeController;
    }

    @Override // com.gamericefishpro.space.kg.a
    public void addOutcome(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.DEBUG, "sendOutcome(name: " + name + ')');
        com.gamericefishpro.space.ic.b.suspendifyOnThread$default(0, new C0034a(name, null), 1, null);
    }

    @Override // com.gamericefishpro.space.kg.a
    public void addOutcomeWithValue(String name, float f) {
        Intrinsics.checkNotNullParameter(name, "name");
        com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.DEBUG, "sendOutcomeWithValue(name: " + name + ", value: " + f + ')');
        com.gamericefishpro.space.ic.b.suspendifyOnThread$default(0, new b(name, f, null), 1, null);
    }

    @Override // com.gamericefishpro.space.kg.a
    public void addUniqueOutcome(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.DEBUG, "sendUniqueOutcome(name: " + name + ')');
        com.gamericefishpro.space.ic.b.suspendifyOnThread$default(0, new c(name, null), 1, null);
    }
}
