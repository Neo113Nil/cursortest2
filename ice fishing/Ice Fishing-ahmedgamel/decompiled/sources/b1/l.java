package b1;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import u.AbstractC5050e;

/* loaded from: classes.dex */
public final class l implements m, j {

    /* renamed from: a, reason: collision with root package name */
    public final Path f5449a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Path f5450b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f5451c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f5452d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final g1.g f5453e;

    public l(g1.g gVar) {
        gVar.getClass();
        this.f5453e = gVar;
    }

    public final void a(Path.Op op) {
        Matrix matrix;
        Matrix matrix2;
        Path path = this.f5450b;
        path.reset();
        Path path2 = this.f5449a;
        path2.reset();
        ArrayList arrayList = this.f5452d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            m mVar = (m) arrayList.get(size);
            if (mVar instanceof C0520d) {
                C0520d c0520d = (C0520d) mVar;
                ArrayList arrayList2 = (ArrayList) c0520d.f();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path g9 = ((m) arrayList2.get(size2)).g();
                    c1.r rVar = c0520d.f5399l;
                    if (rVar != null) {
                        matrix2 = rVar.e();
                    } else {
                        matrix2 = c0520d.f5392d;
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
        if (mVar2 instanceof C0520d) {
            C0520d c0520d2 = (C0520d) mVar2;
            List f2 = c0520d2.f();
            while (true) {
                ArrayList arrayList3 = (ArrayList) f2;
                if (i >= arrayList3.size()) {
                    break;
                }
                Path g10 = ((m) arrayList3.get(i)).g();
                c1.r rVar2 = c0520d2.f5399l;
                if (rVar2 != null) {
                    matrix = rVar2.e();
                } else {
                    matrix = c0520d2.f5392d;
                    matrix.reset();
                }
                g10.transform(matrix);
                path2.addPath(g10);
                i++;
            }
        } else {
            path2.set(mVar2.g());
        }
        this.f5451c.op(path2, path, op);
    }

    @Override // b1.InterfaceC0519c
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5452d;
            if (i >= arrayList.size()) {
                return;
            }
            ((m) arrayList.get(i)).b(list, list2);
            i++;
        }
    }

    @Override // b1.j
    public final void f(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            InterfaceC0519c interfaceC0519c = (InterfaceC0519c) listIterator.previous();
            if (interfaceC0519c instanceof m) {
                this.f5452d.add((m) interfaceC0519c);
                listIterator.remove();
            }
        }
    }

    @Override // b1.m
    public final Path g() {
        Path path = this.f5451c;
        path.reset();
        g1.g gVar = this.f5453e;
        if (!gVar.f37612b) {
            int d9 = AbstractC5050e.d(gVar.f37611a);
            if (d9 == 0) {
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.f5452d;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((m) arrayList.get(i)).g());
                    i++;
                }
            } else {
                if (d9 == 1) {
                    a(Path.Op.UNION);
                    return path;
                }
                if (d9 == 2) {
                    a(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (d9 == 3) {
                    a(Path.Op.INTERSECT);
                    return path;
                }
                if (d9 == 4) {
                    a(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }
}
