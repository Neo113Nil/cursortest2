package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader$Token;
import com.airbnb.lottie.parser.moshi.a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class ukx {
    public static final hzk a = hzk.n("k");

    public static ArrayList a(a aVar, nsz nszVar, float f, m131 m131Var, boolean z) {
        a aVar2;
        nsz nszVar2;
        float f2;
        m131 m131Var2;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (aVar.k() == JsonReader$Token.STRING) {
            nszVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        aVar.c();
        while (aVar.hasNext()) {
            if (aVar.o(a) != 0) {
                aVar.skipValue();
            } else if (aVar.k() == JsonReader$Token.BEGIN_ARRAY) {
                aVar.a();
                if (aVar.k() == JsonReader$Token.NUMBER) {
                    a aVar3 = aVar;
                    nsz nszVar3 = nszVar;
                    float f3 = f;
                    m131 m131Var3 = m131Var;
                    boolean z3 = z;
                    rkx b = tkx.b(aVar3, nszVar3, f3, m131Var3, false, z3);
                    aVar2 = aVar3;
                    nszVar2 = nszVar3;
                    f2 = f3;
                    m131Var2 = m131Var3;
                    z2 = z3;
                    arrayList.add(b);
                } else {
                    aVar2 = aVar;
                    nszVar2 = nszVar;
                    f2 = f;
                    m131Var2 = m131Var;
                    z2 = z;
                    while (aVar2.hasNext()) {
                        arrayList.add(tkx.b(aVar2, nszVar2, f2, m131Var2, true, z2));
                    }
                }
                aVar2.d();
                aVar = aVar2;
                nszVar = nszVar2;
                f = f2;
                m131Var = m131Var2;
                z = z2;
            } else {
                a aVar4 = aVar;
                arrayList.add(tkx.b(aVar4, nszVar, f, m131Var, false, z));
                aVar = aVar4;
            }
        }
        aVar.e();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i;
        Object obj;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            rkx rkxVar = (rkx) arrayList.get(i2);
            i2++;
            rkx rkxVar2 = (rkx) arrayList.get(i2);
            rkxVar.h = Float.valueOf(rkxVar2.g);
            if (rkxVar.c == null && (obj = rkxVar2.b) != null) {
                rkxVar.c = obj;
                if (rkxVar instanceof wq90) {
                    ((wq90) rkxVar).d();
                }
            }
        }
        rkx rkxVar3 = (rkx) arrayList.get(i);
        if ((rkxVar3.b == null || rkxVar3.c == null) && arrayList.size() > 1) {
            arrayList.remove(rkxVar3);
        }
    }
}
