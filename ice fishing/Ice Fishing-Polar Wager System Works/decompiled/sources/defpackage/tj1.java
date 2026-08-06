package defpackage;

/* loaded from: classes.dex */
public final class tj1 extends defpackage.sj1 {
    @Override // defpackage.sj1
    public final android.graphics.Typeface XZx205DYe(java.lang.Object obj) {
        try {
            java.lang.Object newInstance = java.lang.reflect.Array.newInstance((java.lang.Class<?>) this.r1MBDhnF, 1);
            java.lang.reflect.Array.set(newInstance, 0, obj);
            return (android.graphics.Typeface) this.riuEU0zW4.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    @Override // defpackage.sj1
    public final java.lang.reflect.Method hyxIchWRW(java.lang.Class cls) {
        java.lang.Class<?> cls2 = java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, 1).getClass();
        java.lang.Class cls3 = java.lang.Integer.TYPE;
        java.lang.reflect.Method declaredMethod = android.graphics.Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, java.lang.String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
