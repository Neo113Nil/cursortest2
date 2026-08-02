package defpackage;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class ywq {
    public static final wwq g = new wwq(0);
    public static final wwq h = new wwq(1);
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public final Object f;

    public ywq(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f = staggeredGridLayoutManager;
        this.a = new ArrayList();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
        this.e = i;
    }

    public void a(int i, float f) {
        xwq xwqVar;
        xwq[] xwqVarArr = (xwq[]) this.f;
        int i2 = this.b;
        ArrayList arrayList = this.a;
        if (i2 != 1) {
            Collections.sort(arrayList, g);
            this.b = 1;
        }
        int i3 = this.e;
        if (i3 > 0) {
            int i4 = i3 - 1;
            this.e = i4;
            xwqVar = xwqVarArr[i4];
        } else {
            xwqVar = new xwq();
        }
        int i5 = this.c;
        this.c = i5 + 1;
        xwqVar.a = i5;
        xwqVar.b = i;
        xwqVar.c = f;
        arrayList.add(xwqVar);
        this.d += i;
        while (true) {
            int i6 = this.d;
            if (i6 <= 2000) {
                return;
            }
            int i7 = i6 - 2000;
            xwq xwqVar2 = (xwq) arrayList.get(0);
            int i8 = xwqVar2.b;
            if (i8 <= i7) {
                this.d -= i8;
                arrayList.remove(0);
                int i9 = this.e;
                if (i9 < 5) {
                    this.e = i9 + 1;
                    xwqVarArr[i9] = xwqVar2;
                }
            } else {
                xwqVar2.b = i8 - i7;
                this.d -= i7;
            }
        }
    }

    public void b() {
        View view = (View) vz1.m(this.a, 1);
        iar iarVar = (iar) view.getLayoutParams();
        this.c = ((StaggeredGridLayoutManager) this.f).r.b(view);
        iarVar.getClass();
    }

    public void c() {
        this.a.clear();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public int d() {
        return ((StaggeredGridLayoutManager) this.f).w ? f(r1.size() - 1, -1, false, false, true) : f(0, this.a.size(), false, false, true);
    }

    public int e() {
        return ((StaggeredGridLayoutManager) this.f).w ? f(0, this.a.size(), false, false, true) : f(r1.size() - 1, -1, false, false, true);
    }

    public int f(int i, int i2, boolean z, boolean z2, boolean z3) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f;
        int n = staggeredGridLayoutManager.r.n();
        int g2 = staggeredGridLayoutManager.r.g();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) this.a.get(i);
            int e = staggeredGridLayoutManager.r.e(view);
            int b = staggeredGridLayoutManager.r.b(view);
            boolean z4 = false;
            boolean z5 = !z3 ? e >= g2 : e > g2;
            if (!z3 ? b > n : b >= n) {
                z4 = true;
            }
            if (z5 && z4) {
                if (z && z2) {
                    if (e >= n && b <= g2) {
                        return yon.f0(view);
                    }
                } else {
                    if (z2) {
                        return yon.f0(view);
                    }
                    if (e < n || b > g2) {
                        return yon.f0(view);
                    }
                }
            }
            i += i3;
        }
        return -1;
    }

    public int g(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.a.size() == 0) {
            return i;
        }
        b();
        return this.c;
    }

    public View h(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f;
        View view = null;
        ArrayList arrayList = this.a;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.w && yon.f0(view2) >= i) || ((!staggeredGridLayoutManager.w && yon.f0(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            View view3 = (View) arrayList.get(i3);
            if ((staggeredGridLayoutManager.w && yon.f0(view3) <= i) || ((!staggeredGridLayoutManager.w && yon.f0(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }

    public float i(float f) {
        int i = this.b;
        ArrayList arrayList = this.a;
        if (i != 0) {
            Collections.sort(arrayList, h);
            this.b = 0;
        }
        float f2 = f * this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            xwq xwqVar = (xwq) arrayList.get(i3);
            i2 += xwqVar.b;
            if (i2 >= f2) {
                return xwqVar.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((xwq) vz1.m(arrayList, 1)).c;
    }

    public int j(int i) {
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        iar iarVar = (iar) view.getLayoutParams();
        this.b = ((StaggeredGridLayoutManager) this.f).r.e(view);
        iarVar.getClass();
        return this.b;
    }

    public ywq() {
        this.f = new xwq[5];
        this.a = new ArrayList();
        this.b = -1;
    }
}
