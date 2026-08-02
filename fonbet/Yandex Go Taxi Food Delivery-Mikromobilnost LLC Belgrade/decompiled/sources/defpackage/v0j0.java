package defpackage;

import com.airbnb.lottie.parser.moshi.c;

/* loaded from: classes10.dex */
public abstract class v0j0 {
    public static final hzk a = hzk.n("nm", "c", "o", "tr", "hd");

    public static t0j0 a(c cVar, nsz nszVar) {
        String str = null;
        be2 be2Var = null;
        be2 be2Var2 = null;
        ge2 ge2Var = null;
        boolean z = false;
        while (cVar.hasNext()) {
            int o = cVar.o(a);
            if (o == 0) {
                str = cVar.nextString();
            } else if (o == 1) {
                be2Var = bb1.C(cVar, nszVar, false);
            } else if (o == 2) {
                be2Var2 = bb1.C(cVar, nszVar, false);
            } else if (o == 3) {
                ge2Var = he2.c(cVar, nszVar);
            } else if (o != 4) {
                cVar.skipValue();
            } else {
                z = cVar.nextBoolean();
            }
        }
        return new t0j0(str, be2Var, be2Var2, ge2Var, z);
    }
}
