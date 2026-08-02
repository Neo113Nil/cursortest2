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
public final class l extends Q3.b {

    /* renamed from: b, reason: collision with root package name */
    public static final Class f1045b;

    /* renamed from: c, reason: collision with root package name */
    public static final Constructor f1046c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f1047d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f1048e;

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
        f1046c = constructor;
        f1045b = cls;
        f1047d = method;
        f1048e = method2;
    }

    public static Typeface A(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f1045b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f1048e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean z(Object obj, ByteBuffer byteBuffer, int i, int i4, boolean z6) {
        try {
            return ((Boolean) f1047d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i4), Boolean.valueOf(z6))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068 A[SYNTHETIC] */
    @Override // Q3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Typeface c(Context context, F.g gVar, Resources resources, int i) {
        Object obj;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f1046c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (F.h hVar : gVar.f920a) {
                int i4 = hVar.f926f;
                File n9 = S0.f.n(context);
                if (n9 != null) {
                    try {
                        if (S0.f.g(n9, resources, i4)) {
                            try {
                                fileInputStream = new FileInputStream(n9);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                if (mappedByteBuffer == null) {
                                    if (z(obj, mappedByteBuffer, hVar.f925e, hVar.f922b, hVar.f923c)) {
                                    }
                                }
                            } finally {
                            }
                        }
                    } finally {
                        n9.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer == null) {
                }
            }
            return A(obj);
        }
        return null;
    }

    @Override // Q3.b
    public final Typeface d(Context context, L.h[] hVarArr, int i) {
        Object obj;
        int i4 = 0;
        try {
            obj = f1046c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            s.k kVar = new s.k();
            int length = hVarArr.length;
            while (true) {
                if (i4 >= length) {
                    Typeface A9 = A(obj);
                    if (A9 != null) {
                        return Typeface.create(A9, i);
                    }
                } else {
                    L.h hVar = hVarArr[i4];
                    Uri uri = hVar.f1707a;
                    ByteBuffer byteBuffer = (ByteBuffer) kVar.getOrDefault(uri, null);
                    if (byteBuffer == null) {
                        byteBuffer = S0.f.p(context, uri);
                        kVar.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null) {
                        break;
                    }
                    if (!z(obj, byteBuffer, hVar.f1708b, hVar.f1709c, hVar.f1710d)) {
                        break;
                    }
                    i4++;
                }
            }
        }
        return null;
    }
}
