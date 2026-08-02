package com.squareup.cash.nearby.backend;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.UUID;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Charsets;

/* loaded from: classes6.dex */
public final class NearbyAdvertisement {
    public final NearbyIdentifier identifier;
    public final byte[] payload;

    public NearbyAdvertisement(NearbyIdentifier nearbyIdentifier, byte[] bArr) {
        bArr.getClass();
        this.identifier = nearbyIdentifier;
        this.payload = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!NearbyAdvertisement.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        NearbyAdvertisement nearbyAdvertisement = (NearbyAdvertisement) obj;
        return this.identifier.equals(nearbyAdvertisement.identifier) && Arrays.equals(this.payload, nearbyAdvertisement.payload);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.payload) + (this.identifier.hashCode() * 31);
    }

    public final byte[] toByteArray() {
        byte[] bArr = new byte[16];
        NearbyIdentifier nearbyIdentifier = this.identifier;
        byte[] bytes = nearbyIdentifier.prefix.getBytes(Charsets.UTF_8);
        bytes.getClass();
        ArraysKt___ArraysJvmKt.copyInto$default(new byte[]{bytes[0], bytes[1], (byte) nearbyIdentifier.intent.value, nearbyIdentifier.reserved}, bArr, 0, 0, 0, 14);
        byte[] bArr2 = this.payload;
        byte[] sliceArray = ArraysKt___ArraysKt.sliceArray(bArr2, RangesKt___RangesKt.until(0, Math.min(12, bArr2.length)));
        ArraysKt___ArraysJvmKt.copyInto$default(sliceArray, bArr, 16 - sliceArray.length, 0, 0, 12);
        return bArr;
    }

    public final String toString() {
        return "NearbyAdvertisement(identifier=" + this.identifier + ", payload=" + Arrays.toString(this.payload) + ")";
    }

    public final UUID toUuid() {
        ByteBuffer wrap = ByteBuffer.wrap(toByteArray());
        return new UUID(wrap.getLong(), wrap.getLong());
    }
}
