package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public interface ukd {
    Object a(Object obj, Function2 function2);

    boolean b();

    boolean c(Function1 function1);

    default ukd d(ukd ukdVar) {
        return ukdVar == skd.a ? this : new lb5(this, ukdVar);
    }
}
