package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class dx9 extends x6 {
    public final uif c;
    public final zx0 d;
    public final /* synthetic */ gx9 e;

    /* JADX WARN: Multi-variable type inference failed */
    public dx9(gx9 gx9Var, jc8 jc8Var, xzb xzbVar, Function1 function1) {
        this.e = gx9Var;
        this.c = (uif) function1;
        zx0 zx0Var = new zx0();
        k79 k79Var = new k79(jc8Var, xzbVar);
        zx0Var.addLast(vq1.a0(jc8Var) ? new cx9(k79Var, gx9Var.c, gx9Var.d) : new ex9(k79Var));
        this.d = zx0Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // defpackage.x6
    public final void a() {
        Unit unit;
        k79 b = b();
        if (b == null) {
            this.a = 2;
            return;
        }
        Object invoke = this.c.invoke(b);
        if (invoke != null) {
            this.b = invoke;
            this.a = 1;
            unit = Unit.a;
        } else {
            unit = null;
        }
        if (unit == null) {
            a();
        }
    }

    public final k79 b() {
        Object ex9Var;
        zx0 zx0Var = this.d;
        fx9 fx9Var = (fx9) zx0Var.r();
        if (fx9Var == null) {
            return null;
        }
        k79 q = fx9Var.q();
        if (q == null) {
            zx0Var.removeLast();
            return b();
        }
        jc8 jc8Var = q.a;
        if (q == fx9Var.getItem() || !vq1.a0(jc8Var) || zx0Var.c >= Integer.MAX_VALUE) {
            return q;
        }
        if (vq1.a0(jc8Var)) {
            gx9 gx9Var = this.e;
            ex9Var = new cx9(q, gx9Var.c, gx9Var.d);
        } else {
            ex9Var = new ex9(q);
        }
        zx0Var.addLast(ex9Var);
        return b();
    }
}
