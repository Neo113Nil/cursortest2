package r0;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import r.C0338f;

/* renamed from: r0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0345a {

    /* renamed from: a, reason: collision with root package name */
    public final C0338f f4329a;

    /* renamed from: b, reason: collision with root package name */
    public final C0338f f4330b;

    /* renamed from: c, reason: collision with root package name */
    public final C0338f f4331c;

    public AbstractC0345a(C0338f c0338f, C0338f c0338f2, C0338f c0338f3) {
        this.f4329a = c0338f;
        this.f4330b = c0338f2;
        this.f4331c = c0338f3;
    }

    public abstract b a();

    public final Class b(Class cls) {
        String name = cls.getName();
        C0338f c0338f = this.f4331c;
        Class cls2 = (Class) c0338f.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c0338f.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        C0338f c0338f = this.f4329a;
        Method method = (Method) c0338f.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC0345a.class.getClassLoader()).getDeclaredMethod("read", AbstractC0345a.class);
        c0338f.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        C0338f c0338f = this.f4330b;
        Method method = (Method) c0338f.get(name);
        if (method != null) {
            return method;
        }
        Class b2 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b2.getDeclaredMethod("write", cls, AbstractC0345a.class);
        c0338f.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((b) this).e.readParcelable(b.class.getClassLoader());
    }

    public final c g() {
        String readString = ((b) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (c) c(readString).invoke(null, a());
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

    public abstract void h(int i);

    public final void i(c cVar) {
        if (cVar == null) {
            ((b) this).e.writeString(null);
            return;
        }
        try {
            ((b) this).e.writeString(b(cVar.getClass()).getName());
            b a2 = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, a2);
                int i = a2.i;
                if (i >= 0) {
                    int i2 = a2.f4332d.get(i);
                    Parcel parcel = a2.e;
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
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
