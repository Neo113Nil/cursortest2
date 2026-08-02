package defpackage;

import com.yandex.messaging.core.net.entities.proto.MessageInfoRequest;
import com.yandex.messaging.core.net.entities.proto.MessageInfoResponse;

/* loaded from: classes15.dex */
public abstract class st10 implements o5t0 {
    public void b(MessageInfoResponse messageInfoResponse) {
    }

    @Override // defpackage.o5t0
    public final Class e() {
        return MessageInfoResponse.class;
    }

    @Override // defpackage.o5t0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public abstract MessageInfoRequest c(int i, int i2);

    @Override // defpackage.o5t0
    public final String k() {
        return "message_info";
    }

    @Override // defpackage.o5t0
    public final int n(Object obj) {
        MessageInfoResponse messageInfoResponse = (MessageInfoResponse) obj;
        if (messageInfoResponse.status != 0) {
            return 1;
        }
        b(messageInfoResponse);
        return 0;
    }
}
