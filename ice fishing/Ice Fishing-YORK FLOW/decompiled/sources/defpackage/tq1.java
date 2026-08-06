package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class tq1 extends defpackage.q70 {
    public static final java.lang.reflect.Method JhCgjQRTAOCT;
    public static final java.lang.Class ZpBGe2uQfcn8;
    public static final java.lang.reflect.Method fWTAfUmVKrZq;
    public static final java.lang.reflect.Constructor giKS3J6vZuNy;

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
        giKS3J6vZuNy = constructor;
        ZpBGe2uQfcn8 = cls;
        fWTAfUmVKrZq = method2;
        JhCgjQRTAOCT = method;
    }

    public static android.graphics.Typeface Jkfc0NcwyPL8(java.lang.Object obj) {
        try {
            java.lang.Object newInstance = java.lang.reflect.Array.newInstance((java.lang.Class<?>) ZpBGe2uQfcn8, 1);
            java.lang.reflect.Array.set(newInstance, 0, obj);
            return (android.graphics.Typeface) JhCgjQRTAOCT.invoke(null, newInstance);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean OVwOqzUGHcCU(java.lang.Object obj, java.nio.ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((java.lang.Boolean) fWTAfUmVKrZq.invoke(obj, byteBuffer, java.lang.Integer.valueOf(i), null, java.lang.Integer.valueOf(i2), java.lang.Boolean.valueOf(z))).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return false;
        }
    }

    @Override // defpackage.q70
    public final android.graphics.Typeface WmetiUbpKU9I(android.content.Context context, defpackage.y00[] y00VarArr) {
        java.lang.Object obj;
        try {
            obj = giKS3J6vZuNy.newInstance(null);
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            defpackage.ud1 ud1Var = new defpackage.ud1();
            int length = y00VarArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    defpackage.y00 y00Var = y00VarArr[i];
                    android.net.Uri uri = y00Var.ZpBGe2uQfcn8;
                    java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) ud1Var.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = defpackage.v70.UmgHb6n58gfG(context, uri);
                        ud1Var.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null || !OVwOqzUGHcCU(obj, byteBuffer, y00Var.giKS3J6vZuNy, y00Var.fWTAfUmVKrZq, y00Var.JhCgjQRTAOCT)) {
                        break;
                    }
                    i++;
                } else {
                    android.graphics.Typeface Jkfc0NcwyPL8 = Jkfc0NcwyPL8(obj);
                    if (Jkfc0NcwyPL8 != null) {
                        return android.graphics.Typeface.create(Jkfc0NcwyPL8, 0);
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.q70
    public final android.graphics.Typeface XntWc4eZSQ8j(android.content.Context context, defpackage.m00 m00Var, android.content.res.Resources resources) {
        java.lang.Object obj;
        int i;
        java.nio.MappedByteBuffer mappedByteBuffer;
        java.io.FileInputStream fileInputStream;
        try {
            obj = giKS3J6vZuNy.newInstance(null);
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (defpackage.n00 n00Var : m00Var.ZpBGe2uQfcn8) {
                int i2 = n00Var.oh71FJcDz6S2;
                java.io.File IJ0hOnjhPOri = defpackage.v70.IJ0hOnjhPOri(context);
                if (IJ0hOnjhPOri != null) {
                    try {
                        if (defpackage.v70.gUjdnLbkVAaA(IJ0hOnjhPOri, resources, i2)) {
                            try {
                                fileInputStream = new java.io.FileInputStream(IJ0hOnjhPOri);
                            } catch (java.io.IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                java.nio.channels.FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                i = (mappedByteBuffer != null && OVwOqzUGHcCU(obj, mappedByteBuffer, n00Var.WDYagTQQm9ns, n00Var.giKS3J6vZuNy, n00Var.fWTAfUmVKrZq)) ? i + 1 : 0;
                            } finally {
                            }
                        }
                    } finally {
                        IJ0hOnjhPOri.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer != null) {
                }
            }
            return Jkfc0NcwyPL8(obj);
        }
        return null;
    }
}
