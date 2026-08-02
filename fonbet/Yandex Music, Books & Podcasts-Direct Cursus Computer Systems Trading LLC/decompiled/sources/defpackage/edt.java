package defpackage;

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
public final class edt extends hdg {
    public static final Class d;
    public static final Constructor e;
    public static final Method f;
    public static final Method g;

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
        e = constructor;
        d = cls;
        f = method2;
        g = method;
    }

    public static boolean o0(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface p0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) d, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) g.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // defpackage.hdg
    public final Typeface O(Context context, iqc iqcVar, Resources resources, int i) {
        Object obj;
        int i2;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = e.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (jqc jqcVar : iqcVar.a) {
                int i3 = jqcVar.f;
                File v = ldg.v(context);
                if (v != null) {
                    try {
                        if (ldg.o(v, resources, i3)) {
                            try {
                                fileInputStream = new FileInputStream(v);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                i2 = (mappedByteBuffer != null && o0(obj, mappedByteBuffer, jqcVar.e, jqcVar.b, jqcVar.c)) ? i2 + 1 : 0;
                            } finally {
                            }
                        }
                    } finally {
                        v.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer != null) {
                }
            }
            return p0(obj);
        }
        return null;
    }

    @Override // defpackage.hdg
    public final Typeface P(Context context, vqc[] vqcVarArr, int i) {
        Object obj;
        try {
            obj = e.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            int i2 = 0;
            ciq ciqVar = new ciq(0);
            int length = vqcVarArr.length;
            while (true) {
                if (i2 < length) {
                    vqc vqcVar = vqcVarArr[i2];
                    Uri uri = vqcVar.a;
                    ByteBuffer byteBuffer = (ByteBuffer) ciqVar.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = ldg.y(context, uri);
                        ciqVar.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null || !o0(obj, byteBuffer, vqcVar.b, vqcVar.c, vqcVar.d)) {
                        break;
                    }
                    i2++;
                } else {
                    Typeface p0 = p0(obj);
                    if (p0 != null) {
                        return Typeface.create(p0, i);
                    }
                }
            }
        }
        return null;
    }
}
