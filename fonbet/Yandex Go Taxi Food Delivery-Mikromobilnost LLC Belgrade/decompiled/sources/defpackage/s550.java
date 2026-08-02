package defpackage;

import android.os.Bundle;
import java.io.Serializable;

/* loaded from: classes10.dex */
public class s550 extends t550 {
    public final Class r;

    public s550(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            w511.g(cls, " does not implement Serializable.");
            throw null;
        }
        if (cls.isEnum()) {
            w511.g(cls, " is an Enum. You should use EnumType instead.");
            throw null;
        }
        this.r = cls;
    }

    @Override // defpackage.t550
    public final Object a(Bundle bundle, String str) {
        return (Serializable) bundle.get(str);
    }

    @Override // defpackage.t550
    public String b() {
        return this.r.getName();
    }

    @Override // defpackage.t550
    public final void e(Bundle bundle, String str, Object obj) {
        Serializable serializable = (Serializable) obj;
        this.r.cast(serializable);
        bundle.putSerializable(str, serializable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s550)) {
            return false;
        }
        return jl40.l(this.r, ((s550) obj).r);
    }

    @Override // defpackage.t550
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Serializable d(String str) {
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public s550(int i, Class cls) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.r = cls;
        } else {
            w511.g(cls, " does not implement Serializable.");
            throw null;
        }
    }
}
