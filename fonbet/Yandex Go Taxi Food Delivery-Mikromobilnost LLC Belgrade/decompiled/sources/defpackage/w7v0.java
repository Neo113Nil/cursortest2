package defpackage;

import defpackage.cn0;
import defpackage.ksw;
import defpackage.ul0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.contacts.SelectedFrom;
import ru.yandex.taxi.persuggest.api.EditActionDto;
import ru.yandex.taxi.persuggest.api.GeoObjectType;
import ru.yandex.taxi.persuggest.api.ShouldFinalizeEvent;
import ru.yandex.taxi.persuggest.domain.model.AlternativeActionType;
import ru.yandex.taxi.persuggest.domain.model.SuggestResult$SuggestAction;

/* loaded from: classes9.dex */
public final class w7v0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03cf  */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v46, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v36, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static v7v0 a(ksw kswVar, i4v0 i4v0Var, boolean z, ul0 ul0Var, xr0 xr0Var) {
        FormattedText formattedText;
        List list;
        List list2;
        FormattedText formattedText2;
        String str;
        String str2;
        String str3;
        ?? r2;
        String str4;
        String str5;
        String str6;
        String str7;
        List list3;
        zzs zzsVar;
        bgq0 bgq0Var;
        String str8;
        String str9;
        String str10;
        bgq0 bgq0Var2;
        String str11;
        ArrayList arrayList;
        lxj lxjVar;
        yu21 yu21Var;
        yu21 yu21Var2;
        lxj lxjVar2;
        xzb xzbVar;
        xzb xzbVar2;
        cw1 cw1Var;
        dw1 dw1Var;
        ob90 ob90Var;
        cn0.b bVar;
        Object obj;
        ?? r3;
        Iterator it;
        String str12;
        String str13;
        Number number;
        zzs zzsVar2 = kswVar.d;
        xu21 xu21Var = kswVar.t;
        String str14 = kswVar.b;
        cn0 cn0Var = kswVar.F;
        if (zzsVar2 == null) {
            zzsVar2 = zzs.f;
        }
        zzs zzsVar3 = zzsVar2;
        String str15 = str14 == null ? "" : str14;
        String str16 = kswVar.f;
        String str17 = str16 == null ? "" : str16;
        iiz0 iiz0Var = kswVar.e;
        String str18 = iiz0Var != null ? iiz0Var.b : null;
        if (str18 == null) {
            str18 = "";
        }
        if (iiz0Var == null || (formattedText = iiz0Var.c) == null) {
            formattedText = FormattedText.c;
        }
        List list4 = EmptyList.a;
        if (iiz0Var == null || (list = iiz0Var.a) == null) {
            list = list4;
        }
        iiz0 iiz0Var2 = kswVar.h;
        String str19 = iiz0Var2 != null ? iiz0Var2.b : null;
        if (str19 == null) {
            str19 = "";
        }
        tb90 tb90Var = null;
        if (iiz0Var2 == null || (list2 = iiz0Var2.a) == null) {
            list2 = list4;
        }
        if (iiz0Var2 == null || (formattedText2 = iiz0Var2.c) == null) {
            formattedText2 = FormattedText.c;
        }
        String str20 = kswVar.i;
        lxj lxjVar3 = z7v0.a;
        SuggestResult$SuggestAction suggestResult$SuggestAction = jl40.l(str20, "search") ? SuggestResult$SuggestAction.SEARCH : jl40.l(str20, "substitute") ? SuggestResult$SuggestAction.SUBSTITUTE : SuggestResult$SuggestAction.UNKNOWN;
        String str21 = kswVar.j;
        if (str21 == null) {
            str21 = "";
        }
        SuggestResult$SuggestAction suggestResult$SuggestAction2 = suggestResult$SuggestAction;
        String str22 = kswVar.l;
        String str23 = str22 == null ? "" : str22;
        t1k t1kVar = kswVar.m;
        String str24 = t1kVar != null ? t1kVar.a : null;
        if (str24 == null) {
            str24 = "";
        }
        String str25 = str24;
        String str26 = ((xr0Var == null || (str = xr0Var.e) == null) && (str = kswVar.n) == null) ? "" : str;
        String str27 = kswVar.o;
        String str28 = str27 == null ? "" : str27;
        String str29 = kswVar.s;
        if (str29 == null) {
            str29 = "";
        }
        String str30 = str29;
        String str31 = xu21Var != null ? xu21Var.a : null;
        String str32 = str31 == null ? "" : str31;
        int intValue = (xu21Var == null || (number = xu21Var.c) == null) ? 0 : number.intValue();
        String str33 = xu21Var != null ? xu21Var.d : null;
        if (str33 == null) {
            str33 = "";
        }
        int i = intValue;
        String str34 = kswVar.c;
        String str35 = str34 == null ? "" : str34;
        GeoObjectType geoObjectType = kswVar.r;
        if (geoObjectType != null) {
            str2 = str33;
            int i2 = szs.a[geoObjectType.ordinal()];
            if (i2 == 1) {
                str3 = "address";
            } else if (i2 == 2) {
                str3 = "organization";
            } else {
                if (i2 != 3) {
                    w511.b();
                    return null;
                }
                str3 = "delivery_pickup_point";
            }
        } else {
            str2 = str33;
            str3 = null;
        }
        if (str3 == null) {
            str3 = "";
        }
        jsq0 jsq0Var = kswVar.q;
        String str36 = str3;
        if (jsq0Var != null) {
            r2 = new ArrayList();
            Iterator it2 = jsq0Var.a.iterator();
            while (it2.hasNext()) {
                ShouldFinalizeEvent shouldFinalizeEvent = (ShouldFinalizeEvent) it2.next();
                if (shouldFinalizeEvent != null) {
                    it = it2;
                    int i3 = c5s0.a[shouldFinalizeEvent.ordinal()];
                    str12 = str21;
                    if (i3 == 1) {
                        str13 = "tariff_changed";
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        str13 = "requirements_changed";
                    }
                } else {
                    it = it2;
                    str12 = str21;
                    str13 = null;
                }
                if (str13 != null) {
                    r2.add(str13);
                }
                str21 = str12;
                it2 = it;
            }
        } else {
            r2 = list4;
        }
        String str37 = str21;
        String str38 = kswVar.u;
        if (str38 == null) {
            str38 = "";
        }
        String str39 = kswVar.v;
        String str40 = str39 == null ? "" : str39;
        if ((xr0Var == null || (str4 = xr0Var.c) == null) && (str4 = kswVar.w) == null) {
            str4 = "";
        }
        List list5 = r2;
        if ((xr0Var == null || (str5 = xr0Var.b) == null) && (str5 = kswVar.x) == null) {
            str5 = "";
        }
        String str41 = str5;
        if (xr0Var == null || (bgq0Var = xr0Var.a) == null) {
            ksw.a aVar = kswVar.z;
            str6 = str38;
            if (aVar == null || (str8 = aVar.a) == null) {
                str7 = str4;
                list3 = list;
                zzsVar = zzsVar3;
                bgq0Var = null;
            } else {
                str7 = str4;
                String str42 = aVar.b;
                if (str42 == null) {
                    str42 = "";
                }
                list3 = list;
                zzsVar = zzsVar3;
                bgq0Var = new bgq0(str42, str8, SelectedFrom.SUGGEST, 8);
            }
        } else {
            str6 = str38;
            str7 = str4;
            list3 = list;
            zzsVar = zzsVar3;
        }
        if ((xr0Var == null || (str9 = xr0Var.d) == null) && (str9 = kswVar.y) == null) {
            str9 = "";
        }
        if ((xr0Var == null || (str10 = xr0Var.f) == null) && (str10 = kswVar.A) == null) {
            str10 = "";
        }
        List list6 = kswVar.B;
        String str43 = str10;
        ArrayList arrayList2 = new ArrayList(tcc.n(list6, 10));
        for (Iterator it3 = list6.iterator(); it3.hasNext(); it3 = it3) {
            cn0.c cVar = (cn0.c) it3.next();
            arrayList2.add(new fkb0(cVar.getA(), cVar.getB()));
        }
        x3o x3oVar = kswVar.C;
        if (x3oVar != null) {
            String str44 = str14 == null ? "" : str14;
            String str45 = x3oVar.b;
            if (str45 == null) {
                str45 = "";
            }
            String str46 = x3oVar.a;
            if (str46 == null) {
                str46 = "";
            }
            bgq0Var2 = bgq0Var;
            Boolean bool = x3oVar.c;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            List list7 = x3oVar.d;
            if (list7 != null) {
                List list8 = list7;
                str11 = str9;
                arrayList = arrayList2;
                r3 = new ArrayList(tcc.n(list8, 10));
                int i4 = 0;
                for (Object obj2 : list8) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        scc.m();
                        throw null;
                    }
                    j3o j3oVar = (j3o) obj2;
                    String a = j3oVar.getA();
                    String str47 = a == null ? "" : a;
                    String b = j3oVar.getB();
                    String str48 = b == null ? "" : b;
                    String c = j3oVar.getC();
                    String str49 = c == null ? "" : c;
                    zzs d = j3oVar.getD();
                    if (d == null) {
                        d = zzs.f;
                    }
                    r3.add(new e3o(str47, str48, str49, d, str44));
                    i4 = i5;
                }
            } else {
                str11 = str9;
                arrayList = arrayList2;
                r3 = list4;
            }
            lxjVar = new lxj(str45, str46, r3, booleanValue);
        } else {
            bgq0Var2 = bgq0Var;
            str11 = str9;
            arrayList = arrayList2;
            lxjVar = z7v0.a;
        }
        String str50 = kswVar.E;
        if (z) {
            yu21Var = yu21.c;
        } else {
            if (cn0Var != null) {
                cn0.e eVar = cn0Var.a;
                if (eVar != null ? eVar.c() : false) {
                    if (eVar != null) {
                        String b2 = eVar.getB();
                        if (b2 == null) {
                            b2 = "";
                        }
                        List c2 = eVar.getC();
                        if (c2 == null) {
                            c2 = list4;
                        }
                        yu21Var2 = new yu21(b2, c2);
                        if (cn0Var != null) {
                            cn0.b bVar2 = cn0Var.b;
                            if (bVar2 != null ? bVar2.d() : false) {
                                if (bVar2 == null) {
                                    xzbVar = xzb.e;
                                } else {
                                    String b3 = bVar2.getB();
                                    if (b3 != null) {
                                        Integer a2 = bVar2.getA();
                                        if (a2 == null) {
                                            lxjVar2 = lxjVar;
                                            xzbVar = xzb.e;
                                            xzbVar2 = xzbVar;
                                            il0 il0Var = il0.b;
                                            if (cn0Var != null) {
                                            }
                                            EditActionDto editActionDto = kswVar.G;
                                            if (cn0Var != null) {
                                            }
                                            cw1Var = kswVar.H;
                                            if (cw1Var != null) {
                                            }
                                            cn0.d dVar = kswVar.I;
                                            if (dVar != null) {
                                            }
                                            if (dVar != null) {
                                            }
                                            ob90Var = kswVar.J;
                                            if (ob90Var != null) {
                                            }
                                            return new v7v0(zzsVar, str15, str17, str18, formattedText, list3, str19, list2, formattedText2, suggestResult$SuggestAction2, str37, str23, str25, str26, str28, str30, str32, i, str2, str35, str36, list5, str6, str40, str7, str41, bgq0Var2, str11, str43, arrayList, lxjVar2, i4v0Var, str50, yu21Var2, xzbVar2, il0Var, editActionDto, r44, dw1Var, r46, r4, tb90Var);
                                        }
                                        int intValue2 = a2.intValue();
                                        List a3 = ul0Var != null ? ul0Var.getA() : null;
                                        if (a3 != null) {
                                            list4 = a3;
                                        }
                                        Iterator it4 = list4.iterator();
                                        while (true) {
                                            if (!it4.hasNext()) {
                                                lxjVar2 = lxjVar;
                                                obj = null;
                                                break;
                                            }
                                            obj = it4.next();
                                            lxjVar2 = lxjVar;
                                            if (jl40.l(((ul0.a) obj).getA(), b3)) {
                                                break;
                                            }
                                            lxjVar = lxjVar2;
                                        }
                                        ul0.a aVar2 = (ul0.a) obj;
                                        String b4 = aVar2 != null ? aVar2.getB() : null;
                                        if (b4 == null) {
                                            b4 = "";
                                        }
                                        FormattedText c3 = bVar2.getC();
                                        if (c3 == null) {
                                            c3 = FormattedText.c;
                                        }
                                        xzbVar2 = new xzb(intValue2, b3, b4, c3);
                                        il0 il0Var2 = il0.b;
                                        if (cn0Var != null) {
                                            cn0.a aVar3 = cn0Var.c;
                                            if ((aVar3 != null ? aVar3.b() : false) && aVar3 != null) {
                                                String a4 = aVar3.getA();
                                                if (a4 == null) {
                                                    a4 = "";
                                                }
                                                il0Var2 = new il0(a4, 0);
                                            }
                                        }
                                        EditActionDto editActionDto2 = kswVar.G;
                                        Integer a5 = (cn0Var != null || (bVar = cn0Var.b) == null) ? null : bVar.getA();
                                        cw1Var = kswVar.H;
                                        if (cw1Var != null) {
                                            AlternativeActionType.valueOf(cw1Var.a.name());
                                            dw1Var = new dw1(cw1Var.c, cw1Var.b, cw1Var.d);
                                        } else {
                                            dw1Var = null;
                                        }
                                        cn0.d dVar2 = kswVar.I;
                                        FormattedText formattedText3 = dVar2 != null ? dVar2.a : null;
                                        FormattedText formattedText4 = dVar2 != null ? dVar2.b : null;
                                        ob90Var = kswVar.J;
                                        if (ob90Var != null) {
                                            String str51 = ob90Var.a;
                                            zzs zzsVar4 = kswVar.d;
                                            if (str51 != null && zzsVar4 != null) {
                                                Double d2 = ob90Var.b;
                                                String str52 = ob90Var.c;
                                                if (str52 == null) {
                                                    str52 = "";
                                                }
                                                tb90Var = new tb90(str51, zzsVar4, d2, str52);
                                            }
                                        }
                                        return new v7v0(zzsVar, str15, str17, str18, formattedText, list3, str19, list2, formattedText2, suggestResult$SuggestAction2, str37, str23, str25, str26, str28, str30, str32, i, str2, str35, str36, list5, str6, str40, str7, str41, bgq0Var2, str11, str43, arrayList, lxjVar2, i4v0Var, str50, yu21Var2, xzbVar2, il0Var2, editActionDto2, a5, dw1Var, formattedText3, formattedText4, tb90Var);
                                    }
                                    xzbVar = xzb.e;
                                }
                                lxjVar2 = lxjVar;
                                xzbVar2 = xzbVar;
                                il0 il0Var22 = il0.b;
                                if (cn0Var != null) {
                                }
                                EditActionDto editActionDto22 = kswVar.G;
                                if (cn0Var != null) {
                                }
                                cw1Var = kswVar.H;
                                if (cw1Var != null) {
                                }
                                cn0.d dVar22 = kswVar.I;
                                if (dVar22 != null) {
                                }
                                if (dVar22 != null) {
                                }
                                ob90Var = kswVar.J;
                                if (ob90Var != null) {
                                }
                                return new v7v0(zzsVar, str15, str17, str18, formattedText, list3, str19, list2, formattedText2, suggestResult$SuggestAction2, str37, str23, str25, str26, str28, str30, str32, i, str2, str35, str36, list5, str6, str40, str7, str41, bgq0Var2, str11, str43, arrayList, lxjVar2, i4v0Var, str50, yu21Var2, xzbVar2, il0Var22, editActionDto22, a5, dw1Var, formattedText3, formattedText4, tb90Var);
                            }
                        }
                        lxjVar2 = lxjVar;
                        xzbVar = xzb.e;
                        xzbVar2 = xzbVar;
                        il0 il0Var222 = il0.b;
                        if (cn0Var != null) {
                        }
                        EditActionDto editActionDto222 = kswVar.G;
                        if (cn0Var != null) {
                        }
                        cw1Var = kswVar.H;
                        if (cw1Var != null) {
                        }
                        cn0.d dVar222 = kswVar.I;
                        if (dVar222 != null) {
                        }
                        if (dVar222 != null) {
                        }
                        ob90Var = kswVar.J;
                        if (ob90Var != null) {
                        }
                        return new v7v0(zzsVar, str15, str17, str18, formattedText, list3, str19, list2, formattedText2, suggestResult$SuggestAction2, str37, str23, str25, str26, str28, str30, str32, i, str2, str35, str36, list5, str6, str40, str7, str41, bgq0Var2, str11, str43, arrayList, lxjVar2, i4v0Var, str50, yu21Var2, xzbVar2, il0Var222, editActionDto222, a5, dw1Var, formattedText3, formattedText4, tb90Var);
                    }
                    yu21Var = yu21.c;
                }
            }
            yu21Var = yu21.c;
        }
        yu21Var2 = yu21Var;
        if (cn0Var != null) {
        }
        lxjVar2 = lxjVar;
        xzbVar = xzb.e;
        xzbVar2 = xzbVar;
        il0 il0Var2222 = il0.b;
        if (cn0Var != null) {
        }
        EditActionDto editActionDto2222 = kswVar.G;
        if (cn0Var != null) {
        }
        cw1Var = kswVar.H;
        if (cw1Var != null) {
        }
        cn0.d dVar2222 = kswVar.I;
        if (dVar2222 != null) {
        }
        if (dVar2222 != null) {
        }
        ob90Var = kswVar.J;
        if (ob90Var != null) {
        }
        return new v7v0(zzsVar, str15, str17, str18, formattedText, list3, str19, list2, formattedText2, suggestResult$SuggestAction2, str37, str23, str25, str26, str28, str30, str32, i, str2, str35, str36, list5, str6, str40, str7, str41, bgq0Var2, str11, str43, arrayList, lxjVar2, i4v0Var, str50, yu21Var2, xzbVar2, il0Var2222, editActionDto2222, a5, dw1Var, formattedText3, formattedText4, tb90Var);
    }

    public static /* synthetic */ v7v0 b(w7v0 w7v0Var, ksw kswVar, i4v0 i4v0Var, boolean z, ul0 ul0Var, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            ul0Var = null;
        }
        w7v0Var.getClass();
        return a(kswVar, i4v0Var, z, ul0Var, null);
    }
}
