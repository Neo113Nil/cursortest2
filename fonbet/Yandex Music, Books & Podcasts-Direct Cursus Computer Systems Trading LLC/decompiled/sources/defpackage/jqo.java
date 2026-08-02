package defpackage;

import android.os.CountDownTimer;
import com.connectsdk.service.DeviceService;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class jqo extends tu2 {
    public final sdk m;
    public final g0c n;
    public final voi o;
    public final voi p;
    public final voi q;
    public final voi r;
    public final cib s;
    public final voi t;
    public CountDownTimer u;
    public final sml v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqo(sdk sdkVar, g0c g0cVar) {
        super(g0cVar);
        sdkVar.getClass();
        g0cVar.getClass();
        this.m = sdkVar;
        this.n = g0cVar;
        this.o = new voi();
        this.p = new voi();
        this.q = new voi();
        this.r = new voi();
        this.s = new cib(28, this);
        this.t = new voi(ypo.a);
        this.v = new sml(this);
    }

    @Override // defpackage.tu2
    public final void K() {
        String L = L();
        String concat = "Пользователь нажал на крестик на экране СБП Челленджера, verification_id = ".concat(L);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("verification_id", new jkr(L));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        qne j = su4.j(vtmVar, "event_name", "sbp_challenger_tap_on_close", "sbp_challenger_tap_on_close", vtmVar);
        x60 x60Var = (x60) this.n;
        x60Var.getClass();
        x60Var.a(j);
        super.K();
    }

    public final String L() {
        kpo kpoVar;
        Pair pair = (Pair) this.p.d();
        String str = (pair == null || (kpoVar = (kpo) pair.b) == null) ? null : kpoVar.c;
        return str == null ? "" : str;
    }

    public final void M(Long l) {
        Long valueOf = l != null ? Long.valueOf(l.longValue() - (new Date().getTime() / 1000)) : null;
        long longValue = valueOf != null ? valueOf.longValue() : 0L;
        if (longValue <= 0) {
            this.t.m(zpo.a);
            return;
        }
        long j = (longValue + 1) * 1000;
        CountDownTimer countDownTimer = this.u;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.u = new b27(j, this, 2).start();
    }

    public final void N(String str) {
        mfk mfkVar;
        qne Z0 = gut.Z0(L());
        x60 x60Var = (x60) this.n;
        x60Var.getClass();
        x60Var.a(Z0);
        voi voiVar = this.p;
        Pair pair = (Pair) voiVar.d();
        if (pair != null) {
            w03 w03Var = ((tdk) this.m).h;
            Pair pair2 = (Pair) voiVar.d();
            String str2 = (pair2 == null || (mfkVar = (mfk) pair2.a) == null) ? null : mfkVar.a;
            if (str2 == null) {
                str2 = "";
            }
            w03Var.f(str2, L(), str, ((kpo) pair.b).a, this.s);
        }
    }
}
