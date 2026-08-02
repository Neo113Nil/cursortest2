package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i4u extends lxe {
    public final Date g = new Date(System.currentTimeMillis());
    public final tfn h;
    public final float i;

    public i4u(tfn tfnVar, float f) {
        this.h = tfnVar;
        this.i = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4u)) {
            return false;
        }
        i4u i4uVar = (i4u) obj;
        return Intrinsics.d(this.g, i4uVar.g) && Intrinsics.d(this.h, i4uVar.h) && Float.compare(this.i, i4uVar.i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + k5r.c(this.g.hashCode() * 31, 31, this.h.a);
    }

    @Override // defpackage.lxe
    public final Date s() {
        return this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoClipFinishedFeedback(timestamp=");
        sb.append(this.g);
        sb.append(", itemId=");
        sb.append(this.h);
        sb.append(", totalPlayedSeconds=");
        return su4.m(this.i, ")", sb);
    }
}
