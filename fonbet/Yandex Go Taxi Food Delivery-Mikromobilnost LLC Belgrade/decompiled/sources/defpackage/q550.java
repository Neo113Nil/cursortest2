package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes10.dex */
public final class q550 extends t550 {
    public final Class r;

    public q550(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
            this.r = cls;
        } else {
            w511.g(cls, " does not implement Parcelable or Serializable.");
            throw null;
        }
    }

    @Override // defpackage.t550
    public final Object a(Bundle bundle, String str) {
        return bundle.get(str);
    }

    @Override // defpackage.t550
    public final String b() {
        return this.r.getName();
    }

    @Override // defpackage.t550
    public final Object d(String str) {
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // defpackage.t550
    public final void e(Bundle bundle, String str, Object obj) {
        this.r.cast(obj);
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
        if (obj == null || !q550.class.equals(obj.getClass())) {
            return false;
        }
        return jl40.l(this.r, ((q550) obj).r);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }
}
