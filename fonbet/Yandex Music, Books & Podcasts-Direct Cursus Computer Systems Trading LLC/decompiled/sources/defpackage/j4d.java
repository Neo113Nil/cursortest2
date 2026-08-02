package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class j4d {
    public final /* synthetic */ jyr a;

    public j4d(jyr jyrVar) {
        this.a = jyrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, cg6 cg6Var) {
        i4d i4dVar;
        int i;
        b9n b9nVar;
        baq baqVar;
        if (cg6Var instanceof i4d) {
            i4dVar = (i4d) cg6Var;
            int i2 = i4dVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i4dVar.l = i2 - Integer.MIN_VALUE;
                Object obj = i4dVar.j;
                nm6 nm6Var = nm6.a;
                i = i4dVar.l;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    rmg rmgVar = (rmg) this.a.getValue();
                    if (rmgVar != null && (b9nVar = rmgVar.b) != null) {
                        i4dVar.l = 1;
                        obj = x97.V(dm6.c, new rfg(b9nVar, str, continuation, 23), i4dVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                baqVar = (baq) obj;
                if (baqVar != null) {
                    return baqVar.b;
                }
                return null;
            }
        }
        i4dVar = new i4d(this, cg6Var);
        Object obj2 = i4dVar.j;
        nm6 nm6Var2 = nm6.a;
        i = i4dVar.l;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        baqVar = (baq) obj2;
        if (baqVar != null) {
        }
        return null;
    }
}
