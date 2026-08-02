package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i7u implements l7u {
    public final String a;
    public final s7u b;
    public final f7u c;

    public i7u(String str, s7u s7uVar, f7u f7uVar) {
        str.getClass();
        this.a = str;
        this.b = s7uVar;
        this.c = f7uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7u)) {
            return false;
        }
        i7u i7uVar = (i7u) obj;
        return Intrinsics.d(this.a, i7uVar.a) && Intrinsics.d(this.b, i7uVar.b) && this.c.equals(i7uVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        s7u s7uVar = this.b;
        return this.c.hashCode() + ((hashCode + (s7uVar == null ? 0 : s7uVar.hashCode())) * 31);
    }

    public final String toString() {
        return "NothingToPlay(radioSessionId=" + this.a + ", previous=" + this.b + ", queue=" + this.c + ")";
    }
}
