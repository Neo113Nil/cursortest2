package com.google.android.datatransport.cct.internal;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class AutoValue_ExternalPRequestContext extends ExternalPRequestContext {
    public final Integer originAssociatedProductId;

    public AutoValue_ExternalPRequestContext(Integer num) {
        this.originAssociatedProductId = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExternalPRequestContext)) {
            return false;
        }
        Integer num = this.originAssociatedProductId;
        AutoValue_ExternalPRequestContext autoValue_ExternalPRequestContext = (AutoValue_ExternalPRequestContext) ((ExternalPRequestContext) obj);
        return num == null ? autoValue_ExternalPRequestContext.originAssociatedProductId == null : num.equals(autoValue_ExternalPRequestContext.originAssociatedProductId);
    }

    public final int hashCode() {
        Integer num = this.originAssociatedProductId;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m(new StringBuilder("ExternalPRequestContext{originAssociatedProductId="), this.originAssociatedProductId, "}");
    }
}
