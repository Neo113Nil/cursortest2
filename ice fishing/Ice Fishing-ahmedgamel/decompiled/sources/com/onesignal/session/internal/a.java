package com.onesignal.session.internal;

import B7.h;
import I7.l;
import u7.v;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public class a implements J5.a {
    private final M5.b _outcomeController;

    /* renamed from: com.onesignal.session.internal.a$a, reason: collision with other inner class name */
    public static final class C0243a extends h implements l {
        final /* synthetic */ String $name;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0243a(String str, InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
            this.$name = str;
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return a.this.new C0243a(this.$name, interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i == 0) {
                Q3.b.s(obj);
                M5.b bVar = a.this._outcomeController;
                String str = this.$name;
                this.label = 1;
                if (bVar.sendOutcomeEvent(str, this) == aVar) {
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

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((C0243a) create(interfaceC5240d)).invokeSuspend(v.f41073a);
        }
    }

    public static final class b extends h implements l {
        final /* synthetic */ String $name;
        final /* synthetic */ float $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, float f2, InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
            this.$name = str;
            this.$value = f2;
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return a.this.new b(this.$name, this.$value, interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i == 0) {
                Q3.b.s(obj);
                M5.b bVar = a.this._outcomeController;
                String str = this.$name;
                float f2 = this.$value;
                this.label = 1;
                if (bVar.sendOutcomeEventWithValue(str, f2, this) == aVar) {
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

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((b) create(interfaceC5240d)).invokeSuspend(v.f41073a);
        }
    }

    public static final class c extends h implements l {
        final /* synthetic */ String $name;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
            this.$name = str;
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return a.this.new c(this.$name, interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i == 0) {
                Q3.b.s(obj);
                M5.b bVar = a.this._outcomeController;
                String str = this.$name;
                this.label = 1;
                if (bVar.sendUniqueOutcomeEvent(str, this) == aVar) {
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

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((c) create(interfaceC5240d)).invokeSuspend(v.f41073a);
        }
    }

    public a(M5.b _outcomeController) {
        kotlin.jvm.internal.h.e(_outcomeController, "_outcomeController");
        this._outcomeController = _outcomeController;
    }

    @Override // J5.a
    public void addOutcome(String name) {
        kotlin.jvm.internal.h.e(name, "name");
        com.onesignal.debug.internal.logging.b.log(M4.c.DEBUG, "sendOutcome(name: " + name + ')');
        com.onesignal.common.threading.c.suspendifyOnIO(new C0243a(name, null));
    }

    @Override // J5.a
    public void addOutcomeWithValue(String name, float f2) {
        kotlin.jvm.internal.h.e(name, "name");
        com.onesignal.debug.internal.logging.b.log(M4.c.DEBUG, "sendOutcomeWithValue(name: " + name + ", value: " + f2 + ')');
        com.onesignal.common.threading.c.suspendifyOnIO(new b(name, f2, null));
    }

    @Override // J5.a
    public void addUniqueOutcome(String name) {
        kotlin.jvm.internal.h.e(name, "name");
        com.onesignal.debug.internal.logging.b.log(M4.c.DEBUG, "sendUniqueOutcome(name: " + name + ')');
        com.onesignal.common.threading.c.suspendifyOnIO(new c(name, null));
    }
}
