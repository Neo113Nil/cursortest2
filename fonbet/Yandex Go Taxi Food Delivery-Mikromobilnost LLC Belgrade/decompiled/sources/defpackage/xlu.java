package defpackage;

import com.yandex.messaging.core.net.entities.proto.ChatDataFilter;
import com.yandex.messaging.core.net.entities.proto.CommonRequestFields;
import com.yandex.messaging.core.net.entities.proto.HistoryRequest;
import com.yandex.messaging.core.net.entities.proto.HistoryResponse;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes15.dex */
public final class xlu extends ylu {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public xlu(HistoryRequest historyRequest, j18 j18Var) {
        this.b = historyRequest;
        this.c = j18Var;
    }

    @Override // defpackage.ylu, defpackage.o5t0
    public final /* bridge */ /* synthetic */ Object c(int i, int i2) {
        switch (this.a) {
        }
        return c(i, i2);
    }

    @Override // defpackage.ylu
    public final void f(HistoryResponse historyResponse) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                j18 j18Var = (j18) obj;
                if (j18Var.t() instanceof mf60) {
                    j18Var.resumeWith(historyResponse);
                    break;
                }
                break;
            default:
                l270.a((l270) obj, historyResponse);
                break;
        }
    }

    @Override // defpackage.ylu
    /* renamed from: g */
    public final HistoryRequest c(int i, int i2) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                HistoryRequest historyRequest = (HistoryRequest) obj;
                historyRequest.commonFields = new CommonRequestFields(i2 > 0, i);
                return historyRequest;
            default:
                HistoryRequest historyRequest2 = new HistoryRequest();
                historyRequest2.chatId = (String) obj;
                historyRequest2.inviteHash = ((l270) this.c).b.e();
                historyRequest2.maxTimestamp = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
                historyRequest2.filter = new ChatDataFilter();
                historyRequest2.limit = 1L;
                historyRequest2.commonFields = new CommonRequestFields(i2 > 0, i);
                return historyRequest2;
        }
    }

    public xlu(l270 l270Var, String str) {
        this.c = l270Var;
        this.b = str;
    }
}
