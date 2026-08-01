package f0;

import android.os.Bundle;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class J extends L {

    /* renamed from: r, reason: collision with root package name */
    public final Class f2876r;

    public J(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
        try {
            this.f2876r = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // f0.L
    public final Object a(Bundle bundle, String str) {
        return (Serializable[]) D1.h.c(bundle, "bundle", str, "key", str);
    }

    @Override // f0.L
    public final String b() {
        return this.f2876r.getName();
    }

    @Override // f0.L
    public final Object d(String str) {
        D1.i.e(str, "value");
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
    @Override // f0.L
    public final void e(Bundle bundle, String str, Object obj) {
        ?? r4 = (Serializable[]) obj;
        D1.i.e(str, "key");
        this.f2876r.cast(r4);
        bundle.putSerializable(str, r4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !J.class.equals(obj.getClass())) {
            return false;
        }
        return D1.i.a(this.f2876r, ((J) obj).f2876r);
    }

    public final int hashCode() {
        return this.f2876r.hashCode();
    }
}
