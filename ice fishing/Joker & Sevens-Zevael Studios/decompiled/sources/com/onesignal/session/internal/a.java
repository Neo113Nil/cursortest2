package com.onesignal.session.internal;

import ac.o;
import fc.d;
import hc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class a implements za.a {
    private final cb.b _outcomeController;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.session.internal.a$a, reason: collision with other inner class name */
    public static final class C0062a extends j implements oc.c {
        final /* synthetic */ String $name;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0062a(String str, d dVar) {
            super(1, dVar);
            this.$name = str;
        }

        @Override // hc.a
        public final d create(d dVar) {
            return a.this.new C0062a(this.$name, dVar);
        }

        @Override // oc.c
        public final Object invoke(d dVar) {
            return ((C0062a) create(dVar)).invokeSuspend(o.f277a);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                cb.b bVar = a.this._outcomeController;
                String str = this.$name;
                this.label = 1;
                Object sendOutcomeEvent = bVar.sendOutcomeEvent(str, this);
                gc.a aVar = gc.a.f2559g;
                if (sendOutcomeEvent == aVar) {
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
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends j implements oc.c {
        final /* synthetic */ String $name;
        final /* synthetic */ float $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, float f10, d dVar) {
            super(1, dVar);
            this.$name = str;
            this.$value = f10;
        }

        @Override // hc.a
        public final d create(d dVar) {
            return a.this.new b(this.$name, this.$value, dVar);
        }

        @Override // oc.c
        public final Object invoke(d dVar) {
            return ((b) create(dVar)).invokeSuspend(o.f277a);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                cb.b bVar = a.this._outcomeController;
                String str = this.$name;
                float f10 = this.$value;
                this.label = 1;
                Object sendOutcomeEventWithValue = bVar.sendOutcomeEventWithValue(str, f10, this);
                gc.a aVar = gc.a.f2559g;
                if (sendOutcomeEventWithValue == aVar) {
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
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class c extends j implements oc.c {
        final /* synthetic */ String $name;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, d dVar) {
            super(1, dVar);
            this.$name = str;
        }

        @Override // hc.a
        public final d create(d dVar) {
            return a.this.new c(this.$name, dVar);
        }

        @Override // oc.c
        public final Object invoke(d dVar) {
            return ((c) create(dVar)).invokeSuspend(o.f277a);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                cb.b bVar = a.this._outcomeController;
                String str = this.$name;
                this.label = 1;
                Object sendUniqueOutcomeEvent = bVar.sendUniqueOutcomeEvent(str, this);
                gc.a aVar = gc.a.f2559g;
                if (sendUniqueOutcomeEvent == aVar) {
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
    }

    public a(cb.b bVar) {
        pc.j.e(bVar, "_outcomeController");
        this._outcomeController = bVar;
    }

    @Override // za.a
    public void addOutcome(String str) {
        pc.j.e(str, "name");
        com.onesignal.debug.internal.logging.b.log(g9.c.DEBUG, "sendOutcome(name: " + str + ')');
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new C0062a(str, null), 1, null);
    }

    @Override // za.a
    public void addOutcomeWithValue(String str, float f10) {
        pc.j.e(str, "name");
        com.onesignal.debug.internal.logging.b.log(g9.c.DEBUG, "sendOutcomeWithValue(name: " + str + ", value: " + f10 + ')');
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new b(str, f10, null), 1, null);
    }

    @Override // za.a
    public void addUniqueOutcome(String str) {
        pc.j.e(str, "name");
        com.onesignal.debug.internal.logging.b.log(g9.c.DEBUG, "sendUniqueOutcome(name: " + str + ')');
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new c(str, null), 1, null);
    }
}
