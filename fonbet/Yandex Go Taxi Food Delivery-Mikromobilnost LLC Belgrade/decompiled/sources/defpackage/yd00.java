package defpackage;

/* loaded from: classes10.dex */
public final class yd00 extends m50 {
    public final n50 a;

    public yd00(n50 n50Var) {
        this.a = n50Var;
    }

    @Override // defpackage.m50
    public final void a(Object obj) {
        s50 s50Var = this.a.a;
        if (s50Var != null) {
            s50Var.a(obj);
        } else {
            ny61.r("Launcher has not been initialized");
        }
    }

    @Override // defpackage.m50
    public final void b() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
