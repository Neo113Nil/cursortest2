package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class dfu {
    public final lm4 a;
    public final Function1 b;

    public dfu(lm4 lm4Var, Function1 function1) {
        function1.getClass();
        this.a = lm4Var;
        this.b = function1;
    }

    public dfu(Class cls, Function1 function1) {
        this(ern.a(cls), function1);
    }
}
