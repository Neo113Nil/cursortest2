package G;

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
public class m extends k {

    /* renamed from: g, reason: collision with root package name */
    public final Class f1049g;

    /* renamed from: h, reason: collision with root package name */
    public final Constructor f1050h;
    public final Method i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f1051j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f1052k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f1053l;

    /* renamed from: m, reason: collision with root package name */
    public final Method f1054m;

    public m() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = G(cls);
            Class cls2 = Integer.TYPE;
            method3 = cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
            method4 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            method5 = H(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e9) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e9.getClass().getName()), e9);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f1049g = cls;
        this.f1050h = constructor;
        this.i = method2;
        this.f1051j = method3;
        this.f1052k = method4;
        this.f1053l = method;
        this.f1054m = method5;
    }

    public static Method G(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void B(Object obj) {
        try {
            this.f1053l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean C(Context context, Object obj, String str, int i, int i4, int i6, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i6), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface D(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f1049g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f1054m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean E(Object obj) {
        try {
            return ((Boolean) this.f1052k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final Object F() {
        try {
            return this.f1050h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method H(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // G.k, Q3.b
    public final Typeface c(Context context, F.g gVar, Resources resources, int i) {
        Method method = this.i;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.c(context, gVar, resources, i);
        }
        Object F8 = F();
        if (F8 != null) {
            F.h[] hVarArr = gVar.f920a;
            int length = hVarArr.length;
            int i4 = 0;
            while (i4 < length) {
                F.h hVar = hVarArr[i4];
                String str = hVar.f921a;
                FontVariationAxis[] fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(hVar.f924d);
                Context context2 = context;
                if (!C(context2, F8, str, hVar.f925e, hVar.f922b, hVar.f923c ? 1 : 0, fromFontVariationSettings)) {
                    B(F8);
                    return null;
                }
                i4++;
                context = context2;
            }
            if (E(F8)) {
                return D(F8);
            }
        }
        return null;
    }

    @Override // G.k, Q3.b
    public final Typeface d(Context context, L.h[] hVarArr, int i) {
        Typeface D8;
        boolean z6;
        if (hVarArr.length >= 1) {
            Method method = this.i;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            if (method != null) {
                HashMap hashMap = new HashMap();
                for (L.h hVar : hVarArr) {
                    if (hVar.f1711e == 0) {
                        Uri uri = hVar.f1707a;
                        if (!hashMap.containsKey(uri)) {
                            hashMap.put(uri, S0.f.p(context, uri));
                        }
                    }
                }
                Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                Object F8 = F();
                if (F8 != null) {
                    int length = hVarArr.length;
                    int i4 = 0;
                    boolean z9 = false;
                    while (i4 < length) {
                        L.h hVar2 = hVarArr[i4];
                        ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(hVar2.f1707a);
                        if (byteBuffer != null) {
                            try {
                                z6 = ((Boolean) this.f1051j.invoke(F8, byteBuffer, Integer.valueOf(hVar2.f1708b), null, Integer.valueOf(hVar2.f1709c), Integer.valueOf(hVar2.f1710d ? 1 : 0))).booleanValue();
                            } catch (IllegalAccessException | InvocationTargetException unused) {
                                z6 = false;
                            }
                            if (!z6) {
                                B(F8);
                                return null;
                            }
                            z9 = true;
                        }
                        i4++;
                        z9 = z9;
                    }
                    if (!z9) {
                        B(F8);
                        return null;
                    }
                    if (E(F8) && (D8 = D(F8)) != null) {
                        return Typeface.create(D8, i);
                    }
                }
            } else {
                L.h g9 = g(hVarArr, i);
                try {
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(g9.f1707a, com.anythink.expressad.foundation.d.d.bv, null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(g9.f1709c).setItalic(g9.f1710d).build();
                            openFileDescriptor.close();
                            return build;
                        } finally {
                        }
                    }
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                        return null;
                    }
                } catch (IOException unused2) {
                }
            }
        }
        return null;
    }

    @Override // Q3.b
    public final Typeface f(Context context, Resources resources, int i, String str, int i4) {
        Method method = this.i;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.f(context, resources, i, str, i4);
        }
        Object F8 = F();
        if (F8 != null) {
            if (!C(context, F8, str, 0, -1, -1, null)) {
                B(F8);
                return null;
            }
            if (E(F8)) {
                return D(F8);
            }
        }
        return null;
    }
}
