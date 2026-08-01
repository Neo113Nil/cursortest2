package G;

import L.j;
import a.AbstractC0078a;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class g extends AbstractC0078a {

    /* renamed from: l, reason: collision with root package name */
    public static Class f270l = null;

    /* renamed from: m, reason: collision with root package name */
    public static Constructor f271m = null;

    /* renamed from: n, reason: collision with root package name */
    public static Method f272n = null;

    /* renamed from: o, reason: collision with root package name */
    public static Method f273o = null;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f274p = false;
    public final Class e;

    /* renamed from: f, reason: collision with root package name */
    public final Constructor f275f;

    /* renamed from: g, reason: collision with root package name */
    public final Method f276g;

    /* renamed from: h, reason: collision with root package name */
    public final Method f277h;
    public final Method i;
    public final Method j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f278k;

    public g() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = m0(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = n0(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.e = cls;
        this.f275f = constructor;
        this.f276g = method2;
        this.f277h = method3;
        this.i = method4;
        this.j = method5;
        this.f278k = method;
    }

    public static boolean g0(Object obj, String str, int i, boolean z2) {
        j0();
        try {
            return ((Boolean) f272n.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static void j0() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f274p) {
            return;
        }
        f274p = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        f271m = constructor;
        f270l = cls;
        f272n = method2;
        f273o = method;
    }

    public static Method m0(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void e0(Object obj) {
        try {
            this.j.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean f0(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f276g.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface h0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.e, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f278k.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean i0(Object obj) {
        try {
            return ((Boolean) this.i.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean k0() {
        Method method = this.f276g;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public final Object l0() {
        try {
            return this.f275f.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method n0(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // a.AbstractC0078a
    public final Typeface o(Context context, F.f fVar, Resources resources, int i) {
        if (k0()) {
            Object l02 = l0();
            if (l02 == null) {
                return null;
            }
            for (F.g gVar : fVar.f197a) {
                if (!f0(context, l02, gVar.f198a, gVar.e, gVar.f199b, gVar.f200c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(gVar.f201d))) {
                    e0(l02);
                    return null;
                }
            }
            if (i0(l02)) {
                return h0(l02);
            }
            return null;
        }
        j0();
        try {
            Object newInstance = f271m.newInstance(null);
            for (F.g gVar2 : fVar.f197a) {
                File I2 = AbstractC0078a.I(context);
                if (I2 == null) {
                    return null;
                }
                try {
                    if (AbstractC0078a.m(I2, resources, gVar2.f202f) && g0(newInstance, I2.getPath(), gVar2.f199b, gVar2.f200c)) {
                        I2.delete();
                    }
                } catch (RuntimeException unused) {
                } catch (Throwable th) {
                    I2.delete();
                    throw th;
                }
                I2.delete();
                return null;
            }
            j0();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f270l, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f273o.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // a.AbstractC0078a
    public final Typeface p(Context context, j[] jVarArr, int i) {
        Typeface h02;
        boolean z2;
        if (jVarArr.length < 1) {
            return null;
        }
        if (!k0()) {
            j w2 = w(jVarArr, i);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(w2.f431a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(w2.f433c).setItalic(w2.f434d).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (j jVar : jVarArr) {
            if (jVar.e == 0) {
                Uri uri = jVar.f431a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, AbstractC0078a.Q(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object l02 = l0();
        if (l02 == null) {
            return null;
        }
        int length = jVarArr.length;
        int i2 = 0;
        boolean z3 = false;
        while (i2 < length) {
            j jVar2 = jVarArr[i2];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(jVar2.f431a);
            if (byteBuffer != null) {
                try {
                    z2 = ((Boolean) this.f277h.invoke(l02, byteBuffer, Integer.valueOf(jVar2.f432b), null, Integer.valueOf(jVar2.f433c), Integer.valueOf(jVar2.f434d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    z2 = false;
                }
                if (!z2) {
                    e0(l02);
                    return null;
                }
                z3 = true;
            }
            i2++;
            z3 = z3;
        }
        if (!z3) {
            e0(l02);
            return null;
        }
        if (i0(l02) && (h02 = h0(l02)) != null) {
            return Typeface.create(h02, i);
        }
        return null;
    }

    @Override // a.AbstractC0078a
    public final Typeface r(Context context, Resources resources, int i, String str, int i2) {
        if (!k0()) {
            return super.r(context, resources, i, str, i2);
        }
        Object l02 = l0();
        if (l02 == null) {
            return null;
        }
        if (!f0(context, l02, str, 0, -1, -1, null)) {
            e0(l02);
            return null;
        }
        if (i0(l02)) {
            return h0(l02);
        }
        return null;
    }
}
