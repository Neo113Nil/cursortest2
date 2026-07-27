package W;

import P.k;
import android.graphics.Rect;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class c implements Comparator {

    /* renamed from: n, reason: collision with root package name */
    public final Rect f3386n = new Rect();

    /* renamed from: u, reason: collision with root package name */
    public final Rect f3387u = new Rect();

    /* renamed from: v, reason: collision with root package name */
    public final boolean f3388v;

    /* renamed from: w, reason: collision with root package name */
    public final C3.e f3389w;

    public c(boolean z8, C3.e eVar) {
        this.f3388v = z8;
        this.f3389w = eVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f3389w.getClass();
        Rect rect = this.f3386n;
        ((k) obj).f(rect);
        Rect rect2 = this.f3387u;
        ((k) obj2).f(rect2);
        int i = rect.top;
        int i4 = rect2.top;
        if (i < i4) {
            return -1;
        }
        if (i > i4) {
            return 1;
        }
        int i9 = rect.left;
        int i10 = rect2.left;
        boolean z8 = this.f3388v;
        if (i9 < i10) {
            return z8 ? 1 : -1;
        }
        if (i9 > i10) {
            return z8 ? -1 : 1;
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
            return z8 ? 1 : -1;
        }
        if (i13 > i14) {
            return z8 ? -1 : 1;
        }
        return 0;
    }
}
