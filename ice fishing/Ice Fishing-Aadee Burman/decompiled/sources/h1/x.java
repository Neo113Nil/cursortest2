package h1;

import android.graphics.PointF;
import c1.C0533a;
import i1.AbstractC4579a;
import j1.AbstractC4603g;
import java.util.ArrayList;
import java.util.Collections;
import q5.C4927a;

/* loaded from: classes.dex */
public final class x implements D {

    /* renamed from: n, reason: collision with root package name */
    public static final x f38002n = new x();

    /* renamed from: u, reason: collision with root package name */
    public static final S0.l f38003u = S0.l.F("c", "v", "i", C4927a.PUSH_MINIFIED_BUTTONS_LIST);

    @Override // h1.D
    public final Object b(AbstractC4579a abstractC4579a, float f3) {
        if (abstractC4579a.I() == 1) {
            abstractC4579a.b();
        }
        abstractC4579a.j();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        boolean z3 = false;
        while (abstractC4579a.D()) {
            int K7 = abstractC4579a.K(f38003u);
            if (K7 == 0) {
                z3 = abstractC4579a.E();
            } else if (K7 == 1) {
                arrayList = n.c(abstractC4579a, f3);
            } else if (K7 == 2) {
                arrayList2 = n.c(abstractC4579a, f3);
            } else if (K7 != 3) {
                abstractC4579a.V();
                abstractC4579a.W();
            } else {
                arrayList3 = n.c(abstractC4579a, f3);
            }
        }
        abstractC4579a.B();
        if (abstractC4579a.I() == 2) {
            abstractC4579a.z();
        }
        if (arrayList == null || arrayList2 == null || arrayList3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (arrayList.isEmpty()) {
            return new e1.k(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayList.size();
        PointF pointF = (PointF) arrayList.get(0);
        ArrayList arrayList4 = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) arrayList.get(i);
            int i6 = i - 1;
            arrayList4.add(new C0533a(AbstractC4603g.a((PointF) arrayList.get(i6), (PointF) arrayList3.get(i6)), AbstractC4603g.a(pointF2, (PointF) arrayList2.get(i)), pointF2));
        }
        if (z3) {
            PointF pointF3 = (PointF) arrayList.get(0);
            int i9 = size - 1;
            arrayList4.add(new C0533a(AbstractC4603g.a((PointF) arrayList.get(i9), (PointF) arrayList3.get(i9)), AbstractC4603g.a(pointF3, (PointF) arrayList2.get(0)), pointF3));
        }
        return new e1.k(pointF, z3, arrayList4);
    }
}
