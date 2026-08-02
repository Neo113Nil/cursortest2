package defpackage;

import android.os.SystemClock;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a2k {
    public final long a = SystemClock.elapsedRealtime();
    public Long b = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2k)) {
            return false;
        }
        a2k a2kVar = (a2k) obj;
        return this.a == a2kVar.a && Intrinsics.d(this.b, a2kVar.b);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        Long l = this.b;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "ChatMoments(chatLoadStarted=" + this.a + ", chatLoadFinished=" + this.b + ")";
    }
}
