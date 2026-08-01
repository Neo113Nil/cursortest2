package k0;

import android.view.View;
import java.util.List;

/* renamed from: k0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0207v {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3602a;

    /* renamed from: b, reason: collision with root package name */
    public int f3603b;

    /* renamed from: c, reason: collision with root package name */
    public int f3604c;

    /* renamed from: d, reason: collision with root package name */
    public int f3605d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f3606f;

    /* renamed from: g, reason: collision with root package name */
    public int f3607g;

    /* renamed from: h, reason: collision with root package name */
    public int f3608h;
    public int i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public List f3609k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3610l;

    public final void a(View view) {
        int c2;
        int size = this.f3609k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((b0) this.f3609k.get(i2)).f3449a;
            L l2 = (L) view3.getLayoutParams();
            if (view3 != view && !l2.f3396a.j() && (c2 = (l2.f3396a.c() - this.f3605d) * this.e) >= 0 && c2 < i) {
                view2 = view3;
                if (c2 == 0) {
                    break;
                } else {
                    i = c2;
                }
            }
        }
        if (view2 == null) {
            this.f3605d = -1;
        } else {
            this.f3605d = ((L) view2.getLayoutParams()).f3396a.c();
        }
    }

    public final View b(Q q2) {
        List list = this.f3609k;
        if (list == null) {
            View view = q2.k(this.f3605d, Long.MAX_VALUE).f3449a;
            this.f3605d += this.e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((b0) this.f3609k.get(i)).f3449a;
            L l2 = (L) view2.getLayoutParams();
            if (!l2.f3396a.j() && this.f3605d == l2.f3396a.c()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
