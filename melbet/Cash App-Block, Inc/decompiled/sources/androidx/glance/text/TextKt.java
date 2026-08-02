package androidx.glance.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.glance.Applier;
import androidx.glance.GlanceModifier;
import androidx.glance.session.GlobalSnapshotManagerKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.miteksystems.misnap.workflow.view.MiSnapView;
import com.squareup.cash.cdf.customersupport.CustomerSupportChatSendMessage;
import com.squareup.cash.cdf.customersupport.CustomerSupportChatSendMessageError;
import com.squareup.cash.cdf.customersupport.CustomerSupportChatUploadAttachment;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.support.chat.backend.api.Conversation;
import com.squareup.cash.support.chat.backend.api.MessageBody;
import com.squareup.cash.support.chat.backend.api.MessageStatus$Failed;
import com.squareup.cash.support.chat.backend.real.ChatAnalyticsKt$WhenMappings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.Duration;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class TextKt {
    public static final void Text(String str, GlanceModifier glanceModifier, TextStyle textStyle, int i, Composer composer, int i2, int i3) {
        int i4;
        GlanceModifier glanceModifier2;
        int i5;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-192911377);
        int i6 = (gapComposer.changed(str) ? 4 : 2) | i2;
        int i7 = i3 & 2;
        if (i7 != 0) {
            i4 = i6 | 48;
        } else {
            i4 = i6 | (gapComposer.changed(glanceModifier) ? 32 : 16);
        }
        if (((i4 | (gapComposer.changed(textStyle) ? 256 : 128) | 3072) & 1171) == 1170 && gapComposer.getSkipping()) {
            gapComposer.skipToGroupEnd();
            glanceModifier2 = glanceModifier;
            i5 = i;
        } else {
            gapComposer.startDefaults();
            if ((i2 & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                glanceModifier2 = i7 != 0 ? GlanceModifier.Companion.$$INSTANCE : glanceModifier;
                i5 = Integer.MAX_VALUE;
            } else {
                gapComposer.skipToGroupEnd();
                glanceModifier2 = glanceModifier;
                i5 = i;
            }
            gapComposer.endDefaults();
            TextKt$Text$1 textKt$Text$1 = TextKt$Text$1.INSTANCE;
            gapComposer.startReplaceableGroup(-1115894518);
            gapComposer.startReplaceableGroup(1886828752);
            if (!(gapComposer.applier instanceof Applier)) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startNode();
            int i8 = 1;
            if (gapComposer.inserting) {
                gapComposer.createNode(new MiSnapView.j(i8, textKt$Text$1));
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, str, TextKt$Text$2$1.INSTANCE);
            Updater.m576setimpl(gapComposer, glanceModifier2, TextKt$Text$2$1.INSTANCE$1);
            Updater.m576setimpl(gapComposer, textStyle, TextKt$Text$2$1.INSTANCE$2);
            TextKt$Text$2$1 textKt$Text$2$1 = TextKt$Text$2$1.INSTANCE$3;
            if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(i5))) {
                gapComposer.updateRememberedValue(Integer.valueOf(i5));
                gapComposer.apply(Integer.valueOf(i5), textKt$Text$2$1);
            }
            Boxes$$ExternalSyntheticOutline1.m(gapComposer, true, false, false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextKt$Text$3(str, glanceModifier2, textStyle, i5, i2, i3);
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewActivity.deepLinkSpecs;
    }

    public static final void logSendMessage(Analytics analytics, String str, MessageBody messageBody, Conversation.BotStatus botStatus, boolean z, boolean z2, boolean z3) {
        CustomerSupportChatSendMessage.MessageType messageType;
        CustomerSupportChatSendMessage.BotStatus botStatus2;
        CustomerSupportChatSendMessage.BotStatus botStatus3;
        messageBody.getClass();
        if (messageBody instanceof MessageBody.TextBody) {
            messageType = CustomerSupportChatSendMessage.MessageType.TEXT;
        } else if (messageBody instanceof MessageBody.SelectedReplyBody) {
            messageType = CustomerSupportChatSendMessage.MessageType.SUGGESTED_REPLY;
        } else if (messageBody instanceof MessageBody.FileBody) {
            messageType = GlobalSnapshotManagerKt.isImage((MessageBody.FileBody) messageBody) ? CustomerSupportChatSendMessage.MessageType.IMAGE : CustomerSupportChatSendMessage.MessageType.FILE;
        } else {
            if (!(messageBody instanceof MessageBody.TransactionBody) && !(messageBody instanceof MessageBody.ActivityItemTransactionBody)) {
                if (!(messageBody instanceof MessageBody.UnknownBody) && !(messageBody instanceof MessageBody.ActionBody) && !(messageBody instanceof MessageBody.SystemMessageBody)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                throw new IllegalArgumentException(messageBody + " cannot be sent");
            }
            messageType = CustomerSupportChatSendMessage.MessageType.TRANSACTION;
        }
        CustomerSupportChatSendMessage.MessageType messageType2 = messageType;
        int i = botStatus == null ? -1 : ChatAnalyticsKt$WhenMappings.$EnumSwitchMapping$0[botStatus.ordinal()];
        if (i == -1 || i == 1) {
            botStatus2 = null;
        } else {
            if (i == 2) {
                botStatus3 = CustomerSupportChatSendMessage.BotStatus.READY;
            } else if (i == 3) {
                botStatus3 = CustomerSupportChatSendMessage.BotStatus.ACTIVE;
            } else {
                if (i != 4) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                botStatus3 = CustomerSupportChatSendMessage.BotStatus.HANDED_OVER;
            }
            botStatus2 = botStatus3;
        }
        analytics.track(new CustomerSupportChatSendMessage(str, Boolean.valueOf(z), Boolean.valueOf(z2), messageType2, botStatus2, Boolean.valueOf(z3), messageBody instanceof MessageBody.SelectedReplyBody ? ((MessageBody.SelectedReplyBody) messageBody).reply.token : null), null);
    }

    public static final void logSendMessageError(Analytics analytics, MessageBody messageBody, MessageStatus$Failed messageStatus$Failed, String str) {
        CustomerSupportChatSendMessageError.MessageType messageType;
        messageBody.getClass();
        if (messageBody instanceof MessageBody.TextBody) {
            messageType = CustomerSupportChatSendMessageError.MessageType.TEXT;
        } else if (messageBody instanceof MessageBody.SelectedReplyBody) {
            messageType = CustomerSupportChatSendMessageError.MessageType.SUGGESTED_REPLY;
        } else if (messageBody instanceof MessageBody.FileBody) {
            messageType = GlobalSnapshotManagerKt.isImage((MessageBody.FileBody) messageBody) ? CustomerSupportChatSendMessageError.MessageType.IMAGE : CustomerSupportChatSendMessageError.MessageType.FILE;
        } else {
            if (!(messageBody instanceof MessageBody.TransactionBody) && !(messageBody instanceof MessageBody.ActivityItemTransactionBody)) {
                if (!(messageBody instanceof MessageBody.UnknownBody) && !(messageBody instanceof MessageBody.ActionBody) && !(messageBody instanceof MessageBody.SystemMessageBody)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                throw new IllegalArgumentException(messageBody + " cannot be sent");
            }
            messageType = CustomerSupportChatSendMessageError.MessageType.TRANSACTION;
        }
        boolean z = messageStatus$Failed.clientDetermined;
        Integer num = messageStatus$Failed.statusCode;
        analytics.track(new CustomerSupportChatSendMessageError(messageType, z ? CustomerSupportChatSendMessageError.ErrorType.CLIENT : num != null ? CustomerSupportChatSendMessageError.ErrorType.SERVER : CustomerSupportChatSendMessageError.ErrorType.NETWORK, num, str), null);
    }

    public static final void logUploadAttachment(Analytics analytics, boolean z, Duration duration, String str) {
        duration.getClass();
        analytics.track(new CustomerSupportChatUploadAttachment(Integer.valueOf((int) duration.toMillis()), z ? CustomerSupportChatUploadAttachment.Status.SUCCESS : CustomerSupportChatUploadAttachment.Status.FAILURE, str), null);
    }
}
