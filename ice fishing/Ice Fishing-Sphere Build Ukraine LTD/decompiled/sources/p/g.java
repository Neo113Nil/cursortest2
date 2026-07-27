package p;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
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
public class g extends e {

    /* renamed from: f, reason: collision with root package name */
    public final Class f2816f;

    /* renamed from: g, reason: collision with root package name */
    public final Constructor f2817g;

    /* renamed from: h, reason: collision with root package name */
    public final Method f2818h;

    /* renamed from: i, reason: collision with root package name */
    public final Method f2819i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f2820j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f2821k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f2822l;

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
            method2 = J(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = K(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e2.getClass().getName()), e2);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f2816f = cls;
        this.f2817g = constructor;
        this.f2818h = method2;
        this.f2819i = method3;
        this.f2820j = method4;
        this.f2821k = method5;
        this.f2822l = method;
    }

    public static Method J(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void D(Object obj) {
        try {
            this.f2821k.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean E(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2818h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface F(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f2816f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f2822l.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean G(Object obj) {
        try {
            return ((Boolean) this.f2820j.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean H() {
        Method method = this.f2818h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public final Object I() {
        try {
            return this.f2817g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method K(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // p.e, o.g
    public final Typeface g(Context context, o.c cVar, Resources resources, int i2) {
        if (!H()) {
            return super.g(context, cVar, resources, i2);
        }
        Object I2 = I();
        if (I2 == null) {
            return null;
        }
        for (o.d dVar : cVar.f2787a) {
            if (!E(context, I2, dVar.f2788a, dVar.f2792e, dVar.f2789b, dVar.f2790c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.f2791d))) {
                D(I2);
                return null;
            }
        }
        if (G(I2)) {
            return F(I2);
        }
        return null;
    }

    @Override // p.e, o.g
    public final Typeface h(Context context, t.h[] hVarArr, int i2) {
        Typeface F2;
        boolean z2;
        if (hVarArr.length < 1) {
            return null;
        }
        if (!H()) {
            t.h l2 = l(hVarArr, i2);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(l2.f2976a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(l2.f2978c).setItalic(l2.f2979d).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (t.h hVar : hVarArr) {
            if (hVar.f2980e == 0) {
                Uri uri = hVar.f2976a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, o.g.v(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object I2 = I();
        if (I2 == null) {
            return null;
        }
        int length = hVarArr.length;
        int i3 = 0;
        boolean z3 = false;
        while (i3 < length) {
            t.h hVar2 = hVarArr[i3];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(hVar2.f2976a);
            if (byteBuffer != null) {
                try {
                    z2 = ((Boolean) this.f2819i.invoke(I2, byteBuffer, Integer.valueOf(hVar2.f2977b), null, Integer.valueOf(hVar2.f2978c), Integer.valueOf(hVar2.f2979d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    z2 = false;
                }
                if (!z2) {
                    D(I2);
                    return null;
                }
                z3 = true;
            }
            i3++;
            z3 = z3;
        }
        if (!z3) {
            D(I2);
            return null;
        }
        if (G(I2) && (F2 = F(I2)) != null) {
            return Typeface.create(F2, i2);
        }
        return null;
    }

    @Override // o.g
    public final Typeface j(Context context, Resources resources, int i2, String str, int i3) {
        if (!H()) {
            return super.j(context, resources, i2, str, i3);
        }
        Object I2 = I();
        if (I2 == null) {
            return null;
        }
        if (!E(context, I2, str, 0, -1, -1, null)) {
            D(I2);
            return null;
        }
        if (G(I2)) {
            return F(I2);
        }
        return null;
    }
}
