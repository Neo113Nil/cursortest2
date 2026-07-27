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

    /* renamed from: f, reason: collision with root package name */
    public final Class f1169f;

    /* renamed from: g, reason: collision with root package name */
    public final Constructor f1170g;

    /* renamed from: h, reason: collision with root package name */
    public final Method f1171h;
    public final Method i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f1172j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f1173k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f1174l;

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
            method2 = I(cls);
            Class cls2 = Integer.TYPE;
            method3 = cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
            method4 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            method5 = J(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e6) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e6.getClass().getName()), e6);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f1169f = cls;
        this.f1170g = constructor;
        this.f1171h = method2;
        this.i = method3;
        this.f1172j = method4;
        this.f1173k = method;
        this.f1174l = method5;
    }

    public static Method I(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void D(Object obj) {
        try {
            this.f1173k.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean E(Context context, Object obj, String str, int i, int i4, int i9, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f1171h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i9), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface F(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f1169f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f1174l.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean G(Object obj) {
        try {
            return ((Boolean) this.f1172j.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final Object H() {
        try {
            return this.f1170g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method J(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // G.k, com.bumptech.glide.d
    public final Typeface h(Context context, F.g gVar, Resources resources, int i) {
        Method method = this.f1171h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.h(context, gVar, resources, i);
        }
        Object H6 = H();
        if (H6 != null) {
            F.h[] hVarArr = gVar.f911a;
            int length = hVarArr.length;
            int i4 = 0;
            while (i4 < length) {
                F.h hVar = hVarArr[i4];
                String str = hVar.f912a;
                FontVariationAxis[] fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(hVar.f915d);
                Context context2 = context;
                if (!E(context2, H6, str, hVar.f916e, hVar.f913b, hVar.f914c ? 1 : 0, fromFontVariationSettings)) {
                    D(H6);
                    return null;
                }
                i4++;
                context = context2;
            }
            if (G(H6)) {
                return F(H6);
            }
        }
        return null;
    }

    @Override // G.k, com.bumptech.glide.d
    public final Typeface i(Context context, L.h[] hVarArr, int i) {
        Typeface F8;
        boolean z8;
        if (hVarArr.length >= 1) {
            Method method = this.f1171h;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            if (method != null) {
                HashMap hashMap = new HashMap();
                for (L.h hVar : hVarArr) {
                    if (hVar.f1690e == 0) {
                        Uri uri = hVar.f1686a;
                        if (!hashMap.containsKey(uri)) {
                            hashMap.put(uri, com.bumptech.glide.e.t(context, uri));
                        }
                    }
                }
                Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                Object H6 = H();
                if (H6 != null) {
                    int length = hVarArr.length;
                    int i4 = 0;
                    boolean z9 = false;
                    while (i4 < length) {
                        L.h hVar2 = hVarArr[i4];
                        ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(hVar2.f1686a);
                        if (byteBuffer != null) {
                            try {
                                z8 = ((Boolean) this.i.invoke(H6, byteBuffer, Integer.valueOf(hVar2.f1687b), null, Integer.valueOf(hVar2.f1688c), Integer.valueOf(hVar2.f1689d ? 1 : 0))).booleanValue();
                            } catch (IllegalAccessException | InvocationTargetException unused) {
                                z8 = false;
                            }
                            if (!z8) {
                                D(H6);
                                return null;
                            }
                            z9 = true;
                        }
                        i4++;
                        z9 = z9;
                    }
                    if (!z9) {
                        D(H6);
                        return null;
                    }
                    if (G(H6) && (F8 = F(H6)) != null) {
                        return Typeface.create(F8, i);
                    }
                }
            } else {
                L.h l9 = l(hVarArr, i);
                try {
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(l9.f1686a, com.anythink.expressad.foundation.d.d.bv, null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(l9.f1688c).setItalic(l9.f1689d).build();
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

    @Override // com.bumptech.glide.d
    public final Typeface k(Context context, Resources resources, int i, String str, int i4) {
        Method method = this.f1171h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.k(context, resources, i, str, i4);
        }
        Object H6 = H();
        if (H6 != null) {
            if (!E(context, H6, str, 0, -1, -1, null)) {
                D(H6);
                return null;
            }
            if (G(H6)) {
                return F(H6);
            }
        }
        return null;
    }
}
