package defpackage;

import android.os.Bundle;
import java.io.Serializable;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class dv extends ev {
    public final Class amk52bBQ;

    public dv(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            m1.OnDfzHZD(cls, " does not implement Serializable.");
            throw null;
        }
        if (cls.isEnum()) {
            m1.OnDfzHZD(cls, " is an Enum. You should use EnumType instead.");
            throw null;
        }
        this.amk52bBQ = cls;
    }

    @Override // defpackage.ev
    public String NCTxEWno() {
        return this.amk52bBQ.getName();
    }

    @Override // defpackage.ev
    public final void VgvYg0wo(Bundle bundle, String str, Object obj) {
        Serializable serializable = (Serializable) obj;
        str.getClass();
        serializable.getClass();
        this.amk52bBQ.cast(serializable);
        bundle.putSerializable(str, serializable);
    }

    @Override // defpackage.ev
    /* renamed from: b2ZJblxo, reason: merged with bridge method [inline-methods] */
    public Serializable wxUZMvaN(String str) {
        str.getClass();
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv)) {
            return false;
        }
        return this.amk52bBQ.equals(((dv) obj).amk52bBQ);
    }

    public final int hashCode() {
        return this.amk52bBQ.hashCode();
    }

    @Override // defpackage.ev
    public final Object qoPGr6Ce(String str, Bundle bundle) {
        bundle.getClass();
        return (Serializable) bundle.get(str);
    }

    public dv(int i, Class cls) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.amk52bBQ = cls;
        } else {
            m1.OnDfzHZD(cls, " does not implement Serializable.");
            throw null;
        }
    }
}
