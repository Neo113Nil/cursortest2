package defpackage;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.navigation.screen.c;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.LinkedHashMap;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.credentials.e;

/* loaded from: classes12.dex */
public final class yrv0 {
    public final lx4 a;
    public final sh41 b;
    public final fva0 c;
    public final c d;
    public final e e;
    public final v8w0 f;
    public final LinkedHashMap g = new LinkedHashMap();
    public esv0 h = esv0.d;

    public yrv0(lx4 lx4Var, sh41 sh41Var, fva0 fva0Var, c cVar, e eVar, v8w0 v8w0Var) {
        this.a = lx4Var;
        this.b = sh41Var;
        this.c = fva0Var;
        this.d = cVar;
        this.e = eVar;
        this.f = v8w0Var;
    }

    public final wrv0 a(h1p h1pVar) {
        LinkedHashMap linkedHashMap = this.g;
        Object obj = linkedHashMap.get(h1pVar);
        if (obj == null) {
            obj = new wrv0();
            linkedHashMap.put(h1pVar, obj);
        }
        return (wrv0) obj;
    }

    public final String b() {
        Screen b = this.d.b();
        int i = xrv0.a[b.ordinal()];
        if (i == 1) {
            return "Ride";
        }
        if (i == 2 || i == 3 || i == 4) {
            return "AddressSelection";
        }
        if (b == Screen.NONE || b == Screen.UNSUPPORTED) {
            return null;
        }
        return b.b();
    }

    public final void c(String str, h1p h1pVar, rx3 rx3Var) {
        i d = ((j) this.a).d(str);
        String b = b();
        LinkedHashMap linkedHashMap = d.a;
        linkedHashMap.put("originScreen", b);
        linkedHashMap.put(Constants.KEY_SERVICE, h1pVar.getValue());
        if (rx3Var != null) {
            rx3Var.invoke(d);
        }
        d.m();
    }

    public final void d(h1p h1pVar, wrv0 wrv0Var) {
        if (wrv0Var.d == null || wrv0Var.b == null || wrv0Var.e == null || wrv0Var.c == null) {
            return;
        }
        i d = ((j) this.a).d("Superapp.Showcase.ErrorShown");
        LinkedHashMap linkedHashMap = d.a;
        linkedHashMap.put("originScreen", b());
        linkedHashMap.put(Constants.KEY_SERVICE, h1pVar.getValue());
        d.g("is_disabled", true);
        linkedHashMap.put("error_reason", wrv0Var.d);
        linkedHashMap.put("error_source", wrv0Var.b);
        linkedHashMap.put("error_message", wrv0Var.e);
        linkedHashMap.put("error_url", wrv0Var.c);
        d.e = true;
        d.m();
    }
}
