package defpackage;

/* loaded from: classes.dex */
public final class yey implements q0k0 {
    public final ae00 a;

    public yey(int i) {
        ae00 ae00Var = new ae00();
        this.a = ae00Var;
        if (ae00Var.b) {
            return;
        }
        if (ae00Var.c) {
            lhe0.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
        }
        ae00Var.a();
        ae00Var.c = true;
    }

    public yey() {
        this(0);
    }
}
