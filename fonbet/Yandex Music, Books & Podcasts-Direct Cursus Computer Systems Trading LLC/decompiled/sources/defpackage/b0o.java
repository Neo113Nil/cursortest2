package defpackage;

import com.connectsdk.service.command.ServiceCommand;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.c;

/* loaded from: classes5.dex */
public final class b0o {
    public u7e a;
    public h0o d;
    public LinkedHashMap e = new LinkedHashMap();
    public String b = ServiceCommand.TYPE_GET;
    public pv9 c = new pv9(9);

    public final void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.c.e(str, str2);
    }

    public final d0o b() {
        Map unmodifiableMap;
        u7e u7eVar = this.a;
        if (u7eVar == null) {
            xq0.q("url == null");
            return null;
        }
        String str = this.b;
        zvd r = this.c.r();
        h0o h0oVar = this.d;
        LinkedHashMap linkedHashMap = this.e;
        byte[] bArr = cvt.a;
        linkedHashMap.getClass();
        if (linkedHashMap.isEmpty()) {
            unmodifiableMap = e5b.a;
            unmodifiableMap.getClass();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            unmodifiableMap.getClass();
        }
        return new d0o(u7eVar, str, r, h0oVar, unmodifiableMap);
    }

    public final void c(cp3 cp3Var) {
        cp3Var.getClass();
        String cp3Var2 = cp3Var.toString();
        if (cp3Var2.length() == 0) {
            this.c.I("Cache-Control");
        } else {
            d("Cache-Control", cp3Var2);
        }
    }

    public final void d(String str, String str2) {
        str.getClass();
        str2.getClass();
        pv9 pv9Var = this.c;
        pv9Var.getClass();
        qwp.D(str);
        qwp.G(str2, str);
        pv9Var.I(str);
        pv9Var.m(str, str2);
    }

    public final void e(String str, h0o h0oVar) {
        str.getClass();
        if (str.length() <= 0) {
            xq0.x("method.isEmpty() == true");
            return;
        }
        if (h0oVar == null) {
            if (str.equals(ServiceCommand.TYPE_POST) || str.equals(ServiceCommand.TYPE_PUT) || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                xq0.o(hrg.q("method ", str, " must have a request body."));
                return;
            }
        } else if (!sj2.A(str)) {
            xq0.o(hrg.q("method ", str, " must not have a request body."));
            return;
        }
        this.b = str;
        this.d = h0oVar;
    }

    public final void f(Class cls, Object obj) {
        cls.getClass();
        LinkedHashMap linkedHashMap = this.e;
        if (obj == null) {
            linkedHashMap.remove(cls);
            return;
        }
        if (linkedHashMap.isEmpty()) {
            this.e = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap2 = this.e;
        Object cast = cls.cast(obj);
        cast.getClass();
        linkedHashMap2.put(cls, cast);
    }

    public final void g(String str) {
        str.getClass();
        if (c.v(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (c.v(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        s7e s7eVar = new s7e();
        s7eVar.h(null, str);
        this.a = s7eVar.e();
    }
}
