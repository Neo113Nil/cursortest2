package androidx.media3.common.util;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class StuckPlayerException extends IllegalStateException {
    public final int stuckType;
    public final int timeoutMs;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StuckPlayerException(int i, int i2) {
        super(r0);
        String m;
        if (i == 0) {
            m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "Player stuck buffering and not loading for ", " ms");
        } else if (i == 1) {
            m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "Player stuck buffering with no progress for ", " ms");
        } else if (i == 2) {
            m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "Player stuck playing with no progress for ", " ms");
        } else if (i == 3) {
            m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "Player stuck playing without ending for ", " ms");
        } else {
            if (i != 4) {
                Path$$ExternalSyntheticBUOutline0.m();
                throw null;
            }
            m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "Player stuck suppressed for ", " ms");
        }
        this.stuckType = i;
        this.timeoutMs = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StuckPlayerException.class != obj.getClass()) {
            return false;
        }
        StuckPlayerException stuckPlayerException = (StuckPlayerException) obj;
        return this.stuckType == stuckPlayerException.stuckType && this.timeoutMs == stuckPlayerException.timeoutMs;
    }

    public final int hashCode() {
        return ((527 + this.stuckType) * 31) + this.timeoutMs;
    }
}
