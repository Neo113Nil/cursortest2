package com.squareup.cash.google.pay;

import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningResponseData;
import okio.internal.ResourceFileSystem;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class FranklinGooglePayProvisioningGateway$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[DigitalWalletTokenProvisioningResponseData.Status.values().length];
        try {
            ResourceFileSystem.Companion companion = DigitalWalletTokenProvisioningResponseData.Status.Companion;
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            ResourceFileSystem.Companion companion2 = DigitalWalletTokenProvisioningResponseData.Status.Companion;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
