package defpackage;

import com.connectsdk.discovery.provider.ssdp.SSDPDeviceDescriptionParser;
import com.connectsdk.service.airplay.PListParser;
import com.connectsdk.service.command.ServiceCommand;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class u4e {
    public static final pn3 a;
    public static final vtd[] b;
    public static final Map c;

    static {
        pn3 pn3Var = pn3.d;
        a = ovn.C(StringUtils.PROCESS_POSTFIX_DELIMITER);
        vtd vtdVar = new vtd(vtd.h, "");
        pn3 pn3Var2 = vtd.e;
        vtd vtdVar2 = new vtd(pn3Var2, ServiceCommand.TYPE_GET);
        vtd vtdVar3 = new vtd(pn3Var2, ServiceCommand.TYPE_POST);
        pn3 pn3Var3 = vtd.f;
        vtd vtdVar4 = new vtd(pn3Var3, "/");
        vtd vtdVar5 = new vtd(pn3Var3, "/index.html");
        pn3 pn3Var4 = vtd.g;
        vtd vtdVar6 = new vtd(pn3Var4, "http");
        vtd vtdVar7 = new vtd(pn3Var4, "https");
        pn3 pn3Var5 = vtd.d;
        vtd[] vtdVarArr = {vtdVar, vtdVar2, vtdVar3, vtdVar4, vtdVar5, vtdVar6, vtdVar7, new vtd(pn3Var5, "200"), new vtd(pn3Var5, "204"), new vtd(pn3Var5, "206"), new vtd(pn3Var5, "304"), new vtd(pn3Var5, "400"), new vtd(pn3Var5, "404"), new vtd(pn3Var5, "500"), new vtd("accept-charset", ""), new vtd("accept-encoding", "gzip, deflate"), new vtd("accept-language", ""), new vtd("accept-ranges", ""), new vtd("accept", ""), new vtd("access-control-allow-origin", ""), new vtd("age", ""), new vtd("allow", ""), new vtd("authorization", ""), new vtd("cache-control", ""), new vtd("content-disposition", ""), new vtd("content-encoding", ""), new vtd("content-language", ""), new vtd("content-length", ""), new vtd("content-location", ""), new vtd("content-range", ""), new vtd("content-type", ""), new vtd("cookie", ""), new vtd(PListParser.TAG_DATE, ""), new vtd("etag", ""), new vtd("expect", ""), new vtd("expires", ""), new vtd("from", ""), new vtd("host", ""), new vtd("if-match", ""), new vtd("if-modified-since", ""), new vtd("if-none-match", ""), new vtd("if-range", ""), new vtd("if-unmodified-since", ""), new vtd("last-modified", ""), new vtd("link", ""), new vtd(SSDPDeviceDescriptionParser.TAG_LOCATION, ""), new vtd("max-forwards", ""), new vtd("proxy-authenticate", ""), new vtd("proxy-authorization", ""), new vtd("range", ""), new vtd("referer", ""), new vtd("refresh", ""), new vtd("retry-after", ""), new vtd("server", ""), new vtd("set-cookie", ""), new vtd("strict-transport-security", ""), new vtd("transfer-encoding", ""), new vtd("user-agent", ""), new vtd("vary", ""), new vtd("via", ""), new vtd("www-authenticate", "")};
        b = vtdVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(vtdVarArr[i].a)) {
                linkedHashMap.put(vtdVarArr[i].a, Integer.valueOf(i));
            }
        }
        c = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void a(pn3 pn3Var) {
        int d = pn3Var.d();
        for (int i = 0; i < d; i++) {
            byte k = pn3Var.k(i);
            if (k >= 65 && k <= 90) {
                kac.f("PROTOCOL_ERROR response malformed: mixed case name: ".concat(pn3Var.u()));
                return;
            }
        }
    }
}
