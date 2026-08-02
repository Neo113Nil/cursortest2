package androidx.activity.compose;

import androidx.navigationevent.NavigationEventInfo;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class BackHandlerInfo extends NavigationEventInfo {
    public final long compositeKey;
    public final Object owner;

    public BackHandlerInfo(Object obj, long j) {
        this.owner = obj;
        this.compositeKey = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackHandlerInfo)) {
            return false;
        }
        BackHandlerInfo backHandlerInfo = (BackHandlerInfo) obj;
        return this.owner.equals(backHandlerInfo.owner) && this.compositeKey == backHandlerInfo.compositeKey;
    }

    public final int hashCode() {
        return Long.hashCode(this.compositeKey) + (this.owner.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackHandlerInfo(owner=");
        sb.append(this.owner);
        sb.append(", compositeKey=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.compositeKey, ')');
    }
}
