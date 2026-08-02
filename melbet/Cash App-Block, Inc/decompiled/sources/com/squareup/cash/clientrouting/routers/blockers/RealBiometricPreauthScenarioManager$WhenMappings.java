package com.squareup.cash.clientrouting.routers.blockers;

import com.squareup.protos.franklin.app.ConfirmPasscodeResponse;
import okio.internal.ResourceFileSystem;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class RealBiometricPreauthScenarioManager$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[ConfirmPasscodeResponse.Status.values().length];
        try {
            ResourceFileSystem.Companion companion = ConfirmPasscodeResponse.Status.Companion;
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            ResourceFileSystem.Companion companion2 = ConfirmPasscodeResponse.Status.Companion;
            iArr[3] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
