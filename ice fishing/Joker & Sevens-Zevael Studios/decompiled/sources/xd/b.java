package xd;

import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends d {

    /* renamed from: a, reason: collision with root package name */
    public final String f8406a;

    public b(String str) {
        this.f8406a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && j.a(this.f8406a, ((b) obj).f8406a);
    }

    public final int hashCode() {
        return this.f8406a.hashCode();
    }

    public final String toString() {
        return a4.d.j("GoToWeb(url=", this.f8406a, ")");
    }
}
