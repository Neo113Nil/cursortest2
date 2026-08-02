package com.squareup.cash.blockers.presenters;

import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.app.SetAddressResponse;
import okio.Path;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class SetAddressPresenter$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[BlockersScreens.StreetAddressScreen.FormType.values().length];
        try {
            iArr[2] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            BlockersScreens.StreetAddressScreen.FormType formType = BlockersScreens.StreetAddressScreen.FormType.POSTAL_CODE;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            BlockersScreens.StreetAddressScreen.FormType formType2 = BlockersScreens.StreetAddressScreen.FormType.POSTAL_CODE;
            iArr[0] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[Region.values().length];
        try {
            iArr2[Region.AUS.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[Region.CAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[Region.GBR.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[Region.USA.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[Region.XXL.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        $EnumSwitchMapping$1 = iArr2;
        int[] iArr3 = new int[SetAddressResponse.Status.values().length];
        try {
            iArr3[1] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            Path.Companion companion = SetAddressResponse.Status.Companion;
            iArr3[2] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            Path.Companion companion2 = SetAddressResponse.Status.Companion;
            iArr3[3] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            Path.Companion companion3 = SetAddressResponse.Status.Companion;
            iArr3[0] = 4;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
