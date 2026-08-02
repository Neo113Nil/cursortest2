package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.yandex.messaging.core.net.entities.proto.message.BotRequest;
import com.yandex.messaging.core.net.entities.proto.message.ChatApproval;
import com.yandex.messaging.core.net.entities.proto.message.ClearUserHistory;
import com.yandex.messaging.core.net.entities.proto.message.ClientMessage;
import com.yandex.messaging.core.net.entities.proto.message.Heartbeat;
import com.yandex.messaging.core.net.entities.proto.message.PinMessage;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.messaging.core.net.entities.proto.message.Reaction;
import com.yandex.messaging.core.net.entities.proto.message.ReducedUserInfo;
import com.yandex.messaging.core.net.entities.proto.message.SeenMarker;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessage;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessageInfo;
import com.yandex.messaging.core.net.entities.proto.message.ServerNotification;
import com.yandex.messaging.core.net.entities.proto.message.StateSync;
import com.yandex.messaging.core.net.entities.proto.message.SystemMessage;
import com.yandex.messaging.core.net.entities.proto.message.TranslationMessage;
import com.yandex.messaging.core.net.entities.proto.message.Typing;
import com.yandex.messaging.core.net.entities.proto.message.UpdateFields;
import com.yandex.messaging.core.net.entities.proto.message.UserStatusMessage;
import com.yandex.messaging.domain.statuses.j;
import com.yandex.messaging.extension.flow.c;
import com.yandex.messaging.internal.authorized.sync.g;
import com.yandex.messaging.internal.authorized.textsuggest.b;
import com.yandex.messaging.internal.entities.AddresseeType;
import com.yandex.messaging.internal.entities.ChatId;
import com.yandex.messaging.internal.entities.Message;
import com.yandex.messaging.internal.entities.MessageReactions;
import com.yandex.messaging.internal.entities.MessageTranslation;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Pair;
import kotlin.collections.a;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes15.dex */
public final class qtq0 {
    public final x22 a;
    public final h3y b;
    public final h3y c;
    public final h3y d;
    public final h3y e;
    public final h3y f;
    public final y5u0 g;
    public final at2 h;
    public final ml21 i;
    public final k020 j;
    public final ks10 k;
    public final ney0 l;
    public final lqo m;
    public final h3y n;
    public final xt21 o;
    public final kk60 p;
    public final h3y q;

    public qtq0(x22 x22Var, h3y h3yVar, h3y h3yVar2, h3y h3yVar3, h3y h3yVar4, h3y h3yVar5, y5u0 y5u0Var, at2 at2Var, ml21 ml21Var, k020 k020Var, ks10 ks10Var, ney0 ney0Var, lqo lqoVar, h3y h3yVar6, xt21 xt21Var, kk60 kk60Var, h3y h3yVar7) {
        this.a = x22Var;
        this.b = h3yVar;
        this.c = h3yVar2;
        this.d = h3yVar3;
        this.e = h3yVar4;
        this.f = h3yVar5;
        this.g = y5u0Var;
        this.h = at2Var;
        this.i = ml21Var;
        this.j = k020Var;
        this.k = ks10Var;
        this.l = ney0Var;
        this.m = lqoVar;
        this.n = h3yVar6;
        this.o = xt21Var;
        this.p = kk60Var;
        this.q = h3yVar7;
    }

