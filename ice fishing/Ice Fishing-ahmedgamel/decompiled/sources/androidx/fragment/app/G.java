package androidx.fragment.app;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: b, reason: collision with root package name */
    public static final s.k f4830b = new s.k();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N f4831a;

    public G(N n9) {
        this.f4831a = n9;
    }

    public static Class b(ClassLoader classLoader, String str) {
        s.k kVar = f4830b;
        s.k kVar2 = (s.k) kVar.getOrDefault(classLoader, null);
        if (kVar2 == null) {
            kVar2 = new s.k();
            kVar.put(classLoader, kVar2);
        }
        Class cls = (Class) kVar2.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        kVar2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e9) {
            throw new B0.c(D.y.o("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e9);
        } catch (ClassNotFoundException e10) {
            throw new B0.c(D.y.o("Unable to instantiate fragment ", str, ": make sure class name exists"), e10);
        }
    }

    public final AbstractComponentCallbacksC0475s a(String str) {
        try {
            return (AbstractComponentCallbacksC0475s) c(this.f4831a.f4868t.f5076u.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e9) {
            throw new B0.c(D.y.o("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e9);
        } catch (InstantiationException e10) {
            throw new B0.c(D.y.o("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
        } catch (NoSuchMethodException e11) {
            throw new B0.c(D.y.o("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e11);
        } catch (InvocationTargetException e12) {
            throw new B0.c(D.y.o("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e12);
        }
    }
}
