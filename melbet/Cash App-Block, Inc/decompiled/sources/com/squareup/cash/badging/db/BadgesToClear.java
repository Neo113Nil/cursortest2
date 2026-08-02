package com.squareup.cash.badging.db;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.badging.api.ItemType;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BadgesToClear {
    public final long badge_version;
    public final String external_token;
    public final ItemType item_type;

    public BadgesToClear(String str, ItemType itemType, long j) {
        str.getClass();
        itemType.getClass();
        this.external_token = str;
        this.item_type = itemType;
        this.badge_version = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadgesToClear)) {
            return false;
        }
        BadgesToClear badgesToClear = (BadgesToClear) obj;
        return Intrinsics.areEqual(this.external_token, badgesToClear.external_token) && this.item_type == badgesToClear.item_type && this.badge_version == badgesToClear.badge_version;
    }

    public final int hashCode() {
        return Long.hashCode(this.badge_version) + ((this.item_type.hashCode() + (this.external_token.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BadgesToClear(external_token=");
        sb.append(this.external_token);
        sb.append(", item_type=");
        sb.append(this.item_type);
        sb.append(", badge_version=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(this.badge_version, ")", sb);
    }
}
