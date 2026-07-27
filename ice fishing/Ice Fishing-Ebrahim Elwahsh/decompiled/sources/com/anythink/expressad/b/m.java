package com.anythink.expressad.b;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.anythink.expressad.b.l;
import com.anythink.expressad.foundation.g.h.a;
import com.anythink.expressad.foundation.h.u;
import com.google.android.gms.internal.ads.CL;
import java.net.URI;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final class m extends d implements a.InterfaceC0123a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f18432a = 1;
    public static final int i = 2;

    /* renamed from: j, reason: collision with root package name */
    private static final String f18433j = "302";

    /* renamed from: k, reason: collision with root package name */
    private e f18434k;

    /* renamed from: l, reason: collision with root package name */
    private com.anythink.expressad.b.a.b f18435l;

    /* renamed from: n, reason: collision with root package name */
    private boolean f18437n;

    /* renamed from: o, reason: collision with root package name */
    private Context f18438o;

    /* renamed from: p, reason: collision with root package name */
    private com.anythink.expressad.foundation.g.h.c f18439p;

    /* renamed from: q, reason: collision with root package name */
    private com.anythink.expressad.b.a.a f18440q;

    /* renamed from: s, reason: collision with root package name */
    private boolean f18442s;

    /* renamed from: m, reason: collision with root package name */
    private boolean f18436m = true;

    /* renamed from: r, reason: collision with root package name */
    private Handler f18441r = new Handler(Looper.getMainLooper());

    public class a extends com.anythink.expressad.foundation.g.h.a {

        /* renamed from: b, reason: collision with root package name */
        private static final int f18445b = 10;

        /* renamed from: g, reason: collision with root package name */
        private final Context f18448g;

        /* renamed from: h, reason: collision with root package name */
        private String f18449h;
        private String i;

        /* renamed from: j, reason: collision with root package name */
        private String f18450j;

        /* renamed from: k, reason: collision with root package name */
        private com.anythink.expressad.foundation.d.d f18451k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f18452l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f18453m;

        /* renamed from: n, reason: collision with root package name */
        private int f18454n;

        /* renamed from: c, reason: collision with root package name */
        private final Semaphore f18447c = new Semaphore(0);

        /* renamed from: o, reason: collision with root package name */
        private l.a f18455o = new l.a() { // from class: com.anythink.expressad.b.m.a.1
            @Override // com.anythink.expressad.b.l.a
            public final boolean a() {
                return false;
            }

            @Override // com.anythink.expressad.b.l.a
            public final boolean b(String str) {
                boolean a9 = a.a(a.this, str);
                if (a9) {
                    b();
                }
                return a9;
            }

            @Override // com.anythink.expressad.b.l.a
            public final boolean a(String str) {
                boolean a9 = a.a(a.this, str);
                if (a9) {
                    b();
                }
                return a9;
            }

            private void b() {
                synchronized (m.this) {
                    m.this.f18435l.a(true);
                    a.a(a.this);
                }
            }

            @Override // com.anythink.expressad.b.l.a
            public final void a(String str, String str2) {
                a.a(a.this, str);
                m.this.f18435l.c(str2);
                b();
            }

            @Override // com.anythink.expressad.b.l.a
            public final void a(String str, String str2, String str3) {
                if (!TextUtils.isEmpty(str2)) {
                    m.this.f18435l.b(str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    m.this.f18435l.c(str3);
                }
                a.a(a.this, str);
                b();
            }
        };

        public a(Context context, String str, String str2, String str3, com.anythink.expressad.foundation.d.d dVar, boolean z8, boolean z9, int i) {
            this.f18448g = context;
            this.f18449h = str;
            this.i = str2;
            this.f18450j = str3;
            this.f18451k = dVar;
            this.f18452l = z8;
            this.f18453m = z9;
            this.f18454n = i;
        }

        private static boolean a(int i) {
            return i == 301 || i == 302 || i == 307;
        }

        private void d() {
            this.f18447c.release();
        }

        private void h() {
            this.f18447c.acquireUninterruptibly();
        }

        @Override // com.anythink.expressad.foundation.g.h.a
        public final void b() {
        }

        @Override // com.anythink.expressad.foundation.g.h.a
        public final void c() {
        }

        private static boolean b(int i) {
            return i == 200;
        }

        private static boolean c(String str) {
            return !URLUtil.isNetworkUrl(str);
        }

        private static boolean d(String str) {
            return str.startsWith("/");
        }

        @Override // com.anythink.expressad.foundation.g.h.a
        public final void a() {
            if (m.this.f18434k != null) {
                e unused = m.this.f18434k;
            }
            m.this.f18435l = new com.anythink.expressad.b.a.b();
            m.this.f18435l.e(this.f18449h);
            m.this.f18435l = a(this.f18449h, this.f18452l, this.f18453m, this.f18451k, this.f18454n);
            if (!TextUtils.isEmpty(m.this.f18435l.e())) {
                m.this.f18435l.a(true);
            }
            if (m.this.f18436m && m.this.f18435l.g()) {
                if (m.this.f18440q != null) {
                    m.this.f18435l.a(m.this.f18440q.f18280f);
                }
                n.a(this.f18451k, m.this.f18435l, m.this.f18440q, this.i, this.f18450j, this.f18448g, this.f18455o, this.f18447c);
            }
        }

        private boolean b(String str) {
            return n.a(str, this.f18451k, m.this.f18435l);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x01be A[EDGE_INSN: B:84:0x01be->B:34:0x01be BREAK  A[LOOP:0: B:16:0x0045->B:58:0x01ba], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private com.anythink.expressad.b.a.b a(String str, boolean z8, boolean z9, com.anythink.expressad.foundation.d.d dVar, int i) {
            String str2;
            String str3;
            int i4;
            String str4 = "";
            if (m.this.f18437n) {
                String c4 = com.anythink.expressad.f.a.c(str);
                if (!TextUtils.isEmpty(c4)) {
                    str = CL.j(str, c4);
                }
            }
            com.anythink.expressad.b.a.b bVar = new com.anythink.expressad.b.a.b();
            f fVar = new f();
            try {
            } catch (Exception e6) {
                e = e6;
                str2 = "";
            }
            if (c(str)) {
                str3 = "";
                String str5 = str;
                String str6 = str3;
                i4 = 0;
                while (true) {
                    if (i4 >= 10) {
                    }
                    i4++;
                }
                return bVar;
            }
            URI create = URI.create(str);
            str2 = create.getScheme();
            try {
                str4 = create.getHost();
            } catch (Exception e9) {
                e = e9;
                e.printStackTrace();
                str3 = str4;
                str4 = str2;
                String str52 = str;
                String str62 = str3;
                i4 = 0;
                while (true) {
                    if (i4 >= 10) {
                    }
                    i4++;
                }
                return bVar;
            }
            str3 = str4;
            str4 = str2;
            String str522 = str;
            String str622 = str3;
            i4 = 0;
            while (true) {
                if (i4 >= 10) {
                    break;
                }
                if (!m.this.f18436m) {
                    return null;
                }
                m.this.f18440q = fVar.a(str522, z8, z9, dVar);
                if (m.this.f18440q != null) {
                    if (!TextUtils.isEmpty(m.this.f18440q.f18282h)) {
                        bVar.e(str522);
                        bVar.b(m.this.f18440q.f18282h);
                        bVar.b(1);
                        bVar.a(m.this.f18440q.a());
                        bVar.a(false);
                        if (i4 == 0) {
                            com.anythink.expressad.b.b.a.a().a(str522, m.this.f18440q.f18282h, dVar, this.f18450j, z8, z9, i);
                        }
                    } else {
                        bVar.a(true);
                        int i9 = m.this.f18440q.f18280f;
                        if (i9 != 301 && i9 != 302 && i9 != 307) {
                            if (m.this.f18440q.f18280f == 200) {
                                bVar.b(true);
                                bVar.e(str522);
                                bVar.c(m.this.f18440q.f18281g);
                            } else {
                                bVar.b(false);
                                bVar.e(str522);
                                if (i4 == 0) {
                                    com.anythink.expressad.b.b.a.a().a(str522, "error code:" + m.this.f18440q.f18280f, dVar, this.f18450j, z8, z9, i);
                                }
                            }
                        } else {
                            bVar.b();
                            if (!TextUtils.isEmpty(m.this.f18440q.f18275a)) {
                                str522 = m.this.f18440q.f18275a;
                                if (c(str522)) {
                                    if (!str522.startsWith("/") || TextUtils.isEmpty(str4) || TextUtils.isEmpty(str622)) {
                                        break;
                                    }
                                    str522 = str4 + "://" + str622 + str522;
                                    str622 = null;
                                    str4 = null;
                                } else if (!c(str522)) {
                                    try {
                                        URI create2 = URI.create(str522);
                                        str4 = create2.getScheme();
                                        str622 = create2.getHost();
                                    } catch (Exception e10) {
                                        e10.printStackTrace();
                                    }
                                }
                                if (!u.a.a(str522)) {
                                    if (m.this.f18437n) {
                                        String c9 = com.anythink.expressad.f.a.c(str522);
                                        if (!TextUtils.isEmpty(c9)) {
                                            str522 = CL.j(str522, c9);
                                        }
                                    }
                                    i4++;
                                } else {
                                    bVar.b(true);
                                    bVar.e(str522);
                                    break;
                                }
                            } else {
                                bVar.b(true);
                                bVar.e(str522);
                                break;
                            }
                        }
                    }
                } else {
                    bVar.e(str522);
                    bVar.a(false);
                    bVar.d("request url is invalided");
                    break;
                }
            }
            return bVar;
        }

        private static boolean a(String str) {
            return u.a.a(str);
        }

        public static /* synthetic */ boolean a(a aVar, String str) {
            return n.a(str, aVar.f18451k, m.this.f18435l);
        }

        public static /* synthetic */ void a(a aVar) {
            aVar.f18447c.release();
        }
    }

    public m(Context context) {
        this.f18438o = context;
        this.f18439p = new com.anythink.expressad.foundation.g.h.c(context, 2);
    }

    @Override // com.anythink.expressad.b.d
    public final void b() {
        this.f18436m = false;
    }

    private boolean a() {
        return this.f18436m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str, e eVar, boolean z8, String str2, String str3, com.anythink.expressad.foundation.d.d dVar, boolean z9, boolean z10, int i4) {
        a aVar;
        this.f18434k = eVar;
        this.f18437n = z8;
        com.anythink.expressad.b.a.c cVar = new com.anythink.expressad.b.a.c();
        cVar.a(this.f18438o);
        cVar.a(str);
        cVar.c(z8);
        cVar.b(str2);
        cVar.c(str3);
        cVar.a(dVar);
        cVar.a(z9);
        cVar.b(z10);
        cVar.a(i4);
        if (str.startsWith("tcp")) {
            i iVar = new i(cVar);
            iVar.a(this.f18434k);
            iVar.a(new h() { // from class: com.anythink.expressad.b.m.1
                @Override // com.anythink.expressad.b.h
                public final void a(com.anythink.expressad.b.a.b bVar) {
                    m.this.f18435l = bVar;
                }
            });
            aVar = iVar;
        } else {
            aVar = new a(this.f18438o, str, str2, str3, dVar, z9, z10, i4);
        }
        this.f18439p.a(aVar, this);
    }

    @Override // com.anythink.expressad.foundation.g.h.a.InterfaceC0123a
    public final void a(a.b bVar) {
        if (bVar == a.b.FINISH && this.f18436m) {
            this.f18441r.post(new Runnable() { // from class: com.anythink.expressad.b.m.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (m.this.f18434k != null) {
                        if (m.this.f18435l.g()) {
                            e unused = m.this.f18434k;
                            com.anythink.expressad.b.a.b unused2 = m.this.f18435l;
                        } else {
                            e unused3 = m.this.f18434k;
                            com.anythink.expressad.b.a.b unused4 = m.this.f18435l;
                            m.this.f18435l.h();
                        }
                    }
                }
            });
        }
    }
}
