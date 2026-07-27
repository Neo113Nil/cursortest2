package com.anythink.expressad.e.a;

import D.y;
import android.net.Uri;
import android.text.TextUtils;
import com.anythink.core.common.d.t;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.g.f.g.e;
import com.anythink.expressad.foundation.g.f.l;
import com.anythink.expressad.foundation.h.z;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final int f18469a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f18470b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static String f18471c = "AppletsModel";

    /* renamed from: h, reason: collision with root package name */
    private static final int f18472h = 44993;
    private static final String i = "UTF-8";

    /* renamed from: j, reason: collision with root package name */
    private static final String f18473j = "install_callback";

    /* renamed from: k, reason: collision with root package name */
    private static final String f18474k = "event_callback";

    /* renamed from: l, reason: collision with root package name */
    private static final String f18475l = "wx_miniprogram";

    /* renamed from: m, reason: collision with root package name */
    private static final String f18476m = "0";

    /* renamed from: n, reason: collision with root package name */
    private static final String f18477n = "1";

    /* renamed from: d, reason: collision with root package name */
    private final com.anythink.expressad.foundation.d.d f18478d;

    /* renamed from: e, reason: collision with root package name */
    private final String f18479e;

    /* renamed from: f, reason: collision with root package name */
    private final String f18480f;

    /* renamed from: g, reason: collision with root package name */
    private String f18481g;

    /* renamed from: o, reason: collision with root package name */
    private volatile d f18482o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f18483p = false;

    /* renamed from: q, reason: collision with root package name */
    private volatile boolean f18484q = false;

    /* renamed from: r, reason: collision with root package name */
    private volatile boolean f18485r = false;

    /* renamed from: s, reason: collision with root package name */
    private int f18486s = -1;

    /* renamed from: t, reason: collision with root package name */
    private boolean f18487t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f18488u = false;

    /* renamed from: v, reason: collision with root package name */
    private String f18489v = "";

    /* renamed from: w, reason: collision with root package name */
    private Map<String, String> f18490w;

    public static final class b extends Exception {
        public b(String str) {
            super(str);
        }
    }

    public c(com.anythink.expressad.foundation.d.d dVar, String str, String str2) {
        this.f18478d = dVar;
        this.f18479e = str;
        this.f18480f = str2;
    }

    private void b(d dVar) {
        this.f18482o = dVar;
    }

    private boolean c() {
        return this.f18484q;
    }

    private void d() {
        this.f18484q = false;
    }

    private boolean e() {
        return this.f18485r;
    }

    private String f() {
        return this.f18481g;
    }

    private void g() {
        if (this.f18482o == null) {
            return;
        }
        try {
            this.f18482o.b();
        } catch (Exception unused) {
            boolean z8 = com.anythink.expressad.a.f17776a;
        }
    }

    private String h() {
        return this.f18489v;
    }

    private void i() {
        if (this.f18482o == null) {
            return;
        }
        boolean z8 = com.anythink.expressad.a.f17776a;
        try {
            this.f18482o.c(1, "response or result is null", this.f18481g);
        } catch (Exception unused) {
            boolean z9 = com.anythink.expressad.a.f17776a;
        }
    }

    private boolean j() {
        com.anythink.expressad.foundation.d.d dVar = this.f18478d;
        if (dVar == null) {
            return false;
        }
        int R8 = dVar.R();
        return R8 == 8 || R8 == 9;
    }

    private boolean k() {
        return this.f18483p;
    }

    private boolean l() {
        com.anythink.expressad.foundation.d.d dVar;
        int R8;
        if (!this.f18487t) {
            this.f18487t = c("1") && (dVar = this.f18478d) != null && ((R8 = dVar.R()) == 8 || R8 == 9);
        }
        return this.f18487t;
    }

    private static String b(String str) {
        return y.o(new StringBuilder(), e.a().f19507a, "?", str);
    }

    private boolean c(String str) {
        try {
            com.anythink.expressad.foundation.d.d dVar = this.f18478d;
            if (dVar == null) {
                return false;
            }
            String af = dVar.af();
            if (TextUtils.isEmpty(af)) {
                return false;
            }
            return TextUtils.equals(z.a(af, "wx_miniprogram"), str);
        } catch (Exception unused) {
            boolean z8 = com.anythink.expressad.a.f17776a;
            return false;
        }
    }

    private boolean d(String str) {
        d.c N8;
        try {
            com.anythink.expressad.foundation.d.d dVar = this.f18478d;
            if (dVar != null && (N8 = dVar.N()) != null && !TextUtils.isEmpty(N8.e())) {
                return TextUtils.equals(z.a(N8.e(), com.anythink.expressad.a.f17759H), str);
            }
            return false;
        } catch (Exception unused) {
            boolean z8 = com.anythink.expressad.a.f17776a;
            return false;
        }
    }

    public final void a(d dVar) {
        if (this.f18478d == null || TextUtils.isEmpty(this.f18479e)) {
            return;
        }
        boolean z8 = com.anythink.expressad.a.f17776a;
        this.f18484q = true;
        this.f18482o = dVar;
        if (this.f18482o != null) {
            try {
                this.f18482o.b();
            } catch (Exception unused) {
                boolean z9 = com.anythink.expressad.a.f17776a;
            }
        }
        com.anythink.expressad.e.b.a aVar = new com.anythink.expressad.e.b.a(t.b().g());
        if (this.f18490w == null) {
            this.f18490w = a(this.f18478d);
        }
        if (this.f18490w == null) {
            return;
        }
        if (this.f18483p) {
            a(f18472h, "get wxscheme failed : request times is max");
            return;
        }
        this.f18486s = 0;
        aVar.a(1, e.a().f19507a, new com.anythink.expressad.foundation.g.f.h.b(this.f18490w), new com.anythink.expressad.foundation.g.f.b((char) 0), new a(this));
    }

    public static final class a extends com.anythink.expressad.e.c.a {

        /* renamed from: a, reason: collision with root package name */
        private c f18491a;

        public a(c cVar) {
            this.f18491a = cVar;
        }

        @Override // com.anythink.expressad.e.c.a, com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
        public final void a(l<JSONObject> lVar) {
            super.a(lVar);
            c cVar = this.f18491a;
            if (cVar == null) {
                return;
            }
            cVar.f18484q = false;
            if (lVar == null || lVar.f19556a == null) {
                c.b(this.f18491a);
                return;
            }
            try {
                c.a(this.f18491a, lVar);
            } catch (b e6) {
                this.f18491a.a(-2, e6.getMessage());
            }
        }

        @Override // com.anythink.expressad.e.c.a, com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
        public final void a(com.anythink.expressad.foundation.g.f.a.a aVar) {
            super.a(aVar);
            c cVar = this.f18491a;
            if (cVar == null) {
                return;
            }
            cVar.f18484q = false;
            c.a(this.f18491a, aVar);
        }
    }

    public final void b() {
        this.f18485r = false;
        this.f18484q = false;
        this.f18482o = null;
    }

    private void b(boolean z8) {
        this.f18484q = z8;
    }

    public static /* synthetic */ void b(c cVar) {
        if (cVar.f18482o != null) {
            boolean z8 = com.anythink.expressad.a.f17776a;
            try {
                cVar.f18482o.c(1, "response or result is null", cVar.f18481g);
            } catch (Exception unused) {
                boolean z9 = com.anythink.expressad.a.f17776a;
            }
        }
    }

    private void a(com.anythink.expressad.foundation.g.f.a.a aVar) {
        int i4;
        String str;
        if (this.f18482o == null) {
            return;
        }
        if (aVar != null) {
            i4 = aVar.f19386a;
            str = aVar.getMessage();
            if (i4 == 10) {
                str = "request timeout";
            }
        } else {
            i4 = -1;
            str = "unKnown";
        }
        if (com.anythink.expressad.a.f17776a) {
            String.valueOf(i4);
        }
        try {
            this.f18482o.c(i4, "network error: ".concat(String.valueOf(str)), this.f18481g);
        } catch (Exception unused) {
            boolean z8 = com.anythink.expressad.a.f17776a;
        }
    }

    private void a(l<JSONObject> lVar) {
        JSONObject jSONObject = lVar.f19556a;
        if (com.anythink.expressad.a.f17776a) {
            jSONObject.toString();
        }
        if (jSONObject.has("wx_scheme")) {
            String optString = jSONObject.optString("wx_scheme", "");
            if (!TextUtils.isEmpty(optString)) {
                this.f18485r = true;
                if (this.f18482o != null) {
                    try {
                        this.f18489v = optString;
                        this.f18482o.b(optString);
                        return;
                    } catch (Exception unused) {
                        boolean z8 = com.anythink.expressad.a.f17776a;
                        return;
                    }
                }
                return;
            }
            throw new b("wx_scheme value is null");
        }
        int optInt = jSONObject.optInt("error_code", -1);
        String optString2 = jSONObject.optString("error_msg", "");
        if (optInt == f18472h) {
            this.f18483p = true;
        }
        a(optInt, optString2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i4, String str) {
        if (this.f18482o == null) {
            return;
        }
        if (com.anythink.expressad.a.f17776a) {
            String.valueOf(i4);
        }
        try {
            this.f18482o.b(i4, str, this.f18481g);
        } catch (Exception unused) {
            boolean z8 = com.anythink.expressad.a.f17776a;
        }
    }

    private void a(String str) {
        if (this.f18482o == null) {
            return;
        }
        boolean z8 = com.anythink.expressad.a.f17776a;
        try {
            this.f18489v = str;
            this.f18482o.b(str);
        } catch (Exception unused) {
            boolean z9 = com.anythink.expressad.a.f17776a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
    
        if (r5 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0096, code lost:
    
        if (r2 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a3, code lost:
    
        if (r12 == null) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Map<String, String> a(com.anythink.expressad.foundation.d.d dVar) {
        Uri parse;
        StringBuilder sb;
        String str;
        String str2;
        String str3;
        String str4;
        HashMap hashMap = new HashMap();
        if (dVar != null) {
            try {
                parse = Uri.parse(dVar.af());
            } catch (Exception unused) {
                boolean z8 = com.anythink.expressad.a.f17776a;
            }
            if (parse != null && parse.getQueryParameterNames() != null) {
                sb = new StringBuilder();
                Iterator<String> it = parse.getQueryParameterNames().iterator();
                int i4 = 0;
                while (true) {
                    str = "";
                    if (it.hasNext()) {
                        String next = it.next();
                        if (!TextUtils.isEmpty(next) && !TextUtils.equals(next, "wx_miniprogram")) {
                            try {
                                str = parse.getQueryParameter(next);
                            } catch (Exception unused2) {
                            }
                            if (TextUtils.equals(next, f18474k) || TextUtils.equals(next, f18473j)) {
                                try {
                                    str = URLEncoder.encode(str, "UTF-8");
                                } catch (Exception unused3) {
                                    boolean z9 = com.anythink.expressad.a.f17776a;
                                }
                            }
                            sb.append(next);
                            sb.append("=");
                            sb.append(str);
                            if (i4 < parse.getQueryParameterNames().size()) {
                                sb.append("&");
                            }
                            i4++;
                        }
                    } else {
                        try {
                            break;
                        } catch (Exception unused4) {
                            boolean z10 = com.anythink.expressad.a.f17776a;
                        }
                    }
                    boolean z82 = com.anythink.expressad.a.f17776a;
                }
                str2 = parse.getQueryParameter("app");
            }
        }
        return hashMap;
        str4 = "";
        hashMap.put(com.anythink.expressad.a.f17763M, str4);
        try {
            String encode = URLEncoder.encode(sb.toString(), "UTF-8");
            if (encode != null) {
                str = encode;
            }
        } catch (UnsupportedEncodingException unused5) {
            boolean z11 = com.anythink.expressad.a.f17776a;
        }
        hashMap.put(com.anythink.expressad.a.f17762L, str);
        hashMap.put(com.anythink.expressad.a.f17764N, "0");
        boolean z12 = com.anythink.expressad.a.f17776a;
        this.f18481g = e.a().f19507a + "?" + ("app=" + str2 + "&path=" + str3 + "&query=" + str + "&clickid=" + str4 + "&is_redirect=1");
        return hashMap;
        str3 = "";
        hashMap.put(com.anythink.expressad.a.f17761K, str3);
        try {
            str4 = parse.getQueryParameter(com.anythink.expressad.a.f17763M);
        } catch (Exception unused6) {
            boolean z13 = com.anythink.expressad.a.f17776a;
        }
        hashMap.put(com.anythink.expressad.a.f17762L, str);
        hashMap.put(com.anythink.expressad.a.f17764N, "0");
        boolean z122 = com.anythink.expressad.a.f17776a;
        this.f18481g = e.a().f19507a + "?" + ("app=" + str2 + "&path=" + str3 + "&query=" + str + "&clickid=" + str4 + "&is_redirect=1");
        return hashMap;
        str2 = "";
        hashMap.put("app", str2);
        try {
            str3 = parse.getQueryParameter(com.anythink.expressad.a.f17761K);
        } catch (Exception unused7) {
            boolean z14 = com.anythink.expressad.a.f17776a;
        }
    }

    public final void a(boolean z8) {
        this.f18488u = z8;
    }

    private boolean a(int i4) {
        com.anythink.expressad.foundation.d.d dVar;
        int R8;
        if (!this.f18487t) {
            this.f18487t = c("1") && (dVar = this.f18478d) != null && ((R8 = dVar.R()) == 8 || R8 == 9);
        }
        if (!this.f18487t) {
            return false;
        }
        if (i4 != 0) {
            return i4 == 1;
        }
        return d("2");
    }

    public final boolean a() {
        com.anythink.expressad.foundation.d.d dVar;
        int R8;
        if (this.f18484q) {
            return false;
        }
        if (!this.f18487t) {
            this.f18487t = c("1") && (dVar = this.f18478d) != null && ((R8 = dVar.R()) == 8 || R8 == 9);
        }
        return (!this.f18487t ? false : d("2")) && this.f18486s == -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(c cVar, l lVar) {
        JSONObject jSONObject = (JSONObject) lVar.f19556a;
        if (com.anythink.expressad.a.f17776a) {
            jSONObject.toString();
        }
        if (jSONObject.has("wx_scheme")) {
            String optString = jSONObject.optString("wx_scheme", "");
            if (!TextUtils.isEmpty(optString)) {
                cVar.f18485r = true;
                if (cVar.f18482o != null) {
                    try {
                        cVar.f18489v = optString;
                        cVar.f18482o.b(optString);
                        return;
                    } catch (Exception unused) {
                        boolean z8 = com.anythink.expressad.a.f17776a;
                        return;
                    }
                }
                return;
            }
            throw new b("wx_scheme value is null");
        }
        int optInt = jSONObject.optInt("error_code", -1);
        String optString2 = jSONObject.optString("error_msg", "");
        if (optInt == f18472h) {
            cVar.f18483p = true;
        }
        cVar.a(optInt, optString2);
    }

    public static /* synthetic */ void a(c cVar, com.anythink.expressad.foundation.g.f.a.a aVar) {
        int i4;
        String str;
        if (cVar.f18482o != null) {
            if (aVar != null) {
                i4 = aVar.f19386a;
                str = aVar.getMessage();
                if (i4 == 10) {
                    str = "request timeout";
                }
            } else {
                i4 = -1;
                str = "unKnown";
            }
            if (com.anythink.expressad.a.f17776a) {
                String.valueOf(i4);
            }
            try {
                cVar.f18482o.c(i4, "network error: ".concat(String.valueOf(str)), cVar.f18481g);
            } catch (Exception unused) {
                boolean z8 = com.anythink.expressad.a.f17776a;
            }
        }
    }
}
