package com.plaid.internal;

import android.text.TextUtils;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeSet;
import okio.Path$$ExternalSyntheticBUOutline0;

/* renamed from: com.plaid.internal.t1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0288t1 {
    public static final C0323x0 h;
    public final String a;
    public final URL b;
    public final HashMap c;
    public final LinkedHashMap d;
    public final String e;
    public String f;
    public boolean g;

    /* renamed from: com.plaid.internal.t1$a */
    public class a implements Comparator<String> {
        @Override // java.util.Comparator
        public final int compare(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            if ("host".equals(str3)) {
                return -1;
            }
            if ("host".equals(str4)) {
                return 1;
            }
            return str3.compareTo(str4);
        }
    }

    /* renamed from: com.plaid.internal.t1$b */
    public static class b {
        public final String a;
        public final boolean b;
        public final byte[] c;

        public b(String str, boolean z) {
            this.a = str;
            this.b = z;
            this.c = z ? AbstractC0306v1.a(str) : str.getBytes(StandardCharsets.UTF_8);
        }
    }

    static {
        W3 w3 = Z3.a;
        h = new C0323x0("http-request");
    }

    public C0288t1(URL url, String str) {
        String str2;
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        this.a = "HTTP/1.1";
        this.e = str.toUpperCase();
        this.b = url;
        this.d = AbstractC0306v1.b(url.toString());
        if (url.getPort() == -1) {
            str2 = url.getHost();
        } else {
            str2 = url.getHost() + ":" + url.getPort();
        }
        hashMap.put("host".toLowerCase(), str2);
        hashMap.put("connection".toLowerCase(), "close");
        hashMap.put("cache-control".toLowerCase(), "no-cache");
        hashMap.put("accept".toLowerCase(), "*/*");
        hashMap.put("accept-encoding".toLowerCase(), (String) C0154e1.c.a("http.accept-encoding", "gzip", String.class));
    }

    public final void a(OutputStream outputStream) {
        b bVar = new b("", false);
        if (this.e.equals("GET")) {
            h.a(W3.TRACE, "Sending GET Request", new Object[0]);
        } else if (this.e.equals("POST")) {
            h.a(W3.TRACE, "Sending POST Request", new Object[0]);
            String str = this.f;
            if (str != null && str.length() > 0) {
                bVar = new b(this.f, this.g);
                boolean z = this.g;
                HashMap hashMap = this.c;
                if (z) {
                    hashMap.put("content-encoding".toLowerCase(), "gzip");
                } else {
                    hashMap.remove("content-encoding");
                }
                this.c.put("content-length".toLowerCase(), String.valueOf(bVar.c.length));
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.e);
        sb.append(" ");
        String path = this.b.getPath();
        StringBuilder sb2 = new StringBuilder();
        boolean z2 = true;
        for (Map.Entry entry : this.d.entrySet()) {
            if (z2) {
                z2 = false;
            } else {
                sb2.append("&");
            }
            sb2.append((String) entry.getKey());
            sb2.append("=");
            try {
                sb2.append(URLEncoder.encode((String) entry.getValue(), "utf-8"));
            } catch (UnsupportedEncodingException e) {
                Path$$ExternalSyntheticBUOutline0.m((Throwable) e);
                return;
            }
        }
        String sb3 = sb2.toString();
        if (sb3.length() > 0) {
            path = this.b.getPath() + "?" + sb3;
        }
        if (path == null || path.length() == 0) {
            path = "/";
        }
        sb.append(path);
        sb.append(" ");
        a(outputStream, new b(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.a, "\r\n"), false));
        TreeSet treeSet = new TreeSet(new a());
        treeSet.addAll(this.c.keySet());
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            String[] split = str2.toLowerCase().split("-");
            LinkedList linkedList = new LinkedList();
            for (String str3 : split) {
                if (str3.length() > 0) {
                    str3 = str3.substring(0, 1).toUpperCase() + str3.substring(1);
                }
                linkedList.add(str3);
            }
            a(outputStream, new b(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m108m(TextUtils.join("-", linkedList), ": "), (String) this.c.get(str2), "\r\n"), false));
        }
        a(outputStream, new b("\r\n", false));
        a(outputStream, bVar);
        outputStream.flush();
    }

    public static void a(OutputStream outputStream, b bVar) {
        if (bVar.c.length > 0) {
            h.a(W3.TRACE, bVar.b ? "Socket.gzip(`%s`)" : "Socket.write(`%s`)", bVar.a.trim());
            outputStream.write(bVar.c);
        }
    }
}
