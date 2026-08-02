package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class fjk {
    public static final long b;
    public final jyr a;

    static {
        msa msaVar = nsa.b;
        b = yd5.M(15, ssa.SECONDS);
    }

    public fjk(jyr jyrVar) {
        this.a = jyrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        ejk ejkVar;
        int i;
        try {
            if (cg6Var instanceof ejk) {
                ejkVar = (ejk) cg6Var;
                int i2 = ejkVar.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ejkVar.l = i2 - Integer.MIN_VALUE;
                    Object obj = ejkVar.j;
                    nm6 nm6Var = nm6.a;
                    i = ejkVar.l;
                    Continuation continuation = null;
                    if (i != 0) {
                        qgg.h0(obj);
                        long j = b;
                        m1i m1iVar = new m1i(this, continuation, 26);
                        ejkVar.l = 1;
                        obj = tyf.K(j, m1iVar, ejkVar);
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
                    return (xyo) obj;
                }
            }
            if (i != 0) {
            }
            return (xyo) obj;
        } catch (wis e) {
            return new vyo(null, e);
        }
        ejkVar = new ejk(this, cg6Var);
        Object obj2 = ejkVar.j;
        nm6 nm6Var2 = nm6.a;
        i = ejkVar.l;
        Continuation continuation2 = null;
    }
}