    public final s020 a(String str) {
        if (str == null) {
            return null;
        }
        return ((h9b) this.c.get()).e(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ServerMessage serverMessage, PlainMessage plainMessage, boolean z) {
        ReducedUserInfo reducedUserInfo;
        long j;
        ArrayList arrayList;
        am21 b;
        Long l;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str = serverMessage.serverMessageInfo.from.userId;
        boolean c = this.h.a().c(str);
        String chatId = plainMessage.getChatId();
        AddresseeType.INSTANCE.getClass();
        this.a.h("msg received", "chat id", chatId, "addressee id", str, "addressee type", (c ? AddresseeType.CONTACT : AddresseeType.OTHER).getReportName());
        Message c2 = this.k.c(serverMessage, plainMessage, z);
        s020 a = a(plainMessage.getChatId());
        ml21 ml21Var = this.i;
        String str2 = ml21Var.a;
        ReducedUserInfo[] reducedUserInfoArr = serverMessage.mentionedUsers;
        if (reducedUserInfoArr != null) {
            int length = reducedUserInfoArr.length;
            for (int i = 0; i < length; i++) {
                reducedUserInfo = reducedUserInfoArr[i];
                if (jl40.l(reducedUserInfo.userId, str2)) {
                    break;
                }
            }
        }
        reducedUserInfo = null;
        boolean z2 = reducedUserInfo != null;
        if (a == null) {
            ChatId a2 = ChatId.Companion.a(plainMessage.getChatId());
            if (a2 instanceof ChatId.ThreadId) {
                j = 0;
                if (((ChatId.ThreadId) a2).d >= 0 && z2) {
                    e(plainMessage.getChatId(), null);
                    a = a(plainMessage.getChatId());
                }
                if (a != null) {
                    ChatId a3 = ChatId.Companion.a(plainMessage.getChatId());
                    if (!(a3 instanceof ChatId.ThreadId) || ((ChatId.ThreadId) a3).d < j) {
                        g gVar = (g) this.f.get();
                        z83.h(null, gVar.y.d != null);
                        z83.g(null, gVar.S, Looper.myLooper());
                        gVar.e();
                        return;
                    }
                    return;
                }
                m8g m8gVar = (m8g) a;
                m8gVar.d().f(c2);
                q920 q920Var = (q920) m8gVar.u0.get();
                if (q920Var.a.k(q920Var.d.a).D && (b = q920Var.b.a().b(serverMessage.serverMessageInfo.from.userId)) != null && (l = b.a) != null) {
                    long longValue = l.longValue();
                    long j2 = serverMessage.serverMessageInfo.from.version;
                    if (longValue < j2) {
                        p920 p920Var = q920Var.e;
                        if (p920Var != null) {
                            if (p920Var.a != j2) {
                                p920Var.b.cancel();
                            }
                        }
                        q920Var.e = new p920(j2, q920Var.c.c(new fl10(q920Var), serverMessage.serverMessageInfo.from.userId));
                    }
                }
                j5b0 j5b0Var = (j5b0) m8gVar.D0.get();
                m5b0 m5b0Var = j5b0Var.b;
                k020 k020Var = j5b0Var.d;
                o1b0 o1b0Var = j5b0Var.a;
                ReducedUserInfo[] reducedUserInfoArr2 = serverMessage.mentionedUsers;
                if (reducedUserInfoArr2 != null) {
                    ArrayList arrayList2 = new ArrayList(reducedUserInfoArr2.length);
                    for (ReducedUserInfo reducedUserInfo2 : reducedUserInfoArr2) {
                        arrayList2.add(reducedUserInfo2.userId);
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                long j3 = serverMessage.serverMessageInfo.timestamp;
                meb mebVar = j5b0Var.e;
                long j4 = o1b0Var.a;
                Long d = mebVar.d(j4);
                if (j3 > (d != null ? d.longValue() : 0L)) {
                    l020 C = k020Var.C();
                    if (arrayList != null) {
                        try {
                            if (arrayList.contains(j5b0Var.c.a)) {
                                m5b0Var.a(Collections.singleton(Long.valueOf(j3)));
                                C.z.a(j4);
                                C.s();
                                C.close();
                            }
                        } finally {
                        }
                    }
                    if (arrayList == null || !a.G(arrayList, k020Var.k(j4).s)) {
                        m5b0Var.d(j3);
                        C.z.a(j4);
                        C.s();
                        C.close();
                    }
                    m5b0Var.a(Collections.singleton(Long.valueOf(j3)));
                    C.z.a(j4);
                    C.s();
                    C.close();
                }
                this.a.h("tech msg time 2 handle", "time_diff", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime), "msg_type", Integer.valueOf(c2.h.type), "is_own", Boolean.valueOf(str.equals(ml21Var.a)));
                return;
            }
        }
        j = 0;
        if (a != null) {
        }
    }

    public final void c(String str, ServerMessage serverMessage, m5g0 m5g0Var, String str2) {
        ClientMessage clientMessage = serverMessage.clientMessage;
        if (clientMessage.plain == null && clientMessage.seenMarker == null) {
            SystemMessage systemMessage = clientMessage.systemMessage;
            if ((systemMessage != null ? systemMessage.getMeetingStartedMessage() : null) == null) {
                SystemMessage systemMessage2 = clientMessage.systemMessage;
                if ((systemMessage2 != null ? systemMessage2.getPersonalMeetingEndedMessage() : null) == null && clientMessage.meetingCallingMessage == null) {
                    this.a.f("push_ignored", "transit_id", m5g0Var.a, CRLReasonCodeExtension.REASON, "cannot_handle_message");
                    return;
                }
            }
        }
        if (a(str) == null) {
            e(str, str2);
        }
        d(serverMessage);
        s020 a = a(str);
        x22 x22Var = this.a;
        if (a == null) {
            x22Var.f("push_ignored", "transit_id", m5g0Var.a, CRLReasonCodeExtension.REASON, "cannot_get_chat_component");
            return;
        }
        x22Var.c("push_sent_to_notification_publisher", "transit_id", m5g0Var.a);
        com.yandex.messaging.internal.authorized.chat.notifications.a aVar = (com.yandex.messaging.internal.authorized.chat.notifications.a) ((m8g) a).J.get();
        this.p.getClass();
        aVar.l(new jk60(m5g0Var, false));
    }

    public final void d(ServerMessage serverMessage) {
        j jVar;
        String actionId;
        BotRequest.TextSuggestButton[] buttons;
        com.yandex.messaging.internal.translator.j jVar2;
        MessageTranslation a;
        v0c v0cVar;
        ClientMessage clientMessage = serverMessage.clientMessage;
        ServerMessageInfo serverMessageInfo = serverMessage.serverMessageInfo;
        PlainMessage plainMessage = clientMessage.plain;
        int i = 0;
        if (plainMessage != null) {
            b(serverMessage, plainMessage, false);
            return;
        }
        SeenMarker seenMarker = clientMessage.seenMarker;
        if (seenMarker != null) {
            s020 a2 = a(seenMarker.getChatId());
            if (a2 == null) {
                return;
            }
            oab d = ((m8g) a2).d();
            String str = serverMessageInfo.from.userId;
            ml21 ml21Var = d.a;
            k020 k020Var = d.w;
            o1b0 o1b0Var = d.b;
            l020 C = k020Var.C();
            try {
                if (!str.equals(ml21Var.a) && !str.equals(k020Var.k(o1b0Var.a).s)) {
                    C.k0(o1b0Var.a, seenMarker.getTimestamp());
                    if (!str.equals(ml21Var.a) || str.equals(k020Var.k(o1b0Var.a).s)) {
                        d.J.c(seenMarker.getTimestamp());
                        C.z.a(o1b0Var.a);
                    }
                    C.s();
                    C.close();
                }
                C.L0(o1b0Var.a, seenMarker.getTimestamp(), seenMarker.getSeqNo(), seenMarker.getVersion());
                if (!str.equals(ml21Var.a)) {
                }
                d.J.c(seenMarker.getTimestamp());
                C.z.a(o1b0Var.a);
                C.s();
                C.close();
            } finally {
            }
        } else {
            Typing typing = clientMessage.typing;
            h3y h3yVar = this.b;
            h3y h3yVar2 = this.n;
            if (typing != null) {
                String str2 = serverMessageInfo.from.userId;
                long j = serverMessageInfo.timestamp / 1000;
                ((g370) h3yVar2.get()).f(j, str2);
                ((tp21) h3yVar.get()).a(j, 0L, str2);
                s020 a3 = a(typing.getChatId());
                if (a3 == null) {
                    return;
                }
                aq11 aq11Var = (aq11) ((m8g) a3).Q.get();
                Handler handler = aq11Var.d;
                z83.g(null, handler.getLooper(), Looper.myLooper());
                z83.g(null, handler.getLooper(), Looper.myLooper());
                if (str2 != null) {
                    aq11Var.b.add(str2);
                }
                handler.removeCallbacksAndMessages(str2);
                t601 t601Var = new t601(10, aq11Var, str2);
                aq11Var.e.getClass();
                handler.postAtTime(t601Var, str2, SystemClock.uptimeMillis() + 3000);
                aq11Var.a();
                return;
            }
            SystemMessage systemMessage = clientMessage.systemMessage;
            if (systemMessage != null) {
                Message f = ks10.f(this.k, serverMessageInfo, systemMessage, clientMessage.isSilent, clientMessage.notificationBehaviour, serverMessage.notificationMeta, plainMessage != null && plainMessage.isStarred(), false, 192);
                s020 a4 = a(systemMessage.getChatId());
                if (a4 == null) {
                    g gVar = (g) this.f.get();
                    z83.h(null, gVar.y.d != null);
                    z83.g(null, gVar.S, Looper.myLooper());
                    gVar.e();
                    return;
                }
                if (systemMessage.getParticipantsChange() != null) {
                    u7b u7bVar = (u7b) ((m8g) a4).k0.get();
                    u7bVar.a(u7bVar.c.f(new t7b(i, u7bVar)));
                }
                ((m8g) a4).d().f(f);
                return;
            }
            Heartbeat heartbeat = clientMessage.heartbeat;
            if (heartbeat != null) {
                String str3 = serverMessageInfo.from.userId;
                long j2 = serverMessageInfo.timestamp / 1000;
                long j3 = heartbeat.onlineUntil * 1000;
                ((g370) h3yVar2.get()).b(j2, j3, str3);
                ((tp21) h3yVar.get()).a(j2, j3, str3);
                zeu zeuVar = (zeu) this.e.get();
                if (str3.equals(zeuVar.c.a)) {
                    zeuVar.f = true;
                    zeuVar.d.removeCallbacks(zeuVar.a);
                    zeuVar.a();
                    return;
                }
                return;
            }
            StateSync stateSync = clientMessage.stateSync;
            if (stateSync != null) {
                stateSync.data.a.sync(this.g);
                return;
            }
            PinMessage pinMessage = clientMessage.pin;
            if (pinMessage != null) {
                s020 a5 = a(pinMessage.chatId);
                if (a5 == null) {
                    return;
                }
                w2c0 w2c0Var = (w2c0) ((m8g) a5).k.get();
                z83.g(null, w2c0Var.f, Looper.myLooper());
                z83.b(null, w2c0Var.c.a.b, pinMessage.chatId);
                w2c0Var.a(pinMessage.timestamp, serverMessageInfo.lastEditTimestamp);
                return;
            }
            Reaction reaction = clientMessage.reaction;
            if (reaction == null) {
                UpdateFields updateFields = clientMessage.updateFields;
                if (updateFields != null) {
                    s020 a6 = a(updateFields.getChatId());
                    if (a6 == null) {
                        return;
                    }
                    ax10 ax10Var = (ax10) ((m8g) a6).y0.get();
                    l020 C2 = ax10Var.c.C();
                    try {
                        C2.w(ax10Var.b.a, updateFields.getMessageTimestamp(), updateFields);
                        C2.s();
                        C2.close();
                        return;
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                ChatApproval chatApproval = clientMessage.chatApproval;
                if (chatApproval != null) {
                    s020 a7 = a(chatApproval.chatId);
                    if (a7 == null) {
                        return;
                    }
                    ((r0b) ((m8g) a7).q0.get()).a();
                    return;
                }
                ClearUserHistory clearUserHistory = clientMessage.clearUserHistory;
                if (clearUserHistory != null) {
                    String chatId = clearUserHistory.getChatId();
                    ChatId.Companion.e(chatId);
                    z83.i();
                    s020 a8 = a(chatId);
                    if (a8 == null || (v0cVar = (v0c) ((m8g) a8).z0.get()) == null) {
                        return;
                    }
                    v0cVar.a(serverMessageInfo.timestamp, serverMessageInfo.seqNo);
                    return;
                }
                TranslationMessage translationMessage = clientMessage.translationMessage;
                if (translationMessage != null) {
                    s020 a9 = a(translationMessage.getTranslationWithRef().getChatId());
                    if (a9 == null || (jVar2 = (com.yandex.messaging.internal.translator.j) ((m8g) a9).P.get()) == null || (a = jVar2.d.a(translationMessage)) == null) {
                        return;
                    }
                    jVar2.a(a);
                    l020 C3 = jVar2.e.C();
                    try {
                        C3.f0(jVar2.f, a);
                        C3.s();
                        C3.close();
                        return;
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                BotRequest botRequest = clientMessage.botRequest;
                if (botRequest != null) {
                    s020 a10 = a(botRequest.getChatId());
                    if (a10 == null) {
                        return;
                    }
                    gb6 gb6Var = (gb6) ((m8g) a10).C0.get();
                    if (gb6Var.a.g) {
                        ((com.yandex.messaging.support.a) gb6Var.b.get()).a(botRequest);
                    }
                    b bVar = (b) gb6Var.c.get();
                    if (bVar.b.a(tz10.I) && (actionId = botRequest.getActionId()) != null) {
                        w9b w9bVar = bVar.f;
                        Long l = (Long) w9bVar.b.remove(actionId);
                        if (l != null) {
                            w9bVar.a.reportEvent("time2received_bot_suggest", gw00.e(new Pair(RemoteBioParameters.TIME, Long.valueOf(SystemClock.elapsedRealtime() - l.longValue()))));
                        }
                        BotRequest.TextSuggest textSuggest = botRequest.getTextSuggest();
                        if (textSuggest == null || (buttons = textSuggest.getButtons()) == null) {
                            return;
                        }
                        BotRequest.TextSuggestButton[] textSuggestButtonArr = buttons.length != 0 ? buttons : null;
                        if (textSuggestButtonArr != null) {
                            ArrayList arrayList = new ArrayList(textSuggestButtonArr.length);
                            int length = textSuggestButtonArr.length;
                            while (i < length) {
                                BotRequest.TextSuggestButton textSuggestButton = textSuggestButtonArr[i];
                                arrayList.add(new ity0(textSuggestButton.getText(), textSuggestButton.getCallbackData()));
                                i++;
                            }
                            c.d(bVar.g, new jty0(arrayList, actionId));
                            return;
                        }
                        return;
                    }
                    return;
                }
                ServerNotification serverNotification = clientMessage.notification;
                if (serverNotification != null) {
                    s020 a11 = a(serverNotification.getChatId());
                    if (a11 != null) {
                        m8g m8gVar = (m8g) a11;
                        ttq0 ttq0Var = (ttq0) m8gVar.u.get();
                        ttq0Var.a.getClass();
                        serverNotification.setTimestampMs(Long.valueOf(System.currentTimeMillis()));
                        ttq0Var.b.add(serverNotification);
                        com.yandex.messaging.internal.authorized.chat.notifications.a aVar = (com.yandex.messaging.internal.authorized.chat.notifications.a) m8gVar.J.get();
                        this.p.a.getClass();
                        aVar.b(new jk60(null, false));
                        return;
                    }
                    return;
                }
                r96 r96Var = tz10.p;
                lqo lqoVar = this.m;
                if (lqoVar.a(r96Var) && lqoVar.a(tz10.r) && clientMessage.meetingCallingMessage != null) {
                    if (serverMessage.clientMessage.meetingCallingMessage == null) {
                        return;
                    }
                    ReducedUserInfo reducedUserInfo = serverMessage.serverMessageInfo.from;
                    this.l.getClass();
                    return;
                }
                UserStatusMessage userStatusMessage = clientMessage.userStatus;
                if (userStatusMessage == null) {
                    PlainMessage plainMessage2 = clientMessage.ephemeral;
                    if (plainMessage2 != null) {
                        if (((l5o) this.q.get()).c) {
                            b(serverMessage, plainMessage2, true);
                            return;
                        } else {
                            this.a.reportEvent("tech_ephemeral_message_ignored", gw00.e(new Pair(CRLReasonCodeExtension.REASON, "feature disabled")));
                            return;
                        }
                    }
                    return;
                }
                String str4 = serverMessageInfo.from.userId;
                this.o.a.reportEvent("status_mirror_received", kotlin.collections.b.i(new Pair("guid", str4), new Pair("availability", Integer.valueOf(userStatusMessage.getAvailability()))));
                long j4 = serverMessage.serverMessageInfo.timestamp;
                cl21 d2 = ((el21) this.d.get()).d();
                if (d2 == null || (jVar = (j) ((d9g) d2).t0.get()) == null || !((u9u0) jVar.e.get()).w) {
                    return;
                }
                ut21 ut21Var = jVar.d;
                userStatusMessage.toString();
                ut21Var.getClass();
                jVar.a.d(userStatusMessage, str4, j4);
                yt21 yt21Var = jVar.b;
                yt21Var.d.d(new sa6(yt21Var, str4, j4, userStatusMessage, 7));
                return;
            }
            s020 a12 = a(reaction.chatId);
            if (a12 == null) {
                return;
            }
            fw10 fw10Var = (fw10) ((m8g) a12).v0.get();
            z83.g(null, fw10Var.k.getLooper(), Looper.myLooper());
            if (serverMessage.reactionsVersion == 0) {
                return;
            }
            l020 C4 = fw10Var.c.C();
            try {
                long j5 = serverMessage.serverMessageInfo.timestamp;
                long j6 = serverMessage.reactionsVersion;
                MessageReactions a13 = MessageReactions.a(serverMessage.reactions, serverMessage.recentUserReactions);
                if (j5 != 0) {
                    fw10Var.d(C4, j5, j6, a13);
                    fw10Var.e(C4, j5, serverMessage.serverMessageInfo.threadState);
                }
                C4.s();
                C4.close();
            } finally {
            }
        }
    }

    public final void e(String str, String str2) {
        l020 C = this.j.C();
        if (str2 == null) {
            str2 = "";
        }
        try {
            C.B.g(str, str2);
            C.s();
            C.close();
        } finally {
        }
    }
}
