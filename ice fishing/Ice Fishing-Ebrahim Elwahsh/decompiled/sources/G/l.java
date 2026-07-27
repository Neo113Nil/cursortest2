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
public final class l extends com.bumptech.glide.d {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f1165a;

    /* renamed from: b, reason: collision with root package name */
    public static final Constructor f1166b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f1167c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f1168d;

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
        } catch (ClassNotFoundException | NoSuchMethodException e6) {
            Log.e("TypefaceCompatApi24Impl", e6.getClass().getName(), e6);
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
        }
        f1166b = constructor;
        f1165a = cls;
        f1167c = method;
        f1168d = method2;
    }

    public static boolean B(Object obj, ByteBuffer byteBuffer, int i, int i4, boolean z8) {
        try {
            return ((Boolean) f1167c.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i4), Boolean.valueOf(z8))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface C(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f1165a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f1168d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068 A[SYNTHETIC] */
    @Override // com.bumptech.glide.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Typeface h(Context context, F.g gVar, Resources resources, int i) {
        Object obj;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f1166b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (F.h hVar : gVar.f911a) {
                int i4 = hVar.f917f;
                File o9 = com.bumptech.glide.e.o(context);
                if (o9 != null) {
                    try {
                        if (com.bumptech.glide.e.i(o9, resources, i4)) {
                            try {
                                fileInputStream = new FileInputStream(o9);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                if (mappedByteBuffer == null) {
                                    if (B(obj, mappedByteBuffer, hVar.f916e, hVar.f913b, hVar.f914c)) {
                                    }
                                }
                            } finally {
                            }
                        }
                    } finally {
                        o9.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer == null) {
                }
            }
            return C(obj);
        }
        return null;
    }

    @Override // com.bumptech.glide.d
    public final Typeface i(Context context, L.h[] hVarArr, int i) {
        Object obj;
        int i4 = 0;
        try {
            obj = f1166b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            s.k kVar = new s.k();
            int length = hVarArr.length;
            while (true) {
                if (i4 >= length) {
                    Typeface C7 = C(obj);
                    if (C7 != null) {
                        return Typeface.create(C7, i);
                    }
                } else {
                    L.h hVar = hVarArr[i4];
                    Uri uri = hVar.f1686a;
                    ByteBuffer byteBuffer = (ByteBuffer) kVar.getOrDefault(uri, null);
                    if (byteBuffer == null) {
                        byteBuffer = com.bumptech.glide.e.t(context, uri);
                        kVar.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null) {
                        break;
                    }
                    if (!B(obj, byteBuffer, hVar.f1687b, hVar.f1688c, hVar.f1689d)) {
                        break;
                    }
                    i4++;
                }
            }
        }
        return null;
    }
}
