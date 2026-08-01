package f0;

import android.os.Bundle;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class H extends L {

    /* renamed from: r, reason: collision with root package name */
    public final Class f2874r;

    public H(Class cls) {
        super(true);
        if (!Parcelable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
        }
        try {
            this.f2874r = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // f0.L
    public final Object a(Bundle bundle, String str) {
        return (Parcelable[]) D1.h.c(bundle, "bundle", str, "key", str);
    }

    @Override // f0.L
    public final String b() {
        return this.f2874r.getName();
    }

    @Override // f0.L
    public final Object d(String str) {
        D1.i.e(str, "value");
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    @Override // f0.L
    public final void e(Bundle bundle, String str, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        D1.i.e(str, "key");
        this.f2874r.cast(parcelableArr);
        bundle.putParcelableArray(str, parcelableArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !H.class.equals(obj.getClass())) {
            return false;
        }
        return D1.i.a(this.f2874r, ((H) obj).f2874r);
    }

    public final int hashCode() {
        return this.f2874r.hashCode();
    }
}
