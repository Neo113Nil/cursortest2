package t0;

import E0.i;
import java.io.Serializable;

/* renamed from: t0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0247b implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public final Object f2987e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2988f;

    public C0247b(Object obj, Object obj2) {
        this.f2987e = obj;
        this.f2988f = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0247b)) {
            return false;
        }
        C0247b c0247b = (C0247b) obj;
        return i.a(this.f2987e, c0247b.f2987e) && i.a(this.f2988f, c0247b.f2988f);
    }

    public final int hashCode() {
        Object obj = this.f2987e;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f2988f;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f2987e + ", " + this.f2988f + ')';
    }
}
