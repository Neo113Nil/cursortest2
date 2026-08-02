package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class rf6 extends uif implements Function2 {
    public final /* synthetic */ int r = 1;
    public final /* synthetic */ wn5 s;
    public final /* synthetic */ xep t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf6(wn5 wn5Var, xep xepVar) {
        super(2);
        this.s = wn5Var;
        this.t = xepVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        xdp xdpVar;
        ugi c;
        xdp xdpVar2;
        ugi c2;
        switch (this.r) {
            case 0:
                ((Number) obj2).intValue();
                wct.e(this.t, this.s, (hq5) obj, rvf.R(49));
                break;
            default:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Number) obj2).intValue();
                boolean z2 = false;
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    this.s.invoke(oq5Var, 0);
                    xep xepVar = this.t;
                    if (xepVar.g() && ((Boolean) xepVar.i.getValue()).booleanValue()) {
                        ydp e = xepVar.e();
                        if (!(e != null ? Intrinsics.d(e.a, e.b) : true)) {
                            oq5Var.Z(-881553831);
                            ydp e2 = xepVar.e();
                            if (e2 == null) {
                                oq5Var.Z(-881514989);
                                oq5Var.p(false);
                                z = false;
                            } else {
                                oq5Var.Z(-881514988);
                                oq5Var.Z(1495586214);
                                List h = u75.h(Boolean.TRUE, Boolean.FALSE);
                                int size = h.size();
                                int i = 0;
                                while (i < size) {
                                    boolean booleanValue = ((Boolean) h.get(i)).booleanValue();
                                    boolean g = oq5Var.g(booleanValue);
                                    Object K = oq5Var.K();
                                    kjn kjnVar = gq5.a;
                                    if (g || K == kjnVar) {
                                        K = new wep(booleanValue, xepVar);
                                        oq5Var.k0(K);
                                    }
                                    has hasVar = (has) K;
                                    boolean g2 = oq5Var.g(booleanValue);
                                    Object K2 = oq5Var.K();
                                    if (g2 || K2 == kjnVar) {
                                        K2 = booleanValue ? new dep(xepVar, 0) : new dep(xepVar, 1);
                                        oq5Var.k0(K2);
                                    }
                                    Function0 function0 = (Function0) K2;
                                    i2o i2oVar = booleanValue ? e2.a.a : e2.b.a;
                                    float f = 0.0f;
                                    if (booleanValue) {
                                        ydp e3 = xepVar.e();
                                        if (e3 != null && (c2 = xepVar.c((xdpVar2 = e3.a))) != null) {
                                            int i2 = xdpVar2.b;
                                            cds cdsVar = (cds) c2.c.invoke();
                                            if (cdsVar != null) {
                                                f = a4g.z(cdsVar, i2);
                                            }
                                        }
                                    } else {
                                        ydp e4 = xepVar.e();
                                        if (e4 != null && (c = xepVar.c((xdpVar = e4.b))) != null) {
                                            int i3 = xdpVar.b;
                                            cds cdsVar2 = (cds) c.c.invoke();
                                            if (cdsVar2 != null) {
                                                f = a4g.z(cdsVar2, i3);
                                            }
                                        }
                                    }
                                    float f2 = f;
                                    i2o i2oVar2 = i2oVar;
                                    gep gepVar = new gep(function0);
                                    boolean z3 = e2.c;
                                    boolean h2 = oq5Var.h(hasVar);
                                    Object K3 = oq5Var.K();
                                    if (h2 || K3 == kjnVar) {
                                        K3 = new cep(hasVar, 0);
                                        oq5Var.k0(K3);
                                    }
                                    qld.s(gepVar, booleanValue, i2oVar2, z3, 0L, f2, eur.a(vci.a, hasVar, (PointerInputEventHandler) K3), oq5Var, 0);
                                    i++;
                                    z2 = false;
                                }
                                z = z2;
                                oq5Var.p(z);
                                oq5Var.p(z);
                            }
                            oq5Var.p(z);
                        }
                    }
                    oq5Var.Z(-879541497);
                    oq5Var.p(false);
                } else {
                    oq5Var.S();
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf6(xep xepVar, wn5 wn5Var, int i) {
        super(2);
        this.t = xepVar;
        this.s = wn5Var;
    }
}
