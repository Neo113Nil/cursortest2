package androidx.compose.ui.draw;

import defpackage.b2c;
import defpackage.g40;
import defpackage.jd6;
import defpackage.m85;
import defpackage.w4k;
import defpackage.yci;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class a {
    public static final yci a(yci yciVar, Function1 function1) {
        return yciVar.f(new DrawBehindElement(function1));
    }

    public static final yci b(yci yciVar, Function1 function1) {
        return yciVar.f(new DrawWithCacheElement(function1));
    }

    public static final yci c(yci yciVar, Function1 function1) {
        return yciVar.f(new DrawWithContentElement(function1));
    }

    public static yci d(yci yciVar, w4k w4kVar, g40 g40Var, jd6 jd6Var, float f, m85 m85Var, int i) {
        if ((i & 4) != 0) {
            g40Var = b2c.f;
        }
        g40 g40Var2 = g40Var;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 32) != 0) {
            m85Var = null;
        }
        return yciVar.f(new PainterElement(w4kVar, g40Var2, jd6Var, f2, m85Var));
    }
}
