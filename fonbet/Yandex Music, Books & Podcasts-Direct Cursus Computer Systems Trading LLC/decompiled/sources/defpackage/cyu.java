package defpackage;

import defpackage.hmm;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class cyu implements yxu {
    public final cc7 a;
    public wb7 b;
    public final j0q c;
    public final xdr d;
    public final xdr e;

    public cyu(cc7 cc7Var, xmf xmfVar, mm6 mm6Var, frt frtVar) {
        cc7Var.getClass();
        frtVar.getClass();
        this.a = cc7Var;
        j0q j0qVar = new j0q();
        this.c = j0qVar;
        xdr a = ydr.a(null);
        this.d = a;
        this.e = a;
        ox6.B(frtVar.g(), mm6Var, new ds1(6, this));
        ox6.B(new u21(10, j0qVar, new mpq(27, xmfVar.e, this), new ow1(3, 9, (Continuation) null)), mm6Var, new lot(14, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(cyu cyuVar, String str, cg6 cg6Var) {
        ayu ayuVar;
        int i;
        pjc data;
        String str2;
        hmm hmmVar;
        if (cg6Var instanceof ayu) {
            ayuVar = (ayu) cg6Var;
            int i2 = ayuVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ayuVar.m = i2 - Integer.MIN_VALUE;
                Object obj = ayuVar.k;
                nm6 nm6Var = nm6.a;
                i = ayuVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    wb7 wb7Var = cyuVar.b;
                    if (wb7Var != null && (data = wb7Var.getData()) != null) {
                        ayuVar.j = str;
                        ayuVar.m = 1;
                        obj = zsd.i0(data, ayuVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    }
                    str2 = null;
                    return Boolean.valueOf(Intrinsics.d(str2, str));
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = ayuVar.j;
                qgg.h0(obj);
                hmmVar = (hmm) obj;
                if (hmmVar != null) {
                    str2 = (String) ((lpi) hmmVar).a.get(new hmm.a("notification_dot_hash_key"));
                    return Boolean.valueOf(Intrinsics.d(str2, str));
                }
                str2 = null;
                return Boolean.valueOf(Intrinsics.d(str2, str));
            }
        }
        ayuVar = new ayu(cyuVar, cg6Var);
        Object obj2 = ayuVar.k;
        nm6 nm6Var2 = nm6.a;
        i = ayuVar.m;
        if (i != 0) {
        }
        hmmVar = (hmm) obj2;
        if (hmmVar != null) {
        }
        str2 = null;
        return Boolean.valueOf(Intrinsics.d(str2, str));
    }
}
