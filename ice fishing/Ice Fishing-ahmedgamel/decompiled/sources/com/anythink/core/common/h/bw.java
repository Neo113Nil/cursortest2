package com.anythink.core.common.h;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.Wv;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class bw {

    /* renamed from: c, reason: collision with root package name */
    private String f14611c;

    /* renamed from: a, reason: collision with root package name */
    private final String f14609a = "anythink_bw";

    /* renamed from: b, reason: collision with root package name */
    private int f14610b = 1;

    /* renamed from: d, reason: collision with root package name */
    private ConcurrentHashMap<String, br> f14612d = new ConcurrentHashMap<>(3);

    public interface a {
        boolean a(br brVar);
    }

    public bw(String str, String str2) {
        this.f14611c = Wv.h(str, "_", str2);
    }

    public final void a(int i) {
        if (i <= 0) {
            return;
        }
        this.f14610b = i;
    }

    public final synchronized void b(final int i) {
        a(new a() { // from class: com.anythink.core.common.h.bw.3
            @Override // com.anythink.core.common.h.bw.a
            public final boolean a(br brVar) {
                brVar.a(i);
                return true;
            }
        });
    }

    public final synchronized void a(String str, br brVar) {
        this.f14612d.put(str, brVar);
        a();
    }

    private synchronized void a() {
        try {
            if (this.f14612d.entrySet() == null) {
                return;
            }
            if (this.f14612d.size() <= this.f14610b) {
                return;
            }
            this.f14612d.size();
            final br[] brVarArr = new br[1];
            a(new a() { // from class: com.anythink.core.common.h.bw.1
                @Override // com.anythink.core.common.h.bw.a
                public final boolean a(br brVar) {
                    br[] brVarArr2 = brVarArr;
                    if (brVarArr2[0] == null) {
                        brVarArr2[0] = brVar;
                    } else if (com.anythink.core.common.v.l.a(brVar.e(), brVarArr[0].e()) <= 0 && (com.anythink.core.common.v.l.a(brVar.e(), brVarArr[0].e()) != 0 || brVar.f() >= brVarArr[0].f())) {
                        return true;
                    }
                    brVarArr[0] = brVar;
                    return true;
                }
            });
            if (this.f14612d.size() <= this.f14610b) {
                this.f14612d.size();
            } else {
                br brVar = brVarArr[0];
                if (brVar != null) {
                    brVar.a();
                    this.f14612d.remove(brVarArr[0].a());
                    brVarArr[0].g();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final j a(final ad adVar) {
        final j jVar = new j();
        final ArrayList arrayList = new ArrayList(3);
        jVar.f14758a = arrayList;
        a(new a() { // from class: com.anythink.core.common.h.bw.2
            @Override // com.anythink.core.common.h.bw.a
            public final boolean a(br brVar) {
                if (!jVar.f14760c && brVar.d()) {
                    jVar.f14760c = true;
                }
                c c9 = brVar.c();
                if (c9 != null) {
                    if (arrayList.size() != 0) {
                        int i = 0;
                        while (true) {
                            if (i >= arrayList.size()) {
                                break;
                            }
                            if (com.anythink.core.common.v.l.a(c9.e().getUnitGroupInfo(), ((c) arrayList.get(i)).e().getUnitGroupInfo()) < 0) {
                                arrayList.add(i, c9);
                                break;
                            }
                            if (i == arrayList.size() - 1) {
                                arrayList.add(c9);
                                break;
                            }
                            i++;
                        }
                    } else {
                        arrayList.add(c9);
                    }
                    ad R8 = c9.e().getUnitGroupInfo().R();
                    ad adVar2 = adVar;
                    if (adVar2 != null && R8 != null && TextUtils.equals(adVar2.token, R8.token)) {
                        jVar.f14759b = c9;
                    }
                }
                return true;
            }
        });
        return jVar;
    }

    public final synchronized void a(c cVar) {
        if (this.f14612d == null) {
            return;
        }
        if (cVar != null) {
            br brVar = this.f14612d.get(cVar.i().aJ());
            if (brVar != null) {
                brVar.a(cVar);
                if (brVar.b() == 0) {
                    this.f14612d.remove(brVar.a());
                    brVar.a();
                }
            }
        }
    }

    private synchronized void a(a aVar) {
        try {
            ConcurrentHashMap<String, br> concurrentHashMap = this.f14612d;
            if (concurrentHashMap == null) {
                return;
            }
            Set<Map.Entry<String, br>> entrySet = concurrentHashMap.entrySet();
            if (entrySet == null) {
                return;
            }
            for (Map.Entry<String, br> entry : entrySet) {
                br value = entry.getValue();
                c c9 = value.c();
                if (c9 != null && c9.k()) {
                    entry.getKey();
                    com.anythink.core.common.v.p.a(value.e());
                    c9.toString();
                    entry.getKey();
                    aVar.a(value);
                } else {
                    entry.getKey();
                    entry.getKey();
                    this.f14612d.remove(entry.getKey());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
