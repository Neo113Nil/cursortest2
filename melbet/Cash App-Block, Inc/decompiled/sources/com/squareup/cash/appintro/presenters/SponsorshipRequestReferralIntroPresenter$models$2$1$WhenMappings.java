package com.squareup.cash.appintro.presenters;

import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.protos.cash.janus.api.RegisterProspectTokenResponse;
import com.squareup.protos.cash.moneymap.app.RetailerType;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class SponsorshipRequestReferralIntroPresenter$models$2$1$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[RegisterProspectTokenResponse.Status.values().length];
        try {
            RetailerType.Companion companion = RegisterProspectTokenResponse.Status.Companion;
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            RetailerType.Companion companion2 = RegisterProspectTokenResponse.Status.Companion;
            iArr[2] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            RetailerType.Companion companion3 = RegisterProspectTokenResponse.Status.Companion;
            iArr[3] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            RetailerType.Companion companion4 = RegisterProspectTokenResponse.Status.Companion;
            iArr[4] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[RegisterProspectTokenResponse.AliasType.values().length];
        try {
            ContactAliasType.Companion companion5 = RegisterProspectTokenResponse.AliasType.Companion;
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            ContactAliasType.Companion companion6 = RegisterProspectTokenResponse.AliasType.Companion;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
