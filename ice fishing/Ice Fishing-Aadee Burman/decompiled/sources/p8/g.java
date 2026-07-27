package p8;

import com.anythink.core.api.ATCustomRuleKeys;
import com.anythink.expressad.atsignalcommon.commonwebview.ToolBar;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final C4858d[] f39846a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f39847b;

    static {
        C4858d c4858d = new C4858d(C4858d.i, "");
        y8.h hVar = C4858d.f39825f;
        C4858d c4858d2 = new C4858d(hVar, "GET");
        C4858d c4858d3 = new C4858d(hVar, "POST");
        y8.h hVar2 = C4858d.f39826g;
        C4858d c4858d4 = new C4858d(hVar2, "/");
        C4858d c4858d5 = new C4858d(hVar2, "/index.html");
        y8.h hVar3 = C4858d.f39827h;
        C4858d c4858d6 = new C4858d(hVar3, "http");
        C4858d c4858d7 = new C4858d(hVar3, "https");
        y8.h hVar4 = C4858d.f39824e;
        C4858d[] c4858dArr = {c4858d, c4858d2, c4858d3, c4858d4, c4858d5, c4858d6, c4858d7, new C4858d(hVar4, "200"), new C4858d(hVar4, "204"), new C4858d(hVar4, "206"), new C4858d(hVar4, "304"), new C4858d(hVar4, "400"), new C4858d(hVar4, "404"), new C4858d(hVar4, "500"), new C4858d("accept-charset", ""), new C4858d("accept-encoding", "gzip, deflate"), new C4858d("accept-language", ""), new C4858d("accept-ranges", ""), new C4858d("accept", ""), new C4858d("access-control-allow-origin", ""), new C4858d(ATCustomRuleKeys.AGE, ""), new C4858d("allow", ""), new C4858d("authorization", ""), new C4858d("cache-control", ""), new C4858d("content-disposition", ""), new C4858d("content-encoding", ""), new C4858d("content-language", ""), new C4858d("content-length", ""), new C4858d("content-location", ""), new C4858d("content-range", ""), new C4858d("content-type", ""), new C4858d("cookie", ""), new C4858d("date", ""), new C4858d("etag", ""), new C4858d("expect", ""), new C4858d("expires", ""), new C4858d("from", ""), new C4858d("host", ""), new C4858d("if-match", ""), new C4858d("if-modified-since", ""), new C4858d("if-none-match", ""), new C4858d("if-range", ""), new C4858d("if-unmodified-since", ""), new C4858d("last-modified", ""), new C4858d("link", ""), new C4858d("location", ""), new C4858d("max-forwards", ""), new C4858d("proxy-authenticate", ""), new C4858d("proxy-authorization", ""), new C4858d("range", ""), new C4858d("referer", ""), new C4858d(ToolBar.REFRESH, ""), new C4858d("retry-after", ""), new C4858d("server", ""), new C4858d("set-cookie", ""), new C4858d("strict-transport-security", ""), new C4858d("transfer-encoding", ""), new C4858d("user-agent", ""), new C4858d("vary", ""), new C4858d("via", ""), new C4858d("www-authenticate", "")};
        f39846a = c4858dArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(c4858dArr[i].f39828a)) {
                linkedHashMap.put(c4858dArr[i].f39828a, Integer.valueOf(i));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.h.d(unmodifiableMap, "unmodifiableMap(...)");
        f39847b = unmodifiableMap;
    }

    public static void a(y8.h name) {
        kotlin.jvm.internal.h.e(name, "name");
        int a9 = name.a();
        for (int i = 0; i < a9; i++) {
            byte e9 = name.e(i);
            if (65 <= e9 && e9 < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(name.l()));
            }
        }
    }
}
