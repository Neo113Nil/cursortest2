package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class sq1 extends defpackage.q70 {
    public static java.lang.reflect.Method JhCgjQRTAOCT = null;
    public static boolean WDYagTQQm9ns = false;
    public static java.lang.Class ZpBGe2uQfcn8;
    public static java.lang.reflect.Method fWTAfUmVKrZq;
    public static java.lang.reflect.Constructor giKS3J6vZuNy;

    public static void Jkfc0NcwyPL8() {
        java.lang.reflect.Method method;
        java.lang.Class<?> cls;
        java.lang.reflect.Method method2;
        if (WDYagTQQm9ns) {
            return;
        }
        WDYagTQQm9ns = true;
        java.lang.reflect.Constructor<?> constructor = null;
        try {
            cls = java.lang.Class.forName("android.graphics.FontFamily");
            java.lang.reflect.Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", java.lang.String.class, java.lang.Integer.TYPE, java.lang.Boolean.TYPE);
            method = android.graphics.Typeface.class.getMethod("createFromFamiliesWithDefault", java.lang.reflect.Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException e) {
            android.util.Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        giKS3J6vZuNy = constructor;
        ZpBGe2uQfcn8 = cls;
        fWTAfUmVKrZq = method2;
        JhCgjQRTAOCT = method;
    }

    public static boolean OVwOqzUGHcCU(java.lang.Object obj, java.lang.String str, int i, boolean z) {
        Jkfc0NcwyPL8();
        try {
            return ((java.lang.Boolean) fWTAfUmVKrZq.invoke(obj, str, java.lang.Integer.valueOf(i), java.lang.Boolean.valueOf(z))).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.q70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public android.graphics.Typeface WmetiUbpKU9I(android.content.Context context, defpackage.y00[] y00VarArr) {
        java.io.File file;
        java.io.File IJ0hOnjhPOri;
        android.graphics.Typeface createFromFile;
        java.lang.String readlink;
        if (y00VarArr.length >= 1) {
            try {
                android.os.ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(defpackage.q70.ZVVdXbWmyCSK(y00VarArr).ZpBGe2uQfcn8, "r", null);
                if (openFileDescriptor != null) {
                    try {
                        try {
                            readlink = android.system.Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                        } finally {
                        }
                    } catch (android.system.ErrnoException unused) {
                    }
                    try {
                        if (android.system.OsConstants.S_ISREG(android.system.Os.stat(readlink).st_mode)) {
                            file = new java.io.File(readlink);
                            if (file != null && file.canRead()) {
                                android.graphics.Typeface createFromFile2 = android.graphics.Typeface.createFromFile(file);
                                openFileDescriptor.close();
                                return createFromFile2;
                            }
                            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(openFileDescriptor.getFileDescriptor());
                            IJ0hOnjhPOri = defpackage.v70.IJ0hOnjhPOri(context);
                            if (IJ0hOnjhPOri != null) {
                                try {
                                } catch (java.lang.RuntimeException unused2) {
                                } catch (java.lang.Throwable th) {
                                    IJ0hOnjhPOri.delete();
                                    throw th;
                                }
                                if (defpackage.v70.T1fB7bDYiVJQ(IJ0hOnjhPOri, fileInputStream)) {
                                    createFromFile = android.graphics.Typeface.createFromFile(IJ0hOnjhPOri.getPath());
                                    IJ0hOnjhPOri.delete();
                                    fileInputStream.close();
                                    openFileDescriptor.close();
                                    return createFromFile;
                                }
                                IJ0hOnjhPOri.delete();
                            }
                            createFromFile = null;
                            fileInputStream.close();
                            openFileDescriptor.close();
                            return createFromFile;
                        }
                        IJ0hOnjhPOri = defpackage.v70.IJ0hOnjhPOri(context);
                        if (IJ0hOnjhPOri != null) {
                        }
                        createFromFile = null;
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return createFromFile;
                    } finally {
                    }
                    file = null;
                    if (file != null) {
                        android.graphics.Typeface createFromFile22 = android.graphics.Typeface.createFromFile(file);
                        openFileDescriptor.close();
                        return createFromFile22;
                    }
                    java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(openFileDescriptor.getFileDescriptor());
                } else if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                    return null;
                }
            } catch (java.io.IOException unused3) {
            }
        }
        return null;
    }

    @Override // defpackage.q70
    public android.graphics.Typeface XntWc4eZSQ8j(android.content.Context context, defpackage.m00 m00Var, android.content.res.Resources resources) {
        Jkfc0NcwyPL8();
        try {
            java.lang.Object newInstance = giKS3J6vZuNy.newInstance(null);
            for (defpackage.n00 n00Var : m00Var.ZpBGe2uQfcn8) {
                java.io.File IJ0hOnjhPOri = defpackage.v70.IJ0hOnjhPOri(context);
                if (IJ0hOnjhPOri == null) {
                    return null;
                }
                try {
                    if (!defpackage.v70.gUjdnLbkVAaA(IJ0hOnjhPOri, resources, n00Var.oh71FJcDz6S2)) {
                        return null;
                    }
                    if (!OVwOqzUGHcCU(newInstance, IJ0hOnjhPOri.getPath(), n00Var.giKS3J6vZuNy, n00Var.fWTAfUmVKrZq)) {
                        return null;
                    }
                    IJ0hOnjhPOri.delete();
                } catch (java.lang.RuntimeException unused) {
                    return null;
                } finally {
                    IJ0hOnjhPOri.delete();
                }
            }
            Jkfc0NcwyPL8();
            try {
                java.lang.Object newInstance2 = java.lang.reflect.Array.newInstance((java.lang.Class<?>) ZpBGe2uQfcn8, 1);
                java.lang.reflect.Array.set(newInstance2, 0, newInstance);
                return (android.graphics.Typeface) JhCgjQRTAOCT.invoke(null, newInstance2);
            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e) {
                throw new java.lang.RuntimeException(e);
            }
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }
}
