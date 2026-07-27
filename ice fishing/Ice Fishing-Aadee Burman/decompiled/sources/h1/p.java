package h1;

import i1.AbstractC4579a;
import java.util.ArrayList;
import k1.C4629a;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final S0.l f37989a = S0.l.F("k");

    public static ArrayList a(AbstractC4579a abstractC4579a, X0.i iVar, float f3, D d2, boolean z3) {
        AbstractC4579a abstractC4579a2;
        X0.i iVar2;
        float f9;
        D d9;
        boolean z6;
        ArrayList arrayList = new ArrayList();
        if (abstractC4579a.I() == 6) {
            iVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        abstractC4579a.j();
        while (abstractC4579a.D()) {
            if (abstractC4579a.K(f37989a) != 0) {
                abstractC4579a.W();
            } else if (abstractC4579a.I() == 1) {
                abstractC4579a.b();
                if (abstractC4579a.I() == 7) {
                    AbstractC4579a abstractC4579a3 = abstractC4579a;
                    X0.i iVar3 = iVar;
                    float f10 = f3;
                    D d10 = d2;
                    boolean z9 = z3;
                    C4629a b9 = o.b(abstractC4579a3, iVar3, f10, d10, false, z9);
                    abstractC4579a2 = abstractC4579a3;
                    iVar2 = iVar3;
                    f9 = f10;
                    d9 = d10;
                    z6 = z9;
                    arrayList.add(b9);
                } else {
                    abstractC4579a2 = abstractC4579a;
                    iVar2 = iVar;
                    f9 = f3;
                    d9 = d2;
                    z6 = z3;
                    while (abstractC4579a2.D()) {
                        arrayList.add(o.b(abstractC4579a2, iVar2, f9, d9, true, z6));
                    }
                }
                abstractC4579a2.z();
                abstractC4579a = abstractC4579a2;
                iVar = iVar2;
                f3 = f9;
                d2 = d9;
                z3 = z6;
            } else {
                AbstractC4579a abstractC4579a4 = abstractC4579a;
                arrayList.add(o.b(abstractC4579a4, iVar, f3, d2, false, z3));
                abstractC4579a = abstractC4579a4;
            }
        }
        abstractC4579a.B();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i;
        Object obj;
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            i = size - 1;
            if (i6 >= i) {
                break;
            }
            C4629a c4629a = (C4629a) arrayList.get(i6);
            i6++;
            C4629a c4629a2 = (C4629a) arrayList.get(i6);
            c4629a.f38558h = Float.valueOf(c4629a2.f38557g);
            if (c4629a.f38553c == null && (obj = c4629a2.f38552b) != null) {
                c4629a.f38553c = obj;
                if (c4629a instanceof a1.l) {
                    ((a1.l) c4629a).d();
                }
            }
        }
        C4629a c4629a3 = (C4629a) arrayList.get(i);
        if ((c4629a3.f38552b == null || c4629a3.f38553c == null) && arrayList.size() > 1) {
            arrayList.remove(c4629a3);
        }
    }
}
