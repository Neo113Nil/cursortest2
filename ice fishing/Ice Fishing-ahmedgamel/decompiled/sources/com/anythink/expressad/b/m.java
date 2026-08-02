package com.anythink.expressad.b;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.anythink.expressad.b.l;
import com.anythink.expressad.foundation.g.h.a;
import com.anythink.expressad.foundation.h.u;
import com.icefishingapp.icefishing.AbstractC4404f;
import java.net.URI;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final class m extends d implements a.InterfaceC0124a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f18274a = 1;
    public static final int i = 2;

    /* renamed from: j, reason: collision with root package name */
    private static final String f18275j = "302";

    /* renamed from: k, reason: collision with root package name */
    private e f18276k;

    /* renamed from: l, reason: collision with root package name */
    private com.anythink.expressad.b.a.b f18277l;

    /* renamed from: n, reason: collision with root package name */
    private boolean f18279n;

    /* renamed from: o, reason: collision with root package name */
    private Context f18280o;

    /* renamed from: p, reason: collision with root package name */
    private com.anythink.expressad.foundation.g.h.c f18281p;

    /* renamed from: q, reason: collision with root package name */
    private com.anythink.expressad.b.a.a f18282q;

    /* renamed from: s, reason: collision with root package name */
    private boolean f18284s;

    /* renamed from: m, reason: collision with root package name */
    private boolean f18278m = true;

    /* renamed from: r, reason: collision with root package name */
    private Handler f18283r = new Handler(Looper.getMainLooper());

    public class a extends com.anythink.expressad.foundation.g.h.a {

        /* renamed from: b, reason: collision with root package name */
        private static final int f18287b = 10;

        /* renamed from: g, reason: collision with root package name */
        private final Context f18290g;

        /* renamed from: h, reason: collision with root package name */
        private String f18291h;
        private String i;

        /* renamed from: j, reason: collision with root package name */
        private String f18292j;

        /* renamed from: k, reason: collision with root package name */
        private com.anythink.expressad.foundation.d.d f18293k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f18294l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f18295m;

        /* renamed from: n, reason: collision with root package name */
        private int f18296n;

        /* renamed from: c, reason: collision with root package name */
        private final Semaphore f18289c = new Semaphore(0);

        /* renamed from: o, reason: collision with root package name */
        private l.a f18297o = new l.a() { // from class: com.anythink.expressad.b.m.a.1
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
                    m.this.f18277l.a(true);
                    a.a(a.this);
                }
            }

            @Override // com.anythink.expressad.b.l.a
            public final void a(String str, String str2) {
                a.a(a.this, str);
                m.this.f18277l.c(str2);
                b();
            }

            @Override // com.anythink.expressad.b.l.a
            public final void a(String str, String str2, String str3) {
                if (!TextUtils.isEmpty(str2)) {
                    m.this.f18277l.b(str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    m.this.f18277l.c(str3);
                }
                a.a(a.this, str);
                b();
            }
        };

        public a(Context context, String str, String str2, String str3, com.anythink.expressad.foundation.d.d dVar, boolean z3, boolean z6, int i) {
            this.f18290g = context;
            this.f18291h = str;
            this.i = str2;
            this.f18292j = str3;
            this.f18293k = dVar;
            this.f18294l = z3;
            this.f18295m = z6;
            this.f18296n = i;
        }

        private static boolean a(int i) {
            return i == 301 || i == 302 || i == 307;
        }

        private void d() {
            this.f18289c.release();
        }

        private void h() {
            this.f18289c.acquireUninterruptibly();
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
            if (m.this.f18276k != null) {
                e unused = m.this.f18276k;
            }
            m.this.f18277l = new com.anythink.expressad.b.a.b();
            m.this.f18277l.e(this.f18291h);
            m.this.f18277l = a(this.f18291h, this.f18294l, this.f18295m, this.f18293k, this.f18296n);
            if (!TextUtils.isEmpty(m.this.f18277l.e())) {
                m.this.f18277l.a(true);
            }
            if (m.this.f18278m && m.this.f18277l.g()) {
                if (m.this.f18282q != null) {
                    m.this.f18277l.a(m.this.f18282q.f18122f);
                }
                n.a(this.f18293k, m.this.f18277l, m.this.f18282q, this.i, this.f18292j, this.f18290g, this.f18297o, this.f18289c);
            }
        }

        private boolean b(String str) {
            return n.a(str, this.f18293k, m.this.f18277l);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x01be A[EDGE_INSN: B:84:0x01be->B:34:0x01be BREAK  A[LOOP:0: B:16:0x0045->B:58:0x01ba], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private com.anythink.expressad.b.a.b a(String str, boolean z3, boolean z6, com.anythink.expressad.foundation.d.d dVar, int i) {
            String str2;
            String str3;
            int i6;
            String str4 = "";
            if (m.this.f18279n) {
                String c9 = com.anythink.expressad.f.a.c(str);
                if (!TextUtils.isEmpty(c9)) {
                    str = AbstractC4404f.f(str, c9);
                }
            }
            com.anythink.expressad.b.a.b bVar = new com.anythink.expressad.b.a.b();
            f fVar = new f();
            try {
            } catch (Exception e9) {
                e = e9;
                str2 = "";
            }
            if (c(str)) {
                str3 = "";
                String str5 = str;
                String str6 = str3;
                i6 = 0;
                while (true) {
                    if (i6 >= 10) {
                    }
                    i6++;
                }
                return bVar;
            }
            URI create = URI.create(str);
            str2 = create.getScheme();
            try {
                str4 = create.getHost();
            } catch (Exception e10) {
                e = e10;
                e.printStackTrace();
                str3 = str4;
                str4 = str2;
                String str52 = str;
                String str62 = str3;
                i6 = 0;
                while (true) {
                    if (i6 >= 10) {
                    }
                    i6++;
                }
                return bVar;
            }
            str3 = str4;
            str4 = str2;
            String str522 = str;
            String str622 = str3;
            i6 = 0;
            while (true) {
                if (i6 >= 10) {
                    break;
                }
                if (!m.this.f18278m) {
                    return null;
                }
                m.this.f18282q = fVar.a(str522, z3, z6, dVar);
                if (m.this.f18282q != null) {
                    if (!TextUtils.isEmpty(m.this.f18282q.f18124h)) {
                        bVar.e(str522);
                        bVar.b(m.this.f18282q.f18124h);
                        bVar.b(1);
                        bVar.a(m.this.f18282q.a());
                        bVar.a(false);
                        if (i6 == 0) {
                            com.anythink.expressad.b.b.a.a().a(str522, m.this.f18282q.f18124h, dVar, this.f18292j, z3, z6, i);
                        }
                    } else {
                        bVar.a(true);
                        int i9 = m.this.f18282q.f18122f;
                        if (i9 != 301 && i9 != 302 && i9 != 307) {
                            if (m.this.f18282q.f18122f == 200) {
                                bVar.b(true);
                                bVar.e(str522);
                                bVar.c(m.this.f18282q.f18123g);
                            } else {
                                bVar.b(false);
                                bVar.e(str522);
                                if (i6 == 0) {
                                    com.anythink.expressad.b.b.a.a().a(str522, "error code:" + m.this.f18282q.f18122f, dVar, this.f18292j, z3, z6, i);
                                }
                            }
                        } else {
                            bVar.b();
                            if (!TextUtils.isEmpty(m.this.f18282q.f18117a)) {
                                str522 = m.this.f18282q.f18117a;
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
                                    } catch (Exception e11) {
                                        e11.printStackTrace();
                                    }
                                }
                                if (!u.a.a(str522)) {
                                    if (m.this.f18279n) {
                                        String c10 = com.anythink.expressad.f.a.c(str522);
                                        if (!TextUtils.isEmpty(c10)) {
                                            str522 = AbstractC4404f.f(str522, c10);
                                        }
                                    }
                                    i6++;
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
            return n.a(str, aVar.f18293k, m.this.f18277l);
        }

        public static /* synthetic */ void a(a aVar) {
            aVar.f18289c.release();
        }
    }

    public m(Context context) {
        this.f18280o = context;
        this.f18281p = new com.anythink.expressad.foundation.g.h.c(context, 2);
    }

    @Override // com.anythink.expressad.b.d
    public final void b() {
        this.f18278m = false;
    }

    private boolean a() {
        return this.f18278m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str, e eVar, boolean z3, String str2, String str3, com.anythink.expressad.foundation.d.d dVar, boolean z6, boolean z9, int i6) {
        a aVar;
        this.f18276k = eVar;
        this.f18279n = z3;
        com.anythink.expressad.b.a.c cVar = new com.anythink.expressad.b.a.c();
        cVar.a(this.f18280o);
        cVar.a(str);
        cVar.c(z3);
        cVar.b(str2);
        cVar.c(str3);
        cVar.a(dVar);
        cVar.a(z6);
        cVar.b(z9);
        cVar.a(i6);
        if (str.startsWith("tcp")) {
            i iVar = new i(cVar);
            iVar.a(this.f18276k);
            iVar.a(new h() { // from class: com.anythink.expressad.b.m.1
                @Override // com.anythink.expressad.b.h
                public final void a(com.anythink.expressad.b.a.b bVar) {
                    m.this.f18277l = bVar;
                }
            });
            aVar = iVar;
        } else {
            aVar = new a(this.f18280o, str, str2, str3, dVar, z6, z9, i6);
        }
        this.f18281p.a(aVar, this);
    }

    @Override // com.anythink.expressad.foundation.g.h.a.InterfaceC0124a
    public final void a(a.b bVar) {
        if (bVar == a.b.FINISH && this.f18278m) {
            this.f18283r.post(new Runnable() { // from class: com.anythink.expressad.b.m.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (m.this.f18276k != null) {
                        if (m.this.f18277l.g()) {
                            e unused = m.this.f18276k;
                            com.anythink.expressad.b.a.b unused2 = m.this.f18277l;
                        } else {
                            e unused3 = m.this.f18276k;
                            com.anythink.expressad.b.a.b unused4 = m.this.f18277l;
                            m.this.f18277l.h();
                        }
                    }
                }
            });
        }
    }
}
