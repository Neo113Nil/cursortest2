package F0;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.core.common.d.j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final s.b f955a;

    /* renamed from: b, reason: collision with root package name */
    public final s.b f956b;

    /* renamed from: c, reason: collision with root package name */
    public final s.b f957c;

    public a(s.b bVar, s.b bVar2, s.b bVar3) {
        this.f955a = bVar;
        this.f956b = bVar2;
        this.f957c = bVar3;
    }

    public abstract b a();

    public final Class b(Class cls) {
        String name = cls.getName();
        s.b bVar = this.f957c;
        Class cls2 = (Class) bVar.getOrDefault(name, null);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + j.f13164z + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        bVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        s.b bVar = this.f955a;
        Method method = (Method) bVar.getOrDefault(str, null);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
        bVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        s.b bVar = this.f956b;
        Method method = (Method) bVar.getOrDefault(name, null);
        if (method != null) {
            return method;
        }
        Class b9 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b9.getDeclaredMethod("write", cls, a.class);
        bVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((b) this).f959e.readParcelable(b.class.getClassLoader());
    }

    public final c g() {
        String readString = ((b) this).f959e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (c) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e9) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e9);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e11);
        } catch (InvocationTargetException e12) {
            if (e12.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e12.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e12);
        }
    }

    public abstract void h(int i);

    public final void i(c cVar) {
        if (cVar == null) {
            ((b) this).f959e.writeString(null);
            return;
        }
        try {
            ((b) this).f959e.writeString(b(cVar.getClass()).getName());
            b a9 = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, a9);
                int i = a9.i;
                if (i >= 0) {
                    int i4 = a9.f958d.get(i);
                    Parcel parcel = a9.f959e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i4);
                    parcel.writeInt(dataPosition - i4);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e9) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e9);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
            } catch (NoSuchMethodException e11) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e11);
            } catch (InvocationTargetException e12) {
                if (!(e12.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e12);
                }
                throw ((RuntimeException) e12.getCause());
            }
        } catch (ClassNotFoundException e13) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e13);
        }
    }
}
