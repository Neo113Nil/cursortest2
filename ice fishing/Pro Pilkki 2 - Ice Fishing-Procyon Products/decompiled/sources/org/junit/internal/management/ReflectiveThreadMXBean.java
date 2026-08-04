package org.junit.internal.management;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.junit.internal.Classes;

/* JADX INFO: loaded from: classes.dex */
final class ReflectiveThreadMXBean implements ThreadMXBean {
    private final Object threadMxBean;

    private static final class Holder {
        private static final String FAILURE_MESSAGE = "Unable to access ThreadMXBean";
        static final Method getThreadCpuTimeMethod;
        static final Method isThreadCpuTimeSupportedMethod;

        private Holder() {
        }

        static {
            Method method;
            Method method2 = null;
            try {
                Class<?> cls = Classes.getClass("java.lang.management.ThreadMXBean");
                method = cls.getMethod("getThreadCpuTime", Long.TYPE);
                try {
                    method2 = cls.getMethod("isThreadCpuTimeSupported", null);
                } catch (ClassNotFoundException | NoSuchMethodException | SecurityException unused) {
                }
            } catch (ClassNotFoundException | NoSuchMethodException | SecurityException unused2) {
                method = null;
            }
            getThreadCpuTimeMethod = method;
            isThreadCpuTimeSupportedMethod = method2;
        }
    }

    ReflectiveThreadMXBean(Object obj) {
        this.threadMxBean = obj;
    }

    @Override // org.junit.internal.management.ThreadMXBean
    public long getThreadCpuTime(long j) {
        if (Holder.getThreadCpuTimeMethod != null) {
            try {
                return ((Long) Holder.getThreadCpuTimeMethod.invoke(this.threadMxBean, Long.valueOf(j))).longValue();
            } catch (ClassCastException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                throw new UnsupportedOperationException("Unable to access ThreadMXBean", e);
            }
        }
        throw new UnsupportedOperationException("Unable to access ThreadMXBean");
    }

    @Override // org.junit.internal.management.ThreadMXBean
    public boolean isThreadCpuTimeSupported() {
        if (Holder.isThreadCpuTimeSupportedMethod == null) {
            return false;
        }
        try {
            return ((Boolean) Holder.isThreadCpuTimeSupportedMethod.invoke(this.threadMxBean, null)).booleanValue();
        } catch (ClassCastException | IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            return false;
        }
    }
}
