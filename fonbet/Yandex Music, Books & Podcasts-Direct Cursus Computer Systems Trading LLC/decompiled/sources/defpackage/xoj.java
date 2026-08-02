package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class xoj implements bse {
    public static final Charset c = Charset.forName("UTF-8");
    public final voj a;
    public final Function1 b;

    public xoj(voj vojVar, Function1 function1) {
        this.a = vojVar;
        this.b = function1;
    }

    @Override // defpackage.bse
    public final l3o b(ukn uknVar) {
        izm izmVar;
        d0o d0oVar = (d0o) uknVar.i;
        voj vojVar = voj.a;
        voj vojVar2 = this.a;
        if (vojVar2 == vojVar) {
            return uknVar.f(d0oVar);
        }
        AtomicInteger atomicInteger = woj.b;
        b0o b = d0oVar.b();
        String hexString = Integer.toHexString(woj.b.incrementAndGet());
        hexString.getClass();
        String upperCase = hexString.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        b.f(woj.class, new woj(StringsKt.X(8, upperCase)));
        d0o b2 = b.b();
        h0o h0oVar = b2.d;
        cib cibVar = new cib(19);
        evj evjVar = (evj) uknVar.h;
        okn oknVar = evjVar != null ? (okn) evjVar.f : null;
        if (oknVar != null) {
            izmVar = oknVar.f;
            izmVar.getClass();
        } else {
            izmVar = null;
        }
        if (izmVar == null) {
            izmVar = izm.HTTP_1_1;
        }
        zvd zvdVar = b2.c;
        String str = b2.b + StringUtil.SPACE + b2.a;
        cibVar.C(zwf.G(b2) + " --> " + str + StringUtil.SPACE + izmVar + StringUtil.SPACE + (h0oVar == null ? "(no body)" : b3i.W(h0oVar.a(), h0oVar.b())));
        voj vojVar3 = voj.c;
        if (vojVar2 == vojVar3 || vojVar2 == voj.d) {
            b3i.o(cibVar, zvdVar);
        }
        if (h0oVar != null && vojVar2 == voj.d) {
            Pattern pattern = uoj.f;
            boolean G = weo.G(b2);
            hi3 hi3Var = new hi3();
            h0oVar.d(hi3Var);
            new uoj(hi3Var, h0oVar.b(), zvdVar.a("Content-Encoding"), true, G).a(cibVar);
        }
        cibVar.C(zwf.G(b2) + " --> END " + str);
        String sb = ((StringBuilder) cibVar.b).toString();
        Function1 function1 = this.b;
        function1.invoke(sb);
        long nanoTime = System.nanoTime();
        try {
            l3o f = uknVar.f(b2);
            zvd zvdVar2 = f.f;
            long nanoTime2 = (System.nanoTime() - nanoTime) / 1000000;
            cib cibVar2 = new cib(19);
            o3o o3oVar = f.g;
            int i = f.d;
            String str2 = f.c;
            d0o d0oVar2 = f.a;
            String str3 = i + StringUtil.SPACE + str2 + StringUtil.SPACE + d0oVar2.b;
            String e = dfi.e(nanoTime2, "(", "ms)");
            String G2 = zwf.G(d0oVar2);
            u7e u7eVar = d0oVar2.a;
            String W = o3oVar != null ? b3i.W(o3oVar.g(), o3oVar.o()) : "(no body)";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(G2);
            sb2.append(" <-- ");
            sb2.append(str3);
            sb2.append(StringUtil.SPACE);
            sb2.append(u7eVar);
            cibVar2.C(ouj.q(sb2, StringUtil.SPACE, e, StringUtil.SPACE, W));
            if (vojVar2 == vojVar3 || vojVar2 == voj.d) {
                b3i.o(cibVar2, zvdVar2);
            }
            if (weo.G(d0oVar2)) {
                if (vojVar2 != voj.d || o3oVar == null) {
                    String a = zvdVar2.a("x-request-id");
                    cibVar2.C("req-id: " + (a == null ? null : a));
                } else {
                    Pattern pattern2 = uoj.f;
                    x2i.X(f, true, true).a(cibVar2);
                }
            } else if (o3oVar != null) {
                Pattern pattern3 = uoj.f;
                x2i.X(f, vojVar2 == voj.d, false).a(cibVar2);
            }
            cibVar2.C("<-- END HTTP");
            function1.invoke(((StringBuilder) cibVar2.b).toString());
            return f;
        } catch (Exception e2) {
            AtomicInteger atomicInteger2 = woj.b;
            function1.invoke(zwf.G(b2) + " <-- HTTP FAILED: " + e2);
            throw e2;
        }
    }
}
