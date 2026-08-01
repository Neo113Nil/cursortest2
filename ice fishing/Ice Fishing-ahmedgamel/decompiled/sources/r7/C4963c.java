package r7;

import com.anythink.basead.exoplayer.f.f;

/* renamed from: r7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4963c implements d {

    /* renamed from: n, reason: collision with root package name */
    public final d f40392n;

    /* renamed from: u, reason: collision with root package name */
    public final d f40393u;

    /* renamed from: v, reason: collision with root package name */
    public final d f40394v;

    /* renamed from: w, reason: collision with root package name */
    public final d f40395w;

    public C4963c() {
        EnumC4962b enumC4962b = EnumC4962b.f40390n;
        this.f40392n = enumC4962b;
        EnumC4961a enumC4961a = EnumC4961a.f40388n;
        this.f40393u = enumC4961a;
        this.f40394v = enumC4962b;
        this.f40395w = enumC4961a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4963c)) {
            return false;
        }
        C4963c c4963c = (C4963c) obj;
        c4963c.getClass();
        Object obj2 = EnumC4962b.f40390n;
        return obj2.equals(obj2) && this.f40392n.equals(c4963c.f40392n) && this.f40393u.equals(c4963c.f40393u) && this.f40394v.equals(c4963c.f40394v) && this.f40395w.equals(c4963c.f40395w);
    }

    @Override // r7.d
    public final String getDescription() {
        String description = this.f40392n.getDescription();
        String description2 = this.f40393u.getDescription();
        String description3 = this.f40394v.getDescription();
        String description4 = this.f40395w.getDescription();
        StringBuilder sb = new StringBuilder("ParentBased{root:AlwaysOnSampler,remoteParentSampled:");
        sb.append(description);
        sb.append(",remoteParentNotSampled:");
        sb.append(description2);
        sb.append(",localParentSampled:");
        return f.o(sb, description3, ",localParentNotSampled:", description4, "}");
    }

    public final int hashCode() {
        return this.f40395w.hashCode() + ((this.f40394v.hashCode() + ((this.f40393u.hashCode() + ((this.f40392n.hashCode() + (EnumC4962b.f40390n.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return getDescription();
    }
}
