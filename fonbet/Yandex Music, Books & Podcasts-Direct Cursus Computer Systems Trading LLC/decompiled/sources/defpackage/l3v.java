package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l3v {
    public final l2v a;
    public final l2v b;
    public final l2v c;

    public l3v(l2v l2vVar, l2v l2vVar2, l2v l2vVar3) {
        this.a = l2vVar;
        this.b = l2vVar2;
        this.c = l2vVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3v)) {
            return false;
        }
        l3v l3vVar = (l3v) obj;
        return Intrinsics.d(this.a, l3vVar.a) && this.b.equals(l3vVar.b) && Intrinsics.d(this.c, l3vVar.c);
    }

    public final int hashCode() {
        l2v l2vVar = this.a;
        int hashCode = (this.b.hashCode() + ((l2vVar == null ? 0 : l2vVar.hashCode()) * 31)) * 31;
        l2v l2vVar2 = this.c;
        return hashCode + (l2vVar2 != null ? l2vVar2.hashCode() : 0);
    }

    public final String toString() {
        return "WaveScreenQueueUiState(previous=" + this.a + ", current=" + this.b + ", next=" + this.c + ")";
    }
}
