package defpackage;

import defpackage.hmm;

/* loaded from: classes3.dex */
public final class l0g {
    public final pst a;
    public final cc7 b;
    public final frt c;
    public final jyr d;

    public l0g(pst pstVar, cc7 cc7Var, frt frtVar) {
        cc7Var.getClass();
        frtVar.getClass();
        this.a = pstVar;
        this.b = cc7Var;
        this.c = frtVar;
        this.d = btf.b(new v1e(27, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(l0g l0gVar, cg6 cg6Var) {
        k0g k0gVar;
        int i;
        if (cg6Var instanceof k0g) {
            k0gVar = (k0g) cg6Var;
            int i2 = k0gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k0gVar.l = i2 - Integer.MIN_VALUE;
                Object obj = k0gVar.j;
                nm6 nm6Var = nm6.a;
                i = k0gVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc data = ((wb7) l0gVar.d.getValue()).getData();
                    k0gVar.l = 1;
                    obj = zsd.g0(data, k0gVar);
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
                Boolean a = ec7.a(hmmVar, "bottom_sheet_showed");
                boolean booleanValue = a == null ? a.booleanValue() : false;
                Integer num = (Integer) ((lpi) hmmVar).a.get(new hmm.a("like_count"));
                return new h0g(num != null ? num.intValue() : 0, booleanValue);
            }
        }
        k0gVar = new k0g(l0gVar, cg6Var);
        Object obj2 = k0gVar.j;
        nm6 nm6Var2 = nm6.a;
        i = k0gVar.l;
        if (i != 0) {
        }
        hmm hmmVar2 = (hmm) obj2;
        Boolean a2 = ec7.a(hmmVar2, "bottom_sheet_showed");
        if (a2 == null) {
        }
        Integer num2 = (Integer) ((lpi) hmmVar2).a.get(new hmm.a("like_count"));
        return new h0g(num2 != null ? num2.intValue() : 0, booleanValue);
    }
}
