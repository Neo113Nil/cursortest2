package com.anythink.core.common.v;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.common.d.u;
import java.io.File;

/* loaded from: classes.dex */
public class ac {

    /* renamed from: f, reason: collision with root package name */
    private static volatile ac f17413f;

    /* renamed from: k, reason: collision with root package name */
    private volatile String f17422k;

    /* renamed from: l, reason: collision with root package name */
    private volatile String f17423l;

    /* renamed from: m, reason: collision with root package name */
    private volatile String f17424m;

    /* renamed from: n, reason: collision with root package name */
    private volatile String f17425n;

    /* renamed from: p, reason: collision with root package name */
    private File f17427p;

    /* renamed from: e, reason: collision with root package name */
    private final String f17418e = "ac";

    /* renamed from: g, reason: collision with root package name */
    private final String f17419g = k.b("aHR0cHM6Ly9kMnExeTd0aXIyODF4Ni5jbG91ZGZyb250Lm5ldC9vbXNkay9vbXNka192MS41LjIuanM=");

    /* renamed from: h, reason: collision with root package name */
    private final String f17420h = k.b("aHR0cHM6Ly9kMnExeTd0aXIyODF4Ni5jbG91ZGZyb250Lm5ldC9vbXNkay9vbXNka193ZWJ2aWV3X2luamVjdGlvbl9jb250ZW50LnR4dA==");
    private final String i = "omsdk_sdk_js.txt";

    /* renamed from: j, reason: collision with root package name */
    private final String f17421j = "omsdk_webview_injection_content.txt";

    /* renamed from: o, reason: collision with root package name */
    private final String f17426o = "anythink_omsdk/";

    /* renamed from: a, reason: collision with root package name */
    boolean f17414a = false;

    /* renamed from: b, reason: collision with root package name */
    boolean f17415b = false;

    /* renamed from: c, reason: collision with root package name */
    final String f17416c = "omsdk_sdk_js_url";

    /* renamed from: d, reason: collision with root package name */
    final String f17417d = "omsdk_webview_injection_content_url";

    /* renamed from: q, reason: collision with root package name */
    private final Object f17428q = new Object();

    /* renamed from: r, reason: collision with root package name */
    private String f17429r = "";

    /* renamed from: s, reason: collision with root package name */
    private String f17430s = "";

    /* renamed from: t, reason: collision with root package name */
    private String f17431t = "";

    /* renamed from: u, reason: collision with root package name */
    private String f17432u = "";

