package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes11.dex */
public final class woi0 extends lia1 {
    public final Method a = Class.class.getMethod("isRecord", null);
    public final Method b = Class.class.getMethod("getRecordComponents", null);
    public final Method c;
    public final Method d;

    public woi0() {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.c = cls.getMethod("getName", null);
        this.d = cls.getMethod("getType", null);
    }

    @Override // defpackage.lia1
    public final Method c(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e) {
            ny61.n("Unexpected ReflectiveOperationException occurred (Gson 2.14.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // defpackage.lia1
    public final Constructor d(Class cls) {
        try {
            Object[] objArr = (Object[]) this.b.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = (Class) this.d.invoke(objArr[i], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e) {
            ny61.n("Unexpected ReflectiveOperationException occurred (Gson 2.14.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // defpackage.lia1
    public final String[] f(Class cls) {
        try {
            Object[] objArr = (Object[]) this.b.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) this.c.invoke(objArr[i], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e) {
            ny61.n("Unexpected ReflectiveOperationException occurred (Gson 2.14.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // defpackage.lia1
    public final boolean h(Class cls) {
        try {
            return ((Boolean) this.a.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e) {
            ny61.n("Unexpected ReflectiveOperationException occurred (Gson 2.14.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return false;
        }
    }
}
