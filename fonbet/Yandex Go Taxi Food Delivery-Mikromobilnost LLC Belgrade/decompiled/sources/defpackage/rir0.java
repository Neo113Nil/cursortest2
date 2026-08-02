package defpackage;

import com.airbnb.lottie.model.content.ShapeStroke$LineCapType;
import com.airbnb.lottie.model.content.ShapeStroke$LineJoinType;
import com.airbnb.lottie.parser.moshi.c;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes10.dex */
public abstract class rir0 {
    public static final hzk a = hzk.n("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");
    public static final hzk b = hzk.n("n", "v");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14, types: [be2] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v9 */
    public static qir0 a(c cVar, nsz nszVar) {
        ArrayList arrayList = new ArrayList();
        be2 be2Var = null;
        ShapeStroke$LineCapType shapeStroke$LineCapType = null;
        ShapeStroke$LineJoinType shapeStroke$LineJoinType = null;
        String str = null;
        ae2 ae2Var = null;
        be2 be2Var2 = null;
        Object obj = null;
        float f = 0.0f;
        boolean z = false;
        ae2 ae2Var2 = null;
        while (cVar.hasNext()) {
            switch (cVar.o(a)) {
                case 0:
                    str = cVar.nextString();
                    break;
                case 1:
                    ae2Var = bb1.B(cVar, nszVar);
                    break;
                case 2:
                    be2Var2 = bb1.C(cVar, nszVar, true);
                    break;
                case 3:
                    ae2Var2 = bb1.D(cVar, nszVar);
                    break;
                case 4:
                    shapeStroke$LineCapType = ShapeStroke$LineCapType.values()[cVar.nextInt() - 1];
                    break;
                case 5:
                    shapeStroke$LineJoinType = ShapeStroke$LineJoinType.values()[cVar.nextInt() - 1];
                    break;
                case 6:
                    f = (float) cVar.nextDouble();
                    break;
                case 7:
                    z = cVar.nextBoolean();
                    break;
                case 8:
                    cVar.a();
                    ?? r13 = obj;
                    while (cVar.hasNext()) {
                        cVar.c();
                        String str2 = r13;
                        while (cVar.hasNext()) {
                            int o = cVar.o(b);
                            if (o == 0) {
                                str2 = cVar.nextString();
                            } else if (o != 1) {
                                cVar.v();
                                cVar.skipValue();
                            } else {
                                r13 = bb1.C(cVar, nszVar, true);
                            }
                        }
                        cVar.e();
                        str2.getClass();
                        switch (str2) {
                            case "d":
                            case "g":
                                arrayList.add(r13);
                                break;
                            case "o":
                                be2Var = r13;
                                break;
                        }
                        r13 = 0;
                    }
                    cVar.d();
                    if (arrayList.size() != 1) {
                        break;
                    } else {
                        arrayList.add((be2) arrayList.get(0));
                        break;
                    }
                    break;
                default:
                    cVar.skipValue();
                    continue;
            }
            obj = null;
        }
        if (ae2Var2 == null) {
            ae2Var2 = new ae2(Collections.singletonList(new rkx(100)), 1);
        }
        ae2 ae2Var3 = ae2Var2;
        if (shapeStroke$LineCapType == null) {
            shapeStroke$LineCapType = ShapeStroke$LineCapType.BUTT;
        }
        if (shapeStroke$LineJoinType == null) {
            shapeStroke$LineJoinType = ShapeStroke$LineJoinType.MITER;
        }
        ShapeStroke$LineJoinType shapeStroke$LineJoinType2 = shapeStroke$LineJoinType;
        return new qir0(str, be2Var, arrayList, ae2Var, ae2Var3, be2Var2, shapeStroke$LineCapType, shapeStroke$LineJoinType2, f, z);
    }
}
