package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class ond {
    public static final ArrayList f;
    public static final ArrayList g;
    public final op2 a;
    public final ind b;
    public final dnd c;
    public final w8c d;
    public nnd e;

    static {
        u75.h("VISA", "MASTERCARD");
        f = u75.d(1, 2);
        u75.d(1000, 5, 4);
        g = u75.d(1, 3, 9);
    }

    public ond(op2 op2Var, ind indVar, pxf pxfVar, dnd dndVar) {
        pxfVar.getClass();
        dndVar.getClass();
        this.a = op2Var;
        this.b = indVar;
        this.c = dndVar;
        jsg jsgVar = new jsg();
        jsgVar.m(pxfVar.b() ? 3 : 1);
        this.d = new w8c(op2Var, op2Var, oku.a, new nku(jsgVar), nmd.c);
    }

    public final void a(p1c p1cVar) {
        nnd nndVar = this.e;
        if (nndVar != null) {
            nndVar.x(p1cVar);
        }
        this.e = null;
    }
}
