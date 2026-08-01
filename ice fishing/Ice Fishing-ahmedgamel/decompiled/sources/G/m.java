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

    /* renamed from: h, reason: collision with root package name */
    public final Class f1023h;
    public final Constructor i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f1024j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f1025k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f1026l;

    /* renamed from: m, reason: collision with root package name */
    public final Method f1027m;

    /* renamed from: n, reason: collision with root package name */
    public final Method f1028n;

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
            method2 = F(cls);
            Class cls2 = Integer.TYPE;
            method3 = cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
            method4 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            method5 = G(cls);
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
        this.f1023h = cls;
        this.i = constructor;
        this.f1024j = method2;
        this.f1025k = method3;
        this.f1026l = method4;
        this.f1027m = method;
        this.f1028n = method5;
    }

    public static Method F(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void A(Object obj) {
        try {
            this.f1027m.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean B(Context context, Object obj, String str, int i, int i6, int i9, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f1024j.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i6), Integer.valueOf(i9), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface C(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f1023h, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f1028n.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean D(Object obj) {
        try {
            return ((Boolean) this.f1026l.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final Object E() {
        try {
            return this.i.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method G(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // G.k, V2.a
    public final Typeface d(Context context, F.g gVar, Resources resources, int i) {
        Method method = this.f1024j;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.d(context, gVar, resources, i);
        }
        Object E8 = E();
        if (E8 != null) {
            F.h[] hVarArr = gVar.f857a;
            int length = hVarArr.length;
            int i6 = 0;
            while (i6 < length) {
                F.h hVar = hVarArr[i6];
                String str = hVar.f858a;
                FontVariationAxis[] fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(hVar.f861d);
                Context context2 = context;
                if (!B(context2, E8, str, hVar.f862e, hVar.f859b, hVar.f860c ? 1 : 0, fromFontVariationSettings)) {
                    A(E8);
                    return null;
                }
                i6++;
                context = context2;
            }
            if (D(E8)) {
                return C(E8);
            }
        }
        return null;
    }

    @Override // G.k, V2.a
    public final Typeface e(Context context, L.h[] hVarArr, int i) {
        Typeface C8;
        boolean z3;
        if (hVarArr.length >= 1) {
            Method method = this.f1024j;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            if (method != null) {
                HashMap hashMap = new HashMap();
                for (L.h hVar : hVarArr) {
                    if (hVar.f1602e == 0) {
                        Uri uri = hVar.f1598a;
                        if (!hashMap.containsKey(uri)) {
                            hashMap.put(uri, X2.e.M(context, uri));
                        }
                    }
                }
                Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                Object E8 = E();
                if (E8 != null) {
                    int length = hVarArr.length;
                    int i6 = 0;
                    boolean z6 = false;
                    while (i6 < length) {
                        L.h hVar2 = hVarArr[i6];
                        ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(hVar2.f1598a);
                        if (byteBuffer != null) {
                            try {
                                z3 = ((Boolean) this.f1025k.invoke(E8, byteBuffer, Integer.valueOf(hVar2.f1599b), null, Integer.valueOf(hVar2.f1600c), Integer.valueOf(hVar2.f1601d ? 1 : 0))).booleanValue();
                            } catch (IllegalAccessException | InvocationTargetException unused) {
                                z3 = false;
                            }
                            if (!z3) {
                                A(E8);
                                return null;
                            }
                            z6 = true;
                        }
                        i6++;
                        z6 = z6;
                    }
                    if (!z6) {
                        A(E8);
                        return null;
                    }
                    if (D(E8) && (C8 = C(E8)) != null) {
                        return Typeface.create(C8, i);
                    }
                }
            } else {
                L.h k9 = k(hVarArr, i);
                try {
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(k9.f1598a, com.anythink.expressad.foundation.d.d.bv, null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(k9.f1600c).setItalic(k9.f1601d).build();
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

    @Override // V2.a
    public final Typeface g(Context context, Resources resources, int i, String str, int i6) {
        Method method = this.f1024j;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.g(context, resources, i, str, i6);
        }
        Object E8 = E();
        if (E8 != null) {
            if (!B(context, E8, str, 0, -1, -1, null)) {
                A(E8);
                return null;
            }
            if (D(E8)) {
                return C(E8);
            }
        }
        return null;
    }
}
