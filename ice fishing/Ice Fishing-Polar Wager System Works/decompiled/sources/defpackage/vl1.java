package defpackage;

/* loaded from: classes.dex */
public abstract class vl1 {
    public final defpackage.r6 IHQe1A4L2xu;
    public final defpackage.r6 oh6vYeIP;
    public final defpackage.r6 r1MBDhnF;

    public vl1(defpackage.r6 r6Var, defpackage.r6 r6Var2, defpackage.r6 r6Var3) {
        this.IHQe1A4L2xu = r6Var;
        this.oh6vYeIP = r6Var2;
        this.r1MBDhnF = r6Var3;
    }

    public final defpackage.xl1 AARZUJiTa() {
        java.lang.String readString = ((defpackage.wl1) this).adDC3e2L.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (defpackage.xl1) r1MBDhnF(readString).invoke(null, IHQe1A4L2xu());
        } catch (java.lang.ClassNotFoundException e) {
            throw new java.lang.RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (java.lang.IllegalAccessException e2) {
            throw new java.lang.RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (java.lang.NoSuchMethodException e3) {
            throw new java.lang.RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (java.lang.reflect.InvocationTargetException e4) {
            if (e4.getCause() instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) e4.getCause());
            }
            throw new java.lang.RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract void EXtogiMhuM(int i);

    public final java.lang.reflect.Method F7NU4MC0GW(java.lang.Class cls) {
        java.lang.String name = cls.getName();
        defpackage.r6 r6Var = this.oh6vYeIP;
        java.lang.reflect.Method method = (java.lang.reflect.Method) r6Var.get(name);
        if (method != null) {
            return method;
        }
        java.lang.Class oh6vYeIP = oh6vYeIP(cls);
        java.lang.System.currentTimeMillis();
        java.lang.reflect.Method declaredMethod = oh6vYeIP.getDeclaredMethod("write", cls, defpackage.vl1.class);
        r6Var.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract defpackage.wl1 IHQe1A4L2xu();

    public abstract boolean adDC3e2L(int i);

    public final java.lang.Class oh6vYeIP(java.lang.Class cls) {
        java.lang.String name = cls.getName();
        defpackage.r6 r6Var = this.r1MBDhnF;
        java.lang.Class cls2 = (java.lang.Class) r6Var.get(name);
        if (cls2 != null) {
            return cls2;
        }
        java.lang.Class<?> cls3 = java.lang.Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        r6Var.put(cls.getName(), cls3);
        return cls3;
    }

    public final java.lang.reflect.Method r1MBDhnF(java.lang.String str) {
        defpackage.r6 r6Var = this.IHQe1A4L2xu;
        java.lang.reflect.Method method = (java.lang.reflect.Method) r6Var.get(str);
        if (method != null) {
            return method;
        }
        java.lang.System.currentTimeMillis();
        java.lang.reflect.Method declaredMethod = java.lang.Class.forName(str, true, defpackage.vl1.class.getClassLoader()).getDeclaredMethod("read", defpackage.vl1.class);
        r6Var.put(str, declaredMethod);
        return declaredMethod;
    }

    public final void riuEU0zW4(defpackage.xl1 xl1Var) {
        if (xl1Var == null) {
            ((defpackage.wl1) this).adDC3e2L.writeString(null);
            return;
        }
        try {
            ((defpackage.wl1) this).adDC3e2L.writeString(oh6vYeIP(xl1Var.getClass()).getName());
            defpackage.wl1 IHQe1A4L2xu = IHQe1A4L2xu();
            try {
                F7NU4MC0GW(xl1Var.getClass()).invoke(null, xl1Var, IHQe1A4L2xu);
                android.os.Parcel parcel = IHQe1A4L2xu.adDC3e2L;
                int i = IHQe1A4L2xu.riuEU0zW4;
                if (i >= 0) {
                    int i2 = IHQe1A4L2xu.F7NU4MC0GW.get(i);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (java.lang.IllegalAccessException e2) {
                throw new java.lang.RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (java.lang.NoSuchMethodException e3) {
                throw new java.lang.RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (java.lang.reflect.InvocationTargetException e4) {
                if (!(e4.getCause() instanceof java.lang.RuntimeException)) {
                    throw new java.lang.RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((java.lang.RuntimeException) e4.getCause());
            }
        } catch (java.lang.ClassNotFoundException e5) {
            throw new java.lang.RuntimeException(xl1Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }

    public final android.os.Parcelable xiZrDbcSW0(android.os.Parcelable parcelable, int i) {
        if (!adDC3e2L(i)) {
            return parcelable;
        }
        return ((defpackage.wl1) this).adDC3e2L.readParcelable(defpackage.wl1.class.getClassLoader());
    }
}
