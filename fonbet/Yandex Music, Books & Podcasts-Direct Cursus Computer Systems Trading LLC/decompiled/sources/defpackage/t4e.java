package defpackage;

import com.connectsdk.discovery.provider.ssdp.SSDPDeviceDescriptionParser;
import com.connectsdk.service.airplay.PListParser;
import com.connectsdk.service.command.ServiceCommand;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class t4e {
    public static final wtd[] a;
    public static final Map b;

    static {
        wtd wtdVar = new wtd(wtd.i, "");
        pn3 pn3Var = wtd.f;
        wtd wtdVar2 = new wtd(pn3Var, ServiceCommand.TYPE_GET);
        wtd wtdVar3 = new wtd(pn3Var, ServiceCommand.TYPE_POST);
        pn3 pn3Var2 = wtd.g;
        wtd wtdVar4 = new wtd(pn3Var2, "/");
        wtd wtdVar5 = new wtd(pn3Var2, "/index.html");
        pn3 pn3Var3 = wtd.h;
        wtd wtdVar6 = new wtd(pn3Var3, "http");
        wtd wtdVar7 = new wtd(pn3Var3, "https");
        pn3 pn3Var4 = wtd.e;
        wtd[] wtdVarArr = {wtdVar, wtdVar2, wtdVar3, wtdVar4, wtdVar5, wtdVar6, wtdVar7, new wtd(pn3Var4, "200"), new wtd(pn3Var4, "204"), new wtd(pn3Var4, "206"), new wtd(pn3Var4, "304"), new wtd(pn3Var4, "400"), new wtd(pn3Var4, "404"), new wtd(pn3Var4, "500"), new wtd("accept-charset", ""), new wtd("accept-encoding", "gzip, deflate"), new wtd("accept-language", ""), new wtd("accept-ranges", ""), new wtd("accept", ""), new wtd("access-control-allow-origin", ""), new wtd("age", ""), new wtd("allow", ""), new wtd("authorization", ""), new wtd("cache-control", ""), new wtd("content-disposition", ""), new wtd("content-encoding", ""), new wtd("content-language", ""), new wtd("content-length", ""), new wtd("content-location", ""), new wtd("content-range", ""), new wtd("content-type", ""), new wtd("cookie", ""), new wtd(PListParser.TAG_DATE, ""), new wtd("etag", ""), new wtd("expect", ""), new wtd("expires", ""), new wtd("from", ""), new wtd("host", ""), new wtd("if-match", ""), new wtd("if-modified-since", ""), new wtd("if-none-match", ""), new wtd("if-range", ""), new wtd("if-unmodified-since", ""), new wtd("last-modified", ""), new wtd("link", ""), new wtd(SSDPDeviceDescriptionParser.TAG_LOCATION, ""), new wtd("max-forwards", ""), new wtd("proxy-authenticate", ""), new wtd("proxy-authorization", ""), new wtd("range", ""), new wtd("referer", ""), new wtd("refresh", ""), new wtd("retry-after", ""), new wtd("server", ""), new wtd("set-cookie", ""), new wtd("strict-transport-security", ""), new wtd("transfer-encoding", ""), new wtd("user-agent", ""), new wtd("vary", ""), new wtd("via", ""), new wtd("www-authenticate", "")};
        a = wtdVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(wtdVarArr[i].a)) {
                linkedHashMap.put(wtdVarArr[i].a, Integer.valueOf(i));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        b = unmodifiableMap;
    }

    public static void a(pn3 pn3Var) {
        pn3Var.getClass();
        int d = pn3Var.d();
        for (int i = 0; i < d; i++) {
            byte k = pn3Var.k(i);
            if (65 <= k && k < 91) {
                kac.f("PROTOCOL_ERROR response malformed: mixed case name: ".concat(pn3Var.u()));
                return;
            }
        }
    }
}
