package com.squareup.cash.moneybot.backend.api.mappers;

import androidx.compose.ui.draw.RotateKt;
import com.squareup.cash.clientroutes.PatternRedaction;
import com.squareup.cash.moneybot.backend.api.MoneybotProtoParsingError;
import com.squareup.cash.moneybot.backend.api.model.chat.ChatActivity;
import com.squareup.cash.moneybot.backend.real.managers.RealChatManager;
import com.squareup.cash.observability.protovalidation.ProtoParsingError;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.protos.cash.kgoose.api.v3.Activity;
import com.squareup.protos.cash.kgoose.api.v3.ClientRenderable;
import com.squareup.protos.cash.kgoose.api.v3.ClientRenderingUpdateActivity;
import com.squareup.protos.cash.kgoose.api.v3.MemoryUpdateActivity;
import java.util.Set;
import kotlin.jvm.internal.Reflection;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes7.dex */
public abstract class ChatActivityMappersKt {
    public static final ChatActivity.MemoryUpdateActivity toChatActivity(ProtoValidationScope protoValidationScope, MemoryUpdateActivity memoryUpdateActivity, PatternRedaction patternRedaction, String str, long j) {
        String str2;
        String str3;
        try {
            String str4 = memoryUpdateActivity.origin_message_id;
            try {
                ProtoValidationScope.required(str4, "origin_message_id");
                str2 = str4;
            } catch (Exception e) {
                protoValidationScope.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e, memoryUpdateActivity != null ? Reflection.factory.getOrCreateKotlinClass(memoryUpdateActivity.getClass()) : null, patternRedaction, null), protoValidationScope.getOneErrorPerAppSessionStrategy());
                str2 = null;
            }
            if (str2 != null) {
                String str5 = memoryUpdateActivity.label;
                try {
                    ProtoValidationScope.required(str5, AnnotatedPrivateKey.LABEL);
                    str3 = str5;
                } catch (Exception e2) {
                    protoValidationScope.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e2, memoryUpdateActivity != null ? Reflection.factory.getOrCreateKotlinClass(memoryUpdateActivity.getClass()) : null, patternRedaction, null), protoValidationScope.getOneErrorPerAppSessionStrategy());
                    str3 = null;
                }
                if (str3 != null) {
                    return new ChatActivity.MemoryUpdateActivity(str, j, str2, str3);
                }
            }
            return null;
        } catch (Exception e3) {
            throw RotateKt.toProtoParsingExceptionFor(e3, memoryUpdateActivity != null ? Reflection.factory.getOrCreateKotlinClass(MemoryUpdateActivity.class) : null, patternRedaction, null);
        }
    }

    public static ChatActivity toChatActivity$default(RealChatManager realChatManager, Activity activity, Set set) {
        activity.getClass();
        set.getClass();
        Activity.ActivityType activityType = activity.activity_type;
        Activity.ActivityType.ClientRenderingUpdate clientRenderingUpdate = activityType instanceof Activity.ActivityType.ClientRenderingUpdate ? (Activity.ActivityType.ClientRenderingUpdate) activityType : null;
        ClientRenderingUpdateActivity value = clientRenderingUpdate != null ? clientRenderingUpdate.getValue() : null;
        String str = value != null ? value.tool_request_id : null;
        String str2 = null;
        PatternRedaction patternRedaction = new PatternRedaction(str, (String) null, false);
        try {
            ProtoValidationScope protoValidationScope = new ProtoValidationScope(activity, patternRedaction, realChatManager);
            String str3 = (String) protoValidationScope.reportIfNullAndContinue("id", (String) null, activity.id);
            Long l = (Long) protoValidationScope.reportIfNullAndContinue("created", (String) null, activity.created);
            long longValue = l != null ? l.longValue() : 0L;
            Activity.ActivityType activityType2 = activity.activity_type;
            if (activityType2 instanceof Activity.ActivityType.ClientRenderingUpdate) {
                try {
                    return toChatActivity(protoValidationScope, ((Activity.ActivityType.ClientRenderingUpdate) activityType2).getValue(), set, patternRedaction, str3, longValue);
                } catch (Exception e) {
                    e = e;
                    patternRedaction = patternRedaction;
                    throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(Activity.class), patternRedaction, null);
                }
            }
            if (activityType2 instanceof Activity.ActivityType.MemoryUpdate) {
                return toChatActivity(protoValidationScope, ((Activity.ActivityType.MemoryUpdate) activityType2).getValue(), patternRedaction, str3, longValue);
            }
            realChatManager.errorReporter.report(new MoneybotProtoParsingError("ActivityProto", ProtoParsingError.ErrorType.INVALID_TYPE_TO_SEALED_INTERFACE_MAPPING, "activity_type", null, str, str2, 8), realChatManager.oneErrorPerAppSessionStrategy);
            return null;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static final ChatActivity.ClientRenderingUpdateActivity toChatActivity(ProtoValidationScope protoValidationScope, ClientRenderingUpdateActivity clientRenderingUpdateActivity, Set set, PatternRedaction patternRedaction, String str, long j) {
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(clientRenderingUpdateActivity, patternRedaction, protoValidationScope);
            String str2 = clientRenderingUpdateActivity.tool_request_id;
            ProtoValidationScope.required(str2, "tool_request_id");
            ClientRenderable clientRenderable = clientRenderingUpdateActivity.client_renderable;
            com.squareup.cash.moneybot.backend.api.model.chat.ClientRenderable clientRenderable$default = clientRenderable != null ? ClientRenderableMappersKt.toClientRenderable$default(protoValidationScope2, clientRenderable, str2, patternRedaction.template, set, 4) : null;
            ProtoValidationScope.required(clientRenderable$default, "client_renderable");
            return new ChatActivity.ClientRenderingUpdateActivity(str, j, str2, clientRenderable$default);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, clientRenderingUpdateActivity != null ? Reflection.factory.getOrCreateKotlinClass(ClientRenderingUpdateActivity.class) : null, patternRedaction, null);
        }
    }
}
