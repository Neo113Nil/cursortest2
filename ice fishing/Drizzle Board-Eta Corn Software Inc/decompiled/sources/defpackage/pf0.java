package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class pf0 {
    public final x0 MdtA4re8;
    public final x0 NCTxEWno;
    public final x0 qoPGr6Ce;

    public pf0(x0 x0Var, x0 x0Var2, x0 x0Var3) {
        this.qoPGr6Ce = x0Var;
        this.NCTxEWno = x0Var2;
        this.MdtA4re8 = x0Var3;
    }

    public final Method MdtA4re8(String str) {
        x0 x0Var = this.qoPGr6Ce;
        Method method = (Method) x0Var.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, pf0.class.getClassLoader()).getDeclaredMethod("read", pf0.class);
        x0Var.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Class NCTxEWno(Class cls) {
        String name = cls.getName();
        x0 x0Var = this.MdtA4re8;
        Class cls2 = (Class) x0Var.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        x0Var.put(cls.getName(), cls3);
        return cls3;
    }

    public final Parcelable P7K7Inc8(Parcelable parcelable, int i) {
        if (!VgvYg0wo(i)) {
            return parcelable;
        }
        return ((qf0) this).VgvYg0wo.readParcelable(qf0.class.getClassLoader());
    }

    public abstract void Qr9iLBAD(int i);

    public abstract boolean VgvYg0wo(int i);

    public final rf0 b2ZJblxo() {
        String readString = ((qf0) this).VgvYg0wo.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (rf0) MdtA4re8(readString).invoke(null, qoPGr6Ce());
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

    public final void jb9XjC4I(rf0 rf0Var) {
        if (rf0Var == null) {
            ((qf0) this).VgvYg0wo.writeString(null);
            return;
        }
        try {
            ((qf0) this).VgvYg0wo.writeString(NCTxEWno(rf0Var.getClass()).getName());
            qf0 qoPGr6Ce = qoPGr6Ce();
            try {
                wxUZMvaN(rf0Var.getClass()).invoke(null, rf0Var, qoPGr6Ce);
                Parcel parcel = qoPGr6Ce.VgvYg0wo;
                int i = qoPGr6Ce.jb9XjC4I;
                if (i >= 0) {
                    int i2 = qoPGr6Ce.wxUZMvaN.get(i);
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
            throw new RuntimeException(rf0Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }

    public abstract qf0 qoPGr6Ce();

    public final Method wxUZMvaN(Class cls) {
        String name = cls.getName();
        x0 x0Var = this.NCTxEWno;
        Method method = (Method) x0Var.get(name);
        if (method != null) {
            return method;
        }
        Class NCTxEWno = NCTxEWno(cls);
        System.currentTimeMillis();
        Method declaredMethod = NCTxEWno.getDeclaredMethod("write", cls, pf0.class);
        x0Var.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }
}
