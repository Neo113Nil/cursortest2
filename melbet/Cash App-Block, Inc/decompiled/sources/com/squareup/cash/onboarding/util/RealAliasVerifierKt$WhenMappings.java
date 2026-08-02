package com.squareup.cash.onboarding.util;

import com.squareup.protos.franklin.app.VerifyEmailResponse;
import com.squareup.protos.franklin.app.VerifySmsResponse;
import com.squareup.protos.franklin.common.SignInType;
import com.squareup.protos.franklin.common.Trigger;
import okio.Path;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class RealAliasVerifierKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;

    static {
        int[] iArr = new int[SignInType.values().length];
        try {
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            Trigger.Companion companion = SignInType.Companion;
            iArr[2] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[VerifySmsResponse.Status.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            Path.Companion companion2 = VerifySmsResponse.Status.Companion;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            Path.Companion companion3 = VerifySmsResponse.Status.Companion;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            Path.Companion companion4 = VerifySmsResponse.Status.Companion;
            iArr2[3] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            Path.Companion companion5 = VerifySmsResponse.Status.Companion;
            iArr2[4] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            Path.Companion companion6 = VerifySmsResponse.Status.Companion;
            iArr2[5] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            Path.Companion companion7 = VerifySmsResponse.Status.Companion;
            iArr2[6] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        $EnumSwitchMapping$1 = iArr2;
        int[] iArr3 = new int[VerifyEmailResponse.Status.values().length];
        try {
            iArr3[0] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            Path.Companion companion8 = VerifyEmailResponse.Status.Companion;
            iArr3[1] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            Path.Companion companion9 = VerifyEmailResponse.Status.Companion;
            iArr3[2] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            Path.Companion companion10 = VerifyEmailResponse.Status.Companion;
            iArr3[3] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            Path.Companion companion11 = VerifyEmailResponse.Status.Companion;
            iArr3[4] = 5;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            Path.Companion companion12 = VerifyEmailResponse.Status.Companion;
            iArr3[5] = 6;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            Path.Companion companion13 = VerifyEmailResponse.Status.Companion;
            iArr3[6] = 7;
        } catch (NoSuchFieldError unused16) {
        }
        $EnumSwitchMapping$2 = iArr3;
    }
}
