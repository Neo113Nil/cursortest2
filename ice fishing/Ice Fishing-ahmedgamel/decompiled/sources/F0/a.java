package F0;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.core.common.d.j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final s.b f892a;

    /* renamed from: b, reason: collision with root package name */
    public final s.b f893b;

    /* renamed from: c, reason: collision with root package name */
    public final s.b f894c;

    public a(s.b bVar, s.b bVar2, s.b bVar3) {
        this.f892a = bVar;
        this.f893b = bVar2;
        this.f894c = bVar3;
    }

    public abstract b a();

    public final Class b(Class cls) {
        String name = cls.getName();
        s.b bVar = this.f894c;
        Class cls2 = (Class) bVar.getOrDefault(name, null);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + j.f12378z + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        bVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        s.b bVar = this.f892a;
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
        s.b bVar = this.f893b;
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
        return ((b) this).f896e.readParcelable(b.class.getClassLoader());
    }

    public final c g() {
        String readString = ((b) this).f896e.readString();
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
            ((b) this).f896e.writeString(null);
            return;
        }
        try {
            ((b) this).f896e.writeString(b(cVar.getClass()).getName());
            b a9 = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, a9);
                int i = a9.i;
                if (i >= 0) {
                    int i6 = a9.f895d.get(i);
                    Parcel parcel = a9.f896e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i6);
                    parcel.writeInt(dataPosition - i6);
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
