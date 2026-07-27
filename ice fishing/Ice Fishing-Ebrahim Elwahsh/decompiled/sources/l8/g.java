package l8;

import com.anythink.core.api.ATCustomRuleKeys;
import com.anythink.expressad.atsignalcommon.commonwebview.ToolBar;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final C4712d[] f39129a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f39130b;

    static {
        C4712d c4712d = new C4712d(C4712d.i, "");
        u8.h hVar = C4712d.f39108f;
        C4712d c4712d2 = new C4712d(hVar, "GET");
        C4712d c4712d3 = new C4712d(hVar, "POST");
        u8.h hVar2 = C4712d.f39109g;
        C4712d c4712d4 = new C4712d(hVar2, "/");
        C4712d c4712d5 = new C4712d(hVar2, "/index.html");
        u8.h hVar3 = C4712d.f39110h;
        C4712d c4712d6 = new C4712d(hVar3, "http");
        C4712d c4712d7 = new C4712d(hVar3, "https");
        u8.h hVar4 = C4712d.f39107e;
        C4712d[] c4712dArr = {c4712d, c4712d2, c4712d3, c4712d4, c4712d5, c4712d6, c4712d7, new C4712d(hVar4, "200"), new C4712d(hVar4, "204"), new C4712d(hVar4, "206"), new C4712d(hVar4, "304"), new C4712d(hVar4, "400"), new C4712d(hVar4, "404"), new C4712d(hVar4, "500"), new C4712d("accept-charset", ""), new C4712d("accept-encoding", "gzip, deflate"), new C4712d("accept-language", ""), new C4712d("accept-ranges", ""), new C4712d("accept", ""), new C4712d("access-control-allow-origin", ""), new C4712d(ATCustomRuleKeys.AGE, ""), new C4712d("allow", ""), new C4712d("authorization", ""), new C4712d("cache-control", ""), new C4712d("content-disposition", ""), new C4712d("content-encoding", ""), new C4712d("content-language", ""), new C4712d("content-length", ""), new C4712d("content-location", ""), new C4712d("content-range", ""), new C4712d("content-type", ""), new C4712d("cookie", ""), new C4712d("date", ""), new C4712d("etag", ""), new C4712d("expect", ""), new C4712d("expires", ""), new C4712d("from", ""), new C4712d("host", ""), new C4712d("if-match", ""), new C4712d("if-modified-since", ""), new C4712d("if-none-match", ""), new C4712d("if-range", ""), new C4712d("if-unmodified-since", ""), new C4712d("last-modified", ""), new C4712d("link", ""), new C4712d("location", ""), new C4712d("max-forwards", ""), new C4712d("proxy-authenticate", ""), new C4712d("proxy-authorization", ""), new C4712d("range", ""), new C4712d("referer", ""), new C4712d(ToolBar.REFRESH, ""), new C4712d("retry-after", ""), new C4712d("server", ""), new C4712d("set-cookie", ""), new C4712d("strict-transport-security", ""), new C4712d("transfer-encoding", ""), new C4712d("user-agent", ""), new C4712d("vary", ""), new C4712d("via", ""), new C4712d("www-authenticate", "")};
        f39129a = c4712dArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(c4712dArr[i].f39111a)) {
                linkedHashMap.put(c4712dArr[i].f39111a, Integer.valueOf(i));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.h.d(unmodifiableMap, "unmodifiableMap(...)");
        f39130b = unmodifiableMap;
    }

    public static void a(u8.h name) {
        kotlin.jvm.internal.h.e(name, "name");
        int a9 = name.a();
        for (int i = 0; i < a9; i++) {
            byte e6 = name.e(i);
            if (65 <= e6 && e6 < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(name.l()));
            }
        }
    }
}
