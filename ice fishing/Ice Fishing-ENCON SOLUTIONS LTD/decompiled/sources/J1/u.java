package J1;

import android.util.Base64;
import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import u0.AbstractC1050a;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f971a;

    /* renamed from: b, reason: collision with root package name */
    public String f972b;

    /* renamed from: c, reason: collision with root package name */
    public Object f973c;

    /* renamed from: d, reason: collision with root package name */
    public Object f974d;

    /* renamed from: e, reason: collision with root package name */
    public Object f975e;

    /* renamed from: f, reason: collision with root package name */
    public Serializable f976f;

    public v a() {
        Map unmodifiableMap;
        o oVar = (o) this.f973c;
        if (oVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = this.f972b;
        m b2 = ((l) this.f974d).b();
        w wVar = (w) this.f975e;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f976f;
        byte[] bArr = K1.b.f1051a;
        kotlin.jvm.internal.i.e(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            unmodifiableMap = i1.s.f3417a;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            kotlin.jvm.internal.i.d(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new v(oVar, str, b2, wVar, unmodifiableMap);
    }

    public void b(String str, String value) {
        kotlin.jvm.internal.i.e(value, "value");
        l lVar = (l) this.f974d;
        lVar.getClass();
        AbstractC1050a.f(str);
        AbstractC1050a.g(value, str);
        lVar.d(str);
        lVar.a(str, value);
    }

    public void c(String method, w wVar) {
        kotlin.jvm.internal.i.e(method, "method");
        if (method.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (wVar == null) {
            if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("REPORT")) {
                throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
            }
        } else if (!R1.l.u(method)) {
            throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
        }
        this.f972b = method;
        this.f975e = wVar;
    }

    public void d(String url) {
        kotlin.jvm.internal.i.e(url, "url");
        if (z1.o.R(url, "ws:", true)) {
            String substring = url.substring(3);
            kotlin.jvm.internal.i.d(substring, "this as java.lang.String).substring(startIndex)");
            url = kotlin.jvm.internal.i.h(substring, "http:");
        } else if (z1.o.R(url, "wss:", true)) {
            String substring2 = url.substring(4);
            kotlin.jvm.internal.i.d(substring2, "this as java.lang.String).substring(startIndex)");
            url = kotlin.jvm.internal.i.h(substring2, "https:");
        }
        kotlin.jvm.internal.i.e(url, "<this>");
        n nVar = new n();
        nVar.c(null, url);
        this.f973c = nVar.a();
    }

    public String toString() {
        switch (this.f971a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + this.f972b + ", mProviderPackage: " + ((String) this.f973c) + ", mQuery: " + ((String) this.f974d) + ", mCertificates:");
                int i2 = 0;
                while (true) {
                    List list = (List) this.f975e;
                    if (i2 >= list.size()) {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                    sb.append(" [");
                    List list2 = (List) list.get(i2);
                    for (int i3 = 0; i3 < list2.size(); i3++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list2.get(i3), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                    i2++;
                }
            default:
                return super.toString();
        }
    }

    public u(String str, String str2, String str3, List list) {
        this.f971a = 1;
        this.f972b = str;
        this.f973c = str2;
        this.f974d = str3;
        list.getClass();
        this.f975e = list;
        this.f976f = str + "-" + str2 + "-" + str3;
    }

    public u() {
        this.f971a = 0;
        this.f976f = new LinkedHashMap();
        this.f972b = "GET";
        this.f974d = new l(0);
    }
}
