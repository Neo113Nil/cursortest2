package com.anythink.core.common.h;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.CL;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class bw {

    /* renamed from: c, reason: collision with root package name */
    private String f13982c;

    /* renamed from: a, reason: collision with root package name */
    private final String f13980a = "anythink_bw";

    /* renamed from: b, reason: collision with root package name */
    private int f13981b = 1;

    /* renamed from: d, reason: collision with root package name */
    private ConcurrentHashMap<String, br> f13983d = new ConcurrentHashMap<>(3);

    public interface a {
        boolean a(br brVar);
    }

    public bw(String str, String str2) {
        this.f13982c = CL.k(str, "_", str2);
    }

    public final void a(int i) {
        if (i <= 0) {
            return;
        }
        this.f13981b = i;
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
        this.f13983d.put(str, brVar);
        a();
    }

    private synchronized void a() {
        try {
            if (this.f13983d.entrySet() == null) {
                return;
            }
            if (this.f13983d.size() <= this.f13981b) {
                return;
            }
            this.f13983d.size();
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
            if (this.f13983d.size() <= this.f13981b) {
                this.f13983d.size();
            } else {
                br brVar = brVarArr[0];
                if (brVar != null) {
                    brVar.a();
                    this.f13983d.remove(brVarArr[0].a());
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
        jVar.f14129a = arrayList;
        a(new a() { // from class: com.anythink.core.common.h.bw.2
            @Override // com.anythink.core.common.h.bw.a
            public final boolean a(br brVar) {
                if (!jVar.f14131c && brVar.d()) {
                    jVar.f14131c = true;
                }
                c c4 = brVar.c();
                if (c4 != null) {
                    if (arrayList.size() != 0) {
                        int i = 0;
                        while (true) {
                            if (i >= arrayList.size()) {
                                break;
                            }
                            if (com.anythink.core.common.v.l.a(c4.e().getUnitGroupInfo(), ((c) arrayList.get(i)).e().getUnitGroupInfo()) < 0) {
                                arrayList.add(i, c4);
                                break;
                            }
                            if (i == arrayList.size() - 1) {
                                arrayList.add(c4);
                                break;
                            }
                            i++;
                        }
                    } else {
                        arrayList.add(c4);
                    }
                    ad R8 = c4.e().getUnitGroupInfo().R();
                    ad adVar2 = adVar;
                    if (adVar2 != null && R8 != null && TextUtils.equals(adVar2.token, R8.token)) {
                        jVar.f14130b = c4;
                    }
                }
                return true;
            }
        });
        return jVar;
    }

    public final synchronized void a(c cVar) {
        if (this.f13983d == null) {
            return;
        }
        if (cVar != null) {
            br brVar = this.f13983d.get(cVar.i().aJ());
            if (brVar != null) {
                brVar.a(cVar);
                if (brVar.b() == 0) {
                    this.f13983d.remove(brVar.a());
                    brVar.a();
                }
            }
        }
    }

    private synchronized void a(a aVar) {
        try {
            ConcurrentHashMap<String, br> concurrentHashMap = this.f13983d;
            if (concurrentHashMap == null) {
                return;
            }
            Set<Map.Entry<String, br>> entrySet = concurrentHashMap.entrySet();
            if (entrySet == null) {
                return;
            }
            for (Map.Entry<String, br> entry : entrySet) {
                br value = entry.getValue();
                c c4 = value.c();
                if (c4 != null && c4.k()) {
                    entry.getKey();
                    com.anythink.core.common.v.p.a(value.e());
                    c4.toString();
                    entry.getKey();
                    aVar.a(value);
                } else {
                    entry.getKey();
                    entry.getKey();
                    this.f13983d.remove(entry.getKey());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
