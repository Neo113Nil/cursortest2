package com.onesignal.session.internal;

import B7.h;
import I7.l;
import com.bumptech.glide.d;
import u7.v;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public class a implements J5.a {
    private final M5.b _outcomeController;

    /* renamed from: com.onesignal.session.internal.a$a, reason: collision with other inner class name */
    public static final class C0243a extends h implements l {
        final /* synthetic */ String $name;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0243a(String str, InterfaceC5267d interfaceC5267d) {
            super(1, interfaceC5267d);
            this.$name = str;
        }

        @Override // B7.a
        public final InterfaceC5267d create(InterfaceC5267d interfaceC5267d) {
            return a.this.new C0243a(this.$name, interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i == 0) {
                d.k(obj);
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
                d.k(obj);
            }
            return v.f41353a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5267d interfaceC5267d) {
            return ((C0243a) create(interfaceC5267d)).invokeSuspend(v.f41353a);
        }
    }

    public static final class b extends h implements l {
        final /* synthetic */ String $name;
        final /* synthetic */ float $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, float f3, InterfaceC5267d interfaceC5267d) {
            super(1, interfaceC5267d);
            this.$name = str;
            this.$value = f3;
        }

        @Override // B7.a
        public final InterfaceC5267d create(InterfaceC5267d interfaceC5267d) {
            return a.this.new b(this.$name, this.$value, interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i == 0) {
                d.k(obj);
                M5.b bVar = a.this._outcomeController;
                String str = this.$name;
                float f3 = this.$value;
                this.label = 1;
                if (bVar.sendOutcomeEventWithValue(str, f3, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.k(obj);
            }
            return v.f41353a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5267d interfaceC5267d) {
            return ((b) create(interfaceC5267d)).invokeSuspend(v.f41353a);
        }
    }

    public static final class c extends h implements l {
        final /* synthetic */ String $name;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, InterfaceC5267d interfaceC5267d) {
            super(1, interfaceC5267d);
            this.$name = str;
        }

        @Override // B7.a
        public final InterfaceC5267d create(InterfaceC5267d interfaceC5267d) {
            return a.this.new c(this.$name, interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i == 0) {
                d.k(obj);
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
                d.k(obj);
            }
            return v.f41353a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5267d interfaceC5267d) {
            return ((c) create(interfaceC5267d)).invokeSuspend(v.f41353a);
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
    public void addOutcomeWithValue(String name, float f3) {
        kotlin.jvm.internal.h.e(name, "name");
        com.onesignal.debug.internal.logging.b.log(M4.c.DEBUG, "sendOutcomeWithValue(name: " + name + ", value: " + f3 + ')');
        com.onesignal.common.threading.c.suspendifyOnIO(new b(name, f3, null));
    }

    @Override // J5.a
    public void addUniqueOutcome(String name) {
        kotlin.jvm.internal.h.e(name, "name");
        com.onesignal.debug.internal.logging.b.log(M4.c.DEBUG, "sendUniqueOutcome(name: " + name + ')');
        com.onesignal.common.threading.c.suspendifyOnIO(new c(name, null));
    }
}
