package defpackage;

/* loaded from: classes.dex */
public class sj1 extends defpackage.qj1 {
    public final java.lang.reflect.Method AARZUJiTa;
    public final java.lang.reflect.Method EXtogiMhuM;
    public final java.lang.reflect.Constructor F7NU4MC0GW;
    public final java.lang.reflect.Method adDC3e2L;
    public final java.lang.Class r1MBDhnF;
    public final java.lang.reflect.Method riuEU0zW4;
    public final java.lang.reflect.Method xiZrDbcSW0;

    public sj1() {
        java.lang.reflect.Method method;
        java.lang.reflect.Constructor<?> constructor;
        java.lang.reflect.Method method2;
        java.lang.reflect.Method method3;
        java.lang.reflect.Method method4;
        java.lang.reflect.Method method5;
        java.lang.Class<?> cls = null;
        try {
            java.lang.Class<?> cls2 = java.lang.Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = mAr5m2L7gYDP(cls2);
            java.lang.Class cls3 = java.lang.Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", java.nio.ByteBuffer.class, cls3, android.graphics.fonts.FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = hyxIchWRW(cls2);
            cls = cls2;
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException e) {
            android.util.Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.r1MBDhnF = cls;
        this.F7NU4MC0GW = constructor;
        this.adDC3e2L = method2;
        this.xiZrDbcSW0 = method3;
        this.AARZUJiTa = method4;
        this.EXtogiMhuM = method5;
        this.riuEU0zW4 = method;
    }

    public static java.lang.reflect.Method mAr5m2L7gYDP(java.lang.Class cls) {
        java.lang.Class cls2 = java.lang.Boolean.TYPE;
        java.lang.Class cls3 = java.lang.Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", android.content.res.AssetManager.class, java.lang.String.class, cls3, cls2, cls3, cls3, cls3, android.graphics.fonts.FontVariationAxis[].class);
    }

    @Override // defpackage.qj1, defpackage.c80
    public final android.graphics.Typeface SyNS6RMn(android.content.Context context, defpackage.gz[] gzVarArr) {
        java.lang.Object obj;
        boolean z;
        android.graphics.Typeface XZx205DYe;
        boolean z2;
        if (gzVarArr.length >= 1) {
            java.lang.reflect.Method method = this.adDC3e2L;
            if (method == null) {
                android.util.Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    for (defpackage.gz gzVar : gzVarArr) {
                        if (gzVar.xiZrDbcSW0 == 0) {
                            android.net.Uri uri = gzVar.IHQe1A4L2xu;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, defpackage.l80.PAEGRtP0bX(context, uri));
                            }
                        }
                    }
                    java.util.Map unmodifiableMap = java.util.Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.F7NU4MC0GW.newInstance(null);
                    } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = gzVarArr.length;
                        int i = 0;
                        boolean z3 = false;
                        while (true) {
                            java.lang.reflect.Method method2 = this.EXtogiMhuM;
                            if (i < length) {
                                defpackage.gz gzVar2 = gzVarArr[i];
                                java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) unmodifiableMap.get(gzVar2.IHQe1A4L2xu);
                                if (byteBuffer != null) {
                                    try {
                                        z2 = ((java.lang.Boolean) this.xiZrDbcSW0.invoke(obj, byteBuffer, java.lang.Integer.valueOf(gzVar2.oh6vYeIP), null, java.lang.Integer.valueOf(gzVar2.r1MBDhnF), java.lang.Integer.valueOf(gzVar2.F7NU4MC0GW ? 1 : 0))).booleanValue();
                                    } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused2) {
                                        z2 = false;
                                    }
                                    if (!z2) {
                                        method2.invoke(obj, null);
                                        break;
                                    }
                                    z3 = true;
                                }
                                i++;
                                z3 = z3;
                            } else if (z3) {
                                try {
                                    z = ((java.lang.Boolean) this.AARZUJiTa.invoke(obj, null)).booleanValue();
                                } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused3) {
                                    z = false;
                                }
                                if (z && (XZx205DYe = XZx205DYe(obj)) != null) {
                                    return android.graphics.Typeface.create(XZx205DYe, 0);
                                }
                            } else {
                                method2.invoke(obj, null);
                            }
                        }
                    }
                } else {
                    defpackage.gz EgCjBq0SZwJ = defpackage.c80.EgCjBq0SZwJ(gzVarArr);
                    android.os.ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(EgCjBq0SZwJ.IHQe1A4L2xu, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            android.graphics.Typeface build = new android.graphics.Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(EgCjBq0SZwJ.r1MBDhnF).setItalic(EgCjBq0SZwJ.F7NU4MC0GW).build();
                            openFileDescriptor.close();
                            return build;
                        } finally {
                        }
                    }
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                        return null;
                    }
                }
            } catch (java.io.IOException | java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused4) {
            }
        }
        return null;
    }

    public android.graphics.Typeface XZx205DYe(java.lang.Object obj) {
        try {
            java.lang.Object newInstance = java.lang.reflect.Array.newInstance((java.lang.Class<?>) this.r1MBDhnF, 1);
            java.lang.reflect.Array.set(newInstance, 0, obj);
            return (android.graphics.Typeface) this.riuEU0zW4.invoke(null, newInstance, -1, -1);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    public java.lang.reflect.Method hyxIchWRW(java.lang.Class cls) {
        java.lang.Class<?> cls2 = java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, 1).getClass();
        java.lang.Class cls3 = java.lang.Integer.TYPE;
        java.lang.reflect.Method declaredMethod = android.graphics.Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
