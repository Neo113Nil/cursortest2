package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class yi {
    public static final p70 NCTxEWno = new p70(0);
    public final /* synthetic */ ej qoPGr6Ce;

    public yi(ej ejVar) {
        this.qoPGr6Ce = ejVar;
    }

    public static Class MdtA4re8(ClassLoader classLoader, String str) {
        try {
            return NCTxEWno(classLoader, str);
        } catch (ClassCastException e) {
            throw new d7(q70.P7K7Inc8("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new d7(q70.P7K7Inc8("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public static Class NCTxEWno(ClassLoader classLoader, String str) {
        p70 p70Var = NCTxEWno;
        p70 p70Var2 = (p70) p70Var.get(classLoader);
        if (p70Var2 == null) {
            p70Var2 = new p70(0);
            p70Var.put(classLoader, p70Var2);
        }
        Class cls = (Class) p70Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        p70Var2.put(str, cls2);
        return cls2;
    }

    public final li qoPGr6Ce(String str) {
        try {
            return (li) MdtA4re8(this.qoPGr6Ce.I5GHvsYW.OxcuoDLp.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new d7(q70.P7K7Inc8("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new d7(q70.P7K7Inc8("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new d7(q70.P7K7Inc8("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new d7(q70.P7K7Inc8("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
