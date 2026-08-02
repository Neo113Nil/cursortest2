package defpackage;

import defpackage.hmm;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class jp1 {
    public static final hmm.a d = new hmm.a("artists_top_viewed");
    public static final hmm.a e = new hmm.a("artists_top_viewed");
    public static final hmm.a f = new hmm.a("artists_top_loaded");
    public final cc7 a;
    public final tf6 b;
    public final jyr c;

    public jp1(cc7 cc7Var) {
        cc7Var.getClass();
        this.a = cc7Var;
        this.b = gld.e(dm6.b);
        this.c = btf.b(new ri1(7, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        ip1 ip1Var;
        int i;
        hmm hmmVar;
        if (cg6Var instanceof ip1) {
            ip1Var = (ip1) cg6Var;
            int i2 = ip1Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ip1Var.l = i2 - Integer.MIN_VALUE;
                Object obj = ip1Var.j;
                nm6 nm6Var = nm6.a;
                i = ip1Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc data = ((wb7) this.c.getValue()).getData();
                    ip1Var.l = 1;
                    obj = zsd.i0(data, ip1Var);
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
                hmmVar = (hmm) obj;
                if (hmmVar != null) {
                    return Boolean.FALSE;
                }
                Object a = hmmVar.a(d);
                Boolean bool = Boolean.TRUE;
                return (Intrinsics.d(a, bool) || Intrinsics.d(hmmVar.a(e), bool)) ? Boolean.FALSE : Boolean.valueOf(Intrinsics.d(hmmVar.a(f), bool));
            }
        }
        ip1Var = new ip1(this, cg6Var);
        Object obj2 = ip1Var.j;
        nm6 nm6Var2 = nm6.a;
        i = ip1Var.l;
        if (i != 0) {
        }
        hmmVar = (hmm) obj2;
        if (hmmVar != null) {
        }
    }
}
