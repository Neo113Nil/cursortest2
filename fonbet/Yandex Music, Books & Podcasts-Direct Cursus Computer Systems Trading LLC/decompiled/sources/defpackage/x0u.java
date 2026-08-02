package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class x0u {
    public final xy0 a;
    public final xy0 b;
    public final xy0 c;

    public x0u(xy0 xy0Var, xy0 xy0Var2, xy0 xy0Var3) {
        this.a = xy0Var;
        this.b = xy0Var2;
        this.c = xy0Var3;
    }

    public abstract y0u a();

    public final Class b(Class cls) {
        String name = cls.getName();
        xy0 xy0Var = this.c;
        Class cls2 = (Class) xy0Var.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(k5r.m(cls.getPackage().getName(), ".", cls.getSimpleName(), "Parcelizer"), false, cls.getClassLoader());
        xy0Var.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        xy0 xy0Var = this.a;
        Method method = (Method) xy0Var.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, x0u.class.getClassLoader()).getDeclaredMethod("read", x0u.class);
        xy0Var.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        xy0 xy0Var = this.b;
        Method method = (Method) xy0Var.get(name);
        if (method != null) {
            return method;
        }
        Class b = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b.getDeclaredMethod("write", cls, x0u.class);
        xy0Var.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final int f(int i, int i2) {
        return !e(i2) ? i : ((y0u) this).e.readInt();
    }

    public final Parcelable g(int i, Parcelable parcelable) {
        if (!e(i)) {
            return parcelable;
        }
        return ((y0u) this).e.readParcelable(y0u.class.getClassLoader());
    }

    public final z0u h() {
        String readString = ((y0u) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (z0u) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e) {
            kac.k("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            kac.k("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            kac.k("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            kac.k("VersionedParcel encountered InvocationTargetException", e4);
            return null;
        }
    }

    public abstract void i(int i);

    public final void j(int i, int i2) {
        i(i2);
        ((y0u) this).e.writeInt(i);
    }

    public final void k(int i, Parcelable parcelable) {
        i(i);
        ((y0u) this).e.writeParcelable(parcelable, 0);
    }

    public final void l(z0u z0uVar) {
        if (z0uVar == null) {
            ((y0u) this).e.writeString(null);
            return;
        }
        try {
            ((y0u) this).e.writeString(b(z0uVar.getClass()).getName());
            y0u a = a();
            try {
                d(z0uVar.getClass()).invoke(null, z0uVar, a);
                Parcel parcel = a.e;
                int i = a.i;
                if (i >= 0) {
                    int i2 = a.d.get(i);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e) {
                kac.k("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                kac.k("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                kac.k("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                kac.k("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            kac.k(z0uVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
