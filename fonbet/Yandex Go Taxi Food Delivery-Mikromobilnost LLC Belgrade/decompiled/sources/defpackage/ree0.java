package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.messaging.core.net.entities.proto.PostMessage;
import com.yandex.messaging.core.net.entities.proto.PostMessageResponse;
import com.yandex.messaging.core.net.entities.proto.message.ClientMessage;

/* loaded from: classes15.dex */
public abstract class ree0 implements o5t0 {
    public static boolean h(int i) {
        if (i == 1) {
            z83.j("Handle illegal commit state");
            return false;
        }
        if (i != 4 && i != 11 && i != 13 && i != 15 && i != 17 && i != 25 && i != 7 && i != 8) {
            switch (i) {
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    break;
                default:
                    return true;
            }
        }
        return false;
    }

    public abstract ClientMessage b();

    @Override // defpackage.o5t0
    public final Object c(int i, int i2) {
        return new PostMessage(b(), i);
    }

    @Override // defpackage.o5t0
    public final Class e() {
        return PostMessageResponse.class;
    }

    public boolean f(PostMessageResponse postMessageResponse) {
        return false;
    }

    public void g(PostMessageResponse postMessageResponse) {
    }

    @Override // defpackage.o5t0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int n(PostMessageResponse postMessageResponse) {
        if (postMessageResponse.status != 1) {
            return !f(postMessageResponse) ? 1 : 0;
        }
        g(postMessageResponse);
        return 0;
    }

    @Override // defpackage.o5t0
    public final String k() {
        return Constants.PUSH;
    }
}
