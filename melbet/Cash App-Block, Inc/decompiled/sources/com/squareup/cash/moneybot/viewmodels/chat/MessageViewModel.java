package com.squareup.cash.moneybot.viewmodels.chat;

import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface MessageViewModel {

    public final class CardMessageViewModel implements MessageViewModel {
        public final ChatCardViewModel card;

        public CardMessageViewModel(ChatCardViewModel chatCardViewModel) {
            this.card = chatCardViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CardMessageViewModel) && this.card.equals(((CardMessageViewModel) obj).card);
        }

        public final int hashCode() {
            return this.card.hashCode();
        }

        public final String toString() {
            return "CardMessageViewModel(card=" + this.card + ")";
        }
    }

    public final class ImageMessageViewModel implements MessageViewModel {
        public final String imageUrl;
        public final boolean isPending;
        public final String mimeType;

        public ImageMessageViewModel(String str, String str2, boolean z) {
            this.imageUrl = str;
            this.mimeType = str2;
            this.isPending = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageMessageViewModel)) {
                return false;
            }
            ImageMessageViewModel imageMessageViewModel = (ImageMessageViewModel) obj;
            return Intrinsics.areEqual(this.imageUrl, imageMessageViewModel.imageUrl) && Intrinsics.areEqual(this.mimeType, imageMessageViewModel.mimeType) && this.isPending == imageMessageViewModel.isPending;
        }

        public final int hashCode() {
            String str = this.imageUrl;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.mimeType;
            return Boolean.hashCode(this.isPending) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ImageMessageViewModel(imageUrl=", this.imageUrl, ", mimeType=", this.mimeType, ", isPending="), this.isPending, ")");
        }
    }

    public final class QuickActionsBarViewModel implements MessageViewModel {
        public final String copyText;
        public final String messageId;
        public final MoneybotMessageViewModel.ThumbState thumbState;

        public QuickActionsBarViewModel(String str, String str2, MoneybotMessageViewModel.ThumbState thumbState) {
            str.getClass();
            this.messageId = str;
            this.copyText = str2;
            this.thumbState = thumbState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuickActionsBarViewModel)) {
                return false;
            }
            QuickActionsBarViewModel quickActionsBarViewModel = (QuickActionsBarViewModel) obj;
            return Intrinsics.areEqual(this.messageId, quickActionsBarViewModel.messageId) && Intrinsics.areEqual(this.copyText, quickActionsBarViewModel.copyText) && this.thumbState == quickActionsBarViewModel.thumbState;
        }

        public final int hashCode() {
            int hashCode = this.messageId.hashCode() * 31;
            String str = this.copyText;
            return this.thumbState.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("QuickActionsBarViewModel(messageId=", this.messageId, ", copyText=", this.copyText, ", thumbState=");
            m.append(this.thumbState);
            m.append(")");
            return m.toString();
        }
    }

    public abstract class ToolRequestMessageViewModel implements MessageViewModel {
    }

    public final class UserMessageViewModel implements MessageViewModel {
        public final boolean isPending;
        public final boolean showPinOption;
        public final String text;

        public UserMessageViewModel(String str, boolean z, int i) {
            boolean z2 = (i & 2) == 0;
            z = (i & 4) != 0 ? false : z;
            str.getClass();
            this.text = str;
            this.isPending = z2;
            this.showPinOption = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UserMessageViewModel)) {
                return false;
            }
            UserMessageViewModel userMessageViewModel = (UserMessageViewModel) obj;
            return Intrinsics.areEqual(this.text, userMessageViewModel.text) && this.isPending == userMessageViewModel.isPending && this.showPinOption == userMessageViewModel.showPinOption;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.showPinOption) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.text.hashCode() * 31, 31, this.isPending);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Request$Priority$EnumUnboxingLocalUtility.m1540m("UserMessageViewModel(text=", this.text, ", isPending=", ", showPinOption=", this.isPending), this.showPinOption, ")");
        }
    }

    public final class MoneybotMessageViewModel implements MessageViewModel {
        public final String id;
        public final boolean isFinal;
        public final String memoryLabel;
        public final MemoryTooltip memoryTooltip;
        public final boolean showQuickActions;
        public final boolean streamText;
        public final String text;
        public final ThumbState thumbState;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class ThumbState {
            public static final /* synthetic */ ThumbState[] $VALUES;
            public static final ThumbState NONE;
            public static final ThumbState THUMBS_DOWN;
            public static final ThumbState THUMBS_UP;

            static {
                ThumbState thumbState = new ThumbState("NONE", 0);
                NONE = thumbState;
                ThumbState thumbState2 = new ThumbState("THUMBS_UP", 1);
                THUMBS_UP = thumbState2;
                ThumbState thumbState3 = new ThumbState("THUMBS_DOWN", 2);
                THUMBS_DOWN = thumbState3;
                $VALUES = new ThumbState[]{thumbState, thumbState2, thumbState3};
            }

            public static ThumbState valueOf(String str) {
                return (ThumbState) Enum.valueOf(ThumbState.class, str);
            }

            public static ThumbState[] values() {
                return (ThumbState[]) $VALUES.clone();
            }
        }

        public MoneybotMessageViewModel(String str, String str2, boolean z, boolean z2, String str3, MemoryTooltip memoryTooltip, boolean z3, ThumbState thumbState) {
            str2.getClass();
            thumbState.getClass();
            this.id = str;
            this.text = str2;
            this.isFinal = z;
            this.showQuickActions = z2;
            this.memoryLabel = str3;
            this.memoryTooltip = memoryTooltip;
            this.streamText = z3;
            this.thumbState = thumbState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MoneybotMessageViewModel)) {
                return false;
            }
            MoneybotMessageViewModel moneybotMessageViewModel = (MoneybotMessageViewModel) obj;
            return Intrinsics.areEqual(this.id, moneybotMessageViewModel.id) && Intrinsics.areEqual(this.text, moneybotMessageViewModel.text) && this.isFinal == moneybotMessageViewModel.isFinal && this.showQuickActions == moneybotMessageViewModel.showQuickActions && Intrinsics.areEqual(this.memoryLabel, moneybotMessageViewModel.memoryLabel) && Intrinsics.areEqual(this.memoryTooltip, moneybotMessageViewModel.memoryTooltip) && this.streamText == moneybotMessageViewModel.streamText && this.thumbState == moneybotMessageViewModel.thumbState;
        }

        public final int hashCode() {
            String str = this.id;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.text), 31, this.isFinal), 31, this.showQuickActions);
            String str2 = this.memoryLabel;
            int hashCode = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
            MemoryTooltip memoryTooltip = this.memoryTooltip;
            return this.thumbState.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (memoryTooltip != null ? memoryTooltip.hashCode() : 0)) * 31, 31, this.streamText);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MoneybotMessageViewModel(id=", this.id, ", text=", this.text, ", isFinal=");
            re$$ExternalSyntheticOutline0.m(m, this.isFinal, ", showQuickActions=", this.showQuickActions, ", memoryLabel=");
            m.append(this.memoryLabel);
            m.append(", memoryTooltip=");
            m.append(this.memoryTooltip);
            m.append(", streamText=");
            m.append(this.streamText);
            m.append(", thumbState=");
            m.append(this.thumbState);
            m.append(")");
            return m.toString();
        }

        public /* synthetic */ MoneybotMessageViewModel(String str, String str2, boolean z, boolean z2, String str3, MemoryTooltip memoryTooltip, boolean z3, ThumbState thumbState, int i) {
            this(str, str2, z, z2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : memoryTooltip, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? ThumbState.NONE : thumbState);
        }
    }
}
