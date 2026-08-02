package com.squareup.cash.moneybot.backend.api.mappers;

import androidx.compose.ui.draw.RotateKt;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.cash.clientroutes.PatternRedaction;
import com.squareup.cash.moneybot.backend.api.MoneybotProtoParsingError;
import com.squareup.cash.moneybot.backend.api.model.chat.Message;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.protovalidation.ProtoParsingError;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.protos.cash.kgoose.api.v3.ClientRenderable;
import com.squareup.protos.cash.kgoose.api.v3.ImageContent;
import com.squareup.protos.cash.kgoose.api.v3.MessageContent;
import com.squareup.protos.cash.kgoose.api.v3.MessageType;
import com.squareup.protos.cash.kgoose.api.v3.Role;
import com.squareup.protos.cash.kgoose.api.v3.TextContent;
import com.squareup.protos.cash.kgoose.api.v3.ToolCall;
import com.squareup.protos.cash.kgoose.api.v3.ToolRequest;
import com.squareup.protos.cash.kgoose.api.v3.ToolResponse;
import com.squareup.protos.cash.kgoose.api.v3.UserContent;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public abstract class MessageMappersKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MessageType.values().length];
            try {
                iArr[MessageType.MESSAGE_TYPE_TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageType.MESSAGE_TYPE_IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageType.MESSAGE_TYPE_TOOL_REQUEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageType.MESSAGE_TYPE_TOOL_RESPONSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Role.values().length];
            try {
                iArr2[Role.ROLE_USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Role.ROLE_ASSISTANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Role.ROLE_SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Role.ROLE_UNSPECIFIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Message.Role.values().length];
            try {
                iArr3[1] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                Message.Role role = Message.Role.ROLE_UNSPECIFIED;
                iArr3[2] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                Message.Role role2 = Message.Role.ROLE_UNSPECIFIED;
                iArr3[3] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                Message.Role role3 = Message.Role.ROLE_UNSPECIFIED;
                iArr3[0] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr4 = new int[Message.ToolResponse.ToolStatus.values().length];
            try {
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                Message.ToolResponse.ToolStatus toolStatus = Message.ToolResponse.ToolStatus.TOOL_STATUS_UNSPECIFIED;
                iArr4[1] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                Message.ToolResponse.ToolStatus toolStatus2 = Message.ToolResponse.ToolStatus.TOOL_STATUS_UNSPECIFIED;
                iArr4[2] = 3;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc A[Catch: Exception -> 0x004c, TryCatch #1 {Exception -> 0x004c, blocks: (B:5:0x0012, B:16:0x002d, B:19:0x0050, B:21:0x0056, B:23:0x005c, B:24:0x0063, B:25:0x007c, B:27:0x0082, B:29:0x008a, B:31:0x008d, B:34:0x00a4, B:37:0x00bc, B:44:0x00ae, B:48:0x00c1, B:49:0x00c4, B:51:0x00c5, B:53:0x00d0, B:55:0x00e3, B:57:0x00d5, B:59:0x00dd, B:60:0x00e0, B:63:0x00f7, B:65:0x00fd, B:67:0x0103, B:68:0x0109, B:70:0x011d, B:71:0x0124, B:75:0x012c, B:81:0x013a, B:83:0x0140, B:85:0x0146, B:86:0x014c, B:89:0x0163, B:91:0x0167, B:92:0x016b, B:95:0x017c, B:97:0x0182, B:99:0x0188, B:100:0x018e, B:102:0x01a1, B:105:0x0018), top: B:4:0x0012, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Message toMessage(HasObservability hasObservability, MessageContent messageContent, PatternRedaction patternRedaction, Message.Role role, String str, Long l, boolean z, boolean z2, Set set) {
        Message textMessage;
        Message.ToolResponse.UserContent userContent;
        String str2;
        messageContent.getClass();
        set.getClass();
        try {
            ProtoValidationScope protoValidationScope = new ProtoValidationScope(messageContent, patternRedaction, hasObservability);
            try {
                MessageType messageType = messageContent.type;
                int i = messageType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[messageType.ordinal()];
                if (i == 1) {
                    MessageContent.Content content = messageContent.content;
                    MessageContent.Content.Text text = content instanceof MessageContent.Content.Text ? (MessageContent.Content.Text) content : null;
                    TextContent value = text != null ? text.getValue() : null;
                    ProtoValidationScope.required(value, "MessageContent text");
                    String str3 = (String) protoValidationScope.reportIfNullAndContinue("TextMessage text", (String) null, value.text);
                    if (str3 != null) {
                        textMessage = new Message.TextMessage(str, role, l, str3, z2, z);
                        return textMessage;
                    }
                    return null;
                }
                int i2 = 0;
                if (i == 2) {
                    MessageContent.Content content2 = messageContent.content;
                    MessageContent.Content.Image image = content2 instanceof MessageContent.Content.Image ? (MessageContent.Content.Image) content2 : null;
                    ImageContent value2 = image != null ? image.getValue() : null;
                    ProtoValidationScope.required(value2, "MessageContent image");
                    String str4 = value2.data;
                    String str5 = (String) protoValidationScope.reportIfNullAndContinue("ImageMessage mime_type", (String) null, value2.mime_type);
                    if (str5 == null) {
                        return null;
                    }
                    Boolean bool = value2.requires_presigned_url;
                    textMessage = new Message.ImageMessage(str, role, l, str4, str5, bool != null ? bool.booleanValue() : false, value2.s3_uri, z);
                    return textMessage;
                }
                if (i == 3) {
                    MessageContent.Content content3 = messageContent.content;
                    MessageContent.Content.ToolRequest toolRequest = content3 instanceof MessageContent.Content.ToolRequest ? (MessageContent.Content.ToolRequest) content3 : null;
                    ToolRequest value3 = toolRequest != null ? toolRequest.getValue() : null;
                    ProtoValidationScope.required(value3, "MessageContent tool_request");
                    String str6 = value3.id;
                    ProtoValidationScope.required(str6, "ToolRequest id");
                    String str7 = value3.tooltip;
                    String str8 = value3.tooltip_category;
                    Message.ToolRequest.TooltipCategory tooltipCategory = str8 != null ? toTooltipCategory(str8) : null;
                    Message.ToolRequest.ToolRequestContent toolRequest2 = toToolRequest(protoValidationScope, value3, patternRedaction);
                    if (toolRequest2 == null) {
                        return null;
                    }
                    textMessage = new Message.ToolRequest(str, role, l, str6, str7, tooltipCategory, toolRequest2, z);
                    return textMessage;
                }
                if (i != 4) {
                    hasObservability.getErrorReporter().report(new MoneybotProtoParsingError("MessageContent", ProtoParsingError.ErrorType.INVALID_TYPE_TO_SEALED_INTERFACE_MAPPING, "type", null, null, patternRedaction.template, 24), hasObservability.getOneErrorPerAppSessionStrategy());
                    return null;
                }
                MessageContent.Content content4 = messageContent.content;
                MessageContent.Content.ToolResponse toolResponse = content4 instanceof MessageContent.Content.ToolResponse ? (MessageContent.Content.ToolResponse) content4 : null;
                ToolResponse value4 = toolResponse != null ? toolResponse.getValue() : null;
                ProtoValidationScope.required(value4, "MessageContent tool_response");
                String str9 = value4.id;
                ProtoValidationScope.required(str9, "ToolResponse id");
                List<UserContent> list = value4.results;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    try {
                        str2 = str9;
                    } catch (ReportedError e) {
                        e = e;
                    }
                    try {
                        userContent = toUserContent(protoValidationScope, (UserContent) obj, patternRedaction, str2, str9 + ":" + i2, set);
                        str9 = str2;
                    } catch (ReportedError e2) {
                        e = e2;
                        str9 = str2;
                        hasObservability.getErrorReporter().report(e, hasObservability.getOneErrorPerAppSessionStrategy());
                        userContent = null;
                        if (userContent == null) {
                        }
                        i2 = i3;
                    }
                    if (userContent == null) {
                        arrayList.add(userContent);
                    }
                    i2 = i3;
                }
                String str10 = value4.status;
                return new Message.ToolResponse(str, role, l, str9, arrayList, Intrinsics.areEqual(str10, "success") ? Message.ToolResponse.ToolStatus.TOOL_STATUS_SUCCESS : Intrinsics.areEqual(str10, BreadcrumbHelper.Category.ERROR) ? Message.ToolResponse.ToolStatus.TOOL_STATUS_ERROR : Message.ToolResponse.ToolStatus.TOOL_STATUS_UNSPECIFIED, value4.error, z);
            } catch (Exception e3) {
                hasObservability.getErrorReporter().report(new MoneybotProtoParsingError("Message", null, null, e3, null, patternRedaction.template, 22), hasObservability.getOneErrorPerAppSessionStrategy());
                return null;
            }
        } catch (Exception e4) {
            throw RotateKt.toProtoParsingExceptionFor(e4, Reflection.factory.getOrCreateKotlinClass(MessageContent.class), patternRedaction, null);
        }
    }

    public static Message toMessage$default(HasObservability hasObservability, MessageContent messageContent, PatternRedaction patternRedaction, Message.Role role, String str, Long l, boolean z, Set set, int i) {
        if ((i & 8) != 0) {
            str = null;
        }
        if ((i & 16) != 0) {
            l = null;
        }
        if ((i & 32) != 0) {
            z = false;
        }
        if ((i & 128) != 0) {
            set = EmptySet.INSTANCE;
        }
        return toMessage(hasObservability, messageContent, patternRedaction, role, str, l, z, true, set);
    }

    public static final Message.Role toRole(HasObservability hasObservability, Role role) {
        int i = role == null ? -1 : WhenMappings.$EnumSwitchMapping$1[role.ordinal()];
        if (i != -1 && i != 1) {
            if (i == 2) {
                return Message.Role.ROLE_ASSISTANT;
            }
            if (i == 3) {
                return Message.Role.ROLE_SYSTEM;
            }
            if (i == 4) {
                return Message.Role.ROLE_UNSPECIFIED;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        return Message.Role.ROLE_USER;
    }

    public static final Message.ToolRequest.ToolRequestContent toToolRequest(ProtoValidationScope protoValidationScope, ToolRequest toolRequest, PatternRedaction patternRedaction) {
        HasObservability hasObservability = protoValidationScope.observability;
        try {
            ToolRequest.Result result = toolRequest.result;
            if (!(result instanceof ToolRequest.Result.Value)) {
                if (result instanceof ToolRequest.Result.Error) {
                    return new Message.ToolRequest.ToolRequestContent.Error(((ToolRequest.Result.Error) result).getValue());
                }
                if (result != null) {
                    throw new NoWhenBranchMatchedException();
                }
                hasObservability.getErrorReporter().report(new MoneybotProtoParsingError("ToolRequest", ProtoParsingError.ErrorType.REQUIRED_FIELD_MISSING, "result", null, null, patternRedaction.template, 24), hasObservability.getOneErrorPerAppSessionStrategy());
                return null;
            }
            ToolCall value = ((ToolRequest.Result.Value) result).getValue();
            value.getClass();
            try {
                String str = value.name;
                if (str == null) {
                    throw new IllegalArgumentException("name");
                }
                String str2 = value.arguments;
                Boolean bool = value.needs_approval;
                return new Message.ToolRequest.ToolRequestContent.ToolCall(str, str2, bool != null ? bool.booleanValue() : false);
            } catch (Exception e) {
                throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(ToolCall.class), patternRedaction, null);
            }
        } catch (Exception e2) {
            throw RotateKt.toProtoParsingExceptionFor(e2, Reflection.factory.getOrCreateKotlinClass(ToolRequest.class), patternRedaction, null);
        }
    }

    public static final Message.ToolRequest.TooltipCategory toTooltipCategory(String str) {
        switch (str.hashCode()) {
            case -1901891230:
                if (str.equals("Plasma")) {
                    return Message.ToolRequest.TooltipCategory.Plasma;
                }
                return null;
            case -1591322833:
                if (str.equals("Activity")) {
                    return Message.ToolRequest.TooltipCategory.Activity;
                }
                return null;
            case -1085510111:
                if (str.equals("Default")) {
                    return Message.ToolRequest.TooltipCategory.Default;
                }
                return null;
            case -757365607:
                if (str.equals("Savings")) {
                    return Message.ToolRequest.TooltipCategory.Savings;
                }
                return null;
            case -190113873:
                if (str.equals("Support")) {
                    return Message.ToolRequest.TooltipCategory.Support;
                }
                return null;
            case 78510:
                if (str.equals("P2P")) {
                    return Message.ToolRequest.TooltipCategory.P2P;
                }
                return null;
            case 69062958:
                if (str.equals("Graph")) {
                    return Message.ToolRequest.TooltipCategory.Graph;
                }
                return null;
            case 80217846:
                if (str.equals("Stock")) {
                    return Message.ToolRequest.TooltipCategory.Stock;
                }
                return null;
            case 80584057:
                if (str.equals("Taxes")) {
                    return Message.ToolRequest.TooltipCategory.Taxes;
                }
                return null;
            case 82059409:
                if (str.equals("Utils")) {
                    return Message.ToolRequest.TooltipCategory.Utils;
                }
                return null;
            case 622330452:
                if (str.equals("User Profile")) {
                    return Message.ToolRequest.TooltipCategory.UserProfile;
                }
                return null;
            case 1325467324:
                if (str.equals("Balance")) {
                    return Message.ToolRequest.TooltipCategory.Balance;
                }
                return null;
            case 1561949438:
                if (str.equals("Bitcoin")) {
                    return Message.ToolRequest.TooltipCategory.Bitcoin;
                }
                return null;
            default:
                return null;
        }
    }

    public static final Message.ToolResponse.UserContent toUserContent(ProtoValidationScope protoValidationScope, UserContent userContent, PatternRedaction patternRedaction, String str, String str2, Set set) {
        HasObservability hasObservability = protoValidationScope.observability;
        userContent.getClass();
        set.getClass();
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(userContent, patternRedaction, protoValidationScope);
            UserContent.Content content = userContent.content;
            if (content instanceof UserContent.Content.Text) {
                String str3 = ((UserContent.Content.Text) content).getValue().text;
                ProtoValidationScope.required(str3, "Text text");
                return new Message.ToolResponse.UserContent.Text(str3);
            }
            if (content instanceof UserContent.Content.StructuredContent) {
                ClientRenderable clientRenderable = ((UserContent.Content.StructuredContent) content).getValue().client_renderable;
                if (clientRenderable != null) {
                    return ClientRenderableMappersKt.toClientRenderable(protoValidationScope2, clientRenderable, str, str2, patternRedaction.template, set);
                }
                return null;
            }
            if (content instanceof UserContent.Content.ClientRenderable) {
                return ClientRenderableMappersKt.toClientRenderable(protoValidationScope2, ((UserContent.Content.ClientRenderable) content).getValue(), str, str2, patternRedaction.template, set);
            }
            hasObservability.getErrorReporter().report(new MoneybotProtoParsingError("UserContent", ProtoParsingError.ErrorType.INVALID_TYPE_TO_SEALED_INTERFACE_MAPPING, "result", null, str, patternRedaction.template, 8), hasObservability.getOneErrorPerAppSessionStrategy());
            return null;
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(UserContent.class), patternRedaction, null);
        }
    }
}
