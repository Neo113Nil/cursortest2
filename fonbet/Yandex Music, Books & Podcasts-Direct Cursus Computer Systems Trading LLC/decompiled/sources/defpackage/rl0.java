package defpackage;

import androidx.compose.foundation.layout.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class rl0 extends uif implements Function2 {
    public final /* synthetic */ int r = 1;
    public final /* synthetic */ int s;
    public final /* synthetic */ wn5 t;
    public final /* synthetic */ Function2 u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl0(int i, wn5 wn5Var, wn5 wn5Var2, Function2 function2, gqi gqiVar, Function2 function22, pyc pycVar, hso hsoVar) {
        super(2);
        this.s = i;
        this.t = wn5Var;
        this.v = wn5Var2;
        this.u = function2;
        this.w = gqiVar;
        this.x = function22;
        this.y = pycVar;
        this.z = hsoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x024c A[LOOP:3: B:50:0x024a->B:51:0x024c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0303 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0359 A[LOOP:4: B:77:0x0357->B:78:0x0359, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0266  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        c9n c9nVar;
        ArrayList arrayList;
        int size;
        int i;
        Object obj5;
        ArrayList arrayList2;
        Integer num;
        int i2;
        int i3;
        int size2;
        int i4;
        int intValue;
        int L;
        Object obj6;
        Object obj7;
        int i5;
        int L2;
        switch (this.r) {
            case 0:
                ((Number) obj2).intValue();
                etn.b((d8t) this.v, (Function1) this.w, (yci) this.x, (e9b) this.y, (vpb) this.z, this.u, this.t, (hq5) obj, rvf.R(this.s | 1));
                return Unit.a;
            case 1:
                hq5 hq5Var = (hq5) obj;
                int intValue2 = ((Number) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    eso.c(this.s, this.t, (wn5) this.v, ild.C(433906483, new qtf(9, (pyc) this.y, (hso) this.z), oq5Var), this.u, (gqi) this.w, (Function2) this.x, oq5Var, 24576);
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            default:
                dnr dnrVar = (dnr) obj;
                long j = ((ga6) obj2).a;
                dso dsoVar = (dso) this.x;
                opv opvVar = (opv) this.w;
                int i6 = ga6.i(j);
                int h = ga6.h(j);
                long b = ga6.b(j, 0, 0, 0, 0, 10);
                List i7 = dnrVar.i(fso.a, this.t);
                ArrayList arrayList3 = new ArrayList(i7.size());
                int size3 = i7.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    arrayList3.add(((ffh) i7.get(i8)).M(b));
                }
                int i9 = 1;
                if (arrayList3.isEmpty()) {
                    obj3 = null;
                } else {
                    obj3 = arrayList3.get(0);
                    int i10 = ((ksk) obj3).b;
                    int size4 = arrayList3.size() - 1;
                    if (1 <= size4) {
                        int i11 = 1;
                        while (true) {
                            Object obj8 = arrayList3.get(i11);
                            int i12 = ((ksk) obj8).b;
                            if (i10 < i12) {
                                i10 = i12;
                                obj3 = obj8;
                            }
                            if (i11 != size4) {
                                i11++;
                            }
                        }
                    }
                }
                ksk kskVar = (ksk) obj3;
                int i13 = kskVar != null ? kskVar.b : 0;
                List i14 = dnrVar.i(fso.c, (wn5) this.v);
                ArrayList arrayList4 = new ArrayList(i14.size());
                int size5 = i14.size();
                int i15 = 0;
                while (i15 < size5) {
                    arrayList4.add(((ffh) i14.get(i15)).M(ia6.i(b, (-opvVar.d(dnrVar, dnrVar.getLayoutDirection())) - opvVar.b(dnrVar, dnrVar.getLayoutDirection()), -opvVar.c(dnrVar))));
                    i15++;
                    i9 = i9;
                    i13 = i13;
                }
                int i16 = i13;
                int i17 = i9;
                if (arrayList4.isEmpty()) {
                    obj4 = null;
                } else {
                    obj4 = arrayList4.get(0);
                    int i18 = ((ksk) obj4).b;
                    int size6 = arrayList4.size() - 1;
                    if (i17 <= size6) {
                        Object obj9 = obj4;
                        int i19 = i18;
                        int i20 = 1;
                        while (true) {
                            Object obj10 = arrayList4.get(i20);
                            int i21 = ((ksk) obj10).b;
                            if (i19 < i21) {
                                obj9 = obj10;
                                i19 = i21;
                            }
                            if (i20 != size6) {
                                i20++;
                            } else {
                                obj4 = obj9;
                            }
                        }
                    }
                }
                ksk kskVar2 = (ksk) obj4;
                int i22 = kskVar2 != null ? kskVar2.b : 0;
                List i23 = dnrVar.i(fso.d, this.u);
                ArrayList arrayList5 = new ArrayList(i23.size());
                int size7 = i23.size();
                int i24 = 0;
                while (i24 < size7) {
                    arrayList5.add(((ffh) i23.get(i24)).M(ia6.i(b, (-opvVar.d(dnrVar, dnrVar.getLayoutDirection())) - opvVar.b(dnrVar, dnrVar.getLayoutDirection()), -opvVar.c(dnrVar))));
                    i24++;
                    i22 = i22;
                    arrayList3 = arrayList3;
                }
                int i25 = i22;
                ArrayList arrayList6 = arrayList3;
                if (!arrayList5.isEmpty()) {
                    if (arrayList5.isEmpty()) {
                        obj6 = null;
                    } else {
                        obj6 = arrayList5.get(0);
                        int i26 = ((ksk) obj6).a;
                        int size8 = arrayList5.size() - 1;
                        if (1 <= size8) {
                            Object obj11 = obj6;
                            int i27 = i26;
                            int i28 = 1;
                            while (true) {
                                Object obj12 = arrayList5.get(i28);
                                int i29 = ((ksk) obj12).a;
                                if (i27 < i29) {
                                    obj11 = obj12;
                                    i27 = i29;
                                }
                                if (i28 != size8) {
                                    i28++;
                                } else {
                                    obj6 = obj11;
                                }
                            }
                        }
                    }
                    ksk kskVar3 = (ksk) obj6;
                    int i30 = kskVar3 != null ? kskVar3.a : 0;
                    if (arrayList5.isEmpty()) {
                        obj7 = null;
                    } else {
                        obj7 = arrayList5.get(0);
                        int i31 = ((ksk) obj7).b;
                        int size9 = arrayList5.size() - 1;
                        if (1 <= size9) {
                            Object obj13 = obj7;
                            int i32 = i31;
                            int i33 = 1;
                            while (true) {
                                Object obj14 = arrayList5.get(i33);
                                int i34 = ((ksk) obj14).b;
                                if (i32 < i34) {
                                    obj13 = obj14;
                                    i32 = i34;
                                }
                                if (i33 != size9) {
                                    i33++;
                                } else {
                                    obj7 = obj13;
                                }
                            }
                        }
                    }
                    ksk kskVar4 = (ksk) obj7;
                    int i35 = kskVar4 != null ? kskVar4.b : 0;
                    if (i30 != 0 && i35 != 0) {
                        int i36 = this.s;
                        if (i36 != 0) {
                            if (i36 != 2) {
                                i5 = (i6 - i30) / 2;
                            } else if (dnrVar.getLayoutDirection() == xof.a) {
                                L2 = dnrVar.L(eso.b);
                                i5 = (i6 - L2) - i30;
                            } else {
                                i5 = dnrVar.L(eso.b);
                            }
                            c9nVar = new c9n(i5, i35, 4);
                            List i37 = dnrVar.i(fso.e, new wn5(new qtf(11, c9nVar, (Function2) this.y), 424088350, true));
                            arrayList = new ArrayList(i37.size());
                            size = i37.size();
                            while (i < size) {
                            }
                            if (arrayList.isEmpty()) {
                            }
                            ksk kskVar5 = (ksk) obj5;
                            if (kskVar5 == null) {
                            }
                            if (c9nVar == null) {
                            }
                            if (i25 == 0) {
                            }
                            eoe eoeVar = new eoe(opvVar, dnrVar);
                            dsoVar.a.setValue(new q0k(a.f(eoeVar, dnrVar.getLayoutDirection()), !arrayList6.isEmpty() ? eoeVar.d() : 0, a.e(eoeVar, dnrVar.getLayoutDirection()), (!arrayList2.isEmpty() || r3 == null) ? eoeVar.a() : dnrVar.c0(r3.intValue())));
                            int i38 = h - i2;
                            List i39 = dnrVar.i(fso.b, new wn5(new qtf(10, (wn5) this.z, dsoVar), -570781649, true));
                            ArrayList arrayList7 = new ArrayList(i39.size());
                            size2 = i39.size();
                            i4 = 0;
                            while (i4 < size2) {
                            }
                            return mfh.m0(dnrVar, i6, h, new bso(arrayList7, arrayList6, arrayList4, arrayList2, arrayList5, i2, h, i3, r3, c9nVar, num));
                        }
                        if (dnrVar.getLayoutDirection() != xof.a) {
                            L2 = dnrVar.L(eso.b);
                            i5 = (i6 - L2) - i30;
                            c9nVar = new c9n(i5, i35, 4);
                            List i372 = dnrVar.i(fso.e, new wn5(new qtf(11, c9nVar, (Function2) this.y), 424088350, true));
                            arrayList = new ArrayList(i372.size());
                            size = i372.size();
                            while (i < size) {
                            }
                            if (arrayList.isEmpty()) {
                            }
                            ksk kskVar52 = (ksk) obj5;
                            if (kskVar52 == null) {
                            }
                            if (c9nVar == null) {
                            }
                            if (i25 == 0) {
                            }
                            eoe eoeVar2 = new eoe(opvVar, dnrVar);
                            dsoVar.a.setValue(new q0k(a.f(eoeVar2, dnrVar.getLayoutDirection()), !arrayList6.isEmpty() ? eoeVar2.d() : 0, a.e(eoeVar2, dnrVar.getLayoutDirection()), (!arrayList2.isEmpty() || r3 == null) ? eoeVar2.a() : dnrVar.c0(r3.intValue())));
                            int i382 = h - i2;
                            List i392 = dnrVar.i(fso.b, new wn5(new qtf(10, (wn5) this.z, dsoVar), -570781649, true));
                            ArrayList arrayList72 = new ArrayList(i392.size());
                            size2 = i392.size();
                            i4 = 0;
                            while (i4 < size2) {
                            }
                            return mfh.m0(dnrVar, i6, h, new bso(arrayList72, arrayList6, arrayList4, arrayList2, arrayList5, i2, h, i3, r3, c9nVar, num));
                        }
                        i5 = dnrVar.L(eso.b);
                        c9nVar = new c9n(i5, i35, 4);
                        List i3722 = dnrVar.i(fso.e, new wn5(new qtf(11, c9nVar, (Function2) this.y), 424088350, true));
                        arrayList = new ArrayList(i3722.size());
                        size = i3722.size();
                        for (i = 0; i < size; i++) {
                            arrayList.add(((ffh) i3722.get(i)).M(b));
                        }
                        if (arrayList.isEmpty()) {
                            obj5 = arrayList.get(0);
                            int i40 = ((ksk) obj5).b;
                            int size10 = arrayList.size() - 1;
                            if (1 <= size10) {
                                Object obj15 = obj5;
                                int i41 = 1;
                                while (true) {
                                    Object obj16 = arrayList.get(i41);
                                    arrayList2 = arrayList;
                                    int i42 = ((ksk) obj16).b;
                                    if (i40 < i42) {
                                        i40 = i42;
                                        obj15 = obj16;
                                    }
                                    if (i41 != size10) {
                                        i41++;
                                        arrayList = arrayList2;
                                    } else {
                                        obj5 = obj15;
                                    }
                                }
                            } else {
                                arrayList2 = arrayList;
                            }
                        } else {
                            arrayList2 = arrayList;
                            obj5 = null;
                        }
                        ksk kskVar522 = (ksk) obj5;
                        Integer valueOf = kskVar522 == null ? Integer.valueOf(kskVar522.b) : null;
                        if (c9nVar == null) {
                            int i43 = c9nVar.c;
                            if (valueOf == null) {
                                intValue = dnrVar.L(eso.b) + i43;
                                L = opvVar.c(dnrVar);
                            } else {
                                intValue = valueOf.intValue() + i43;
                                L = dnrVar.L(eso.b);
                            }
                            num = Integer.valueOf(L + intValue);
                        } else {
                            num = null;
                        }
                        if (i25 == 0) {
                            i3 = i25 + (num != null ? num.intValue() : valueOf != null ? valueOf.intValue() : opvVar.c(dnrVar));
                            i2 = i16;
                        } else {
                            i2 = i16;
                            i3 = 0;
                        }
                        eoe eoeVar22 = new eoe(opvVar, dnrVar);
                        dsoVar.a.setValue(new q0k(a.f(eoeVar22, dnrVar.getLayoutDirection()), !arrayList6.isEmpty() ? eoeVar22.d() : 0, a.e(eoeVar22, dnrVar.getLayoutDirection()), (!arrayList2.isEmpty() || valueOf == null) ? eoeVar22.a() : dnrVar.c0(valueOf.intValue())));
                        int i3822 = h - i2;
                        List i3922 = dnrVar.i(fso.b, new wn5(new qtf(10, (wn5) this.z, dsoVar), -570781649, true));
                        ArrayList arrayList722 = new ArrayList(i3922.size());
                        size2 = i3922.size();
                        i4 = 0;
                        while (i4 < size2) {
                            arrayList722.add(((ffh) i3922.get(i4)).M(ga6.b(b, 0, 0, 0, i3822, 7)));
                            i4++;
                            i3922 = i3922;
                        }
                        return mfh.m0(dnrVar, i6, h, new bso(arrayList722, arrayList6, arrayList4, arrayList2, arrayList5, i2, h, i3, valueOf, c9nVar, num));
                    }
                }
                c9nVar = null;
                List i37222 = dnrVar.i(fso.e, new wn5(new qtf(11, c9nVar, (Function2) this.y), 424088350, true));
                arrayList = new ArrayList(i37222.size());
                size = i37222.size();
                while (i < size) {
                }
                if (arrayList.isEmpty()) {
                }
                ksk kskVar5222 = (ksk) obj5;
                if (kskVar5222 == null) {
                }
                if (c9nVar == null) {
                }
                if (i25 == 0) {
                }
                eoe eoeVar222 = new eoe(opvVar, dnrVar);
                dsoVar.a.setValue(new q0k(a.f(eoeVar222, dnrVar.getLayoutDirection()), !arrayList6.isEmpty() ? eoeVar222.d() : 0, a.e(eoeVar222, dnrVar.getLayoutDirection()), (!arrayList2.isEmpty() || valueOf == null) ? eoeVar222.a() : dnrVar.c0(valueOf.intValue())));
                int i38222 = h - i2;
                List i39222 = dnrVar.i(fso.b, new wn5(new qtf(10, (wn5) this.z, dsoVar), -570781649, true));
                ArrayList arrayList7222 = new ArrayList(i39222.size());
                size2 = i39222.size();
                i4 = 0;
                while (i4 < size2) {
                }
                return mfh.m0(dnrVar, i6, h, new bso(arrayList7222, arrayList6, arrayList4, arrayList2, arrayList5, i2, h, i3, valueOf, c9nVar, num));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl0(wn5 wn5Var, wn5 wn5Var2, Function2 function2, int i, opv opvVar, dso dsoVar, Function2 function22, wn5 wn5Var3) {
        super(2);
        this.t = wn5Var;
        this.v = wn5Var2;
        this.u = function2;
        this.s = i;
        this.w = opvVar;
        this.x = dsoVar;
        this.y = function22;
        this.z = wn5Var3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl0(d8t d8tVar, Function1 function1, yci yciVar, e9b e9bVar, vpb vpbVar, Function2 function2, wn5 wn5Var, int i) {
        super(2);
        this.v = d8tVar;
        this.w = function1;
        this.x = yciVar;
        this.y = e9bVar;
        this.z = vpbVar;
        this.u = function2;
        this.t = wn5Var;
        this.s = i;
    }
}
