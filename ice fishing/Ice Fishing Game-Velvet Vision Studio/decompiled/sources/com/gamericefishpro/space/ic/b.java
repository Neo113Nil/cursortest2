package com.gamericefishpro.space.ic;

import com.gamericefishpro.space.ei.l;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.k0;
import com.gamericefishpro.space.pi.x;
import com.gamericefishpro.space.ui.m;
import com.gamericefishpro.space.vh.i;
import com.gamericefishpro.space.wi.e;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a extends i implements Function2 {
        final /* synthetic */ Function1<com.gamericefishpro.space.th.a, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super com.gamericefishpro.space.th.a, ? extends Object> function1, com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
            this.$block = function1;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return new a(this.$block, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((a) create(xVar, aVar)).invokeSuspend(Unit.a);
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

    /* JADX INFO: renamed from: com.gamericefishpro.space.ic.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0022b extends l implements Function0 {
        final /* synthetic */ Function1<com.gamericefishpro.space.th.a, Object> $block;

        /* JADX INFO: renamed from: com.gamericefishpro.space.ic.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
        public static final class a extends i implements Function2 {
            final /* synthetic */ Function1<com.gamericefishpro.space.th.a, Object> $block;
            int label;

            /* JADX INFO: renamed from: com.gamericefishpro.space.ic.b$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
            public static final class C0023a extends i implements Function2 {
                final /* synthetic */ Function1<com.gamericefishpro.space.th.a, Object> $block;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0023a(Function1<? super com.gamericefishpro.space.th.a, ? extends Object> function1, com.gamericefishpro.space.th.a aVar) {
                    super(2, aVar);
                    this.$block = function1;
                }

                @Override // com.gamericefishpro.space.vh.a
                public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
                    return new C0023a(this.$block, aVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
                    return ((C0023a) create(xVar, aVar)).invokeSuspend(Unit.a);
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super com.gamericefishpro.space.th.a, ? extends Object> function1, com.gamericefishpro.space.th.a aVar) {
                super(2, aVar);
                this.$block = function1;
            }

            @Override // com.gamericefishpro.space.vh.a
            public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
                return new a(this.$block, aVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
                return ((a) create(xVar, aVar)).invokeSuspend(Unit.a);
            }

            @Override // com.gamericefishpro.space.vh.a
            public final Object invokeSuspend(Object obj) {
                com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
                int i = this.label;
                if (i == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    e eVar = k0.a;
                    com.gamericefishpro.space.qi.d dVar = m.a;
                    C0023a c0023a = new C0023a(this.$block, null);
                    this.label = 1;
                    if (a0.D(dVar, c0023a, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0022b(Function1<? super com.gamericefishpro.space.th.a, ? extends Object> function1) {
            super(0);
            this.$block = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
            m11invoke();
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m11invoke() throws Throwable {
            try {
                a0.y(g.d, new a(this.$block, null));
            } catch (Exception e) {
                com.gamericefishpro.space.od.b.error("Exception on thread with switch to main", e);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class c extends l implements Function0 {
        final /* synthetic */ Function1<com.gamericefishpro.space.th.a, Object> $block;
        final /* synthetic */ Function0<Unit> $onComplete;

        /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
        public static final class a extends i implements Function2 {
            final /* synthetic */ Function1<com.gamericefishpro.space.th.a, Object> $block;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super com.gamericefishpro.space.th.a, ? extends Object> function1, com.gamericefishpro.space.th.a aVar) {
                super(2, aVar);
                this.$block = function1;
            }

            @Override // com.gamericefishpro.space.vh.a
            public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
                return new a(this.$block, aVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
                return ((a) create(xVar, aVar)).invokeSuspend(Unit.a);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function0<Unit> function0, Function1<? super com.gamericefishpro.space.th.a, ? extends Object> function1) {
            super(0);
            this.$onComplete = function0;
            this.$block = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
            m12invoke();
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m12invoke() throws Throwable {
            try {
                a0.y(g.d, new a(this.$block, null));
                Function0<Unit> function0 = this.$onComplete;
                if (function0 != null) {
                    function0.invoke();
                }
            } catch (Exception e) {
                com.gamericefishpro.space.od.b.error("Exception on thread", e);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class d extends l implements Function0 {
        final /* synthetic */ Function1<com.gamericefishpro.space.th.a, Object> $block;
        final /* synthetic */ String $name;

        /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
        public static final class a extends i implements Function2 {
            final /* synthetic */ Function1<com.gamericefishpro.space.th.a, Object> $block;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super com.gamericefishpro.space.th.a, ? extends Object> function1, com.gamericefishpro.space.th.a aVar) {
                super(2, aVar);
                this.$block = function1;
            }

            @Override // com.gamericefishpro.space.vh.a
            public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
                return new a(this.$block, aVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
                return ((a) create(xVar, aVar)).invokeSuspend(Unit.a);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(String str, Function1<? super com.gamericefishpro.space.th.a, ? extends Object> function1) {
            super(0);
            this.$name = str;
            this.$block = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
            m13invoke();
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m13invoke() throws Throwable {
            try {
                a0.y(g.d, new a(this.$block, null));
            } catch (Exception e) {
                com.gamericefishpro.space.od.b.error("Exception on thread '" + this.$name + '\'', e);
            }
        }
    }

    public static final void suspendifyBlocking(Function1<? super com.gamericefishpro.space.th.a, ? extends Object> block) throws Throwable {
        Intrinsics.checkNotNullParameter(block, "block");
        a0.y(g.d, new a(block, null));
    }

    public static final void suspendifyOnMain(Function1<? super com.gamericefishpro.space.th.a, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        com.gamericefishpro.space.a.a.F(null, 0, new C0022b(block), 31);
    }

    public static final void suspendifyOnThread(int i, Function1<? super com.gamericefishpro.space.th.a, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        suspendifyOnThread(i, block, (Function0<Unit>) null);
    }

    public static /* synthetic */ void suspendifyOnThread$default(int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        suspendifyOnThread(i, function1);
    }

    public static final void suspendifyOnThread(int i, Function1<? super com.gamericefishpro.space.th.a, ? extends Object> block, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(block, "block");
        com.gamericefishpro.space.a.a.F(null, i, new c(function0, block), 15);
    }

    public static /* synthetic */ void suspendifyOnThread$default(int i, Function1 function1, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        if ((i2 & 4) != 0) {
            function0 = null;
        }
        suspendifyOnThread(i, (Function1<? super com.gamericefishpro.space.th.a, ? extends Object>) function1, (Function0<Unit>) function0);
    }

    public static final void suspendifyOnThread(String name, int i, Function1<? super com.gamericefishpro.space.th.a, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        com.gamericefishpro.space.a.a.F(name, i, new d(name, block), 7);
    }

    public static /* synthetic */ void suspendifyOnThread$default(String str, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        suspendifyOnThread(str, i, (Function1<? super com.gamericefishpro.space.th.a, ? extends Object>) function1);
    }
}
