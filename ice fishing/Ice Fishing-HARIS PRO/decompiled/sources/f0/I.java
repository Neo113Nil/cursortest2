package f0;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class I extends L {

    /* renamed from: r, reason: collision with root package name */
    public final Class f2875r;

    public I(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
            this.f2875r = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
    }

    @Override // f0.L
    public final Object a(Bundle bundle, String str) {
        return D1.h.c(bundle, "bundle", str, "key", str);
    }

    @Override // f0.L
    public final String b() {
        return this.f2875r.getName();
    }

    @Override // f0.L
    public final Object d(String str) {
        D1.i.e(str, "value");
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // f0.L
    public final void e(Bundle bundle, String str, Object obj) {
        D1.i.e(str, "key");
        this.f2875r.cast(obj);
        if (obj == null || (obj instanceof Parcelable)) {
            bundle.putParcelable(str, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !I.class.equals(obj.getClass())) {
            return false;
        }
        return D1.i.a(this.f2875r, ((I) obj).f2875r);
    }

    public final int hashCode() {
        return this.f2875r.hashCode();
    }
}
