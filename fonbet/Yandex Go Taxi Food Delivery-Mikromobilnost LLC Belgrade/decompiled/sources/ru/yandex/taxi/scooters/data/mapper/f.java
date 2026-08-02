package ru.yandex.taxi.scooters.data.mapper;

import com.yandex.go.scooters.api.domain.model.ScootersInsuranceType;
import defpackage.fef;
import defpackage.gwk0;
import defpackage.ief;
import defpackage.j2b1;
import defpackage.jl40;
import defpackage.k2b1;
import defpackage.m7n0;
import defpackage.ny61;
import defpackage.o6p0;
import defpackage.p6p0;
import defpackage.rhf;
import defpackage.rtg;
import defpackage.w6p0;
import defpackage.y1b1;
import defpackage.ysn0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.data.model.DebtStatus;
import ru.yandex.taxi.scooters.domain.model.ScootersInsuranceVersion;
import ru.yandex.taxi.scooters.experiments.ScootersClientInsuranceNewExperiment;

/* loaded from: classes9.dex */
public final class f {
    public final m7n0 a;

    public f(m7n0 m7n0Var) {
        this.a = m7n0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(w6p0 w6p0Var, ContinuationImpl continuationImpl) {
        ScootersUserStateMapper$mapToScootersInsurance$1 scootersUserStateMapper$mapToScootersInsurance$1;
        int i;
        ScootersClientInsuranceNewExperiment scootersClientInsuranceNewExperiment;
        w6p0.a c;
        ScootersInsuranceVersion scootersInsuranceVersion;
        if (continuationImpl instanceof ScootersUserStateMapper$mapToScootersInsurance$1) {
            scootersUserStateMapper$mapToScootersInsurance$1 = (ScootersUserStateMapper$mapToScootersInsurance$1) continuationImpl;
            int i2 = scootersUserStateMapper$mapToScootersInsurance$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersUserStateMapper$mapToScootersInsurance$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersUserStateMapper$mapToScootersInsurance$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersUserStateMapper$mapToScootersInsurance$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersUserStateMapper$mapToScootersInsurance$1.L$0 = w6p0Var;
                    scootersUserStateMapper$mapToScootersInsurance$1.label = 1;
                    obj = this.a.a.b(scootersUserStateMapper$mapToScootersInsurance$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w6p0Var = (w6p0) scootersUserStateMapper$mapToScootersInsurance$1.L$0;
                    kotlin.b.b(obj);
                }
                scootersClientInsuranceNewExperiment = (ScootersClientInsuranceNewExperiment) obj;
                if (scootersClientInsuranceNewExperiment.b) {
                    ysn0 ysn0Var = ysn0.e;
                    return j2b1.c();
                }
                if (w6p0Var == null || (c = w6p0Var.getC()) == null) {
                    ysn0 ysn0Var2 = ysn0.e;
                    return j2b1.c();
                }
                ScootersInsuranceType e = k2b1.e(c.getA());
                w6p0.a.C0131a b = c.getB();
                if (b == null) {
                    ysn0 ysn0Var3 = ysn0.e;
                    return j2b1.c();
                }
                long a = b.getA();
                long b2 = c.getB().getB();
                if (y1b1.a(scootersClientInsuranceNewExperiment.h)) {
                    scootersInsuranceVersion = ScootersInsuranceVersion.V3;
                } else {
                    if (!y1b1.a(scootersClientInsuranceNewExperiment.g)) {
                        ysn0 ysn0Var4 = ysn0.e;
                        return j2b1.c();
                    }
                    scootersInsuranceVersion = ScootersInsuranceVersion.V2;
                }
                ScootersInsuranceVersion scootersInsuranceVersion2 = scootersInsuranceVersion;
                if (e != ScootersInsuranceType.NO_INSURANCE) {
                    return new ysn0(e, a, b2, scootersInsuranceVersion2);
                }
                ysn0 ysn0Var5 = ysn0.e;
                return j2b1.c();
            }
        }
        scootersUserStateMapper$mapToScootersInsurance$1 = new ScootersUserStateMapper$mapToScootersInsurance$1(this, continuationImpl);
        Object obj2 = scootersUserStateMapper$mapToScootersInsurance$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersUserStateMapper$mapToScootersInsurance$1.label;
        if (i != 0) {
        }
        scootersClientInsuranceNewExperiment = (ScootersClientInsuranceNewExperiment) obj2;
        if (scootersClientInsuranceNewExperiment.b) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(rhf rhfVar, w6p0 w6p0Var, ContinuationImpl continuationImpl) {
        ScootersUserStateMapper$mapToUserState$1 scootersUserStateMapper$mapToUserState$1;
        int i;
        fef h;
        int i2;
        o6p0 o6p0Var;
        int i3;
        Boolean bool;
        int i4;
        ief f;
        w6p0 w6p0Var2 = w6p0Var;
        if (continuationImpl instanceof ScootersUserStateMapper$mapToUserState$1) {
            scootersUserStateMapper$mapToUserState$1 = (ScootersUserStateMapper$mapToUserState$1) continuationImpl;
            int i5 = scootersUserStateMapper$mapToUserState$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                scootersUserStateMapper$mapToUserState$1.label = i5 - Integer.MIN_VALUE;
                Object obj = scootersUserStateMapper$mapToUserState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersUserStateMapper$mapToUserState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    h = (w6p0Var2 == null || (f = w6p0Var2.getF()) == null) ? fef.e : gwk0.h(f);
                    int i6 = rhfVar != null ? 1 : 0;
                    i2 = w6p0Var2 != null ? 1 : 0;
                    rtg d = w6p0Var2 != null ? w6p0Var2.getD() : null;
                    if (d == null || d.getA() == null || d.getB() == null) {
                        o6p0Var = null;
                    } else {
                        DebtStatus a = d.getA();
                        int intValue = d.getB().intValue();
                        ief c = d.getC();
                        o6p0Var = new o6p0(a, intValue, c != null ? gwk0.h(c) : h);
                    }
                    int l = w6p0Var2 != null ? jl40.l(w6p0Var2.getA(), Boolean.TRUE) : 0;
                    Boolean b = w6p0Var2 != null ? w6p0Var2.getB() : null;
                    scootersUserStateMapper$mapToUserState$1.L$0 = null;
                    scootersUserStateMapper$mapToUserState$1.L$1 = w6p0Var2;
                    scootersUserStateMapper$mapToUserState$1.L$2 = null;
                    scootersUserStateMapper$mapToUserState$1.L$3 = o6p0Var;
                    scootersUserStateMapper$mapToUserState$1.L$4 = b;
                    scootersUserStateMapper$mapToUserState$1.L$5 = h;
                    scootersUserStateMapper$mapToUserState$1.I$0 = i6;
                    scootersUserStateMapper$mapToUserState$1.I$1 = i2;
                    scootersUserStateMapper$mapToUserState$1.I$2 = l;
                    scootersUserStateMapper$mapToUserState$1.label = 1;
                    Object a2 = a(w6p0Var2, scootersUserStateMapper$mapToUserState$1);
                    if (a2 == obj2) {
                        return obj2;
                    }
                    i3 = i6;
                    bool = b;
                    obj = a2;
                    i4 = l;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i4 = scootersUserStateMapper$mapToUserState$1.I$2;
                    int i7 = scootersUserStateMapper$mapToUserState$1.I$1;
                    i3 = scootersUserStateMapper$mapToUserState$1.I$0;
                    h = (fef) scootersUserStateMapper$mapToUserState$1.L$5;
                    Boolean bool2 = (Boolean) scootersUserStateMapper$mapToUserState$1.L$4;
                    o6p0Var = (o6p0) scootersUserStateMapper$mapToUserState$1.L$3;
                    w6p0 w6p0Var3 = (w6p0) scootersUserStateMapper$mapToUserState$1.L$1;
                    kotlin.b.b(obj);
                    bool = bool2;
                    i2 = i7;
                    w6p0Var2 = w6p0Var3;
                }
                return new p6p0(i3 == 0, i2 == 0, o6p0Var, i4 == 0, bool, h, (ysn0) obj, w6p0Var2 != null ? w6p0Var2.getE() : null);
            }
        }
        scootersUserStateMapper$mapToUserState$1 = new ScootersUserStateMapper$mapToUserState$1(this, continuationImpl);
        Object obj3 = scootersUserStateMapper$mapToUserState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersUserStateMapper$mapToUserState$1.label;
        if (i != 0) {
        }
        return new p6p0(i3 == 0, i2 == 0, o6p0Var, i4 == 0, bool, h, (ysn0) obj3, w6p0Var2 != null ? w6p0Var2.getE() : null);
    }
}
