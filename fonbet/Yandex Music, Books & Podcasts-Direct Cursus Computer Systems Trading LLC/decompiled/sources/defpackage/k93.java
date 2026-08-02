package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k93 implements q93, qzn {
    public final te a;

    public k93(te teVar) {
        teVar.getClass();
        this.a = teVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k93) && Intrinsics.d(this.a, ((k93) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ActionButtonBlock(uiData=" + this.a + ")";
    }
}
