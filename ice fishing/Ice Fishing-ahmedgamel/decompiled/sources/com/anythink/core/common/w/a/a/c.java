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
    private static final String f17784a = "c";

    /* renamed from: b, reason: collision with root package name */
    private static final long f17785b = 3600000;

    /* renamed from: c, reason: collision with root package name */
    private static final long f17786c = 30000;

    /* renamed from: d, reason: collision with root package name */
    private volatile List<aj> f17787d;

    public final void a(al alVar, ak akVar, ai aiVar) {
        if (this.f17787d == null) {
            synchronized (this) {
                try {
                    if (this.f17787d == null) {
                        this.f17787d = new CopyOnWriteArrayList();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        String a9 = alVar.a();
        int d9 = alVar.d();
        aj a10 = a(a9, this.f17787d);
        if (d9 != a.b.f17771b) {
            if (d9 == a.b.f17772c) {
                String a11 = com.anythink.core.common.w.a.d.a.a(alVar.e(), akVar);
                alVar.a(a11);
                if (!TextUtils.isEmpty(a11)) {
                    List<aj> list = this.f17787d;
                    long j6 = f17786c;
                    if (a10 != null) {
                        long b9 = a10.b();
                        if (b9 > 0) {
                            j6 = b9 * 2;
                        }
                        if (j6 >= 3600000) {
                            j6 = 3600000;
                        }
                        a10.a(j6);
                    } else {
                        aj a12 = aj.a(a9, a.C0103a.f17767b);
                        a12.a(f17786c);
                        if (list != null) {
                            list.add(a12);
                        }
                    }
                }
            }
            aiVar.b(this.f17787d);
        }
        List<aj> list2 = this.f17787d;
        if (a10 != null && list2 != null) {
            list2.remove(a10);
        }
        aiVar.b(this.f17787d);
    }

    public final void a() {
        if (this.f17787d != null) {
            this.f17787d.clear();
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
        long j6 = f17786c;
        if (ajVar != null) {
            long b9 = ajVar.b();
            if (b9 > 0) {
                j6 = 2 * b9;
            }
            if (j6 >= 3600000) {
                j6 = 3600000;
            }
            ajVar.a(j6);
            return;
        }
        aj a9 = aj.a(str, a.C0103a.f17767b);
        a9.a(f17786c);
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
