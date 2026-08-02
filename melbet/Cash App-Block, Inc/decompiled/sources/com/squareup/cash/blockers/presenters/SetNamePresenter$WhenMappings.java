package com.squareup.cash.blockers.presenters;

import com.squareup.protos.franklin.app.SetFullNameResponse;
import okio.AsyncTimeout;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class SetNamePresenter$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[SetFullNameResponse.Status.values().length];
        try {
            AsyncTimeout.Companion companion = SetFullNameResponse.Status.Companion;
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
