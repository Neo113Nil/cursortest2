package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class uc0 extends wc0 {
    public final List a;
    public final int b;

    public uc0(List list, int i) {
        list.getClass();
        this.a = list;
        this.b = i;
    }

    @Override // defpackage.wc0
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc0)) {
            return false;
        }
        uc0 uc0Var = (uc0) obj;
        return Intrinsics.d(this.a, uc0Var.a) && this.b == uc0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TrackQueueAndroidAutoPlayableItem(tracks=" + this.a + ", position=" + this.b + ")";
    }
}
