package com.anythink.core.common.v;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.common.d.u;
import java.io.File;

/* loaded from: classes.dex */
public class ac {

    /* renamed from: f, reason: collision with root package name */
    private static volatile ac f16626f;

    /* renamed from: k, reason: collision with root package name */
    private volatile String f16635k;

    /* renamed from: l, reason: collision with root package name */
    private volatile String f16636l;

    /* renamed from: m, reason: collision with root package name */
    private volatile String f16637m;

    /* renamed from: n, reason: collision with root package name */
    private volatile String f16638n;

    /* renamed from: p, reason: collision with root package name */
    private File f16640p;

    /* renamed from: e, reason: collision with root package name */
    private final String f16631e = "ac";

    /* renamed from: g, reason: collision with root package name */
    private final String f16632g = k.b("aHR0cHM6Ly9kMnExeTd0aXIyODF4Ni5jbG91ZGZyb250Lm5ldC9vbXNkay9vbXNka192MS41LjIuanM=");

    /* renamed from: h, reason: collision with root package name */
    private final String f16633h = k.b("aHR0cHM6Ly9kMnExeTd0aXIyODF4Ni5jbG91ZGZyb250Lm5ldC9vbXNkay9vbXNka193ZWJ2aWV3X2luamVjdGlvbl9jb250ZW50LnR4dA==");
    private final String i = "omsdk_sdk_js.txt";

    /* renamed from: j, reason: collision with root package name */
    private final String f16634j = "omsdk_webview_injection_content.txt";

    /* renamed from: o, reason: collision with root package name */
    private final String f16639o = "anythink_omsdk/";

    /* renamed from: a, reason: collision with root package name */
    boolean f16627a = false;

    /* renamed from: b, reason: collision with root package name */
    boolean f16628b = false;

    /* renamed from: c, reason: collision with root package name */
    final String f16629c = "omsdk_sdk_js_url";

    /* renamed from: d, reason: collision with root package name */
    final String f16630d = "omsdk_webview_injection_content_url";

    /* renamed from: q, reason: collision with root package name */
    private final Object f16641q = new Object();

    /* renamed from: r, reason: collision with root package name */
    private String f16642r = "";

    /* renamed from: s, reason: collision with root package name */
    private String f16643s = "";

    /* renamed from: t, reason: collision with root package name */
    private String f16644t = "";

    /* renamed from: u, reason: collision with root package name */
    private String f16645u = "";

