package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class rw2 {
    public final a9h a;
    public final lx2 b;
    public final tf6 c = gld.e(dm6.b);
    public final xdr d = ydr.a(Boolean.FALSE);

    public rw2(a9h a9hVar, lx2 lx2Var, iw2 iw2Var) {
        this.a = a9hVar;
        this.b = lx2Var;
    }

    public final boolean a(Context context) {
        context.getClass();
        return l1b.d(context).getRestrictBackgroundStatus() != 3 && l1b.h(context).isIgnoringBatteryOptimizations(context.getPackageName());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        lw2 lw2Var;
        int i;
        if (cg6Var instanceof lw2) {
            lw2Var = (lw2) cg6Var;
            int i2 = lw2Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lw2Var.l = i2 - Integer.MIN_VALUE;
                Object obj = lw2Var.j;
                nm6 nm6Var = nm6.a;
                i = lw2Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    lw2Var.l = 1;
                    if (this.b.c(lw2Var) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                ot0.A(gw2.b.e(), "BatteryRestrictionsDialog", tah.b(new Pair("type", "Clear errors")));
                return Unit.a;
            }
        }
        lw2Var = new lw2(this, cg6Var);
        Object obj2 = lw2Var.j;
        nm6 nm6Var2 = nm6.a;
        i = lw2Var.l;
        if (i != 0) {
        }
        ot0.A(gw2.b.e(), "BatteryRestrictionsDialog", tah.b(new Pair("type", "Clear errors")));
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(cg6 cg6Var) {
        nw2 nw2Var;
        int i;
        if (cg6Var instanceof nw2) {
            nw2Var = (nw2) cg6Var;
            int i2 = nw2Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nw2Var.l = i2 - Integer.MIN_VALUE;
                Object obj = nw2Var.j;
                nm6 nm6Var = nm6.a;
                i = nw2Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    nw2Var.l = 1;
                    if (this.b.b(nw2Var) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                ot0.A(gw2.b.e(), "BatteryRestrictionsDialog", tah.b(new Pair("type", "Error happened")));
                return Unit.a;
            }
        }
        nw2Var = new nw2(this, cg6Var);
        Object obj2 = nw2Var.j;
        nm6 nm6Var2 = nm6.a;
        i = nw2Var.l;
        if (i != 0) {
        }
        ot0.A(gw2.b.e(), "BatteryRestrictionsDialog", tah.b(new Pair("type", "Error happened")));
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c0, code lost:
    
        if (r13 == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0097, code lost:
    
        if (r13 == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x007b, code lost:
    
        if (r13 == r1) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Context context, cg6 cg6Var) {
        ow2 ow2Var;
        Object obj;
        int i;
        String str;
        gw2 gw2Var;
        boolean z;
        boolean z2;
        if (cg6Var instanceof ow2) {
            ow2Var = (ow2) cg6Var;
            int i2 = ow2Var.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ow2Var.q = i2 - Integer.MIN_VALUE;
                obj = ow2Var.o;
                Object obj2 = nm6.a;
                i = ow2Var.q;
                a9h a9hVar = this.a;
                lx2 lx2Var = this.b;
                if (i != 0) {
                    qgg.h0(obj);
                    if (Build.VERSION.SDK_INT < 31) {
                        ssg.a(4, "BatteryRestrictionsManager", "Android version is too old", null);
                        return Boolean.FALSE;
                    }
                    if (a9hVar.equals(lmt.a)) {
                        ssg.a(4, "BatteryRestrictionsManager", "vendor not supported", null);
                        return Boolean.FALSE;
                    }
                    ow2Var.j = context;
                    ow2Var.q = 1;
                    obj = lx2Var.k(ow2Var);
                } else if (i == 1) {
                    context = ow2Var.j;
                    qgg.h0(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            z2 = ow2Var.n;
                            z = ow2Var.m;
                            str = ow2Var.l;
                            gw2Var = ow2Var.k;
                            qgg.h0(obj);
                            int longValue = (int) ((Number) obj).longValue();
                            gw2Var.getClass();
                            str.getClass();
                            y60 e = gw2Var.e();
                            arf g = tlm.g(bwf.c);
                            Map map = (Map) g.getValue();
                            arf g2 = tlm.g(bwf.c);
                            ((Map) g2.getValue()).put("device", str);
                            ((Map) g2.getValue()).put("optimization", Boolean.valueOf(z));
                            ((Map) g2.getValue()).put("intent", Boolean.valueOf(z2));
                            ((Map) g2.getValue()).put("errors", Integer.valueOf(longValue));
                            map.put("statistic", !g2.isInitialized() ? (Map) g2.getValue() : null);
                            tlm.o(e, "BatteryRestrictionsDialog", g.isInitialized() ? (Map) g.getValue() : null);
                            return Boolean.TRUE;
                        }
                        context = ow2Var.j;
                        qgg.h0(obj);
                        if (((Boolean) obj).booleanValue()) {
                            ssg.a(4, "BatteryRestrictionsManager", "show is to often", null);
                            return Boolean.FALSE;
                        }
                        gw2 gw2Var2 = gw2.b;
                        str = Build.MANUFACTURER;
                        str.getClass();
                        boolean a = a(context);
                        boolean z3 = a9hVar.c(context) != null;
                        ow2Var.j = null;
                        ow2Var.k = gw2Var2;
                        ow2Var.l = str;
                        ow2Var.m = a;
                        ow2Var.n = z3;
                        ow2Var.q = 4;
                        Object e2 = lx2Var.e(ow2Var);
                        if (e2 != obj2) {
                            gw2Var = gw2Var2;
                            z = a;
                            obj = e2;
                            z2 = z3;
                            int longValue2 = (int) ((Number) obj).longValue();
                            gw2Var.getClass();
                            str.getClass();
                            y60 e3 = gw2Var.e();
                            arf g3 = tlm.g(bwf.c);
                            Map map2 = (Map) g3.getValue();
                            arf g22 = tlm.g(bwf.c);
                            ((Map) g22.getValue()).put("device", str);
                            ((Map) g22.getValue()).put("optimization", Boolean.valueOf(z));
                            ((Map) g22.getValue()).put("intent", Boolean.valueOf(z2));
                            ((Map) g22.getValue()).put("errors", Integer.valueOf(longValue2));
                            map2.put("statistic", !g22.isInitialized() ? (Map) g22.getValue() : null);
                            tlm.o(e3, "BatteryRestrictionsDialog", g3.isInitialized() ? (Map) g3.getValue() : null);
                            return Boolean.TRUE;
                        }
                        return obj2;
                    }
                    context = ow2Var.j;
                    qgg.h0(obj);
                    if (((Boolean) obj).booleanValue()) {
                        ssg.a(4, "BatteryRestrictionsManager", "dialog already shown once for all new errors", null);
                        return Boolean.FALSE;
                    }
                    if (a(context)) {
                        ssg.a(4, "BatteryRestrictionsManager", "all background optimizations have already been disabled", null);
                        return Boolean.FALSE;
                    }
                    ow2Var.j = context;
                    ow2Var.q = 3;
                    obj = f(ow2Var);
                }
                if (((Boolean) obj).booleanValue()) {
                    ssg.a(4, "BatteryRestrictionsManager", "no errors happened", null);
                    return Boolean.FALSE;
                }
                ow2Var.j = context;
                ow2Var.q = 2;
                obj = lx2Var.j(ow2Var);
            }
        }
        ow2Var = new ow2(this, cg6Var);
        obj = ow2Var.o;
        Object obj22 = nm6.a;
        i = ow2Var.q;
        a9h a9hVar2 = this.a;
        lx2 lx2Var2 = this.b;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    public final boolean e(Context context, long j) {
        if (Build.VERSION.SDK_INT < 31) {
            ssg.a(4, "BatteryRestrictionsManager", "Informer - Android version is too old", null);
            return false;
        }
        if (this.a.equals(lmt.a)) {
            ssg.a(4, "BatteryRestrictionsManager", "Informer - vendor not supported", null);
            return false;
        }
        if (j <= 0) {
            ssg.a(4, "BatteryRestrictionsManager", "Informer - no errors happened", null);
            return false;
        }
        if (!a(context)) {
            return true;
        }
        ssg.a(4, "BatteryRestrictionsManager", "Informer - all background optimizations have already been disabled", null);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(cg6 cg6Var) {
        pw2 pw2Var;
        int i;
        if (cg6Var instanceof pw2) {
            pw2Var = (pw2) cg6Var;
            int i2 = pw2Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pw2Var.l = i2 - Integer.MIN_VALUE;
                Object obj = pw2Var.j;
                nm6 nm6Var = nm6.a;
                i = pw2Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    lx2 lx2Var = this.b;
                    pw2Var.l = 1;
                    obj = lx2Var.l(pw2Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                long longValue = ((Number) obj).longValue();
                l18 l18Var = l18.b;
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                Long e = ((kw2) ((byb) qdcVar.C(I)).b(kw2.class)).a().e("hoursBetweenShow");
                return Boolean.valueOf(longValue < TimeUnit.HOURS.toMillis(e == null ? e.longValue() : 168L));
            }
        }
        pw2Var = new pw2(this, cg6Var);
        Object obj2 = pw2Var.j;
        nm6 nm6Var2 = nm6.a;
        i = pw2Var.l;
        if (i != 0) {
        }
        long longValue2 = ((Number) obj2).longValue();
        l18 l18Var2 = l18.b;
        bdt I2 = hag.I(byb.class);
        qdc qdcVar2 = l18Var2.a;
        qdcVar2.getClass();
        Long e2 = ((kw2) ((byb) qdcVar2.C(I2)).b(kw2.class)).a().e("hoursBetweenShow");
        return Boolean.valueOf(longValue2 < TimeUnit.HOURS.toMillis(e2 == null ? e2.longValue() : 168L));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Context context, cg6 cg6Var) {
        qw2 qw2Var;
        int i;
        xdr xdrVar;
        rw2 rw2Var;
        if (cg6Var instanceof qw2) {
            qw2Var = (qw2) cg6Var;
            int i2 = qw2Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qw2Var.o = i2 - Integer.MIN_VALUE;
                Object obj = qw2Var.m;
                nm6 nm6Var = nm6.a;
                i = qw2Var.o;
                if (i != 0) {
                    qgg.h0(obj);
                    xdr xdrVar2 = this.d;
                    qw2Var.j = xdrVar2;
                    qw2Var.k = this;
                    qw2Var.l = context;
                    qw2Var.o = 1;
                    Object e = this.b.e(qw2Var);
                    if (e == nm6Var) {
                        return nm6Var;
                    }
                    xdrVar = xdrVar2;
                    obj = e;
                    rw2Var = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    context = qw2Var.l;
                    rw2Var = qw2Var.k;
                    xdrVar = qw2Var.j;
                    qgg.h0(obj);
                }
                Boolean valueOf = Boolean.valueOf(rw2Var.e(context, ((Number) obj).longValue()));
                xdrVar.getClass();
                xdrVar.m(null, valueOf);
                return Unit.a;
            }
        }
        qw2Var = new qw2(this, cg6Var);
        Object obj2 = qw2Var.m;
        nm6 nm6Var2 = nm6.a;
        i = qw2Var.o;
        if (i != 0) {
        }
        Boolean valueOf2 = Boolean.valueOf(rw2Var.e(context, ((Number) obj2).longValue()));
        xdrVar.getClass();
        xdrVar.m(null, valueOf2);
        return Unit.a;
    }
}
