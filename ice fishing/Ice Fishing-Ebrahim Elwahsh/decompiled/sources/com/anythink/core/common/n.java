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
    String f14925a;

    /* renamed from: b, reason: collision with root package name */
    String f14926b;

    /* renamed from: e, reason: collision with root package name */
    private List<com.anythink.core.common.d.a> f14929e;

    /* renamed from: c, reason: collision with root package name */
    private final String f14927c = "n";

    /* renamed from: d, reason: collision with root package name */
    private final Object f14928d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private com.anythink.core.common.d.a f14930f = new com.anythink.core.common.d.a() { // from class: com.anythink.core.common.n.1
        @Override // com.anythink.core.common.d.a
        public final void onAdLoadFail(AdError adError) {
            synchronized (n.this.f14928d) {
                try {
                    Iterator it = n.this.f14929e.iterator();
                    while (it.hasNext()) {
                        com.anythink.core.common.d.a aVar = (com.anythink.core.common.d.a) it.next();
                        if (aVar != null) {
                            n nVar = n.this;
                            ab.a(nVar.f14925a, String.valueOf(nVar.f14926b), j.r.f12685F, j.r.f12698n, "returned no eligible ads from any mediated networks. [listener:" + aVar.toString() + "]");
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
            synchronized (n.this.f14928d) {
                try {
                    if (n.this.f14929e != null) {
                        Iterator it = n.this.f14929e.iterator();
                        while (it.hasNext()) {
                            com.anythink.core.common.d.a aVar = (com.anythink.core.common.d.a) it.next();
                            if (aVar != null) {
                                n nVar = n.this;
                                ab.a(nVar.f14925a, String.valueOf(nVar.f14926b), j.r.f12685F, j.r.f12697m, "[listener:" + aVar.toString() + "]");
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
        com.anythink.core.d.b k6;
        com.anythink.core.common.r.g h9;
        if (cbVar == null || (k6 = com.anythink.basead.b.c.i.k(com.anythink.basead.b.c.i.l())) == null || (h9 = k6.h()) == null || !w.a().a(cbVar.a())) {
            return;
        }
        w.a().a(h9, cbVar.a(), arVar);
    }

    public final void b(com.anythink.core.common.d.a aVar) {
        synchronized (this.f14928d) {
            try {
                List<com.anythink.core.common.d.a> list = this.f14929e;
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
        this.f14925a = str;
        this.f14926b = str2;
    }

    public final void a(com.anythink.core.common.d.a aVar) {
        synchronized (this.f14928d) {
            try {
                if (this.f14929e == null) {
                    this.f14929e = new ArrayList();
                }
                if (aVar == null) {
                    return;
                }
                Iterator<com.anythink.core.common.d.a> it = this.f14929e.iterator();
                boolean z8 = false;
                while (it.hasNext()) {
                    if (it.next() == aVar) {
                        z8 = true;
                    }
                }
                if (!z8) {
                    this.f14929e.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(int i, ar arVar, cb cbVar, int i4) {
        boolean o9;
        com.anythink.core.d.l lVar;
        com.anythink.core.common.p.d dVar;
        com.anythink.core.d.l a9;
        com.anythink.core.d.l a10;
        String str = arVar.f13702a;
        if (cbVar != null) {
            cbVar.toString();
        }
        f a11 = u.a().a(this.f14925a, String.valueOf(this.f14926b));
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
        boolean z8 = (i4 == 13 || (a9 = com.anythink.core.d.n.a(com.anythink.core.common.d.t.b().g()).a(this.f14925a)) == null || a11 == null || ATAdxSetting.getInstance().isAdxNetworkMode(this.f14925a) || a9.p() != 1 || a11.c() >= a9.q()) ? false : true;
        this.f14930f.onAdLoaded();
        if (arVar.f13704c != 9 && i != 3 && z8 && a11 != null) {
            cbVar.toString();
            ar c4 = arVar.c();
            c4.f13704c = 9;
            c4.f13706e = null;
            c4.f13705d = null;
            a11.a(com.anythink.core.common.d.t.b().g(), this.f14926b, this.f14925a, c4, (com.anythink.core.common.d.a) null);
        }
        if (i == 1 && arVar.e() && a11 != null && (dVar = a11.f13260j) != null) {
            dVar.c();
        }
        if (!arVar.d()) {
            if (cbVar == null) {
                o9 = i == 3;
            } else {
                o9 = cbVar.o();
            }
            if (o9) {
                com.anythink.core.d.n a12 = com.anythink.core.d.n.a(com.anythink.core.common.d.t.b().g());
                lVar = a12.d(this.f14925a);
                if (lVar == null) {
                    lVar = a12.e(this.f14925a);
                }
                (lVar == null ? "本地缓存策略为空" : Integer.valueOf(lVar.aZ())).toString();
                if (lVar != null) {
                    lVar.be();
                }
                o9 = lVar != null && lVar.be();
            } else {
                lVar = null;
            }
            if (o9) {
                int i9 = lVar.aT() ? 13 : 14;
                f a13 = f.a(arVar.a(), this.f14925a, this.f14926b);
                ar c9 = arVar.c();
                c9.f13704c = i9;
                c9.f13706e = null;
                c9.f13705d = null;
                a13.a(arVar.a(), this.f14926b, this.f14925a, c9, (com.anythink.core.common.d.a) null);
            }
        }
        a(cbVar, arVar);
    }

    public final void a(int i, final ar arVar, cb cbVar, AdError adError) {
        boolean z8;
        final f a9 = u.a().a(this.f14925a, String.valueOf(this.f14926b));
        String str = arVar.f13702a;
        if (cbVar != null) {
            cbVar.toString();
        }
        try {
            z8 = arVar.b().getPreLoadInfo().getMgComparedResult().isMgWin();
        } catch (Throwable unused) {
            z8 = false;
        }
        if (cbVar != null && i == 2 && cbVar.b() && !z8) {
            if (a9 != null && !u.a().e(this.f14925a)) {
                cbVar.toString();
                com.anythink.core.common.d.t.b();
                com.anythink.core.common.d.t.b(new Runnable() { // from class: com.anythink.core.common.n.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        ar c4 = arVar.c();
                        c4.f13704c = 8;
                        c4.f13706e = null;
                        c4.f13705d = null;
                        f fVar = a9;
                        Context g9 = com.anythink.core.common.d.t.b().g();
                        n nVar = n.this;
                        fVar.a(g9, nVar.f14926b, nVar.f14925a, c4, (com.anythink.core.common.d.a) null);
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
            this.f14930f.onAdLoadFail(adError);
        }
        if (a9 != null && arVar.e()) {
            a9.a(adError);
        }
        if (i != 2 && ATSDK.isNetworkLogDebug()) {
            Log.e("anythink", "ad load failed: " + this.f14925a + ", " + adError.printStackTrace());
        }
        a(cbVar, arVar);
    }

    private boolean a(f fVar, int i) {
        com.anythink.core.d.l a9;
        return (i == 13 || (a9 = com.anythink.core.d.n.a(com.anythink.core.common.d.t.b().g()).a(this.f14925a)) == null || fVar == null || ATAdxSetting.getInstance().isAdxNetworkMode(this.f14925a) || a9.p() != 1 || fVar.c() >= a9.q()) ? false : true;
    }

    private void a(int i, ar arVar, cb cbVar) {
        boolean o9;
        com.anythink.core.d.l lVar;
        if (arVar == null || arVar.d()) {
            return;
        }
        boolean z8 = false;
        if (cbVar == null) {
            o9 = i == 3;
        } else {
            o9 = cbVar.o();
        }
        if (o9) {
            com.anythink.core.d.n a9 = com.anythink.core.d.n.a(com.anythink.core.common.d.t.b().g());
            lVar = a9.d(this.f14925a);
            if (lVar == null) {
                lVar = a9.e(this.f14925a);
            }
            (lVar == null ? "本地缓存策略为空" : Integer.valueOf(lVar.aZ())).toString();
            if (lVar != null) {
                lVar.be();
            }
            if (lVar != null && lVar.be()) {
                z8 = true;
            }
            o9 = z8;
        } else {
            lVar = null;
        }
        if (o9) {
            int i4 = lVar.aT() ? 13 : 14;
            f a10 = f.a(arVar.a(), this.f14925a, this.f14926b);
            ar c4 = arVar.c();
            c4.f13704c = i4;
            c4.f13706e = null;
            c4.f13705d = null;
            a10.a(arVar.a(), this.f14926b, this.f14925a, c4, (com.anythink.core.common.d.a) null);
        }
    }
}
