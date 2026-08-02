package defpackage;

import android.view.View;

/* loaded from: classes3.dex */
public interface ux8 {
    void b(gc8 gc8Var, xzb xzbVar, View view, dp8 dp8Var);

    boolean c(dp8 dp8Var);

    void e(gc8 gc8Var, xzb xzbVar, View view, dp8 dp8Var);

    default void f(dp8 dp8Var, xzb xzbVar, hf9 hf9Var) {
        dom k0 = hf9Var.k0(dp8Var.toString());
        g(dp8Var, xzbVar);
        k0.a(new or5(c5b.a));
    }

    default void d(View view) {
    }

    default void g(dp8 dp8Var, xzb xzbVar) {
    }
}
