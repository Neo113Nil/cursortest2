package com.squareup.cash.profile.presenters;

import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.recipients.backend.api.SuggestionStrategy;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class ProfilePresenterAnalyticsKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[ProfileScreens.ProfileScreen.Action.ActionType.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            ProfileScreens.ProfileScreen.Action.ActionType actionType = ProfileScreens.ProfileScreen.Action.ActionType.PAY;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            ProfileScreens.ProfileScreen.Action.ActionType actionType2 = ProfileScreens.ProfileScreen.Action.ActionType.PAY;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            ProfileScreens.ProfileScreen.Action.ActionType actionType3 = ProfileScreens.ProfileScreen.Action.ActionType.PAY;
            iArr[3] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[SuggestionStrategy.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            SuggestionStrategy suggestionStrategy = SuggestionStrategy.CONTACTS_ON_CASH;
            iArr2[2] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            SuggestionStrategy suggestionStrategy2 = SuggestionStrategy.CONTACTS_ON_CASH;
            iArr2[3] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            SuggestionStrategy suggestionStrategy3 = SuggestionStrategy.CONTACTS_ON_CASH;
            iArr2[5] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            SuggestionStrategy suggestionStrategy4 = SuggestionStrategy.CONTACTS_ON_CASH;
            iArr2[6] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
