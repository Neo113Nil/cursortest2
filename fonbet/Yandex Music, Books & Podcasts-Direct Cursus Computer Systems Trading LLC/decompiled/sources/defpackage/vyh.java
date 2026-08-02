package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class vyh implements hak, gpd {
    public final Path a = new Path();
    public final Path b = new Path();
    public final Path c = new Path();
    public final ArrayList d = new ArrayList();
    public final uyh e;

    public vyh(uyh uyhVar) {
        this.e = uyhVar;
    }

    public final void a(Path.Op op) {
        Path path = this.b;
        path.reset();
        Path path2 = this.a;
        path2.reset();
        ArrayList arrayList = this.d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            hak hakVar = (hak) arrayList.get(size);
            if (hakVar instanceof bc6) {
                bc6 bc6Var = (bc6) hakVar;
                ArrayList arrayList2 = (ArrayList) bc6Var.e();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path path3 = ((hak) arrayList2.get(size2)).getPath();
                    Matrix matrix = bc6Var.d;
                    z6t z6tVar = bc6Var.l;
                    if (z6tVar != null) {
                        matrix = z6tVar.e();
                    } else {
                        matrix.reset();
                    }
                    path3.transform(matrix);
                    path.addPath(path3);
                }
            } else {
                path.addPath(hakVar.getPath());
            }
        }
        int i = 0;
        hak hakVar2 = (hak) arrayList.get(0);
        if (hakVar2 instanceof bc6) {
            bc6 bc6Var2 = (bc6) hakVar2;
            List e = bc6Var2.e();
            while (true) {
                ArrayList arrayList3 = (ArrayList) e;
                if (i >= arrayList3.size()) {
                    break;
                }
                Path path4 = ((hak) arrayList3.get(i)).getPath();
                Matrix matrix2 = bc6Var2.d;
                z6t z6tVar2 = bc6Var2.l;
                if (z6tVar2 != null) {
                    matrix2 = z6tVar2.e();
                } else {
                    matrix2.reset();
                }
                path4.transform(matrix2);
                path2.addPath(path4);
                i++;
            }
        } else {
            path2.set(hakVar2.getPath());
        }
        this.c.op(path2, path, op);
    }

    @Override // defpackage.lb6
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return;
            }
            ((hak) arrayList.get(i)).b(list, list2);
            i++;
        }
    }

    @Override // defpackage.gpd
    public final void e(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            lb6 lb6Var = (lb6) listIterator.previous();
            if (lb6Var instanceof hak) {
                this.d.add((hak) lb6Var);
                listIterator.remove();
            }
        }
    }

    @Override // defpackage.hak
    public final Path getPath() {
        Path path = this.c;
        path.reset();
        uyh uyhVar = this.e;
        if (!uyhVar.b) {
            int D = ouj.D(uyhVar.a);
            if (D == 0) {
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.d;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((hak) arrayList.get(i)).getPath());
                    i++;
                }
            } else {
                if (D == 1) {
                    a(Path.Op.UNION);
                    return path;
                }
                if (D == 2) {
                    a(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (D == 3) {
                    a(Path.Op.INTERSECT);
                    return path;
                }
                if (D == 4) {
                    a(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }
}
