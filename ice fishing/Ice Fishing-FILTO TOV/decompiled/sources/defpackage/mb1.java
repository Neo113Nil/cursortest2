package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
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

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class mb1 extends kb1 {
    public final Method AvO7iQsrTN;
    public final Method EljAMC1QTz;
    public final Class GWasM1elztuh;
    public final Method OOA6hdeuvCS;
    public final Method X1lG3V04pd;
    public final Constructor Yi7zF1RB1;
    public final Method xqGvceK5x;

    public mb1() {
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
            method2 = EXrPz3p7hFb(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = ozMwhSAI(cls2);
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
        this.GWasM1elztuh = cls;
        this.Yi7zF1RB1 = constructor;
        this.X1lG3V04pd = method2;
        this.xqGvceK5x = method3;
        this.OOA6hdeuvCS = method4;
        this.EljAMC1QTz = method5;
        this.AvO7iQsrTN = method;
    }

    public static Method EXrPz3p7hFb(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public Typeface k8h8IjolWQ(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.GWasM1elztuh, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.AvO7iQsrTN.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method ozMwhSAI(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // defpackage.kb1, defpackage.q70
    public final Typeface rQPn8YBR(Context context, ru[] ruVarArr) {
        Object obj;
        boolean z;
        Typeface k8h8IjolWQ;
        boolean z2;
        if (ruVarArr.length >= 1) {
            Method method = this.X1lG3V04pd;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap hashMap = new HashMap();
                    for (ru ruVar : ruVarArr) {
                        if (ruVar.EljAMC1QTz == 0) {
                            Uri uri = ruVar.GWasM1elztuh;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, o50.k8h8IjolWQ(context, uri));
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.Yi7zF1RB1.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = ruVarArr.length;
                        int i = 0;
                        boolean z3 = false;
                        while (true) {
                            Method method2 = this.EljAMC1QTz;
                            if (i < length) {
                                ru ruVar2 = ruVarArr[i];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(ruVar2.GWasM1elztuh);
                                if (byteBuffer != null) {
                                    try {
                                        z2 = ((Boolean) this.xqGvceK5x.invoke(obj, byteBuffer, Integer.valueOf(ruVar2.Yi7zF1RB1), null, Integer.valueOf(ruVar2.X1lG3V04pd), Integer.valueOf(ruVar2.xqGvceK5x ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z2 = false;
                                    }
                                    if (!z2) {
                                        method2.invoke(obj, null);
                                        break;
                                    }
                                    z3 = true;
                                }
                                i++;
                                z3 = z3;
                            } else if (z3) {
                                try {
                                    z = ((Boolean) this.OOA6hdeuvCS.invoke(obj, null)).booleanValue();
                                } catch (IllegalAccessException | InvocationTargetException unused3) {
                                    z = false;
                                }
                                if (z && (k8h8IjolWQ = k8h8IjolWQ(obj)) != null) {
                                    return Typeface.create(k8h8IjolWQ, 0);
                                }
                            } else {
                                method2.invoke(obj, null);
                            }
                        }
                    }
                } else {
                    ru uFEq9NpZ = q70.uFEq9NpZ(ruVarArr);
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uFEq9NpZ.GWasM1elztuh, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(uFEq9NpZ.X1lG3V04pd).setItalic(uFEq9NpZ.xqGvceK5x).build();
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
            } catch (IOException | IllegalAccessException | InvocationTargetException unused4) {
            }
        }
        return null;
    }
}
