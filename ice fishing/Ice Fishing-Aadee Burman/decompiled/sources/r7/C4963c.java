package r7;

import com.anythink.basead.exoplayer.f.f;

/* renamed from: r7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4963c implements d {

    /* renamed from: n, reason: collision with root package name */
    public final d f40389n;

    /* renamed from: u, reason: collision with root package name */
    public final d f40390u;

    /* renamed from: v, reason: collision with root package name */
    public final d f40391v;

    /* renamed from: w, reason: collision with root package name */
    public final d f40392w;

    public C4963c() {
        EnumC4962b enumC4962b = EnumC4962b.f40387n;
        this.f40389n = enumC4962b;
        EnumC4961a enumC4961a = EnumC4961a.f40385n;
        this.f40390u = enumC4961a;
        this.f40391v = enumC4962b;
        this.f40392w = enumC4961a;
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
        Object obj2 = EnumC4962b.f40387n;
        return obj2.equals(obj2) && this.f40389n.equals(c4963c.f40389n) && this.f40390u.equals(c4963c.f40390u) && this.f40391v.equals(c4963c.f40391v) && this.f40392w.equals(c4963c.f40392w);
    }

    @Override // r7.d
    public final String getDescription() {
        String description = this.f40389n.getDescription();
        String description2 = this.f40390u.getDescription();
        String description3 = this.f40391v.getDescription();
        String description4 = this.f40392w.getDescription();
        StringBuilder sb = new StringBuilder("ParentBased{root:AlwaysOnSampler,remoteParentSampled:");
        sb.append(description);
        sb.append(",remoteParentNotSampled:");
        sb.append(description2);
        sb.append(",localParentSampled:");
        return f.o(sb, description3, ",localParentNotSampled:", description4, "}");
    }

    public final int hashCode() {
        return this.f40392w.hashCode() + ((this.f40391v.hashCode() + ((this.f40390u.hashCode() + ((this.f40389n.hashCode() + (EnumC4962b.f40387n.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return getDescription();
    }
}
