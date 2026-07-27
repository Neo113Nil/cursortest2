package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import t0.AbstractC4990E;

/* loaded from: classes2.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f25421a;

    /* renamed from: b, reason: collision with root package name */
    public int f25422b;

    /* renamed from: c, reason: collision with root package name */
    public int f25423c;

    /* renamed from: d, reason: collision with root package name */
    public int f25424d;

    /* renamed from: e, reason: collision with root package name */
    public int f25425e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f25426f;

    public I() {
        this.f25426f = new H[5];
        this.f25421a = new ArrayList();
        this.f25422b = -1;
    }

    public void a() {
        View view = (View) this.f25421a.get(r0.size() - 1);
        t0.W w6 = (t0.W) view.getLayoutParams();
        this.f25423c = ((StaggeredGridLayoutManager) this.f25426f).f5288r.b(view);
        w6.getClass();
    }

    public void b() {
        this.f25421a.clear();
        this.f25422b = Integer.MIN_VALUE;
        this.f25423c = Integer.MIN_VALUE;
        this.f25424d = 0;
    }

    public int c() {
        return ((StaggeredGridLayoutManager) this.f25426f).f5293w ? e(r1.size() - 1, -1) : e(0, this.f25421a.size());
    }

    public int d() {
        return ((StaggeredGridLayoutManager) this.f25426f).f5293w ? e(0, this.f25421a.size()) : e(r1.size() - 1, -1);
    }

    public int e(int i, int i6) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f25426f;
        int k9 = staggeredGridLayoutManager.f5288r.k();
        int g4 = staggeredGridLayoutManager.f5288r.g();
        int i9 = i6 > i ? 1 : -1;
        while (i != i6) {
            View view = (View) this.f25421a.get(i);
            int e9 = staggeredGridLayoutManager.f5288r.e(view);
            int b9 = staggeredGridLayoutManager.f5288r.b(view);
            boolean z3 = e9 <= g4;
            boolean z6 = b9 >= k9;
            if (z3 && z6 && (e9 < k9 || b9 > g4)) {
                return AbstractC4990E.H(view);
            }
            i += i9;
        }
        return -1;
    }

    public int f(int i) {
        int i6 = this.f25423c;
        if (i6 != Integer.MIN_VALUE) {
            return i6;
        }
        if (this.f25421a.size() == 0) {
            return i;
        }
        a();
        return this.f25423c;
    }

    public View g(int i, int i6) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f25426f;
        ArrayList arrayList = this.f25421a;
        View view = null;
        if (i6 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f5293w && AbstractC4990E.H(view2) >= i) || ((!staggeredGridLayoutManager.f5293w && AbstractC4990E.H(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i9 = 0;
        while (i9 < size2) {
            View view3 = (View) arrayList.get(i9);
            if ((staggeredGridLayoutManager.f5293w && AbstractC4990E.H(view3) <= i) || ((!staggeredGridLayoutManager.f5293w && AbstractC4990E.H(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i9++;
            view = view3;
        }
        return view;
    }

    public int h(int i) {
        int i6 = this.f25422b;
        if (i6 != Integer.MIN_VALUE) {
            return i6;
        }
        if (this.f25421a.size() == 0) {
            return i;
        }
        View view = (View) this.f25421a.get(0);
        t0.W w6 = (t0.W) view.getLayoutParams();
        this.f25422b = ((StaggeredGridLayoutManager) this.f25426f).f5288r.e(view);
        w6.getClass();
        return this.f25422b;
    }

    public void i(float f3, int i) {
        H h9;
        int i6 = this.f25422b;
        ArrayList arrayList = this.f25421a;
        if (i6 != 1) {
            Collections.sort(arrayList, C3004c.f29388F);
            this.f25422b = 1;
        }
        int i9 = this.f25425e;
        H[] hArr = (H[]) this.f25426f;
        if (i9 > 0) {
            int i10 = i9 - 1;
            this.f25425e = i10;
            h9 = hArr[i10];
        } else {
            h9 = new H();
        }
        int i11 = this.f25423c;
        this.f25423c = i11 + 1;
        h9.f25197a = i11;
        h9.f25198b = i;
        h9.f25199c = f3;
        arrayList.add(h9);
        this.f25424d += i;
        while (true) {
            int i12 = this.f25424d;
            if (i12 <= 2000) {
                return;
            }
            int i13 = i12 - 2000;
            H h10 = (H) arrayList.get(0);
            int i14 = h10.f25198b;
            if (i14 <= i13) {
                this.f25424d -= i14;
                arrayList.remove(0);
                int i15 = this.f25425e;
                if (i15 < 5) {
                    this.f25425e = i15 + 1;
                    hArr[i15] = h10;
                }
            } else {
                h10.f25198b = i14 - i13;
                this.f25424d -= i13;
            }
        }
    }

    public float j() {
        int i = this.f25422b;
        ArrayList arrayList = this.f25421a;
        if (i != 0) {
            Collections.sort(arrayList, C3004c.f29387E);
            this.f25422b = 0;
        }
        float f3 = this.f25424d;
        int i6 = 0;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            float f9 = 0.5f * f3;
            H h9 = (H) arrayList.get(i9);
            i6 += h9.f25198b;
            if (i6 >= f9) {
                return h9.f25199c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((H) arrayList.get(arrayList.size() - 1)).f25199c;
    }

    public I(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f25426f = staggeredGridLayoutManager;
        this.f25421a = new ArrayList();
        this.f25422b = Integer.MIN_VALUE;
        this.f25423c = Integer.MIN_VALUE;
        this.f25424d = 0;
        this.f25425e = i;
    }
}
