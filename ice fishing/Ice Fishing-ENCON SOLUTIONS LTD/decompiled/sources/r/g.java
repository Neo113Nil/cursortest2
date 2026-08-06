package r;

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
import q.C1033c;
import q.C1034d;

/* loaded from: classes.dex */
public class g extends e {

    /* renamed from: h, reason: collision with root package name */
    public final Class f8463h;

    /* renamed from: i, reason: collision with root package name */
    public final Constructor f8464i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f8465j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f8466k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f8467l;

    /* renamed from: m, reason: collision with root package name */
    public final Method f8468m;

    /* renamed from: n, reason: collision with root package name */
    public final Method f8469n;

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
            method2 = O(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = P(cls2);
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
        this.f8463h = cls;
        this.f8464i = constructor;
        this.f8465j = method2;
        this.f8466k = method3;
        this.f8467l = method4;
        this.f8468m = method5;
        this.f8469n = method;
    }

    public static Method O(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void I(Object obj) {
        try {
            this.f8468m.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean J(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f8465j.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface K(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f8463h, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f8469n.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean L(Object obj) {
        try {
            return ((Boolean) this.f8467l.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean M() {
        Method method = this.f8465j;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public final Object N() {
        try {
            return this.f8464i.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method P(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // r.e, u0.AbstractC1050a
    public final Typeface j(Context context, C1033c c1033c, Resources resources, int i2) {
        if (!M()) {
            return super.j(context, c1033c, resources, i2);
        }
        Object N2 = N();
        if (N2 == null) {
            return null;
        }
        for (C1034d c1034d : c1033c.f8433a) {
            if (!J(context, N2, c1034d.f8434a, c1034d.f8438e, c1034d.f8435b, c1034d.f8436c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c1034d.f8437d))) {
                I(N2);
                return null;
            }
        }
        if (L(N2)) {
            return K(N2);
        }
        return null;
    }

    @Override // r.e, u0.AbstractC1050a
    public final Typeface k(Context context, v.g[] gVarArr, int i2) {
        Typeface K2;
        boolean z2;
        if (gVarArr.length < 1) {
            return null;
        }
        if (!M()) {
            v.g q2 = q(gVarArr, i2);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(q2.f8497a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(q2.f8499c).setItalic(q2.f8500d).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (v.g gVar : gVarArr) {
            if (gVar.f8501e == 0) {
                Uri uri = gVar.f8497a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, R1.d.A(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object N2 = N();
        if (N2 == null) {
            return null;
        }
        int length = gVarArr.length;
        int i3 = 0;
        boolean z3 = false;
        while (i3 < length) {
            v.g gVar2 = gVarArr[i3];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(gVar2.f8497a);
            if (byteBuffer != null) {
                try {
                    z2 = ((Boolean) this.f8466k.invoke(N2, byteBuffer, Integer.valueOf(gVar2.f8498b), null, Integer.valueOf(gVar2.f8499c), Integer.valueOf(gVar2.f8500d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    z2 = false;
                }
                if (!z2) {
                    I(N2);
                    return null;
                }
                z3 = true;
            }
            i3++;
            z3 = z3;
        }
        if (!z3) {
            I(N2);
            return null;
        }
        if (L(N2) && (K2 = K(N2)) != null) {
            return Typeface.create(K2, i2);
        }
        return null;
    }

    @Override // u0.AbstractC1050a
    public final Typeface m(Context context, Resources resources, int i2, String str, int i3) {
        if (!M()) {
            return super.m(context, resources, i2, str, i3);
        }
        Object N2 = N();
        if (N2 == null) {
            return null;
        }
        if (!J(context, N2, str, 0, -1, -1, null)) {
            I(N2);
            return null;
        }
        if (L(N2)) {
            return K(N2);
        }
        return null;
    }
}
