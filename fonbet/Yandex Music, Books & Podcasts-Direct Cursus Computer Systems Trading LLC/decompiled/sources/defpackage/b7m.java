package defpackage;

import com.yandex.plus.core.config.a;

/* loaded from: classes4.dex */
public final class b7m {
    public final tf6 a;

    public b7m(tf6 tf6Var) {
        this.a = tf6Var;
    }

    public static a a(vdb vdbVar) {
        int ordinal = vdbVar.ordinal();
        if (ordinal == 0) {
            return a.a;
        }
        if (ordinal == 1) {
            return a.b;
        }
        b6e.s();
        return null;
    }

    public static com.yandex.plus.ui.core.theme.a b(ves vesVar) {
        vesVar.getClass();
        int ordinal = vesVar.ordinal();
        if (ordinal == 0) {
            return com.yandex.plus.ui.core.theme.a.a;
        }
        if (ordinal == 1) {
            return com.yandex.plus.ui.core.theme.a.b;
        }
        if (ordinal == 2) {
            return com.yandex.plus.ui.core.theme.a.c;
        }
        b6e.s();
        return null;
    }

    public final fkn c(vdr vdrVar) {
        vdrVar.getClass();
        return zsd.F0(new ail(6, vdrVar, this), this.a, lbq.a, b((ves) vdrVar.getValue()));
    }
}
