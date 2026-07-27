package G;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* loaded from: classes.dex */
public final class l extends V2.a {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f1019c;

    /* renamed from: d, reason: collision with root package name */
    public static final Constructor f1020d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f1021e;

    /* renamed from: f, reason: collision with root package name */
    public static final Method f1022f;

    static {
        Class<?> cls;
        Constructor<?> constructor;
        Method method;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e9) {
            Log.e("TypefaceCompatApi24Impl", e9.getClass().getName(), e9);
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
        }
        f1020d = constructor;
        f1019c = cls;
        f1021e = method;
        f1022f = method2;
    }

    public static boolean y(Object obj, ByteBuffer byteBuffer, int i, int i6, boolean z3) {
        try {
            return ((Boolean) f1021e.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i6), Boolean.valueOf(z3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface z(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f1019c, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f1022f.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068 A[SYNTHETIC] */
    @Override // V2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Typeface d(Context context, F.g gVar, Resources resources, int i) {
        Object obj;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f1020d.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (F.h hVar : gVar.f857a) {
                int i6 = hVar.f863f;
                File I8 = X2.e.I(context);
                if (I8 != null) {
                    try {
                        if (X2.e.B(I8, resources, i6)) {
                            try {
                                fileInputStream = new FileInputStream(I8);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                if (mappedByteBuffer == null) {
                                    if (y(obj, mappedByteBuffer, hVar.f862e, hVar.f859b, hVar.f860c)) {
                                    }
                                }
                            } finally {
                            }
                        }
                    } finally {
                        I8.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer == null) {
                }
            }
            return z(obj);
        }
        return null;
    }

    @Override // V2.a
    public final Typeface e(Context context, L.h[] hVarArr, int i) {
        Object obj;
        int i6 = 0;
        try {
            obj = f1020d.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            s.k kVar = new s.k();
            int length = hVarArr.length;
            while (true) {
                if (i6 >= length) {
                    Typeface z3 = z(obj);
                    if (z3 != null) {
                        return Typeface.create(z3, i);
                    }
                } else {
                    L.h hVar = hVarArr[i6];
                    Uri uri = hVar.f1598a;
                    ByteBuffer byteBuffer = (ByteBuffer) kVar.getOrDefault(uri, null);
                    if (byteBuffer == null) {
                        byteBuffer = X2.e.M(context, uri);
                        kVar.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null) {
                        break;
                    }
                    if (!y(obj, byteBuffer, hVar.f1599b, hVar.f1600c, hVar.f1601d)) {
                        break;
                    }
                    i6++;
                }
            }
        }
        return null;
    }
}
