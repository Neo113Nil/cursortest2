package defpackage;

import android.content.Context;
import java.util.Set;
import kotlin.collections.EmptySet;
import yads.de;
import yads.ee;

/* loaded from: classes7.dex */
public final class yc71 {
    public static void a(Context context, ge71 ge71Var) {
        r671 r671Var;
        sjh sjhVar = uyj.a;
        mdh mdhVar = mdh.b;
        ike a = bvf0.a(cvw.U(jl40.a(), mdhVar).plus(new qx71(0, ge71Var)));
        vb81 vb81Var = new vb81(mdhVar);
        mh61 mh61Var = new mh61(ge71Var);
        new cc71();
        gg81 a2 = dha1.f().a(context);
        if (a2 == null || !a2.i0) {
            return;
        }
        Long l = a2.j0;
        long longValue = l != null ? l.longValue() : 1000L;
        Long l2 = a2.k0;
        long longValue2 = l2 != null ? l2.longValue() : 6000L;
        Set set = a2.q0;
        if (set == null) {
            set = EmptySet.a;
        }
        Set set2 = set;
        r671 r671Var2 = r671.j;
        if (r671Var2 == null) {
            synchronized (r671.i) {
                r671Var = r671.j;
                if (r671Var == null) {
                    r671 r671Var3 = new r671(longValue, longValue2, set2, a, vb81Var, mh61Var);
                    r671.j = r671Var3;
                    r671Var = r671Var3;
                }
            }
            r671Var2 = r671Var;
        }
        if (r671Var2.h.getAndSet(true)) {
            return;
        }
        tje.N(r671Var2.d, r671Var2.g, null, new de(r671Var2, null), 2).w(new ee(r671Var2));
    }
}