    /* renamed from: com.anythink.core.common.v.ac$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16652a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f16653b;

        public AnonymousClass4(String str, String str2) {
            this.f16652a = str;
            this.f16653b = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (ac.this.f16641q) {
                try {
                    if (!ac.this.f16640p.exists()) {
                        ac.this.f16640p.mkdirs();
                    }
                    File file = new File(ac.this.f16640p, this.f16652a);
                    if (file.exists()) {
                        file.delete();
                    }
                    w.a(this.f16653b.getBytes(), file);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static boolean d() {
        return D.y.h().b(com.anythink.core.common.d.t.b().p()).aK() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void f(Context context) {
        if (context == null) {
            try {
                context = com.anythink.core.common.d.t.b().g();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f16642r = af.c(context, u.b.f12847a, "omsdk_sdk_js_url", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void g(Context context) {
        if (context == null) {
            try {
                context = com.anythink.core.common.d.t.b().g();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f16644t = af.c(context, u.b.f12847a, "omsdk_webview_injection_content_url", "");
    }

    public final void c(final Context context) {
        if (b(context)) {
            this.f16627a = true;
            try {
                new com.anythink.core.common.m.h(this.f16635k).a(1, new com.anythink.core.common.m.q() { // from class: com.anythink.core.common.v.ac.2
                    @Override // com.anythink.core.common.m.q
                    public final void onLoadCanceled(int i) {
                        ac.this.f16627a = false;
                    }

                    @Override // com.anythink.core.common.m.q
                    public final void onLoadError(int i, String str, AdError adError) {
                        ac acVar = ac.this;
                        acVar.f16643s = acVar.f16635k;
                        ac acVar2 = ac.this;
                        acVar2.f16627a = false;
                        com.anythink.core.common.u.e.a(1, acVar2.f16635k, adError != null ? adError.printStackTrace() : "");
                    }

                    @Override // com.anythink.core.common.m.q
                    public final void onLoadFinish(int i, Object obj) {
                        String obj2 = obj != null ? obj.toString() : "";
                        String unused = ac.this.f16631e;
                        String unused2 = ac.this.f16635k;
                        obj2.length();
                        if (!TextUtils.isEmpty(obj2)) {
                            ac acVar = ac.this;
                            acVar.a(context, acVar.f16635k);
                            ac.this.f16636l = obj2;
                            ac.a(ac.this, obj2, "omsdk_sdk_js.txt");
                        }
                        ac.this.f16627a = false;
                    }

                    @Override // com.anythink.core.common.m.q
                    public final void onLoadStart(int i) {
                    }
                });
            } catch (Throwable unused) {
                this.f16627a = false;
            }
        }
    }

    public final void e(final Context context) {
        if (d(context)) {
            this.f16628b = true;
            try {
                new com.anythink.core.common.m.h(this.f16637m).a(1, new com.anythink.core.common.m.q() { // from class: com.anythink.core.common.v.ac.3
                    @Override // com.anythink.core.common.m.q
                    public final void onLoadCanceled(int i) {
                        ac.this.f16628b = false;
                    }

                    @Override // com.anythink.core.common.m.q
                    public final void onLoadError(int i, String str, AdError adError) {
                        ac acVar = ac.this;
                        acVar.f16645u = acVar.f16637m;
                        ac acVar2 = ac.this;
                        acVar2.f16628b = false;
                        com.anythink.core.common.u.e.a(2, acVar2.f16637m, adError != null ? adError.printStackTrace() : "");
                    }

                    @Override // com.anythink.core.common.m.q
                    public final void onLoadFinish(int i, Object obj) {
                        String obj2 = obj != null ? obj.toString() : "";
                        String unused = ac.this.f16631e;
                        String unused2 = ac.this.f16637m;
                        obj2.length();
                        if (!TextUtils.isEmpty(obj2)) {
                            ac acVar = ac.this;
                            acVar.b(context, acVar.f16637m);
                            ac.this.f16638n = obj2;
                            ac.a(ac.this, obj2, "omsdk_webview_injection_content.txt");
                        }
                        ac.this.f16628b = false;
                    }

                    @Override // com.anythink.core.common.m.q
                    public final void onLoadStart(int i) {
                    }
                });
            } catch (Throwable unused) {
                this.f16628b = false;
            }
        }
    }

    private synchronized String f() {
        return this.f16644t;
    }

    public static ac a() {
        if (f16626f == null) {
            synchronized (ac.class) {
                try {
                    if (f16626f == null) {
                        f16626f = new ac();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16626f;
    }

    public final boolean b(Context context) {
        boolean z3;
        String str;
        if (this.f16627a) {
            return false;
        }
        com.anythink.core.d.b g4 = D.y.g(com.anythink.core.d.d.a(context));
        if (g4 != null && !g4.S()) {
            z3 = d();
        } else {
            com.anythink.core.common.d.t.b();
            z3 = true;
        }
        if (!z3) {
            return false;
        }
        if (g4 != null && !g4.S()) {
            str = g4.aM();
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            str = this.f16632g;
        }
        if (TextUtils.isEmpty(str) || TextUtils.equals(this.f16643s, str)) {
            return false;
        }
        String e9 = e();
        if (!TextUtils.isEmpty(e9) && TextUtils.equals(e9, str)) {
            if (TextUtils.isEmpty(this.f16636l)) {
                this.f16636l = a("omsdk_sdk_js.txt");
            }
            return false;
        }
        this.f16635k = str;
        return true;
    }

    private synchronized String e() {
        return this.f16642r;
    }

    public final String c() {
        if (!d()) {
            return "";
        }
        return this.f16638n;
    }

    public final boolean d(Context context) {
        boolean z3;
        String str;
        if (this.f16628b) {
            return false;
        }
        com.anythink.core.d.b g4 = D.y.g(com.anythink.core.d.d.a(context));
        if (g4 != null && !g4.S()) {
            z3 = d();
        } else {
            com.anythink.core.common.d.t.b();
            z3 = true;
        }
        if (!z3) {
            return false;
        }
        if (g4 != null && !g4.S()) {
            str = g4.aL();
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            str = this.f16633h;
        }
        if (TextUtils.isEmpty(str) || TextUtils.equals(this.f16645u, str)) {
            return false;
        }
        String f3 = f();
        if (!TextUtils.isEmpty(f3) && TextUtils.equals(f3, str)) {
            if (TextUtils.isEmpty(this.f16638n)) {
                this.f16638n = a("omsdk_webview_injection_content.txt");
            }
            return false;
        }
        this.f16637m = str;
        return true;
    }

    public final void a(final Context context) {
        try {
            this.f16640p = new File(com.anythink.core.common.d.t.b().g().getFilesDir().getAbsoluteFile().getAbsolutePath() + "/anythink_omsdk/");
        } catch (Throwable unused) {
        }
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.v.ac.1
            @Override // java.lang.Runnable
            public final void run() {
                ac.this.f(context);
                ac.this.g(context);
                ac acVar = ac.this;
                acVar.f16636l = acVar.a("omsdk_sdk_js.txt");
                ac acVar2 = ac.this;
                acVar2.f16638n = acVar2.a("omsdk_webview_injection_content.txt");
            }
        }, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized String a(String str) {
        String str2;
        synchronized (this.f16641q) {
            str2 = "";
            try {
                File file = new File(this.f16640p, str);
                if (file.exists() && file.canRead()) {
                    str2 = w.a(file);
                }
            } catch (Throwable unused) {
            }
        }
        return str2;
    }

    private void a(String str, String str2) {
        com.anythink.core.common.v.b.b.a().b(new AnonymousClass4(str2, str), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(Context context, String str) {
        this.f16642r = str;
        af.b(context, u.b.f12847a, "omsdk_sdk_js_url", str);
    }

    public final String b() {
        if (!d()) {
            return "";
        }
        return this.f16636l;
    }

    public static /* synthetic */ void a(ac acVar, String str, String str2) {
        com.anythink.core.common.v.b.b.a().b(acVar.new AnonymousClass4(str2, str), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(Context context, String str) {
        this.f16644t = str;
        af.b(context, u.b.f12847a, "omsdk_webview_injection_content_url", str);
    }
}
