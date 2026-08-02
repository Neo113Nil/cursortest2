package defpackage;

/* loaded from: classes3.dex */
public final class u8d implements jer {
    public final i8s a;

    public u8d(i8s i8sVar) {
        this.a = i8sVar;
    }

    @Override // defpackage.jer
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // defpackage.jer
    public final boolean b(sd2 sd2Var) {
        int i = sd2Var.b;
        if (i != 3 && i != 4 && i != 5) {
            return false;
        }
        this.a.d(sd2Var.a);
        return true;
    }
}
