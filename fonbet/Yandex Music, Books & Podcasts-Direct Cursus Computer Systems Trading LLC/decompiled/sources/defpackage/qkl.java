package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class qkl {
    public final gjl a;
    public final thj b;

    public qkl(gjl gjlVar, thj thjVar) {
        gjlVar.getClass();
        this.a = gjlVar;
        this.b = thjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qkl)) {
            return false;
        }
        qkl qklVar = (qkl) obj;
        return Intrinsics.d(this.a, qklVar.a) && this.b.equals(qklVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlayerScreenItemAnalyticsPayload(blockPayload=" + this.a + ", objectInfo=" + this.b + ")";
    }
}
