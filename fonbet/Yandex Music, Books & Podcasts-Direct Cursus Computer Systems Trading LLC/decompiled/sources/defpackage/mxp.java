package defpackage;

import java.io.File;

/* loaded from: classes4.dex */
public final class mxp {
    public final owp a;

    public mxp(owp owpVar) {
        owpVar.getClass();
        this.a = owpVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zwp zwpVar, File file, cg6 cg6Var) {
        lxp lxpVar;
        int i;
        if (cg6Var instanceof lxp) {
            lxpVar = (lxp) cg6Var;
            int i2 = lxpVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lxpVar.l = i2 - Integer.MIN_VALUE;
                Object obj = lxpVar.j;
                nm6 nm6Var = nm6.a;
                i = lxpVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    lxpVar.l = 1;
                    owp owpVar = this.a;
                    owpVar.getClass();
                    obj = x97.V(dm6.b, new kun(zwpVar, owpVar, file, null, 22), lxpVar);
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
                pwp pwpVar = (pwp) obj;
                return new qir(pwpVar.a, pwpVar.b);
            }
        }
        lxpVar = new lxp(this, cg6Var);
        Object obj2 = lxpVar.j;
        nm6 nm6Var2 = nm6.a;
        i = lxpVar.l;
        if (i != 0) {
        }
        pwp pwpVar2 = (pwp) obj2;
        return new qir(pwpVar2.a, pwpVar2.b);
    }
}
