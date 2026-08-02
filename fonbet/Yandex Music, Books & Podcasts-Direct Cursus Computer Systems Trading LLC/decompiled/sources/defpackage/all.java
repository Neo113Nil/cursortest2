package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class all implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ mm6 c;
    public final /* synthetic */ na0 d;
    public final /* synthetic */ sdr e;
    public final /* synthetic */ st4 f;
    public final /* synthetic */ sdr g;
    public final /* synthetic */ sdr h;

    public /* synthetic */ all(Function0 function0, mm6 mm6Var, na0 na0Var, aqi aqiVar, st4 st4Var, sdr sdrVar, aqi aqiVar2, int i) {
        this.a = i;
        this.b = function0;
        this.c = mm6Var;
        this.d = na0Var;
        this.e = aqiVar;
        this.f = st4Var;
        this.g = sdrVar;
        this.h = aqiVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        final sdr sdrVar;
        yci yciVar;
        final sdr sdrVar2;
        yci yciVar2;
        int i = this.a;
        Object obj3 = gq5.a;
        switch (i) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(1 & intValue, (intValue & 3) != 2)) {
                    bb0 n0 = j66.n0(oq5Var);
                    yt4 yt4Var = yt4.b;
                    oq5Var.Z(-1256199881);
                    final Function0 function0 = this.b;
                    boolean f = oq5Var.f(function0);
                    final mm6 mm6Var = this.c;
                    boolean h = f | oq5Var.h(mm6Var);
                    final na0 na0Var = this.d;
                    boolean f2 = h | oq5Var.f(na0Var);
                    Object K = oq5Var.K();
                    sdr sdrVar3 = this.g;
                    if (f2 || K == obj3) {
                        final int i2 = 0;
                        sdrVar = sdrVar3;
                        Object obj4 = new Function0() { // from class: cll
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i2) {
                                    case 0:
                                        if (((Boolean) sdrVar.getValue()).booleanValue()) {
                                            function0.invoke();
                                        } else {
                                            x97.y(mm6Var, null, null, new gll(na0Var, null, 0), 3);
                                        }
                                        break;
                                    default:
                                        if (((Boolean) sdrVar.getValue()).booleanValue()) {
                                            function0.invoke();
                                        } else {
                                            x97.y(mm6Var, null, null, new gll(na0Var, null, 2), 3);
                                        }
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var.k0(obj4);
                        K = obj4;
                    } else {
                        sdrVar = sdrVar3;
                    }
                    vci vciVar = vci.a;
                    yci d = a.d(vciVar, null, null, false, null, null, (Function0) K, 28);
                    if (((Boolean) sdrVar.getValue()).booleanValue()) {
                        boolean f3 = oq5Var.f(function0);
                        Object K2 = oq5Var.K();
                        if (f3 || K2 == obj3) {
                            K2 = new hll(0, function0);
                            oq5Var.k0(K2);
                        }
                        ffm ffmVar = eur.a;
                        yciVar = new SuspendPointerInputElement(function0, this.h, null, (PointerInputEventHandler) K2, 4);
                    } else {
                        yciVar = vciVar;
                    }
                    yci f4 = d.f(yciVar);
                    oq5Var.p(false);
                    qt4.a(n0, this.e, yt4Var, this.f, d.d(f4, 1.0f), oq5Var, 0, 0);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    bb0 n02 = j66.n0(oq5Var2);
                    yt4 yt4Var2 = yt4.b;
                    oq5Var2.Z(-249529466);
                    final Function0 function02 = this.b;
                    boolean f5 = oq5Var2.f(function02);
                    final mm6 mm6Var2 = this.c;
                    boolean h2 = f5 | oq5Var2.h(mm6Var2);
                    final na0 na0Var2 = this.d;
                    boolean f6 = h2 | oq5Var2.f(na0Var2);
                    Object K3 = oq5Var2.K();
                    sdr sdrVar4 = this.g;
                    if (f6 || K3 == obj3) {
                        final int i3 = 1;
                        sdrVar2 = sdrVar4;
                        Object obj5 = new Function0() { // from class: cll
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i3) {
                                    case 0:
                                        if (((Boolean) sdrVar2.getValue()).booleanValue()) {
                                            function02.invoke();
                                        } else {
                                            x97.y(mm6Var2, null, null, new gll(na0Var2, null, 0), 3);
                                        }
                                        break;
                                    default:
                                        if (((Boolean) sdrVar2.getValue()).booleanValue()) {
                                            function02.invoke();
                                        } else {
                                            x97.y(mm6Var2, null, null, new gll(na0Var2, null, 2), 3);
                                        }
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var2.k0(obj5);
                        K3 = obj5;
                    } else {
                        sdrVar2 = sdrVar4;
                    }
                    vci vciVar2 = vci.a;
                    yci d2 = a.d(vciVar2, null, null, false, null, null, (Function0) K3, 28);
                    if (((Boolean) sdrVar2.getValue()).booleanValue()) {
                        boolean f7 = oq5Var2.f(function02);
                        Object K4 = oq5Var2.K();
                        if (f7 || K4 == obj3) {
                            K4 = new hll(1, function02);
                            oq5Var2.k0(K4);
                        }
                        ffm ffmVar2 = eur.a;
                        yciVar2 = new SuspendPointerInputElement(function02, this.h, null, (PointerInputEventHandler) K4, 4);
                    } else {
                        yciVar2 = vciVar2;
                    }
                    yci f8 = d2.f(yciVar2);
                    oq5Var2.p(false);
                    qt4.a(n02, this.e, yt4Var2, this.f, d.d(f8, 1.0f), oq5Var2, 0, 0);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
