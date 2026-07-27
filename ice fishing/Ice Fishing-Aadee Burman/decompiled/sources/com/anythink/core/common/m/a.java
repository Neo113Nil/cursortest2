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
    private static final String f14399a = "http.loader";

    /* renamed from: m, reason: collision with root package name */
    public static final int f14400m = 699;

    /* renamed from: n, reason: collision with root package name */
    public static final int f14401n = 700;

    /* renamed from: o, reason: collision with root package name */
    public static final int f14402o = 200;

    /* renamed from: p, reason: collision with root package name */
    public static final String f14403p = "Content-Type";

    /* renamed from: q, reason: collision with root package name */
    public static final String f14404q = "application/json";

    /* renamed from: b, reason: collision with root package name */
    private final com.anythink.core.common.m.c.i f14405b = com.anythink.core.common.d.t.b().X();

    /* renamed from: c, reason: collision with root package name */
    private com.anythink.core.common.m.b.d f14406c;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.core.common.m.a.b f14407d;

    /* renamed from: e, reason: collision with root package name */
    private long f14408e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14409f;

    /* renamed from: g, reason: collision with root package name */
    private com.anythink.core.common.m.a.a.a f14410g;

    /* renamed from: r, reason: collision with root package name */
    protected q f14411r;

    /* renamed from: s, reason: collision with root package name */
    protected boolean f14412s;

    /* renamed from: t, reason: collision with root package name */
    protected String f14413t;

    /* renamed from: com.anythink.core.common.m.a$1, reason: invalid class name */
    public class AnonymousClass1 extends com.anythink.core.common.v.b.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f14414a;

        public AnonymousClass1(int i) {
            this.f14414a = i;
        }

        @Override // com.anythink.core.common.v.b.d
        public final void a() {
            com.anythink.core.common.m.b.f a9;
            try {
                a aVar = a.this;
                if (aVar.f14412s) {
                    aVar.c(this.f14414a);
                    return;
                }
                a.a(aVar);
                com.anythink.core.common.d.t.b().T();
                a aVar2 = a.this;
                aVar2.f14413t = aVar2.b();
                int aT = com.anythink.core.d.d.a().aT();
                String b9 = a.b(a.this);
                a.this.getClass();
                String str = a.this.f14413t;
                q qVar = a.this.f14411r;
                if (qVar != null) {
                    qVar.onLoadStart(this.f14414a);
                }
                if (a.this.f14406c == null) {
                    a aVar3 = a.this;
                    aVar3.f14406c = aVar3.m();
                }
                if (a.this.f14406c != null && a.this.f14405b != null && (a9 = a.this.f14405b.a(a.this.f14406c)) != null && a9.e()) {
                    int f3 = a9.f();
                    String valueOf = String.valueOf(f3);
                    if (f3 != 200) {
                        a.this.a(this.f14414a, f3, "", ErrorCode.getErrorCode(ErrorCode.statuError, valueOf, ""), false);
                        return;
                    } else {
                        a.this.a(this.f14414a, a9.g(), false);
                        return;
                    }
                }
                com.anythink.core.common.m.a.b bVar = a.this.f14407d;
                if (bVar == null) {
                    if (a.this.f14410g == null) {
                        a aVar4 = a.this;
                        aVar4.f14410g = new com.anythink.core.common.m.a.a.a(aVar4.getClass().getName(), a.this.f14413t);
                    }
                    f.a a10 = new f.a().a(com.anythink.core.common.v.b.b.a().d());
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    com.anythink.core.common.m.a.f a11 = a10.a(timeUnit).c(timeUnit).b(timeUnit).a(a.this.f14410g.a(a.this.f14406c)).a(aT).a();
                    bVar = com.anythink.core.d.b.b(a11.f14452j) ? new com.anythink.core.common.m.a.a.e(a11) : new com.anythink.core.common.m.a.a.b(a11);
                    a.this.f14407d = bVar;
                }
                com.anythink.core.common.m.a.j a12 = bVar.a(new i.a().a(a.this.f14413t).b(b9).c(a.h(a.this)).a(a.this.d()).a(a.g(a.this)).a());
                int i = a12.f14473b;
                if (i != 200 && i != 201 && i != 204 && !a.this.b(i)) {
                    a.b(a.this, a12, this.f14414a);
                    return;
                }
                a.a(a.this, a12, this.f14414a);
            } catch (Throwable th) {
                a.this.a(0, 0, th.getMessage(), ErrorCode.getErrorCode(ErrorCode.httpStatuException, "0", th.getMessage()));
            }
        }
    }

    public static /* synthetic */ String h(a aVar) {
        Map<String, String> c9 = aVar.c();
        return (c9 == null || !c9.containsKey("Content-Type")) ? f14404q : c9.get("Content-Type");
    }

    private void s() {
        this.f14412s = true;
        com.anythink.core.common.m.a.b bVar = this.f14407d;
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
        return (c9 == null || !c9.containsKey("Content-Type")) ? f14404q : c9.get("Content-Type");
    }

    private void w() {
        com.anythink.core.common.m.a.a.a aVar;
        if (!x() || (aVar = this.f14410g) == null) {
            return;
        }
        com.anythink.core.common.u.e.a(aVar.a());
    }

    private boolean x() {
        com.anythink.core.common.m.a.a.a aVar = this.f14410g;
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
        hashMap.put(e.f14624P, o());
        hashMap.put("p", a9);
        hashMap.put(e.f14631W, a10);
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
        return j.e.f12436a;
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
        q qVar = this.f14411r;
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
        aVar.f14409f = false;
        return false;
    }

    public void a(int i, q qVar) {
        this.f14412s = false;
        this.f14411r = qVar;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(i);
        if (p()) {
            com.anythink.core.common.v.b.b.a().a((com.anythink.core.common.v.b.d) anonymousClass1, 1);
        } else {
            com.anythink.core.common.v.b.b.a().a((com.anythink.core.common.v.b.d) anonymousClass1, 10);
        }
    }

    private void b(int i, Object obj) {
        com.anythink.core.common.m.b.d dVar;
        if (this.f14405b == null || (dVar = this.f14406c) == null) {
            return;
        }
        String a9 = dVar.a();
        String b9 = this.f14406c.b();
        com.anythink.core.common.m.b.f a10 = com.anythink.core.common.m.b.f.a();
        if (obj != null && (com.anythink.core.common.m.b.g.f14520c.equals(b9) || com.anythink.core.common.m.b.g.f14521d.equals(b9))) {
            a10.a(obj);
        }
        long j6 = this.f14408e;
        if (j6 > 0) {
            a10.a(j6);
        }
        a10.a(i);
        a10.a(a9);
        this.f14405b.a(a10, this.f14406c);
    }

    public void a(int i, int i6, String str, AdError adError) {
        a(i, i6, str, adError, true);
    }

    public final void a(int i, int i6, String str, AdError adError, boolean z3) {
        a(i, i6, str, adError, z3, false, false);
    }

    private void a(int i, int i6, String str, AdError adError, boolean z3, boolean z6, boolean z9) {
        if (this.f14409f) {
            return;
        }
        this.f14409f = true;
        q qVar = this.f14411r;
        if (qVar != null) {
            qVar.onLoadError(i, str, adError);
        }
        if (z9) {
            a(i6, str);
        }
        a(i6);
        if (z3) {
            b(i6, (Object) null);
        }
        if (z6) {
            a(adError);
        }
        b(adError);
        w();
    }

    private void b(com.anythink.core.common.m.a.j jVar, int i) {
        String str;
        JSONObject jSONObject;
        int i6 = jVar.f14473b;
        try {
            com.anythink.core.common.m.a.k kVar = jVar.f14476e;
            String str2 = "";
            if (kVar == null) {
                str = "";
            } else if (r()) {
                str = kVar.c();
            } else {
                str = kVar.b();
            }
            if (!b(i6) && (i6 == 201 || i6 == 204)) {
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
                    JSONObject optJSONObject = jSONObject.optJSONObject(j.e.f12440e);
                    if (optJSONObject == null) {
                        optJSONObject = new JSONObject();
                    }
                    a(i, a(optJSONObject));
                    return;
                }
                a(i, o.f14701l, str2, ErrorCode.getErrorCode(ErrorCode.statuError, String.valueOf(optInt), str2));
                return;
            }
            a(i, a(str != null ? str.trim() : null));
        } catch (Throwable th) {
            a(i, i6, th.getMessage(), ErrorCode.getErrorCode(ErrorCode.httpStatuException, String.valueOf(i6), th.getMessage()));
        }
    }

    public void a(int i, Object obj) {
        a(i, obj, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, Object obj, boolean z3) {
        if (this.f14409f) {
            return;
        }
        this.f14409f = true;
        q qVar = this.f14411r;
        if (qVar != null) {
            qVar.onLoadFinish(i, obj);
        }
        if (z3) {
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
        com.anythink.core.common.g.c.a().a(this.f14413t, i, str, new com.anythink.core.common.g.d() { // from class: com.anythink.core.common.m.a.2
            @Override // com.anythink.core.common.g.d
            public final void a(String str2) {
            }
        });
    }

    private void a(com.anythink.core.common.m.a.j jVar) {
        Map<String, List<String>> map = jVar.f14477f;
        if (map == null || map.isEmpty() || jVar.f14473b != 699) {
            return;
        }
        try {
            List<String> list = map.get("Req-Next-Time");
            String str = (list == null || list.isEmpty()) ? "" : list.get(0);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f14408e = Long.parseLong(str) * 1000;
        } catch (Throwable unused) {
        }
    }

    private void a(com.anythink.core.common.m.a.j jVar, int i) {
        String str;
        int i6;
        boolean z3;
        boolean z6;
        Throwable th = jVar.f14475d;
        int i9 = jVar.f14473b;
        String str2 = "";
        String message = th != null ? th.getMessage() : "";
        if (th instanceof UnknownHostException) {
            str = "UnknownHostException: ".concat(String.valueOf(message));
            i6 = -1000;
            z3 = true;
            z6 = false;
        } else {
            if (th instanceof ConnectException) {
                str = "ConnectException: ".concat(String.valueOf(message));
                i6 = o.f14692b;
                z3 = true;
            } else {
                if (th instanceof SSLException) {
                    str = "SSLException: ".concat(String.valueOf(message));
                    i6 = o.f14697g;
                } else if (th instanceof SocketException) {
                    str = "SocketException: ".concat(String.valueOf(message));
                    i6 = o.f14698h;
                } else if (th instanceof SocketTimeoutException) {
                    str = "SocketTimeoutException: ".concat(String.valueOf(message));
                    i6 = o.f14693c;
                } else if (th instanceof ConnectTimeoutException) {
                    str = "ConnectTimeoutException: ".concat(String.valueOf(message));
                    i6 = o.f14694d;
                } else {
                    if (th instanceof IOException) {
                        str = "IOException: ".concat(String.valueOf(message));
                        i6 = o.i;
                    } else {
                        if (th == null) {
                            str = jVar.f14474c;
                        } else if (!TextUtils.isEmpty(jVar.f14474c)) {
                            str = "Msg: " + jVar.f14474c + "Exception: " + th + ", Message: " + message;
                        } else {
                            str = "Exception: " + th + ", Message: " + message;
                        }
                        i6 = -9998;
                    }
                    z3 = false;
                }
                z6 = true;
                z3 = false;
            }
            z6 = z3;
        }
        if (x()) {
            str = "cus-dns,".concat(String.valueOf(str));
        }
        String str3 = str;
        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.httpStatuException, String.valueOf(i6), str3);
        Map<String, List<String>> map = jVar.f14477f;
        if (map != null && !map.isEmpty() && jVar.f14473b == 699) {
            try {
                List<String> list = map.get("Req-Next-Time");
                if (list != null && !list.isEmpty()) {
                    str2 = list.get(0);
                }
                if (!TextUtils.isEmpty(str2)) {
                    this.f14408e = Long.parseLong(str2) * 1000;
                }
            } catch (Throwable unused) {
            }
        }
        a(i, i9, str3, errorCode, true, z3, z6);
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
        int i6;
        boolean z3;
        boolean z6;
        Throwable th = jVar.f14475d;
        int i9 = jVar.f14473b;
        String str2 = "";
        String message = th != null ? th.getMessage() : "";
        if (th instanceof UnknownHostException) {
            str = "UnknownHostException: ".concat(String.valueOf(message));
            i6 = -1000;
            z3 = true;
            z6 = false;
        } else {
            if (th instanceof ConnectException) {
                str = "ConnectException: ".concat(String.valueOf(message));
                i6 = o.f14692b;
                z3 = true;
            } else {
                if (th instanceof SSLException) {
                    str = "SSLException: ".concat(String.valueOf(message));
                    i6 = o.f14697g;
                } else if (th instanceof SocketException) {
                    str = "SocketException: ".concat(String.valueOf(message));
                    i6 = o.f14698h;
                } else if (th instanceof SocketTimeoutException) {
                    str = "SocketTimeoutException: ".concat(String.valueOf(message));
                    i6 = o.f14693c;
                } else if (th instanceof ConnectTimeoutException) {
                    str = "ConnectTimeoutException: ".concat(String.valueOf(message));
                    i6 = o.f14694d;
                } else {
                    if (th instanceof IOException) {
                        str = "IOException: ".concat(String.valueOf(message));
                        i6 = o.i;
                    } else {
                        if (th == null) {
                            str = jVar.f14474c;
                        } else if (!TextUtils.isEmpty(jVar.f14474c)) {
                            str = "Msg: " + jVar.f14474c + "Exception: " + th + ", Message: " + message;
                        } else {
                            str = "Exception: " + th + ", Message: " + message;
                        }
                        i6 = -9998;
                    }
                    z3 = false;
                }
                z6 = true;
                z3 = false;
            }
            z6 = z3;
        }
        if (aVar.x()) {
            str = "cus-dns,".concat(String.valueOf(str));
        }
        String str3 = str;
        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.httpStatuException, String.valueOf(i6), str3);
        Map<String, List<String>> map = jVar.f14477f;
        if (map != null && !map.isEmpty() && jVar.f14473b == 699) {
            try {
                List<String> list = map.get("Req-Next-Time");
                if (list != null && !list.isEmpty()) {
                    str2 = list.get(0);
                }
                if (!TextUtils.isEmpty(str2)) {
                    aVar.f14408e = Long.parseLong(str2) * 1000;
                }
            } catch (Throwable unused) {
            }
        }
        aVar.a(i, i9, str3, errorCode, true, z3, z6);
    }

    public static /* synthetic */ void a(a aVar, com.anythink.core.common.m.a.j jVar, int i) {
        String str;
        JSONObject jSONObject;
        int i6 = jVar.f14473b;
        try {
            com.anythink.core.common.m.a.k kVar = jVar.f14476e;
            String str2 = "";
            if (kVar == null) {
                str = "";
            } else if (aVar.r()) {
                str = kVar.c();
            } else {
                str = kVar.b();
            }
            if (!aVar.b(i6) && (i6 == 201 || i6 == 204)) {
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
                    JSONObject optJSONObject = jSONObject.optJSONObject(j.e.f12440e);
                    if (optJSONObject == null) {
                        optJSONObject = new JSONObject();
                    }
                    aVar.a(i, aVar.a(optJSONObject));
                    return;
                }
                aVar.a(i, o.f14701l, str2, ErrorCode.getErrorCode(ErrorCode.statuError, String.valueOf(optInt), str2));
                return;
            }
            aVar.a(i, aVar.a(str != null ? str.trim() : null));
        } catch (Throwable th) {
            aVar.a(i, i6, th.getMessage(), ErrorCode.getErrorCode(ErrorCode.httpStatuException, String.valueOf(i6), th.getMessage()));
        }
    }
}
