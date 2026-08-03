package id;

import bc.a0;
import h2.m;
import java.util.Iterator;
import nd.k;
import nd.l;
import nd.n;
import nd.o;
import pc.j;
import yc.i0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final k f3283a;

    public i(k kVar) {
        j.e(kVar, "queries");
        this.f3283a = kVar;
    }

    public final Integer a() {
        c5.c c3 = a0.c(1617088990, new String[]{"high_scores"}, (g5.j) this.f3283a.f1234a, "getBestScore", "SELECT COALESCE(MAX(score), 0) AS score FROM high_scores", new nd.d(new nd.d(0)));
        Object obj = c3.a(new c5.a(c3, 0)).f2315b;
        if (obj != null) {
            Long l10 = ((l) obj).f5099a;
            j.b(l10);
            return new Integer((int) l10.longValue());
        }
        throw new NullPointerException("ResultSet returned null for " + c3);
    }

    public final qd.k b(qd.l lVar) {
        String str = lVar.f5876g;
        k kVar = this.f3283a;
        kVar.getClass();
        nd.j jVar = new nd.j(kVar, str, new k2.e(5, new nd.c(1)));
        o oVar = (o) jVar.a(new c5.a(jVar, 0)).f2315b;
        if (oVar != null) {
            return a0.K(oVar);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(hc.c cVar) {
        a aVar;
        int i10;
        i iVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i11 = aVar.f3256j;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f3256j = i11 - Integer.MIN_VALUE;
                Object obj = aVar.f3254h;
                i10 = aVar.f3256j;
                if (i10 != 0) {
                    v6.a.W(obj);
                    aVar.f3253g = this;
                    aVar.f3256j = 1;
                    c5.c d10 = this.f3283a.d();
                    n nVar = (n) d10.a(new c5.a(d10, 0)).f2315b;
                    obj = nVar != null ? new qd.j((int) nVar.f5105b, (int) nVar.f5106c) : new qd.j(0, 0);
                    gc.a aVar2 = gc.a.f2559g;
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    iVar = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iVar = aVar.f3253g;
                    v6.a.W(obj);
                }
                k kVar = iVar.f3283a;
                ((g5.j) kVar.f1234a).a(1460422868, "UPDATE player_data SET total_jokers_collected = ? WHERE id = 1", new nd.a(1, ((qd.j) obj).f5864b + 1));
                kVar.b(new nd.d(6));
                return ac.o.f277a;
            }
        }
        aVar = new a(this, cVar);
        Object obj2 = aVar.f3254h;
        i10 = aVar.f3256j;
        if (i10 != 0) {
        }
        k kVar2 = iVar.f3283a;
        ((g5.j) kVar2.f1234a).a(1460422868, "UPDATE player_data SET total_jokers_collected = ? WHERE id = 1", new nd.a(1, ((qd.j) obj2).f5864b + 1));
        kVar2.b(new nd.d(6));
        return ac.o.f277a;
    }

    public final void d() {
        String str;
        String str2;
        int i10;
        k kVar = this.f3283a;
        g5.j jVar = (g5.j) kVar.f1234a;
        g5.j jVar2 = (g5.j) kVar.f1234a;
        jVar.a(-625259167, "INSERT OR IGNORE INTO player_data(id, chips, total_jokers_collected) VALUES (1, 0, 0)", null);
        kVar.b(new m(29));
        Iterator it = qd.l.f5875m.iterator();
        while (it.hasNext()) {
            qd.l lVar = (qd.l) it.next();
            final String str3 = lVar.f5876g;
            int ordinal = lVar.ordinal();
            if (ordinal == 0) {
                str = "Time Slow";
            } else if (ordinal == 1) {
                str = "Error Shield";
            } else {
                if (ordinal != 2) {
                    throw new ac.d();
                }
                str = "Joker Magnet";
            }
            int ordinal2 = lVar.ordinal();
            if (ordinal2 == 0) {
                str2 = "Slows down card appearance for 5 seconds";
            } else if (ordinal2 == 1) {
                str2 = "Protects from one error";
            } else {
                if (ordinal2 != 2) {
                    throw new ac.d();
                }
                str2 = "Increases Joker spawn rate to 10% for 10 seconds";
            }
            int ordinal3 = lVar.ordinal();
            if (ordinal3 == 0) {
                i10 = 5;
            } else if (ordinal3 == 1) {
                i10 = 3;
            } else {
                if (ordinal3 != 2) {
                    throw new ac.d();
                }
                i10 = 10;
            }
            final long j3 = i10;
            final String str4 = str2;
            final String str5 = str;
            jVar2.a(1329168577, "INSERT OR IGNORE INTO power_ups(id, name, description, price, quantity) VALUES (?, ?, ?, ?, ?)", new oc.c() { // from class: nd.e
                @Override // oc.c
                public final Object invoke(Object obj) {
                    g5.k kVar2 = (g5.k) obj;
                    pc.j.e(kVar2, "$this$execute");
                    kVar2.c(str3, 0);
                    kVar2.c(str5, 1);
                    kVar2.c(str4, 2);
                    kVar2.e(3, Long.valueOf(j3));
                    kVar2.e(4, 0L);
                    return ac.o.f277a;
                }
            });
            kVar.b(new nd.d(1));
        }
        qd.e eVar = qd.e.BACK;
        qd.d dVar = new qd.d("default_back", "Default Back", eVar, 0, true, true);
        qd.e eVar2 = qd.e.SYMBOL;
        for (qd.d dVar2 : bc.n.L(dVar, new qd.d("default_symbol", "Default Symbol", eVar2, 0, true, true), new qd.d("neon_back", "Neon Back", eVar, 1, false, false), new qd.d("neon_symbol", "Neon Symbol", eVar2, 1, false, false))) {
            final String str6 = dVar2.f5832a;
            final String str7 = dVar2.f5833b;
            final String str8 = dVar2.f5834c.f5841g;
            final long j6 = dVar2.f5835d;
            final long j10 = 1;
            final long j11 = dVar2.f5836e ? 1L : 0L;
            if (!dVar2.f5837f) {
                j10 = 0;
            }
            jVar2.a(1682700940, "INSERT OR IGNORE INTO card_skins(id, name, skin_type, price, is_purchased, is_active) VALUES (?, ?, ?, ?, ?, ?)", new oc.c() { // from class: nd.b
                @Override // oc.c
                public final Object invoke(Object obj) {
                    g5.k kVar2 = (g5.k) obj;
                    pc.j.e(kVar2, "$this$execute");
                    kVar2.c(str6, 0);
                    kVar2.c(str7, 1);
                    kVar2.c(str8, 2);
                    kVar2.e(3, Long.valueOf(j6));
                    kVar2.e(4, Long.valueOf(j11));
                    kVar2.e(5, Long.valueOf(j10));
                    return ac.o.f277a;
                }
            });
            kVar.b(new m(28));
        }
    }

    public final f8.c e() {
        f8.c Y = x4.f.Y(this.f3283a.d());
        fd.d dVar = i0.f8861c;
        j.e(dVar, "context");
        return new f8.c(17, new x4.e(Y, dVar));
    }

    public final f8.c f() {
        f8.c Y = x4.f.Y(a0.c(759967108, new String[]{"power_ups"}, (g5.j) this.f3283a.f1234a, "getAllPowerUps", "SELECT * FROM power_ups", new k2.e(7, new nd.c(0))));
        fd.d dVar = i0.f8861c;
        j.e(dVar, "context");
        return new f8.c(18, new x4.c(Y, dVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(qd.l lVar, hc.c cVar) {
        f fVar;
        int i10;
        i iVar;
        qd.k kVar;
        i iVar2;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i11 = fVar.f3272k;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f3272k = i11 - Integer.MIN_VALUE;
                Object obj = fVar.f3270i;
                i10 = fVar.f3272k;
                gc.a aVar = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    fVar.f3268g = this;
                    fVar.f3269h = lVar;
                    fVar.f3272k = 1;
                    obj = b(lVar);
                    if (obj != aVar) {
                        iVar = this;
                    }
                    return aVar;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lVar = fVar.f3269h;
                    iVar2 = fVar.f3268g;
                    v6.a.W(obj);
                    if (((Boolean) obj).booleanValue()) {
                        return Boolean.FALSE;
                    }
                    k kVar2 = iVar2.f3283a;
                    String str = lVar.f5876g;
                    kVar2.getClass();
                    ((g5.j) kVar2.f1234a).a(427667522, "UPDATE power_ups SET quantity = quantity + 1 WHERE id = ?", new nd.h(str, 0));
                    kVar2.b(new nd.d(3));
                    return Boolean.TRUE;
                }
                lVar = fVar.f3269h;
                iVar = fVar.f3268g;
                v6.a.W(obj);
                kVar = (qd.k) obj;
                if (kVar != null) {
                    return Boolean.FALSE;
                }
                int i12 = kVar.f5868d;
                fVar.f3268g = iVar;
                fVar.f3269h = lVar;
                fVar.f3272k = 2;
                obj = iVar.h(i12, fVar);
                if (obj != aVar) {
                    iVar2 = iVar;
                    if (((Boolean) obj).booleanValue()) {
                    }
                }
                return aVar;
            }
        }
        fVar = new f(this, cVar);
        Object obj2 = fVar.f3270i;
        i10 = fVar.f3272k;
        gc.a aVar2 = gc.a.f2559g;
        if (i10 != 0) {
        }
        kVar = (qd.k) obj2;
        if (kVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(int i10, hc.c cVar) {
        g gVar;
        Object obj;
        int i11;
        i iVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i12 = gVar.f3277k;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                gVar.f3277k = i12 - Integer.MIN_VALUE;
                obj = gVar.f3275i;
                i11 = gVar.f3277k;
                if (i11 != 0) {
                    v6.a.W(obj);
                    gVar.f3273g = this;
                    gVar.f3274h = i10;
                    gVar.f3277k = 1;
                    c5.c d10 = this.f3283a.d();
                    n nVar = (n) d10.a(new c5.a(d10, 0)).f2315b;
                    obj = nVar != null ? new qd.j((int) nVar.f5105b, (int) nVar.f5106c) : new qd.j(0, 0);
                    gc.a aVar = gc.a.f2559g;
                    if (obj == aVar) {
                        return aVar;
                    }
                    iVar = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i10 = gVar.f3274h;
                    iVar = gVar.f3273g;
                    v6.a.W(obj);
                }
                if (((qd.j) obj).f5863a >= i10) {
                    return Boolean.FALSE;
                }
                k kVar = iVar.f3283a;
                ((g5.j) kVar.f1234a).a(1212710936, "UPDATE player_data SET chips = ? WHERE id = 1", new nd.a(0, r7 - i10));
                kVar.b(new nd.d(2));
                return Boolean.TRUE;
            }
        }
        gVar = new g(this, cVar);
        obj = gVar.f3275i;
        i11 = gVar.f3277k;
        if (i11 != 0) {
        }
        if (((qd.j) obj).f5863a >= i10) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(qd.l lVar, hc.c cVar) {
        h hVar;
        int i10;
        i iVar;
        qd.k kVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i11 = hVar.f3282k;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.f3282k = i11 - Integer.MIN_VALUE;
                Object obj = hVar.f3280i;
                i10 = hVar.f3282k;
                if (i10 != 0) {
                    v6.a.W(obj);
                    hVar.f3278g = this;
                    hVar.f3279h = lVar;
                    hVar.f3282k = 1;
                    obj = b(lVar);
                    Object obj2 = gc.a.f2559g;
                    if (obj == obj2) {
                        return obj2;
                    }
                    iVar = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lVar = hVar.f3279h;
                    iVar = hVar.f3278g;
                    v6.a.W(obj);
                }
                kVar = (qd.k) obj;
                if (kVar != null) {
                    return Boolean.FALSE;
                }
                if (kVar.f5869e <= 0) {
                    return Boolean.FALSE;
                }
                k kVar2 = iVar.f3283a;
                String str = lVar.f5876g;
                kVar2.getClass();
                ((g5.j) kVar2.f1234a).a(-1850244450, "UPDATE power_ups SET quantity = quantity - 1 WHERE id = ? AND quantity > 0", new nd.h(str, 2));
                kVar2.b(new nd.d(7));
                return Boolean.TRUE;
            }
        }
        hVar = new h(this, cVar);
        Object obj3 = hVar.f3280i;
        i10 = hVar.f3282k;
        if (i10 != 0) {
        }
        kVar = (qd.k) obj3;
        if (kVar != null) {
        }
    }
}
