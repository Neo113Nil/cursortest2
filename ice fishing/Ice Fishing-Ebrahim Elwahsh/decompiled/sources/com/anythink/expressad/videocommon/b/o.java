package com.anythink.expressad.videocommon.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.anythink.core.common.d.t;
import com.anythink.expressad.foundation.h.u;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.foundation.h.y;
import com.anythink.expressad.videocommon.b.j;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: c, reason: collision with root package name */
    private static final String f22483c = "UnitCacheCtroller";

    /* renamed from: f, reason: collision with root package name */
    private com.anythink.expressad.videocommon.d.c f22488f;

    /* renamed from: g, reason: collision with root package name */
    private ConcurrentHashMap<String, com.anythink.expressad.videocommon.d.c> f22489g;

    /* renamed from: k, reason: collision with root package name */
    private ExecutorService f22492k;

    /* renamed from: m, reason: collision with root package name */
    private String f22494m;

    /* renamed from: n, reason: collision with root package name */
    private com.anythink.expressad.videocommon.e.d f22495n;

    /* renamed from: p, reason: collision with root package name */
    private int f22497p;

    /* renamed from: q, reason: collision with root package name */
    private com.anythink.expressad.f.c f22498q;

    /* renamed from: d, reason: collision with root package name */
    private List<com.anythink.expressad.foundation.d.d> f22486d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private boolean f22487e = true;

    /* renamed from: h, reason: collision with root package name */
    private f f22490h = new f() { // from class: com.anythink.expressad.videocommon.b.o.1
        @Override // com.anythink.expressad.videocommon.b.f
        public final void a(long j9, int i) {
            if (i == 5 || i == 4) {
                o.a(o.this);
                o.this.a();
            }
            if (i == 2) {
                o.a(o.this);
            }
        }
    };
    private CopyOnWriteArrayList<Map<String, c>> i = new CopyOnWriteArrayList<>();

    /* renamed from: l, reason: collision with root package name */
    private long f22493l = com.anythink.expressad.f.a.b.f18559P;

    /* renamed from: o, reason: collision with root package name */
    private int f22496o = 2;

    /* renamed from: a, reason: collision with root package name */
    com.anythink.expressad.f.c f22484a = null;

    /* renamed from: b, reason: collision with root package name */
    com.anythink.expressad.f.c f22485b = null;

    /* renamed from: j, reason: collision with root package name */
    private Context f22491j = t.b().g();

    public o(List<com.anythink.expressad.foundation.d.d> list, ExecutorService executorService, String str, int i) {
        this.f22497p = 1;
        List<com.anythink.expressad.foundation.d.d> list2 = this.f22486d;
        if (list2 != null && list != null) {
            list2.addAll(list);
        }
        this.f22492k = executorService;
        this.f22494m = str;
        this.f22497p = i;
        c(this.f22486d);
    }

    public static /* synthetic */ boolean a(o oVar) {
        oVar.f22487e = true;
        return true;
    }

    private void e() {
        CopyOnWriteArrayList<Map<String, c>> copyOnWriteArrayList = this.i;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    try {
                        long currentTimeMillis = System.currentTimeMillis();
                        int i = 0;
                        while (i < this.i.size()) {
                            Map<String, c> map = this.i.get(i);
                            Iterator<Map.Entry<String, c>> it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                c value = it.next().getValue();
                                if (value != null) {
                                    if (currentTimeMillis - value.c() > this.f22493l * 1000 && value.k() == 1) {
                                        value.j();
                                        value.a(this.f22496o);
                                        this.i.remove(map);
                                        i--;
                                    }
                                    if (value.k() != 1 && value.k() != 5 && value.k() != 0) {
                                        this.i.remove(map);
                                        i--;
                                    }
                                }
                            }
                            i++;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    private void f() {
        CopyOnWriteArrayList<Map<String, c>> copyOnWriteArrayList = this.i;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    int i = 0;
                    while (i < this.i.size()) {
                        try {
                            Map<String, c> map = this.i.get(i);
                            Iterator<Map.Entry<String, c>> it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                c value = it.next().getValue();
                                if (value != null && value.n() != null && value.b() && value.d()) {
                                    value.o();
                                    this.i.remove(map);
                                    i--;
                                }
                            }
                            i++;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private static boolean g() {
        return true;
    }

    private int h() {
        try {
            com.anythink.expressad.f.c cVar = this.f22484a;
            if (cVar != null) {
                return cVar.f();
            }
            return 100;
        } catch (Exception unused) {
            return 100;
        }
    }

    public final void d() {
        CopyOnWriteArrayList<Map<String, c>> copyOnWriteArrayList = this.i;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    try {
                        Iterator<Map<String, c>> it = this.i.iterator();
                        while (it.hasNext()) {
                            Map<String, c> next = it.next();
                            if (next == null) {
                                return;
                            }
                            Iterator<Map.Entry<String, c>> it2 = next.entrySet().iterator();
                            while (it2.hasNext()) {
                                c value = it2.next().getValue();
                                if (value != null) {
                                    value.o();
                                }
                            }
                        }
                        this.i.clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        List<com.anythink.expressad.foundation.d.d> list = this.f22486d;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f22486d.clear();
    }

    public static boolean b(List<com.anythink.expressad.foundation.d.d> list) {
        Bitmap a9;
        boolean z8 = true;
        for (com.anythink.expressad.foundation.d.d dVar : list) {
            String J = dVar.J();
            String T8 = dVar.T();
            String bm = dVar.bm();
            String bl = dVar.bl();
            String e6 = dVar.N() != null ? dVar.N().e() : "";
            dVar.N();
            if (!z8 || TextUtils.isEmpty(e6) || e6.contains(com.anythink.expressad.foundation.d.d.f18738d) || b(dVar, e6)) {
                boolean z9 = !dVar.j() || v.f(J);
                if (!z8 || !z9 || b(J, dVar)) {
                    if (z8 && !y.a(T8)) {
                        a.a();
                        String a10 = a.a(T8);
                        if (!y.a(a10)) {
                            if (new File(a10).length() <= 0) {
                            }
                        }
                    }
                    if (z8 && !TextUtils.isEmpty(bm) && ((a9 = com.anythink.expressad.foundation.g.d.a.a(u.a(bm))) == null || a9.isRecycled())) {
                        z8 = false;
                    }
                    if (z8) {
                        if (!TextUtils.isEmpty(bl)) {
                            Bitmap a11 = com.anythink.expressad.foundation.g.d.a.a(u.a(bl));
                            if (a11 != null && !a11.isRecycled()) {
                            }
                        }
                    }
                }
            }
            z8 = false;
        }
        return z8;
    }

    private void c(List<com.anythink.expressad.foundation.d.d> list) {
        CopyOnWriteArrayList<Map<String, c>> copyOnWriteArrayList;
        if (list == null || list.size() == 0) {
            return;
        }
        f();
        e();
        int i = this.f22497p;
        try {
            if (i != 1) {
                if (i != 287) {
                    if (i == 298) {
                        com.anythink.expressad.f.b.a();
                        com.anythink.expressad.f.c d2 = com.anythink.expressad.f.b.d(com.anythink.expressad.foundation.b.a.c().f(), this.f22494m);
                        this.f22485b = d2;
                        if (d2 == null) {
                            com.anythink.expressad.f.b.a();
                            this.f22485b = com.anythink.expressad.f.b.b(com.anythink.expressad.foundation.b.a.c().f(), this.f22494m);
                        }
                        com.anythink.expressad.f.c cVar = this.f22485b;
                        if (cVar != null) {
                            this.f22493l = cVar.i();
                            this.f22496o = this.f22485b.m();
                        }
                    } else if (i != 94) {
                        if (i == 95 && !TextUtils.isEmpty(this.f22494m)) {
                            com.anythink.expressad.f.b.a();
                            com.anythink.expressad.f.c c4 = com.anythink.expressad.f.b.c(com.anythink.expressad.foundation.b.a.c().f(), this.f22494m);
                            if (c4 == null) {
                                c4 = com.anythink.expressad.f.c.d(this.f22494m);
                            }
                            if (c4 != null) {
                                this.f22493l = c4.i();
                                this.f22496o = c4.m();
                            }
                        }
                    }
                }
                com.anythink.expressad.videocommon.e.a b9 = com.anythink.expressad.videocommon.e.c.a().b();
                if (b9 == null) {
                    com.anythink.expressad.videocommon.e.c.a();
                    com.anythink.expressad.videocommon.e.c.c();
                }
                if (b9 != null) {
                    this.f22493l = b9.e();
                }
                if (!TextUtils.isEmpty(this.f22494m)) {
                    this.f22495n = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f22494m);
                }
                com.anythink.expressad.videocommon.e.d dVar = this.f22495n;
                if (dVar != null) {
                    this.f22496o = dVar.F();
                }
            } else if (!TextUtils.isEmpty(this.f22494m)) {
                com.anythink.expressad.f.b.a();
                com.anythink.expressad.f.c c9 = com.anythink.expressad.f.b.c(com.anythink.expressad.foundation.b.a.c().f(), this.f22494m);
                this.f22484a = c9;
                if (c9 == null) {
                    this.f22484a = com.anythink.expressad.f.c.c(this.f22494m);
                }
                com.anythink.expressad.f.c cVar2 = this.f22484a;
                if (cVar2 != null) {
                    this.f22493l = cVar2.i();
                    this.f22496o = this.f22484a.m();
                }
            }
            for (int i4 = 0; i4 < list.size(); i4++) {
                com.anythink.expressad.foundation.d.d dVar2 = list.get(i4);
                if (dVar2 != null) {
                    int i9 = this.f22497p;
                    String str = (i9 == 94 || i9 == 287) ? dVar2.aa() + dVar2.bh() + dVar2.T() : dVar2.bh() + dVar2.T() + dVar2.C();
                    if ((c(dVar2) || !TextUtils.isEmpty(dVar2.T())) && (copyOnWriteArrayList = this.i) != null) {
                        synchronized (copyOnWriteArrayList) {
                            int i10 = 0;
                            while (true) {
                                try {
                                    if (i10 >= this.i.size()) {
                                        c cVar3 = new c(this.f22491j, dVar2, this.f22492k, this.f22494m);
                                        cVar3.a(this.f22496o);
                                        cVar3.e(this.f22497p);
                                        HashMap hashMap = new HashMap();
                                        hashMap.put(str, cVar3);
                                        this.i.add(hashMap);
                                        break;
                                    }
                                    Map<String, c> map = this.i.get(i10);
                                    if (map == null || !map.containsKey(str)) {
                                        i10++;
                                    } else {
                                        c cVar4 = map.get(str);
                                        if (cVar4 != null) {
                                            cVar4.a(dVar2);
                                            cVar4.a(this.f22496o);
                                            cVar4.a(false);
                                            map.remove(str);
                                            map.put(str, cVar4);
                                            this.i.set(i10, map);
                                        }
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                        }
                    }
                }
            }
            List<com.anythink.expressad.foundation.d.d> list2 = this.f22486d;
            if (list2 == null || list2.size() <= 0) {
                return;
            }
            this.f22486d.clear();
        } catch (Exception unused2) {
        }
    }

    public final void a(com.anythink.expressad.videocommon.d.c cVar) {
        this.f22488f = cVar;
    }

    public final void a(String str, com.anythink.expressad.videocommon.d.c cVar) {
        if (this.f22489g == null) {
            this.f22489g = new ConcurrentHashMap<>();
        }
        this.f22489g.put(str, cVar);
    }

    public final void a(List<com.anythink.expressad.foundation.d.d> list) {
        List<com.anythink.expressad.foundation.d.d> list2 = this.f22486d;
        if (list2 != null && list != null) {
            list2.addAll(list);
        }
        c(this.f22486d);
    }

    public final void a(com.anythink.expressad.foundation.d.d dVar) {
        List<com.anythink.expressad.foundation.d.d> list = this.f22486d;
        if (list != null && dVar != null) {
            list.add(dVar);
        }
        c(this.f22486d);
    }

    public final List<c> a(boolean z8, List<com.anythink.expressad.foundation.d.d> list) {
        long j9;
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList<Map<String, c>> copyOnWriteArrayList = this.i;
        if (copyOnWriteArrayList != null) {
            synchronized (copyOnWriteArrayList) {
                try {
                    try {
                        long currentTimeMillis = System.currentTimeMillis();
                        int i = 0;
                        while (i < this.i.size()) {
                            Map<String, c> map = this.i.get(i);
                            Iterator<Map.Entry<String, c>> it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                c value = it.next().getValue();
                                if (value != null && value.n() != null) {
                                    com.anythink.expressad.foundation.d.d n9 = value.n();
                                    boolean z9 = false;
                                    for (com.anythink.expressad.foundation.d.d dVar : list) {
                                        if (n9 != null && dVar != null && !TextUtils.isEmpty(n9.aa()) && !TextUtils.isEmpty(dVar.aa()) && n9.bh().equals(dVar.bh()) && n9.aa().equals(dVar.aa())) {
                                            z9 = true;
                                        }
                                    }
                                    if (z9) {
                                        if ((z8 && !n9.B()) || (!z8 && n9.B())) {
                                            n9.B();
                                        } else {
                                            String J = n9.J();
                                            String T8 = n9.T();
                                            String str = "";
                                            if (n9.N() != null) {
                                                str = n9.N().e();
                                            }
                                            n9.N();
                                            if (TextUtils.isEmpty(str) || str.contains(com.anythink.expressad.foundation.d.d.f18738d) || b(n9, str)) {
                                                if (b(J, n9)) {
                                                    if (value.b()) {
                                                        value.o();
                                                    } else if (y.a(T8)) {
                                                        arrayList.add(value);
                                                    } else if (a(value, b(n9))) {
                                                        arrayList.add(value);
                                                    }
                                                }
                                                boolean isEmpty = TextUtils.isEmpty(value.m());
                                                int k6 = value.k();
                                                if (k6 == 5) {
                                                    if (value.b()) {
                                                        value.o();
                                                        this.i.remove(map);
                                                        i--;
                                                    } else if (!isEmpty) {
                                                        value.l();
                                                    } else {
                                                        if (!a(J, n9)) {
                                                            return null;
                                                        }
                                                        arrayList.add(value);
                                                    }
                                                } else {
                                                    long c4 = value.c();
                                                    if (value.k() == 1) {
                                                        j9 = currentTimeMillis;
                                                        if (currentTimeMillis - c4 > this.f22493l * 1000) {
                                                            value.j();
                                                            this.i.remove(map);
                                                            i--;
                                                            currentTimeMillis = j9;
                                                        }
                                                    } else {
                                                        j9 = currentTimeMillis;
                                                    }
                                                    if (k6 != 4 && k6 != 2) {
                                                        if (k6 == 1) {
                                                            if (!value.b()) {
                                                                if (!com.anythink.expressad.a.f17791q && a(value, b(n9)) && a(J, n9)) {
                                                                    boolean z10 = com.anythink.expressad.a.f17776a;
                                                                    arrayList.add(value);
                                                                }
                                                            }
                                                            currentTimeMillis = j9;
                                                        }
                                                        if (a(value, b(n9)) && a(J, n9)) {
                                                            arrayList.add(value);
                                                        }
                                                        currentTimeMillis = j9;
                                                    }
                                                    this.i.remove(map);
                                                    i--;
                                                    currentTimeMillis = j9;
                                                }
                                            }
                                        }
                                    }
                                }
                                j9 = currentTimeMillis;
                                currentTimeMillis = j9;
                            }
                            i++;
                        }
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return arrayList;
    }

    private int d(com.anythink.expressad.foundation.d.d dVar) {
        try {
            if (dVar.x() == 298) {
                if (this.f22485b == null) {
                    com.anythink.expressad.f.b.a();
                    this.f22485b = com.anythink.expressad.f.b.a(com.anythink.expressad.foundation.b.a.c().f(), this.f22494m);
                }
                return this.f22485b.f();
            }
            if (dVar.x() == 42) {
                return h();
            }
            if (this.f22495n == null) {
                this.f22495n = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f22494m, false);
            }
            return this.f22495n.v();
        } catch (Throwable th) {
            th.getMessage();
            return 100;
        }
    }

    public o(com.anythink.expressad.foundation.d.d dVar, ExecutorService executorService, String str, int i) {
        this.f22497p = 1;
        List<com.anythink.expressad.foundation.d.d> list = this.f22486d;
        if (list != null && dVar != null) {
            list.add(dVar);
        }
        this.f22492k = executorService;
        this.f22494m = str;
        this.f22497p = i;
        c(this.f22486d);
    }

    private int b(com.anythink.expressad.foundation.d.d dVar) {
        if (dVar == null) {
            return -1;
        }
        if (dVar.aq() != -1) {
            return dVar.aq();
        }
        return d(dVar);
    }

    private static boolean b(c cVar, int i) {
        return a(cVar, i);
    }

    private static boolean b(String str, com.anythink.expressad.foundation.d.d dVar) {
        if (dVar.I() || TextUtils.isEmpty(str)) {
            return true;
        }
        if (dVar.ax() != 1 || c(dVar)) {
            return (dVar.aE() != null && dVar.aE().size() > 0 && dVar.aE().contains(2)) || y.b(i.a().b(str)) || y.b(j.a.f22468a.c(str));
        }
        return true;
    }

    private static boolean b(com.anythink.expressad.foundation.d.d dVar, String str) {
        if (dVar.j()) {
            return true;
        }
        if ((dVar.aE() == null || dVar.aE().size() <= 0 || !dVar.aE().contains(1)) && !TextUtils.isEmpty(str) && dVar.ax() == 0) {
            i.a().b(str);
            if (i.a().b(str) == null) {
                return false;
            }
        }
        return true;
    }

    public final c b(int i, boolean z8) {
        try {
            return a(i, z8);
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    private static synchronized String b(c cVar) {
        String c4;
        synchronized (o.class) {
            c4 = c(cVar);
        }
        return c4;
    }

    public final void b() {
        int k6;
        try {
            CopyOnWriteArrayList<Map<String, c>> copyOnWriteArrayList = this.i;
            if (copyOnWriteArrayList != null) {
                synchronized (copyOnWriteArrayList) {
                    try {
                        Iterator<Map<String, c>> it = this.i.iterator();
                        while (it.hasNext()) {
                            Map<String, c> next = it.next();
                            if (next != null) {
                                Iterator<Map.Entry<String, c>> it2 = next.entrySet().iterator();
                                while (it2.hasNext()) {
                                    c value = it2.next().getValue();
                                    if (value != null && (k6 = value.k()) != 1 && k6 != 5) {
                                        if (com.anythink.expressad.foundation.h.n.b() != 9 && this.f22496o == 2) {
                                            return;
                                        }
                                        if (k6 == 2 || k6 == 0) {
                                            value.h();
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static synchronized String c(c cVar) {
        synchronized (o.class) {
            if (cVar == null) {
                return "";
            }
            String T8 = cVar.n().T();
            try {
                if (cVar.k() == 5) {
                    String e6 = cVar.e();
                    if (!y.a(e6)) {
                        if (new File(e6).length() > 0) {
                            T8 = e6;
                        }
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
            }
            return T8;
        }
    }

    public final void b(String str) {
        CopyOnWriteArrayList<Map<String, c>> copyOnWriteArrayList;
        try {
            synchronized (this.i) {
                try {
                    if (!TextUtils.isEmpty(str) && (copyOnWriteArrayList = this.i) != null && copyOnWriteArrayList.size() > 0) {
                        Iterator<Map<String, c>> it = this.i.iterator();
                        while (it.hasNext()) {
                            Map<String, c> next = it.next();
                            if (next != null) {
                                for (Map.Entry<String, c> entry : next.entrySet()) {
                                    if (entry != null && TextUtils.equals(entry.getKey(), str)) {
                                        this.i.remove(next);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void c() {
        CopyOnWriteArrayList<Map<String, c>> copyOnWriteArrayList = this.i;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    Iterator<Map<String, c>> it = this.i.iterator();
                    while (it.hasNext()) {
                        Map<String, c> next = it.next();
                        if (next != null) {
                            Iterator<Map.Entry<String, c>> it2 = next.entrySet().iterator();
                            while (it2.hasNext()) {
                                c value = it2.next().getValue();
                                if (value != null && value.k() == 1) {
                                    value.j();
                                    this.i.remove(next);
                                    return;
                                }
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0146, code lost:
    
        if (r3 != 94) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        if (r10.B() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        if (r25 != 287) goto L143;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c a(int i, boolean z8) {
        c cVar;
        long j9;
        CopyOnWriteArrayList<Map<String, c>> copyOnWriteArrayList = this.i;
        if (copyOnWriteArrayList == null) {
            return null;
        }
        synchronized (copyOnWriteArrayList) {
            try {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    int i4 = 0;
                    while (i4 < this.i.size()) {
                        Map<String, c> map = this.i.get(i4);
                        Iterator<Map.Entry<String, c>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            c value = it.next().getValue();
                            if (value != null && value.n() != null) {
                                com.anythink.expressad.foundation.d.d n9 = value.n();
                                if (z8 && !n9.B()) {
                                    n9.B();
                                }
                                String J = n9.J();
                                String T8 = n9.T();
                                String str = "";
                                if (n9.N() != null) {
                                    str = n9.N().e();
                                }
                                n9.N();
                                cVar = null;
                                if (this.f22497p == 94) {
                                }
                                try {
                                    if (!TextUtils.isEmpty(str) && !str.contains(com.anythink.expressad.foundation.d.d.f18738d) && !b(n9, str)) {
                                        j9 = currentTimeMillis;
                                        currentTimeMillis = j9;
                                    }
                                    if (b(J, n9)) {
                                        if (value.b()) {
                                            value.o();
                                            j9 = currentTimeMillis;
                                            currentTimeMillis = j9;
                                        } else {
                                            if (y.a(T8)) {
                                                return value;
                                            }
                                            if (a(value, b(n9))) {
                                                return value;
                                            }
                                        }
                                    }
                                    boolean isEmpty = TextUtils.isEmpty(value.m());
                                    int k6 = value.k();
                                    if (this.f22497p == 298 && a(value, b(n9))) {
                                        return value;
                                    }
                                    if (k6 == 5) {
                                        if (value.b()) {
                                            value.o();
                                            this.i.remove(map);
                                            i4--;
                                        } else if (!isEmpty) {
                                            value.l();
                                            if (this.f22497p == 95) {
                                                return value;
                                            }
                                            j9 = currentTimeMillis;
                                            currentTimeMillis = j9;
                                        } else {
                                            if (a(J, n9)) {
                                                return value;
                                            }
                                            return null;
                                        }
                                    } else {
                                        long c4 = value.c();
                                        if (value.k() == 1) {
                                            j9 = currentTimeMillis;
                                            if (currentTimeMillis - c4 > this.f22493l * 1000) {
                                                value.j();
                                                this.i.remove(map);
                                                i4--;
                                                int i9 = this.f22497p;
                                                if (i9 != 1) {
                                                }
                                                currentTimeMillis = j9;
                                            }
                                        } else {
                                            j9 = currentTimeMillis;
                                        }
                                        if (this.f22497p == 95) {
                                            if (!value.b()) {
                                                return value;
                                            }
                                            value.o();
                                            this.i.remove(map);
                                        } else if (k6 != 4 && k6 != 2) {
                                            if (k6 == 1) {
                                                if (!value.b()) {
                                                    if (!com.anythink.expressad.a.f17791q && a(value, b(n9)) && a(J, n9)) {
                                                        boolean z9 = com.anythink.expressad.a.f17776a;
                                                        return value;
                                                    }
                                                }
                                                currentTimeMillis = j9;
                                            }
                                            int i10 = this.f22497p;
                                            if ((i10 == 94 || i10 == 287) && a(value, b(n9)) && a(J, n9)) {
                                                return value;
                                            }
                                            currentTimeMillis = j9;
                                        } else {
                                            this.i.remove(map);
                                        }
                                        i4--;
                                        currentTimeMillis = j9;
                                    }
                                } catch (Exception e6) {
                                    e = e6;
                                    e.printStackTrace();
                                    return cVar;
                                }
                            }
                            j9 = currentTimeMillis;
                            currentTimeMillis = j9;
                        }
                        i4++;
                    }
                    cVar = null;
                } catch (Exception e9) {
                    e = e9;
                    cVar = null;
                }
                return cVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean c(com.anythink.expressad.foundation.d.d dVar) {
        if (dVar == null) {
            return false;
        }
        try {
            return dVar.K() == 2;
        } catch (Throwable th) {
            if (!com.anythink.expressad.a.f17776a) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    private static boolean a(c cVar, int i) {
        long p6 = cVar.p();
        long f6 = cVar.f();
        if (TextUtils.isEmpty(cVar.a())) {
            return true;
        }
        if (i == 0) {
            if (cVar.n() == null || TextUtils.isEmpty(cVar.n().T())) {
                return false;
            }
            a(cVar);
            return true;
        }
        if (f6 <= 0 || p6 * 100 < f6 * i) {
            return false;
        }
        a(cVar);
        return true;
    }

    private static synchronized void a(c cVar) {
        synchronized (o.class) {
            com.anythink.expressad.foundation.d.d n9 = cVar != null ? cVar.n() : null;
            if (n9 == null) {
                return;
            }
            if (n9.x() == 94 || n9.x() == 287) {
                cVar.a(c(cVar));
            }
        }
    }

    private static boolean a(String str, com.anythink.expressad.foundation.d.d dVar) {
        try {
            if (dVar.aE() != null && dVar.aE().size() > 0 && dVar.aE().contains(2)) {
                return true;
            }
            if ((!dVar.j() || v.f(str)) && !y.a(str)) {
                return b(str, dVar);
            }
            return true;
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    private boolean a(com.anythink.expressad.foundation.d.d dVar, String str) {
        if (!TextUtils.isEmpty(dVar.at()) || TextUtils.isEmpty(str)) {
            return true;
        }
        return l.a().d(this.f22494m + "_" + dVar.aa() + "_" + str);
    }

    public final c a(String str) {
        CopyOnWriteArrayList<Map<String, c>> copyOnWriteArrayList = this.i;
        if (copyOnWriteArrayList == null) {
            return null;
        }
        synchronized (copyOnWriteArrayList) {
            try {
                Iterator<Map<String, c>> it = this.i.iterator();
                while (it.hasNext()) {
                    Map<String, c> next = it.next();
                    if (next != null && next.containsKey(str)) {
                        return next.get(str);
                    }
                }
            } catch (Throwable unused) {
            }
            return null;
        }
    }

    private static boolean a(CopyOnWriteArrayList<Map<String, c>> copyOnWriteArrayList) {
        try {
            Iterator<Map<String, c>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                Map<String, c> next = it.next();
                if (next != null) {
                    Iterator<Map.Entry<String, c>> it2 = next.entrySet().iterator();
                    while (it2.hasNext()) {
                        if (it2.next().getValue().k() == 1) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            if (!com.anythink.expressad.a.f17776a) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0035 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:5:0x000a, B:7:0x0013, B:8:0x0019, B:9:0x001f, B:11:0x0025, B:14:0x002d, B:15:0x0035, B:17:0x003b, B:20:0x0049, B:23:0x004f, B:25:0x0055, B:26:0x0057, B:28:0x006f, B:30:0x0073, B:31:0x007b, B:32:0x007f, B:38:0x0093, B:40:0x0097, B:41:0x00aa, B:43:0x00ae, B:44:0x00b4, B:46:0x00b8, B:48:0x00bc, B:49:0x00cf, B:51:0x00d3, B:52:0x0101, B:54:0x0106, B:55:0x010c, B:57:0x0119, B:59:0x011d, B:62:0x0125, B:63:0x012c, B:65:0x0130, B:67:0x0136, B:69:0x0144, B:80:0x0156, B:83:0x015a, B:96:0x0165, B:100:0x016b, B:86:0x0170, B:91:0x017d, B:94:0x017a, B:111:0x00d8, B:113:0x00dc, B:116:0x00f1, B:118:0x00f7, B:120:0x00fb, B:128:0x0182), top: B:4:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0106 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:5:0x000a, B:7:0x0013, B:8:0x0019, B:9:0x001f, B:11:0x0025, B:14:0x002d, B:15:0x0035, B:17:0x003b, B:20:0x0049, B:23:0x004f, B:25:0x0055, B:26:0x0057, B:28:0x006f, B:30:0x0073, B:31:0x007b, B:32:0x007f, B:38:0x0093, B:40:0x0097, B:41:0x00aa, B:43:0x00ae, B:44:0x00b4, B:46:0x00b8, B:48:0x00bc, B:49:0x00cf, B:51:0x00d3, B:52:0x0101, B:54:0x0106, B:55:0x010c, B:57:0x0119, B:59:0x011d, B:62:0x0125, B:63:0x012c, B:65:0x0130, B:67:0x0136, B:69:0x0144, B:80:0x0156, B:83:0x015a, B:96:0x0165, B:100:0x016b, B:86:0x0170, B:91:0x017d, B:94:0x017a, B:111:0x00d8, B:113:0x00dc, B:116:0x00f1, B:118:0x00f7, B:120:0x00fb, B:128:0x0182), top: B:4:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0119 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:5:0x000a, B:7:0x0013, B:8:0x0019, B:9:0x001f, B:11:0x0025, B:14:0x002d, B:15:0x0035, B:17:0x003b, B:20:0x0049, B:23:0x004f, B:25:0x0055, B:26:0x0057, B:28:0x006f, B:30:0x0073, B:31:0x007b, B:32:0x007f, B:38:0x0093, B:40:0x0097, B:41:0x00aa, B:43:0x00ae, B:44:0x00b4, B:46:0x00b8, B:48:0x00bc, B:49:0x00cf, B:51:0x00d3, B:52:0x0101, B:54:0x0106, B:55:0x010c, B:57:0x0119, B:59:0x011d, B:62:0x0125, B:63:0x012c, B:65:0x0130, B:67:0x0136, B:69:0x0144, B:80:0x0156, B:83:0x015a, B:96:0x0165, B:100:0x016b, B:86:0x0170, B:91:0x017d, B:94:0x017a, B:111:0x00d8, B:113:0x00dc, B:116:0x00f1, B:118:0x00f7, B:120:0x00fb, B:128:0x0182), top: B:4:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0165 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int x3;
        com.anythink.expressad.videocommon.d.c cVar;
        int i;
        e();
        CopyOnWriteArrayList<Map<String, c>> copyOnWriteArrayList = this.i;
        if (copyOnWriteArrayList != null) {
            synchronized (copyOnWriteArrayList) {
                try {
                    if (!a(this.i)) {
                        this.f22487e = true;
                    }
                    Iterator<Map<String, c>> it = this.i.iterator();
                    while (it.hasNext()) {
                        Map<String, c> next = it.next();
                        if (next != null) {
                            Iterator<Map.Entry<String, c>> it2 = next.entrySet().iterator();
                            while (it2.hasNext()) {
                                c value = it2.next().getValue();
                                if (value != null && !value.b()) {
                                    if (this.f22497p == 95) {
                                        this.f22487e = true;
                                    }
                                    int k6 = value.k();
                                    final com.anythink.expressad.foundation.d.d n9 = value.n();
                                    value.a(new com.anythink.expressad.videocommon.d.c() { // from class: com.anythink.expressad.videocommon.b.o.2
                                        @Override // com.anythink.expressad.videocommon.d.c
                                        public final void a(String str) {
                                            com.anythink.expressad.videocommon.d.c cVar2;
                                            if (o.this.f22488f != null) {
                                                o.this.f22488f.a(str);
                                            }
                                            if (o.this.f22489g == null || o.this.f22489g.size() <= 0 || n9 == null || (cVar2 = (com.anythink.expressad.videocommon.d.c) o.this.f22489g.get(n9.aa())) == null) {
                                                return;
                                            }
                                            cVar2.a(str);
                                        }

                                        @Override // com.anythink.expressad.videocommon.d.c
                                        public final void a(String str, String str2) {
                                            com.anythink.expressad.videocommon.d.c cVar2;
                                            com.anythink.expressad.foundation.d.d dVar = n9;
                                            if (dVar == null || dVar.aE() == null || n9.aE().size() <= 0 || !n9.aE().contains(0)) {
                                                if (o.this.f22488f != null) {
                                                    o.this.f22488f.a(str, str2);
                                                }
                                                if (o.this.f22489g == null || o.this.f22489g.size() <= 0 || n9 == null || (cVar2 = (com.anythink.expressad.videocommon.d.c) o.this.f22489g.get(n9.aa())) == null) {
                                                    return;
                                                }
                                                cVar2.a(str, str2);
                                            }
                                        }
                                    });
                                    int b9 = b(n9);
                                    if (this.f22497p == 1) {
                                        if (this.f22484a == null) {
                                            this.f22484a = com.anythink.expressad.f.c.c(this.f22494m);
                                        }
                                        b9 = h();
                                    }
                                    value.d(b9);
                                    int i4 = this.f22497p;
                                    if (i4 != 94 && i4 != 287 && i4 != 95) {
                                        if (i4 == 298) {
                                            if (this.f22485b == null) {
                                                com.anythink.expressad.f.b.a();
                                                this.f22485b = com.anythink.expressad.f.b.a(com.anythink.expressad.foundation.b.a.c().f(), this.f22494m);
                                            }
                                            com.anythink.expressad.f.c cVar2 = this.f22485b;
                                            if (cVar2 != null) {
                                                x3 = cVar2.g();
                                                if (this.f22497p == 1) {
                                                    if (this.f22484a == null) {
                                                        com.anythink.expressad.f.b.a();
                                                        this.f22484a = com.anythink.expressad.f.b.a(com.anythink.expressad.foundation.b.a.c().f(), this.f22494m);
                                                    }
                                                    com.anythink.expressad.f.c cVar3 = this.f22484a;
                                                    if (cVar3 != null) {
                                                        x3 = cVar3.g();
                                                    }
                                                }
                                                value.b(x3);
                                                value.c(n9 != null ? n9.aF() : 1);
                                                if (a(value, b(n9))) {
                                                    com.anythink.expressad.videocommon.d.c cVar4 = this.f22488f;
                                                    if (cVar4 != null && ((i = this.f22497p) == 297 || i == 298)) {
                                                        cVar4.a(n9.T());
                                                    }
                                                    ConcurrentHashMap<String, com.anythink.expressad.videocommon.d.c> concurrentHashMap = this.f22489g;
                                                    if (concurrentHashMap != null && concurrentHashMap.size() > 0 && (cVar = this.f22489g.get(n9.aa())) != null) {
                                                        cVar.a(n9.T());
                                                    }
                                                }
                                                if (k6 == 1 && k6 != 5 && k6 != 4 && (k6 == 2 || this.f22487e)) {
                                                    value.a(this.f22490h);
                                                    if (!a(value, b9)) {
                                                        int i9 = this.f22497p;
                                                        if (i9 == 94 || i9 == 287) {
                                                            value.h();
                                                        }
                                                    } else {
                                                        int i10 = this.f22497p;
                                                        if (i10 == 1 || i10 == 95 || i10 == 298) {
                                                            this.f22487e = false;
                                                        }
                                                        value.h();
                                                    }
                                                }
                                            }
                                        }
                                        x3 = 0;
                                        if (this.f22497p == 1) {
                                        }
                                        value.b(x3);
                                        value.c(n9 != null ? n9.aF() : 1);
                                        if (a(value, b(n9))) {
                                        }
                                        if (k6 == 1) {
                                            value.a(this.f22490h);
                                            if (!a(value, b9)) {
                                            }
                                        }
                                    }
                                    if (this.f22495n == null) {
                                        this.f22495n = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f22494m, this.f22497p == 287);
                                    }
                                    com.anythink.expressad.videocommon.e.d dVar = this.f22495n;
                                    x3 = dVar != null ? dVar.x() : 0;
                                    value.b(x3);
                                    value.c(n9 != null ? n9.aF() : 1);
                                    if (a(value, b(n9))) {
                                    }
                                    if (k6 == 1) {
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
