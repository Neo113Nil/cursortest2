package defpackage;

import com.yandex.messaging.action.MessagingAction;
import com.yandex.messaging.activity.MessengerActivityBase;
import com.yandex.messaging.core.net.entities.SearchData;
import com.yandex.messaging.core.net.entities.proto.ChatHistoryResponse;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessage;
import com.yandex.messaging.input.MessageSelectionActionModeCallback;
import com.yandex.messaging.internal.InviteThread;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.authorized.b;
import com.yandex.mob.reporting.MobNotificationsTrimReason;
import kotlin.Pair;

/* loaded from: classes15.dex */
public final /* synthetic */ class rv10 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ rv10(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 init$lambda$0;
        zy11 onResume$lambda$1;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Long l = null;
        int i2 = 11;
        int i3 = 2;
        int i4 = 0;
        switch (i) {
            case 0:
                return ((SearchData.Message) obj).serverMessage;
            case 1:
                return Boolean.valueOf(((ServerMessage) obj).clientMessage.plain != null);
            case 2:
                ServerMessage serverMessage = (ServerMessage) obj;
                return new Pair(serverMessage, serverMessage.clientMessage.plain);
            case 3:
                init$lambda$0 = MessageSelectionActionModeCallback.init$lambda$0((CharSequence) obj);
                return init$lambda$0;
            case 4:
                ull0 T0 = ((oll0) obj).T0("SELECT COUNT(480782) FROM messages");
                try {
                    long j = T0.q() ? T0.getLong(0) : 0L;
                    T0.close();
                    return Long.valueOf(j);
                } finally {
                }
            case 5:
                return ((ChatHistoryResponse) obj).chatId;
            case 6:
                ull0 T02 = ((oll0) obj).T0("SELECT chat_internal_id FROM messages_view ORDER BY message_history_id DESC LIMIT 1");
                try {
                    if (T02.q() && !T02.isNull(0)) {
                        l = Long.valueOf(T02.getLong(0));
                    }
                    return l;
                } finally {
                }
            case 7:
                try {
                    ((oll0) obj).T0("DELETE FROM last_message_view").q();
                    return zy11Var;
                } finally {
                }
            case 8:
                w610 w610Var = (w610) obj;
                String str = (String) ((u1l) w610Var.a()).get(1);
                String str2 = (String) ((u1l) w610Var.a()).get(2);
                String str3 = (String) ((u1l) w610Var.a()).get(3);
                return new MessagingAction.OpenChat(new InviteThread(str, Long.parseLong(str2)), null, null, str3.length() > 0 ? new ServerMessageRef(Long.parseLong(str3), null, 2, null) : null, false, false, null, false, null, false, null, false, false, null, 24566);
            case 9:
                w610 w610Var2 = (w610) obj;
                String str4 = (String) ((u1l) w610Var2.a()).get(1);
                String str5 = (String) ((u1l) w610Var2.a()).get(2);
                String str6 = (String) ((u1l) w610Var2.a()).get(3);
                return new MessagingAction.OpenChat(new InviteThread(str4, Long.parseLong(str5)), null, null, str6.length() > 0 ? new ServerMessageRef(Long.parseLong(str6), null, 2, null) : null, false, false, null, false, null, false, null, false, false, null, 24566);
            case 10:
                w610 w610Var3 = (w610) obj;
                String str7 = (String) ((u1l) w610Var3.a()).get(1);
                String str8 = (String) ((u1l) w610Var3.a()).get(2);
                String str9 = (String) ((u1l) w610Var3.a()).get(3);
                return new MessagingAction.OpenChat(new InviteThread(str7, Long.parseLong(str8)), null, null, str9.length() > 0 ? new ServerMessageRef(Long.parseLong(str9), null, 2, null) : null, false, false, null, false, null, false, null, false, false, null, 24566);
            case 11:
                return MessagingAction.OpenSettings.a;
            case 12:
                onResume$lambda$1 = MessengerActivityBase.onResume$lambda$1((kt11) obj);
                return onResume$lambda$1;
            case 13:
                uj60 uj60Var = (uj60) ((wyf0) obj).c.getValue();
                return Boolean.valueOf(uj60Var != null && uj60Var.d);
            case 14:
                b bVar = ((y1g0) ((p8g) ((v320) obj)).Y.get()).a;
                bVar.a.post(new n7c(bVar, bVar.e.b(), i4));
                return zy11Var;
            case 15:
                return ((MobNotificationsTrimReason) obj).getValue();
            case 16:
                return coa1.i((y3x) obj);
            case 17:
                return mbb1.d((y3x) obj, new ps20(i2));
            case 18:
                return mbb1.d((y3x) obj, new teb(i2));
            case 19:
                return mbb1.d((y3x) obj, new mr21(16));
            case 20:
                return mbb1.d((y3x) obj, new ps20(i2));
            case 21:
                return mbb1.d((y3x) obj, new ps20(i2));
            case 22:
                return mbb1.d((y3x) obj, new xuv(r6 ? 1 : 0));
            case 23:
                return mbb1.d((y3x) obj, new teb(8));
            case 24:
                return mbb1.d((y3x) obj, new cbg0(21));
            case 25:
                return mbb1.d((y3x) obj, new l75(5));
            case 26:
                return mbb1.d((y3x) obj, new mr21(25));
            case 27:
                return mbb1.d((y3x) obj, new mr21(26));
            case 28:
                y3x y3xVar = (y3x) obj;
                return mbb1.d(y3xVar, new kv5(i3, y3xVar));
            default:
                return mbb1.d((y3x) obj, new xuv(i4));
        }
    }
}
