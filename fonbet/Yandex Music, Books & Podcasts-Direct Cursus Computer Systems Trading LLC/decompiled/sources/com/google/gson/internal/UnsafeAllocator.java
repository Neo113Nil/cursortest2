package com.google.gson.internal;

import defpackage.xq0;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public abstract class UnsafeAllocator {
    public static final UnsafeAllocator a;

    /* renamed from: com.google.gson.internal.UnsafeAllocator$4, reason: invalid class name */
    class AnonymousClass4 extends UnsafeAllocator {
        @Override // com.google.gson.internal.UnsafeAllocator
        public final Object a(Class cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    static {
        UnsafeAllocator anonymousClass4;
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    final Object obj = declaredField.get(null);
                    final Method method = cls.getMethod("allocateInstance", Class.class);
                    anonymousClass4 = new UnsafeAllocator() { // from class: com.google.gson.internal.UnsafeAllocator.1
                        @Override // com.google.gson.internal.UnsafeAllocator
                        public final Object a(Class cls2) {
                            String a2 = ConstructorConstructor.a(cls2);
                            if (a2 == null) {
                                return method.invoke(obj, cls2);
                            }
                            xq0.w("UnsafeAllocator is used for non-instantiable type: ".concat(a2));
                            return null;
                        }
                    };
                } catch (Exception unused) {
                    anonymousClass4 = new AnonymousClass4();
                }
            } catch (Exception unused2) {
                final Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod.setAccessible(true);
                anonymousClass4 = new UnsafeAllocator() { // from class: com.google.gson.internal.UnsafeAllocator.3
                    @Override // com.google.gson.internal.UnsafeAllocator
                    public final Object a(Class cls2) {
                        String a2 = ConstructorConstructor.a(cls2);
                        if (a2 == null) {
                            return declaredMethod.invoke(null, cls2, Object.class);
                        }
                        xq0.w("UnsafeAllocator is used for non-instantiable type: ".concat(a2));
                        return null;
                    }
                };
            }
        } catch (Exception unused3) {
            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
            declaredMethod2.setAccessible(true);
            final int intValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
            final Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
            declaredMethod3.setAccessible(true);
            anonymousClass4 = new UnsafeAllocator() { // from class: com.google.gson.internal.UnsafeAllocator.2
                @Override // com.google.gson.internal.UnsafeAllocator
                public final Object a(Class cls2) {
                    String a2 = ConstructorConstructor.a(cls2);
                    if (a2 == null) {
                        return declaredMethod3.invoke(null, cls2, Integer.valueOf(intValue));
                    }
                    xq0.w("UnsafeAllocator is used for non-instantiable type: ".concat(a2));
                    return null;
                }
            };
        }
        a = anonymousClass4;
    }

    public abstract Object a(Class cls);
}
