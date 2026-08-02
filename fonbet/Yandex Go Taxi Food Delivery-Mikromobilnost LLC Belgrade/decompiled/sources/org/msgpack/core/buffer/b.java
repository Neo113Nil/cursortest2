package org.msgpack.core.buffer;

import defpackage.ny61;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public abstract class b {
    public static final Method a;
    public static final Constructor b;
    public static final Class c;
    public static final DirectBufferAccess$DirectBufferConstructorType d;
    public static final Method e;

    static {
        Constructor<?> declaredConstructor;
        Method method;
        DirectBufferAccess$DirectBufferConstructorType directBufferAccess$DirectBufferConstructorType;
        Class cls = Long.TYPE;
        Class cls2 = Integer.TYPE;
        try {
            Class<?> loadClass = ClassLoader.getSystemClassLoader().loadClass("java.nio.DirectByteBuffer");
            c = loadClass;
            try {
                try {
                    try {
                        declaredConstructor = loadClass.getDeclaredConstructor(cls, cls2, Object.class);
                        directBufferAccess$DirectBufferConstructorType = DirectBufferAccess$DirectBufferConstructorType.ARGS_LONG_INT_REF;
                    } catch (NoSuchMethodException unused) {
                        Class<?> cls3 = Class.forName("java.nio.MemoryBlock");
                        Method declaredMethod = cls3.getDeclaredMethod("wrapFromJni", cls2, cls);
                        declaredMethod.setAccessible(true);
                        declaredConstructor = c.getDeclaredConstructor(cls3, cls2, cls2);
                        method = declaredMethod;
                        directBufferAccess$DirectBufferConstructorType = DirectBufferAccess$DirectBufferConstructorType.ARGS_MB_INT_INT;
                    }
                } catch (NoSuchMethodException unused2) {
                    declaredConstructor = c.getDeclaredConstructor(cls2, cls2);
                    directBufferAccess$DirectBufferConstructorType = DirectBufferAccess$DirectBufferConstructorType.ARGS_INT_INT;
                }
            } catch (NoSuchMethodException unused3) {
                declaredConstructor = c.getDeclaredConstructor(cls, cls2);
                directBufferAccess$DirectBufferConstructorType = DirectBufferAccess$DirectBufferConstructorType.ARGS_LONG_INT;
            }
            method = null;
            b = declaredConstructor;
            d = directBufferAccess$DirectBufferConstructorType;
            e = method;
            if (declaredConstructor == null) {
                throw new RuntimeException("Constructor of DirectByteBuffer is not found");
            }
            declaredConstructor.setAccessible(true);
            Class cls4 = c;
            Method declaredMethod2 = cls4.getDeclaredMethod("address", null);
            a = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = cls4.getDeclaredMethod("cleaner", null);
            declaredMethod3.setAccessible(true);
            declaredMethod3.getReturnType().getDeclaredMethod("clean", null).setAccessible(true);
        } catch (Exception e2) {
            ny61.j(e2);
        }
    }
}
