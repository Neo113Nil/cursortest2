package com.squareup.cash.profile.devicemanager.presenters;

import com.fillr.e;
import com.squareup.cash.devicegrip.service.RemoveDevicesResponse;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class DeviceManagerListPresenter$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[RemoveDevicesResponse.ErrorReason.values().length];
        try {
            e eVar = RemoveDevicesResponse.ErrorReason.Companion;
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
