package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l40 extends bcx {
    public final v2e l;

    public l40(v2e v2eVar) {
        this.l = v2eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l40) && Intrinsics.d(this.l, ((l40) obj).l);
    }

    public final int hashCode() {
        return this.l.hashCode();
    }

    @Override // defpackage.bcx
    public final int s(ksk kskVar) {
        return kskVar.Y(this.l);
    }

    public final String toString() {
        return "Value(alignmentLine=" + this.l + ')';
    }
}
