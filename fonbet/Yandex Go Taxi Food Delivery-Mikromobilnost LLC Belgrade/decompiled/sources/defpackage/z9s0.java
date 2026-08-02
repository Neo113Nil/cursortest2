package defpackage;

/* loaded from: classes8.dex */
public final class z9s0 {
    public final cne0 a;

    public z9s0(dne0 dne0Var) {
        this.a = dne0Var.a("shown_permission_dialogs");
    }

    public final void a(int i) {
        for (String str : jx81.b(i)) {
            this.a.u("was_" + str + "_dialog_shown", true);
        }
    }
}
