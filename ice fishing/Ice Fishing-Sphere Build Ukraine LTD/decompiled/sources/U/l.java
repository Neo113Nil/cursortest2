package U;

import android.graphics.Rect;
import w.S;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final R.b f1043a;

    /* renamed from: b, reason: collision with root package name */
    public final S f1044b;

    public l(R.b bVar, S s2) {
        E0.i.e(s2, "_windowInsetsCompat");
        this.f1043a = bVar;
        this.f1044b = s2;
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
        return E0.i.a(this.f1043a, lVar.f1043a) && E0.i.a(this.f1044b, lVar.f1044b);
    }

    public final int hashCode() {
        return this.f1044b.hashCode() + (this.f1043a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.f1043a + ", windowInsetsCompat=" + this.f1044b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(Rect rect, S s2) {
        this(new R.b(rect), s2);
        E0.i.e(s2, "insets");
    }
}
