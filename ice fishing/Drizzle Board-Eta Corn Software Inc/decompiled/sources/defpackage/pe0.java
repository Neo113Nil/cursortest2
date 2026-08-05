package defpackage;

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

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class pe0 extends ne0 {
    public final Method OnDfzHZD;
    public final Constructor eVhOlqcC;
    public final Class jb9XjC4I;
    public final Method k3x7lurq;
    public final Method lDXGDhIF;
    public final Method ow5vqvCr;
    public final Method ygLcUYwZ;

    public pe0() {
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
            method2 = I5GHvsYW(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = RXQxj5Oe(cls2);
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
        this.jb9XjC4I = cls;
        this.eVhOlqcC = constructor;
        this.k3x7lurq = method2;
        this.ow5vqvCr = method3;
        this.OnDfzHZD = method4;
        this.ygLcUYwZ = method5;
        this.lDXGDhIF = method;
    }

    public static Method I5GHvsYW(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean Ey6iv0m0(Object obj) {
        try {
            return ((Boolean) this.OnDfzHZD.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface KlHjfFWx(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.jb9XjC4I, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.lDXGDhIF.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // defpackage.ne0, defpackage.e50
    public final Typeface P7K7Inc8(Context context, ei[] eiVarArr, int i) {
        Object obj;
        Typeface KlHjfFWx;
        boolean z;
        if (eiVarArr.length >= 1) {
            Method method = this.k3x7lurq;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap hashMap = new HashMap();
                    for (ei eiVar : eiVarArr) {
                        if (eiVar.P7K7Inc8 == 0) {
                            Uri uri = eiVar.qoPGr6Ce;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, f50.ow5vqvCr(context, uri));
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.eVhOlqcC.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = eiVarArr.length;
                        int i2 = 0;
                        boolean z2 = false;
                        while (true) {
                            Method method2 = this.ygLcUYwZ;
                            if (i2 < length) {
                                ei eiVar2 = eiVarArr[i2];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(eiVar2.qoPGr6Ce);
                                if (byteBuffer != null) {
                                    try {
                                        z = ((Boolean) this.ow5vqvCr.invoke(obj, byteBuffer, Integer.valueOf(eiVar2.NCTxEWno), null, Integer.valueOf(eiVar2.MdtA4re8), Integer.valueOf(eiVar2.wxUZMvaN ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z = false;
                                    }
                                    if (!z) {
                                        method2.invoke(obj, null);
                                        break;
                                    }
                                    z2 = true;
                                }
                                i2++;
                                z2 = z2;
                            } else if (!z2) {
                                method2.invoke(obj, null);
                            } else if (Ey6iv0m0(obj) && (KlHjfFWx = KlHjfFWx(obj)) != null) {
                                return Typeface.create(KlHjfFWx, i);
                            }
                        }
                    }
                } else {
                    ei jb9XjC4I = e50.jb9XjC4I(eiVarArr, i);
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(jb9XjC4I.qoPGr6Ce, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(jb9XjC4I.MdtA4re8).setItalic(jb9XjC4I.wxUZMvaN).build();
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

    @Override // defpackage.e50
    public final Typeface Qr9iLBAD(Context context, Resources resources, int i, String str, int i2) {
        Object obj;
        Method method = this.k3x7lurq;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.Qr9iLBAD(context, resources, i, str, i2);
        }
        try {
            obj = this.eVhOlqcC.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            if (!amk52bBQ(context, obj, str, 0, -1, -1, null)) {
                try {
                    this.ygLcUYwZ.invoke(obj, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (Ey6iv0m0(obj)) {
                return KlHjfFWx(obj);
            }
        }
        return null;
    }

    public Method RXQxj5Oe(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // defpackage.ne0, defpackage.e50
    public final Typeface VgvYg0wo(Context context, bi biVar, Resources resources, int i) {
        Object obj;
        Method method = this.k3x7lurq;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.VgvYg0wo(context, biVar, resources, i);
        }
        try {
            obj = this.eVhOlqcC.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            ci[] ciVarArr = biVar.qoPGr6Ce;
            int length = ciVarArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    ci ciVar = ciVarArr[i2];
                    String str = ciVar.qoPGr6Ce;
                    int i3 = ciVar.VgvYg0wo;
                    int i4 = ciVar.NCTxEWno;
                    boolean z = ciVar.MdtA4re8;
                    FontVariationAxis[] fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(ciVar.wxUZMvaN);
                    pe0 pe0Var = this;
                    Context context2 = context;
                    if (pe0Var.amk52bBQ(context2, obj, str, i3, i4, z ? 1 : 0, fromFontVariationSettings)) {
                        i2++;
                        this = pe0Var;
                        context = context2;
                    } else {
                        try {
                            pe0Var.ygLcUYwZ.invoke(obj, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                } else {
                    pe0 pe0Var2 = this;
                    if (pe0Var2.Ey6iv0m0(obj)) {
                        return pe0Var2.KlHjfFWx(obj);
                    }
                }
            }
        }
        return null;
    }

    public final boolean amk52bBQ(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.k3x7lurq.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }
}
