package u7;

import java.io.Serializable;

/* renamed from: u7.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5086l implements Serializable {

    /* renamed from: n, reason: collision with root package name */
    public final String f41061n;

    /* renamed from: u, reason: collision with root package name */
    public final String f41062u;

    /* renamed from: v, reason: collision with root package name */
    public final String f41063v;

    public C5086l(String str, String str2, String str3) {
        this.f41061n = str;
        this.f41062u = str2;
        this.f41063v = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5086l)) {
            return false;
        }
        C5086l c5086l = (C5086l) obj;
        return this.f41061n.equals(c5086l.f41061n) && kotlin.jvm.internal.h.a(this.f41062u, c5086l.f41062u) && kotlin.jvm.internal.h.a(this.f41063v, c5086l.f41063v);
    }

    public final int hashCode() {
        int hashCode = this.f41061n.hashCode() * 31;
        String str = this.f41062u;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f41063v;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + ((Object) this.f41061n) + ", " + ((Object) this.f41062u) + ", " + ((Object) this.f41063v) + ')';
    }
}
