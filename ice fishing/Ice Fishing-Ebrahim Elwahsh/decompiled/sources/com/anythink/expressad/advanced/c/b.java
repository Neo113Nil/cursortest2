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
    private static String f17913a = "NativeAdvancedLoadManager";

    /* renamed from: k, reason: collision with root package name */
    private static final int f17914k = 1;

    /* renamed from: l, reason: collision with root package name */
    private static final int f17915l = 2;

    /* renamed from: m, reason: collision with root package name */
    private static final int f17916m = 3;

    /* renamed from: n, reason: collision with root package name */
    private static final int f17917n = 4;

    /* renamed from: o, reason: collision with root package name */
    private static final int f17918o = 5;

    /* renamed from: A, reason: collision with root package name */
    private String f17919A;

    /* renamed from: B, reason: collision with root package name */
    private int f17920B;

    /* renamed from: b, reason: collision with root package name */
    private String f17924b;

    /* renamed from: c, reason: collision with root package name */
    private String f17925c;

    /* renamed from: d, reason: collision with root package name */
    private long f17926d;

    /* renamed from: e, reason: collision with root package name */
    private com.anythink.expressad.advanced.d.b f17927e;

    /* renamed from: g, reason: collision with root package name */
    private ATNativeAdvancedView f17929g;

    /* renamed from: h, reason: collision with root package name */
    private com.anythink.expressad.f.c f17930h;
    private List<com.anythink.expressad.foundation.d.d> i;

    /* renamed from: j, reason: collision with root package name */
    private com.anythink.expressad.foundation.d.d f17931j;

    /* renamed from: p, reason: collision with root package name */
    private int f17932p;

    /* renamed from: q, reason: collision with root package name */
    private int f17933q;

    /* renamed from: r, reason: collision with root package name */
    private int f17934r;

    /* renamed from: s, reason: collision with root package name */
    private int f17935s;

    /* renamed from: t, reason: collision with root package name */
    private String f17936t;

    /* renamed from: u, reason: collision with root package name */
    private int f17937u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f17938v;

    /* renamed from: w, reason: collision with root package name */
    private volatile boolean f17939w;

    /* renamed from: x, reason: collision with root package name */
    private com.anythink.expressad.videocommon.d.c f17940x;

    /* renamed from: y, reason: collision with root package name */
    private i.d f17941y;

    /* renamed from: z, reason: collision with root package name */
    private i.d f17942z;

    /* renamed from: C, reason: collision with root package name */
    private String f17921C = "";

    /* renamed from: D, reason: collision with root package name */
    private Handler f17922D = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.advanced.c.b.1
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
                        int i9 = ((Bundle) obj3).getInt("type");
                        com.anythink.expressad.foundation.e.c cVar = new com.anythink.expressad.foundation.e.c(i9 == 1 ? com.anythink.expressad.foundation.e.b.f19141e : i9 == 2 ? com.anythink.expressad.foundation.e.b.f19144h : i9 == 3 ? com.anythink.expressad.foundation.e.b.f19143g : com.anythink.expressad.foundation.e.b.f19159x);
                        String string = ((Bundle) obj3).getString(com.anythink.expressad.foundation.g.a.f19251q);
                        com.anythink.expressad.foundation.d.d dVar2 = (com.anythink.expressad.foundation.d.d) ((Bundle) obj3).getSerializable("campaignex");
                        cVar.a(string);
                        cVar.a(dVar2);
                        b bVar = b.this;
                        String unused = bVar.f17936t;
                        int unused2 = b.this.f17937u;
                        bVar.a(cVar, dVar2);
                        return;
                    }
                    return;
                } catch (Exception e6) {
                    com.anythink.expressad.foundation.e.c cVar2 = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19137a);
                    cVar2.a((Throwable) e6);
                    b bVar2 = b.this;
                    String unused3 = bVar2.f17936t;
                    int unused4 = b.this.f17937u;
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
                bVar3.a((com.anythink.expressad.foundation.d.d) obj4, bVar3.f17937u);
                return;
            }
            if (i != 4) {
                if (i == 5 && (obj = message.obj) != null && (obj instanceof com.anythink.expressad.foundation.d.d)) {
                    if (b.this.f17929g != null) {
                        b.this.f17929g.setVideoReady(true);
                    }
                    b bVar4 = b.this;
                    bVar4.a((com.anythink.expressad.foundation.d.d) obj, bVar4.f17937u);
                    return;
                }
                return;
            }
            Object obj5 = message.obj;
            if (obj5 == null || !(obj5 instanceof com.anythink.expressad.foundation.d.d)) {
                return;
            }
            if (b.this.f17929g != null) {
                b.this.f17929g.setEndCardReady(true);
            }
            b bVar5 = b.this;
            bVar5.a((com.anythink.expressad.foundation.d.d) obj5, bVar5.f17937u);
        }
    };

    /* renamed from: E, reason: collision with root package name */
    private Runnable f17923E = new Runnable() { // from class: com.anythink.expressad.advanced.c.b.3
        @Override // java.lang.Runnable
        public final void run() {
            com.anythink.expressad.foundation.e.c cVar = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19146k);
            b bVar = b.this;
            String unused = bVar.f17936t;
            int unused2 = b.this.f17937u;
            bVar.a(cVar, (com.anythink.expressad.foundation.d.d) null);
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private Context f17928f = t.b().g();

    /* renamed from: com.anythink.expressad.advanced.c.b$10, reason: invalid class name */
    public class AnonymousClass10 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ATNativeAdvancedWebview f17944a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f17945b;

        public AnonymousClass10(ATNativeAdvancedWebview aTNativeAdvancedWebview, String str) {
            this.f17944a = aTNativeAdvancedWebview;
            this.f17945b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f17944a.loadUrl(z.d(this.f17945b));
        }
    }

    /* renamed from: com.anythink.expressad.advanced.c.b$7, reason: invalid class name */
    public class AnonymousClass7 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.d f17963a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f17964b = 2;

        public AnonymousClass7(com.anythink.expressad.foundation.d.d dVar) {
            this.f17963a = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            File file;
            final File file2;
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    try {
                        file2 = new File(this.f17963a.c());
                        try {
                            if (!file2.exists()) {
                                String b9 = com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_700_HTML);
                                String a9 = s.a(z.b(this.f17963a.c()));
                                if (TextUtils.isEmpty(a9)) {
                                    a9 = String.valueOf(System.currentTimeMillis());
                                }
                                file = new File(b9, a9.concat(".html"));
                                try {
                                    if (!file.exists()) {
                                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                                        try {
                                            fileOutputStream2.write(("<script>" + com.anythink.core.common.v.z.a().b() + "</script>" + this.f17963a.c()).getBytes());
                                            fileOutputStream2.flush();
                                            fileOutputStream = fileOutputStream2;
                                        } catch (Exception e6) {
                                            e = e6;
                                            fileOutputStream = fileOutputStream2;
                                            e.printStackTrace();
                                            this.f17963a.j("");
                                            if (fileOutputStream != null) {
                                                fileOutputStream.close();
                                            }
                                            file2 = file;
                                            if (!file2.exists()) {
                                            }
                                            String unused = b.f17913a;
                                            com.anythink.expressad.foundation.e.c cVar = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19148m);
                                            b bVar = b.this;
                                            String unused2 = bVar.f17936t;
                                            bVar.a(cVar, this.f17963a);
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
                                } catch (Exception e9) {
                                    e = e9;
                                }
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                        } catch (Exception e10) {
                            e = e10;
                            file = file2;
                        }
                    } catch (Exception unused3) {
                        com.anythink.expressad.foundation.e.c cVar2 = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19148m);
                        b bVar2 = b.this;
                        String unused4 = bVar2.f17936t;
                        bVar2.a(cVar2, this.f17963a);
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e11) {
                e = e11;
                file = null;
            }
            if (!file2.exists() && file2.isFile() && file2.canRead()) {
                this.f17963a.b(file2.getAbsolutePath());
                String unused5 = b.f17913a;
                t.b().b(new Runnable() { // from class: com.anythink.expressad.advanced.c.b.7.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        b bVar3 = b.this;
                        String str = "file:////" + file2.getAbsolutePath();
                        AnonymousClass7 anonymousClass7 = AnonymousClass7.this;
                        b.a(bVar3, str, anonymousClass7.f17963a, anonymousClass7.f17964b);
                    }
                });
            } else {
                String unused6 = b.f17913a;
                com.anythink.expressad.foundation.e.c cVar3 = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19148m);
                b bVar3 = b.this;
                String unused22 = bVar3.f17936t;
                bVar3.a(cVar3, this.f17963a);
            }
        }
    }

    /* renamed from: com.anythink.expressad.advanced.c.b$9, reason: invalid class name */
    public class AnonymousClass9 extends com.anythink.expressad.atsignalcommon.b.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.d f17971a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f17972b;

        public AnonymousClass9(com.anythink.expressad.foundation.d.d dVar, int i) {
            this.f17971a = dVar;
            this.f17972b = i;
        }

        @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!this.f17971a.t()) {
                b.this.f17929g.setH5Ready(true);
                com.anythink.expressad.advanced.a.a.a(this.f17971a.aa());
                b.b(b.this, this.f17971a, this.f17972b);
            }
            NativeAdvancedJsUtils.fireOnJSBridgeConnected(webView);
        }

        @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            b.this.a(this.f17971a, str);
        }

        @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslError.getPrimaryError();
            b.this.a(this.f17971a, "onReceivedSslError:" + sslError.getUrl());
        }

        @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
        public final void readyState(WebView webView, int i) {
            super.readyState(webView, i);
            if (i != 1) {
                b.this.a(this.f17971a, "readyState 2");
                return;
            }
            b.this.f17929g.setH5Ready(true);
            com.anythink.expressad.advanced.a.a.a(this.f17971a.aa());
            b.b(b.this, this.f17971a, this.f17972b);
        }
    }

    public b(String str, String str2) {
        this.f17925c = str;
        this.f17924b = str2;
    }

    private void c(com.anythink.expressad.foundation.d.d dVar) {
        com.anythink.basead.b.c.i.m().a(dVar.z(), new AnonymousClass4(dVar));
    }

    private void e(com.anythink.expressad.foundation.d.d dVar) {
        com.anythink.basead.b.c.i.m().a(dVar.bm(), new AnonymousClass6(dVar));
    }

    private void f() {
        try {
            int i = this.f17920B + 1;
            this.f17920B = i;
            com.anythink.expressad.f.c cVar = this.f17930h;
            if (cVar != null && i <= cVar.t()) {
                return;
            }
            this.f17920B = 0;
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    private String g() {
        return l.a(this.i);
    }

    private static void h() {
    }

    private void i() {
        this.f17920B = 0;
    }

    private void j() {
        this.f17922D.removeCallbacks(this.f17923E);
    }

    private static void k() {
    }

    private void b(int i) {
        this.f17933q = i;
    }

    private void g(com.anythink.expressad.foundation.d.d dVar) {
        String str;
        this.f17941y = new AnonymousClass8(dVar);
        e eVar = new e();
        eVar.a(dVar);
        if (dVar != null) {
            r1 = dVar.aD() != null ? dVar.aD().f18689a : 0;
            str = dVar.b();
        } else {
            str = "";
        }
        eVar.a(r1);
        eVar.a();
        i.a().b(str, (i.a) this.f17941y);
    }

    private void h(com.anythink.expressad.foundation.d.d dVar) {
        this.f17940x = new AnonymousClass2(dVar);
        CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(dVar);
        com.anythink.expressad.videocommon.b.e.a().a(this.f17924b, copyOnWriteArrayList, com.anythink.expressad.foundation.g.a.bb, this.f17940x);
        if (!com.anythink.expressad.videocommon.b.e.a().a(com.anythink.expressad.foundation.g.a.bb, this.f17924b, dVar.B())) {
            com.anythink.expressad.videocommon.b.e.a().d(this.f17924b);
        } else {
            this.f17929g.setVideoReady(true);
            a(dVar, 2);
        }
    }

    /* renamed from: com.anythink.expressad.advanced.c.b$4, reason: invalid class name */
    public class AnonymousClass4 implements com.anythink.expressad.foundation.g.d.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.d f17950a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f17951b = 2;

        public AnonymousClass4(com.anythink.expressad.foundation.d.d dVar) {
            this.f17950a = dVar;
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(Bitmap bitmap, String str) {
            String unused = b.f17913a;
            if (b.this.f17922D != null) {
                b.this.f17922D.post(new Runnable() { // from class: com.anythink.expressad.advanced.c.b.4.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                        b.this.a(anonymousClass4.f17950a, anonymousClass4.f17951b);
                    }
                });
            }
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(String str, String str2) {
            String unused = b.f17913a;
            if (b.this.f17922D != null) {
                b.this.f17922D.post(new Runnable() { // from class: com.anythink.expressad.advanced.c.b.4.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                        b.this.a(anonymousClass4.f17950a, anonymousClass4.f17951b);
                    }
                });
            }
        }
    }

    /* renamed from: com.anythink.expressad.advanced.c.b$6, reason: invalid class name */
    public class AnonymousClass6 implements com.anythink.expressad.foundation.g.d.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.d f17958a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f17959b = 2;

        public AnonymousClass6(com.anythink.expressad.foundation.d.d dVar) {
            this.f17958a = dVar;
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(Bitmap bitmap, String str) {
            String unused = b.f17913a;
            if (b.this.f17922D != null) {
                b.this.f17922D.post(new Runnable() { // from class: com.anythink.expressad.advanced.c.b.6.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                        b.this.a(anonymousClass6.f17958a, anonymousClass6.f17959b);
                    }
                });
            }
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(String str, String str2) {
            String unused = b.f17913a;
            if (b.this.f17922D != null) {
                b.this.f17922D.post(new Runnable() { // from class: com.anythink.expressad.advanced.c.b.6.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                        b.this.a(anonymousClass6.f17958a, anonymousClass6.f17959b);
                    }
                });
            }
        }
    }

    private void d(com.anythink.expressad.foundation.d.d dVar) {
        String str;
        this.f17942z = new AnonymousClass5(dVar);
        if (dVar != null) {
            r0 = dVar.aD() != null ? dVar.aD().f18689a : 0;
            str = dVar.J();
        } else {
            str = "";
        }
        e eVar = new e();
        eVar.a(dVar);
        eVar.a(r0);
        i.a().b(str, (i.a) this.f17942z);
    }

    public final void b() {
        if (this.f17927e != null) {
            this.f17927e = null;
        }
        if (this.f17940x != null) {
            this.f17940x = null;
        }
        if (this.f17941y != null) {
            this.f17941y = null;
        }
    }

    /* renamed from: com.anythink.expressad.advanced.c.b$2, reason: invalid class name */
    public class AnonymousClass2 implements com.anythink.expressad.videocommon.d.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.d f17947a;

        public AnonymousClass2(com.anythink.expressad.foundation.d.d dVar) {
            this.f17947a = dVar;
        }

        @Override // com.anythink.expressad.videocommon.d.c
        public final void a(String str) {
            String unused = b.f17913a;
            Message obtain = Message.obtain();
            obtain.obj = this.f17947a;
            obtain.what = 5;
            b.this.f17922D.sendMessage(obtain);
        }

        @Override // com.anythink.expressad.videocommon.d.c
        public final void a(String str, String str2) {
            String unused = b.f17913a;
            Message obtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f17947a);
            bundle.putString(com.anythink.expressad.foundation.g.a.f19251q, str);
            bundle.putInt("type", 1);
            obtain.obj = bundle;
            obtain.what = 2;
            b.this.f17922D.sendMessage(obtain);
        }
    }

    private void f(com.anythink.expressad.foundation.d.d dVar) {
        com.anythink.core.common.v.b.b.a().a(new AnonymousClass7(dVar));
    }

    public final void a(com.anythink.expressad.f.c cVar) {
        this.f17930h = cVar;
    }

    /* renamed from: com.anythink.expressad.advanced.c.b$8, reason: invalid class name */
    public class AnonymousClass8 implements i.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.d f17968a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f17969b = 2;

        public AnonymousClass8(com.anythink.expressad.foundation.d.d dVar) {
            this.f17968a = dVar;
        }

        @Override // com.anythink.expressad.videocommon.b.i.a
        public final void a(String str) {
            String unused = b.f17913a;
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = this.f17968a;
            obtain.arg1 = this.f17969b;
            b.this.f17922D.sendMessage(obtain);
        }

        @Override // com.anythink.expressad.videocommon.b.i.a
        public final void a(String str, String str2) {
            String unused = b.f17913a;
            Message obtain = Message.obtain();
            obtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f17968a);
            bundle.putString(com.anythink.expressad.foundation.g.a.f19251q, str);
            bundle.putInt("type", 3);
            obtain.obj = bundle;
            b.this.f17922D.sendMessage(obtain);
        }
    }

    private int e() {
        return this.f17933q;
    }

    public final void a(ATNativeAdvancedView aTNativeAdvancedView) {
        this.f17929g = aTNativeAdvancedView;
    }

    /* renamed from: com.anythink.expressad.advanced.c.b$5, reason: invalid class name */
    public class AnonymousClass5 implements i.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.d f17955a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f17956b = 2;

        public AnonymousClass5(com.anythink.expressad.foundation.d.d dVar) {
            this.f17955a = dVar;
        }

        @Override // com.anythink.expressad.videocommon.b.i.a
        public final void a(String str) {
            String unused = b.f17913a;
            if (b.this.f17922D != null) {
                Message obtain = Message.obtain();
                obtain.what = 4;
                obtain.obj = this.f17955a;
                obtain.arg1 = this.f17956b;
                b.this.f17922D.sendMessage(obtain);
            }
        }

        @Override // com.anythink.expressad.videocommon.b.i.a
        public final void a(String str, String str2) {
            String unused = b.f17913a;
            if (b.this.f17929g != null) {
                b.this.f17929g.setEndCardReady(false);
            }
            Message obtain = Message.obtain();
            obtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f17955a);
            bundle.putString(com.anythink.expressad.foundation.g.a.f19251q, str);
            bundle.putInt("type", 2);
            obtain.obj = bundle;
            b.this.f17922D.sendMessage(obtain);
        }
    }

    public final void a(int i) {
        this.f17932p = i;
    }

    public final com.anythink.expressad.foundation.d.d c() {
        return this.f17931j;
    }

    public final void a(int i, int i4) {
        this.f17935s = i;
        this.f17934r = i4;
    }

    private void b(com.anythink.expressad.foundation.d.d dVar) {
        ATNativeAdvancedView aTNativeAdvancedView = this.f17929g;
        if (aTNativeAdvancedView != null) {
            aTNativeAdvancedView.clearResState();
        }
        if (!TextUtils.isEmpty(dVar.b())) {
            dVar.b();
            this.f17941y = new AnonymousClass8(dVar);
            e eVar = new e();
            eVar.a(dVar);
            int i = dVar.aD() != null ? dVar.aD().f18689a : 0;
            String b9 = dVar.b();
            eVar.a(i);
            eVar.a();
            i.a().b(b9, (i.a) this.f17941y);
        }
        if (!TextUtils.isEmpty(dVar.c())) {
            dVar.c();
            com.anythink.core.common.v.b.b.a().a(new AnonymousClass7(dVar));
        }
        if (!TextUtils.isEmpty(dVar.T())) {
            dVar.T();
            this.f17940x = new AnonymousClass2(dVar);
            CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            copyOnWriteArrayList.add(dVar);
            com.anythink.expressad.videocommon.b.e.a().a(this.f17924b, copyOnWriteArrayList, com.anythink.expressad.foundation.g.a.bb, this.f17940x);
            if (!com.anythink.expressad.videocommon.b.e.a().a(com.anythink.expressad.foundation.g.a.bb, this.f17924b, dVar.B())) {
                com.anythink.expressad.videocommon.b.e.a().d(this.f17924b);
            } else {
                this.f17929g.setVideoReady(true);
                a(dVar, 2);
            }
        }
        if (!TextUtils.isEmpty(dVar.bm())) {
            dVar.bm();
            com.anythink.expressad.foundation.g.d.b.a(t.b().g()).a(dVar.bm(), new AnonymousClass6(dVar));
        }
        if (!TextUtils.isEmpty(dVar.J())) {
            dVar.J();
            this.f17942z = new AnonymousClass5(dVar);
            int i4 = dVar.aD() != null ? dVar.aD().f18689a : 0;
            String J = dVar.J();
            e eVar2 = new e();
            eVar2.a(dVar);
            eVar2.a(i4);
            i.a().b(J, (i.a) this.f17942z);
        }
        if (TextUtils.isEmpty(dVar.z())) {
            return;
        }
        dVar.z();
        com.anythink.expressad.foundation.g.d.b.a(t.b().g()).a(dVar.z(), new AnonymousClass4(dVar));
    }

    private void a(long j9) {
        this.f17922D.postDelayed(this.f17923E, j9);
    }

    public final String a() {
        return this.f17921C;
    }

    public final void a(com.anythink.expressad.advanced.d.b bVar) {
        this.f17927e = bVar;
    }

    private void a(com.anythink.expressad.foundation.d.d dVar) {
        this.f17931j = dVar;
        if (d.a(this.f17929g, dVar)) {
            a(dVar, 2);
            return;
        }
        ATNativeAdvancedView aTNativeAdvancedView = this.f17929g;
        if (aTNativeAdvancedView != null) {
            aTNativeAdvancedView.clearResState();
        }
        if (!TextUtils.isEmpty(dVar.b())) {
            dVar.b();
            this.f17941y = new AnonymousClass8(dVar);
            e eVar = new e();
            eVar.a(dVar);
            int i = dVar.aD() != null ? dVar.aD().f18689a : 0;
            String b9 = dVar.b();
            eVar.a(i);
            eVar.a();
            i.a().b(b9, (i.a) this.f17941y);
        }
        if (!TextUtils.isEmpty(dVar.c())) {
            dVar.c();
            com.anythink.core.common.v.b.b.a().a(new AnonymousClass7(dVar));
        }
        if (!TextUtils.isEmpty(dVar.T())) {
            dVar.T();
            this.f17940x = new AnonymousClass2(dVar);
            CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            copyOnWriteArrayList.add(dVar);
            com.anythink.expressad.videocommon.b.e.a().a(this.f17924b, copyOnWriteArrayList, com.anythink.expressad.foundation.g.a.bb, this.f17940x);
            if (!com.anythink.expressad.videocommon.b.e.a().a(com.anythink.expressad.foundation.g.a.bb, this.f17924b, dVar.B())) {
                com.anythink.expressad.videocommon.b.e.a().d(this.f17924b);
            } else {
                this.f17929g.setVideoReady(true);
                a(dVar, 2);
            }
        }
        if (!TextUtils.isEmpty(dVar.bm())) {
            dVar.bm();
            com.anythink.expressad.foundation.g.d.b.a(t.b().g()).a(dVar.bm(), new AnonymousClass6(dVar));
        }
        if (!TextUtils.isEmpty(dVar.J())) {
            dVar.J();
            this.f17942z = new AnonymousClass5(dVar);
            int i4 = dVar.aD() != null ? dVar.aD().f18689a : 0;
            String J = dVar.J();
            e eVar2 = new e();
            eVar2.a(dVar);
            eVar2.a(i4);
            i.a().b(J, (i.a) this.f17942z);
        }
        if (TextUtils.isEmpty(dVar.z())) {
            return;
        }
        dVar.z();
        com.anythink.expressad.foundation.g.d.b.a(t.b().g()).a(dVar.z(), new AnonymousClass4(dVar));
    }

    private void b(com.anythink.expressad.foundation.d.d dVar, int i) {
        if (this.f17929g.isH5Ready()) {
            a(dVar, i);
        }
    }

    private List<com.anythink.expressad.foundation.d.d> b(com.anythink.expressad.foundation.d.e eVar) {
        if (eVar == null || eVar.f18838K == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        com.anythink.expressad.foundation.d.d dVar = eVar.f18838K.get(0);
        dVar.l(this.f17924b);
        this.f17919A = eVar.c();
        if (dVar.P() != 99 && (!TextUtils.isEmpty(dVar.b()) || !TextUtils.isEmpty(dVar.c()))) {
            if (v.a(dVar)) {
                dVar.k(v.a(this.f17928f, dVar.bi()) ? 1 : 2);
            }
            if (l.a(this.f17928f, dVar)) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.anythink.expressad.foundation.d.d dVar, int i) {
        if (!d.a(this.f17929g, dVar) || this.f17939w) {
            return;
        }
        j();
        this.f17939w = true;
        com.anythink.expressad.advanced.d.b bVar = this.f17927e;
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
        if (bVar.f17929g.isH5Ready()) {
            bVar.a(dVar, i);
        }
    }

    private void a(com.anythink.expressad.foundation.e.c cVar) {
        if (this.f17939w) {
            return;
        }
        j();
        if (cVar != null) {
            cVar.a();
        }
        this.f17939w = true;
        com.anythink.expressad.advanced.d.b bVar = this.f17927e;
        if (bVar != null) {
            bVar.a(cVar);
        }
    }

    private void a(String str, com.anythink.expressad.foundation.d.d dVar, int i) {
        ATNativeAdvancedView aTNativeAdvancedView = this.f17929g;
        if (aTNativeAdvancedView == null || aTNativeAdvancedView.getAdvancedNativeWebview() == null) {
            return;
        }
        NativeAdvancedJSBridgeImpl nativeAdvancedJSBridgeImpl = new NativeAdvancedJSBridgeImpl(this.f17929g.getContext(), this.f17925c, this.f17924b);
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar);
        nativeAdvancedJSBridgeImpl.setCampaignList(arrayList);
        nativeAdvancedJSBridgeImpl.setAllowSkip(this.f17932p);
        nativeAdvancedJSBridgeImpl.setCountdownS(this.f17933q);
        this.f17929g.setAdvancedNativeJSBridgeImpl(nativeAdvancedJSBridgeImpl);
        System.currentTimeMillis();
        ATNativeAdvancedWebview advancedNativeWebview = this.f17929g.getAdvancedNativeWebview();
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
            Handler handler = this.f17922D;
            if (handler != null) {
                handler.post(new AnonymousClass10(advancedNativeWebview, str));
                return;
            }
            return;
        }
        a(new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19117E), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.anythink.expressad.foundation.d.d dVar, String str) {
        com.anythink.expressad.foundation.e.c cVar = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19145j);
        cVar.a(str);
        a(cVar, dVar);
    }

    public final String a(String str) {
        if (this.f17931j != null) {
            try {
                com.anythink.expressad.videocommon.b.c a9 = com.anythink.expressad.videocommon.b.e.a().a(this.f17924b, this.f17931j.bh() + this.f17931j.T() + this.f17931j.C());
                if (a9 != null && a9.k() == 5) {
                    String e6 = a9.e();
                    if (new File(e6).exists()) {
                        return e6;
                    }
                }
            } catch (Exception e9) {
                e9.printStackTrace();
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
        if (eVar == null || eVar.f18838K == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            com.anythink.expressad.foundation.d.d dVar3 = eVar.f18838K.get(0);
            dVar3.l(this.f17924b);
            this.f17919A = eVar.c();
            if (dVar3.P() != 99 && (!TextUtils.isEmpty(dVar3.b()) || !TextUtils.isEmpty(dVar3.c()))) {
                if (v.a(dVar3)) {
                    dVar3.k(v.a(this.f17928f, dVar3.bi()) ? 1 : 2);
                }
                if (l.a(this.f17928f, dVar3)) {
                    arrayList.add(dVar3);
                }
            }
        }
        if (arrayList != null && arrayList.size() > 0) {
            try {
                i = this.f17920B + 1;
                this.f17920B = i;
                cVar = this.f17930h;
            } catch (Exception e6) {
                e6.printStackTrace();
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
                this.f17931j = dVar;
                if (!d.a(this.f17929g, dVar)) {
                    a(dVar, 2);
                    return;
                }
                ATNativeAdvancedView aTNativeAdvancedView = this.f17929g;
                if (aTNativeAdvancedView != null) {
                    aTNativeAdvancedView.clearResState();
                }
                if (!TextUtils.isEmpty(dVar.b())) {
                    dVar.b();
                    this.f17941y = new AnonymousClass8(dVar);
                    e eVar2 = new e();
                    eVar2.a(dVar);
                    int i4 = dVar.aD() != null ? dVar.aD().f18689a : 0;
                    String b9 = dVar.b();
                    eVar2.a(i4);
                    eVar2.a();
                    i.a().b(b9, (i.a) this.f17941y);
                }
                if (!TextUtils.isEmpty(dVar.c())) {
                    dVar.c();
                    com.anythink.core.common.v.b.b.a().a(new AnonymousClass7(dVar));
                }
                if (!TextUtils.isEmpty(dVar.T())) {
                    dVar.T();
                    this.f17940x = new AnonymousClass2(dVar);
                    CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                    copyOnWriteArrayList.add(dVar);
                    com.anythink.expressad.videocommon.b.e.a().a(this.f17924b, copyOnWriteArrayList, com.anythink.expressad.foundation.g.a.bb, this.f17940x);
                    if (!com.anythink.expressad.videocommon.b.e.a().a(com.anythink.expressad.foundation.g.a.bb, this.f17924b, dVar.B())) {
                        com.anythink.expressad.videocommon.b.e.a().d(this.f17924b);
                    } else {
                        this.f17929g.setVideoReady(true);
                        a(dVar, 2);
                    }
                }
                if (!TextUtils.isEmpty(dVar.bm())) {
                    dVar.bm();
                    com.anythink.expressad.foundation.g.d.b.a(t.b().g()).a(dVar.bm(), new AnonymousClass6(dVar));
                }
                if (!TextUtils.isEmpty(dVar.J())) {
                    dVar.J();
                    this.f17942z = new AnonymousClass5(dVar);
                    int i9 = dVar.aD() != null ? dVar.aD().f18689a : 0;
                    String J = dVar.J();
                    e eVar3 = new e();
                    eVar3.a(dVar);
                    eVar3.a(i9);
                    i.a().b(J, (i.a) this.f17942z);
                }
                if (TextUtils.isEmpty(dVar.z())) {
                    return;
                }
                dVar.z();
                com.anythink.expressad.foundation.g.d.b.a(t.b().g()).a(dVar.z(), new AnonymousClass4(dVar));
                return;
            }
            this.f17920B = 0;
            arrayList.size();
            dVar = (com.anythink.expressad.foundation.d.d) arrayList.get(0);
            if (!TextUtils.isEmpty(dVar.b())) {
            }
            dVar.a(true);
            dVar.b(false);
            this.f17931j = dVar;
            if (!d.a(this.f17929g, dVar)) {
            }
        } else {
            com.anythink.expressad.foundation.e.c cVar2 = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19119G);
            if (eVar != null && (arrayList2 = eVar.f18838K) != null && arrayList2.size() != 0) {
                dVar2 = eVar.f18838K.get(0);
            }
            a(cVar2, dVar2);
        }
    }

    public static /* synthetic */ void a(b bVar, String str, com.anythink.expressad.foundation.d.d dVar, int i) {
        ATNativeAdvancedView aTNativeAdvancedView = bVar.f17929g;
        if (aTNativeAdvancedView == null || aTNativeAdvancedView.getAdvancedNativeWebview() == null) {
            return;
        }
        NativeAdvancedJSBridgeImpl nativeAdvancedJSBridgeImpl = new NativeAdvancedJSBridgeImpl(bVar.f17929g.getContext(), bVar.f17925c, bVar.f17924b);
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar);
        nativeAdvancedJSBridgeImpl.setCampaignList(arrayList);
        nativeAdvancedJSBridgeImpl.setAllowSkip(bVar.f17932p);
        nativeAdvancedJSBridgeImpl.setCountdownS(bVar.f17933q);
        bVar.f17929g.setAdvancedNativeJSBridgeImpl(nativeAdvancedJSBridgeImpl);
        System.currentTimeMillis();
        ATNativeAdvancedWebview advancedNativeWebview = bVar.f17929g.getAdvancedNativeWebview();
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
            Handler handler = bVar.f17922D;
            if (handler != null) {
                handler.post(bVar.new AnonymousClass10(advancedNativeWebview, str));
                return;
            }
            return;
        }
        bVar.a(new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19117E), dVar);
    }
}
