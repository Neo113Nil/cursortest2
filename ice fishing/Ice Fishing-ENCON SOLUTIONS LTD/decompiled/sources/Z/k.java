package Z;

import android.graphics.Rect;
import y.Q;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final W.b f1948a;

    /* renamed from: b, reason: collision with root package name */
    public final Q f1949b;

    public k(W.b bVar, Q _windowInsetsCompat) {
        kotlin.jvm.internal.i.e(_windowInsetsCompat, "_windowInsetsCompat");
        this.f1948a = bVar;
        this.f1949b = _windowInsetsCompat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        k kVar = (k) obj;
        return kotlin.jvm.internal.i.a(this.f1948a, kVar.f1948a) && kotlin.jvm.internal.i.a(this.f1949b, kVar.f1949b);
    }

    public final int hashCode() {
        return this.f1949b.hashCode() + (this.f1948a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.f1948a + ", windowInsetsCompat=" + this.f1949b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(Rect rect, Q insets) {
        this(new W.b(rect), insets);
        kotlin.jvm.internal.i.e(insets, "insets");
    }
}
