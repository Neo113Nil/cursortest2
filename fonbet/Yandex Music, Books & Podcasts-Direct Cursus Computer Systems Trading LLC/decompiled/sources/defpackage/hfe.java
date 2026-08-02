package defpackage;

import defpackage.hmm;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class hfe implements efe {
    public static final hmm.a b = new hmm.a("RESTORED_IN_APP_USER_ID");
    public final wb7 a;

    public hfe(cc7 cc7Var) {
        this.a = ((dc7) cc7Var).b("prefs.inapp.restore");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, cg6 cg6Var) {
        ffe ffeVar;
        int i;
        if (cg6Var instanceof ffe) {
            ffeVar = (ffe) cg6Var;
            int i2 = ffeVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ffeVar.m = i2 - Integer.MIN_VALUE;
                Object obj = ffeVar.k;
                nm6 nm6Var = nm6.a;
                i = ffeVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc data = this.a.getData();
                    ffeVar.j = str;
                    ffeVar.m = 1;
                    obj = zsd.i0(data, ffeVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = ffeVar.j;
                    qgg.h0(obj);
                }
                hmm hmmVar = (hmm) obj;
                return Boolean.valueOf(Intrinsics.d(str, hmmVar == null ? (String) hmmVar.a(b) : null));
            }
        }
        ffeVar = new ffe(this, cg6Var);
        Object obj2 = ffeVar.k;
        nm6 nm6Var2 = nm6.a;
        i = ffeVar.m;
        if (i != 0) {
        }
        hmm hmmVar2 = (hmm) obj2;
        return Boolean.valueOf(Intrinsics.d(str, hmmVar2 == null ? (String) hmmVar2.a(b) : null));
    }
}
