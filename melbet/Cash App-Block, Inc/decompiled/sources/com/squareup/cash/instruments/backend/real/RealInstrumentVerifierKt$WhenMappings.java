package com.squareup.cash.instruments.backend.real;

import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.app.VerifyInstrumentResponse;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class RealInstrumentVerifierKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[VerifyInstrumentResponse.Status.values().length];
        try {
            UiAlias.Type.Companion companion = VerifyInstrumentResponse.Status.Companion;
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            UiAlias.Type.Companion companion2 = VerifyInstrumentResponse.Status.Companion;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            UiAlias.Type.Companion companion3 = VerifyInstrumentResponse.Status.Companion;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            UiAlias.Type.Companion companion4 = VerifyInstrumentResponse.Status.Companion;
            iArr[3] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            UiAlias.Type.Companion companion5 = VerifyInstrumentResponse.Status.Companion;
            iArr[4] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
