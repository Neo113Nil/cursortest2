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
public class k extends V2.a {

    /* renamed from: c, reason: collision with root package name */
    public static Class f1014c = null;

    /* renamed from: d, reason: collision with root package name */
    public static Constructor f1015d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Method f1016e = null;

    /* renamed from: f, reason: collision with root package name */
    public static Method f1017f = null;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f1018g = false;

    public static boolean y(Object obj, String str, int i, boolean z3) {
        z();
        try {
            return ((Boolean) f1016e.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    public static void z() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f1018g) {
            return;
        }
        f1018g = true;
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
        f1015d = constructor;
        f1014c = cls;
        f1016e = method2;
        f1017f = method;
    }

    @Override // V2.a
    public Typeface d(Context context, F.g gVar, Resources resources, int i) {
        z();
        try {
            Object newInstance = f1015d.newInstance(new Object[0]);
            for (F.h hVar : gVar.f857a) {
                File I8 = X2.e.I(context);
                if (I8 == null) {
                    return null;
                }
                try {
                    if (!X2.e.B(I8, resources, hVar.f863f)) {
                        return null;
                    }
                    if (!y(newInstance, I8.getPath(), hVar.f859b, hVar.f860c)) {
                        return null;
                    }
                    I8.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    I8.delete();
                }
            }
            z();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f1014c, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f1017f.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e9) {
                throw new RuntimeException(e9);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // V2.a
    public Typeface e(Context context, L.h[] hVarArr, int i) {
        File file;
        String readlink;
        if (hVarArr.length >= 1) {
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(k(hVarArr, i).f1598a, com.anythink.expressad.foundation.d.d.bv, null);
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
                            Typeface f3 = f(context, fileInputStream);
                            fileInputStream.close();
                            openFileDescriptor.close();
                            return f3;
                        }
                        Typeface f32 = f(context, fileInputStream);
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return f32;
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
