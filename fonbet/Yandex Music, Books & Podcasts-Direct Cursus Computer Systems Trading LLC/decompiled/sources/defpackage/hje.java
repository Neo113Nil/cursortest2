package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* loaded from: classes3.dex */
public final class hje {
    public final int a;
    public final m2k b;
    public final mm6 c;
    public final Function1 d;
    public int e;
    public IntRange f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;

    public hje(int i, m2k m2kVar, mm6 mm6Var, int i2, IntRange intRange, Function1 function1) {
        function1.getClass();
        this.a = i;
        this.b = m2kVar;
        this.c = mm6Var;
        this.d = function1;
        this.e = i2;
        this.f = intRange;
        function1.invoke(intRange);
        ArrayList arrayList = new ArrayList(i);
        int i3 = 0;
        while (i3 < i) {
            int i4 = this.e;
            m2k m2kVar2 = this.b;
            arrayList.add(bmq.a(i3 == i4 ? m2kVar2.f : m2kVar2.e));
            i3++;
        }
        this.g = arrayList;
        int i5 = this.a;
        ArrayList arrayList2 = new ArrayList(i5);
        for (int i6 = 0; i6 < i5; i6++) {
            arrayList2.add(vq2.a(a(i6)));
        }
        this.h = arrayList2;
        int i7 = this.a;
        ArrayList arrayList3 = new ArrayList(i7);
        for (int i8 = 0; i8 < i7; i8++) {
            m2k m2kVar3 = this.b;
            float f = m2kVar3.a;
            arrayList3.add(new fk0(new enj(swf.i(((i8 - intRange.a) * m2kVar3.i) + f, f)), azt.f, null, 12));
        }
        this.i = arrayList3;
    }

    public final float a(int i) {
        m2k m2kVar = this.b;
        float f = m2kVar.b;
        float f2 = m2kVar.c;
        float f3 = m2kVar.a;
        int i2 = m2kVar.g;
        int i3 = this.a;
        if (i3 <= i2) {
            return f3;
        }
        IntRange intRange = this.f;
        int i4 = intRange.a;
        if (i == i4) {
            return i4 != 0 ? f2 : f3;
        }
        int i5 = i4 + 1;
        if (i == i5) {
            return (this.e == i || i5 == 1) ? f3 : f;
        }
        int i6 = intRange.b;
        if (i == i6) {
            return i6 != i3 - 1 ? f2 : f3;
        }
        if (i == i6 - 1) {
            return (this.e == i || i6 - 1 == i3 + (-2)) ? f3 : f;
        }
        if (i > i6 || i4 > i) {
            return 0.0f;
        }
        return f3;
    }

    public final void b(int i) {
        int i2 = this.e;
        this.e = i;
        int i3 = this.a;
        m2k m2kVar = this.b;
        IntRange A = etn.A(i, i3, m2kVar);
        this.f = A;
        this.d.invoke(A);
        Continuation continuation = null;
        eje ejeVar = new eje(this, i2, continuation, 0);
        mm6 mm6Var = this.c;
        x97.y(mm6Var, null, null, ejeVar, 3);
        x97.y(mm6Var, null, null, new eje(this, i, continuation, 1), 3);
        d();
        Iterator it = this.i.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i5 = i4 + 1;
            if (i4 < 0) {
                u75.n();
                throw null;
            }
            fk0 fk0Var = (fk0) next;
            float f = m2kVar.a;
            x97.y(mm6Var, null, null, new gje(fk0Var, swf.i(((i4 - this.f.a) * m2kVar.i) + f, f), continuation, 0), 3);
            i4 = i5;
        }
    }

    public final void c(float f) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            fk0 fk0Var = (fk0) it.next();
            x97.y(this.c, null, null, new gje(fk0Var, swf.i(enj.e(((enj) fk0Var.e.getValue()).a) + f, enj.f(((enj) fk0Var.e.getValue()).a)), null, 1), 3);
        }
    }

    public final void d() {
        Iterator it = this.h.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            Continuation continuation = null;
            if (i < 0) {
                u75.n();
                throw null;
            }
            x97.y(this.c, null, null, new rs((fk0) next, this, i, continuation, 3), 3);
            i = i2;
        }
    }
}
