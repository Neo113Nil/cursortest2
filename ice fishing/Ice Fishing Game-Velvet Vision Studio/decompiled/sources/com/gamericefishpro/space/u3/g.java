package com.gamericefishpro.space.u3;

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

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class g extends com.gamericefishpro.space.a.a {
    public static Class j = null;
    public static Constructor k = null;
    public static Method l = null;
    public static Method m = null;
    public static boolean n = false;
    public final Class c;
    public final Constructor d;
    public final Method e;
    public final Method f;
    public final Method g;
    public final Method h;
    public final Method i;

    public g() throws NoSuchMethodException {
        Method methodS;
        Constructor<?> constructor;
        Method methodR;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodR = R(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodS = S(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            methodS = null;
            constructor = null;
            methodR = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.c = cls;
        this.d = constructor;
        this.e = methodR;
        this.f = method;
        this.g = method2;
        this.h = method3;
        this.i = methodS;
    }

    public static boolean N(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        Q();
        try {
            return ((Boolean) l.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static void Q() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (n) {
            return;
        }
        n = true;
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
        k = constructor;
        j = cls;
        l = method2;
        m = method;
    }

    public static Method R(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean M(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.e.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface O(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.c, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.i.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean P(Object obj) {
        try {
            return ((Boolean) this.g.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method S(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // com.gamericefishpro.space.a.a
    public final Typeface g(Context context, com.gamericefishpro.space.t3.e eVar, Resources resources, int i) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.e;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                objNewInstance = this.d.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                objNewInstance = null;
            }
            if (objNewInstance != null) {
                com.gamericefishpro.space.t3.f[] fVarArr = eVar.a;
                int length = fVarArr.length;
                int i2 = 0;
                while (i2 < length) {
                    com.gamericefishpro.space.t3.f fVar = fVarArr[i2];
                    Context context2 = context;
                    if (M(context2, objNewInstance, fVar.a, fVar.e, fVar.b, fVar.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fVar.d))) {
                        i2++;
                        context = context2;
                    } else {
                        try {
                            this.h.invoke(objNewInstance, null);
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                }
                if (P(objNewInstance)) {
                    return O(objNewInstance);
                }
            }
            return null;
        }
        Q();
        try {
            Object objNewInstance2 = k.newInstance(null);
            for (com.gamericefishpro.space.t3.f fVar2 : eVar.a) {
                File fileV = com.gamericefishpro.space.b9.a.v(context);
                if (fileV == null) {
                    return null;
                }
                try {
                    if (!com.gamericefishpro.space.b9.a.m(fileV, resources, fVar2.f) || !N(objNewInstance2, fileV.getPath(), fVar2.b, fVar2.c)) {
                        return null;
                    }
                    fileV.delete();
                } catch (RuntimeException unused3) {
                } finally {
                    fileV.delete();
                }
            }
            Q();
            try {
                Object objNewInstance3 = Array.newInstance((Class<?>) j, 1);
                Array.set(objNewInstance3, 0, objNewInstance2);
                return (Typeface) m.invoke(null, objNewInstance3);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.gamericefishpro.space.a.a
    public final Typeface h(Context context, com.gamericefishpro.space.z3.h[] hVarArr, int i) throws IOException {
        Object objNewInstance;
        Typeface typefaceO;
        boolean zBooleanValue;
        if (hVarArr.length >= 1) {
            Method method = this.e;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (com.gamericefishpro.space.z3.h hVar : hVarArr) {
                        if (hVar.f == 0) {
                            Uri uri = hVar.a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, com.gamericefishpro.space.b9.a.C(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.d.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = hVarArr.length;
                        int i2 = 0;
                        boolean z = false;
                        while (true) {
                            Method method2 = this.h;
                            if (i2 >= length) {
                                if (!z) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                if (!P(objNewInstance) || (typefaceO = O(objNewInstance)) == null) {
                                    break;
                                    break;
                                }
                                return Typeface.create(typefaceO, i);
                            }
                            com.gamericefishpro.space.z3.h hVar2 = hVarArr[i2];
                            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(hVar2.a);
                            if (byteBuffer != null) {
                                try {
                                    zBooleanValue = ((Boolean) this.f.invoke(objNewInstance, byteBuffer, Integer.valueOf(hVar2.b), null, Integer.valueOf(hVar2.c), Integer.valueOf(hVar2.d ? 1 : 0))).booleanValue();
                                } catch (IllegalAccessException | InvocationTargetException unused2) {
                                    zBooleanValue = false;
                                }
                                if (!zBooleanValue) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                z = true;
                            }
                            i2++;
                            z = z;
                        }
                    }
                } else {
                    com.gamericefishpro.space.z3.h hVarP = p(hVarArr, i);
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(hVarP.a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(hVarP.c).setItalic(hVarP.d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // com.gamericefishpro.space.a.a
    public final Typeface j(Context context, Resources resources, int i, String str, int i2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.e;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.j(context, resources, i, str, i2);
        }
        try {
            objNewInstance = this.d.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!M(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.h.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (P(objNewInstance)) {
                return O(objNewInstance);
            }
        }
        return null;
    }
}
