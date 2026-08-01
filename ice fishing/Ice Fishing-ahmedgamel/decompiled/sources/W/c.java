package W;

import P.k;
import android.graphics.Rect;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class c implements Comparator {

    /* renamed from: n, reason: collision with root package name */
    public final Rect f3374n = new Rect();

    /* renamed from: u, reason: collision with root package name */
    public final Rect f3375u = new Rect();

    /* renamed from: v, reason: collision with root package name */
    public final boolean f3376v;

    /* renamed from: w, reason: collision with root package name */
    public final a4.e f3377w;

    public c(boolean z3, a4.e eVar) {
        this.f3376v = z3;
        this.f3377w = eVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f3377w.getClass();
        Rect rect = this.f3374n;
        ((k) obj).f(rect);
        Rect rect2 = this.f3375u;
        ((k) obj2).f(rect2);
        int i = rect.top;
        int i6 = rect2.top;
        if (i < i6) {
            return -1;
        }
        if (i > i6) {
            return 1;
        }
        int i9 = rect.left;
        int i10 = rect2.left;
        boolean z3 = this.f3376v;
        if (i9 < i10) {
            return z3 ? 1 : -1;
        }
        if (i9 > i10) {
            return z3 ? -1 : 1;
        }
        int i11 = rect.bottom;
        int i12 = rect2.bottom;
        if (i11 < i12) {
            return -1;
        }
        if (i11 > i12) {
            return 1;
        }
        int i13 = rect.right;
        int i14 = rect2.right;
        if (i13 < i14) {
            return z3 ? 1 : -1;
        }
        if (i13 > i14) {
            return z3 ? -1 : 1;
        }
        return 0;
    }
}
