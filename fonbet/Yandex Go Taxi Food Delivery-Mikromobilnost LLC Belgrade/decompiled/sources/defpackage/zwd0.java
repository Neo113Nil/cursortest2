package defpackage;

import com.yandex.messaging.core.net.entities.proto.PollInfoResponse;

/* loaded from: classes15.dex */
public abstract class zwd0 implements o5t0 {
    public void b(PollInfoResponse pollInfoResponse) {
    }

    @Override // defpackage.o5t0
    public final Class e() {
        return PollInfoResponse.class;
    }

    public void f(PollInfoResponse pollInfoResponse) {
    }

    @Override // defpackage.o5t0
    public final String k() {
        return "poll_info";
    }

    @Override // defpackage.o5t0
    public final int n(Object obj) {
        PollInfoResponse pollInfoResponse = (PollInfoResponse) obj;
        if (pollInfoResponse.getStatus() == 0) {
            f(pollInfoResponse);
            return 0;
        }
        b(pollInfoResponse);
        return o5t0.o(pollInfoResponse.getStatus());
    }
}
