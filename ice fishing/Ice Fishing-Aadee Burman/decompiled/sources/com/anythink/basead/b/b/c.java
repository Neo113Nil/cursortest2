package com.anythink.basead.b.b;

import android.text.TextUtils;
import android.util.Log;
import com.anythink.basead.b.b.a;
import com.anythink.core.basead.ui.web.WebLandPageActivity;
import com.anythink.core.common.d.s;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.ay;
import com.anythink.core.common.h.bk;
import com.anythink.core.common.h.r;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Objects;

/* loaded from: classes.dex */
public class c extends com.anythink.basead.b.b.a {

    /* renamed from: h, reason: collision with root package name */
    int f5763h;
    boolean i;

    /* renamed from: j, reason: collision with root package name */
    a f5764j;

    /* renamed from: k, reason: collision with root package name */
    com.anythink.basead.d.j f5765k;

    /* renamed from: l, reason: collision with root package name */
    d f5766l;

    /* renamed from: m, reason: collision with root package name */
    private final String f5767m;

    /* renamed from: n, reason: collision with root package name */
    private final int f5768n;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        long f5769a;

        /* renamed from: b, reason: collision with root package name */
        long f5770b;

        /* renamed from: c, reason: collision with root package name */
        String f5771c;

        public final boolean a() {
            return System.currentTimeMillis() - this.f5769a <= this.f5770b;
        }
    }

    public c(a.C0006a c0006a) {
        super(c0006a);
        this.f5767m = "c";
        this.f5768n = 10;
        this.f5765k = null;
        w wVar = this.f5744c;
        if (wVar != null) {
            this.f5763h = wVar.K();
            x xVar = this.f5745d;
            if (xVar != null) {
                w wVar2 = this.f5744c;
                y yVar = xVar.f14168o;
                boolean z3 = false;
                if (!(wVar2 instanceof r) ? !(!(wVar2 instanceof ay) || ((ay) wVar2).d() != 1) : !(!(yVar instanceof bk) || ((bk) yVar).b() != 1)) {
                    z3 = true;
                }
                this.i = z3;
            }
        }
    }

    private String b(String str, com.anythink.basead.d.e eVar) {
        String e9;
        com.anythink.basead.d.e a9;
        if (com.anythink.basead.b.e.c(this.f5744c) && TextUtils.isEmpty(eVar.f6141a) && (a9 = com.anythink.basead.f.e.a.a.a(this.f5745d, this.f5744c, str)) != null) {
            eVar.f6141a = a9.f6141a;
            eVar.f6143c = a9.f6143c;
        }
        a aVar = this.f5764j;
        if (aVar == null || !aVar.a()) {
            e9 = e(eVar.f6141a);
            if (!TextUtils.isEmpty(e9)) {
                this.f5764j = f(e9);
            }
        } else {
            e9 = this.f5764j.f5771c;
        }
        eVar.f6142b = e9;
        a(eVar);
        if (TextUtils.isEmpty(e9)) {
            return eVar.f6141a;
        }
        this.f5765k.f6216l = true;
        return e9;
    }

    private n c(String str, e eVar) {
        b bVar = this.f5747f;
        if (bVar != null && !bVar.a(str, this.f5748g)) {
            com.anythink.core.basead.b.c cVar = new com.anythink.core.basead.b.c();
            cVar.f11919c = this.f5744c;
            cVar.f11924h = this.f5745d;
            cVar.f11922f = str;
            cVar.f11923g = this.f5748g;
            cVar.f11926k = (eVar == e.HANDLE_SUCCESS_WITH_WEB_CLICK || eVar == e.HANDLE_DEEPLINK_REFUSE) ? false : true;
            WebLandPageActivity.a(this.f5743b, cVar);
        }
        return n.a(true, "ClickUrlClickAction execute success with INNER_BROWSER_TYPE");
    }

    private String e(String str) {
        String str2;
        HttpURLConnection httpURLConnection;
        String str3;
        boolean z3 = false;
        String str4 = str;
        for (int i = 0; i < 10; i++) {
            HttpURLConnection httpURLConnection2 = null;
            try {
                try {
                    httpURLConnection = (HttpURLConnection) new URL(str4).openConnection();
                } catch (Exception e9) {
                    e = e9;
                    str2 = str4;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                try {
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setInstanceFollowRedirects(false);
                    y yVar = this.f5745d.f14168o;
                    if (yVar != null && com.anythink.basead.b.b.a(9, yVar)) {
                        String h9 = com.anythink.core.common.v.m.h();
                        if (!TextUtils.isEmpty(h9)) {
                            httpURLConnection.addRequestProperty("User-Agent", h9);
                        }
                    }
                    httpURLConnection.setConnectTimeout(30000);
                    httpURLConnection.connect();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                        str3 = str4;
                        if (!z3 || responseCode == 200) {
                            httpURLConnection.disconnect();
                            return str3;
                        }
                        try {
                            com.anythink.core.common.u.e.a(this.f5745d, this.f5744c, str, str3, String.valueOf(responseCode), "");
                            httpURLConnection.disconnect();
                            return "";
                        } catch (Exception e10) {
                            e = e10;
                            httpURLConnection2 = httpURLConnection;
                            str2 = str3;
                            com.anythink.core.common.u.e.a(this.f5745d, this.f5744c, str, str2, "", e.getMessage());
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            return "";
                        }
                    }
                    str4 = httpURLConnection.getHeaderField("Location");
                    if (!com.anythink.core.basead.a.e.c(str4) && !str4.contains(".apk") && str4.startsWith("http")) {
                        httpURLConnection.disconnect();
                        httpURLConnection.disconnect();
                    }
                    z3 = true;
                    str3 = str4;
                    if (z3) {
                    }
                    httpURLConnection.disconnect();
                    return str3;
                } catch (Exception e11) {
                    e = e11;
                    str2 = str4;
                    httpURLConnection2 = httpURLConnection;
                }
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection2 = httpURLConnection;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                throw th;
            }
        }
        return "";
    }

    private synchronized a f(String str) {
        a aVar;
        aVar = new a();
        aVar.f5771c = str;
        aVar.f5770b = this.f5745d.f14168o.Z();
        aVar.f5769a = System.currentTimeMillis();
        return aVar;
    }

    public final void a(d dVar) {
        this.f5766l = dVar;
    }

    public final String d() {
        String e9;
        com.anythink.basead.d.e a9;
        b bVar = this.f5747f;
        if (bVar != null) {
            bVar.b();
            this.f5747f.a();
        }
        k kVar = this.f5746e;
        if (kVar != null) {
            this.f5765k = kVar.a();
        }
        String str = "";
        String H8 = this.f5744c.H() != null ? this.f5744c.H() : "";
        String str2 = this.f5745d.f14158d;
        if (str2 == null) {
            str2 = "";
        }
        String a10 = com.anythink.basead.b.j.a(H8.replaceAll("\\{req_id\\}", str2), this.f5765k, System.currentTimeMillis(), this.f5744c, true);
        com.anythink.basead.d.e eVar = (com.anythink.basead.b.e.c(this.f5744c) && this.f5744c.K() == 4) ? new com.anythink.basead.d.e("", "", "") : new com.anythink.basead.d.e(a10, "", "");
        a(eVar);
        int K7 = this.f5744c.K();
        if (K7 != 1) {
            if (K7 == 2 || K7 == 3) {
                if (com.anythink.basead.b.e.c(this.f5744c) && !TextUtils.isEmpty(this.f5744c.G())) {
                    str = e(a10);
                    String a11 = com.anythink.basead.f.e.a.a.a(str);
                    eVar.f6142b = str;
                    eVar.f6143c = a11;
                    a(eVar);
                }
                return TextUtils.isEmpty(str) ? eVar.f6141a : str;
            }
            if (K7 == 4) {
                if (com.anythink.basead.b.e.c(this.f5744c) && TextUtils.isEmpty(eVar.f6141a) && (a9 = com.anythink.basead.f.e.a.a.a(this.f5745d, this.f5744c, a10)) != null) {
                    eVar.f6141a = a9.f6141a;
                    eVar.f6143c = a9.f6143c;
                }
                a aVar = this.f5764j;
                if (aVar == null || !aVar.a()) {
                    e9 = e(eVar.f6141a);
                    if (!TextUtils.isEmpty(e9)) {
                        this.f5764j = f(e9);
                    }
                } else {
                    e9 = this.f5764j.f5771c;
                }
                eVar.f6142b = e9;
                a(eVar);
                if (TextUtils.isEmpty(e9)) {
                    return eVar.f6141a;
                }
                this.f5765k.f6216l = true;
                return e9;
            }
        } else {
            if (!a10.startsWith("http")) {
                return a10;
            }
            a aVar2 = this.f5764j;
            boolean z3 = aVar2 != null && aVar2.a();
            if (this.i) {
                str = this.f5744c.F();
                if (z3) {
                    str = this.f5764j.f5771c;
                }
            }
            if (!z3) {
                String e10 = e(a10);
                if (TextUtils.isEmpty(str)) {
                    str = e10;
                }
                if (!TextUtils.isEmpty(e10)) {
                    this.f5764j = f(e10);
                }
            } else if (TextUtils.isEmpty(str)) {
                str = this.f5764j.f5771c;
            }
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return eVar.f6141a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0191, code lost:
    
        if (com.anythink.basead.b.b.a(r11.f5743b, r11.f5745d, r11.f5744c, b(), r9, new com.anythink.basead.b.i()) == false) goto L112;
     */
    @Override // com.anythink.basead.b.b.a, com.anythink.basead.b.b.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n a(String str, e eVar) {
        b bVar;
        n a9;
        b bVar2;
        d dVar;
        Objects.toString(eVar);
        if (eVar == e.HANDLE_SUCCESS) {
            return n.a(true, "ClickUrlClickAction execute success with DeeplinkHandleType.HANDLE_SUCCESS before");
        }
        if (eVar == e.NO_HANDLE && (dVar = this.f5766l) != null) {
            n a10 = dVar.a();
            if (a10.f5864a) {
                return a10;
            }
            eVar = e.HANDLE_FAIL;
        }
        boolean z3 = false;
        if ((!TextUtils.isEmpty(this.f5744c.u()) || !TextUtils.isEmpty(this.f5744c.G())) && (bVar = this.f5747f) != null && eVar == e.HANDLE_FAIL) {
            bVar.a(false);
        }
        if (!TextUtils.isEmpty(this.f5744c.I()) && (this.f5744c.K() == 1 || this.f5744c.K() == 4)) {
            boolean b9 = com.anythink.core.basead.a.e.b(this.f5743b, this.f5744c.I());
            com.anythink.basead.d.j jVar = this.f5765k;
            if (jVar != null) {
                jVar.f6215k = new com.anythink.basead.d.b();
                com.anythink.basead.d.e b10 = b();
                com.anythink.basead.d.j jVar2 = this.f5765k;
                jVar2.f6215k.f6131a = b10 != null ? b10.f6143c : "";
                com.anythink.basead.d.a aVar = jVar2.i;
                if (aVar != null) {
                    aVar.f6116j = b9 ? 5 : aVar.f6116j;
                }
            }
            if (b9) {
                k kVar = this.f5746e;
                if (kVar != null) {
                    kVar.b();
                }
                com.anythink.basead.b.b.a(25, this.f5744c, this.f5765k);
                b bVar3 = this.f5747f;
                if (bVar3 != null) {
                    bVar3.c();
                }
                return n.a(true, "ClickUrlClickAction execute success with openApp");
            }
            com.anythink.basead.b.b.a(26, this.f5744c, this.f5765k);
        }
        com.anythink.basead.d.j jVar3 = this.f5765k;
        if (jVar3 != null && jVar3.i != null && this.f5744c.K() == 4) {
            com.anythink.basead.d.j jVar4 = this.f5765k;
            if (jVar4.f6216l) {
                s c9 = t.b().c();
                boolean z6 = c9 != null && c9.a();
                com.anythink.basead.d.a aVar2 = this.f5765k.i;
                aVar2.f6116j = z6 ? c9.checkDataFetchType(this.f5744c, this.f5745d) : aVar2.f6116j;
            } else {
                jVar4.i.f6116j = 3;
            }
        }
        k kVar2 = this.f5746e;
        if (kVar2 != null) {
            kVar2.b();
        }
        if (TextUtils.isEmpty(str)) {
            str = this.f5744c.F();
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            b bVar4 = this.f5747f;
            if (bVar4 != null) {
                bVar4.c();
            }
            return n.a(false, "ClickUrlClickAction execute fail with empty url");
        }
        x xVar = this.f5745d;
        if (xVar != null && com.anythink.core.basead.a.e.a(str2, xVar.f14168o)) {
            Log.d("anythink", "Offer click result FilterDeeplinkByScheme.");
            com.anythink.core.common.u.e.b(this.f5744c, this.f5745d, 3);
            b bVar5 = this.f5747f;
            if (bVar5 != null) {
                bVar5.c();
            }
            return n.a(false, "ClickUrlClickAction execute fail by FilterDeeplinkByScheme");
        }
        int K7 = this.f5744c.K();
        if (K7 == 1) {
            a9 = n.a(true, "ClickUrlClickAction execute success with MARKET_TYPE");
            boolean z9 = (str2 == null || str2.startsWith("http")) ? false : true;
            if (!com.anythink.core.basead.a.e.a(this.f5743b, str2, this.f5744c, this.f5745d) && !z9) {
                if (this.f5745d.f14168o.u() == 2) {
                    com.anythink.core.basead.b.c cVar = new com.anythink.core.basead.b.c();
                    cVar.f11919c = this.f5744c;
                    cVar.f11924h = this.f5745d;
                    cVar.f11922f = str2;
                    cVar.f11923g = this.f5748g;
                    WebLandPageActivity.a(this.f5743b, cVar);
                } else {
                    com.anythink.core.basead.a.e.b(str2);
                }
            }
        } else if (K7 != 2) {
            if (K7 != 3) {
                if (K7 != 4) {
                    a9 = K7 != 6 ? d(str2) : d(str2);
                } else {
                    com.anythink.basead.d.j jVar5 = this.f5765k;
                    if (jVar5 != null && jVar5.f6216l) {
                        if (TextUtils.isEmpty(str2)) {
                            com.anythink.core.basead.a.e.b(str2);
                        }
                        a9 = n.a(true, "ClickUrlClickAction execute success with APK_TYPE");
                    }
                    com.anythink.core.basead.a.e.b(str2);
                    a9 = n.a(true, "ClickUrlClickAction execute success with APK_TYPE");
                }
            }
            bVar2 = this.f5747f;
            if (bVar2 != null && !bVar2.a(str2, this.f5748g)) {
                com.anythink.core.basead.b.c cVar2 = new com.anythink.core.basead.b.c();
                cVar2.f11919c = this.f5744c;
                cVar2.f11924h = this.f5745d;
                cVar2.f11922f = str2;
                cVar2.f11923g = this.f5748g;
                if (eVar != e.HANDLE_SUCCESS_WITH_WEB_CLICK && eVar != e.HANDLE_DEEPLINK_REFUSE) {
                    z3 = true;
                }
                cVar2.f11926k = z3;
                WebLandPageActivity.a(this.f5743b, cVar2);
            }
            a9 = n.a(true, "ClickUrlClickAction execute success with INNER_BROWSER_TYPE");
        } else {
            if (eVar != e.HANDLE_SUCCESS_WITH_WEB_CLICK) {
                com.anythink.core.basead.a.e.b(str2);
                a9 = n.a(true, "ClickUrlClickAction execute success with BROWSER_TYPE");
            }
            bVar2 = this.f5747f;
            if (bVar2 != null) {
                com.anythink.core.basead.b.c cVar22 = new com.anythink.core.basead.b.c();
                cVar22.f11919c = this.f5744c;
                cVar22.f11924h = this.f5745d;
                cVar22.f11922f = str2;
                cVar22.f11923g = this.f5748g;
                if (eVar != e.HANDLE_SUCCESS_WITH_WEB_CLICK) {
                    z3 = true;
                }
                cVar22.f11926k = z3;
                WebLandPageActivity.a(this.f5743b, cVar22);
            }
            a9 = n.a(true, "ClickUrlClickAction execute success with INNER_BROWSER_TYPE");
        }
        b bVar6 = this.f5747f;
        if (bVar6 != null) {
            bVar6.c();
        }
        return a9;
    }

    private n c(String str) {
        return d(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        if (com.anythink.basead.b.b.a(r10.f5743b, r10.f5745d, r10.f5744c, b(), r8, new com.anythink.basead.b.i()) == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private n b(String str, e eVar) {
        String str2;
        String str3;
        int K7 = this.f5744c.K();
        boolean z3 = false;
        if (K7 != 1) {
            if (K7 == 2) {
                str2 = str;
                if (eVar != e.HANDLE_SUCCESS_WITH_WEB_CLICK) {
                    com.anythink.core.basead.a.e.b(str2);
                    return n.a(true, "ClickUrlClickAction execute success with BROWSER_TYPE");
                }
            } else {
                if (K7 != 3) {
                    if (K7 != 4) {
                        if (K7 != 6) {
                            return d(str);
                        }
                        return d(str);
                    }
                    com.anythink.basead.d.j jVar = this.f5765k;
                    if (jVar != null && jVar.f6216l) {
                        if (TextUtils.isEmpty(str)) {
                            com.anythink.core.basead.a.e.b(str);
                        } else {
                            str3 = str;
                        }
                        return n.a(true, "ClickUrlClickAction execute success with APK_TYPE");
                    }
                    str3 = str;
                    com.anythink.core.basead.a.e.b(str3);
                    return n.a(true, "ClickUrlClickAction execute success with APK_TYPE");
                }
                str2 = str;
            }
            b bVar = this.f5747f;
            if (bVar != null && !bVar.a(str2, this.f5748g)) {
                com.anythink.core.basead.b.c cVar = new com.anythink.core.basead.b.c();
                cVar.f11919c = this.f5744c;
                cVar.f11924h = this.f5745d;
                cVar.f11922f = str2;
                cVar.f11923g = this.f5748g;
                if (eVar != e.HANDLE_SUCCESS_WITH_WEB_CLICK && eVar != e.HANDLE_DEEPLINK_REFUSE) {
                    z3 = true;
                }
                cVar.f11926k = z3;
                WebLandPageActivity.a(this.f5743b, cVar);
            }
            return n.a(true, "ClickUrlClickAction execute success with INNER_BROWSER_TYPE");
        }
        n a9 = n.a(true, "ClickUrlClickAction execute success with MARKET_TYPE");
        if (str != null && !str.startsWith("http")) {
            z3 = true;
        }
        if (!com.anythink.core.basead.a.e.a(this.f5743b, str, this.f5744c, this.f5745d) && !z3) {
            if (this.f5745d.f14168o.u() == 2) {
                com.anythink.core.basead.b.c cVar2 = new com.anythink.core.basead.b.c();
                cVar2.f11919c = this.f5744c;
                cVar2.f11924h = this.f5745d;
                cVar2.f11922f = str;
                cVar2.f11923g = this.f5748g;
                WebLandPageActivity.a(this.f5743b, cVar2);
                return a9;
            }
            com.anythink.core.basead.a.e.b(str);
        }
        return a9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (com.anythink.basead.b.b.a(r7.f5743b, r7.f5745d, r7.f5744c, b(), r5, new com.anythink.basead.b.i()) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private n b(String str) {
        String str2;
        com.anythink.basead.d.j jVar = this.f5765k;
        if (jVar != null && jVar.f6216l) {
            if (TextUtils.isEmpty(str)) {
                com.anythink.core.basead.a.e.b(str);
            } else {
                str2 = str;
            }
            return n.a(true, "ClickUrlClickAction execute success with APK_TYPE");
        }
        str2 = str;
        com.anythink.core.basead.a.e.b(str2);
        return n.a(true, "ClickUrlClickAction execute success with APK_TYPE");
    }

    private n d(String str) {
        if (this.f5745d.f14168o.u() == 2) {
            com.anythink.core.basead.b.c cVar = new com.anythink.core.basead.b.c();
            cVar.f11919c = this.f5744c;
            cVar.f11924h = this.f5745d;
            cVar.f11922f = str;
            cVar.f11923g = this.f5748g;
            WebLandPageActivity.a(this.f5743b, cVar);
        } else {
            com.anythink.core.basead.a.e.b(str);
        }
        return n.a(true, "ClickUrlClickAction execute success with DEFAULT");
    }

    private String a(String str, com.anythink.basead.d.e eVar) {
        String str2;
        if (com.anythink.basead.b.e.c(this.f5744c) && !TextUtils.isEmpty(this.f5744c.G())) {
            str2 = e(str);
            String a9 = com.anythink.basead.f.e.a.a.a(str2);
            eVar.f6142b = str2;
            eVar.f6143c = a9;
            a(eVar);
        } else {
            str2 = "";
        }
        return TextUtils.isEmpty(str2) ? eVar.f6141a : str2;
    }

    private n a(String str) {
        n a9 = n.a(true, "ClickUrlClickAction execute success with MARKET_TYPE");
        boolean z3 = (str == null || str.startsWith("http")) ? false : true;
        if (!com.anythink.core.basead.a.e.a(this.f5743b, str, this.f5744c, this.f5745d) && !z3) {
            if (this.f5745d.f14168o.u() == 2) {
                com.anythink.core.basead.b.c cVar = new com.anythink.core.basead.b.c();
                cVar.f11919c = this.f5744c;
                cVar.f11924h = this.f5745d;
                cVar.f11922f = str;
                cVar.f11923g = this.f5748g;
                WebLandPageActivity.a(this.f5743b, cVar);
                return a9;
            }
            com.anythink.core.basead.a.e.b(str);
        }
        return a9;
    }

    private void a(com.anythink.basead.d.e eVar) {
        com.anythink.basead.b.d.a().a(this.f5744c.b(), this.f5744c.v(), eVar);
    }
}
