package defpackage;

import android.os.Looper;
import androidx.room.util.a;
import com.yandex.messaging.core.net.entities.proto.CommonRequestFields;
import com.yandex.messaging.core.net.entities.proto.EditHistoryRequest;
import com.yandex.messaging.core.net.entities.proto.EditHistoryResponse;
import com.yandex.messaging.internal.entities.Message;

/* loaded from: classes15.dex */
public final class qln extends tln {
    public final /* synthetic */ long a;
    public final /* synthetic */ rln b;

    public qln(rln rlnVar, long j) {
        this.b = rlnVar;
        this.a = j;
    }

    @Override // defpackage.tln
    public final void b(EditHistoryResponse editHistoryResponse) {
        rln rlnVar = this.b;
        Message[] g = rlnVar.f.g(editHistoryResponse.messages);
        rlnVar.g = null;
        if (g == null || g.length <= 0) {
            return;
        }
        z83.g(null, rlnVar.b, Looper.myLooper());
        at2 at2Var = rlnVar.d;
        ikw0 startTransaction = at2Var.startTransaction();
        try {
            long j = rlnVar.a.a.a;
            Long l = (Long) a.b(at2Var.w().a, true, false, new cs0(j, 14));
            if (l == null) {
                throw new IllegalArgumentException();
            }
            long g2 = ((oab) rlnVar.c.get()).g(g);
            if (g2 > l.longValue()) {
                startTransaction.a(rlnVar);
                ((Number) a.b(at2Var.w().a, false, true, new j2b(0, g2, j))).intValue();
            }
            startTransaction.s();
            startTransaction.close();
        } finally {
        }
    }

    @Override // defpackage.tln, defpackage.o5t0
    /* renamed from: f */
    public final EditHistoryRequest c(int i, int i2) {
        EditHistoryRequest editHistoryRequest = new EditHistoryRequest();
        naz0 naz0Var = this.b.a;
        editHistoryRequest.chatId = naz0Var.a.b;
        editHistoryRequest.inviteHash = naz0Var.e();
        editHistoryRequest.minTimestamp = this.a + 1;
        editHistoryRequest.limit = 100L;
        editHistoryRequest.commonFields = new CommonRequestFields(i2 > 0, i);
        return editHistoryRequest;
    }
}
