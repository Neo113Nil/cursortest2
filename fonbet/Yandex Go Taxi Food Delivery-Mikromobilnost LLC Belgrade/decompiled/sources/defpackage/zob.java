package defpackage;

/* loaded from: classes15.dex */
public final class zob implements v7p {
    public final /* synthetic */ int a;
    public final zfa b;
    public final zni0 c;

    public /* synthetic */ zob(zfa zfaVar, zni0 zni0Var, int i) {
        this.a = i;
        this.b = zfaVar;
        this.c = zni0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        zni0 zni0Var = this.c;
        zfa zfaVar = this.b;
        switch (i) {
            case 0:
                return new yob((sk7) zfaVar.get(), (sue0) zni0Var.get());
            default:
                return new p1b((sk7) zfaVar.get(), (sue0) zni0Var.get());
        }
    }
}
