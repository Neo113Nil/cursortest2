package com.anythink.core.common.c;

import D.y;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.anythink.core.api.ATSDKGlobalSetting;
import com.anythink.core.common.c.h;
import com.anythink.core.common.d.t;
import com.anythink.core.common.d.u;
import com.anythink.core.common.e.l;
import com.anythink.core.common.h.at;
import com.anythink.core.common.v.af;
import com.anythink.core.common.v.k;
import com.anythink.core.common.v.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    private static b f12256c = null;

    /* renamed from: k, reason: collision with root package name */
    private static final long f12257k = 86400000;

    /* renamed from: a, reason: collision with root package name */
    Runnable f12258a;

    /* renamed from: d, reason: collision with root package name */
    private long f12260d;

    /* renamed from: j, reason: collision with root package name */
    private boolean f12265j;

    /* renamed from: l, reason: collision with root package name */
    private long f12266l;

    /* renamed from: b, reason: collision with root package name */
    private final String f12259b = getClass().getSimpleName();
    private final Set<String> i = Collections.synchronizedSet(new HashSet());

    /* renamed from: h, reason: collision with root package name */
    private final Object f12264h = new Object();

    /* renamed from: e, reason: collision with root package name */
    private ConcurrentLinkedQueue<f> f12261e = new ConcurrentLinkedQueue<>();

    /* renamed from: f, reason: collision with root package name */
    private ConcurrentHashMap<String, c> f12262f = new ConcurrentHashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private ConcurrentHashMap<String, c> f12263g = new ConcurrentHashMap<>();

    public b() {
        com.anythink.core.d.b g4;
        this.f12260d = 0L;
        this.f12260d = Math.max(0L, ATSDKGlobalSetting.mInspectInterval);
        this.f12265j = false;
        if (!TextUtils.isEmpty(t.b().p()) && (g4 = y.g(y.h())) != null && !g4.S()) {
            this.f12260d = g4.aE();
            this.f12265j = a(g4.aJ());
        }
        a(new Runnable() { // from class: com.anythink.core.common.c.b.1
            @Override // java.lang.Runnable
            public final void run() {
                String unused = b.this.f12259b;
                synchronized (b.this.f12264h) {
                    try {
                        if (b.this.f12265j) {
                            b.d(b.this);
                        } else {
                            l a9 = l.a(com.anythink.core.common.e.e.a(t.b().g()));
                            String unused2 = b.this.f12259b;
                            a9.a();
                            List<at> b9 = a9.b();
                            if (b9 != null) {
                                for (at atVar : b9) {
                                    if (!b.this.f12263g.containsKey(atVar.a())) {
                                        ConcurrentHashMap concurrentHashMap = b.this.f12263g;
                                        String a10 = atVar.a();
                                        String a11 = atVar.a();
                                        long c9 = atVar.c();
                                        boolean z3 = true;
                                        if (atVar.b() != 1) {
                                            z3 = false;
                                        }
                                        concurrentHashMap.put(a10, new c("", a11, false, c9, z3));
                                        String unused3 = b.this.f12259b;
                                        Thread.currentThread().getName();
                                        ((c) b.this.f12263g.get(atVar.a())).toString();
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    public static /* synthetic */ void i(b bVar) {
        synchronized (bVar.f12264h) {
            try {
                if (bVar.f12258a != null) {
                    bVar.f12258a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final List<c> d() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f12262f.keySet().iterator();
        while (it.hasNext()) {
            c cVar = this.f12262f.get(it.next());
            if (cVar != null && cVar.b()) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    public static b a() {
        if (f12256c == null) {
            synchronized (b.class) {
                try {
                    if (f12256c == null) {
                        f12256c = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12256c;
    }

    private void b(List<f> list) {
        synchronized (this.f12264h) {
            if (list != null) {
                try {
                    if (list.size() > 0) {
                        this.f12261e.addAll(list);
                        e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        synchronized (this.f12264h) {
            try {
                if (this.f12260d >= 0 && this.f12261e.size() > 0 && this.f12258a == null) {
                    f poll = this.f12261e.poll();
                    if (poll != null) {
                        Runnable a9 = a(poll);
                        this.f12258a = a9;
                        a(a9);
                    } else {
                        e();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void f() {
        synchronized (this.f12264h) {
            try {
                if (this.f12258a != null) {
                    this.f12258a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean g() {
        if (this.f12265j) {
            return this.i.isEmpty() || System.currentTimeMillis() - this.f12266l > 86400000;
        }
        return false;
    }

    private void h() {
        if (this.f12265j) {
            if (this.i.isEmpty() || System.currentTimeMillis() - this.f12266l > 86400000) {
                this.i.clear();
                try {
                    Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
                    intent.addCategory("android.intent.category.LAUNCHER");
                    List<ResolveInfo> a9 = com.anythink.core.common.v.y.a(t.b().g(), intent);
                    if (a9 != null) {
                        Iterator<ResolveInfo> it = a9.iterator();
                        while (it.hasNext()) {
                            ActivityInfo activityInfo = it.next().activityInfo;
                            if (activityInfo != null) {
                                this.i.add(activityInfo.packageName);
                            }
                        }
                    }
                    this.f12266l = System.currentTimeMillis();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final JSONArray[] c() {
        JSONArray[] jSONArrayArr = new JSONArray[2];
        try {
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            Iterator<String> it = this.f12263g.keySet().iterator();
            while (it.hasNext()) {
                c cVar = this.f12263g.get(it.next());
                if (cVar != null && cVar.b()) {
                    jSONArray.put(Long.parseLong(cVar.e()));
                    jSONArray2.put(Math.floor(((System.currentTimeMillis() - cVar.a()) / 1000.0d) / 3600.0d));
                }
            }
            jSONArrayArr[0] = jSONArray;
            jSONArrayArr[1] = jSONArray2;
        } catch (Throwable unused) {
        }
        return jSONArrayArr;
    }

    public static /* synthetic */ void d(b bVar) {
        if (bVar.f12265j) {
            if (bVar.i.isEmpty() || System.currentTimeMillis() - bVar.f12266l > 86400000) {
                bVar.i.clear();
                try {
                    Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
                    intent.addCategory("android.intent.category.LAUNCHER");
                    List<ResolveInfo> a9 = com.anythink.core.common.v.y.a(t.b().g(), intent);
                    if (a9 != null) {
                        Iterator<ResolveInfo> it = a9.iterator();
                        while (it.hasNext()) {
                            ActivityInfo activityInfo = it.next().activityInfo;
                            if (activityInfo != null) {
                                bVar.i.add(activityInfo.packageName);
                            }
                        }
                    }
                    bVar.f12266l = System.currentTimeMillis();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static int b() {
        return af.b(t.b().g(), u.b.f12847a, u.a.f12814B, 0);
    }

    public final void a(final List<a> list) {
        if (t.b().c(com.anythink.core.common.m.e.bu)) {
            return;
        }
        list.size();
        Math.max(0L, ATSDKGlobalSetting.mDelayInspectTime);
        if (list.size() > 0) {
            com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.core.common.c.b.2
                @Override // java.lang.Runnable
                public final void run() {
                    Context g4;
                    String unused = b.this.f12259b;
                    Thread.currentThread().getName();
                    list.size();
                    ATSDKGlobalSetting.SHAKE_TYPE shake_type = ATSDKGlobalSetting.shakeControlType;
                    List list2 = list;
                    if (list2 == null || list2.size() <= 0 || (g4 = t.b().g()) == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < list.size(); i++) {
                        a aVar = (a) list.get(i);
                        if (aVar != null) {
                            arrayList.add(new g(g4, aVar.a(), aVar.b(), af.b(g4, u.b.f12847a, "det_time_" + aVar.b(), 0L)));
                        }
                    }
                    if (arrayList.size() > 0) {
                        b.a(b.this, arrayList);
                    }
                }
            }, Math.max(0L, ATSDKGlobalSetting.mDelayInspectTime), 17);
        }
    }

    public final void a(final String str, final int i, final long j6, final int i6) {
        this.f12260d = j6;
        this.f12265j = a(i6);
        if (t.b().c(com.anythink.core.common.m.e.bu) || TextUtils.isEmpty(str)) {
            return;
        }
        a(new Runnable() { // from class: com.anythink.core.common.c.b.3
            /* JADX WARN: Removed duplicated region for block: B:15:0x00ae A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:4:0x0007, B:7:0x0044, B:9:0x005f, B:12:0x0066, B:13:0x009c, B:15:0x00ae, B:17:0x00b6, B:19:0x00c7, B:21:0x00cd, B:29:0x016e, B:30:0x0117, B:31:0x011c, B:33:0x0122, B:48:0x0163, B:50:0x0169, B:51:0x0181, B:55:0x0087, B:57:0x001a, B:6:0x0013), top: B:3:0x0007, inners: #2 }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                String str2;
                Context g4;
                synchronized (b.this.f12264h) {
                    try {
                        String unused = b.this.f12259b;
                        Thread.currentThread().getName();
                        try {
                            str2 = k.c(str);
                        } catch (Throwable unused2) {
                            com.anythink.core.common.u.e.b("handleUpdateInspectInfo error", "cur offset: " + b.b() + ", error string: " + str, t.b().r());
                            str2 = null;
                        }
                        String unused3 = b.this.f12259b;
                        String unused4 = b.this.f12259b;
                        Map<String, Object> c9 = q.c(str2);
                        String unused5 = b.this.f12259b;
                        c9.size();
                        if (i != 1 && c9.size() != 0) {
                            af.a(t.b().g(), u.b.f12847a, u.a.f12814B, b.b() + c9.size());
                            String unused6 = b.this.f12259b;
                            Iterator<Map.Entry<String, Object>> it = c9.entrySet().iterator();
                            g4 = t.b().g();
                            if (g4 != null) {
                                if (b.this.f12265j) {
                                    b.d(b.this);
                                    if (!b.this.i.isEmpty()) {
                                        while (it.hasNext()) {
                                            Map.Entry<String, Object> next = it.next();
                                            try {
                                                String key = next.getKey();
                                                String obj = next.getValue().toString();
                                                boolean contains = b.this.i.contains(obj);
                                                String unused7 = b.this.f12259b;
                                                Thread.currentThread().getName();
                                                b.this.f12263g.put(key, new c(obj, key, true, System.currentTimeMillis(), contains));
                                                l.a(com.anythink.core.common.e.e.a(g4)).a(key, contains);
                                            } catch (Throwable unused8) {
                                            }
                                        }
                                    }
                                } else {
                                    ArrayList arrayList = new ArrayList();
                                    while (it.hasNext()) {
                                        Map.Entry<String, Object> next2 = it.next();
                                        try {
                                            String key2 = next2.getKey();
                                            String obj2 = next2.getValue().toString();
                                            c cVar = (c) b.this.f12263g.get(key2);
                                            if (cVar != null) {
                                                arrayList.add(new d(g4, obj2, key2, cVar.a(), cVar.b()));
                                            } else {
                                                arrayList.add(new d(g4, obj2, key2, 0L));
                                            }
                                        } catch (Throwable unused9) {
                                        }
                                    }
                                    if (arrayList.size() > 0) {
                                        b.a(b.this, arrayList);
                                    }
                                }
                                com.anythink.core.common.u.e.a(i6, b.this.i.size(), i, j6);
                            }
                        }
                        String unused10 = b.this.f12259b;
                        af.a(t.b().g(), u.b.f12847a, u.a.f12814B, 0);
                        Iterator<Map.Entry<String, Object>> it2 = c9.entrySet().iterator();
                        g4 = t.b().g();
                        if (g4 != null) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    private void a(final Context context, final String str, final h.a aVar) {
        a(new Runnable() { // from class: com.anythink.core.common.c.b.4
            @Override // java.lang.Runnable
            public final void run() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new h(context, str, aVar));
                b.a(b.this, arrayList);
            }
        });
    }

    private Runnable a(final f fVar) {
        return new Runnable() { // from class: com.anythink.core.common.c.b.5
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (b.this.f12264h) {
                    try {
                        try {
                            f fVar2 = fVar;
                            if (fVar2 != null) {
                                c a9 = fVar2.a();
                                if (a9 != null) {
                                    int b9 = fVar.b();
                                    if (b9 == 1) {
                                        b.this.f12262f.put(a9.e(), a9);
                                    } else if (b9 == 2) {
                                        b.this.f12263g.put(a9.e(), a9);
                                    }
                                }
                                if ((a9 == null || a9.d()) && b.this.f12260d > 0) {
                                    try {
                                        Thread.sleep(b.this.f12260d);
                                    } catch (Throwable unused) {
                                    }
                                }
                                String unused2 = b.this.f12259b;
                                Thread.currentThread().getName();
                                long unused3 = b.this.f12260d;
                                if (a9 != null) {
                                    a9.toString();
                                }
                            }
                            b.i(b.this);
                            b.this.e();
                        } catch (Throwable th) {
                            StackTraceElement[] stackTrace = th.getStackTrace();
                            StringBuilder sb = new StringBuilder("queue size=");
                            sb.append(b.this.f12261e != null ? b.this.f12261e.size() : -1);
                            sb.append(" , ");
                            sb.append(q.a(stackTrace));
                            com.anythink.core.common.u.e.b("inspect error", sb.toString(), t.b().r());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        };
    }

    private static void a(Runnable runnable) {
        com.anythink.core.common.v.b.b.a().b(runnable, 17);
    }

    private static void a(Runnable runnable, long j6) {
        com.anythink.core.common.v.b.b.a().a(runnable, j6, 17);
    }

    private static boolean a(int i) {
        return (i == 1 || t.b().c(com.anythink.core.common.m.e.bv)) ? false : true;
    }

    public static /* synthetic */ void a(b bVar, List list) {
        synchronized (bVar.f12264h) {
            try {
                if (list.size() > 0) {
                    bVar.f12261e.addAll(list);
                    bVar.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
