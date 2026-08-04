package com.gamericefishpro.space.d4;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 {
    public static final o1 b;
    public final l1 a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = k1.s;
        } else if (i >= 30) {
            b = i1.r;
        } else {
            b = l1.b;
        }
    }

    public o1(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            this.a = new k1(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.a = new j1(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.a = new i1(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new h1(this, windowInsets);
        } else if (i >= 28) {
            this.a = new g1(this, windowInsets);
        } else {
            this.a = new f1(this, windowInsets);
        }
    }

    public static com.gamericefishpro.space.u3.b b(com.gamericefishpro.space.u3.b bVar, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, bVar.a - i);
        int iMax2 = Math.max(0, bVar.b - i2);
        int iMax3 = Math.max(0, bVar.c - i3);
        int iMax4 = Math.max(0, bVar.d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? bVar : com.gamericefishpro.space.u3.b.b(iMax, iMax2, iMax3, iMax4);
    }

    public static o1 d(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        o1 o1Var = new o1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = l0.a;
            o1 o1VarA = e0.a(view);
            l1 l1Var = o1Var.a;
            l1Var.t(o1VarA);
            l1Var.d(view.getRootView());
            l1Var.v(view.getWindowSystemUiVisibility());
        }
        return o1Var;
    }

    public final int a() {
        return this.a.l().b;
    }

    public final WindowInsets c() {
        l1 l1Var = this.a;
        if (l1Var instanceof e1) {
            return ((e1) l1Var).c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o1) {
            return Objects.equals(this.a, ((o1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        l1 l1Var = this.a;
        if (l1Var == null) {
            return 0;
        }
        return l1Var.hashCode();
    }

    public o1(o1 o1Var) {
        if (o1Var != null) {
            l1 l1Var = o1Var.a;
            int i = Build.VERSION.SDK_INT;
            if (i >= 34 && (l1Var instanceof k1)) {
                this.a = new k1(this, (k1) l1Var);
            } else if (i >= 31 && (l1Var instanceof j1)) {
                this.a = new j1(this, (j1) l1Var);
            } else if (i >= 30 && (l1Var instanceof i1)) {
                this.a = new i1(this, (i1) l1Var);
            } else if (i >= 29 && (l1Var instanceof h1)) {
                this.a = new h1(this, (h1) l1Var);
            } else if (i >= 28 && (l1Var instanceof g1)) {
                this.a = new g1(this, (g1) l1Var);
            } else if (l1Var instanceof f1) {
                this.a = new f1(this, (f1) l1Var);
            } else if (l1Var instanceof e1) {
                this.a = new e1(this, (e1) l1Var);
            } else {
                this.a = new l1(this);
            }
            l1Var.e(this);
            return;
        }
        this.a = new l1(this);
    }
}
