package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class rqy0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ hry0 b;

    public /* synthetic */ rqy0(hry0 hry0Var, int i) {
        this.a = i;
        this.b = hry0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        hry0 hry0Var = this.b;
        ik2 ik2Var = (ik2) obj;
        switch (i) {
            case 0:
                fk2 fk2Var = (fk2) ik2Var.a;
                if (fk2Var instanceof jky) {
                    jky jkyVar = (jky) fk2Var;
                    if (jkyVar.b == null) {
                        return ik2.a(ik2Var, jky.c(jkyVar, hry0Var), 0, 14);
                    }
                }
                if (!(fk2Var instanceof iky)) {
                    return ik2Var;
                }
                iky ikyVar = (iky) fk2Var;
                return ikyVar.b == null ? ik2.a(ik2Var, iky.c(ikyVar, hry0Var), 0, 14) : ik2Var;
            default:
                fk2 fk2Var2 = (fk2) ik2Var.a;
                if (fk2Var2 instanceof jky) {
                    jky jkyVar2 = (jky) fk2Var2;
                    if (jkyVar2.b == null) {
                        return ik2.a(ik2Var, jky.c(jkyVar2, hry0Var), 0, 14);
                    }
                }
                if (!(fk2Var2 instanceof iky)) {
                    return ik2Var;
                }
                iky ikyVar2 = (iky) fk2Var2;
                return ikyVar2.b == null ? ik2.a(ik2Var, iky.c(ikyVar2, hry0Var), 0, 14) : ik2Var;
        }
    }
}
