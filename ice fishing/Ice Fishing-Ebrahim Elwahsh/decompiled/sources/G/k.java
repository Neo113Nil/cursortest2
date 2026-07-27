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
public class k extends com.bumptech.glide.d {

    /* renamed from: a, reason: collision with root package name */
    public static Class f1160a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Constructor f1161b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Method f1162c = null;

    /* renamed from: d, reason: collision with root package name */
    public static Method f1163d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f1164e = false;

    public static boolean B(Object obj, String str, int i, boolean z8) {
        C();
        try {
            return ((Boolean) f1162c.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z8))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    public static void C() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f1164e) {
            return;
        }
        f1164e = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e6) {
            Log.e("TypefaceCompatApi21Impl", e6.getClass().getName(), e6);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f1161b = constructor;
        f1160a = cls;
        f1162c = method2;
        f1163d = method;
    }

    @Override // com.bumptech.glide.d
    public Typeface h(Context context, F.g gVar, Resources resources, int i) {
        C();
        try {
            Object newInstance = f1161b.newInstance(new Object[0]);
            for (F.h hVar : gVar.f911a) {
                File o9 = com.bumptech.glide.e.o(context);
                if (o9 == null) {
                    return null;
                }
                try {
                    if (!com.bumptech.glide.e.i(o9, resources, hVar.f917f)) {
                        return null;
                    }
                    if (!B(newInstance, o9.getPath(), hVar.f913b, hVar.f914c)) {
                        return null;
                    }
                    o9.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    o9.delete();
                }
            }
            C();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f1160a, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f1163d.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e6) {
                throw new RuntimeException(e6);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    @Override // com.bumptech.glide.d
    public Typeface i(Context context, L.h[] hVarArr, int i) {
        File file;
        String readlink;
        if (hVarArr.length >= 1) {
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(l(hVarArr, i).f1686a, com.anythink.expressad.foundation.d.d.bv, null);
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
                            Typeface j9 = j(context, fileInputStream);
                            fileInputStream.close();
                            openFileDescriptor.close();
                            return j9;
                        }
                        Typeface j92 = j(context, fileInputStream);
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return j92;
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
