package W;

import P.k;
import android.graphics.Rect;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class c implements Comparator {

    /* renamed from: n, reason: collision with root package name */
    public final Rect f3504n = new Rect();

    /* renamed from: u, reason: collision with root package name */
    public final Rect f3505u = new Rect();

    /* renamed from: v, reason: collision with root package name */
    public final boolean f3506v;

    /* renamed from: w, reason: collision with root package name */
    public final G3.e f3507w;

    public c(boolean z6, G3.e eVar) {
        this.f3506v = z6;
        this.f3507w = eVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f3507w.getClass();
        Rect rect = this.f3504n;
        ((k) obj).f(rect);
        Rect rect2 = this.f3505u;
        ((k) obj2).f(rect2);
        int i = rect.top;
        int i4 = rect2.top;
        if (i < i4) {
            return -1;
        }
        if (i > i4) {
            return 1;
        }
        int i6 = rect.left;
        int i9 = rect2.left;
        boolean z6 = this.f3506v;
        if (i6 < i9) {
            return z6 ? 1 : -1;
        }
        if (i6 > i9) {
            return z6 ? -1 : 1;
        }
        int i10 = rect.bottom;
        int i11 = rect2.bottom;
        if (i10 < i11) {
            return -1;
        }
        if (i10 > i11) {
            return 1;
        }
        int i12 = rect.right;
        int i13 = rect2.right;
        if (i12 < i13) {
            return z6 ? 1 : -1;
        }
        if (i12 > i13) {
            return z6 ? -1 : 1;
        }
        return 0;
    }
}
