package com.anythink.basead.b.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import com.IceFishing.LiveIceFishing.k;
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
    public static final String f6686a = "c";

    /* renamed from: b, reason: collision with root package name */
    w f6687b;

    /* renamed from: c, reason: collision with root package name */
    y f6688c;

    /* renamed from: d, reason: collision with root package name */
    x f6689d;

    /* renamed from: f, reason: collision with root package name */
    private String f6691f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6692g;

    /* renamed from: h, reason: collision with root package name */
    private int f6693h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private List<String> f6694j;

    /* renamed from: k, reason: collision with root package name */
    private b f6695k;

    /* renamed from: l, reason: collision with root package name */
    private com.anythink.basead.b.a.e<Void, com.anythink.basead.d.f> f6696l;

    /* renamed from: m, reason: collision with root package name */
    private volatile boolean f6697m;

    /* renamed from: e, reason: collision with root package name */
    com.anythink.core.common.t.b f6690e = new com.anythink.core.common.t.b() { // from class: com.anythink.basead.b.c.c.1
        @Override // java.lang.Runnable
        public final void run() {
            c.this.a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6959d, com.anythink.basead.d.g.f6976v));
        }
    };

    /* renamed from: n, reason: collision with root package name */
    private boolean f6698n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f6699o = false;

    /* renamed from: p, reason: collision with root package name */
    private boolean f6700p = false;

    /* renamed from: com.anythink.basead.b.c.c$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f6706a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f6707b;

        public AnonymousClass4(String str, String str2) {
            this.f6706a = str;
            this.f6707b = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                String str = this.f6706a;
                String str2 = this.f6707b;
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
                i.a(str, str2, mraidWebView, aVar, cVar.f6687b, cVar.f6689d, 5, false);
            } catch (Throwable th) {
                c.this.a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6942L, com.anythink.basead.d.g.f6951U + th.getMessage()));
            }
        }
    }

    /* renamed from: com.anythink.basead.b.c.c$6, reason: invalid class name */
    public class AnonymousClass6 implements a.InterfaceC0093a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f6711a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f6712b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f6713c;

        /* renamed from: e, reason: collision with root package name */
        private volatile boolean f6715e = false;

        /* renamed from: f, reason: collision with root package name */
        private com.anythink.core.common.t.b f6716f = new com.anythink.core.common.t.b() { // from class: com.anythink.basead.b.c.c.6.1
            @Override // java.lang.Runnable
            public final void run() {
                AnonymousClass6.this.a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.ac, "h5 template load timeout"), 7, "h5 template load timeout", 0L);
            }
        };

        public AnonymousClass6(long j6, long j9, boolean z6) {
            this.f6711a = j6;
            this.f6712b = j9;
            this.f6713c = z6;
            com.anythink.core.common.t.d.a().a(this.f6716f, j6, false);
        }

        private void b() {
            com.anythink.core.common.t.d.a().b(this.f6716f);
        }

        private void a() {
            com.anythink.core.common.t.d.a().a(this.f6716f, this.f6711a, false);
        }

        @Override // com.anythink.core.common.res.a.a.InterfaceC0093a
        public final void a(String str, final String str2, final long j6) {
            if (TextUtils.isEmpty(str) || !TextUtils.equals(c.this.f6687b.an(), str)) {
                return;
            }
            if (c.this.f6688c.bE() == 1) {
                final String a9 = d.a((x) null, c.this.f6687b, 3);
                t.b().b(new Runnable() { // from class: com.anythink.basead.b.c.c.6.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            WTWebView wTWebView = new WTWebView(t.b().g());
                            try {
                                int i = c.this.f6689d.f14949j;
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
                                        AnonymousClass6.this.a(fVar, TextUtils.equals(fVar.a(), com.anythink.basead.d.g.f6975u) ? 5 : 4, fVar.c(), j6);
                                    }
                                };
                                c cVar = c.this;
                                l.a(str3, uri, wTWebView, aVar2, cVar.f6687b, cVar.f6689d, 1, aVar);
                            } catch (Throwable th) {
                                AnonymousClass6.this.a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6942L, com.anythink.basead.d.g.ab + th.getMessage()), 6, com.anythink.basead.d.g.f6951U + th.getMessage(), 0L);
                            }
                        } catch (Throwable th2) {
                            AnonymousClass6.this.a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6942L, com.anythink.basead.d.g.ab + th2.getMessage()), 6, com.anythink.basead.d.g.f6951U + th2.getMessage(), 0L);
                        }
                    }
                });
            } else {
                a(false, (String) null, j6);
            }
        }

        @Override // com.anythink.core.common.res.a.a.InterfaceC0093a
        public final void a(String str, int i, String str2) {
            if (TextUtils.equals(c.this.f6687b.an(), str)) {
                a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.ac, com.anythink.basead.d.g.ac.concat(String.valueOf(str2))), i, str2, 0L);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(boolean z6, String str, long j6) {
            if (this.f6715e && z6 && !TextUtils.isEmpty(str)) {
                d.e(str);
            }
            a(true, (com.anythink.basead.d.f) null, 0, "", j6);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(com.anythink.basead.d.f fVar, int i, String str, long j6) {
            a(false, fVar, i, str, j6);
        }

        private void a(boolean z6, com.anythink.basead.d.f fVar, int i, String str, long j6) {
            if (this.f6715e) {
                return;
            }
            this.f6715e = true;
            b();
            if (!z6) {
                c cVar = c.this;
                com.anythink.core.common.u.e.a(cVar.f6687b, cVar.f6689d, false, System.currentTimeMillis() - this.f6712b, i, str, 0L);
                if (this.f6713c) {
                    c.this.a(5);
                    return;
                } else {
                    c.this.a(fVar);
                    return;
                }
            }
            c cVar2 = c.this;
            com.anythink.core.common.u.e.a(cVar2.f6687b, cVar2.f6689d, System.currentTimeMillis() - this.f6712b, j6);
            c.this.a(5);
        }
    }

    public class a implements com.anythink.basead.b.a.d<Void, com.anythink.basead.d.f> {
        private a() {
        }

        private void b() {
            if (c.this.f6695k != null) {
                String unused = c.this.i;
                c.this.f6695k.a();
            }
            c.c(c.this);
        }

        @Override // com.anythink.basead.b.a.d
        public final /* synthetic */ void a(com.anythink.basead.d.f fVar) {
            com.anythink.basead.d.f fVar2 = fVar;
            if (c.this.f6695k != null) {
                String unused = c.this.i;
                c.this.f6695k.a(fVar2);
            }
            c.c(c.this);
        }

        public /* synthetic */ a(c cVar, byte b9) {
            this();
        }

        /* renamed from: a, reason: avoid collision after fix types in other method */
        private void a2(com.anythink.basead.d.f fVar) {
            if (c.this.f6695k != null) {
                String unused = c.this.i;
                c.this.f6695k.a(fVar);
            }
            c.c(c.this);
        }

        @Override // com.anythink.basead.b.a.d
        public final /* synthetic */ void a() {
            if (c.this.f6695k != null) {
                String unused = c.this.i;
                c.this.f6695k.a();
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
        static final int f6724a = 1;

        /* renamed from: b, reason: collision with root package name */
        static final int f6725b = 2;

        /* renamed from: c, reason: collision with root package name */
        static final int f6726c = 3;

        /* renamed from: d, reason: collision with root package name */
        static final int f6727d = 4;

        /* renamed from: e, reason: collision with root package name */
        static final int f6728e = 5;

        private C0009c() {
        }
    }

    public c(String str, boolean z6, w wVar, x xVar) {
        this.f6691f = str;
        this.f6692g = z6;
        this.f6687b = wVar;
        this.f6689d = xVar;
        y yVar = xVar.f14954o;
        this.f6688c = yVar;
        this.f6693h = yVar.w();
        com.anythink.basead.b.c.b bVar = new com.anythink.basead.b.c.b();
        this.f6696l = bVar;
        bVar.a((com.anythink.basead.b.a.d) new a(this, (byte) 0));
    }

    private boolean c() {
        x xVar = this.f6689d;
        if (!xVar.f14956q || !String.valueOf(xVar.f14949j).equals("0")) {
            return false;
        }
        w wVar = this.f6687b;
        return (((wVar instanceof r) && !TextUtils.isEmpty(((r) wVar).d())) || this.f6689d.f14955p || TextUtils.isEmpty(this.f6687b.B())) ? false : true;
    }

    private void d() {
        if (this.f6687b.ab() <= 0 && this.f6687b.ac() <= 0) {
            com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.basead.b.c.c.2
                @Override // java.lang.Runnable
                public final void run() {
                    String B3 = c.this.f6687b.B();
                    com.anythink.core.common.u.b.a();
                    String a9 = com.anythink.core.common.u.b.a(c.this.f6689d);
                    com.anythink.core.common.u.b.a().a(a9).f14419d = System.currentTimeMillis();
                    c.a(c.this, B3);
                    com.anythink.core.common.u.b.a().a(a9).f14420e = System.currentTimeMillis();
                    c.this.f6687b.ab();
                    c.this.f6687b.ac();
                    com.anythink.core.common.u.b.a().a(a9).a();
                    c.this.a(3);
                }
            }, 4);
            return;
        }
        this.f6687b.ab();
        this.f6687b.ac();
        a(3);
    }

    private boolean e() {
        if (!this.f6687b.L() || !String.valueOf(this.f6689d.f14949j).equals("0")) {
            return false;
        }
        w wVar = this.f6687b;
        if (((wVar instanceof r) && !TextUtils.isEmpty(((r) wVar).d())) || this.f6689d.f14955p) {
            return false;
        }
        d.a(this.f6687b, this.f6688c);
        return true;
    }

    private void f() {
        if (!d.a(this.f6687b, this.f6688c)) {
            a(4);
            return;
        }
        if (this.f6687b.V() > 0 && this.f6687b.W() > 0) {
            this.f6687b.V();
            this.f6687b.W();
            a(4);
        } else {
            com.anythink.core.common.u.b.a();
            String a9 = com.anythink.core.common.u.b.a(this.f6689d);
            com.anythink.core.common.u.b.a().a(a9).f14421f = System.currentTimeMillis();
            com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.basead.b.c.c.3
                @Override // java.lang.Runnable
                public final void run() {
                    final ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
                    newFixedThreadPool.submit(new Runnable() { // from class: com.anythink.basead.b.c.c.3.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                String c9 = com.anythink.core.common.res.d.a(t.b().g()).c(4, o.a(c.this.f6687b.E()));
                                if (new File(c9).exists()) {
                                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                                    mediaMetadataRetriever.setDataSource(c9);
                                    String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
                                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(9);
                                    mediaMetadataRetriever.release();
                                    c.this.f6687b.k(Integer.parseInt(extractMetadata));
                                    c.this.f6687b.l(Integer.parseInt(extractMetadata2));
                                    c.this.f6687b.a(Long.parseLong(extractMetadata3));
                                    com.anythink.core.common.u.b.a();
                                    String a10 = com.anythink.core.common.u.b.a(c.this.f6689d);
                                    com.anythink.core.common.u.b.a().a(a10).f14422g = System.currentTimeMillis();
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
                            newFixedThreadPool.wait(com.anythink.basead.exoplayer.i.a.f8669f);
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
        com.anythink.core.common.t.d.a().b(this.f6690e);
    }

    private void h() {
        com.anythink.core.common.t.d.a().a(this.f6690e, this.f6693h, false);
    }

    private void i() {
        int i;
        x xVar = this.f6689d;
        if (xVar != null && xVar.f14954o != null) {
            Context g9 = t.b().g();
            try {
                i = Math.min(g9.getResources().getDisplayMetrics().widthPixels, g9.getResources().getDisplayMetrics().heightPixels) / 2;
            } catch (Throwable unused) {
                i = 0;
            }
            if (String.valueOf(this.f6689d.f14949j).equals("1") && !this.f6687b.L() && this.f6689d.f14954o.ap() != 1) {
                com.anythink.core.d.b k9 = k.k(com.anythink.core.d.d.a(g9));
                int aq = this.f6689d.f14954o.aq();
                List<String> p9 = aq != 2 ? aq != 3 ? aq != 5 ? null : k9.p() : k9.q() : k9.o();
                if (p9 != null && p9.size() > 0) {
                    for (String str : p9) {
                        if (!TextUtils.isEmpty(str) && !d.b(str, 3)) {
                            com.anythink.core.common.res.b.a(g9).a(new com.anythink.core.common.res.e(3, str), i, i, null);
                        }
                    }
                }
            }
            if (this.f6689d.f14954o.W() == 1 && !TextUtils.isEmpty(this.f6689d.f14954o.f())) {
                com.anythink.core.common.res.b.a(g9).a(new com.anythink.core.common.res.e(3, this.f6689d.f14954o.f()), i, i, null);
            }
            if (this.f6689d.f14954o.aQ() == 4 && !TextUtils.isEmpty(this.f6689d.f14954o.bb()) && !com.anythink.core.common.res.d.a(g9).b(3, o.a(this.f6689d.f14954o.bb()))) {
                this.f6689d.f14954o.bb();
                new com.anythink.basead.b.c.a(this.f6689d.f14954o.bb()).d();
            }
        }
        List<String> e9 = this.f6687b.e((w) this.f6688c);
        if (e9.isEmpty()) {
            return;
        }
        for (String str2 : e9) {
            if (!TextUtils.isEmpty(str2)) {
                d.b(str2, 3);
                if (!d.b(str2, 3)) {
                    k.j().a(new com.anythink.core.common.res.e(3, str2), new b.a() { // from class: com.anythink.basead.b.c.c.5
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
        String an = this.f6687b.an();
        if (TextUtils.isEmpty(an)) {
            a(5);
            return;
        }
        com.anythink.core.common.res.a.a.a(t.b().g()).a(an, new AnonymousClass6(this.f6688c.bL(), System.currentTimeMillis(), this.f6688c.bF() == 1));
    }

    private void b() {
        List<String> b9 = this.f6687b.b(this.f6688c);
        b9.size();
        if (b9.size() > 0) {
            for (int i = 0; i < b9.size(); i++) {
                String str = b9.get(i);
                if (!d.f(str)) {
                    new f(this.f6691f, this.f6692g, this.f6687b, str).d();
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
        boolean z6;
        w wVar;
        boolean z9;
        String an;
        c cVar;
        w wVar2 = this.f6687b;
        if (wVar2 != null && this.f6696l != null) {
            this.i = wVar2.v();
            this.f6695k = bVar;
            com.anythink.core.common.t.d.a().a(this.f6690e, this.f6693h, false);
            int ao = this.f6687b.ao();
            x xVar = this.f6689d;
            int i = xVar.f14949j;
            if (ao != 1) {
                if (ao == 2) {
                    this.f6697m = false;
                    if (this.f6688c != null) {
                        boolean z10 = i == 1 || i == 3;
                        this.f6696l.b(1);
                        if (z10) {
                            this.f6696l.b(2);
                            a();
                        }
                        if (this.f6697m) {
                            return;
                        }
                        boolean af = this.f6688c.af();
                        String a9 = i.a(this.f6689d, this.f6687b);
                        if (TextUtils.isEmpty(a9)) {
                            a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6942L, com.anythink.basead.d.g.f6948R));
                        } else if (!af) {
                            a(2);
                        } else {
                            t.b().b(new AnonymousClass4(d.b(this.f6689d, this.f6687b), a9));
                        }
                    }
                }
                i();
                return;
            }
            if (xVar.f14956q && String.valueOf(i).equals("0")) {
                w wVar3 = this.f6687b;
                if ((!(wVar3 instanceof r) || TextUtils.isEmpty(((r) wVar3).d())) && !this.f6689d.f14955p && !TextUtils.isEmpty(this.f6687b.B())) {
                    z6 = true;
                    this.f6699o = z6;
                    int i4 = z6 ? 2 : 1;
                    if (this.f6687b.L() && String.valueOf(this.f6689d.f14949j).equals("0")) {
                        wVar = this.f6687b;
                        if (((wVar instanceof r) || TextUtils.isEmpty(((r) wVar).d())) && !this.f6689d.f14955p) {
                            d.a(this.f6687b, this.f6688c);
                            z9 = true;
                            this.f6700p = z9;
                            if (z9) {
                                i4++;
                            }
                            if ((i != 1 || i == 3 || i == 4) && ao == 3) {
                                i4++;
                                an = this.f6687b.an();
                                if (!TextUtils.isEmpty(an)) {
                                    a(5);
                                } else {
                                    cVar = this;
                                    com.anythink.core.common.res.a.a.a(t.b().g()).a(an, cVar.new AnonymousClass6(this.f6688c.bL(), System.currentTimeMillis(), this.f6688c.bF() == 1));
                                    cVar.f6696l.b(i4);
                                    a();
                                    i();
                                    return;
                                }
                            }
                            cVar = this;
                            cVar.f6696l.b(i4);
                            a();
                            i();
                            return;
                        }
                    }
                    z9 = false;
                    this.f6700p = z9;
                    if (z9) {
                    }
                    if (i != 1) {
                    }
                    i4++;
                    an = this.f6687b.an();
                    if (!TextUtils.isEmpty(an)) {
                    }
                }
            }
            z6 = false;
            this.f6699o = z6;
            if (z6) {
            }
            if (this.f6687b.L()) {
                wVar = this.f6687b;
                if (wVar instanceof r) {
                }
                d.a(this.f6687b, this.f6688c);
                z9 = true;
                this.f6700p = z9;
                if (z9) {
                }
                if (i != 1) {
                }
                i4++;
                an = this.f6687b.an();
                if (!TextUtils.isEmpty(an)) {
                }
            }
            z9 = false;
            this.f6700p = z9;
            if (z9) {
            }
            if (i != 1) {
            }
            i4++;
            an = this.f6687b.an();
            if (!TextUtils.isEmpty(an)) {
            }
        } else {
            a(com.anythink.basead.d.g.a("-9999", com.anythink.basead.d.g.f6934C));
        }
    }

    public static /* synthetic */ void c(c cVar) {
        e.a().b(cVar);
        com.anythink.core.common.t.d.a().b(cVar.f6690e);
    }

    private void a() {
        List<String> a9 = this.f6687b.a((w) this.f6688c);
        if (a9 == null) {
            a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6967m, "Incomplete resource allocation! MissResource: ".concat(String.valueOf(this.f6687b.a()))));
            return;
        }
        int size = a9.size();
        if (size == 0) {
            b();
            a(1);
            return;
        }
        this.f6694j = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = a9.get(i);
            if (!TextUtils.isEmpty(str)) {
                if (this.f6687b.I(str)) {
                    if (!d.a(this.f6687b, this.f6688c) && !this.f6694j.contains(str)) {
                        this.f6688c.ac();
                        this.f6694j.add(str);
                    }
                } else if (!d.f(str) && !this.f6694j.contains(str)) {
                    this.f6694j.add(str);
                }
            }
        }
        if (com.anythink.basead.b.e.c(this.f6687b, this.f6689d) && this.f6687b.L() && d.a(this.f6687b, this.f6688c) && !TextUtils.isEmpty(this.f6687b.B())) {
            this.f6694j.remove(this.f6687b.B());
        }
        int size2 = this.f6694j.size();
        if (size2 == 0) {
            b();
            a(1);
            return;
        }
        synchronized (this) {
            try {
                e.a().a(this);
                ArrayList arrayList = new ArrayList(this.f6694j);
                for (int i4 = 0; i4 < size2; i4++) {
                    String str2 = (String) arrayList.get(i4);
                    boolean I8 = this.f6687b.I(str2);
                    int ac = this.f6688c.ac();
                    if (I8) {
                        if (d.a(this.f6687b, this.f6688c)) {
                            e.a().a(str2, ac);
                        } else {
                            new g(this.f6691f, this.f6687b, this.f6688c, this.f6689d).a();
                        }
                    } else if (!d.a(str2)) {
                        if (d.f(str2)) {
                            d.a(str2, 100);
                            e.a().a(str2, 100);
                        } else {
                            d.a(str2, 0);
                            new f(this.f6691f, this.f6692g, this.f6687b, str2).d();
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
        int i4;
        int i6;
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
                i4 = options.outWidth;
                try {
                    i6 = options.outHeight;
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
                    i = i4;
                    try {
                        th.getMessage();
                        th.printStackTrace();
                        i4 = i;
                        i6 = 0;
                        if (i4 < 0) {
                        }
                        if (i6 >= 0) {
                        }
                        this.f6687b.n(i4);
                        this.f6687b.o(r0);
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
                i4 = i;
                i6 = 0;
                if (i4 < 0) {
                }
                if (i6 >= 0) {
                }
                this.f6687b.n(i4);
                this.f6687b.o(r0);
            }
        } catch (Throwable th3) {
            th = th3;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        int i9 = i6 >= 0 ? i6 : 0;
        this.f6687b.n(i4);
        this.f6687b.o(i9);
    }

    private void a(boolean z6) {
        String a9 = i.a(this.f6689d, this.f6687b);
        if (TextUtils.isEmpty(a9)) {
            a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6942L, com.anythink.basead.d.g.f6948R));
        } else if (!z6) {
            a(2);
        } else {
            t.b().b(new AnonymousClass4(d.b(this.f6689d, this.f6687b), a9));
        }
    }

    @Override // com.anythink.basead.b.c.e.a
    public final void a(String str, int i) {
        this.f6694j.size();
        synchronized (this) {
            try {
                d.a(str, i);
                List<String> list = this.f6694j;
                if (list != null) {
                    if (list.contains(str)) {
                        if (this.f6687b.I(str)) {
                            if (this.f6688c.ac() <= i) {
                            }
                        }
                        this.f6694j.remove(str);
                        if (this.f6687b.I(str)) {
                            h.a(this.f6687b, this.f6688c);
                        }
                        if (this.f6694j.isEmpty()) {
                            a(1);
                            return;
                        }
                        if (com.anythink.basead.b.e.c(this.f6687b, this.f6689d)) {
                            String B3 = this.f6687b.B();
                            if (TextUtils.equals(String.valueOf(this.f6689d.f14954o.F()), "2")) {
                                B3 = this.f6687b.d((w) this.f6688c);
                            }
                            if (this.f6687b.I(str) && !TextUtils.isEmpty(B3)) {
                                this.f6694j.remove(B3);
                                if (this.f6694j.isEmpty()) {
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
        this.f6694j.size();
        fVar.c();
        synchronized (this) {
            char c9 = 65535;
            try {
                d.a(str, -1);
                List<String> list = this.f6694j;
                if (list != null) {
                    list.remove(str);
                }
                if (this.f6687b.I(str) && com.anythink.basead.b.e.c(this.f6687b, this.f6689d)) {
                    com.anythink.core.common.u.e.a(this.f6689d, this.f6687b, 1, fVar.c());
                }
                String valueOf = String.valueOf(this.f6689d.f14954o.F());
                switch (valueOf.hashCode()) {
                    case j.f6602W /* 48 */:
                        if (valueOf.equals("0")) {
                            c9 = 2;
                            break;
                        }
                        break;
                    case j.f6603X /* 49 */:
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
                    String B3 = this.f6687b.B();
                    if (TextUtils.equals(String.valueOf(this.f6689d.f14954o.F()), "2")) {
                        B3 = this.f6687b.d((w) this.f6688c);
                    }
                    if (!this.f6687b.I(str) && (TextUtils.isEmpty(B3) || !TextUtils.equals(B3, str))) {
                        a(fVar);
                        return;
                    }
                    if (TextUtils.isEmpty(B3)) {
                        a(fVar);
                        return;
                    }
                    if (this.f6687b.I(str) && this.f6694j.size() == 0) {
                        a(1);
                        return;
                    }
                    List<String> list2 = this.f6694j;
                    if (list2 == null || (!list2.contains(this.f6687b.E()) && !this.f6694j.contains(this.f6687b.B()))) {
                        a(fVar);
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        boolean z6 = this.f6699o;
        if (i == 1 && !this.f6698n) {
            this.f6698n = true;
            if (z6) {
                d();
            }
            if (this.f6700p) {
                f();
            }
        }
        com.anythink.basead.b.a.e<Void, com.anythink.basead.d.f> eVar = this.f6696l;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.anythink.basead.d.f fVar) {
        fVar.c();
        this.f6697m = true;
        com.anythink.basead.b.a.e<Void, com.anythink.basead.d.f> eVar = this.f6696l;
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
        int i4;
        int i6;
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
                i4 = options.outWidth;
                try {
                    i6 = options.outHeight;
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
                    i = i4;
                    try {
                        th.getMessage();
                        th.printStackTrace();
                        i4 = i;
                        i6 = 0;
                        if (i4 < 0) {
                        }
                        if (i6 >= 0) {
                        }
                        cVar.f6687b.n(i4);
                        cVar.f6687b.o(r0);
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
                i4 = i;
                i6 = 0;
                if (i4 < 0) {
                }
                if (i6 >= 0) {
                }
                cVar.f6687b.n(i4);
                cVar.f6687b.o(r0);
            }
        } catch (Throwable th3) {
            th = th3;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        int i9 = i6 >= 0 ? i6 : 0;
        cVar.f6687b.n(i4);
        cVar.f6687b.o(i9);
    }
}
