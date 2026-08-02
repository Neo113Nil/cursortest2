package defpackage;

import com.airbnb.lottie.model.content.PolystarShape$Type;
import com.airbnb.lottie.parser.moshi.c;

/* loaded from: classes10.dex */
public abstract class z5e0 {
    public static final hzk a = hzk.n("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd", "d");

    public static y5e0 a(c cVar, nsz nszVar, int i) {
        boolean z = false;
        boolean z2 = i == 3;
        String str = null;
        PolystarShape$Type polystarShape$Type = null;
        be2 be2Var = null;
        ie2 ie2Var = null;
        be2 be2Var2 = null;
        be2 be2Var3 = null;
        be2 be2Var4 = null;
        be2 be2Var5 = null;
        be2 be2Var6 = null;
        while (cVar.hasNext()) {
            switch (cVar.o(a)) {
                case 0:
                    str = cVar.nextString();
                    break;
                case 1:
                    polystarShape$Type = PolystarShape$Type.a(cVar.nextInt());
                    break;
                case 2:
                    be2Var = bb1.C(cVar, nszVar, false);
                    break;
                case 3:
                    ie2Var = de2.b(cVar, nszVar);
                    break;
                case 4:
                    be2Var2 = bb1.C(cVar, nszVar, false);
                    break;
                case 5:
                    be2Var4 = bb1.C(cVar, nszVar, true);
                    break;
                case 6:
                    be2Var6 = bb1.C(cVar, nszVar, false);
                    break;
                case 7:
                    be2Var3 = bb1.C(cVar, nszVar, true);
                    break;
                case 8:
                    be2Var5 = bb1.C(cVar, nszVar, false);
                    break;
                case 9:
                    z = cVar.nextBoolean();
                    break;
                case 10:
                    if (cVar.nextInt() != 3) {
                        z2 = false;
                        break;
                    } else {
                        z2 = true;
                        break;
                    }
                default:
                    cVar.v();
                    cVar.skipValue();
                    break;
            }
        }
        return new y5e0(str, polystarShape$Type, be2Var, ie2Var, be2Var2, be2Var3, be2Var4, be2Var5, be2Var6, z, z2);
    }
}
