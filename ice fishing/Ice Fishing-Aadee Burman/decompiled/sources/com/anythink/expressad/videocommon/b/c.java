package com.anythink.expressad.videocommon.b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.anythink.core.common.res.b.a;
import com.anythink.expressad.foundation.g.f.d.b;
import java.io.File;
import java.io.Serializable;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class c implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final String f22219a = "2000077";

    /* renamed from: b, reason: collision with root package name */
    protected static final String f22220b = "CampaignDownLoadTask";

    /* renamed from: d, reason: collision with root package name */
    private static final long f22221d = -510642107992871538L;

    /* renamed from: e, reason: collision with root package name */
    private static final int f22222e = 1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f22223f = 2000;

    /* renamed from: h, reason: collision with root package name */
    private static final int f22224h = 1;
    private static final int i = 2;

    /* renamed from: j, reason: collision with root package name */
    private static final int f22225j = 3;

    /* renamed from: k, reason: collision with root package name */
    private static final int f22226k = 4;

    /* renamed from: l, reason: collision with root package name */
    private static final int f22227l = 5;

    /* renamed from: m, reason: collision with root package name */
    private static final String f22228m = "errorMsg";

    /* renamed from: p, reason: collision with root package name */
    private static final int f22229p = 10010;

    /* renamed from: A, reason: collision with root package name */
    private Object f22230A;

    /* renamed from: B, reason: collision with root package name */
    private Class f22231B;

    /* renamed from: C, reason: collision with root package name */
    private Object f22232C;

    /* renamed from: D, reason: collision with root package name */
    private com.anythink.expressad.foundation.d.d f22233D;

    /* renamed from: E, reason: collision with root package name */
    private String f22234E;

    /* renamed from: G, reason: collision with root package name */
    private Context f22236G;

    /* renamed from: H, reason: collision with root package name */
    private long f22237H;

    /* renamed from: I, reason: collision with root package name */
    private String f22238I;

    /* renamed from: L, reason: collision with root package name */
    private String f22240L;

    /* renamed from: O, reason: collision with root package name */
    private long f22243O;

    /* renamed from: P, reason: collision with root package name */
    private com.anythink.expressad.videocommon.d.c f22244P;

    /* renamed from: Q, reason: collision with root package name */
    private com.anythink.expressad.videocommon.d.c f22245Q;

    /* renamed from: U, reason: collision with root package name */
    private String f22249U;

    /* renamed from: V, reason: collision with root package name */
    private b.a f22250V;

    /* renamed from: Z, reason: collision with root package name */
    private int f22253Z;

    /* renamed from: c, reason: collision with root package name */
    b f22254c;

    /* renamed from: o, reason: collision with root package name */
    private boolean f22257o;

    /* renamed from: q, reason: collision with root package name */
    private int f22258q;

    /* renamed from: r, reason: collision with root package name */
    private String f22259r;

    /* renamed from: s, reason: collision with root package name */
    private String f22260s;

    /* renamed from: t, reason: collision with root package name */
    private Runnable f22261t;

    /* renamed from: w, reason: collision with root package name */
    private f f22264w;

    /* renamed from: x, reason: collision with root package name */
    private ExecutorService f22265x;

    /* renamed from: y, reason: collision with root package name */
    private p f22266y;

    /* renamed from: z, reason: collision with root package name */
    private Class f22267z;

    /* renamed from: g, reason: collision with root package name */
    private boolean f22255g = false;

    /* renamed from: n, reason: collision with root package name */
    private int f22256n = 1;

    /* renamed from: u, reason: collision with root package name */
    private volatile int f22262u = 0;

    /* renamed from: v, reason: collision with root package name */
    private CopyOnWriteArrayList<f> f22263v = new CopyOnWriteArrayList<>();

    /* renamed from: F, reason: collision with root package name */
    private boolean f22235F = false;
    private long J = 0;

    /* renamed from: K, reason: collision with root package name */
    private int f22239K = 0;

    /* renamed from: M, reason: collision with root package name */
    private boolean f22241M = false;

    /* renamed from: N, reason: collision with root package name */
    private boolean f22242N = false;

    /* renamed from: R, reason: collision with root package name */
    private int f22246R = 100;

    /* renamed from: S, reason: collision with root package name */
    private boolean f22247S = false;

    /* renamed from: T, reason: collision with root package name */
    private boolean f22248T = false;

    /* renamed from: W, reason: collision with root package name */
    private int f22251W = 1;

    /* renamed from: X, reason: collision with root package name */
    private f f22252X = new f() { // from class: com.anythink.expressad.videocommon.b.c.1
        @Override // com.anythink.expressad.videocommon.b.f
        public final void a(long j6, int i6) {
            if (c.this.f22235F) {
                return;
            }
            c.a(c.this, j6, i6);
        }
    };
    private Handler Y = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.videocommon.b.c.2
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i6 = message.what;
            if (i6 == 1) {
                c cVar = c.this;
                c.a(cVar, cVar.J, c.this.f22262u);
                return;
            }
            if (i6 == 2) {
                if (c.this.f22262u != 2) {
                    c.this.f22262u = 2;
                    c cVar2 = c.this;
                    c.a(cVar2, cVar2.J, c.this.f22262u);
                    return;
                }
                return;
            }
            if (i6 == 3) {
                if (c.this.f22262u == 4 || c.this.f22262u == 2 || c.this.f22262u == 5) {
                    return;
                }
                c.this.f22262u = 4;
                c cVar3 = c.this;
                c.a(cVar3, cVar3.J, c.this.f22262u);
                return;
            }
            if (i6 == 4) {
                c.this.f22262u = 5;
                c.d(c.this);
                c cVar4 = c.this;
                c.a(cVar4, cVar4.J, c.this.f22262u);
                return;
            }
            if (i6 == 5) {
                c.this.h();
            } else if (i6 == c.f22229p && message.obj != null) {
                c.s();
            }
        }
    };

    public c(Context context, com.anythink.expressad.foundation.d.d dVar, ExecutorService executorService, String str) {
        this.f22257o = false;
        if (context == null && dVar == null) {
            return;
        }
        this.f22243O = System.currentTimeMillis();
        this.f22236G = com.anythink.expressad.foundation.b.a.c().e();
        this.f22233D = dVar;
        this.f22234E = str;
        this.f22265x = executorService;
        if (dVar != null) {
            this.f22238I = dVar.T();
        }
        this.f22249U = com.anythink.expressad.foundation.h.p.d(this.f22238I);
        a.a();
        this.f22240L = a.a(this.f22238I);
        this.f22257o = false;
        try {
            if (!TextUtils.isEmpty(this.f22238I) && this.f22256n != 3) {
                x();
            }
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    private void A() {
        try {
            if (this.f22267z != null) {
                if (this.f22230A == null) {
                }
                if (this.f22231B != null && this.f22232C != null) {
                    return;
                }
                Class<?> cls = Class.forName("com.anythink.expressad.atnative.controller.NativeController");
                this.f22231B = cls;
                this.f22232C = cls.newInstance();
                this.f22231B.getMethod("insertExcludeId", String.class, com.anythink.expressad.foundation.d.d.class).invoke(this.f22232C, this.f22234E, this.f22233D);
            }
            int i6 = com.anythink.expressad.reward.b.a.f20321a;
            this.f22267z = com.anythink.expressad.reward.b.a.class;
            this.f22230A = com.anythink.expressad.reward.b.a.class.newInstance();
            this.f22267z.getMethod("insertExcludeId", String.class, com.anythink.expressad.foundation.d.d.class).invoke(this.f22230A, this.f22234E, this.f22233D);
            if (this.f22231B != null) {
                return;
            }
            Class<?> cls2 = Class.forName("com.anythink.expressad.atnative.controller.NativeController");
            this.f22231B = cls2;
            this.f22232C = cls2.newInstance();
            this.f22231B.getMethod("insertExcludeId", String.class, com.anythink.expressad.foundation.d.d.class).invoke(this.f22232C, this.f22234E, this.f22233D);
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    private static void B() {
    }

    private void C() {
        String str;
        Message obtain = Message.obtain();
        obtain.what = f22229p;
        if (this.f22233D == null || TextUtils.isEmpty(this.f22234E) || TextUtils.isEmpty(this.f22233D.aa()) || TextUtils.isEmpty(this.f22233D.T())) {
            str = "";
        } else {
            str = "key=2000077&unit_id=" + this.f22234E + "&request_id=" + this.f22233D.aa() + "&request_id_notice=" + this.f22233D.ac() + "&package_name=" + com.anythink.expressad.foundation.b.a.c().b() + "&app_id=" + com.anythink.expressad.foundation.b.a.c().f() + "&video_url=" + URLEncoder.encode(this.f22233D.T()) + "&process_size=" + this.J + "&file_size=" + this.f22237H + "&ready_rate=" + this.f22246R + "&cd_rate=" + this.f22258q + "&cid=" + this.f22233D.bh() + "&type=" + this.f22262u;
        }
        obtain.obj = str;
        this.Y.sendMessage(obtain);
    }

    private static void D() {
        com.anythink.expressad.foundation.b.a.c().e();
    }

    private String E() {
        if (this.f22233D == null || TextUtils.isEmpty(this.f22234E) || TextUtils.isEmpty(this.f22233D.aa()) || TextUtils.isEmpty(this.f22233D.T())) {
            return "";
        }
        return "key=2000077&unit_id=" + this.f22234E + "&request_id=" + this.f22233D.aa() + "&request_id_notice=" + this.f22233D.ac() + "&package_name=" + com.anythink.expressad.foundation.b.a.c().b() + "&app_id=" + com.anythink.expressad.foundation.b.a.c().f() + "&video_url=" + URLEncoder.encode(this.f22233D.T()) + "&process_size=" + this.J + "&file_size=" + this.f22237H + "&ready_rate=" + this.f22246R + "&cd_rate=" + this.f22258q + "&cid=" + this.f22233D.bh() + "&type=" + this.f22262u;
    }

    public static /* synthetic */ boolean d(c cVar) {
        cVar.f22255g = false;
        return false;
    }

    public static /* synthetic */ void s() {
        com.anythink.expressad.foundation.b.a.c().e();
    }

    private void t() {
        try {
            if (!TextUtils.isEmpty(this.f22238I) && this.f22256n != 3) {
                x();
            }
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    private void u() {
        if (this.f22254c == null) {
            b bVar = new b(this.f22238I, this.f22246R, this.f22251W);
            this.f22254c = bVar;
            bVar.a(new a.b() { // from class: com.anythink.expressad.videocommon.b.c.3
                @Override // com.anythink.core.common.res.b.a.b
                public final void a(a.C0095a c0095a) {
                }

                @Override // com.anythink.core.common.res.b.a.b
                public final boolean a(int i6, long j6, long j9) {
                    if (c.this.f22237H != j9) {
                        c.this.f22237H = j9;
                    }
                    c cVar = c.this;
                    c.a(cVar, j6, cVar.f22262u);
                    if (i6 >= c.this.f22246R) {
                        c.this.g();
                        c.this.q();
                        return true;
                    }
                    if (c.this.f22262u != 2 && c.this.f22262u != 4) {
                        return false;
                    }
                    int i9 = c.this.f22262u == 4 ? 3 : 2;
                    Message obtain = Message.obtain();
                    obtain.what = i9;
                    c.this.Y.sendMessage(obtain);
                    return true;
                }

                @Override // com.anythink.core.common.res.b.a.b
                public final void a(String str, String str2) {
                    c.a(c.this, "errorCode:" + str + ",errorMsg:" + str2);
                }
            });
        }
    }

    private void v() {
        if (this.f22247S) {
            return;
        }
        this.f22247S = true;
        com.anythink.expressad.videocommon.d.c cVar = this.f22244P;
        if (cVar != null) {
            cVar.a(this.f22238I);
        }
        com.anythink.expressad.videocommon.d.c cVar2 = this.f22245Q;
        if (cVar2 != null) {
            cVar2.a(this.f22238I);
        }
    }

    private boolean w() {
        return this.f22235F;
    }

    private void x() {
        com.anythink.core.common.a.n a9;
        a.a();
        this.f22240L = a.a(this.f22238I);
        File file = new File(this.f22240L);
        if (file.length() > 0) {
            this.J = file.length();
        } else {
            this.J = 0L;
        }
        if (this.f22237H != 0 || (a9 = com.anythink.core.common.a.o.a().a(this.f22238I)) == null) {
            return;
        }
        this.f22237H = a9.d();
    }

    private f y() {
        return this.f22252X;
    }

    private static void z() {
    }

    public final void h() {
        if (TextUtils.isEmpty(this.f22238I)) {
            return;
        }
        if (this.f22262u == 5) {
            v();
            return;
        }
        if (this.f22256n == 3) {
            g();
            return;
        }
        if (this.f22246R == 0) {
            g();
            return;
        }
        x();
        u();
        if (this.f22254c != null) {
            this.f22262u = 1;
            this.f22235F = true;
            this.f22254c.a();
        }
    }

    public final void i() {
        x();
        u();
        if (this.f22254c != null) {
            this.f22262u = 1;
            this.f22235F = true;
            this.f22254c.b();
        }
    }

    public final void j() {
        A();
        this.f22262u = 4;
    }

    public final int k() {
        return this.f22262u;
    }

    public final void l() {
        this.f22262u = 0;
    }

    public final String m() {
        if (this.f22256n == 3) {
            return "";
        }
        File file = new File(this.f22240L);
        try {
            return file.length() > 0 ? file.canRead() ? file.length() > 0 ? "" : "file length is 0 " : "file can not read " : "file is not exist ";
        } catch (Throwable th) {
            String message = th.getMessage();
            if (com.anythink.expressad.a.f17618a) {
                th.printStackTrace();
            }
            return message;
        }
    }

    public final com.anythink.expressad.foundation.d.d n() {
        return this.f22233D;
    }

    public final void o() {
        if (this.f22263v != null) {
            this.f22263v = null;
        }
    }

    public final long p() {
        return this.J;
    }

    public final void q() {
        String str;
        Message obtain = Message.obtain();
        obtain.what = f22229p;
        if (this.f22233D == null || TextUtils.isEmpty(this.f22234E) || TextUtils.isEmpty(this.f22233D.aa()) || TextUtils.isEmpty(this.f22233D.T())) {
            str = "";
        } else {
            str = "key=2000077&unit_id=" + this.f22234E + "&request_id=" + this.f22233D.aa() + "&request_id_notice=" + this.f22233D.ac() + "&package_name=" + com.anythink.expressad.foundation.b.a.c().b() + "&app_id=" + com.anythink.expressad.foundation.b.a.c().f() + "&video_url=" + URLEncoder.encode(this.f22233D.T()) + "&process_size=" + this.J + "&file_size=" + this.f22237H + "&ready_rate=" + this.f22246R + "&cd_rate=" + this.f22258q + "&cid=" + this.f22233D.bh() + "&type=" + this.f22262u;
        }
        obtain.obj = str;
        this.Y.sendMessage(obtain);
    }

    public final String r() {
        return this.f22259r;
    }

    public final void b(int i6) {
        this.f22258q = i6;
    }

    public final void c(int i6) {
        this.f22251W = i6;
    }

    public final boolean d() {
        return this.f22242N;
    }

    public final String e() {
        return this.f22240L;
    }

    public final long f() {
        return this.f22237H;
    }

    public final void g() {
        Message obtain = Message.obtain();
        this.f22262u = 5;
        obtain.what = 4;
        this.Y.sendMessage(obtain);
    }

    public final boolean b() {
        return this.f22248T;
    }

    public final long c() {
        return this.f22243O;
    }

    public final void d(int i6) {
        this.f22246R = i6;
    }

    public final void e(int i6) {
        this.f22253Z = i6;
    }

    private void c(String str) {
        this.f22239K++;
        try {
            Context context = this.f22236G;
            if (context != null) {
                Object systemService = context.getSystemService("connectivity");
                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                if (connectivityManager != null && connectivityManager.getActiveNetworkInfo() != null) {
                    if (!connectivityManager.getActiveNetworkInfo().isAvailable()) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (this.f22239K <= 1) {
            this.Y.sendEmptyMessageDelayed(5, com.anythink.basead.exoplayer.i.a.f7883f);
            return;
        }
        A();
        com.anythink.expressad.videocommon.d.c cVar = this.f22244P;
        if (cVar != null) {
            cVar.a(str, this.f22238I);
        }
        com.anythink.expressad.videocommon.d.c cVar2 = this.f22245Q;
        if (cVar2 != null) {
            cVar2.a(str, this.f22238I);
        }
        this.f22262u = 4;
        Message obtain = Message.obtain();
        obtain.what = 3;
        this.Y.sendMessage(obtain);
    }

    public final void a(int i6) {
        this.f22256n = i6;
    }

    public final void b(boolean z3) {
        this.f22242N = z3;
    }

    private void b(String str) {
        com.anythink.expressad.videocommon.d.c cVar = this.f22244P;
        if (cVar != null) {
            cVar.a(str, this.f22238I);
        }
        com.anythink.expressad.videocommon.d.c cVar2 = this.f22245Q;
        if (cVar2 != null) {
            cVar2.a(str, this.f22238I);
        }
        this.f22262u = 4;
        Message obtain = Message.obtain();
        obtain.what = 3;
        this.Y.sendMessage(obtain);
    }

    public final String a() {
        return this.f22238I;
    }

    public final void a(boolean z3) {
        if (!z3) {
            this.f22257o = false;
        }
        this.f22248T = z3;
    }

    private static double a(double d2, double d9, int i6) {
        if (i6 >= 0) {
            return new BigDecimal(Double.toString(d2)).divide(new BigDecimal(Double.toString(d9)), i6, 4).doubleValue();
        }
        throw new IllegalAccessException("Accuracy cannot be less than 0");
    }

    public final void a(com.anythink.expressad.foundation.d.d dVar) {
        this.f22233D = dVar;
    }

    private void b(com.anythink.expressad.videocommon.d.c cVar) {
        this.f22245Q = cVar;
    }

    public final void a(com.anythink.expressad.videocommon.d.c cVar) {
        this.f22244P = cVar;
    }

    private void b(f fVar) {
        CopyOnWriteArrayList<f> copyOnWriteArrayList = this.f22263v;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(fVar);
        }
    }

    public final void a(f fVar) {
        this.f22264w = fVar;
    }

    private void a(long j6, int i6) {
        this.J = j6;
        int i9 = this.f22246R;
        if (100 * j6 >= i9 * this.f22237H && !this.f22247S && i6 != 4) {
            if (i9 == 100 && i6 != 5) {
                this.f22262u = 5;
                return;
            }
            v();
        }
        if (this.f22235F) {
            CopyOnWriteArrayList<f> copyOnWriteArrayList = this.f22263v;
            if (copyOnWriteArrayList != null) {
                Iterator<f> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    f next = it.next();
                    if (next != null) {
                        next.a(j6, i6);
                    }
                }
            }
            if (this.f22264w != null) {
                if (this.f22262u == 5 || this.f22262u == 4 || this.f22262u == 2 || this.f22262u == 6) {
                    this.f22264w.a(j6, i6);
                    this.f22264w = null;
                }
            }
        }
    }

    public final void a(String str) {
        this.f22259r = str;
    }

    public static /* synthetic */ void a(c cVar, long j6, int i6) {
        cVar.J = j6;
        int i9 = cVar.f22246R;
        if (100 * j6 >= i9 * cVar.f22237H && !cVar.f22247S && i6 != 4) {
            if (i9 == 100 && i6 != 5) {
                cVar.f22262u = 5;
                return;
            }
            cVar.v();
        }
        if (cVar.f22235F) {
            CopyOnWriteArrayList<f> copyOnWriteArrayList = cVar.f22263v;
            if (copyOnWriteArrayList != null) {
                Iterator<f> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    f next = it.next();
                    if (next != null) {
                        next.a(j6, i6);
                    }
                }
            }
            if (cVar.f22264w != null) {
                if (cVar.f22262u == 5 || cVar.f22262u == 4 || cVar.f22262u == 2 || cVar.f22262u == 6) {
                    cVar.f22264w.a(j6, i6);
                    cVar.f22264w = null;
                }
            }
        }
    }

    public static /* synthetic */ void a(c cVar, String str) {
        cVar.f22239K++;
        try {
            Context context = cVar.f22236G;
            if (context != null) {
                Object systemService = context.getSystemService("connectivity");
                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                if (connectivityManager != null && connectivityManager.getActiveNetworkInfo() != null) {
                    if (!connectivityManager.getActiveNetworkInfo().isAvailable()) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (cVar.f22239K <= 1) {
            cVar.Y.sendEmptyMessageDelayed(5, com.anythink.basead.exoplayer.i.a.f7883f);
            return;
        }
        cVar.A();
        com.anythink.expressad.videocommon.d.c cVar2 = cVar.f22244P;
        if (cVar2 != null) {
            cVar2.a(str, cVar.f22238I);
        }
        com.anythink.expressad.videocommon.d.c cVar3 = cVar.f22245Q;
        if (cVar3 != null) {
            cVar3.a(str, cVar.f22238I);
        }
        cVar.f22262u = 4;
        Message obtain = Message.obtain();
        obtain.what = 3;
        cVar.Y.sendMessage(obtain);
    }
}
