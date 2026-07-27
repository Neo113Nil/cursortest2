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
    public static final int f20479a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f20480b = 8;

    /* renamed from: c, reason: collision with root package name */
    public static final int f20481c = 9;

    /* renamed from: d, reason: collision with root package name */
    public static final int f20482d = 16;

    /* renamed from: e, reason: collision with root package name */
    public static final int f20483e = 18;

    /* renamed from: f, reason: collision with root package name */
    public static final int f20484f = 17;

    /* renamed from: g, reason: collision with root package name */
    public static final int f20485g = 1001001;

    /* renamed from: h, reason: collision with root package name */
    public static final int f20486h = 1001002;

    /* renamed from: j, reason: collision with root package name */
    public static String f20487j = null;

    /* renamed from: l, reason: collision with root package name */
    public static String f20488l = "";

    /* renamed from: s, reason: collision with root package name */
    private static final String f20490s = "RewardVideoController";

    /* renamed from: t, reason: collision with root package name */
    private static final int f20491t = 25;

    /* renamed from: A, reason: collision with root package name */
    private String f20492A;

    /* renamed from: B, reason: collision with root package name */
    private String f20493B;

    /* renamed from: C, reason: collision with root package name */
    private volatile String f20494C;

    /* renamed from: D, reason: collision with root package name */
    private String f20495D;

    /* renamed from: E, reason: collision with root package name */
    private String f20496E;

    /* renamed from: I, reason: collision with root package name */
    private int f20500I;
    private int J;

    /* renamed from: K, reason: collision with root package name */
    private int f20501K;

    /* renamed from: P, reason: collision with root package name */
    private boolean f20506P;

    /* renamed from: W, reason: collision with root package name */
    private Queue<Integer> f20511W;

    /* renamed from: X, reason: collision with root package name */
    private String f20512X;
    private CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> ag;
    private List<com.anythink.expressad.foundation.d.d> ah;

    /* renamed from: k, reason: collision with root package name */
    b f20514k;

    /* renamed from: u, reason: collision with root package name */
    private Context f20520u;

    /* renamed from: v, reason: collision with root package name */
    private com.anythink.expressad.reward.a.d f20521v;

    /* renamed from: w, reason: collision with root package name */
    private com.anythink.expressad.videocommon.e.d f20522w;

    /* renamed from: x, reason: collision with root package name */
    private com.anythink.expressad.videocommon.e.a f20523x;

    /* renamed from: y, reason: collision with root package name */
    private volatile com.anythink.expressad.videocommon.d.a f20524y;

    /* renamed from: z, reason: collision with root package name */
    private volatile c f20525z;

    /* renamed from: U, reason: collision with root package name */
    private static ConcurrentHashMap<String, Integer> f20477U = new ConcurrentHashMap<>();

    /* renamed from: m, reason: collision with root package name */
    public static ConcurrentHashMap<String, d> f20489m = new ConcurrentHashMap<>();

    /* renamed from: V, reason: collision with root package name */
    private static ConcurrentHashMap<String, String> f20478V = new ConcurrentHashMap<>();

    /* renamed from: F, reason: collision with root package name */
    private int f20497F = 0;

    /* renamed from: H, reason: collision with root package name */
    private int f20499H = 2;

    /* renamed from: L, reason: collision with root package name */
    private boolean f20502L = false;

    /* renamed from: M, reason: collision with root package name */
    private boolean f20503M = false;

    /* renamed from: N, reason: collision with root package name */
    private boolean f20504N = false;

    /* renamed from: O, reason: collision with root package name */
    private boolean f20505O = false;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f20507Q = false;

    /* renamed from: R, reason: collision with root package name */
    private ArrayList<Integer> f20508R = new ArrayList<>(7);

    /* renamed from: S, reason: collision with root package name */
    private boolean f20509S = false;
    public volatile boolean i = false;

    /* renamed from: T, reason: collision with root package name */
    private final Object f20510T = new Object();
    private com.anythink.expressad.foundation.c.c Y = null;

    /* renamed from: Z, reason: collision with root package name */
    private volatile boolean f20513Z = true;
    private volatile boolean aa = false;
    private volatile boolean ab = false;
    private volatile boolean ac = false;
    private volatile boolean ad = false;
    private volatile boolean ae = false;
    private volatile boolean af = false;

    /* renamed from: n, reason: collision with root package name */
    volatile boolean f20515n = false;

    /* renamed from: o, reason: collision with root package name */
    volatile boolean f20516o = false;

    /* renamed from: p, reason: collision with root package name */
    volatile boolean f20517p = false;

    /* renamed from: q, reason: collision with root package name */
    volatile boolean f20518q = false;

    /* renamed from: r, reason: collision with root package name */
    volatile boolean f20519r = false;

    /* renamed from: G, reason: collision with root package name */
    private Handler f20498G = new com.anythink.expressad.reward.b.b(this);

    /* renamed from: com.anythink.expressad.reward.b.a$a, reason: collision with other inner class name */
    public class RunnableC0129a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private com.anythink.expressad.reward.a.d f20527b;

        /* renamed from: c, reason: collision with root package name */
        private int f20528c = 1;

        /* renamed from: d, reason: collision with root package name */
        private boolean f20529d = true;

        /* renamed from: e, reason: collision with root package name */
        private boolean f20530e = false;

        public RunnableC0129a(com.anythink.expressad.reward.a.d dVar) {
            this.f20527b = dVar;
            if (dVar != null) {
                dVar.g(false);
            }
        }

        public final void a() {
            this.f20530e = true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f20530e) {
                return;
            }
            com.anythink.expressad.reward.a.d dVar = this.f20527b;
            if (dVar != null) {
                dVar.g(true);
            }
            a.this.b("v3 is timeout");
        }
    }

    public class b implements com.anythink.expressad.reward.a.b {

        /* renamed from: b, reason: collision with root package name */
        private com.anythink.expressad.reward.a.d f20532b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f20533c = true;

        /* renamed from: d, reason: collision with root package name */
        private RunnableC0129a f20534d;

        public b(com.anythink.expressad.reward.a.d dVar) {
            this.f20532b = dVar;
        }

        private Runnable c() {
            return this.f20534d;
        }

        public final void a(RunnableC0129a runnableC0129a) {
            this.f20534d = runnableC0129a;
        }

        @Override // com.anythink.expressad.reward.a.b
        public final void b() {
            RunnableC0129a runnableC0129a = this.f20534d;
            if (runnableC0129a != null) {
                runnableC0129a.a();
                a.this.f20498G.removeCallbacks(this.f20534d);
            }
            if (a.this.f20525z != null) {
                c.a(a.this.f20525z, a.this.f20494C, a.this.f20493B);
            }
        }

        @Override // com.anythink.expressad.reward.a.b
        public final void a() {
            if (this.f20534d != null) {
                a.this.f20498G.removeCallbacks(this.f20534d);
            }
            if (a.this.f20525z != null) {
                a.this.f20525z.a(a.this.f20494C, a.this.f20493B);
            }
        }

        @Override // com.anythink.expressad.reward.a.b
        public final void a(com.anythink.expressad.foundation.e.c cVar) {
            RunnableC0129a runnableC0129a = this.f20534d;
            if (runnableC0129a != null) {
                runnableC0129a.a();
                a.this.f20498G.removeCallbacks(this.f20534d);
            }
            com.anythink.expressad.reward.a.d dVar = this.f20532b;
            if (dVar != null) {
                dVar.a((com.anythink.expressad.reward.a.b) null);
                this.f20532b = null;
            }
            if (a.this.f20525z != null) {
                a.this.f20525z.a(cVar != null ? cVar.a() : "unknown reason");
            }
        }
    }

    public final class c {

        /* renamed from: b, reason: collision with root package name */
        private static final String f20535b = "RewardVideoController_Listener";

        /* renamed from: d, reason: collision with root package name */
        private static final int f20536d = 0;

        /* renamed from: e, reason: collision with root package name */
        private static final int f20537e = 1;

        /* renamed from: f, reason: collision with root package name */
        private static final int f20538f = 2;

        /* renamed from: g, reason: collision with root package name */
        private static final int f20539g = 3;

        /* renamed from: c, reason: collision with root package name */
        private WeakReference<com.anythink.expressad.videocommon.d.a> f20541c;

        /* renamed from: h, reason: collision with root package name */
        private volatile AtomicInteger f20542h;
        private Handler i;

        /* renamed from: j, reason: collision with root package name */
        private String f20543j;

        /* renamed from: k, reason: collision with root package name */
        private List<com.anythink.expressad.foundation.d.d> f20544k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f20545l;

        public /* synthetic */ c(a aVar, com.anythink.expressad.videocommon.d.a aVar2, Handler handler, String str, byte b9) {
            this(aVar2, handler, str);
        }

        private int a() {
            return this.f20542h.get();
        }

        private void c(String str, String str2) {
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = this.f20541c;
            com.anythink.expressad.videocommon.d.a aVar = weakReference != null ? weakReference.get() : null;
            this.f20542h.get();
            boolean unused = a.this.ab;
            if ((this.f20542h.get() == 1 || this.f20542h.get() == 3) && this.i != null) {
                if (a.this.ab) {
                    this.f20542h.get();
                    boolean unused2 = a.this.ab;
                    return;
                }
                this.f20542h.get();
                boolean unused3 = a.this.ab;
                a.h(a.this);
                if (aVar != null) {
                    Message obtain = Message.obtain();
                    Bundle bundle = new Bundle();
                    bundle.putString(com.anythink.expressad.a.f17800z, str);
                    bundle.putString("unit_id", str2);
                    bundle.putBoolean(com.anythink.expressad.a.f17782g, false);
                    obtain.setData(bundle);
                    obtain.obj = str2;
                    obtain.what = 17;
                    this.i.sendMessage(obtain);
                }
            }
        }

        private void d(String str, String str2) {
            this.f20542h.get();
            boolean unused = a.this.ab;
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = this.f20541c;
            com.anythink.expressad.videocommon.d.a aVar = weakReference != null ? weakReference.get() : null;
            if (this.i != null) {
                if (a.this.ab) {
                    this.f20542h.get();
                    boolean unused2 = a.this.ab;
                    return;
                }
                this.f20542h.get();
                boolean unused3 = a.this.ab;
                a.h(a.this);
                if (aVar != null) {
                    Message obtain = Message.obtain();
                    Bundle bundle = new Bundle();
                    bundle.putString(com.anythink.expressad.a.f17800z, str);
                    bundle.putString("unit_id", str2);
                    bundle.putBoolean(com.anythink.expressad.a.f17782g, true);
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
                handler.removeMessages(a.f20486h);
            }
            this.f20542h.get();
            boolean unused = a.this.ac;
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = this.f20541c;
            com.anythink.expressad.videocommon.d.a aVar = weakReference != null ? weakReference.get() : null;
            if (this.f20542h.get() == 2 || this.i == null) {
                return;
            }
            if (this.f20542h.get() == 1) {
                this.f20542h.set(3);
            }
            if (a.this.ac) {
                this.f20542h.get();
                boolean unused2 = a.this.ac;
                return;
            }
            this.f20542h.get();
            boolean unused3 = a.this.ac;
            a.j(a.this);
            if (aVar != null) {
                Message obtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(com.anythink.expressad.a.f17800z, str);
                bundle.putString("unit_id", str2);
                obtain.setData(bundle);
                obtain.obj = str2;
                obtain.what = 9;
                this.i.sendMessage(obtain);
            }
            if (a.this.ad) {
                this.f20542h.set(2);
            }
        }

        private c(com.anythink.expressad.videocommon.d.a aVar, Handler handler, String str) {
            this.f20541c = new WeakReference<>(aVar);
            this.f20542h = new AtomicInteger(0);
            this.i = handler;
            this.f20543j = str;
        }

        private void a(int i) {
            this.f20542h.set(i);
        }

        public final void a(String str, String str2) {
            Handler handler = this.i;
            if (handler != null) {
                handler.removeMessages(a.f20486h);
            }
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = this.f20541c;
            com.anythink.expressad.videocommon.d.a aVar = weakReference != null ? weakReference.get() : null;
            this.f20542h.get();
            boolean unused = a.this.ac;
            if (this.f20542h.get() == 2 || this.i == null) {
                return;
            }
            this.f20542h.set(2);
            if (!a.this.ac) {
                this.f20542h.get();
                boolean unused2 = a.this.ac;
                a.j(a.this);
                if (aVar != null) {
                    Message obtain = Message.obtain();
                    Bundle bundle = new Bundle();
                    bundle.putString(com.anythink.expressad.a.f17800z, str);
                    bundle.putString("unit_id", str2);
                    obtain.setData(bundle);
                    obtain.obj = str2;
                    obtain.what = 9;
                    this.i.sendMessage(obtain);
                    return;
                }
                return;
            }
            this.f20542h.get();
            boolean unused3 = a.this.ac;
        }

        private void c(String str) {
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = this.f20541c;
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
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = this.f20541c;
            com.anythink.expressad.videocommon.d.a aVar = weakReference != null ? weakReference.get() : null;
            this.f20542h.get();
            boolean unused = a.this.ae;
            if (this.f20542h.get() == 2 || (handler = this.i) == null) {
                return;
            }
            if (handler != null) {
                a.n(a.this);
                if (str.contains("resource load timeout")) {
                    a.l(a.this);
                }
                if (a.this.ae && a.this.ad && !a.this.ac) {
                    this.f20542h.set(2);
                    if (aVar != null) {
                        this.f20542h.get();
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
            this.f20542h.get();
            boolean unused3 = a.this.ae;
        }

        public final void a(String str) {
            Handler handler = this.i;
            if (handler != null) {
                handler.removeMessages(a.f20486h);
            }
            this.f20542h.get();
            boolean unused = a.this.ad;
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = this.f20541c;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            if ((this.f20542h.get() == 1 || this.f20542h.get() == 3) && this.i != null) {
                a.l(a.this);
                if (!a.this.af || str.contains("resource load timeout")) {
                    a.n(a.this);
                }
                if (a.this.ac) {
                    this.f20542h.set(2);
                }
                if (a.this.ad && a.this.ae && !a.this.ac) {
                    this.f20542h.set(2);
                    this.f20542h.get();
                    boolean unused2 = a.this.ad;
                    Message obtain = Message.obtain();
                    obtain.obj = str;
                    obtain.what = 16;
                    this.i.sendMessage(obtain);
                    return;
                }
                this.f20542h.get();
                boolean unused3 = a.this.ad;
            }
        }

        private void b(String str) {
            this.f20542h.set(2);
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = this.f20541c;
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
            cVar.f20542h.set(1);
        }

        private void a(boolean z8) {
            this.f20545l = z8;
        }

        public static /* synthetic */ void a(c cVar, String str) {
            cVar.f20542h.set(2);
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = cVar.f20541c;
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
            return cVar.f20542h.get();
        }

        public static /* synthetic */ void a(c cVar, String str, String str2) {
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = cVar.f20541c;
            com.anythink.expressad.videocommon.d.a aVar = weakReference != null ? weakReference.get() : null;
            cVar.f20542h.get();
            boolean unused = a.this.ab;
            if ((cVar.f20542h.get() == 1 || cVar.f20542h.get() == 3) && cVar.i != null) {
                if (!a.this.ab) {
                    cVar.f20542h.get();
                    boolean unused2 = a.this.ab;
                    a.h(a.this);
                    if (aVar != null) {
                        Message obtain = Message.obtain();
                        Bundle bundle = new Bundle();
                        bundle.putString(com.anythink.expressad.a.f17800z, str);
                        bundle.putString("unit_id", str2);
                        bundle.putBoolean(com.anythink.expressad.a.f17782g, false);
                        obtain.setData(bundle);
                        obtain.obj = str2;
                        obtain.what = 17;
                        cVar.i.sendMessage(obtain);
                        return;
                    }
                    return;
                }
                cVar.f20542h.get();
                boolean unused3 = a.this.ab;
            }
        }
    }

    public final class d extends com.anythink.expressad.video.bt.module.b.c {

        /* renamed from: d, reason: collision with root package name */
        private a f20547d;

        /* renamed from: e, reason: collision with root package name */
        private Handler f20548e;

        /* renamed from: f, reason: collision with root package name */
        private int f20549f;

        public /* synthetic */ d(a aVar, a aVar2, Handler handler, byte b9) {
            this(aVar2, handler);
        }

        private void d() {
            a.this.f20508R.clear();
            this.f20547d = null;
        }

        @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
        public final void a() {
            a.this.i = false;
            try {
                a aVar = this.f20547d;
                if (aVar != null) {
                    aVar.f20509S = true;
                    if (this.f20547d.f20521v != null) {
                        this.f20547d.f20521v.f20423n = "";
                    }
                    this.f21219b = true;
                    if (this.f20547d.f20524y != null) {
                        boolean unused = a.this.f20503M;
                        this.f20547d.f20524y.c();
                        this.f20549f = 2;
                    }
                }
            } catch (Throwable th) {
                if (com.anythink.expressad.a.f17776a) {
                    th.printStackTrace();
                }
            }
        }

        @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
        public final void b() {
            try {
                a aVar = this.f20547d;
                if (aVar == null || aVar.f20524y == null) {
                    return;
                }
                try {
                    this.f20547d.f20524y.d();
                } catch (Exception e6) {
                    if (com.anythink.expressad.a.f17776a) {
                        e6.printStackTrace();
                    }
                }
                this.f20549f = 5;
            } catch (Exception e9) {
                if (com.anythink.expressad.a.f17776a) {
                    e9.printStackTrace();
                }
            }
        }

        @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
        public final void c() {
            try {
                a aVar = this.f20547d;
                if (aVar == null || aVar.f20524y == null) {
                    return;
                }
                try {
                    com.anythink.expressad.videocommon.d.a unused = this.f20547d.f20524y;
                    com.anythink.expressad.foundation.f.b.a().b("_2", 2);
                } catch (Exception e6) {
                    if (com.anythink.expressad.a.f17776a) {
                        e6.printStackTrace();
                    }
                }
                this.f20549f = 6;
            } catch (Exception e9) {
                if (com.anythink.expressad.a.f17776a) {
                    e9.printStackTrace();
                }
            }
        }

        private d(a aVar, Handler handler) {
            this.f20549f = 0;
            this.f20547d = aVar;
            this.f20548e = handler;
        }

        @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
        public final void a(boolean z8, com.anythink.expressad.videocommon.c.c cVar) {
            try {
                a aVar = this.f20547d;
                if (aVar == null || aVar.f20524y == null) {
                    return;
                }
                if (cVar == null) {
                    cVar = com.anythink.expressad.videocommon.c.c.b(this.f20547d.f20496E);
                }
                if (a.this.f20503M) {
                    a.this.a();
                }
                this.f20547d.f20524y.a(z8, cVar.a(), cVar.b());
                this.f20549f = 7;
                this.f20547d.f20509S = false;
                a.this.f20508R.clear();
                this.f20547d = null;
            } catch (Exception e6) {
                if (com.anythink.expressad.a.f17776a) {
                    e6.printStackTrace();
                }
            }
        }

        @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
        public final void a(String str) {
            a.this.i = false;
            try {
                if (this.f20547d != null) {
                    boolean unused = a.this.f20503M;
                    this.f20547d.f20509S = false;
                    this.f21220c = true;
                    if (this.f20547d.f20524y != null) {
                        try {
                            if (a.this.ag != null) {
                                a.this.ag.size();
                            }
                        } catch (Exception unused2) {
                        }
                        try {
                            this.f20547d.f20524y.b(str);
                        } catch (Exception e6) {
                            if (com.anythink.expressad.a.f17776a) {
                                e6.printStackTrace();
                            }
                        }
                        this.f20549f = 4;
                    }
                }
            } catch (Exception e9) {
                this.f20549f = 0;
                if (com.anythink.expressad.a.f17776a) {
                    e9.printStackTrace();
                }
            }
        }

        @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
        public final void a(com.anythink.expressad.foundation.d.d dVar) {
            try {
                a aVar = this.f20547d;
                if (aVar == null || aVar.f20524y == null) {
                    return;
                }
                try {
                    boolean unused = a.this.f20503M;
                    this.f20547d.f20524y.a(dVar);
                } catch (Exception e6) {
                    if (com.anythink.expressad.a.f17776a) {
                        e6.printStackTrace();
                    }
                }
            } catch (Exception e9) {
                if (com.anythink.expressad.a.f17776a) {
                    e9.printStackTrace();
                }
            }
        }

        @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
        public final void a(boolean z8, int i) {
            try {
                a aVar = this.f20547d;
                if (aVar == null || aVar.f20524y == null) {
                    return;
                }
                this.f20547d.f20509S = false;
                try {
                    com.anythink.expressad.videocommon.d.a unused = this.f20547d.f20524y;
                } catch (Exception e6) {
                    if (com.anythink.expressad.a.f17776a) {
                        e6.printStackTrace();
                    }
                }
            } catch (Exception e9) {
                if (com.anythink.expressad.a.f17776a) {
                    e9.printStackTrace();
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
            if (!this.f20503M) {
                if (this.f20521v == null) {
                    q();
                }
                com.anythink.expressad.reward.a.d dVar = this.f20521v;
                if (dVar != null) {
                    return dVar.c();
                }
                return false;
            }
        } catch (Throwable th) {
            if (com.anythink.expressad.a.f17776a) {
                th.printStackTrace();
            }
        }
        return false;
    }

    private void b(boolean z8) {
        this.f20503M = z8;
    }

    private void c(boolean z8) {
        this.f20507Q = z8;
    }

    private String n() {
        com.anythink.expressad.reward.a.d dVar = this.f20521v;
        return dVar != null ? dVar.c(this.f20509S) : "";
    }

    private static void o() {
        p.a();
    }

    private boolean p() {
        if (this.f20521v == null) {
            q();
        }
        com.anythink.expressad.reward.a.d dVar = this.f20521v;
        if (dVar != null) {
            return dVar.c();
        }
        return false;
    }

    private void q() {
        com.anythink.expressad.reward.a.d dVar = new com.anythink.expressad.reward.a.d(this.f20520u, this.f20494C, this.f20493B);
        this.f20521v = dVar;
        dVar.a(this.f20502L);
        this.f20521v.b(this.f20503M);
        if (this.f20502L) {
            this.f20521v.a(this.f20500I, this.J, this.f20501K);
        }
        this.f20521v.a(this.f20522w);
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
        return this.f20493B;
    }

    public final String e() {
        return this.f20494C;
    }

    public final boolean f() {
        return this.f20502L;
    }

    public final boolean g() {
        return this.f20503M;
    }

    public final com.anythink.expressad.videocommon.d.a h() {
        return this.f20524y;
    }

    public final c i() {
        return this.f20525z;
    }

    public final CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> j() {
        return this.ag;
    }

    public final List<com.anythink.expressad.foundation.d.d> k() {
        return this.ah;
    }

    public final com.anythink.expressad.reward.a.d l() {
        return this.f20521v;
    }

    private static void b(String str, String str2) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (concurrentHashMap = f20478V) == null || concurrentHashMap.containsKey(str)) {
            return;
        }
        f20478V.put(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[Catch: Exception -> 0x0011, TryCatch #0 {Exception -> 0x0011, blocks: (B:2:0x0000, B:4:0x0004, B:7:0x002c, B:9:0x0030, B:10:0x003b, B:14:0x0013), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void c(e eVar) {
        try {
            com.anythink.expressad.reward.a.d dVar = this.f20521v;
            if (dVar != null) {
                if (!this.f20493B.equals(dVar.e())) {
                }
                if (this.f20502L) {
                    this.f20521v.a(this.f20500I, this.J, this.f20501K);
                }
                this.f20521v.a(this.f20499H);
                this.f20521v.a(this.f20522w);
                RunnableC0129a runnableC0129a = new RunnableC0129a(this.f20521v);
                b bVar = new b(this.f20521v);
                this.f20514k = bVar;
                bVar.a(runnableC0129a);
                this.f20521v.a(this.f20514k);
                this.f20521v.a(eVar);
            }
            com.anythink.expressad.reward.a.d dVar2 = new com.anythink.expressad.reward.a.d(this.f20520u, this.f20494C, this.f20493B);
            this.f20521v = dVar2;
            dVar2.a(this.f20502L);
            this.f20521v.b(this.f20503M);
            if (this.f20502L) {
            }
            this.f20521v.a(this.f20499H);
            this.f20521v.a(this.f20522w);
            RunnableC0129a runnableC0129a2 = new RunnableC0129a(this.f20521v);
            b bVar2 = new b(this.f20521v);
            this.f20514k = bVar2;
            bVar2.a(runnableC0129a2);
            this.f20521v.a(this.f20514k);
            this.f20521v.a(eVar);
        } catch (Exception e6) {
            b(e6.getMessage());
        }
    }

    public final void a(boolean z8) {
        this.f20502L = z8;
    }

    public final void a(int i) {
        this.f20499H = i;
    }

    private void a(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str)) {
            x.a(this.f20520u, "Anythink_ConfirmTitle" + this.f20493B, str.trim());
        }
        if (!TextUtils.isEmpty(str2)) {
            x.a(this.f20520u, "Anythink_ConfirmContent" + this.f20493B, str2.trim());
        }
        if (!TextUtils.isEmpty(str4)) {
            x.a(this.f20520u, "Anythink_CancelText" + this.f20493B, str4.trim());
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        x.a(this.f20520u, "Anythink_ConfirmText" + this.f20493B, str3.trim());
    }

    private void b(e eVar) {
        try {
            c(eVar);
        } catch (Exception e6) {
            try {
                b("load mv api error:" + e6.getMessage());
            } catch (Exception e9) {
                b(com.anythink.expressad.foundation.g.b.b.f19297b);
                if (com.anythink.expressad.a.f17776a) {
                    e9.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (this.f20525z != null) {
            this.ae = true;
            this.f20525z.a(str);
        }
    }

    private void a(int i, int i4, int i9) {
        this.f20500I = i;
        this.J = i4;
        if (i4 == com.anythink.expressad.foundation.g.a.cy) {
            this.f20501K = i9 < 0 ? 5 : i9;
        }
        if (i4 == com.anythink.expressad.foundation.g.a.cx) {
            this.f20501K = i9 < 0 ? 80 : i9;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ivRewardEnable", 1);
            jSONObject.put("ivRewardMode", i == com.anythink.expressad.foundation.g.a.cv ? 0 : 1);
            jSONObject.put("ivRewardPlayValueMode", i4 == com.anythink.expressad.foundation.g.a.cx ? 0 : 1);
            jSONObject.put("ivRewardPlayValue", i9);
            com.anythink.expressad.f.b.a();
            com.anythink.expressad.f.b.e(this.f20493B, jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    private com.anythink.expressad.videocommon.c.b b(int i) {
        com.anythink.expressad.videocommon.e.d dVar = this.f20522w;
        com.anythink.expressad.videocommon.c.b bVar = null;
        if (dVar != null) {
            int size = dVar.I().size();
            for (int i4 = 0; i4 < size; i4++) {
                if (this.f20522w.I().get(i4).a() == i) {
                    bVar = this.f20522w.I().get(i4);
                }
            }
        }
        return bVar;
    }

    public final boolean c() {
        return this.f20506P;
    }

    public final com.anythink.expressad.videocommon.e.d b() {
        return this.f20522w;
    }

    public static void a(String str, int i) {
        try {
            if (f20477U == null || !y.b(str)) {
                return;
            }
            f20477U.put(str, Integer.valueOf(i));
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    public static int a(String str) {
        ConcurrentHashMap<String, Integer> concurrentHashMap;
        Integer num;
        try {
            if (!y.b(str) || (concurrentHashMap = f20477U) == null || !concurrentHashMap.containsKey(str) || (num = f20477U.get(str)) == null) {
                return 0;
            }
            return num.intValue();
        } catch (Exception e6) {
            e6.printStackTrace();
            return 0;
        }
    }

    public final void a() {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (!this.f20509S || (concurrentHashMap = f20478V) == null || concurrentHashMap.containsKey(n())) {
            return;
        }
        f20478V.remove(n());
    }

    public final void a(com.anythink.expressad.videocommon.d.a aVar) {
        this.f20524y = aVar;
        this.f20525z = new c(this, aVar, this.f20498G, this.f20493B, (byte) 0);
    }

    public final void a(String str, String str2) {
        try {
            this.f20520u = t.b().g();
            this.f20493B = str2;
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            this.f20494C = str;
            this.f20523x = com.anythink.expressad.videocommon.e.c.a().b();
            p.b();
            n.a().b();
            j.a().b();
            com.anythink.expressad.videocommon.e.c.a().a(this.f20493B, this.f20502L);
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
            c.a(this.f20525z, com.anythink.expressad.foundation.g.b.b.f19301f);
            return;
        }
        if (this.f20525z != null && c.a(this.f20525z) == 3) {
            this.f20513Z = false;
        } else {
            this.f20513Z = true;
            c.b(this.f20525z);
        }
        this.f20506P = true;
        this.f20498G.removeMessages(f20485g);
        this.ac = false;
        this.ab = false;
        this.ad = false;
        this.ae = false;
        com.anythink.expressad.reward.a.c.a();
        try {
            this.f20522w = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f20493B, this.f20502L);
            if (!TextUtils.isEmpty(this.f20494C)) {
                this.f20522w.b(this.f20494C);
            }
            int S8 = this.f20522w.S() * 1000;
            if (this.f20498G != null) {
                Message obtain = Message.obtain();
                obtain.what = f20486h;
                this.f20498G.sendMessageDelayed(obtain, S8);
            }
            this.f20511W = this.f20522w.Q();
            try {
                c(eVar);
            } catch (Exception e6) {
                try {
                    b("load mv api error:" + e6.getMessage());
                } catch (Exception e9) {
                    b(com.anythink.expressad.foundation.g.b.b.f19297b);
                    if (com.anythink.expressad.a.f17776a) {
                        e9.printStackTrace();
                    }
                }
            }
        } catch (Exception e10) {
            if (this.f20525z != null) {
                this.f20525z.a("load exception");
            }
            if (com.anythink.expressad.a.f17776a) {
                e10.printStackTrace();
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
            if (this.f20521v == null) {
                q();
            }
            com.anythink.expressad.reward.a.d dVar = this.f20521v;
            if (dVar != null && dVar.c()) {
                d dVar2 = new d(this, this, this.f20498G, b9);
                f20489m.put(this.f20493B, dVar2);
                this.f20521v.a(activity, dVar2, str, this.f20492A, this.f20499H, this.f20495D, xVar);
                this.i = false;
                return;
            }
            this.i = false;
            if (this.f20524y != null) {
                try {
                    this.f20524y.b("can't show because load is failed");
                } catch (Exception e6) {
                    if (com.anythink.expressad.a.f17776a) {
                        e6.printStackTrace();
                    }
                }
            }
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f17776a) {
                e9.getLocalizedMessage();
            }
            if (this.f20524y != null) {
                try {
                    this.f20524y.b("show exception");
                } catch (Exception unused) {
                    if (com.anythink.expressad.a.f17776a) {
                        e9.printStackTrace();
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
            this.f20496E = str;
            this.f20492A = str2;
            this.f20495D = str3;
        } catch (Exception e6) {
            if (com.anythink.expressad.a.f17776a) {
            }
            if (this.f20524y != null) {
            }
            this.i = false;
        }
        synchronized (this.f20510T) {
            if (this.i) {
                if (this.f20524y != null) {
                    try {
                        this.f20524y.b(com.anythink.expressad.foundation.g.b.b.f19302g);
                    } catch (Exception e9) {
                        if (com.anythink.expressad.a.f17776a) {
                            e9.printStackTrace();
                        }
                    }
                }
                return;
            }
            this.i = true;
            Context context = this.f20520u;
            if (context == null) {
                if (this.f20524y != null) {
                    try {
                        this.f20524y.b(com.anythink.expressad.foundation.g.b.b.f19296a);
                    } catch (Exception e10) {
                        if (com.anythink.expressad.a.f17776a) {
                            e10.printStackTrace();
                        }
                    }
                }
                this.i = false;
                return;
            }
            if (this.f20502L && !v.b(context)) {
                if (this.f20524y != null) {
                    try {
                        this.f20524y.b(com.anythink.expressad.foundation.g.b.b.f19299d);
                    } catch (Exception e11) {
                        if (com.anythink.expressad.a.f17776a) {
                            e11.printStackTrace();
                        }
                    }
                }
                this.i = false;
                return;
            }
            r();
            try {
                String format = new SimpleDateFormat("dd").format(new Date());
                String str4 = (String) x.b(this.f20520u, com.anythink.expressad.foundation.g.a.bO, "0");
                if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(format) && !str4.equals(format)) {
                    x.a(this.f20520u, com.anythink.expressad.foundation.g.a.bO, format);
                    x.a(this.f20520u, this.f20494C + "_1", 0);
                }
            } catch (Exception unused) {
            }
            try {
                if (this.f20521v == null) {
                    q();
                }
                com.anythink.expressad.reward.a.d dVar = this.f20521v;
                if (dVar != null && dVar.c()) {
                    d dVar2 = new d(this, this, this.f20498G, b9);
                    f20489m.put(this.f20493B, dVar2);
                    this.f20521v.a(activity, dVar2, str, this.f20492A, this.f20499H, this.f20495D, xVar);
                    this.i = false;
                    return;
                }
                this.i = false;
                if (this.f20524y != null) {
                    try {
                        this.f20524y.b("can't show because load is failed");
                        return;
                    } catch (Exception e12) {
                        if (com.anythink.expressad.a.f17776a) {
                            e12.printStackTrace();
                            return;
                        }
                        return;
                    }
                }
                return;
            } catch (Exception e13) {
                if (com.anythink.expressad.a.f17776a) {
                    e13.getLocalizedMessage();
                }
                if (this.f20524y != null) {
                    try {
                        this.f20524y.b("show exception");
                    } catch (Exception unused2) {
                        if (com.anythink.expressad.a.f17776a) {
                            e13.printStackTrace();
                        }
                    }
                }
                this.i = false;
                return;
            }
            if (com.anythink.expressad.a.f17776a) {
                e6.getLocalizedMessage();
            }
            if (this.f20524y != null) {
                try {
                    this.f20524y.b("show exception");
                } catch (Exception unused3) {
                    if (com.anythink.expressad.a.f17776a) {
                        e6.printStackTrace();
                    }
                }
            }
            this.i = false;
        }
    }

    private static void a(boolean z8, boolean z9) {
        try {
            ConcurrentHashMap<String, d> concurrentHashMap = f20489m;
            if (concurrentHashMap != null) {
                concurrentHashMap.clear();
            }
            if (z8) {
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

    private static void a(boolean z8, boolean z9, String str) {
        try {
            ConcurrentHashMap<String, d> concurrentHashMap = f20489m;
            if (concurrentHashMap != null) {
                concurrentHashMap.clear();
            }
            if (z8) {
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
