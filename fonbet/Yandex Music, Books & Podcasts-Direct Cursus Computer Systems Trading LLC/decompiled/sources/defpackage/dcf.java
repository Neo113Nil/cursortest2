package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class dcf {
    public static final j6e a = j6e.s("k");

    public static ArrayList a(b7f b7fVar, ayg aygVar, float f, xwt xwtVar, boolean z) {
        b7f b7fVar2;
        ayg aygVar2;
        float f2;
        xwt xwtVar2;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (b7fVar.peek() == 6) {
            aygVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        b7fVar.b();
        while (b7fVar.hasNext()) {
            if (b7fVar.D(a) != 0) {
                b7fVar.w();
            } else if (b7fVar.peek() == 1) {
                b7fVar.a();
                if (b7fVar.peek() == 7) {
                    b7f b7fVar3 = b7fVar;
                    ayg aygVar3 = aygVar;
                    float f3 = f;
                    xwt xwtVar3 = xwtVar;
                    boolean z3 = z;
                    acf b = ccf.b(b7fVar3, aygVar3, f3, xwtVar3, false, z3);
                    b7fVar2 = b7fVar3;
                    aygVar2 = aygVar3;
                    f2 = f3;
                    xwtVar2 = xwtVar3;
                    z2 = z3;
                    arrayList.add(b);
                } else {
                    b7fVar2 = b7fVar;
                    aygVar2 = aygVar;
                    f2 = f;
                    xwtVar2 = xwtVar;
                    z2 = z;
                    while (b7fVar2.hasNext()) {
                        arrayList.add(ccf.b(b7fVar2, aygVar2, f2, xwtVar2, true, z2));
                    }
                }
                b7fVar2.g();
                b7fVar = b7fVar2;
                aygVar = aygVar2;
                f = f2;
                xwtVar = xwtVar2;
                z = z2;
            } else {
                b7f b7fVar4 = b7fVar;
                arrayList.add(ccf.b(b7fVar4, aygVar, f, xwtVar, false, z));
                b7fVar = b7fVar4;
            }
        }
        b7fVar.o();
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
            acf acfVar = (acf) arrayList.get(i2);
            i2++;
            acf acfVar2 = (acf) arrayList.get(i2);
            acfVar.h = Float.valueOf(acfVar2.g);
            if (acfVar.c == null && (obj = acfVar2.b) != null) {
                acfVar.c = obj;
                if (acfVar instanceof jak) {
                    ((jak) acfVar).d();
                }
            }
        }
        acf acfVar3 = (acf) arrayList.get(i);
        if ((acfVar3.b == null || acfVar3.c == null) && arrayList.size() > 1) {
            arrayList.remove(acfVar3);
        }
    }
}
