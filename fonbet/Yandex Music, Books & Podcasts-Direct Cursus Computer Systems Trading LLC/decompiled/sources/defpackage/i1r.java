package defpackage;

/* loaded from: classes.dex */
public final class i1r {
    public final qqi a = rqi.a();
    public final x6k b = szf.g0(null);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String, oqi] */
    /* JADX WARN: Type inference failed for: r10v8, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, c1r c1rVar, cg6 cg6Var) {
        h1r h1rVar;
        nm6 nm6Var;
        int i;
        qqi qqiVar;
        c1r c1rVar2;
        String str2;
        i1r i1rVar;
        String str3;
        Throwable th;
        Object q;
        oqi oqiVar;
        try {
            try {
                if (cg6Var instanceof h1r) {
                    h1rVar = (h1r) cg6Var;
                    int i2 = h1rVar.q;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        h1rVar.q = i2 - Integer.MIN_VALUE;
                        Object obj = h1rVar.o;
                        nm6Var = nm6.a;
                        i = h1rVar.q;
                        if (i != 0) {
                            qgg.h0(obj);
                            h1rVar.j = this;
                            h1rVar.k = str;
                            h1rVar.l = null;
                            h1rVar.m = c1rVar;
                            qqiVar = this.a;
                            h1rVar.n = qqiVar;
                            h1rVar.q = 1;
                            if (qqiVar.a(h1rVar) != nm6Var) {
                                c1rVar2 = c1rVar;
                                str2 = null;
                                i1rVar = this;
                                str3 = str;
                            }
                            return nm6Var;
                        }
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqiVar = h1rVar.n;
                            i1rVar = h1rVar.j;
                            try {
                                qgg.h0(obj);
                                i1rVar.b.setValue(null);
                                oqiVar.b(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                i1rVar.b.setValue(null);
                                throw th;
                            }
                        }
                        ?? r10 = h1rVar.n;
                        c1r c1rVar3 = h1rVar.m;
                        String str4 = h1rVar.l;
                        String str5 = h1rVar.k;
                        i1r i1rVar2 = h1rVar.j;
                        qgg.h0(obj);
                        qqiVar = r10;
                        str3 = str5;
                        str2 = str4;
                        c1rVar2 = c1rVar3;
                        i1rVar = i1rVar2;
                        h1rVar.j = i1rVar;
                        h1rVar.k = str3;
                        h1rVar.l = str2;
                        h1rVar.m = c1rVar2;
                        h1rVar.n = qqiVar;
                        h1rVar.q = 2;
                        zt3 zt3Var = new zt3(1, qxe.b(h1rVar));
                        zt3Var.s();
                        i1rVar.b.setValue(new g1r(str3, str2, c1rVar2, zt3Var));
                        q = zt3Var.q();
                        if (q != nm6Var) {
                            qqi qqiVar2 = qqiVar;
                            obj = q;
                            oqiVar = qqiVar2;
                            i1rVar.b.setValue(null);
                            oqiVar.b(null);
                            return obj;
                        }
                        return nm6Var;
                    }
                }
                h1rVar.j = i1rVar;
                h1rVar.k = str3;
                h1rVar.l = str2;
                h1rVar.m = c1rVar2;
                h1rVar.n = qqiVar;
                h1rVar.q = 2;
                zt3 zt3Var2 = new zt3(1, qxe.b(h1rVar));
                zt3Var2.s();
                i1rVar.b.setValue(new g1r(str3, str2, c1rVar2, zt3Var2));
                q = zt3Var2.q();
                if (q != nm6Var) {
                }
                return nm6Var;
            } catch (Throwable th3) {
                th = th3;
                i1rVar.b.setValue(null);
                throw th;
            }
            if (i != 0) {
            }
        } catch (Throwable th4) {
            str.b(null);
            throw th4;
        }
        h1rVar = new h1r(this, cg6Var);
        Object obj2 = h1rVar.o;
        nm6Var = nm6.a;
        i = h1rVar.q;
    }
}
