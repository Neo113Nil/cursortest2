package com.anythink.core.common;

import D.y;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.ATSharedPlacementConfig;
import com.anythink.core.api.AdError;
import com.anythink.core.basead.adx.api.ATAdxSetting;
import com.anythink.core.common.h.ae;
import com.anythink.core.common.h.ar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public static final String f16912a = "w";

    /* renamed from: x, reason: collision with root package name */
    private static volatile w f16913x;

    /* renamed from: e, reason: collision with root package name */
    private volatile Handler f16917e;

    /* renamed from: f, reason: collision with root package name */
    private com.anythink.core.common.r.g f16918f;

    /* renamed from: g, reason: collision with root package name */
    private List<com.anythink.core.common.r.h> f16919g;

    /* renamed from: l, reason: collision with root package name */
    private Map<String, com.anythink.core.common.r.c> f16923l;

    /* renamed from: m, reason: collision with root package name */
    private Map<String, a> f16924m;

    /* renamed from: n, reason: collision with root package name */
    private int f16925n;

    /* renamed from: o, reason: collision with root package name */
    private ATSharedPlacementConfig f16926o;

    /* renamed from: p, reason: collision with root package name */
    private List<com.anythink.core.common.r.h> f16927p;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f16915c = new AtomicBoolean(false);

    /* renamed from: q, reason: collision with root package name */
    private final int f16928q = 0;

    /* renamed from: r, reason: collision with root package name */
    private final int f16929r = 1;

    /* renamed from: s, reason: collision with root package name */
    private final int f16930s = 2;

    /* renamed from: t, reason: collision with root package name */
    private final int f16931t = 3;

    /* renamed from: u, reason: collision with root package name */
    private int f16932u = 0;

    /* renamed from: v, reason: collision with root package name */
    private long f16933v = -1;

    /* renamed from: w, reason: collision with root package name */
    private final int f16934w = 30000;

    /* renamed from: b, reason: collision with root package name */
    private final Context f16914b = com.anythink.core.common.d.t.b().g();

    /* renamed from: h, reason: collision with root package name */
    private final Map<String, com.anythink.core.common.r.h> f16920h = new ConcurrentHashMap(4);
    private final Map<String, Boolean> i = new ConcurrentHashMap(4);

    /* renamed from: k, reason: collision with root package name */
    private final Set<String> f16922k = Collections.synchronizedSet(new HashSet());

    /* renamed from: j, reason: collision with root package name */
    private final Set<String> f16921j = Collections.synchronizedSet(new HashSet());

    /* renamed from: d, reason: collision with root package name */
    private final com.anythink.core.common.r.e f16916d = new com.anythink.core.common.r.e();

    /* renamed from: com.anythink.core.common.w$6, reason: invalid class name */
    public class AnonymousClass6 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.core.common.r.h f16947a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f16948b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ATAdRequest f16949c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.anythink.core.common.r.c f16950d;

        public AnonymousClass6(com.anythink.core.common.r.h hVar, int i, ATAdRequest aTAdRequest, com.anythink.core.common.r.c cVar) {
            this.f16947a = hVar;
            this.f16948b = i;
            this.f16949c = aTAdRequest;
            this.f16950d = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            final com.anythink.core.common.r.b bVar = new com.anythink.core.common.r.b(this.f16947a, this.f16948b, this.f16949c);
            if (this.f16948b == 10) {
                bVar.b();
                bVar.a(w.this.f16918f.c());
            }
            bVar.a(new com.anythink.core.common.r.d() { // from class: com.anythink.core.common.w.6.1
                @Override // com.anythink.core.common.r.d
                public final void a(final String str, final com.anythink.core.common.r.h hVar) {
                    w.this.i.remove(hVar.f16082b);
                    synchronized (w.this) {
                        w.this.a(new Runnable() { // from class: com.anythink.core.common.w.6.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                w.this.a(str, hVar, bVar);
                            }
                        }, 0L);
                    }
                }

                @Override // com.anythink.core.common.r.d
                public final void b(final String str, final com.anythink.core.common.r.h hVar) {
                    w.this.i.remove(hVar.f16082b);
                    synchronized (w.this) {
                        w.this.a(new Runnable() { // from class: com.anythink.core.common.w.6.1.3
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                w.this.b(str, hVar, bVar);
                            }
                        }, 0L);
                    }
                }

                @Override // com.anythink.core.common.r.d
                public final void a(final String str, final com.anythink.core.common.r.h hVar, final AdError adError) {
                    w.this.i.remove(hVar.f16082b);
                    synchronized (w.this) {
                        w.this.a(new Runnable() { // from class: com.anythink.core.common.w.6.1.2
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                w.this.a(str, hVar, adError, bVar);
                            }
                        }, 0L);
                    }
                }
            });
            this.f16950d.a(bVar);
            this.f16950d.c();
        }
    }

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        String f16976a;

        /* renamed from: b, reason: collision with root package name */
        ATAdRequest f16977b;

        public a(String str, ATAdRequest aTAdRequest) {
            this.f16976a = str;
            this.f16977b = aTAdRequest;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (w.this) {
                try {
                    if (w.this.a(this.f16976a)) {
                        if (this.f16977b == null) {
                            this.f16977b = new ATAdRequest.Builder().setChannelSource(com.anythink.core.common.d.t.b().E()).build();
                        }
                        w.this.a((com.anythink.core.common.r.h) w.this.f16920h.get(this.f16976a), 11, this.f16977b);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private w() {
    }

    public static /* synthetic */ int d(w wVar) {
        wVar.f16932u = 3;
        return 3;
    }

    private Handler c() {
        if (this.f16917e == null) {
            synchronized (w.class) {
                try {
                    if (this.f16917e == null) {
                        this.f16917e = com.anythink.core.common.v.b.b.a().a(15);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f16917e;
    }

    private boolean d() {
        boolean z3 = c() == null;
        if (z3) {
            y.w("shared handler error", "thread create failed");
        }
        return z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void e() {
        try {
            if (this.f16932u == 0) {
                this.f16932u = 1;
                this.f16927p = Collections.synchronizedList(new ArrayList());
                for (com.anythink.core.common.r.h hVar : this.f16919g) {
                    if (!this.f16921j.contains(hVar.f16082b)) {
                        this.f16927p.add(hVar);
                        b(hVar.f16082b, String.valueOf(hVar.f16081a));
                    }
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j6 = this.f16933v;
                a(new Runnable() { // from class: com.anythink.core.common.w.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (com.anythink.core.common.d.t.b().z()) {
                            w.this.f16915c.set(false);
                            w.d(w.this);
                        } else if (w.this.f16927p == null || w.this.f16927p.isEmpty()) {
                            w.d(w.this);
                        } else {
                            w.this.f();
                        }
                    }
                }, elapsedRealtime < j6 ? j6 - SystemClock.elapsedRealtime() : 0L);
                return;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator<com.anythink.core.common.r.h> it = this.f16919g.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f16082b);
            }
            Set<String> set = this.f16921j;
            if (set != null) {
                arrayList2.addAll(set);
            }
            if (!arrayList2.isEmpty()) {
                arrayList2.removeAll(arrayList);
            }
            Set<String> set2 = this.f16921j;
            if (set2 != null) {
                arrayList.removeAll(set2);
            }
            if (!arrayList.isEmpty()) {
                this.f16927p = Collections.synchronizedList(new ArrayList());
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    com.anythink.core.common.r.h hVar2 = this.f16920h.get((String) it2.next());
                    if (hVar2 != null) {
                        b(hVar2.f16082b, String.valueOf(hVar2.f16081a));
                        if (this.f16932u == 3) {
                            b(hVar2);
                        } else {
                            hVar2.toString();
                            this.f16927p.add(hVar2);
                        }
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    String str = (String) it3.next();
                    b(str);
                    this.f16921j.remove(str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void f() {
        try {
            this.f16932u = 2;
            List<com.anythink.core.common.r.h> list = this.f16927p;
            ArrayList arrayList = new ArrayList(3);
            int min = Math.min(this.f16918f.b(), list.size());
            for (int i = 0; i < min; i++) {
                arrayList.add(list.get(i));
                list.get(i).toString();
            }
            list.removeAll(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b((com.anythink.core.common.r.h) it.next());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private static Context g() {
        return com.anythink.core.common.d.t.b().g();
    }

    private void b(Runnable runnable) {
        Handler c9 = c();
        if (c9 != null) {
            c9.removeCallbacks(runnable);
        }
    }

    private boolean b(com.anythink.core.common.r.g gVar) {
        boolean z3 = false;
        if (com.anythink.core.common.d.t.b().z() || d()) {
            this.f16915c.set(false);
            return false;
        }
        if (gVar == null) {
            this.f16915c.set(false);
            return false;
        }
        List<com.anythink.core.common.r.h> e9 = gVar.e();
        this.f16919g = e9;
        AtomicBoolean atomicBoolean = this.f16915c;
        if (e9 != null && !e9.isEmpty()) {
            z3 = true;
        }
        atomicBoolean.set(z3);
        this.f16918f = gVar;
        this.f16920h.clear();
        this.f16920h.putAll(gVar.d());
        return this.f16915c.get();
    }

    public final synchronized void a(ATSharedPlacementConfig aTSharedPlacementConfig) {
        if (aTSharedPlacementConfig == null) {
            if (ATSDK.isNetworkLogDebug()) {
                Log.i("anythink", "setSharedPlacementConfig: null");
            }
            return;
        }
        if (ATSDK.isNetworkLogDebug()) {
            Log.i("anythink", "setSharedPlacementConfig: " + aTSharedPlacementConfig.toString());
        }
        this.f16926o = aTSharedPlacementConfig;
        List<com.anythink.core.common.r.h> list = this.f16919g;
        if (list != null) {
            for (com.anythink.core.common.r.h hVar : list) {
                c(hVar.f16082b, String.valueOf(hVar.f16081a));
            }
        }
    }

    private void c(String str, String str2) {
        Map<String, Object> nativeLocalExtra;
        if (this.f16926o == null) {
            return;
        }
        str2.getClass();
        switch (str2) {
            case "0":
                nativeLocalExtra = this.f16926o.getNativeLocalExtra();
                break;
            case "1":
                nativeLocalExtra = this.f16926o.getRewardVideoLocalExtra();
                break;
            case "2":
                nativeLocalExtra = this.f16926o.getBannerLocalExtra();
                break;
            case "3":
                nativeLocalExtra = this.f16926o.getInterstitialLocalExtra();
                break;
            case "4":
                nativeLocalExtra = this.f16926o.getSplashLocalExtra();
                break;
            default:
                nativeLocalExtra = null;
                break;
        }
        if (nativeLocalExtra != null) {
            nativeLocalExtra.toString();
        }
        u.a().a(str, nativeLocalExtra);
    }

    private f d(String str, String str2) {
        if (a(str)) {
            return a(str, str2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2) {
        u.a().a(str, false);
        c(str, str2);
    }

    private void b(com.anythink.core.common.r.h hVar) {
        a(hVar, 10, new ATAdRequest.Builder().setChannelSource(com.anythink.core.common.d.t.b().E()).build());
    }

    public static w a() {
        if (f16913x == null) {
            synchronized (w.class) {
                try {
                    if (f16913x == null) {
                        f16913x = new w();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16913x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, ATAdRequest aTAdRequest) {
        com.anythink.core.common.r.g gVar = this.f16918f;
        if (gVar != null && gVar.a(11) && a(str)) {
            com.anythink.core.common.r.h hVar = this.f16920h.get(str);
            if (hVar == null) {
                Log.e(f16912a, "startScheduleLoadTask: sharedPlaceInfo = null");
                return;
            }
            if (this.f16924m == null) {
                this.f16924m = new ConcurrentHashMap(5);
            }
            int i = hVar.f16083c;
            if (i < 30000) {
                i = 30000;
            }
            a aVar = new a(str, aTAdRequest);
            this.f16924m.put(str, aVar);
            a(aVar, i);
        }
    }

    private void b(com.anythink.core.common.r.h hVar, ATAdRequest aTAdRequest) {
        if (aTAdRequest == null) {
            aTAdRequest = new ATAdRequest.Builder().setChannelSource(com.anythink.core.common.d.t.b().E()).build();
        }
        a(hVar, 6, aTAdRequest);
    }

    public final synchronized void b(final String str, final ATAdRequest aTAdRequest) {
        a(new Runnable() { // from class: com.anythink.core.common.w.5
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (w.this) {
                    try {
                        if (TextUtils.isEmpty(str)) {
                            return;
                        }
                        if (w.this.f16922k.contains(str)) {
                            if (w.this.f16924m == null || w.this.f16924m.get(str) == null) {
                                w.this.c(str, aTAdRequest);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }, 0L);
    }

    private void a(Runnable runnable) {
        a(runnable, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Runnable runnable, long j6) {
        Handler c9 = c();
        if (c9 != null) {
            c9.postDelayed(runnable, j6);
        }
    }

    private void b(String str) {
        Map<String, a> map;
        a remove;
        if (TextUtils.isEmpty(str) || (map = this.f16924m) == null || (remove = map.remove(str)) == null) {
            return;
        }
        b(remove);
    }

    public final boolean a(com.anythink.core.d.l lVar) {
        if (lVar == null) {
            return false;
        }
        if (ATAdxSetting.getInstance().isAdxNetworkMode(lVar.i())) {
            lVar.i();
            return false;
        }
        return a(lVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(String str, com.anythink.core.common.r.h hVar, com.anythink.core.common.r.b bVar) {
        hVar.toString();
        com.anythink.core.common.r.c cVar = this.f16923l.get(str);
        if (cVar == null) {
            return;
        }
        a(cVar, bVar);
    }

    private boolean a(com.anythink.core.common.r.h hVar) {
        boolean z3;
        List<ATAdInfo> a9;
        hVar.toString();
        String str = hVar.f16082b;
        f a10 = a(str) ? a(str, String.valueOf(hVar.f16081a)) : null;
        if (a10 == null) {
            hVar.toString();
            return false;
        }
        int i = hVar.f16084d;
        double d2 = hVar.f16085e;
        if (i <= 0 || (a9 = a10.a(this.f16914b, (ae) null)) == null || a9.size() >= i) {
            z3 = false;
        } else {
            a9.size();
            hVar.toString();
            z3 = true;
        }
        if (z3) {
            return true;
        }
        if (d2 > 0.0d) {
            HashMap hashMap = new HashMap();
            ae aeVar = new ae();
            aeVar.a(hashMap);
            com.anythink.core.common.h.c a11 = a10.a(this.f16914b, false, false, aeVar);
            if (a11 != null && a11.n() < d2) {
                a11.n();
                hVar.toString();
                return true;
            }
        }
        return z3;
    }

    public final boolean b() {
        return this.f16915c.get();
    }

    public static /* synthetic */ void b(w wVar, com.anythink.core.common.r.h hVar, ATAdRequest aTAdRequest) {
        if (aTAdRequest == null) {
            aTAdRequest = new ATAdRequest.Builder().setChannelSource(com.anythink.core.common.d.t.b().E()).build();
        }
        wVar.a(hVar, 6, aTAdRequest);
    }

    public final synchronized void a(final com.anythink.core.common.r.g gVar) {
        try {
            if (b(gVar)) {
                if (gVar.a(10)) {
                    if (this.f16932u == 0 && this.f16933v == -1) {
                        this.f16933v = SystemClock.elapsedRealtime() + gVar.a();
                        gVar.a();
                    }
                    a(new Runnable() { // from class: com.anythink.core.common.w.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            w.this.e();
                        }
                    }, 0L);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void a(com.anythink.core.common.r.g gVar, com.anythink.core.d.l lVar, final ar arVar) {
        String str;
        final com.anythink.core.common.r.h hVar;
        if (lVar != null) {
            str = lVar.u();
        } else {
            str = "";
        }
        if (!b(gVar) || TextUtils.isEmpty(str) || !gVar.a(12) || (hVar = this.f16920h.get(str)) == null || this.f16921j.contains(str)) {
            return;
        }
        this.f16921j.add(str);
        hVar.f16086f = arVar;
        hVar.f16088h = lVar;
        a(new Runnable() { // from class: com.anythink.core.common.w.3
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (w.this) {
                    try {
                        w wVar = w.this;
                        com.anythink.core.common.r.h hVar2 = hVar;
                        wVar.b(hVar2.f16082b, String.valueOf(hVar2.f16081a));
                        ar arVar2 = arVar;
                        w.a(w.this, hVar, arVar2 != null ? arVar2.b() : null);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }, 0L);
    }

    private List<com.anythink.core.common.r.h> a(List<com.anythink.core.common.r.h> list) {
        ArrayList arrayList = new ArrayList(3);
        int min = Math.min(this.f16918f.b(), list.size());
        for (int i = 0; i < min; i++) {
            arrayList.add(list.get(i));
            list.get(i).toString();
        }
        list.removeAll(arrayList);
        return arrayList;
    }

    private void a(com.anythink.core.common.r.h hVar, ATAdRequest aTAdRequest) {
        if (aTAdRequest == null) {
            aTAdRequest = new ATAdRequest.Builder().setChannelSource(com.anythink.core.common.d.t.b().E()).build();
        }
        a(hVar, 12, aTAdRequest);
    }

    public final void a(final String str, final ATAdRequest aTAdRequest) {
        com.anythink.core.common.r.g gVar = this.f16918f;
        if (gVar != null && gVar.a(6)) {
            a(new Runnable() { // from class: com.anythink.core.common.w.4
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (w.this) {
                        try {
                            if (w.this.a(str)) {
                                w.b(w.this, (com.anythink.core.common.r.h) w.this.f16920h.get(str), aTAdRequest);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.anythink.core.common.r.h hVar, int i, ATAdRequest aTAdRequest) {
        if (hVar == null) {
            Log.e(f16912a, "loadSharedPlacement: sharedPlaceInfo = null");
            return;
        }
        hVar.toString();
        if (i != 16) {
            this.f16916d.a(hVar);
        }
        b(hVar.f16082b);
        Boolean bool = this.i.get(hVar.f16082b);
        Boolean bool2 = Boolean.TRUE;
        if (bool2.equals(bool)) {
            return;
        }
        this.i.put(hVar.f16082b, bool2);
        if (i == 10 || i == 12) {
            if (i == 10) {
                this.f16925n++;
                hVar.toString();
            }
            this.f16921j.add(hVar.f16082b);
        }
        com.anythink.core.common.r.c cVar = new com.anythink.core.common.r.c(hVar.f16082b);
        if (this.f16923l == null) {
            this.f16923l = new ConcurrentHashMap();
        }
        this.f16923l.put(cVar.a(), cVar);
        com.anythink.core.common.v.b.b.a().b(new AnonymousClass6(hVar, i, aTAdRequest, cVar), 2);
    }

    public final boolean a(String str) {
        try {
            if (!this.f16915c.get() || com.anythink.core.common.d.t.b().z() || TextUtils.isEmpty(str)) {
                return false;
            }
            return this.f16920h.containsKey(str);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(String str, com.anythink.core.common.r.h hVar, com.anythink.core.common.r.b bVar) {
        boolean z3;
        List<ATAdInfo> a9;
        try {
            hVar.toString();
            this.f16916d.a(hVar);
            com.anythink.core.common.r.c remove = this.f16923l.remove(str);
            if (remove != null && bVar != null) {
                hVar.toString();
                String str2 = hVar.f16082b;
                f a10 = a(str2) ? a(str2, String.valueOf(hVar.f16081a)) : null;
                boolean z6 = false;
                if (a10 == null) {
                    hVar.toString();
                } else {
                    int i = hVar.f16084d;
                    double d2 = hVar.f16085e;
                    if (i <= 0 || (a9 = a10.a(this.f16914b, (ae) null)) == null || a9.size() >= i) {
                        z3 = false;
                    } else {
                        a9.size();
                        hVar.toString();
                        z3 = true;
                    }
                    if (!z3) {
                        if (d2 > 0.0d) {
                            HashMap hashMap = new HashMap();
                            ae aeVar = new ae();
                            aeVar.a(hashMap);
                            com.anythink.core.common.h.c a11 = a10.a(this.f16914b, false, false, aeVar);
                            if (a11 != null && a11.n() < d2) {
                                a11.n();
                                hVar.toString();
                            }
                        }
                        z6 = z3;
                    }
                    z6 = true;
                }
                if (z6) {
                    c(remove.e(), bVar.a());
                }
                a(remove, bVar);
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(String str, com.anythink.core.common.r.h hVar, AdError adError, final com.anythink.core.common.r.b bVar) {
        hVar.toString();
        adError.getFullErrorInfo();
        this.f16916d.a(hVar, c(), new com.anythink.core.common.r.a() { // from class: com.anythink.core.common.w.7
            @Override // com.anythink.core.common.r.a
            public final void a(int i, com.anythink.core.common.r.h hVar2) {
                com.anythink.core.common.r.b bVar2 = bVar;
                w.this.a(hVar2, i, bVar2 != null ? bVar2.a() : null);
            }
        });
        com.anythink.core.common.r.c remove = this.f16923l.remove(str);
        if (remove != null && bVar != null) {
            c(remove.e(), bVar.a());
            a(remove, bVar);
        }
    }

    private void a(com.anythink.core.common.r.c cVar, com.anythink.core.common.r.b bVar) {
        this.f16922k.add(cVar.e());
        if (cVar.d() == 10 && cVar.b()) {
            this.f16925n--;
            if (this.f16925n >= this.f16918f.b()) {
                return;
            }
            if (!this.f16927p.isEmpty()) {
                com.anythink.core.common.r.h remove = this.f16927p.remove(0);
                remove.toString();
                ATAdRequest a9 = bVar != null ? bVar.a() : null;
                if (a9 == null) {
                    a9 = new ATAdRequest.Builder().setChannelSource(com.anythink.core.common.d.t.b().E()).build();
                }
                a(remove, 10, a9);
                return;
            }
            if (this.f16925n == 0) {
                this.f16932u = 3;
            }
        }
    }

    public static f a(String str, String str2) {
        return u.a().a(str, str2);
    }

    public final void a(com.anythink.core.d.l lVar, final int i, final ar arVar, com.anythink.core.common.h.n nVar) {
        String u3;
        final com.anythink.core.common.r.h hVar;
        String str = "";
        if (lVar == null) {
            u3 = "";
        } else {
            try {
                u3 = lVar.u();
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        }
        if (lVar != null) {
            str = lVar.i();
        }
        com.anythink.core.d.b b9 = com.anythink.core.d.d.a(com.anythink.core.common.d.t.b().g()).b(com.anythink.core.common.d.t.b().p());
        if (b9 != null && !TextUtils.isEmpty(u3) && !u3.equals(str)) {
            com.anythink.core.common.r.g h9 = b9.h();
            if (b(h9) && h9.a(i) && (hVar = this.f16920h.get(u3)) != null) {
                if (Boolean.TRUE.equals(this.i.get(u3))) {
                    return;
                }
                hVar.f16088h = lVar;
                hVar.f16087g = nVar;
                hVar.f16086f = arVar;
                this.f16916d.a(hVar);
                a(new Runnable() { // from class: com.anythink.core.common.w.8
                    @Override // java.lang.Runnable
                    public final void run() {
                        ar arVar2 = arVar;
                        w.this.a(hVar, i, arVar2 != null ? arVar2.b() : null);
                    }
                }, i == 15 ? h9.f() : 0L);
            }
        }
    }

    public static /* synthetic */ void a(w wVar, com.anythink.core.common.r.h hVar, ATAdRequest aTAdRequest) {
        if (aTAdRequest == null) {
            aTAdRequest = new ATAdRequest.Builder().setChannelSource(com.anythink.core.common.d.t.b().E()).build();
        }
        wVar.a(hVar, 12, aTAdRequest);
    }
}
