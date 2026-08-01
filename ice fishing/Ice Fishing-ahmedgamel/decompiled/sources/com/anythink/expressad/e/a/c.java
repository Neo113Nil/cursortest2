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
    public static final int f18311a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f18312b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static String f18313c = "AppletsModel";

    /* renamed from: h, reason: collision with root package name */
    private static final int f18314h = 44993;
    private static final String i = "UTF-8";

    /* renamed from: j, reason: collision with root package name */
    private static final String f18315j = "install_callback";

    /* renamed from: k, reason: collision with root package name */
    private static final String f18316k = "event_callback";

    /* renamed from: l, reason: collision with root package name */
    private static final String f18317l = "wx_miniprogram";

    /* renamed from: m, reason: collision with root package name */
    private static final String f18318m = "0";

    /* renamed from: n, reason: collision with root package name */
    private static final String f18319n = "1";

    /* renamed from: d, reason: collision with root package name */
    private final com.anythink.expressad.foundation.d.d f18320d;

    /* renamed from: e, reason: collision with root package name */
    private final String f18321e;

    /* renamed from: f, reason: collision with root package name */
    private final String f18322f;

    /* renamed from: g, reason: collision with root package name */
    private String f18323g;

    /* renamed from: o, reason: collision with root package name */
    private volatile d f18324o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f18325p = false;

    /* renamed from: q, reason: collision with root package name */
    private volatile boolean f18326q = false;

    /* renamed from: r, reason: collision with root package name */
    private volatile boolean f18327r = false;

    /* renamed from: s, reason: collision with root package name */
    private int f18328s = -1;

    /* renamed from: t, reason: collision with root package name */
    private boolean f18329t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f18330u = false;

    /* renamed from: v, reason: collision with root package name */
    private String f18331v = "";

    /* renamed from: w, reason: collision with root package name */
    private Map<String, String> f18332w;

    public static final class b extends Exception {
        public b(String str) {
            super(str);
        }
    }

    public c(com.anythink.expressad.foundation.d.d dVar, String str, String str2) {
        this.f18320d = dVar;
        this.f18321e = str;
        this.f18322f = str2;
    }

    private void b(d dVar) {
        this.f18324o = dVar;
    }

    private boolean c() {
        return this.f18326q;
    }

    private void d() {
        this.f18326q = false;
    }

    private boolean e() {
        return this.f18327r;
    }

    private String f() {
        return this.f18323g;
    }

    private void g() {
        if (this.f18324o == null) {
            return;
        }
        try {
            this.f18324o.b();
        } catch (Exception unused) {
            boolean z3 = com.anythink.expressad.a.f17618a;
        }
    }

    private String h() {
        return this.f18331v;
    }

    private void i() {
        if (this.f18324o == null) {
            return;
        }
        boolean z3 = com.anythink.expressad.a.f17618a;
        try {
            this.f18324o.c(1, "response or result is null", this.f18323g);
        } catch (Exception unused) {
            boolean z6 = com.anythink.expressad.a.f17618a;
        }
    }

    private boolean j() {
        com.anythink.expressad.foundation.d.d dVar = this.f18320d;
        if (dVar == null) {
            return false;
        }
        int R8 = dVar.R();
        return R8 == 8 || R8 == 9;
    }

    private boolean k() {
        return this.f18325p;
    }

    private boolean l() {
        com.anythink.expressad.foundation.d.d dVar;
        int R8;
        if (!this.f18329t) {
            this.f18329t = c("1") && (dVar = this.f18320d) != null && ((R8 = dVar.R()) == 8 || R8 == 9);
        }
        return this.f18329t;
    }

    private static String b(String str) {
        return y.s(new StringBuilder(), e.a().f19349a, "?", str);
    }

    private boolean c(String str) {
        try {
            com.anythink.expressad.foundation.d.d dVar = this.f18320d;
            if (dVar == null) {
                return false;
            }
            String af = dVar.af();
            if (TextUtils.isEmpty(af)) {
                return false;
            }
            return TextUtils.equals(z.a(af, "wx_miniprogram"), str);
        } catch (Exception unused) {
            boolean z3 = com.anythink.expressad.a.f17618a;
            return false;
        }
    }

    private boolean d(String str) {
        d.c N8;
        try {
            com.anythink.expressad.foundation.d.d dVar = this.f18320d;
            if (dVar != null && (N8 = dVar.N()) != null && !TextUtils.isEmpty(N8.e())) {
                return TextUtils.equals(z.a(N8.e(), com.anythink.expressad.a.f17601H), str);
            }
            return false;
        } catch (Exception unused) {
            boolean z3 = com.anythink.expressad.a.f17618a;
            return false;
        }
    }

    public final void a(d dVar) {
        if (this.f18320d == null || TextUtils.isEmpty(this.f18321e)) {
            return;
        }
        boolean z3 = com.anythink.expressad.a.f17618a;
        this.f18326q = true;
        this.f18324o = dVar;
        if (this.f18324o != null) {
            try {
                this.f18324o.b();
            } catch (Exception unused) {
                boolean z6 = com.anythink.expressad.a.f17618a;
            }
        }
        com.anythink.expressad.e.b.a aVar = new com.anythink.expressad.e.b.a(t.b().g());
        if (this.f18332w == null) {
            this.f18332w = a(this.f18320d);
        }
        if (this.f18332w == null) {
            return;
        }
        if (this.f18325p) {
            a(f18314h, "get wxscheme failed : request times is max");
            return;
        }
        this.f18328s = 0;
        aVar.a(1, e.a().f19349a, new com.anythink.expressad.foundation.g.f.h.b(this.f18332w), new com.anythink.expressad.foundation.g.f.b((char) 0), new a(this));
    }

    public static final class a extends com.anythink.expressad.e.c.a {

        /* renamed from: a, reason: collision with root package name */
        private c f18333a;

        public a(c cVar) {
            this.f18333a = cVar;
        }

        @Override // com.anythink.expressad.e.c.a, com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
        public final void a(l<JSONObject> lVar) {
            super.a(lVar);
            c cVar = this.f18333a;
            if (cVar == null) {
                return;
            }
            cVar.f18326q = false;
            if (lVar == null || lVar.f19398a == null) {
                c.b(this.f18333a);
                return;
            }
            try {
                c.a(this.f18333a, lVar);
            } catch (b e9) {
                this.f18333a.a(-2, e9.getMessage());
            }
        }

        @Override // com.anythink.expressad.e.c.a, com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
        public final void a(com.anythink.expressad.foundation.g.f.a.a aVar) {
            super.a(aVar);
            c cVar = this.f18333a;
            if (cVar == null) {
                return;
            }
            cVar.f18326q = false;
            c.a(this.f18333a, aVar);
        }
    }

    public final void b() {
        this.f18327r = false;
        this.f18326q = false;
        this.f18324o = null;
    }

    private void b(boolean z3) {
        this.f18326q = z3;
    }

    public static /* synthetic */ void b(c cVar) {
        if (cVar.f18324o != null) {
            boolean z3 = com.anythink.expressad.a.f17618a;
            try {
                cVar.f18324o.c(1, "response or result is null", cVar.f18323g);
            } catch (Exception unused) {
                boolean z6 = com.anythink.expressad.a.f17618a;
            }
        }
    }

    private void a(com.anythink.expressad.foundation.g.f.a.a aVar) {
        int i6;
        String str;
        if (this.f18324o == null) {
            return;
        }
        if (aVar != null) {
            i6 = aVar.f19228a;
            str = aVar.getMessage();
            if (i6 == 10) {
                str = "request timeout";
            }
        } else {
            i6 = -1;
            str = "unKnown";
        }
        if (com.anythink.expressad.a.f17618a) {
            String.valueOf(i6);
        }
        try {
            this.f18324o.c(i6, "network error: ".concat(String.valueOf(str)), this.f18323g);
        } catch (Exception unused) {
            boolean z3 = com.anythink.expressad.a.f17618a;
        }
    }

    private void a(l<JSONObject> lVar) {
        JSONObject jSONObject = lVar.f19398a;
        if (com.anythink.expressad.a.f17618a) {
            jSONObject.toString();
        }
        if (jSONObject.has("wx_scheme")) {
            String optString = jSONObject.optString("wx_scheme", "");
            if (!TextUtils.isEmpty(optString)) {
                this.f18327r = true;
                if (this.f18324o != null) {
                    try {
                        this.f18331v = optString;
                        this.f18324o.b(optString);
                        return;
                    } catch (Exception unused) {
                        boolean z3 = com.anythink.expressad.a.f17618a;
                        return;
                    }
                }
                return;
            }
            throw new b("wx_scheme value is null");
        }
        int optInt = jSONObject.optInt("error_code", -1);
        String optString2 = jSONObject.optString("error_msg", "");
        if (optInt == f18314h) {
            this.f18325p = true;
        }
        a(optInt, optString2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i6, String str) {
        if (this.f18324o == null) {
            return;
        }
        if (com.anythink.expressad.a.f17618a) {
            String.valueOf(i6);
        }
        try {
            this.f18324o.b(i6, str, this.f18323g);
        } catch (Exception unused) {
            boolean z3 = com.anythink.expressad.a.f17618a;
        }
    }

    private void a(String str) {
        if (this.f18324o == null) {
            return;
        }
        boolean z3 = com.anythink.expressad.a.f17618a;
        try {
            this.f18331v = str;
            this.f18324o.b(str);
        } catch (Exception unused) {
            boolean z6 = com.anythink.expressad.a.f17618a;
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
                boolean z3 = com.anythink.expressad.a.f17618a;
            }
            if (parse != null && parse.getQueryParameterNames() != null) {
                sb = new StringBuilder();
                Iterator<String> it = parse.getQueryParameterNames().iterator();
                int i6 = 0;
                while (true) {
                    str = "";
                    if (it.hasNext()) {
                        String next = it.next();
                        if (!TextUtils.isEmpty(next) && !TextUtils.equals(next, "wx_miniprogram")) {
                            try {
                                str = parse.getQueryParameter(next);
                            } catch (Exception unused2) {
                            }
                            if (TextUtils.equals(next, f18316k) || TextUtils.equals(next, f18315j)) {
                                try {
                                    str = URLEncoder.encode(str, "UTF-8");
                                } catch (Exception unused3) {
                                    boolean z6 = com.anythink.expressad.a.f17618a;
                                }
                            }
                            sb.append(next);
                            sb.append("=");
                            sb.append(str);
                            if (i6 < parse.getQueryParameterNames().size()) {
                                sb.append("&");
                            }
                            i6++;
                        }
                    } else {
                        try {
                            break;
                        } catch (Exception unused4) {
                            boolean z9 = com.anythink.expressad.a.f17618a;
                        }
                    }
                    boolean z32 = com.anythink.expressad.a.f17618a;
                }
                str2 = parse.getQueryParameter("app");
            }
        }
        return hashMap;
        str4 = "";
        hashMap.put(com.anythink.expressad.a.f17605M, str4);
        try {
            String encode = URLEncoder.encode(sb.toString(), "UTF-8");
            if (encode != null) {
                str = encode;
            }
        } catch (UnsupportedEncodingException unused5) {
            boolean z10 = com.anythink.expressad.a.f17618a;
        }
        hashMap.put(com.anythink.expressad.a.f17604L, str);
        hashMap.put(com.anythink.expressad.a.f17606N, "0");
        boolean z11 = com.anythink.expressad.a.f17618a;
        this.f18323g = e.a().f19349a + "?" + ("app=" + str2 + "&path=" + str3 + "&query=" + str + "&clickid=" + str4 + "&is_redirect=1");
        return hashMap;
        str3 = "";
        hashMap.put(com.anythink.expressad.a.f17603K, str3);
        try {
            str4 = parse.getQueryParameter(com.anythink.expressad.a.f17605M);
        } catch (Exception unused6) {
            boolean z12 = com.anythink.expressad.a.f17618a;
        }
        hashMap.put(com.anythink.expressad.a.f17604L, str);
        hashMap.put(com.anythink.expressad.a.f17606N, "0");
        boolean z112 = com.anythink.expressad.a.f17618a;
        this.f18323g = e.a().f19349a + "?" + ("app=" + str2 + "&path=" + str3 + "&query=" + str + "&clickid=" + str4 + "&is_redirect=1");
        return hashMap;
        str2 = "";
        hashMap.put("app", str2);
        try {
            str3 = parse.getQueryParameter(com.anythink.expressad.a.f17603K);
        } catch (Exception unused7) {
            boolean z13 = com.anythink.expressad.a.f17618a;
        }
    }

    public final void a(boolean z3) {
        this.f18330u = z3;
    }

    private boolean a(int i6) {
        com.anythink.expressad.foundation.d.d dVar;
        int R8;
        if (!this.f18329t) {
            this.f18329t = c("1") && (dVar = this.f18320d) != null && ((R8 = dVar.R()) == 8 || R8 == 9);
        }
        if (!this.f18329t) {
            return false;
        }
        if (i6 != 0) {
            return i6 == 1;
        }
        return d("2");
    }

    public final boolean a() {
        com.anythink.expressad.foundation.d.d dVar;
        int R8;
        if (this.f18326q) {
            return false;
        }
        if (!this.f18329t) {
            this.f18329t = c("1") && (dVar = this.f18320d) != null && ((R8 = dVar.R()) == 8 || R8 == 9);
        }
        return (!this.f18329t ? false : d("2")) && this.f18328s == -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(c cVar, l lVar) {
        JSONObject jSONObject = (JSONObject) lVar.f19398a;
        if (com.anythink.expressad.a.f17618a) {
            jSONObject.toString();
        }
        if (jSONObject.has("wx_scheme")) {
            String optString = jSONObject.optString("wx_scheme", "");
            if (!TextUtils.isEmpty(optString)) {
                cVar.f18327r = true;
                if (cVar.f18324o != null) {
                    try {
                        cVar.f18331v = optString;
                        cVar.f18324o.b(optString);
                        return;
                    } catch (Exception unused) {
                        boolean z3 = com.anythink.expressad.a.f17618a;
                        return;
                    }
                }
                return;
            }
            throw new b("wx_scheme value is null");
        }
        int optInt = jSONObject.optInt("error_code", -1);
        String optString2 = jSONObject.optString("error_msg", "");
        if (optInt == f18314h) {
            cVar.f18325p = true;
        }
        cVar.a(optInt, optString2);
    }

    public static /* synthetic */ void a(c cVar, com.anythink.expressad.foundation.g.f.a.a aVar) {
        int i6;
        String str;
        if (cVar.f18324o != null) {
            if (aVar != null) {
                i6 = aVar.f19228a;
                str = aVar.getMessage();
                if (i6 == 10) {
                    str = "request timeout";
                }
            } else {
                i6 = -1;
                str = "unKnown";
            }
            if (com.anythink.expressad.a.f17618a) {
                String.valueOf(i6);
            }
            try {
                cVar.f18324o.c(i6, "network error: ".concat(String.valueOf(str)), cVar.f18323g);
            } catch (Exception unused) {
                boolean z3 = com.anythink.expressad.a.f17618a;
            }
        }
    }
}
