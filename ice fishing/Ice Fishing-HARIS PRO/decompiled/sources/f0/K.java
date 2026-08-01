package f0;

import android.os.Bundle;
import java.io.Serializable;

/* loaded from: classes.dex */
public class K extends L {

    /* renamed from: r, reason: collision with root package name */
    public final Class f2877r;

    public K(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
        if (!cls.isEnum()) {
            this.f2877r = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
    }

    @Override // f0.L
    public final Object a(Bundle bundle, String str) {
        return (Serializable) D1.h.c(bundle, "bundle", str, "key", str);
    }

    @Override // f0.L
    public String b() {
        return this.f2877r.getName();
    }

    @Override // f0.L
    public final void e(Bundle bundle, String str, Object obj) {
        Serializable serializable = (Serializable) obj;
        D1.i.e(str, "key");
        D1.i.e(serializable, "value");
        this.f2877r.cast(serializable);
        bundle.putSerializable(str, serializable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        return D1.i.a(this.f2877r, ((K) obj).f2877r);
    }

    @Override // f0.L
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Serializable d(String str) {
        D1.i.e(str, "value");
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.f2877r.hashCode();
    }

    public K(int i, Class cls) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.f2877r = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
    }
}
