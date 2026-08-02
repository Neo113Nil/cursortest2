package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class rkw extends vkw {
    public final pqw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rkw(pqw pqwVar) {
        super(gfw.a);
        pqwVar.getClass();
        this.b = pqwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rkw) && Intrinsics.d(this.b, ((rkw) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Active(state=" + this.b + ")";
    }
}
