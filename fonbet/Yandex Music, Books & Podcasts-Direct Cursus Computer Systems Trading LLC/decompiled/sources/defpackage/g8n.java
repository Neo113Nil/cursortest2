package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g8n extends qp7 implements ayd {
    public final b8n d;
    public final q43 e;
    public final Function1 f;
    public final jyr g;
    public final x6k h;
    public final x0q i;
    public final String j;
    public final xdr k;
    public final x0q l;

    public g8n(b8n b8nVar, q43 q43Var, Function1 function1) {
        b8nVar.getClass();
        function1.getClass();
        this.d = b8nVar;
        this.e = q43Var;
        this.f = function1;
        this.g = btf.b(new p1n(5));
        this.h = szf.g0(null);
        x0q b = y0q.b(0, 0, null, 7);
        this.i = b;
        this.j = "QUESTS";
        this.k = ydr.a(Boolean.TRUE);
        this.l = b;
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.d;
    }

    @Override // defpackage.ayd
    public final void b(boolean z) {
        v3w.n(z, this.k, null);
    }

    @Override // defpackage.qp7
    public final boolean m() {
        return this.h.getValue() != null;
    }

    @Override // defpackage.qp7
    public final String n() {
        return this.j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
    
        if (r11 != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
    
        if (r11 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.qp7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(boolean z, cg6 cg6Var) {
        e8n e8nVar;
        nm6 nm6Var;
        int i;
        Unit unit;
        boolean z2;
        boolean z3;
        Object a;
        if (cg6Var instanceof e8n) {
            e8nVar = (e8n) cg6Var;
            int i2 = e8nVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e8nVar.n = i2 - Integer.MIN_VALUE;
                Object obj = e8nVar.l;
                nm6Var = nm6.a;
                i = e8nVar.n;
                b8n b8nVar = this.d;
                x6k x6kVar = this.h;
                if (i != 0) {
                    qgg.h0(obj);
                    e8nVar.j = z;
                    e8nVar.n = 1;
                    obj = this.f.invoke(e8nVar);
                } else if (i == 1) {
                    z = e8nVar.j;
                    qgg.h0(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z3 = e8nVar.k;
                        qgg.h0(obj);
                        b(!z3);
                        if (!Intrinsics.d(x6kVar.getValue(), Boolean.TRUE)) {
                            return new b73(b8nVar);
                        }
                        q43 q43Var = this.e;
                        q43Var.b(q43Var.a, 1, null, null);
                        return new d73(b8nVar);
                    }
                    z3 = e8nVar.k;
                    z2 = e8nVar.j;
                    qgg.h0(obj);
                    e8nVar.j = z2;
                    e8nVar.k = z3;
                    e8nVar.n = 3;
                    a = ((lnq) this.g.getValue()).a.a(b8nVar, !z3, e8nVar);
                    if (a != nm6Var) {
                        a = Unit.a;
                    }
                }
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                x6kVar.setValue(bool);
                unit = Unit.a;
                e8nVar.j = z;
                e8nVar.k = booleanValue;
                e8nVar.n = 2;
                if (this.i.emit(unit, e8nVar) != nm6Var) {
                    z2 = z;
                    z3 = booleanValue;
                    e8nVar.j = z2;
                    e8nVar.k = z3;
                    e8nVar.n = 3;
                    a = ((lnq) this.g.getValue()).a.a(b8nVar, !z3, e8nVar);
                    if (a != nm6Var) {
                    }
                }
                return nm6Var;
            }
        }
        e8nVar = new e8n(this, cg6Var);
        Object obj2 = e8nVar.l;
        nm6Var = nm6.a;
        i = e8nVar.n;
        b8n b8nVar2 = this.d;
        x6k x6kVar2 = this.h;
        if (i != 0) {
        }
        Boolean bool2 = (Boolean) obj2;
        boolean booleanValue2 = bool2.booleanValue();
        x6kVar2.setValue(bool2);
        unit = Unit.a;
        e8nVar.j = z;
        e8nVar.k = booleanValue2;
        e8nVar.n = 2;
        if (this.i.emit(unit, e8nVar) != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(a8n a8nVar, Continuation continuation) {
        f8n f8nVar;
        int i;
        if (continuation instanceof f8n) {
            f8nVar = (f8n) continuation;
            int i2 = f8nVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f8nVar.l = i2 - Integer.MIN_VALUE;
                Object obj = f8nVar.j;
                nm6 nm6Var = nm6.a;
                i = f8nVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    if (Intrinsics.d(a8nVar, w7n.a) || Intrinsics.d(a8nVar, y7n.a)) {
                        if (Intrinsics.d(this.h.getValue(), Boolean.TRUE)) {
                            b(false);
                        }
                    } else if (Intrinsics.d(a8nVar, x7n.a)) {
                        f8nVar.l = 1;
                        lnq lnqVar = (lnq) this.g.getValue();
                        Object a = lnqVar.a.a(this.d, true, f8nVar);
                        if (a != nm6Var) {
                            a = Unit.a;
                        }
                        if (a == nm6Var) {
                            return nm6Var;
                        }
                    } else if (!Intrinsics.d(a8nVar, z7n.a)) {
                        b6e.s();
                        return null;
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                b(true);
                return Unit.a;
            }
        }
        f8nVar = new f8n(this, continuation);
        Object obj2 = f8nVar.j;
        nm6 nm6Var2 = nm6.a;
        i = f8nVar.l;
        if (i != 0) {
        }
        b(true);
        return Unit.a;
    }
}
