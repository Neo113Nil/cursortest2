package com.squareup.cash.moneybot.viewmodels.chat;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface MoneybotChatViewEvent {

    public final class AttachData implements MoneybotChatViewEvent {
        public final List attachments;

        public final class Attachment {
            public final String fileUri;
            public final String mimeType;

            public Attachment(String str, String str2) {
                str.getClass();
                this.fileUri = str;
                this.mimeType = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Attachment)) {
                    return false;
                }
                Attachment attachment = (Attachment) obj;
                return Intrinsics.areEqual(this.fileUri, attachment.fileUri) && this.mimeType.equals(attachment.mimeType);
            }

            public final int hashCode() {
                return this.mimeType.hashCode() + (this.fileUri.hashCode() * 31);
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("Attachment(fileUri=", this.fileUri, ", mimeType=", this.mimeType, ")");
            }
        }

        public AttachData(List list) {
            list.getClass();
            this.attachments = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AttachData) && Intrinsics.areEqual(this.attachments, ((AttachData) obj).attachments);
        }

        public final int hashCode() {
            return this.attachments.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("AttachData(attachments=", ")", this.attachments);
        }
    }

    public final class CameraCapturePathConsumed implements MoneybotChatViewEvent {
        public static final CameraCapturePathConsumed INSTANCE = new CameraCapturePathConsumed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CameraCapturePathConsumed);
        }

        public final int hashCode() {
            return -1813922070;
        }

        public final String toString() {
            return "CameraCapturePathConsumed";
        }
    }

    public final class CancelMessage implements MoneybotChatViewEvent {
        public static final CancelMessage INSTANCE = new CancelMessage();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CancelMessage);
        }

        public final int hashCode() {
            return 1213344489;
        }

        public final String toString() {
            return "CancelMessage";
        }
    }

    public final class ComposerTextChanged implements MoneybotChatViewEvent {
        public final String text;

        public ComposerTextChanged(String str) {
            str.getClass();
            this.text = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ComposerTextChanged) && Intrinsics.areEqual(this.text, ((ComposerTextChanged) obj).text);
        }

        public final int hashCode() {
            return this.text.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ComposerTextChanged(text=", this.text, ")");
        }
    }

    public final class DisclosureUrlClick implements MoneybotChatViewEvent {
        public final String url;

        public DisclosureUrlClick(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisclosureUrlClick) && Intrinsics.areEqual(this.url, ((DisclosureUrlClick) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DisclosureUrlClick(url=", this.url, ")");
        }
    }

    public final class Exit implements MoneybotChatViewEvent {
        public static final Exit INSTANCE = new Exit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Exit);
        }

        public final int hashCode() {
            return -1275996446;
        }

        public final String toString() {
            return "Exit";
        }
    }

    public final class HandleChatCardEvent implements MoneybotChatViewEvent {
        public final ChatCardViewEvent event;

        public HandleChatCardEvent(ChatCardViewEvent chatCardViewEvent) {
            chatCardViewEvent.getClass();
            this.event = chatCardViewEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleChatCardEvent) && Intrinsics.areEqual(this.event, ((HandleChatCardEvent) obj).event);
        }

        public final int hashCode() {
            return this.event.hashCode();
        }

        public final String toString() {
            return "HandleChatCardEvent(event=" + this.event + ")";
        }
    }

    public final class KeyboardOpened implements MoneybotChatViewEvent {
        public static final KeyboardOpened INSTANCE = new KeyboardOpened();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof KeyboardOpened);
        }

        public final int hashCode() {
            return 128391156;
        }

        public final String toString() {
            return "KeyboardOpened";
        }
    }

    public final class MemoryTooltipDismissed implements MoneybotChatViewEvent {
        public final String messageToken;

        public MemoryTooltipDismissed(String str) {
            str.getClass();
            this.messageToken = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MemoryTooltipDismissed) && Intrinsics.areEqual(this.messageToken, ((MemoryTooltipDismissed) obj).messageToken);
        }

        public final int hashCode() {
            return this.messageToken.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MemoryTooltipDismissed(messageToken=", this.messageToken, ")");
        }
    }

    public final class MessageLinkTap implements MoneybotChatViewEvent {
        public final String uri;

        public MessageLinkTap(String str) {
            str.getClass();
            this.uri = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MessageLinkTap) && Intrinsics.areEqual(this.uri, ((MessageLinkTap) obj).uri);
        }

        public final int hashCode() {
            return this.uri.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MessageLinkTap(uri=", this.uri, ")");
        }
    }

    public final class MessageSendAnimationFinished implements MoneybotChatViewEvent {
        public static final MessageSendAnimationFinished INSTANCE = new MessageSendAnimationFinished();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MessageSendAnimationFinished);
        }

        public final int hashCode() {
            return -86546069;
        }

        public final String toString() {
            return "MessageSendAnimationFinished";
        }
    }

    public final class MessageTextStreamingFinished implements MoneybotChatViewEvent {
        public final String text;

        public MessageTextStreamingFinished(String str) {
            str.getClass();
            this.text = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MessageTextStreamingFinished) && Intrinsics.areEqual(this.text, ((MessageTextStreamingFinished) obj).text);
        }

        public final int hashCode() {
            return this.text.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MessageTextStreamingFinished(text=", this.text, ")");
        }
    }

    public final class OpenAboutMoneybot implements MoneybotChatViewEvent {
        public static final OpenAboutMoneybot INSTANCE = new OpenAboutMoneybot();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenAboutMoneybot);
        }

        public final int hashCode() {
            return 75940422;
        }

        public final String toString() {
            return "OpenAboutMoneybot";
        }
    }

    /* loaded from: classes7.dex */
    public final class OpenChatHistory implements MoneybotChatViewEvent {
        public static final OpenChatHistory INSTANCE = new OpenChatHistory();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenChatHistory);
        }

        public final int hashCode() {
            return 34465070;
        }

        public final String toString() {
            return "OpenChatHistory";
        }
    }

    public final class OpenDebugOverlay implements MoneybotChatViewEvent {
        public static final OpenDebugOverlay INSTANCE = new OpenDebugOverlay();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenDebugOverlay);
        }

        public final int hashCode() {
            return 1248789931;
        }

        public final String toString() {
            return "OpenDebugOverlay";
        }
    }

    public final class OpenOverflowMenu implements MoneybotChatViewEvent {
        public static final OpenOverflowMenu INSTANCE = new OpenOverflowMenu();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenOverflowMenu);
        }

        public final int hashCode() {
            return 763256751;
        }

        public final String toString() {
            return "OpenOverflowMenu";
        }
    }

    public final class PinMessage implements MoneybotChatViewEvent {
        public final String prompt;

        public PinMessage(String str) {
            str.getClass();
            this.prompt = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PinMessage) && Intrinsics.areEqual(this.prompt, ((PinMessage) obj).prompt);
        }

        public final int hashCode() {
            return this.prompt.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PinMessage(prompt=", this.prompt, ")");
        }
    }

    public final class QuickActionTap implements MoneybotChatViewEvent {
        public final String messageId;

        /* renamed from: type, reason: collision with root package name */
        public final QuickActionType f1173type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class QuickActionType {
            public static final /* synthetic */ QuickActionType[] $VALUES;
            public static final QuickActionType COPY;
            public static final QuickActionType THUMBS_DOWN;
            public static final QuickActionType THUMBS_UP;

            static {
                QuickActionType quickActionType = new QuickActionType("COPY", 0);
                COPY = quickActionType;
                QuickActionType quickActionType2 = new QuickActionType("THUMBS_UP", 1);
                THUMBS_UP = quickActionType2;
                QuickActionType quickActionType3 = new QuickActionType("THUMBS_DOWN", 2);
                THUMBS_DOWN = quickActionType3;
                $VALUES = new QuickActionType[]{quickActionType, quickActionType2, quickActionType3};
            }

            public static QuickActionType valueOf(String str) {
                return (QuickActionType) Enum.valueOf(QuickActionType.class, str);
            }

            public static QuickActionType[] values() {
                return (QuickActionType[]) $VALUES.clone();
            }
        }

        public QuickActionTap(String str, QuickActionType quickActionType) {
            this.messageId = str;
            this.f1173type = quickActionType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuickActionTap)) {
                return false;
            }
            QuickActionTap quickActionTap = (QuickActionTap) obj;
            return Intrinsics.areEqual(this.messageId, quickActionTap.messageId) && this.f1173type == quickActionTap.f1173type;
        }

        public final int hashCode() {
            String str = this.messageId;
            return this.f1173type.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return "QuickActionTap(messageId=" + this.messageId + ", type=" + this.f1173type + ")";
        }
    }

    public final class RemoveAttachment implements MoneybotChatViewEvent {
        public final int index;

        public RemoveAttachment(int i) {
            this.index = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoveAttachment) && this.index == ((RemoveAttachment) obj).index;
        }

        public final int hashCode() {
            return Integer.hashCode(this.index);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.index, "RemoveAttachment(index=", ")");
        }
    }

    public final class RequestCameraCapture implements MoneybotChatViewEvent {
        public static final RequestCameraCapture INSTANCE = new RequestCameraCapture();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RequestCameraCapture);
        }

        public final int hashCode() {
            return -1798575146;
        }

        public final String toString() {
            return "RequestCameraCapture";
        }
    }

    public final class RetryLoad implements MoneybotChatViewEvent {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class RetryType {
            public static final /* synthetic */ RetryType[] $VALUES;
            public static final RetryType Chat;

            static {
                RetryType retryType = new RetryType("Chat", 0);
                Chat = retryType;
                $VALUES = new RetryType[]{retryType};
            }

            public static RetryType valueOf(String str) {
                return (RetryType) Enum.valueOf(RetryType.class, str);
            }

            public static RetryType[] values() {
                return (RetryType[]) $VALUES.clone();
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RetryLoad)) {
                return false;
            }
            RetryType retryType = RetryType.Chat;
            return true;
        }

        public final int hashCode() {
            return RetryType.Chat.hashCode();
        }

        public final String toString() {
            return "RetryLoad(retryType=" + RetryType.Chat + ")";
        }
    }

    public final class SaveScrollPosition implements MoneybotChatViewEvent {
        public final int firstVisibleItemIndex;
        public final int firstVisibleItemScrollOffset;

        public SaveScrollPosition(int i, int i2) {
            this.firstVisibleItemIndex = i;
            this.firstVisibleItemScrollOffset = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SaveScrollPosition)) {
                return false;
            }
            SaveScrollPosition saveScrollPosition = (SaveScrollPosition) obj;
            return this.firstVisibleItemIndex == saveScrollPosition.firstVisibleItemIndex && this.firstVisibleItemScrollOffset == saveScrollPosition.firstVisibleItemScrollOffset;
        }

        public final int hashCode() {
            return Integer.hashCode(this.firstVisibleItemScrollOffset) + (Integer.hashCode(this.firstVisibleItemIndex) * 31);
        }

        public final String toString() {
            return Recorder$$ExternalSyntheticOutline2.m(this.firstVisibleItemIndex, this.firstVisibleItemScrollOffset, "SaveScrollPosition(firstVisibleItemIndex=", ", firstVisibleItemScrollOffset=", ")");
        }
    }

    public final class SlashCommandSelected implements MoneybotChatViewEvent {
        public final String command;

        public SlashCommandSelected(String str) {
            this.command = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SlashCommandSelected) && this.command.equals(((SlashCommandSelected) obj).command);
        }

        public final int hashCode() {
            return this.command.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SlashCommandSelected(command=", this.command, ")");
        }
    }

    public final class StartNewChat implements MoneybotChatViewEvent {
        public static final StartNewChat INSTANCE = new StartNewChat();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof StartNewChat);
        }

        public final int hashCode() {
            return 2091547674;
        }

        public final String toString() {
            return "StartNewChat";
        }
    }

    public final class SubmitMessagePrompt implements MoneybotChatViewEvent {
        public final String category;
        public final String prompt;
        public final String promptId;

        public SubmitMessagePrompt(String str, String str2, String str3) {
            str.getClass();
            this.prompt = str;
            this.promptId = str2;
            this.category = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubmitMessagePrompt)) {
                return false;
            }
            SubmitMessagePrompt submitMessagePrompt = (SubmitMessagePrompt) obj;
            return Intrinsics.areEqual(this.prompt, submitMessagePrompt.prompt) && Intrinsics.areEqual(this.promptId, submitMessagePrompt.promptId) && Intrinsics.areEqual(this.category, submitMessagePrompt.category);
        }

        public final int hashCode() {
            int hashCode = this.prompt.hashCode() * 31;
            String str = this.promptId;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.category;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SubmitMessagePrompt(prompt=", this.prompt, ", promptId=", this.promptId, ", category="), this.category, ")");
        }
    }

    public final class ThinkingAnimationPaused implements MoneybotChatViewEvent {
        public static final ThinkingAnimationPaused INSTANCE = new ThinkingAnimationPaused();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ThinkingAnimationPaused);
        }

        public final int hashCode() {
            return -1107108418;
        }

        public final String toString() {
            return "ThinkingAnimationPaused";
        }
    }
}
