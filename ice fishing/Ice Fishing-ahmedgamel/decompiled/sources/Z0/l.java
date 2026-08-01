package Z0;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import u.AbstractC5049e;

/* loaded from: classes.dex */
public final class l implements m, j {

    /* renamed from: a, reason: collision with root package name */
    public final Path f4060a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Path f4061b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f4062c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f4063d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final e1.g f4064e;

    public l(e1.g gVar) {
        gVar.getClass();
        this.f4064e = gVar;
    }

    public final void a(Path.Op op) {
        Matrix matrix;
        Matrix matrix2;
        Path path = this.f4061b;
        path.reset();
        Path path2 = this.f4060a;
        path2.reset();
        ArrayList arrayList = this.f4063d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            m mVar = (m) arrayList.get(size);
            if (mVar instanceof d) {
                d dVar = (d) mVar;
                ArrayList arrayList2 = (ArrayList) dVar.d();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path f3 = ((m) arrayList2.get(size2)).f();
                    a1.r rVar = dVar.f4010l;
                    if (rVar != null) {
                        matrix2 = rVar.e();
                    } else {
                        matrix2 = dVar.f4003d;
                        matrix2.reset();
                    }
                    f3.transform(matrix2);
                    path.addPath(f3);
                }
            } else {
                path.addPath(mVar.f());
            }
        }
        int i = 0;
        m mVar2 = (m) arrayList.get(0);
        if (mVar2 instanceof d) {
            d dVar2 = (d) mVar2;
            List d2 = dVar2.d();
            while (true) {
                ArrayList arrayList3 = (ArrayList) d2;
                if (i >= arrayList3.size()) {
                    break;
                }
                Path f9 = ((m) arrayList3.get(i)).f();
                a1.r rVar2 = dVar2.f4010l;
                if (rVar2 != null) {
                    matrix = rVar2.e();
                } else {
                    matrix = dVar2.f4003d;
                    matrix.reset();
                }
                f9.transform(matrix);
                path2.addPath(f9);
                i++;
            }
        } else {
            path2.set(mVar2.f());
        }
        this.f4062c.op(path2, path, op);
    }

    @Override // Z0.c
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4063d;
            if (i >= arrayList.size()) {
                return;
            }
            ((m) arrayList.get(i)).b(list, list2);
            i++;
        }
    }

    @Override // Z0.j
    public final void d(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c cVar = (c) listIterator.previous();
            if (cVar instanceof m) {
                this.f4063d.add((m) cVar);
                listIterator.remove();
            }
        }
    }

    @Override // Z0.m
    public final Path f() {
        Path path = this.f4062c;
        path.reset();
        e1.g gVar = this.f4064e;
        if (!gVar.f37136b) {
            int d2 = AbstractC5049e.d(gVar.f37135a);
            if (d2 == 0) {
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.f4063d;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((m) arrayList.get(i)).f());
                    i++;
                }
            } else {
                if (d2 == 1) {
                    a(Path.Op.UNION);
                    return path;
                }
                if (d2 == 2) {
                    a(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (d2 == 3) {
                    a(Path.Op.INTERSECT);
                    return path;
                }
                if (d2 == 4) {
                    a(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }
}
