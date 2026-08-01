package com.anythink.core.common.d;

import D.y;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.widget.Toast;
import com.anythink.core.api.ATAdFilter;
import com.anythink.core.api.ATCommonConfig;
import com.anythink.core.api.ATCustomAdapterConfig;
import com.anythink.core.api.ATDebuggerConfig;
import com.anythink.core.api.ATInitConfig;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.ATNetworkConfig;
import com.anythink.core.api.ATOsDmEntity;
import com.anythink.core.api.ATSDKGlobalSetting;
import com.anythink.core.api.ATSharedPlacementConfig;
import com.anythink.core.api.ATUserDeviceInfo;
import com.anythink.core.api.DeviceInfoCallback;
import com.anythink.core.api.IATAdFilter;
import com.anythink.core.api.IATDeviceRiskListener;
import com.anythink.core.api.IDlHandler;
import com.anythink.core.api.IExHandler;
import com.anythink.core.api.IOdHandler;
import com.anythink.core.api.IOsExHandler;
import com.anythink.core.api.MediationInitCallback;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.u;
import com.anythink.core.common.h.ae;
import com.anythink.core.common.h.by;
import com.anythink.core.common.v.ab;
import com.anythink.core.common.v.ac;
import com.anythink.core.common.v.af;
import com.anythink.core.common.v.aj;
import com.anythink.core.common.w;
import com.anythink.core.common.x;
import com.anythink.network.adx.AdxATInitManager;
import com.anythink.network.facebook.FacebookATInitConfig;
import dalvik.system.DexFile;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public static final int f12719a = 0;
    private static final Object ak = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final int f12720b = 1;

    /* renamed from: k, reason: collision with root package name */
    private static volatile t f12721k;

    /* renamed from: A, reason: collision with root package name */
    private String f12722A;

    /* renamed from: B, reason: collision with root package name */
    private String f12723B;

    /* renamed from: C, reason: collision with root package name */
    private s f12724C;

    /* renamed from: I, reason: collision with root package name */
    private String f12730I;
    private String J;

    /* renamed from: L, reason: collision with root package name */
    private boolean f12732L;

    /* renamed from: P, reason: collision with root package name */
    private com.anythink.core.common.k.e f12736P;

    /* renamed from: Q, reason: collision with root package name */
    private Location f12737Q;

    /* renamed from: S, reason: collision with root package name */
    private JSONArray f12739S;

    /* renamed from: T, reason: collision with root package name */
    private List<String> f12740T;

    /* renamed from: V, reason: collision with root package name */
    private String f12742V;

    /* renamed from: W, reason: collision with root package name */
    private ATDebuggerConfig f12743W;

    /* renamed from: X, reason: collision with root package name */
    private boolean f12744X;
    private ConcurrentHashMap<String, IATAdFilter> ab;
    private ATUserDeviceInfo ad;
    private by ae;
    private String ah;
    private boolean ai;
    private long aj;
    private volatile com.anythink.core.common.m.c.i al;
    private Pair<Integer, List<String>> ao;
    private Pair<Boolean, com.anythink.core.common.h.n> ap;

    /* renamed from: f, reason: collision with root package name */
    IATDeviceRiskListener f12749f;

    /* renamed from: g, reason: collision with root package name */
    WeakReference<Activity> f12750g;

    /* renamed from: h, reason: collision with root package name */
    private int f12751h;

    /* renamed from: l, reason: collision with root package name */
    private Context f12753l;

    /* renamed from: m, reason: collision with root package name */
    private String f12754m;

    /* renamed from: n, reason: collision with root package name */
    private String f12755n;

    /* renamed from: p, reason: collision with root package name */
    private ATNetworkConfig f12757p;

    /* renamed from: q, reason: collision with root package name */
    private String f12758q;

    /* renamed from: t, reason: collision with root package name */
    private ConcurrentHashMap<String, ATCustomAdapterConfig> f12761t;

    /* renamed from: v, reason: collision with root package name */
    private String f12763v;

    /* renamed from: y, reason: collision with root package name */
    private BroadcastReceiver f12766y;

    /* renamed from: z, reason: collision with root package name */
    private String f12767z;
    private final String i = "SDK.init";

    /* renamed from: j, reason: collision with root package name */
    private boolean f12752j = false;

    /* renamed from: x, reason: collision with root package name */
    private final Object f12765x = new Object();

    /* renamed from: E, reason: collision with root package name */
    private boolean f12726E = false;

    /* renamed from: F, reason: collision with root package name */
    private boolean f12727F = false;

    /* renamed from: G, reason: collision with root package name */
    private long f12728G = 0;

    /* renamed from: H, reason: collision with root package name */
    private long f12729H = 0;

    /* renamed from: M, reason: collision with root package name */
    private boolean f12733M = false;

    /* renamed from: N, reason: collision with root package name */
    private boolean f12734N = false;

    /* renamed from: O, reason: collision with root package name */
    private final Object f12735O = new Object();

    /* renamed from: R, reason: collision with root package name */
    private String f12738R = "";
    private int Y = 1;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f12745Z = false;
    private boolean aa = false;
    private String ac = "";
    private final Object ag = new Object();

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f12746c = false;

    /* renamed from: d, reason: collision with root package name */
    boolean f12747d = false;
    private long am = -1;

    /* renamed from: e, reason: collision with root package name */
    long f12748e = 0;
    private int an = -1;
    private final List<m> aq = new ArrayList();
    private final Map<String, ATAdFilter> ar = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    private Handler f12756o = new Handler(Looper.getMainLooper());

    /* renamed from: s, reason: collision with root package name */
    private ConcurrentHashMap<String, Map<String, Object>> f12760s = new ConcurrentHashMap<>();

    /* renamed from: r, reason: collision with root package name */
    private ConcurrentHashMap<String, Object> f12759r = new ConcurrentHashMap<>();

    /* renamed from: D, reason: collision with root package name */
    private final String f12725D = u1.h.g(new StringBuilder(), File.separator, "anythink.test");

    /* renamed from: K, reason: collision with root package name */
    private boolean f12731K = true;

    /* renamed from: U, reason: collision with root package name */
    private ConcurrentHashMap<String, List<String>> f12741U = new ConcurrentHashMap<>();

    /* renamed from: w, reason: collision with root package name */
    private JSONObject f12764w = new JSONObject();
    private long af = System.currentTimeMillis();

    /* renamed from: u, reason: collision with root package name */
    private final Map<String, Boolean> f12762u = new ConcurrentHashMap(2);

    /* renamed from: com.anythink.core.common.d.t$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f12768a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f12769b;

        public AnonymousClass1(String str, String str2) {
            this.f12768a = str;
            this.f12769b = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            af.b(t.this.f12753l, u.b.f12847a, u.a.f12823b, this.f12768a);
            af.b(t.this.f12753l, u.b.f12847a, u.a.f12824c, this.f12769b);
        }
    }

    /* renamed from: com.anythink.core.common.d.t$10, reason: invalid class name */
    public class AnonymousClass10 implements Runnable {
        private AnonymousClass10() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            s c9 = t.b().c();
            if (c9 != null) {
                c9.startPlugin(t.this.f12753l);
            }
        }
    }

    /* renamed from: com.anythink.core.common.d.t$2, reason: invalid class name */
    public class AnonymousClass2 implements MediationInitCallback {
        public AnonymousClass2() {
        }

        @Override // com.anythink.core.api.MediationInitCallback
        public final void onFail(String str) {
            if (ATCommonConfig.isShowInitErrorTips) {
                t.this.a(new Runnable() { // from class: com.anythink.core.common.d.t.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (t.this.f12753l != null) {
                            Toast.makeText(t.this.f12753l, "There is a problem with the integrated resources of AnyThink SDK, please check whether you have followed the steps of the integration document.", 1).show();
                        }
                    }
                }, 500L);
            }
        }

        @Override // com.anythink.core.api.MediationInitCallback
        public final void onSuccess() {
        }
    }

    /* renamed from: com.anythink.core.common.d.t$3, reason: invalid class name */
    public class AnonymousClass3 extends BroadcastReceiver {
        public AnonymousClass3() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(final Context context, final Intent intent) {
            t.a(new Runnable() { // from class: com.anythink.core.common.d.t.3.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (com.anythink.core.common.v.q.a(context)) {
                        com.anythink.core.common.t.a().b();
                        com.anythink.core.common.s.a().b();
                    }
                    com.anythink.core.common.u.d.a().b();
                    t.this.a(context, false);
                    if (TextUtils.equals(intent.getAction(), j.f12374v)) {
                        com.anythink.core.common.u.e.b(intent.getStringExtra(j.f12375w));
                    }
                }
            });
            try {
                if (t.this.f12724C != null) {
                    t.this.f12724C.resetSSID();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.anythink.core.common.d.t$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f12791a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f12792b;

        public AnonymousClass4(Context context, String str) {
            this.f12791a = context;
            this.f12792b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.anythink.core.d.b b9 = com.anythink.core.d.d.a(this.f12791a.getApplicationContext()).b(this.f12792b);
            if (b9 != null) {
                if (!b9.S()) {
                    com.anythink.core.common.q.a(t.this.f12753l).a(b9);
                    com.anythink.core.common.c.b.a().a(b9.u(), b9.aD(), b9.aE(), b9.aJ());
                    com.anythink.core.common.c.a().b(b9.j());
                    com.anythink.core.a.b.a(this.f12791a.getApplicationContext()).a(b9.aI());
                    t.b().H();
                    t.b().a(b9);
                    com.anythink.core.common.v.e.a().a(b9.g());
                    com.anythink.core.common.b.a.a().a(b9);
                }
                w.a().a(b9.h());
                if (!com.anythink.core.d.d.a(this.f12791a.getApplicationContext()).a(this.f12792b)) {
                    com.anythink.core.d.d.a(this.f12791a.getApplicationContext());
                }
                com.anythink.core.common.o.e.a().a(b9);
            }
        }
    }

    /* renamed from: com.anythink.core.common.d.t$9, reason: invalid class name */
    public class AnonymousClass9 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ATInitConfig f12809a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f12810b;

        public AnonymousClass9(ATInitConfig aTInitConfig, Context context) {
            this.f12809a = aTInitConfig;
            this.f12810b = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00a0 A[Catch: all -> 0x0025, TryCatch #3 {all -> 0x0025, blocks: (B:2:0x0000, B:4:0x0008, B:6:0x0020, B:14:0x005b, B:17:0x0078, B:21:0x008f, B:23:0x00a0, B:24:0x00d4, B:31:0x0058, B:38:0x0028), top: B:1:0x0000 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            Map<String, Object> requestParamMap;
            boolean z3;
            boolean z6;
            com.anythink.core.d.b b9;
            try {
                ATInitMediation initMediation = this.f12809a.getInitMediation();
                if (initMediation != null) {
                    String networkName = initMediation.getNetworkName();
                    String c9 = af.c(t.this.f12753l, u.b.f12853g, networkName, "");
                    if (TextUtils.isEmpty(c9)) {
                        requestParamMap = this.f12809a.getRequestParamMap();
                        requestParamMap.put(ATInitMediation.KEY_LOCAL, Boolean.TRUE);
                    } else {
                        requestParamMap = com.anythink.core.common.v.q.c(c9);
                    }
                    boolean z9 = false;
                    try {
                        z3 = v.a(this.f12810b).c();
                        try {
                            z6 = v.a(this.f12810b).d();
                            try {
                                initMediation.setUserDataConsent(this.f12810b, z3, z6);
                            } catch (Throwable th) {
                                th = th;
                                th.printStackTrace();
                                b9 = com.anythink.core.d.d.a(this.f12810b).b(t.this.f12754m);
                                requestParamMap.put(j.w.f12617d, Boolean.valueOf(b9.B() != 3));
                                boolean b10 = com.anythink.core.common.v.p.b();
                                if (b9.C() == 2) {
                                    z9 = true;
                                }
                                requestParamMap.put(j.w.f12618e, Boolean.valueOf(z9));
                                if (t.b().F()) {
                                }
                                initMediation.initSDK(t.this.f12753l, requestParamMap, null);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            z6 = false;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z3 = false;
                        z6 = false;
                    }
                    b9 = com.anythink.core.d.d.a(this.f12810b).b(t.this.f12754m);
                    requestParamMap.put(j.w.f12617d, Boolean.valueOf(b9.B() != 3));
                    boolean b102 = com.anythink.core.common.v.p.b();
                    if (b9.C() == 2 && b102) {
                        z9 = true;
                    }
                    requestParamMap.put(j.w.f12618e, Boolean.valueOf(z9));
                    if (t.b().F()) {
                        Log.i("anythink", "pre init network: [" + networkName + "], params: " + new JSONObject(requestParamMap).toString() + ", gdpr: " + z3 + ", in eu: " + z6);
                    }
                    initMediation.initSDK(t.this.f12753l, requestParamMap, null);
                }
            } catch (Throwable th4) {
                th4.printStackTrace();
            }
        }
    }

    private t() {
    }

    public static com.anythink.core.common.k.e G() {
        return new com.anythink.core.common.q.e();
    }

    private void ac() {
        if (this.am == -1) {
            long b9 = af.b(this.f12753l, u.b.f12847a, u.a.f12821I, 0L);
            this.am = b9;
            if (b9 == 0) {
                long currentTimeMillis = System.currentTimeMillis();
                this.am = currentTimeMillis;
                af.a(this.f12753l, u.b.f12847a, u.a.f12821I, currentTimeMillis);
            }
        }
    }

    private void ad() {
        try {
            BroadcastReceiver broadcastReceiver = this.f12766y;
            if (broadcastReceiver != null) {
                this.f12753l.unregisterReceiver(broadcastReceiver);
                n.a(this.f12753l).a(this.f12766y);
            }
            this.f12766y = null;
        } catch (Throwable unused) {
        }
        try {
            this.f12766y = new AnonymousClass3();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction(j.f12374v);
            this.f12753l.registerReceiver(this.f12766y, intentFilter);
            n.a(this.f12753l).a(this.f12766y, intentFilter);
        } catch (Throwable unused2) {
        }
    }

    private void ae() {
        boolean z3 = false;
        if (this.f12753l != null) {
            try {
                z3 = new File(this.f12753l.getExternalFilesDir(null), this.f12725D).exists();
                if (!z3) {
                    z3 = new File(this.f12753l.getFilesDir(), this.f12725D).exists();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        this.f12726E = z3;
    }

    private boolean af() {
        return this.f12731K;
    }

    private long ag() {
        return this.af;
    }

    private static boolean ah() {
        return false;
    }

    private static boolean ai() {
        return false;
    }

    public static t b() {
        if (f12721k == null) {
            synchronized (t.class) {
                try {
                    if (f12721k == null) {
                        f12721k = new t();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12721k;
    }

    private Map<String, Object> v(String str) {
        if (this.f12760s == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f12760s.get(str);
    }

    @Deprecated
    private void w(String str) {
        this.f12742V = str;
    }

    private String x(String str) {
        synchronized (this.f12765x) {
            try {
                String optString = this.f12764w.optString(str);
                if (!TextUtils.isEmpty(optString)) {
                    return optString;
                }
                String B9 = B();
                String str2 = "";
                if (TextUtils.isEmpty(B9)) {
                    B9 = com.anythink.core.common.v.m.d(this.f12753l) + com.anythink.core.common.v.m.f();
                    StringBuilder sb = new StringBuilder();
                    sb.append(new Random().nextInt(10000000));
                    str2 = sb.toString();
                }
                long currentTimeMillis = System.currentTimeMillis();
                String a9 = com.anythink.core.common.v.o.a(B9 + str + str2 + currentTimeMillis);
                try {
                    this.f12764w.put(str, a9);
                } catch (Exception unused) {
                }
                af.b(this.f12753l, u.b.f12847a, u.a.f12840t, this.f12764w.toString());
                if (!TextUtils.isEmpty(B())) {
                    str2 = null;
                }
                com.anythink.core.common.u.e.a(str, "2", str2, String.valueOf(currentTimeMillis));
                return a9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ATDebuggerConfig A() {
        return this.f12743W;
    }

    public final String B() {
        if (TextUtils.isEmpty(this.f12767z)) {
            this.f12767z = af.c(this.f12753l, u.b.f12847a, u.a.f12842v, "");
        }
        return this.f12767z;
    }

    public final String C() {
        if (TextUtils.isEmpty(this.f12722A)) {
            this.f12722A = af.c(this.f12753l, u.b.f12852f, u.a.f12845y, "");
        }
        return this.f12722A;
    }

    public final String D() {
        if (TextUtils.isEmpty(this.f12723B)) {
            this.f12723B = af.c(this.f12753l, u.b.f12852f, u.a.f12846z, "");
        }
        return this.f12723B;
    }

    public final int E() {
        return this.an;
    }

    public final boolean F() {
        return this.f12726E || this.f12727F;
    }

    public final void H() {
        com.anythink.core.common.h.n nVar;
        try {
            if (this.ao != null) {
                if (this.f12753l == null || TextUtils.isEmpty(this.f12754m)) {
                    com.anythink.core.common.h.n nVar2 = new com.anythink.core.common.h.n();
                    nVar2.N(((Integer) this.ao.first).intValue());
                    Object obj = this.ao.second;
                    if (obj != null) {
                        nVar2.y(((List) obj).toString());
                    }
                    this.ap = new Pair<>(Boolean.FALSE, nVar2);
                    return;
                }
                com.anythink.core.d.b b9 = com.anythink.core.d.d.a(this.f12753l).b(this.f12754m);
                if (b9 == null) {
                    com.anythink.core.common.h.n nVar3 = new com.anythink.core.common.h.n();
                    nVar3.N(((Integer) this.ao.first).intValue());
                    Object obj2 = this.ao.second;
                    if (obj2 != null) {
                        nVar3.y(((List) obj2).toString());
                    }
                    this.ap = new Pair<>(Boolean.FALSE, nVar3);
                    return;
                }
                if (b9.e() == 1) {
                    Pair<Boolean, com.anythink.core.common.h.n> pair = this.ap;
                    if (pair == null || ((Boolean) pair.first).booleanValue()) {
                        nVar = new com.anythink.core.common.h.n();
                        nVar.N(((Integer) this.ao.first).intValue());
                        Object obj3 = this.ao.second;
                        if (obj3 != null) {
                            nVar.y(((List) obj3).toString());
                        }
                    } else {
                        nVar = (com.anythink.core.common.h.n) this.ap.second;
                        this.ap = null;
                    }
                    com.anythink.core.common.u.c.a(b().f12753l).a(27, nVar);
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public final Pair<Integer, List<String>> I() {
        return this.ao;
    }

    public final List<String> J() {
        return this.f12741U.get("forbid_network_firm_list");
    }

    public final boolean K() {
        return this.f12745Z;
    }

    public final boolean L() {
        return this.aa;
    }

    public final Context M() {
        WeakReference<Activity> weakReference = this.f12750g;
        return (weakReference == null || weakReference.get() == null) ? this.f12753l : this.f12750g.get();
    }

    public final Activity N() {
        WeakReference<Activity> weakReference = this.f12750g;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.f12750g.get();
    }

    public final String O() {
        return this.ac;
    }

    public final boolean P() {
        return this.f12733M;
    }

    public final ATUserDeviceInfo Q() {
        return this.ad;
    }

    public final by R() {
        if (this.ae == null) {
            this.ae = new by();
        }
        try {
            this.ae.a(com.anythink.core.common.v.m.u(b().f12753l));
            this.ae.b(com.anythink.core.common.v.m.l());
            this.ae.c(com.anythink.core.common.v.m.n());
            this.ae.d(com.anythink.core.common.v.m.c(com.anythink.core.common.v.m.m()));
        } catch (Throwable unused) {
        }
        return this.ae;
    }

    public final void S() {
        this.af = System.currentTimeMillis();
    }

    public final void T() {
        Context context = this.f12753l;
        if (context == null || this.f12734N) {
            return;
        }
        synchronized (this.f12735O) {
            try {
                if (!this.f12734N) {
                    long b9 = af.b(context, u.b.f12847a, u.a.f12844x, 0L);
                    this.f12728G = b9;
                    if (b9 == 0) {
                        long j6 = this.aj;
                        this.f12728G = j6;
                        af.a(context, u.b.f12847a, u.a.f12844x, j6);
                    }
                    this.f12729H = ((a(this.aj) - a(this.f12728G)) / 86400000) + 1;
                    com.anythink.core.common.g.c.a().a(context);
                    this.f12734N = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String U() {
        return this.ah;
    }

    public final boolean V() {
        return this.f12747d;
    }

    public final boolean W() {
        return this.ai;
    }

    public final com.anythink.core.common.m.c.i X() {
        if (this.al == null) {
            synchronized (ak) {
                try {
                    if (this.al == null) {
                        this.al = new com.anythink.core.common.m.c.g(this.f12753l);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.al;
    }

    public final long Y() {
        return this.aj;
    }

    public final int Z() {
        try {
            ATOsDmEntity osDmEntity = c().getOsDmEntity();
            if (osDmEntity != null) {
                return Integer.parseInt(osDmEntity.getTrafficType());
            }
            return 1;
        } catch (Throwable unused) {
            return 1;
        }
    }

    public final Map<String, ATAdFilter> aa() {
        return this.ar;
    }

    public final void ab() {
        this.ar.clear();
    }

    public final s c() {
        IExHandler iExHandler;
        IDlHandler iDlHandler;
        IOdHandler iOdHandler;
        if (this.f12752j) {
            return this.f12724C;
        }
        synchronized (this.ag) {
            if (this.f12752j) {
                return this.f12724C;
            }
            IOsExHandler iOsExHandler = null;
            try {
                iExHandler = (IExHandler) a((Class<?>) IExHandler.class, "");
            } catch (Throwable unused) {
                iExHandler = null;
            }
            try {
                iDlHandler = (IDlHandler) a((Class<?>) IDlHandler.class, j.g.f12465c);
            } catch (Throwable unused2) {
                iDlHandler = null;
            }
            try {
                iOdHandler = (IOdHandler) a((Class<?>) IOdHandler.class, j.g.f12466d);
            } catch (Throwable unused3) {
                iOdHandler = null;
            }
            try {
                iOsExHandler = (IOsExHandler) a((Class<?>) IOsExHandler.class, j.g.f12467e);
            } catch (Throwable unused4) {
            }
            if (iExHandler != null || iDlHandler != null || iOdHandler != null || iOsExHandler != null) {
                Objects.toString(iExHandler);
                Objects.toString(iDlHandler);
                Objects.toString(iOdHandler);
                Objects.toString(iOsExHandler);
                this.f12724C = new s(iExHandler, iDlHandler, iOdHandler, iOsExHandler);
            }
            this.f12752j = true;
            return this.f12724C;
        }
    }

    public final long h() {
        return this.f12728G;
    }

    public final long i() {
        return this.f12729H;
    }

    public final int j() {
        return this.f12751h;
    }

    public final List<String> k() {
        return this.f12740T;
    }

    public final JSONArray l() {
        return this.f12739S;
    }

    public final Map<String, Object> m() {
        return this.f12759r;
    }

    public final String n() {
        Object obj = this.f12759r.get("channel");
        return obj != null ? obj.toString() : "";
    }

    public final String o() {
        Object obj = this.f12759r.get("sub_channel");
        return obj != null ? obj.toString() : "";
    }

    public final String p() {
        if (TextUtils.isEmpty(this.f12754m)) {
            this.f12754m = af.c(this.f12753l, u.b.f12847a, u.a.f12823b, "");
        }
        return this.f12754m;
    }

    public final String q() {
        if (TextUtils.isEmpty(this.f12755n)) {
            this.f12755n = af.c(this.f12753l, u.b.f12847a, u.a.f12824c, "");
        }
        return this.f12755n;
    }

    public final String r() {
        try {
            if (TextUtils.isEmpty(this.f12763v)) {
                a(this.f12753l, p(), 0);
            }
        } catch (Exception unused) {
        }
        return this.f12763v;
    }

    public final Location s() {
        return this.f12737Q;
    }

    public final String t() {
        return this.f12738R;
    }

    public final void u() {
        try {
            com.anythink.core.common.v.m.a(this.f12753l);
            com.anythink.core.common.v.m.s(this.f12753l);
        } catch (Exception unused) {
        }
        if (F()) {
            String d2 = com.anythink.core.common.v.m.d(this.f12753l);
            Log.i("anythink", "********************************** " + com.anythink.core.common.v.p.a() + " *************************************");
            Log.i("anythink", "GAID(ADID): " + com.anythink.core.common.v.m.f() + " , AndroidID: " + d2 + ", OAID: " + com.anythink.core.common.v.m.G());
            StringBuilder sb = new StringBuilder("********************************** ");
            sb.append(com.anythink.core.common.v.p.a());
            sb.append(" *************************************");
            Log.i("anythink", sb.toString());
            if (TextUtils.isEmpty(d2)) {
                return;
            }
            Log.i("anythink", "You can use \"ATSDK.setDebuggerConfig(context, \"" + d2 + "\",new ATDebuggerConfig.Builder(the NetworkFirmId you want to test).build());\" to open the debugger mode.");
        }
    }

    public final boolean y() {
        return this.f12744X;
    }

    public final boolean z() {
        return this.f12744X && this.f12743W != null;
    }

    private boolean h(Context context) {
        String d2 = com.anythink.core.common.v.m.d(context);
        if (!TextUtils.isEmpty(d2) && d2.equals(this.f12742V)) {
            return true;
        }
        String f3 = com.anythink.core.common.v.m.f();
        if (!TextUtils.isEmpty(f3) && f3.equals(this.f12742V)) {
            return true;
        }
        s c9 = b().c();
        return c9 != null && c9.checkDebuggerDevice(context, this.f12742V);
    }

    private void i(Context context) {
        long j6 = this.f12748e;
        try {
            String c9 = af.c(b().f12753l, u.b.f12847a, b().p() + "playRecord", "");
            if (!TextUtils.isEmpty(c9)) {
                JSONObject jSONObject = new JSONObject(c9);
                long optLong = jSONObject.optLong(g.f12329a);
                long optLong2 = jSONObject.optLong(g.f12330b);
                String optString = jSONObject.optString(g.f12331c);
                int optInt = jSONObject.optInt(g.f12332d);
                if (j6 != 0) {
                    com.anythink.core.common.u.e.a(optInt == 1 ? 4 : 2, optLong, optLong2, optString);
                } else {
                    j6 = optLong;
                }
                af.b(b().f12753l, u.b.f12847a, b().p() + "playRecord", "");
            }
        } catch (Exception unused) {
            af.b(b().f12753l, u.b.f12847a, b().p() + "playRecord", "");
        }
        if (j6 == 0) {
            j6 = af.b(context, u.b.f12847a, u.a.f12841u, 0L);
        }
        if (j6 == 0) {
            j6 = System.currentTimeMillis();
        }
        b.b().a(new g(j6));
    }

    private void j(Context context) {
        a(context, false);
    }

    private static boolean y(String str) {
        String a9 = com.anythink.core.common.v.p.a();
        boolean z3 = !TextUtils.isEmpty(str) && str.startsWith(a9);
        if (z3) {
            Log.i("anythink", "Adapter Version: VERIFIED");
            return z3;
        }
        Log.e("anythink", y.p("Adapter Version: The current Adapter version(", str, ") does not apply to the SDK version(", a9, ")."));
        return z3;
    }

    private static void z(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.e("anythink", "AdSourceId is empty");
            return;
        }
        try {
            if (Long.parseLong(str) == 0) {
                Log.e("anythink", "AdSourceId can't set 0");
            }
        } catch (Exception unused) {
            Log.e("anythink", "AdSourceId '" + str + "' is not compliant");
        }
    }

    public final boolean a() {
        return this.f12732L;
    }

    public final String d() {
        return this.f12758q;
    }

    public final int e() {
        return this.Y;
    }

    public final String[] f() {
        synchronized (this.f12762u) {
            Set<String> keySet = this.f12762u.keySet();
            int size = keySet.size();
            if (size <= 0) {
                return null;
            }
            String[] strArr = new String[size];
            keySet.toArray(strArr);
            return strArr;
        }
    }

    public final Context g() {
        return this.f12753l;
    }

    public final void k(String str) {
        this.f12723B = str;
        af.b(this.f12753l, u.b.f12852f, u.a.f12846z, str);
    }

    public final void l(String str) {
        af.b(this.f12753l, u.b.f12847a, u.a.f12842v, str);
        this.f12767z = str;
    }

    public final List<String> m(String str) {
        return this.f12741U.get(str);
    }

    public final void s(String str) {
        if (F()) {
            Log.i("anythink", "setBundleName: ".concat(String.valueOf(str)));
        }
        this.ah = str;
    }

    public final void t(String str) {
        if (TextUtils.isEmpty(str) || this.ar.isEmpty()) {
            return;
        }
        this.ar.remove(str);
    }

    public final void w() {
        if (this.f12747d) {
            b(this.f12753l);
        } else {
            Log.e("anythink", "Please exec ATSDK.init before ATSDK.start");
        }
    }

    private static Object a(Class<?> cls, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                Constructor declaredConstructor = Class.forName(str).asSubclass(cls).getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                return declaredConstructor.newInstance(new Object[0]);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return null;
    }

    public final Map<String, Object> d(String str) {
        HashMap hashMap = new HashMap();
        Map<String, Object> map = this.f12760s.get(str);
        ConcurrentHashMap<String, Object> concurrentHashMap = this.f12759r;
        if (concurrentHashMap != null) {
            com.anythink.core.common.v.j.a(hashMap, concurrentHashMap);
        }
        if (map != null) {
            com.anythink.core.common.v.j.a(hashMap, map);
        }
        hashMap.remove("channel");
        hashMap.remove("sub_channel");
        Object obj = this.f12759r.get("channel");
        Object obj2 = this.f12759r.get("sub_channel");
        if (obj != null) {
            hashMap.put("channel", obj);
        }
        if (obj2 != null) {
            hashMap.put("sub_channel", obj2);
        }
        return hashMap;
    }

    public final void e(String str) {
        this.f12730I = str;
        this.f12759r.put("channel", str);
    }

    public final String g(String str) {
        String optString;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        synchronized (this.f12765x) {
            optString = this.f12764w.optString(str);
        }
        return TextUtils.isEmpty(optString) ? x(str) : optString;
    }

    public final void j(String str) {
        this.f12722A = str;
        af.b(this.f12753l, u.b.f12852f, u.a.f12845y, str);
    }

    public final List<String> n(String str) {
        return this.f12741U.get(str + "_network_firm");
    }

    public final List<String> o(String str) {
        return this.f12741U.get(str + "_network_firm_a_s");
    }

    public final boolean v() {
        Context context = this.f12753l;
        if (context != null) {
            if (this.am == -1) {
                this.am = af.b(context, u.b.f12847a, u.a.f12821I, 0L);
            }
            if (this.am != 0 && System.currentTimeMillis() - this.am > 86400000) {
                return true;
            }
        }
        return false;
    }

    private static void k(Context context) {
        com.anythink.core.common.g.c.a().a(context);
    }

    private void l(Context context) {
        long b9 = af.b(context, u.b.f12847a, u.a.f12844x, 0L);
        this.f12728G = b9;
        if (b9 == 0) {
            long j6 = this.aj;
            this.f12728G = j6;
            af.a(context, u.b.f12847a, u.a.f12844x, j6);
        }
        this.f12729H = ((a(this.aj) - a(this.f12728G)) / 86400000) + 1;
    }

    public final List<String> p(String str) {
        return this.f12741U.get(str + "_network_firm_f_s");
    }

    public final IATAdFilter q(String str) {
        ConcurrentHashMap<String, IATAdFilter> concurrentHashMap;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = this.ab) == null) {
            return null;
        }
        return concurrentHashMap.get(str);
    }

    public static boolean e(Context context, List<String> list) {
        int size;
        boolean z3 = true;
        if (list == null || (size = list.size()) == 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        boolean z6 = false;
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null) {
                for (int i = 0; i < size; i++) {
                    String str = list.get(i);
                    int length = strArr.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 < length) {
                            if (TextUtils.equals(str, strArr[i6])) {
                                break;
                            }
                            i6++;
                        } else {
                            if (sb.length() == 0) {
                                sb.append(str);
                            } else {
                                sb.append(", ");
                                sb.append(str);
                            }
                            z3 = false;
                        }
                    }
                }
                z6 = z3;
            } else {
                for (int i9 = 0; i9 < size; i9++) {
                    String str2 = list.get(i9);
                    if (i9 == 0) {
                        sb.append(str2);
                    } else {
                        sb.append(", ");
                        sb.append(str2);
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (z6) {
            Log.i("anythink", "Permission: VERIFIED");
        } else {
            Log.e("anythink", "Permission: Missing " + sb.toString() + " declare in AndroidManifest");
        }
        return z6;
    }

    public final void r(String str) {
        this.ac = str;
    }

    public final ATCustomAdapterConfig b(String str) {
        if (this.f12761t == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f12761t.get(str);
    }

    private void b(String str, String str2) {
        this.f12754m = str;
        this.f12755n = str2;
        b();
        a(new AnonymousClass1(str, str2));
    }

    public final void a(String str) {
        this.f12758q = str;
    }

    public static /* synthetic */ boolean u(String str) {
        String a9 = com.anythink.core.common.v.p.a();
        boolean z3 = !TextUtils.isEmpty(str) && str.startsWith(a9);
        if (z3) {
            Log.i("anythink", "Adapter Version: VERIFIED");
            return z3;
        }
        Log.e("anythink", y.p("Adapter Version: The current Adapter version(", str, ") does not apply to the SDK version(", a9, ")."));
        return z3;
    }

    public final synchronized void a(String str, ATCustomAdapterConfig aTCustomAdapterConfig) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (this.f12761t == null) {
                this.f12761t = new ConcurrentHashMap<>();
            }
            if (aTCustomAdapterConfig == null) {
                this.f12761t.remove(str);
            } else {
                this.f12761t.put(str, aTCustomAdapterConfig);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void f(String str) {
        this.J = str;
        this.f12759r.put("sub_channel", str);
    }

    public final void h(String str) {
        if (TextUtils.isEmpty(this.f12742V)) {
            return;
        }
        if (TextUtils.equals(str, this.f12742V)) {
            this.f12744X = true;
        }
        if (this.f12744X && F()) {
            Log.i("SDK.init", "Update Setting Debugger's device success.");
        }
    }

    private void g(Context context) {
        try {
            Object obj = null;
            try {
                obj = AdxATInitManager.class.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            } catch (Throwable unused) {
                Log.e("anythink", "Cannot instantiate " + AdxATInitManager.class.getName() + ", please check if SDK is imported");
            }
            if (obj == null || !(obj instanceof ATInitMediation)) {
                return;
            }
            ((ATInitMediation) obj).initSDK(context, new HashMap(1), new AnonymousClass2());
        } catch (Throwable unused2) {
        }
    }

    private static void f(Context context) {
        if (b().c("ua")) {
            return;
        }
        try {
            if (v.a(context).b()) {
                String i = com.anythink.core.common.v.m.i();
                String c9 = af.c(context, u.b.f12847a, u.a.f12838r, "");
                if (TextUtils.isEmpty(i) || !Build.VERSION.RELEASE.equals(c9)) {
                    com.anythink.core.common.v.m.r(context);
                }
            }
        } catch (Exception unused) {
        }
    }

    public final synchronized void b(final Context context) {
        if (context == null) {
            return;
        }
        this.f12753l = context.getApplicationContext();
        if (!TextUtils.isEmpty(this.f12754m) && !TextUtils.isEmpty(this.f12755n)) {
            if (this.f12732L) {
                return;
            }
            this.f12732L = true;
            try {
                final Context applicationContext = context.getApplicationContext();
                this.f12745Z = com.anythink.core.common.v.q.a();
                try {
                    BroadcastReceiver broadcastReceiver = this.f12766y;
                    if (broadcastReceiver != null) {
                        this.f12753l.unregisterReceiver(broadcastReceiver);
                        n.a(this.f12753l).a(this.f12766y);
                    }
                    this.f12766y = null;
                } catch (Throwable unused) {
                }
                try {
                    this.f12766y = new AnonymousClass3();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    intentFilter.addAction(j.f12374v);
                    this.f12753l.registerReceiver(this.f12766y, intentFilter);
                    n.a(this.f12753l).a(this.f12766y, intentFilter);
                } catch (Throwable unused2) {
                }
                a(new Runnable() { // from class: com.anythink.core.common.d.t.12
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            t.this.T();
                            com.anythink.core.common.u.d.a().a(applicationContext);
                            t tVar = t.this;
                            tVar.a(applicationContext, tVar.f12754m, 0);
                            t.b(t.this, context);
                            k.a(applicationContext).a();
                            com.anythink.core.common.a.o.a().b();
                            com.anythink.core.common.j.a.a().a(context);
                            com.anythink.core.common.res.d.a(t.this.g()).b();
                            com.anythink.core.common.res.d.a(t.this.g());
                            com.anythink.core.common.res.d.c();
                            com.anythink.core.common.a.f.a();
                            ac.a().a(t.this.g());
                            com.anythink.core.common.v.g.a().a(t.this.g());
                        } catch (Exception unused3) {
                        }
                    }
                });
                a(new Runnable() { // from class: com.anythink.core.common.d.t.13
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.this.u();
                        t.e(applicationContext);
                    }
                });
                a(new Runnable() { // from class: com.anythink.core.common.d.t.14
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.anythink.core.common.o.a().a(t.this.f12753l);
                    }
                });
                b.b().a(new h(c(this.f12753l)));
                a(new Runnable() { // from class: com.anythink.core.common.d.t.15
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.this.c();
                        if (t.this.f12724C != null) {
                            t.this.f12724C.initDeviceInfo(context);
                            t.this.f12724C.cleanExpiredInfo();
                        }
                        com.anythink.core.d.n.a(applicationContext).a();
                        x.a(context);
                        com.anythink.core.common.d.a().a(context);
                        String t6 = com.anythink.core.common.v.m.t(t.this.f12753l);
                        if (TextUtils.isEmpty(t6)) {
                            return;
                        }
                        t.this.h(t6);
                    }
                });
                a(new Runnable() { // from class: com.anythink.core.common.d.t.16
                    @Override // java.lang.Runnable
                    public final void run() {
                        t tVar = t.this;
                        t.a(tVar, tVar.f12753l, t.this.f12757p);
                    }
                });
                String str = this.f12754m;
                a(context.getApplicationContext(), false);
                a(new AnonymousClass4(context, str));
            } catch (Exception e9) {
                Log.e("SDK.init", "init failed: " + e9.getMessage());
            }
            a(new Runnable() { // from class: com.anythink.core.common.d.t.17
                @Override // java.lang.Runnable
                public final void run() {
                    com.anythink.core.common.t.a().b();
                }
            });
        }
    }

    public final void d(final Context context) {
        if (F()) {
            com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.d.t.5
                /* JADX WARN: Removed duplicated region for block: B:64:0x017d A[Catch: all -> 0x018b, TRY_ENTER, TryCatch #2 {all -> 0x018b, blocks: (B:31:0x0060, B:36:0x0094, B:38:0x0098, B:41:0x00a5, B:44:0x00b1, B:45:0x00d9, B:47:0x0131, B:64:0x017d, B:65:0x0188, B:69:0x0183, B:74:0x0137, B:75:0x00ce, B:82:0x0075, B:34:0x006e), top: B:30:0x0060, inners: #1 }] */
                /* JADX WARN: Removed duplicated region for block: B:69:0x0183 A[Catch: all -> 0x018b, TryCatch #2 {all -> 0x018b, blocks: (B:31:0x0060, B:36:0x0094, B:38:0x0098, B:41:0x00a5, B:44:0x00b1, B:45:0x00d9, B:47:0x0131, B:64:0x017d, B:65:0x0188, B:69:0x0183, B:74:0x0137, B:75:0x00ce, B:82:0x0075, B:34:0x006e), top: B:30:0x0060, inners: #1 }] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() {
                    Object obj;
                    boolean z3;
                    AnonymousClass5 anonymousClass5 = this;
                    try {
                        ArrayList arrayList = new ArrayList();
                        Enumeration<String> entries = new DexFile(context.getPackageCodePath()).entries();
                        while (entries.hasMoreElements()) {
                            String nextElement = entries.nextElement();
                            if (nextElement.contains("com.anythink.network") && nextElement.contains("InitManager") && !nextElement.contains("$")) {
                                arrayList.add(nextElement);
                            }
                        }
                        Log.i("anythink", "********************************** Network Integration Status *************************************");
                        if (arrayList.size() != 0) {
                            Log.i("anythink", "----------------------------------------");
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            try {
                                Class<?> cls = Class.forName((String) it.next());
                                obj = null;
                                try {
                                    obj = cls.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                                } catch (Throwable unused) {
                                    Log.e("anythink", "Cannot instantiate " + cls.getName() + ", please check if a third-party SDK is imported");
                                    Log.i("anythink", "----------------------------------------");
                                }
                            } catch (Throwable unused2) {
                            }
                            if (obj != null && (obj instanceof ATInitMediation)) {
                                ATInitMediation aTInitMediation = (ATInitMediation) obj;
                                String networkName = aTInitMediation.getNetworkName();
                                if (!TextUtils.isEmpty(networkName)) {
                                    String networkVersion = aTInitMediation.getNetworkVersion();
                                    if (TextUtils.isEmpty(networkVersion)) {
                                        Log.i("anythink", "NetworkName: ".concat(String.valueOf(networkName)));
                                    } else {
                                        Log.i("anythink", "NetworkName: " + networkName + "  (v" + networkVersion + ")");
                                    }
                                    boolean i = t.i(aTInitMediation.getNetworkSDKClass());
                                    boolean b9 = t.b(aTInitMediation.getPluginClassStatus());
                                    boolean a9 = t.a(context, (List<String>) aTInitMediation.getActivityStatus());
                                    boolean b10 = t.b(context, (List<String>) aTInitMediation.getServiceStatus());
                                    boolean c9 = t.c(context, (List<String>) aTInitMediation.getProviderStatus());
                                    boolean d2 = t.d(context, (List<String>) aTInitMediation.getMetaValutStatus());
                                    boolean e9 = t.e(context, aTInitMediation.getPermissionStatus());
                                    String a10 = t.this.a(context, aTInitMediation.getResourceStatus(), aTInitMediation.getDevBundleName());
                                    boolean isEmpty = TextUtils.isEmpty(a10);
                                    if (isEmpty) {
                                        Log.i("anythink", "Resource: VERIFIED");
                                    } else {
                                        Log.e("anythink", "Resource: The " + a10 + " resources are missing. If shrinkResources is enabled, the " + a10 + " resources must be added to the whitelist (keep.xml)");
                                    }
                                    if (aTInitMediation.needCheckAdapterVersion()) {
                                        z3 = t.u(aTInitMediation.getAdapterVersion());
                                        if (!i && b9 && a9 && b10 && c9 && d2 && e9 && isEmpty && z3) {
                                            Log.e("anythink", "Status: Fail");
                                        } else {
                                            Log.i("anythink", "Status: Success");
                                        }
                                        Log.i("anythink", "----------------------------------------");
                                    }
                                    z3 = true;
                                    if (!i && b9 && a9 && b10 && c9 && d2 && e9 && isEmpty && z3) {
                                    }
                                    Log.i("anythink", "----------------------------------------");
                                }
                            }
                            anonymousClass5 = this;
                        }
                        Log.i("anythink", "********************************** Network Integration Status *************************************");
                    } catch (Exception unused3) {
                    }
                }
            }, 2);
        }
    }

    public final boolean c(String str) {
        boolean containsKey;
        synchronized (this.f12762u) {
            containsKey = this.f12762u.containsKey(str);
        }
        return containsKey;
    }

    public static boolean d(Context context, List<String> list) {
        boolean z3 = true;
        if (list == null || list.size() == 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        boolean z6 = false;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = list.get(i);
                if (TextUtils.isEmpty(applicationInfo.metaData.getString(str))) {
                    sb.append(", \"");
                    sb.append(str);
                    sb.append("\"");
                    z3 = false;
                }
            }
            if (sb.length() > 2) {
                sb.delete(0, 2);
            }
            z6 = z3;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (z6) {
            Log.i("anythink", "meta-data: VERIFIED");
        } else {
            Log.e("anythink", "meta-data: Missing " + sb.toString() + " declare in AndroidManifest");
        }
        return z6;
    }

    public final boolean x() {
        return c(this.f12753l);
    }

    public static boolean c(Context context) {
        if (!ATSDKGlobalSetting.isDenyApi_getRunningAppProcesses() && context != null) {
            try {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                    if (runningAppProcessInfo.processName.equals(context.getPackageName())) {
                        return runningAppProcessInfo.importance == 100;
                    }
                }
                return false;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    private void f(boolean z3) {
        this.f12745Z = z3;
    }

    public final void a(int i) {
        if (i == 2) {
            this.Y = 2;
        } else {
            this.Y = 1;
        }
    }

    public final void a(String... strArr) {
        synchronized (this.f12762u) {
            try {
                if (strArr != null) {
                    for (String str : strArr) {
                        this.f12762u.put(str, Boolean.TRUE);
                    }
                } else {
                    this.f12762u.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean i(String str) {
        try {
            Class.forName(str);
            Log.i("anythink", "SDK: VERIFIED");
            return true;
        } catch (Throwable unused) {
            Log.i("anythink", "SDK: NOT VERIFIED");
            return false;
        }
    }

    public final void e(boolean z3) {
        this.ai = z3;
        try {
            synchronized (this.aq) {
                try {
                    if (!this.aq.isEmpty()) {
                        for (m mVar : this.aq) {
                            if (mVar != null) {
                                mVar.a(z3);
                            }
                        }
                    }
                } finally {
                }
            }
        } catch (Exception unused) {
        }
    }

    public static boolean c(Context context, List<String> list) {
        PackageInfo packageInfo;
        boolean z3 = true;
        if (list == null) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 8);
        } catch (Throwable th) {
            sb.append(", error: ");
            sb.append(th.getMessage());
            packageInfo = null;
            z3 = false;
        }
        if (packageInfo == null) {
            return false;
        }
        ProviderInfo[] providerInfoArr = packageInfo.providers;
        for (String str : list) {
            int length = providerInfoArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (TextUtils.equals(providerInfoArr[i].name, str)) {
                        break;
                    }
                    i++;
                } else {
                    sb.append(", ");
                    sb.append(str);
                    z3 = false;
                    break;
                }
            }
        }
        if (sb.length() > 2) {
            sb.delete(0, 2);
        }
        if (z3) {
            Log.i("anythink", "Providers : VERIFIED");
        } else {
            Log.e("anythink", "Providers : Missing " + sb.toString() + " declare in AndroidManifest");
        }
        return z3;
    }

    public final void a(Context context) {
        if (context == null) {
            Log.w("SDK.init", "ATSDK.setContext() is null!");
        } else {
            this.f12753l = context;
        }
    }

    public final void a(Map<String, Object> map) {
        String str;
        String str2 = "";
        if (map != null && map.containsKey("channel")) {
            Object obj = map.get("channel");
            if (obj == null) {
                str = "";
            } else {
                str = obj.toString();
            }
            this.f12730I = str;
            if (!com.anythink.core.common.v.p.a(str)) {
                this.f12730I = null;
                map.remove("channel");
            }
        }
        if (map != null && map.containsKey("sub_channel")) {
            Object obj2 = map.get("sub_channel");
            if (obj2 != null) {
                str2 = obj2.toString();
            }
            this.J = str2;
            if (!com.anythink.core.common.v.p.b(str2)) {
                this.J = null;
                map.remove("sub_channel");
            }
        }
        this.f12759r.clear();
        if (map != null) {
            com.anythink.core.common.v.j.a(this.f12759r, map);
        }
        if (!TextUtils.isEmpty(this.f12730I)) {
            this.f12759r.put("channel", this.f12730I);
        }
        if (TextUtils.isEmpty(this.J)) {
            return;
        }
        this.f12759r.put("sub_channel", this.J);
    }

    public static /* synthetic */ void e(Context context) {
        if (b().c("ua")) {
            return;
        }
        try {
            if (v.a(context).b()) {
                String i = com.anythink.core.common.v.m.i();
                String c9 = af.c(context, u.b.f12847a, u.a.f12838r, "");
                if (TextUtils.isEmpty(i) || !Build.VERSION.RELEASE.equals(c9)) {
                    com.anythink.core.common.v.m.r(context);
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void d(Runnable runnable) {
        this.f12756o.removeCallbacks(runnable);
    }

    public final void d(String str, List<String> list) {
        if (F()) {
            Log.i("anythink", String.format("setForbidShowNetworkFirmIdList, placementId=%s, ForbidShowList=%s", str, list));
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f12741U.remove(str + "_network_firm_a_s");
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        if (arrayList.size() == 0) {
            this.f12741U.remove(str + "_network_firm_f_s");
            return;
        }
        this.f12741U.put(str + "_network_firm_f_s", arrayList);
    }

    public static void c(Runnable runnable) {
        com.anythink.core.common.v.b.b.a().b(runnable, 2);
    }

    public final void c(int i) {
        this.an = i;
    }

    public final void c(boolean z3) {
        this.f12731K = z3;
    }

    public final void c(String str, List<String> list) {
        if (F()) {
            Log.i("anythink", String.format("setAllowedShowNetworkFimIdList, placementId=%s, allowShowList=%s", str, list));
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f12741U.remove(str + "_network_firm_f_s");
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        if (arrayList.size() == 0) {
            this.f12741U.remove(str + "_network_firm_a_s");
            return;
        }
        this.f12741U.put(str + "_network_firm_a_s", arrayList);
    }

    public final void a(String str, Map<String, Object> map) {
        if (map != null) {
            this.f12760s.put(str, map);
        }
    }

    public final void a(List<String> list) {
        try {
            this.f12740T = list;
            if (list != null && !list.isEmpty()) {
                this.f12739S = new JSONArray((Collection) list);
            } else {
                this.f12739S = null;
            }
        } catch (Exception unused) {
        }
    }

    public final void b(int i) {
        this.f12751h = i;
    }

    private void b(Context context, String str) {
        a(context.getApplicationContext(), false);
        a(new AnonymousClass4(context, str));
    }

    public final void d(boolean z3) {
        this.aa = z3;
    }

    public final long d(int i) {
        if (i != 1 && i != 4 && i != 5) {
            return 26214400L;
        }
        com.anythink.core.d.d.a(this.f12753l);
        return com.anythink.core.d.d.b() * 1024;
    }

    public static boolean b(Map<String, Boolean> map) {
        boolean z3 = true;
        if (map == null) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : map.keySet()) {
            if (!map.get(str).booleanValue()) {
                sb.append(", ");
                sb.append(str);
                z3 = false;
            }
        }
        if (sb.length() > 2) {
            sb.delete(0, 2);
        }
        if (z3) {
            Log.i("anythink", "Dependence Plugin: VERIFIED");
            return z3;
        }
        Log.e("anythink", "Dependence Plugin: Missing ".concat(String.valueOf(sb)));
        return z3;
    }

    public final synchronized void a(Location location) {
        this.f12737Q = location;
    }

    public final synchronized void a(boolean z3) {
        try {
            this.f12738R = z3 ? "1" : "2";
        } catch (Throwable th) {
            throw th;
        }
    }

    public static /* synthetic */ void c(t tVar) {
        if (tVar.am == -1) {
            long b9 = af.b(tVar.f12753l, u.b.f12847a, u.a.f12821I, 0L);
            tVar.am = b9;
            if (b9 == 0) {
                long currentTimeMillis = System.currentTimeMillis();
                tVar.am = currentTimeMillis;
                af.a(tVar.f12753l, u.b.f12847a, u.a.f12821I, currentTimeMillis);
            }
        }
    }

    public final synchronized void a(final Context context, String str, String str2, ATNetworkConfig aTNetworkConfig) {
        try {
            if (this.f12747d) {
                return;
            }
            this.f12747d = true;
            this.f12753l = context.getApplicationContext();
            if (context instanceof Activity) {
                a((Activity) context);
            }
            this.f12757p = aTNetworkConfig;
            try {
                this.aj = System.currentTimeMillis();
                this.f12748e = 0L;
                com.anythink.core.a.a.a(context.getApplicationContext()).a();
                a(this.f12753l);
                this.f12754m = str;
                this.f12755n = str2;
                b();
                a(new AnonymousClass1(str, str2));
                b.b().a((Application) this.f12753l);
            } catch (Throwable unused) {
            }
            a(new Runnable() { // from class: com.anythink.core.common.d.t.11
                @Override // java.lang.Runnable
                public final void run() {
                    t.b(t.this);
                    t tVar = t.this;
                    t.a(tVar, tVar.f12753l);
                    com.anythink.core.common.a.i.a(context).a();
                    com.anythink.core.common.s.b a9 = com.anythink.core.common.s.b.a();
                    Context context2 = context;
                    String[] strArr = {u.b.f12847a, u.b.f12848b, u.b.f12849c, u.b.f12851e, u.b.f12853g, u.b.f12854h, u.b.i, u.b.f12855j, u.b.f12856k, u.b.f12857l, u.b.f12858m, u.b.f12859n, u.b.f12860o, "anythink_app_pl_cl_retry"};
                    for (int i = 0; i < 14; i++) {
                        com.anythink.core.common.s.a b9 = a9.b(context2, strArr[i]);
                        if (b9 instanceof com.anythink.core.common.s.b.e) {
                            ((com.anythink.core.common.s.b.e) b9).c();
                        }
                    }
                    t.c(t.this);
                }
            });
            b(context);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static boolean b(Context context, List<String> list) {
        boolean z3 = true;
        if (list == null) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        PackageManager packageManager = context.getPackageManager();
        for (String str : list) {
            try {
            } catch (Throwable th) {
                sb.append(", error: ");
                sb.append(th.getMessage());
            }
            if (packageManager.queryIntentServices(new Intent(context, Class.forName(str)), 131072).size() <= 0) {
                sb.append(", ");
                sb.append(str);
                z3 = false;
            }
        }
        if (sb.length() > 2) {
            sb.delete(0, 2);
        }
        if (z3) {
            Log.i("anythink", "Services : VERIFIED");
        } else {
            Log.e("anythink", "Services : Missing " + sb.toString() + " declare in AndroidManifest");
        }
        return z3;
    }

    private boolean b(Context context, List<String> list, String str) {
        String a9 = a(context, list, str);
        boolean isEmpty = TextUtils.isEmpty(a9);
        if (isEmpty) {
            Log.i("anythink", "Resource: VERIFIED");
            return isEmpty;
        }
        Log.e("anythink", y.p("Resource: The ", a9, " resources are missing. If shrinkResources is enabled, the ", a9, " resources must be added to the whitelist (keep.xml)"));
        return isEmpty;
    }

    public static void a(Runnable runnable) {
        com.anythink.core.common.v.b.b.a().b(runnable, 7);
    }

    public final void a(Context context, String str, ATDebuggerConfig aTDebuggerConfig) {
        s c9;
        if (context == null) {
            if (F()) {
                Log.e("SDK.init", "setDebuggerConfig fail, because context is null.");
                return;
            }
            return;
        }
        if (b().f12753l == null) {
            b().a(context.getApplicationContext());
        }
        this.f12742V = str;
        this.f12743W = aTDebuggerConfig;
        String d2 = com.anythink.core.common.v.m.d(context);
        boolean z3 = true;
        if (TextUtils.isEmpty(d2) || !d2.equals(this.f12742V)) {
            String f3 = com.anythink.core.common.v.m.f();
            if ((TextUtils.isEmpty(f3) || !f3.equals(this.f12742V)) && ((c9 = b().c()) == null || !c9.checkDebuggerDevice(context, this.f12742V))) {
                z3 = false;
            }
        }
        this.f12744X = z3;
        if (TextUtils.isEmpty(this.f12742V)) {
            if (F()) {
                Log.e("SDK.init", "Setting Debugger's device fail, because deviceId is empty.");
            }
            this.f12744X = false;
        } else {
            if (this.f12744X) {
                if (F()) {
                    Log.i("SDK.init", "Setting Debugger's device success.");
                }
                if (this.f12743W == null || !F()) {
                    return;
                }
                Log.i("SDK.init", "Debugger config is in effect now.");
                return;
            }
            if (F()) {
                Log.e("SDK.init", "The incoming device id does not match the current device id, and the debugger mode cannot take effect.");
            }
        }
    }

    public final void b(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.f12756o.post(runnable);
        }
    }

    public static void b(Runnable runnable, long j6) {
        com.anythink.core.common.v.b.b.a().a(runnable, j6);
    }

    public final void b(boolean z3) {
        this.f12727F = z3;
    }

    public final void b(String str, List<String> list) {
        if (F()) {
            Log.i("anythink", String.format("setFilterNetworkFirmIdList, placementId=%s, networkFilmIdList=%s", str, list));
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (list == null) {
            this.f12741U.remove(str + "_network_firm");
            return;
        }
        this.f12741U.put(str + "_network_firm", list);
    }

    public final void b(List<String> list) {
        if (F()) {
            Log.i("anythink", String.format("setForbidNetworkFirmIdList, ForbidList=%s", list));
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (String str : list) {
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(str);
                }
            }
        }
        if (arrayList.size() == 0) {
            this.f12741U.remove("forbid_network_firm_list");
        } else {
            this.f12741U.put("forbid_network_firm_list", arrayList);
        }
    }

    public final synchronized long a(Context context, String str, int i) {
        try {
            com.anythink.core.d.b b9 = com.anythink.core.d.d.a(context).b(str);
            String c9 = af.c(context, u.b.f12847a, u.a.f12839s, "");
            String c10 = af.c(context, u.b.f12847a, u.a.f12840t, "");
            long b10 = af.b(context, u.b.f12847a, u.a.f12841u, 0L);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - b10 < 0) {
                b10 = 0;
            }
            if (currentTimeMillis - b10 <= (i == 0 ? b9.ad() : b9.N())) {
                b9.ad();
                this.f12763v = c9;
                if (!TextUtils.isEmpty(c10)) {
                    synchronized (this.f12765x) {
                        this.f12764w = new JSONObject(c10);
                    }
                }
                return 0L;
            }
            b9.ad();
            String B9 = B();
            String str2 = "";
            if (TextUtils.isEmpty(B9)) {
                B9 = com.anythink.core.common.v.m.d(context) + com.anythink.core.common.v.m.f();
                str2 = String.valueOf(new Random().nextInt(10000000));
            }
            this.f12763v = com.anythink.core.common.v.o.a(B9 + str + str2 + currentTimeMillis);
            synchronized (this.f12765x) {
                this.f12764w = new JSONObject();
            }
            af.b(context, u.b.f12847a, u.a.f12839s, this.f12763v);
            af.b(context, u.b.f12847a, u.a.f12840t, "");
            af.a(context, u.b.f12847a, u.a.f12841u, currentTimeMillis);
            com.anythink.core.common.u.e.a((String) null, "1", str2, String.valueOf(currentTimeMillis));
            if (i == 0) {
                this.f12748e = currentTimeMillis;
            }
            return currentTimeMillis;
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }

    public final void b(m mVar) {
        if (mVar != null) {
            try {
                synchronized (this.aq) {
                    this.aq.remove(mVar);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static /* synthetic */ void b(t tVar) {
        boolean z3 = false;
        if (tVar.f12753l != null) {
            try {
                z3 = new File(tVar.f12753l.getExternalFilesDir(null), tVar.f12725D).exists();
                if (!z3) {
                    z3 = new File(tVar.f12753l.getFilesDir(), tVar.f12725D).exists();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        tVar.f12726E = z3;
    }

    public static /* synthetic */ void b(t tVar, Context context) {
        long j6 = tVar.f12748e;
        try {
            String c9 = af.c(b().f12753l, u.b.f12847a, b().p() + "playRecord", "");
            if (!TextUtils.isEmpty(c9)) {
                JSONObject jSONObject = new JSONObject(c9);
                long optLong = jSONObject.optLong(g.f12329a);
                long optLong2 = jSONObject.optLong(g.f12330b);
                String optString = jSONObject.optString(g.f12331c);
                int optInt = jSONObject.optInt(g.f12332d);
                if (j6 != 0) {
                    com.anythink.core.common.u.e.a(optInt == 1 ? 4 : 2, optLong, optLong2, optString);
                } else {
                    j6 = optLong;
                }
                af.b(b().f12753l, u.b.f12847a, b().p() + "playRecord", "");
            }
        } catch (Exception unused) {
            af.b(b().f12753l, u.b.f12847a, b().p() + "playRecord", "");
        }
        if (j6 == 0) {
            j6 = af.b(context, u.b.f12847a, u.a.f12841u, 0L);
        }
        if (j6 == 0) {
            j6 = System.currentTimeMillis();
        }
        b.b().a(new g(j6));
    }

    public static boolean a(Context context, List<String> list) {
        boolean z3 = true;
        if (list == null) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            try {
            } catch (Throwable th) {
                sb.append(", error: ");
                sb.append(th.getMessage());
            }
            if (context.getPackageManager().queryIntentActivities(new Intent(context, Class.forName(str)), 131072).size() <= 0) {
                sb.append(", ");
                sb.append(str);
                z3 = false;
            }
        }
        if (sb.length() > 2) {
            sb.delete(0, 2);
        }
        if (z3) {
            Log.i("anythink", "Activities : VERIFIED");
        } else {
            Log.e("anythink", "Activities : Missing " + sb.toString() + " declare in AndroidManifest");
        }
        return z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c2 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(Context context, List<String> list, String str) {
        String str2;
        if (list == null || list.size() == 0) {
            return "";
        }
        boolean z3 = false;
        try {
            int size = list.size();
            str2 = "";
            int i = 0;
            boolean z6 = true;
            while (true) {
                if (i >= size) {
                    z3 = z6;
                    break;
                }
                try {
                    String str3 = list.get(i);
                    try {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = str3.split("_")[0] + "_*";
                        }
                        int identifier = !TextUtils.isEmpty(str) ? context.getResources().getIdentifier(str3, "layout", str) : -1;
                        if (identifier <= 0 && !TextUtils.isEmpty(this.ah)) {
                            identifier = context.getResources().getIdentifier(str3, "layout", this.ah);
                        }
                        if (identifier <= 0) {
                            identifier = context.getResources().getIdentifier(str3, "layout", context.getPackageName());
                        }
                        if (identifier <= 0) {
                            break;
                        }
                        XmlResourceParser xmlResourceParser = null;
                        try {
                            xmlResourceParser = context.getResources().getLayout(identifier);
                            while (true) {
                                int next = xmlResourceParser.next();
                                if (next == 1) {
                                    break;
                                }
                                if (next == 2) {
                                    if ("x".equalsIgnoreCase(xmlResourceParser.getName())) {
                                        if (xmlResourceParser.getAttributeCount() == 0) {
                                            z6 = false;
                                            break;
                                        }
                                    } else if (xmlResourceParser.getAttributeCount() >= 0) {
                                        break;
                                    }
                                }
                            }
                        } finally {
                            try {
                                if (xmlResourceParser == null) {
                                    i++;
                                }
                                xmlResourceParser.close();
                                i++;
                            } finally {
                            }
                        }
                        xmlResourceParser.close();
                        i++;
                    } catch (Throwable unused) {
                    }
                } catch (Throwable th) {
                    th = th;
                    th.printStackTrace();
                    if (!z3) {
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            str2 = "";
        }
        return !z3 ? "" : str2;
    }

    public final void a(final Context context, boolean z3) {
        Runnable runnable = new Runnable() { // from class: com.anythink.core.common.d.t.6
            @Override // java.lang.Runnable
            public final void run() {
                if (com.anythink.core.d.d.a(context).a(t.this.f12754m)) {
                    com.anythink.core.d.d.a(context).a(t.this.f12754m, t.this.f12755n);
                }
                com.anythink.core.d.d.a(context).b(t.this.f12754m);
            }
        };
        if (z3) {
            com.anythink.core.common.v.b.b.a().b(runnable, 2);
        } else {
            com.anythink.core.common.v.b.b.a().c(runnable, 13);
        }
    }

    public final void a(Runnable runnable, long j6) {
        if (j6 <= 0 && Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.f12756o.postDelayed(runnable, j6);
        }
    }

    private static long a(long j6) {
        Date date = new Date(j6);
        return new Date(date.getYear(), date.getMonth(), date.getDate()).getTime();
    }

    public final void a(String str, List<String> list) {
        if (F()) {
            Log.i("anythink", String.format("setFilterAdSourceIdList, placementId=%s, adSourceIdList=%s", str, list));
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (list == null) {
            this.f12741U.remove(str);
        } else {
            this.f12741U.put(str, list);
        }
    }

    public final void a(int i, List<String> list) {
        if (F()) {
            Log.i("anythink", String.format("setForbidShowNetworkFirmIdList, risk=%s, ForbidList=%s", Integer.valueOf(i), list));
        }
        this.ao = new Pair<>(Integer.valueOf(i), list);
        H();
    }

    public final void a(IATDeviceRiskListener iATDeviceRiskListener) {
        this.f12749f = iATDeviceRiskListener;
    }

    public final void a(com.anythink.core.d.b bVar) {
        if (bVar != null) {
            try {
                if (F()) {
                    Log.e("anythink", "notifyDeviceRisk:" + this.f12749f);
                }
                if (this.f12749f != null) {
                    JSONObject jSONObject = new JSONObject();
                    String B9 = B();
                    if (!TextUtils.isEmpty(B9)) {
                        jSONObject.put("device_upid", B9);
                    }
                    String f3 = bVar.f();
                    if (!TextUtils.isEmpty(f3)) {
                        jSONObject.put("device_risk_labels", f3);
                    }
                    this.f12749f.onDeviceRiskInfo(jSONObject);
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    public static boolean a(List<String> list, String str) {
        return list != null && list.contains(str);
    }

    public final void a(final Context context, final DeviceInfoCallback deviceInfoCallback) {
        if (!F()) {
            String concat = "Before call \"ATSDK.testModeDeviceInfo()\", you must to call \"ATSDK.setNetworkLogDebug(true);\" first. ".concat("Note: The call to the \"ATSDK.testModeDeviceInfo()\" method must be removed after the test is completed!!!");
            Log.e("anythink", concat);
            if (deviceInfoCallback != null) {
                deviceInfoCallback.deviceInfo(concat);
                return;
            }
            return;
        }
        Log.e("anythink", "Note: The call to the \"ATSDK.testModeDeviceInfo()\" method must be removed after the test is completed!!!");
        if (!this.f12747d) {
            Log.e("anythink", "You should init SDK first.");
            if (deviceInfoCallback != null) {
                deviceInfoCallback.deviceInfo("You should init SDK first.");
                return;
            }
            return;
        }
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.d.t.7
            @Override // java.lang.Runnable
            public final void run() {
                com.anythink.core.d.b g4 = y.g(com.anythink.core.d.d.a(context));
                String R8 = g4 != null ? g4.R() : "";
                boolean z3 = true;
                if (!TextUtils.isEmpty(R8)) {
                    try {
                        JSONObject jSONObject = new JSONObject(R8);
                        if (!jSONObject.isNull("a")) {
                            if (jSONObject.optInt("a") != 1) {
                                z3 = false;
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    s c9 = t.b().c();
                    if (c9 != null) {
                        c9.fillTestDeviceData(jSONObject2, g4);
                    }
                    jSONObject2.put("GAID", com.anythink.core.common.v.m.t(context));
                    jSONObject2.put("AndroidID", z3 ? com.anythink.core.common.v.m.d(context) : "");
                    jSONObject2.put("How to config TestMode", "Please visit the document center and learn more through: Integration(Basic) -> How To Test");
                    ab.a("testModeDeviceInfo", jSONObject2.toString());
                    DeviceInfoCallback deviceInfoCallback2 = deviceInfoCallback;
                    if (deviceInfoCallback2 != null) {
                        deviceInfoCallback2.deviceInfo(jSONObject2.toString());
                    }
                } catch (Throwable unused2) {
                }
            }
        }, 2);
    }

    public final void a(final String str, final String str2, final String str3, final Map<String, Object> map) {
        if (!this.f12747d) {
            Log.e("SDK.init", "SDK should be inited first!");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            Log.e("SDK.init", "Please put placementId!");
            return;
        }
        final com.anythink.core.common.f a9 = com.anythink.core.common.u.a().a(str, str3);
        if (a9 == null) {
            Log.e("SDK.init", "The \"" + str + "\" object has not been created yet!");
            return;
        }
        final boolean g4 = a9.g();
        ae aeVar = new ae();
        aeVar.a(map);
        aeVar.a(a9.i());
        final com.anythink.core.common.h.c b9 = a9.b(this.f12753l, false, false, aeVar);
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.d.t.8
            @Override // java.lang.Runnable
            public final void run() {
                com.anythink.core.d.l a10 = com.anythink.core.d.n.a(t.this.f12753l).a(str);
                String h9 = a9.h();
                String d2 = com.anythink.core.common.v.p.d(str2);
                com.anythink.core.common.h.c cVar = b9;
                if (cVar != null) {
                    com.anythink.core.common.h.n af = cVar.i().af();
                    af.k(1);
                    af.f14011F = d2;
                    if (w.a().a(a10)) {
                        aj.a(str, a10, af);
                    }
                    com.anythink.core.common.u.c.a(t.this.f12753l).a(16, af);
                    return;
                }
                if (TextUtils.isEmpty(h9)) {
                    h9 = "";
                }
                com.anythink.core.common.h.n a11 = aj.a(h9, str, a10, 0, 0, map, null, 0, a9.i());
                a11.k(g4 ? 3 : 2);
                if (a10 == null) {
                    a11.K(str3);
                }
                a11.f14011F = d2;
                if (w.a().a(a10)) {
                    aj.a(str, a10, a11);
                }
                com.anythink.core.common.u.c.a(t.this.f12753l).a(16, a11);
            }
        }, 2);
    }

    public final void a(Activity activity) {
        WeakReference<Activity> weakReference = this.f12750g;
        if (weakReference == null || weakReference.get() == null) {
            this.f12750g = new WeakReference<>(activity);
        }
    }

    private void a(Context context, ATNetworkConfig aTNetworkConfig) {
        if (aTNetworkConfig == null) {
            aTNetworkConfig = new ATNetworkConfig();
        }
        List<ATInitConfig> aTInitConfigList = aTNetworkConfig.getATInitConfigList();
        if (aTInitConfigList == null) {
            aTInitConfigList = new ArrayList<>(2);
        }
        try {
            if (z()) {
                aTInitConfigList.clear();
            }
        } catch (Throwable th) {
            th.printStackTrace();
            aTInitConfigList = new ArrayList<>(2);
        }
        ATInitConfig aTInitConfig = null;
        boolean z3 = false;
        if (Build.VERSION.SDK_INT != 29 && !a(b().J(), "1")) {
            try {
                Constructor declaredConstructor = FacebookATInitConfig.class.asSubclass(ATInitConfig.class).getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                ATInitConfig aTInitConfig2 = (ATInitConfig) declaredConstructor.newInstance(new Object[0]);
                try {
                    aTInitConfigList.add(0, aTInitConfig2);
                } catch (Throwable unused) {
                }
                aTInitConfig = aTInitConfig2;
            } catch (Throwable unused2) {
            }
        }
        this.f12733M = aTInitConfigList.size() > 0;
        for (ATInitConfig aTInitConfig3 : aTInitConfigList) {
            if (aTInitConfig3 != null) {
                if (aTInitConfig != null && TextUtils.equals(aTInitConfig.getClass().getSimpleName(), aTInitConfig3.getClass().getSimpleName())) {
                    if (!z3) {
                        z3 = true;
                    }
                }
                a(new AnonymousClass9(aTInitConfig3, context));
            }
        }
    }

    public final void a(String str, Map<String, Object> map, String... strArr) {
        com.anythink.core.common.h.n nVar;
        if (map == null || map.containsKey(ATInitMediation.KEY_LOCAL)) {
            return;
        }
        try {
            nVar = (com.anythink.core.common.h.n) map.get(j.w.i);
        } catch (Throwable unused) {
            nVar = null;
        }
        map.remove(j.w.i);
        String jSONObject = new JSONObject(map).toString();
        Log.e("anythink", "Mismatched initialization parameters! server params: [" + str + "], " + jSONObject);
        af.b(this.f12753l, u.b.f12853g, str, jSONObject);
        if (nVar == null || strArr == null) {
            return;
        }
        try {
            com.anythink.core.common.u.e.a(nVar, strArr[0], strArr.length > 1 ? strArr[1] : null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void a(String[] strArr, IATAdFilter iATAdFilter) {
        ConcurrentHashMap<String, IATAdFilter> concurrentHashMap = this.ab;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        if (this.ab == null) {
            this.ab = new ConcurrentHashMap<>();
        }
        for (String str : strArr) {
            this.ab.put(str, iATAdFilter);
        }
    }

    public final void a(ATUserDeviceInfo aTUserDeviceInfo) {
        this.ad = aTUserDeviceInfo;
    }

    public static void a(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            com.anythink.core.d.n.a(context.getApplicationContext()).i(str);
            com.anythink.core.d.d.a(context.getApplicationContext()).c(str);
        } else {
            Log.e("SDK.init", "setPrePlacementStrategy failed: path is null or empty.");
        }
    }

    public static void a(ATSharedPlacementConfig aTSharedPlacementConfig) {
        w.a().a(aTSharedPlacementConfig);
    }

    public final void a(m mVar) {
        if (mVar != null) {
            try {
                synchronized (this.aq) {
                    try {
                        if (!this.aq.contains(mVar)) {
                            this.aq.add(mVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void a(String str, ATAdFilter aTAdFilter) {
        if (TextUtils.isEmpty(str) || aTAdFilter == null) {
            return;
        }
        this.ar.put(str, aTAdFilter);
    }

    public static void a(String str, String str2) {
        com.anythink.core.common.u.e.a("1", str, str2);
    }

    public final void a(Boolean bool) {
        if (bool != null) {
            synchronized (this.f12762u) {
                try {
                    if (!bool.booleanValue()) {
                        this.f12762u.put("sensor_deny", Boolean.TRUE);
                    } else {
                        this.f12762u.remove("sensor_deny");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static /* synthetic */ void a(t tVar, Context context) {
        try {
            Object obj = null;
            try {
                obj = AdxATInitManager.class.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            } catch (Throwable unused) {
                Log.e("anythink", "Cannot instantiate " + AdxATInitManager.class.getName() + ", please check if SDK is imported");
            }
            if (obj == null || !(obj instanceof ATInitMediation)) {
                return;
            }
            ((ATInitMediation) obj).initSDK(context, new HashMap(1), tVar.new AnonymousClass2());
        } catch (Throwable unused2) {
        }
    }

    public static /* synthetic */ void a(t tVar, Context context, ATNetworkConfig aTNetworkConfig) {
        if (aTNetworkConfig == null) {
            aTNetworkConfig = new ATNetworkConfig();
        }
        List<ATInitConfig> aTInitConfigList = aTNetworkConfig.getATInitConfigList();
        if (aTInitConfigList == null) {
            aTInitConfigList = new ArrayList<>(2);
        }
        try {
            if (tVar.z()) {
                aTInitConfigList.clear();
            }
        } catch (Throwable th) {
            th.printStackTrace();
            aTInitConfigList = new ArrayList<>(2);
        }
        ATInitConfig aTInitConfig = null;
        boolean z3 = false;
        if (Build.VERSION.SDK_INT != 29 && !a(b().J(), "1")) {
            try {
                Constructor declaredConstructor = FacebookATInitConfig.class.asSubclass(ATInitConfig.class).getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                ATInitConfig aTInitConfig2 = (ATInitConfig) declaredConstructor.newInstance(new Object[0]);
                try {
                    aTInitConfigList.add(0, aTInitConfig2);
                } catch (Throwable unused) {
                }
                aTInitConfig = aTInitConfig2;
            } catch (Throwable unused2) {
            }
        }
        tVar.f12733M = aTInitConfigList.size() > 0;
        for (ATInitConfig aTInitConfig3 : aTInitConfigList) {
            if (aTInitConfig3 != null) {
                if (aTInitConfig != null && TextUtils.equals(aTInitConfig.getClass().getSimpleName(), aTInitConfig3.getClass().getSimpleName())) {
                    if (!z3) {
                        z3 = true;
                    }
                }
                a(tVar.new AnonymousClass9(aTInitConfig3, context));
            }
        }
    }
}
