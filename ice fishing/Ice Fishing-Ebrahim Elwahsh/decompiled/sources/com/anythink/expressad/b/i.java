package com.anythink.expressad.b;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.anythink.expressad.b.l;
import com.anythink.expressad.foundation.g.h.a;
import com.anythink.expressad.foundation.h.u;
import com.google.android.gms.internal.ads.CL;
import java.net.URI;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final class i extends com.anythink.expressad.foundation.g.h.a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f18374a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f18375b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f18376c = 3;

    /* renamed from: g, reason: collision with root package name */
    private static final String f18377g = "SocketRequestTask";

    /* renamed from: h, reason: collision with root package name */
    private static final int f18378h = 10;

    /* renamed from: j, reason: collision with root package name */
    private Context f18379j;

    /* renamed from: k, reason: collision with root package name */
    private String f18380k;

    /* renamed from: l, reason: collision with root package name */
    private String f18381l;

    /* renamed from: m, reason: collision with root package name */
    private String f18382m;

    /* renamed from: n, reason: collision with root package name */
    private com.anythink.expressad.foundation.d.d f18383n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f18384o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f18385p;

    /* renamed from: q, reason: collision with root package name */
    private int f18386q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f18387r;

    /* renamed from: s, reason: collision with root package name */
    private com.anythink.expressad.b.a.a f18388s;

    /* renamed from: t, reason: collision with root package name */
    private com.anythink.expressad.b.a.b f18389t;

    /* renamed from: u, reason: collision with root package name */
    private e f18390u;

    /* renamed from: v, reason: collision with root package name */
    private h f18391v;
    private final Semaphore i = new Semaphore(0);

    /* renamed from: w, reason: collision with root package name */
    private final l.a f18392w = new l.a() { // from class: com.anythink.expressad.b.i.1
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
                    i.this.f18389t.a(true);
                    if (i.this.f18391v != null) {
                        i.this.f18391v.a(i.this.f18389t);
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
            i.this.f18389t.c(str2);
            b();
        }

        @Override // com.anythink.expressad.b.l.a
        public final void a(String str, String str2, String str3) {
            if (!TextUtils.isEmpty(str2)) {
                i.this.f18389t.b(str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                i.this.f18389t.c(str3);
            }
            i.a(i.this, str);
            b();
        }
    };

    public i(com.anythink.expressad.b.a.c cVar) {
        this.f18379j = cVar.a();
        this.f18380k = cVar.b();
        this.f18381l = cVar.c();
        this.f18382m = cVar.d();
        this.f18383n = cVar.e();
        this.f18384o = cVar.f();
        this.f18385p = cVar.g();
        this.f18386q = cVar.i();
        this.f18387r = cVar.h();
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
        if (!this.f18387r) {
            return str;
        }
        String c4 = com.anythink.expressad.f.a.c(str);
        return !TextUtils.isEmpty(c4) ? CL.j(str, c4) : str;
    }

    public final void a(e eVar) {
        this.f18390u = eVar;
    }

    private boolean b(String str) {
        return j.a(str, this.f18389t);
    }

    public final void a(h hVar) {
        this.f18391v = hVar;
    }

    @Override // com.anythink.expressad.foundation.g.h.a
    public final void a() {
        com.anythink.expressad.b.a.b bVar = new com.anythink.expressad.b.a.b();
        this.f18389t = bVar;
        bVar.e(this.f18380k);
        com.anythink.expressad.b.a.b a9 = a(this.f18380k);
        this.f18389t = a9;
        if (a9 != null && !TextUtils.isEmpty(a9.e())) {
            this.f18389t.a(true);
        }
        if (this.f19717e != a.b.RUNNING) {
            h hVar = this.f18391v;
            if (hVar != null) {
                hVar.a(this.f18389t);
                return;
            }
            return;
        }
        if (!this.f18389t.g()) {
            h hVar2 = this.f18391v;
            if (hVar2 != null) {
                hVar2.a(this.f18389t);
                return;
            }
            return;
        }
        com.anythink.expressad.b.a.a aVar = this.f18388s;
        if (aVar != null) {
            this.f18389t.a(aVar.f18280f);
        }
        j.a(this.f18389t, this.f18388s, this.f18381l, this.f18382m, this.f18379j, this.f18392w, this.f18391v, this.i);
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
        String c4 = c(str);
        com.anythink.expressad.b.a.b bVar = new com.anythink.expressad.b.a.b();
        k kVar = new k();
        f fVar = new f();
        String str6 = "";
        try {
        } catch (Exception e6) {
            e = e6;
            str2 = "";
        }
        if (!URLUtil.isNetworkUrl(c4)) {
            str3 = "";
            str4 = c4;
            i = 0;
            while (true) {
                if (i >= 10) {
                }
                str4 = c(str5);
                i++;
            }
            return bVar;
        }
        URI create = URI.create(c4);
        str2 = create.getScheme();
        try {
            str6 = create.getHost();
        } catch (Exception e9) {
            e = e9;
            e.getMessage();
            str3 = str6;
            str6 = str2;
            str4 = c4;
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
        str4 = c4;
        i = 0;
        while (true) {
            if (i >= 10) {
                break;
            }
            if (this.f19717e != a.b.RUNNING) {
                return null;
            }
            if (str4.startsWith("tcp")) {
                this.f18388s = kVar.a(str4, this.f18383n, this.f18384o, this.f18385p);
                i4 = 3;
            } else {
                this.f18388s = fVar.a(str4, this.f18384o, this.f18385p, this.f18383n);
                i4 = 1;
            }
            com.anythink.expressad.b.a.a aVar = this.f18388s;
            if (aVar == null) {
                bVar.e(str4);
                bVar.a(false);
                break;
            }
            if (!TextUtils.isEmpty(aVar.f18282h)) {
                bVar.e(str4);
                bVar.b(this.f18388s.f18282h);
                bVar.b(i4);
                bVar.a(this.f18388s.a());
                bVar.a(false);
                if (i == 0) {
                    com.anythink.expressad.b.b.a.a().a(str4, this.f18388s.f18282h, this.f18383n, this.f18382m, this.f18384o, this.f18385p, this.f18386q);
                }
            } else {
                int i9 = this.f18388s.f18280f;
                if (i9 == 200) {
                    bVar.b(true);
                    bVar.e(str4);
                    bVar.a(true);
                    String str7 = this.f18388s.f18281g;
                    bVar.c(str7 != null ? str7 : null);
                } else if (i9 != 301 && i9 != 302 && i9 != 307) {
                    bVar.b(false);
                    bVar.e(str4);
                    if (i == 0) {
                        com.anythink.expressad.b.b.a.a().a(str4, this.f18388s.f18282h, this.f18383n, this.f18382m, this.f18384o, this.f18385p, this.f18386q);
                    }
                } else {
                    bVar.a(true);
                    bVar.b();
                    if (TextUtils.isEmpty(this.f18388s.f18275a)) {
                        bVar.b(true);
                        bVar.e(str4);
                        break;
                    }
                    str5 = this.f18388s.f18275a;
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
        return j.a(str, iVar.f18389t);
    }
}
