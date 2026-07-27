package com.anythink.expressad.videocommon.b;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f22435a = "DownLoadManager";

    /* renamed from: b, reason: collision with root package name */
    private static e f22436b;

    /* renamed from: c, reason: collision with root package name */
    private ThreadPoolExecutor f22437c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f22438d = false;

    /* renamed from: e, reason: collision with root package name */
    private ConcurrentHashMap<String, o> f22439e = new ConcurrentHashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private Map<String, List<Map<String, c>>> f22440f;

    /* renamed from: g, reason: collision with root package name */
    private ConcurrentHashMap<String, CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d>> f22441g;

    /* renamed from: h, reason: collision with root package name */
    private ConcurrentHashMap<String, CopyOnWriteArrayList<c>> f22442h;

    private e() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 15, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
        this.f22437c = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static e a() {
        if (f22436b == null) {
            synchronized (e.class) {
                try {
                    if (f22436b == null) {
                        f22436b = new e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f22436b;
    }

    private List<Map<String, c>> e(String str) {
        Map<String, List<Map<String, c>>> map = this.f22440f;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f22440f.get(str);
    }

    private void f(String str) {
        o c4 = c(str);
        if (c4 != null) {
            c4.d();
        }
    }

    public final CopyOnWriteArrayList<c> b(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<c>> concurrentHashMap = this.f22442h;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str)) {
            return null;
        }
        return this.f22442h.get(str);
    }

    public final o c(String str) {
        ConcurrentHashMap<String, o> concurrentHashMap = this.f22439e;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str)) {
            return null;
        }
        return this.f22439e.get(str);
    }

    public final void d(String str) {
        o c4 = c(str);
        if (c4 != null) {
            c4.a();
        }
    }

    private c b(int i, String str, boolean z8) {
        o c4 = c(str);
        if (c4 != null) {
            return c4.b(i, z8);
        }
        return null;
    }

    private void d() {
        ConcurrentHashMap<String, o> concurrentHashMap = this.f22439e;
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<String, o>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                o value = it.next().getValue();
                if (value != null) {
                    value.b();
                }
            }
        }
    }

    public final void c() {
        ConcurrentHashMap<String, o> concurrentHashMap = this.f22439e;
        if (concurrentHashMap != null) {
            for (Map.Entry<String, o> entry : concurrentHashMap.entrySet()) {
                o value = entry.getValue();
                String key = entry.getKey();
                try {
                    com.anythink.expressad.videocommon.e.d a9 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), key);
                    if (a9 != null) {
                        if (a9.F() == 2) {
                            value.c();
                        } else {
                            value.a();
                        }
                    }
                } catch (Exception e6) {
                    e6.getMessage();
                    try {
                        if (!TextUtils.isEmpty(key)) {
                            com.anythink.expressad.f.b.a();
                            com.anythink.expressad.f.c c4 = com.anythink.expressad.f.b.c(com.anythink.expressad.foundation.b.a.c().f(), key);
                            if (c4 == null) {
                                c4 = com.anythink.expressad.f.c.d(key);
                            }
                            if (c4.m() == 2) {
                                value.c();
                            } else {
                                value.a();
                            }
                        }
                    } catch (Exception e9) {
                        e9.getMessage();
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0175, code lost:
    
        if (r11.size() > 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x017a, code lost:
    
        r11 = r8.f22440f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x017c, code lost:
    
        if (r11 != null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x017e, code lost:
    
        r8.f22440f = new java.util.HashMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0191, code lost:
    
        r11 = r8.f22442h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0193, code lost:
    
        if (r11 != null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0195, code lost:
    
        r8.f22442h = new java.util.concurrent.ConcurrentHashMap<>();
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01a8, code lost:
    
        r11 = r8.f22441g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01aa, code lost:
    
        if (r11 != null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01ac, code lost:
    
        r8.f22441g = new java.util.concurrent.ConcurrentHashMap<>();
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01bf, code lost:
    
        if (r10 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01c5, code lost:
    
        if (r10.size() <= 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01c7, code lost:
    
        r11 = new java.util.concurrent.CopyOnWriteArrayList();
        r12 = new java.util.concurrent.CopyOnWriteArrayList<>();
        r13 = new java.util.concurrent.CopyOnWriteArrayList<>();
        r10 = r10.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01de, code lost:
    
        if (r10.hasNext() == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01e0, code lost:
    
        r14 = r10.next();
        r1 = new java.util.concurrent.ConcurrentHashMap();
        r2 = r14.n();
        r1.put(r2.bh() + r2.T() + r2.C(), r14);
        r11.add(r1);
        r12.add(r2);
        r13.add(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x021a, code lost:
    
        r8.f22440f.put(r9, r11);
        r8.f22441g.put(r9, r12);
        r8.f22442h.put(r9, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01b8, code lost:
    
        if (r11.containsKey(r9) == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01ba, code lost:
    
        r8.f22441g.remove(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01a1, code lost:
    
        if (r11.containsKey(r9) == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x01a3, code lost:
    
        r8.f22442h.remove(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x018a, code lost:
    
        if (r11.containsKey(r9) == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x018c, code lost:
    
        r8.f22440f.remove(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0117, code lost:
    
        if (r13.size() >= r11) goto L90;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(String str, boolean z8, int i, boolean z9, int i4, List<com.anythink.expressad.foundation.d.d> list) {
        com.anythink.expressad.foundation.d.d dVar;
        boolean z10 = false;
        if (list != null) {
            try {
                if (list.size() != 0) {
                    o c4 = c(str);
                    if (c4 != null) {
                        List<c> a9 = c4.a(z8, list);
                        if (a9 != null && a9.size() != 0) {
                            if (z9) {
                                boolean z11 = list.size() > 0 && (dVar = list.get(0)) != null && dVar.aE() != null && dVar.aE().size() > 0 && dVar.aE().contains(0);
                                try {
                                    if (i4 == 0) {
                                        ArrayList arrayList = new ArrayList();
                                        for (c cVar : a9) {
                                            for (com.anythink.expressad.foundation.d.d dVar2 : list) {
                                                if (cVar != null && cVar.n() != null && dVar2 != null && dVar2.bh().equals(cVar.n().bh()) && dVar2.aa().equals(cVar.n().aa())) {
                                                    arrayList.add(cVar);
                                                }
                                            }
                                        }
                                        z10 = arrayList.size() > 0 ? true : z11;
                                    } else {
                                        ArrayList arrayList2 = new ArrayList();
                                        for (c cVar2 : a9) {
                                            for (com.anythink.expressad.foundation.d.d dVar3 : list) {
                                                if (cVar2 != null && cVar2.n() != null && dVar3 != null && dVar3.bh().equals(cVar2.n().bh()) && dVar3.aa().equals(cVar2.n().aa())) {
                                                    arrayList2.add(cVar2);
                                                }
                                            }
                                        }
                                    }
                                } catch (Exception e6) {
                                    e = e6;
                                    z10 = z11;
                                    if (com.anythink.expressad.a.f17776a) {
                                        e.printStackTrace();
                                    }
                                    return z10;
                                }
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                for (c cVar3 : a9) {
                                    for (com.anythink.expressad.foundation.d.d dVar4 : list) {
                                        if (cVar3 != null && cVar3.n() != null && dVar4 != null && dVar4.bh().equals(cVar3.n().bh()) && dVar4.aa().equals(cVar3.n().aa())) {
                                            arrayList3.add(cVar3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return z10;
                }
            } catch (Exception e9) {
                e = e9;
            }
        }
        return z10;
    }

    public final c a(String str, String str2) {
        o c4 = c(str);
        if (c4 != null) {
            return c4.a(str2);
        }
        return null;
    }

    public final CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> a(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d>> concurrentHashMap = this.f22441g;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str)) {
            return null;
        }
        return this.f22441g.get(str);
    }

    public final boolean a(int i, String str, boolean z8) {
        try {
            o c4 = c(str);
            if (c4 != null) {
                return c4.a(i, z8) != null;
            }
        } catch (Exception e6) {
            if (com.anythink.expressad.a.f17776a) {
                e6.printStackTrace();
            }
        }
        return false;
    }

    public final boolean a(String str, boolean z8, int i, boolean z9, int i4, List<com.anythink.expressad.foundation.d.d> list) {
        return b(str, z8, i, z9, i4, list);
    }

    public final o a(String str, CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList, int i, com.anythink.expressad.videocommon.d.c cVar) {
        if (TextUtils.isEmpty(str) || copyOnWriteArrayList == null || copyOnWriteArrayList.size() == 0) {
            return null;
        }
        if (this.f22439e.containsKey(str)) {
            o oVar = this.f22439e.get(str);
            if (i != 94 && i != 287) {
                oVar.a(cVar);
            } else {
                oVar.a(copyOnWriteArrayList.get(0).aa(), cVar);
            }
            oVar.a(copyOnWriteArrayList);
            return oVar;
        }
        o oVar2 = new o(copyOnWriteArrayList, this.f22437c, str, i);
        if (cVar != null) {
            oVar2.a(cVar);
        }
        this.f22439e.put(str, oVar2);
        return oVar2;
    }

    private o a(String str, com.anythink.expressad.foundation.d.d dVar, int i, com.anythink.expressad.videocommon.d.c cVar) {
        if (TextUtils.isEmpty(str) || dVar == null) {
            return null;
        }
        if (this.f22439e.containsKey(str)) {
            o oVar = this.f22439e.get(str);
            if (i != 94 && i != 287) {
                oVar.a(cVar);
            } else {
                oVar.a(dVar.aa(), cVar);
            }
            oVar.a(dVar);
            return oVar;
        }
        o oVar2 = new o(dVar, this.f22437c, str, i);
        if (cVar != null) {
            oVar2.a(cVar);
        }
        this.f22439e.put(str, oVar2);
        return oVar2;
    }

    public final void a(boolean z8) {
        if (z8) {
            if (this.f22438d) {
                return;
            }
        } else {
            this.f22438d = false;
        }
        ConcurrentHashMap<String, o> concurrentHashMap = this.f22439e;
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<String, o>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().a();
            }
        }
    }

    private static void a(o oVar, String str) {
        try {
            com.anythink.expressad.videocommon.e.d a9 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), str);
            if (a9 == null) {
                return;
            }
            if (a9.F() == 2) {
                oVar.c();
            } else {
                oVar.a();
            }
        } catch (Exception e6) {
            e6.getMessage();
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                com.anythink.expressad.f.b.a();
                com.anythink.expressad.f.c c4 = com.anythink.expressad.f.b.c(com.anythink.expressad.foundation.b.a.c().f(), str);
                if (c4 == null) {
                    c4 = com.anythink.expressad.f.c.d(str);
                }
                if (c4.m() == 2) {
                    oVar.c();
                } else {
                    oVar.a();
                }
            } catch (Exception e9) {
                e9.getMessage();
            }
        }
    }

    private void b(String str, String str2) {
        o c4 = c(str);
        if (c4 != null) {
            try {
                c4.b(str2);
            } catch (Exception unused) {
            }
        }
    }

    public final void b() {
        this.f22438d = false;
        ConcurrentHashMap<String, o> concurrentHashMap = this.f22439e;
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<String, o>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                o value = it.next().getValue();
                if (value != null) {
                    value.c();
                }
            }
        }
    }
}
