package p;

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
public final class f extends o.g {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f2804a;

    /* renamed from: b, reason: collision with root package name */
    public static final Constructor f2805b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f2806c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f2807d;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            method2 = null;
        }
        f2805b = constructor;
        f2804a = cls;
        f2806c = method2;
        f2807d = method;
    }

    public static boolean D(Object obj, ByteBuffer byteBuffer, int i2, int i3, boolean z2) {
        try {
            return ((Boolean) f2806c.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface E(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f2804a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f2807d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b A[SYNTHETIC] */
    @Override // o.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Typeface g(Context context, o.c cVar, Resources resources, int i2) {
        Object obj;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f2805b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (o.d dVar : cVar.f2779a) {
            int i3 = dVar.f2785f;
            File t2 = o.g.t(context);
            if (t2 != null) {
                try {
                    if (o.g.d(t2, resources, i3)) {
                        try {
                            fileInputStream = new FileInputStream(t2);
                        } catch (IOException unused2) {
                            mappedByteBuffer = null;
                        }
                        try {
                            FileChannel channel = fileInputStream.getChannel();
                            mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                            fileInputStream.close();
                            if (mappedByteBuffer != null) {
                                return null;
                            }
                            if (!D(obj, mappedByteBuffer, dVar.f2784e, dVar.f2781b, dVar.f2782c)) {
                                return null;
                            }
                        } finally {
                        }
                    }
                } finally {
                    t2.delete();
                }
            }
            mappedByteBuffer = null;
            if (mappedByteBuffer != null) {
            }
        }
        return E(obj);
    }

    @Override // o.g
    public final Typeface h(Context context, t.h[] hVarArr, int i2) {
        Object obj;
        try {
            obj = f2805b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        k.i iVar = new k.i();
        for (t.h hVar : hVarArr) {
            Uri uri = hVar.f2971a;
            ByteBuffer byteBuffer = (ByteBuffer) iVar.getOrDefault(uri, null);
            if (byteBuffer == null) {
                byteBuffer = o.g.y(context, uri);
                iVar.put(uri, byteBuffer);
            }
            if (byteBuffer == null) {
                return null;
            }
            if (!D(obj, byteBuffer, hVar.f2972b, hVar.f2973c, hVar.f2974d)) {
                return null;
            }
        }
        Typeface E2 = E(obj);
        if (E2 == null) {
            return null;
        }
        return Typeface.create(E2, i2);
    }
}
