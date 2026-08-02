package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class uam implements cbm, qzn {
    public final te a;

    public uam(te teVar) {
        teVar.getClass();
        this.a = teVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uam) && Intrinsics.d(this.a, ((uam) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ActionButtonBlock(uiData=" + this.a + ")";
    }
}
