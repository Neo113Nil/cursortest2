package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class pz5 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tz5 b;
    public final /* synthetic */ fud c;
    public final /* synthetic */ yci d;
    public final /* synthetic */ aqi e;

    public /* synthetic */ pz5(tz5 tz5Var, fud fudVar, yci yciVar, aqi aqiVar, int i) {
        this.a = i;
        this.b = tz5Var;
        this.c = fudVar;
        this.d = yciVar;
        this.e = aqiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                pm0.a(null, ild.C(-1837459923, new pz5(this.b, this.c, this.d, this.e, 1), hq5Var), hq5Var, 48, 1);
                return Unit.a;
            default:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        return Unit.a;
                    }
                }
                yz5 yz5Var = (yz5) this.e.getValue();
                boolean z = yz5Var instanceof vz5;
                tz5 tz5Var = this.b;
                yci yciVar = this.d;
                if (z) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    oq5Var3.Z(-410246201);
                    Object value = tz5Var.m.a.getValue();
                    rv5 rv5Var = null;
                    vz5 vz5Var = value instanceof vz5 ? (vz5) value : null;
                    kjn kjnVar = gq5.a;
                    if (vz5Var == null || !(!vz5Var.a.e.isEmpty())) {
                        oq5Var3.Z(-410074399);
                        oq5Var3.p(false);
                    } else {
                        oq5Var3.Z(-410197283);
                        Object K = oq5Var3.K();
                        if (K == kjnVar) {
                            wv5 wv5Var = ((vz5) yz5Var).a;
                            jfu jfuVar = tz5Var.b;
                            at5 at5Var = new at5(3, tz5Var);
                            jfuVar.getClass();
                            rv5 rv5Var2 = new rv5(wv5Var.e, jfuVar, at5Var);
                            oq5Var3.k0(rv5Var2);
                            K = rv5Var2;
                        }
                        rv5Var = (rv5) K;
                        oq5Var3.p(false);
                    }
                    rv5 rv5Var3 = rv5Var;
                    vz5 vz5Var2 = (vz5) yz5Var;
                    ivd f0 = etn.f0(vz5Var2.a.c, this.c, tz5Var.o, oq5Var3, 0, 8);
                    boolean booleanValue = ((Boolean) gld.M(tz5Var.n, oq5Var3).getValue()).booleanValue();
                    boolean h = oq5Var3.h(tz5Var);
                    Object K2 = oq5Var3.K();
                    if (h || K2 == kjnVar) {
                        e65 e65Var = new e65(0, tz5Var, tz5.class, "onRefresh", "onRefresh()V", 0, 14);
                        oq5Var3.k0(e65Var);
                        K2 = e65Var;
                    }
                    bcx.j(booleanValue, (Function0) ((h9f) K2), ild.C(1191541590, new oz5(vz5Var2, tz5Var, f0, rv5Var3, yciVar), oq5Var3), oq5Var3, 384);
                    oq5Var3.p(false);
                } else if (Intrinsics.d(yz5Var, wz5.a)) {
                    oq5 oq5Var4 = (oq5) hq5Var2;
                    oq5Var4.Z(-409018942);
                    jf0.k(48, oq5Var4, yciVar, tz5Var.j);
                    oq5Var4.p(false);
                } else if (Intrinsics.d(yz5Var, xz5.a)) {
                    oq5 oq5Var5 = (oq5) hq5Var2;
                    oq5Var5.Z(-408744282);
                    vq1.e(tz5Var, yciVar, oq5Var5, 0);
                    oq5Var5.p(false);
                } else {
                    if (!Intrinsics.d(yz5Var, uz5.a)) {
                        throw vz1.i((oq5) hq5Var2, -567424857, false);
                    }
                    oq5 oq5Var6 = (oq5) hq5Var2;
                    oq5Var6.Z(-408524926);
                    tt0.e(tz5Var, yciVar, oq5Var6, 0);
                    oq5Var6.p(false);
                }
                return Unit.a;
        }
    }
}
