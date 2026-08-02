package defpackage;

/* loaded from: classes4.dex */
public interface ak2 {
    default String a() {
        if (this instanceof xj2) {
            return ((xj2) this).a;
        }
        if (this instanceof yj2) {
            return ((yj2) this).j;
        }
        if (this instanceof zj2) {
            return null;
        }
        b6e.s();
        return null;
    }

    default boolean b() {
        return false;
    }
}
