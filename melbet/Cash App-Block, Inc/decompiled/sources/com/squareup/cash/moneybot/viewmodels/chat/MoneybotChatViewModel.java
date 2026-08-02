package com.squareup.cash.moneybot.viewmodels.chat;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewEvent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface MoneybotChatViewModel {

    public interface Content extends MoneybotChatViewModel {

        public final class Chat implements Content {
            public final ChatFooterViewModel footer;
            public final InitialScrollPosition initialScrollPosition;
            public final List messages;
            public final ProcessingIndicator processingIndicator;
            public final boolean requestKeyboardFocus;
            public final String sessionId;
            public final boolean showDebugMenu;
            public final boolean showImageAttachmentButton;
            public final boolean showOverflowMenu;
            public final boolean showRawMarkdown;

            public final class InitialScrollPosition {
                public static final InitialScrollPosition DEFAULT = new InitialScrollPosition(0, 0);
                public final int index;
                public final int offset;

                public InitialScrollPosition(int i, int i2) {
                    this.index = i;
                    this.offset = i2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof InitialScrollPosition)) {
                        return false;
                    }
                    InitialScrollPosition initialScrollPosition = (InitialScrollPosition) obj;
                    return this.index == initialScrollPosition.index && this.offset == initialScrollPosition.offset;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.offset) + (Integer.hashCode(this.index) * 31);
                }

                public final String toString() {
                    return Recorder$$ExternalSyntheticOutline2.m(this.index, this.offset, "InitialScrollPosition(index=", ", offset=", ")");
                }
            }

            public Chat(String str, ChatFooterViewModel chatFooterViewModel, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List list, ProcessingIndicator processingIndicator, InitialScrollPosition initialScrollPosition) {
                this.sessionId = str;
                this.footer = chatFooterViewModel;
                this.showDebugMenu = z;
                this.showOverflowMenu = z2;
                this.showRawMarkdown = z3;
                this.showImageAttachmentButton = z4;
                this.requestKeyboardFocus = z5;
                this.messages = list;
                this.processingIndicator = processingIndicator;
                this.initialScrollPosition = initialScrollPosition;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Chat)) {
                    return false;
                }
                Chat chat = (Chat) obj;
                return Intrinsics.areEqual(this.sessionId, chat.sessionId) && this.footer.equals(chat.footer) && this.showDebugMenu == chat.showDebugMenu && this.showOverflowMenu == chat.showOverflowMenu && this.showRawMarkdown == chat.showRawMarkdown && this.showImageAttachmentButton == chat.showImageAttachmentButton && this.requestKeyboardFocus == chat.requestKeyboardFocus && this.messages.equals(chat.messages) && Intrinsics.areEqual(this.processingIndicator, chat.processingIndicator) && this.initialScrollPosition.equals(chat.initialScrollPosition);
            }

            @Override // com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewModel
            public final boolean getShowDebugMenu() {
                return this.showDebugMenu;
            }

            @Override // com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewModel
            public final boolean getShowOverflowMenu() {
                return this.showOverflowMenu;
            }

            public final int hashCode() {
                String str = this.sessionId;
                int m = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.footer.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.showDebugMenu), 31, this.showOverflowMenu), 31, this.showRawMarkdown), 31, this.showImageAttachmentButton), 31, this.requestKeyboardFocus), 31, this.messages);
                ProcessingIndicator processingIndicator = this.processingIndicator;
                return this.initialScrollPosition.hashCode() + ((m + (processingIndicator != null ? processingIndicator.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Chat(sessionId=");
                sb.append(this.sessionId);
                sb.append(", footer=");
                sb.append(this.footer);
                sb.append(", showDebugMenu=");
                re$$ExternalSyntheticOutline0.m(sb, this.showDebugMenu, ", showOverflowMenu=", this.showOverflowMenu, ", showRawMarkdown=");
                re$$ExternalSyntheticOutline0.m(sb, this.showRawMarkdown, ", showImageAttachmentButton=", this.showImageAttachmentButton, ", requestKeyboardFocus=");
                sb.append(this.requestKeyboardFocus);
                sb.append(", messages=");
                sb.append(this.messages);
                sb.append(", processingIndicator=");
                sb.append(this.processingIndicator);
                sb.append(", initialScrollPosition=");
                sb.append(this.initialScrollPosition);
                sb.append(")");
                return sb.toString();
            }
        }

        public final class Empty implements Content {
            public final ChatFooterViewModel footer;
            public final List inChatPrompts;
            public final boolean requestKeyboardFocus;
            public final boolean showDebugMenu;
            public final boolean showImageAttachmentButton;
            public final boolean showOverflowMenu;
            public final boolean showRawMarkdown;

            public Empty(ChatFooterViewModel chatFooterViewModel, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List list) {
                this.footer = chatFooterViewModel;
                this.showDebugMenu = z;
                this.showOverflowMenu = z2;
                this.showRawMarkdown = z3;
                this.showImageAttachmentButton = z4;
                this.requestKeyboardFocus = z5;
                this.inChatPrompts = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Empty)) {
                    return false;
                }
                Empty empty = (Empty) obj;
                return this.footer.equals(empty.footer) && this.showDebugMenu == empty.showDebugMenu && this.showOverflowMenu == empty.showOverflowMenu && this.showRawMarkdown == empty.showRawMarkdown && this.showImageAttachmentButton == empty.showImageAttachmentButton && this.requestKeyboardFocus == empty.requestKeyboardFocus && this.inChatPrompts.equals(empty.inChatPrompts);
            }

            @Override // com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewModel
            public final boolean getShowDebugMenu() {
                return this.showDebugMenu;
            }

            @Override // com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewModel
            public final boolean getShowOverflowMenu() {
                return this.showOverflowMenu;
            }

            public final int hashCode() {
                return this.inChatPrompts.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.footer.hashCode() * 31, 31, this.showDebugMenu), 31, this.showOverflowMenu), 31, this.showRawMarkdown), 31, this.showImageAttachmentButton), 31, this.requestKeyboardFocus);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Empty(footer=");
                sb.append(this.footer);
                sb.append(", showDebugMenu=");
                sb.append(this.showDebugMenu);
                sb.append(", showOverflowMenu=");
                re$$ExternalSyntheticOutline0.m(sb, this.showOverflowMenu, ", showRawMarkdown=", this.showRawMarkdown, ", showImageAttachmentButton=");
                re$$ExternalSyntheticOutline0.m(sb, this.showImageAttachmentButton, ", requestKeyboardFocus=", this.requestKeyboardFocus, ", inChatPrompts=");
                return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.inChatPrompts, ")");
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class ToastMessage {
            public static final /* synthetic */ ToastMessage[] $VALUES;
            public static final ToastMessage CancellationFailed;
            public static final ToastMessage FeedbackSubmitted;
            public static final ToastMessage NetworkError;
            public static final ToastMessage PinFailed;
            public static final ToastMessage PinSucceeded;
            public static final ToastMessage RefreshFailed;
            public static final ToastMessage SendFailed;

            static {
                ToastMessage toastMessage = new ToastMessage("CancellationFailed", 0);
                CancellationFailed = toastMessage;
                ToastMessage toastMessage2 = new ToastMessage("SendFailed", 1);
                SendFailed = toastMessage2;
                ToastMessage toastMessage3 = new ToastMessage("NetworkError", 2);
                NetworkError = toastMessage3;
                ToastMessage toastMessage4 = new ToastMessage("FeedbackSubmitted", 3);
                FeedbackSubmitted = toastMessage4;
                ToastMessage toastMessage5 = new ToastMessage("RefreshFailed", 4);
                RefreshFailed = toastMessage5;
                ToastMessage toastMessage6 = new ToastMessage("PinSucceeded", 5);
                PinSucceeded = toastMessage6;
                ToastMessage toastMessage7 = new ToastMessage("PinFailed", 6);
                PinFailed = toastMessage7;
                $VALUES = new ToastMessage[]{toastMessage, toastMessage2, toastMessage3, toastMessage4, toastMessage5, toastMessage6, toastMessage7};
            }

            public static ToastMessage valueOf(String str) {
                return (ToastMessage) Enum.valueOf(ToastMessage.class, str);
            }

            public static ToastMessage[] values() {
                return (ToastMessage[]) $VALUES.clone();
            }
        }
    }

    public final class Error implements MoneybotChatViewModel {
        public final MoneybotChatViewEvent retryEvent;
        public final String sessionId;
        public final boolean showDebugMenu;
        public final boolean showOverflowMenu;

        public Error(String str, boolean z, boolean z2, MoneybotChatViewEvent.RetryLoad retryLoad) {
            this.sessionId = str;
            this.showDebugMenu = z;
            this.showOverflowMenu = z2;
            this.retryEvent = retryLoad;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.areEqual(this.sessionId, error.sessionId) && this.showDebugMenu == error.showDebugMenu && this.showOverflowMenu == error.showOverflowMenu && Intrinsics.areEqual(this.retryEvent, error.retryEvent);
        }

        @Override // com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewModel
        public final boolean getShowDebugMenu() {
            return this.showDebugMenu;
        }

        @Override // com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewModel
        public final boolean getShowOverflowMenu() {
            return this.showOverflowMenu;
        }

        public final int hashCode() {
            String str = this.sessionId;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.showDebugMenu), 31, this.showOverflowMenu);
            MoneybotChatViewEvent moneybotChatViewEvent = this.retryEvent;
            return m + (moneybotChatViewEvent != null ? moneybotChatViewEvent.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("Error(sessionId=", this.sessionId, ", showDebugMenu=", ", showOverflowMenu=", this.showDebugMenu);
            m1540m.append(this.showOverflowMenu);
            m1540m.append(", retryEvent=");
            m1540m.append(this.retryEvent);
            m1540m.append(")");
            return m1540m.toString();
        }
    }

    boolean getShowDebugMenu();

    boolean getShowOverflowMenu();
}
