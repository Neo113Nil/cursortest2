package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class nt1 {
    public final defpackage.w7 ZpBGe2uQfcn8;
    public final defpackage.w7 fWTAfUmVKrZq;
    public final defpackage.w7 giKS3J6vZuNy;

    public nt1(defpackage.w7 w7Var, defpackage.w7 w7Var2, defpackage.w7 w7Var3) {
        this.ZpBGe2uQfcn8 = w7Var;
        this.giKS3J6vZuNy = w7Var2;
        this.fWTAfUmVKrZq = w7Var3;
    }

    public final java.lang.reflect.Method JhCgjQRTAOCT(java.lang.Class cls) {
        java.lang.String name = cls.getName();
        defpackage.w7 w7Var = this.giKS3J6vZuNy;
        java.lang.reflect.Method method = (java.lang.reflect.Method) w7Var.get(name);
        if (method != null) {
            return method;
        }
        java.lang.Class giKS3J6vZuNy = giKS3J6vZuNy(cls);
        java.lang.System.currentTimeMillis();
        java.lang.reflect.Method declaredMethod = giKS3J6vZuNy.getDeclaredMethod("write", cls, defpackage.nt1.class);
        w7Var.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract void P05cfTpS5W5L(int i);

    public final defpackage.pt1 QiMR8OkAhezm() {
        java.lang.String readString = ((defpackage.ot1) this).WDYagTQQm9ns.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (defpackage.pt1) fWTAfUmVKrZq(readString).invoke(null, ZpBGe2uQfcn8());
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

    public abstract boolean WDYagTQQm9ns(int i);

    public abstract defpackage.ot1 ZpBGe2uQfcn8();

    public final void e6mdH7fiFuta(defpackage.pt1 pt1Var) {
        if (pt1Var == null) {
            ((defpackage.ot1) this).WDYagTQQm9ns.writeString(null);
            return;
        }
        try {
            ((defpackage.ot1) this).WDYagTQQm9ns.writeString(giKS3J6vZuNy(pt1Var.getClass()).getName());
            defpackage.ot1 ZpBGe2uQfcn8 = ZpBGe2uQfcn8();
            try {
                JhCgjQRTAOCT(pt1Var.getClass()).invoke(null, pt1Var, ZpBGe2uQfcn8);
                android.os.Parcel parcel = ZpBGe2uQfcn8.WDYagTQQm9ns;
                int i = ZpBGe2uQfcn8.e6mdH7fiFuta;
                if (i >= 0) {
                    int i2 = ZpBGe2uQfcn8.JhCgjQRTAOCT.get(i);
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
            throw new java.lang.RuntimeException(pt1Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }

    public final java.lang.reflect.Method fWTAfUmVKrZq(java.lang.String str) {
        defpackage.w7 w7Var = this.ZpBGe2uQfcn8;
        java.lang.reflect.Method method = (java.lang.reflect.Method) w7Var.get(str);
        if (method != null) {
            return method;
        }
        java.lang.System.currentTimeMillis();
        java.lang.reflect.Method declaredMethod = java.lang.Class.forName(str, true, defpackage.nt1.class.getClassLoader()).getDeclaredMethod("read", defpackage.nt1.class);
        w7Var.put(str, declaredMethod);
        return declaredMethod;
    }

    public final java.lang.Class giKS3J6vZuNy(java.lang.Class cls) {
        java.lang.String name = cls.getName();
        defpackage.w7 w7Var = this.fWTAfUmVKrZq;
        java.lang.Class cls2 = (java.lang.Class) w7Var.get(name);
        if (cls2 != null) {
            return cls2;
        }
        java.lang.Class<?> cls3 = java.lang.Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        w7Var.put(cls.getName(), cls3);
        return cls3;
    }

    public final android.os.Parcelable oh71FJcDz6S2(android.os.Parcelable parcelable, int i) {
        if (!WDYagTQQm9ns(i)) {
            return parcelable;
        }
        return ((defpackage.ot1) this).WDYagTQQm9ns.readParcelable(defpackage.ot1.class.getClassLoader());
    }
}
