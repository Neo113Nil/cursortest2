package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j7u implements l7u {
    public final String a;
    public final s7u b;
    public final s7u c;
    public final s7u d;
    public final f7u e;
    public final b3l f;

    public j7u(String str, s7u s7uVar, s7u s7uVar2, s7u s7uVar3, f7u f7uVar, b3l b3lVar) {
        str.getClass();
        s7uVar2.getClass();
        this.a = str;
        this.b = s7uVar;
        this.c = s7uVar2;
        this.d = s7uVar3;
        this.e = f7uVar;
        this.f = b3lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7u)) {
            return false;
        }
        j7u j7uVar = (j7u) obj;
        return Intrinsics.d(this.a, j7uVar.a) && Intrinsics.d(this.b, j7uVar.b) && Intrinsics.d(this.c, j7uVar.c) && Intrinsics.d(this.d, j7uVar.d) && this.e.equals(j7uVar.e) && this.f.equals(j7uVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        s7u s7uVar = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (s7uVar == null ? 0 : s7uVar.hashCode())) * 31)) * 31;
        s7u s7uVar2 = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((hashCode2 + (s7uVar2 != null ? s7uVar2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Ready(radioSessionId=" + this.a + ", previous=" + this.b + ", current=" + this.c + ", pending=" + this.d + ", queue=" + this.e + ", action=" + this.f + ")";
    }
}
