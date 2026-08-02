package defpackage;

import android.net.ConnectivityManager;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class btj implements atj {
    public final dtj a;
    public final wm b;
    public final x3r c;

    public btj(dtj dtjVar, wm wmVar) {
        this.a = dtjVar;
        this.b = wmVar;
        y8p b = dtjVar.b("New Session Custom");
        b.m();
        this.c = b.f();
    }

    @Override // defpackage.wib
    public final void a(nnd nndVar) {
        String str = (String) nndVar.b;
        String k0 = StringsKt.k0(str, "EVENTUS_", str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : uah.q(this.b.b).entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        y8p b = this.a.b(k0);
        b.k(this.c.c);
        b.m();
        for (Map.Entry entry2 : ((LinkedHashMap) nndVar.c).entrySet()) {
            linkedHashMap.put(entry2.getKey(), entry2.getValue().toString());
        }
        b.j(linkedHashMap);
        b.f();
    }

    @Override // defpackage.atj
    public final List b(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : uah.q(this.b.b).entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        y8p b = this.a.b(str);
        b.k(this.c.c);
        b.m();
        b.j(linkedHashMap);
        x3r f = b.f();
        return u75.h(new Pair("traceparent", hrg.s("00-", f.d, "-", f.b, "-01")), new Pair("X-Request-ID", eta.e()));
    }

    @Override // defpackage.b0j
    public final mif c(e1j e1jVar) {
        e1jVar.getClass();
        String b = e1jVar.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : uah.q(this.b.b).entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        y8p b2 = this.a.b(b);
        b2.k(this.c.c);
        b2.m();
        b2.j(linkedHashMap);
        x3r f = b2.f();
        String str = f.d;
        String str2 = f.b;
        q0j method = e1jVar.method();
        String b3 = e1jVar.b();
        z9h d = e1jVar.d();
        z9h a = e1jVar.a();
        z9h c = e1jVar.c();
        String s = hrg.s("00-", str, "-", str2, "-01");
        c.getClass();
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        c.j("X-Request-ID", uuid);
        c.j("traceparent", s);
        return nif.d(new uyo(method, b3, d, a, c, e1jVar.encoding()));
    }

    @Override // defpackage.atj
    public final void d() {
        dtj dtjVar = this.a;
        jp0 jp0Var = dtjVar.f;
        ((ConnectivityManager) jp0Var.f).unregisterNetworkCallback((xd0) jp0Var.g);
        jp0Var.a = false;
        mm6 mm6Var = (mm6) jp0Var.b;
        dq7 dq7Var = ca8.a;
        x97.y(mm6Var, mn7.d, null, new fmt(jp0Var, null, 0), 2);
        tnm tnmVar = dtjVar.e;
        rar rarVar = (rar) tnmVar.f;
        if (rarVar != null) {
            rarVar.g(null);
        }
        tnmVar.f = null;
    }
}
