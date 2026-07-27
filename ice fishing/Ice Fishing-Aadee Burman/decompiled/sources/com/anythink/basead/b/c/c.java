package com.anythink.basead.b.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import com.anythink.basead.b.b.j;
import com.anythink.basead.b.c.e;
import com.anythink.basead.mraid.MraidWebView;
import com.anythink.basead.mraid.i;
import com.anythink.basead.webtemplet.WTWebView;
import com.anythink.basead.webtemplet.l;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.r;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.res.a.a;
import com.anythink.core.common.res.b;
import com.anythink.core.common.v.o;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class c implements e.a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5900a = "c";

    /* renamed from: b, reason: collision with root package name */
    w f5901b;

    /* renamed from: c, reason: collision with root package name */
    y f5902c;

    /* renamed from: d, reason: collision with root package name */
    x f5903d;

    /* renamed from: f, reason: collision with root package name */
    private String f5905f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f5906g;

    /* renamed from: h, reason: collision with root package name */
    private int f5907h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private List<String> f5908j;

    /* renamed from: k, reason: collision with root package name */
    private b f5909k;

    /* renamed from: l, reason: collision with root package name */
    private com.anythink.basead.b.a.e<Void, com.anythink.basead.d.f> f5910l;

    /* renamed from: m, reason: collision with root package name */
    private volatile boolean f5911m;

    /* renamed from: e, reason: collision with root package name */
    com.anythink.core.common.t.b f5904e = new com.anythink.core.common.t.b() { // from class: com.anythink.basead.b.c.c.1
        @Override // java.lang.Runnable
        public final void run() {
            c.this.a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6173d, com.anythink.basead.d.g.f6190v));
        }
    };

    /* renamed from: n, reason: collision with root package name */
    private boolean f5912n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f5913o = false;

    /* renamed from: p, reason: collision with root package name */
    private boolean f5914p = false;

    /* renamed from: com.anythink.basead.b.c.c$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f5920a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f5921b;

        public AnonymousClass4(String str, String str2) {
            this.f5920a = str;
            this.f5921b = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                String str = this.f5920a;
                String str2 = this.f5921b;
                MraidWebView mraidWebView = new MraidWebView(t.b().g());
                i.a aVar = new i.a() { // from class: com.anythink.basead.b.c.c.4.1
                    @Override // com.anythink.basead.mraid.i.a
                    public final void a() {
                        c.this.a(2);
                    }

                    @Override // com.anythink.basead.mraid.i.a
                    public final void a(com.anythink.basead.d.f fVar) {
                        c.this.a(fVar);
                    }
                };
                c cVar = c.this;
                i.a(str, str2, mraidWebView, aVar, cVar.f5901b, cVar.f5903d, 5, false);
            } catch (Throwable th) {
                c.this.a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6156L, com.anythink.basead.d.g.f6165U + th.getMessage()));
            }
        }
    }

    /* renamed from: com.anythink.basead.b.c.c$6, reason: invalid class name */
    public class AnonymousClass6 implements a.InterfaceC0093a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f5925a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f5926b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f5927c;

        /* renamed from: e, reason: collision with root package name */
        private volatile boolean f5929e = false;

        /* renamed from: f, reason: collision with root package name */
        private com.anythink.core.common.t.b f5930f = new com.anythink.core.common.t.b() { // from class: com.anythink.basead.b.c.c.6.1
            @Override // java.lang.Runnable
            public final void run() {
                AnonymousClass6.this.a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.ac, "h5 template load timeout"), 7, "h5 template load timeout", 0L);
            }
        };

        public AnonymousClass6(long j6, long j9, boolean z3) {
            this.f5925a = j6;
            this.f5926b = j9;
            this.f5927c = z3;
            com.anythink.core.common.t.d.a().a(this.f5930f, j6, false);
        }

        private void b() {
            com.anythink.core.common.t.d.a().b(this.f5930f);
        }

        private void a() {
            com.anythink.core.common.t.d.a().a(this.f5930f, this.f5925a, false);
        }

        @Override // com.anythink.core.common.res.a.a.InterfaceC0093a
        public final void a(String str, final String str2, final long j6) {
            if (TextUtils.isEmpty(str) || !TextUtils.equals(c.this.f5901b.an(), str)) {
                return;
            }
            if (c.this.f5902c.bE() == 1) {
                final String a9 = d.a((x) null, c.this.f5901b, 3);
                t.b().b(new Runnable() { // from class: com.anythink.basead.b.c.c.6.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            WTWebView wTWebView = new WTWebView(t.b().g());
                            try {
                                int i = c.this.f5903d.f14163j;
                                Object aVar = (i == 1 || i == 3) ? new com.anythink.basead.webtemplet.adformat.intestitial.a() : i != 4 ? null : new com.anythink.basead.webtemplet.adformat.splash.a();
                                String str3 = a9;
                                String uri = new File(str2).toURI().toString();
                                l.a aVar2 = new l.a() { // from class: com.anythink.basead.b.c.c.6.2.1
                                    @Override // com.anythink.basead.webtemplet.l.a
                                    public final void a() {
                                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                        AnonymousClass6.this.a(true, a9, j6);
                                    }

                                    @Override // com.anythink.basead.webtemplet.l.a
                                    public final void a(com.anythink.basead.d.f fVar) {
                                        AnonymousClass6.this.a(fVar, TextUtils.equals(fVar.a(), com.anythink.basead.d.g.f6189u) ? 5 : 4, fVar.c(), j6);
                                    }
                                };
                                c cVar = c.this;
                                l.a(str3, uri, wTWebView, aVar2, cVar.f5901b, cVar.f5903d, 1, aVar);
                            } catch (Throwable th) {
                                AnonymousClass6.this.a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6156L, com.anythink.basead.d.g.ab + th.getMessage()), 6, com.anythink.basead.d.g.f6165U + th.getMessage(), 0L);
                            }
                        } catch (Throwable th2) {
                            AnonymousClass6.this.a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6156L, com.anythink.basead.d.g.ab + th2.getMessage()), 6, com.anythink.basead.d.g.f6165U + th2.getMessage(), 0L);
                        }
                    }
                });
            } else {
                a(false, (String) null, j6);
            }
        }

        @Override // com.anythink.core.common.res.a.a.InterfaceC0093a
        public final void a(String str, int i, String str2) {
            if (TextUtils.equals(c.this.f5901b.an(), str)) {
                a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.ac, com.anythink.basead.d.g.ac.concat(String.valueOf(str2))), i, str2, 0L);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(boolean z3, String str, long j6) {
            if (this.f5929e && z3 && !TextUtils.isEmpty(str)) {
                d.e(str);
            }
            a(true, (com.anythink.basead.d.f) null, 0, "", j6);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(com.anythink.basead.d.f fVar, int i, String str, long j6) {
            a(false, fVar, i, str, j6);
        }

        private void a(boolean z3, com.anythink.basead.d.f fVar, int i, String str, long j6) {
            if (this.f5929e) {
                return;
            }
            this.f5929e = true;
            b();
            if (!z3) {
                c cVar = c.this;
                com.anythink.core.common.u.e.a(cVar.f5901b, cVar.f5903d, false, System.currentTimeMillis() - this.f5926b, i, str, 0L);
                if (this.f5927c) {
                    c.this.a(5);
                    return;
                } else {
                    c.this.a(fVar);
                    return;
                }
            }
            c cVar2 = c.this;
            com.anythink.core.common.u.e.a(cVar2.f5901b, cVar2.f5903d, System.currentTimeMillis() - this.f5926b, j6);
            c.this.a(5);
        }
    }

    public class a implements com.anythink.basead.b.a.d<Void, com.anythink.basead.d.f> {
        private a() {
        }

        private void b() {
            if (c.this.f5909k != null) {
                String unused = c.this.i;
                c.this.f5909k.a();
            }
            c.c(c.this);
        }

        @Override // com.anythink.basead.b.a.d
        public final /* synthetic */ void a(com.anythink.basead.d.f fVar) {
            com.anythink.basead.d.f fVar2 = fVar;
            if (c.this.f5909k != null) {
                String unused = c.this.i;
                c.this.f5909k.a(fVar2);
            }
            c.c(c.this);
        }

        public /* synthetic */ a(c cVar, byte b9) {
            this();
        }

        /* renamed from: a, reason: avoid collision after fix types in other method */
        private void a2(com.anythink.basead.d.f fVar) {
            if (c.this.f5909k != null) {
                String unused = c.this.i;
                c.this.f5909k.a(fVar);
            }
            c.c(c.this);
        }

        @Override // com.anythink.basead.b.a.d
        public final /* synthetic */ void a() {
            if (c.this.f5909k != null) {
                String unused = c.this.i;
                c.this.f5909k.a();
            }
            c.c(c.this);
        }
    }

    public interface b {
        void a();

        void a(com.anythink.basead.d.f fVar);
    }

    /* renamed from: com.anythink.basead.b.c.c$c, reason: collision with other inner class name */
    public static final class C0009c {

        /* renamed from: a, reason: collision with root package name */
        static final int f5938a = 1;

        /* renamed from: b, reason: collision with root package name */
        static final int f5939b = 2;

        /* renamed from: c, reason: collision with root package name */
        static final int f5940c = 3;

        /* renamed from: d, reason: collision with root package name */
        static final int f5941d = 4;

        /* renamed from: e, reason: collision with root package name */
        static final int f5942e = 5;

        private C0009c() {
        }
    }

    public c(String str, boolean z3, w wVar, x xVar) {
        this.f5905f = str;
        this.f5906g = z3;
        this.f5901b = wVar;
        this.f5903d = xVar;
        y yVar = xVar.f14168o;
        this.f5902c = yVar;
        this.f5907h = yVar.w();
        com.anythink.basead.b.c.b bVar = new com.anythink.basead.b.c.b();
        this.f5910l = bVar;
        bVar.a((com.anythink.basead.b.a.d) new a(this, (byte) 0));
    }

    private boolean c() {
        x xVar = this.f5903d;
        if (!xVar.f14170q || !String.valueOf(xVar.f14163j).equals("0")) {
            return false;
        }
        w wVar = this.f5901b;
        return (((wVar instanceof r) && !TextUtils.isEmpty(((r) wVar).d())) || this.f5903d.f14169p || TextUtils.isEmpty(this.f5901b.B())) ? false : true;
    }

    private void d() {
        if (this.f5901b.ab() <= 0 && this.f5901b.ac() <= 0) {
            com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.basead.b.c.c.2
                @Override // java.lang.Runnable
                public final void run() {
                    String B9 = c.this.f5901b.B();
                    com.anythink.core.common.u.b.a();
                    String a9 = com.anythink.core.common.u.b.a(c.this.f5903d);
                    com.anythink.core.common.u.b.a().a(a9).f13633d = System.currentTimeMillis();
                    c.a(c.this, B9);
                    com.anythink.core.common.u.b.a().a(a9).f13634e = System.currentTimeMillis();
                    c.this.f5901b.ab();
                    c.this.f5901b.ac();
                    com.anythink.core.common.u.b.a().a(a9).a();
                    c.this.a(3);
                }
            }, 4);
            return;
        }
        this.f5901b.ab();
        this.f5901b.ac();
        a(3);
    }

    private boolean e() {
        if (!this.f5901b.L() || !String.valueOf(this.f5903d.f14163j).equals("0")) {
            return false;
        }
        w wVar = this.f5901b;
        if (((wVar instanceof r) && !TextUtils.isEmpty(((r) wVar).d())) || this.f5903d.f14169p) {
            return false;
        }
        d.a(this.f5901b, this.f5902c);
        return true;
    }

    private void f() {
        if (!d.a(this.f5901b, this.f5902c)) {
            a(4);
            return;
        }
        if (this.f5901b.V() > 0 && this.f5901b.W() > 0) {
            this.f5901b.V();
            this.f5901b.W();
            a(4);
        } else {
            com.anythink.core.common.u.b.a();
            String a9 = com.anythink.core.common.u.b.a(this.f5903d);
            com.anythink.core.common.u.b.a().a(a9).f13635f = System.currentTimeMillis();
            com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.basead.b.c.c.3
                @Override // java.lang.Runnable
                public final void run() {
                    final ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
                    newFixedThreadPool.submit(new Runnable() { // from class: com.anythink.basead.b.c.c.3.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                String c9 = com.anythink.core.common.res.d.a(t.b().g()).c(4, o.a(c.this.f5901b.E()));
                                if (new File(c9).exists()) {
                                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                                    mediaMetadataRetriever.setDataSource(c9);
                                    String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
                                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(9);
                                    mediaMetadataRetriever.release();
                                    c.this.f5901b.k(Integer.parseInt(extractMetadata));
                                    c.this.f5901b.l(Integer.parseInt(extractMetadata2));
                                    c.this.f5901b.a(Long.parseLong(extractMetadata3));
                                    com.anythink.core.common.u.b.a();
                                    String a10 = com.anythink.core.common.u.b.a(c.this.f5903d);
                                    com.anythink.core.common.u.b.a().a(a10).f13636g = System.currentTimeMillis();
                                    com.anythink.core.common.u.b.a().a(a10).b();
                                }
                                synchronized (newFixedThreadPool) {
                                    newFixedThreadPool.notifyAll();
                                }
                            } catch (Throwable unused) {
                                c.this.a(4);
                            }
                        }
                    });
                    try {
                        synchronized (newFixedThreadPool) {
                            newFixedThreadPool.wait(com.anythink.basead.exoplayer.i.a.f7883f);
                        }
                        newFixedThreadPool.shutdownNow();
                        c.this.a(4);
                    } catch (Throwable unused) {
                        c.this.a(4);
                    }
                }
            }, 2);
        }
    }

    private void g() {
        e.a().b(this);
        com.anythink.core.common.t.d.a().b(this.f5904e);
    }

    private void h() {
        com.anythink.core.common.t.d.a().a(this.f5904e, this.f5907h, false);
    }

    private void i() {
        int i;
        x xVar = this.f5903d;
        if (xVar != null && xVar.f14168o != null) {
            Context g4 = t.b().g();
            try {
                i = Math.min(g4.getResources().getDisplayMetrics().widthPixels, g4.getResources().getDisplayMetrics().heightPixels) / 2;
            } catch (Throwable unused) {
                i = 0;
            }
            if (String.valueOf(this.f5903d.f14163j).equals("1") && !this.f5901b.L() && this.f5903d.f14168o.ap() != 1) {
                com.anythink.core.d.b g9 = D.y.g(com.anythink.core.d.d.a(g4));
                int aq = this.f5903d.f14168o.aq();
                List<String> p9 = aq != 2 ? aq != 3 ? aq != 5 ? null : g9.p() : g9.q() : g9.o();
                if (p9 != null && p9.size() > 0) {
                    for (String str : p9) {
                        if (!TextUtils.isEmpty(str) && !d.b(str, 3)) {
                            com.anythink.core.common.res.b.a(g4).a(new com.anythink.core.common.res.e(3, str), i, i, null);
                        }
                    }
                }
            }
            if (this.f5903d.f14168o.W() == 1 && !TextUtils.isEmpty(this.f5903d.f14168o.f())) {
                com.anythink.core.common.res.b.a(g4).a(new com.anythink.core.common.res.e(3, this.f5903d.f14168o.f()), i, i, null);
            }
            if (this.f5903d.f14168o.aQ() == 4 && !TextUtils.isEmpty(this.f5903d.f14168o.bb()) && !com.anythink.core.common.res.d.a(g4).b(3, o.a(this.f5903d.f14168o.bb()))) {
                this.f5903d.f14168o.bb();
                new com.anythink.basead.b.c.a(this.f5903d.f14168o.bb()).d();
            }
        }
        List<String> e9 = this.f5901b.e((w) this.f5902c);
        if (e9.isEmpty()) {
            return;
        }
        for (String str2 : e9) {
            if (!TextUtils.isEmpty(str2)) {
                d.b(str2, 3);
                if (!d.b(str2, 3)) {
                    D.y.f().a(new com.anythink.core.common.res.e(3, str2), new b.a() { // from class: com.anythink.basead.b.c.c.5
                        @Override // com.anythink.core.common.res.b.a
                        public final void onFail(String str3, String str4) {
                        }

                        @Override // com.anythink.core.common.res.b.a
                        public final void onSuccess(String str3, Bitmap bitmap) {
                        }
                    });
                }
            }
        }
    }

    private void j() {
        String an = this.f5901b.an();
        if (TextUtils.isEmpty(an)) {
            a(5);
            return;
        }
        com.anythink.core.common.res.a.a.a(t.b().g()).a(an, new AnonymousClass6(this.f5902c.bL(), System.currentTimeMillis(), this.f5902c.bF() == 1));
    }

    private void b() {
        List<String> b9 = this.f5901b.b(this.f5902c);
        b9.size();
        if (b9.size() > 0) {
            for (int i = 0; i < b9.size(); i++) {
                String str = b9.get(i);
                if (!d.f(str)) {
                    new f(this.f5905f, this.f5906g, this.f5901b, str).d();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (r13 != 3) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0114 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(b bVar) {
        boolean z3;
        w wVar;
        boolean z6;
        String an;
        c cVar;
        w wVar2 = this.f5901b;
        if (wVar2 != null && this.f5910l != null) {
            this.i = wVar2.v();
            this.f5909k = bVar;
            com.anythink.core.common.t.d.a().a(this.f5904e, this.f5907h, false);
            int ao = this.f5901b.ao();
            x xVar = this.f5903d;
            int i = xVar.f14163j;
            if (ao != 1) {
                if (ao == 2) {
                    this.f5911m = false;
                    if (this.f5902c != null) {
                        boolean z9 = i == 1 || i == 3;
                        this.f5910l.b(1);
                        if (z9) {
                            this.f5910l.b(2);
                            a();
                        }
                        if (this.f5911m) {
                            return;
                        }
                        boolean af = this.f5902c.af();
                        String a9 = i.a(this.f5903d, this.f5901b);
                        if (TextUtils.isEmpty(a9)) {
                            a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6156L, com.anythink.basead.d.g.f6162R));
                        } else if (!af) {
                            a(2);
                        } else {
                            t.b().b(new AnonymousClass4(d.b(this.f5903d, this.f5901b), a9));
                        }
                    }
                }
                i();
                return;
            }
            if (xVar.f14170q && String.valueOf(i).equals("0")) {
                w wVar3 = this.f5901b;
                if ((!(wVar3 instanceof r) || TextUtils.isEmpty(((r) wVar3).d())) && !this.f5903d.f14169p && !TextUtils.isEmpty(this.f5901b.B())) {
                    z3 = true;
                    this.f5913o = z3;
                    int i6 = z3 ? 2 : 1;
                    if (this.f5901b.L() && String.valueOf(this.f5903d.f14163j).equals("0")) {
                        wVar = this.f5901b;
                        if (((wVar instanceof r) || TextUtils.isEmpty(((r) wVar).d())) && !this.f5903d.f14169p) {
                            d.a(this.f5901b, this.f5902c);
                            z6 = true;
                            this.f5914p = z6;
                            if (z6) {
                                i6++;
                            }
                            if ((i != 1 || i == 3 || i == 4) && ao == 3) {
                                i6++;
                                an = this.f5901b.an();
                                if (!TextUtils.isEmpty(an)) {
                                    a(5);
                                } else {
                                    cVar = this;
                                    com.anythink.core.common.res.a.a.a(t.b().g()).a(an, cVar.new AnonymousClass6(this.f5902c.bL(), System.currentTimeMillis(), this.f5902c.bF() == 1));
                                    cVar.f5910l.b(i6);
                                    a();
                                    i();
                                    return;
                                }
                            }
                            cVar = this;
                            cVar.f5910l.b(i6);
                            a();
                            i();
                            return;
                        }
                    }
                    z6 = false;
                    this.f5914p = z6;
                    if (z6) {
                    }
                    if (i != 1) {
                    }
                    i6++;
                    an = this.f5901b.an();
                    if (!TextUtils.isEmpty(an)) {
                    }
                }
            }
            z3 = false;
            this.f5913o = z3;
            if (z3) {
            }
            if (this.f5901b.L()) {
                wVar = this.f5901b;
                if (wVar instanceof r) {
                }
                d.a(this.f5901b, this.f5902c);
                z6 = true;
                this.f5914p = z6;
                if (z6) {
                }
                if (i != 1) {
                }
                i6++;
                an = this.f5901b.an();
                if (!TextUtils.isEmpty(an)) {
                }
            }
            z6 = false;
            this.f5914p = z6;
            if (z6) {
            }
            if (i != 1) {
            }
            i6++;
            an = this.f5901b.an();
            if (!TextUtils.isEmpty(an)) {
            }
        } else {
            a(com.anythink.basead.d.g.a("-9999", com.anythink.basead.d.g.f6148C));
        }
    }

    public static /* synthetic */ void c(c cVar) {
        e.a().b(cVar);
        com.anythink.core.common.t.d.a().b(cVar.f5904e);
    }

    private void a() {
        List<String> a9 = this.f5901b.a((w) this.f5902c);
        if (a9 == null) {
            a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6181m, "Incomplete resource allocation! MissResource: ".concat(String.valueOf(this.f5901b.a()))));
            return;
        }
        int size = a9.size();
        if (size == 0) {
            b();
            a(1);
            return;
        }
        this.f5908j = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = a9.get(i);
            if (!TextUtils.isEmpty(str)) {
                if (this.f5901b.I(str)) {
                    if (!d.a(this.f5901b, this.f5902c) && !this.f5908j.contains(str)) {
                        this.f5902c.ac();
                        this.f5908j.add(str);
                    }
                } else if (!d.f(str) && !this.f5908j.contains(str)) {
                    this.f5908j.add(str);
                }
            }
        }
        if (com.anythink.basead.b.e.c(this.f5901b, this.f5903d) && this.f5901b.L() && d.a(this.f5901b, this.f5902c) && !TextUtils.isEmpty(this.f5901b.B())) {
            this.f5908j.remove(this.f5901b.B());
        }
        int size2 = this.f5908j.size();
        if (size2 == 0) {
            b();
            a(1);
            return;
        }
        synchronized (this) {
            try {
                e.a().a(this);
                ArrayList arrayList = new ArrayList(this.f5908j);
                for (int i6 = 0; i6 < size2; i6++) {
                    String str2 = (String) arrayList.get(i6);
                    boolean I8 = this.f5901b.I(str2);
                    int ac = this.f5902c.ac();
                    if (I8) {
                        if (d.a(this.f5901b, this.f5902c)) {
                            e.a().a(str2, ac);
                        } else {
                            new g(this.f5905f, this.f5901b, this.f5902c, this.f5903d).a();
                        }
                    } else if (!d.a(str2)) {
                        if (d.f(str2)) {
                            d.a(str2, 100);
                            e.a().a(str2, 100);
                        } else {
                            d.a(str2, 0);
                            new f(this.f5905f, this.f5906g, this.f5901b, str2).d();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(String str) {
        int i;
        int i6;
        int i9;
        InputStream inputStream = null;
        try {
            URLConnection openConnection = new URL(str).openConnection();
            openConnection.setConnectTimeout(2000);
            openConnection.setReadTimeout(5000);
            InputStream inputStream2 = openConnection.getInputStream();
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(inputStream2, null, options);
                i6 = options.outWidth;
                try {
                    i9 = options.outHeight;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e9) {
                            e9.printStackTrace();
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream = inputStream2;
                    i = i6;
                    try {
                        th.getMessage();
                        th.printStackTrace();
                        i6 = i;
                        i9 = 0;
                        if (i6 < 0) {
                        }
                        if (i9 >= 0) {
                        }
                        this.f5901b.n(i6);
                        this.f5901b.o(r0);
                    } finally {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e10) {
                                e10.printStackTrace();
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = inputStream2;
                i = 0;
                th.getMessage();
                th.printStackTrace();
                i6 = i;
                i9 = 0;
                if (i6 < 0) {
                }
                if (i9 >= 0) {
                }
                this.f5901b.n(i6);
                this.f5901b.o(r0);
            }
        } catch (Throwable th3) {
            th = th3;
        }
        if (i6 < 0) {
            i6 = 0;
        }
        int i10 = i9 >= 0 ? i9 : 0;
        this.f5901b.n(i6);
        this.f5901b.o(i10);
    }

    private void a(boolean z3) {
        String a9 = i.a(this.f5903d, this.f5901b);
        if (TextUtils.isEmpty(a9)) {
            a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6156L, com.anythink.basead.d.g.f6162R));
        } else if (!z3) {
            a(2);
        } else {
            t.b().b(new AnonymousClass4(d.b(this.f5903d, this.f5901b), a9));
        }
    }

    @Override // com.anythink.basead.b.c.e.a
    public final void a(String str, int i) {
        this.f5908j.size();
        synchronized (this) {
            try {
                d.a(str, i);
                List<String> list = this.f5908j;
                if (list != null) {
                    if (list.contains(str)) {
                        if (this.f5901b.I(str)) {
                            if (this.f5902c.ac() <= i) {
                            }
                        }
                        this.f5908j.remove(str);
                        if (this.f5901b.I(str)) {
                            h.a(this.f5901b, this.f5902c);
                        }
                        if (this.f5908j.isEmpty()) {
                            a(1);
                            return;
                        }
                        if (com.anythink.basead.b.e.c(this.f5901b, this.f5903d)) {
                            String B9 = this.f5901b.B();
                            if (TextUtils.equals(String.valueOf(this.f5903d.f14168o.F()), "2")) {
                                B9 = this.f5901b.d((w) this.f5902c);
                            }
                            if (this.f5901b.I(str) && !TextUtils.isEmpty(B9)) {
                                this.f5908j.remove(B9);
                                if (this.f5908j.isEmpty()) {
                                    a(1);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.anythink.basead.b.c.e.a
    public final void a(String str, com.anythink.basead.d.f fVar) {
        this.f5908j.size();
        fVar.c();
        synchronized (this) {
            char c9 = 65535;
            try {
                d.a(str, -1);
                List<String> list = this.f5908j;
                if (list != null) {
                    list.remove(str);
                }
                if (this.f5901b.I(str) && com.anythink.basead.b.e.c(this.f5901b, this.f5903d)) {
                    com.anythink.core.common.u.e.a(this.f5903d, this.f5901b, 1, fVar.c());
                }
                String valueOf = String.valueOf(this.f5903d.f14168o.F());
                switch (valueOf.hashCode()) {
                    case j.f5816W /* 48 */:
                        if (valueOf.equals("0")) {
                            c9 = 2;
                            break;
                        }
                        break;
                    case j.f5817X /* 49 */:
                        if (valueOf.equals("1")) {
                            c9 = 0;
                            break;
                        }
                        break;
                    case 50:
                        if (valueOf.equals("2")) {
                            c9 = 4;
                            break;
                        }
                        break;
                    case 51:
                        if (valueOf.equals("3")) {
                            c9 = 1;
                            break;
                        }
                        break;
                    case 52:
                        if (valueOf.equals("4")) {
                            c9 = 3;
                            break;
                        }
                        break;
                }
                if (c9 == 0 || c9 == 1) {
                    a(fVar);
                } else if (c9 == 2) {
                    a(1);
                } else if (c9 == 3 || c9 == 4) {
                    String B9 = this.f5901b.B();
                    if (TextUtils.equals(String.valueOf(this.f5903d.f14168o.F()), "2")) {
                        B9 = this.f5901b.d((w) this.f5902c);
                    }
                    if (!this.f5901b.I(str) && (TextUtils.isEmpty(B9) || !TextUtils.equals(B9, str))) {
                        a(fVar);
                        return;
                    }
                    if (TextUtils.isEmpty(B9)) {
                        a(fVar);
                        return;
                    }
                    if (this.f5901b.I(str) && this.f5908j.size() == 0) {
                        a(1);
                        return;
                    }
                    List<String> list2 = this.f5908j;
                    if (list2 == null || (!list2.contains(this.f5901b.E()) && !this.f5908j.contains(this.f5901b.B()))) {
                        a(fVar);
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        boolean z3 = this.f5913o;
        if (i == 1 && !this.f5912n) {
            this.f5912n = true;
            if (z3) {
                d();
            }
            if (this.f5914p) {
                f();
            }
        }
        com.anythink.basead.b.a.e<Void, com.anythink.basead.d.f> eVar = this.f5910l;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.anythink.basead.d.f fVar) {
        fVar.c();
        this.f5911m = true;
        com.anythink.basead.b.a.e<Void, com.anythink.basead.d.f> eVar = this.f5910l;
        if (eVar != null) {
            eVar.a((com.anythink.basead.b.a.e<Void, com.anythink.basead.d.f>) fVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(c cVar, String str) {
        int i;
        int i6;
        int i9;
        InputStream inputStream = null;
        try {
            URLConnection openConnection = new URL(str).openConnection();
            openConnection.setConnectTimeout(2000);
            openConnection.setReadTimeout(5000);
            InputStream inputStream2 = openConnection.getInputStream();
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(inputStream2, null, options);
                i6 = options.outWidth;
                try {
                    i9 = options.outHeight;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e9) {
                            e9.printStackTrace();
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream = inputStream2;
                    i = i6;
                    try {
                        th.getMessage();
                        th.printStackTrace();
                        i6 = i;
                        i9 = 0;
                        if (i6 < 0) {
                        }
                        if (i9 >= 0) {
                        }
                        cVar.f5901b.n(i6);
                        cVar.f5901b.o(r0);
                    } finally {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e10) {
                                e10.printStackTrace();
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = inputStream2;
                i = 0;
                th.getMessage();
                th.printStackTrace();
                i6 = i;
                i9 = 0;
                if (i6 < 0) {
                }
                if (i9 >= 0) {
                }
                cVar.f5901b.n(i6);
                cVar.f5901b.o(r0);
            }
        } catch (Throwable th3) {
            th = th3;
        }
        if (i6 < 0) {
            i6 = 0;
        }
        int i10 = i9 >= 0 ? i9 : 0;
        cVar.f5901b.n(i6);
        cVar.f5901b.o(i10);
    }
}
