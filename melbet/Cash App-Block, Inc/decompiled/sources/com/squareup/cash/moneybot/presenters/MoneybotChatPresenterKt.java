package com.squareup.cash.moneybot.presenters;

import com.plaid.internal.EnumC0170g;
import com.squareup.cash.cdf.moneybot.FeedbackType;
import com.squareup.cash.moneybot.screens.ThumbDirection;
import com.squareup.cash.moneybot.viewmodels.chat.MessageViewModel;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewEvent;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes6.dex */
public abstract class MoneybotChatPresenterKt {
    public static final /* synthetic */ int $r8$clinit = 0;
    public static final long FeedbackSheetThumbStateDelay;
    public static final long ToastMessageDuration;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ThumbDirection.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ThumbDirection thumbDirection = ThumbDirection.THUMBS_UP;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MessageViewModel.MoneybotMessageViewModel.ThumbState.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                MessageViewModel.MoneybotMessageViewModel.ThumbState thumbState = MessageViewModel.MoneybotMessageViewModel.ThumbState.NONE;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                MessageViewModel.MoneybotMessageViewModel.ThumbState thumbState2 = MessageViewModel.MoneybotMessageViewModel.ThumbState.NONE;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[MoneybotChatViewEvent.QuickActionTap.QuickActionType.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                MoneybotChatViewEvent.QuickActionTap.QuickActionType quickActionType = MoneybotChatViewEvent.QuickActionTap.QuickActionType.COPY;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                MoneybotChatViewEvent.QuickActionTap.QuickActionType quickActionType2 = MoneybotChatViewEvent.QuickActionTap.QuickActionType.COPY;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static {
        Duration.Companion companion = Duration.Companion;
        FeedbackSheetThumbStateDelay = DurationKt.toDuration(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, DurationUnit.MILLISECONDS);
        ToastMessageDuration = DurationKt.toDuration(3, DurationUnit.SECONDS);
    }

    public static final FeedbackType access$toCdfFeedbackType(ThumbDirection thumbDirection) {
        int ordinal = thumbDirection.ordinal();
        if (ordinal == 0) {
            return FeedbackType.POSITIVE;
        }
        if (ordinal == 1) {
            return FeedbackType.NEGATIVE;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final MessageViewModel.MoneybotMessageViewModel.ThumbState access$toThumbState(ThumbDirection thumbDirection) {
        int i = thumbDirection == null ? -1 : WhenMappings.$EnumSwitchMapping$0[thumbDirection.ordinal()];
        if (i == -1) {
            return MessageViewModel.MoneybotMessageViewModel.ThumbState.NONE;
        }
        if (i == 1) {
            return MessageViewModel.MoneybotMessageViewModel.ThumbState.THUMBS_UP;
        }
        if (i == 2) {
            return MessageViewModel.MoneybotMessageViewModel.ThumbState.THUMBS_DOWN;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
