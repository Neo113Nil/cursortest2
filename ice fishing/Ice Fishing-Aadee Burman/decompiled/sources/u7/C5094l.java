package u7;

import java.io.Serializable;

/* renamed from: u7.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5094l implements Serializable {

    /* renamed from: n, reason: collision with root package name */
    public final String f41338n;

    /* renamed from: u, reason: collision with root package name */
    public final String f41339u;

    /* renamed from: v, reason: collision with root package name */
    public final String f41340v;

    public C5094l(String str, String str2, String str3) {
        this.f41338n = str;
        this.f41339u = str2;
        this.f41340v = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5094l)) {
            return false;
        }
        C5094l c5094l = (C5094l) obj;
        return this.f41338n.equals(c5094l.f41338n) && kotlin.jvm.internal.h.a(this.f41339u, c5094l.f41339u) && kotlin.jvm.internal.h.a(this.f41340v, c5094l.f41340v);
    }

    public final int hashCode() {
        int hashCode = this.f41338n.hashCode() * 31;
        String str = this.f41339u;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f41340v;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + ((Object) this.f41338n) + ", " + ((Object) this.f41339u) + ", " + ((Object) this.f41340v) + ')';
    }
}
