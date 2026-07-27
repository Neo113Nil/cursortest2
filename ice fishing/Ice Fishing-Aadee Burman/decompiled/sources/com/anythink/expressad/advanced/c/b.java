package com.anythink.expressad.advanced.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.anythink.basead.exoplayer.f.f;
import com.anythink.core.common.d.t;
import com.anythink.expressad.advanced.js.NativeAdvancedJSBridgeImpl;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.anythink.expressad.advanced.view.ATNativeAdvancedView;
import com.anythink.expressad.advanced.view.ATNativeAdvancedWebview;
import com.anythink.expressad.foundation.g.g.a.e;
import com.anythink.expressad.foundation.h.l;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.foundation.h.z;
import com.anythink.expressad.videocommon.b.i;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static String f17755a = "NativeAdvancedLoadManager";

    /* renamed from: k, reason: collision with root package name */
    private static final int f17756k = 1;

    /* renamed from: l, reason: collision with root package name */
    private static final int f17757l = 2;

    /* renamed from: m, reason: collision with root package name */
    private static final int f17758m = 3;

    /* renamed from: n, reason: collision with root package name */
    private static final int f17759n = 4;

    /* renamed from: o, reason: collision with root package name */
    private static final int f17760o = 5;

    /* renamed from: A, reason: collision with root package name */
    private String f17761A;

    /* renamed from: B, reason: collision with root package name */
    private int f17762B;

    /* renamed from: b, reason: collision with root package name */
    private String f17766b;

    /* renamed from: c, reason: collision with root package name */
    private String f17767c;

    /* renamed from: d, reason: collision with root package name */
    private long f17768d;

    /* renamed from: e, reason: collision with root package name */
    private com.anythink.expressad.advanced.d.b f17769e;

    /* renamed from: g, reason: collision with root package name */
    private ATNativeAdvancedView f17771g;

    /* renamed from: h, reason: collision with root package name */
    private com.anythink.expressad.f.c f17772h;
    private List<com.anythink.expressad.foundation.d.d> i;

    /* renamed from: j, reason: collision with root package name */
    private com.anythink.expressad.foundation.d.d f17773j;

    /* renamed from: p, reason: collision with root package name */
    private int f17774p;

    /* renamed from: q, reason: collision with root package name */
    private int f17775q;

    /* renamed from: r, reason: collision with root package name */
    private int f17776r;

    /* renamed from: s, reason: collision with root package name */
    private int f17777s;

    /* renamed from: t, reason: collision with root package name */
    private String f17778t;

    /* renamed from: u, reason: collision with root package name */
    private int f17779u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f17780v;

    /* renamed from: w, reason: collision with root package name */
    private volatile boolean f17781w;

    /* renamed from: x, reason: collision with root package name */
    private com.anythink.expressad.videocommon.d.c f17782x;

    /* renamed from: y, reason: collision with root package name */
    private i.d f17783y;

    /* renamed from: z, reason: collision with root package name */
    private i.d f17784z;

    /* renamed from: C, reason: collision with root package name */
    private String f17763C = "";

    /* renamed from: D, reason: collision with root package name */
    private Handler f17764D = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.advanced.c.b.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object obj;
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                Object obj2 = message.obj;
                int i6 = message.arg1;
                if (obj2 == null || !(obj2 instanceof com.anythink.expressad.foundation.d.d)) {
                    return;
                }
                com.anythink.expressad.foundation.d.d dVar = (com.anythink.expressad.foundation.d.d) obj2;
                b.a(b.this, i.a().b(dVar.b()), dVar, i6);
                return;
            }
            if (i == 2) {
                Object obj3 = message.obj;
                try {
                    if (obj3 instanceof Bundle) {
                        int i9 = ((Bundle) obj3).getInt("type");
                        com.anythink.expressad.foundation.e.c cVar = new com.anythink.expressad.foundation.e.c(i9 == 1 ? com.anythink.expressad.foundation.e.b.f18983e : i9 == 2 ? com.anythink.expressad.foundation.e.b.f18986h : i9 == 3 ? com.anythink.expressad.foundation.e.b.f18985g : com.anythink.expressad.foundation.e.b.f19001x);
                        String string = ((Bundle) obj3).getString(com.anythink.expressad.foundation.g.a.f19093q);
                        com.anythink.expressad.foundation.d.d dVar2 = (com.anythink.expressad.foundation.d.d) ((Bundle) obj3).getSerializable("campaignex");
                        cVar.a(string);
                        cVar.a(dVar2);
                        b bVar = b.this;
                        String unused = bVar.f17778t;
                        int unused2 = b.this.f17779u;
                        bVar.a(cVar, dVar2);
                        return;
                    }
                    return;
                } catch (Exception e9) {
                    com.anythink.expressad.foundation.e.c cVar2 = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f18979a);
                    cVar2.a((Throwable) e9);
                    b bVar2 = b.this;
                    String unused3 = bVar2.f17778t;
                    int unused4 = b.this.f17779u;
                    bVar2.a(cVar2, (com.anythink.expressad.foundation.d.d) null);
                    return;
                }
            }
            if (i == 3) {
                Object obj4 = message.obj;
                if (obj4 == null || !(obj4 instanceof com.anythink.expressad.foundation.d.d)) {
                    return;
                }
                b bVar3 = b.this;
                bVar3.a((com.anythink.expressad.foundation.d.d) obj4, bVar3.f17779u);
                return;
            }
            if (i != 4) {
                if (i == 5 && (obj = message.obj) != null && (obj instanceof com.anythink.expressad.foundation.d.d)) {
                    if (b.this.f17771g != null) {
                        b.this.f17771g.setVideoReady(true);
                    }
                    b bVar4 = b.this;
                    bVar4.a((com.anythink.expressad.foundation.d.d) obj, bVar4.f17779u);
                    return;
                }
                return;
            }
            Object obj5 = message.obj;
            if (obj5 == null || !(obj5 instanceof com.anythink.expressad.foundation.d.d)) {
                return;
            }
            if (b.this.f17771g != null) {
                b.this.f17771g.setEndCardReady(true);
            }
            b bVar5 = b.this;
            bVar5.a((com.anythink.expressad.foundation.d.d) obj5, bVar5.f17779u);
        }
    };

    /* renamed from: E, reason: collision with root package name */
    private Runnable f17765E = new Runnable() { // from class: com.anythink.expressad.advanced.c.b.3
        @Override // java.lang.Runnable
        public final void run() {
            com.anythink.expressad.foundation.e.c cVar = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f18988k);
            b bVar = b.this;
            String unused = bVar.f17778t;
            int unused2 = b.this.f17779u;
            bVar.a(cVar, (com.anythink.expressad.foundation.d.d) null);
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private Context f17770f = t.b().g();

    /* renamed from: com.anythink.expressad.advanced.c.b$10, reason: invalid class name */
    public class AnonymousClass10 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ATNativeAdvancedWebview f17786a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f17787b;

        public AnonymousClass10(ATNativeAdvancedWebview aTNativeAdvancedWebview, String str) {
            this.f17786a = aTNativeAdvancedWebview;
            this.f17787b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f17786a.loadUrl(z.d(this.f17787b));
        }
    }

    /* renamed from: com.anythink.expressad.advanced.c.b$7, reason: invalid class name */
    public class AnonymousClass7 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.d f17805a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f17806b = 2;

        public AnonymousClass7(com.anythink.expressad.foundation.d.d dVar) {
            this.f17805a = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            File file;
            final File file2;
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    try {
                        file2 = new File(this.f17805a.c());
                        try {
                            if (!file2.exists()) {
                                String b9 = com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_700_HTML);
                                String a9 = s.a(z.b(this.f17805a.c()));
                                if (TextUtils.isEmpty(a9)) {
                                    a9 = String.valueOf(System.currentTimeMillis());
                                }
                                file = new File(b9, a9.concat(".html"));
                                try {
                                    if (!file.exists()) {
                                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                                        try {
                                            fileOutputStream2.write(("<script>" + com.anythink.core.common.v.z.a().b() + "</script>" + this.f17805a.c()).getBytes());
                                            fileOutputStream2.flush();
                                            fileOutputStream = fileOutputStream2;
                                        } catch (Exception e9) {
                                            e = e9;
                                            fileOutputStream = fileOutputStream2;
                                            e.printStackTrace();
                                            this.f17805a.j("");
                                            if (fileOutputStream != null) {
                                                fileOutputStream.close();
                                            }
                                            file2 = file;
                                            if (!file2.exists()) {
                                            }
                                            String unused = b.f17755a;
                                            com.anythink.expressad.foundation.e.c cVar = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f18990m);
                                            b bVar = b.this;
                                            String unused2 = bVar.f17778t;
                                            bVar.a(cVar, this.f17805a);
                                        } catch (Throwable th) {
                                            th = th;
                                            fileOutputStream = fileOutputStream2;
                                            if (fileOutputStream != null) {
                                                fileOutputStream.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    file2 = file;
                                } catch (Exception e10) {
                                    e = e10;
                                }
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                        } catch (Exception e11) {
                            e = e11;
                            file = file2;
                        }
                    } catch (Exception unused3) {
                        com.anythink.expressad.foundation.e.c cVar2 = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f18990m);
                        b bVar2 = b.this;
                        String unused4 = bVar2.f17778t;
                        bVar2.a(cVar2, this.f17805a);
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e12) {
                e = e12;
                file = null;
            }
            if (!file2.exists() && file2.isFile() && file2.canRead()) {
                this.f17805a.b(file2.getAbsolutePath());
                String unused5 = b.f17755a;
                t.b().b(new Runnable() { // from class: com.anythink.expressad.advanced.c.b.7.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        b bVar3 = b.this;
                        String str = "file:////" + file2.getAbsolutePath();
                        AnonymousClass7 anonymousClass7 = AnonymousClass7.this;
                        b.a(bVar3, str, anonymousClass7.f17805a, anonymousClass7.f17806b);
                    }
                });
            } else {
                String unused6 = b.f17755a;
                com.anythink.expressad.foundation.e.c cVar3 = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f18990m);
                b bVar3 = b.this;
                String unused22 = bVar3.f17778t;
                bVar3.a(cVar3, this.f17805a);
            }
        }
    }

    /* renamed from: com.anythink.expressad.advanced.c.b$9, reason: invalid class name */
    public class AnonymousClass9 extends com.anythink.expressad.atsignalcommon.b.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.d f17813a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f17814b;

        public AnonymousClass9(com.anythink.expressad.foundation.d.d dVar, int i) {
            this.f17813a = dVar;
            this.f17814b = i;
        }

        @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!this.f17813a.t()) {
                b.this.f17771g.setH5Ready(true);
                com.anythink.expressad.advanced.a.a.a(this.f17813a.aa());
                b.b(b.this, this.f17813a, this.f17814b);
            }
            NativeAdvancedJsUtils.fireOnJSBridgeConnected(webView);
        }

        @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            b.this.a(this.f17813a, str);
        }

        @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslError.getPrimaryError();
            b.this.a(this.f17813a, "onReceivedSslError:" + sslError.getUrl());
        }

        @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
        public final void readyState(WebView webView, int i) {
            super.readyState(webView, i);
            if (i != 1) {
                b.this.a(this.f17813a, "readyState 2");
                return;
            }
            b.this.f17771g.setH5Ready(true);
            com.anythink.expressad.advanced.a.a.a(this.f17813a.aa());
            b.b(b.this, this.f17813a, this.f17814b);
        }
    }

    public b(String str, String str2) {
        this.f17767c = str;
        this.f17766b = str2;
    }

    private void c(com.anythink.expressad.foundation.d.d dVar) {
        f.l().a(dVar.z(), new AnonymousClass4(dVar));
    }

    private void e(com.anythink.expressad.foundation.d.d dVar) {
        f.l().a(dVar.bm(), new AnonymousClass6(dVar));
    }

    private void f() {
        try {
            int i = this.f17762B + 1;
            this.f17762B = i;
            com.anythink.expressad.f.c cVar = this.f17772h;
            if (cVar != null && i <= cVar.t()) {
                return;
            }
            this.f17762B = 0;
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    private String g() {
        return l.a(this.i);
    }

    private static void h() {
    }

    private void i() {
        this.f17762B = 0;
    }

    private void j() {
        this.f17764D.removeCallbacks(this.f17765E);
    }

    private static void k() {
    }

    private void b(int i) {
        this.f17775q = i;
    }

    private void g(com.anythink.expressad.foundation.d.d dVar) {
        String str;
        this.f17783y = new AnonymousClass8(dVar);
        e eVar = new e();
        eVar.a(dVar);
        if (dVar != null) {
            r1 = dVar.aD() != null ? dVar.aD().f18531a : 0;
            str = dVar.b();
        } else {
            str = "";
        }
        eVar.a(r1);
        eVar.a();
        i.a().b(str, (i.a) this.f17783y);
    }

    private void h(com.anythink.expressad.foundation.d.d dVar) {
        this.f17782x = new AnonymousClass2(dVar);
        CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(dVar);
        com.anythink.expressad.videocommon.b.e.a().a(this.f17766b, copyOnWriteArrayList, com.anythink.expressad.foundation.g.a.bb, this.f17782x);
        if (!com.anythink.expressad.videocommon.b.e.a().a(com.anythink.expressad.foundation.g.a.bb, this.f17766b, dVar.B())) {
            com.anythink.expressad.videocommon.b.e.a().d(this.f17766b);
        } else {
            this.f17771g.setVideoReady(true);
            a(dVar, 2);
        }
    }

    /* renamed from: com.anythink.expressad.advanced.c.b$4, reason: invalid class name */
    public class AnonymousClass4 implements com.anythink.expressad.foundation.g.d.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.d f17792a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f17793b = 2;

        public AnonymousClass4(com.anythink.expressad.foundation.d.d dVar) {
            this.f17792a = dVar;
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(Bitmap bitmap, String str) {
            String unused = b.f17755a;
            if (b.this.f17764D != null) {
                b.this.f17764D.post(new Runnable() { // from class: com.anythink.expressad.advanced.c.b.4.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                        b.this.a(anonymousClass4.f17792a, anonymousClass4.f17793b);
                    }
                });
            }
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(String str, String str2) {
            String unused = b.f17755a;
            if (b.this.f17764D != null) {
                b.this.f17764D.post(new Runnable() { // from class: com.anythink.expressad.advanced.c.b.4.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                        b.this.a(anonymousClass4.f17792a, anonymousClass4.f17793b);
                    }
                });
            }
        }
    }

    /* renamed from: com.anythink.expressad.advanced.c.b$6, reason: invalid class name */
    public class AnonymousClass6 implements com.anythink.expressad.foundation.g.d.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.d f17800a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f17801b = 2;

        public AnonymousClass6(com.anythink.expressad.foundation.d.d dVar) {
            this.f17800a = dVar;
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(Bitmap bitmap, String str) {
            String unused = b.f17755a;
            if (b.this.f17764D != null) {
                b.this.f17764D.post(new Runnable() { // from class: com.anythink.expressad.advanced.c.b.6.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                        b.this.a(anonymousClass6.f17800a, anonymousClass6.f17801b);
                    }
                });
            }
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(String str, String str2) {
            String unused = b.f17755a;
            if (b.this.f17764D != null) {
                b.this.f17764D.post(new Runnable() { // from class: com.anythink.expressad.advanced.c.b.6.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                        b.this.a(anonymousClass6.f17800a, anonymousClass6.f17801b);
                    }
                });
            }
        }
    }

    private void d(com.anythink.expressad.foundation.d.d dVar) {
        String str;
        this.f17784z = new AnonymousClass5(dVar);
        if (dVar != null) {
            r0 = dVar.aD() != null ? dVar.aD().f18531a : 0;
            str = dVar.J();
        } else {
            str = "";
        }
        e eVar = new e();
        eVar.a(dVar);
        eVar.a(r0);
        i.a().b(str, (i.a) this.f17784z);
    }

    public final void b() {
        if (this.f17769e != null) {
            this.f17769e = null;
        }
        if (this.f17782x != null) {
            this.f17782x = null;
        }
        if (this.f17783y != null) {
            this.f17783y = null;
        }
    }

    /* renamed from: com.anythink.expressad.advanced.c.b$2, reason: invalid class name */
    public class AnonymousClass2 implements com.anythink.expressad.videocommon.d.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.d f17789a;

        public AnonymousClass2(com.anythink.expressad.foundation.d.d dVar) {
            this.f17789a = dVar;
        }

        @Override // com.anythink.expressad.videocommon.d.c
        public final void a(String str) {
            String unused = b.f17755a;
            Message obtain = Message.obtain();
            obtain.obj = this.f17789a;
            obtain.what = 5;
            b.this.f17764D.sendMessage(obtain);
        }

        @Override // com.anythink.expressad.videocommon.d.c
        public final void a(String str, String str2) {
            String unused = b.f17755a;
            Message obtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f17789a);
            bundle.putString(com.anythink.expressad.foundation.g.a.f19093q, str);
            bundle.putInt("type", 1);
            obtain.obj = bundle;
            obtain.what = 2;
            b.this.f17764D.sendMessage(obtain);
        }
    }

    private void f(com.anythink.expressad.foundation.d.d dVar) {
        com.anythink.core.common.v.b.b.a().a(new AnonymousClass7(dVar));
    }

    public final void a(com.anythink.expressad.f.c cVar) {
        this.f17772h = cVar;
    }

    /* renamed from: com.anythink.expressad.advanced.c.b$8, reason: invalid class name */
    public class AnonymousClass8 implements i.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.d f17810a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f17811b = 2;

        public AnonymousClass8(com.anythink.expressad.foundation.d.d dVar) {
            this.f17810a = dVar;
        }

        @Override // com.anythink.expressad.videocommon.b.i.a
        public final void a(String str) {
            String unused = b.f17755a;
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = this.f17810a;
            obtain.arg1 = this.f17811b;
            b.this.f17764D.sendMessage(obtain);
        }

        @Override // com.anythink.expressad.videocommon.b.i.a
        public final void a(String str, String str2) {
            String unused = b.f17755a;
            Message obtain = Message.obtain();
            obtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f17810a);
            bundle.putString(com.anythink.expressad.foundation.g.a.f19093q, str);
            bundle.putInt("type", 3);
            obtain.obj = bundle;
            b.this.f17764D.sendMessage(obtain);
        }
    }

    private int e() {
        return this.f17775q;
    }

    public final void a(ATNativeAdvancedView aTNativeAdvancedView) {
        this.f17771g = aTNativeAdvancedView;
    }

    /* renamed from: com.anythink.expressad.advanced.c.b$5, reason: invalid class name */
    public class AnonymousClass5 implements i.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.d f17797a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f17798b = 2;

        public AnonymousClass5(com.anythink.expressad.foundation.d.d dVar) {
            this.f17797a = dVar;
        }

        @Override // com.anythink.expressad.videocommon.b.i.a
        public final void a(String str) {
            String unused = b.f17755a;
            if (b.this.f17764D != null) {
                Message obtain = Message.obtain();
                obtain.what = 4;
                obtain.obj = this.f17797a;
                obtain.arg1 = this.f17798b;
                b.this.f17764D.sendMessage(obtain);
            }
        }

        @Override // com.anythink.expressad.videocommon.b.i.a
        public final void a(String str, String str2) {
            String unused = b.f17755a;
            if (b.this.f17771g != null) {
                b.this.f17771g.setEndCardReady(false);
            }
            Message obtain = Message.obtain();
            obtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f17797a);
            bundle.putString(com.anythink.expressad.foundation.g.a.f19093q, str);
            bundle.putInt("type", 2);
            obtain.obj = bundle;
            b.this.f17764D.sendMessage(obtain);
        }
    }

    public final void a(int i) {
        this.f17774p = i;
    }

    public final com.anythink.expressad.foundation.d.d c() {
        return this.f17773j;
    }

    public final void a(int i, int i6) {
        this.f17777s = i;
        this.f17776r = i6;
    }

    private void b(com.anythink.expressad.foundation.d.d dVar) {
        ATNativeAdvancedView aTNativeAdvancedView = this.f17771g;
        if (aTNativeAdvancedView != null) {
            aTNativeAdvancedView.clearResState();
        }
        if (!TextUtils.isEmpty(dVar.b())) {
            dVar.b();
            this.f17783y = new AnonymousClass8(dVar);
            e eVar = new e();
            eVar.a(dVar);
            int i = dVar.aD() != null ? dVar.aD().f18531a : 0;
            String b9 = dVar.b();
            eVar.a(i);
            eVar.a();
            i.a().b(b9, (i.a) this.f17783y);
        }
        if (!TextUtils.isEmpty(dVar.c())) {
            dVar.c();
            com.anythink.core.common.v.b.b.a().a(new AnonymousClass7(dVar));
        }
        if (!TextUtils.isEmpty(dVar.T())) {
            dVar.T();
            this.f17782x = new AnonymousClass2(dVar);
            CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            copyOnWriteArrayList.add(dVar);
            com.anythink.expressad.videocommon.b.e.a().a(this.f17766b, copyOnWriteArrayList, com.anythink.expressad.foundation.g.a.bb, this.f17782x);
            if (!com.anythink.expressad.videocommon.b.e.a().a(com.anythink.expressad.foundation.g.a.bb, this.f17766b, dVar.B())) {
                com.anythink.expressad.videocommon.b.e.a().d(this.f17766b);
            } else {
                this.f17771g.setVideoReady(true);
                a(dVar, 2);
            }
        }
        if (!TextUtils.isEmpty(dVar.bm())) {
            dVar.bm();
            com.anythink.expressad.foundation.g.d.b.a(t.b().g()).a(dVar.bm(), new AnonymousClass6(dVar));
        }
        if (!TextUtils.isEmpty(dVar.J())) {
            dVar.J();
            this.f17784z = new AnonymousClass5(dVar);
            int i6 = dVar.aD() != null ? dVar.aD().f18531a : 0;
            String J = dVar.J();
            e eVar2 = new e();
            eVar2.a(dVar);
            eVar2.a(i6);
            i.a().b(J, (i.a) this.f17784z);
        }
        if (TextUtils.isEmpty(dVar.z())) {
            return;
        }
        dVar.z();
        com.anythink.expressad.foundation.g.d.b.a(t.b().g()).a(dVar.z(), new AnonymousClass4(dVar));
    }

    private void a(long j6) {
        this.f17764D.postDelayed(this.f17765E, j6);
    }

    public final String a() {
        return this.f17763C;
    }

    public final void a(com.anythink.expressad.advanced.d.b bVar) {
        this.f17769e = bVar;
    }

    private void a(com.anythink.expressad.foundation.d.d dVar) {
        this.f17773j = dVar;
        if (d.a(this.f17771g, dVar)) {
            a(dVar, 2);
            return;
        }
        ATNativeAdvancedView aTNativeAdvancedView = this.f17771g;
        if (aTNativeAdvancedView != null) {
            aTNativeAdvancedView.clearResState();
        }
        if (!TextUtils.isEmpty(dVar.b())) {
            dVar.b();
            this.f17783y = new AnonymousClass8(dVar);
            e eVar = new e();
            eVar.a(dVar);
            int i = dVar.aD() != null ? dVar.aD().f18531a : 0;
            String b9 = dVar.b();
            eVar.a(i);
            eVar.a();
            i.a().b(b9, (i.a) this.f17783y);
        }
        if (!TextUtils.isEmpty(dVar.c())) {
            dVar.c();
            com.anythink.core.common.v.b.b.a().a(new AnonymousClass7(dVar));
        }
        if (!TextUtils.isEmpty(dVar.T())) {
            dVar.T();
            this.f17782x = new AnonymousClass2(dVar);
            CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            copyOnWriteArrayList.add(dVar);
            com.anythink.expressad.videocommon.b.e.a().a(this.f17766b, copyOnWriteArrayList, com.anythink.expressad.foundation.g.a.bb, this.f17782x);
            if (!com.anythink.expressad.videocommon.b.e.a().a(com.anythink.expressad.foundation.g.a.bb, this.f17766b, dVar.B())) {
                com.anythink.expressad.videocommon.b.e.a().d(this.f17766b);
            } else {
                this.f17771g.setVideoReady(true);
                a(dVar, 2);
            }
        }
        if (!TextUtils.isEmpty(dVar.bm())) {
            dVar.bm();
            com.anythink.expressad.foundation.g.d.b.a(t.b().g()).a(dVar.bm(), new AnonymousClass6(dVar));
        }
        if (!TextUtils.isEmpty(dVar.J())) {
            dVar.J();
            this.f17784z = new AnonymousClass5(dVar);
            int i6 = dVar.aD() != null ? dVar.aD().f18531a : 0;
            String J = dVar.J();
            e eVar2 = new e();
            eVar2.a(dVar);
            eVar2.a(i6);
            i.a().b(J, (i.a) this.f17784z);
        }
        if (TextUtils.isEmpty(dVar.z())) {
            return;
        }
        dVar.z();
        com.anythink.expressad.foundation.g.d.b.a(t.b().g()).a(dVar.z(), new AnonymousClass4(dVar));
    }

    private void b(com.anythink.expressad.foundation.d.d dVar, int i) {
        if (this.f17771g.isH5Ready()) {
            a(dVar, i);
        }
    }

    private List<com.anythink.expressad.foundation.d.d> b(com.anythink.expressad.foundation.d.e eVar) {
        if (eVar == null || eVar.f18680K == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        com.anythink.expressad.foundation.d.d dVar = eVar.f18680K.get(0);
        dVar.l(this.f17766b);
        this.f17761A = eVar.c();
        if (dVar.P() != 99 && (!TextUtils.isEmpty(dVar.b()) || !TextUtils.isEmpty(dVar.c()))) {
            if (v.a(dVar)) {
                dVar.k(v.a(this.f17770f, dVar.bi()) ? 1 : 2);
            }
            if (l.a(this.f17770f, dVar)) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.anythink.expressad.foundation.d.d dVar, int i) {
        if (!d.a(this.f17771g, dVar) || this.f17781w) {
            return;
        }
        j();
        this.f17781w = true;
        com.anythink.expressad.advanced.d.b bVar = this.f17769e;
        if (bVar != null) {
            bVar.a(dVar, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.anythink.expressad.foundation.e.c cVar, com.anythink.expressad.foundation.d.d dVar) {
        if (cVar != null) {
            cVar.a(dVar);
        }
        a(cVar);
    }

    public static /* synthetic */ void b(b bVar, com.anythink.expressad.foundation.d.d dVar, int i) {
        if (bVar.f17771g.isH5Ready()) {
            bVar.a(dVar, i);
        }
    }

    private void a(com.anythink.expressad.foundation.e.c cVar) {
        if (this.f17781w) {
            return;
        }
        j();
        if (cVar != null) {
            cVar.a();
        }
        this.f17781w = true;
        com.anythink.expressad.advanced.d.b bVar = this.f17769e;
        if (bVar != null) {
            bVar.a(cVar);
        }
    }

    private void a(String str, com.anythink.expressad.foundation.d.d dVar, int i) {
        ATNativeAdvancedView aTNativeAdvancedView = this.f17771g;
        if (aTNativeAdvancedView == null || aTNativeAdvancedView.getAdvancedNativeWebview() == null) {
            return;
        }
        NativeAdvancedJSBridgeImpl nativeAdvancedJSBridgeImpl = new NativeAdvancedJSBridgeImpl(this.f17771g.getContext(), this.f17767c, this.f17766b);
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar);
        nativeAdvancedJSBridgeImpl.setCampaignList(arrayList);
        nativeAdvancedJSBridgeImpl.setAllowSkip(this.f17774p);
        nativeAdvancedJSBridgeImpl.setCountdownS(this.f17775q);
        this.f17771g.setAdvancedNativeJSBridgeImpl(nativeAdvancedJSBridgeImpl);
        System.currentTimeMillis();
        ATNativeAdvancedWebview advancedNativeWebview = this.f17771g.getAdvancedNativeWebview();
        if (advancedNativeWebview == null) {
            a(dVar, "webview is null");
            return;
        }
        if (advancedNativeWebview.isDestroyed()) {
            a(dVar, "webview is destroyed");
            return;
        }
        advancedNativeWebview.setWebViewListener(new AnonymousClass9(dVar, i));
        if (!advancedNativeWebview.isDestroyed()) {
            Handler handler = this.f17764D;
            if (handler != null) {
                handler.post(new AnonymousClass10(advancedNativeWebview, str));
                return;
            }
            return;
        }
        a(new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f18959E), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.anythink.expressad.foundation.d.d dVar, String str) {
        com.anythink.expressad.foundation.e.c cVar = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f18987j);
        cVar.a(str);
        a(cVar, dVar);
    }

    public final String a(String str) {
        if (this.f17773j != null) {
            try {
                com.anythink.expressad.videocommon.b.c a9 = com.anythink.expressad.videocommon.b.e.a().a(this.f17766b, this.f17773j.bh() + this.f17773j.T() + this.f17773j.C());
                if (a9 != null && a9.k() == 5) {
                    String e9 = a9.e();
                    if (new File(e9).exists()) {
                        return e9;
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return str;
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.anythink.expressad.foundation.d.e eVar) {
        ArrayList arrayList;
        ArrayList<com.anythink.expressad.foundation.d.d> arrayList2;
        com.anythink.expressad.foundation.d.d dVar;
        int i;
        com.anythink.expressad.f.c cVar;
        com.anythink.expressad.foundation.d.d dVar2 = null;
        if (eVar == null || eVar.f18680K == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            com.anythink.expressad.foundation.d.d dVar3 = eVar.f18680K.get(0);
            dVar3.l(this.f17766b);
            this.f17761A = eVar.c();
            if (dVar3.P() != 99 && (!TextUtils.isEmpty(dVar3.b()) || !TextUtils.isEmpty(dVar3.c()))) {
                if (v.a(dVar3)) {
                    dVar3.k(v.a(this.f17770f, dVar3.bi()) ? 1 : 2);
                }
                if (l.a(this.f17770f, dVar3)) {
                    arrayList.add(dVar3);
                }
            }
        }
        if (arrayList != null && arrayList.size() > 0) {
            try {
                i = this.f17762B + 1;
                this.f17762B = i;
                cVar = this.f17772h;
            } catch (Exception e9) {
                e9.printStackTrace();
            }
            if (cVar != null) {
                if (i > cVar.t()) {
                }
                arrayList.size();
                dVar = (com.anythink.expressad.foundation.d.d) arrayList.get(0);
                if (!TextUtils.isEmpty(dVar.b()) && (TextUtils.isEmpty(dVar.c()) || !dVar.c().contains("<MBTPLMARK>"))) {
                    dVar.a(false);
                    dVar.b(true);
                } else {
                    dVar.a(true);
                    dVar.b(false);
                }
                this.f17773j = dVar;
                if (!d.a(this.f17771g, dVar)) {
                    a(dVar, 2);
                    return;
                }
                ATNativeAdvancedView aTNativeAdvancedView = this.f17771g;
                if (aTNativeAdvancedView != null) {
                    aTNativeAdvancedView.clearResState();
                }
                if (!TextUtils.isEmpty(dVar.b())) {
                    dVar.b();
                    this.f17783y = new AnonymousClass8(dVar);
                    e eVar2 = new e();
                    eVar2.a(dVar);
                    int i6 = dVar.aD() != null ? dVar.aD().f18531a : 0;
                    String b9 = dVar.b();
                    eVar2.a(i6);
                    eVar2.a();
                    i.a().b(b9, (i.a) this.f17783y);
                }
                if (!TextUtils.isEmpty(dVar.c())) {
                    dVar.c();
                    com.anythink.core.common.v.b.b.a().a(new AnonymousClass7(dVar));
                }
                if (!TextUtils.isEmpty(dVar.T())) {
                    dVar.T();
                    this.f17782x = new AnonymousClass2(dVar);
                    CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                    copyOnWriteArrayList.add(dVar);
                    com.anythink.expressad.videocommon.b.e.a().a(this.f17766b, copyOnWriteArrayList, com.anythink.expressad.foundation.g.a.bb, this.f17782x);
                    if (!com.anythink.expressad.videocommon.b.e.a().a(com.anythink.expressad.foundation.g.a.bb, this.f17766b, dVar.B())) {
                        com.anythink.expressad.videocommon.b.e.a().d(this.f17766b);
                    } else {
                        this.f17771g.setVideoReady(true);
                        a(dVar, 2);
                    }
                }
                if (!TextUtils.isEmpty(dVar.bm())) {
                    dVar.bm();
                    com.anythink.expressad.foundation.g.d.b.a(t.b().g()).a(dVar.bm(), new AnonymousClass6(dVar));
                }
                if (!TextUtils.isEmpty(dVar.J())) {
                    dVar.J();
                    this.f17784z = new AnonymousClass5(dVar);
                    int i9 = dVar.aD() != null ? dVar.aD().f18531a : 0;
                    String J = dVar.J();
                    e eVar3 = new e();
                    eVar3.a(dVar);
                    eVar3.a(i9);
                    i.a().b(J, (i.a) this.f17784z);
                }
                if (TextUtils.isEmpty(dVar.z())) {
                    return;
                }
                dVar.z();
                com.anythink.expressad.foundation.g.d.b.a(t.b().g()).a(dVar.z(), new AnonymousClass4(dVar));
                return;
            }
            this.f17762B = 0;
            arrayList.size();
            dVar = (com.anythink.expressad.foundation.d.d) arrayList.get(0);
            if (!TextUtils.isEmpty(dVar.b())) {
            }
            dVar.a(true);
            dVar.b(false);
            this.f17773j = dVar;
            if (!d.a(this.f17771g, dVar)) {
            }
        } else {
            com.anythink.expressad.foundation.e.c cVar2 = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f18961G);
            if (eVar != null && (arrayList2 = eVar.f18680K) != null && arrayList2.size() != 0) {
                dVar2 = eVar.f18680K.get(0);
            }
            a(cVar2, dVar2);
        }
    }

    public static /* synthetic */ void a(b bVar, String str, com.anythink.expressad.foundation.d.d dVar, int i) {
        ATNativeAdvancedView aTNativeAdvancedView = bVar.f17771g;
        if (aTNativeAdvancedView == null || aTNativeAdvancedView.getAdvancedNativeWebview() == null) {
            return;
        }
        NativeAdvancedJSBridgeImpl nativeAdvancedJSBridgeImpl = new NativeAdvancedJSBridgeImpl(bVar.f17771g.getContext(), bVar.f17767c, bVar.f17766b);
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar);
        nativeAdvancedJSBridgeImpl.setCampaignList(arrayList);
        nativeAdvancedJSBridgeImpl.setAllowSkip(bVar.f17774p);
        nativeAdvancedJSBridgeImpl.setCountdownS(bVar.f17775q);
        bVar.f17771g.setAdvancedNativeJSBridgeImpl(nativeAdvancedJSBridgeImpl);
        System.currentTimeMillis();
        ATNativeAdvancedWebview advancedNativeWebview = bVar.f17771g.getAdvancedNativeWebview();
        if (advancedNativeWebview == null) {
            bVar.a(dVar, "webview is null");
            return;
        }
        if (advancedNativeWebview.isDestroyed()) {
            bVar.a(dVar, "webview is destroyed");
            return;
        }
        advancedNativeWebview.setWebViewListener(bVar.new AnonymousClass9(dVar, i));
        if (!advancedNativeWebview.isDestroyed()) {
            Handler handler = bVar.f17764D;
            if (handler != null) {
                handler.post(bVar.new AnonymousClass10(advancedNativeWebview, str));
                return;
            }
            return;
        }
        bVar.a(new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f18959E), dVar);
    }
}
