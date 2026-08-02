package defpackage;

import com.yandex.messaging.core.net.entities.proto.ChatDataFilter;
import com.yandex.messaging.core.net.entities.proto.HistoryRequest;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public class wlu {
    public static final /* synthetic */ kgx[] f;
    public final k020 a;
    public final h3y b;
    public final h3y c;
    public final dvg d;
    public final op3 e = new op3();

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("currentRequest", 0, "getCurrentRequest()Lcom/yandex/messaging/Cancelable;", wlu.class);
        qoi0.a.getClass();
        f = new kgx[]{mutablePropertyReference1Impl};
    }

    public wlu(k020 k020Var, h3y h3yVar, h3y h3yVar2, dvg dvgVar) {
        this.a = k020Var;
        this.b = h3yVar;
        this.c = h3yVar2;
        this.d = dvgVar;
    }

    public HistoryRequest a(long j) {
        HistoryRequest historyRequest = new HistoryRequest();
        long e = this.a.e();
        historyRequest.limit = 1L;
        if (e != 0) {
            historyRequest.minTimestamp = Math.max(0L, e - 5000);
            ChatDataFilter chatDataFilter = new ChatDataFilter();
            chatDataFilter.setMinVersion(Long.valueOf(Math.max(1L, j)));
            historyRequest.filter = chatDataFilter;
        }
        return historyRequest;
    }

    public String b() {
        return "time2history";
    }

    public final void c(x08 x08Var) {
        kgx kgxVar = f[0];
        this.e.b(x08Var);
    }
}
