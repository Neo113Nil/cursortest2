package com.anythink.expressad.reward.b;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.anythink.core.common.d.t;
import com.anythink.expressad.foundation.d.e;
import com.anythink.expressad.foundation.h.p;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.foundation.h.x;
import com.anythink.expressad.foundation.h.y;
import com.anythink.expressad.videocommon.b.j;
import com.anythink.expressad.videocommon.b.n;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a implements com.anythink.basead.f.c.c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f20321a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f20322b = 8;

    /* renamed from: c, reason: collision with root package name */
    public static final int f20323c = 9;

    /* renamed from: d, reason: collision with root package name */
    public static final int f20324d = 16;

    /* renamed from: e, reason: collision with root package name */
    public static final int f20325e = 18;

    /* renamed from: f, reason: collision with root package name */
    public static final int f20326f = 17;

    /* renamed from: g, reason: collision with root package name */
    public static final int f20327g = 1001001;

    /* renamed from: h, reason: collision with root package name */
    public static final int f20328h = 1001002;

    /* renamed from: j, reason: collision with root package name */
    public static String f20329j = null;

    /* renamed from: l, reason: collision with root package name */
    public static String f20330l = "";

    /* renamed from: s, reason: collision with root package name */
    private static final String f20332s = "RewardVideoController";

    /* renamed from: t, reason: collision with root package name */
    private static final int f20333t = 25;

    /* renamed from: A, reason: collision with root package name */
    private String f20334A;

    /* renamed from: B, reason: collision with root package name */
    private String f20335B;

    /* renamed from: C, reason: collision with root package name */
    private volatile String f20336C;

    /* renamed from: D, reason: collision with root package name */
    private String f20337D;

    /* renamed from: E, reason: collision with root package name */
    private String f20338E;

    /* renamed from: I, reason: collision with root package name */
    private int f20342I;
    private int J;

    /* renamed from: K, reason: collision with root package name */
    private int f20343K;

    /* renamed from: P, reason: collision with root package name */
    private boolean f20348P;

    /* renamed from: W, reason: collision with root package name */
    private Queue<Integer> f20353W;

    /* renamed from: X, reason: collision with root package name */
    private String f20354X;
    private CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> ag;
    private List<com.anythink.expressad.foundation.d.d> ah;

    /* renamed from: k, reason: collision with root package name */
    b f20356k;

    /* renamed from: u, reason: collision with root package name */
    private Context f20362u;

    /* renamed from: v, reason: collision with root package name */
    private com.anythink.expressad.reward.a.d f20363v;

    /* renamed from: w, reason: collision with root package name */
    private com.anythink.expressad.videocommon.e.d f20364w;

    /* renamed from: x, reason: collision with root package name */
    private com.anythink.expressad.videocommon.e.a f20365x;

    /* renamed from: y, reason: collision with root package name */
    private volatile com.anythink.expressad.videocommon.d.a f20366y;

    /* renamed from: z, reason: collision with root package name */
    private volatile c f20367z;

    /* renamed from: U, reason: collision with root package name */
    private static ConcurrentHashMap<String, Integer> f20319U = new ConcurrentHashMap<>();

    /* renamed from: m, reason: collision with root package name */
    public static ConcurrentHashMap<String, d> f20331m = new ConcurrentHashMap<>();

    /* renamed from: V, reason: collision with root package name */
    private static ConcurrentHashMap<String, String> f20320V = new ConcurrentHashMap<>();

    /* renamed from: F, reason: collision with root package name */
    private int f20339F = 0;

    /* renamed from: H, reason: collision with root package name */
    private int f20341H = 2;

    /* renamed from: L, reason: collision with root package name */
    private boolean f20344L = false;

    /* renamed from: M, reason: collision with root package name */
    private boolean f20345M = false;

    /* renamed from: N, reason: collision with root package name */
    private boolean f20346N = false;

    /* renamed from: O, reason: collision with root package name */
    private boolean f20347O = false;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f20349Q = false;

    /* renamed from: R, reason: collision with root package name */
    private ArrayList<Integer> f20350R = new ArrayList<>(7);

    /* renamed from: S, reason: collision with root package name */
    private boolean f20351S = false;
    public volatile boolean i = false;

    /* renamed from: T, reason: collision with root package name */
    private final Object f20352T = new Object();
    private com.anythink.expressad.foundation.c.c Y = null;

    /* renamed from: Z, reason: collision with root package name */
    private volatile boolean f20355Z = true;
    private volatile boolean aa = false;
    private volatile boolean ab = false;
    private volatile boolean ac = false;
    private volatile boolean ad = false;
    private volatile boolean ae = false;
    private volatile boolean af = false;

    /* renamed from: n, reason: collision with root package name */
    volatile boolean f20357n = false;

    /* renamed from: o, reason: collision with root package name */
    volatile boolean f20358o = false;

    /* renamed from: p, reason: collision with root package name */
    volatile boolean f20359p = false;

    /* renamed from: q, reason: collision with root package name */
    volatile boolean f20360q = false;

    /* renamed from: r, reason: collision with root package name */
    volatile boolean f20361r = false;

    /* renamed from: G, reason: collision with root package name */
    private Handler f20340G = new com.anythink.expressad.reward.b.b(this);

    /* renamed from: com.anythink.expressad.reward.b.a$a, reason: collision with other inner class name */
    public class RunnableC0130a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private com.anythink.expressad.reward.a.d f20369b;

        /* renamed from: c, reason: collision with root package name */
        private int f20370c = 1;

        /* renamed from: d, reason: collision with root package name */
        private boolean f20371d = true;

        /* renamed from: e, reason: collision with root package name */
        private boolean f20372e = false;

        public RunnableC0130a(com.anythink.expressad.reward.a.d dVar) {
            this.f20369b = dVar;
            if (dVar != null) {
                dVar.g(false);
            }
        }

        public final void a() {
            this.f20372e = true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f20372e) {
                return;
            }
            com.anythink.expressad.reward.a.d dVar = this.f20369b;
            if (dVar != null) {
                dVar.g(true);
            }
            a.this.b("v3 is timeout");
        }
    }

    public class b implements com.anythink.expressad.reward.a.b {

        /* renamed from: b, reason: collision with root package name */
        private com.anythink.expressad.reward.a.d f20374b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f20375c = true;

        /* renamed from: d, reason: collision with root package name */
        private RunnableC0130a f20376d;

        public b(com.anythink.expressad.reward.a.d dVar) {
            this.f20374b = dVar;
        }

        private Runnable c() {
            return this.f20376d;
        }

        public final void a(RunnableC0130a runnableC0130a) {
            this.f20376d = runnableC0130a;
        }

        @Override // com.anythink.expressad.reward.a.b
        public final void b() {
            RunnableC0130a runnableC0130a = this.f20376d;
            if (runnableC0130a != null) {
                runnableC0130a.a();
                a.this.f20340G.removeCallbacks(this.f20376d);
            }
            if (a.this.f20367z != null) {
                c.a(a.this.f20367z, a.this.f20336C, a.this.f20335B);
            }
        }

        @Override // com.anythink.expressad.reward.a.b
        public final void a() {
            if (this.f20376d != null) {
                a.this.f20340G.removeCallbacks(this.f20376d);
            }
            if (a.this.f20367z != null) {
                a.this.f20367z.a(a.this.f20336C, a.this.f20335B);
            }
        }

        @Override // com.anythink.expressad.reward.a.b
        public final void a(com.anythink.expressad.foundation.e.c cVar) {
            RunnableC0130a runnableC0130a = this.f20376d;
            if (runnableC0130a != null) {
                runnableC0130a.a();
                a.this.f20340G.removeCallbacks(this.f20376d);
            }
            com.anythink.expressad.reward.a.d dVar = this.f20374b;
            if (dVar != null) {
                dVar.a((com.anythink.expressad.reward.a.b) null);
                this.f20374b = null;
            }
            if (a.this.f20367z != null) {
                a.this.f20367z.a(cVar != null ? cVar.a() : "unknown reason");
            }
        }
    }

    public final class c {

        /* renamed from: b, reason: collision with root package name */
        private static final String f20377b = "RewardVideoController_Listener";

        /* renamed from: d, reason: collision with root package name */
        private static final int f20378d = 0;

        /* renamed from: e, reason: collision with root package name */
        private static final int f20379e = 1;

        /* renamed from: f, reason: collision with root package name */
        private static final int f20380f = 2;

        /* renamed from: g, reason: collision with root package name */
        private static final int f20381g = 3;

        /* renamed from: c, reason: collision with root package name */
        private WeakReference<com.anythink.expressad.videocommon.d.a> f20383c;

        /* renamed from: h, reason: collision with root package name */
        private volatile AtomicInteger f20384h;
        private Handler i;

        /* renamed from: j, reason: collision with root package name */
        private String f20385j;

        /* renamed from: k, reason: collision with root package name */
        private List<com.anythink.expressad.foundation.d.d> f20386k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f20387l;

        public /* synthetic */ c(a aVar, com.anythink.expressad.videocommon.d.a aVar2, Handler handler, String str, byte b9) {
            this(aVar2, handler, str);
        }

        private int a() {
            return this.f20384h.get();
        }

        private void c(String str, String str2) {
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = this.f20383c;
            com.anythink.expressad.videocommon.d.a aVar = weakReference != null ? weakReference.get() : null;
            this.f20384h.get();
            boolean unused = a.this.ab;
            if ((this.f20384h.get() == 1 || this.f20384h.get() == 3) && this.i != null) {
                if (a.this.ab) {
                    this.f20384h.get();
                    boolean unused2 = a.this.ab;
                    return;
                }
                this.f20384h.get();
                boolean unused3 = a.this.ab;
                a.h(a.this);
                if (aVar != null) {
                    Message obtain = Message.obtain();
                    Bundle bundle = new Bundle();
                    bundle.putString(com.anythink.expressad.a.f17642z, str);
                    bundle.putString("unit_id", str2);
                    bundle.putBoolean(com.anythink.expressad.a.f17624g, false);
                    obtain.setData(bundle);
                    obtain.obj = str2;
                    obtain.what = 17;
                    this.i.sendMessage(obtain);
                }
            }
        }

        private void d(String str, String str2) {
            this.f20384h.get();
            boolean unused = a.this.ab;
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = this.f20383c;
            com.anythink.expressad.videocommon.d.a aVar = weakReference != null ? weakReference.get() : null;
            if (this.i != null) {
                if (a.this.ab) {
                    this.f20384h.get();
                    boolean unused2 = a.this.ab;
                    return;
                }
                this.f20384h.get();
                boolean unused3 = a.this.ab;
                a.h(a.this);
                if (aVar != null) {
                    Message obtain = Message.obtain();
                    Bundle bundle = new Bundle();
                    bundle.putString(com.anythink.expressad.a.f17642z, str);
                    bundle.putString("unit_id", str2);
                    bundle.putBoolean(com.anythink.expressad.a.f17624g, true);
                    obtain.setData(bundle);
                    obtain.obj = str2;
                    obtain.what = 17;
                    this.i.sendMessage(obtain);
                }
            }
        }

        public final void b(String str, String str2) {
            Handler handler = this.i;
            if (handler != null) {
                handler.removeMessages(a.f20328h);
            }
            this.f20384h.get();
            boolean unused = a.this.ac;
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = this.f20383c;
            com.anythink.expressad.videocommon.d.a aVar = weakReference != null ? weakReference.get() : null;
            if (this.f20384h.get() == 2 || this.i == null) {
                return;
            }
            if (this.f20384h.get() == 1) {
                this.f20384h.set(3);
            }
            if (a.this.ac) {
                this.f20384h.get();
                boolean unused2 = a.this.ac;
                return;
            }
            this.f20384h.get();
            boolean unused3 = a.this.ac;
            a.j(a.this);
            if (aVar != null) {
                Message obtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(com.anythink.expressad.a.f17642z, str);
                bundle.putString("unit_id", str2);
                obtain.setData(bundle);
                obtain.obj = str2;
                obtain.what = 9;
                this.i.sendMessage(obtain);
            }
            if (a.this.ad) {
                this.f20384h.set(2);
            }
        }

        private c(com.anythink.expressad.videocommon.d.a aVar, Handler handler, String str) {
            this.f20383c = new WeakReference<>(aVar);
            this.f20384h = new AtomicInteger(0);
            this.i = handler;
            this.f20385j = str;
        }

        private void a(int i) {
            this.f20384h.set(i);
        }

        public final void a(String str, String str2) {
            Handler handler = this.i;
            if (handler != null) {
                handler.removeMessages(a.f20328h);
            }
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = this.f20383c;
            com.anythink.expressad.videocommon.d.a aVar = weakReference != null ? weakReference.get() : null;
            this.f20384h.get();
            boolean unused = a.this.ac;
            if (this.f20384h.get() == 2 || this.i == null) {
                return;
            }
            this.f20384h.set(2);
            if (!a.this.ac) {
                this.f20384h.get();
                boolean unused2 = a.this.ac;
                a.j(a.this);
                if (aVar != null) {
                    Message obtain = Message.obtain();
                    Bundle bundle = new Bundle();
                    bundle.putString(com.anythink.expressad.a.f17642z, str);
                    bundle.putString("unit_id", str2);
                    obtain.setData(bundle);
                    obtain.obj = str2;
                    obtain.what = 9;
                    this.i.sendMessage(obtain);
                    return;
                }
                return;
            }
            this.f20384h.get();
            boolean unused3 = a.this.ac;
        }

        private void c(String str) {
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = this.f20383c;
            if (weakReference != null) {
                weakReference.get();
            }
            if (this.i != null) {
                Message obtain = Message.obtain();
                obtain.obj = str;
                obtain.what = 18;
                this.i.sendMessage(obtain);
            }
        }

        private void d(String str) {
            Handler handler;
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = this.f20383c;
            com.anythink.expressad.videocommon.d.a aVar = weakReference != null ? weakReference.get() : null;
            this.f20384h.get();
            boolean unused = a.this.ae;
            if (this.f20384h.get() == 2 || (handler = this.i) == null) {
                return;
            }
            if (handler != null) {
                a.n(a.this);
                if (str.contains("resource load timeout")) {
                    a.l(a.this);
                }
                if (a.this.ae && a.this.ad && !a.this.ac) {
                    this.f20384h.set(2);
                    if (aVar != null) {
                        this.f20384h.get();
                        boolean unused2 = a.this.ae;
                        Message obtain = Message.obtain();
                        obtain.obj = str;
                        obtain.what = 16;
                        this.i.sendMessage(obtain);
                        return;
                    }
                    return;
                }
                return;
            }
            this.f20384h.get();
            boolean unused3 = a.this.ae;
        }

        public final void a(String str) {
            Handler handler = this.i;
            if (handler != null) {
                handler.removeMessages(a.f20328h);
            }
            this.f20384h.get();
            boolean unused = a.this.ad;
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = this.f20383c;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            if ((this.f20384h.get() == 1 || this.f20384h.get() == 3) && this.i != null) {
                a.l(a.this);
                if (!a.this.af || str.contains("resource load timeout")) {
                    a.n(a.this);
                }
                if (a.this.ac) {
                    this.f20384h.set(2);
                }
                if (a.this.ad && a.this.ae && !a.this.ac) {
                    this.f20384h.set(2);
                    this.f20384h.get();
                    boolean unused2 = a.this.ad;
                    Message obtain = Message.obtain();
                    obtain.obj = str;
                    obtain.what = 16;
                    this.i.sendMessage(obtain);
                    return;
                }
                this.f20384h.get();
                boolean unused3 = a.this.ad;
            }
        }

        private void b(String str) {
            this.f20384h.set(2);
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = this.f20383c;
            if (weakReference != null) {
                weakReference.get();
            }
            if (this.i != null) {
                Message obtain = Message.obtain();
                obtain.obj = str;
                obtain.what = 18;
                this.i.sendMessage(obtain);
            }
        }

        public static /* synthetic */ void b(c cVar) {
            cVar.f20384h.set(1);
        }

        private void a(boolean z3) {
            this.f20387l = z3;
        }

        public static /* synthetic */ void a(c cVar, String str) {
            cVar.f20384h.set(2);
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = cVar.f20383c;
            if (weakReference != null) {
                weakReference.get();
            }
            if (cVar.i != null) {
                Message obtain = Message.obtain();
                obtain.obj = str;
                obtain.what = 18;
                cVar.i.sendMessage(obtain);
            }
        }

        public static /* synthetic */ int a(c cVar) {
            return cVar.f20384h.get();
        }

        public static /* synthetic */ void a(c cVar, String str, String str2) {
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = cVar.f20383c;
            com.anythink.expressad.videocommon.d.a aVar = weakReference != null ? weakReference.get() : null;
            cVar.f20384h.get();
            boolean unused = a.this.ab;
            if ((cVar.f20384h.get() == 1 || cVar.f20384h.get() == 3) && cVar.i != null) {
                if (!a.this.ab) {
                    cVar.f20384h.get();
                    boolean unused2 = a.this.ab;
                    a.h(a.this);
                    if (aVar != null) {
                        Message obtain = Message.obtain();
                        Bundle bundle = new Bundle();
                        bundle.putString(com.anythink.expressad.a.f17642z, str);
                        bundle.putString("unit_id", str2);
                        bundle.putBoolean(com.anythink.expressad.a.f17624g, false);
                        obtain.setData(bundle);
                        obtain.obj = str2;
                        obtain.what = 17;
                        cVar.i.sendMessage(obtain);
                        return;
                    }
                    return;
                }
                cVar.f20384h.get();
                boolean unused3 = a.this.ab;
            }
        }
    }

    public final class d extends com.anythink.expressad.video.bt.module.b.c {

        /* renamed from: d, reason: collision with root package name */
        private a f20389d;

        /* renamed from: e, reason: collision with root package name */
        private Handler f20390e;

        /* renamed from: f, reason: collision with root package name */
        private int f20391f;

        public /* synthetic */ d(a aVar, a aVar2, Handler handler, byte b9) {
            this(aVar2, handler);
        }

        private void d() {
            a.this.f20350R.clear();
            this.f20389d = null;
        }

        @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
        public final void a() {
            a.this.i = false;
            try {
                a aVar = this.f20389d;
                if (aVar != null) {
                    aVar.f20351S = true;
                    if (this.f20389d.f20363v != null) {
                        this.f20389d.f20363v.f20265n = "";
                    }
                    this.f21061b = true;
                    if (this.f20389d.f20366y != null) {
                        boolean unused = a.this.f20345M;
                        this.f20389d.f20366y.c();
                        this.f20391f = 2;
                    }
                }
            } catch (Throwable th) {
                if (com.anythink.expressad.a.f17618a) {
                    th.printStackTrace();
                }
            }
        }

        @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
        public final void b() {
            try {
                a aVar = this.f20389d;
                if (aVar == null || aVar.f20366y == null) {
                    return;
                }
                try {
                    this.f20389d.f20366y.d();
                } catch (Exception e9) {
                    if (com.anythink.expressad.a.f17618a) {
                        e9.printStackTrace();
                    }
                }
                this.f20391f = 5;
            } catch (Exception e10) {
                if (com.anythink.expressad.a.f17618a) {
                    e10.printStackTrace();
                }
            }
        }

        @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
        public final void c() {
            try {
                a aVar = this.f20389d;
                if (aVar == null || aVar.f20366y == null) {
                    return;
                }
                try {
                    com.anythink.expressad.videocommon.d.a unused = this.f20389d.f20366y;
                    com.anythink.expressad.foundation.f.b.a().b("_2", 2);
                } catch (Exception e9) {
                    if (com.anythink.expressad.a.f17618a) {
                        e9.printStackTrace();
                    }
                }
                this.f20391f = 6;
            } catch (Exception e10) {
                if (com.anythink.expressad.a.f17618a) {
                    e10.printStackTrace();
                }
            }
        }

        private d(a aVar, Handler handler) {
            this.f20391f = 0;
            this.f20389d = aVar;
            this.f20390e = handler;
        }

        @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
        public final void a(boolean z3, com.anythink.expressad.videocommon.c.c cVar) {
            try {
                a aVar = this.f20389d;
                if (aVar == null || aVar.f20366y == null) {
                    return;
                }
                if (cVar == null) {
                    cVar = com.anythink.expressad.videocommon.c.c.b(this.f20389d.f20338E);
                }
                if (a.this.f20345M) {
                    a.this.a();
                }
                this.f20389d.f20366y.a(z3, cVar.a(), cVar.b());
                this.f20391f = 7;
                this.f20389d.f20351S = false;
                a.this.f20350R.clear();
                this.f20389d = null;
            } catch (Exception e9) {
                if (com.anythink.expressad.a.f17618a) {
                    e9.printStackTrace();
                }
            }
        }

        @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
        public final void a(String str) {
            a.this.i = false;
            try {
                if (this.f20389d != null) {
                    boolean unused = a.this.f20345M;
                    this.f20389d.f20351S = false;
                    this.f21062c = true;
                    if (this.f20389d.f20366y != null) {
                        try {
                            if (a.this.ag != null) {
                                a.this.ag.size();
                            }
                        } catch (Exception unused2) {
                        }
                        try {
                            this.f20389d.f20366y.b(str);
                        } catch (Exception e9) {
                            if (com.anythink.expressad.a.f17618a) {
                                e9.printStackTrace();
                            }
                        }
                        this.f20391f = 4;
                    }
                }
            } catch (Exception e10) {
                this.f20391f = 0;
                if (com.anythink.expressad.a.f17618a) {
                    e10.printStackTrace();
                }
            }
        }

        @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
        public final void a(com.anythink.expressad.foundation.d.d dVar) {
            try {
                a aVar = this.f20389d;
                if (aVar == null || aVar.f20366y == null) {
                    return;
                }
                try {
                    boolean unused = a.this.f20345M;
                    this.f20389d.f20366y.a(dVar);
                } catch (Exception e9) {
                    if (com.anythink.expressad.a.f17618a) {
                        e9.printStackTrace();
                    }
                }
            } catch (Exception e10) {
                if (com.anythink.expressad.a.f17618a) {
                    e10.printStackTrace();
                }
            }
        }

        @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
        public final void a(boolean z3, int i) {
            try {
                a aVar = this.f20389d;
                if (aVar == null || aVar.f20366y == null) {
                    return;
                }
                this.f20389d.f20351S = false;
                try {
                    com.anythink.expressad.videocommon.d.a unused = this.f20389d.f20366y;
                } catch (Exception e9) {
                    if (com.anythink.expressad.a.f17618a) {
                        e9.printStackTrace();
                    }
                }
            } catch (Exception e10) {
                if (com.anythink.expressad.a.f17618a) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public static /* synthetic */ boolean h(a aVar) {
        aVar.ab = true;
        return true;
    }

    public static /* synthetic */ boolean j(a aVar) {
        aVar.ac = true;
        return true;
    }

    public static /* synthetic */ boolean l(a aVar) {
        aVar.ad = true;
        return true;
    }

    private static void m() {
    }

    public static /* synthetic */ boolean n(a aVar) {
        aVar.ae = true;
        return true;
    }

    @Override // com.anythink.basead.f.c.c
    public boolean isReady() {
        try {
            r();
            if (!this.f20345M) {
                if (this.f20363v == null) {
                    q();
                }
                com.anythink.expressad.reward.a.d dVar = this.f20363v;
                if (dVar != null) {
                    return dVar.c();
                }
                return false;
            }
        } catch (Throwable th) {
            if (com.anythink.expressad.a.f17618a) {
                th.printStackTrace();
            }
        }
        return false;
    }

    private void b(boolean z3) {
        this.f20345M = z3;
    }

    private void c(boolean z3) {
        this.f20349Q = z3;
    }

    private String n() {
        com.anythink.expressad.reward.a.d dVar = this.f20363v;
        return dVar != null ? dVar.c(this.f20351S) : "";
    }

    private static void o() {
        p.a();
    }

    private boolean p() {
        if (this.f20363v == null) {
            q();
        }
        com.anythink.expressad.reward.a.d dVar = this.f20363v;
        if (dVar != null) {
            return dVar.c();
        }
        return false;
    }

    private void q() {
        com.anythink.expressad.reward.a.d dVar = new com.anythink.expressad.reward.a.d(this.f20362u, this.f20336C, this.f20335B);
        this.f20363v = dVar;
        dVar.a(this.f20344L);
        this.f20363v.b(this.f20345M);
        if (this.f20344L) {
            this.f20363v.a(this.f20342I, this.J, this.f20343K);
        }
        this.f20363v.a(this.f20364w);
    }

    private boolean r() {
        try {
            if (this.Y != null) {
                return false;
            }
            this.Y = com.anythink.expressad.foundation.c.c.a(t.b().g());
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static String s() {
        return "";
    }

    public final String d() {
        return this.f20335B;
    }

    public final String e() {
        return this.f20336C;
    }

    public final boolean f() {
        return this.f20344L;
    }

    public final boolean g() {
        return this.f20345M;
    }

    public final com.anythink.expressad.videocommon.d.a h() {
        return this.f20366y;
    }

    public final c i() {
        return this.f20367z;
    }

    public final CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> j() {
        return this.ag;
    }

    public final List<com.anythink.expressad.foundation.d.d> k() {
        return this.ah;
    }

    public final com.anythink.expressad.reward.a.d l() {
        return this.f20363v;
    }

    private static void b(String str, String str2) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (concurrentHashMap = f20320V) == null || concurrentHashMap.containsKey(str)) {
            return;
        }
        f20320V.put(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[Catch: Exception -> 0x0011, TryCatch #0 {Exception -> 0x0011, blocks: (B:2:0x0000, B:4:0x0004, B:7:0x002c, B:9:0x0030, B:10:0x003b, B:14:0x0013), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void c(e eVar) {
        try {
            com.anythink.expressad.reward.a.d dVar = this.f20363v;
            if (dVar != null) {
                if (!this.f20335B.equals(dVar.e())) {
                }
                if (this.f20344L) {
                    this.f20363v.a(this.f20342I, this.J, this.f20343K);
                }
                this.f20363v.a(this.f20341H);
                this.f20363v.a(this.f20364w);
                RunnableC0130a runnableC0130a = new RunnableC0130a(this.f20363v);
                b bVar = new b(this.f20363v);
                this.f20356k = bVar;
                bVar.a(runnableC0130a);
                this.f20363v.a(this.f20356k);
                this.f20363v.a(eVar);
            }
            com.anythink.expressad.reward.a.d dVar2 = new com.anythink.expressad.reward.a.d(this.f20362u, this.f20336C, this.f20335B);
            this.f20363v = dVar2;
            dVar2.a(this.f20344L);
            this.f20363v.b(this.f20345M);
            if (this.f20344L) {
            }
            this.f20363v.a(this.f20341H);
            this.f20363v.a(this.f20364w);
            RunnableC0130a runnableC0130a2 = new RunnableC0130a(this.f20363v);
            b bVar2 = new b(this.f20363v);
            this.f20356k = bVar2;
            bVar2.a(runnableC0130a2);
            this.f20363v.a(this.f20356k);
            this.f20363v.a(eVar);
        } catch (Exception e9) {
            b(e9.getMessage());
        }
    }

    public final void a(boolean z3) {
        this.f20344L = z3;
    }

    public final void a(int i) {
        this.f20341H = i;
    }

    private void a(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str)) {
            x.a(this.f20362u, "Anythink_ConfirmTitle" + this.f20335B, str.trim());
        }
        if (!TextUtils.isEmpty(str2)) {
            x.a(this.f20362u, "Anythink_ConfirmContent" + this.f20335B, str2.trim());
        }
        if (!TextUtils.isEmpty(str4)) {
            x.a(this.f20362u, "Anythink_CancelText" + this.f20335B, str4.trim());
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        x.a(this.f20362u, "Anythink_ConfirmText" + this.f20335B, str3.trim());
    }

    private void b(e eVar) {
        try {
            c(eVar);
        } catch (Exception e9) {
            try {
                b("load mv api error:" + e9.getMessage());
            } catch (Exception e10) {
                b(com.anythink.expressad.foundation.g.b.b.f19139b);
                if (com.anythink.expressad.a.f17618a) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (this.f20367z != null) {
            this.ae = true;
            this.f20367z.a(str);
        }
    }

    private void a(int i, int i6, int i9) {
        this.f20342I = i;
        this.J = i6;
        if (i6 == com.anythink.expressad.foundation.g.a.cy) {
            this.f20343K = i9 < 0 ? 5 : i9;
        }
        if (i6 == com.anythink.expressad.foundation.g.a.cx) {
            this.f20343K = i9 < 0 ? 80 : i9;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ivRewardEnable", 1);
            jSONObject.put("ivRewardMode", i == com.anythink.expressad.foundation.g.a.cv ? 0 : 1);
            jSONObject.put("ivRewardPlayValueMode", i6 == com.anythink.expressad.foundation.g.a.cx ? 0 : 1);
            jSONObject.put("ivRewardPlayValue", i9);
            com.anythink.expressad.f.b.a();
            com.anythink.expressad.f.b.e(this.f20335B, jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    private com.anythink.expressad.videocommon.c.b b(int i) {
        com.anythink.expressad.videocommon.e.d dVar = this.f20364w;
        com.anythink.expressad.videocommon.c.b bVar = null;
        if (dVar != null) {
            int size = dVar.I().size();
            for (int i6 = 0; i6 < size; i6++) {
                if (this.f20364w.I().get(i6).a() == i) {
                    bVar = this.f20364w.I().get(i6);
                }
            }
        }
        return bVar;
    }

    public final boolean c() {
        return this.f20348P;
    }

    public final com.anythink.expressad.videocommon.e.d b() {
        return this.f20364w;
    }

    public static void a(String str, int i) {
        try {
            if (f20319U == null || !y.b(str)) {
                return;
            }
            f20319U.put(str, Integer.valueOf(i));
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public static int a(String str) {
        ConcurrentHashMap<String, Integer> concurrentHashMap;
        Integer num;
        try {
            if (!y.b(str) || (concurrentHashMap = f20319U) == null || !concurrentHashMap.containsKey(str) || (num = f20319U.get(str)) == null) {
                return 0;
            }
            return num.intValue();
        } catch (Exception e9) {
            e9.printStackTrace();
            return 0;
        }
    }

    public final void a() {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (!this.f20351S || (concurrentHashMap = f20320V) == null || concurrentHashMap.containsKey(n())) {
            return;
        }
        f20320V.remove(n());
    }

    public final void a(com.anythink.expressad.videocommon.d.a aVar) {
        this.f20366y = aVar;
        this.f20367z = new c(this, aVar, this.f20340G, this.f20335B, (byte) 0);
    }

    public final void a(String str, String str2) {
        try {
            this.f20362u = t.b().g();
            this.f20335B = str2;
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            this.f20336C = str;
            this.f20365x = com.anythink.expressad.videocommon.e.c.a().b();
            p.b();
            n.a().b();
            j.a().b();
            com.anythink.expressad.videocommon.e.c.a().a(this.f20335B, this.f20344L);
            p.b();
            if (this.Y == null) {
                this.Y = com.anythink.expressad.foundation.c.c.a(t.b().g());
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public final void a(e eVar) {
        if (eVar == null) {
            c.a(this.f20367z, com.anythink.expressad.foundation.g.b.b.f19143f);
            return;
        }
        if (this.f20367z != null && c.a(this.f20367z) == 3) {
            this.f20355Z = false;
        } else {
            this.f20355Z = true;
            c.b(this.f20367z);
        }
        this.f20348P = true;
        this.f20340G.removeMessages(f20327g);
        this.ac = false;
        this.ab = false;
        this.ad = false;
        this.ae = false;
        com.anythink.expressad.reward.a.c.a();
        try {
            this.f20364w = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f20335B, this.f20344L);
            if (!TextUtils.isEmpty(this.f20336C)) {
                this.f20364w.b(this.f20336C);
            }
            int S8 = this.f20364w.S() * 1000;
            if (this.f20340G != null) {
                Message obtain = Message.obtain();
                obtain.what = f20328h;
                this.f20340G.sendMessageDelayed(obtain, S8);
            }
            this.f20353W = this.f20364w.Q();
            try {
                c(eVar);
            } catch (Exception e9) {
                try {
                    b("load mv api error:" + e9.getMessage());
                } catch (Exception e10) {
                    b(com.anythink.expressad.foundation.g.b.b.f19139b);
                    if (com.anythink.expressad.a.f17618a) {
                        e10.printStackTrace();
                    }
                }
            }
        } catch (Exception e11) {
            if (this.f20367z != null) {
                this.f20367z.a("load exception");
            }
            if (com.anythink.expressad.a.f17618a) {
                e11.printStackTrace();
            }
        }
    }

    private static List<com.anythink.expressad.foundation.d.d> a(String str, List<com.anythink.expressad.foundation.d.d> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0 && !TextUtils.isEmpty(str)) {
            for (com.anythink.expressad.foundation.d.d dVar : list) {
                if (dVar != null && str.equals(dVar.C())) {
                    arrayList.add(dVar);
                }
            }
        }
        return arrayList;
    }

    private void a(Activity activity, String str, com.anythink.core.common.h.x xVar) {
        byte b9 = 0;
        try {
            if (this.f20363v == null) {
                q();
            }
            com.anythink.expressad.reward.a.d dVar = this.f20363v;
            if (dVar != null && dVar.c()) {
                d dVar2 = new d(this, this, this.f20340G, b9);
                f20331m.put(this.f20335B, dVar2);
                this.f20363v.a(activity, dVar2, str, this.f20334A, this.f20341H, this.f20337D, xVar);
                this.i = false;
                return;
            }
            this.i = false;
            if (this.f20366y != null) {
                try {
                    this.f20366y.b("can't show because load is failed");
                } catch (Exception e9) {
                    if (com.anythink.expressad.a.f17618a) {
                        e9.printStackTrace();
                    }
                }
            }
        } catch (Exception e10) {
            if (com.anythink.expressad.a.f17618a) {
                e10.getLocalizedMessage();
            }
            if (this.f20366y != null) {
                try {
                    this.f20366y.b("show exception");
                } catch (Exception unused) {
                    if (com.anythink.expressad.a.f17618a) {
                        e10.printStackTrace();
                    }
                }
            }
            this.i = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x013d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Activity activity, String str, String str2, String str3, com.anythink.core.common.h.x xVar) {
        byte b9 = 0;
        try {
            this.f20338E = str;
            this.f20334A = str2;
            this.f20337D = str3;
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f17618a) {
            }
            if (this.f20366y != null) {
            }
            this.i = false;
        }
        synchronized (this.f20352T) {
            if (this.i) {
                if (this.f20366y != null) {
                    try {
                        this.f20366y.b(com.anythink.expressad.foundation.g.b.b.f19144g);
                    } catch (Exception e10) {
                        if (com.anythink.expressad.a.f17618a) {
                            e10.printStackTrace();
                        }
                    }
                }
                return;
            }
            this.i = true;
            Context context = this.f20362u;
            if (context == null) {
                if (this.f20366y != null) {
                    try {
                        this.f20366y.b(com.anythink.expressad.foundation.g.b.b.f19138a);
                    } catch (Exception e11) {
                        if (com.anythink.expressad.a.f17618a) {
                            e11.printStackTrace();
                        }
                    }
                }
                this.i = false;
                return;
            }
            if (this.f20344L && !v.b(context)) {
                if (this.f20366y != null) {
                    try {
                        this.f20366y.b(com.anythink.expressad.foundation.g.b.b.f19141d);
                    } catch (Exception e12) {
                        if (com.anythink.expressad.a.f17618a) {
                            e12.printStackTrace();
                        }
                    }
                }
                this.i = false;
                return;
            }
            r();
            try {
                String format = new SimpleDateFormat("dd").format(new Date());
                String str4 = (String) x.b(this.f20362u, com.anythink.expressad.foundation.g.a.bO, "0");
                if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(format) && !str4.equals(format)) {
                    x.a(this.f20362u, com.anythink.expressad.foundation.g.a.bO, format);
                    x.a(this.f20362u, this.f20336C + "_1", 0);
                }
            } catch (Exception unused) {
            }
            try {
                if (this.f20363v == null) {
                    q();
                }
                com.anythink.expressad.reward.a.d dVar = this.f20363v;
                if (dVar != null && dVar.c()) {
                    d dVar2 = new d(this, this, this.f20340G, b9);
                    f20331m.put(this.f20335B, dVar2);
                    this.f20363v.a(activity, dVar2, str, this.f20334A, this.f20341H, this.f20337D, xVar);
                    this.i = false;
                    return;
                }
                this.i = false;
                if (this.f20366y != null) {
                    try {
                        this.f20366y.b("can't show because load is failed");
                        return;
                    } catch (Exception e13) {
                        if (com.anythink.expressad.a.f17618a) {
                            e13.printStackTrace();
                            return;
                        }
                        return;
                    }
                }
                return;
            } catch (Exception e14) {
                if (com.anythink.expressad.a.f17618a) {
                    e14.getLocalizedMessage();
                }
                if (this.f20366y != null) {
                    try {
                        this.f20366y.b("show exception");
                    } catch (Exception unused2) {
                        if (com.anythink.expressad.a.f17618a) {
                            e14.printStackTrace();
                        }
                    }
                }
                this.i = false;
                return;
            }
            if (com.anythink.expressad.a.f17618a) {
                e9.getLocalizedMessage();
            }
            if (this.f20366y != null) {
                try {
                    this.f20366y.b("show exception");
                } catch (Exception unused3) {
                    if (com.anythink.expressad.a.f17618a) {
                        e9.printStackTrace();
                    }
                }
            }
            this.i = false;
        }
    }

    private static void a(boolean z3, boolean z6) {
        try {
            ConcurrentHashMap<String, d> concurrentHashMap = f20331m;
            if (concurrentHashMap != null) {
                concurrentHashMap.clear();
            }
            if (z3) {
                if (z6) {
                    com.anythink.expressad.videocommon.a.a(com.anythink.expressad.foundation.g.a.aY);
                } else {
                    com.anythink.expressad.videocommon.a.b(com.anythink.expressad.foundation.g.a.aY);
                }
            } else if (z6) {
                com.anythink.expressad.videocommon.a.a(94);
            } else {
                com.anythink.expressad.videocommon.a.b(94);
            }
            com.anythink.expressad.videocommon.a.a();
            com.anythink.expressad.videocommon.a.b();
        } catch (Throwable unused) {
        }
    }

    private static void a(boolean z3, boolean z6, String str) {
        try {
            ConcurrentHashMap<String, d> concurrentHashMap = f20331m;
            if (concurrentHashMap != null) {
                concurrentHashMap.clear();
            }
            if (z3) {
                if (z6) {
                    com.anythink.expressad.videocommon.a.a(com.anythink.expressad.foundation.g.a.aY);
                } else {
                    com.anythink.expressad.videocommon.a.b(com.anythink.expressad.foundation.g.a.aY);
                }
            } else if (z6) {
                com.anythink.expressad.videocommon.a.a(94);
            } else {
                com.anythink.expressad.videocommon.a.b(94);
            }
            com.anythink.expressad.videocommon.a.c(str);
            com.anythink.expressad.videocommon.a.b();
        } catch (Throwable unused) {
        }
    }
}
