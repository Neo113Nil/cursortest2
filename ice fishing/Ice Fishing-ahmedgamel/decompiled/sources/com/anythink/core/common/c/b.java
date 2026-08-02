package com.anythink.core.common.c;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.IceFishing.LiveIceFishing.k;
import com.anythink.core.api.ATSDKGlobalSetting;
import com.anythink.core.common.c.h;
import com.anythink.core.common.d.t;
import com.anythink.core.common.d.u;
import com.anythink.core.common.e.l;
import com.anythink.core.common.h.at;
import com.anythink.core.common.v.af;
import com.anythink.core.common.v.q;
import com.anythink.core.common.v.y;
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
    private static b f13042c = null;

    /* renamed from: k, reason: collision with root package name */
    private static final long f13043k = 86400000;

    /* renamed from: a, reason: collision with root package name */
    Runnable f13044a;

    /* renamed from: d, reason: collision with root package name */
    private long f13046d;

    /* renamed from: j, reason: collision with root package name */
    private boolean f13051j;

    /* renamed from: l, reason: collision with root package name */
    private long f13052l;

    /* renamed from: b, reason: collision with root package name */
    private final String f13045b = getClass().getSimpleName();
    private final Set<String> i = Collections.synchronizedSet(new HashSet());

    /* renamed from: h, reason: collision with root package name */
    private final Object f13050h = new Object();

    /* renamed from: e, reason: collision with root package name */
    private ConcurrentLinkedQueue<f> f13047e = new ConcurrentLinkedQueue<>();

    /* renamed from: f, reason: collision with root package name */
    private ConcurrentHashMap<String, c> f13048f = new ConcurrentHashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private ConcurrentHashMap<String, c> f13049g = new ConcurrentHashMap<>();

    public b() {
        com.anythink.core.d.b k9;
        this.f13046d = 0L;
        this.f13046d = Math.max(0L, ATSDKGlobalSetting.mInspectInterval);
        this.f13051j = false;
        if (!TextUtils.isEmpty(t.b().p()) && (k9 = k.k(k.l())) != null && !k9.S()) {
            this.f13046d = k9.aE();
            this.f13051j = a(k9.aJ());
        }
        a(new Runnable() { // from class: com.anythink.core.common.c.b.1
            @Override // java.lang.Runnable
            public final void run() {
                String unused = b.this.f13045b;
                synchronized (b.this.f13050h) {
                    try {
                        if (b.this.f13051j) {
                            b.d(b.this);
                        } else {
                            l a9 = l.a(com.anythink.core.common.e.e.a(t.b().g()));
                            String unused2 = b.this.f13045b;
                            a9.a();
                            List<at> b9 = a9.b();
                            if (b9 != null) {
                                for (at atVar : b9) {
                                    if (!b.this.f13049g.containsKey(atVar.a())) {
                                        ConcurrentHashMap concurrentHashMap = b.this.f13049g;
                                        String a10 = atVar.a();
                                        String a11 = atVar.a();
                                        long c9 = atVar.c();
                                        boolean z6 = true;
                                        if (atVar.b() != 1) {
                                            z6 = false;
                                        }
                                        concurrentHashMap.put(a10, new c("", a11, false, c9, z6));
                                        String unused3 = b.this.f13045b;
                                        Thread.currentThread().getName();
                                        ((c) b.this.f13049g.get(atVar.a())).toString();
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
        synchronized (bVar.f13050h) {
            try {
                if (bVar.f13044a != null) {
                    bVar.f13044a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final List<c> d() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f13048f.keySet().iterator();
        while (it.hasNext()) {
            c cVar = this.f13048f.get(it.next());
            if (cVar != null && cVar.b()) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    public static b a() {
        if (f13042c == null) {
            synchronized (b.class) {
                try {
                    if (f13042c == null) {
                        f13042c = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13042c;
    }

    private void b(List<f> list) {
        synchronized (this.f13050h) {
            if (list != null) {
                try {
                    if (list.size() > 0) {
                        this.f13047e.addAll(list);
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
        synchronized (this.f13050h) {
            try {
                if (this.f13046d >= 0 && this.f13047e.size() > 0 && this.f13044a == null) {
                    f poll = this.f13047e.poll();
                    if (poll != null) {
                        Runnable a9 = a(poll);
                        this.f13044a = a9;
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
        synchronized (this.f13050h) {
            try {
                if (this.f13044a != null) {
                    this.f13044a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean g() {
        if (this.f13051j) {
            return this.i.isEmpty() || System.currentTimeMillis() - this.f13052l > 86400000;
        }
        return false;
    }

    private void h() {
        if (this.f13051j) {
            if (this.i.isEmpty() || System.currentTimeMillis() - this.f13052l > 86400000) {
                this.i.clear();
                try {
                    Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
                    intent.addCategory("android.intent.category.LAUNCHER");
                    List<ResolveInfo> a9 = y.a(t.b().g(), intent);
                    if (a9 != null) {
                        Iterator<ResolveInfo> it = a9.iterator();
                        while (it.hasNext()) {
                            ActivityInfo activityInfo = it.next().activityInfo;
                            if (activityInfo != null) {
                                this.i.add(activityInfo.packageName);
                            }
                        }
                    }
                    this.f13052l = System.currentTimeMillis();
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
            Iterator<String> it = this.f13049g.keySet().iterator();
            while (it.hasNext()) {
                c cVar = this.f13049g.get(it.next());
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
        if (bVar.f13051j) {
            if (bVar.i.isEmpty() || System.currentTimeMillis() - bVar.f13052l > 86400000) {
                bVar.i.clear();
                try {
                    Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
                    intent.addCategory("android.intent.category.LAUNCHER");
                    List<ResolveInfo> a9 = y.a(t.b().g(), intent);
                    if (a9 != null) {
                        Iterator<ResolveInfo> it = a9.iterator();
                        while (it.hasNext()) {
                            ActivityInfo activityInfo = it.next().activityInfo;
                            if (activityInfo != null) {
                                bVar.i.add(activityInfo.packageName);
                            }
                        }
                    }
                    bVar.f13052l = System.currentTimeMillis();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static int b() {
        return af.b(t.b().g(), u.b.f13633a, u.a.f13600B, 0);
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
                    Context g9;
                    String unused = b.this.f13045b;
                    Thread.currentThread().getName();
                    list.size();
                    ATSDKGlobalSetting.SHAKE_TYPE shake_type = ATSDKGlobalSetting.shakeControlType;
                    List list2 = list;
                    if (list2 == null || list2.size() <= 0 || (g9 = t.b().g()) == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < list.size(); i++) {
                        a aVar = (a) list.get(i);
                        if (aVar != null) {
                            arrayList.add(new g(g9, aVar.a(), aVar.b(), af.b(g9, u.b.f13633a, "det_time_" + aVar.b(), 0L)));
                        }
                    }
                    if (arrayList.size() > 0) {
                        b.a(b.this, arrayList);
                    }
                }
            }, Math.max(0L, ATSDKGlobalSetting.mDelayInspectTime), 17);
        }
    }

    public final void a(final String str, final int i, final long j6, final int i4) {
        this.f13046d = j6;
        this.f13051j = a(i4);
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
                Context g9;
                synchronized (b.this.f13050h) {
                    try {
                        String unused = b.this.f13045b;
                        Thread.currentThread().getName();
                        try {
                            str2 = com.anythink.core.common.v.k.c(str);
                        } catch (Throwable unused2) {
                            com.anythink.core.common.u.e.b("handleUpdateInspectInfo error", "cur offset: " + b.b() + ", error string: " + str, t.b().r());
                            str2 = null;
                        }
                        String unused3 = b.this.f13045b;
                        String unused4 = b.this.f13045b;
                        Map<String, Object> c9 = q.c(str2);
                        String unused5 = b.this.f13045b;
                        c9.size();
                        if (i != 1 && c9.size() != 0) {
                            af.a(t.b().g(), u.b.f13633a, u.a.f13600B, b.b() + c9.size());
                            String unused6 = b.this.f13045b;
                            Iterator<Map.Entry<String, Object>> it = c9.entrySet().iterator();
                            g9 = t.b().g();
                            if (g9 != null) {
                                if (b.this.f13051j) {
                                    b.d(b.this);
                                    if (!b.this.i.isEmpty()) {
                                        while (it.hasNext()) {
                                            Map.Entry<String, Object> next = it.next();
                                            try {
                                                String key = next.getKey();
                                                String obj = next.getValue().toString();
                                                boolean contains = b.this.i.contains(obj);
                                                String unused7 = b.this.f13045b;
                                                Thread.currentThread().getName();
                                                b.this.f13049g.put(key, new c(obj, key, true, System.currentTimeMillis(), contains));
                                                l.a(com.anythink.core.common.e.e.a(g9)).a(key, contains);
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
                                            c cVar = (c) b.this.f13049g.get(key2);
                                            if (cVar != null) {
                                                arrayList.add(new d(g9, obj2, key2, cVar.a(), cVar.b()));
                                            } else {
                                                arrayList.add(new d(g9, obj2, key2, 0L));
                                            }
                                        } catch (Throwable unused9) {
                                        }
                                    }
                                    if (arrayList.size() > 0) {
                                        b.a(b.this, arrayList);
                                    }
                                }
                                com.anythink.core.common.u.e.a(i4, b.this.i.size(), i, j6);
                            }
                        }
                        String unused10 = b.this.f13045b;
                        af.a(t.b().g(), u.b.f13633a, u.a.f13600B, 0);
                        Iterator<Map.Entry<String, Object>> it2 = c9.entrySet().iterator();
                        g9 = t.b().g();
                        if (g9 != null) {
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
                synchronized (b.this.f13050h) {
                    try {
                        try {
                            f fVar2 = fVar;
                            if (fVar2 != null) {
                                c a9 = fVar2.a();
                                if (a9 != null) {
                                    int b9 = fVar.b();
                                    if (b9 == 1) {
                                        b.this.f13048f.put(a9.e(), a9);
                                    } else if (b9 == 2) {
                                        b.this.f13049g.put(a9.e(), a9);
                                    }
                                }
                                if ((a9 == null || a9.d()) && b.this.f13046d > 0) {
                                    try {
                                        Thread.sleep(b.this.f13046d);
                                    } catch (Throwable unused) {
                                    }
                                }
                                String unused2 = b.this.f13045b;
                                Thread.currentThread().getName();
                                long unused3 = b.this.f13046d;
                                if (a9 != null) {
                                    a9.toString();
                                }
                            }
                            b.i(b.this);
                            b.this.e();
                        } catch (Throwable th) {
                            StackTraceElement[] stackTrace = th.getStackTrace();
                            StringBuilder sb = new StringBuilder("queue size=");
                            sb.append(b.this.f13047e != null ? b.this.f13047e.size() : -1);
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
        synchronized (bVar.f13050h) {
            try {
                if (list.size() > 0) {
                    bVar.f13047e.addAll(list);
                    bVar.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
