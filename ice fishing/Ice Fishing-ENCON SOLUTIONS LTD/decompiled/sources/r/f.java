package r;

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
import l.k;
import q.C1033c;
import q.C1034d;
import u0.AbstractC1050a;

/* loaded from: classes.dex */
public final class f extends AbstractC1050a {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f8459c;

    /* renamed from: d, reason: collision with root package name */
    public static final Constructor f8460d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f8461e;

    /* renamed from: f, reason: collision with root package name */
    public static final Method f8462f;

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
        f8460d = constructor;
        f8459c = cls;
        f8461e = method2;
        f8462f = method;
    }

    public static boolean G(Object obj, ByteBuffer byteBuffer, int i2, int i3, boolean z2) {
        try {
            return ((Boolean) f8461e.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface H(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f8459c, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f8462f.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b A[SYNTHETIC] */
    @Override // u0.AbstractC1050a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Typeface j(Context context, C1033c c1033c, Resources resources, int i2) {
        Object obj;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f8460d.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (C1034d c1034d : c1033c.f8433a) {
            int i3 = c1034d.f8439f;
            File s2 = R1.d.s(context);
            if (s2 != null) {
                try {
                    if (R1.d.e(s2, resources, i3)) {
                        try {
                            fileInputStream = new FileInputStream(s2);
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
                            if (!G(obj, mappedByteBuffer, c1034d.f8438e, c1034d.f8435b, c1034d.f8436c)) {
                                return null;
                            }
                        } finally {
                        }
                    }
                } finally {
                    s2.delete();
                }
            }
            mappedByteBuffer = null;
            if (mappedByteBuffer != null) {
            }
        }
        return H(obj);
    }

    @Override // u0.AbstractC1050a
    public final Typeface k(Context context, v.g[] gVarArr, int i2) {
        Object obj;
        try {
            obj = f8460d.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        k kVar = new k();
        for (v.g gVar : gVarArr) {
            Uri uri = gVar.f8497a;
            ByteBuffer byteBuffer = (ByteBuffer) kVar.getOrDefault(uri, null);
            if (byteBuffer == null) {
                byteBuffer = R1.d.A(context, uri);
                kVar.put(uri, byteBuffer);
            }
            if (byteBuffer == null) {
                return null;
            }
            if (!G(obj, byteBuffer, gVar.f8498b, gVar.f8499c, gVar.f8500d)) {
                return null;
            }
        }
        Typeface H2 = H(obj);
        if (H2 == null) {
            return null;
        }
        return Typeface.create(H2, i2);
    }
}
