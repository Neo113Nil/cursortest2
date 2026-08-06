package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class ce1 {
    public final b5 GWasM1elztuh;
    public final b5 X1lG3V04pd;
    public final b5 Yi7zF1RB1;

    public ce1(b5 b5Var, b5 b5Var2, b5 b5Var3) {
        this.GWasM1elztuh = b5Var;
        this.Yi7zF1RB1 = b5Var2;
        this.X1lG3V04pd = b5Var3;
    }

    public final ee1 AvO7iQsrTN() {
        String readString = ((de1) this).OOA6hdeuvCS.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (ee1) X1lG3V04pd(readString).invoke(null, GWasM1elztuh());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public final Parcelable EljAMC1QTz(Parcelable parcelable, int i) {
        if (!OOA6hdeuvCS(i)) {
            return parcelable;
        }
        return ((de1) this).OOA6hdeuvCS.readParcelable(de1.class.getClassLoader());
    }

    public abstract de1 GWasM1elztuh();

    public abstract boolean OOA6hdeuvCS(int i);

    public final Method X1lG3V04pd(String str) {
        b5 b5Var = this.GWasM1elztuh;
        Method method = (Method) b5Var.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, ce1.class.getClassLoader()).getDeclaredMethod("read", ce1.class);
        b5Var.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Class Yi7zF1RB1(Class cls) {
        String name = cls.getName();
        b5 b5Var = this.X1lG3V04pd;
        Class cls2 = (Class) b5Var.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        b5Var.put(cls.getName(), cls3);
        return cls3;
    }

    public abstract void encWxUiV2(int i);

    public final void mOu10nynGul(ee1 ee1Var) {
        if (ee1Var == null) {
            ((de1) this).OOA6hdeuvCS.writeString(null);
            return;
        }
        try {
            ((de1) this).OOA6hdeuvCS.writeString(Yi7zF1RB1(ee1Var.getClass()).getName());
            de1 GWasM1elztuh = GWasM1elztuh();
            try {
                xqGvceK5x(ee1Var.getClass()).invoke(null, ee1Var, GWasM1elztuh);
                Parcel parcel = GWasM1elztuh.OOA6hdeuvCS;
                int i = GWasM1elztuh.mOu10nynGul;
                if (i >= 0) {
                    int i2 = GWasM1elztuh.xqGvceK5x.get(i);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(ee1Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }

    public final Method xqGvceK5x(Class cls) {
        String name = cls.getName();
        b5 b5Var = this.Yi7zF1RB1;
        Method method = (Method) b5Var.get(name);
        if (method != null) {
            return method;
        }
        Class Yi7zF1RB1 = Yi7zF1RB1(cls);
        System.currentTimeMillis();
        Method declaredMethod = Yi7zF1RB1.getDeclaredMethod("write", cls, ce1.class);
        b5Var.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }
}
