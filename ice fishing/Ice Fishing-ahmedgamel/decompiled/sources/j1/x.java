package j1;

import android.graphics.PointF;
import e1.C4472a;
import java.util.ArrayList;
import java.util.Collections;
import k1.AbstractC4640b;
import k1.C4639a;
import l1.AbstractC4672g;
import q5.C4876a;

/* loaded from: classes.dex */
public final class x implements D {

    /* renamed from: n, reason: collision with root package name */
    public static final x f38471n = new x();

    /* renamed from: u, reason: collision with root package name */
    public static final C4639a f38472u = C4639a.d("c", "v", "i", C4876a.PUSH_MINIFIED_BUTTONS_LIST);

    @Override // j1.D
    public final Object b(AbstractC4640b abstractC4640b, float f2) {
        if (abstractC4640b.I() == 1) {
            abstractC4640b.b();
        }
        abstractC4640b.j();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        boolean z6 = false;
        while (abstractC4640b.D()) {
            int K7 = abstractC4640b.K(f38472u);
            if (K7 == 0) {
                z6 = abstractC4640b.E();
            } else if (K7 == 1) {
                arrayList = n.c(abstractC4640b, f2);
            } else if (K7 == 2) {
                arrayList2 = n.c(abstractC4640b, f2);
            } else if (K7 != 3) {
                abstractC4640b.V();
                abstractC4640b.W();
            } else {
                arrayList3 = n.c(abstractC4640b, f2);
            }
        }
        abstractC4640b.B();
        if (abstractC4640b.I() == 2) {
            abstractC4640b.z();
        }
        if (arrayList == null || arrayList2 == null || arrayList3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (arrayList.isEmpty()) {
            return new g1.k(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayList.size();
        PointF pointF = (PointF) arrayList.get(0);
        ArrayList arrayList4 = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) arrayList.get(i);
            int i4 = i - 1;
            arrayList4.add(new C4472a(AbstractC4672g.a((PointF) arrayList.get(i4), (PointF) arrayList3.get(i4)), AbstractC4672g.a(pointF2, (PointF) arrayList2.get(i)), pointF2));
        }
        if (z6) {
            PointF pointF3 = (PointF) arrayList.get(0);
            int i6 = size - 1;
            arrayList4.add(new C4472a(AbstractC4672g.a((PointF) arrayList.get(i6), (PointF) arrayList3.get(i6)), AbstractC4672g.a(pointF3, (PointF) arrayList2.get(0)), pointF3));
        }
        return new g1.k(pointF, z6, arrayList4);
    }
}
