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

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class ne0 extends e50 {
    public static Method P7K7Inc8 = null;
    public static boolean Qr9iLBAD = false;
    public static Constructor VgvYg0wo;
    public static Method b2ZJblxo;
    public static Class wxUZMvaN;

    public static void OxcuoDLp() {
        Method method;
        Class<?> cls;
        Method method2;
        if (Qr9iLBAD) {
            return;
        }
        Qr9iLBAD = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        VgvYg0wo = constructor;
        wxUZMvaN = cls;
        P7K7Inc8 = method2;
        b2ZJblxo = method;
    }

    public static boolean sjUBp5pO(Object obj, String str, int i, boolean z) {
        OxcuoDLp();
        try {
            return ((Boolean) P7K7Inc8.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.e50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Typeface P7K7Inc8(Context context, ei[] eiVarArr, int i) {
        File file;
        File jb9XjC4I;
        Typeface createFromFile;
        String readlink;
        if (eiVarArr.length >= 1) {
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(e50.jb9XjC4I(eiVarArr, i).qoPGr6Ce, "r", null);
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
                            jb9XjC4I = f50.jb9XjC4I(context);
                            if (jb9XjC4I != null) {
                                try {
                                } catch (RuntimeException unused2) {
                                } catch (Throwable th) {
                                    jb9XjC4I.delete();
                                    throw th;
                                }
                                if (f50.P7K7Inc8(jb9XjC4I, fileInputStream)) {
                                    createFromFile = Typeface.createFromFile(jb9XjC4I.getPath());
                                    jb9XjC4I.delete();
                                    fileInputStream.close();
                                    openFileDescriptor.close();
                                    return createFromFile;
                                }
                                jb9XjC4I.delete();
                            }
                            createFromFile = null;
                            fileInputStream.close();
                            openFileDescriptor.close();
                            return createFromFile;
                        }
                        jb9XjC4I = f50.jb9XjC4I(context);
                        if (jb9XjC4I != null) {
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

    @Override // defpackage.e50
    public Typeface VgvYg0wo(Context context, bi biVar, Resources resources, int i) {
        OxcuoDLp();
        try {
            Object newInstance = VgvYg0wo.newInstance(null);
            for (ci ciVar : biVar.qoPGr6Ce) {
                File jb9XjC4I = f50.jb9XjC4I(context);
                if (jb9XjC4I == null) {
                    return null;
                }
                try {
                    if (!f50.VgvYg0wo(jb9XjC4I, resources, ciVar.P7K7Inc8)) {
                        return null;
                    }
                    if (!sjUBp5pO(newInstance, jb9XjC4I.getPath(), ciVar.NCTxEWno, ciVar.MdtA4re8)) {
                        return null;
                    }
                    jb9XjC4I.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    jb9XjC4I.delete();
                }
            }
            OxcuoDLp();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) wxUZMvaN, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) b2ZJblxo.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
