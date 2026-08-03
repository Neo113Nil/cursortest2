package y1;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Comparator;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c1 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final s.g0 f8488a;

    /* renamed from: b, reason: collision with root package name */
    public final s.h0 f8489b;

    /* renamed from: c, reason: collision with root package name */
    public final s.g0 f8490c;

    /* renamed from: d, reason: collision with root package name */
    public final s.z f8491d;

    public c1(x7.f fVar) {
        long[] jArr = s.o0.f6312a;
        this.f8488a = new s.g0();
        int i10 = s.p0.f6316a;
        this.f8489b = new s.h0();
        this.f8490c = new s.g0();
        s.z zVar = s.k0.f6300a;
        this.f8491d = new s.z();
    }

    public final void a(ArrayList arrayList, ViewGroup viewGroup) {
        s.z zVar;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            zVar = this.f8491d;
            if (i10 >= size) {
                break;
            }
            zVar.h(i10, (View) arrayList.get(i10));
            i10++;
        }
        int size2 = arrayList.size() - 1;
        s.h0 h0Var = this.f8489b;
        s.g0 g0Var = this.f8488a;
        if (size2 >= 0) {
            while (true) {
                int i11 = size2 - 1;
                View view = (View) arrayList.get(size2);
                int nextFocusForwardId = view.getNextFocusForwardId();
                View g8 = (nextFocusForwardId == 0 || nextFocusForwardId == -1) ? null : e0.g(view, viewGroup, 2);
                if (g8 != null && zVar.d(g8) >= 0) {
                    g0Var.m(view, g8);
                    h0Var.a(g8);
                }
                if (i11 < 0) {
                    break;
                } else {
                    size2 = i11;
                }
            }
        }
        int size3 = arrayList.size() - 1;
        if (size3 < 0) {
            return;
        }
        while (true) {
            int i12 = size3 - 1;
            View view2 = (View) arrayList.get(size3);
            if (((View) g0Var.g(view2)) != null && !h0Var.c(view2)) {
                View view3 = view2;
                while (view2 != null) {
                    s.g0 g0Var2 = this.f8490c;
                    View view4 = (View) g0Var2.g(view2);
                    if (view4 != null) {
                        if (view4 == view3) {
                            break;
                        }
                        view2 = view3;
                        view3 = view4;
                    }
                    g0Var2.m(view2, view3);
                    view2 = (View) g0Var.g(view2);
                }
            }
            if (i12 < 0) {
                return;
            } else {
                size3 = i12;
            }
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        View view = (View) obj;
        View view2 = (View) obj2;
        if (view == view2) {
            return 0;
        }
        if (view == null) {
            return -1;
        }
        if (view2 == null) {
            return 1;
        }
        s.g0 g0Var = this.f8490c;
        View view3 = (View) g0Var.g(view);
        View view4 = (View) g0Var.g(view2);
        if (view3 == view4 && view3 != null) {
            if (view == view3) {
                return -1;
            }
            return (view2 == view3 || this.f8488a.g(view) == null) ? 1 : -1;
        }
        if (view3 != null) {
            view = view3;
        }
        if (view4 != null) {
            view2 = view4;
        }
        if (view3 == null && view4 == null) {
            return 0;
        }
        s.z zVar = this.f8491d;
        return zVar.e(view) < zVar.e(view2) ? -1 : 1;
    }
}
