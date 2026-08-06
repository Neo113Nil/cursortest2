package y;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public final O f8566a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            int i2 = N.f8563q;
        } else {
            int i3 = O.f8564b;
        }
    }

    public Q(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f8566a = new N(this, windowInsets);
            return;
        }
        if (i2 >= 29) {
            this.f8566a = new M(this, windowInsets);
        } else if (i2 >= 28) {
            this.f8566a = new L(this, windowInsets);
        } else {
            this.f8566a = new K(this, windowInsets);
        }
    }

    public static Q a(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        Q q2 = new Q(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = x.f8596a;
            Q a2 = AbstractC1084q.a(view);
            O o2 = q2.f8566a;
            o2.o(a2);
            o2.d(view.getRootView());
        }
        return q2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        return Objects.equals(this.f8566a, ((Q) obj).f8566a);
    }

    public final int hashCode() {
        O o2 = this.f8566a;
        if (o2 == null) {
            return 0;
        }
        return o2.hashCode();
    }

    public Q() {
        this.f8566a = new O(this);
    }
}
