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
    public final Class f2808f;

    /* renamed from: g, reason: collision with root package name */
    public final Constructor f2809g;

    /* renamed from: h, reason: collision with root package name */
    public final Method f2810h;

    /* renamed from: i, reason: collision with root package name */
    public final Method f2811i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f2812j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f2813k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f2814l;

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
            method2 = L(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = M(cls2);
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
        this.f2808f = cls;
        this.f2809g = constructor;
        this.f2810h = method2;
        this.f2811i = method3;
        this.f2812j = method4;
        this.f2813k = method5;
        this.f2814l = method;
    }

    public static Method L(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void F(Object obj) {
        try {
            this.f2813k.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean G(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2810h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface H(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f2808f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f2814l.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean I(Object obj) {
        try {
            return ((Boolean) this.f2812j.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean J() {
        Method method = this.f2810h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public final Object K() {
        try {
            return this.f2809g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method M(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // p.e, o.g
    public final Typeface g(Context context, o.c cVar, Resources resources, int i2) {
        if (!J()) {
            return super.g(context, cVar, resources, i2);
        }
        Object K2 = K();
        if (K2 == null) {
            return null;
        }
        for (o.d dVar : cVar.f2779a) {
            if (!G(context, K2, dVar.f2780a, dVar.f2784e, dVar.f2781b, dVar.f2782c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.f2783d))) {
                F(K2);
                return null;
            }
        }
        if (I(K2)) {
            return H(K2);
        }
        return null;
    }

    @Override // p.e, o.g
    public final Typeface h(Context context, t.h[] hVarArr, int i2) {
        Typeface H2;
        boolean z2;
        if (hVarArr.length < 1) {
            return null;
        }
        if (!J()) {
            t.h n2 = n(hVarArr, i2);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(n2.f2971a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(n2.f2973c).setItalic(n2.f2974d).build();
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
            if (hVar.f2975e == 0) {
                Uri uri = hVar.f2971a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, o.g.y(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object K2 = K();
        if (K2 == null) {
            return null;
        }
        int length = hVarArr.length;
        int i3 = 0;
        boolean z3 = false;
        while (i3 < length) {
            t.h hVar2 = hVarArr[i3];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(hVar2.f2971a);
            if (byteBuffer != null) {
                try {
                    z2 = ((Boolean) this.f2811i.invoke(K2, byteBuffer, Integer.valueOf(hVar2.f2972b), null, Integer.valueOf(hVar2.f2973c), Integer.valueOf(hVar2.f2974d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    z2 = false;
                }
                if (!z2) {
                    F(K2);
                    return null;
                }
                z3 = true;
            }
            i3++;
            z3 = z3;
        }
        if (!z3) {
            F(K2);
            return null;
        }
        if (I(K2) && (H2 = H(K2)) != null) {
            return Typeface.create(H2, i2);
        }
        return null;
    }

    @Override // o.g
    public final Typeface j(Context context, Resources resources, int i2, String str, int i3) {
        if (!J()) {
            return super.j(context, resources, i2, str, i3);
        }
        Object K2 = K();
        if (K2 == null) {
            return null;
        }
        if (!G(context, K2, str, 0, -1, -1, null)) {
            F(K2);
            return null;
        }
        if (I(K2)) {
            return H(K2);
        }
        return null;
    }
}
