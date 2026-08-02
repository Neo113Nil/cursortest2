package com.squareup.cash.devicegrip.service;

import com.squareup.cash.devicegrip.service.RemoveDevicesResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes6.dex */
public final class RemoveDevicesResponse$ErrorReason$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        RemoveDevicesResponse.ErrorReason.Companion.getClass();
        if (i == 1) {
            return RemoveDevicesResponse.ErrorReason.CALLER_DEVICE_NOT_FOUND;
        }
        if (i != 2) {
            return null;
        }
        return RemoveDevicesResponse.ErrorReason.CALLER_DEVICE_NOT_LOGGED_IN_LONG_ENOUGH;
    }
}
