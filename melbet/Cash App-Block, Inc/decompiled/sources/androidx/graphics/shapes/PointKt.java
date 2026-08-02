package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import androidx.glance.layout.SpacerKt;
import androidx.glance.session.SessionWorkerKt;
import com.squareup.cash.cdf.customersupport.ChatMessageSender;
import com.squareup.cash.cdf.customersupport.CustomerSupportChatReceivedMessageAction;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.support.chat.backend.api.Action$OpenLink;
import com.squareup.cash.support.chat.backend.api.Action$PickTransaction;
import com.squareup.cash.support.chat.backend.api.Message;
import com.squareup.cash.support.chat.backend.api.MessageBody;
import com.squareup.cash.support.chat.backend.api.PendingMessage;
import com.squareup.cash.support.chat.backend.api.RecordedMessage;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public abstract class PointKt {
    /* renamed from: div-so9K2fw, reason: not valid java name */
    public static final long m1130divso9K2fw(long j, float f) {
        return FloatFloatPair.m127constructorimpl(m1133getXDnnuFBc(j) / f, m1134getYDnnuFBc(j) / f);
    }

    /* renamed from: dotProduct-ybeJwSQ, reason: not valid java name */
    public static final float m1131dotProductybeJwSQ(long j, long j2) {
        return (m1134getYDnnuFBc(j2) * m1134getYDnnuFBc(j)) + (m1133getXDnnuFBc(j2) * m1133getXDnnuFBc(j));
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewActivityReceiptOnRequestV2.deepLinkSpecs;
    }

    /* renamed from: getDistance-DnnuFBc, reason: not valid java name */
    public static final float m1132getDistanceDnnuFBc(long j) {
        return (float) Math.sqrt((m1134getYDnnuFBc(j) * m1134getYDnnuFBc(j)) + (m1133getXDnnuFBc(j) * m1133getXDnnuFBc(j)));
    }

    /* renamed from: getX-DnnuFBc, reason: not valid java name */
    public static final float m1133getXDnnuFBc(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getY-DnnuFBc, reason: not valid java name */
    public static final float m1134getYDnnuFBc(long j) {
        return Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void logReceivedMessageActions(Analytics analytics, List list, String str) {
        SpacerKt spacerKt;
        String str2;
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Message message = (Message) it.next();
            message.getClass();
            if (!(message instanceof PendingMessage)) {
                if (!(message instanceof RecordedMessage)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                MessageBody messageBody = ((RecordedMessage) message).body;
                if (messageBody instanceof MessageBody.ActionBody) {
                    spacerKt = ((MessageBody.ActionBody) messageBody).action;
                    if (spacerKt == null) {
                        String messageToken = SessionWorkerKt.getMessageToken(message);
                        Message.Sender sender = message.getSender();
                        sender.getClass();
                        if (spacerKt instanceof Action$OpenLink) {
                            str2 = str;
                            analytics.track(new CustomerSupportChatReceivedMessageAction(((Action$OpenLink) spacerKt).url, CustomerSupportChatReceivedMessageAction.ActionType.LINK, messageToken, str2, toCdfSender(sender)), null);
                        } else {
                            str2 = str;
                            if (!(spacerKt instanceof Action$PickTransaction)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return;
                            }
                            analytics.track(new CustomerSupportChatReceivedMessageAction(null, CustomerSupportChatReceivedMessageAction.ActionType.SELECT_TRANSACTION, messageToken, str2, toCdfSender(sender)), null);
                        }
                        str = str2;
                    }
                }
            }
            spacerKt = null;
            if (spacerKt == null) {
            }
        }
    }

    /* renamed from: minus-ybeJwSQ, reason: not valid java name */
    public static final long m1135minusybeJwSQ(long j, long j2) {
        return FloatFloatPair.m127constructorimpl(m1133getXDnnuFBc(j) - m1133getXDnnuFBc(j2), m1134getYDnnuFBc(j) - m1134getYDnnuFBc(j2));
    }

    /* renamed from: plus-ybeJwSQ, reason: not valid java name */
    public static final long m1136plusybeJwSQ(long j, long j2) {
        return FloatFloatPair.m127constructorimpl(m1133getXDnnuFBc(j2) + m1133getXDnnuFBc(j), m1134getYDnnuFBc(j2) + m1134getYDnnuFBc(j));
    }

    /* renamed from: times-so9K2fw, reason: not valid java name */
    public static final long m1137timesso9K2fw(long j, float f) {
        return FloatFloatPair.m127constructorimpl(m1133getXDnnuFBc(j) * f, m1134getYDnnuFBc(j) * f);
    }

    public static final ChatMessageSender toCdfSender(Message.Sender sender) {
        int ordinal = sender.ordinal();
        if (ordinal == 1) {
            return ChatMessageSender.ADVOCATE;
        }
        if (ordinal != 2) {
            return null;
        }
        return ChatMessageSender.BOT;
    }
}
