package defpackage;

import com.connectsdk.etc.helper.HttpMessage;
import com.connectsdk.service.command.ServiceCommand;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import okhttp3.OkHttpClient;

/* loaded from: classes5.dex */
public final class xo7 implements xyi {
    public final uif a;
    public final nzi b;
    public final ozw c;
    public final uif d;
    public final uif e;
    public final OkHttpClient f;
    public final hg3 g;

    /* JADX WARN: Multi-variable type inference failed */
    public xo7(Function0 function0, nzi nziVar, ozw ozwVar, ryc rycVar, vyc vycVar) {
        this.a = (uif) function0;
        this.b = nziVar;
        this.c = ozwVar;
        this.d = (uif) rycVar;
        this.e = (uif) vycVar;
        joj jojVar = new joj();
        if (nziVar.a) {
            y6e y6eVar = new y6e();
            y6eVar.c = 4;
            jojVar.c.add(y6eVar);
        }
        Iterator it = nziVar.c.iterator();
        while (it.hasNext()) {
            jojVar.a((bse) it.next());
        }
        this.b.getClass();
        this.b.b.v(jojVar);
        this.b.getClass();
        hg3 hg3Var = new hg3(new f4s(zdg.r("com.yandex.infra.NetworkRequestExecutor"), 1), 0);
        z98 z98Var = new z98();
        z98Var.c = hg3Var;
        z98Var.m(1);
        jojVar.a = z98Var;
        this.f = new OkHttpClient(jojVar);
        this.g = new hg3();
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [kotlin.jvm.functions.Function0, uif] */
    public final d0o a(e1j e1jVar) {
        Object obj;
        qne qneVar;
        u7e u7eVar;
        String str;
        s0o encoding = e1jVar.encoding();
        q0j method = e1jVar.method();
        z9h d = e1jVar.d();
        Set set = u0o.a;
        ozw ozwVar = this.c;
        ozwVar.getClass();
        encoding.getClass();
        method.getClass();
        d.getClass();
        int ordinal = encoding.a().ordinal();
        String str2 = ServiceCommand.TYPE_GET;
        if (ordinal == 0) {
            Set set2 = u0o.a;
            int ordinal2 = method.ordinal();
            if (ordinal2 == 0) {
                obj = ServiceCommand.TYPE_GET;
            } else {
                if (ordinal2 != 1) {
                    b6e.s();
                    return null;
                }
                obj = ServiceCommand.TYPE_POST;
            }
            if (set2.contains(obj)) {
                Serializable A = xee.A(d);
                A.getClass();
                qneVar = new qne((Map) A, (h0o) null);
            } else {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Serializable A2 = xee.A(d);
                A2.getClass();
                for (Map.Entry entry : new TreeMap((Map) A2).entrySet()) {
                    String str3 = (String) entry.getKey();
                    String r0 = bkp.r0(entry.getValue());
                    if (r0 != null) {
                        str3.getClass();
                        arrayList.add(ofc.g(str3, false, " \"':;<=>@[]^`{}|/\\?#&!$(),~", 0, 0, 91));
                        arrayList2.add(ofc.g(r0, false, " \"':;<=>@[]^`{}|/\\?#&!$(),~", 0, 0, 91));
                    }
                }
                zrc zrcVar = new zrc(arrayList, arrayList2);
                e5b e5bVar = e5b.a;
                e5bVar.getClass();
                qneVar = new qne((Map) e5bVar, (h0o) zrcVar);
            }
        } else {
            if (ordinal != 1) {
                b6e.s();
                return null;
            }
            y7o C = ozwVar.C(d);
            if (C.b()) {
                LinkedHashMap linkedHashMap = sqg.a;
                r7w r7wVar = C.b;
                up6.D(r7wVar);
                uwf.l("Error building JSON POST request body: " + r7wVar.getMessage());
                str = "";
            } else {
                str = (String) C.a();
            }
            Pattern pattern = twh.e;
            g0o b = ybl.b(str, q5g.C("application/json"));
            e5b e5bVar2 = e5b.a;
            e5bVar2.getClass();
            qneVar = new qne((Map) e5bVar2, (h0o) b);
        }
        h0o h0oVar = (h0o) qneVar.b;
        URL url = (URL) this.a.invoke();
        url.getClass();
        String url2 = url.toString();
        url2.getClass();
        try {
            s7e s7eVar = new s7e();
            s7eVar.h(null, url2);
            u7eVar = s7eVar.e();
        } catch (IllegalArgumentException unused) {
            u7eVar = null;
        }
        u7eVar.getClass();
        s7e f = u7eVar.f();
        String b2 = e1jVar.b();
        b2.getClass();
        f.c(b2, false);
        Serializable A3 = xee.A(e1jVar.a());
        A3.getClass();
        for (Map.Entry entry2 : uah.i((Map) A3, (Map) qneVar.a).entrySet()) {
            String str4 = (String) entry2.getKey();
            String r02 = bkp.r0(entry2.getValue());
            if (r02 != null) {
                f.d(str4, r02);
            }
        }
        b0o b0oVar = new b0o();
        b0oVar.a = f.e();
        b0oVar.a("Connection", "keep-alive");
        if (h0oVar != null) {
            b0oVar.a(HttpMessage.CONTENT_TYPE_HEADER, String.valueOf(h0oVar.b()));
        }
        Serializable A4 = xee.A(e1jVar.c());
        A4.getClass();
        for (Map.Entry entry3 : ((Map) A4).entrySet()) {
            String str5 = (String) entry3.getKey();
            String r03 = bkp.r0(entry3.getValue());
            if (r03 != null) {
                b0oVar.a(str5, r03);
            }
        }
        q0j method2 = e1jVar.method();
        method2.getClass();
        int ordinal3 = method2.ordinal();
        if (ordinal3 != 0) {
            if (ordinal3 != 1) {
                b6e.s();
                return null;
            }
            str2 = ServiceCommand.TYPE_POST;
        }
        b0oVar.e(str2, h0oVar);
        return b0oVar.b();
    }
}
