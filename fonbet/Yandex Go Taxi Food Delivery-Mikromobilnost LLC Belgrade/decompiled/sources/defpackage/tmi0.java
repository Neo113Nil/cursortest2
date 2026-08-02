package defpackage;

import com.yandex.messaging.core.net.entities.proto.CommonRequestFields;
import com.yandex.messaging.core.net.entities.proto.HistoryRequest;
import com.yandex.messaging.core.net.entities.proto.ReducedHistoryResponse;
import java.util.concurrent.CancellationException;
import kotlin.Result;

/* loaded from: classes15.dex */
public final class tmi0 extends pmi0 {
    public final HistoryRequest a;
    public final j18 b;

    public tmi0(HistoryRequest historyRequest, j18 j18Var) {
        this.a = historyRequest;
        this.b = j18Var;
    }

    @Override // defpackage.pmi0
    public final void b(ReducedHistoryResponse reducedHistoryResponse) {
        j18 j18Var = this.b;
        if (j18Var.t() instanceof mf60) {
            j18Var.resumeWith(reducedHistoryResponse);
        }
    }

    @Override // defpackage.pmi0, defpackage.o5t0
    /* renamed from: f */
    public final HistoryRequest c(int i, int i2) {
        HistoryRequest historyRequest = this.a;
        CommonRequestFields commonRequestFields = historyRequest.commonFields;
        if (commonRequestFields == null) {
            historyRequest.commonFields = new CommonRequestFields(i2 > 0, i);
        } else if (commonRequestFields != null) {
            commonRequestFields.origin = i;
        }
        return historyRequest;
    }

    @Override // defpackage.pmi0, defpackage.o5t0
    /* renamed from: g */
    public final int n(ReducedHistoryResponse reducedHistoryResponse) {
        int n = super.n(reducedHistoryResponse);
        if (n != 0 && n != 1) {
            j18 j18Var = this.b;
            if (j18Var.t() instanceof mf60) {
                j18Var.resumeWith(new Result.Failure(new CancellationException()));
            }
        }
        return n;
    }
}
