package p;

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
public class e extends o.g {

    /* renamed from: a, reason: collision with root package name */
    public static Class f2799a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Constructor f2800b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Method f2801c = null;

    /* renamed from: d, reason: collision with root package name */
    public static Method f2802d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f2803e = false;

    public static boolean D(Object obj, String str, int i2, boolean z2) {
        E();
        try {
            return ((Boolean) f2801c.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void E() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f2803e) {
            return;
        }
        f2803e = true;
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
        f2800b = constructor;
        f2799a = cls;
        f2801c = method2;
        f2802d = method;
    }

    @Override // o.g
    public Typeface g(Context context, o.c cVar, Resources resources, int i2) {
        E();
        try {
            Object newInstance = f2800b.newInstance(null);
            for (o.d dVar : cVar.f2779a) {
                File t2 = o.g.t(context);
                if (t2 == null) {
                    return null;
                }
                try {
                    if (!o.g.d(t2, resources, dVar.f2785f)) {
                        return null;
                    }
                    if (!D(newInstance, t2.getPath(), dVar.f2781b, dVar.f2782c)) {
                        return null;
                    }
                    t2.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    t2.delete();
                }
            }
            E();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f2799a, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f2802d.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // o.g
    public Typeface h(Context context, t.h[] hVarArr, int i2) {
        File file;
        String readlink;
        if (hVarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(n(hVarArr, i2).f2971a, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                } catch (ErrnoException unused) {
                }
                try {
                    if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                        file = new File(readlink);
                        if (file != null && file.canRead()) {
                            Typeface createFromFile = Typeface.createFromFile(file);
                            openFileDescriptor.close();
                            return createFromFile;
                        }
                        FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                        Typeface i3 = i(context, fileInputStream);
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return i3;
                    }
                    Typeface i32 = i(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return i32;
                } finally {
                }
                file = null;
                if (file != null) {
                    Typeface createFromFile2 = Typeface.createFromFile(file);
                    openFileDescriptor.close();
                    return createFromFile2;
                }
                FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
            } finally {
            }
        } catch (IOException unused2) {
            return null;
        }
    }
}
