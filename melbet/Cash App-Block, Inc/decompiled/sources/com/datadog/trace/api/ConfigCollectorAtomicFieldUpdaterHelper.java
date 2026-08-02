package com.datadog.trace.api;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract /* synthetic */ class ConfigCollectorAtomicFieldUpdaterHelper {
    public static final /* synthetic */ Unsafe unsafe = getUnsafe();

    public static /* synthetic */ Unsafe getUnsafe() {
        Field field;
        Field field2;
        try {
            field2 = Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = Unsafe.class.getDeclaredFields();
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    field = null;
                    break;
                }
                field = declaredFields[i];
                if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                    break;
                }
                i++;
            }
            if (field != null) {
                throw new UnsupportedOperationException("Couldn't find the Unsafe", e);
            }
            field2 = field;
        }
        field2.setAccessible(true);
        try {
            return (Unsafe) field2.get(null);
        } catch (Exception e2) {
            a$$ExternalSyntheticBUOutline0.m((Throwable) e2);
            return null;
        }
    }
}
