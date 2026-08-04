package org.junit.internal.management;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import org.junit.internal.Classes;

/* JADX INFO: loaded from: classes.dex */
final class ReflectiveRuntimeMXBean implements RuntimeMXBean {
    private final Object runtimeMxBean;

    private static final class Holder {
        private static final Method getInputArgumentsMethod;

        private Holder() {
        }

        static {
            Method method = null;
            try {
                method = Classes.getClass("java.lang.management.RuntimeMXBean").getMethod("getInputArguments", null);
            } catch (ClassNotFoundException | NoSuchMethodException | SecurityException unused) {
            }
            getInputArgumentsMethod = method;
        }
    }

    ReflectiveRuntimeMXBean(Object obj) {
        this.runtimeMxBean = obj;
    }

    @Override // org.junit.internal.management.RuntimeMXBean
    public List<String> getInputArguments() {
        if (Holder.getInputArgumentsMethod != null) {
            try {
                return (List) Holder.getInputArgumentsMethod.invoke(this.runtimeMxBean, null);
            } catch (ClassCastException | IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
        return Collections.EMPTY_LIST;
    }
}
