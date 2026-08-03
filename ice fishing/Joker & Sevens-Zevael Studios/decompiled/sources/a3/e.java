package a3;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import e3.k;
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

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class e extends v6.a {

    /* renamed from: k, reason: collision with root package name */
    public static Class f202k = null;

    /* renamed from: l, reason: collision with root package name */
    public static Constructor f203l = null;

    /* renamed from: m, reason: collision with root package name */
    public static Method f204m = null;

    /* renamed from: n, reason: collision with root package name */
    public static Method f205n = null;

    /* renamed from: o, reason: collision with root package name */
    public static boolean f206o = false;

    /* renamed from: d, reason: collision with root package name */
    public final Class f207d;

    /* renamed from: e, reason: collision with root package name */
    public final Constructor f208e;

    /* renamed from: f, reason: collision with root package name */
    public final Method f209f;

    /* renamed from: g, reason: collision with root package name */
    public final Method f210g;

    /* renamed from: h, reason: collision with root package name */
    public final Method f211h;

    /* renamed from: i, reason: collision with root package name */
    public final Method f212i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f213j;

    public e() {
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
            method2 = f0(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = g0(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e10.getClass().getName()), e10);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f207d = cls;
        this.f208e = constructor;
        this.f209f = method2;
        this.f210g = method3;
        this.f211h = method4;
        this.f212i = method5;
        this.f213j = method;
    }

    public static boolean b0(Object obj, String str, int i10, boolean z10) {
        e0();
        try {
            return ((Boolean) f204m.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void e0() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f206o) {
            return;
        }
        f206o = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            method = null;
            cls = null;
            method2 = null;
        }
        f203l = constructor;
        f202k = cls;
        f204m = method2;
        f205n = method;
    }

    public static Method f0(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean a0(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f209f.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface c0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f207d, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f213j.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean d0(Object obj) {
        try {
            return ((Boolean) this.f211h.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method g0(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // v6.a
    public final Typeface t(Context context, z2.e eVar, Resources resources, int i10) {
        Object obj;
        Method method = this.f209f;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                obj = this.f208e.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                obj = null;
            }
            if (obj != null) {
                z2.f[] fVarArr = eVar.f9076a;
                int length = fVarArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length) {
                        z2.f fVar = fVarArr[i11];
                        Context context2 = context;
                        if (a0(context2, obj, fVar.f9077a, fVar.f9081e, fVar.f9078b, fVar.f9079c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fVar.f9080d))) {
                            i11++;
                            context = context2;
                        } else {
                            try {
                                this.f212i.invoke(obj, null);
                                break;
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                    } else if (d0(obj)) {
                        return c0(obj);
                    }
                }
            }
            return null;
        }
        e0();
        try {
            Object newInstance = f203l.newInstance(null);
            for (z2.f fVar2 : eVar.f9076a) {
                File K = x4.f.K(context);
                if (K == null) {
                    return null;
                }
                try {
                    if (x4.f.E(K, resources, fVar2.f9082f) && b0(newInstance, K.getPath(), fVar2.f9078b, fVar2.f9079c)) {
                        K.delete();
                    }
                } catch (RuntimeException unused3) {
                } catch (Throwable th) {
                    K.delete();
                    throw th;
                }
                K.delete();
                return null;
            }
            e0();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f202k, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f205n.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // v6.a
    public final Typeface u(Context context, k[] kVarArr, int i10) {
        Object obj;
        Typeface c02;
        boolean z10;
        if (kVarArr.length >= 1) {
            Method method = this.f209f;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap hashMap = new HashMap();
                    for (k kVar : kVarArr) {
                        if (kVar.f2098f == 0) {
                            Uri uri = kVar.f2093a;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, x4.f.P(context, uri));
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.f208e.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = kVarArr.length;
                        int i11 = 0;
                        boolean z11 = false;
                        while (true) {
                            Method method2 = this.f212i;
                            if (i11 < length) {
                                k kVar2 = kVarArr[i11];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(kVar2.f2093a);
                                if (byteBuffer != null) {
                                    try {
                                        z10 = ((Boolean) this.f210g.invoke(obj, byteBuffer, Integer.valueOf(kVar2.f2094b), null, Integer.valueOf(kVar2.f2095c), Integer.valueOf(kVar2.f2096d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z10 = false;
                                    }
                                    if (!z10) {
                                        method2.invoke(obj, null);
                                        break;
                                    }
                                    z11 = true;
                                }
                                i11++;
                                z11 = z11;
                            } else if (!z11) {
                                method2.invoke(obj, null);
                            } else if (d0(obj) && (c02 = c0(obj)) != null) {
                                return Typeface.create(c02, i10);
                            }
                        }
                    }
                } else {
                    k B = B(kVarArr, i10);
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(B.f2093a, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(B.f2095c).setItalic(B.f2096d).build();
                            openFileDescriptor.close();
                            return build;
                        } finally {
                        }
                    }
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // v6.a
    public final Typeface w(Context context, Resources resources, int i10, String str, int i11) {
        Object obj;
        Method method = this.f209f;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.w(context, resources, i10, str, i11);
        }
        try {
            obj = this.f208e.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            if (!a0(context, obj, str, 0, -1, -1, null)) {
                try {
                    this.f212i.invoke(obj, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (d0(obj)) {
                return c0(obj);
            }
        }
        return null;
    }
}
