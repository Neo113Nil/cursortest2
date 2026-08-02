package androidx.media3.common;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class AuxEffectInfo {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AuxEffectInfo.class != obj.getClass()) {
            return false;
        }
        return Float.compare(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(RecyclerView.DECELERATION_RATE) + 16337;
    }
}
