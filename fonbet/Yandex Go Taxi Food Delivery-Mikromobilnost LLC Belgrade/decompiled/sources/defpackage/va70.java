package defpackage;

/* loaded from: classes.dex */
public final class va70 extends gc70 {
    public static final va70 c = new va70(0, 2, 1);

    @Override // defpackage.gc70
    public final void a(vc70 vc70Var, o13 o13Var, ows0 ows0Var, zti0 zti0Var, jc70 jc70Var) {
        yss yssVar = (yss) vc70Var.b(0);
        Object b = vc70Var.b(1);
        if (b instanceof gts) {
            gts gtsVar = (gts) b;
            zti0Var.e.b(gtsVar);
            zti0Var.d.a(gtsVar);
        }
        if (ows0Var.n != 0) {
            lid.a("Can only append a slot if not current inserting");
        }
        int i = ows0Var.i;
        int i2 = ows0Var.j;
        int c2 = ows0Var.c(yssVar);
        int g = ows0Var.g(ows0Var.r(c2 + 1), ows0Var.b);
        ows0Var.i = g;
        ows0Var.j = g;
        ows0Var.x(1, c2);
        if (i >= g) {
            i++;
            i2++;
        }
        ows0Var.c[g] = b;
        ows0Var.i = i;
        ows0Var.j = i2;
    }
}
