package com.onesignal.common.threading;

import ac.o;
import hc.j;
import oc.e;
import pc.k;
import yc.a0;
import yc.i0;
import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class b {

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends j implements e {
        final /* synthetic */ oc.c $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(oc.c cVar, fc.d dVar) {
            super(2, dVar);
            this.$block = cVar;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return new a(this.$block, dVar);
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
            return ((a) create(yVar, dVar)).invokeSuspend(o.f277a);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.common.threading.b$b, reason: collision with other inner class name */
    public static final class C0005b extends k implements oc.a {
        final /* synthetic */ oc.c $block;

        /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
        /* renamed from: com.onesignal.common.threading.b$b$a */
        public static final class a extends j implements e {
            final /* synthetic */ oc.c $block;
            int label;

            /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
            /* renamed from: com.onesignal.common.threading.b$b$a$a, reason: collision with other inner class name */
            public static final class C0006a extends j implements e {
                final /* synthetic */ oc.c $block;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0006a(oc.c cVar, fc.d dVar) {
                    super(2, dVar);
                    this.$block = cVar;
                }

                @Override // hc.a
                public final fc.d create(Object obj, fc.d dVar) {
                    return new C0006a(this.$block, dVar);
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
                    return ((C0006a) create(yVar, dVar)).invokeSuspend(o.f277a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(oc.c cVar, fc.d dVar) {
                super(2, dVar);
                this.$block = cVar;
            }

            @Override // hc.a
            public final fc.d create(Object obj, fc.d dVar) {
                return new a(this.$block, dVar);
            }

            @Override // hc.a
            public final Object invokeSuspend(Object obj) {
                int i10 = this.label;
                if (i10 == 0) {
                    v6.a.W(obj);
                    fd.e eVar = i0.f8859a;
                    zc.d dVar = dd.o.f1880a;
                    C0006a c0006a = new C0006a(this.$block, null);
                    this.label = 1;
                    Object A = a0.A(dVar, c0006a, this);
                    gc.a aVar = gc.a.f2559g;
                    if (A == aVar) {
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
                return ((a) create(yVar, dVar)).invokeSuspend(o.f277a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0005b(oc.c cVar) {
            super(0);
            this.$block = cVar;
        }

        @Override // oc.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3invoke();
            return o.f277a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3invoke() {
            try {
                a0.u(fc.j.f2348g, new a(this.$block, null));
            } catch (Exception e10) {
                com.onesignal.debug.internal.logging.b.error("Exception on thread with switch to main", e10);
            }
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class c extends k implements oc.a {
        final /* synthetic */ oc.c $block;

        /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
        public static final class a extends j implements e {
            final /* synthetic */ oc.c $block;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(oc.c cVar, fc.d dVar) {
                super(2, dVar);
                this.$block = cVar;
            }

            @Override // hc.a
            public final fc.d create(Object obj, fc.d dVar) {
                return new a(this.$block, dVar);
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
                return ((a) create(yVar, dVar)).invokeSuspend(o.f277a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(oc.c cVar) {
            super(0);
            this.$block = cVar;
        }

        @Override // oc.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m4invoke();
            return o.f277a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m4invoke() {
            try {
                a0.u(fc.j.f2348g, new a(this.$block, null));
            } catch (Exception e10) {
                com.onesignal.debug.internal.logging.b.error("Exception on thread", e10);
            }
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class d extends k implements oc.a {
        final /* synthetic */ oc.c $block;
        final /* synthetic */ String $name;

        /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
        public static final class a extends j implements e {
            final /* synthetic */ oc.c $block;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(oc.c cVar, fc.d dVar) {
                super(2, dVar);
                this.$block = cVar;
            }

            @Override // hc.a
            public final fc.d create(Object obj, fc.d dVar) {
                return new a(this.$block, dVar);
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
                return ((a) create(yVar, dVar)).invokeSuspend(o.f277a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, oc.c cVar) {
            super(0);
            this.$name = str;
            this.$block = cVar;
        }

        @Override // oc.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m5invoke();
            return o.f277a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5invoke() {
            try {
                a0.u(fc.j.f2348g, new a(this.$block, null));
            } catch (Exception e10) {
                com.onesignal.debug.internal.logging.b.error("Exception on thread '" + this.$name + '\'', e10);
            }
        }
    }

    public static final void suspendifyBlocking(oc.c cVar) {
        pc.j.e(cVar, "block");
        a0.u(fc.j.f2348g, new a(cVar, null));
    }

    public static final void suspendifyOnMain(oc.c cVar) {
        pc.j.e(cVar, "block");
        a.a.L(null, 0, new C0005b(cVar), 31);
    }

    public static final void suspendifyOnThread(int i10, oc.c cVar) {
        pc.j.e(cVar, "block");
        a.a.L(null, i10, new c(cVar), 15);
    }

    public static /* synthetic */ void suspendifyOnThread$default(int i10, oc.c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -1;
        }
        suspendifyOnThread(i10, cVar);
    }

    public static final void suspendifyOnThread(String str, int i10, oc.c cVar) {
        pc.j.e(str, "name");
        pc.j.e(cVar, "block");
        a.a.L(str, i10, new d(str, cVar), 7);
    }

    public static /* synthetic */ void suspendifyOnThread$default(String str, int i10, oc.c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = -1;
        }
        suspendifyOnThread(str, i10, cVar);
    }
}
