package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import yads.t31;

/* loaded from: classes7.dex */
public abstract class x281 {
    public final qd81 a;
    public final t31 b;
    public final long c;
    public final List w;
    public final of81 x;

    public x281(qd81 qd81Var, t31 t31Var, ea81 ea81Var, ArrayList arrayList) {
        if (t31Var.isEmpty()) {
            w511.q();
            throw null;
        }
        this.a = qd81Var;
        this.b = t31.m(t31Var);
        this.w = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
        this.x = ea81Var.a(this);
        this.c = rf71.h(ea81Var.c, 1000000L, ea81Var.b);
    }

    public abstract ng61 e();

    public abstract of81 f();
}
