package j1;

import java.util.ArrayList;
import k1.AbstractC4640b;
import k1.C4639a;
import m1.C4739a;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final C4639a f38458a = C4639a.d("k");

    public static ArrayList a(AbstractC4640b abstractC4640b, Z0.i iVar, float f2, D d9, boolean z6) {
        AbstractC4640b abstractC4640b2;
        Z0.i iVar2;
        float f9;
        D d10;
        boolean z9;
        ArrayList arrayList = new ArrayList();
        if (abstractC4640b.I() == 6) {
            iVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        abstractC4640b.j();
        while (abstractC4640b.D()) {
            if (abstractC4640b.K(f38458a) != 0) {
                abstractC4640b.W();
            } else if (abstractC4640b.I() == 1) {
                abstractC4640b.b();
                if (abstractC4640b.I() == 7) {
                    AbstractC4640b abstractC4640b3 = abstractC4640b;
                    Z0.i iVar3 = iVar;
                    float f10 = f2;
                    D d11 = d9;
                    boolean z10 = z6;
                    C4739a b9 = o.b(abstractC4640b3, iVar3, f10, d11, false, z10);
                    abstractC4640b2 = abstractC4640b3;
                    iVar2 = iVar3;
                    f9 = f10;
                    d10 = d11;
                    z9 = z10;
                    arrayList.add(b9);
                } else {
                    abstractC4640b2 = abstractC4640b;
                    iVar2 = iVar;
                    f9 = f2;
                    d10 = d9;
                    z9 = z6;
                    while (abstractC4640b2.D()) {
                        arrayList.add(o.b(abstractC4640b2, iVar2, f9, d10, true, z9));
                    }
                }
                abstractC4640b2.z();
                abstractC4640b = abstractC4640b2;
                iVar = iVar2;
                f2 = f9;
                d9 = d10;
                z6 = z9;
            } else {
                AbstractC4640b abstractC4640b4 = abstractC4640b;
                arrayList.add(o.b(abstractC4640b4, iVar, f2, d9, false, z6));
                abstractC4640b = abstractC4640b4;
            }
        }
        abstractC4640b.B();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i;
        Object obj;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            i = size - 1;
            if (i4 >= i) {
                break;
            }
            C4739a c4739a = (C4739a) arrayList.get(i4);
            i4++;
            C4739a c4739a2 = (C4739a) arrayList.get(i4);
            c4739a.f39347h = Float.valueOf(c4739a2.f39346g);
            if (c4739a.f39342c == null && (obj = c4739a2.f39341b) != null) {
                c4739a.f39342c = obj;
                if (c4739a instanceof c1.l) {
                    ((c1.l) c4739a).d();
                }
            }
        }
        C4739a c4739a3 = (C4739a) arrayList.get(i);
        if ((c4739a3.f39341b == null || c4739a3.f39342c == null) && arrayList.size() > 1) {
            arrayList.remove(c4739a3);
        }
    }
}
