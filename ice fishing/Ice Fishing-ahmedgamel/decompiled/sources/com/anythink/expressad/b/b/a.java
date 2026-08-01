package com.anythink.expressad.b.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.anythink.core.common.d.t;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.h.z;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import u.AbstractC5049e;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static String f18149a = "mtg_retry_report=1";

    /* renamed from: b, reason: collision with root package name */
    public static int f18150b = 10000;

    /* renamed from: c, reason: collision with root package name */
    public static final int f18151c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f18152d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static int f18153e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static int f18154f = 50;

    /* renamed from: g, reason: collision with root package name */
    public static int f18155g = 600000;

    /* renamed from: h, reason: collision with root package name */
    public static int f18156h = 0;
    public static int i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static int f18157j = 2;

    /* renamed from: k, reason: collision with root package name */
    public static int f18158k = 3;

    /* renamed from: l, reason: collision with root package name */
    public static int f18159l = 4;

    /* renamed from: m, reason: collision with root package name */
    public static int f18160m = 5;

    /* renamed from: n, reason: collision with root package name */
    private static String f18161n = "RetryReportControl";

    /* renamed from: q, reason: collision with root package name */
    private static int f18162q;

    /* renamed from: r, reason: collision with root package name */
    private static int f18163r;

    /* renamed from: o, reason: collision with root package name */
    private ConcurrentHashMap<String, com.anythink.expressad.b.b.b> f18164o;

    /* renamed from: p, reason: collision with root package name */
    private c f18165p;

    /* renamed from: s, reason: collision with root package name */
    private BroadcastReceiver f18166s;

    /* renamed from: t, reason: collision with root package name */
    private final Handler f18167t;

    /* renamed from: com.anythink.expressad.b.b.a$1, reason: invalid class name */
    public class AnonymousClass1 extends BroadcastReceiver {
        public AnonymousClass1() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                a.this.f18167t.sendEmptyMessage(2);
            }
        }
    }

    /* renamed from: com.anythink.expressad.b.b.a$a, reason: collision with other inner class name */
    public static class C0115a {

        /* renamed from: a, reason: collision with root package name */
        private static a f18169a = new a(0);

        private C0115a() {
        }
    }

    public static class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                a.a(a.a());
            } else {
                Object obj = message.obj;
                if (obj instanceof String) {
                    a.a().a((String) obj, com.anythink.expressad.b.b.b.f18170a);
                }
            }
        }
    }

    public /* synthetic */ a(byte b9) {
        this();
    }

    private void c() {
        try {
            if (this.f18166s == null) {
                this.f18166s = new AnonymousClass1();
                Context g4 = t.b().g();
                if (g4 != null) {
                    g4.registerReceiver(this.f18166s, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    private void d() {
        Context g4;
        if (this.f18166s == null || (g4 = t.b().g()) == null) {
            return;
        }
        g4.unregisterReceiver(this.f18166s);
    }

    private a() {
        this.f18164o = new ConcurrentHashMap<>();
        this.f18165p = new c(f18154f);
        this.f18167t = new b(Looper.getMainLooper());
        com.anythink.expressad.f.b.a();
        com.anythink.expressad.foundation.b.a.c().f();
        com.anythink.expressad.f.a b9 = com.anythink.expressad.f.b.b();
        f18153e = b9.T();
        f18150b = b9.V() * 1000;
        f18155g = b9.U() * 1000;
        f18162q = b9.S();
        f18163r = b9.R();
        try {
            if (this.f18166s == null) {
                this.f18166s = new AnonymousClass1();
                Context g4 = t.b().g();
                if (g4 != null) {
                    g4.registerReceiver(this.f18166s, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public static a a() {
        return C0115a.f18169a;
    }

    private void b() {
        c cVar = this.f18165p;
        if (cVar != null) {
            Iterator<String> it = cVar.a().iterator();
            while (it.hasNext()) {
                a(it.next(), com.anythink.expressad.b.b.b.f18171b);
            }
        }
    }

    private void a(String str, com.anythink.expressad.b.b.b bVar) {
        if (this.f18165p == null) {
            this.f18165p = new c(f18154f);
        }
        this.f18165p.a(str, bVar);
    }

    private static boolean b(int i6) {
        return i6 == i || i6 == f18157j;
    }

    private void a(String str) {
        Message obtainMessage = this.f18167t.obtainMessage();
        obtainMessage.what = 1;
        obtainMessage.obj = str;
        this.f18167t.sendMessageDelayed(obtainMessage, f18150b);
    }

    private static boolean c(int i6) {
        return a(i6) || b(i6) || i6 == f18160m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i6) {
        String sb;
        c cVar = this.f18165p;
        if (cVar != null) {
            com.anythink.expressad.b.b.b b9 = cVar.b(str);
            this.f18165p.a(str);
            if (b9 == null) {
                com.anythink.expressad.b.b.b bVar = this.f18164o.get(str);
                if (bVar == null || System.currentTimeMillis() > bVar.h() + f18155g || bVar.g() >= f18153e || i6 == com.anythink.expressad.b.b.b.f18171b) {
                    return;
                }
                a(str);
                return;
            }
            if (System.currentTimeMillis() <= b9.h() + f18155g) {
                b9.a(i6);
                this.f18164o.put(str, b9);
                if (z.c(str) == 0) {
                    StringBuilder c9 = AbstractC5049e.c(str, "?");
                    c9.append(f18149a);
                    sb = c9.toString();
                } else {
                    StringBuilder c10 = AbstractC5049e.c(str, "&");
                    c10.append(f18149a);
                    sb = c10.toString();
                }
                com.anythink.expressad.b.a.a(t.b().g(), b9.f(), b9.e(), sb, b9.a(), b9.b(), b9.d());
            }
        }
    }

    private static boolean a(int i6) {
        return i6 == f18159l || i6 == f18158k;
    }

    public final void a(String str, String str2, d dVar, String str3, boolean z3, boolean z6, int i6) {
        if ((a(i6) || b(i6) || i6 == f18160m) && !TextUtils.isEmpty(str)) {
            String replace = str.replace("?" + f18149a, "").replace("&" + f18149a, "");
            if (this.f18164o == null) {
                this.f18164o = new ConcurrentHashMap<>();
            }
            com.anythink.expressad.b.b.b remove = this.f18164o.remove(replace);
            if (remove == null) {
                remove = new com.anythink.expressad.b.b.b(str, str2);
                remove.b(i6);
                remove.a(z3);
                remove.b(z6);
                remove.a(dVar);
                remove.a(str3);
            } else if (remove.c() != com.anythink.expressad.b.b.b.f18171b) {
                remove.b(str2);
            }
            if ((!a(i6) || f18162q == 0) && ((!b(i6) || f18163r == 0) && i6 != f18160m)) {
                return;
            }
            if (System.currentTimeMillis() < remove.h() + f18155g) {
                if (this.f18165p == null) {
                    this.f18165p = new c(f18154f);
                }
                this.f18165p.a(replace, remove);
                if (remove.c() != com.anythink.expressad.b.b.b.f18170a || remove.g() > f18153e) {
                    return;
                }
                a(replace);
                return;
            }
            remove.c();
        }
    }

    public static /* synthetic */ void a(a aVar) {
        c cVar = aVar.f18165p;
        if (cVar != null) {
            Iterator<String> it = cVar.a().iterator();
            while (it.hasNext()) {
                aVar.a(it.next(), com.anythink.expressad.b.b.b.f18171b);
            }
        }
    }
}
