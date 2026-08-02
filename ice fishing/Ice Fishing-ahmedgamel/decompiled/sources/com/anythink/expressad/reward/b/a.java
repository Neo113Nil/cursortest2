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
    public static final int f21108a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f21109b = 8;

    /* renamed from: c, reason: collision with root package name */
    public static final int f21110c = 9;

    /* renamed from: d, reason: collision with root package name */
    public static final int f21111d = 16;

    /* renamed from: e, reason: collision with root package name */
    public static final int f21112e = 18;

    /* renamed from: f, reason: collision with root package name */
    public static final int f21113f = 17;

    /* renamed from: g, reason: collision with root package name */
    public static final int f21114g = 1001001;

    /* renamed from: h, reason: collision with root package name */
    public static final int f21115h = 1001002;

    /* renamed from: j, reason: collision with root package name */
    public static String f21116j = null;

    /* renamed from: l, reason: collision with root package name */
    public static String f21117l = "";

    /* renamed from: s, reason: collision with root package name */
    private static final String f21119s = "RewardVideoController";

    /* renamed from: t, reason: collision with root package name */
    private static final int f21120t = 25;

    /* renamed from: A, reason: collision with root package name */
    private String f21121A;

    /* renamed from: B, reason: collision with root package name */
    private String f21122B;

    /* renamed from: C, reason: collision with root package name */
    private volatile String f21123C;

    /* renamed from: D, reason: collision with root package name */
    private String f21124D;

    /* renamed from: E, reason: collision with root package name */
    private String f21125E;

    /* renamed from: I, reason: collision with root package name */
    private int f21129I;
    private int J;

    /* renamed from: K, reason: collision with root package name */
    private int f21130K;

    /* renamed from: P, reason: collision with root package name */
    private boolean f21135P;

    /* renamed from: W, reason: collision with root package name */
    private Queue<Integer> f21140W;

    /* renamed from: X, reason: collision with root package name */
    private String f21141X;
    private CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> ag;
    private List<com.anythink.expressad.foundation.d.d> ah;

    /* renamed from: k, reason: collision with root package name */
    b f21143k;

    /* renamed from: u, reason: collision with root package name */
    private Context f21149u;

    /* renamed from: v, reason: collision with root package name */
    private com.anythink.expressad.reward.a.d f21150v;

    /* renamed from: w, reason: collision with root package name */
    private com.anythink.expressad.videocommon.e.d f21151w;

    /* renamed from: x, reason: collision with root package name */
    private com.anythink.expressad.videocommon.e.a f21152x;

    /* renamed from: y, reason: collision with root package name */
    private volatile com.anythink.expressad.videocommon.d.a f21153y;

    /* renamed from: z, reason: collision with root package name */
    private volatile c f21154z;

    /* renamed from: U, reason: collision with root package name */
    private static ConcurrentHashMap<String, Integer> f21106U = new ConcurrentHashMap<>();

    /* renamed from: m, reason: collision with root package name */
    public static ConcurrentHashMap<String, d> f21118m = new ConcurrentHashMap<>();

    /* renamed from: V, reason: collision with root package name */
    private static ConcurrentHashMap<String, String> f21107V = new ConcurrentHashMap<>();

    /* renamed from: F, reason: collision with root package name */
    private int f21126F = 0;

    /* renamed from: H, reason: collision with root package name */
    private int f21128H = 2;

    /* renamed from: L, reason: collision with root package name */
    private boolean f21131L = false;

    /* renamed from: M, reason: collision with root package name */
    private boolean f21132M = false;

    /* renamed from: N, reason: collision with root package name */
    private boolean f21133N = false;

    /* renamed from: O, reason: collision with root package name */
    private boolean f21134O = false;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f21136Q = false;

    /* renamed from: R, reason: collision with root package name */
    private ArrayList<Integer> f21137R = new ArrayList<>(7);

    /* renamed from: S, reason: collision with root package name */
    private boolean f21138S = false;
    public volatile boolean i = false;

    /* renamed from: T, reason: collision with root package name */
    private final Object f21139T = new Object();
    private com.anythink.expressad.foundation.c.c Y = null;

    /* renamed from: Z, reason: collision with root package name */
    private volatile boolean f21142Z = true;
    private volatile boolean aa = false;
    private volatile boolean ab = false;
    private volatile boolean ac = false;
    private volatile boolean ad = false;
    private volatile boolean ae = false;
    private volatile boolean af = false;

    /* renamed from: n, reason: collision with root package name */
    volatile boolean f21144n = false;

    /* renamed from: o, reason: collision with root package name */
    volatile boolean f21145o = false;

    /* renamed from: p, reason: collision with root package name */
    volatile boolean f21146p = false;

    /* renamed from: q, reason: collision with root package name */
    volatile boolean f21147q = false;

    /* renamed from: r, reason: collision with root package name */
    volatile boolean f21148r = false;

    /* renamed from: G, reason: collision with root package name */
    private Handler f21127G = new com.anythink.expressad.reward.b.b(this);

    /* renamed from: com.anythink.expressad.reward.b.a$a, reason: collision with other inner class name */
    public class RunnableC0130a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private com.anythink.expressad.reward.a.d f21156b;

        /* renamed from: c, reason: collision with root package name */
        private int f21157c = 1;

        /* renamed from: d, reason: collision with root package name */
        private boolean f21158d = true;

        /* renamed from: e, reason: collision with root package name */
        private boolean f21159e = false;

        public RunnableC0130a(com.anythink.expressad.reward.a.d dVar) {
            this.f21156b = dVar;
            if (dVar != null) {
                dVar.g(false);
            }
        }

        public final void a() {
            this.f21159e = true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f21159e) {
                return;
            }
            com.anythink.expressad.reward.a.d dVar = this.f21156b;
            if (dVar != null) {
                dVar.g(true);
            }
            a.this.b("v3 is timeout");
        }
    }

    public class b implements com.anythink.expressad.reward.a.b {

        /* renamed from: b, reason: collision with root package name */
        private com.anythink.expressad.reward.a.d f21161b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f21162c = true;

        /* renamed from: d, reason: collision with root package name */
        private RunnableC0130a f21163d;

        public b(com.anythink.expressad.reward.a.d dVar) {
            this.f21161b = dVar;
        }

        private Runnable c() {
            return this.f21163d;
        }

        public final void a(RunnableC0130a runnableC0130a) {
            this.f21163d = runnableC0130a;
        }

        @Override // com.anythink.expressad.reward.a.b
        public final void b() {
            RunnableC0130a runnableC0130a = this.f21163d;
            if (runnableC0130a != null) {
                runnableC0130a.a();
                a.this.f21127G.removeCallbacks(this.f21163d);
            }
            if (a.this.f21154z != null) {
                c.a(a.this.f21154z, a.this.f21123C, a.this.f21122B);
            }
        }

        @Override // com.anythink.expressad.reward.a.b
        public final void a() {
            if (this.f21163d != null) {
                a.this.f21127G.removeCallbacks(this.f21163d);
            }
            if (a.this.f21154z != null) {
                a.this.f21154z.a(a.this.f21123C, a.this.f21122B);
            }
        }

        @Override // com.anythink.expressad.reward.a.b
        public final void a(com.anythink.expressad.foundation.e.c cVar) {
            RunnableC0130a runnableC0130a = this.f21163d;
            if (runnableC0130a != null) {
                runnableC0130a.a();
                a.this.f21127G.removeCallbacks(this.f21163d);
            }
            com.anythink.expressad.reward.a.d dVar = this.f21161b;
            if (dVar != null) {
                dVar.a((com.anythink.expressad.reward.a.b) null);
                this.f21161b = null;
            }
            if (a.this.f21154z != null) {
                a.this.f21154z.a(cVar != null ? cVar.a() : "unknown reason");
            }
        }
    }

    public final class c {

        /* renamed from: b, reason: collision with root package name */
        private static final String f21164b = "RewardVideoController_Listener";

        /* renamed from: d, reason: collision with root package name */
        private static final int f21165d = 0;

        /* renamed from: e, reason: collision with root package name */
        private static final int f21166e = 1;

        /* renamed from: f, reason: collision with root package name */
        private static final int f21167f = 2;

        /* renamed from: g, reason: collision with root package name */
        private static final int f21168g = 3;

        /* renamed from: c, reason: collision with root package name */
        private WeakReference<com.anythink.expressad.videocommon.d.a> f21170c;

        /* renamed from: h, reason: collision with root package name */
        private volatile AtomicInteger f21171h;
        private Handler i;

        /* renamed from: j, reason: collision with root package name */
        private String f21172j;

        /* renamed from: k, reason: collision with root package name */
        private List<com.anythink.expressad.foundation.d.d> f21173k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f21174l;

        public /* synthetic */ c(a aVar, com.anythink.expressad.videocommon.d.a aVar2, Handler handler, String str, byte b9) {
            this(aVar2, handler, str);
        }

        private int a() {
            return this.f21171h.get();
        }

        private void c(String str, String str2) {
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = this.f21170c;
            com.anythink.expressad.videocommon.d.a aVar = weakReference != null ? weakReference.get() : null;
            this.f21171h.get();
            boolean unused = a.this.ab;
            if ((this.f21171h.get() == 1 || this.f21171h.get() == 3) && this.i != null) {
                if (a.this.ab) {
                    this.f21171h.get();
                    boolean unused2 = a.this.ab;
                    return;
                }
                this.f21171h.get();
                boolean unused3 = a.this.ab;
                a.h(a.this);
                if (aVar != null) {
                    Message obtain = Message.obtain();
                    Bundle bundle = new Bundle();
                    bundle.putString(com.anythink.expressad.a.f18429z, str);
                    bundle.putString("unit_id", str2);
                    bundle.putBoolean(com.anythink.expressad.a.f18411g, false);
                    obtain.setData(bundle);
                    obtain.obj = str2;
                    obtain.what = 17;
                    this.i.sendMessage(obtain);
                }
            }
        }

        private void d(String str, String str2) {
            this.f21171h.get();
            boolean unused = a.this.ab;
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = this.f21170c;
            com.anythink.expressad.videocommon.d.a aVar = weakReference != null ? weakReference.get() : null;
            if (this.i != null) {
                if (a.this.ab) {
                    this.f21171h.get();
                    boolean unused2 = a.this.ab;
                    return;
                }
                this.f21171h.get();
                boolean unused3 = a.this.ab;
                a.h(a.this);
                if (aVar != null) {
                    Message obtain = Message.obtain();
                    Bundle bundle = new Bundle();
                    bundle.putString(com.anythink.expressad.a.f18429z, str);
                    bundle.putString("unit_id", str2);
                    bundle.putBoolean(com.anythink.expressad.a.f18411g, true);
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
                handler.removeMessages(a.f21115h);
            }
            this.f21171h.get();
            boolean unused = a.this.ac;
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = this.f21170c;
            com.anythink.expressad.videocommon.d.a aVar = weakReference != null ? weakReference.get() : null;
            if (this.f21171h.get() == 2 || this.i == null) {
                return;
            }
            if (this.f21171h.get() == 1) {
                this.f21171h.set(3);
            }
            if (a.this.ac) {
                this.f21171h.get();
                boolean unused2 = a.this.ac;
                return;
            }
            this.f21171h.get();
            boolean unused3 = a.this.ac;
            a.j(a.this);
            if (aVar != null) {
                Message obtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(com.anythink.expressad.a.f18429z, str);
                bundle.putString("unit_id", str2);
                obtain.setData(bundle);
                obtain.obj = str2;
                obtain.what = 9;
                this.i.sendMessage(obtain);
            }
            if (a.this.ad) {
                this.f21171h.set(2);
            }
        }

        private c(com.anythink.expressad.videocommon.d.a aVar, Handler handler, String str) {
            this.f21170c = new WeakReference<>(aVar);
            this.f21171h = new AtomicInteger(0);
            this.i = handler;
            this.f21172j = str;
        }

        private void a(int i) {
            this.f21171h.set(i);
        }

        public final void a(String str, String str2) {
            Handler handler = this.i;
            if (handler != null) {
                handler.removeMessages(a.f21115h);
            }
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = this.f21170c;
            com.anythink.expressad.videocommon.d.a aVar = weakReference != null ? weakReference.get() : null;
            this.f21171h.get();
            boolean unused = a.this.ac;
            if (this.f21171h.get() == 2 || this.i == null) {
                return;
            }
            this.f21171h.set(2);
            if (!a.this.ac) {
                this.f21171h.get();
                boolean unused2 = a.this.ac;
                a.j(a.this);
                if (aVar != null) {
                    Message obtain = Message.obtain();
                    Bundle bundle = new Bundle();
                    bundle.putString(com.anythink.expressad.a.f18429z, str);
                    bundle.putString("unit_id", str2);
                    obtain.setData(bundle);
                    obtain.obj = str2;
                    obtain.what = 9;
                    this.i.sendMessage(obtain);
                    return;
                }
                return;
            }
            this.f21171h.get();
            boolean unused3 = a.this.ac;
        }

        private void c(String str) {
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = this.f21170c;
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
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = this.f21170c;
            com.anythink.expressad.videocommon.d.a aVar = weakReference != null ? weakReference.get() : null;
            this.f21171h.get();
            boolean unused = a.this.ae;
            if (this.f21171h.get() == 2 || (handler = this.i) == null) {
                return;
            }
            if (handler != null) {
                a.n(a.this);
                if (str.contains("resource load timeout")) {
                    a.l(a.this);
                }
                if (a.this.ae && a.this.ad && !a.this.ac) {
                    this.f21171h.set(2);
                    if (aVar != null) {
                        this.f21171h.get();
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
            this.f21171h.get();
            boolean unused3 = a.this.ae;
        }

        public final void a(String str) {
            Handler handler = this.i;
            if (handler != null) {
                handler.removeMessages(a.f21115h);
            }
            this.f21171h.get();
            boolean unused = a.this.ad;
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = this.f21170c;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            if ((this.f21171h.get() == 1 || this.f21171h.get() == 3) && this.i != null) {
                a.l(a.this);
                if (!a.this.af || str.contains("resource load timeout")) {
                    a.n(a.this);
                }
                if (a.this.ac) {
                    this.f21171h.set(2);
                }
                if (a.this.ad && a.this.ae && !a.this.ac) {
                    this.f21171h.set(2);
                    this.f21171h.get();
                    boolean unused2 = a.this.ad;
                    Message obtain = Message.obtain();
                    obtain.obj = str;
                    obtain.what = 16;
                    this.i.sendMessage(obtain);
                    return;
                }
                this.f21171h.get();
                boolean unused3 = a.this.ad;
            }
        }

        private void b(String str) {
            this.f21171h.set(2);
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = this.f21170c;
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
            cVar.f21171h.set(1);
        }

        private void a(boolean z6) {
            this.f21174l = z6;
        }

        public static /* synthetic */ void a(c cVar, String str) {
            cVar.f21171h.set(2);
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = cVar.f21170c;
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
            return cVar.f21171h.get();
        }

        public static /* synthetic */ void a(c cVar, String str, String str2) {
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = cVar.f21170c;
            com.anythink.expressad.videocommon.d.a aVar = weakReference != null ? weakReference.get() : null;
            cVar.f21171h.get();
            boolean unused = a.this.ab;
            if ((cVar.f21171h.get() == 1 || cVar.f21171h.get() == 3) && cVar.i != null) {
                if (!a.this.ab) {
                    cVar.f21171h.get();
                    boolean unused2 = a.this.ab;
                    a.h(a.this);
                    if (aVar != null) {
                        Message obtain = Message.obtain();
                        Bundle bundle = new Bundle();
                        bundle.putString(com.anythink.expressad.a.f18429z, str);
                        bundle.putString("unit_id", str2);
                        bundle.putBoolean(com.anythink.expressad.a.f18411g, false);
                        obtain.setData(bundle);
                        obtain.obj = str2;
                        obtain.what = 17;
                        cVar.i.sendMessage(obtain);
                        return;
                    }
                    return;
                }
                cVar.f21171h.get();
                boolean unused3 = a.this.ab;
            }
        }
    }

    public final class d extends com.anythink.expressad.video.bt.module.b.c {

        /* renamed from: d, reason: collision with root package name */
        private a f21176d;

        /* renamed from: e, reason: collision with root package name */
        private Handler f21177e;

        /* renamed from: f, reason: collision with root package name */
        private int f21178f;

        public /* synthetic */ d(a aVar, a aVar2, Handler handler, byte b9) {
            this(aVar2, handler);
        }

        private void d() {
            a.this.f21137R.clear();
            this.f21176d = null;
        }

        @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
        public final void a() {
            a.this.i = false;
            try {
                a aVar = this.f21176d;
                if (aVar != null) {
                    aVar.f21138S = true;
                    if (this.f21176d.f21150v != null) {
                        this.f21176d.f21150v.f21052n = "";
                    }
                    this.f21848b = true;
                    if (this.f21176d.f21153y != null) {
                        boolean unused = a.this.f21132M;
                        this.f21176d.f21153y.c();
                        this.f21178f = 2;
                    }
                }
            } catch (Throwable th) {
                if (com.anythink.expressad.a.f18405a) {
                    th.printStackTrace();
                }
            }
        }

        @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
        public final void b() {
            try {
                a aVar = this.f21176d;
                if (aVar == null || aVar.f21153y == null) {
                    return;
                }
                try {
                    this.f21176d.f21153y.d();
                } catch (Exception e9) {
                    if (com.anythink.expressad.a.f18405a) {
                        e9.printStackTrace();
                    }
                }
                this.f21178f = 5;
            } catch (Exception e10) {
                if (com.anythink.expressad.a.f18405a) {
                    e10.printStackTrace();
                }
            }
        }

        @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
        public final void c() {
            try {
                a aVar = this.f21176d;
                if (aVar == null || aVar.f21153y == null) {
                    return;
                }
                try {
                    com.anythink.expressad.videocommon.d.a unused = this.f21176d.f21153y;
                    com.anythink.expressad.foundation.f.b.a().b("_2", 2);
                } catch (Exception e9) {
                    if (com.anythink.expressad.a.f18405a) {
                        e9.printStackTrace();
                    }
                }
                this.f21178f = 6;
            } catch (Exception e10) {
                if (com.anythink.expressad.a.f18405a) {
                    e10.printStackTrace();
                }
            }
        }

        private d(a aVar, Handler handler) {
            this.f21178f = 0;
            this.f21176d = aVar;
            this.f21177e = handler;
        }

        @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
        public final void a(boolean z6, com.anythink.expressad.videocommon.c.c cVar) {
            try {
                a aVar = this.f21176d;
                if (aVar == null || aVar.f21153y == null) {
                    return;
                }
                if (cVar == null) {
                    cVar = com.anythink.expressad.videocommon.c.c.b(this.f21176d.f21125E);
                }
                if (a.this.f21132M) {
                    a.this.a();
                }
                this.f21176d.f21153y.a(z6, cVar.a(), cVar.b());
                this.f21178f = 7;
                this.f21176d.f21138S = false;
                a.this.f21137R.clear();
                this.f21176d = null;
            } catch (Exception e9) {
                if (com.anythink.expressad.a.f18405a) {
                    e9.printStackTrace();
                }
            }
        }

        @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
        public final void a(String str) {
            a.this.i = false;
            try {
                if (this.f21176d != null) {
                    boolean unused = a.this.f21132M;
                    this.f21176d.f21138S = false;
                    this.f21849c = true;
                    if (this.f21176d.f21153y != null) {
                        try {
                            if (a.this.ag != null) {
                                a.this.ag.size();
                            }
                        } catch (Exception unused2) {
                        }
                        try {
                            this.f21176d.f21153y.b(str);
                        } catch (Exception e9) {
                            if (com.anythink.expressad.a.f18405a) {
                                e9.printStackTrace();
                            }
                        }
                        this.f21178f = 4;
                    }
                }
            } catch (Exception e10) {
                this.f21178f = 0;
                if (com.anythink.expressad.a.f18405a) {
                    e10.printStackTrace();
                }
            }
        }

        @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
        public final void a(com.anythink.expressad.foundation.d.d dVar) {
            try {
                a aVar = this.f21176d;
                if (aVar == null || aVar.f21153y == null) {
                    return;
                }
                try {
                    boolean unused = a.this.f21132M;
                    this.f21176d.f21153y.a(dVar);
                } catch (Exception e9) {
                    if (com.anythink.expressad.a.f18405a) {
                        e9.printStackTrace();
                    }
                }
            } catch (Exception e10) {
                if (com.anythink.expressad.a.f18405a) {
                    e10.printStackTrace();
                }
            }
        }

        @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
        public final void a(boolean z6, int i) {
            try {
                a aVar = this.f21176d;
                if (aVar == null || aVar.f21153y == null) {
                    return;
                }
                this.f21176d.f21138S = false;
                try {
                    com.anythink.expressad.videocommon.d.a unused = this.f21176d.f21153y;
                } catch (Exception e9) {
                    if (com.anythink.expressad.a.f18405a) {
                        e9.printStackTrace();
                    }
                }
            } catch (Exception e10) {
                if (com.anythink.expressad.a.f18405a) {
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
            if (!this.f21132M) {
                if (this.f21150v == null) {
                    q();
                }
                com.anythink.expressad.reward.a.d dVar = this.f21150v;
                if (dVar != null) {
                    return dVar.c();
                }
                return false;
            }
        } catch (Throwable th) {
            if (com.anythink.expressad.a.f18405a) {
                th.printStackTrace();
            }
        }
        return false;
    }

    private void b(boolean z6) {
        this.f21132M = z6;
    }

    private void c(boolean z6) {
        this.f21136Q = z6;
    }

    private String n() {
        com.anythink.expressad.reward.a.d dVar = this.f21150v;
        return dVar != null ? dVar.c(this.f21138S) : "";
    }

    private static void o() {
        p.a();
    }

    private boolean p() {
        if (this.f21150v == null) {
            q();
        }
        com.anythink.expressad.reward.a.d dVar = this.f21150v;
        if (dVar != null) {
            return dVar.c();
        }
        return false;
    }

    private void q() {
        com.anythink.expressad.reward.a.d dVar = new com.anythink.expressad.reward.a.d(this.f21149u, this.f21123C, this.f21122B);
        this.f21150v = dVar;
        dVar.a(this.f21131L);
        this.f21150v.b(this.f21132M);
        if (this.f21131L) {
            this.f21150v.a(this.f21129I, this.J, this.f21130K);
        }
        this.f21150v.a(this.f21151w);
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
        return this.f21122B;
    }

    public final String e() {
        return this.f21123C;
    }

    public final boolean f() {
        return this.f21131L;
    }

    public final boolean g() {
        return this.f21132M;
    }

    public final com.anythink.expressad.videocommon.d.a h() {
        return this.f21153y;
    }

    public final c i() {
        return this.f21154z;
    }

    public final CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> j() {
        return this.ag;
    }

    public final List<com.anythink.expressad.foundation.d.d> k() {
        return this.ah;
    }

    public final com.anythink.expressad.reward.a.d l() {
        return this.f21150v;
    }

    private static void b(String str, String str2) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (concurrentHashMap = f21107V) == null || concurrentHashMap.containsKey(str)) {
            return;
        }
        f21107V.put(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[Catch: Exception -> 0x0011, TryCatch #0 {Exception -> 0x0011, blocks: (B:2:0x0000, B:4:0x0004, B:7:0x002c, B:9:0x0030, B:10:0x003b, B:14:0x0013), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void c(e eVar) {
        try {
            com.anythink.expressad.reward.a.d dVar = this.f21150v;
            if (dVar != null) {
                if (!this.f21122B.equals(dVar.e())) {
                }
                if (this.f21131L) {
                    this.f21150v.a(this.f21129I, this.J, this.f21130K);
                }
                this.f21150v.a(this.f21128H);
                this.f21150v.a(this.f21151w);
                RunnableC0130a runnableC0130a = new RunnableC0130a(this.f21150v);
                b bVar = new b(this.f21150v);
                this.f21143k = bVar;
                bVar.a(runnableC0130a);
                this.f21150v.a(this.f21143k);
                this.f21150v.a(eVar);
            }
            com.anythink.expressad.reward.a.d dVar2 = new com.anythink.expressad.reward.a.d(this.f21149u, this.f21123C, this.f21122B);
            this.f21150v = dVar2;
            dVar2.a(this.f21131L);
            this.f21150v.b(this.f21132M);
            if (this.f21131L) {
            }
            this.f21150v.a(this.f21128H);
            this.f21150v.a(this.f21151w);
            RunnableC0130a runnableC0130a2 = new RunnableC0130a(this.f21150v);
            b bVar2 = new b(this.f21150v);
            this.f21143k = bVar2;
            bVar2.a(runnableC0130a2);
            this.f21150v.a(this.f21143k);
            this.f21150v.a(eVar);
        } catch (Exception e9) {
            b(e9.getMessage());
        }
    }

    public final void a(boolean z6) {
        this.f21131L = z6;
    }

    public final void a(int i) {
        this.f21128H = i;
    }

    private void a(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str)) {
            x.a(this.f21149u, "Anythink_ConfirmTitle" + this.f21122B, str.trim());
        }
        if (!TextUtils.isEmpty(str2)) {
            x.a(this.f21149u, "Anythink_ConfirmContent" + this.f21122B, str2.trim());
        }
        if (!TextUtils.isEmpty(str4)) {
            x.a(this.f21149u, "Anythink_CancelText" + this.f21122B, str4.trim());
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        x.a(this.f21149u, "Anythink_ConfirmText" + this.f21122B, str3.trim());
    }

    private void b(e eVar) {
        try {
            c(eVar);
        } catch (Exception e9) {
            try {
                b("load mv api error:" + e9.getMessage());
            } catch (Exception e10) {
                b(com.anythink.expressad.foundation.g.b.b.f19926b);
                if (com.anythink.expressad.a.f18405a) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (this.f21154z != null) {
            this.ae = true;
            this.f21154z.a(str);
        }
    }

    private void a(int i, int i4, int i6) {
        this.f21129I = i;
        this.J = i4;
        if (i4 == com.anythink.expressad.foundation.g.a.cy) {
            this.f21130K = i6 < 0 ? 5 : i6;
        }
        if (i4 == com.anythink.expressad.foundation.g.a.cx) {
            this.f21130K = i6 < 0 ? 80 : i6;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ivRewardEnable", 1);
            jSONObject.put("ivRewardMode", i == com.anythink.expressad.foundation.g.a.cv ? 0 : 1);
            jSONObject.put("ivRewardPlayValueMode", i4 == com.anythink.expressad.foundation.g.a.cx ? 0 : 1);
            jSONObject.put("ivRewardPlayValue", i6);
            com.anythink.expressad.f.b.a();
            com.anythink.expressad.f.b.e(this.f21122B, jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    private com.anythink.expressad.videocommon.c.b b(int i) {
        com.anythink.expressad.videocommon.e.d dVar = this.f21151w;
        com.anythink.expressad.videocommon.c.b bVar = null;
        if (dVar != null) {
            int size = dVar.I().size();
            for (int i4 = 0; i4 < size; i4++) {
                if (this.f21151w.I().get(i4).a() == i) {
                    bVar = this.f21151w.I().get(i4);
                }
            }
        }
        return bVar;
    }

    public final boolean c() {
        return this.f21135P;
    }

    public final com.anythink.expressad.videocommon.e.d b() {
        return this.f21151w;
    }

    public static void a(String str, int i) {
        try {
            if (f21106U == null || !y.b(str)) {
                return;
            }
            f21106U.put(str, Integer.valueOf(i));
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public static int a(String str) {
        ConcurrentHashMap<String, Integer> concurrentHashMap;
        Integer num;
        try {
            if (!y.b(str) || (concurrentHashMap = f21106U) == null || !concurrentHashMap.containsKey(str) || (num = f21106U.get(str)) == null) {
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
        if (!this.f21138S || (concurrentHashMap = f21107V) == null || concurrentHashMap.containsKey(n())) {
            return;
        }
        f21107V.remove(n());
    }

    public final void a(com.anythink.expressad.videocommon.d.a aVar) {
        this.f21153y = aVar;
        this.f21154z = new c(this, aVar, this.f21127G, this.f21122B, (byte) 0);
    }

    public final void a(String str, String str2) {
        try {
            this.f21149u = t.b().g();
            this.f21122B = str2;
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            this.f21123C = str;
            this.f21152x = com.anythink.expressad.videocommon.e.c.a().b();
            p.b();
            n.a().b();
            j.a().b();
            com.anythink.expressad.videocommon.e.c.a().a(this.f21122B, this.f21131L);
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
            c.a(this.f21154z, com.anythink.expressad.foundation.g.b.b.f19930f);
            return;
        }
        if (this.f21154z != null && c.a(this.f21154z) == 3) {
            this.f21142Z = false;
        } else {
            this.f21142Z = true;
            c.b(this.f21154z);
        }
        this.f21135P = true;
        this.f21127G.removeMessages(f21114g);
        this.ac = false;
        this.ab = false;
        this.ad = false;
        this.ae = false;
        com.anythink.expressad.reward.a.c.a();
        try {
            this.f21151w = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f21122B, this.f21131L);
            if (!TextUtils.isEmpty(this.f21123C)) {
                this.f21151w.b(this.f21123C);
            }
            int S8 = this.f21151w.S() * 1000;
            if (this.f21127G != null) {
                Message obtain = Message.obtain();
                obtain.what = f21115h;
                this.f21127G.sendMessageDelayed(obtain, S8);
            }
            this.f21140W = this.f21151w.Q();
            try {
                c(eVar);
            } catch (Exception e9) {
                try {
                    b("load mv api error:" + e9.getMessage());
                } catch (Exception e10) {
                    b(com.anythink.expressad.foundation.g.b.b.f19926b);
                    if (com.anythink.expressad.a.f18405a) {
                        e10.printStackTrace();
                    }
                }
            }
        } catch (Exception e11) {
            if (this.f21154z != null) {
                this.f21154z.a("load exception");
            }
            if (com.anythink.expressad.a.f18405a) {
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
            if (this.f21150v == null) {
                q();
            }
            com.anythink.expressad.reward.a.d dVar = this.f21150v;
            if (dVar != null && dVar.c()) {
                d dVar2 = new d(this, this, this.f21127G, b9);
                f21118m.put(this.f21122B, dVar2);
                this.f21150v.a(activity, dVar2, str, this.f21121A, this.f21128H, this.f21124D, xVar);
                this.i = false;
                return;
            }
            this.i = false;
            if (this.f21153y != null) {
                try {
                    this.f21153y.b("can't show because load is failed");
                } catch (Exception e9) {
                    if (com.anythink.expressad.a.f18405a) {
                        e9.printStackTrace();
                    }
                }
            }
        } catch (Exception e10) {
            if (com.anythink.expressad.a.f18405a) {
                e10.getLocalizedMessage();
            }
            if (this.f21153y != null) {
                try {
                    this.f21153y.b("show exception");
                } catch (Exception unused) {
                    if (com.anythink.expressad.a.f18405a) {
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
            this.f21125E = str;
            this.f21121A = str2;
            this.f21124D = str3;
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f18405a) {
            }
            if (this.f21153y != null) {
            }
            this.i = false;
        }
        synchronized (this.f21139T) {
            if (this.i) {
                if (this.f21153y != null) {
                    try {
                        this.f21153y.b(com.anythink.expressad.foundation.g.b.b.f19931g);
                    } catch (Exception e10) {
                        if (com.anythink.expressad.a.f18405a) {
                            e10.printStackTrace();
                        }
                    }
                }
                return;
            }
            this.i = true;
            Context context = this.f21149u;
            if (context == null) {
                if (this.f21153y != null) {
                    try {
                        this.f21153y.b(com.anythink.expressad.foundation.g.b.b.f19925a);
                    } catch (Exception e11) {
                        if (com.anythink.expressad.a.f18405a) {
                            e11.printStackTrace();
                        }
                    }
                }
                this.i = false;
                return;
            }
            if (this.f21131L && !v.b(context)) {
                if (this.f21153y != null) {
                    try {
                        this.f21153y.b(com.anythink.expressad.foundation.g.b.b.f19928d);
                    } catch (Exception e12) {
                        if (com.anythink.expressad.a.f18405a) {
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
                String str4 = (String) x.b(this.f21149u, com.anythink.expressad.foundation.g.a.bO, "0");
                if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(format) && !str4.equals(format)) {
                    x.a(this.f21149u, com.anythink.expressad.foundation.g.a.bO, format);
                    x.a(this.f21149u, this.f21123C + "_1", 0);
                }
            } catch (Exception unused) {
            }
            try {
                if (this.f21150v == null) {
                    q();
                }
                com.anythink.expressad.reward.a.d dVar = this.f21150v;
                if (dVar != null && dVar.c()) {
                    d dVar2 = new d(this, this, this.f21127G, b9);
                    f21118m.put(this.f21122B, dVar2);
                    this.f21150v.a(activity, dVar2, str, this.f21121A, this.f21128H, this.f21124D, xVar);
                    this.i = false;
                    return;
                }
                this.i = false;
                if (this.f21153y != null) {
                    try {
                        this.f21153y.b("can't show because load is failed");
                        return;
                    } catch (Exception e13) {
                        if (com.anythink.expressad.a.f18405a) {
                            e13.printStackTrace();
                            return;
                        }
                        return;
                    }
                }
                return;
            } catch (Exception e14) {
                if (com.anythink.expressad.a.f18405a) {
                    e14.getLocalizedMessage();
                }
                if (this.f21153y != null) {
                    try {
                        this.f21153y.b("show exception");
                    } catch (Exception unused2) {
                        if (com.anythink.expressad.a.f18405a) {
                            e14.printStackTrace();
                        }
                    }
                }
                this.i = false;
                return;
            }
            if (com.anythink.expressad.a.f18405a) {
                e9.getLocalizedMessage();
            }
            if (this.f21153y != null) {
                try {
                    this.f21153y.b("show exception");
                } catch (Exception unused3) {
                    if (com.anythink.expressad.a.f18405a) {
                        e9.printStackTrace();
                    }
                }
            }
            this.i = false;
        }
    }

    private static void a(boolean z6, boolean z9) {
        try {
            ConcurrentHashMap<String, d> concurrentHashMap = f21118m;
            if (concurrentHashMap != null) {
                concurrentHashMap.clear();
            }
            if (z6) {
                if (z9) {
                    com.anythink.expressad.videocommon.a.a(com.anythink.expressad.foundation.g.a.aY);
                } else {
                    com.anythink.expressad.videocommon.a.b(com.anythink.expressad.foundation.g.a.aY);
                }
            } else if (z9) {
                com.anythink.expressad.videocommon.a.a(94);
            } else {
                com.anythink.expressad.videocommon.a.b(94);
            }
            com.anythink.expressad.videocommon.a.a();
            com.anythink.expressad.videocommon.a.b();
        } catch (Throwable unused) {
        }
    }

    private static void a(boolean z6, boolean z9, String str) {
        try {
            ConcurrentHashMap<String, d> concurrentHashMap = f21118m;
            if (concurrentHashMap != null) {
                concurrentHashMap.clear();
            }
            if (z6) {
                if (z9) {
                    com.anythink.expressad.videocommon.a.a(com.anythink.expressad.foundation.g.a.aY);
                } else {
                    com.anythink.expressad.videocommon.a.b(com.anythink.expressad.foundation.g.a.aY);
                }
            } else if (z9) {
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
