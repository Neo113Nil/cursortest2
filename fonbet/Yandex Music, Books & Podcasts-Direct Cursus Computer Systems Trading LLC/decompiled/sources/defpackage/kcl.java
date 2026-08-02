package defpackage;

/* loaded from: classes6.dex */
public final class kcl {
    public final jyr a;

    public kcl(l13 l13Var) {
        this.a = l13Var.b(hag.I(z1h.class), true);
    }

    public final z1h a() {
        return (z1h) this.a.getValue();
    }

    public final void b() {
        boolean booleanValue = ((Boolean) a().g.getValue()).booleanValue();
        a().c(!booleanValue ? p2h.a : p2h.b);
        if (booleanValue) {
            return;
        }
        a().d();
    }
}
