package androidx.activity.compose;

import androidx.navigationevent.NavigationEventInfo;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class PredictiveBackHandlerInfo extends NavigationEventInfo {
    public final long compositeKey;
    public final Object owner;

    public PredictiveBackHandlerInfo(Object obj, long j) {
        this.owner = obj;
        this.compositeKey = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PredictiveBackHandlerInfo)) {
            return false;
        }
        PredictiveBackHandlerInfo predictiveBackHandlerInfo = (PredictiveBackHandlerInfo) obj;
        return this.owner.equals(predictiveBackHandlerInfo.owner) && this.compositeKey == predictiveBackHandlerInfo.compositeKey;
    }

    public final int hashCode() {
        return Long.hashCode(this.compositeKey) + (this.owner.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PredictiveBackHandlerInfo(owner=");
        sb.append(this.owner);
        sb.append(", compositeKey=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.compositeKey, ')');
    }
}
