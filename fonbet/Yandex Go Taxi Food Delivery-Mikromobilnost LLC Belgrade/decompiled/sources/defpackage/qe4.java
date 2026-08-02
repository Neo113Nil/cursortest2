package defpackage;

/* loaded from: classes10.dex */
public final class qe4 {
    public final j750 a;
    public final qx60 b;

    /* JADX WARN: Multi-variable type inference failed */
    public qe4(j750 j750Var, qx60 qx60Var) {
        this.a = j750Var;
        this.b = qx60Var;
        if ((j750Var == null ? qx60Var : j750Var) != null) {
            return;
        }
        ny61.g("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        throw null;
    }
}
