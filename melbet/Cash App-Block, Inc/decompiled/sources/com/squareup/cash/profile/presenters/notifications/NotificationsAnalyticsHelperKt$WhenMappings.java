package com.squareup.cash.profile.presenters.notifications;

import com.squareup.cash.profile.viewmodels.AliasItem;
import com.squareup.cash.profile.viewmodels.CategoryListType;
import com.squareup.cash.profile.viewmodels.ChannelType;
import com.squareup.protos.cash.investcrypto.resources.Origin;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategory;
import com.squareup.protos.franklin.api.UiAlias;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class NotificationsAnalyticsHelperKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;

    static {
        int[] iArr = new int[UiAlias.Type.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            UiAlias.Type.Companion companion = UiAlias.Type.Companion;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[ChannelType.values().length];
        try {
            iArr2[1] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            ChannelType channelType = ChannelType.EMAIL;
            iArr2[0] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            ChannelType channelType2 = ChannelType.EMAIL;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$1 = iArr2;
        int[] iArr3 = new int[NotificationCategory.values().length];
        try {
            iArr3[3] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            Origin.Companion companion2 = NotificationCategory.Companion;
            iArr3[4] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            Origin.Companion companion3 = NotificationCategory.Companion;
            iArr3[5] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            Origin.Companion companion4 = NotificationCategory.Companion;
            iArr3[6] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            Origin.Companion companion5 = NotificationCategory.Companion;
            iArr3[7] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            Origin.Companion companion6 = NotificationCategory.Companion;
            iArr3[9] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            Origin.Companion companion7 = NotificationCategory.Companion;
            iArr3[8] = 7;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            Origin.Companion companion8 = NotificationCategory.Companion;
            iArr3[10] = 8;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            Origin.Companion companion9 = NotificationCategory.Companion;
            iArr3[11] = 9;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            Origin.Companion companion10 = NotificationCategory.Companion;
            iArr3[12] = 10;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            Origin.Companion companion11 = NotificationCategory.Companion;
            iArr3[13] = 11;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            Origin.Companion companion12 = NotificationCategory.Companion;
            iArr3[14] = 12;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            Origin.Companion companion13 = NotificationCategory.Companion;
            iArr3[16] = 13;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            Origin.Companion companion14 = NotificationCategory.Companion;
            iArr3[17] = 14;
        } catch (NoSuchFieldError unused19) {
        }
        $EnumSwitchMapping$2 = iArr3;
        int[] iArr4 = new int[CategoryListType.values().length];
        try {
            iArr4[0] = 1;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            CategoryListType categoryListType = CategoryListType.ACTIVITY;
            iArr4[1] = 2;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            CategoryListType categoryListType2 = CategoryListType.ACTIVITY;
            iArr4[2] = 3;
        } catch (NoSuchFieldError unused22) {
        }
        int[] iArr5 = new int[AliasItem.values().length];
        try {
            iArr5[AliasItem.EMAIL.ordinal()] = 1;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr5[AliasItem.PHONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused24) {
        }
    }
}
