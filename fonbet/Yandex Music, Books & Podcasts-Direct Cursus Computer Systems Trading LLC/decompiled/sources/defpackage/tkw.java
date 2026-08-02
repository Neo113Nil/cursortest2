package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class tkw extends vkw {
    public final pqw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkw(pqw pqwVar) {
        super(gfw.b);
        pqwVar.getClass();
        this.b = pqwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tkw) && Intrinsics.d(this.b, ((tkw) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Passive(state=" + this.b + ")";
    }
}
