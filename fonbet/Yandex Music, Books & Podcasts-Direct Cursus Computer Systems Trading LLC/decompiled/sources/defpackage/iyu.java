package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class iyu implements nyu, myu {
    public final s9p a;
    public final c5q b;
    public final boolean c;

    public iyu(s9p s9pVar, c5q c5qVar, boolean z) {
        s9pVar.getClass();
        this.a = s9pVar;
        this.b = c5qVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iyu)) {
            return false;
        }
        iyu iyuVar = (iyu) obj;
        return Intrinsics.d(this.a, iyuVar.a) && this.b.equals(iyuVar.b) && this.c == iyuVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Seeds(seeds=");
        sb.append(this.a);
        sb.append(", analyticsOptions=");
        sb.append(this.b);
        sb.append(", interactive=");
        return ouj.r(sb, this.c, ")");
    }
}
