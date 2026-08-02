package defpackage;

import defpackage.hmm;

/* loaded from: classes4.dex */
public final class r5v {
    public static final hmm.a b = new hmm.a("wave_shake_onboarding_shown");
    public final cc7 a;

    public r5v(cc7 cc7Var) {
        cc7Var.getClass();
        this.a = cc7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, cg6 cg6Var) {
        q5v q5vVar;
        int i;
        Boolean bool;
        if (cg6Var instanceof q5v) {
            q5vVar = (q5v) cg6Var;
            int i2 = q5vVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q5vVar.l = i2 - Integer.MIN_VALUE;
                Object obj = q5vVar.j;
                nm6 nm6Var = nm6.a;
                i = q5vVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc data = ((dc7) this.a).c(str, "wave_shake_onboarding").getData();
                    q5vVar.l = 1;
                    obj = zsd.i0(data, q5vVar);
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
                hmm hmmVar = (hmm) obj;
                return Boolean.valueOf((hmmVar != null || (bool = (Boolean) hmmVar.a(b)) == null) ? false : bool.booleanValue());
            }
        }
        q5vVar = new q5v(this, cg6Var);
        Object obj2 = q5vVar.j;
        nm6 nm6Var2 = nm6.a;
        i = q5vVar.l;
        if (i != 0) {
        }
        hmm hmmVar2 = (hmm) obj2;
        return Boolean.valueOf((hmmVar2 != null || (bool = (Boolean) hmmVar2.a(b)) == null) ? false : bool.booleanValue());
    }
}
