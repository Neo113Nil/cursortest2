package defpackage;

import android.os.Bundle;
import java.io.Serializable;

/* loaded from: classes10.dex */
public final class r550 extends t550 {
    public final Class r;

    public r550(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            w511.g(cls, " does not implement Serializable.");
            throw null;
        }
        try {
            this.r = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e) {
            ny61.j(e);
            throw null;
        }
    }

    @Override // defpackage.t550
    public final Object a(Bundle bundle, String str) {
        return (Serializable[]) bundle.get(str);
    }

    @Override // defpackage.t550
    public final String b() {
        return this.r.getName();
    }

    @Override // defpackage.t550
    public final Object d(String str) {
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
    @Override // defpackage.t550
    public final void e(Bundle bundle, String str, Object obj) {
        ?? r3 = (Serializable[]) obj;
        this.r.cast(r3);
        bundle.putSerializable(str, r3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !r550.class.equals(obj.getClass())) {
            return false;
        }
        return jl40.l(this.r, ((r550) obj).r);
    }

    @Override // defpackage.t550
    public final boolean f(Object obj, Object obj2) {
        return d73.b((Serializable[]) obj, (Serializable[]) obj2);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }
}
