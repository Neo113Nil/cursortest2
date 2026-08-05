package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class bv extends ev {
    public final Class amk52bBQ;

    public bv(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
            this.amk52bBQ = cls;
        } else {
            m1.OnDfzHZD(cls, " does not implement Parcelable or Serializable.");
            throw null;
        }
    }

    @Override // defpackage.ev
    public final String NCTxEWno() {
        return this.amk52bBQ.getName();
    }

    @Override // defpackage.ev
    public final void VgvYg0wo(Bundle bundle, String str, Object obj) {
        str.getClass();
        this.amk52bBQ.cast(obj);
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
        if (obj == null || !bv.class.equals(obj.getClass())) {
            return false;
        }
        return this.amk52bBQ.equals(((bv) obj).amk52bBQ);
    }

    public final int hashCode() {
        return this.amk52bBQ.hashCode();
    }

    @Override // defpackage.ev
    public final Object qoPGr6Ce(String str, Bundle bundle) {
        bundle.getClass();
        return bundle.get(str);
    }

    @Override // defpackage.ev
    public final Object wxUZMvaN(String str) {
        str.getClass();
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }
}
