package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class kqv {
    public static final kqv b;
    public final hqv a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = gqv.s;
        } else if (i >= 30) {
            b = fqv.r;
        } else {
            b = hqv.b;
        }
    }

    public kqv(kqv kqvVar) {
        if (kqvVar == null) {
            this.a = new hqv(this);
            return;
        }
        hqv hqvVar = kqvVar.a;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34 && (hqvVar instanceof gqv)) {
            this.a = new gqv(this, (gqv) hqvVar);
        } else if (i >= 30 && (hqvVar instanceof fqv)) {
            this.a = new fqv(this, (fqv) hqvVar);
        } else if (i >= 29 && (hqvVar instanceof eqv)) {
            this.a = new eqv(this, (eqv) hqvVar);
        } else if (i >= 28 && (hqvVar instanceof dqv)) {
            this.a = new dqv(this, (dqv) hqvVar);
        } else if (hqvVar instanceof cqv) {
            this.a = new cqv(this, (cqv) hqvVar);
        } else if (hqvVar instanceof bqv) {
            this.a = new bqv(this, (bqv) hqvVar);
        } else {
            this.a = new hqv(this);
        }
        hqvVar.e(this);
    }

    public static zne e(zne zneVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, zneVar.a - i);
        int max2 = Math.max(0, zneVar.b - i2);
        int max3 = Math.max(0, zneVar.c - i3);
        int max4 = Math.max(0, zneVar.d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? zneVar : zne.c(max, max2, max3, max4);
    }

    public static kqv h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        kqv kqvVar = new kqv(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = wdu.a;
            kqv a = odu.a(view);
            hqv hqvVar = kqvVar.a;
            hqvVar.t(a);
            hqvVar.d(view.getRootView());
            hqvVar.v(view.getWindowSystemUiVisibility());
        }
        return kqvVar;
    }

    public final int a() {
        return this.a.l().d;
    }

    public final int b() {
        return this.a.l().a;
    }

    public final int c() {
        return this.a.l().c;
    }

    public final int d() {
        return this.a.l().b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kqv) {
            return Objects.equals(this.a, ((kqv) obj).a);
        }
        return false;
    }

    public final kqv f(int i, int i2, int i3, int i4) {
        int i5 = Build.VERSION.SDK_INT;
        aqv zpvVar = i5 >= 34 ? new zpv(this) : i5 >= 30 ? new ypv(this) : i5 >= 29 ? new xpv(this) : new wpv(this);
        zpvVar.g(zne.c(i, i2, i3, i4));
        return zpvVar.b();
    }

    public final WindowInsets g() {
        hqv hqvVar = this.a;
        if (hqvVar instanceof bqv) {
            return ((bqv) hqvVar).c;
        }
        return null;
    }

    public final int hashCode() {
        hqv hqvVar = this.a;
        if (hqvVar == null) {
            return 0;
        }
        return hqvVar.hashCode();
    }

    public kqv(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            this.a = new gqv(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.a = new fqv(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new eqv(this, windowInsets);
        } else if (i >= 28) {
            this.a = new dqv(this, windowInsets);
        } else {
            this.a = new cqv(this, windowInsets);
        }
    }
}
