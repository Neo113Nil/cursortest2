package G;

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
public class k extends Q3.b {

    /* renamed from: b, reason: collision with root package name */
    public static Class f1040b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Constructor f1041c = null;

    /* renamed from: d, reason: collision with root package name */
    public static Method f1042d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Method f1043e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f1044f = false;

    public static void A() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f1044f) {
            return;
        }
        f1044f = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e9) {
            Log.e("TypefaceCompatApi21Impl", e9.getClass().getName(), e9);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f1041c = constructor;
        f1040b = cls;
        f1042d = method2;
        f1043e = method;
    }

    public static boolean z(Object obj, String str, int i, boolean z6) {
        A();
        try {
            return ((Boolean) f1042d.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z6))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    @Override // Q3.b
    public Typeface c(Context context, F.g gVar, Resources resources, int i) {
        A();
        try {
            Object newInstance = f1041c.newInstance(new Object[0]);
            for (F.h hVar : gVar.f920a) {
                File n9 = S0.f.n(context);
                if (n9 == null) {
                    return null;
                }
                try {
                    if (!S0.f.g(n9, resources, hVar.f926f)) {
                        return null;
                    }
                    if (!z(newInstance, n9.getPath(), hVar.f922b, hVar.f923c)) {
                        return null;
                    }
                    n9.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    n9.delete();
                }
            }
            A();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f1040b, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f1043e.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e9) {
                throw new RuntimeException(e9);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // Q3.b
    public Typeface d(Context context, L.h[] hVarArr, int i) {
        File file;
        String readlink;
        if (hVarArr.length >= 1) {
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(g(hVarArr, i).f1707a, com.anythink.expressad.foundation.d.d.bv, null);
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
                                Typeface createFromFile = Typeface.createFromFile(file);
                                openFileDescriptor.close();
                                return createFromFile;
                            }
                            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                            Typeface e9 = e(context, fileInputStream);
                            fileInputStream.close();
                            openFileDescriptor.close();
                            return e9;
                        }
                        Typeface e92 = e(context, fileInputStream);
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return e92;
                    } finally {
                    }
                    file = null;
                    if (file != null) {
                        Typeface createFromFile2 = Typeface.createFromFile(file);
                        openFileDescriptor.close();
                        return createFromFile2;
                    }
                    FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
                } else if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }
}
