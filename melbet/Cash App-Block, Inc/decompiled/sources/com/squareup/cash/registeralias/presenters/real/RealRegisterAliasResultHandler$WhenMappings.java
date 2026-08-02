package com.squareup.cash.registeralias.presenters.real;

import com.squareup.cash.onboarding.util.AliasRegistrar$Args;
import com.squareup.cash.onboarding.util.AliasRegistrar$Result;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class RealRegisterAliasResultHandler$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[AliasRegistrar$Args.DeliveryMechanism.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            AliasRegistrar$Args.DeliveryMechanism deliveryMechanism = AliasRegistrar$Args.DeliveryMechanism.SMS;
            iArr[2] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            AliasRegistrar$Args.DeliveryMechanism deliveryMechanism2 = AliasRegistrar$Args.DeliveryMechanism.SMS;
            iArr[1] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[AliasRegistrar$Result.NotSuccessful.Status.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            AliasRegistrar$Result.NotSuccessful.Status status = AliasRegistrar$Result.NotSuccessful.Status.INVALID_ALIAS;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            AliasRegistrar$Result.NotSuccessful.Status status2 = AliasRegistrar$Result.NotSuccessful.Status.INVALID_ALIAS;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
