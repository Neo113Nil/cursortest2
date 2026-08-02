package defpackage;

import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class yoa extends uif implements pyc {
    public final /* synthetic */ Object r;
    public final /* synthetic */ Function0 s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ dna u;
    public final /* synthetic */ Function1 v;
    public final /* synthetic */ Function2 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yoa(Object obj, Function0 function0, boolean z, dna dnaVar, Function1 function1, Function2 function2) {
        super(3);
        this.r = obj;
        this.s = function0;
        this.t = z;
        this.u = dnaVar;
        this.v = function1;
        this.w = function2;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        yci yciVar = (yci) obj;
        ((Number) obj3).intValue();
        yciVar.getClass();
        oq5 oq5Var = (oq5) ((hq5) obj2);
        oq5Var.Z(1321786060);
        Object K = oq5Var.K();
        Object obj4 = gq5.a;
        if (K == obj4) {
            K = tlm.f(gld.R(g.a, oq5Var), oq5Var);
        }
        mm6 mm6Var = ((fs5) K).a;
        oq5Var.Z(-98757340);
        Object K2 = oq5Var.K();
        if (K2 == obj4) {
            K2 = szf.g0(null);
            oq5Var.k0(K2);
        }
        aqi aqiVar = (aqi) K2;
        oq5Var.p(false);
        oq5Var.Z(-98754771);
        Object K3 = oq5Var.K();
        if (K3 == obj4) {
            K3 = szf.g0(Boolean.FALSE);
            oq5Var.k0(K3);
        }
        aqi aqiVar2 = (aqi) K3;
        oq5Var.p(false);
        oq5Var.Z(-98752375);
        boolean h = oq5Var.h(mm6Var) | oq5Var.f(null);
        Function0 function0 = this.s;
        boolean f = h | oq5Var.f(function0);
        Object K4 = oq5Var.K();
        if (f || K4 == obj4) {
            Object ak0Var = new ak0(function0, aqiVar2, aqiVar, mm6Var, 15);
            oq5Var.k0(ak0Var);
            K4 = ak0Var;
        }
        oq5Var.p(false);
        Object obj5 = this.r;
        gld.k(obj5, (Function1) K4, oq5Var);
        boolean z = this.t;
        Boolean valueOf = Boolean.valueOf(z);
        oq5Var.Z(-98737076);
        boolean g = oq5Var.g(z);
        dna dnaVar = this.u;
        boolean h2 = g | oq5Var.h(dnaVar) | oq5Var.h(mm6Var) | oq5Var.f(null);
        Function1 function1 = this.v;
        boolean f2 = h2 | oq5Var.f(function1) | oq5Var.f(function0);
        Function2 function2 = this.w;
        boolean f3 = f2 | oq5Var.f(function2);
        Object K5 = oq5Var.K();
        if (f3 || K5 == obj4) {
            Object xoaVar = new xoa(this.t, dnaVar, function2, function1, aqiVar2, mm6Var, aqiVar, function0, null);
            oq5Var.k0(xoaVar);
            K5 = xoaVar;
        }
        oq5Var.p(false);
        ffm ffmVar = eur.a;
        yci f4 = yciVar.f(new SuspendPointerInputElement(obj5, valueOf, null, new dur((Function2) K5), 4));
        oq5Var.p(false);
        return f4;
    }
}
