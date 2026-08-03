package kd;

import ac.m;
import bc.a0;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final m f3637e = a0.y(new e.b(5));

    /* renamed from: a, reason: collision with root package name */
    public final String f3638a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3639b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3640c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3641d;

    public a(String str, String str2, String str3, String str4) {
        this.f3638a = str;
        this.f3639b = str2;
        this.f3640c = str3;
        this.f3641d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.a(this.f3638a, aVar.f3638a) && j.a(this.f3639b, aVar.f3639b) && j.a(this.f3640c, aVar.f3640c) && j.a(this.f3641d, aVar.f3641d);
    }

    public final int hashCode() {
        return this.f3641d.hashCode() + ((this.f3640c.hashCode() + ((this.f3639b.hashCode() + (this.f3638a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "FormSchema(bodyFieldName=" + this.f3638a + ", slotInstall=" + this.f3639b + ", slotAdvertising=" + this.f3640c + ", slotReferrer=" + this.f3641d + ")";
    }
}
