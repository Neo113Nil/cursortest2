package defpackage;

import com.airbnb.lottie.model.content.ShapeTrimPath$Type;
import com.airbnb.lottie.parser.moshi.c;

/* loaded from: classes10.dex */
public abstract class tir0 {
    public static final hzk a = hzk.n("s", "e", "o", "nm", "m", "hd");

    public static t0j0 a(c cVar, nsz nszVar) {
        ShapeTrimPath$Type shapeTrimPath$Type;
        String str = null;
        ShapeTrimPath$Type shapeTrimPath$Type2 = null;
        be2 be2Var = null;
        be2 be2Var2 = null;
        be2 be2Var3 = null;
        boolean z = false;
        while (cVar.hasNext()) {
            int o = cVar.o(a);
            if (o == 0) {
                be2Var = bb1.C(cVar, nszVar, false);
            } else if (o == 1) {
                be2Var2 = bb1.C(cVar, nszVar, false);
            } else if (o == 2) {
                be2Var3 = bb1.C(cVar, nszVar, false);
            } else if (o == 3) {
                str = cVar.nextString();
            } else if (o == 4) {
                int nextInt = cVar.nextInt();
                if (nextInt == 1) {
                    shapeTrimPath$Type = ShapeTrimPath$Type.SIMULTANEOUSLY;
                } else {
                    if (nextInt != 2) {
                        ny61.g(oyr.i(nextInt, "Unknown trim path type "));
                        return null;
                    }
                    shapeTrimPath$Type = ShapeTrimPath$Type.INDIVIDUALLY;
                }
                shapeTrimPath$Type2 = shapeTrimPath$Type;
            } else if (o != 5) {
                cVar.skipValue();
            } else {
                z = cVar.nextBoolean();
            }
        }
        return new t0j0(str, shapeTrimPath$Type2, be2Var, be2Var2, be2Var3, z);
    }
}
