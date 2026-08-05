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

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class oe0 extends e50 {
    public static final Method P7K7Inc8;
    public static final Constructor VgvYg0wo;
    public static final Method b2ZJblxo;
    public static final Class wxUZMvaN;

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
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        VgvYg0wo = constructor;
        wxUZMvaN = cls;
        P7K7Inc8 = method2;
        b2ZJblxo = method;
    }

    public static Typeface OxcuoDLp(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) wxUZMvaN, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) b2ZJblxo.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean sjUBp5pO(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) P7K7Inc8.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // defpackage.e50
    public final Typeface P7K7Inc8(Context context, ei[] eiVarArr, int i) {
        Object obj;
        try {
            obj = VgvYg0wo.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            int i2 = 0;
            p70 p70Var = new p70(0);
            int length = eiVarArr.length;
            while (true) {
                if (i2 < length) {
                    ei eiVar = eiVarArr[i2];
                    Uri uri = eiVar.qoPGr6Ce;
                    ByteBuffer byteBuffer = (ByteBuffer) p70Var.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = f50.ow5vqvCr(context, uri);
                        p70Var.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null || !sjUBp5pO(obj, byteBuffer, eiVar.NCTxEWno, eiVar.MdtA4re8, eiVar.wxUZMvaN)) {
                        break;
                    }
                    i2++;
                } else {
                    Typeface OxcuoDLp = OxcuoDLp(obj);
                    if (OxcuoDLp != null) {
                        return Typeface.create(OxcuoDLp, i);
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.e50
    public final Typeface VgvYg0wo(Context context, bi biVar, Resources resources, int i) {
        Object obj;
        int i2;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = VgvYg0wo.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (ci ciVar : biVar.qoPGr6Ce) {
                int i3 = ciVar.P7K7Inc8;
                File jb9XjC4I = f50.jb9XjC4I(context);
                if (jb9XjC4I != null) {
                    try {
                        if (f50.VgvYg0wo(jb9XjC4I, resources, i3)) {
                            try {
                                fileInputStream = new FileInputStream(jb9XjC4I);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                i2 = (mappedByteBuffer != null && sjUBp5pO(obj, mappedByteBuffer, ciVar.VgvYg0wo, ciVar.NCTxEWno, ciVar.MdtA4re8)) ? i2 + 1 : 0;
                            } finally {
                            }
                        }
                    } finally {
                        jb9XjC4I.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer != null) {
                }
            }
            return OxcuoDLp(obj);
        }
        return null;
    }
}
