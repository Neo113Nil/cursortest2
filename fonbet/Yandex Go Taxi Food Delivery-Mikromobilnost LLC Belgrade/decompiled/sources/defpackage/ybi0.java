package defpackage;

import androidx.camera.core.impl.Config$OptionPriority;
import java.util.Set;

/* loaded from: classes10.dex */
public interface ybi0 extends szd {
    @Override // defpackage.szd
    default Object c(x34 x34Var, Config$OptionPriority config$OptionPriority) {
        return getConfig().c(x34Var, config$OptionPriority);
    }

    @Override // defpackage.szd
    default boolean d(x34 x34Var) {
        return getConfig().d(x34Var);
    }

    @Override // defpackage.szd
    default Config$OptionPriority e(x34 x34Var) {
        return getConfig().e(x34Var);
    }

    @Override // defpackage.szd
    default Object f(x34 x34Var) {
        return getConfig().f(x34Var);
    }

    @Override // defpackage.szd
    default Object g(x34 x34Var, Object obj) {
        return getConfig().g(x34Var, obj);
    }

    szd getConfig();

    @Override // defpackage.szd
    default Set h() {
        return getConfig().h();
    }

    @Override // defpackage.szd
    default Set i(x34 x34Var) {
        return getConfig().i(x34Var);
    }

    @Override // defpackage.szd
    default void j(lzd lzdVar) {
        getConfig().j(lzdVar);
    }
}
