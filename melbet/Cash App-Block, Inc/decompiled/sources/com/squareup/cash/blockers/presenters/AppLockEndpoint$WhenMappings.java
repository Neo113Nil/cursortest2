package com.squareup.cash.blockers.presenters;

import com.squareup.protos.cash.ui.ActionType;
import com.squareup.protos.franklin.app.SetAppLockActivatedResponse;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class AppLockEndpoint$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[SetAppLockActivatedResponse.Status.values().length];
        try {
            ActionType.Companion companion = SetAppLockActivatedResponse.Status.Companion;
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            ActionType.Companion companion2 = SetAppLockActivatedResponse.Status.Companion;
            iArr[3] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            ActionType.Companion companion3 = SetAppLockActivatedResponse.Status.Companion;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            ActionType.Companion companion4 = SetAppLockActivatedResponse.Status.Companion;
            iArr[4] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
