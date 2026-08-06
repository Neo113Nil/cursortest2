package U;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import l.C0978b;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final C0978b f1803a;

    /* renamed from: b, reason: collision with root package name */
    public final C0978b f1804b;

    /* renamed from: c, reason: collision with root package name */
    public final C0978b f1805c;

    public a(C0978b c0978b, C0978b c0978b2, C0978b c0978b3) {
        this.f1803a = c0978b;
        this.f1804b = c0978b2;
        this.f1805c = c0978b3;
    }

    public abstract b a();

    public final Class b(Class cls) {
        String name = cls.getName();
        C0978b c0978b = this.f1805c;
        Class cls2 = (Class) c0978b.getOrDefault(name, null);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c0978b.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        C0978b c0978b = this.f1803a;
        Method method = (Method) c0978b.getOrDefault(str, null);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
        c0978b.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        C0978b c0978b = this.f1804b;
        Method method = (Method) c0978b.getOrDefault(name, null);
        if (method != null) {
            return method;
        }
        Class b2 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b2.getDeclaredMethod("write", cls, a.class);
        c0978b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i2);

    public final Parcelable f(Parcelable parcelable, int i2) {
        if (!e(i2)) {
            return parcelable;
        }
        return ((b) this).f1807e.readParcelable(b.class.getClassLoader());
    }

    public final c g() {
        String readString = ((b) this).f1807e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (c) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e5.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        }
    }

    public abstract void h(int i2);

    public final void i(c cVar) {
        if (cVar == null) {
            ((b) this).f1807e.writeString(null);
            return;
        }
        try {
            ((b) this).f1807e.writeString(b(cVar.getClass()).getName());
            b a2 = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, a2);
                int i2 = a2.f1811i;
                if (i2 >= 0) {
                    int i3 = a2.f1806d.get(i2);
                    Parcel parcel = a2.f1807e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i3);
                    parcel.writeInt(dataPosition - i3);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
            } catch (InvocationTargetException e5) {
                if (!(e5.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
                }
                throw ((RuntimeException) e5.getCause());
            }
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e6);
        }
    }
}
