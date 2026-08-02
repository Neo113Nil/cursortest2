package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class skw extends vkw {
    public final rqw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public skw(rqw rqwVar) {
        super(gfw.a);
        rqwVar.getClass();
        this.b = rqwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof skw) && Intrinsics.d(this.b, ((skw) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ActiveRestricted(state=" + this.b + ")";
    }
}
