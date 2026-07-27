package Z0;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import u.AbstractC5088e;

/* loaded from: classes.dex */
public final class l implements m, j {

    /* renamed from: a, reason: collision with root package name */
    public final Path f4137a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Path f4138b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f4139c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f4140d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final e1.g f4141e;

    public l(e1.g gVar) {
        gVar.getClass();
        this.f4141e = gVar;
    }

    public final void a(Path.Op op) {
        Matrix matrix;
        Matrix matrix2;
        Path path = this.f4138b;
        path.reset();
        Path path2 = this.f4137a;
        path2.reset();
        ArrayList arrayList = this.f4140d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            m mVar = (m) arrayList.get(size);
            if (mVar instanceof d) {
                d dVar = (d) mVar;
                ArrayList arrayList2 = (ArrayList) dVar.e();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path g9 = ((m) arrayList2.get(size2)).g();
                    a1.r rVar = dVar.f4087l;
                    if (rVar != null) {
                        matrix2 = rVar.e();
                    } else {
                        matrix2 = dVar.f4080d;
                        matrix2.reset();
                    }
                    g9.transform(matrix2);
                    path.addPath(g9);
                }
            } else {
                path.addPath(mVar.g());
            }
        }
        int i = 0;
        m mVar2 = (m) arrayList.get(0);
        if (mVar2 instanceof d) {
            d dVar2 = (d) mVar2;
            List e6 = dVar2.e();
            while (true) {
                ArrayList arrayList3 = (ArrayList) e6;
                if (i >= arrayList3.size()) {
                    break;
                }
                Path g10 = ((m) arrayList3.get(i)).g();
                a1.r rVar2 = dVar2.f4087l;
                if (rVar2 != null) {
                    matrix = rVar2.e();
                } else {
                    matrix = dVar2.f4080d;
                    matrix.reset();
                }
                g10.transform(matrix);
                path2.addPath(g10);
                i++;
            }
        } else {
            path2.set(mVar2.g());
        }
        this.f4139c.op(path2, path, op);
    }

    @Override // Z0.c
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4140d;
            if (i >= arrayList.size()) {
                return;
            }
            ((m) arrayList.get(i)).b(list, list2);
            i++;
        }
    }

    @Override // Z0.j
    public final void e(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c cVar = (c) listIterator.previous();
            if (cVar instanceof m) {
                this.f4140d.add((m) cVar);
                listIterator.remove();
            }
        }
    }

    @Override // Z0.m
    public final Path g() {
        Path path = this.f4139c;
        path.reset();
        e1.g gVar = this.f4141e;
        if (!gVar.f37267b) {
            int d2 = AbstractC5088e.d(gVar.f37266a);
            if (d2 == 0) {
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.f4140d;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((m) arrayList.get(i)).g());
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
