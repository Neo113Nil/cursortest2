package androidx.datastore.preferences.protobuf;

import defpackage.l1j;
import defpackage.lrv;
import defpackage.wvs;
import defpackage.wzh;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class p<T> {
    public final t0 a;
    public boolean b;

    static {
        new p(0);
    }

    public p(int i) {
        int i2 = u0.g;
        this.a = new t0(0);
        b();
        b();
    }

    public static int a(lrv lrvVar, int i, Object obj) {
        int size;
        int j;
        int i2 = j.i(i);
        if (lrvVar == lrv.d) {
            i2 *= 2;
        }
        int i3 = 1;
        switch (lrvVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = j.b;
                i3 = 8;
                break;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = j.b;
                i3 = 4;
                break;
            case 2:
                i3 = j.k(((Long) obj).longValue());
                break;
            case 3:
                i3 = j.k(((Long) obj).longValue());
                break;
            case 4:
                i3 = j.g(((Integer) obj).intValue());
                break;
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = j.b;
                i3 = 8;
                break;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = j.b;
                i3 = 4;
                break;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = j.b;
                break;
            case 8:
                if (!(obj instanceof g)) {
                    i3 = j.h((String) obj);
                    break;
                } else {
                    Logger logger6 = j.b;
                    size = ((g) obj).size();
                    j = j.j(size);
                    i3 = j + size;
                    break;
                }
            case 9:
                Logger logger7 = j.b;
                i3 = ((s) ((wzh) obj)).g();
                break;
            case 10:
                Logger logger8 = j.b;
                size = ((s) ((wzh) obj)).g();
                j = j.j(size);
                i3 = j + size;
                break;
            case 11:
                if (obj instanceof g) {
                    Logger logger9 = j.b;
                    size = ((g) obj).size();
                    j = j.j(size);
                } else {
                    Logger logger10 = j.b;
                    size = ((byte[]) obj).length;
                    j = j.j(size);
                }
                i3 = j + size;
                break;
            case 12:
                i3 = j.j(((Integer) obj).intValue());
                break;
            case 13:
                i3 = j.g(((Integer) obj).intValue());
                break;
            case 14:
                ((Integer) obj).getClass();
                Logger logger11 = j.b;
                i3 = 4;
                break;
            case 15:
                ((Long) obj).getClass();
                Logger logger12 = j.b;
                i3 = 8;
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                i3 = j.j((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                i3 = j.k((longValue >> 63) ^ (longValue << 1));
                break;
            default:
                wvs.p("There is no way to get here, but the compiler thinks otherwise.");
                i3 = 0;
                break;
        }
        return i2 + i3;
    }

    public static void c(j jVar, lrv lrvVar, int i, Object obj) {
        if (lrvVar == lrv.d) {
            jVar.A(i, 3);
            ((s) ((wzh) obj)).m(jVar);
            jVar.A(i, 4);
        }
        jVar.A(i, lrvVar.b);
        switch (lrvVar.ordinal()) {
            case 0:
                jVar.t(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                jVar.r(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                jVar.E(((Long) obj).longValue());
                break;
            case 3:
                jVar.E(((Long) obj).longValue());
                break;
            case 4:
                jVar.v(((Integer) obj).intValue());
                break;
            case 5:
                jVar.t(((Long) obj).longValue());
                break;
            case 6:
                jVar.r(((Integer) obj).intValue());
                break;
            case 7:
                jVar.l(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof g)) {
                    jVar.z((String) obj);
                    break;
                } else {
                    jVar.p((g) obj);
                    break;
                }
            case 9:
                ((s) ((wzh) obj)).m(jVar);
                break;
            case 10:
                jVar.x((wzh) obj);
                break;
            case 11:
                if (!(obj instanceof g)) {
                    byte[] bArr = (byte[]) obj;
                    jVar.n(bArr.length, bArr);
                    break;
                } else {
                    jVar.p((g) obj);
                    break;
                }
            case 12:
                jVar.C(((Integer) obj).intValue());
                break;
            case 13:
                jVar.v(((Integer) obj).intValue());
                break;
            case 14:
                jVar.r(((Integer) obj).intValue());
                break;
            case 15:
                jVar.t(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                jVar.C((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                jVar.E((longValue >> 63) ^ (longValue << 1));
                break;
        }
    }

    public final void b() {
        if (this.b) {
            return;
        }
        t0 t0Var = this.a;
        if (!t0Var.d) {
            if (t0Var.b.size() > 0) {
                t0Var.c(0).getKey().getClass();
                l1j.f();
                return;
            } else {
                Iterator<T> it = t0Var.d().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    l1j.f();
                    return;
                }
            }
        }
        if (!t0Var.d) {
            t0Var.c = t0Var.c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(t0Var.c);
            t0Var.f = t0Var.f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(t0Var.f);
            t0Var.d = true;
        }
        this.b = true;
    }

    public final Object clone() {
        p pVar = new p();
        t0 t0Var = this.a;
        if (t0Var.b.size() > 0) {
            Map.Entry c = t0Var.c(0);
            if (c.getKey() != null) {
                l1j.f();
                return null;
            }
            c.getValue();
            throw null;
        }
        Iterator<T> it = t0Var.d().iterator();
        if (!it.hasNext()) {
            return pVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            l1j.f();
            return null;
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return this.a.equals(((p) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public p() {
        this.a = new t0(16);
    }
}
