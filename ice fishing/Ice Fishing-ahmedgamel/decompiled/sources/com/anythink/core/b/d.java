package com.anythink.core.b;

import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.h.ad;
import com.anythink.core.common.h.aw;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.n;
import com.anythink.core.common.h.z;
import com.anythink.core.common.v.ae;
import com.anythink.core.common.v.p;
import com.anythink.core.d.l;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import u.AbstractC5050e;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: f, reason: collision with root package name */
    protected com.anythink.core.common.h.a f12522f;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f12523g;
    protected long i;

    /* renamed from: a, reason: collision with root package name */
    private final String f12521a = getClass().getSimpleName().concat(":");

    /* renamed from: h, reason: collision with root package name */
    protected AtomicBoolean f12524h = new AtomicBoolean(false);

    public d(com.anythink.core.common.h.a aVar) {
        this.f12522f = aVar;
    }

    public static JSONArray b(List<JSONObject> list) {
        JSONArray jSONArray = new JSONArray();
        try {
            for (JSONObject jSONObject : list) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("network_firm_id", 67);
                if (jSONObject.has("unit_ids")) {
                    jSONObject2.put("unit_ids", jSONObject.get("unit_ids"));
                }
                jSONArray.put(jSONObject2);
            }
        } catch (Exception unused) {
        }
        return jSONArray;
    }

    public abstract void a();

    public abstract void a(com.anythink.core.b.b.b bVar);

    public abstract void a(bv bvVar, z zVar, long j6);

    public void a(boolean z6) {
        this.f12523g = z6;
    }

    public final boolean c() {
        return this.f12524h.get();
    }

    public static JSONArray a(List<bv> list) {
        JSONArray jSONArray = new JSONArray();
        try {
            for (bv bvVar : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("network_firm_id", bvVar.g());
                jSONObject.put("ad_source_id", bvVar.z());
                jSONObject.put("content", bvVar.k());
                if (!TextUtils.isEmpty(bvVar.F())) {
                    jSONObject.put("error", bvVar.F());
                }
                jSONArray.put(jSONObject);
            }
        } catch (Exception unused) {
        }
        return jSONArray;
    }

    public final void b(ad adVar, bv bvVar) {
        com.anythink.core.b.d.c.a(adVar, new aw(9, bvVar, this.f12522f.f14129s, adVar.getSortPrice()), true, 33);
    }

    public static void a(bv bvVar, String str, long j6, int i) {
        bvVar.c(j6);
        bvVar.b(0.0d);
        bvVar.e(0.0d);
        bvVar.g(i);
        bvVar.f();
        if (TextUtils.isEmpty(str)) {
            bvVar.h("bid error");
        } else {
            bvVar.h(str);
        }
    }

    public static boolean a(boolean z6, bv bvVar, z zVar) {
        double ar = bvVar.ar();
        if (z6 && ar > 0.0d) {
            zVar.getPrice();
            if (zVar.getPrice() < ar) {
                return true;
            }
        }
        return false;
    }

    public final void a(ad adVar, bv bvVar) {
        com.anythink.core.b.d.c.a(adVar, new aw(6, bvVar, this.f12522f.f14129s, bvVar.ar()), true, 23);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(bv bvVar, ad adVar) {
        bv bvVar2;
        double sortPrice;
        boolean z6;
        double d9;
        double d10;
        if (adVar == null) {
            return;
        }
        adVar.b(this.f12522f.f14115d);
        adVar.setOriginRequestId(this.f12522f.f14115d);
        ad a9 = f.a().a(this.f12522f.f14116e, bvVar);
        if (a9 != null) {
            boolean a10 = a9.a();
            if (!a10 && adVar.getSortPrice() <= a9.getSortPrice()) {
                d10 = a9.getSortPrice();
                bvVar2 = bvVar;
                z6 = false;
            } else {
                sortPrice = adVar.getSortPrice();
                if (a10) {
                    bvVar2 = bvVar;
                    com.anythink.core.b.d.c.a(a9, new aw(1, bvVar, this.f12522f.f14129s, sortPrice), true, 25);
                } else {
                    bvVar2 = bvVar;
                    z6 = true;
                    d10 = sortPrice;
                }
            }
            d9 = d10;
            if (!z6) {
                if (a9 != null) {
                    try {
                        com.anythink.core.b.d.c.a(a9, new aw(2, bvVar2, this.f12522f.f14129s, d9), true, 26);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
                bvVar2.a(adVar, 2, 0, 1);
                if (bvVar2.P() != 2) {
                    f a11 = f.a();
                    String str = this.f12522f.f14116e;
                    ConcurrentHashMap<String, ad> concurrentHashMap = a11.f12628a;
                    StringBuilder b9 = AbstractC5050e.b(str);
                    b9.append(adVar.f14214k);
                    concurrentHashMap.put(b9.toString(), adVar);
                    if (bvVar2.am()) {
                        com.anythink.core.common.a.a.a().a(str, adVar);
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                com.anythink.core.b.d.c.a(adVar, new aw(2, bvVar2, this.f12522f.f14129s, d9), false, 27);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            bvVar2.a(a9, 1, 0, 1);
            return;
        }
        bvVar2 = bvVar;
        sortPrice = adVar.getSortPrice();
        z6 = true;
        d9 = sortPrice;
        if (!z6) {
        }
    }

    public final boolean a(bv bvVar, String str, int i) {
        return a(bvVar, str, i, 0);
    }

    public final boolean a(bv bvVar, String str, int i, int i4) {
        if (ae.a(0, this.f12522f.f14129s, bvVar, (z) null) != null) {
            return false;
        }
        ad a9 = f.a().a(this.f12522f.f14116e, bvVar);
        if (a9 != null && !a9.a()) {
            bvVar.a(a9, 0, i, i4);
            bvVar.h(str);
            return true;
        }
        if (a9 != null) {
            try {
                n af = this.f12522f.f14129s.af();
                af.J(a9.c());
                af.D(a9.x());
                af.L(a9.getOriginRequestId());
                com.anythink.core.b.d.c.a(a9, new aw(1, bvVar, af), true, 25);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r0 <= 1.0d) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i, z zVar, double d9, boolean z6) {
        double d10;
        if (i != 28) {
            return;
        }
        JSONObject C8 = this.f12522f.f14124n.a().C();
        if (C8 != null) {
            d10 = C8.optDouble(String.valueOf(i));
            if (d10 > 0.0d) {
            }
        }
        d10 = 0.95d;
        double d11 = zVar.originPrice * d10;
        com.anythink.core.common.w.i iVar = this.f12522f.f14135y;
        List<bv> a9 = iVar != null ? iVar.a() : null;
        if (a9 != null) {
            Iterator<bv> it = a9.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                double a10 = p.a(it.next());
                if (a10 < zVar.originPrice) {
                    d11 = Math.max(d11, a10);
                    break;
                }
            }
        }
        double max = Math.max(d11, d9);
        double random = (Math.random() * (zVar.originPrice - max)) + max;
        zVar.setPrice(random);
        if (z6) {
            zVar.setSortPrice(random);
        }
    }

    public final double a(bv bvVar) {
        if (bvVar.ap() == null) {
            return 1.0d;
        }
        double a9 = a(this.f12522f.f14124n.a(), bvVar.ap());
        bvVar.h();
        return a9;
    }

    private double a(double d9, ATAdConst.CURRENCY currency) {
        if (currency == null) {
            return d9;
        }
        double a9 = a(this.f12522f.f14124n.a(), currency);
        String.valueOf(d9);
        String.valueOf(a9);
        double d10 = d9 * a9;
        String.valueOf(d10);
        return d10;
    }

    private static double a(l lVar, ATAdConst.CURRENCY currency) {
        if (lVar == null) {
            return 1.0d;
        }
        if (currency == ATAdConst.CURRENCY.RMB_CENT) {
            return (1.0d / lVar.L()) * 100.0d;
        }
        if (currency == ATAdConst.CURRENCY.RMB) {
            return 1.0d / lVar.L();
        }
        return 1.0d;
    }

    public final double a(double d9, bv bvVar) {
        double L2;
        if (bvVar.ap() != null) {
            l a9 = this.f12522f.f14124n.a();
            if (bvVar.ap() == ATAdConst.CURRENCY.RMB) {
                L2 = a9.L();
            } else if (bvVar.ap() == ATAdConst.CURRENCY.RMB_CENT) {
                d9 /= 100.0d;
                L2 = a9.L();
            }
            return L2 * d9;
        }
        return d9;
    }

    public final void a(long j6) {
        this.i = j6;
    }
}
