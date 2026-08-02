package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class der extends u7g {
    public final orw c;

    public der(orw orwVar) {
        orwVar.getClass();
        this.c = orwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof der) && Intrinsics.d(this.c, ((der) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "Success(state=" + this.c + ")";
    }
}
