package r;

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
import q.C1033c;
import q.C1034d;
import u0.AbstractC1050a;

/* loaded from: classes.dex */
public class e extends AbstractC1050a {

    /* renamed from: c, reason: collision with root package name */
    public static Class f8454c = null;

    /* renamed from: d, reason: collision with root package name */
    public static Constructor f8455d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Method f8456e = null;

    /* renamed from: f, reason: collision with root package name */
    public static Method f8457f = null;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f8458g = false;

    public static boolean G(String str, boolean z2, int i2, Object obj) {
        H();
        try {
            return ((Boolean) f8456e.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void H() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f8458g) {
            return;
        }
        f8458g = true;
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
        f8455d = constructor;
        f8454c = cls;
        f8456e = method2;
        f8457f = method;
    }

    @Override // u0.AbstractC1050a
    public Typeface j(Context context, C1033c c1033c, Resources resources, int i2) {
        H();
        try {
            Object newInstance = f8455d.newInstance(null);
            for (C1034d c1034d : c1033c.f8433a) {
                File s2 = R1.d.s(context);
                if (s2 == null) {
                    return null;
                }
                try {
                    if (!R1.d.e(s2, resources, c1034d.f8439f)) {
                        return null;
                    }
                    if (!G(s2.getPath(), c1034d.f8436c, c1034d.f8435b, newInstance)) {
                        return null;
                    }
                    s2.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    s2.delete();
                }
            }
            H();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f8454c, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f8457f.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // u0.AbstractC1050a
    public Typeface k(Context context, v.g[] gVarArr, int i2) {
        File file;
        String readlink;
        if (gVarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(q(gVarArr, i2).f8497a, "r", null);
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
                        Typeface l2 = l(context, fileInputStream);
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return l2;
                    }
                    Typeface l22 = l(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return l22;
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
