package defpackage;

import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.common_models.net.map_object.Trigger;
import ru.yandex.taxi.preorder.source.pickup.PickupPoint$PointType;

/* loaded from: classes9.dex */
public final class wpb0 {
    public final String a;
    public final zzs b;
    public final PickupPoint$PointType c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    public final rl6 h;
    public final String i;
    public final dgv j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final int n;
    public final int o;
    public final String p;
    public boolean q;

    public wpb0(wpb0 wpb0Var, String str) {
        this(wpb0Var.a, wpb0Var.b, wpb0Var.c, wpb0Var.d, wpb0Var.e, str, wpb0Var.g, wpb0Var.h, wpb0Var.i, wpb0Var.j, wpb0Var.k, wpb0Var.l, false, wpb0Var.n, wpb0Var.o, wpb0Var.p);
        this.q = wpb0Var.q;
    }

    public final String a() {
        String str = this.d;
        return (str == null || evu0.J(str)) ? this.f : str;
    }

    public final uud0 b(Trigger trigger) {
        Object obj = null;
        List list = this.g;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((uud0) next).g(trigger)) {
                obj = next;
                break;
            }
        }
        return (uud0) obj;
    }

    public final uud0 c() {
        Object obj = null;
        List list = this.g;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((uud0) next).g(Trigger.SELECT)) {
                obj = next;
                break;
            }
        }
        return (uud0) obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !wpb0.class.equals(obj.getClass())) {
            return false;
        }
        wpb0 wpb0Var = (wpb0) obj;
        if (this.l != wpb0Var.l || xtb1.e(this.a, wpb0Var.a) || xtb1.e(a(), wpb0Var.a())) {
            return false;
        }
        return xtb1.b(this.e, wpb0Var.e);
    }

    public final int hashCode() {
        return xtb1.d(this.e) + ((xtb1.d(a()) + (((this.a.hashCode() * 31) + (this.l ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PickupPoint{id='");
        sb.append(this.a);
        sb.append("', geoPoint=");
        sb.append(this.b);
        sb.append(", last=");
        unr0.A(", name='", this.d, "', imageTag='", sb, this.l);
        tse0.x(this.e, "', options=", ", label='", sb, this.g);
        return oyr.t(sb, this.f, "'}");
    }

    public wpb0(String str, zzs zzsVar, PickupPoint$PointType pickupPoint$PointType, String str2, String str3, String str4, List list, rl6 rl6Var, String str5, dgv dgvVar, boolean z, boolean z2, boolean z3, int i, int i2, String str6) {
        this.a = str;
        this.b = zzsVar;
        this.c = pickupPoint$PointType;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = list;
        this.h = rl6Var;
        this.i = str5;
        this.j = dgvVar;
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.n = i;
        this.o = i2;
        this.p = str6;
        this.q = true;
    }
}
