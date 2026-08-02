package r7;

import com.IceFishing.LiveIceFishing.k;

/* renamed from: r7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4913c implements d {

    /* renamed from: n, reason: collision with root package name */
    public final d f40228n;

    /* renamed from: u, reason: collision with root package name */
    public final d f40229u;

    /* renamed from: v, reason: collision with root package name */
    public final d f40230v;

    /* renamed from: w, reason: collision with root package name */
    public final d f40231w;

    public C4913c() {
        EnumC4912b enumC4912b = EnumC4912b.f40226n;
        this.f40228n = enumC4912b;
        EnumC4911a enumC4911a = EnumC4911a.f40224n;
        this.f40229u = enumC4911a;
        this.f40230v = enumC4912b;
        this.f40231w = enumC4911a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4913c)) {
            return false;
        }
        C4913c c4913c = (C4913c) obj;
        c4913c.getClass();
        Object obj2 = EnumC4912b.f40226n;
        return obj2.equals(obj2) && this.f40228n.equals(c4913c.f40228n) && this.f40229u.equals(c4913c.f40229u) && this.f40230v.equals(c4913c.f40230v) && this.f40231w.equals(c4913c.f40231w);
    }

    @Override // r7.d
    public final String getDescription() {
        String description = this.f40228n.getDescription();
        String description2 = this.f40229u.getDescription();
        String description3 = this.f40230v.getDescription();
        String description4 = this.f40231w.getDescription();
        StringBuilder sb = new StringBuilder("ParentBased{root:AlwaysOnSampler,remoteParentSampled:");
        sb.append(description);
        sb.append(",remoteParentNotSampled:");
        sb.append(description2);
        sb.append(",localParentSampled:");
        return k.r(sb, description3, ",localParentNotSampled:", description4, "}");
    }

    public final int hashCode() {
        return this.f40231w.hashCode() + ((this.f40230v.hashCode() + ((this.f40229u.hashCode() + ((this.f40228n.hashCode() + (EnumC4912b.f40226n.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return getDescription();
    }
}
