package defpackage;

import defpackage.hmm;

/* loaded from: classes3.dex */
public final class dzl {
    public static final hmm.a e = new hmm.a("seen");
    public final cq4 a;
    public final oyl b;
    public final b0m c;
    public final jyr d;

    public dzl(cq4 cq4Var, oyl oylVar, b0m b0mVar) {
        oylVar.getClass();
        this.a = cq4Var;
        this.b = oylVar;
        this.c = b0mVar;
        this.d = l18.b.b(hag.I(jv0.class), true);
    }

    public final wb7 a() {
        cvl cvlVar;
        Object invoke = this.c.invoke();
        z0m z0mVar = invoke instanceof z0m ? (z0m) invoke : null;
        if (z0mVar != null && (cvlVar = z0mVar.a) != null) {
            this.b.getClass();
            if (cvlVar.d() && ivf.I(cvlVar)) {
                return ((jv0) this.d.getValue()).a("playlist_".concat(cvlVar.g().d()));
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        bzl bzlVar;
        int i;
        pjc data;
        hmm hmmVar;
        if (cg6Var instanceof bzl) {
            bzlVar = (bzl) cg6Var;
            int i2 = bzlVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bzlVar.l = i2 - Integer.MIN_VALUE;
                Object obj = bzlVar.j;
                nm6 nm6Var = nm6.a;
                i = bzlVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    wb7 a = a();
                    if (a != null && (data = a.getData()) != null) {
                        bzlVar.l = 1;
                        obj = zsd.i0(data, bzlVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    }
                    return Boolean.FALSE;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                hmmVar = (hmm) obj;
                if (hmmVar != null) {
                    Boolean bool = (Boolean) hmmVar.a(e);
                    return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                }
                return Boolean.FALSE;
            }
        }
        bzlVar = new bzl(this, cg6Var);
        Object obj2 = bzlVar.j;
        nm6 nm6Var2 = nm6.a;
        i = bzlVar.l;
        if (i != 0) {
        }
        hmmVar = (hmm) obj2;
        if (hmmVar != null) {
        }
        return Boolean.FALSE;
    }
}
