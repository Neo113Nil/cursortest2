package com.squareup.cash.clientsync;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.wire.AndroidMessage;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class PayloadWithMetadata {
    public final String entityId;
    public final Long entityVersion;
    public final Object value;

    public PayloadWithMetadata(AndroidMessage androidMessage, String str, Long l) {
        androidMessage.getClass();
        str.getClass();
        this.value = androidMessage;
        this.entityId = str;
        this.entityVersion = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayloadWithMetadata)) {
            return false;
        }
        PayloadWithMetadata payloadWithMetadata = (PayloadWithMetadata) obj;
        return Intrinsics.areEqual(this.value, payloadWithMetadata.value) && Intrinsics.areEqual(this.entityId, payloadWithMetadata.entityId) && Intrinsics.areEqual(this.entityVersion, payloadWithMetadata.entityVersion);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.value.hashCode() * 31, 31, this.entityId);
        Long l = this.entityVersion;
        return m + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PayloadWithMetadata(value=");
        sb.append(this.value);
        sb.append(", entityId=");
        sb.append(this.entityId);
        sb.append(", entityVersion=");
        return Thread$State$EnumUnboxingLocalUtility.m(sb, this.entityVersion, ")");
    }
}
