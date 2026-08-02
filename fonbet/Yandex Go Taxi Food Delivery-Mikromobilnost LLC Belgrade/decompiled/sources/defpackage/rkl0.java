package defpackage;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.a;
import androidx.constraintlayout.core.widgets.analyzer.c;
import androidx.constraintlayout.core.widgets.analyzer.e;
import androidx.constraintlayout.core.widgets.analyzer.g;
import androidx.constraintlayout.core.widgets.analyzer.h;
import androidx.constraintlayout.core.widgets.d;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class rkl0 {
    public final h a;
    public final ArrayList b = new ArrayList();

    public rkl0(h hVar) {
        this.a = null;
        this.a = hVar;
    }

    public static long c(a aVar, long j) {
        h hVar = aVar.d;
        ArrayList arrayList = aVar.k;
        if (hVar instanceof c) {
            return j;
        }
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            xwi xwiVar = (xwi) arrayList.get(i);
            if (xwiVar instanceof a) {
                a aVar2 = (a) xwiVar;
                if (aVar2.d != hVar) {
                    j2 = Math.min(j2, c(aVar2, aVar2.f + j));
                }
            }
        }
        a aVar3 = hVar.i;
        a aVar4 = hVar.h;
        if (aVar != aVar3) {
            return j2;
        }
        long j3 = j - hVar.j();
        return Math.min(Math.min(j2, c(aVar4, j3)), j3 - aVar4.f);
    }

    public static long d(a aVar, long j) {
        h hVar = aVar.d;
        ArrayList arrayList = aVar.k;
        if (hVar instanceof c) {
            return j;
        }
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            xwi xwiVar = (xwi) arrayList.get(i);
            if (xwiVar instanceof a) {
                a aVar2 = (a) xwiVar;
                if (aVar2.d != hVar) {
                    j2 = Math.max(j2, d(aVar2, aVar2.f + j));
                }
            }
        }
        a aVar3 = hVar.h;
        a aVar4 = hVar.i;
        if (aVar != aVar3) {
            return j2;
        }
        long j3 = hVar.j() + j;
        return Math.max(Math.max(j2, d(aVar4, j3)), j3 - aVar4.f);
    }

    public final void a(h hVar) {
        this.b.add(hVar);
    }

    public final long b(d dVar, int i) {
        float f;
        h hVar = this.a;
        if (!(hVar instanceof n89) ? i != 0 ? (hVar instanceof g) : (hVar instanceof e) : ((n89) hVar).f == i) {
            return 0L;
        }
        a aVar = (i == 0 ? dVar.d : dVar.e).h;
        a aVar2 = (i == 0 ? dVar.d : dVar.e).i;
        a aVar3 = hVar.h;
        a aVar4 = hVar.h;
        a aVar5 = hVar.i;
        boolean contains = aVar3.l.contains(aVar);
        boolean contains2 = aVar5.l.contains(aVar2);
        long j = hVar.j();
        if (!contains || !contains2) {
            if (contains) {
                return Math.max(d(aVar4, aVar4.f), aVar4.f + j);
            }
            if (contains2) {
                return Math.max(-c(aVar5, aVar5.f), (-aVar5.f) + j);
            }
            return (hVar.j() + aVar4.f) - aVar5.f;
        }
        long d = d(aVar4, 0L);
        long c = c(aVar5, 0L);
        long j2 = d - j;
        int i2 = aVar5.f;
        if (j2 >= (-i2)) {
            j2 += i2;
        }
        long j3 = aVar4.f;
        long j4 = ((-c) - j) - j3;
        if (j4 >= j3) {
            j4 -= j3;
        }
        ConstraintWidget constraintWidget = hVar.b;
        if (i == 0) {
            f = constraintWidget.f0;
        } else if (i == 1) {
            f = constraintWidget.g0;
        } else {
            constraintWidget.getClass();
            f = -1.0f;
        }
        float f2 = f > 0.0f ? (long) ((j2 / (1.0f - f)) + (j4 / f)) : 0L;
        return (aVar4.f + ((((long) ((f2 * f) + 0.5f)) + j) + ((long) g8e.b(1.0f, f, f2, 0.5f)))) - aVar5.f;
    }
}
