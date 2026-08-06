package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class d81 {
    public static final java.util.List ZpBGe2uQfcn8 = defpackage.ma0.oCu53ZX2v4Ju(android.app.Application.class, defpackage.s71.class);
    public static final java.util.List giKS3J6vZuNy = defpackage.ma0.VFeft99leXEK(defpackage.s71.class);

    public static final java.lang.reflect.Constructor ZpBGe2uQfcn8(java.lang.Class cls, java.util.List list) {
        list.getClass();
        java.lang.reflect.Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (java.lang.reflect.Constructor<?> constructor : constructors) {
            java.lang.Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            java.util.List a6r05ZxsOP0A = defpackage.y7.a6r05ZxsOP0A(parameterTypes);
            if (list.equals(a6r05ZxsOP0A)) {
                return constructor;
            }
            if (list.size() == a6r05ZxsOP0A.size() && a6r05ZxsOP0A.containsAll(list)) {
                throw new java.lang.UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final defpackage.iu1 giKS3J6vZuNy(java.lang.Class cls, java.lang.reflect.Constructor constructor, java.lang.Object... objArr) {
        try {
            return (defpackage.iu1) constructor.newInstance(java.util.Arrays.copyOf(objArr, objArr.length));
        } catch (java.lang.IllegalAccessException e) {
            defpackage.h7.fNwYGHIYeJcR("Failed to access ", cls, e);
            return null;
        } catch (java.lang.InstantiationException e2) {
            throw new java.lang.RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (java.lang.reflect.InvocationTargetException e3) {
            throw new java.lang.RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
