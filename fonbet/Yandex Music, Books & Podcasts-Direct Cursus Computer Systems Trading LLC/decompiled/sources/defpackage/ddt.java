package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class ddt extends hdg {
    public static Class d = null;
    public static Constructor e = null;
    public static Method f = null;
    public static Method g = null;
    public static boolean h = false;

    public static boolean o0(int i, Object obj, String str, boolean z) {
        p0();
        try {
            return ((Boolean) f.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            b6e.q(e2);
            return false;
        }
    }

    public static void p0() {
        Method method;
        Class<?> cls;
        Method method2;
        if (h) {
            return;
        }
        h = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        e = constructor;
        d = cls;
        f = method2;
        g = method;
    }

    @Override // defpackage.hdg
    public Typeface O(Context context, iqc iqcVar, Resources resources, int i) {
        p0();
        try {
            Object newInstance = e.newInstance(null);
            for (jqc jqcVar : iqcVar.a) {
                File v = ldg.v(context);
                if (v == null) {
                    return null;
                }
                try {
                    if (!ldg.o(v, resources, jqcVar.f)) {
                        return null;
                    }
                    if (!o0(jqcVar.b, newInstance, v.getPath(), jqcVar.c)) {
                        return null;
                    }
                    v.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    v.delete();
                }
            }
            p0();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) d, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) g.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                b6e.q(e2);
                return null;
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            b6e.q(e3);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.hdg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Typeface P(Context context, vqc[] vqcVarArr, int i) {
        File file;
        File v;
        Typeface createFromFile;
        String readlink;
        if (vqcVarArr.length >= 1) {
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(hdg.T(vqcVarArr, i).a, "r", null);
                if (openFileDescriptor != null) {
                    try {
                        try {
                            readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                        } finally {
                        }
                    } catch (ErrnoException unused) {
                    }
                    try {
                        if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                            file = new File(readlink);
                            if (file != null && file.canRead()) {
                                Typeface createFromFile2 = Typeface.createFromFile(file);
                                openFileDescriptor.close();
                                return createFromFile2;
                            }
                            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                            v = ldg.v(context);
                            if (v != null) {
                                try {
                                } catch (RuntimeException unused2) {
                                } catch (Throwable th) {
                                    v.delete();
                                    throw th;
                                }
                                if (ldg.p(v, fileInputStream)) {
                                    createFromFile = Typeface.createFromFile(v.getPath());
                                    v.delete();
                                    fileInputStream.close();
                                    openFileDescriptor.close();
                                    return createFromFile;
                                }
                                v.delete();
                            }
                            createFromFile = null;
                            fileInputStream.close();
                            openFileDescriptor.close();
                            return createFromFile;
                        }
                        v = ldg.v(context);
                        if (v != null) {
                        }
                        createFromFile = null;
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return createFromFile;
                    } finally {
                    }
                    file = null;
                    if (file != null) {
                        Typeface createFromFile22 = Typeface.createFromFile(file);
                        openFileDescriptor.close();
                        return createFromFile22;
                    }
                    FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
                } else if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused3) {
            }
        }
        return null;
    }
}
