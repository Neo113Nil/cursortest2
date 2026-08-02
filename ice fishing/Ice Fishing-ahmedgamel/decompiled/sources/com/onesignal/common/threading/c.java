package com.onesignal.common.threading;

import I7.p;
import S7.AbstractC0410y;
import S7.F;
import S7.InterfaceC0408w;
import S7.T;
import S7.Y;
import X7.o;
import q2.C4871c;
import u7.v;
import z7.C5246j;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public abstract class c {

    public static final class a extends B7.h implements I7.l {
        final /* synthetic */ I7.l $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(I7.l lVar, InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
            this.$block = lVar;
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return new a(this.$block, interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            try {
                if (i == 0) {
                    Q3.b.s(obj);
                    I7.l lVar = this.$block;
                    this.label = 1;
                    if (lVar.invoke(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q3.b.s(obj);
                }
            } catch (Exception e9) {
                com.onesignal.debug.internal.logging.b.error("Exception in launchOnDefault", e9);
            }
            return v.f41073a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((a) create(interfaceC5240d)).invokeSuspend(v.f41073a);
        }
    }

    public static final class b extends B7.h implements p {
        final /* synthetic */ I7.l $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(I7.l lVar, InterfaceC5240d interfaceC5240d) {
            super(2, interfaceC5240d);
            this.$block = lVar;
        }

        @Override // B7.a
        public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
            return new b(this.$block, interfaceC5240d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
            return ((b) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(v.f41073a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            try {
                if (i == 0) {
                    Q3.b.s(obj);
                    I7.l lVar = this.$block;
                    this.label = 1;
                    if (lVar.invoke(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q3.b.s(obj);
                }
            } catch (Exception e9) {
                com.onesignal.debug.internal.logging.b.error("Exception in launchOnDefault", e9);
            }
            return v.f41073a;
        }
    }

    /* renamed from: com.onesignal.common.threading.c$c, reason: collision with other inner class name */
    public static final class C0179c extends B7.h implements I7.l {
        final /* synthetic */ I7.l $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0179c(I7.l lVar, InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
            this.$block = lVar;
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return new C0179c(this.$block, interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            try {
                if (i == 0) {
                    Q3.b.s(obj);
                    I7.l lVar = this.$block;
                    this.label = 1;
                    if (lVar.invoke(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q3.b.s(obj);
                }
            } catch (Exception e9) {
                com.onesignal.debug.internal.logging.b.error("Exception in launchOnIO", e9);
            }
            return v.f41073a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((C0179c) create(interfaceC5240d)).invokeSuspend(v.f41073a);
        }
    }

    public static final class d extends B7.h implements p {
        final /* synthetic */ I7.l $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(I7.l lVar, InterfaceC5240d interfaceC5240d) {
            super(2, interfaceC5240d);
            this.$block = lVar;
        }

        @Override // B7.a
        public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
            return new d(this.$block, interfaceC5240d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
            return ((d) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(v.f41073a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            try {
                if (i == 0) {
                    Q3.b.s(obj);
                    I7.l lVar = this.$block;
                    this.label = 1;
                    if (lVar.invoke(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q3.b.s(obj);
                }
            } catch (Exception e9) {
                com.onesignal.debug.internal.logging.b.error("Exception in launchOnIO", e9);
            }
            return v.f41073a;
        }
    }

    public static final class e extends B7.h implements I7.l {
        final /* synthetic */ I7.a $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(I7.a aVar, InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
            this.$block = aVar;
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return new e(this.$block, interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q3.b.s(obj);
            this.$block.invoke();
            return v.f41073a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((e) create(interfaceC5240d)).invokeSuspend(v.f41073a);
        }
    }

    public static final class f extends B7.h implements I7.l {
        final /* synthetic */ I7.l $block;
        int label;

        public static final class a extends B7.h implements p {
            final /* synthetic */ I7.l $block;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(I7.l lVar, InterfaceC5240d interfaceC5240d) {
                super(2, interfaceC5240d);
                this.$block = lVar;
            }

            @Override // B7.a
            public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
                return new a(this.$block, interfaceC5240d);
            }

            @Override // I7.p
            public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
                return ((a) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(v.f41073a);
            }

            @Override // B7.a
            public final Object invokeSuspend(Object obj) {
                A7.a aVar = A7.a.f215n;
                int i = this.label;
                if (i == 0) {
                    Q3.b.s(obj);
                    I7.l lVar = this.$block;
                    this.label = 1;
                    if (lVar.invoke(this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(I7.l lVar, InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
            this.$block = lVar;
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return new f(this.$block, interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            try {
                if (i == 0) {
                    Q3.b.s(obj);
                    Z7.e eVar = F.f2998a;
                    T7.e eVar2 = o.f3811a;
                    a aVar2 = new a(this.$block, null);
                    this.label = 1;
                    if (AbstractC0410y.y(eVar2, aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q3.b.s(obj);
                }
            } catch (Exception e9) {
                com.onesignal.debug.internal.logging.b.error("Exception in suspendifyOnMain", e9);
            }
            return v.f41073a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((f) create(interfaceC5240d)).invokeSuspend(v.f41073a);
        }
    }

    public static final class g extends kotlin.jvm.internal.i implements I7.a {
        final /* synthetic */ I7.l $block;

        public static final class a extends B7.h implements p {
            final /* synthetic */ I7.l $block;
            int label;

            /* renamed from: com.onesignal.common.threading.c$g$a$a, reason: collision with other inner class name */
            public static final class C0180a extends B7.h implements p {
                final /* synthetic */ I7.l $block;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0180a(I7.l lVar, InterfaceC5240d interfaceC5240d) {
                    super(2, interfaceC5240d);
                    this.$block = lVar;
                }

                @Override // B7.a
                public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
                    return new C0180a(this.$block, interfaceC5240d);
                }

                @Override // I7.p
                public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
                    return ((C0180a) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(v.f41073a);
                }

                @Override // B7.a
                public final Object invokeSuspend(Object obj) {
                    A7.a aVar = A7.a.f215n;
                    int i = this.label;
                    if (i == 0) {
                        Q3.b.s(obj);
                        I7.l lVar = this.$block;
                        this.label = 1;
                        if (lVar.invoke(this) == aVar) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(I7.l lVar, InterfaceC5240d interfaceC5240d) {
                super(2, interfaceC5240d);
                this.$block = lVar;
            }

            @Override // B7.a
            public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
                return new a(this.$block, interfaceC5240d);
            }

            @Override // I7.p
            public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
                return ((a) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(v.f41073a);
            }

            @Override // B7.a
            public final Object invokeSuspend(Object obj) {
                A7.a aVar = A7.a.f215n;
                int i = this.label;
                if (i == 0) {
                    Q3.b.s(obj);
                    Z7.e eVar = F.f2998a;
                    T7.e eVar2 = o.f3811a;
                    C0180a c0180a = new C0180a(this.$block, null);
                    this.label = 1;
                    if (AbstractC0410y.y(eVar2, c0180a, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(I7.l lVar) {
            super(0);
            this.$block = lVar;
        }

        @Override // I7.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m15invoke();
            return v.f41073a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m15invoke() {
            try {
                AbstractC0410y.s(C5246j.f42241n, new a(this.$block, null));
            } catch (Exception e9) {
                com.onesignal.debug.internal.logging.b.error("Exception on thread with switch to main", e9);
            }
        }
    }

    public static final class h extends B7.h implements I7.l {
        final /* synthetic */ I7.l $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(I7.l lVar, InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
            this.$block = lVar;
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return new h(this.$block, interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            try {
                if (i == 0) {
                    Q3.b.s(obj);
                    I7.l lVar = this.$block;
                    this.label = 1;
                    if (lVar.invoke(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q3.b.s(obj);
                }
            } catch (Exception e9) {
                com.onesignal.debug.internal.logging.b.error("Exception in suspendifyOnSerialIO", e9);
            }
            return v.f41073a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((h) create(interfaceC5240d)).invokeSuspend(v.f41073a);
        }
    }

    public static final class i extends B7.h implements I7.l {
        final /* synthetic */ I7.l $block;
        final /* synthetic */ I7.a $onComplete;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(I7.l lVar, I7.a aVar, InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
            this.$block = lVar;
            this.$onComplete = aVar;
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return new i(this.$block, this.$onComplete, interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            try {
                if (i == 0) {
                    Q3.b.s(obj);
                    I7.l lVar = this.$block;
                    this.label = 1;
                    if (lVar.invoke(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q3.b.s(obj);
                }
                I7.a aVar2 = this.$onComplete;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
            } catch (Exception e9) {
                com.onesignal.debug.internal.logging.b.error("Exception in suspendifyWithCompletion", e9);
            }
            return v.f41073a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((i) create(interfaceC5240d)).invokeSuspend(v.f41073a);
        }
    }

    public static final class j extends B7.h implements I7.l {
        final /* synthetic */ I7.l $block;
        final /* synthetic */ I7.a $onComplete;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(I7.l lVar, I7.a aVar, InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
            this.$block = lVar;
            this.$onComplete = aVar;
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return new j(this.$block, this.$onComplete, interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            try {
                if (i == 0) {
                    Q3.b.s(obj);
                    I7.l lVar = this.$block;
                    this.label = 1;
                    if (lVar.invoke(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q3.b.s(obj);
                }
                I7.a aVar2 = this.$onComplete;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
            } catch (Exception e9) {
                com.onesignal.debug.internal.logging.b.error("Exception in suspendifyWithCompletion", e9);
            }
            return v.f41073a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((j) create(interfaceC5240d)).invokeSuspend(v.f41073a);
        }
    }

    public static final class k extends B7.h implements p {
        final /* synthetic */ I7.l $block;
        final /* synthetic */ I7.a $onComplete;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(I7.l lVar, I7.a aVar, InterfaceC5240d interfaceC5240d) {
            super(2, interfaceC5240d);
            this.$block = lVar;
            this.$onComplete = aVar;
        }

        @Override // B7.a
        public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
            return new k(this.$block, this.$onComplete, interfaceC5240d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
            return ((k) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(v.f41073a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            try {
                if (i == 0) {
                    Q3.b.s(obj);
                    I7.l lVar = this.$block;
                    this.label = 1;
                    if (lVar.invoke(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q3.b.s(obj);
                }
                I7.a aVar2 = this.$onComplete;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
            } catch (Exception e9) {
                com.onesignal.debug.internal.logging.b.error("Exception in suspendifyWithCompletion", e9);
            }
            return v.f41073a;
        }
    }

    public static final class l extends B7.h implements I7.l {
        final /* synthetic */ I7.l $block;
        final /* synthetic */ I7.a $onComplete;
        final /* synthetic */ I7.l $onError;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(I7.l lVar, I7.a aVar, I7.l lVar2, InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
            this.$block = lVar;
            this.$onComplete = aVar;
            this.$onError = lVar2;
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return new l(this.$block, this.$onComplete, this.$onError, interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            try {
                if (i == 0) {
                    Q3.b.s(obj);
                    I7.l lVar = this.$block;
                    this.label = 1;
                    if (lVar.invoke(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q3.b.s(obj);
                }
                I7.a aVar2 = this.$onComplete;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
            } catch (Exception e9) {
                com.onesignal.debug.internal.logging.b.error("Exception in suspendifyWithErrorHandling", e9);
                I7.l lVar2 = this.$onError;
                if (lVar2 != null) {
                    lVar2.invoke(e9);
                }
            }
            return v.f41073a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((l) create(interfaceC5240d)).invokeSuspend(v.f41073a);
        }
    }

    public static final class m extends B7.h implements I7.l {
        final /* synthetic */ I7.l $block;
        final /* synthetic */ I7.a $onComplete;
        final /* synthetic */ I7.l $onError;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(I7.l lVar, I7.a aVar, I7.l lVar2, InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
            this.$block = lVar;
            this.$onComplete = aVar;
            this.$onError = lVar2;
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return new m(this.$block, this.$onComplete, this.$onError, interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            try {
                if (i == 0) {
                    Q3.b.s(obj);
                    I7.l lVar = this.$block;
                    this.label = 1;
                    if (lVar.invoke(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q3.b.s(obj);
                }
                I7.a aVar2 = this.$onComplete;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
            } catch (Exception e9) {
                com.onesignal.debug.internal.logging.b.error("Exception in suspendifyWithErrorHandling", e9);
                I7.l lVar2 = this.$onError;
                if (lVar2 != null) {
                    lVar2.invoke(e9);
                }
            }
            return v.f41073a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((m) create(interfaceC5240d)).invokeSuspend(v.f41073a);
        }
    }

    public static final class n extends B7.h implements p {
        final /* synthetic */ I7.l $block;
        final /* synthetic */ I7.a $onComplete;
        final /* synthetic */ I7.l $onError;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(I7.l lVar, I7.a aVar, I7.l lVar2, InterfaceC5240d interfaceC5240d) {
            super(2, interfaceC5240d);
            this.$block = lVar;
            this.$onComplete = aVar;
            this.$onError = lVar2;
        }

        @Override // B7.a
        public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
            return new n(this.$block, this.$onComplete, this.$onError, interfaceC5240d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
            return ((n) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(v.f41073a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            try {
                if (i == 0) {
                    Q3.b.s(obj);
                    I7.l lVar = this.$block;
                    this.label = 1;
                    if (lVar.invoke(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q3.b.s(obj);
                }
                I7.a aVar2 = this.$onComplete;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
            } catch (Exception e9) {
                com.onesignal.debug.internal.logging.b.error("Exception in suspendifyWithErrorHandling", e9);
                I7.l lVar2 = this.$onError;
                if (lVar2 != null) {
                    lVar2.invoke(e9);
                }
            }
            return v.f41073a;
        }
    }

    public static final Y launchOnDefault(I7.l block) {
        kotlin.jvm.internal.h.e(block, "block");
        return com.onesignal.common.threading.d.INSTANCE.getUseBackgroundThreading() ? com.onesignal.common.threading.b.INSTANCE.launchOnDefault(new a(block, null)) : AbstractC0410y.o(T.f3019n, F.f2998a, new b(block, null), 2);
    }

    public static final Y launchOnIO(I7.l block) {
        kotlin.jvm.internal.h.e(block, "block");
        return com.onesignal.common.threading.d.INSTANCE.getUseBackgroundThreading() ? com.onesignal.common.threading.b.INSTANCE.launchOnIO(new C0179c(block, null)) : AbstractC0410y.o(T.f3019n, F.f3000c, new d(block, null), 2);
    }

    public static final void runOnSerialIOIfBackgroundThreading(I7.a block) {
        kotlin.jvm.internal.h.e(block, "block");
        if (com.onesignal.common.threading.d.INSTANCE.getUseBackgroundThreading()) {
            suspendifyOnSerialIO(new e(block, null));
        } else {
            block.invoke();
        }
    }

    public static final void suspendifyOnDefault(I7.l block) {
        kotlin.jvm.internal.h.e(block, "block");
        suspendifyWithCompletion(false, block, null);
    }

    public static final void suspendifyOnIO(I7.l block, I7.a aVar) {
        kotlin.jvm.internal.h.e(block, "block");
        suspendifyWithCompletion(true, block, aVar);
    }

    public static /* synthetic */ void suspendifyOnIO$default(I7.l lVar, I7.a aVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            aVar = null;
        }
        suspendifyOnIO(lVar, aVar);
    }

    public static final void suspendifyOnMain(I7.l block) {
        kotlin.jvm.internal.h.e(block, "block");
        if (com.onesignal.common.threading.d.INSTANCE.getUseBackgroundThreading()) {
            com.onesignal.common.threading.b.INSTANCE.launchOnIO(new f(block, null));
        } else {
            new C4871c(1, new g(block)).start();
        }
    }

    public static final void suspendifyOnSerialIO(I7.l block) {
        kotlin.jvm.internal.h.e(block, "block");
        com.onesignal.common.threading.b.INSTANCE.launchOnSerialIO(new h(block, null));
    }

    public static final void suspendifyWithCompletion(boolean z6, I7.l block, I7.a aVar) {
        kotlin.jvm.internal.h.e(block, "block");
        if (!com.onesignal.common.threading.d.INSTANCE.getUseBackgroundThreading()) {
            AbstractC0410y.o(T.f3019n, z6 ? F.f3000c : F.f2998a, new k(block, aVar, null), 2);
        } else if (z6) {
            com.onesignal.common.threading.b.INSTANCE.launchOnIO(new i(block, aVar, null));
        } else {
            com.onesignal.common.threading.b.INSTANCE.launchOnDefault(new j(block, aVar, null));
        }
    }

    public static /* synthetic */ void suspendifyWithCompletion$default(boolean z6, I7.l lVar, I7.a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z6 = true;
        }
        if ((i4 & 4) != 0) {
            aVar = null;
        }
        suspendifyWithCompletion(z6, lVar, aVar);
    }

    public static final void suspendifyWithErrorHandling(boolean z6, I7.l block, I7.l lVar, I7.a aVar) {
        kotlin.jvm.internal.h.e(block, "block");
        if (!com.onesignal.common.threading.d.INSTANCE.getUseBackgroundThreading()) {
            AbstractC0410y.o(T.f3019n, z6 ? F.f3000c : F.f2998a, new n(block, aVar, lVar, null), 2);
        } else if (z6) {
            com.onesignal.common.threading.b.INSTANCE.launchOnIO(new l(block, aVar, lVar, null));
        } else {
            com.onesignal.common.threading.b.INSTANCE.launchOnDefault(new m(block, aVar, lVar, null));
        }
    }

    public static /* synthetic */ void suspendifyWithErrorHandling$default(boolean z6, I7.l lVar, I7.l lVar2, I7.a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z6 = true;
        }
        if ((i4 & 4) != 0) {
            lVar2 = null;
        }
        if ((i4 & 8) != 0) {
            aVar = null;
        }
        suspendifyWithErrorHandling(z6, lVar, lVar2, aVar);
    }

    public static final void suspendifyOnIO(I7.l block) {
        kotlin.jvm.internal.h.e(block, "block");
        suspendifyWithCompletion(true, block, null);
    }
}
