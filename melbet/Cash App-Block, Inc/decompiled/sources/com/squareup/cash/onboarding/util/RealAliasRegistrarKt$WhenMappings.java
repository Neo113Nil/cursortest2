package com.squareup.cash.onboarding.util;

import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.app.RegisterEmailResponse;
import com.squareup.protos.franklin.app.RegisterSmsResponse;
import okio.internal.ResourceFileSystem;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class RealAliasRegistrarKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[RegisterSmsResponse.Status.values().length];
        try {
            UiAlias.Type.Companion companion = RegisterSmsResponse.Status.Companion;
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            UiAlias.Type.Companion companion2 = RegisterSmsResponse.Status.Companion;
            iArr[5] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            UiAlias.Type.Companion companion3 = RegisterSmsResponse.Status.Companion;
            iArr[1] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            UiAlias.Type.Companion companion4 = RegisterSmsResponse.Status.Companion;
            iArr[2] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            UiAlias.Type.Companion companion5 = RegisterSmsResponse.Status.Companion;
            iArr[3] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            UiAlias.Type.Companion companion6 = RegisterSmsResponse.Status.Companion;
            iArr[4] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[RegisterEmailResponse.Status.values().length];
        try {
            ResourceFileSystem.Companion companion7 = RegisterEmailResponse.Status.Companion;
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            ResourceFileSystem.Companion companion8 = RegisterEmailResponse.Status.Companion;
            iArr2[5] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            ResourceFileSystem.Companion companion9 = RegisterEmailResponse.Status.Companion;
            iArr2[6] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            ResourceFileSystem.Companion companion10 = RegisterEmailResponse.Status.Companion;
            iArr2[1] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            ResourceFileSystem.Companion companion11 = RegisterEmailResponse.Status.Companion;
            iArr2[2] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            ResourceFileSystem.Companion companion12 = RegisterEmailResponse.Status.Companion;
            iArr2[3] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            ResourceFileSystem.Companion companion13 = RegisterEmailResponse.Status.Companion;
            iArr2[4] = 7;
        } catch (NoSuchFieldError unused13) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
