package com.squareup.cash.family.familyhub.presenters;

import com.squareup.protos.cash.aegis.sync_values.SponsorshipState;
import com.squareup.protos.cash.api.Error;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class SponsorDetailPresenter$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[SponsorshipState.values().length];
        try {
            Error.Code.Companion companion = SponsorshipState.Companion;
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
