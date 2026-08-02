package com.nimbusds.jose.shaded.gson.internal;

import androidx.camera.video.VideoCapture;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public abstract class UnsafeAllocator {
    public static final UnsafeAllocator INSTANCE;

    /* renamed from: com.nimbusds.jose.shaded.gson.internal.UnsafeAllocator$4, reason: invalid class name */
    public final class AnonymousClass4 extends UnsafeAllocator {
        @Override // com.nimbusds.jose.shaded.gson.internal.UnsafeAllocator
        public final Object newInstance(Class cls) {
            throw new UnsupportedOperationException(Boxes$$ExternalSyntheticOutline1.m(cls, "Cannot allocate ", ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly."));
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
                    anonymousClass4 = new UnsafeAllocator() { // from class: com.nimbusds.jose.shaded.gson.internal.UnsafeAllocator.1
                        @Override // com.nimbusds.jose.shaded.gson.internal.UnsafeAllocator
                        public final Object newInstance(Class cls2) {
                            String checkInstantiable = VideoCapture.AnonymousClass3.checkInstantiable(cls2);
                            if (checkInstantiable == null) {
                                return method.invoke(obj, cls2);
                            }
                            a$$ExternalSyntheticBUOutline0.m$1((Object) "UnsafeAllocator is used for non-instantiable type: ".concat(checkInstantiable));
                            return null;
                        }
                    };
                } catch (Exception unused) {
                    anonymousClass4 = new AnonymousClass4();
                }
            } catch (Exception unused2) {
                final Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod.setAccessible(true);
                anonymousClass4 = new UnsafeAllocator() { // from class: com.nimbusds.jose.shaded.gson.internal.UnsafeAllocator.3
                    @Override // com.nimbusds.jose.shaded.gson.internal.UnsafeAllocator
                    public final Object newInstance(Class cls2) {
                        String checkInstantiable = VideoCapture.AnonymousClass3.checkInstantiable(cls2);
                        if (checkInstantiable == null) {
                            return declaredMethod.invoke(null, cls2, Object.class);
                        }
                        a$$ExternalSyntheticBUOutline0.m$1((Object) "UnsafeAllocator is used for non-instantiable type: ".concat(checkInstantiable));
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
            anonymousClass4 = new UnsafeAllocator() { // from class: com.nimbusds.jose.shaded.gson.internal.UnsafeAllocator.2
                @Override // com.nimbusds.jose.shaded.gson.internal.UnsafeAllocator
                public final Object newInstance(Class cls2) {
                    String checkInstantiable = VideoCapture.AnonymousClass3.checkInstantiable(cls2);
                    if (checkInstantiable == null) {
                        return declaredMethod3.invoke(null, cls2, Integer.valueOf(intValue));
                    }
                    a$$ExternalSyntheticBUOutline0.m$1((Object) "UnsafeAllocator is used for non-instantiable type: ".concat(checkInstantiable));
                    return null;
                }
            };
        }
        INSTANCE = anonymousClass4;
    }

    public abstract Object newInstance(Class cls);
}
