package defpackage;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public final class tl7 implements gra {
    public final UUID b;
    public final mqb c;
    public final qmh d;
    public final HashMap e;
    public final boolean f;
    public final int[] g;
    public final boolean h;
    public final pt0 i;
    public final xeg j;
    public final ozw k;
    public final long l;
    public final ArrayList m;
    public final Set n;
    public final Set o;
    public int p;
    public oqb q;
    public ql7 r;
    public ql7 s;
    public Looper t;
    public Handler u;
    public int v;
    public byte[] w;
    public ndl x;
    public volatile tt1 y;

    public tl7(UUID uuid, mqb mqbVar, qmh qmhVar, HashMap hashMap, boolean z, int[] iArr, boolean z2, xeg xegVar, long j) {
        uuid.getClass();
        vq1.u("Use C.CLEARKEY_UUID instead", !un3.b.equals(uuid));
        this.b = uuid;
        this.c = mqbVar;
        this.d = qmhVar;
        this.e = hashMap;
        this.f = z;
        this.g = iArr;
        this.h = z2;
        this.j = xegVar;
        this.i = new pt0(19);
        this.k = new ozw(24, this);
        this.v = 0;
        this.m = new ArrayList();
        this.n = Collections.newSetFromMap(new IdentityHashMap());
        this.o = Collections.newSetFromMap(new IdentityHashMap());
        this.l = j;
    }

    public static boolean e(ql7 ql7Var) {
        ql7Var.h();
        if (ql7Var.p != 1) {
            return false;
        }
        yqa s = ql7Var.s();
        s.getClass();
        Throwable cause = s.getCause();
        return (cause instanceof ResourceBusyException) || xp3.X(cause);
    }

    public static ArrayList h(pqa pqaVar, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(pqaVar.d);
        for (int i = 0; i < pqaVar.d; i++) {
            oqa oqaVar = pqaVar.a[i];
            if ((oqaVar.a(uuid) || (un3.c.equals(uuid) && oqaVar.a(un3.b))) && (oqaVar.e != null || z)) {
                arrayList.add(oqaVar);
            }
        }
        return arrayList;
    }

    @Override // defpackage.gra
    public final void a() {
        j(true);
        int i = this.p - 1;
        this.p = i;
        if (i != 0) {
            return;
        }
        if (this.l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.m);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((ql7) arrayList.get(i2)).x(null);
            }
        }
        xkt it = hee.v(this.n).iterator();
        while (it.hasNext()) {
            ((sl7) it.next()).a();
        }
        i();
    }

    public final zqa d(Looper looper, cra craVar, dsc dscVar, boolean z) {
        ArrayList arrayList;
        if (this.y == null) {
            this.y = new tt1(this, looper, 3);
        }
        pqa pqaVar = dscVar.r;
        int i = 0;
        ql7 ql7Var = null;
        if (pqaVar == null) {
            int i2 = l5i.i(dscVar.n);
            oqb oqbVar = this.q;
            oqbVar.getClass();
            if (oqbVar.h() != 2 || !vvc.c) {
                int[] iArr = this.g;
                while (true) {
                    if (i >= iArr.length) {
                        i = -1;
                        break;
                    }
                    if (iArr[i] == i2) {
                        break;
                    }
                    i++;
                }
                if (i != -1 && oqbVar.h() != 1) {
                    ql7 ql7Var2 = this.r;
                    if (ql7Var2 == null) {
                        ude udeVar = yde.b;
                        ql7 g = g(qsn.e, true, null, z);
                        this.m.add(g);
                        this.r = g;
                    } else {
                        ql7Var2.y(null);
                    }
                    return this.r;
                }
            }
            return null;
        }
        if (this.w == null) {
            arrayList = h(pqaVar, this.b, false);
            if (arrayList.isEmpty()) {
                rl7 rl7Var = new rl7("Media does not support uuid: " + this.b);
                vq1.L("DefaultDrmSessionMgr", "DRM error", rl7Var);
                if (craVar != null) {
                    craVar.e(rl7Var);
                }
                return new tgb(new yqa(6003, rl7Var));
            }
        } else {
            arrayList = null;
        }
        if (this.f) {
            Iterator it = this.m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ql7 ql7Var3 = (ql7) it.next();
                if (Objects.equals(ql7Var3.a, arrayList)) {
                    ql7Var = ql7Var3;
                    break;
                }
            }
        } else {
            ql7Var = this.s;
        }
        if (ql7Var != null) {
            ql7Var.y(craVar);
            return ql7Var;
        }
        ql7 g2 = g(arrayList, false, craVar, z);
        if (!this.f) {
            this.s = g2;
        }
        this.m.add(g2);
        return g2;
    }

    public final ql7 f(List list, boolean z, cra craVar) {
        this.q.getClass();
        boolean z2 = this.h | z;
        oqb oqbVar = this.q;
        int i = this.v;
        byte[] bArr = this.w;
        Looper looper = this.t;
        looper.getClass();
        ndl ndlVar = this.x;
        ndlVar.getClass();
        ql7 ql7Var = new ql7(this.b, oqbVar, this.i, this.k, list, i, z2, z, bArr, this.e, this.d, looper, this.j, ndlVar);
        ql7Var.y(craVar);
        if (this.l != -9223372036854775807L) {
            ql7Var.y(null);
        }
        return ql7Var;
    }

    public final ql7 g(List list, boolean z, cra craVar, boolean z2) {
        ql7 f = f(list, z, craVar);
        boolean e = e(f);
        long j = this.l;
        Set set = this.o;
        if (e && !set.isEmpty()) {
            xkt it = hee.v(set).iterator();
            while (it.hasNext()) {
                ((zqa) it.next()).x(null);
            }
            f.x(craVar);
            if (j != -9223372036854775807L) {
                f.x(null);
            }
            f = f(list, z, craVar);
        }
        if (e(f) && z2) {
            Set set2 = this.n;
            if (!set2.isEmpty()) {
                xkt it2 = hee.v(set2).iterator();
                while (it2.hasNext()) {
                    ((sl7) it2.next()).a();
                }
                if (!set.isEmpty()) {
                    xkt it3 = hee.v(set).iterator();
                    while (it3.hasNext()) {
                        ((zqa) it3.next()).x(null);
                    }
                }
                f.x(craVar);
                if (j != -9223372036854775807L) {
                    f.x(null);
                }
                return f(list, z, craVar);
            }
        }
        return f;
    }

    public final void i() {
        if (this.q != null && this.p == 0 && this.m.isEmpty() && this.n.isEmpty()) {
            oqb oqbVar = this.q;
            oqbVar.getClass();
            oqbVar.a();
            this.q = null;
        }
    }

    public final void j(boolean z) {
        if (z && this.t == null) {
            vq1.o0("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread currentThread = Thread.currentThread();
        Looper looper = this.t;
        looper.getClass();
        if (currentThread != looper.getThread()) {
            vq1.o0("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.t.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // defpackage.gra
    public final void q() {
        j(true);
        int i = this.p;
        this.p = i + 1;
        if (i != 0) {
            return;
        }
        if (this.q == null) {
            oqb a = this.c.a(this.b);
            this.q = a;
            a.g(new znk(23, this));
        } else {
            if (this.l == -9223372036854775807L) {
                return;
            }
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.m;
                if (i2 >= arrayList.size()) {
                    return;
                }
                ((ql7) arrayList.get(i2)).y(null);
                i2++;
            }
        }
    }

    @Override // defpackage.gra
    public final zqa r(cra craVar, dsc dscVar) {
        j(false);
        vq1.A(this.p > 0);
        vq1.B(this.t);
        return d(this.t, craVar, dscVar, true);
    }

    @Override // defpackage.gra
    public final void s(Looper looper, ndl ndlVar) {
        synchronized (this) {
            try {
                Looper looper2 = this.t;
                if (looper2 == null) {
                    this.t = looper;
                    this.u = new Handler(looper);
                } else {
                    vq1.A(looper2 == looper);
                    this.u.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.x = ndlVar;
    }

    @Override // defpackage.gra
    public final int t(dsc dscVar) {
        j(false);
        oqb oqbVar = this.q;
        oqbVar.getClass();
        int h = oqbVar.h();
        pqa pqaVar = dscVar.r;
        if (pqaVar == null) {
            int i = l5i.i(dscVar.n);
            int i2 = 0;
            while (true) {
                int[] iArr = this.g;
                if (i2 >= iArr.length) {
                    i2 = -1;
                    break;
                }
                if (iArr[i2] == i) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                return 0;
            }
        } else if (this.w == null) {
            UUID uuid = this.b;
            if (h(pqaVar, uuid, true).isEmpty()) {
                if (pqaVar.d == 1 && pqaVar.a[0].a(un3.b)) {
                    vq1.n0("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = pqaVar.c;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : dvt.a < 25)) {
                return 1;
            }
        }
        return h;
    }

    @Override // defpackage.gra
    public final fra u(cra craVar, dsc dscVar) {
        vq1.A(this.p > 0);
        vq1.B(this.t);
        sl7 sl7Var = new sl7(this, craVar);
        Handler handler = this.u;
        handler.getClass();
        handler.post(new jt6(17, sl7Var, dscVar));
        return sl7Var;
    }
}
