package com.anythink.core.common.w.a.a;

import android.text.TextUtils;
import com.anythink.core.common.h.ai;
import com.anythink.core.common.h.aj;
import com.anythink.core.common.h.ak;
import com.anythink.core.common.h.al;
import com.anythink.core.common.w.a.a;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17155a = "c";

    /* renamed from: b, reason: collision with root package name */
    private static final long f17156b = 3600000;

    /* renamed from: c, reason: collision with root package name */
    private static final long f17157c = 30000;

    /* renamed from: d, reason: collision with root package name */
    private volatile List<aj> f17158d;

    public final void a(al alVar, ak akVar, ai aiVar) {
        if (this.f17158d == null) {
            synchronized (this) {
                try {
                    if (this.f17158d == null) {
                        this.f17158d = new CopyOnWriteArrayList();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        String a9 = alVar.a();
        int d2 = alVar.d();
        aj a10 = a(a9, this.f17158d);
        if (d2 != a.b.f17142b) {
            if (d2 == a.b.f17143c) {
                String a11 = com.anythink.core.common.w.a.d.a.a(alVar.e(), akVar);
                alVar.a(a11);
                if (!TextUtils.isEmpty(a11)) {
                    List<aj> list = this.f17158d;
                    long j9 = f17157c;
                    if (a10 != null) {
                        long b9 = a10.b();
                        if (b9 > 0) {
                            j9 = b9 * 2;
                        }
                        if (j9 >= 3600000) {
                            j9 = 3600000;
                        }
                        a10.a(j9);
                    } else {
                        aj a12 = aj.a(a9, a.C0102a.f17138b);
                        a12.a(f17157c);
                        if (list != null) {
                            list.add(a12);
                        }
                    }
                }
            }
            aiVar.b(this.f17158d);
        }
        List<aj> list2 = this.f17158d;
        if (a10 != null && list2 != null) {
            list2.remove(a10);
        }
        aiVar.b(this.f17158d);
    }

    public final void a() {
        if (this.f17158d != null) {
            this.f17158d.clear();
        }
    }

    private static aj a(String str, List<aj> list) {
        if (list != null && !list.isEmpty()) {
            for (aj ajVar : list) {
                if (ajVar.c().equals(str)) {
                    return ajVar;
                }
            }
        }
        return null;
    }

    private static void a(String str, aj ajVar, List<aj> list) {
        long j9 = f17157c;
        if (ajVar != null) {
            long b9 = ajVar.b();
            if (b9 > 0) {
                j9 = 2 * b9;
            }
            if (j9 >= 3600000) {
                j9 = 3600000;
            }
            ajVar.a(j9);
            return;
        }
        aj a9 = aj.a(str, a.C0102a.f17138b);
        a9.a(f17157c);
        if (list != null) {
            list.add(a9);
        }
    }

    private static void a(aj ajVar, List<aj> list) {
        if (ajVar == null || list == null) {
            return;
        }
        list.remove(ajVar);
    }
}
