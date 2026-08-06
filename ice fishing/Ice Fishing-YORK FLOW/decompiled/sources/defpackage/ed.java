package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class ed {
    public static final /* synthetic */ sun.misc.Unsafe ZpBGe2uQfcn8 = ZpBGe2uQfcn8();

    public static /* synthetic */ sun.misc.Unsafe ZpBGe2uQfcn8() {
        java.lang.reflect.Field field;
        java.lang.reflect.Field field2;
        try {
            field2 = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        } catch (java.lang.NoSuchFieldException e) {
            java.lang.reflect.Field[] declaredFields = sun.misc.Unsafe.class.getDeclaredFields();
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    field = null;
                    break;
                }
                field = declaredFields[i];
                if (java.lang.reflect.Modifier.isStatic(field.getModifiers()) && sun.misc.Unsafe.class.isAssignableFrom(field.getType())) {
                    break;
                }
                i++;
            }
            if (field != null) {
                throw new java.lang.UnsupportedOperationException("Couldn't find the Unsafe", e);
            }
            field2 = field;
        }
        field2.setAccessible(true);
        try {
            return (sun.misc.Unsafe) field2.get(null);
        } catch (java.lang.Exception e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }
}
