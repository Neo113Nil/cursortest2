package Z;

import L1.C0011l;
import java.lang.reflect.InvocationTargetException;
import r.C0342j;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: b, reason: collision with root package name */
    public static final C0342j f1410b = new C0342j(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M f1411a;

    public F(M m2) {
        this.f1411a = m2;
    }

    public static Class b(ClassLoader classLoader, String str) {
        C0342j c0342j = f1410b;
        C0342j c0342j2 = (C0342j) c0342j.get(classLoader);
        if (c0342j2 == null) {
            c0342j2 = new C0342j(0);
            c0342j.put(classLoader, c0342j2);
        }
        Class cls = (Class) c0342j2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c0342j2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new C0011l(D1.h.g("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new C0011l(D1.h.g("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public final AbstractComponentCallbacksC0070s a(String str) {
        try {
            return (AbstractComponentCallbacksC0070s) c(this.f1411a.f1452u.f1629b.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new C0011l(D1.h.g("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new C0011l(D1.h.g("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new C0011l(D1.h.g("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new C0011l(D1.h.g("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
