package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import t0.AbstractC4987C;
import t0.C5004U;

/* loaded from: classes2.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f26164a;

    /* renamed from: b, reason: collision with root package name */
    public int f26165b;

    /* renamed from: c, reason: collision with root package name */
    public int f26166c;

    /* renamed from: d, reason: collision with root package name */
    public int f26167d;

    /* renamed from: e, reason: collision with root package name */
    public int f26168e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f26169f;

    public I() {
        this.f26169f = new H[5];
        this.f26164a = new ArrayList();
        this.f26165b = -1;
    }

    public void a() {
        View view = (View) this.f26164a.get(r0.size() - 1);
        C5004U c5004u = (C5004U) view.getLayoutParams();
        this.f26166c = ((StaggeredGridLayoutManager) this.f26169f).f5254r.b(view);
        c5004u.getClass();
    }

    public void b() {
        this.f26164a.clear();
        this.f26165b = Integer.MIN_VALUE;
        this.f26166c = Integer.MIN_VALUE;
        this.f26167d = 0;
    }

    public int c() {
        return ((StaggeredGridLayoutManager) this.f26169f).f5259w ? e(r1.size() - 1, -1) : e(0, this.f26164a.size());
    }

    public int d() {
        return ((StaggeredGridLayoutManager) this.f26169f).f5259w ? e(0, this.f26164a.size()) : e(r1.size() - 1, -1);
    }

    public int e(int i, int i4) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f26169f;
        int k9 = staggeredGridLayoutManager.f5254r.k();
        int g9 = staggeredGridLayoutManager.f5254r.g();
        int i6 = i4 > i ? 1 : -1;
        while (i != i4) {
            View view = (View) this.f26164a.get(i);
            int e9 = staggeredGridLayoutManager.f5254r.e(view);
            int b9 = staggeredGridLayoutManager.f5254r.b(view);
            boolean z6 = e9 <= g9;
            boolean z9 = b9 >= k9;
            if (z6 && z9 && (e9 < k9 || b9 > g9)) {
                return AbstractC4987C.H(view);
            }
            i += i6;
        }
        return -1;
    }

    public int f(int i) {
        int i4 = this.f26166c;
        if (i4 != Integer.MIN_VALUE) {
            return i4;
        }
        if (this.f26164a.size() == 0) {
            return i;
        }
        a();
        return this.f26166c;
    }

    public View g(int i, int i4) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f26169f;
        ArrayList arrayList = this.f26164a;
        View view = null;
        if (i4 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f5259w && AbstractC4987C.H(view2) >= i) || ((!staggeredGridLayoutManager.f5259w && AbstractC4987C.H(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i6 = 0;
        while (i6 < size2) {
            View view3 = (View) arrayList.get(i6);
            if ((staggeredGridLayoutManager.f5259w && AbstractC4987C.H(view3) <= i) || ((!staggeredGridLayoutManager.f5259w && AbstractC4987C.H(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i6++;
            view = view3;
        }
        return view;
    }

    public int h(int i) {
        int i4 = this.f26165b;
        if (i4 != Integer.MIN_VALUE) {
            return i4;
        }
        if (this.f26164a.size() == 0) {
            return i;
        }
        View view = (View) this.f26164a.get(0);
        C5004U c5004u = (C5004U) view.getLayoutParams();
        this.f26165b = ((StaggeredGridLayoutManager) this.f26169f).f5254r.e(view);
        c5004u.getClass();
        return this.f26165b;
    }

    public void i(float f2, int i) {
        H h3;
        int i4 = this.f26165b;
        ArrayList arrayList = this.f26164a;
        if (i4 != 1) {
            Collections.sort(arrayList, C3027c.f30171F);
            this.f26165b = 1;
        }
        int i6 = this.f26168e;
        H[] hArr = (H[]) this.f26169f;
        if (i6 > 0) {
            int i9 = i6 - 1;
            this.f26168e = i9;
            h3 = hArr[i9];
        } else {
            h3 = new H();
        }
        int i10 = this.f26166c;
        this.f26166c = i10 + 1;
        h3.f25969a = i10;
        h3.f25970b = i;
        h3.f25971c = f2;
        arrayList.add(h3);
        this.f26167d += i;
        while (true) {
            int i11 = this.f26167d;
            if (i11 <= 2000) {
                return;
            }
            int i12 = i11 - 2000;
            H h9 = (H) arrayList.get(0);
            int i13 = h9.f25970b;
            if (i13 <= i12) {
                this.f26167d -= i13;
                arrayList.remove(0);
                int i14 = this.f26168e;
                if (i14 < 5) {
                    this.f26168e = i14 + 1;
                    hArr[i14] = h9;
                }
            } else {
                h9.f25970b = i13 - i12;
                this.f26167d -= i12;
            }
        }
    }

    public float j() {
        int i = this.f26165b;
        ArrayList arrayList = this.f26164a;
        if (i != 0) {
            Collections.sort(arrayList, C3027c.f30170E);
            this.f26165b = 0;
        }
        float f2 = this.f26167d;
        int i4 = 0;
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            float f9 = 0.5f * f2;
            H h3 = (H) arrayList.get(i6);
            i4 += h3.f25970b;
            if (i4 >= f9) {
                return h3.f25971c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((H) arrayList.get(arrayList.size() - 1)).f25971c;
    }

    public I(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f26169f = staggeredGridLayoutManager;
        this.f26164a = new ArrayList();
        this.f26165b = Integer.MIN_VALUE;
        this.f26166c = Integer.MIN_VALUE;
        this.f26167d = 0;
        this.f26168e = i;
    }
}
