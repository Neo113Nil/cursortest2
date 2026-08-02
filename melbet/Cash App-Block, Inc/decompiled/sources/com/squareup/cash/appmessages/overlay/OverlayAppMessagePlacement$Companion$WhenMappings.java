package com.squareup.cash.appmessages.overlay;

import com.squareup.protos.cash.messagingplatformcommon.app.FullScreenMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.HalfSheetMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.PopupMessage;
import okio.AsyncTimeout;
import okio.ByteString;
import okio.Path;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class OverlayAppMessagePlacement$Companion$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;

    static {
        int[] iArr = new int[HalfSheetMessage.Placement.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            Path.Companion companion = HalfSheetMessage.Placement.Companion;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            Path.Companion companion2 = HalfSheetMessage.Placement.Companion;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[PopupMessage.Placement.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            AsyncTimeout.Companion companion3 = PopupMessage.Placement.Companion;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            AsyncTimeout.Companion companion4 = PopupMessage.Placement.Companion;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            AsyncTimeout.Companion companion5 = PopupMessage.Placement.Companion;
            iArr2[3] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            AsyncTimeout.Companion companion6 = PopupMessage.Placement.Companion;
            iArr2[4] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            AsyncTimeout.Companion companion7 = PopupMessage.Placement.Companion;
            iArr2[5] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            AsyncTimeout.Companion companion8 = PopupMessage.Placement.Companion;
            iArr2[6] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            AsyncTimeout.Companion companion9 = PopupMessage.Placement.Companion;
            iArr2[7] = 8;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            AsyncTimeout.Companion companion10 = PopupMessage.Placement.Companion;
            iArr2[8] = 9;
        } catch (NoSuchFieldError unused12) {
        }
        int[] iArr3 = new int[FullScreenMessage.Placement.values().length];
        try {
            iArr3[0] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            ByteString.Companion companion11 = FullScreenMessage.Placement.Companion;
            iArr3[1] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        $EnumSwitchMapping$2 = iArr3;
    }
}
