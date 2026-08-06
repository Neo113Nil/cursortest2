package defpackage;

/* loaded from: classes.dex */
public abstract class k41 {
    public static final java.util.List IHQe1A4L2xu = defpackage.fm.yIx6ChFVk(android.app.Application.class, defpackage.y31.class);
    public static final java.util.List oh6vYeIP = defpackage.fm.p4kuH6PDtgom(defpackage.y31.class);

    public static final java.lang.reflect.Constructor IHQe1A4L2xu(java.lang.Class cls, java.util.List list) {
        list.getClass();
        java.lang.reflect.Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (java.lang.reflect.Constructor<?> constructor : constructors) {
            java.lang.Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            java.util.List gG5uWf3dqScO = defpackage.t6.gG5uWf3dqScO(parameterTypes);
            if (list.equals(gG5uWf3dqScO)) {
                return constructor;
            }
            if (list.size() == gG5uWf3dqScO.size() && gG5uWf3dqScO.containsAll(list)) {
                throw new java.lang.UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final defpackage.vm1 oh6vYeIP(java.lang.Class cls, java.lang.reflect.Constructor constructor, java.lang.Object... objArr) {
        try {
            return (defpackage.vm1) constructor.newInstance(java.util.Arrays.copyOf(objArr, objArr.length));
        } catch (java.lang.IllegalAccessException e) {
            defpackage.db.JlrlGoKF("Failed to access ", cls, e);
            return null;
        } catch (java.lang.InstantiationException e2) {
            throw new java.lang.RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (java.lang.reflect.InvocationTargetException e3) {
            throw new java.lang.RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
