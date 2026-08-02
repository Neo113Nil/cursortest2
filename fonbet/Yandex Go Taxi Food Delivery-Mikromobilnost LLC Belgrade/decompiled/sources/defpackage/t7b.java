package defpackage;

import com.yandex.messaging.core.net.entities.proto.ChatDataFilter;
import com.yandex.messaging.core.net.entities.proto.ChatHistoryResponse;
import com.yandex.messaging.core.net.entities.proto.ChatInfoFromTransport;
import com.yandex.messaging.core.net.entities.proto.CommonRequestFields;
import com.yandex.messaging.core.net.entities.proto.HistoryRequest;
import com.yandex.messaging.core.net.entities.proto.HistoryResponse;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes15.dex */
public final class t7b extends ylu {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t7b(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ylu, defpackage.o5t0
    public final /* bridge */ /* synthetic */ Object c(int i, int i2) {
        switch (this.a) {
        }
        return c(i, i2);
    }

    @Override // defpackage.ylu
    public final void f(HistoryResponse historyResponse) {
        ChatInfoFromTransport chatInfoFromTransport;
        ChatHistoryResponse chatHistoryResponse;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                u7b u7bVar = (u7b) obj;
                u7bVar.a(null);
                ChatHistoryResponse[] chatHistoryResponseArr = historyResponse.chats;
                ChatHistoryResponse chatHistoryResponse2 = chatHistoryResponseArr != null ? (ChatHistoryResponse) j73.D(chatHistoryResponseArr) : null;
                ChatHistoryResponse[] chatHistoryResponseArr2 = historyResponse.chats;
                if (chatHistoryResponseArr2 == null || chatHistoryResponseArr2.length != 1) {
                    return;
                }
                if (jl40.l(u7bVar.a.a.b, chatHistoryResponse2 != null ? chatHistoryResponse2.chatId : null) && (chatInfoFromTransport = chatHistoryResponse2.chatInfo) != null) {
                    l020 C = u7bVar.b.C();
                    try {
                        C.n0(u7bVar.a.a.a, chatInfoFromTransport.participantsCount);
                        C.s();
                        ooc.g(C, null);
                        return;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            ooc.g(C, th);
                            throw th2;
                        }
                    }
                }
                return;
            case 1:
                rsx rsxVar = (rsx) obj;
                x22 x22Var = rsxVar.f;
                naz0 naz0Var = rsxVar.d;
                x22Var.f("history hole response", "chat_type", naz0Var.c(), "chat_id", naz0Var.a.b);
                op3 op3Var = rsxVar.g;
                kgx kgxVar = rsx.h[0];
                op3Var.b(null);
                ChatHistoryResponse[] chatHistoryResponseArr3 = historyResponse.chats;
                if (chatHistoryResponseArr3 == null || (chatHistoryResponse = (ChatHistoryResponse) j73.D(chatHistoryResponseArr3)) == null || !jl40.l(chatHistoryResponse.chatId, naz0Var.a.b)) {
                    return;
                }
                rsxVar.e.i(chatHistoryResponse);
                return;
            default:
                l270.a((l270) obj, historyResponse);
                return;
        }
    }

    @Override // defpackage.ylu
    /* renamed from: g */
    public final HistoryRequest c(int i, int i2) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                HistoryRequest historyRequest = new HistoryRequest();
                naz0 naz0Var = ((u7b) obj).a;
                historyRequest.chatId = naz0Var.a.b;
                historyRequest.maxTimestamp = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
                historyRequest.limit = 1L;
                historyRequest.inviteHash = naz0Var.e();
                historyRequest.commonFields = new CommonRequestFields(i2 > 0, i);
                return historyRequest;
            case 1:
                HistoryRequest historyRequest2 = new HistoryRequest();
                historyRequest2.maxTimestamp = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
                historyRequest2.limit = 1L;
                naz0 naz0Var2 = ((rsx) obj).d;
                historyRequest2.chatId = naz0Var2.a.b;
                historyRequest2.inviteHash = naz0Var2.e();
                historyRequest2.filter = new ChatDataFilter();
                historyRequest2.commonFields = new CommonRequestFields(i2 > 0, i);
                return historyRequest2;
            default:
                HistoryRequest historyRequest3 = new HistoryRequest();
                historyRequest3.inviteHash = ((l270) obj).b.e();
                historyRequest3.maxTimestamp = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
                historyRequest3.filter = new ChatDataFilter();
                historyRequest3.limit = 1L;
                historyRequest3.commonFields = new CommonRequestFields(i2 > 0, i);
                return historyRequest3;
        }
    }
}
