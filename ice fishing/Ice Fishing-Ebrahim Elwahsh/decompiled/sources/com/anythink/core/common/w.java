package com.anythink.core.common;

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
    public static final String f17070a = "w";

    /* renamed from: x, reason: collision with root package name */
    private static volatile w f17071x;

    /* renamed from: e, reason: collision with root package name */
    private volatile Handler f17075e;

    /* renamed from: f, reason: collision with root package name */
    private com.anythink.core.common.r.g f17076f;

    /* renamed from: g, reason: collision with root package name */
    private List<com.anythink.core.common.r.h> f17077g;

    /* renamed from: l, reason: collision with root package name */
    private Map<String, com.anythink.core.common.r.c> f17081l;

    /* renamed from: m, reason: collision with root package name */
    private Map<String, a> f17082m;

    /* renamed from: n, reason: collision with root package name */
    private int f17083n;

    /* renamed from: o, reason: collision with root package name */
    private ATSharedPlacementConfig f17084o;

    /* renamed from: p, reason: collision with root package name */
    private List<com.anythink.core.common.r.h> f17085p;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f17073c = new AtomicBoolean(false);

    /* renamed from: q, reason: collision with root package name */
    private final int f17086q = 0;

    /* renamed from: r, reason: collision with root package name */
    private final int f17087r = 1;

    /* renamed from: s, reason: collision with root package name */
    private final int f17088s = 2;

    /* renamed from: t, reason: collision with root package name */
    private final int f17089t = 3;

    /* renamed from: u, reason: collision with root package name */
    private int f17090u = 0;

    /* renamed from: v, reason: collision with root package name */
    private long f17091v = -1;

    /* renamed from: w, reason: collision with root package name */
    private final int f17092w = 30000;

    /* renamed from: b, reason: collision with root package name */
    private final Context f17072b = com.anythink.core.common.d.t.b().g();

    /* renamed from: h, reason: collision with root package name */
    private final Map<String, com.anythink.core.common.r.h> f17078h = new ConcurrentHashMap(4);
    private final Map<String, Boolean> i = new ConcurrentHashMap(4);

    /* renamed from: k, reason: collision with root package name */
    private final Set<String> f17080k = Collections.synchronizedSet(new HashSet());

    /* renamed from: j, reason: collision with root package name */
    private final Set<String> f17079j = Collections.synchronizedSet(new HashSet());

    /* renamed from: d, reason: collision with root package name */
    private final com.anythink.core.common.r.e f17074d = new com.anythink.core.common.r.e();

    /* renamed from: com.anythink.core.common.w$6, reason: invalid class name */
    public class AnonymousClass6 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.core.common.r.h f17105a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f17106b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ATAdRequest f17107c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.anythink.core.common.r.c f17108d;

        public AnonymousClass6(com.anythink.core.common.r.h hVar, int i, ATAdRequest aTAdRequest, com.anythink.core.common.r.c cVar) {
            this.f17105a = hVar;
            this.f17106b = i;
            this.f17107c = aTAdRequest;
            this.f17108d = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            final com.anythink.core.common.r.b bVar = new com.anythink.core.common.r.b(this.f17105a, this.f17106b, this.f17107c);
            if (this.f17106b == 10) {
                bVar.b();
                bVar.a(w.this.f17076f.c());
            }
            bVar.a(new com.anythink.core.common.r.d() { // from class: com.anythink.core.common.w.6.1
                @Override // com.anythink.core.common.r.d
                public final void a(final String str, final com.anythink.core.common.r.h hVar) {
                    w.this.i.remove(hVar.f16240b);
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
                    w.this.i.remove(hVar.f16240b);
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
                    w.this.i.remove(hVar.f16240b);
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
            this.f17108d.a(bVar);
            this.f17108d.c();
        }
    }

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        String f17134a;

        /* renamed from: b, reason: collision with root package name */
        ATAdRequest f17135b;

        public a(String str, ATAdRequest aTAdRequest) {
            this.f17134a = str;
            this.f17135b = aTAdRequest;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (w.this) {
                try {
                    if (w.this.a(this.f17134a)) {
                        if (this.f17135b == null) {
                            this.f17135b = new ATAdRequest.Builder().setChannelSource(com.anythink.core.common.d.t.b().E()).build();
                        }
                        w.this.a((com.anythink.core.common.r.h) w.this.f17078h.get(this.f17134a), 11, this.f17135b);
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
        wVar.f17090u = 3;
        return 3;
    }

    private Handler c() {
        if (this.f17075e == null) {
            synchronized (w.class) {
                try {
                    if (this.f17075e == null) {
                        this.f17075e = com.anythink.core.common.v.b.b.a().a(15);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f17075e;
    }

    private boolean d() {
        boolean z8 = c() == null;
        if (z8) {
            com.anythink.basead.b.c.i.v("shared handler error", "thread create failed");
        }
        return z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void e() {
        try {
            if (this.f17090u == 0) {
                this.f17090u = 1;
                this.f17085p = Collections.synchronizedList(new ArrayList());
                for (com.anythink.core.common.r.h hVar : this.f17077g) {
                    if (!this.f17079j.contains(hVar.f16240b)) {
                        this.f17085p.add(hVar);
                        b(hVar.f16240b, String.valueOf(hVar.f16239a));
                    }
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j9 = this.f17091v;
                a(new Runnable() { // from class: com.anythink.core.common.w.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (com.anythink.core.common.d.t.b().z()) {
                            w.this.f17073c.set(false);
                            w.d(w.this);
                        } else if (w.this.f17085p == null || w.this.f17085p.isEmpty()) {
                            w.d(w.this);
                        } else {
                            w.this.f();
                        }
                    }
                }, elapsedRealtime < j9 ? j9 - SystemClock.elapsedRealtime() : 0L);
                return;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator<com.anythink.core.common.r.h> it = this.f17077g.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f16240b);
            }
            Set<String> set = this.f17079j;
            if (set != null) {
                arrayList2.addAll(set);
            }
            if (!arrayList2.isEmpty()) {
                arrayList2.removeAll(arrayList);
            }
            Set<String> set2 = this.f17079j;
            if (set2 != null) {
                arrayList.removeAll(set2);
            }
            if (!arrayList.isEmpty()) {
                this.f17085p = Collections.synchronizedList(new ArrayList());
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    com.anythink.core.common.r.h hVar2 = this.f17078h.get((String) it2.next());
                    if (hVar2 != null) {
                        b(hVar2.f16240b, String.valueOf(hVar2.f16239a));
                        if (this.f17090u == 3) {
                            b(hVar2);
                        } else {
                            hVar2.toString();
                            this.f17085p.add(hVar2);
                        }
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    String str = (String) it3.next();
                    b(str);
                    this.f17079j.remove(str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void f() {
        try {
            this.f17090u = 2;
            List<com.anythink.core.common.r.h> list = this.f17085p;
            ArrayList arrayList = new ArrayList(3);
            int min = Math.min(this.f17076f.b(), list.size());
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
        Handler c4 = c();
        if (c4 != null) {
            c4.removeCallbacks(runnable);
        }
    }

    private boolean b(com.anythink.core.common.r.g gVar) {
        boolean z8 = false;
        if (com.anythink.core.common.d.t.b().z() || d()) {
            this.f17073c.set(false);
            return false;
        }
        if (gVar == null) {
            this.f17073c.set(false);
            return false;
        }
        List<com.anythink.core.common.r.h> e6 = gVar.e();
        this.f17077g = e6;
        AtomicBoolean atomicBoolean = this.f17073c;
        if (e6 != null && !e6.isEmpty()) {
            z8 = true;
        }
        atomicBoolean.set(z8);
        this.f17076f = gVar;
        this.f17078h.clear();
        this.f17078h.putAll(gVar.d());
        return this.f17073c.get();
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
        this.f17084o = aTSharedPlacementConfig;
        List<com.anythink.core.common.r.h> list = this.f17077g;
        if (list != null) {
            for (com.anythink.core.common.r.h hVar : list) {
                c(hVar.f16240b, String.valueOf(hVar.f16239a));
            }
        }
    }

    private void c(String str, String str2) {
        Map<String, Object> nativeLocalExtra;
        if (this.f17084o == null) {
            return;
        }
        str2.getClass();
        switch (str2) {
            case "0":
                nativeLocalExtra = this.f17084o.getNativeLocalExtra();
                break;
            case "1":
                nativeLocalExtra = this.f17084o.getRewardVideoLocalExtra();
                break;
            case "2":
                nativeLocalExtra = this.f17084o.getBannerLocalExtra();
                break;
            case "3":
                nativeLocalExtra = this.f17084o.getInterstitialLocalExtra();
                break;
            case "4":
                nativeLocalExtra = this.f17084o.getSplashLocalExtra();
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
        if (f17071x == null) {
            synchronized (w.class) {
                try {
                    if (f17071x == null) {
                        f17071x = new w();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17071x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, ATAdRequest aTAdRequest) {
        com.anythink.core.common.r.g gVar = this.f17076f;
        if (gVar != null && gVar.a(11) && a(str)) {
            com.anythink.core.common.r.h hVar = this.f17078h.get(str);
            if (hVar == null) {
                Log.e(f17070a, "startScheduleLoadTask: sharedPlaceInfo = null");
                return;
            }
            if (this.f17082m == null) {
                this.f17082m = new ConcurrentHashMap(5);
            }
            int i = hVar.f16241c;
            if (i < 30000) {
                i = 30000;
            }
            a aVar = new a(str, aTAdRequest);
            this.f17082m.put(str, aVar);
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
                        if (w.this.f17080k.contains(str)) {
                            if (w.this.f17082m == null || w.this.f17082m.get(str) == null) {
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
    public void a(Runnable runnable, long j9) {
        Handler c4 = c();
        if (c4 != null) {
            c4.postDelayed(runnable, j9);
        }
    }

    private void b(String str) {
        Map<String, a> map;
        a remove;
        if (TextUtils.isEmpty(str) || (map = this.f17082m) == null || (remove = map.remove(str)) == null) {
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
        com.anythink.core.common.r.c cVar = this.f17081l.get(str);
        if (cVar == null) {
            return;
        }
        a(cVar, bVar);
    }

    private boolean a(com.anythink.core.common.r.h hVar) {
        boolean z8;
        List<ATAdInfo> a9;
        hVar.toString();
        String str = hVar.f16240b;
        f a10 = a(str) ? a(str, String.valueOf(hVar.f16239a)) : null;
        if (a10 == null) {
            hVar.toString();
            return false;
        }
        int i = hVar.f16242d;
        double d2 = hVar.f16243e;
        if (i <= 0 || (a9 = a10.a(this.f17072b, (ae) null)) == null || a9.size() >= i) {
            z8 = false;
        } else {
            a9.size();
            hVar.toString();
            z8 = true;
        }
        if (z8) {
            return true;
        }
        if (d2 > 0.0d) {
            HashMap hashMap = new HashMap();
            ae aeVar = new ae();
            aeVar.a(hashMap);
            com.anythink.core.common.h.c a11 = a10.a(this.f17072b, false, false, aeVar);
            if (a11 != null && a11.n() < d2) {
                a11.n();
                hVar.toString();
                return true;
            }
        }
        return z8;
    }

    public final boolean b() {
        return this.f17073c.get();
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
                    if (this.f17090u == 0 && this.f17091v == -1) {
                        this.f17091v = SystemClock.elapsedRealtime() + gVar.a();
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
        if (!b(gVar) || TextUtils.isEmpty(str) || !gVar.a(12) || (hVar = this.f17078h.get(str)) == null || this.f17079j.contains(str)) {
            return;
        }
        this.f17079j.add(str);
        hVar.f16244f = arVar;
        hVar.f16246h = lVar;
        a(new Runnable() { // from class: com.anythink.core.common.w.3
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (w.this) {
                    try {
                        w wVar = w.this;
                        com.anythink.core.common.r.h hVar2 = hVar;
                        wVar.b(hVar2.f16240b, String.valueOf(hVar2.f16239a));
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
        int min = Math.min(this.f17076f.b(), list.size());
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
        com.anythink.core.common.r.g gVar = this.f17076f;
        if (gVar != null && gVar.a(6)) {
            a(new Runnable() { // from class: com.anythink.core.common.w.4
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (w.this) {
                        try {
                            if (w.this.a(str)) {
                                w.b(w.this, (com.anythink.core.common.r.h) w.this.f17078h.get(str), aTAdRequest);
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
            Log.e(f17070a, "loadSharedPlacement: sharedPlaceInfo = null");
            return;
        }
        hVar.toString();
        if (i != 16) {
            this.f17074d.a(hVar);
        }
        b(hVar.f16240b);
        Boolean bool = this.i.get(hVar.f16240b);
        Boolean bool2 = Boolean.TRUE;
        if (bool2.equals(bool)) {
            return;
        }
        this.i.put(hVar.f16240b, bool2);
        if (i == 10 || i == 12) {
            if (i == 10) {
                this.f17083n++;
                hVar.toString();
            }
            this.f17079j.add(hVar.f16240b);
        }
        com.anythink.core.common.r.c cVar = new com.anythink.core.common.r.c(hVar.f16240b);
        if (this.f17081l == null) {
            this.f17081l = new ConcurrentHashMap();
        }
        this.f17081l.put(cVar.a(), cVar);
        com.anythink.core.common.v.b.b.a().b(new AnonymousClass6(hVar, i, aTAdRequest, cVar), 2);
    }

    public final boolean a(String str) {
        try {
            if (!this.f17073c.get() || com.anythink.core.common.d.t.b().z() || TextUtils.isEmpty(str)) {
                return false;
            }
            return this.f17078h.containsKey(str);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(String str, com.anythink.core.common.r.h hVar, com.anythink.core.common.r.b bVar) {
        boolean z8;
        List<ATAdInfo> a9;
        try {
            hVar.toString();
            this.f17074d.a(hVar);
            com.anythink.core.common.r.c remove = this.f17081l.remove(str);
            if (remove != null && bVar != null) {
                hVar.toString();
                String str2 = hVar.f16240b;
                f a10 = a(str2) ? a(str2, String.valueOf(hVar.f16239a)) : null;
                boolean z9 = false;
                if (a10 == null) {
                    hVar.toString();
                } else {
                    int i = hVar.f16242d;
                    double d2 = hVar.f16243e;
                    if (i <= 0 || (a9 = a10.a(this.f17072b, (ae) null)) == null || a9.size() >= i) {
                        z8 = false;
                    } else {
                        a9.size();
                        hVar.toString();
                        z8 = true;
                    }
                    if (!z8) {
                        if (d2 > 0.0d) {
                            HashMap hashMap = new HashMap();
                            ae aeVar = new ae();
                            aeVar.a(hashMap);
                            com.anythink.core.common.h.c a11 = a10.a(this.f17072b, false, false, aeVar);
                            if (a11 != null && a11.n() < d2) {
                                a11.n();
                                hVar.toString();
                            }
                        }
                        z9 = z8;
                    }
                    z9 = true;
                }
                if (z9) {
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
        this.f17074d.a(hVar, c(), new com.anythink.core.common.r.a() { // from class: com.anythink.core.common.w.7
            @Override // com.anythink.core.common.r.a
            public final void a(int i, com.anythink.core.common.r.h hVar2) {
                com.anythink.core.common.r.b bVar2 = bVar;
                w.this.a(hVar2, i, bVar2 != null ? bVar2.a() : null);
            }
        });
        com.anythink.core.common.r.c remove = this.f17081l.remove(str);
        if (remove != null && bVar != null) {
            c(remove.e(), bVar.a());
            a(remove, bVar);
        }
    }

    private void a(com.anythink.core.common.r.c cVar, com.anythink.core.common.r.b bVar) {
        this.f17080k.add(cVar.e());
        if (cVar.d() == 10 && cVar.b()) {
            this.f17083n--;
            if (this.f17083n >= this.f17076f.b()) {
                return;
            }
            if (!this.f17085p.isEmpty()) {
                com.anythink.core.common.r.h remove = this.f17085p.remove(0);
                remove.toString();
                ATAdRequest a9 = bVar != null ? bVar.a() : null;
                if (a9 == null) {
                    a9 = new ATAdRequest.Builder().setChannelSource(com.anythink.core.common.d.t.b().E()).build();
                }
                a(remove, 10, a9);
                return;
            }
            if (this.f17083n == 0) {
                this.f17090u = 3;
            }
        }
    }

    public static f a(String str, String str2) {
        return u.a().a(str, str2);
    }

    public final void a(com.anythink.core.d.l lVar, final int i, final ar arVar, com.anythink.core.common.h.n nVar) {
        String u7;
        final com.anythink.core.common.r.h hVar;
        String str = "";
        if (lVar == null) {
            u7 = "";
        } else {
            try {
                u7 = lVar.u();
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        }
        if (lVar != null) {
            str = lVar.i();
        }
        com.anythink.core.d.b b9 = com.anythink.core.d.d.a(com.anythink.core.common.d.t.b().g()).b(com.anythink.core.common.d.t.b().p());
        if (b9 != null && !TextUtils.isEmpty(u7) && !u7.equals(str)) {
            com.anythink.core.common.r.g h9 = b9.h();
            if (b(h9) && h9.a(i) && (hVar = this.f17078h.get(u7)) != null) {
                if (Boolean.TRUE.equals(this.i.get(u7))) {
                    return;
                }
                hVar.f16246h = lVar;
                hVar.f16245g = nVar;
                hVar.f16244f = arVar;
                this.f17074d.a(hVar);
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
