package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public abstract class nmt {
    public static final LinkedHashMap a = new LinkedHashMap();
    public static final LinkedHashMap b = new LinkedHashMap();
    public static final LinkedHashMap c = new LinkedHashMap();
    public static final LinkedHashMap d = new LinkedHashMap();

    public static View a(Class cls, Context context, int i, int i2) {
        context.getClass();
        Constructor e = e(cls);
        if (e != null) {
            Object newInstance = e.newInstance(context, null, Integer.valueOf(i), Integer.valueOf(i2));
            newInstance.getClass();
            return (View) newInstance;
        }
        Constructor d2 = d(cls);
        if (d2 != null) {
            Object newInstance2 = d2.newInstance(context, null, Integer.valueOf(i));
            newInstance2.getClass();
            return (View) newInstance2;
        }
        LinkedHashMap linkedHashMap = c;
        Constructor constructor = (Constructor) linkedHashMap.get(cls);
        if (constructor == null) {
            try {
                constructor = cls.getConstructor(Context.class);
                linkedHashMap.put(cls, constructor);
            } catch (NoSuchMethodException unused) {
                constructor = null;
            }
        }
        if (constructor != null) {
            Object newInstance3 = constructor.newInstance(context);
            newInstance3.getClass();
            return (View) newInstance3;
        }
        Constructor c2 = c(cls);
        if (c2 == null) {
            rj7.i(cls, ", not suitable constructor is found", "Can't create view ");
            return null;
        }
        Object newInstance4 = c2.newInstance(context, null);
        newInstance4.getClass();
        return (View) newInstance4;
    }

    public static View b(Context context, Class cls) {
        context.getClass();
        LinkedHashMap linkedHashMap = c;
        Constructor constructor = (Constructor) linkedHashMap.get(cls);
        if (constructor == null) {
            try {
                constructor = cls.getConstructor(Context.class);
                linkedHashMap.put(cls, constructor);
            } catch (NoSuchMethodException unused) {
                constructor = null;
            }
        }
        if (constructor != null) {
            Object newInstance = constructor.newInstance(context);
            newInstance.getClass();
            return (View) newInstance;
        }
        Constructor e = e(cls);
        if (e != null) {
            Object newInstance2 = e.newInstance(context, null, 0, 0);
            newInstance2.getClass();
            return (View) newInstance2;
        }
        Constructor d2 = d(cls);
        if (d2 != null) {
            Object newInstance3 = d2.newInstance(context, null, 0);
            newInstance3.getClass();
            return (View) newInstance3;
        }
        Constructor c2 = c(cls);
        if (c2 == null) {
            rj7.i(cls, ", no suitable constructor is found", "Can't create view ");
            return null;
        }
        Object newInstance4 = c2.newInstance(context, null);
        newInstance4.getClass();
        return (View) newInstance4;
    }

    public static Constructor c(Class cls) {
        LinkedHashMap linkedHashMap = d;
        Constructor constructor = (Constructor) linkedHashMap.get(cls);
        if (constructor != null) {
            return constructor;
        }
        try {
            Constructor constructor2 = cls.getConstructor(Context.class, AttributeSet.class);
            linkedHashMap.put(cls, constructor2);
            return constructor2;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Constructor d(Class cls) {
        LinkedHashMap linkedHashMap = b;
        Constructor constructor = (Constructor) linkedHashMap.get(cls);
        if (constructor != null) {
            return constructor;
        }
        try {
            Constructor constructor2 = cls.getConstructor(Context.class, AttributeSet.class, Integer.TYPE);
            linkedHashMap.put(cls, constructor2);
            return constructor2;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Constructor e(Class cls) {
        LinkedHashMap linkedHashMap = a;
        Constructor constructor = (Constructor) linkedHashMap.get(cls);
        if (constructor != null) {
            return constructor;
        }
        try {
            Class cls2 = Integer.TYPE;
            Constructor constructor2 = cls.getConstructor(Context.class, AttributeSet.class, cls2, cls2);
            linkedHashMap.put(cls, constructor2);
            return constructor2;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }
}
