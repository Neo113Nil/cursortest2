package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class yje implements dmv {
    public final String a;
    public final co6 b;
    public final boolean c;

    public yje(String str, co6 co6Var, boolean z) {
        str.getClass();
        this.a = str;
        this.b = co6Var;
        this.c = z;
    }

    @Override // defpackage.dmv
    public final co6 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yje)) {
            return false;
        }
        yje yjeVar = (yje) obj;
        return Intrinsics.d(this.a, yjeVar.a) && this.b.equals(yjeVar.b) && this.c == yjeVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InfinityRestoredData(title=");
        sb.append(this.a);
        sb.append(", coverMeta=");
        sb.append(this.b);
        sb.append(", isGenerative=");
        return ouj.r(sb, this.c, ")");
    }
}
