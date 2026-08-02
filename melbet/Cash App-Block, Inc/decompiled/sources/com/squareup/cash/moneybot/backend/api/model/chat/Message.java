package com.squareup.cash.moneybot.backend.api.model.chat;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.squareup.cash.limits.screens.LimitsScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface Message {

    public final class ImageMessage implements Message, Parcelable {
        public static final Parcelable.Creator<ImageMessage> CREATOR = new LimitsScreen.Creator(18);
        public final Long created;
        public final String data;
        public final boolean hiddenByServer;
        public final String messageId;
        public final String mimeType;
        public final boolean requiresPresignedUrl;
        public final Role role;
        public final String s3Uri;

        public ImageMessage(String str, Role role, Long l, String str2, String str3, boolean z, String str4, boolean z2) {
            role.getClass();
            str3.getClass();
            this.messageId = str;
            this.role = role;
            this.created = l;
            this.data = str2;
            this.mimeType = str3;
            this.requiresPresignedUrl = z;
            this.s3Uri = str4;
            this.hiddenByServer = z2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageMessage)) {
                return false;
            }
            ImageMessage imageMessage = (ImageMessage) obj;
            return Intrinsics.areEqual(this.messageId, imageMessage.messageId) && this.role == imageMessage.role && Intrinsics.areEqual(this.created, imageMessage.created) && Intrinsics.areEqual(this.data, imageMessage.data) && Intrinsics.areEqual(this.mimeType, imageMessage.mimeType) && this.requiresPresignedUrl == imageMessage.requiresPresignedUrl && Intrinsics.areEqual(this.s3Uri, imageMessage.s3Uri) && this.hiddenByServer == imageMessage.hiddenByServer;
        }

        @Override // com.squareup.cash.moneybot.backend.api.model.chat.Message
        public final Long getCreated() {
            return this.created;
        }

        @Override // com.squareup.cash.moneybot.backend.api.model.chat.Message
        public final boolean getHiddenByServer() {
            return this.hiddenByServer;
        }

        @Override // com.squareup.cash.moneybot.backend.api.model.chat.Message
        public final String getMessageId() {
            return this.messageId;
        }

        @Override // com.squareup.cash.moneybot.backend.api.model.chat.Message
        public final Role getRole() {
            return this.role;
        }

        public final int hashCode() {
            String str = this.messageId;
            int hashCode = (this.role.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
            Long l = this.created;
            int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
            String str2 = this.data;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.mimeType), 31, this.requiresPresignedUrl);
            String str3 = this.s3Uri;
            return Boolean.hashCode(this.hiddenByServer) + ((m + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ImageMessage(messageId=");
            sb.append(this.messageId);
            sb.append(", role=");
            sb.append(this.role);
            sb.append(", created=");
            ViewEvent$State$EnumUnboxingLocalUtility.m(this.created, ", data=", this.data, ", mimeType=", sb);
            NavAction$$ExternalSyntheticOutline0.m(sb, this.mimeType, ", requiresPresignedUrl=", this.requiresPresignedUrl, ", s3Uri=");
            return re$$ExternalSyntheticOutline0.m(sb, this.s3Uri, ", hiddenByServer=", this.hiddenByServer, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.messageId);
            parcel.writeString(this.role.name());
            Long l = this.created;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                Request$Priority$EnumUnboxingLocalUtility.m(parcel, 1, l);
            }
            parcel.writeString(this.data);
            parcel.writeString(this.mimeType);
            parcel.writeInt(this.requiresPresignedUrl ? 1 : 0);
            parcel.writeString(this.s3Uri);
            parcel.writeInt(this.hiddenByServer ? 1 : 0);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Role {
        public static final /* synthetic */ Role[] $VALUES;
        public static final Role ROLE_ASSISTANT;
        public static final Role ROLE_SYSTEM;
        public static final Role ROLE_UNSPECIFIED;
        public static final Role ROLE_USER;

        static {
            Role role = new Role("ROLE_UNSPECIFIED", 0);
            ROLE_UNSPECIFIED = role;
            Role role2 = new Role("ROLE_USER", 1);
            ROLE_USER = role2;
            Role role3 = new Role("ROLE_ASSISTANT", 2);
            ROLE_ASSISTANT = role3;
            Role role4 = new Role("ROLE_SYSTEM", 3);
            ROLE_SYSTEM = role4;
            $VALUES = new Role[]{role, role2, role3, role4};
        }

        public static Role valueOf(String str) {
            return (Role) Enum.valueOf(Role.class, str);
        }

        public static Role[] values() {
            return (Role[]) $VALUES.clone();
        }
    }

    public final class ToolRequest implements Message {
        public final ToolRequestContent content;
        public final Long created;
        public final boolean hiddenByServer;
        public final String messageId;
        public final String requestId;
        public final Role role;
        public final String tooltip;
        public final TooltipCategory tooltipCategory;

        public interface ToolRequestContent {

            public final class Error implements ToolRequestContent {
                public final String error;

                public Error(String str) {
                    str.getClass();
                    this.error = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Error) && Intrinsics.areEqual(this.error, ((Error) obj).error);
                }

                public final int hashCode() {
                    return this.error.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error(error=", this.error, ")");
                }
            }

            public final class ToolCall implements ToolRequestContent {
                public final String arguments;
                public final String name;
                public final boolean needsApproval;

                public ToolCall(String str, String str2, boolean z) {
                    str.getClass();
                    this.name = str;
                    this.arguments = str2;
                    this.needsApproval = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ToolCall)) {
                        return false;
                    }
                    ToolCall toolCall = (ToolCall) obj;
                    return Intrinsics.areEqual(this.name, toolCall.name) && Intrinsics.areEqual(this.arguments, toolCall.arguments) && this.needsApproval == toolCall.needsApproval;
                }

                public final int hashCode() {
                    int hashCode = this.name.hashCode() * 31;
                    String str = this.arguments;
                    return Boolean.hashCode(this.needsApproval) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ToolCall(name=", this.name, ", arguments=", this.arguments, ", needsApproval="), this.needsApproval, ")");
                }
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class TooltipCategory {
            public static final /* synthetic */ TooltipCategory[] $VALUES;
            public static final TooltipCategory Activity;
            public static final TooltipCategory Balance;
            public static final TooltipCategory Bitcoin;
            public static final TooltipCategory Default;
            public static final TooltipCategory Graph;
            public static final TooltipCategory P2P;
            public static final TooltipCategory Plasma;
            public static final TooltipCategory Savings;
            public static final TooltipCategory Stock;
            public static final TooltipCategory Support;
            public static final TooltipCategory Taxes;
            public static final TooltipCategory UserProfile;
            public static final TooltipCategory Utils;

            static {
                TooltipCategory tooltipCategory = new TooltipCategory("UserProfile", 0);
                UserProfile = tooltipCategory;
                TooltipCategory tooltipCategory2 = new TooltipCategory("Graph", 1);
                Graph = tooltipCategory2;
                TooltipCategory tooltipCategory3 = new TooltipCategory("P2P", 2);
                P2P = tooltipCategory3;
                TooltipCategory tooltipCategory4 = new TooltipCategory("Activity", 3);
                Activity = tooltipCategory4;
                TooltipCategory tooltipCategory5 = new TooltipCategory("Balance", 4);
                Balance = tooltipCategory5;
                TooltipCategory tooltipCategory6 = new TooltipCategory("Utils", 5);
                Utils = tooltipCategory6;
                TooltipCategory tooltipCategory7 = new TooltipCategory("Savings", 6);
                Savings = tooltipCategory7;
                TooltipCategory tooltipCategory8 = new TooltipCategory("Plasma", 7);
                Plasma = tooltipCategory8;
                TooltipCategory tooltipCategory9 = new TooltipCategory("Stock", 8);
                Stock = tooltipCategory9;
                TooltipCategory tooltipCategory10 = new TooltipCategory("Support", 9);
                Support = tooltipCategory10;
                TooltipCategory tooltipCategory11 = new TooltipCategory("Bitcoin", 10);
                Bitcoin = tooltipCategory11;
                TooltipCategory tooltipCategory12 = new TooltipCategory("Taxes", 11);
                Taxes = tooltipCategory12;
                TooltipCategory tooltipCategory13 = new TooltipCategory("Default", 12);
                Default = tooltipCategory13;
                $VALUES = new TooltipCategory[]{tooltipCategory, tooltipCategory2, tooltipCategory3, tooltipCategory4, tooltipCategory5, tooltipCategory6, tooltipCategory7, tooltipCategory8, tooltipCategory9, tooltipCategory10, tooltipCategory11, tooltipCategory12, tooltipCategory13};
            }

            public static TooltipCategory valueOf(String str) {
                return (TooltipCategory) Enum.valueOf(TooltipCategory.class, str);
            }

            public static TooltipCategory[] values() {
                return (TooltipCategory[]) $VALUES.clone();
            }
        }

        public ToolRequest(String str, Role role, Long l, String str2, String str3, TooltipCategory tooltipCategory, ToolRequestContent toolRequestContent, boolean z) {
            this.messageId = str;
            this.role = role;
            this.created = l;
            this.requestId = str2;
            this.tooltip = str3;
            this.tooltipCategory = tooltipCategory;
            this.content = toolRequestContent;
            this.hiddenByServer = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ToolRequest)) {
                return false;
            }
            ToolRequest toolRequest = (ToolRequest) obj;
            return Intrinsics.areEqual(this.messageId, toolRequest.messageId) && this.role == toolRequest.role && Intrinsics.areEqual(this.created, toolRequest.created) && this.requestId.equals(toolRequest.requestId) && Intrinsics.areEqual(this.tooltip, toolRequest.tooltip) && this.tooltipCategory == toolRequest.tooltipCategory && this.content.equals(toolRequest.content) && this.hiddenByServer == toolRequest.hiddenByServer;
        }

        @Override // com.squareup.cash.moneybot.backend.api.model.chat.Message
        public final Long getCreated() {
            return this.created;
        }

        @Override // com.squareup.cash.moneybot.backend.api.model.chat.Message
        public final boolean getHiddenByServer() {
            return this.hiddenByServer;
        }

        @Override // com.squareup.cash.moneybot.backend.api.model.chat.Message
        public final String getMessageId() {
            return this.messageId;
        }

        @Override // com.squareup.cash.moneybot.backend.api.model.chat.Message
        public final Role getRole() {
            return this.role;
        }

        public final int hashCode() {
            String str = this.messageId;
            int hashCode = (this.role.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
            Long l = this.created;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.requestId);
            String str2 = this.tooltip;
            int hashCode2 = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
            TooltipCategory tooltipCategory = this.tooltipCategory;
            return Boolean.hashCode(this.hiddenByServer) + ((this.content.hashCode() + ((hashCode2 + (tooltipCategory != null ? tooltipCategory.hashCode() : 0)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ToolRequest(messageId=");
            sb.append(this.messageId);
            sb.append(", role=");
            sb.append(this.role);
            sb.append(", created=");
            ViewEvent$State$EnumUnboxingLocalUtility.m(this.created, ", requestId=", this.requestId, ", tooltip=", sb);
            sb.append(this.tooltip);
            sb.append(", tooltipCategory=");
            sb.append(this.tooltipCategory);
            sb.append(", content=");
            sb.append(this.content);
            sb.append(", hiddenByServer=");
            sb.append(this.hiddenByServer);
            sb.append(")");
            return sb.toString();
        }
    }

    public final class ToolResponse implements Message {
        public final Long created;
        public final String error;
        public final boolean hiddenByServer;
        public final String messageId;
        public final String requestId;
        public final List results;
        public final Role role;
        public final ToolStatus status;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class ToolStatus {
            public static final /* synthetic */ ToolStatus[] $VALUES;
            public static final ToolStatus TOOL_STATUS_ERROR;
            public static final ToolStatus TOOL_STATUS_SUCCESS;
            public static final ToolStatus TOOL_STATUS_UNSPECIFIED;

            static {
                ToolStatus toolStatus = new ToolStatus("TOOL_STATUS_UNSPECIFIED", 0);
                TOOL_STATUS_UNSPECIFIED = toolStatus;
                ToolStatus toolStatus2 = new ToolStatus("TOOL_STATUS_SUCCESS", 1);
                TOOL_STATUS_SUCCESS = toolStatus2;
                ToolStatus toolStatus3 = new ToolStatus("TOOL_STATUS_ERROR", 2);
                TOOL_STATUS_ERROR = toolStatus3;
                $VALUES = new ToolStatus[]{toolStatus, toolStatus2, toolStatus3};
            }

            public static ToolStatus valueOf(String str) {
                return (ToolStatus) Enum.valueOf(ToolStatus.class, str);
            }

            public static ToolStatus[] values() {
                return (ToolStatus[]) $VALUES.clone();
            }
        }

        public interface UserContent {

            public final class Text implements UserContent {
                public final String text;

                public Text(String str) {
                    this.text = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Text) && this.text.equals(((Text) obj).text);
                }

                public final int hashCode() {
                    return this.text.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Text(text=", this.text, ")");
                }
            }
        }

        public ToolResponse(String str, Role role, Long l, String str2, List list, ToolStatus toolStatus, String str3, boolean z) {
            this.messageId = str;
            this.role = role;
            this.created = l;
            this.requestId = str2;
            this.results = list;
            this.status = toolStatus;
            this.error = str3;
            this.hiddenByServer = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ToolResponse)) {
                return false;
            }
            ToolResponse toolResponse = (ToolResponse) obj;
            return Intrinsics.areEqual(this.messageId, toolResponse.messageId) && this.role == toolResponse.role && Intrinsics.areEqual(this.created, toolResponse.created) && this.requestId.equals(toolResponse.requestId) && this.results.equals(toolResponse.results) && this.status == toolResponse.status && Intrinsics.areEqual(this.error, toolResponse.error) && this.hiddenByServer == toolResponse.hiddenByServer;
        }

        @Override // com.squareup.cash.moneybot.backend.api.model.chat.Message
        public final Long getCreated() {
            return this.created;
        }

        @Override // com.squareup.cash.moneybot.backend.api.model.chat.Message
        public final boolean getHiddenByServer() {
            return this.hiddenByServer;
        }

        @Override // com.squareup.cash.moneybot.backend.api.model.chat.Message
        public final String getMessageId() {
            return this.messageId;
        }

        @Override // com.squareup.cash.moneybot.backend.api.model.chat.Message
        public final Role getRole() {
            return this.role;
        }

        public final int hashCode() {
            String str = this.messageId;
            int hashCode = (this.role.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
            Long l = this.created;
            int hashCode2 = (this.status.hashCode() + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.requestId), 31, this.results)) * 31;
            String str2 = this.error;
            return Boolean.hashCode(this.hiddenByServer) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ToolResponse(messageId=");
            sb.append(this.messageId);
            sb.append(", role=");
            sb.append(this.role);
            sb.append(", created=");
            ViewEvent$State$EnumUnboxingLocalUtility.m(this.created, ", requestId=", this.requestId, ", results=", sb);
            sb.append(this.results);
            sb.append(", status=");
            sb.append(this.status);
            sb.append(", error=");
            return re$$ExternalSyntheticOutline0.m(sb, this.error, ", hiddenByServer=", this.hiddenByServer, ")");
        }
    }

    Long getCreated();

    boolean getHiddenByServer();

    String getMessageId();

    Role getRole();

    public final class TextMessage implements Message, Parcelable {
        public static final Parcelable.Creator<TextMessage> CREATOR = new LimitsScreen.Creator(19);
        public final Long created;
        public final boolean hiddenByServer;
        public final boolean isFinal;
        public final String messageId;
        public final Role role;
        public final String text;

        public TextMessage(String str, Role role, Long l, String str2, boolean z, boolean z2) {
            role.getClass();
            str2.getClass();
            this.messageId = str;
            this.role = role;
            this.created = l;
            this.text = str2;
            this.isFinal = z;
            this.hiddenByServer = z2;
        }

        public static TextMessage copy$default(TextMessage textMessage, String str, boolean z) {
            String str2 = textMessage.messageId;
            Role role = textMessage.role;
            Long l = textMessage.created;
            boolean z2 = textMessage.hiddenByServer;
            role.getClass();
            return new TextMessage(str2, role, l, str, z, z2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextMessage)) {
                return false;
            }
            TextMessage textMessage = (TextMessage) obj;
            return Intrinsics.areEqual(this.messageId, textMessage.messageId) && this.role == textMessage.role && Intrinsics.areEqual(this.created, textMessage.created) && Intrinsics.areEqual(this.text, textMessage.text) && this.isFinal == textMessage.isFinal && this.hiddenByServer == textMessage.hiddenByServer;
        }

        @Override // com.squareup.cash.moneybot.backend.api.model.chat.Message
        public final Long getCreated() {
            return this.created;
        }

        @Override // com.squareup.cash.moneybot.backend.api.model.chat.Message
        public final boolean getHiddenByServer() {
            return this.hiddenByServer;
        }

        @Override // com.squareup.cash.moneybot.backend.api.model.chat.Message
        public final String getMessageId() {
            return this.messageId;
        }

        @Override // com.squareup.cash.moneybot.backend.api.model.chat.Message
        public final Role getRole() {
            return this.role;
        }

        public final int hashCode() {
            String str = this.messageId;
            int hashCode = (this.role.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
            Long l = this.created;
            return Boolean.hashCode(this.hiddenByServer) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (l != null ? l.hashCode() : 0)) * 31, 31, this.text), 31, this.isFinal);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TextMessage(messageId=");
            sb.append(this.messageId);
            sb.append(", role=");
            sb.append(this.role);
            sb.append(", created=");
            ViewEvent$State$EnumUnboxingLocalUtility.m(this.created, ", text=", this.text, ", isFinal=", sb);
            return Request$Priority$EnumUnboxingLocalUtility.m(sb, this.isFinal, ", hiddenByServer=", this.hiddenByServer, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.messageId);
            parcel.writeString(this.role.name());
            Long l = this.created;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                Request$Priority$EnumUnboxingLocalUtility.m(parcel, 1, l);
            }
            parcel.writeString(this.text);
            parcel.writeInt(this.isFinal ? 1 : 0);
            parcel.writeInt(this.hiddenByServer ? 1 : 0);
        }

        public /* synthetic */ TextMessage(String str, Role role, Long l, String str2, boolean z, boolean z2, int i) {
            this(str, role, l, str2, (i & 16) != 0 ? true : z, (i & 32) != 0 ? false : z2);
        }
    }
}
