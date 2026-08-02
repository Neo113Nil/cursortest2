package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ybu {
    public final List a;
    public final int b;

    public ybu(List list, int i) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ybu)) {
            return false;
        }
        ybu ybuVar = (ybu) obj;
        return Intrinsics.d(this.a, ybuVar.a) && this.b == ybuVar.b;
    }

    public final int hashCode() {
        List list = this.a;
        return Integer.hashCode(this.b) + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return "VideoRadioInitialQueueInfo(initialQueue=" + this.a + ", current=" + this.b + ")";
    }
}
