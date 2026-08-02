package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class sfo {
    public final String a;
    public final s9p b;

    public sfo(s9p s9pVar, String str) {
        str.getClass();
        s9pVar.getClass();
        this.a = str;
        this.b = s9pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sfo)) {
            return false;
        }
        sfo sfoVar = (sfo) obj;
        return Intrinsics.d(this.a, sfoVar.a) && Intrinsics.d(this.b, sfoVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RotorSessionMeta(sessionId=" + this.a + ", seeds=" + this.b + ")";
    }
}
