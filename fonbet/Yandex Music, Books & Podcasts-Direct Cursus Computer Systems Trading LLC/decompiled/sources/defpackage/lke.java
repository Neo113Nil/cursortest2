package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface lke {
    default pjc a(jx7 jx7Var) {
        jx7Var.getClass();
        return new fs(15, null);
    }

    void b(int i, hq5 hq5Var);

    float c(jx7 jx7Var);

    List d();

    void e(boolean z);

    default float f() {
        return 8;
    }

    lm4 g();

    String getTag();

    vdr getVisibility();

    default boolean h(lke lkeVar) {
        return (lkeVar == null || Intrinsics.d(g(), lkeVar.g())) ? false : true;
    }

    default void start() {
    }
}
