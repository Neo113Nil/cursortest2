package defpackage;

import android.os.Looper;
import com.yandex.payment.common.result.ResultType;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes15.dex */
public final class rsx {
    public static final /* synthetic */ kgx[] h;
    public final Looper a;
    public final n5t0 b;
    public final k020 c;
    public final naz0 d;
    public final oab e;
    public final x22 f;
    public final op3 g = new op3();

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(ResultType.RESULT_TYPE_LOADING, 0, "getLoading()Lcom/yandex/messaging/Cancelable;", rsx.class);
        qoi0.a.getClass();
        h = new kgx[]{mutablePropertyReference1Impl};
    }

    public rsx(Looper looper, n5t0 n5t0Var, k020 k020Var, naz0 naz0Var, oab oabVar, x22 x22Var, wff0 wff0Var) {
        this.a = looper;
        this.b = n5t0Var;
        this.c = k020Var;
        this.d = naz0Var;
        this.e = oabVar;
        this.f = x22Var;
        wff0Var.a(new fn3(8, this));
    }

    public final void a(long j, long j2, uhx uhxVar) {
        z83.g(null, this.a, Looper.myLooper());
        kgx kgxVar = h[0];
        this.g.b(null);
        if (j2 >= j) {
            return;
        }
        naz0 naz0Var = this.d;
        o1b0 o1b0Var = naz0Var.a;
        o1b0 o1b0Var2 = naz0Var.a;
        Long r = this.c.b.B().r(o1b0Var.a);
        long longValue = r != null ? r.longValue() : 0L;
        if (j <= longValue) {
            return;
        }
        if (uhxVar != null) {
            String str = o1b0Var2.b;
            oy10 oy10Var = (oy10) uhxVar.b;
            py10 py10Var = oy10Var.d;
            c370 c370Var = py10Var.e;
            c370Var.getClass();
            sx11 sx11Var = new sx11();
            sx11Var.chatId = str;
            sx11Var.timestamp = j;
            t8o t8oVar = new t8o();
            t8oVar.environment = c370Var.a.a();
            t8oVar.origin = c370Var.f;
            t8oVar.undeliveredInfo = sx11Var;
            c370Var.d(t8oVar);
            py10Var.f.h("undelivered message", "threads", Boolean.valueOf(oy10Var.a), "chat_id", str, ClidProvider.TIMESTAMP, Long.valueOf(j));
        }
        this.f.reportEvent("history hole detected", b.l(new Pair("chat_id", o1b0Var2.b), new Pair("local", Long.valueOf(longValue)), new Pair("server", Long.valueOf(j))));
        b();
    }

    public final void b() {
        z83.g(null, this.a, Looper.myLooper());
        x08 a = this.b.a(new t7b(1, this), new cfu());
        kgx kgxVar = h[0];
        this.g.b(a);
    }
}
