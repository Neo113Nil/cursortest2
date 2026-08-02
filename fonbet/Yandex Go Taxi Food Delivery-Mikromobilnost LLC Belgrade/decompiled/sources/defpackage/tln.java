package defpackage;

import com.yandex.messaging.core.net.entities.proto.EditHistoryRequest;
import com.yandex.messaging.core.net.entities.proto.EditHistoryResponse;

/* loaded from: classes15.dex */
public abstract class tln implements o5t0 {
    public void b(EditHistoryResponse editHistoryResponse) {
    }

    @Override // defpackage.o5t0
    public final Class e() {
        return EditHistoryResponse.class;
    }

    @Override // defpackage.o5t0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public abstract EditHistoryRequest c(int i, int i2);

    @Override // defpackage.o5t0
    public final String k() {
        return "edit_history";
    }

    @Override // defpackage.o5t0
    public final int n(Object obj) {
        EditHistoryResponse editHistoryResponse = (EditHistoryResponse) obj;
        int i = editHistoryResponse.status;
        if (i != 0) {
            return o5t0.o(i);
        }
        b(editHistoryResponse);
        return 0;
    }
}
