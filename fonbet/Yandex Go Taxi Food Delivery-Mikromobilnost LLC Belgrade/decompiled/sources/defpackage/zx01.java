package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import defpackage.tje;
import defpackage.tse;
import defpackage.vx01;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class zx01 {
    public final sz40 a;
    public final zx01 b;
    public final String c;
    public final oz40 d = f.j(c());
    public final oz40 e = f.j(new sx01(c(), c()));
    public final iy40 f = f.h(0);
    public final iy40 g = f.h(Long.MIN_VALUE);
    public final oz40 h;
    public final SnapshotStateList i;
    public final SnapshotStateList j;
    public final oz40 k;
    public final qxi l;

    public zx01(sz40 sz40Var, zx01 zx01Var, String str) {
        this.a = sz40Var;
        this.b = zx01Var;
        this.c = str;
        Boolean bool = Boolean.FALSE;
        this.h = f.j(bool);
        this.i = new SnapshotStateList();
        this.j = new SnapshotStateList();
        this.k = f.j(bool);
        this.l = f.d(new mx01(this, 1));
        sz40Var.getClass();
    }

    public final void a(Object obj, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1493585151);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(obj) : btsVar.e(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(this) ? 32 : 16;
        }
        int i3 = 0;
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.Y();
        } else if (g()) {
            btsVar.e0(467722849);
            btsVar.t(false);
        } else {
            btsVar.e0(466062241);
            k(obj);
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = f.d(new mx01(this, i3));
                btsVar.o0(Q);
            }
            if (((Boolean) ((m3u0) Q).getValue()).booleanValue()) {
                btsVar.e0(466470356);
                Object Q2 = btsVar.Q();
                if (Q2 == o430Var) {
                    Q2 = zpn.j(EmptyCoroutineContext.a, btsVar);
                    btsVar.o0(Q2);
                }
                final tse tseVar = (tse) Q2;
                boolean e = btsVar.e(tseVar) | (i4 == 32);
                Object Q3 = btsVar.Q();
                if (e || Q3 == o430Var) {
                    Q3 = new tls() { // from class: androidx.compose.animation.core.f
                        @Override // defpackage.tls
                        public final Object invoke(Object obj2) {
                            tje.N(tse.this, null, CoroutineStart.UNDISPATCHED, new Transition$animateTo$1$1$1(this, null), 1);
                            return new vx01();
                        }
                    };
                    btsVar.o0(Q3);
                }
                zpn.b(tseVar, this, (tls) Q3, btsVar);
                btsVar.t(false);
            } else {
                btsVar.e0(467712929);
                btsVar.t(false);
            }
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s1d(this, obj, i, 5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long b() {
        SnapshotStateList snapshotStateList = this.i;
        int size = snapshotStateList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, ((tx01) snapshotStateList.get(i)).C.getLongValue());
        }
        SnapshotStateList snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            j = Math.max(j, ((zx01) snapshotStateList2.get(i2)).b());
        }
        return j;
    }

    public final Object c() {
        return this.a.b.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d() {
        SnapshotStateList snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            ((tx01) snapshotStateList.get(i)).getClass();
        }
        SnapshotStateList snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((zx01) snapshotStateList2.get(i2)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        zx01 zx01Var = this.b;
        return zx01Var != null ? zx01Var.e() : this.f.getLongValue();
    }

    public final rx01 f() {
        return (rx01) this.e.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(long j, boolean z) {
        iy40 iy40Var = this.g;
        long longValue = iy40Var.getLongValue();
        sz40 sz40Var = this.a;
        if (longValue == Long.MIN_VALUE) {
            iy40Var.setLongValue(j);
            sz40Var.a.setValue(Boolean.TRUE);
        } else if (!((Boolean) sz40Var.a.getValue()).booleanValue()) {
            sz40Var.a.setValue(Boolean.TRUE);
        }
        this.h.setValue(Boolean.FALSE);
        SnapshotStateList snapshotStateList = this.i;
        int size = snapshotStateList.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            tx01 tx01Var = (tx01) snapshotStateList.get(i);
            oz40 oz40Var = tx01Var.x;
            oz40 oz40Var2 = tx01Var.x;
            if (!((Boolean) oz40Var.getValue()).booleanValue()) {
                long d = z ? tx01Var.a().d() : j;
                tx01Var.A.setValue(tx01Var.a().f(d));
                tx01Var.B = tx01Var.a().h(d);
                if (tx01Var.a().c(d)) {
                    oz40Var2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) oz40Var2.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        SnapshotStateList snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            zx01 zx01Var = (zx01) snapshotStateList2.get(i2);
            if (!jl40.l(zx01Var.d.getValue(), zx01Var.c())) {
                zx01Var.h(j, z);
            }
            if (!jl40.l(zx01Var.d.getValue(), zx01Var.c())) {
                z2 = false;
            }
        }
        if (z2) {
            i();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        this.g.setLongValue(Long.MIN_VALUE);
        sz40 sz40Var = this.a;
        if (sz40Var instanceof sz40) {
            sz40Var.b.setValue(this.d.getValue());
        }
        if (this.b == null) {
            this.f.setLongValue(0L);
        }
        sz40Var.a.setValue(Boolean.FALSE);
        SnapshotStateList snapshotStateList = this.j;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            ((zx01) snapshotStateList.get(i)).i();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(Object obj, Object obj2) {
        this.g.setLongValue(Long.MIN_VALUE);
        sz40 sz40Var = this.a;
        sz40Var.a.setValue(Boolean.FALSE);
        boolean g = g();
        oz40 oz40Var = this.d;
        if (!g || !jl40.l(c(), obj) || !jl40.l(oz40Var.getValue(), obj2)) {
            if (!jl40.l(c(), obj) && (sz40Var instanceof sz40)) {
                sz40Var.b.setValue(obj);
            }
            oz40Var.setValue(obj2);
            this.k.setValue(Boolean.TRUE);
            this.e.setValue(new sx01(obj, obj2));
        }
        SnapshotStateList snapshotStateList = this.j;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            zx01 zx01Var = (zx01) snapshotStateList.get(i);
            if (zx01Var.g()) {
                zx01Var.j(zx01Var.c(), zx01Var.d.getValue());
            }
        }
        SnapshotStateList snapshotStateList2 = this.i;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((tx01) snapshotStateList2.get(i2)).d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(Object obj) {
        oz40 oz40Var = this.d;
        if (jl40.l(oz40Var.getValue(), obj)) {
            return;
        }
        this.e.setValue(new sx01(oz40Var.getValue(), obj));
        if (!jl40.l(c(), oz40Var.getValue())) {
            this.a.b.setValue(oz40Var.getValue());
        }
        oz40Var.setValue(obj);
        if (this.g.getLongValue() == Long.MIN_VALUE) {
            this.h.setValue(Boolean.TRUE);
        }
        SnapshotStateList snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            ((tx01) snapshotStateList.get(i)).y.setFloatValue(-2.0f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        SnapshotStateList snapshotStateList = this.i;
        int size = snapshotStateList.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((tx01) snapshotStateList.get(i)) + Extension.FIX_SPACE;
        }
        return str;
    }
}
