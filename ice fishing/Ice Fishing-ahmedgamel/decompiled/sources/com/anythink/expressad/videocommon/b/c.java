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
    public static final String f23006a = "2000077";

    /* renamed from: b, reason: collision with root package name */
    protected static final String f23007b = "CampaignDownLoadTask";

    /* renamed from: d, reason: collision with root package name */
    private static final long f23008d = -510642107992871538L;

    /* renamed from: e, reason: collision with root package name */
    private static final int f23009e = 1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f23010f = 2000;

    /* renamed from: h, reason: collision with root package name */
    private static final int f23011h = 1;
    private static final int i = 2;

    /* renamed from: j, reason: collision with root package name */
    private static final int f23012j = 3;

    /* renamed from: k, reason: collision with root package name */
    private static final int f23013k = 4;

    /* renamed from: l, reason: collision with root package name */
    private static final int f23014l = 5;

    /* renamed from: m, reason: collision with root package name */
    private static final String f23015m = "errorMsg";

    /* renamed from: p, reason: collision with root package name */
    private static final int f23016p = 10010;

    /* renamed from: A, reason: collision with root package name */
    private Object f23017A;

    /* renamed from: B, reason: collision with root package name */
    private Class f23018B;

    /* renamed from: C, reason: collision with root package name */
    private Object f23019C;

    /* renamed from: D, reason: collision with root package name */
    private com.anythink.expressad.foundation.d.d f23020D;

    /* renamed from: E, reason: collision with root package name */
    private String f23021E;

    /* renamed from: G, reason: collision with root package name */
    private Context f23023G;

    /* renamed from: H, reason: collision with root package name */
    private long f23024H;

    /* renamed from: I, reason: collision with root package name */
    private String f23025I;

    /* renamed from: L, reason: collision with root package name */
    private String f23027L;

    /* renamed from: O, reason: collision with root package name */
    private long f23030O;

    /* renamed from: P, reason: collision with root package name */
    private com.anythink.expressad.videocommon.d.c f23031P;

    /* renamed from: Q, reason: collision with root package name */
    private com.anythink.expressad.videocommon.d.c f23032Q;

    /* renamed from: U, reason: collision with root package name */
    private String f23036U;

    /* renamed from: V, reason: collision with root package name */
    private b.a f23037V;

    /* renamed from: Z, reason: collision with root package name */
    private int f23040Z;

    /* renamed from: c, reason: collision with root package name */
    b f23041c;

    /* renamed from: o, reason: collision with root package name */
    private boolean f23044o;

    /* renamed from: q, reason: collision with root package name */
    private int f23045q;

    /* renamed from: r, reason: collision with root package name */
    private String f23046r;

    /* renamed from: s, reason: collision with root package name */
    private String f23047s;

    /* renamed from: t, reason: collision with root package name */
    private Runnable f23048t;

    /* renamed from: w, reason: collision with root package name */
    private f f23051w;

    /* renamed from: x, reason: collision with root package name */
    private ExecutorService f23052x;

    /* renamed from: y, reason: collision with root package name */
    private p f23053y;

    /* renamed from: z, reason: collision with root package name */
    private Class f23054z;

    /* renamed from: g, reason: collision with root package name */
    private boolean f23042g = false;

    /* renamed from: n, reason: collision with root package name */
    private int f23043n = 1;

    /* renamed from: u, reason: collision with root package name */
    private volatile int f23049u = 0;

    /* renamed from: v, reason: collision with root package name */
    private CopyOnWriteArrayList<f> f23050v = new CopyOnWriteArrayList<>();

    /* renamed from: F, reason: collision with root package name */
    private boolean f23022F = false;
    private long J = 0;

    /* renamed from: K, reason: collision with root package name */
    private int f23026K = 0;

    /* renamed from: M, reason: collision with root package name */
    private boolean f23028M = false;

    /* renamed from: N, reason: collision with root package name */
    private boolean f23029N = false;

    /* renamed from: R, reason: collision with root package name */
    private int f23033R = 100;

    /* renamed from: S, reason: collision with root package name */
    private boolean f23034S = false;

    /* renamed from: T, reason: collision with root package name */
    private boolean f23035T = false;

    /* renamed from: W, reason: collision with root package name */
    private int f23038W = 1;

    /* renamed from: X, reason: collision with root package name */
    private f f23039X = new f() { // from class: com.anythink.expressad.videocommon.b.c.1
        @Override // com.anythink.expressad.videocommon.b.f
        public final void a(long j6, int i4) {
            if (c.this.f23022F) {
                return;
            }
            c.a(c.this, j6, i4);
        }
    };
    private Handler Y = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.videocommon.b.c.2
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == 1) {
                c cVar = c.this;
                c.a(cVar, cVar.J, c.this.f23049u);
                return;
            }
            if (i4 == 2) {
                if (c.this.f23049u != 2) {
                    c.this.f23049u = 2;
                    c cVar2 = c.this;
                    c.a(cVar2, cVar2.J, c.this.f23049u);
                    return;
                }
                return;
            }
            if (i4 == 3) {
                if (c.this.f23049u == 4 || c.this.f23049u == 2 || c.this.f23049u == 5) {
                    return;
                }
                c.this.f23049u = 4;
                c cVar3 = c.this;
                c.a(cVar3, cVar3.J, c.this.f23049u);
                return;
            }
            if (i4 == 4) {
                c.this.f23049u = 5;
                c.d(c.this);
                c cVar4 = c.this;
                c.a(cVar4, cVar4.J, c.this.f23049u);
                return;
            }
            if (i4 == 5) {
                c.this.h();
            } else if (i4 == c.f23016p && message.obj != null) {
                c.s();
            }
        }
    };

    public c(Context context, com.anythink.expressad.foundation.d.d dVar, ExecutorService executorService, String str) {
        this.f23044o = false;
        if (context == null && dVar == null) {
            return;
        }
        this.f23030O = System.currentTimeMillis();
        this.f23023G = com.anythink.expressad.foundation.b.a.c().e();
        this.f23020D = dVar;
        this.f23021E = str;
        this.f23052x = executorService;
        if (dVar != null) {
            this.f23025I = dVar.T();
        }
        this.f23036U = com.anythink.expressad.foundation.h.p.d(this.f23025I);
        a.a();
        this.f23027L = a.a(this.f23025I);
        this.f23044o = false;
        try {
            if (!TextUtils.isEmpty(this.f23025I) && this.f23043n != 3) {
                x();
            }
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    private void A() {
        try {
            if (this.f23054z != null) {
                if (this.f23017A == null) {
                }
                if (this.f23018B != null && this.f23019C != null) {
                    return;
                }
                Class<?> cls = Class.forName("com.anythink.expressad.atnative.controller.NativeController");
                this.f23018B = cls;
                this.f23019C = cls.newInstance();
                this.f23018B.getMethod("insertExcludeId", String.class, com.anythink.expressad.foundation.d.d.class).invoke(this.f23019C, this.f23021E, this.f23020D);
            }
            int i4 = com.anythink.expressad.reward.b.a.f21108a;
            this.f23054z = com.anythink.expressad.reward.b.a.class;
            this.f23017A = com.anythink.expressad.reward.b.a.class.newInstance();
            this.f23054z.getMethod("insertExcludeId", String.class, com.anythink.expressad.foundation.d.d.class).invoke(this.f23017A, this.f23021E, this.f23020D);
            if (this.f23018B != null) {
                return;
            }
            Class<?> cls2 = Class.forName("com.anythink.expressad.atnative.controller.NativeController");
            this.f23018B = cls2;
            this.f23019C = cls2.newInstance();
            this.f23018B.getMethod("insertExcludeId", String.class, com.anythink.expressad.foundation.d.d.class).invoke(this.f23019C, this.f23021E, this.f23020D);
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    private static void B() {
    }

    private void C() {
        String str;
        Message obtain = Message.obtain();
        obtain.what = f23016p;
        if (this.f23020D == null || TextUtils.isEmpty(this.f23021E) || TextUtils.isEmpty(this.f23020D.aa()) || TextUtils.isEmpty(this.f23020D.T())) {
            str = "";
        } else {
            str = "key=2000077&unit_id=" + this.f23021E + "&request_id=" + this.f23020D.aa() + "&request_id_notice=" + this.f23020D.ac() + "&package_name=" + com.anythink.expressad.foundation.b.a.c().b() + "&app_id=" + com.anythink.expressad.foundation.b.a.c().f() + "&video_url=" + URLEncoder.encode(this.f23020D.T()) + "&process_size=" + this.J + "&file_size=" + this.f23024H + "&ready_rate=" + this.f23033R + "&cd_rate=" + this.f23045q + "&cid=" + this.f23020D.bh() + "&type=" + this.f23049u;
        }
        obtain.obj = str;
        this.Y.sendMessage(obtain);
    }

    private static void D() {
        com.anythink.expressad.foundation.b.a.c().e();
    }

    private String E() {
        if (this.f23020D == null || TextUtils.isEmpty(this.f23021E) || TextUtils.isEmpty(this.f23020D.aa()) || TextUtils.isEmpty(this.f23020D.T())) {
            return "";
        }
        return "key=2000077&unit_id=" + this.f23021E + "&request_id=" + this.f23020D.aa() + "&request_id_notice=" + this.f23020D.ac() + "&package_name=" + com.anythink.expressad.foundation.b.a.c().b() + "&app_id=" + com.anythink.expressad.foundation.b.a.c().f() + "&video_url=" + URLEncoder.encode(this.f23020D.T()) + "&process_size=" + this.J + "&file_size=" + this.f23024H + "&ready_rate=" + this.f23033R + "&cd_rate=" + this.f23045q + "&cid=" + this.f23020D.bh() + "&type=" + this.f23049u;
    }

    public static /* synthetic */ boolean d(c cVar) {
        cVar.f23042g = false;
        return false;
    }

    public static /* synthetic */ void s() {
        com.anythink.expressad.foundation.b.a.c().e();
    }

    private void t() {
        try {
            if (!TextUtils.isEmpty(this.f23025I) && this.f23043n != 3) {
                x();
            }
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    private void u() {
        if (this.f23041c == null) {
            b bVar = new b(this.f23025I, this.f23033R, this.f23038W);
            this.f23041c = bVar;
            bVar.a(new a.b() { // from class: com.anythink.expressad.videocommon.b.c.3
                @Override // com.anythink.core.common.res.b.a.b
                public final void a(a.C0095a c0095a) {
                }

                @Override // com.anythink.core.common.res.b.a.b
                public final boolean a(int i4, long j6, long j9) {
                    if (c.this.f23024H != j9) {
                        c.this.f23024H = j9;
                    }
                    c cVar = c.this;
                    c.a(cVar, j6, cVar.f23049u);
                    if (i4 >= c.this.f23033R) {
                        c.this.g();
                        c.this.q();
                        return true;
                    }
                    if (c.this.f23049u != 2 && c.this.f23049u != 4) {
                        return false;
                    }
                    int i6 = c.this.f23049u == 4 ? 3 : 2;
                    Message obtain = Message.obtain();
                    obtain.what = i6;
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
        if (this.f23034S) {
            return;
        }
        this.f23034S = true;
        com.anythink.expressad.videocommon.d.c cVar = this.f23031P;
        if (cVar != null) {
            cVar.a(this.f23025I);
        }
        com.anythink.expressad.videocommon.d.c cVar2 = this.f23032Q;
        if (cVar2 != null) {
            cVar2.a(this.f23025I);
        }
    }

    private boolean w() {
        return this.f23022F;
    }

    private void x() {
        com.anythink.core.common.a.n a9;
        a.a();
        this.f23027L = a.a(this.f23025I);
        File file = new File(this.f23027L);
        if (file.length() > 0) {
            this.J = file.length();
        } else {
            this.J = 0L;
        }
        if (this.f23024H != 0 || (a9 = com.anythink.core.common.a.o.a().a(this.f23025I)) == null) {
            return;
        }
        this.f23024H = a9.d();
    }

    private f y() {
        return this.f23039X;
    }

    private static void z() {
    }

    public final void h() {
        if (TextUtils.isEmpty(this.f23025I)) {
            return;
        }
        if (this.f23049u == 5) {
            v();
            return;
        }
        if (this.f23043n == 3) {
            g();
            return;
        }
        if (this.f23033R == 0) {
            g();
            return;
        }
        x();
        u();
        if (this.f23041c != null) {
            this.f23049u = 1;
            this.f23022F = true;
            this.f23041c.a();
        }
    }

    public final void i() {
        x();
        u();
        if (this.f23041c != null) {
            this.f23049u = 1;
            this.f23022F = true;
            this.f23041c.b();
        }
    }

    public final void j() {
        A();
        this.f23049u = 4;
    }

    public final int k() {
        return this.f23049u;
    }

    public final void l() {
        this.f23049u = 0;
    }

    public final String m() {
        if (this.f23043n == 3) {
            return "";
        }
        File file = new File(this.f23027L);
        try {
            return file.length() > 0 ? file.canRead() ? file.length() > 0 ? "" : "file length is 0 " : "file can not read " : "file is not exist ";
        } catch (Throwable th) {
            String message = th.getMessage();
            if (com.anythink.expressad.a.f18405a) {
                th.printStackTrace();
            }
            return message;
        }
    }

    public final com.anythink.expressad.foundation.d.d n() {
        return this.f23020D;
    }

    public final void o() {
        if (this.f23050v != null) {
            this.f23050v = null;
        }
    }

    public final long p() {
        return this.J;
    }

    public final void q() {
        String str;
        Message obtain = Message.obtain();
        obtain.what = f23016p;
        if (this.f23020D == null || TextUtils.isEmpty(this.f23021E) || TextUtils.isEmpty(this.f23020D.aa()) || TextUtils.isEmpty(this.f23020D.T())) {
            str = "";
        } else {
            str = "key=2000077&unit_id=" + this.f23021E + "&request_id=" + this.f23020D.aa() + "&request_id_notice=" + this.f23020D.ac() + "&package_name=" + com.anythink.expressad.foundation.b.a.c().b() + "&app_id=" + com.anythink.expressad.foundation.b.a.c().f() + "&video_url=" + URLEncoder.encode(this.f23020D.T()) + "&process_size=" + this.J + "&file_size=" + this.f23024H + "&ready_rate=" + this.f23033R + "&cd_rate=" + this.f23045q + "&cid=" + this.f23020D.bh() + "&type=" + this.f23049u;
        }
        obtain.obj = str;
        this.Y.sendMessage(obtain);
    }

    public final String r() {
        return this.f23046r;
    }

    public final void b(int i4) {
        this.f23045q = i4;
    }

    public final void c(int i4) {
        this.f23038W = i4;
    }

    public final boolean d() {
        return this.f23029N;
    }

    public final String e() {
        return this.f23027L;
    }

    public final long f() {
        return this.f23024H;
    }

    public final void g() {
        Message obtain = Message.obtain();
        this.f23049u = 5;
        obtain.what = 4;
        this.Y.sendMessage(obtain);
    }

    public final boolean b() {
        return this.f23035T;
    }

    public final long c() {
        return this.f23030O;
    }

    public final void d(int i4) {
        this.f23033R = i4;
    }

    public final void e(int i4) {
        this.f23040Z = i4;
    }

    private void c(String str) {
        this.f23026K++;
        try {
            Context context = this.f23023G;
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
        if (this.f23026K <= 1) {
            this.Y.sendEmptyMessageDelayed(5, com.anythink.basead.exoplayer.i.a.f8669f);
            return;
        }
        A();
        com.anythink.expressad.videocommon.d.c cVar = this.f23031P;
        if (cVar != null) {
            cVar.a(str, this.f23025I);
        }
        com.anythink.expressad.videocommon.d.c cVar2 = this.f23032Q;
        if (cVar2 != null) {
            cVar2.a(str, this.f23025I);
        }
        this.f23049u = 4;
        Message obtain = Message.obtain();
        obtain.what = 3;
        this.Y.sendMessage(obtain);
    }

    public final void a(int i4) {
        this.f23043n = i4;
    }

    public final void b(boolean z6) {
        this.f23029N = z6;
    }

    private void b(String str) {
        com.anythink.expressad.videocommon.d.c cVar = this.f23031P;
        if (cVar != null) {
            cVar.a(str, this.f23025I);
        }
        com.anythink.expressad.videocommon.d.c cVar2 = this.f23032Q;
        if (cVar2 != null) {
            cVar2.a(str, this.f23025I);
        }
        this.f23049u = 4;
        Message obtain = Message.obtain();
        obtain.what = 3;
        this.Y.sendMessage(obtain);
    }

    public final String a() {
        return this.f23025I;
    }

    public final void a(boolean z6) {
        if (!z6) {
            this.f23044o = false;
        }
        this.f23035T = z6;
    }

    private static double a(double d9, double d10, int i4) {
        if (i4 >= 0) {
            return new BigDecimal(Double.toString(d9)).divide(new BigDecimal(Double.toString(d10)), i4, 4).doubleValue();
        }
        throw new IllegalAccessException("Accuracy cannot be less than 0");
    }

    public final void a(com.anythink.expressad.foundation.d.d dVar) {
        this.f23020D = dVar;
    }

    private void b(com.anythink.expressad.videocommon.d.c cVar) {
        this.f23032Q = cVar;
    }

    public final void a(com.anythink.expressad.videocommon.d.c cVar) {
        this.f23031P = cVar;
    }

    private void b(f fVar) {
        CopyOnWriteArrayList<f> copyOnWriteArrayList = this.f23050v;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(fVar);
        }
    }

    public final void a(f fVar) {
        this.f23051w = fVar;
    }

    private void a(long j6, int i4) {
        this.J = j6;
        int i6 = this.f23033R;
        if (100 * j6 >= i6 * this.f23024H && !this.f23034S && i4 != 4) {
            if (i6 == 100 && i4 != 5) {
                this.f23049u = 5;
                return;
            }
            v();
        }
        if (this.f23022F) {
            CopyOnWriteArrayList<f> copyOnWriteArrayList = this.f23050v;
            if (copyOnWriteArrayList != null) {
                Iterator<f> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    f next = it.next();
                    if (next != null) {
                        next.a(j6, i4);
                    }
                }
            }
            if (this.f23051w != null) {
                if (this.f23049u == 5 || this.f23049u == 4 || this.f23049u == 2 || this.f23049u == 6) {
                    this.f23051w.a(j6, i4);
                    this.f23051w = null;
                }
            }
        }
    }

    public final void a(String str) {
        this.f23046r = str;
    }

    public static /* synthetic */ void a(c cVar, long j6, int i4) {
        cVar.J = j6;
        int i6 = cVar.f23033R;
        if (100 * j6 >= i6 * cVar.f23024H && !cVar.f23034S && i4 != 4) {
            if (i6 == 100 && i4 != 5) {
                cVar.f23049u = 5;
                return;
            }
            cVar.v();
        }
        if (cVar.f23022F) {
            CopyOnWriteArrayList<f> copyOnWriteArrayList = cVar.f23050v;
            if (copyOnWriteArrayList != null) {
                Iterator<f> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    f next = it.next();
                    if (next != null) {
                        next.a(j6, i4);
                    }
                }
            }
            if (cVar.f23051w != null) {
                if (cVar.f23049u == 5 || cVar.f23049u == 4 || cVar.f23049u == 2 || cVar.f23049u == 6) {
                    cVar.f23051w.a(j6, i4);
                    cVar.f23051w = null;
                }
            }
        }
    }

    public static /* synthetic */ void a(c cVar, String str) {
        cVar.f23026K++;
        try {
            Context context = cVar.f23023G;
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
        if (cVar.f23026K <= 1) {
            cVar.Y.sendEmptyMessageDelayed(5, com.anythink.basead.exoplayer.i.a.f8669f);
            return;
        }
        cVar.A();
        com.anythink.expressad.videocommon.d.c cVar2 = cVar.f23031P;
        if (cVar2 != null) {
            cVar2.a(str, cVar.f23025I);
        }
        com.anythink.expressad.videocommon.d.c cVar3 = cVar.f23032Q;
        if (cVar3 != null) {
            cVar3.a(str, cVar.f23025I);
        }
        cVar.f23049u = 4;
        Message obtain = Message.obtain();
        obtain.what = 3;
        cVar.Y.sendMessage(obtain);
    }
}
