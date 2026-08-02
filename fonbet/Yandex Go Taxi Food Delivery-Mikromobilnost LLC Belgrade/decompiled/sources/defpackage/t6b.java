package defpackage;

import android.os.Looper;
import com.yandex.messaging.core.net.entities.MessengerSupportContext;
import com.yandex.messaging.core.net.entities.proto.PostMessageResponse;
import com.yandex.messaging.core.net.entities.proto.ShortMessageInfo;
import com.yandex.messaging.core.net.entities.proto.message.ChatOpen;
import com.yandex.messaging.core.net.entities.proto.message.ChatOpenType;
import com.yandex.messaging.core.net.entities.proto.message.ClientInfo;
import com.yandex.messaging.core.net.entities.proto.message.ClientMessage;
import com.yandex.messaging.core.net.entities.proto.message.PinMessage;
import com.yandex.messaging.core.net.entities.proto.message.UserStatusMessage;
import com.yandex.messaging.domain.statuses.StatusAvailability;
import java.util.Locale;
import java.util.Objects;
import kotlin.time.DurationUnit;

/* loaded from: classes15.dex */
public final class t6b extends ree0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public t6b(w2c0 w2c0Var, long j, wnb0 wnb0Var) {
        this.a = 1;
        this.c = w2c0Var;
        this.w = wnb0Var;
        PinMessage pinMessage = new PinMessage();
        pinMessage.chatId = w2c0Var.c.a.b;
        pinMessage.timestamp = j;
        this.b = pinMessage;
    }

    @Override // defpackage.ree0
    public final ClientMessage b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                p1b p1bVar = (p1b) obj;
                ChatOpenType chatOpenType = (ChatOpenType) this.c;
                MessengerSupportContext messengerSupportContext = (MessengerSupportContext) this.w;
                String str = ((o1b0) p1bVar.a).b;
                int ordinal = chatOpenType.ordinal();
                i720 i720Var = (i720) p1bVar.b;
                String str2 = i720Var.c;
                return new ClientMessage(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ChatOpen(str, ordinal, new ClientInfo(i720Var.b(), i720Var.c(), Locale.getDefault().getLanguage(), str2), messengerSupportContext), false, 0, false, 251658239, null);
            case 1:
                return new ClientMessage(null, null, null, null, null, null, null, null, null, null, null, null, (PinMessage) obj, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, false, 268431359, null);
            default:
                kg9 kg9Var = (kg9) obj;
                int type = kg9Var.a.getType();
                int h = m791.h(kg9Var.a);
                o430 o430Var = e3n.b;
                return new ClientMessage(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new UserStatusMessage(type, h, (int) e3n.o(0L, DurationUnit.SECONDS), null), null, null, null, null, false, 0, false, 267386879, null);
        }
    }

    @Override // defpackage.ree0
    public boolean f(PostMessageResponse postMessageResponse) {
        switch (this.a) {
            case 2:
                yt21 yt21Var = (yt21) this.c;
                yt21Var.b.getClass();
                yt21Var.j.l(null);
                ((wx11) this.w).invoke(Boolean.TRUE);
                return true;
            default:
                return super.f(postMessageResponse);
        }
    }

    @Override // defpackage.ree0
    public void g(PostMessageResponse postMessageResponse) {
        int i = this.a;
        Object obj = this.w;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 1:
                w2c0 w2c0Var = (w2c0) obj3;
                z83.g(null, w2c0Var.f, Looper.myLooper());
                ShortMessageInfo shortMessageInfo = postMessageResponse.messageInfo;
                long j = shortMessageInfo != null ? shortMessageInfo.version : 0L;
                if (j > 0) {
                    w2c0Var.a(((PinMessage) obj2).timestamp, j);
                }
                ((wnb0) obj).run();
                break;
            case 2:
                yt21 yt21Var = (yt21) obj3;
                ut21 ut21Var = yt21Var.b;
                kg9 kg9Var = (kg9) obj2;
                StatusAvailability statusAvailability = kg9Var.a;
                o430 o430Var = e3n.b;
                DurationUnit durationUnit = DurationUnit.SECONDS;
                e3n.o(0L, durationUnit);
                Objects.toString(statusAvailability);
                ut21Var.getClass();
                String str = yt21Var.i;
                StatusAvailability statusAvailability2 = kg9Var.a;
                UserStatusMessage userStatusMessage = new UserStatusMessage(statusAvailability2.getType(), m791.h(statusAvailability2), (int) e3n.o(0L, durationUnit), null);
                ShortMessageInfo shortMessageInfo2 = postMessageResponse.messageInfo;
                yt21Var.d.d(new sa6(yt21Var, str, shortMessageInfo2 != null ? shortMessageInfo2.timestamp : -1L, userStatusMessage, 7));
                yt21Var.j.l(null);
                ((wx11) obj).invoke(Boolean.FALSE);
                break;
        }
    }

    public /* synthetic */ t6b(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }
}
