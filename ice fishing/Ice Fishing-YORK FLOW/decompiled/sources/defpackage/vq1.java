package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class vq1 extends defpackage.sq1 {
    public final java.lang.reflect.Method GE9mJIPrb8gP;
    public final java.lang.reflect.Method Ns0WNyEWdPsk;
    public final java.lang.reflect.Method P05cfTpS5W5L;
    public final java.lang.reflect.Constructor QiMR8OkAhezm;
    public final java.lang.reflect.Method e6mdH7fiFuta;
    public final java.lang.reflect.Method fNwYGHIYeJcR;
    public final java.lang.Class oh71FJcDz6S2;

    public vq1() {
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
            method2 = z16KqenTjq8o(cls2);
            java.lang.Class cls3 = java.lang.Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", java.nio.ByteBuffer.class, cls3, android.graphics.fonts.FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = NkfcFfdaVTox(cls2);
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
        this.oh71FJcDz6S2 = cls;
        this.QiMR8OkAhezm = constructor;
        this.P05cfTpS5W5L = method2;
        this.e6mdH7fiFuta = method3;
        this.GE9mJIPrb8gP = method4;
        this.Ns0WNyEWdPsk = method5;
        this.fNwYGHIYeJcR = method;
    }

    public static java.lang.reflect.Method z16KqenTjq8o(java.lang.Class cls) {
        java.lang.Class cls2 = java.lang.Boolean.TYPE;
        java.lang.Class cls3 = java.lang.Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", android.content.res.AssetManager.class, java.lang.String.class, cls3, cls2, cls3, cls3, cls3, android.graphics.fonts.FontVariationAxis[].class);
    }

    @Override // defpackage.q70
    public final android.graphics.Typeface BHfvd2J71qpO(android.content.Context context, android.content.res.Resources resources, java.lang.String str) {
        java.lang.Object obj;
        java.lang.reflect.Method method = this.P05cfTpS5W5L;
        if (method == null) {
            android.util.Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.BHfvd2J71qpO(context, resources, str);
        }
        try {
            obj = this.QiMR8OkAhezm.newInstance(null);
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            if (!Fu5WBEia9jBo(context, obj, str, 0, -1, -1, null)) {
                try {
                    this.Ns0WNyEWdPsk.invoke(obj, null);
                } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused2) {
                }
            } else if (EPEWHACkMcF1(obj)) {
                return CZa7MwI9IzLd(obj);
            }
        }
        return null;
    }

    public android.graphics.Typeface CZa7MwI9IzLd(java.lang.Object obj) {
        try {
            java.lang.Object newInstance = java.lang.reflect.Array.newInstance((java.lang.Class<?>) this.oh71FJcDz6S2, 1);
            java.lang.reflect.Array.set(newInstance, 0, obj);
            return (android.graphics.Typeface) this.fNwYGHIYeJcR.invoke(null, newInstance, -1, -1);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean EPEWHACkMcF1(java.lang.Object obj) {
        try {
            return ((java.lang.Boolean) this.GE9mJIPrb8gP.invoke(obj, null)).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean Fu5WBEia9jBo(android.content.Context context, java.lang.Object obj, java.lang.String str, int i, int i2, int i3, android.graphics.fonts.FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((java.lang.Boolean) this.P05cfTpS5W5L.invoke(obj, context.getAssets(), str, 0, java.lang.Boolean.FALSE, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return false;
        }
    }

    public java.lang.reflect.Method NkfcFfdaVTox(java.lang.Class cls) {
        java.lang.Class<?> cls2 = java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, 1).getClass();
        java.lang.Class cls3 = java.lang.Integer.TYPE;
        java.lang.reflect.Method declaredMethod = android.graphics.Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // defpackage.sq1, defpackage.q70
    public final android.graphics.Typeface WmetiUbpKU9I(android.content.Context context, defpackage.y00[] y00VarArr) {
        java.lang.Object obj;
        android.graphics.Typeface CZa7MwI9IzLd;
        boolean z;
        if (y00VarArr.length >= 1) {
            java.lang.reflect.Method method = this.P05cfTpS5W5L;
            if (method == null) {
                android.util.Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    for (defpackage.y00 y00Var : y00VarArr) {
                        if (y00Var.oh71FJcDz6S2 == 0) {
                            android.net.Uri uri = y00Var.ZpBGe2uQfcn8;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, defpackage.v70.UmgHb6n58gfG(context, uri));
                            }
                        }
                    }
                    java.util.Map unmodifiableMap = java.util.Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.QiMR8OkAhezm.newInstance(null);
                    } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = y00VarArr.length;
                        int i = 0;
                        boolean z2 = false;
                        while (true) {
                            java.lang.reflect.Method method2 = this.Ns0WNyEWdPsk;
                            if (i < length) {
                                defpackage.y00 y00Var2 = y00VarArr[i];
                                java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) unmodifiableMap.get(y00Var2.ZpBGe2uQfcn8);
                                if (byteBuffer != null) {
                                    try {
                                        z = ((java.lang.Boolean) this.e6mdH7fiFuta.invoke(obj, byteBuffer, java.lang.Integer.valueOf(y00Var2.giKS3J6vZuNy), null, java.lang.Integer.valueOf(y00Var2.fWTAfUmVKrZq), java.lang.Integer.valueOf(y00Var2.JhCgjQRTAOCT ? 1 : 0))).booleanValue();
                                    } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused2) {
                                        z = false;
                                    }
                                    if (!z) {
                                        method2.invoke(obj, null);
                                        break;
                                    }
                                    z2 = true;
                                }
                                i++;
                                z2 = z2;
                            } else if (!z2) {
                                method2.invoke(obj, null);
                            } else if (EPEWHACkMcF1(obj) && (CZa7MwI9IzLd = CZa7MwI9IzLd(obj)) != null) {
                                return android.graphics.Typeface.create(CZa7MwI9IzLd, 0);
                            }
                        }
                    }
                } else {
                    defpackage.y00 ZVVdXbWmyCSK = defpackage.q70.ZVVdXbWmyCSK(y00VarArr);
                    android.os.ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(ZVVdXbWmyCSK.ZpBGe2uQfcn8, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            android.graphics.Typeface build = new android.graphics.Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(ZVVdXbWmyCSK.fWTAfUmVKrZq).setItalic(ZVVdXbWmyCSK.JhCgjQRTAOCT).build();
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
            } catch (java.io.IOException | java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // defpackage.sq1, defpackage.q70
    public final android.graphics.Typeface XntWc4eZSQ8j(android.content.Context context, defpackage.m00 m00Var, android.content.res.Resources resources) {
        java.lang.Object obj;
        java.lang.reflect.Method method = this.P05cfTpS5W5L;
        if (method == null) {
            android.util.Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.XntWc4eZSQ8j(context, m00Var, resources);
        }
        try {
            obj = this.QiMR8OkAhezm.newInstance(null);
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            defpackage.n00[] n00VarArr = m00Var.ZpBGe2uQfcn8;
            int length = n00VarArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    defpackage.n00 n00Var = n00VarArr[i];
                    java.lang.String str = n00Var.ZpBGe2uQfcn8;
                    int i2 = n00Var.WDYagTQQm9ns;
                    int i3 = n00Var.giKS3J6vZuNy;
                    boolean z = n00Var.fWTAfUmVKrZq;
                    android.graphics.fonts.FontVariationAxis[] fromFontVariationSettings = android.graphics.fonts.FontVariationAxis.fromFontVariationSettings(n00Var.JhCgjQRTAOCT);
                    defpackage.vq1 vq1Var = this;
                    android.content.Context context2 = context;
                    if (vq1Var.Fu5WBEia9jBo(context2, obj, str, i2, i3, z ? 1 : 0, fromFontVariationSettings)) {
                        i++;
                        this = vq1Var;
                        context = context2;
                    } else {
                        try {
                            vq1Var.Ns0WNyEWdPsk.invoke(obj, null);
                            break;
                        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused2) {
                        }
                    }
                } else {
                    defpackage.vq1 vq1Var2 = this;
                    if (vq1Var2.EPEWHACkMcF1(obj)) {
                        return vq1Var2.CZa7MwI9IzLd(obj);
                    }
                }
            }
        }
        return null;
    }
}
