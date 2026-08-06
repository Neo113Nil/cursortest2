package defpackage;

/* loaded from: classes.dex */
public final class rj1 extends defpackage.c80 {
    public static final java.lang.reflect.Constructor F7NU4MC0GW;
    public static final java.lang.reflect.Method adDC3e2L;
    public static final java.lang.Class r1MBDhnF;
    public static final java.lang.reflect.Method xiZrDbcSW0;

    static {
        java.lang.Class<?> cls;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.lang.reflect.Constructor<?> constructor = null;
        try {
            cls = java.lang.Class.forName("android.graphics.FontFamily");
            java.lang.reflect.Constructor<?> constructor2 = cls.getConstructor(null);
            java.lang.Class cls2 = java.lang.Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", java.nio.ByteBuffer.class, cls2, java.util.List.class, cls2, java.lang.Boolean.TYPE);
            method = android.graphics.Typeface.class.getMethod("createFromFamiliesWithDefault", java.lang.reflect.Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException e) {
            android.util.Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        F7NU4MC0GW = constructor;
        r1MBDhnF = cls;
        adDC3e2L = method2;
        xiZrDbcSW0 = method;
    }

    @Override // defpackage.c80
    public final android.graphics.Typeface SyNS6RMn(android.content.Context context, defpackage.gz[] gzVarArr) {
        java.lang.Object obj;
        android.graphics.Typeface typeface;
        boolean z;
        try {
            obj = F7NU4MC0GW.newInstance(null);
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            defpackage.s91 s91Var = new defpackage.s91();
            int length = gzVarArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    defpackage.gz gzVar = gzVarArr[i];
                    android.net.Uri uri = gzVar.IHQe1A4L2xu;
                    java.lang.Object obj2 = (java.nio.ByteBuffer) s91Var.get(uri);
                    if (obj2 == null) {
                        obj2 = defpackage.l80.PAEGRtP0bX(context, uri);
                        s91Var.put(uri, obj2);
                    }
                    if (obj2 == null) {
                        break;
                    }
                    try {
                        z = ((java.lang.Boolean) adDC3e2L.invoke(obj, obj2, java.lang.Integer.valueOf(gzVar.oh6vYeIP), null, java.lang.Integer.valueOf(gzVar.r1MBDhnF), java.lang.Boolean.valueOf(gzVar.F7NU4MC0GW))).booleanValue();
                    } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused2) {
                        z = false;
                    }
                    if (!z) {
                        break;
                    }
                    i++;
                } else {
                    try {
                        java.lang.Object newInstance = java.lang.reflect.Array.newInstance((java.lang.Class<?>) r1MBDhnF, 1);
                        java.lang.reflect.Array.set(newInstance, 0, obj);
                        typeface = (android.graphics.Typeface) xiZrDbcSW0.invoke(null, newInstance);
                    } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused3) {
                        typeface = null;
                    }
                    if (typeface != null) {
                        return android.graphics.Typeface.create(typeface, 0);
                    }
                }
            }
        }
        return null;
    }
}
