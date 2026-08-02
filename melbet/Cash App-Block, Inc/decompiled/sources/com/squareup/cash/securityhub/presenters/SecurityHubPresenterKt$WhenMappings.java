package com.squareup.cash.securityhub.presenters;

import android.os.Parcelable;
import com.squareup.cash.securityhub.screens.SecurityHubScreen;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class SecurityHubPresenterKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[SecurityHubScreen.Source.values().length];
        try {
            Parcelable.Creator<SecurityHubScreen.Source> creator = SecurityHubScreen.Source.CREATOR;
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
