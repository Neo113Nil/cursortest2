package w;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public final P f3039a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            int i2 = O.f3036q;
        } else {
            int i3 = P.f3037b;
        }
    }

    public S(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f3039a = new O(this, windowInsets);
            return;
        }
        if (i2 >= 29) {
            this.f3039a = new N(this, windowInsets);
        } else if (i2 >= 28) {
            this.f3039a = new M(this, windowInsets);
        } else {
            this.f3039a = new K(this, windowInsets);
        }
    }

    public static S a(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        S s2 = new S(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = x.f3069a;
            S a2 = AbstractC0285q.a(view);
            P p2 = s2.f3039a;
            p2.o(a2);
            p2.d(view.getRootView());
        }
        return s2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        return Objects.equals(this.f3039a, ((S) obj).f3039a);
    }

    public final int hashCode() {
        P p2 = this.f3039a;
        if (p2 == null) {
            return 0;
        }
        return p2.hashCode();
    }

    public S() {
        this.f3039a = new P(this);
    }
}
