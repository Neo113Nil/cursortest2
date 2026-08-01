package k0;

import O.C0038n;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3369a;

    public /* synthetic */ B(RecyclerView recyclerView) {
        this.f3369a = recyclerView;
    }

    public void a(C0187a c0187a) {
        int i = c0187a.f3433a;
        RecyclerView recyclerView = this.f3369a;
        if (i == 1) {
            recyclerView.f2162n.Z(c0187a.f3434b, c0187a.f3436d);
            return;
        }
        if (i == 2) {
            recyclerView.f2162n.c0(c0187a.f3434b, c0187a.f3436d);
        } else if (i == 4) {
            recyclerView.f2162n.d0(c0187a.f3434b, c0187a.f3436d);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f2162n.b0(c0187a.f3434b, c0187a.f3436d);
        }
    }

    public b0 b(int i) {
        RecyclerView recyclerView = this.f3369a;
        int h2 = recyclerView.f2148f.h();
        int i2 = 0;
        b0 b0Var = null;
        while (true) {
            if (i2 >= h2) {
                break;
            }
            b0 L2 = RecyclerView.L(recyclerView.f2148f.g(i2));
            if (L2 != null && !L2.j() && L2.f3451c == i) {
                if (!recyclerView.f2148f.f3471c.contains(L2.f3449a)) {
                    b0Var = L2;
                    break;
                }
                b0Var = L2;
            }
            i2++;
        }
        if (b0Var == null) {
            return null;
        }
        if (!recyclerView.f2148f.f3471c.contains(b0Var.f3449a)) {
            return b0Var;
        }
        if (RecyclerView.f2109A0) {
            Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
        }
        return null;
    }

    public void c(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f3369a;
        int h2 = recyclerView.f2148f.h();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < h2; i6++) {
            View g2 = recyclerView.f2148f.g(i6);
            b0 L2 = RecyclerView.L(g2);
            if (L2 != null && !L2.q() && (i4 = L2.f3451c) >= i && i4 < i5) {
                L2.a(2);
                if (obj == null) {
                    L2.a(1024);
                } else if ((1024 & L2.j) == 0) {
                    if (L2.f3456k == null) {
                        ArrayList arrayList = new ArrayList();
                        L2.f3456k = arrayList;
                        L2.f3457l = Collections.unmodifiableList(arrayList);
                    }
                    L2.f3456k.add(obj);
                }
                ((L) g2.getLayoutParams()).f3398c = true;
            }
        }
        Q q2 = recyclerView.f2143c;
        ArrayList arrayList2 = q2.f3409c;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            b0 b0Var = (b0) arrayList2.get(size);
            if (b0Var != null && (i3 = b0Var.f3451c) >= i && i3 < i5) {
                b0Var.a(2);
                q2.g(size);
            }
        }
        recyclerView.f2157k0 = true;
    }

    public void d(int i, int i2) {
        RecyclerView recyclerView = this.f3369a;
        int h2 = recyclerView.f2148f.h();
        for (int i3 = 0; i3 < h2; i3++) {
            b0 L2 = RecyclerView.L(recyclerView.f2148f.g(i3));
            if (L2 != null && !L2.q() && L2.f3451c >= i) {
                if (RecyclerView.f2109A0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i3 + " holder " + L2 + " now at position " + (L2.f3451c + i2));
                }
                L2.n(i2, false);
                recyclerView.f2151g0.f3426f = true;
            }
        }
        ArrayList arrayList = recyclerView.f2143c.f3409c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            b0 b0Var = (b0) arrayList.get(i4);
            if (b0Var != null && b0Var.f3451c >= i) {
                if (RecyclerView.f2109A0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i4 + " holder " + b0Var + " now at position " + (b0Var.f3451c + i2));
                }
                b0Var.n(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f2155j0 = true;
    }

    public void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        RecyclerView recyclerView = this.f3369a;
        int h2 = recyclerView.f2148f.h();
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        boolean z2 = false;
        for (int i11 = 0; i11 < h2; i11++) {
            b0 L2 = RecyclerView.L(recyclerView.f2148f.g(i11));
            if (L2 != null && (i10 = L2.f3451c) >= i4 && i10 <= i3) {
                if (RecyclerView.f2109A0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i11 + " holder " + L2);
                }
                if (L2.f3451c == i) {
                    L2.n(i2 - i, false);
                } else {
                    L2.n(i5, false);
                }
                recyclerView.f2151g0.f3426f = true;
            }
        }
        Q q2 = recyclerView.f2143c;
        q2.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
            i8 = -1;
        } else {
            i6 = i;
            i7 = i2;
            i8 = 1;
        }
        ArrayList arrayList = q2.f3409c;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            b0 b0Var = (b0) arrayList.get(i12);
            if (b0Var != null && (i9 = b0Var.f3451c) >= i7 && i9 <= i6) {
                if (i9 == i) {
                    b0Var.n(i2 - i, z2);
                } else {
                    b0Var.n(i8, z2);
                }
                if (RecyclerView.f2109A0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i12 + " holder " + b0Var);
                }
            }
            i12++;
            z2 = false;
        }
        recyclerView.requestLayout();
        recyclerView.f2155j0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(b0 b0Var, C0038n c0038n, C0038n c0038n2) {
        boolean z2;
        RecyclerView recyclerView = this.f3369a;
        recyclerView.getClass();
        b0Var.p(false);
        C0197k c0197k = (C0197k) recyclerView.f2127L;
        if (c0038n != null) {
            c0197k.getClass();
            int i = c0038n.f825a;
            int i2 = c0038n2.f825a;
            if (i != i2 || c0038n.f826b != c0038n2.f826b) {
                z2 = c0197k.g(b0Var, i, c0038n.f826b, i2, c0038n2.f826b);
                if (z2) {
                    return;
                }
                recyclerView.V();
                return;
            }
        }
        c0197k.l(b0Var);
        b0Var.f3449a.setAlpha(RecyclerView.f2111C0);
        c0197k.i.add(b0Var);
        z2 = true;
        if (z2) {
        }
    }

    public void g(b0 b0Var, C0038n c0038n, C0038n c0038n2) {
        boolean z2;
        RecyclerView recyclerView = this.f3369a;
        recyclerView.f2143c.l(b0Var);
        recyclerView.h(b0Var);
        b0Var.p(false);
        C0197k c0197k = (C0197k) recyclerView.f2127L;
        c0197k.getClass();
        int i = c0038n.f825a;
        int i2 = c0038n.f826b;
        View view = b0Var.f3449a;
        int left = c0038n2 == null ? view.getLeft() : c0038n2.f825a;
        int top = c0038n2 == null ? view.getTop() : c0038n2.f826b;
        if (b0Var.j() || (i == left && i2 == top)) {
            c0197k.l(b0Var);
            c0197k.f3526h.add(b0Var);
            z2 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z2 = c0197k.g(b0Var, i, i2, left, top);
        }
        if (z2) {
            recyclerView.V();
        }
    }

    public void h(int i) {
        RecyclerView recyclerView = this.f3369a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.L(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
