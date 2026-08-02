package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class oub implements ryc {
    public final /* synthetic */ s9n a;
    public final /* synthetic */ gdn b;
    public final /* synthetic */ aqi c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ sub e;
    public final /* synthetic */ u6k f;
    public final /* synthetic */ aqi g;
    public final /* synthetic */ aqi h;

    public oub(s9n s9nVar, gdn gdnVar, aqi aqiVar, Function1 function1, sub subVar, u6k u6kVar, aqi aqiVar2, aqi aqiVar3) {
        this.a = s9nVar;
        this.b = gdnVar;
        this.c = aqiVar;
        this.d = function1;
        this.e = subVar;
        this.f = u6kVar;
        this.g = aqiVar2;
        this.h = aqiVar3;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        String str;
        Object nubVar;
        oxn oxnVar;
        gdn gdnVar;
        Object nubVar2;
        gdn gdnVar2;
        Object nubVar3;
        gdn gdnVar3;
        oxn oxnVar2 = (oxn) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        hq5 hq5Var = (hq5) obj3;
        int intValue = ((Number) obj4).intValue();
        oxnVar2.getClass();
        if ((intValue & 6) == 0) {
            i = (((oq5) hq5Var).f(oxnVar2) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((oq5) hq5Var).g(booleanValue) ? 32 : 16;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(i & 1, (i & 147) != 146)) {
            s9n s9nVar = this.a;
            mqs mqsVar = s9nVar.d;
            int i2 = s9nVar.c;
            mwk mwkVar = s9nVar.e;
            boolean f = oq5Var.f(mwkVar) | oq5Var.d(i2);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (f || K == kjnVar) {
                sub subVar = this.e;
                subVar.getClass();
                K = new rub(subVar, i2, mwkVar);
                oq5Var.k0(K);
            }
            ag5 ag5Var = (ag5) K;
            po6 po6Var = s9nVar.a;
            int i3 = s9nVar.c;
            gdn gdnVar4 = this.b;
            bzj bzjVar = gdnVar4.c ? bzj.a : bzj.b;
            String M = rvf.M(R.string.move_to_start, oq5Var);
            boolean h = oq5Var.h(s9nVar) | oq5Var.h(gdnVar4);
            aqi aqiVar = this.c;
            boolean f2 = h | oq5Var.f(aqiVar);
            Object K2 = oq5Var.K();
            if (f2 || K2 == kjnVar) {
                str = M;
                oxnVar = oxnVar2;
                nubVar = new nub(s9nVar, gdnVar4, this.f, this.g, this.h, this.c, 0);
                gdnVar = gdnVar4;
                oq5Var.k0(nubVar);
            } else {
                nubVar = K2;
                str = M;
                oxnVar = oxnVar2;
                gdnVar = gdnVar4;
            }
            qfi qfiVar = new qfi(str, (Function0) nubVar);
            String M2 = rvf.M(R.string.move_to_end, oq5Var);
            boolean h2 = oq5Var.h(s9nVar) | oq5Var.h(gdnVar) | oq5Var.f(aqiVar);
            gdn gdnVar5 = gdnVar;
            Object K3 = oq5Var.K();
            if (h2 || K3 == kjnVar) {
                nubVar2 = new nub(s9nVar, gdnVar5, this.f, this.c, this.g, this.h, 1);
                gdnVar2 = gdnVar5;
                oq5Var.k0(nubVar2);
            } else {
                nubVar2 = K3;
                gdnVar2 = gdnVar5;
            }
            qfi qfiVar2 = new qfi(M2, (Function0) nubVar2);
            String M3 = rvf.M(R.string.move_up, oq5Var);
            boolean h3 = oq5Var.h(s9nVar) | oq5Var.h(gdnVar2) | oq5Var.f(aqiVar);
            gdn gdnVar6 = gdnVar2;
            Object K4 = oq5Var.K();
            if (h3 || K4 == kjnVar) {
                nubVar3 = new nub(s9nVar, gdnVar6, this.f, this.g, this.h, this.c, 2);
                gdnVar3 = gdnVar6;
                oq5Var.k0(nubVar3);
            } else {
                nubVar3 = K4;
                gdnVar3 = gdnVar6;
            }
            qfi qfiVar3 = new qfi(M3, (Function0) nubVar3);
            String M4 = rvf.M(R.string.move_down, oq5Var);
            boolean f3 = oq5Var.f(aqiVar) | oq5Var.h(s9nVar) | oq5Var.h(gdnVar3);
            Object K5 = oq5Var.K();
            if (f3 || K5 == kjnVar) {
                gdn gdnVar7 = gdnVar3;
                K5 = new nub(s9nVar, gdnVar7, this.f, this.c, this.g, this.h, 3);
                gdnVar3 = gdnVar7;
                oq5Var.k0(K5);
            }
            qfi qfiVar4 = new qfi(M4, (Function0) K5);
            String M5 = rvf.M(R.string.delete_button, oq5Var);
            boolean h4 = oq5Var.h(s9nVar) | oq5Var.h(gdnVar3);
            Function1 function1 = this.d;
            boolean f4 = h4 | oq5Var.f(function1);
            Object K6 = oq5Var.K();
            if (f4 || K6 == kjnVar) {
                K6 = new ou4(1, s9nVar, gdnVar3, function1);
                oq5Var.k0(K6);
            }
            oxn oxnVar3 = oxnVar;
            u7g.l(oxnVar3, po6Var, i3, booleanValue, bzjVar, up6.H(mqsVar, ag5Var, oq5Var, 6, 4), qfiVar, qfiVar2, qfiVar3, qfiVar4, new qfi(M5, (Function0) K6), null, oq5Var, (i & 14) | ((i << 6) & 7168));
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }
}
