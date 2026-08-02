package yads;

import android.util.Base64;
import com.monetization.ads.network.core.Header;
import com.monetization.ads.network.core.Request;
import com.monetization.ads.network.core.toolbox.HttpResponse;
import com.monetization.ads.utils.logger.collectors.MobileAdsNetworkLogsCollector;
import defpackage.cvu0;
import defpackage.hm81;
import defpackage.o291;
import defpackage.rzo;
import defpackage.tls;
import defpackage.ua81;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class ys1 extends Lambda implements tls {
    public final /* synthetic */ o291 b;
    public final /* synthetic */ Map c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys1(o291 o291Var, HashMap hashMap) {
        super(1);
        this.b = o291Var;
        this.c = hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.Map] */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        byte[] bArr;
        ?? treeMap;
        Map<String, String> map;
        String str;
        String str2;
        Request request = (Request) obj;
        o291 o291Var = this.b;
        HttpResponse a = o291Var.a(request, this.c);
        o291Var.c.getClass();
        try {
            InputStream content = a.getContent();
            if (content != null) {
                try {
                    bArr = rzo.R(content);
                    content.close();
                } finally {
                }
            } else {
                bArr = new byte[0];
            }
        } catch (Exception unused) {
            bArr = new byte[0];
        }
        HttpResponse httpResponse = new HttpResponse(a.getStatusCode(), a.getHeaders(), bArr);
        int statusCode = httpResponse.getStatusCode();
        byte[] contentBytes = httpResponse.getContentBytes();
        List<Header> headers = httpResponse.getHeaders();
        String str3 = null;
        if (headers == null) {
            map = null;
        } else {
            if (headers.isEmpty()) {
                treeMap = Collections.EMPTY_MAP;
            } else {
                treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (Header header : headers) {
                    treeMap.put(header.getName(), header.getValue());
                }
            }
            map = treeMap;
        }
        if (headers != null) {
            Collections.unmodifiableList(headers);
        }
        long currentTimeMillis = System.currentTimeMillis();
        MobileAdsNetworkLogsCollector mobileAdsNetworkLogsCollector = hm81.a;
        byte[] body = request.getBody();
        if (body != null) {
            try {
                str = cvu0.q(body);
            } catch (Exception unused2) {
                str = "UNKNOWN_CONTENT";
            }
        } else {
            str = null;
        }
        if (contentBytes != null) {
            if (request instanceof ua81) {
                str3 = "IMAGE_CONTENT";
            } else {
                try {
                    str3 = cvu0.q(Base64.decode(contentBytes, 0));
                } catch (IllegalArgumentException unused3) {
                    str3 = cvu0.q(contentBytes);
                } catch (Exception unused4) {
                    str2 = "UNKNOWN_CONTENT";
                }
            }
        }
        str2 = str3;
        MobileAdsNetworkLogsCollector mobileAdsNetworkLogsCollector2 = hm81.a;
        int method = request.getMethod();
        mobileAdsNetworkLogsCollector2.writeLog(currentTimeMillis, method == 0 ? "GET" : method == 1 ? "POST" : method == 2 ? "PUT" : method == 3 ? "DELETE" : method == 4 ? "HEAD" : method == 5 ? "OPTIONS" : method == 6 ? "TRACE" : method == 7 ? "PATCH" : "UNKNOWN", request.getUrl(), request.getHeaders(), str, Integer.valueOf(statusCode), map, str2);
        return httpResponse;
    }
}
