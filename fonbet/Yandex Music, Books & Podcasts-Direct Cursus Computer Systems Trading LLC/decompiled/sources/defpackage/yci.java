package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public interface yci {
    Object a(Object obj, Function2 function2);

    boolean b(Function1 function1);

    default yci f(yci yciVar) {
        return yciVar == vci.a ? this : new nb5(this, yciVar);
    }
}
