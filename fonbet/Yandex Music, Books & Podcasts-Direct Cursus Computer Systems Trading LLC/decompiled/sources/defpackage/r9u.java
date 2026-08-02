package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r9u extends lxe {
    public final Date g = new Date(System.currentTimeMillis());
    public final tfn h;

    public r9u(tfn tfnVar) {
        this.h = tfnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9u)) {
            return false;
        }
        r9u r9uVar = (r9u) obj;
        return Intrinsics.d(this.g, r9uVar.g) && Intrinsics.d(this.h, r9uVar.h);
    }

    public final int hashCode() {
        return this.h.a.hashCode() + (this.g.hashCode() * 31);
    }

    @Override // defpackage.lxe
    public final Date s() {
        return this.g;
    }

    public final String toString() {
        return "VideoClipStartedFeedback(timestamp=" + this.g + ", itemId=" + this.h + ")";
    }
}
