package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class x80 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aqi b;

    public /* synthetic */ x80(aqi aqiVar) {
        this.a = 14;
        float f = vor.a;
        this.b = aqiVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0258, code lost:
    
        if (((defpackage.o14) r8.getValue()).a != null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x021a, code lost:
    
        if (((defpackage.p14) r8.getValue()).c != null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x022c, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0229, code lost:
    
        if (((defpackage.p14) r8.getValue()).a != null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0249, code lost:
    
        if (((defpackage.o14) r8.getValue()).c != null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x025b, code lost:
    
        r6 = false;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i = this.a;
        aqi aqiVar = this.b;
        switch (i) {
            case 0:
                aqiVar.setValue(Integer.valueOf((int) (((hqe) obj).a & 4294967295L)));
                return Unit.a;
            case 1:
                return ((e81) ((v71) aqiVar.getValue()).b.get(((Integer) obj).intValue())).a.a;
            case 2:
                bs1 bs1Var = (bs1) obj;
                bs1Var.getClass();
                if (bs1Var instanceof yr1) {
                    aqiVar.setValue(Boolean.FALSE);
                }
                return Unit.a;
            case 3:
                op1 op1Var = (op1) obj;
                op1Var.getClass();
                aqiVar.setValue(op1Var);
                return Unit.a;
            case 4:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                aqiVar.setValue(bool);
                return Unit.a;
            case 5:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                aqiVar.setValue(bool2);
                return Unit.a;
            case 6:
                j0s j0sVar = (j0s) obj;
                j0sVar.getClass();
                ((jcj) aqiVar.getValue()).getClass();
                aqiVar.setValue(new jcj(j0sVar, false));
                return Unit.a;
            case 7:
                d44 d44Var = (d44) obj;
                d44Var.getClass();
                int ordinal = d44Var.ordinal();
                if (ordinal == 0) {
                    break;
                } else {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            b6e.s();
                            return null;
                        }
                        break;
                    }
                    return Boolean.valueOf(r6);
                }
            case 8:
                whm whmVar = (whm) obj;
                whmVar.getClass();
                int ordinal2 = whmVar.ordinal();
                if (ordinal2 == 0) {
                    break;
                } else {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            b6e.s();
                            return null;
                        }
                        break;
                    }
                    return Boolean.valueOf(r6);
                }
            case 9:
                cds cdsVar = (cds) obj;
                cdsVar.getClass();
                aqiVar.setValue(Boolean.valueOf(cdsVar.b.f > 1));
                return Unit.a;
            case 10:
                cds cdsVar2 = (cds) obj;
                cdsVar2.getClass();
                aqiVar.setValue(Boolean.valueOf(cdsVar2.b.f > 1));
                return Unit.a;
            case 11:
                cds cdsVar3 = (cds) obj;
                cdsVar3.getClass();
                aqiVar.setValue(Boolean.valueOf(cdsVar3.b.f > 1));
                return Unit.a;
            case 12:
                cds cdsVar4 = (cds) obj;
                cdsVar4.getClass();
                aqiVar.setValue(Boolean.valueOf(cdsVar4.b.f > 1));
                return Unit.a;
            case 13:
                cds cdsVar5 = (cds) obj;
                cdsVar5.getClass();
                aqiVar.setValue(Boolean.valueOf(cdsVar5.b.f > 1));
                return Unit.a;
            case 14:
                float f = vor.a;
                np3 np3Var = (np3) obj;
                np3Var.getClass();
                return np3Var.b(new ny2(24, y9w.F(u75.h(new d85(d85.b), new d85(d85.m)), Float.intBitsToFloat((int) (np3Var.a.e() >> 32)) - ((np3Var.getDensity() * f) * np3Var.i0()), 0.0f, 12), aqiVar));
            case 15:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                Boolean bool3 = (Boolean) aqiVar.getValue();
                bool3.booleanValue();
                s9f[] s9fVarArr = wfp.a;
                xfp xfpVar = ufp.k;
                s9f s9fVar = wfp.a[4];
                xfpVar.getClass();
                jfpVar.o(xfpVar, bool3);
                return Unit.a;
            case 16:
                Boolean bool4 = (Boolean) obj;
                bool4.getClass();
                aqiVar.setValue(bool4);
                return Unit.a;
            case 17:
                aqiVar.setValue(Integer.valueOf((int) (((hqe) obj).a & 4294967295L)));
                return Unit.a;
            case 18:
                return new wpe((0 << 32) | ((eeh.b(((Float) obj).floatValue()) - ((Number) aqiVar.getValue()).intValue()) & 4294967295L));
            case 19:
                j0s j0sVar2 = (j0s) obj;
                j0sVar2.getClass();
                ((jcj) aqiVar.getValue()).getClass();
                aqiVar.setValue(new jcj(j0sVar2, false));
                return Unit.a;
            case 20:
                j0s j0sVar3 = (j0s) obj;
                j0sVar3.getClass();
                ((jcj) aqiVar.getValue()).getClass();
                aqiVar.setValue(new jcj(j0sVar3, false));
                return Unit.a;
            case 21:
                ((wof) obj).getClass();
                aqiVar.setValue(Boolean.TRUE);
                return Unit.a;
            case 22:
                qur qurVar = (qur) obj;
                qurVar.getClass();
                aqiVar.setValue(new rur(qurVar.c));
                return Unit.a;
            case 23:
                ((wof) obj).getClass();
                aqiVar.setValue(Boolean.TRUE);
                return Unit.a;
            case 24:
                ybs ybsVar = (ybs) obj;
                ybsVar.getClass();
                if (ybsVar.a.b.length() <= 200) {
                    aqiVar.setValue(ybsVar);
                }
                return Unit.a;
            case 25:
                ya0 ya0Var = (ya0) obj;
                ya0Var.getClass();
                aqiVar.setValue(ya0Var);
                return Unit.a;
            case 26:
                aqiVar.setValue(new hqe(((hqe) obj).a));
                return Unit.a;
            case 27:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                if (!((z7v) aqiVar.getValue()).a.isEmpty()) {
                    wfp.q(jfpVar2, 0);
                }
                return Unit.a;
            default:
                bs1 bs1Var2 = (bs1) obj;
                bs1Var2.getClass();
                if (bs1Var2.equals(xr1.a) || (bs1Var2 instanceof yr1) || (bs1Var2 instanceof zr1)) {
                    as1 as1Var = (as1) aqiVar.getValue();
                    if (as1Var != null) {
                        return as1Var;
                    }
                } else {
                    if (!(bs1Var2 instanceof as1)) {
                        b6e.s();
                        return null;
                    }
                    aqiVar.setValue((as1) bs1Var2);
                }
                return bs1Var2;
        }
    }

    public /* synthetic */ x80(aqi aqiVar, int i) {
        this.a = i;
        this.b = aqiVar;
    }
}
