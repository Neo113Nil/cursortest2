package com.squareup.cash.nearby.backend;

import com.squareup.protos.cash.nearby.api.v1.NearbyContext;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class NearbyIdentifier {
    public final NearbyContext.NearbyIntent intent;
    public final String prefix;
    public final byte reserved;

    public NearbyIdentifier(String str, NearbyContext.NearbyIntent nearbyIntent, byte b) {
        this.prefix = str;
        this.intent = nearbyIntent;
        this.reserved = b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyIdentifier)) {
            return false;
        }
        NearbyIdentifier nearbyIdentifier = (NearbyIdentifier) obj;
        return Intrinsics.areEqual(this.prefix, nearbyIdentifier.prefix) && this.intent == nearbyIdentifier.intent && this.reserved == nearbyIdentifier.reserved;
    }

    public final int hashCode() {
        return Byte.hashCode(this.reserved) + ((this.intent.hashCode() + (this.prefix.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NearbyIdentifier(prefix=");
        sb.append(this.prefix);
        sb.append(", intent=");
        sb.append(this.intent);
        sb.append(", reserved=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.reserved, ")", sb);
    }

    public /* synthetic */ NearbyIdentifier() {
        this("CA", NearbyContext.NearbyIntent.NEARBY_INTENT_P2P_REQUEST, (byte) 0);
    }
}
