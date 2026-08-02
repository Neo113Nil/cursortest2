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
import com.IceFishing.LiveIceFishing.k;
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
    private static String f18542a = "NativeAdvancedLoadManager";

    /* renamed from: k, reason: collision with root package name */
    private static final int f18543k = 1;

    /* renamed from: l, reason: collision with root package name */
    private static final int f18544l = 2;

    /* renamed from: m, reason: collision with root package name */
    private static final int f18545m = 3;

    /* renamed from: n, reason: collision with root package name */
    private static final int f18546n = 4;

    /* renamed from: o, reason: collision with root package name */
    private static final int f18547o = 5;

    /* renamed from: A, reason: collision with root package name */
    private String f18548A;

    /* renamed from: B, reason: collision with root package name */
    private int f18549B;

    /* renamed from: b, reason: collision with root package name */
    private String f18553b;

    /* renamed from: c, reason: collision with root package name */
    private String f18554c;

    /* renamed from: d, reason: collision with root package name */
    private long f18555d;

    /* renamed from: e, reason: collision with root package name */
    private com.anythink.expressad.advanced.d.b f18556e;

    /* renamed from: g, reason: collision with root package name */
    private ATNativeAdvancedView f18558g;

    /* renamed from: h, reason: collision with root package name */
    private com.anythink.expressad.f.c f18559h;
    private List<com.anythink.expressad.foundation.d.d> i;

    /* renamed from: j, reason: collision with root package name */
    private com.anythink.expressad.foundation.d.d f18560j;

    /* renamed from: p, reason: collision with root package name */
    private int f18561p;

    /* renamed from: q, reason: collision with root package name */
    private int f18562q;

    /* renamed from: r, reason: collision with root package name */
    private int f18563r;

    /* renamed from: s, reason: collision with root package name */
    private int f18564s;

    /* renamed from: t, reason: collision with root package name */
    private String f18565t;

    /* renamed from: u, reason: collision with root package name */
    private int f18566u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f18567v;

    /* renamed from: w, reason: collision with root package name */
    private volatile boolean f18568w;

    /* renamed from: x, reason: collision with root package name */
    private com.anythink.expressad.videocommon.d.c f18569x;

    /* renamed from: y, reason: collision with root package name */
    private i.d f18570y;

    /* renamed from: z, reason: collision with root package name */
    private i.d f18571z;

    /* renamed from: C, reason: collision with root package name */
    private String f18550C = "";

    /* renamed from: D, reason: collision with root package name */
    private Handler f18551D = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.advanced.c.b.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object obj;
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                Object obj2 = message.obj;
                int i4 = message.arg1;
                if (obj2 == null || !(obj2 instanceof com.anythink.expressad.foundation.d.d)) {
                    return;
                }
                com.anythink.expressad.foundation.d.d dVar = (com.anythink.expressad.foundation.d.d) obj2;
                b.a(b.this, i.a().b(dVar.b()), dVar, i4);
                return;
            }
            if (i == 2) {
                Object obj3 = message.obj;
                try {
                    if (obj3 instanceof Bundle) {
                        int i6 = ((Bundle) obj3).getInt("type");
                        com.anythink.expressad.foundation.e.c cVar = new com.anythink.expressad.foundation.e.c(i6 == 1 ? com.anythink.expressad.foundation.e.b.f19770e : i6 == 2 ? com.anythink.expressad.foundation.e.b.f19773h : i6 == 3 ? com.anythink.expressad.foundation.e.b.f19772g : com.anythink.expressad.foundation.e.b.f19788x);
                        String string = ((Bundle) obj3).getString(com.anythink.expressad.foundation.g.a.f19880q);
                        com.anythink.expressad.foundation.d.d dVar2 = (com.anythink.expressad.foundation.d.d) ((Bundle) obj3).getSerializable("campaignex");
                        cVar.a(string);
                        cVar.a(dVar2);
                        b bVar = b.this;
                        String unused = bVar.f18565t;
                        int unused2 = b.this.f18566u;
                        bVar.a(cVar, dVar2);
                        return;
                    }
                    return;
                } catch (Exception e9) {
                    com.anythink.expressad.foundation.e.c cVar2 = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19766a);
                    cVar2.a((Throwable) e9);
                    b bVar2 = b.this;
                    String unused3 = bVar2.f18565t;
                    int unused4 = b.this.f18566u;
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
                bVar3.a((com.anythink.expressad.foundation.d.d) obj4, bVar3.f18566u);
                return;
            }
            if (i != 4) {
                if (i == 5 && (obj = message.obj) != null && (obj instanceof com.anythink.expressad.foundation.d.d)) {
                    if (b.this.f18558g != null) {
                        b.this.f18558g.setVideoReady(true);
                    }
                    b bVar4 = b.this;
                    bVar4.a((com.anythink.expressad.foundation.d.d) obj, bVar4.f18566u);
                    return;
                }
                return;
            }
            Object obj5 = message.obj;
            if (obj5 == null || !(obj5 instanceof com.anythink.expressad.foundation.d.d)) {
                return;
            }
            if (b.this.f18558g != null) {
                b.this.f18558g.setEndCardReady(true);
            }
            b bVar5 = b.this;
            bVar5.a((com.anythink.expressad.foundation.d.d) obj5, bVar5.f18566u);
        }
    };

    /* renamed from: E, reason: collision with root package name */
    private Runnable f18552E = new Runnable() { // from class: com.anythink.expressad.advanced.c.b.3
        @Override // java.lang.Runnable
        public final void run() {
            com.anythink.expressad.foundation.e.c cVar = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19775k);
            b bVar = b.this;
            String unused = bVar.f18565t;
            int unused2 = b.this.f18566u;
            bVar.a(cVar, (com.anythink.expressad.foundation.d.d) null);
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private Context f18557f = t.b().g();

    /* renamed from: com.anythink.expressad.advanced.c.b$10, reason: invalid class name */
    public class AnonymousClass10 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ATNativeAdvancedWebview f18573a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f18574b;

        public AnonymousClass10(ATNativeAdvancedWebview aTNativeAdvancedWebview, String str) {
            this.f18573a = aTNativeAdvancedWebview;
            this.f18574b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f18573a.loadUrl(z.d(this.f18574b));
        }
    }

    /* renamed from: com.anythink.expressad.advanced.c.b$7, reason: invalid class name */
    public class AnonymousClass7 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.d f18592a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f18593b = 2;

        public AnonymousClass7(com.anythink.expressad.foundation.d.d dVar) {
            this.f18592a = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            File file;
            final File file2;
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    try {
                        file2 = new File(this.f18592a.c());
                        try {
                            if (!file2.exists()) {
                                String b9 = com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_700_HTML);
                                String a9 = s.a(z.b(this.f18592a.c()));
                                if (TextUtils.isEmpty(a9)) {
                                    a9 = String.valueOf(System.currentTimeMillis());
                                }
                                file = new File(b9, a9.concat(".html"));
                                try {
                                    if (!file.exists()) {
                                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                                        try {
                                            fileOutputStream2.write(("<script>" + com.anythink.core.common.v.z.a().b() + "</script>" + this.f18592a.c()).getBytes());
                                            fileOutputStream2.flush();
                                            fileOutputStream = fileOutputStream2;
                                        } catch (Exception e9) {
                                            e = e9;
                                            fileOutputStream = fileOutputStream2;
                                            e.printStackTrace();
                                            this.f18592a.j("");
                                            if (fileOutputStream != null) {
                                                fileOutputStream.close();
                                            }
                                            file2 = file;
                                            if (!file2.exists()) {
                                            }
                                            String unused = b.f18542a;
                                            com.anythink.expressad.foundation.e.c cVar = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19777m);
                                            b bVar = b.this;
                                            String unused2 = bVar.f18565t;
                                            bVar.a(cVar, this.f18592a);
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
                        com.anythink.expressad.foundation.e.c cVar2 = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19777m);
                        b bVar2 = b.this;
                        String unused4 = bVar2.f18565t;
                        bVar2.a(cVar2, this.f18592a);
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
                this.f18592a.b(file2.getAbsolutePath());
                String unused5 = b.f18542a;
                t.b().b(new Runnable() { // from class: com.anythink.expressad.advanced.c.b.7.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        b bVar3 = b.this;
                        String str = "file:////" + file2.getAbsolutePath();
                        AnonymousClass7 anonymousClass7 = AnonymousClass7.this;
                        b.a(bVar3, str, anonymousClass7.f18592a, anonymousClass7.f18593b);
                    }
                });
            } else {
                String unused6 = b.f18542a;
                com.anythink.expressad.foundation.e.c cVar3 = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19777m);
                b bVar3 = b.this;
                String unused22 = bVar3.f18565t;
                bVar3.a(cVar3, this.f18592a);
            }
        }
    }

    /* renamed from: com.anythink.expressad.advanced.c.b$9, reason: invalid class name */
    public class AnonymousClass9 extends com.anythink.expressad.atsignalcommon.b.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.d f18600a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f18601b;

        public AnonymousClass9(com.anythink.expressad.foundation.d.d dVar, int i) {
            this.f18600a = dVar;
            this.f18601b = i;
        }

        @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!this.f18600a.t()) {
                b.this.f18558g.setH5Ready(true);
                com.anythink.expressad.advanced.a.a.a(this.f18600a.aa());
                b.b(b.this, this.f18600a, this.f18601b);
            }
            NativeAdvancedJsUtils.fireOnJSBridgeConnected(webView);
        }

        @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            b.this.a(this.f18600a, str);
        }

        @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslError.getPrimaryError();
            b.this.a(this.f18600a, "onReceivedSslError:" + sslError.getUrl());
        }

        @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
        public final void readyState(WebView webView, int i) {
            super.readyState(webView, i);
            if (i != 1) {
                b.this.a(this.f18600a, "readyState 2");
                return;
            }
            b.this.f18558g.setH5Ready(true);
            com.anythink.expressad.advanced.a.a.a(this.f18600a.aa());
            b.b(b.this, this.f18600a, this.f18601b);
        }
    }

    public b(String str, String str2) {
        this.f18554c = str;
        this.f18553b = str2;
    }

    private void c(com.anythink.expressad.foundation.d.d dVar) {
        k.m().a(dVar.z(), new AnonymousClass4(dVar));
    }

    private void e(com.anythink.expressad.foundation.d.d dVar) {
        k.m().a(dVar.bm(), new AnonymousClass6(dVar));
    }

    private void f() {
        try {
            int i = this.f18549B + 1;
            this.f18549B = i;
            com.anythink.expressad.f.c cVar = this.f18559h;
            if (cVar != null && i <= cVar.t()) {
                return;
            }
            this.f18549B = 0;
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
        this.f18549B = 0;
    }

    private void j() {
        this.f18551D.removeCallbacks(this.f18552E);
    }

    private static void k() {
    }

    private void b(int i) {
        this.f18562q = i;
    }

    private void g(com.anythink.expressad.foundation.d.d dVar) {
        String str;
        this.f18570y = new AnonymousClass8(dVar);
        e eVar = new e();
        eVar.a(dVar);
        if (dVar != null) {
            r1 = dVar.aD() != null ? dVar.aD().f19318a : 0;
            str = dVar.b();
        } else {
            str = "";
        }
        eVar.a(r1);
        eVar.a();
        i.a().b(str, (i.a) this.f18570y);
    }

    private void h(com.anythink.expressad.foundation.d.d dVar) {
        this.f18569x = new AnonymousClass2(dVar);
        CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(dVar);
        com.anythink.expressad.videocommon.b.e.a().a(this.f18553b, copyOnWriteArrayList, com.anythink.expressad.foundation.g.a.bb, this.f18569x);
        if (!com.anythink.expressad.videocommon.b.e.a().a(com.anythink.expressad.foundation.g.a.bb, this.f18553b, dVar.B())) {
            com.anythink.expressad.videocommon.b.e.a().d(this.f18553b);
        } else {
            this.f18558g.setVideoReady(true);
            a(dVar, 2);
        }
    }

    /* renamed from: com.anythink.expressad.advanced.c.b$4, reason: invalid class name */
    public class AnonymousClass4 implements com.anythink.expressad.foundation.g.d.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.d f18579a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f18580b = 2;

        public AnonymousClass4(com.anythink.expressad.foundation.d.d dVar) {
            this.f18579a = dVar;
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(Bitmap bitmap, String str) {
            String unused = b.f18542a;
            if (b.this.f18551D != null) {
                b.this.f18551D.post(new Runnable() { // from class: com.anythink.expressad.advanced.c.b.4.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                        b.this.a(anonymousClass4.f18579a, anonymousClass4.f18580b);
                    }
                });
            }
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(String str, String str2) {
            String unused = b.f18542a;
            if (b.this.f18551D != null) {
                b.this.f18551D.post(new Runnable() { // from class: com.anythink.expressad.advanced.c.b.4.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                        b.this.a(anonymousClass4.f18579a, anonymousClass4.f18580b);
                    }
                });
            }
        }
    }

    /* renamed from: com.anythink.expressad.advanced.c.b$6, reason: invalid class name */
    public class AnonymousClass6 implements com.anythink.expressad.foundation.g.d.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.d f18587a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f18588b = 2;

        public AnonymousClass6(com.anythink.expressad.foundation.d.d dVar) {
            this.f18587a = dVar;
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(Bitmap bitmap, String str) {
            String unused = b.f18542a;
            if (b.this.f18551D != null) {
                b.this.f18551D.post(new Runnable() { // from class: com.anythink.expressad.advanced.c.b.6.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                        b.this.a(anonymousClass6.f18587a, anonymousClass6.f18588b);
                    }
                });
            }
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(String str, String str2) {
            String unused = b.f18542a;
            if (b.this.f18551D != null) {
                b.this.f18551D.post(new Runnable() { // from class: com.anythink.expressad.advanced.c.b.6.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                        b.this.a(anonymousClass6.f18587a, anonymousClass6.f18588b);
                    }
                });
            }
        }
    }

    private void d(com.anythink.expressad.foundation.d.d dVar) {
        String str;
        this.f18571z = new AnonymousClass5(dVar);
        if (dVar != null) {
            r0 = dVar.aD() != null ? dVar.aD().f19318a : 0;
            str = dVar.J();
        } else {
            str = "";
        }
        e eVar = new e();
        eVar.a(dVar);
        eVar.a(r0);
        i.a().b(str, (i.a) this.f18571z);
    }

    public final void b() {
        if (this.f18556e != null) {
            this.f18556e = null;
        }
        if (this.f18569x != null) {
            this.f18569x = null;
        }
        if (this.f18570y != null) {
            this.f18570y = null;
        }
    }

    /* renamed from: com.anythink.expressad.advanced.c.b$2, reason: invalid class name */
    public class AnonymousClass2 implements com.anythink.expressad.videocommon.d.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.d f18576a;

        public AnonymousClass2(com.anythink.expressad.foundation.d.d dVar) {
            this.f18576a = dVar;
        }

        @Override // com.anythink.expressad.videocommon.d.c
        public final void a(String str) {
            String unused = b.f18542a;
            Message obtain = Message.obtain();
            obtain.obj = this.f18576a;
            obtain.what = 5;
            b.this.f18551D.sendMessage(obtain);
        }

        @Override // com.anythink.expressad.videocommon.d.c
        public final void a(String str, String str2) {
            String unused = b.f18542a;
            Message obtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f18576a);
            bundle.putString(com.anythink.expressad.foundation.g.a.f19880q, str);
            bundle.putInt("type", 1);
            obtain.obj = bundle;
            obtain.what = 2;
            b.this.f18551D.sendMessage(obtain);
        }
    }

    private void f(com.anythink.expressad.foundation.d.d dVar) {
        com.anythink.core.common.v.b.b.a().a(new AnonymousClass7(dVar));
    }

    public final void a(com.anythink.expressad.f.c cVar) {
        this.f18559h = cVar;
    }

    /* renamed from: com.anythink.expressad.advanced.c.b$8, reason: invalid class name */
    public class AnonymousClass8 implements i.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.d f18597a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f18598b = 2;

        public AnonymousClass8(com.anythink.expressad.foundation.d.d dVar) {
            this.f18597a = dVar;
        }

        @Override // com.anythink.expressad.videocommon.b.i.a
        public final void a(String str) {
            String unused = b.f18542a;
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = this.f18597a;
            obtain.arg1 = this.f18598b;
            b.this.f18551D.sendMessage(obtain);
        }

        @Override // com.anythink.expressad.videocommon.b.i.a
        public final void a(String str, String str2) {
            String unused = b.f18542a;
            Message obtain = Message.obtain();
            obtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f18597a);
            bundle.putString(com.anythink.expressad.foundation.g.a.f19880q, str);
            bundle.putInt("type", 3);
            obtain.obj = bundle;
            b.this.f18551D.sendMessage(obtain);
        }
    }

    private int e() {
        return this.f18562q;
    }

    public final void a(ATNativeAdvancedView aTNativeAdvancedView) {
        this.f18558g = aTNativeAdvancedView;
    }

    /* renamed from: com.anythink.expressad.advanced.c.b$5, reason: invalid class name */
    public class AnonymousClass5 implements i.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.d f18584a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f18585b = 2;

        public AnonymousClass5(com.anythink.expressad.foundation.d.d dVar) {
            this.f18584a = dVar;
        }

        @Override // com.anythink.expressad.videocommon.b.i.a
        public final void a(String str) {
            String unused = b.f18542a;
            if (b.this.f18551D != null) {
                Message obtain = Message.obtain();
                obtain.what = 4;
                obtain.obj = this.f18584a;
                obtain.arg1 = this.f18585b;
                b.this.f18551D.sendMessage(obtain);
            }
        }

        @Override // com.anythink.expressad.videocommon.b.i.a
        public final void a(String str, String str2) {
            String unused = b.f18542a;
            if (b.this.f18558g != null) {
                b.this.f18558g.setEndCardReady(false);
            }
            Message obtain = Message.obtain();
            obtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f18584a);
            bundle.putString(com.anythink.expressad.foundation.g.a.f19880q, str);
            bundle.putInt("type", 2);
            obtain.obj = bundle;
            b.this.f18551D.sendMessage(obtain);
        }
    }

    public final void a(int i) {
        this.f18561p = i;
    }

    public final com.anythink.expressad.foundation.d.d c() {
        return this.f18560j;
    }

    public final void a(int i, int i4) {
        this.f18564s = i;
        this.f18563r = i4;
    }

    private void b(com.anythink.expressad.foundation.d.d dVar) {
        ATNativeAdvancedView aTNativeAdvancedView = this.f18558g;
        if (aTNativeAdvancedView != null) {
            aTNativeAdvancedView.clearResState();
        }
        if (!TextUtils.isEmpty(dVar.b())) {
            dVar.b();
            this.f18570y = new AnonymousClass8(dVar);
            e eVar = new e();
            eVar.a(dVar);
            int i = dVar.aD() != null ? dVar.aD().f19318a : 0;
            String b9 = dVar.b();
            eVar.a(i);
            eVar.a();
            i.a().b(b9, (i.a) this.f18570y);
        }
        if (!TextUtils.isEmpty(dVar.c())) {
            dVar.c();
            com.anythink.core.common.v.b.b.a().a(new AnonymousClass7(dVar));
        }
        if (!TextUtils.isEmpty(dVar.T())) {
            dVar.T();
            this.f18569x = new AnonymousClass2(dVar);
            CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            copyOnWriteArrayList.add(dVar);
            com.anythink.expressad.videocommon.b.e.a().a(this.f18553b, copyOnWriteArrayList, com.anythink.expressad.foundation.g.a.bb, this.f18569x);
            if (!com.anythink.expressad.videocommon.b.e.a().a(com.anythink.expressad.foundation.g.a.bb, this.f18553b, dVar.B())) {
                com.anythink.expressad.videocommon.b.e.a().d(this.f18553b);
            } else {
                this.f18558g.setVideoReady(true);
                a(dVar, 2);
            }
        }
        if (!TextUtils.isEmpty(dVar.bm())) {
            dVar.bm();
            com.anythink.expressad.foundation.g.d.b.a(t.b().g()).a(dVar.bm(), new AnonymousClass6(dVar));
        }
        if (!TextUtils.isEmpty(dVar.J())) {
            dVar.J();
            this.f18571z = new AnonymousClass5(dVar);
            int i4 = dVar.aD() != null ? dVar.aD().f19318a : 0;
            String J = dVar.J();
            e eVar2 = new e();
            eVar2.a(dVar);
            eVar2.a(i4);
            i.a().b(J, (i.a) this.f18571z);
        }
        if (TextUtils.isEmpty(dVar.z())) {
            return;
        }
        dVar.z();
        com.anythink.expressad.foundation.g.d.b.a(t.b().g()).a(dVar.z(), new AnonymousClass4(dVar));
    }

    private void a(long j6) {
        this.f18551D.postDelayed(this.f18552E, j6);
    }

    public final String a() {
        return this.f18550C;
    }

    public final void a(com.anythink.expressad.advanced.d.b bVar) {
        this.f18556e = bVar;
    }

    private void a(com.anythink.expressad.foundation.d.d dVar) {
        this.f18560j = dVar;
        if (d.a(this.f18558g, dVar)) {
            a(dVar, 2);
            return;
        }
        ATNativeAdvancedView aTNativeAdvancedView = this.f18558g;
        if (aTNativeAdvancedView != null) {
            aTNativeAdvancedView.clearResState();
        }
        if (!TextUtils.isEmpty(dVar.b())) {
            dVar.b();
            this.f18570y = new AnonymousClass8(dVar);
            e eVar = new e();
            eVar.a(dVar);
            int i = dVar.aD() != null ? dVar.aD().f19318a : 0;
            String b9 = dVar.b();
            eVar.a(i);
            eVar.a();
            i.a().b(b9, (i.a) this.f18570y);
        }
        if (!TextUtils.isEmpty(dVar.c())) {
            dVar.c();
            com.anythink.core.common.v.b.b.a().a(new AnonymousClass7(dVar));
        }
        if (!TextUtils.isEmpty(dVar.T())) {
            dVar.T();
            this.f18569x = new AnonymousClass2(dVar);
            CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            copyOnWriteArrayList.add(dVar);
            com.anythink.expressad.videocommon.b.e.a().a(this.f18553b, copyOnWriteArrayList, com.anythink.expressad.foundation.g.a.bb, this.f18569x);
            if (!com.anythink.expressad.videocommon.b.e.a().a(com.anythink.expressad.foundation.g.a.bb, this.f18553b, dVar.B())) {
                com.anythink.expressad.videocommon.b.e.a().d(this.f18553b);
            } else {
                this.f18558g.setVideoReady(true);
                a(dVar, 2);
            }
        }
        if (!TextUtils.isEmpty(dVar.bm())) {
            dVar.bm();
            com.anythink.expressad.foundation.g.d.b.a(t.b().g()).a(dVar.bm(), new AnonymousClass6(dVar));
        }
        if (!TextUtils.isEmpty(dVar.J())) {
            dVar.J();
            this.f18571z = new AnonymousClass5(dVar);
            int i4 = dVar.aD() != null ? dVar.aD().f19318a : 0;
            String J = dVar.J();
            e eVar2 = new e();
            eVar2.a(dVar);
            eVar2.a(i4);
            i.a().b(J, (i.a) this.f18571z);
        }
        if (TextUtils.isEmpty(dVar.z())) {
            return;
        }
        dVar.z();
        com.anythink.expressad.foundation.g.d.b.a(t.b().g()).a(dVar.z(), new AnonymousClass4(dVar));
    }

    private void b(com.anythink.expressad.foundation.d.d dVar, int i) {
        if (this.f18558g.isH5Ready()) {
            a(dVar, i);
        }
    }

    private List<com.anythink.expressad.foundation.d.d> b(com.anythink.expressad.foundation.d.e eVar) {
        if (eVar == null || eVar.f19467K == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        com.anythink.expressad.foundation.d.d dVar = eVar.f19467K.get(0);
        dVar.l(this.f18553b);
        this.f18548A = eVar.c();
        if (dVar.P() != 99 && (!TextUtils.isEmpty(dVar.b()) || !TextUtils.isEmpty(dVar.c()))) {
            if (v.a(dVar)) {
                dVar.k(v.a(this.f18557f, dVar.bi()) ? 1 : 2);
            }
            if (l.a(this.f18557f, dVar)) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.anythink.expressad.foundation.d.d dVar, int i) {
        if (!d.a(this.f18558g, dVar) || this.f18568w) {
            return;
        }
        j();
        this.f18568w = true;
        com.anythink.expressad.advanced.d.b bVar = this.f18556e;
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
        if (bVar.f18558g.isH5Ready()) {
            bVar.a(dVar, i);
        }
    }

    private void a(com.anythink.expressad.foundation.e.c cVar) {
        if (this.f18568w) {
            return;
        }
        j();
        if (cVar != null) {
            cVar.a();
        }
        this.f18568w = true;
        com.anythink.expressad.advanced.d.b bVar = this.f18556e;
        if (bVar != null) {
            bVar.a(cVar);
        }
    }

    private void a(String str, com.anythink.expressad.foundation.d.d dVar, int i) {
        ATNativeAdvancedView aTNativeAdvancedView = this.f18558g;
        if (aTNativeAdvancedView == null || aTNativeAdvancedView.getAdvancedNativeWebview() == null) {
            return;
        }
        NativeAdvancedJSBridgeImpl nativeAdvancedJSBridgeImpl = new NativeAdvancedJSBridgeImpl(this.f18558g.getContext(), this.f18554c, this.f18553b);
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar);
        nativeAdvancedJSBridgeImpl.setCampaignList(arrayList);
        nativeAdvancedJSBridgeImpl.setAllowSkip(this.f18561p);
        nativeAdvancedJSBridgeImpl.setCountdownS(this.f18562q);
        this.f18558g.setAdvancedNativeJSBridgeImpl(nativeAdvancedJSBridgeImpl);
        System.currentTimeMillis();
        ATNativeAdvancedWebview advancedNativeWebview = this.f18558g.getAdvancedNativeWebview();
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
            Handler handler = this.f18551D;
            if (handler != null) {
                handler.post(new AnonymousClass10(advancedNativeWebview, str));
                return;
            }
            return;
        }
        a(new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19746E), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.anythink.expressad.foundation.d.d dVar, String str) {
        com.anythink.expressad.foundation.e.c cVar = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19774j);
        cVar.a(str);
        a(cVar, dVar);
    }

    public final String a(String str) {
        if (this.f18560j != null) {
            try {
                com.anythink.expressad.videocommon.b.c a9 = com.anythink.expressad.videocommon.b.e.a().a(this.f18553b, this.f18560j.bh() + this.f18560j.T() + this.f18560j.C());
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
        if (eVar == null || eVar.f19467K == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            com.anythink.expressad.foundation.d.d dVar3 = eVar.f19467K.get(0);
            dVar3.l(this.f18553b);
            this.f18548A = eVar.c();
            if (dVar3.P() != 99 && (!TextUtils.isEmpty(dVar3.b()) || !TextUtils.isEmpty(dVar3.c()))) {
                if (v.a(dVar3)) {
                    dVar3.k(v.a(this.f18557f, dVar3.bi()) ? 1 : 2);
                }
                if (l.a(this.f18557f, dVar3)) {
                    arrayList.add(dVar3);
                }
            }
        }
        if (arrayList != null && arrayList.size() > 0) {
            try {
                i = this.f18549B + 1;
                this.f18549B = i;
                cVar = this.f18559h;
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
                this.f18560j = dVar;
                if (!d.a(this.f18558g, dVar)) {
                    a(dVar, 2);
                    return;
                }
                ATNativeAdvancedView aTNativeAdvancedView = this.f18558g;
                if (aTNativeAdvancedView != null) {
                    aTNativeAdvancedView.clearResState();
                }
                if (!TextUtils.isEmpty(dVar.b())) {
                    dVar.b();
                    this.f18570y = new AnonymousClass8(dVar);
                    e eVar2 = new e();
                    eVar2.a(dVar);
                    int i4 = dVar.aD() != null ? dVar.aD().f19318a : 0;
                    String b9 = dVar.b();
                    eVar2.a(i4);
                    eVar2.a();
                    i.a().b(b9, (i.a) this.f18570y);
                }
                if (!TextUtils.isEmpty(dVar.c())) {
                    dVar.c();
                    com.anythink.core.common.v.b.b.a().a(new AnonymousClass7(dVar));
                }
                if (!TextUtils.isEmpty(dVar.T())) {
                    dVar.T();
                    this.f18569x = new AnonymousClass2(dVar);
                    CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                    copyOnWriteArrayList.add(dVar);
                    com.anythink.expressad.videocommon.b.e.a().a(this.f18553b, copyOnWriteArrayList, com.anythink.expressad.foundation.g.a.bb, this.f18569x);
                    if (!com.anythink.expressad.videocommon.b.e.a().a(com.anythink.expressad.foundation.g.a.bb, this.f18553b, dVar.B())) {
                        com.anythink.expressad.videocommon.b.e.a().d(this.f18553b);
                    } else {
                        this.f18558g.setVideoReady(true);
                        a(dVar, 2);
                    }
                }
                if (!TextUtils.isEmpty(dVar.bm())) {
                    dVar.bm();
                    com.anythink.expressad.foundation.g.d.b.a(t.b().g()).a(dVar.bm(), new AnonymousClass6(dVar));
                }
                if (!TextUtils.isEmpty(dVar.J())) {
                    dVar.J();
                    this.f18571z = new AnonymousClass5(dVar);
                    int i6 = dVar.aD() != null ? dVar.aD().f19318a : 0;
                    String J = dVar.J();
                    e eVar3 = new e();
                    eVar3.a(dVar);
                    eVar3.a(i6);
                    i.a().b(J, (i.a) this.f18571z);
                }
                if (TextUtils.isEmpty(dVar.z())) {
                    return;
                }
                dVar.z();
                com.anythink.expressad.foundation.g.d.b.a(t.b().g()).a(dVar.z(), new AnonymousClass4(dVar));
                return;
            }
            this.f18549B = 0;
            arrayList.size();
            dVar = (com.anythink.expressad.foundation.d.d) arrayList.get(0);
            if (!TextUtils.isEmpty(dVar.b())) {
            }
            dVar.a(true);
            dVar.b(false);
            this.f18560j = dVar;
            if (!d.a(this.f18558g, dVar)) {
            }
        } else {
            com.anythink.expressad.foundation.e.c cVar2 = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19748G);
            if (eVar != null && (arrayList2 = eVar.f19467K) != null && arrayList2.size() != 0) {
                dVar2 = eVar.f19467K.get(0);
            }
            a(cVar2, dVar2);
        }
    }

    public static /* synthetic */ void a(b bVar, String str, com.anythink.expressad.foundation.d.d dVar, int i) {
        ATNativeAdvancedView aTNativeAdvancedView = bVar.f18558g;
        if (aTNativeAdvancedView == null || aTNativeAdvancedView.getAdvancedNativeWebview() == null) {
            return;
        }
        NativeAdvancedJSBridgeImpl nativeAdvancedJSBridgeImpl = new NativeAdvancedJSBridgeImpl(bVar.f18558g.getContext(), bVar.f18554c, bVar.f18553b);
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar);
        nativeAdvancedJSBridgeImpl.setCampaignList(arrayList);
        nativeAdvancedJSBridgeImpl.setAllowSkip(bVar.f18561p);
        nativeAdvancedJSBridgeImpl.setCountdownS(bVar.f18562q);
        bVar.f18558g.setAdvancedNativeJSBridgeImpl(nativeAdvancedJSBridgeImpl);
        System.currentTimeMillis();
        ATNativeAdvancedWebview advancedNativeWebview = bVar.f18558g.getAdvancedNativeWebview();
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
            Handler handler = bVar.f18551D;
            if (handler != null) {
                handler.post(bVar.new AnonymousClass10(advancedNativeWebview, str));
                return;
            }
            return;
        }
        bVar.a(new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19746E), dVar);
    }
}
