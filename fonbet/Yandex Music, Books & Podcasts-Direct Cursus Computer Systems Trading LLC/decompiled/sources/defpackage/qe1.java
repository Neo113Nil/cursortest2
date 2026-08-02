package defpackage;

/* loaded from: classes3.dex */
public final class qe1 {
    public final ab1 a;

    public qe1(ab1 ab1Var) {
        ab1Var.getClass();
        this.a = ab1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, boolean z, cg6 cg6Var) {
        pe1 pe1Var;
        int i;
        dnk dnkVar;
        if (cg6Var instanceof pe1) {
            pe1Var = (pe1) cg6Var;
            int i2 = pe1Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pe1Var.l = i2 - Integer.MIN_VALUE;
                Object obj = pe1Var.j;
                nm6 nm6Var = nm6.a;
                i = pe1Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pe1Var.l = 1;
                    obj = this.a.a(str, z, pe1Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                dnkVar = (dnk) obj;
                if (dnkVar == null) {
                    return dnkVar.c;
                }
                return null;
            }
        }
        pe1Var = new pe1(this, cg6Var);
        Object obj2 = pe1Var.j;
        nm6 nm6Var2 = nm6.a;
        i = pe1Var.l;
        if (i != 0) {
        }
        dnkVar = (dnk) obj2;
        if (dnkVar == null) {
        }
    }
}
