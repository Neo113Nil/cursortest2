package defpackage;

/* loaded from: classes.dex */
public interface nw0 {
    Object b();

    void c(int i, int i2, int i3);

    void d(int i, int i2);

    void e(int i, Object obj);

    void h(int i, Object obj);

    void i(Object obj);

    default void j() {
        Object b = b();
        op5 op5Var = b instanceof op5 ? (op5) b : null;
        if (op5Var != null) {
            op5Var.b();
        }
    }

    void l();

    default void f() {
    }
}
