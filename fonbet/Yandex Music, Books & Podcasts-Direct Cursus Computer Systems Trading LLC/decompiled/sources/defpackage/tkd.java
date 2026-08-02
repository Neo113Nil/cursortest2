package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public interface tkd extends ukd {
    @Override // defpackage.ukd
    default Object a(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // defpackage.ukd
    default boolean b() {
        return Boolean.TRUE.booleanValue();
    }

    @Override // defpackage.ukd
    default boolean c(Function1 function1) {
        return ((Boolean) function1.invoke(this)).booleanValue();
    }
}
