package Q1;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final C0080c[] f1597a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f1598b;

    static {
        C0080c c0080c = new C0080c(C0080c.f1577i, "");
        W1.j jVar = C0080c.f1574f;
        C0080c c0080c2 = new C0080c(jVar, "GET");
        C0080c c0080c3 = new C0080c(jVar, "POST");
        W1.j jVar2 = C0080c.f1575g;
        C0080c c0080c4 = new C0080c(jVar2, "/");
        C0080c c0080c5 = new C0080c(jVar2, "/index.html");
        W1.j jVar3 = C0080c.f1576h;
        C0080c c0080c6 = new C0080c(jVar3, "http");
        C0080c c0080c7 = new C0080c(jVar3, "https");
        W1.j jVar4 = C0080c.f1573e;
        C0080c[] c0080cArr = {c0080c, c0080c2, c0080c3, c0080c4, c0080c5, c0080c6, c0080c7, new C0080c(jVar4, "200"), new C0080c(jVar4, "204"), new C0080c(jVar4, "206"), new C0080c(jVar4, "304"), new C0080c(jVar4, "400"), new C0080c(jVar4, "404"), new C0080c(jVar4, "500"), new C0080c("accept-charset", ""), new C0080c("accept-encoding", "gzip, deflate"), new C0080c("accept-language", ""), new C0080c("accept-ranges", ""), new C0080c("accept", ""), new C0080c("access-control-allow-origin", ""), new C0080c("age", ""), new C0080c("allow", ""), new C0080c("authorization", ""), new C0080c("cache-control", ""), new C0080c("content-disposition", ""), new C0080c("content-encoding", ""), new C0080c("content-language", ""), new C0080c("content-length", ""), new C0080c("content-location", ""), new C0080c("content-range", ""), new C0080c("content-type", ""), new C0080c("cookie", ""), new C0080c("date", ""), new C0080c("etag", ""), new C0080c("expect", ""), new C0080c("expires", ""), new C0080c("from", ""), new C0080c("host", ""), new C0080c("if-match", ""), new C0080c("if-modified-since", ""), new C0080c("if-none-match", ""), new C0080c("if-range", ""), new C0080c("if-unmodified-since", ""), new C0080c("last-modified", ""), new C0080c("link", ""), new C0080c("location", ""), new C0080c("max-forwards", ""), new C0080c("proxy-authenticate", ""), new C0080c("proxy-authorization", ""), new C0080c("range", ""), new C0080c("referer", ""), new C0080c("refresh", ""), new C0080c("retry-after", ""), new C0080c("server", ""), new C0080c("set-cookie", ""), new C0080c("strict-transport-security", ""), new C0080c("transfer-encoding", ""), new C0080c("user-agent", ""), new C0080c("vary", ""), new C0080c("via", ""), new C0080c("www-authenticate", "")};
        f1597a = c0080cArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        int i2 = 0;
        while (i2 < 61) {
            int i3 = i2 + 1;
            if (!linkedHashMap.containsKey(c0080cArr[i2].f1578a)) {
                linkedHashMap.put(c0080cArr[i2].f1578a, Integer.valueOf(i2));
            }
            i2 = i3;
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.i.d(unmodifiableMap, "unmodifiableMap(result)");
        f1598b = unmodifiableMap;
    }

    public static void a(W1.j name) {
        kotlin.jvm.internal.i.e(name, "name");
        int a2 = name.a();
        int i2 = 0;
        while (i2 < a2) {
            int i3 = i2 + 1;
            byte d2 = name.d(i2);
            if (65 <= d2 && d2 <= 90) {
                throw new IOException(kotlin.jvm.internal.i.h(name.h(), "PROTOCOL_ERROR response malformed: mixed case name: "));
            }
            i2 = i3;
        }
    }
}
