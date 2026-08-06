package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class o9 {
    public static final /* synthetic */ Unsafe GWasM1elztuh = GWasM1elztuh();

    public static /* synthetic */ Unsafe GWasM1elztuh() {
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
            throw new RuntimeException(e2);
        }
    }
}
