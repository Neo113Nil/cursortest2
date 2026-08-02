package defpackage;

import com.yandex.messaging.core.net.entities.proto.HistoryRequest;
import com.yandex.messaging.core.net.entities.proto.HistoryResponse;

/* loaded from: classes15.dex */
public abstract class ylu implements o5t0 {
    public void b(HistoryResponse historyResponse) {
    }

    @Override // defpackage.o5t0
    public final Class e() {
        return HistoryResponse.class;
    }

    public void f(HistoryResponse historyResponse) {
    }

    @Override // defpackage.o5t0
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public abstract HistoryRequest c(int i, int i2);

    @Override // defpackage.o5t0
    public final String k() {
        return "history";
    }

    @Override // defpackage.o5t0
    public final int n(Object obj) {
        HistoryResponse historyResponse = (HistoryResponse) obj;
        if (historyResponse.status == 0) {
            f(historyResponse);
            return 0;
        }
        b(historyResponse);
        return o5t0.o(historyResponse.status);
    }
}
