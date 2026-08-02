package defpackage;

import com.airbnb.lottie.parser.moshi.c;

/* loaded from: classes10.dex */
public class zmm {
    public static final hzk f = hzk.n("ef");
    public static final hzk g = hzk.n("nm", "v");
    public ae2 a;
    public be2 b;
    public be2 c;
    public be2 d;
    public be2 e;

    public final oo2 a(c cVar, nsz nszVar) {
        be2 be2Var;
        be2 be2Var2;
        be2 be2Var3;
        be2 be2Var4;
        while (cVar.hasNext()) {
            if (cVar.o(f) != 0) {
                cVar.v();
                cVar.skipValue();
            } else {
                cVar.a();
                while (cVar.hasNext()) {
                    cVar.c();
                    String str = "";
                    while (cVar.hasNext()) {
                        int o = cVar.o(g);
                        if (o == 0) {
                            str = cVar.nextString();
                        } else if (o == 1) {
                            str.getClass();
                            switch (str) {
                                case "Distance":
                                    this.d = bb1.C(cVar, nszVar, true);
                                    break;
                                case "Opacity":
                                    this.b = bb1.C(cVar, nszVar, false);
                                    break;
                                case "Direction":
                                    this.c = bb1.C(cVar, nszVar, false);
                                    break;
                                case "Shadow Color":
                                    this.a = bb1.B(cVar, nszVar);
                                    break;
                                case "Softness":
                                    this.e = bb1.C(cVar, nszVar, true);
                                    break;
                                default:
                                    cVar.skipValue();
                                    break;
                            }
                        } else {
                            cVar.v();
                            cVar.skipValue();
                        }
                    }
                    cVar.e();
                }
                cVar.d();
            }
        }
        ae2 ae2Var = this.a;
        if (ae2Var == null || (be2Var = this.b) == null || (be2Var2 = this.c) == null || (be2Var3 = this.d) == null || (be2Var4 = this.e) == null) {
            return null;
        }
        return new oo2(ae2Var, be2Var, be2Var2, be2Var3, be2Var4);
    }
}
