package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class lb1 extends q70 {
    public static final Class GWasM1elztuh;
    public static final Method X1lG3V04pd;
    public static final Constructor Yi7zF1RB1;
    public static final Method xqGvceK5x;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        Yi7zF1RB1 = constructor;
        GWasM1elztuh = cls;
        X1lG3V04pd = method2;
        xqGvceK5x = method;
    }

    @Override // defpackage.q70
    public final Typeface rQPn8YBR(Context context, ru[] ruVarArr) {
        Object obj;
        Typeface typeface;
        boolean z;
        try {
            obj = Yi7zF1RB1.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            m21 m21Var = new m21();
            int length = ruVarArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    ru ruVar = ruVarArr[i];
                    Uri uri = ruVar.GWasM1elztuh;
                    Object obj2 = (ByteBuffer) m21Var.get(uri);
                    if (obj2 == null) {
                        obj2 = o50.k8h8IjolWQ(context, uri);
                        m21Var.put(uri, obj2);
                    }
                    if (obj2 == null) {
                        break;
                    }
                    try {
                        z = ((Boolean) X1lG3V04pd.invoke(obj, obj2, Integer.valueOf(ruVar.Yi7zF1RB1), null, Integer.valueOf(ruVar.X1lG3V04pd), Boolean.valueOf(ruVar.xqGvceK5x))).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                        z = false;
                    }
                    if (!z) {
                        break;
                    }
                    i++;
                } else {
                    try {
                        Object newInstance = Array.newInstance((Class<?>) GWasM1elztuh, 1);
                        Array.set(newInstance, 0, obj);
                        typeface = (Typeface) xqGvceK5x.invoke(null, newInstance);
                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                        typeface = null;
                    }
                    if (typeface != null) {
                        return Typeface.create(typeface, 0);
                    }
                }
            }
        }
        return null;
    }
}
