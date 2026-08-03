package m0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public interface c {
    void c(int i10, Object obj);

    void d(Object obj);

    default void e(Object obj, oc.e eVar) {
        eVar.invoke(getCurrent(), obj);
    }

    void f();

    void g(int i10, Object obj);

    Object getCurrent();

    void i(int i10, int i11, int i12);

    void j(int i10, int i11);

    void o();

    default void h() {
    }
}
