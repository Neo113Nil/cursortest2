package defpackage;

import com.airbnb.lottie.parser.moshi.c;

/* loaded from: classes10.dex */
public abstract class zub {
    public static final hzk a = hzk.n("nm", "p", "s", "hd", "d");

    public static xub a(c cVar, nsz nszVar, int i) {
        boolean z = i == 3;
        boolean z2 = false;
        String str = null;
        ie2 ie2Var = null;
        ae2 ae2Var = null;
        while (cVar.hasNext()) {
            int o = cVar.o(a);
            if (o == 0) {
                str = cVar.nextString();
            } else if (o == 1) {
                ie2Var = de2.b(cVar, nszVar);
            } else if (o == 2) {
                ae2Var = bb1.E(cVar, nszVar);
            } else if (o == 3) {
                z2 = cVar.nextBoolean();
            } else if (o != 4) {
                cVar.v();
                cVar.skipValue();
            } else {
                z = cVar.nextInt() == 3;
            }
        }
        return new xub(str, ie2Var, ae2Var, z, z2);
    }
}
