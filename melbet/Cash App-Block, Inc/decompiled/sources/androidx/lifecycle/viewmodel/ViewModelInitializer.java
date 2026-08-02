package androidx.lifecycle.viewmodel;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;

/* loaded from: classes3.dex */
public final class ViewModelInitializer {
    public final KClass clazz;
    public final Function1 initializer;

    public ViewModelInitializer(KClass kClass, Function1 function1) {
        kClass.getClass();
        function1.getClass();
        this.clazz = kClass;
        this.initializer = function1;
    }
}
