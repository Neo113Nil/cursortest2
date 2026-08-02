package defpackage;

import com.yandex.messaging.core.net.entities.proto.PostMessageResponse;
import com.yandex.messaging.core.net.entities.proto.ShortMessageInfo;
import com.yandex.messaging.core.net.entities.proto.message.ClearUserHistory;
import com.yandex.messaging.core.net.entities.proto.message.ClientMessage;
import com.yandex.messaging.core.net.entities.proto.message.Heartbeat;

/* loaded from: classes15.dex */
public final class u0c extends ree0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u0c(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ree0
    public final ClientMessage b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new ClientMessage(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ClearUserHistory(((v0c) obj).a.b), null, null, null, null, null, null, null, false, 0, false, 268304383, null);
            default:
                Heartbeat heartbeat = new Heartbeat();
                ((sgx) obj).w.getClass();
                heartbeat.type = 2;
                return new ClientMessage(null, heartbeat, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, false, 268435453, null);
        }
    }

    @Override // defpackage.ree0
    public void g(PostMessageResponse postMessageResponse) {
        switch (this.a) {
            case 0:
                ShortMessageInfo shortMessageInfo = postMessageResponse.messageInfo;
                z83.i();
                if (shortMessageInfo != null) {
                    ((v0c) this.b).a(shortMessageInfo.timestamp, shortMessageInfo.seqNo);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ree0
    /* renamed from: i */
    public int n(PostMessageResponse postMessageResponse) {
        switch (this.a) {
            case 1:
                if (postMessageResponse.status != 1) {
                    ((zeu) ((sgx) this.b).c.get()).h = false;
                }
                return 0;
            default:
                return super.n(postMessageResponse);
        }
    }

    @Override // defpackage.ree0, defpackage.o5t0
    public /* bridge */ /* synthetic */ int n(Object obj) {
        switch (this.a) {
            case 1:
                n((PostMessageResponse) obj);
                return 0;
            default:
                return super.n(obj);
        }
    }
}
