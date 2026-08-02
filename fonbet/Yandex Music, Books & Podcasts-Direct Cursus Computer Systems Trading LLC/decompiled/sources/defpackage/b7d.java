package defpackage;

/* loaded from: classes3.dex */
public final class b7d implements jer {
    public final ovt a;
    public final i8s b;

    public b7d(ovt ovtVar, i8s i8sVar) {
        this.a = ovtVar;
        this.b = i8sVar;
    }

    @Override // defpackage.jer
    public final boolean a(Exception exc) {
        this.b.c(exc);
        return true;
    }

    @Override // defpackage.jer
    public final boolean b(sd2 sd2Var) {
        if (sd2Var.b != 4 || this.a.a(sd2Var)) {
            return false;
        }
        String str = sd2Var.c;
        if (str == null) {
            jj4.j("Null token");
            return false;
        }
        this.b.b(new kd2(str, sd2Var.e, sd2Var.f));
        return true;
    }
}
