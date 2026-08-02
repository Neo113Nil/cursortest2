package com.anythink.expressad.e.a;

import D.x;
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
    public static final int f19098a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f19099b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static String f19100c = "AppletsModel";

    /* renamed from: h, reason: collision with root package name */
    private static final int f19101h = 44993;
    private static final String i = "UTF-8";

    /* renamed from: j, reason: collision with root package name */
    private static final String f19102j = "install_callback";

    /* renamed from: k, reason: collision with root package name */
    private static final String f19103k = "event_callback";

    /* renamed from: l, reason: collision with root package name */
    private static final String f19104l = "wx_miniprogram";

    /* renamed from: m, reason: collision with root package name */
    private static final String f19105m = "0";

    /* renamed from: n, reason: collision with root package name */
    private static final String f19106n = "1";

    /* renamed from: d, reason: collision with root package name */
    private final com.anythink.expressad.foundation.d.d f19107d;

    /* renamed from: e, reason: collision with root package name */
    private final String f19108e;

    /* renamed from: f, reason: collision with root package name */
    private final String f19109f;

    /* renamed from: g, reason: collision with root package name */
    private String f19110g;

    /* renamed from: o, reason: collision with root package name */
    private volatile d f19111o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f19112p = false;

    /* renamed from: q, reason: collision with root package name */
    private volatile boolean f19113q = false;

    /* renamed from: r, reason: collision with root package name */
    private volatile boolean f19114r = false;

    /* renamed from: s, reason: collision with root package name */
    private int f19115s = -1;

    /* renamed from: t, reason: collision with root package name */
    private boolean f19116t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f19117u = false;

    /* renamed from: v, reason: collision with root package name */
    private String f19118v = "";

    /* renamed from: w, reason: collision with root package name */
    private Map<String, String> f19119w;

    public static final class b extends Exception {
        public b(String str) {
            super(str);
        }
    }

    public c(com.anythink.expressad.foundation.d.d dVar, String str, String str2) {
        this.f19107d = dVar;
        this.f19108e = str;
        this.f19109f = str2;
    }

    private void b(d dVar) {
        this.f19111o = dVar;
    }

    private boolean c() {
        return this.f19113q;
    }

    private void d() {
        this.f19113q = false;
    }

    private boolean e() {
        return this.f19114r;
    }

    private String f() {
        return this.f19110g;
    }

    private void g() {
        if (this.f19111o == null) {
            return;
        }
        try {
            this.f19111o.b();
        } catch (Exception unused) {
            boolean z6 = com.anythink.expressad.a.f18405a;
        }
    }

    private String h() {
        return this.f19118v;
    }

    private void i() {
        if (this.f19111o == null) {
            return;
        }
        boolean z6 = com.anythink.expressad.a.f18405a;
        try {
            this.f19111o.c(1, "response or result is null", this.f19110g);
        } catch (Exception unused) {
            boolean z9 = com.anythink.expressad.a.f18405a;
        }
    }

    private boolean j() {
        com.anythink.expressad.foundation.d.d dVar = this.f19107d;
        if (dVar == null) {
            return false;
        }
        int R8 = dVar.R();
        return R8 == 8 || R8 == 9;
    }

    private boolean k() {
        return this.f19112p;
    }

    private boolean l() {
        com.anythink.expressad.foundation.d.d dVar;
        int R8;
        if (!this.f19116t) {
            this.f19116t = c("1") && (dVar = this.f19107d) != null && ((R8 = dVar.R()) == 8 || R8 == 9);
        }
        return this.f19116t;
    }

    private static String b(String str) {
        return x.p(new StringBuilder(), e.a().f20136a, "?", str);
    }

    private boolean c(String str) {
        try {
            com.anythink.expressad.foundation.d.d dVar = this.f19107d;
            if (dVar == null) {
                return false;
            }
            String af = dVar.af();
            if (TextUtils.isEmpty(af)) {
                return false;
            }
            return TextUtils.equals(z.a(af, "wx_miniprogram"), str);
        } catch (Exception unused) {
            boolean z6 = com.anythink.expressad.a.f18405a;
            return false;
        }
    }

    private boolean d(String str) {
        d.c N8;
        try {
            com.anythink.expressad.foundation.d.d dVar = this.f19107d;
            if (dVar != null && (N8 = dVar.N()) != null && !TextUtils.isEmpty(N8.e())) {
                return TextUtils.equals(z.a(N8.e(), com.anythink.expressad.a.f18388H), str);
            }
            return false;
        } catch (Exception unused) {
            boolean z6 = com.anythink.expressad.a.f18405a;
            return false;
        }
    }

    public final void a(d dVar) {
        if (this.f19107d == null || TextUtils.isEmpty(this.f19108e)) {
            return;
        }
        boolean z6 = com.anythink.expressad.a.f18405a;
        this.f19113q = true;
        this.f19111o = dVar;
        if (this.f19111o != null) {
            try {
                this.f19111o.b();
            } catch (Exception unused) {
                boolean z9 = com.anythink.expressad.a.f18405a;
            }
        }
        com.anythink.expressad.e.b.a aVar = new com.anythink.expressad.e.b.a(t.b().g());
        if (this.f19119w == null) {
            this.f19119w = a(this.f19107d);
        }
        if (this.f19119w == null) {
            return;
        }
        if (this.f19112p) {
            a(f19101h, "get wxscheme failed : request times is max");
            return;
        }
        this.f19115s = 0;
        aVar.a(1, e.a().f20136a, new com.anythink.expressad.foundation.g.f.h.b(this.f19119w), new com.anythink.expressad.foundation.g.f.b((char) 0), new a(this));
    }

    public static final class a extends com.anythink.expressad.e.c.a {

        /* renamed from: a, reason: collision with root package name */
        private c f19120a;

        public a(c cVar) {
            this.f19120a = cVar;
        }

        @Override // com.anythink.expressad.e.c.a, com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
        public final void a(l<JSONObject> lVar) {
            super.a(lVar);
            c cVar = this.f19120a;
            if (cVar == null) {
                return;
            }
            cVar.f19113q = false;
            if (lVar == null || lVar.f20185a == null) {
                c.b(this.f19120a);
                return;
            }
            try {
                c.a(this.f19120a, lVar);
            } catch (b e9) {
                this.f19120a.a(-2, e9.getMessage());
            }
        }

        @Override // com.anythink.expressad.e.c.a, com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
        public final void a(com.anythink.expressad.foundation.g.f.a.a aVar) {
            super.a(aVar);
            c cVar = this.f19120a;
            if (cVar == null) {
                return;
            }
            cVar.f19113q = false;
            c.a(this.f19120a, aVar);
        }
    }

    public final void b() {
        this.f19114r = false;
        this.f19113q = false;
        this.f19111o = null;
    }

    private void b(boolean z6) {
        this.f19113q = z6;
    }

    public static /* synthetic */ void b(c cVar) {
        if (cVar.f19111o != null) {
            boolean z6 = com.anythink.expressad.a.f18405a;
            try {
                cVar.f19111o.c(1, "response or result is null", cVar.f19110g);
            } catch (Exception unused) {
                boolean z9 = com.anythink.expressad.a.f18405a;
            }
        }
    }

    private void a(com.anythink.expressad.foundation.g.f.a.a aVar) {
        int i4;
        String str;
        if (this.f19111o == null) {
            return;
        }
        if (aVar != null) {
            i4 = aVar.f20015a;
            str = aVar.getMessage();
            if (i4 == 10) {
                str = "request timeout";
            }
        } else {
            i4 = -1;
            str = "unKnown";
        }
        if (com.anythink.expressad.a.f18405a) {
            String.valueOf(i4);
        }
        try {
            this.f19111o.c(i4, "network error: ".concat(String.valueOf(str)), this.f19110g);
        } catch (Exception unused) {
            boolean z6 = com.anythink.expressad.a.f18405a;
        }
    }

    private void a(l<JSONObject> lVar) {
        JSONObject jSONObject = lVar.f20185a;
        if (com.anythink.expressad.a.f18405a) {
            jSONObject.toString();
        }
        if (jSONObject.has("wx_scheme")) {
            String optString = jSONObject.optString("wx_scheme", "");
            if (!TextUtils.isEmpty(optString)) {
                this.f19114r = true;
                if (this.f19111o != null) {
                    try {
                        this.f19118v = optString;
                        this.f19111o.b(optString);
                        return;
                    } catch (Exception unused) {
                        boolean z6 = com.anythink.expressad.a.f18405a;
                        return;
                    }
                }
                return;
            }
            throw new b("wx_scheme value is null");
        }
        int optInt = jSONObject.optInt("error_code", -1);
        String optString2 = jSONObject.optString("error_msg", "");
        if (optInt == f19101h) {
            this.f19112p = true;
        }
        a(optInt, optString2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i4, String str) {
        if (this.f19111o == null) {
            return;
        }
        if (com.anythink.expressad.a.f18405a) {
            String.valueOf(i4);
        }
        try {
            this.f19111o.b(i4, str, this.f19110g);
        } catch (Exception unused) {
            boolean z6 = com.anythink.expressad.a.f18405a;
        }
    }

    private void a(String str) {
        if (this.f19111o == null) {
            return;
        }
        boolean z6 = com.anythink.expressad.a.f18405a;
        try {
            this.f19118v = str;
            this.f19111o.b(str);
        } catch (Exception unused) {
            boolean z9 = com.anythink.expressad.a.f18405a;
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
                boolean z6 = com.anythink.expressad.a.f18405a;
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
                            if (TextUtils.equals(next, f19103k) || TextUtils.equals(next, f19102j)) {
                                try {
                                    str = URLEncoder.encode(str, "UTF-8");
                                } catch (Exception unused3) {
                                    boolean z9 = com.anythink.expressad.a.f18405a;
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
                            boolean z10 = com.anythink.expressad.a.f18405a;
                        }
                    }
                    boolean z62 = com.anythink.expressad.a.f18405a;
                }
                str2 = parse.getQueryParameter("app");
            }
        }
        return hashMap;
        str4 = "";
        hashMap.put(com.anythink.expressad.a.f18392M, str4);
        try {
            String encode = URLEncoder.encode(sb.toString(), "UTF-8");
            if (encode != null) {
                str = encode;
            }
        } catch (UnsupportedEncodingException unused5) {
            boolean z11 = com.anythink.expressad.a.f18405a;
        }
        hashMap.put(com.anythink.expressad.a.f18391L, str);
        hashMap.put(com.anythink.expressad.a.f18393N, "0");
        boolean z12 = com.anythink.expressad.a.f18405a;
        this.f19110g = e.a().f20136a + "?" + ("app=" + str2 + "&path=" + str3 + "&query=" + str + "&clickid=" + str4 + "&is_redirect=1");
        return hashMap;
        str3 = "";
        hashMap.put(com.anythink.expressad.a.f18390K, str3);
        try {
            str4 = parse.getQueryParameter(com.anythink.expressad.a.f18392M);
        } catch (Exception unused6) {
            boolean z13 = com.anythink.expressad.a.f18405a;
        }
        hashMap.put(com.anythink.expressad.a.f18391L, str);
        hashMap.put(com.anythink.expressad.a.f18393N, "0");
        boolean z122 = com.anythink.expressad.a.f18405a;
        this.f19110g = e.a().f20136a + "?" + ("app=" + str2 + "&path=" + str3 + "&query=" + str + "&clickid=" + str4 + "&is_redirect=1");
        return hashMap;
        str2 = "";
        hashMap.put("app", str2);
        try {
            str3 = parse.getQueryParameter(com.anythink.expressad.a.f18390K);
        } catch (Exception unused7) {
            boolean z14 = com.anythink.expressad.a.f18405a;
        }
    }

    public final void a(boolean z6) {
        this.f19117u = z6;
    }

    private boolean a(int i4) {
        com.anythink.expressad.foundation.d.d dVar;
        int R8;
        if (!this.f19116t) {
            this.f19116t = c("1") && (dVar = this.f19107d) != null && ((R8 = dVar.R()) == 8 || R8 == 9);
        }
        if (!this.f19116t) {
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
        if (this.f19113q) {
            return false;
        }
        if (!this.f19116t) {
            this.f19116t = c("1") && (dVar = this.f19107d) != null && ((R8 = dVar.R()) == 8 || R8 == 9);
        }
        return (!this.f19116t ? false : d("2")) && this.f19115s == -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(c cVar, l lVar) {
        JSONObject jSONObject = (JSONObject) lVar.f20185a;
        if (com.anythink.expressad.a.f18405a) {
            jSONObject.toString();
        }
        if (jSONObject.has("wx_scheme")) {
            String optString = jSONObject.optString("wx_scheme", "");
            if (!TextUtils.isEmpty(optString)) {
                cVar.f19114r = true;
                if (cVar.f19111o != null) {
                    try {
                        cVar.f19118v = optString;
                        cVar.f19111o.b(optString);
                        return;
                    } catch (Exception unused) {
                        boolean z6 = com.anythink.expressad.a.f18405a;
                        return;
                    }
                }
                return;
            }
            throw new b("wx_scheme value is null");
        }
        int optInt = jSONObject.optInt("error_code", -1);
        String optString2 = jSONObject.optString("error_msg", "");
        if (optInt == f19101h) {
            cVar.f19112p = true;
        }
        cVar.a(optInt, optString2);
    }

    public static /* synthetic */ void a(c cVar, com.anythink.expressad.foundation.g.f.a.a aVar) {
        int i4;
        String str;
        if (cVar.f19111o != null) {
            if (aVar != null) {
                i4 = aVar.f20015a;
                str = aVar.getMessage();
                if (i4 == 10) {
                    str = "request timeout";
                }
            } else {
                i4 = -1;
                str = "unKnown";
            }
            if (com.anythink.expressad.a.f18405a) {
                String.valueOf(i4);
            }
            try {
                cVar.f19111o.c(i4, "network error: ".concat(String.valueOf(str)), cVar.f19110g);
            } catch (Exception unused) {
                boolean z6 = com.anythink.expressad.a.f18405a;
            }
        }
    }
}
