package com.anythink.core.common;

import android.content.Context;
import android.util.Log;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.AdError;
import com.anythink.core.basead.adx.api.ATAdxSetting;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.ar;
import com.anythink.core.common.h.bx;
import com.anythink.core.common.h.cb;
import com.anythink.core.common.v.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    String f15554a;

    /* renamed from: b, reason: collision with root package name */
    String f15555b;

    /* renamed from: e, reason: collision with root package name */
    private List<com.anythink.core.common.d.a> f15558e;

    /* renamed from: c, reason: collision with root package name */
    private final String f15556c = "n";

    /* renamed from: d, reason: collision with root package name */
    private final Object f15557d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private com.anythink.core.common.d.a f15559f = new com.anythink.core.common.d.a() { // from class: com.anythink.core.common.n.1
        @Override // com.anythink.core.common.d.a
        public final void onAdLoadFail(AdError adError) {
            synchronized (n.this.f15557d) {
                try {
                    Iterator it = n.this.f15558e.iterator();
                    while (it.hasNext()) {
                        com.anythink.core.common.d.a aVar = (com.anythink.core.common.d.a) it.next();
                        if (aVar != null) {
                            n nVar = n.this;
                            ab.a(nVar.f15554a, String.valueOf(nVar.f15555b), j.r.f13314F, j.r.f13327n, "returned no eligible ads from any mediated networks. [listener:" + aVar.toString() + "]");
                            aVar.onAdLoadFail(adError);
                            it.remove();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.anythink.core.common.d.a
        public final void onAdLoaded() {
            synchronized (n.this.f15557d) {
                try {
                    if (n.this.f15558e != null) {
                        Iterator it = n.this.f15558e.iterator();
                        while (it.hasNext()) {
                            com.anythink.core.common.d.a aVar = (com.anythink.core.common.d.a) it.next();
                            if (aVar != null) {
                                n nVar = n.this;
                                ab.a(nVar.f15554a, String.valueOf(nVar.f15555b), j.r.f13314F, j.r.f13326m, "[listener:" + aVar.toString() + "]");
                                aVar.onAdLoaded();
                                it.remove();
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    private static void a(cb cbVar, ar arVar) {
        com.anythink.core.d.b k9;
        com.anythink.core.common.r.g h3;
        if (cbVar == null || (k9 = com.IceFishing.LiveIceFishing.k.k(com.IceFishing.LiveIceFishing.k.l())) == null || (h3 = k9.h()) == null || !w.a().a(cbVar.a())) {
            return;
        }
        w.a().a(h3, cbVar.a(), arVar);
    }

    public final void b(com.anythink.core.common.d.a aVar) {
        synchronized (this.f15557d) {
            try {
                List<com.anythink.core.common.d.a> list = this.f15558e;
                if (list == null) {
                    return;
                }
                list.remove(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a(String str, String str2) {
        this.f15554a = str;
        this.f15555b = str2;
    }

    public final void a(com.anythink.core.common.d.a aVar) {
        synchronized (this.f15557d) {
            try {
                if (this.f15558e == null) {
                    this.f15558e = new ArrayList();
                }
                if (aVar == null) {
                    return;
                }
                Iterator<com.anythink.core.common.d.a> it = this.f15558e.iterator();
                boolean z6 = false;
                while (it.hasNext()) {
                    if (it.next() == aVar) {
                        z6 = true;
                    }
                }
                if (!z6) {
                    this.f15558e.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(int i, ar arVar, cb cbVar, int i4) {
        boolean o4;
        com.anythink.core.d.l lVar;
        com.anythink.core.common.p.d dVar;
        com.anythink.core.d.l a9;
        com.anythink.core.d.l a10;
        String str = arVar.f14331a;
        if (cbVar != null) {
            cbVar.toString();
        }
        f a11 = u.a().a(this.f15554a, String.valueOf(this.f15555b));
        if (cbVar != null && i4 != 10 && (a10 = cbVar.a()) != null) {
            if (a10.p() != 1) {
                cbVar.toString();
                if (a11 != null) {
                    a11.a(new bx(System.currentTimeMillis(), cbVar.m()), a10);
                }
            } else if (i == 1) {
                cbVar.toString();
                if (a11 != null) {
                    a11.a(new bx(System.currentTimeMillis(), cbVar.m()), a10);
                }
            }
        }
        if (a11 != null) {
            a11.e();
        }
        boolean z6 = (i4 == 13 || (a9 = com.anythink.core.d.n.a(com.anythink.core.common.d.t.b().g()).a(this.f15554a)) == null || a11 == null || ATAdxSetting.getInstance().isAdxNetworkMode(this.f15554a) || a9.p() != 1 || a11.c() >= a9.q()) ? false : true;
        this.f15559f.onAdLoaded();
        if (arVar.f14333c != 9 && i != 3 && z6 && a11 != null) {
            cbVar.toString();
            ar c9 = arVar.c();
            c9.f14333c = 9;
            c9.f14335e = null;
            c9.f14334d = null;
            a11.a(com.anythink.core.common.d.t.b().g(), this.f15555b, this.f15554a, c9, (com.anythink.core.common.d.a) null);
        }
        if (i == 1 && arVar.e() && a11 != null && (dVar = a11.f13889j) != null) {
            dVar.c();
        }
        if (!arVar.d()) {
            if (cbVar == null) {
                o4 = i == 3;
            } else {
                o4 = cbVar.o();
            }
            if (o4) {
                com.anythink.core.d.n a12 = com.anythink.core.d.n.a(com.anythink.core.common.d.t.b().g());
                lVar = a12.d(this.f15554a);
                if (lVar == null) {
                    lVar = a12.e(this.f15554a);
                }
                (lVar == null ? "本地缓存策略为空" : Integer.valueOf(lVar.aZ())).toString();
                if (lVar != null) {
                    lVar.be();
                }
                o4 = lVar != null && lVar.be();
            } else {
                lVar = null;
            }
            if (o4) {
                int i6 = lVar.aT() ? 13 : 14;
                f a13 = f.a(arVar.a(), this.f15554a, this.f15555b);
                ar c10 = arVar.c();
                c10.f14333c = i6;
                c10.f14335e = null;
                c10.f14334d = null;
                a13.a(arVar.a(), this.f15555b, this.f15554a, c10, (com.anythink.core.common.d.a) null);
            }
        }
        a(cbVar, arVar);
    }

    public final void a(int i, final ar arVar, cb cbVar, AdError adError) {
        boolean z6;
        final f a9 = u.a().a(this.f15554a, String.valueOf(this.f15555b));
        String str = arVar.f14331a;
        if (cbVar != null) {
            cbVar.toString();
        }
        try {
            z6 = arVar.b().getPreLoadInfo().getMgComparedResult().isMgWin();
        } catch (Throwable unused) {
            z6 = false;
        }
        if (cbVar != null && i == 2 && cbVar.b() && !z6) {
            if (a9 != null && !u.a().e(this.f15554a)) {
                cbVar.toString();
                com.anythink.core.common.d.t.b();
                com.anythink.core.common.d.t.b(new Runnable() { // from class: com.anythink.core.common.n.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        ar c9 = arVar.c();
                        c9.f14333c = 8;
                        c9.f14335e = null;
                        c9.f14334d = null;
                        f fVar = a9;
                        Context g9 = com.anythink.core.common.d.t.b().g();
                        n nVar = n.this;
                        fVar.a(g9, nVar.f15555b, nVar.f15554a, c9, (com.anythink.core.common.d.a) null);
                    }
                }, cbVar.c());
            }
        } else {
            if (cbVar != null) {
                cbVar.toString();
            }
            if (i != 3 && a9 != null) {
                a9.f();
            }
            this.f15559f.onAdLoadFail(adError);
        }
        if (a9 != null && arVar.e()) {
            a9.a(adError);
        }
        if (i != 2 && ATSDK.isNetworkLogDebug()) {
            Log.e("anythink", "ad load failed: " + this.f15554a + ", " + adError.printStackTrace());
        }
        a(cbVar, arVar);
    }

    private boolean a(f fVar, int i) {
        com.anythink.core.d.l a9;
        return (i == 13 || (a9 = com.anythink.core.d.n.a(com.anythink.core.common.d.t.b().g()).a(this.f15554a)) == null || fVar == null || ATAdxSetting.getInstance().isAdxNetworkMode(this.f15554a) || a9.p() != 1 || fVar.c() >= a9.q()) ? false : true;
    }

    private void a(int i, ar arVar, cb cbVar) {
        boolean o4;
        com.anythink.core.d.l lVar;
        if (arVar == null || arVar.d()) {
            return;
        }
        boolean z6 = false;
        if (cbVar == null) {
            o4 = i == 3;
        } else {
            o4 = cbVar.o();
        }
        if (o4) {
            com.anythink.core.d.n a9 = com.anythink.core.d.n.a(com.anythink.core.common.d.t.b().g());
            lVar = a9.d(this.f15554a);
            if (lVar == null) {
                lVar = a9.e(this.f15554a);
            }
            (lVar == null ? "本地缓存策略为空" : Integer.valueOf(lVar.aZ())).toString();
            if (lVar != null) {
                lVar.be();
            }
            if (lVar != null && lVar.be()) {
                z6 = true;
            }
            o4 = z6;
        } else {
            lVar = null;
        }
        if (o4) {
            int i4 = lVar.aT() ? 13 : 14;
            f a10 = f.a(arVar.a(), this.f15554a, this.f15555b);
            ar c9 = arVar.c();
            c9.f14333c = i4;
            c9.f14335e = null;
            c9.f14334d = null;
            a10.a(arVar.a(), this.f15555b, this.f15554a, c9, (com.anythink.core.common.d.a) null);
        }
    }
}
