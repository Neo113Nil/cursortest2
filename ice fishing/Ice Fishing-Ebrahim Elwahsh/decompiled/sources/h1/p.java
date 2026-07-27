package h1;

import i1.AbstractC4574a;
import java.util.ArrayList;
import k1.C4628a;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final S0.s f38189a = S0.s.i("k");

    public static ArrayList a(AbstractC4574a abstractC4574a, X0.i iVar, float f6, D d2, boolean z8) {
        AbstractC4574a abstractC4574a2;
        X0.i iVar2;
        float f9;
        D d3;
        boolean z9;
        ArrayList arrayList = new ArrayList();
        if (abstractC4574a.I() == 6) {
            iVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        abstractC4574a.j();
        while (abstractC4574a.D()) {
            if (abstractC4574a.K(f38189a) != 0) {
                abstractC4574a.W();
            } else if (abstractC4574a.I() == 1) {
                abstractC4574a.b();
                if (abstractC4574a.I() == 7) {
                    AbstractC4574a abstractC4574a3 = abstractC4574a;
                    X0.i iVar3 = iVar;
                    float f10 = f6;
                    D d9 = d2;
                    boolean z10 = z8;
                    C4628a b9 = o.b(abstractC4574a3, iVar3, f10, d9, false, z10);
                    abstractC4574a2 = abstractC4574a3;
                    iVar2 = iVar3;
                    f9 = f10;
                    d3 = d9;
                    z9 = z10;
                    arrayList.add(b9);
                } else {
                    abstractC4574a2 = abstractC4574a;
                    iVar2 = iVar;
                    f9 = f6;
                    d3 = d2;
                    z9 = z8;
                    while (abstractC4574a2.D()) {
                        arrayList.add(o.b(abstractC4574a2, iVar2, f9, d3, true, z9));
                    }
                }
                abstractC4574a2.z();
                abstractC4574a = abstractC4574a2;
                iVar = iVar2;
                f6 = f9;
                d2 = d3;
                z8 = z9;
            } else {
                AbstractC4574a abstractC4574a4 = abstractC4574a;
                arrayList.add(o.b(abstractC4574a4, iVar, f6, d2, false, z8));
                abstractC4574a = abstractC4574a4;
            }
        }
        abstractC4574a.B();
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
            C4628a c4628a = (C4628a) arrayList.get(i4);
            i4++;
            C4628a c4628a2 = (C4628a) arrayList.get(i4);
            c4628a.f38678h = Float.valueOf(c4628a2.f38677g);
            if (c4628a.f38673c == null && (obj = c4628a2.f38672b) != null) {
                c4628a.f38673c = obj;
                if (c4628a instanceof a1.l) {
                    ((a1.l) c4628a).d();
                }
            }
        }
        C4628a c4628a3 = (C4628a) arrayList.get(i);
        if ((c4628a3.f38672b == null || c4628a3.f38673c == null) && arrayList.size() > 1) {
            arrayList.remove(c4628a3);
        }
    }
}
