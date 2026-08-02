package com.anythink.core.common.m;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.d.j;
import com.anythink.core.common.m.a.f;
import com.anythink.core.common.m.a.i;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.SSLException;
import org.apache.http.conn.ConnectTimeoutException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f15185a = "http.loader";

    /* renamed from: m, reason: collision with root package name */
    public static final int f15186m = 699;

    /* renamed from: n, reason: collision with root package name */
    public static final int f15187n = 700;

    /* renamed from: o, reason: collision with root package name */
    public static final int f15188o = 200;

    /* renamed from: p, reason: collision with root package name */
    public static final String f15189p = "Content-Type";

    /* renamed from: q, reason: collision with root package name */
    public static final String f15190q = "application/json";

    /* renamed from: b, reason: collision with root package name */
    private final com.anythink.core.common.m.c.i f15191b = com.anythink.core.common.d.t.b().X();

    /* renamed from: c, reason: collision with root package name */
    private com.anythink.core.common.m.b.d f15192c;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.core.common.m.a.b f15193d;

    /* renamed from: e, reason: collision with root package name */
    private long f15194e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f15195f;

    /* renamed from: g, reason: collision with root package name */
    private com.anythink.core.common.m.a.a.a f15196g;

    /* renamed from: r, reason: collision with root package name */
    protected q f15197r;

    /* renamed from: s, reason: collision with root package name */
    protected boolean f15198s;

    /* renamed from: t, reason: collision with root package name */
    protected String f15199t;

    /* renamed from: com.anythink.core.common.m.a$1, reason: invalid class name */
    public class AnonymousClass1 extends com.anythink.core.common.v.b.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f15200a;

        public AnonymousClass1(int i) {
            this.f15200a = i;
        }

        @Override // com.anythink.core.common.v.b.d
        public final void a() {
            com.anythink.core.common.m.b.f a9;
            try {
                a aVar = a.this;
                if (aVar.f15198s) {
                    aVar.c(this.f15200a);
                    return;
                }
                a.a(aVar);
                com.anythink.core.common.d.t.b().T();
                a aVar2 = a.this;
                aVar2.f15199t = aVar2.b();
                int aT = com.anythink.core.d.d.a().aT();
                String b9 = a.b(a.this);
                a.this.getClass();
                String str = a.this.f15199t;
                q qVar = a.this.f15197r;
                if (qVar != null) {
                    qVar.onLoadStart(this.f15200a);
                }
                if (a.this.f15192c == null) {
                    a aVar3 = a.this;
                    aVar3.f15192c = aVar3.m();
                }
                if (a.this.f15192c != null && a.this.f15191b != null && (a9 = a.this.f15191b.a(a.this.f15192c)) != null && a9.e()) {
                    int f2 = a9.f();
                    String valueOf = String.valueOf(f2);
                    if (f2 != 200) {
                        a.this.a(this.f15200a, f2, "", ErrorCode.getErrorCode(ErrorCode.statuError, valueOf, ""), false);
                        return;
                    } else {
                        a.this.a(this.f15200a, a9.g(), false);
                        return;
                    }
                }
                com.anythink.core.common.m.a.b bVar = a.this.f15193d;
                if (bVar == null) {
                    if (a.this.f15196g == null) {
                        a aVar4 = a.this;
                        aVar4.f15196g = new com.anythink.core.common.m.a.a.a(aVar4.getClass().getName(), a.this.f15199t);
                    }
                    f.a a10 = new f.a().a(com.anythink.core.common.v.b.b.a().d());
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    com.anythink.core.common.m.a.f a11 = a10.a(timeUnit).c(timeUnit).b(timeUnit).a(a.this.f15196g.a(a.this.f15192c)).a(aT).a();
                    bVar = com.anythink.core.d.b.b(a11.f15238j) ? new com.anythink.core.common.m.a.a.e(a11) : new com.anythink.core.common.m.a.a.b(a11);
                    a.this.f15193d = bVar;
                }
                com.anythink.core.common.m.a.j a12 = bVar.a(new i.a().a(a.this.f15199t).b(b9).c(a.h(a.this)).a(a.this.d()).a(a.g(a.this)).a());
                int i = a12.f15259b;
                if (i != 200 && i != 201 && i != 204 && !a.this.b(i)) {
                    a.b(a.this, a12, this.f15200a);
                    return;
                }
                a.a(a.this, a12, this.f15200a);
            } catch (Throwable th) {
                a.this.a(0, 0, th.getMessage(), ErrorCode.getErrorCode(ErrorCode.httpStatuException, "0", th.getMessage()));
            }
        }
    }

    public static /* synthetic */ String h(a aVar) {
        Map<String, String> c9 = aVar.c();
        return (c9 == null || !c9.containsKey("Content-Type")) ? f15190q : c9.get("Content-Type");
    }

    private void s() {
        this.f15198s = true;
        com.anythink.core.common.m.a.b bVar = this.f15193d;
        if (bVar != null) {
            bVar.a();
        }
    }

    private String t() {
        int a9 = a();
        if (a9 != 1 && a9 != 2) {
            a9 = 2;
        }
        return a9 == 2 ? "GET" : "POST";
    }

    private Map<String, String> u() {
        Map<String, String> c9 = c();
        if (c9 == null) {
            c9 = new HashMap<>();
        }
        if (com.anythink.core.common.d.t.b().c("ua")) {
            c9.put("User-Agent", com.anythink.core.common.v.p.a());
        }
        return c9;
    }

    private String v() {
        Map<String, String> c9 = c();
        return (c9 == null || !c9.containsKey("Content-Type")) ? f15190q : c9.get("Content-Type");
    }

    private void w() {
        com.anythink.core.common.m.a.a.a aVar;
        if (!x() || (aVar = this.f15196g) == null) {
            return;
        }
        com.anythink.core.common.u.e.a(aVar.a());
    }

    private boolean x() {
        com.anythink.core.common.m.a.a.a aVar = this.f15196g;
        com.anythink.core.common.m.b.a a9 = aVar != null ? aVar.a() : null;
        return a9 != null && a9.o();
    }

    public abstract int a();

    public abstract Object a(Object obj);

    public void a(int i) {
    }

    public abstract void a(AdError adError);

    public abstract String b();

    public abstract void b(AdError adError);

    public boolean b(int i) {
        return false;
    }

    public abstract Map<String, String> c();

    public abstract byte[] d();

    public boolean d_() {
        return false;
    }

    public String g() {
        HashMap hashMap = new HashMap();
        String a9 = com.anythink.core.common.v.k.a(e().toString());
        String a10 = com.anythink.core.common.v.k.a(f().toString());
        hashMap.put(e.f15410P, o());
        hashMap.put("p", a9);
        hashMap.put(e.f15417W, a10);
        ArrayList arrayList = new ArrayList(hashMap.size());
        arrayList.addAll(hashMap.keySet());
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(str);
            sb.append("=");
            sb.append(hashMap.get(str));
        }
        hashMap.put("sign", com.anythink.core.common.v.o.c(j() + sb.toString()));
        if (k() != null) {
            hashMap.putAll(k());
        }
        Set<String> keySet = hashMap.keySet();
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str2 : keySet) {
                jSONObject.put(str2, String.valueOf(hashMap.get(str2)));
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        } catch (OutOfMemoryError unused2) {
            System.gc();
            return null;
        }
    }

    public abstract String h();

    public abstract Context i();

    public abstract String j();

    public abstract Map<String, Object> k();

    @Deprecated
    public int l() {
        return 0;
    }

    public com.anythink.core.common.m.b.d m() {
        return null;
    }

    public String o() {
        return j.e.f13222a;
    }

    public boolean p() {
        return false;
    }

    public List<String> q() {
        return null;
    }

    public boolean r() {
        return false;
    }

    public static byte[] b(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes(com.anythink.expressad.foundation.g.a.bR));
            gZIPOutputStream.close();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    private void d(int i) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(i);
        if (p()) {
            com.anythink.core.common.v.b.b.a().a((com.anythink.core.common.v.b.d) anonymousClass1, 1);
        } else {
            com.anythink.core.common.v.b.b.a().a((com.anythink.core.common.v.b.d) anonymousClass1, 10);
        }
    }

    public final void c(int i) {
        q qVar = this.f15197r;
        if (qVar != null) {
            qVar.onLoadCanceled(i);
        }
    }

    public JSONObject e() {
        return e.a(l());
    }

    public JSONObject f() {
        return e.a(l(), q());
    }

    public static /* synthetic */ boolean a(a aVar) {
        aVar.f15195f = false;
        return false;
    }

    public void a(int i, q qVar) {
        this.f15198s = false;
        this.f15197r = qVar;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(i);
        if (p()) {
            com.anythink.core.common.v.b.b.a().a((com.anythink.core.common.v.b.d) anonymousClass1, 1);
        } else {
            com.anythink.core.common.v.b.b.a().a((com.anythink.core.common.v.b.d) anonymousClass1, 10);
        }
    }

    private void b(int i, Object obj) {
        com.anythink.core.common.m.b.d dVar;
        if (this.f15191b == null || (dVar = this.f15192c) == null) {
            return;
        }
        String a9 = dVar.a();
        String b9 = this.f15192c.b();
        com.anythink.core.common.m.b.f a10 = com.anythink.core.common.m.b.f.a();
        if (obj != null && (com.anythink.core.common.m.b.g.f15306c.equals(b9) || com.anythink.core.common.m.b.g.f15307d.equals(b9))) {
            a10.a(obj);
        }
        long j6 = this.f15194e;
        if (j6 > 0) {
            a10.a(j6);
        }
        a10.a(i);
        a10.a(a9);
        this.f15191b.a(a10, this.f15192c);
    }

    public void a(int i, int i4, String str, AdError adError) {
        a(i, i4, str, adError, true);
    }

    public final void a(int i, int i4, String str, AdError adError, boolean z6) {
        a(i, i4, str, adError, z6, false, false);
    }

    private void a(int i, int i4, String str, AdError adError, boolean z6, boolean z9, boolean z10) {
        if (this.f15195f) {
            return;
        }
        this.f15195f = true;
        q qVar = this.f15197r;
        if (qVar != null) {
            qVar.onLoadError(i, str, adError);
        }
        if (z10) {
            a(i4, str);
        }
        a(i4);
        if (z6) {
            b(i4, (Object) null);
        }
        if (z9) {
            a(adError);
        }
        b(adError);
        w();
    }

    private void b(com.anythink.core.common.m.a.j jVar, int i) {
        String str;
        JSONObject jSONObject;
        int i4 = jVar.f15259b;
        try {
            com.anythink.core.common.m.a.k kVar = jVar.f15262e;
            String str2 = "";
            if (kVar == null) {
                str = "";
            } else if (r()) {
                str = kVar.c();
            } else {
                str = kVar.b();
            }
            if (!b(i4) && (i4 == 201 || i4 == 204)) {
                a(i, a((Object) null));
                return;
            }
            if (d_()) {
                if (!TextUtils.isEmpty(str)) {
                    str2 = str.trim();
                    try {
                        jSONObject = new JSONObject(str2);
                    } catch (Throwable unused) {
                        jSONObject = new JSONObject();
                    }
                } else {
                    jSONObject = new JSONObject();
                }
                int optInt = jSONObject.optInt("code", 0);
                if (optInt == 0) {
                    JSONObject optJSONObject = jSONObject.optJSONObject(j.e.f13226e);
                    if (optJSONObject == null) {
                        optJSONObject = new JSONObject();
                    }
                    a(i, a(optJSONObject));
                    return;
                }
                a(i, o.f15487l, str2, ErrorCode.getErrorCode(ErrorCode.statuError, String.valueOf(optInt), str2));
                return;
            }
            a(i, a(str != null ? str.trim() : null));
        } catch (Throwable th) {
            a(i, i4, th.getMessage(), ErrorCode.getErrorCode(ErrorCode.httpStatuException, String.valueOf(i4), th.getMessage()));
        }
    }

    public void a(int i, Object obj) {
        a(i, obj, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, Object obj, boolean z6) {
        if (this.f15195f) {
            return;
        }
        this.f15195f = true;
        q qVar = this.f15197r;
        if (qVar != null) {
            qVar.onLoadFinish(i, obj);
        }
        if (z6) {
            b(200, obj);
            w();
        }
    }

    public static /* synthetic */ Map g(a aVar) {
        Map<String, String> c9 = aVar.c();
        if (c9 == null) {
            c9 = new HashMap<>();
        }
        if (com.anythink.core.common.d.t.b().c("ua")) {
            c9.put("User-Agent", com.anythink.core.common.v.p.a());
        }
        return c9;
    }

    private void a(int i, String str) {
        int l9 = l();
        if (ATSDK.isCnSDK() || (l9 & 8) != 8) {
            return;
        }
        com.anythink.core.common.g.c.a().a(this.f15199t, i, str, new com.anythink.core.common.g.d() { // from class: com.anythink.core.common.m.a.2
            @Override // com.anythink.core.common.g.d
            public final void a(String str2) {
            }
        });
    }

    private void a(com.anythink.core.common.m.a.j jVar) {
        Map<String, List<String>> map = jVar.f15263f;
        if (map == null || map.isEmpty() || jVar.f15259b != 699) {
            return;
        }
        try {
            List<String> list = map.get("Req-Next-Time");
            String str = (list == null || list.isEmpty()) ? "" : list.get(0);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f15194e = Long.parseLong(str) * 1000;
        } catch (Throwable unused) {
        }
    }

    private void a(com.anythink.core.common.m.a.j jVar, int i) {
        String str;
        int i4;
        boolean z6;
        boolean z9;
        Throwable th = jVar.f15261d;
        int i6 = jVar.f15259b;
        String str2 = "";
        String message = th != null ? th.getMessage() : "";
        if (th instanceof UnknownHostException) {
            str = "UnknownHostException: ".concat(String.valueOf(message));
            i4 = -1000;
            z6 = true;
            z9 = false;
        } else {
            if (th instanceof ConnectException) {
                str = "ConnectException: ".concat(String.valueOf(message));
                i4 = o.f15478b;
                z6 = true;
            } else {
                if (th instanceof SSLException) {
                    str = "SSLException: ".concat(String.valueOf(message));
                    i4 = o.f15483g;
                } else if (th instanceof SocketException) {
                    str = "SocketException: ".concat(String.valueOf(message));
                    i4 = o.f15484h;
                } else if (th instanceof SocketTimeoutException) {
                    str = "SocketTimeoutException: ".concat(String.valueOf(message));
                    i4 = o.f15479c;
                } else if (th instanceof ConnectTimeoutException) {
                    str = "ConnectTimeoutException: ".concat(String.valueOf(message));
                    i4 = o.f15480d;
                } else {
                    if (th instanceof IOException) {
                        str = "IOException: ".concat(String.valueOf(message));
                        i4 = o.i;
                    } else {
                        if (th == null) {
                            str = jVar.f15260c;
                        } else if (!TextUtils.isEmpty(jVar.f15260c)) {
                            str = "Msg: " + jVar.f15260c + "Exception: " + th + ", Message: " + message;
                        } else {
                            str = "Exception: " + th + ", Message: " + message;
                        }
                        i4 = -9998;
                    }
                    z6 = false;
                }
                z9 = true;
                z6 = false;
            }
            z9 = z6;
        }
        if (x()) {
            str = "cus-dns,".concat(String.valueOf(str));
        }
        String str3 = str;
        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.httpStatuException, String.valueOf(i4), str3);
        Map<String, List<String>> map = jVar.f15263f;
        if (map != null && !map.isEmpty() && jVar.f15259b == 699) {
            try {
                List<String> list = map.get("Req-Next-Time");
                if (list != null && !list.isEmpty()) {
                    str2 = list.get(0);
                }
                if (!TextUtils.isEmpty(str2)) {
                    this.f15194e = Long.parseLong(str2) * 1000;
                }
            } catch (Throwable unused) {
            }
        }
        a(i, i6, str3, errorCode, true, z6, z9);
    }

    public static /* synthetic */ String b(a aVar) {
        int a9 = aVar.a();
        if (a9 != 1 && a9 != 2) {
            a9 = 2;
        }
        if (a9 == 2) {
            return "GET";
        }
        return "POST";
    }

    public static /* synthetic */ void b(a aVar, com.anythink.core.common.m.a.j jVar, int i) {
        String str;
        int i4;
        boolean z6;
        boolean z9;
        Throwable th = jVar.f15261d;
        int i6 = jVar.f15259b;
        String str2 = "";
        String message = th != null ? th.getMessage() : "";
        if (th instanceof UnknownHostException) {
            str = "UnknownHostException: ".concat(String.valueOf(message));
            i4 = -1000;
            z6 = true;
            z9 = false;
        } else {
            if (th instanceof ConnectException) {
                str = "ConnectException: ".concat(String.valueOf(message));
                i4 = o.f15478b;
                z6 = true;
            } else {
                if (th instanceof SSLException) {
                    str = "SSLException: ".concat(String.valueOf(message));
                    i4 = o.f15483g;
                } else if (th instanceof SocketException) {
                    str = "SocketException: ".concat(String.valueOf(message));
                    i4 = o.f15484h;
                } else if (th instanceof SocketTimeoutException) {
                    str = "SocketTimeoutException: ".concat(String.valueOf(message));
                    i4 = o.f15479c;
                } else if (th instanceof ConnectTimeoutException) {
                    str = "ConnectTimeoutException: ".concat(String.valueOf(message));
                    i4 = o.f15480d;
                } else {
                    if (th instanceof IOException) {
                        str = "IOException: ".concat(String.valueOf(message));
                        i4 = o.i;
                    } else {
                        if (th == null) {
                            str = jVar.f15260c;
                        } else if (!TextUtils.isEmpty(jVar.f15260c)) {
                            str = "Msg: " + jVar.f15260c + "Exception: " + th + ", Message: " + message;
                        } else {
                            str = "Exception: " + th + ", Message: " + message;
                        }
                        i4 = -9998;
                    }
                    z6 = false;
                }
                z9 = true;
                z6 = false;
            }
            z9 = z6;
        }
        if (aVar.x()) {
            str = "cus-dns,".concat(String.valueOf(str));
        }
        String str3 = str;
        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.httpStatuException, String.valueOf(i4), str3);
        Map<String, List<String>> map = jVar.f15263f;
        if (map != null && !map.isEmpty() && jVar.f15259b == 699) {
            try {
                List<String> list = map.get("Req-Next-Time");
                if (list != null && !list.isEmpty()) {
                    str2 = list.get(0);
                }
                if (!TextUtils.isEmpty(str2)) {
                    aVar.f15194e = Long.parseLong(str2) * 1000;
                }
            } catch (Throwable unused) {
            }
        }
        aVar.a(i, i6, str3, errorCode, true, z6, z9);
    }

    public static /* synthetic */ void a(a aVar, com.anythink.core.common.m.a.j jVar, int i) {
        String str;
        JSONObject jSONObject;
        int i4 = jVar.f15259b;
        try {
            com.anythink.core.common.m.a.k kVar = jVar.f15262e;
            String str2 = "";
            if (kVar == null) {
                str = "";
            } else if (aVar.r()) {
                str = kVar.c();
            } else {
                str = kVar.b();
            }
            if (!aVar.b(i4) && (i4 == 201 || i4 == 204)) {
                aVar.a(i, aVar.a((Object) null));
                return;
            }
            if (aVar.d_()) {
                if (!TextUtils.isEmpty(str)) {
                    str2 = str.trim();
                    try {
                        jSONObject = new JSONObject(str2);
                    } catch (Throwable unused) {
                        jSONObject = new JSONObject();
                    }
                } else {
                    jSONObject = new JSONObject();
                }
                int optInt = jSONObject.optInt("code", 0);
                if (optInt == 0) {
                    JSONObject optJSONObject = jSONObject.optJSONObject(j.e.f13226e);
                    if (optJSONObject == null) {
                        optJSONObject = new JSONObject();
                    }
                    aVar.a(i, aVar.a(optJSONObject));
                    return;
                }
                aVar.a(i, o.f15487l, str2, ErrorCode.getErrorCode(ErrorCode.statuError, String.valueOf(optInt), str2));
                return;
            }
            aVar.a(i, aVar.a(str != null ? str.trim() : null));
        } catch (Throwable th) {
            aVar.a(i, i4, th.getMessage(), ErrorCode.getErrorCode(ErrorCode.httpStatuException, String.valueOf(i4), th.getMessage()));
        }
    }
}
