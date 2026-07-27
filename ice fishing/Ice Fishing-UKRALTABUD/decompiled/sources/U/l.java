package U;

import android.graphics.Rect;
import w.S;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final R.b f1035a;

    /* renamed from: b, reason: collision with root package name */
    public final S f1036b;

    public l(R.b bVar, S s2) {
        E0.i.e(s2, "_windowInsetsCompat");
        this.f1035a = bVar;
        this.f1036b = s2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        E0.i.c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        l lVar = (l) obj;
        return E0.i.a(this.f1035a, lVar.f1035a) && E0.i.a(this.f1036b, lVar.f1036b);
    }

    public final int hashCode() {
        return this.f1036b.hashCode() + (this.f1035a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.f1035a + ", windowInsetsCompat=" + this.f1036b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(Rect rect, S s2) {
        this(new R.b(rect), s2);
        E0.i.e(s2, "insets");
    }
}
