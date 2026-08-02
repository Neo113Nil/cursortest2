package com.squareup.cash.blockers.presenters;

import com.squareup.protos.franklin.app.VerifyPasscodeResponse;
import okio.AsyncTimeout;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class UnlockAppEndpoint$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[VerifyPasscodeResponse.Status.values().length];
        try {
            AsyncTimeout.Companion companion = VerifyPasscodeResponse.Status.Companion;
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            AsyncTimeout.Companion companion2 = VerifyPasscodeResponse.Status.Companion;
            iArr[2] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            AsyncTimeout.Companion companion3 = VerifyPasscodeResponse.Status.Companion;
            iArr[3] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
