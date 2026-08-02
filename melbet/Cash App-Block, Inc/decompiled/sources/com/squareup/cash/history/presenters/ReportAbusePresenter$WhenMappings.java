package com.squareup.cash.history.presenters;

import com.squareup.cash.notifications.Op;
import com.squareup.protos.cash.blockly.api.ReportAbuseResponse;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class ReportAbusePresenter$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[ReportAbuseResponse.Status.values().length];
        try {
            Op.Companion companion = ReportAbuseResponse.Status.Companion;
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
