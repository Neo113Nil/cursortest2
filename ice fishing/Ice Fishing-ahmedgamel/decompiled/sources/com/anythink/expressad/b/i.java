package com.anythink.expressad.b;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.anythink.expressad.b.l;
import com.anythink.expressad.foundation.g.h.a;
import com.anythink.expressad.foundation.h.u;
import com.google.android.gms.internal.ads.Wv;
import java.net.URI;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final class i extends com.anythink.expressad.foundation.g.h.a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f19003a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f19004b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f19005c = 3;

    /* renamed from: g, reason: collision with root package name */
    private static final String f19006g = "SocketRequestTask";

    /* renamed from: h, reason: collision with root package name */
    private static final int f19007h = 10;

    /* renamed from: j, reason: collision with root package name */
    private Context f19008j;

    /* renamed from: k, reason: collision with root package name */
    private String f19009k;

    /* renamed from: l, reason: collision with root package name */
    private String f19010l;

    /* renamed from: m, reason: collision with root package name */
    private String f19011m;

    /* renamed from: n, reason: collision with root package name */
    private com.anythink.expressad.foundation.d.d f19012n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f19013o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f19014p;

    /* renamed from: q, reason: collision with root package name */
    private int f19015q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f19016r;

    /* renamed from: s, reason: collision with root package name */
    private com.anythink.expressad.b.a.a f19017s;

    /* renamed from: t, reason: collision with root package name */
    private com.anythink.expressad.b.a.b f19018t;

    /* renamed from: u, reason: collision with root package name */
    private e f19019u;

    /* renamed from: v, reason: collision with root package name */
    private h f19020v;
    private final Semaphore i = new Semaphore(0);

    /* renamed from: w, reason: collision with root package name */
    private final l.a f19021w = new l.a() { // from class: com.anythink.expressad.b.i.1
        @Override // com.anythink.expressad.b.l.a
        public final boolean a() {
            return false;
        }

        @Override // com.anythink.expressad.b.l.a
        public final boolean b(String str) {
            boolean a9 = i.a(i.this, str);
            if (a9) {
                b();
            }
            return a9;
        }

        @Override // com.anythink.expressad.b.l.a
        public final boolean a(String str) {
            boolean a9 = i.a(i.this, str);
            if (a9) {
                b();
            }
            return a9;
        }

        private void b() {
            synchronized (this) {
                try {
                    i.this.f19018t.a(true);
                    if (i.this.f19020v != null) {
                        i.this.f19020v.a(i.this.f19018t);
                    }
                    i.c(i.this);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.anythink.expressad.b.l.a
        public final void a(String str, String str2) {
            i.a(i.this, str);
            i.this.f19018t.c(str2);
            b();
        }

        @Override // com.anythink.expressad.b.l.a
        public final void a(String str, String str2, String str3) {
            if (!TextUtils.isEmpty(str2)) {
                i.this.f19018t.b(str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                i.this.f19018t.c(str3);
            }
            i.a(i.this, str);
            b();
        }
    };

    public i(com.anythink.expressad.b.a.c cVar) {
        this.f19008j = cVar.a();
        this.f19009k = cVar.b();
        this.f19010l = cVar.c();
        this.f19011m = cVar.d();
        this.f19012n = cVar.e();
        this.f19013o = cVar.f();
        this.f19014p = cVar.g();
        this.f19015q = cVar.i();
        this.f19016r = cVar.h();
    }

    private void d() {
        this.i.acquireUninterruptibly();
    }

    private void h() {
        this.i.release();
    }

    @Override // com.anythink.expressad.foundation.g.h.a
    public final void b() {
    }

    @Override // com.anythink.expressad.foundation.g.h.a
    public final void c() {
    }

    private String c(String str) {
        if (!this.f19016r) {
            return str;
        }
        String c9 = com.anythink.expressad.f.a.c(str);
        return !TextUtils.isEmpty(c9) ? Wv.g(str, c9) : str;
    }

    public final void a(e eVar) {
        this.f19019u = eVar;
    }

    private boolean b(String str) {
        return j.a(str, this.f19018t);
    }

    public final void a(h hVar) {
        this.f19020v = hVar;
    }

    @Override // com.anythink.expressad.foundation.g.h.a
    public final void a() {
        com.anythink.expressad.b.a.b bVar = new com.anythink.expressad.b.a.b();
        this.f19018t = bVar;
        bVar.e(this.f19009k);
        com.anythink.expressad.b.a.b a9 = a(this.f19009k);
        this.f19018t = a9;
        if (a9 != null && !TextUtils.isEmpty(a9.e())) {
            this.f19018t.a(true);
        }
        if (this.f20346e != a.b.RUNNING) {
            h hVar = this.f19020v;
            if (hVar != null) {
                hVar.a(this.f19018t);
                return;
            }
            return;
        }
        if (!this.f19018t.g()) {
            h hVar2 = this.f19020v;
            if (hVar2 != null) {
                hVar2.a(this.f19018t);
                return;
            }
            return;
        }
        com.anythink.expressad.b.a.a aVar = this.f19017s;
        if (aVar != null) {
            this.f19018t.a(aVar.f18909f);
        }
        j.a(this.f19018t, this.f19017s, this.f19010l, this.f19011m, this.f19008j, this.f19021w, this.f19020v, this.i);
    }

    public static /* synthetic */ void c(i iVar) {
        iVar.i.release();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0164 A[EDGE_INSN: B:72:0x0164->B:34:0x0164 BREAK  A[LOOP:0: B:11:0x0037->B:53:0x015c], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.anythink.expressad.b.a.b a(String str) {
        String str2;
        String str3;
        String str4;
        int i;
        int i4;
        String str5;
        String c9 = c(str);
        com.anythink.expressad.b.a.b bVar = new com.anythink.expressad.b.a.b();
        k kVar = new k();
        f fVar = new f();
        String str6 = "";
        try {
        } catch (Exception e9) {
            e = e9;
            str2 = "";
        }
        if (!URLUtil.isNetworkUrl(c9)) {
            str3 = "";
            str4 = c9;
            i = 0;
            while (true) {
                if (i >= 10) {
                }
                str4 = c(str5);
                i++;
            }
            return bVar;
        }
        URI create = URI.create(c9);
        str2 = create.getScheme();
        try {
            str6 = create.getHost();
        } catch (Exception e10) {
            e = e10;
            e.getMessage();
            str3 = str6;
            str6 = str2;
            str4 = c9;
            i = 0;
            while (true) {
                if (i >= 10) {
                }
                str4 = c(str5);
                i++;
            }
            return bVar;
        }
        str3 = str6;
        str6 = str2;
        str4 = c9;
        i = 0;
        while (true) {
            if (i >= 10) {
                break;
            }
            if (this.f20346e != a.b.RUNNING) {
                return null;
            }
            if (str4.startsWith("tcp")) {
                this.f19017s = kVar.a(str4, this.f19012n, this.f19013o, this.f19014p);
                i4 = 3;
            } else {
                this.f19017s = fVar.a(str4, this.f19013o, this.f19014p, this.f19012n);
                i4 = 1;
            }
            com.anythink.expressad.b.a.a aVar = this.f19017s;
            if (aVar == null) {
                bVar.e(str4);
                bVar.a(false);
                break;
            }
            if (!TextUtils.isEmpty(aVar.f18911h)) {
                bVar.e(str4);
                bVar.b(this.f19017s.f18911h);
                bVar.b(i4);
                bVar.a(this.f19017s.a());
                bVar.a(false);
                if (i == 0) {
                    com.anythink.expressad.b.b.a.a().a(str4, this.f19017s.f18911h, this.f19012n, this.f19011m, this.f19013o, this.f19014p, this.f19015q);
                }
            } else {
                int i6 = this.f19017s.f18909f;
                if (i6 == 200) {
                    bVar.b(true);
                    bVar.e(str4);
                    bVar.a(true);
                    String str7 = this.f19017s.f18910g;
                    bVar.c(str7 != null ? str7 : null);
                } else if (i6 != 301 && i6 != 302 && i6 != 307) {
                    bVar.b(false);
                    bVar.e(str4);
                    if (i == 0) {
                        com.anythink.expressad.b.b.a.a().a(str4, this.f19017s.f18911h, this.f19012n, this.f19011m, this.f19013o, this.f19014p, this.f19015q);
                    }
                } else {
                    bVar.a(true);
                    bVar.b();
                    if (TextUtils.isEmpty(this.f19017s.f18904a)) {
                        bVar.b(true);
                        bVar.e(str4);
                        break;
                    }
                    str5 = this.f19017s.f18904a;
                    if (!str5.startsWith("http")) {
                        if (!str5.startsWith("/") || TextUtils.isEmpty(str6) || TextUtils.isEmpty(str3)) {
                            break;
                        }
                        str5 = str6 + "://" + str3 + str5;
                        str3 = null;
                        str6 = null;
                    }
                    if (u.a.a(str5)) {
                        bVar.b(true);
                        bVar.e(str5);
                        break;
                    }
                    str4 = c(str5);
                    i++;
                }
            }
        }
        return bVar;
    }

    public static /* synthetic */ boolean a(i iVar, String str) {
        return j.a(str, iVar.f19018t);
    }
}
