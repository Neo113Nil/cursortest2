package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p7p extends y7p {
    public final s7n a;
    public final n7n b;
    public final e4p c;

    public p7p(s7n s7nVar, n7n n7nVar) {
        n7nVar.getClass();
        this.a = s7nVar;
        this.b = n7nVar;
        this.c = e4p.a;
    }

    @Override // defpackage.y7p
    public final e4p b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7p)) {
            return false;
        }
        p7p p7pVar = (p7p) obj;
        return this.a.equals(p7pVar.a) && Intrinsics.d(this.b, p7pVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "QueryToVibeWave(uiData=" + this.a + ", model=" + this.b + ")";
    }
}
