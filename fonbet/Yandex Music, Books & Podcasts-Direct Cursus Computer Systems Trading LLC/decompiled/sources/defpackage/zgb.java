package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class zgb extends jhb {
    public final wms d;
    public final jhb e;
    public final jhb f;
    public final String g;
    public final ArrayList h;
    public final ArrayList i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zgb(wms wmsVar, jhb jhbVar, jhb jhbVar2, String str) {
        super(str);
        jhbVar.getClass();
        jhbVar2.getClass();
        str.getClass();
        this.d = wmsVar;
        this.e = jhbVar;
        this.f = jhbVar2;
        this.g = str;
        this.h = CollectionsKt.g0(jhbVar.c(), jhbVar2.c());
        this.i = CollectionsKt.g0(jhbVar.b(), jhbVar2.b());
    }

    @Override // defpackage.jhb
    public final Object a(h4b h4bVar) {
        jhb jhbVar = this.e;
        Object h = h4bVar.h(jhbVar);
        d(jhbVar.b);
        wms wmsVar = this.d;
        boolean z = false;
        if (wmsVar instanceof rms) {
            rms rmsVar = (rms) wmsVar;
            qs6 qs6Var = new qs6(26, h4bVar, this);
            if (!(h instanceof Boolean)) {
                ghh.I(h + ' ' + rmsVar + " ...", "'" + rmsVar + "' must be called with boolean operands.", null);
                throw null;
            }
            boolean z2 = rmsVar instanceof qms;
            if ((z2 && ((Boolean) h).booleanValue()) || ((rmsVar instanceof pms) && !((Boolean) h).booleanValue())) {
                return h;
            }
            Object invoke = qs6Var.invoke();
            if (!(invoke instanceof Boolean)) {
                ghh.H(rmsVar, h, invoke);
                throw null;
            }
            if (!z2 ? !(!((Boolean) h).booleanValue() || !((Boolean) invoke).booleanValue()) : !(!((Boolean) h).booleanValue() && !((Boolean) invoke).booleanValue())) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        jhb jhbVar2 = this.f;
        Object h2 = h4bVar.h(jhbVar2);
        d(jhbVar2.b);
        Pair pair = h.getClass().equals(h2.getClass()) ? new Pair(h, h2) : ((h instanceof Long) && (h2 instanceof Double)) ? new Pair(Double.valueOf(((Number) h).longValue()), h2) : ((h instanceof Double) && (h2 instanceof Long)) ? new Pair(h, Double.valueOf(((Number) h2).longValue())) : new Pair(h, h2);
        Object obj = pair.a;
        Class<?> cls = obj.getClass();
        Object obj2 = pair.b;
        if (!cls.equals(obj2.getClass())) {
            ghh.H(wmsVar, obj, obj2);
            throw null;
        }
        if (wmsVar instanceof kms) {
            kms kmsVar = (kms) wmsVar;
            if (kmsVar instanceof ims) {
                z = obj.equals(obj2);
            } else {
                if (!(kmsVar instanceof jms)) {
                    b6e.s();
                    return null;
                }
                if (!obj.equals(obj2)) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
        if (wmsVar instanceof vms) {
            return vnj.x((vms) wmsVar, obj, obj2);
        }
        if (wmsVar instanceof oms) {
            return vnj.w((oms) wmsVar, obj, obj2);
        }
        if (!(wmsVar instanceof hms)) {
            ghh.H(wmsVar, obj, obj2);
            throw null;
        }
        hms hmsVar = (hms) wmsVar;
        if ((obj instanceof Double) && (obj2 instanceof Double)) {
            return h4b.i(hmsVar, (Comparable) obj, (Comparable) obj2);
        }
        if ((obj instanceof Long) && (obj2 instanceof Long)) {
            return h4b.i(hmsVar, (Comparable) obj, (Comparable) obj2);
        }
        if ((obj instanceof vc7) && (obj2 instanceof vc7)) {
            return h4b.i(hmsVar, (Comparable) obj, (Comparable) obj2);
        }
        ghh.H(hmsVar, obj, obj2);
        throw null;
    }

    @Override // defpackage.jhb
    public final List b() {
        return this.i;
    }

    @Override // defpackage.jhb
    public final List c() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgb)) {
            return false;
        }
        zgb zgbVar = (zgb) obj;
        return Intrinsics.d(this.d, zgbVar.d) && Intrinsics.d(this.e, zgbVar.e) && Intrinsics.d(this.f, zgbVar.f) && Intrinsics.d(this.g, zgbVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "(" + this.e + ' ' + this.d + ' ' + this.f + ')';
    }
}
