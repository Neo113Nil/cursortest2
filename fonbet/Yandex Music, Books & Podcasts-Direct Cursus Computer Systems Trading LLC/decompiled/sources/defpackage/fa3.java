package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class fa3 implements rjc {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public fa3(l93 l93Var, List list, jx7 jx7Var, fvf fvfVar, aqi aqiVar, eoe eoeVar) {
        float f = edo.a;
        this.b = l93Var;
        this.c = list;
        this.d = jx7Var;
        this.e = fvfVar;
        this.f = aqiVar;
        this.g = eoeVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(String str, Continuation continuation) {
        ea3 ea3Var;
        int i;
        Object obj;
        List list;
        jx7 jx7Var;
        fvf fvfVar;
        aqi aqiVar;
        eoe eoeVar;
        int i2;
        float f;
        int i3;
        int i4;
        int i5;
        int L;
        nbm nbmVar;
        int i6;
        Object obj2;
        List list2;
        jx7 jx7Var2;
        fvf fvfVar2;
        aqi aqiVar2;
        eoe eoeVar2;
        float f2;
        int i7;
        int i8;
        int i9;
        int L2;
        switch (this.a) {
            case 0:
                l93 l93Var = (l93) this.b;
                if (continuation instanceof ea3) {
                    ea3Var = (ea3) continuation;
                    int i10 = ea3Var.u;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        ea3Var.u = i10 - Integer.MIN_VALUE;
                        Object obj3 = ea3Var.s;
                        nm6 nm6Var = nm6.a;
                        i = ea3Var.u;
                        if (i != 0) {
                            qgg.h0(obj3);
                            Iterator it = CollectionsKt.B0(l93Var.a).iterator();
                            while (true) {
                                ora oraVar = (ora) it;
                                if (oraVar.b.hasNext()) {
                                    obj = oraVar.next();
                                    hcj hcjVar = (hcj) ((IndexedValue) obj).b;
                                    if (!(hcjVar instanceof fcj) || !Intrinsics.d(((fcj) hcjVar).b.a, str)) {
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            IndexedValue indexedValue = (IndexedValue) obj;
                            if (indexedValue != null) {
                                list = (List) this.c;
                                jx7Var = (jx7) this.d;
                                fvfVar = (fvf) this.e;
                                aqiVar = (aqi) this.f;
                                float f3 = edo.b;
                                eoeVar = (eoe) this.g;
                                int i11 = indexedValue.a;
                                ea3Var.j = list;
                                ea3Var.k = l93Var;
                                ea3Var.l = jx7Var;
                                ea3Var.m = fvfVar;
                                ea3Var.n = aqiVar;
                                ea3Var.o = eoeVar;
                                ea3Var.p = f3;
                                ea3Var.q = 0;
                                ea3Var.r = i11;
                                ea3Var.u = 1;
                                i2 = 2;
                                if (y2x.o(100L, ea3Var) != nm6Var) {
                                    f = f3;
                                    i3 = i11;
                                    i4 = 0;
                                    aqiVar.setValue(new jcj(j0s.b, true));
                                    int indexOf = list.indexOf(l93Var);
                                    i5 = indexOf + 1 + i3;
                                    L = jx7Var.L(eoeVar.d()) + jx7Var.L(f);
                                    ssg.a(3, "BookScreenContentSuccess", dfi.f("scroll to block(at=", indexOf + 2, i3, ") to item(at=", ")"), null);
                                    ea3Var.j = null;
                                    ea3Var.k = null;
                                    ea3Var.l = null;
                                    ea3Var.m = null;
                                    ea3Var.n = null;
                                    ea3Var.o = null;
                                    ea3Var.q = i4;
                                    ea3Var.r = i3;
                                    ea3Var.u = i2;
                                    if (fvfVar.f(i5, -L, ea3Var) == nm6Var) {
                                    }
                                }
                            }
                        } else if (i == 1) {
                            i3 = ea3Var.r;
                            int i12 = ea3Var.q;
                            f = ea3Var.p;
                            eoeVar = ea3Var.o;
                            aqiVar = ea3Var.n;
                            fvfVar = ea3Var.m;
                            jx7Var = ea3Var.l;
                            l93 l93Var2 = ea3Var.k;
                            list = ea3Var.j;
                            qgg.h0(obj3);
                            i4 = i12;
                            i2 = 2;
                            l93Var = l93Var2;
                            aqiVar.setValue(new jcj(j0s.b, true));
                            int indexOf2 = list.indexOf(l93Var);
                            i5 = indexOf2 + 1 + i3;
                            L = jx7Var.L(eoeVar.d()) + jx7Var.L(f);
                            ssg.a(3, "BookScreenContentSuccess", dfi.f("scroll to block(at=", indexOf2 + 2, i3, ") to item(at=", ")"), null);
                            ea3Var.j = null;
                            ea3Var.k = null;
                            ea3Var.l = null;
                            ea3Var.m = null;
                            ea3Var.n = null;
                            ea3Var.o = null;
                            ea3Var.q = i4;
                            ea3Var.r = i3;
                            ea3Var.u = i2;
                            if (fvfVar.f(i5, -L, ea3Var) == nm6Var) {
                            }
                        } else if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj3);
                        }
                        break;
                    }
                }
                ea3Var = new ea3(this, continuation);
                Object obj32 = ea3Var.s;
                nm6 nm6Var2 = nm6.a;
                i = ea3Var.u;
                if (i != 0) {
                }
                break;
            default:
                vam vamVar = (vam) this.b;
                if (continuation instanceof nbm) {
                    nbmVar = (nbm) continuation;
                    int i13 = nbmVar.u;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        nbmVar.u = i13 - Integer.MIN_VALUE;
                        Object obj4 = nbmVar.s;
                        nm6 nm6Var3 = nm6.a;
                        i6 = nbmVar.u;
                        if (i6 != 0) {
                            qgg.h0(obj4);
                            Iterator it2 = CollectionsKt.B0(vamVar.a.d).iterator();
                            while (true) {
                                ora oraVar2 = (ora) it2;
                                if (oraVar2.b.hasNext()) {
                                    obj2 = oraVar2.next();
                                    hcj hcjVar2 = (hcj) ((IndexedValue) obj2).b;
                                    if (!(hcjVar2 instanceof fcj) || !Intrinsics.d(((fcj) hcjVar2).b.a, str)) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            IndexedValue indexedValue2 = (IndexedValue) obj2;
                            if (indexedValue2 != null) {
                                list2 = (List) this.c;
                                jx7Var2 = (jx7) this.d;
                                fvfVar2 = (fvf) this.e;
                                aqiVar2 = (aqi) this.f;
                                float f4 = edo.b;
                                eoeVar2 = (eoe) this.g;
                                int i14 = indexedValue2.a;
                                nbmVar.j = list2;
                                nbmVar.k = vamVar;
                                nbmVar.l = jx7Var2;
                                nbmVar.m = fvfVar2;
                                nbmVar.n = aqiVar2;
                                nbmVar.o = eoeVar2;
                                nbmVar.p = f4;
                                nbmVar.q = 0;
                                nbmVar.r = i14;
                                nbmVar.u = 1;
                                if (y2x.o(100L, nbmVar) != nm6Var3) {
                                    f2 = f4;
                                    i7 = i14;
                                    i8 = 0;
                                    aqiVar2.setValue(new jcj(j0s.b, true));
                                    int indexOf3 = list2.indexOf(vamVar);
                                    i9 = i7 + indexOf3 + 1;
                                    L2 = jx7Var2.L(eoeVar2.d()) + jx7Var2.L(f2);
                                    ssg.a(3, "PodcastScreenContentSuccess", dfi.f("scroll to block(at=", indexOf3 + 1, i7, ") to item(at=", ")"), null);
                                    nbmVar.j = null;
                                    nbmVar.k = null;
                                    nbmVar.l = null;
                                    nbmVar.m = null;
                                    nbmVar.n = null;
                                    nbmVar.o = null;
                                    nbmVar.q = i8;
                                    nbmVar.r = i7;
                                    nbmVar.u = 2;
                                    if (fvfVar2.f(i9, -L2, nbmVar) == nm6Var3) {
                                    }
                                }
                            }
                        } else if (i6 == 1) {
                            i7 = nbmVar.r;
                            int i15 = nbmVar.q;
                            f2 = nbmVar.p;
                            eoeVar2 = nbmVar.o;
                            aqiVar2 = nbmVar.n;
                            fvfVar2 = nbmVar.m;
                            jx7Var2 = nbmVar.l;
                            vam vamVar2 = nbmVar.k;
                            list2 = nbmVar.j;
                            qgg.h0(obj4);
                            i8 = i15;
                            vamVar = vamVar2;
                            aqiVar2.setValue(new jcj(j0s.b, true));
                            int indexOf32 = list2.indexOf(vamVar);
                            i9 = i7 + indexOf32 + 1;
                            L2 = jx7Var2.L(eoeVar2.d()) + jx7Var2.L(f2);
                            ssg.a(3, "PodcastScreenContentSuccess", dfi.f("scroll to block(at=", indexOf32 + 1, i7, ") to item(at=", ")"), null);
                            nbmVar.j = null;
                            nbmVar.k = null;
                            nbmVar.l = null;
                            nbmVar.m = null;
                            nbmVar.n = null;
                            nbmVar.o = null;
                            nbmVar.q = i8;
                            nbmVar.r = i7;
                            nbmVar.u = 2;
                            if (fvfVar2.f(i9, -L2, nbmVar) == nm6Var3) {
                            }
                        } else if (i6 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj4);
                        }
                        break;
                    }
                }
                nbmVar = new nbm(this, continuation);
                Object obj42 = nbmVar.s;
                nm6 nm6Var32 = nm6.a;
                i6 = nbmVar.u;
                if (i6 != 0) {
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013c  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        a15 a15Var;
        Object obj2;
        nm6 nm6Var;
        int i;
        rjc rjcVar;
        int i2;
        wn5 wn5Var;
        nur nurVar;
        switch (this.a) {
            case 0:
                return b((String) obj, continuation);
            case 1:
                if (continuation instanceof a15) {
                    a15Var = (a15) continuation;
                    int i3 = a15Var.k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        a15Var.k = i3 - Integer.MIN_VALUE;
                        obj2 = a15Var.j;
                        nm6Var = nm6.a;
                        i = a15Var.k;
                        if (i != 0) {
                            qgg.h0(obj2);
                            rjcVar = (rjc) this.b;
                            e15 e15Var = (e15) this.c;
                            String str = (String) this.d;
                            String str2 = (String) this.e;
                            Boolean bool = (Boolean) this.f;
                            Boolean bool2 = (Boolean) this.g;
                            a15Var.m = rjcVar;
                            i2 = 0;
                            a15Var.n = 0;
                            a15Var.k = 1;
                            obj2 = x97.V(dm6.b, new q05(e15Var, null, bool2, bool, str, str2, null), a15Var);
                            if (obj2 == nm6Var) {
                                return nm6Var;
                            }
                        } else {
                            if (i != 1) {
                                if (i == 2) {
                                    qgg.h0(obj2);
                                    return Unit.a;
                                }
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i2 = a15Var.n;
                            rjcVar = a15Var.m;
                            qgg.h0(obj2);
                        }
                        a15Var.m = null;
                        a15Var.n = i2;
                        a15Var.k = 2;
                        if (rjcVar.emit(obj2, a15Var) == nm6Var) {
                            return nm6Var;
                        }
                        return Unit.a;
                    }
                }
                a15Var = new a15(this, continuation);
                obj2 = a15Var.j;
                nm6Var = nm6.a;
                i = a15Var.k;
                if (i != 0) {
                }
                a15Var.m = null;
                a15Var.n = i2;
                a15Var.k = 2;
                if (rjcVar.emit(obj2, a15Var) == nm6Var) {
                }
                return Unit.a;
            case 2:
                return b((String) obj, continuation);
            default:
                uur uurVar = (uur) obj;
                aqi aqiVar = (aqi) this.f;
                sur surVar = (sur) aqiVar.getValue();
                if (surVar instanceof qur) {
                    wn5Var = ((qur) surVar).c;
                } else {
                    if (!(surVar instanceof rur)) {
                        b6e.s();
                        return null;
                    }
                    wn5Var = ((rur) surVar).a;
                }
                mur murVar = (mur) this.b;
                uurVar.getClass();
                int ordinal = murVar.ordinal();
                if (ordinal == 0) {
                    int ordinal2 = uurVar.ordinal();
                    if (ordinal2 == 0) {
                        nurVar = new nur(0, new l3l(), new jzk(8));
                    } else {
                        if (ordinal2 != 1) {
                            b6e.s();
                            return null;
                        }
                        nurVar = new nur(0, new kpm(20), new z6n(16));
                    }
                    aqiVar.setValue(new qur(nurVar, wn5Var, our.b((si) this.e, (wn5) this.g, this.c, ((vdr) this.d).getValue())));
                    return Unit.a;
                }
                if (ordinal == 1) {
                    int ordinal3 = uurVar.ordinal();
                    if (ordinal3 == 0) {
                        nurVar = new nur(0, new aaw(16), new y9w(16));
                    } else {
                        if (ordinal3 != 1) {
                            b6e.s();
                            return null;
                        }
                        nurVar = new nur(0, new z34(0), new efo(13));
                    }
                    aqiVar.setValue(new qur(nurVar, wn5Var, our.b((si) this.e, (wn5) this.g, this.c, ((vdr) this.d).getValue())));
                    return Unit.a;
                }
                if (ordinal == 2) {
                    int ordinal4 = uurVar.ordinal();
                    if (ordinal4 == 0) {
                        nurVar = new nur(0, new kwl(), new jwl(1));
                    } else if (ordinal4 == 1) {
                        nurVar = new nur(0, new sml(4), new z34(1));
                    } else {
                        b6e.s();
                    }
                    aqiVar.setValue(new qur(nurVar, wn5Var, our.b((si) this.e, (wn5) this.g, this.c, ((vdr) this.d).getValue())));
                    return Unit.a;
                }
                b6e.s();
                return null;
        }
    }

    public fa3(rjc rjcVar, e15 e15Var, String str, String str2, Boolean bool, Boolean bool2) {
        this.b = rjcVar;
        this.c = e15Var;
        this.d = str;
        this.e = str2;
        this.f = bool;
        this.g = bool2;
    }

    public fa3(aqi aqiVar, mur murVar, Object obj, vdr vdrVar, si siVar, wn5 wn5Var) {
        this.f = aqiVar;
        this.b = murVar;
        this.c = obj;
        this.d = vdrVar;
        this.e = siVar;
        this.g = wn5Var;
    }

    public fa3(vam vamVar, List list, jx7 jx7Var, fvf fvfVar, aqi aqiVar, eoe eoeVar) {
        float f = edo.a;
        this.b = vamVar;
        this.c = list;
        this.d = jx7Var;
        this.e = fvfVar;
        this.f = aqiVar;
        this.g = eoeVar;
    }
}
