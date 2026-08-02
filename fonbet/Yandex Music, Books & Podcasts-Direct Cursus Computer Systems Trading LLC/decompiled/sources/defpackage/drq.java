package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class drq extends lxe {
    public final Date g = new Date(System.currentTimeMillis());
    public final tfn h;
    public final float i;

    public drq(tfn tfnVar, float f) {
        this.h = tfnVar;
        this.i = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drq)) {
            return false;
        }
        drq drqVar = (drq) obj;
        return Intrinsics.d(this.g, drqVar.g) && Intrinsics.d(this.h, drqVar.h) && Float.compare(this.i, drqVar.i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + k5r.c(this.g.hashCode() * 31, 31, this.h.a);
    }

    @Override // defpackage.lxe
    public final Date s() {
        return this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SkipFeedback(timestamp=");
        sb.append(this.g);
        sb.append(", itemId=");
        sb.append(this.h);
        sb.append(", totalPlayedSeconds=");
        return su4.m(this.i, ")", sb);
    }
}
