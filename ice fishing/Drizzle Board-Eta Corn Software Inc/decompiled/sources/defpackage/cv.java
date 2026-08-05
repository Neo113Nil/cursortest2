package defpackage;

import android.os.Bundle;
import java.io.Serializable;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class cv extends ev {
    public final Class amk52bBQ;

    public cv(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            m1.OnDfzHZD(cls, " does not implement Serializable.");
            throw null;
        }
        try {
            this.amk52bBQ = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.ev
    public final String NCTxEWno() {
        return this.amk52bBQ.getName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
    @Override // defpackage.ev
    public final void VgvYg0wo(Bundle bundle, String str, Object obj) {
        ?? r3 = (Serializable[]) obj;
        str.getClass();
        this.amk52bBQ.cast(r3);
        bundle.putSerializable(str, r3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !cv.class.equals(obj.getClass())) {
            return false;
        }
        return fn.qoPGr6Ce(this.amk52bBQ, ((cv) obj).amk52bBQ);
    }

    public final int hashCode() {
        return this.amk52bBQ.hashCode();
    }

    @Override // defpackage.ev
    public final Object qoPGr6Ce(String str, Bundle bundle) {
        bundle.getClass();
        return (Serializable[]) bundle.get(str);
    }

    @Override // defpackage.ev
    public final Object wxUZMvaN(String str) {
        str.getClass();
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }
}
