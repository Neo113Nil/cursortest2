package com.anythink.expressad.splash.c;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import com.anythink.core.common.d.t;
import com.anythink.expressad.foundation.h.l;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.foundation.h.z;
import com.anythink.expressad.splash.a.b;
import com.anythink.expressad.splash.c.c;
import com.anythink.expressad.splash.c.g;
import com.anythink.expressad.splash.view.ATSplashView;
import com.anythink.expressad.videocommon.b.i;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    private static String f21332c = "SplashLoadManager";

    /* renamed from: l, reason: collision with root package name */
    private static final int f21333l = 1;

    /* renamed from: m, reason: collision with root package name */
    private static final int f21334m = 2;

    /* renamed from: n, reason: collision with root package name */
    private static final int f21335n = 3;

    /* renamed from: B, reason: collision with root package name */
    private int f21337B;

    /* renamed from: C, reason: collision with root package name */
    private List<com.anythink.expressad.foundation.d.d> f21338C;

    /* renamed from: b, reason: collision with root package name */
    com.anythink.expressad.foundation.d.d f21343b;

    /* renamed from: d, reason: collision with root package name */
    private String f21344d;

    /* renamed from: e, reason: collision with root package name */
    private String f21345e;

    /* renamed from: f, reason: collision with root package name */
    private long f21346f;

    /* renamed from: g, reason: collision with root package name */
    private long f21347g;

    /* renamed from: h, reason: collision with root package name */
    private com.anythink.expressad.splash.d.b f21348h;

    /* renamed from: j, reason: collision with root package name */
    private ATSplashView f21349j;

    /* renamed from: k, reason: collision with root package name */
    private com.anythink.expressad.f.c f21350k;

    /* renamed from: o, reason: collision with root package name */
    private boolean f21351o;

    /* renamed from: p, reason: collision with root package name */
    private int f21352p;

    /* renamed from: q, reason: collision with root package name */
    private int f21353q;

    /* renamed from: r, reason: collision with root package name */
    private int f21354r;

    /* renamed from: s, reason: collision with root package name */
    private String f21355s;

    /* renamed from: t, reason: collision with root package name */
    private int f21356t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f21357u;

    /* renamed from: v, reason: collision with root package name */
    private volatile boolean f21358v;

    /* renamed from: w, reason: collision with root package name */
    private com.anythink.expressad.videocommon.d.c f21359w;

    /* renamed from: x, reason: collision with root package name */
    private i.d f21360x;

    /* renamed from: y, reason: collision with root package name */
    private String f21361y;

    /* renamed from: z, reason: collision with root package name */
    private int f21362z;

    /* renamed from: A, reason: collision with root package name */
    private String f21336A = "";

    /* renamed from: D, reason: collision with root package name */
    private String f21339D = "";

    /* renamed from: E, reason: collision with root package name */
    private Handler f21340E = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.splash.c.e.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                Object obj = message.obj;
                int i4 = message.arg1;
                if (obj instanceof com.anythink.expressad.foundation.d.d) {
                    com.anythink.expressad.foundation.d.d dVar = (com.anythink.expressad.foundation.d.d) obj;
                    e.a(e.this, i.a().b(dVar.b()), dVar, i4);
                    return;
                }
                return;
            }
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                Object obj2 = message.obj;
                if (obj2 instanceof com.anythink.expressad.foundation.d.d) {
                    e eVar = e.this;
                    eVar.b((com.anythink.expressad.foundation.d.d) obj2, eVar.f21356t);
                    return;
                }
                return;
            }
            Object obj3 = message.obj;
            try {
                if (obj3 instanceof Bundle) {
                    int i6 = ((Bundle) obj3).getInt("type");
                    String string = ((Bundle) obj3).getString(com.anythink.expressad.foundation.g.a.f19880q);
                    com.anythink.expressad.foundation.d.d dVar2 = (com.anythink.expressad.foundation.d.d) ((Bundle) obj3).getSerializable("campaignex");
                    com.anythink.expressad.foundation.e.c cVar = new com.anythink.expressad.foundation.e.c(i6 == 1 ? com.anythink.expressad.foundation.e.b.f19770e : i6 == 2 ? com.anythink.expressad.foundation.e.b.f19772g : com.anythink.expressad.foundation.e.b.f19742A);
                    cVar.a(string);
                    e eVar2 = e.this;
                    String unused = eVar2.f21355s;
                    int unused2 = e.this.f21356t;
                    eVar2.a(cVar, dVar2);
                }
            } catch (Exception e9) {
                com.anythink.expressad.foundation.e.c cVar2 = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19788x);
                cVar2.a((Throwable) e9);
                e eVar3 = e.this;
                String unused3 = eVar3.f21355s;
                int unused4 = e.this.f21356t;
                eVar3.a(cVar2, (com.anythink.expressad.foundation.d.d) null);
            }
        }
    };

    /* renamed from: F, reason: collision with root package name */
    private Runnable f21341F = new Runnable() { // from class: com.anythink.expressad.splash.c.e.2
        @Override // java.lang.Runnable
        public final void run() {
            com.anythink.expressad.foundation.e.c cVar = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19775k);
            e eVar = e.this;
            String unused = eVar.f21355s;
            int unused2 = e.this.f21356t;
            eVar.a(cVar, (com.anythink.expressad.foundation.d.d) null);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    boolean f21342a = false;
    private Context i = t.b().g();

    /* renamed from: com.anythink.expressad.splash.c.e$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.d f21368a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f21369b;

        public AnonymousClass4(com.anythink.expressad.foundation.d.d dVar, int i) {
            this.f21368a = dVar;
            this.f21369b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            File file;
            final File file2;
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    try {
                        file2 = new File(this.f21368a.c());
                        try {
                            if (!file2.exists()) {
                                String b9 = com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_700_HTML);
                                String a9 = s.a(z.b(this.f21368a.c()));
                                if (TextUtils.isEmpty(a9)) {
                                    a9 = String.valueOf(System.currentTimeMillis());
                                }
                                file = new File(b9, a9.concat(".html"));
                                try {
                                    if (!file.exists()) {
                                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                                        try {
                                            fileOutputStream2.write(("<script>" + com.anythink.core.common.v.z.a().b() + "</script>" + this.f21368a.c()).getBytes());
                                            fileOutputStream2.flush();
                                            fileOutputStream = fileOutputStream2;
                                        } catch (Exception e9) {
                                            e = e9;
                                            fileOutputStream = fileOutputStream2;
                                            e.printStackTrace();
                                            this.f21368a.j("");
                                            if (fileOutputStream != null) {
                                                fileOutputStream.close();
                                            }
                                            file2 = file;
                                            if (!file2.exists()) {
                                            }
                                            com.anythink.expressad.foundation.e.c cVar = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19777m);
                                            e eVar = e.this;
                                            String unused = eVar.f21355s;
                                            eVar.a(cVar, this.f21368a);
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
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e12) {
                    e = e12;
                    file = null;
                }
                if (!file2.exists() && file2.isFile() && file2.canRead()) {
                    this.f21368a.b(file2.getAbsolutePath());
                    t.b().b(new Runnable() { // from class: com.anythink.expressad.splash.c.e.4.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            e eVar2 = e.this;
                            String str = "file:////" + file2.getAbsolutePath();
                            AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                            e.a(eVar2, str, anonymousClass4.f21368a, anonymousClass4.f21369b);
                        }
                    });
                } else {
                    com.anythink.expressad.foundation.e.c cVar2 = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19777m);
                    e eVar2 = e.this;
                    String unused2 = eVar2.f21355s;
                    eVar2.a(cVar2, this.f21368a);
                }
            } catch (Exception unused3) {
                com.anythink.expressad.foundation.e.c cVar3 = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19777m);
                e eVar3 = e.this;
                String unused4 = eVar3.f21355s;
                eVar3.a(cVar3, this.f21368a);
            }
        }
    }

    public e(String str, String str2, long j6) {
        this.f21345e = str;
        this.f21344d = str2;
        this.f21347g = j6;
    }

    private boolean f() {
        return this.f21351o;
    }

    private int g() {
        return this.f21352p;
    }

    private void h() {
        try {
            int i = this.f21362z + 1;
            this.f21362z = i;
            com.anythink.expressad.f.c cVar = this.f21350k;
            if (cVar != null && i <= cVar.t()) {
                return;
            }
            this.f21362z = 0;
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    private static void i() {
    }

    private static void j() {
    }

    private void k() {
        this.f21362z = 0;
    }

    private static void l() {
    }

    private void m() {
        this.f21340E.removeCallbacks(this.f21341F);
    }

    /* renamed from: com.anythink.expressad.splash.c.e$7, reason: invalid class name */
    public class AnonymousClass7 implements g.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.d f21379a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f21380b;

        public AnonymousClass7(com.anythink.expressad.foundation.d.d dVar, int i) {
            this.f21379a = dVar;
            this.f21380b = i;
        }

        @Override // com.anythink.expressad.splash.c.g.b
        public final void a() {
            if (this.f21379a.t()) {
                return;
            }
            e.c(e.this, this.f21379a, this.f21380b);
        }

        @Override // com.anythink.expressad.splash.c.g.b
        public final void a(String str) {
            e.a(e.this, str, this.f21379a);
        }

        @Override // com.anythink.expressad.splash.c.g.b
        public final void a(int i) {
            if (i == 1) {
                e.c(e.this, this.f21379a, this.f21380b);
            } else {
                e.a(e.this, "readyState 2", this.f21379a);
            }
        }
    }

    private void e(com.anythink.expressad.foundation.d.d dVar, int i) {
        com.anythink.core.common.v.b.b.a().a(new AnonymousClass4(dVar, i));
    }

    private void f(com.anythink.expressad.foundation.d.d dVar, int i) {
        if (dVar.j()) {
            return;
        }
        this.f21360x = new AnonymousClass5(dVar, i);
        com.anythink.expressad.foundation.g.g.a.e eVar = new com.anythink.expressad.foundation.g.g.a.e();
        eVar.b();
        eVar.a();
        eVar.a(dVar);
        eVar.a(dVar.aD() != null ? dVar.aD().f19318a : 0);
        i.a().b(dVar.b(), (i.a) this.f21360x);
    }

    private void g(com.anythink.expressad.foundation.d.d dVar, int i) {
        if (dVar.j()) {
            b.a aVar = new b.a();
            aVar.b(this.f21344d).a(this.f21345e).a(this.f21351o).a(dVar).a(this.f21352p).h(this.f21337B);
            try {
                if (!TextUtils.isEmpty(dVar.b())) {
                    Uri parse = Uri.parse(dVar.b());
                    String queryParameter = parse.getQueryParameter("hdbtn");
                    String queryParameter2 = parse.getQueryParameter("alecfc");
                    String queryParameter3 = parse.getQueryParameter("hdinfo");
                    String queryParameter4 = parse.getQueryParameter("shake_show");
                    String queryParameter5 = parse.getQueryParameter("shake_strength");
                    String queryParameter6 = parse.getQueryParameter("shake_time");
                    String queryParameter7 = parse.getQueryParameter("n_logo");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        aVar.b(Integer.parseInt(queryParameter));
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        aVar.c(Integer.parseInt(queryParameter2));
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        aVar.d(Integer.parseInt(queryParameter3));
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        aVar.e(Integer.parseInt(queryParameter4));
                    }
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        aVar.f(Integer.parseInt(queryParameter5));
                    }
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        aVar.g(Integer.parseInt(queryParameter6));
                    }
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        aVar.i(Integer.parseInt(queryParameter7) == 0 ? 0 : 1);
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
            }
            c unused = c.a.f21327a;
            a.a(this.f21349j, new com.anythink.expressad.splash.a.b(aVar), new AnonymousClass6(dVar, i));
        }
    }

    private void i(com.anythink.expressad.foundation.d.d dVar, int i) {
        this.f21359w = new AnonymousClass8(dVar);
        CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(dVar);
        com.anythink.expressad.videocommon.b.e.a().a(this.f21344d, copyOnWriteArrayList, com.anythink.expressad.foundation.g.a.aZ, this.f21359w);
        if (!com.anythink.expressad.videocommon.b.e.a().a(com.anythink.expressad.foundation.g.a.aZ, this.f21344d, dVar.B())) {
            com.anythink.expressad.videocommon.b.e.a().d(this.f21344d);
        } else {
            this.f21349j.setVideoReady(true);
            b(dVar, i);
        }
    }

    public final void b(boolean z6) {
        this.f21351o = z6;
    }

    public final void c() {
        if (this.f21348h != null) {
            this.f21348h = null;
        }
        if (this.f21359w != null) {
            this.f21359w = null;
        }
        if (this.f21360x != null) {
            this.f21360x = null;
        }
    }

    public final com.anythink.expressad.foundation.d.d d() {
        return this.f21343b;
    }

    private void d(final com.anythink.expressad.foundation.d.d dVar, final int i) {
        d.a(this.f21349j, dVar, new com.anythink.expressad.splash.view.a() { // from class: com.anythink.expressad.splash.c.e.3
            @Override // com.anythink.expressad.splash.view.a
            public final void a() {
                if (dVar.j() && e.this.f21349j != null) {
                    e.this.f21349j.setImageReady(true);
                    e.b(e.this, dVar, i);
                }
                e.this.b(dVar, i);
            }

            @Override // com.anythink.expressad.splash.view.a
            public final void b() {
                if (!dVar.j() || e.this.f21349j == null) {
                    return;
                }
                e.this.f21349j.setImageReady(false);
                com.anythink.expressad.foundation.e.c cVar = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19742A);
                e eVar = e.this;
                String unused = eVar.f21355s;
                eVar.a(cVar, dVar);
            }
        });
    }

    public final void b(int i) {
        this.f21352p = i;
    }

    /* renamed from: com.anythink.expressad.splash.c.e$6, reason: invalid class name */
    public class AnonymousClass6 implements com.anythink.expressad.splash.b.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.d f21376a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f21377b;

        public AnonymousClass6(com.anythink.expressad.foundation.d.d dVar, int i) {
            this.f21376a = dVar;
            this.f21377b = i;
        }

        @Override // com.anythink.expressad.splash.b.a
        public final void a(View view) {
            if (e.this.f21349j != null) {
                e.this.f21349j.setDynamicView(true);
                e.this.f21349j.setSplashNativeView(view);
                e.this.b(this.f21376a, this.f21377b);
            }
        }

        @Override // com.anythink.expressad.splash.b.a
        public final void a(String str) {
            com.anythink.expressad.foundation.e.c cVar = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19749H);
            cVar.a(str);
            e eVar = e.this;
            String unused = eVar.f21355s;
            eVar.a(cVar, this.f21376a);
        }
    }

    public final void a(int i) {
        this.f21337B = i;
    }

    public final String b() {
        return l.a(this.f21338C);
    }

    /* renamed from: com.anythink.expressad.splash.c.e$5, reason: invalid class name */
    public class AnonymousClass5 implements i.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.d f21373a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f21374b;

        public AnonymousClass5(com.anythink.expressad.foundation.d.d dVar, int i) {
            this.f21373a = dVar;
            this.f21374b = i;
        }

        @Override // com.anythink.expressad.videocommon.b.i.a
        public final void a(String str) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = this.f21373a;
            obtain.arg1 = this.f21374b;
            e.this.f21340E.sendMessage(obtain);
        }

        @Override // com.anythink.expressad.videocommon.b.i.a
        public final void a(String str, String str2) {
            com.anythink.expressad.foundation.e.c cVar = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19772g);
            e eVar = e.this;
            String unused = eVar.f21355s;
            eVar.a(cVar, this.f21373a);
            Message obtain = Message.obtain();
            obtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f21373a);
            bundle.putString(com.anythink.expressad.foundation.g.a.f19880q, str);
            bundle.putInt("type", 2);
            obtain.obj = bundle;
            e.this.f21340E.sendMessage(obtain);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.anythink.expressad.foundation.d.d dVar, int i) {
        if (!d.a(this.f21349j, dVar) || this.f21358v) {
            return;
        }
        m();
        this.f21343b = dVar;
        this.f21358v = true;
        com.anythink.expressad.splash.d.b bVar = this.f21348h;
        if (bVar != null) {
            bVar.a(dVar, i);
        }
    }

    private void h(com.anythink.expressad.foundation.d.d dVar, int i) {
        if (this.f21349j.isH5Ready()) {
            return;
        }
        this.f21349j.setH5Ready(true);
        b(dVar, i);
    }

    public final void a(boolean z6) {
        this.f21342a = z6;
    }

    /* renamed from: com.anythink.expressad.splash.c.e$8, reason: invalid class name */
    public class AnonymousClass8 implements com.anythink.expressad.videocommon.d.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.d f21382a;

        public AnonymousClass8(com.anythink.expressad.foundation.d.d dVar) {
            this.f21382a = dVar;
        }

        @Override // com.anythink.expressad.videocommon.d.c
        public final void a(String str) {
            e.this.f21349j.setVideoReady(true);
            String unused = e.f21332c;
            Message obtain = Message.obtain();
            obtain.obj = this.f21382a;
            obtain.what = 3;
            e.this.f21340E.sendMessage(obtain);
        }

        @Override // com.anythink.expressad.videocommon.d.c
        public final void a(String str, String str2) {
            e.this.f21349j.setVideoReady(false);
            com.anythink.expressad.foundation.e.c cVar = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19770e);
            cVar.a(str);
            e eVar = e.this;
            String unused = eVar.f21355s;
            int unused2 = e.this.f21356t;
            eVar.a(cVar, this.f21382a);
            String unused3 = e.f21332c;
            Message obtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f21382a);
            bundle.putString(com.anythink.expressad.foundation.g.a.f19880q, str);
            bundle.putInt("type", 1);
            obtain.obj = bundle;
            obtain.what = 2;
            e.this.f21340E.sendMessage(obtain);
        }
    }

    public final void a(com.anythink.expressad.f.c cVar) {
        this.f21350k = cVar;
    }

    public final void a(ATSplashView aTSplashView) {
        this.f21349j = aTSplashView;
    }

    private void c(com.anythink.expressad.foundation.d.d dVar, int i) {
        this.f21349j.clearResState();
        if (!TextUtils.isEmpty(dVar.b()) && !dVar.j()) {
            this.f21360x = new AnonymousClass5(dVar, i);
            com.anythink.expressad.foundation.g.g.a.e eVar = new com.anythink.expressad.foundation.g.g.a.e();
            eVar.b();
            eVar.a();
            eVar.a(dVar);
            eVar.a(dVar.aD() != null ? dVar.aD().f19318a : 0);
            i.a().b(dVar.b(), (i.a) this.f21360x);
        }
        if (dVar.j()) {
            return;
        }
        if (!TextUtils.isEmpty(dVar.c())) {
            com.anythink.core.common.v.b.b.a().a(new AnonymousClass4(dVar, i));
        }
        if (!TextUtils.isEmpty(dVar.T())) {
            this.f21359w = new AnonymousClass8(dVar);
            CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            copyOnWriteArrayList.add(dVar);
            com.anythink.expressad.videocommon.b.e.a().a(this.f21344d, copyOnWriteArrayList, com.anythink.expressad.foundation.g.a.aZ, this.f21359w);
            if (!com.anythink.expressad.videocommon.b.e.a().a(com.anythink.expressad.foundation.g.a.aZ, this.f21344d, dVar.B())) {
                com.anythink.expressad.videocommon.b.e.a().d(this.f21344d);
            } else {
                this.f21349j.setVideoReady(true);
                b(dVar, i);
            }
        }
        if (TextUtils.isEmpty(dVar.bm())) {
            return;
        }
        d(dVar, i);
    }

    public final void a(int i, int i4) {
        this.f21354r = i;
        this.f21353q = i4;
    }

    public final String a() {
        return this.f21336A;
    }

    private void b(com.anythink.expressad.foundation.e.c cVar, com.anythink.expressad.foundation.d.d dVar) {
        if (this.f21358v) {
            return;
        }
        m();
        this.f21358v = true;
        if (cVar != null) {
            cVar.a(dVar);
        }
        com.anythink.expressad.splash.d.b bVar = this.f21348h;
        if (bVar != null) {
            bVar.a(cVar);
        }
    }

    public final void a(com.anythink.expressad.foundation.d.e eVar) {
        ArrayList arrayList;
        com.anythink.expressad.foundation.e.c cVar;
        ArrayList<com.anythink.expressad.foundation.d.d> arrayList2;
        this.f21358v = false;
        this.f21355s = "";
        this.f21356t = 2;
        com.anythink.expressad.foundation.d.d dVar = null;
        if (eVar == null || eVar.f19467K == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            com.anythink.expressad.foundation.d.d dVar2 = eVar.f19467K.get(0);
            dVar2.l(this.f21344d);
            this.f21361y = eVar.c();
            if (dVar2.P() != 99 && (!TextUtils.isEmpty(dVar2.b()) || !TextUtils.isEmpty(dVar2.c()))) {
                if (v.a(dVar2)) {
                    dVar2.k(v.a(this.i, dVar2.bi()) ? 1 : 2);
                }
                if (l.a(this.i, dVar2)) {
                    arrayList.add(dVar2);
                } else {
                    this.f21339D = com.anythink.expressad.reward.a.d.f21021a;
                }
            }
        }
        if (arrayList != null && arrayList.size() > 0) {
            h();
            arrayList.size();
            com.anythink.expressad.foundation.d.d dVar3 = (com.anythink.expressad.foundation.d.d) arrayList.get(0);
            if (TextUtils.isEmpty(dVar3.b()) && (TextUtils.isEmpty(dVar3.c()) || !dVar3.c().contains("<MBTPLMARK>"))) {
                dVar3.a(false);
                dVar3.b(true);
            } else {
                dVar3.a(true);
                dVar3.b(false);
            }
            ATSplashView aTSplashView = this.f21349j;
            if (aTSplashView != null) {
                aTSplashView.setDynamicView(false);
            }
            if (dVar3.j()) {
                d(dVar3, 2);
            } else {
                ATSplashView aTSplashView2 = this.f21349j;
                if (aTSplashView2 != null) {
                    aTSplashView2.setSplashWebview();
                }
            }
            if (d.a(this.f21349j, dVar3)) {
                b(dVar3, 2);
                return;
            }
            this.f21349j.clearResState();
            if (!TextUtils.isEmpty(dVar3.b()) && !dVar3.j()) {
                this.f21360x = new AnonymousClass5(dVar3, 2);
                com.anythink.expressad.foundation.g.g.a.e eVar2 = new com.anythink.expressad.foundation.g.g.a.e();
                eVar2.b();
                eVar2.a();
                eVar2.a(dVar3);
                eVar2.a(dVar3.aD() != null ? dVar3.aD().f19318a : 0);
                i.a().b(dVar3.b(), (i.a) this.f21360x);
            }
            if (dVar3.j()) {
                return;
            }
            if (!TextUtils.isEmpty(dVar3.c())) {
                com.anythink.core.common.v.b.b.a().a(new AnonymousClass4(dVar3, 2));
            }
            if (!TextUtils.isEmpty(dVar3.T())) {
                this.f21359w = new AnonymousClass8(dVar3);
                CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                copyOnWriteArrayList.add(dVar3);
                com.anythink.expressad.videocommon.b.e.a().a(this.f21344d, copyOnWriteArrayList, com.anythink.expressad.foundation.g.a.aZ, this.f21359w);
                if (!com.anythink.expressad.videocommon.b.e.a().a(com.anythink.expressad.foundation.g.a.aZ, this.f21344d, dVar3.B())) {
                    com.anythink.expressad.videocommon.b.e.a().d(this.f21344d);
                } else {
                    this.f21349j.setVideoReady(true);
                    b(dVar3, 2);
                }
            }
            if (TextUtils.isEmpty(dVar3.bm())) {
                return;
            }
            d(dVar3, 2);
            return;
        }
        if (this.f21339D.contains("INSTALLED")) {
            cVar = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19785u, com.anythink.expressad.reward.a.d.f21021a);
        } else {
            cVar = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19769d);
        }
        if (eVar != null && (arrayList2 = eVar.f19467K) != null && arrayList2.size() != 0) {
            dVar = eVar.f19467K.get(0);
        }
        a(cVar, dVar);
    }

    private List<com.anythink.expressad.foundation.d.d> b(com.anythink.expressad.foundation.d.e eVar) {
        if (eVar == null || eVar.f19467K == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        com.anythink.expressad.foundation.d.d dVar = eVar.f19467K.get(0);
        dVar.l(this.f21344d);
        this.f21361y = eVar.c();
        if (dVar.P() != 99 && (!TextUtils.isEmpty(dVar.b()) || !TextUtils.isEmpty(dVar.c()))) {
            if (v.a(dVar)) {
                dVar.k(v.a(this.i, dVar.bi()) ? 1 : 2);
            }
            if (l.a(this.i, dVar)) {
                arrayList.add(dVar);
                return arrayList;
            }
            this.f21339D = com.anythink.expressad.reward.a.d.f21021a;
        }
        return arrayList;
    }

    public static /* synthetic */ void b(e eVar, com.anythink.expressad.foundation.d.d dVar, int i) {
        if (dVar.j()) {
            b.a aVar = new b.a();
            aVar.b(eVar.f21344d).a(eVar.f21345e).a(eVar.f21351o).a(dVar).a(eVar.f21352p).h(eVar.f21337B);
            try {
                if (!TextUtils.isEmpty(dVar.b())) {
                    Uri parse = Uri.parse(dVar.b());
                    String queryParameter = parse.getQueryParameter("hdbtn");
                    String queryParameter2 = parse.getQueryParameter("alecfc");
                    String queryParameter3 = parse.getQueryParameter("hdinfo");
                    String queryParameter4 = parse.getQueryParameter("shake_show");
                    String queryParameter5 = parse.getQueryParameter("shake_strength");
                    String queryParameter6 = parse.getQueryParameter("shake_time");
                    String queryParameter7 = parse.getQueryParameter("n_logo");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        aVar.b(Integer.parseInt(queryParameter));
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        aVar.c(Integer.parseInt(queryParameter2));
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        aVar.d(Integer.parseInt(queryParameter3));
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        aVar.e(Integer.parseInt(queryParameter4));
                    }
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        aVar.f(Integer.parseInt(queryParameter5));
                    }
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        aVar.g(Integer.parseInt(queryParameter6));
                    }
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        aVar.i(Integer.parseInt(queryParameter7) == 0 ? 0 : 1);
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
            }
            c unused = c.a.f21327a;
            a.a(eVar.f21349j, new com.anythink.expressad.splash.a.b(aVar), eVar.new AnonymousClass6(dVar, i));
        }
    }

    public static /* synthetic */ void c(e eVar, com.anythink.expressad.foundation.d.d dVar, int i) {
        if (eVar.f21349j.isH5Ready()) {
            return;
        }
        eVar.f21349j.setH5Ready(true);
        eVar.b(dVar, i);
    }

    private void a(long j6) {
        this.f21340E.postDelayed(this.f21341F, j6);
    }

    public final void a(com.anythink.expressad.splash.d.b bVar) {
        this.f21348h = bVar;
    }

    private void a(com.anythink.expressad.foundation.d.d dVar, int i) {
        ATSplashView aTSplashView = this.f21349j;
        if (aTSplashView != null) {
            aTSplashView.setDynamicView(false);
        }
        if (dVar.j()) {
            d(dVar, i);
        } else {
            ATSplashView aTSplashView2 = this.f21349j;
            if (aTSplashView2 != null) {
                aTSplashView2.setSplashWebview();
            }
        }
        if (d.a(this.f21349j, dVar)) {
            b(dVar, i);
            return;
        }
        this.f21349j.clearResState();
        if (!TextUtils.isEmpty(dVar.b()) && !dVar.j()) {
            this.f21360x = new AnonymousClass5(dVar, i);
            com.anythink.expressad.foundation.g.g.a.e eVar = new com.anythink.expressad.foundation.g.g.a.e();
            eVar.b();
            eVar.a();
            eVar.a(dVar);
            eVar.a(dVar.aD() != null ? dVar.aD().f19318a : 0);
            i.a().b(dVar.b(), (i.a) this.f21360x);
        }
        if (dVar.j()) {
            return;
        }
        if (!TextUtils.isEmpty(dVar.c())) {
            com.anythink.core.common.v.b.b.a().a(new AnonymousClass4(dVar, i));
        }
        if (!TextUtils.isEmpty(dVar.T())) {
            this.f21359w = new AnonymousClass8(dVar);
            CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            copyOnWriteArrayList.add(dVar);
            com.anythink.expressad.videocommon.b.e.a().a(this.f21344d, copyOnWriteArrayList, com.anythink.expressad.foundation.g.a.aZ, this.f21359w);
            if (!com.anythink.expressad.videocommon.b.e.a().a(com.anythink.expressad.foundation.g.a.aZ, this.f21344d, dVar.B())) {
                com.anythink.expressad.videocommon.b.e.a().d(this.f21344d);
            } else {
                this.f21349j.setVideoReady(true);
                b(dVar, i);
            }
        }
        if (TextUtils.isEmpty(dVar.bm())) {
            return;
        }
        d(dVar, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.anythink.expressad.foundation.e.c cVar, com.anythink.expressad.foundation.d.d dVar) {
        if (this.f21357u) {
            this.f21357u = false;
        } else {
            b(cVar, dVar);
        }
    }

    private void a(String str, com.anythink.expressad.foundation.d.d dVar, int i) {
        g.c cVar = new g.c();
        cVar.c(this.f21344d);
        cVar.b(this.f21345e);
        cVar.a(dVar);
        cVar.a(str);
        cVar.b(this.f21351o);
        cVar.a(this.f21352p);
        cVar.a(this.f21342a);
        g.a.f21391a.a(this.f21349j, cVar, new AnonymousClass7(dVar, i));
    }

    private void a(String str, com.anythink.expressad.foundation.d.d dVar) {
        com.anythink.expressad.foundation.e.c cVar = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19774j);
        cVar.a(str);
        a(cVar, dVar);
    }

    private void a(com.anythink.expressad.foundation.d.e eVar, int i) {
        ArrayList arrayList;
        com.anythink.expressad.foundation.e.c cVar;
        ArrayList<com.anythink.expressad.foundation.d.d> arrayList2;
        com.anythink.expressad.foundation.d.d dVar = null;
        if (eVar == null || eVar.f19467K == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            com.anythink.expressad.foundation.d.d dVar2 = eVar.f19467K.get(0);
            dVar2.l(this.f21344d);
            this.f21361y = eVar.c();
            if (dVar2.P() != 99 && (!TextUtils.isEmpty(dVar2.b()) || !TextUtils.isEmpty(dVar2.c()))) {
                if (v.a(dVar2)) {
                    dVar2.k(v.a(this.i, dVar2.bi()) ? 1 : 2);
                }
                if (l.a(this.i, dVar2)) {
                    arrayList.add(dVar2);
                } else {
                    this.f21339D = com.anythink.expressad.reward.a.d.f21021a;
                }
            }
        }
        if (arrayList != null && arrayList.size() > 0) {
            h();
            arrayList.size();
            com.anythink.expressad.foundation.d.d dVar3 = (com.anythink.expressad.foundation.d.d) arrayList.get(0);
            if (TextUtils.isEmpty(dVar3.b()) && (TextUtils.isEmpty(dVar3.c()) || !dVar3.c().contains("<MBTPLMARK>"))) {
                dVar3.a(false);
                dVar3.b(true);
            } else {
                dVar3.a(true);
                dVar3.b(false);
            }
            ATSplashView aTSplashView = this.f21349j;
            if (aTSplashView != null) {
                aTSplashView.setDynamicView(false);
            }
            if (dVar3.j()) {
                d(dVar3, i);
            } else {
                ATSplashView aTSplashView2 = this.f21349j;
                if (aTSplashView2 != null) {
                    aTSplashView2.setSplashWebview();
                }
            }
            if (d.a(this.f21349j, dVar3)) {
                b(dVar3, i);
                return;
            }
            this.f21349j.clearResState();
            if (!TextUtils.isEmpty(dVar3.b()) && !dVar3.j()) {
                this.f21360x = new AnonymousClass5(dVar3, i);
                com.anythink.expressad.foundation.g.g.a.e eVar2 = new com.anythink.expressad.foundation.g.g.a.e();
                eVar2.b();
                eVar2.a();
                eVar2.a(dVar3);
                eVar2.a(dVar3.aD() != null ? dVar3.aD().f19318a : 0);
                i.a().b(dVar3.b(), (i.a) this.f21360x);
            }
            if (dVar3.j()) {
                return;
            }
            if (!TextUtils.isEmpty(dVar3.c())) {
                com.anythink.core.common.v.b.b.a().a(new AnonymousClass4(dVar3, i));
            }
            if (!TextUtils.isEmpty(dVar3.T())) {
                this.f21359w = new AnonymousClass8(dVar3);
                CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                copyOnWriteArrayList.add(dVar3);
                com.anythink.expressad.videocommon.b.e.a().a(this.f21344d, copyOnWriteArrayList, com.anythink.expressad.foundation.g.a.aZ, this.f21359w);
                if (!com.anythink.expressad.videocommon.b.e.a().a(com.anythink.expressad.foundation.g.a.aZ, this.f21344d, dVar3.B())) {
                    com.anythink.expressad.videocommon.b.e.a().d(this.f21344d);
                } else {
                    this.f21349j.setVideoReady(true);
                    b(dVar3, i);
                }
            }
            if (TextUtils.isEmpty(dVar3.bm())) {
                return;
            }
            d(dVar3, i);
            return;
        }
        if (this.f21339D.contains("INSTALLED")) {
            cVar = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19785u, com.anythink.expressad.reward.a.d.f21021a);
        } else {
            cVar = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19769d);
        }
        if (eVar != null && (arrayList2 = eVar.f19467K) != null && arrayList2.size() != 0) {
            dVar = eVar.f19467K.get(0);
        }
        a(cVar, dVar);
    }

    public static /* synthetic */ void a(e eVar, String str, com.anythink.expressad.foundation.d.d dVar, int i) {
        g.c cVar = new g.c();
        cVar.c(eVar.f21344d);
        cVar.b(eVar.f21345e);
        cVar.a(dVar);
        cVar.a(str);
        cVar.b(eVar.f21351o);
        cVar.a(eVar.f21352p);
        cVar.a(eVar.f21342a);
        g.a.f21391a.a(eVar.f21349j, cVar, eVar.new AnonymousClass7(dVar, i));
    }

    public static /* synthetic */ void a(e eVar, String str, com.anythink.expressad.foundation.d.d dVar) {
        com.anythink.expressad.foundation.e.c cVar = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19774j);
        cVar.a(str);
        eVar.a(cVar, dVar);
    }
}
