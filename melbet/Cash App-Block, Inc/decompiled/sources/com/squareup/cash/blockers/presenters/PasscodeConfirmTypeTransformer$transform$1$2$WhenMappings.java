package com.squareup.cash.blockers.presenters;

import com.squareup.protos.franklin.app.ConfirmPasscodeResponse;
import okio.internal.ResourceFileSystem;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class PasscodeConfirmTypeTransformer$transform$1$2$WhenMappings {
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
        try {
            ResourceFileSystem.Companion companion3 = ConfirmPasscodeResponse.Status.Companion;
            iArr[4] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            ResourceFileSystem.Companion companion4 = ConfirmPasscodeResponse.Status.Companion;
            iArr[5] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            ResourceFileSystem.Companion companion5 = ConfirmPasscodeResponse.Status.Companion;
            iArr[2] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            ResourceFileSystem.Companion companion6 = ConfirmPasscodeResponse.Status.Companion;
            iArr[6] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            ResourceFileSystem.Companion companion7 = ConfirmPasscodeResponse.Status.Companion;
            iArr[0] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
