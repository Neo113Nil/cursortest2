package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class hc0 implements jc0 {
    public final int a;
    public final List b;
    public final boolean c;

    public hc0(int i, List list, boolean z) {
        list.getClass();
        this.a = i;
        this.b = list;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hc0)) {
            return false;
        }
        hc0 hc0Var = (hc0) obj;
        return this.a == hc0Var.a && Intrinsics.d(this.b, hc0Var.b) && this.c == hc0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k5r.d(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackQueueAndroidAutoMediaId(position=");
        sb.append(this.a);
        sb.append(", tracks=");
        sb.append(this.b);
        sb.append(", isDownloaded=");
        return ouj.r(sb, this.c, ")");
    }
}
