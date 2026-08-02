package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m0k implements tkd {
    public final k0k a;
    public final k0k b;
    public final k0k c;
    public final k0k d;
    public final k0k e;
    public final k0k f;

    public /* synthetic */ m0k(k0k k0kVar, k0k k0kVar2, k0k k0kVar3, k0k k0kVar4) {
        this(new k0k(3, 0.0f), k0kVar, k0kVar2, new k0k(3, 0.0f), k0kVar3, k0kVar4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0k)) {
            return false;
        }
        m0k m0kVar = (m0k) obj;
        return Intrinsics.d(this.a, m0kVar.a) && Intrinsics.d(this.b, m0kVar.b) && Intrinsics.d(this.c, m0kVar.c) && Intrinsics.d(this.d, m0kVar.d) && Intrinsics.d(this.e, m0kVar.e) && Intrinsics.d(this.f, m0kVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PaddingModifier(left=" + this.a + ", start=" + this.b + ", top=" + this.c + ", right=" + this.d + ", end=" + this.e + ", bottom=" + this.f + ')';
    }

    public m0k(k0k k0kVar, k0k k0kVar2, k0k k0kVar3, k0k k0kVar4, k0k k0kVar5, k0k k0kVar6) {
        this.a = k0kVar;
        this.b = k0kVar2;
        this.c = k0kVar3;
        this.d = k0kVar4;
        this.e = k0kVar5;
        this.f = k0kVar6;
    }
}
