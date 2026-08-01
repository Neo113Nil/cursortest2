package com.anythink.expressad.b;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.anythink.expressad.b.l;
import com.anythink.expressad.foundation.g.h.a;
import com.anythink.expressad.foundation.h.u;
import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
import java.net.URI;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final class i extends com.anythink.expressad.foundation.g.h.a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f18216a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f18217b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f18218c = 3;

    /* renamed from: g, reason: collision with root package name */
    private static final String f18219g = "SocketRequestTask";

    /* renamed from: h, reason: collision with root package name */
    private static final int f18220h = 10;

    /* renamed from: j, reason: collision with root package name */
    private Context f18221j;

    /* renamed from: k, reason: collision with root package name */
    private String f18222k;

    /* renamed from: l, reason: collision with root package name */
    private String f18223l;

    /* renamed from: m, reason: collision with root package name */
    private String f18224m;

    /* renamed from: n, reason: collision with root package name */
    private com.anythink.expressad.foundation.d.d f18225n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f18226o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f18227p;

    /* renamed from: q, reason: collision with root package name */
    private int f18228q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f18229r;

    /* renamed from: s, reason: collision with root package name */
    private com.anythink.expressad.b.a.a f18230s;

    /* renamed from: t, reason: collision with root package name */
    private com.anythink.expressad.b.a.b f18231t;

    /* renamed from: u, reason: collision with root package name */
    private e f18232u;

    /* renamed from: v, reason: collision with root package name */
    private h f18233v;
    private final Semaphore i = new Semaphore(0);

    /* renamed from: w, reason: collision with root package name */
    private final l.a f18234w = new l.a() { // from class: com.anythink.expressad.b.i.1
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
                    i.this.f18231t.a(true);
                    if (i.this.f18233v != null) {
                        i.this.f18233v.a(i.this.f18231t);
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
            i.this.f18231t.c(str2);
            b();
        }

        @Override // com.anythink.expressad.b.l.a
        public final void a(String str, String str2, String str3) {
            if (!TextUtils.isEmpty(str2)) {
                i.this.f18231t.b(str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                i.this.f18231t.c(str3);
            }
            i.a(i.this, str);
            b();
        }
    };

    public i(com.anythink.expressad.b.a.c cVar) {
        this.f18221j = cVar.a();
        this.f18222k = cVar.b();
        this.f18223l = cVar.c();
        this.f18224m = cVar.d();
        this.f18225n = cVar.e();
        this.f18226o = cVar.f();
        this.f18227p = cVar.g();
        this.f18228q = cVar.i();
        this.f18229r = cVar.h();
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
        if (!this.f18229r) {
            return str;
        }
        String c9 = com.anythink.expressad.f.a.c(str);
        return !TextUtils.isEmpty(c9) ? AbstractC4404f.f(str, c9) : str;
    }

    public final void a(e eVar) {
        this.f18232u = eVar;
    }

    private boolean b(String str) {
        return j.a(str, this.f18231t);
    }

    public final void a(h hVar) {
        this.f18233v = hVar;
    }

    @Override // com.anythink.expressad.foundation.g.h.a
    public final void a() {
        com.anythink.expressad.b.a.b bVar = new com.anythink.expressad.b.a.b();
        this.f18231t = bVar;
        bVar.e(this.f18222k);
        com.anythink.expressad.b.a.b a9 = a(this.f18222k);
        this.f18231t = a9;
        if (a9 != null && !TextUtils.isEmpty(a9.e())) {
            this.f18231t.a(true);
        }
        if (this.f19559e != a.b.RUNNING) {
            h hVar = this.f18233v;
            if (hVar != null) {
                hVar.a(this.f18231t);
                return;
            }
            return;
        }
        if (!this.f18231t.g()) {
            h hVar2 = this.f18233v;
            if (hVar2 != null) {
                hVar2.a(this.f18231t);
                return;
            }
            return;
        }
        com.anythink.expressad.b.a.a aVar = this.f18230s;
        if (aVar != null) {
            this.f18231t.a(aVar.f18122f);
        }
        j.a(this.f18231t, this.f18230s, this.f18223l, this.f18224m, this.f18221j, this.f18234w, this.f18233v, this.i);
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
        int i6;
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
            if (this.f19559e != a.b.RUNNING) {
                return null;
            }
            if (str4.startsWith("tcp")) {
                this.f18230s = kVar.a(str4, this.f18225n, this.f18226o, this.f18227p);
                i6 = 3;
            } else {
                this.f18230s = fVar.a(str4, this.f18226o, this.f18227p, this.f18225n);
                i6 = 1;
            }
            com.anythink.expressad.b.a.a aVar = this.f18230s;
            if (aVar == null) {
                bVar.e(str4);
                bVar.a(false);
                break;
            }
            if (!TextUtils.isEmpty(aVar.f18124h)) {
                bVar.e(str4);
                bVar.b(this.f18230s.f18124h);
                bVar.b(i6);
                bVar.a(this.f18230s.a());
                bVar.a(false);
                if (i == 0) {
                    com.anythink.expressad.b.b.a.a().a(str4, this.f18230s.f18124h, this.f18225n, this.f18224m, this.f18226o, this.f18227p, this.f18228q);
                }
            } else {
                int i9 = this.f18230s.f18122f;
                if (i9 == 200) {
                    bVar.b(true);
                    bVar.e(str4);
                    bVar.a(true);
                    String str7 = this.f18230s.f18123g;
                    bVar.c(str7 != null ? str7 : null);
                } else if (i9 != 301 && i9 != 302 && i9 != 307) {
                    bVar.b(false);
                    bVar.e(str4);
                    if (i == 0) {
                        com.anythink.expressad.b.b.a.a().a(str4, this.f18230s.f18124h, this.f18225n, this.f18224m, this.f18226o, this.f18227p, this.f18228q);
                    }
                } else {
                    bVar.a(true);
                    bVar.b();
                    if (TextUtils.isEmpty(this.f18230s.f18117a)) {
                        bVar.b(true);
                        bVar.e(str4);
                        break;
                    }
                    str5 = this.f18230s.f18117a;
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
        return j.a(str, iVar.f18231t);
    }
}