    /* renamed from: com.anythink.core.common.v.ac$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f17439a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f17440b;

        public AnonymousClass4(String str, String str2) {
            this.f17439a = str;
            this.f17440b = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (ac.this.f17428q) {
                try {
                    if (!ac.this.f17427p.exists()) {
                        ac.this.f17427p.mkdirs();
                    }
                    File file = new File(ac.this.f17427p, this.f17439a);
                    if (file.exists()) {
                        file.delete();
                    }
                    w.a(this.f17440b.getBytes(), file);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static boolean d() {
        return com.IceFishing.LiveIceFishing.k.l().b(com.anythink.core.common.d.t.b().p()).aK() == 1;
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
        this.f17429r = af.c(context, u.b.f13633a, "omsdk_sdk_js_url", "");
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
        this.f17431t = af.c(context, u.b.f13633a, "omsdk_webview_injection_content_url", "");
    }

    public final void c(final Context context) {
        if (b(context)) {
            this.f17414a = true;
            try {
                new com.anythink.core.common.m.h(this.f17422k).a(1, new com.anythink.core.common.m.q() { // from class: com.anythink.core.common.v.ac.2
                    @Override // com.anythink.core.common.m.q
                    public final void onLoadCanceled(int i) {
                        ac.this.f17414a = false;
                    }

                    @Override // com.anythink.core.common.m.q
                    public final void onLoadError(int i, String str, AdError adError) {
                        ac acVar = ac.this;
                        acVar.f17430s = acVar.f17422k;
                        ac acVar2 = ac.this;
                        acVar2.f17414a = false;
                        com.anythink.core.common.u.e.a(1, acVar2.f17422k, adError != null ? adError.printStackTrace() : "");
                    }

                    @Override // com.anythink.core.common.m.q
                    public final void onLoadFinish(int i, Object obj) {
                        String obj2 = obj != null ? obj.toString() : "";
                        String unused = ac.this.f17418e;
                        String unused2 = ac.this.f17422k;
                        obj2.length();
                        if (!TextUtils.isEmpty(obj2)) {
                            ac acVar = ac.this;
                            acVar.a(context, acVar.f17422k);
                            ac.this.f17423l = obj2;
                            ac.a(ac.this, obj2, "omsdk_sdk_js.txt");
                        }
                        ac.this.f17414a = false;
                    }

                    @Override // com.anythink.core.common.m.q
                    public final void onLoadStart(int i) {
                    }
                });
            } catch (Throwable unused) {
                this.f17414a = false;
            }
        }
    }

    public final void e(final Context context) {
        if (d(context)) {
            this.f17415b = true;
            try {
                new com.anythink.core.common.m.h(this.f17424m).a(1, new com.anythink.core.common.m.q() { // from class: com.anythink.core.common.v.ac.3
                    @Override // com.anythink.core.common.m.q
                    public final void onLoadCanceled(int i) {
                        ac.this.f17415b = false;
                    }

                    @Override // com.anythink.core.common.m.q
                    public final void onLoadError(int i, String str, AdError adError) {
                        ac acVar = ac.this;
                        acVar.f17432u = acVar.f17424m;
                        ac acVar2 = ac.this;
                        acVar2.f17415b = false;
                        com.anythink.core.common.u.e.a(2, acVar2.f17424m, adError != null ? adError.printStackTrace() : "");
                    }

                    @Override // com.anythink.core.common.m.q
                    public final void onLoadFinish(int i, Object obj) {
                        String obj2 = obj != null ? obj.toString() : "";
                        String unused = ac.this.f17418e;
                        String unused2 = ac.this.f17424m;
                        obj2.length();
                        if (!TextUtils.isEmpty(obj2)) {
                            ac acVar = ac.this;
                            acVar.b(context, acVar.f17424m);
                            ac.this.f17425n = obj2;
                            ac.a(ac.this, obj2, "omsdk_webview_injection_content.txt");
                        }
                        ac.this.f17415b = false;
                    }

                    @Override // com.anythink.core.common.m.q
                    public final void onLoadStart(int i) {
                    }
                });
            } catch (Throwable unused) {
                this.f17415b = false;
            }
        }
    }

    private synchronized String f() {
        return this.f17431t;
    }

    public static ac a() {
        if (f17413f == null) {
            synchronized (ac.class) {
                try {
                    if (f17413f == null) {
                        f17413f = new ac();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17413f;
    }

    public final boolean b(Context context) {
        boolean z6;
        String str;
        if (this.f17414a) {
            return false;
        }
        com.anythink.core.d.b k9 = com.IceFishing.LiveIceFishing.k.k(com.anythink.core.d.d.a(context));
        if (k9 != null && !k9.S()) {
            z6 = d();
        } else {
            com.anythink.core.common.d.t.b();
            z6 = true;
        }
        if (!z6) {
            return false;
        }
        if (k9 != null && !k9.S()) {
            str = k9.aM();
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            str = this.f17419g;
        }
        if (TextUtils.isEmpty(str) || TextUtils.equals(this.f17430s, str)) {
            return false;
        }
        String e9 = e();
        if (!TextUtils.isEmpty(e9) && TextUtils.equals(e9, str)) {
            if (TextUtils.isEmpty(this.f17423l)) {
                this.f17423l = a("omsdk_sdk_js.txt");
            }
            return false;
        }
        this.f17422k = str;
        return true;
    }

    private synchronized String e() {
        return this.f17429r;
    }

    public final String c() {
        if (!d()) {
            return "";
        }
        return this.f17425n;
    }

    public final boolean d(Context context) {
        boolean z6;
        String str;
        if (this.f17415b) {
            return false;
        }
        com.anythink.core.d.b k9 = com.IceFishing.LiveIceFishing.k.k(com.anythink.core.d.d.a(context));
        if (k9 != null && !k9.S()) {
            z6 = d();
        } else {
            com.anythink.core.common.d.t.b();
            z6 = true;
        }
        if (!z6) {
            return false;
        }
        if (k9 != null && !k9.S()) {
            str = k9.aL();
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            str = this.f17420h;
        }
        if (TextUtils.isEmpty(str) || TextUtils.equals(this.f17432u, str)) {
            return false;
        }
        String f2 = f();
        if (!TextUtils.isEmpty(f2) && TextUtils.equals(f2, str)) {
            if (TextUtils.isEmpty(this.f17425n)) {
                this.f17425n = a("omsdk_webview_injection_content.txt");
            }
            return false;
        }
        this.f17424m = str;
        return true;
    }

    public final void a(final Context context) {
        try {
            this.f17427p = new File(com.anythink.core.common.d.t.b().g().getFilesDir().getAbsoluteFile().getAbsolutePath() + "/anythink_omsdk/");
        } catch (Throwable unused) {
        }
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.v.ac.1
            @Override // java.lang.Runnable
            public final void run() {
                ac.this.f(context);
                ac.this.g(context);
                ac acVar = ac.this;
                acVar.f17423l = acVar.a("omsdk_sdk_js.txt");
                ac acVar2 = ac.this;
                acVar2.f17425n = acVar2.a("omsdk_webview_injection_content.txt");
            }
        }, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized String a(String str) {
        String str2;
        synchronized (this.f17428q) {
            str2 = "";
            try {
                File file = new File(this.f17427p, str);
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
        this.f17429r = str;
        af.b(context, u.b.f13633a, "omsdk_sdk_js_url", str);
    }

    public final String b() {
        if (!d()) {
            return "";
        }
        return this.f17423l;
    }

    public static /* synthetic */ void a(ac acVar, String str, String str2) {
        com.anythink.core.common.v.b.b.a().b(acVar.new AnonymousClass4(str2, str), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(Context context, String str) {
        this.f17431t = str;
        af.b(context, u.b.f13633a, "omsdk_webview_injection_content_url", str);
    }
}
