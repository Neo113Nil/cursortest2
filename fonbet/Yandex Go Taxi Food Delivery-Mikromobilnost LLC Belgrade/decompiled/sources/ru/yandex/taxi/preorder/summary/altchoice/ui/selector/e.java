package ru.yandex.taxi.preorder.summary.altchoice.ui.selector;

import defpackage.ad5;
import defpackage.b8r;
import defpackage.bvf0;
import defpackage.c4r0;
import defpackage.daj0;
import defpackage.dzg0;
import defpackage.fef;
import defpackage.g8e;
import defpackage.gdc;
import defpackage.gly0;
import defpackage.h4j;
import defpackage.iaj0;
import defpackage.ici;
import defpackage.jci;
import defpackage.jl40;
import defpackage.kci;
import defpackage.lci;
import defpackage.maj0;
import defpackage.mi31;
import defpackage.mqg0;
import defpackage.n051;
import defpackage.n3h;
import defpackage.nu1;
import defpackage.ny61;
import defpackage.oci;
import defpackage.oep0;
import defpackage.pdc;
import defpackage.pex0;
import defpackage.ppi;
import defpackage.qu1;
import defpackage.ru1;
import defpackage.saj0;
import defpackage.su1;
import defpackage.tcc;
import defpackage.tt2;
import defpackage.ufu;
import defpackage.waj0;
import defpackage.wiq0;
import defpackage.xdf;
import defpackage.y051;
import defpackage.yvf0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.preorder.summary.altchoice.domain.RequiredOptionType;
import ru.yandex.taxi.summary.ui.SummaryStateTracker;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes6.dex */
public final class e extends ad5 {
    public final pdc A;
    public final SummaryStateTracker B;
    public final h4j C;
    public final b8r D;
    public final maj0 E;
    public final ru.yandex.taxi.widget.c F;
    public final lci G;
    public final oci H;
    public final yvf0 I;
    public final oep0 J;
    public final n3h K;
    public final wiq0 L;
    public final ici M;
    public final r0 N;
    public final AtomicBoolean O;
    public final tt2 x;
    public final xdf y;
    public final c4r0 z;

    public e(tt2 tt2Var, xdf xdfVar, c4r0 c4r0Var, pdc pdcVar, SummaryStateTracker summaryStateTracker, h4j h4jVar, b8r b8rVar, maj0 maj0Var, ru.yandex.taxi.widget.c cVar, lci lciVar, oci ociVar, yvf0 yvf0Var, oep0 oep0Var, n3h n3hVar, wiq0 wiq0Var, ici iciVar) {
        super(iaj0.class);
        this.x = tt2Var;
        this.y = xdfVar;
        this.z = c4r0Var;
        this.A = pdcVar;
        this.B = summaryStateTracker;
        this.C = h4jVar;
        this.D = b8rVar;
        this.E = maj0Var;
        this.F = cVar;
        this.G = lciVar;
        this.H = ociVar;
        this.I = yvf0Var;
        this.J = oep0Var;
        this.K = n3hVar;
        this.L = wiq0Var;
        this.M = iciVar;
        this.N = bvf0.c(null);
        this.O = new AtomicBoolean(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(e eVar, List list, fef fefVar, String str, kci kciVar, String str2, ContinuationImpl continuationImpl) {
        RequiredAltChoiceRadioOptionPresenter$prepareOptions$1 requiredAltChoiceRadioOptionPresenter$prepareOptions$1;
        int i;
        kci kciVar2;
        fef fefVar2;
        List list2;
        String str3;
        String str4;
        List list3;
        Object obj;
        String str5;
        String str6;
        ppi ppiVar;
        ppi ppiVar2;
        eVar.getClass();
        if (continuationImpl instanceof RequiredAltChoiceRadioOptionPresenter$prepareOptions$1) {
            requiredAltChoiceRadioOptionPresenter$prepareOptions$1 = (RequiredAltChoiceRadioOptionPresenter$prepareOptions$1) continuationImpl;
            int i2 = requiredAltChoiceRadioOptionPresenter$prepareOptions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requiredAltChoiceRadioOptionPresenter$prepareOptions$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = requiredAltChoiceRadioOptionPresenter$prepareOptions$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requiredAltChoiceRadioOptionPresenter$prepareOptions$1.label;
                if (i != 0) {
                    ArrayList t = g8e.t(obj2);
                    requiredAltChoiceRadioOptionPresenter$prepareOptions$1.L$0 = null;
                    requiredAltChoiceRadioOptionPresenter$prepareOptions$1.L$1 = fefVar;
                    requiredAltChoiceRadioOptionPresenter$prepareOptions$1.L$2 = str;
                    kciVar2 = kciVar;
                    requiredAltChoiceRadioOptionPresenter$prepareOptions$1.L$3 = kciVar2;
                    requiredAltChoiceRadioOptionPresenter$prepareOptions$1.L$4 = str2;
                    requiredAltChoiceRadioOptionPresenter$prepareOptions$1.L$5 = t;
                    requiredAltChoiceRadioOptionPresenter$prepareOptions$1.L$6 = t;
                    requiredAltChoiceRadioOptionPresenter$prepareOptions$1.label = 1;
                    Object Lg = eVar.Lg(list, fefVar, str, requiredAltChoiceRadioOptionPresenter$prepareOptions$1);
                    if (Lg == obj3) {
                        return obj3;
                    }
                    fefVar2 = fefVar;
                    list2 = t;
                    str3 = str2;
                    str4 = str;
                    list3 = list2;
                    obj2 = Lg;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list2 = (List) requiredAltChoiceRadioOptionPresenter$prepareOptions$1.L$6;
                    list3 = (List) requiredAltChoiceRadioOptionPresenter$prepareOptions$1.L$5;
                    str3 = (String) requiredAltChoiceRadioOptionPresenter$prepareOptions$1.L$4;
                    kciVar2 = (kci) requiredAltChoiceRadioOptionPresenter$prepareOptions$1.L$3;
                    str4 = (String) requiredAltChoiceRadioOptionPresenter$prepareOptions$1.L$2;
                    fefVar2 = (fef) requiredAltChoiceRadioOptionPresenter$prepareOptions$1.L$1;
                    kotlin.b.b(obj2);
                }
                list2.addAll((Collection) obj2);
                boolean z = str4 == null && jl40.l(str3, str4);
                if (kciVar2 != null) {
                    int i3 = kciVar2.a;
                    List list4 = kciVar2.d;
                    jci jciVar = kciVar2.b;
                    Iterator it = list4.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (jl40.l(((nu1) obj).b, str3)) {
                            break;
                        }
                    }
                    nu1 nu1Var = (nu1) obj;
                    if (nu1Var == null || (ppiVar2 = nu1Var.f) == null || (str5 = ppiVar2.e) == null) {
                        str5 = jciVar.c;
                    }
                    y051 n051Var = nu1Var == null ? gly0.w : new n051(z);
                    daj0 daj0Var = nu1Var == null ? new daj0(new gdc(mqg0.component_cinnaban_toxic), new gdc(mqg0.component_ever_front), jciVar.d) : null;
                    String str7 = jciVar.e;
                    String str8 = jciVar.a;
                    Integer valueOf = nu1Var != null ? Integer.valueOf(dzg0.chevron_next) : null;
                    if (nu1Var == null || (ppiVar = nu1Var.f) == null || (str6 = ppiVar.f) == null) {
                        str6 = jciVar.b;
                    }
                    list3.add(i3, new waj0("sdd_multislot", str7, str8, valueOf, str6, null, eVar.y.a(fefVar2, str5, false, true), null, daj0Var, n051Var, true, RequiredOptionType.DELIVERY_INTERVALS));
                }
                return list3;
            }
        }
        requiredAltChoiceRadioOptionPresenter$prepareOptions$1 = new RequiredAltChoiceRadioOptionPresenter$prepareOptions$1(eVar, continuationImpl);
        Object obj22 = requiredAltChoiceRadioOptionPresenter$prepareOptions$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requiredAltChoiceRadioOptionPresenter$prepareOptions$1.label;
        if (i != 0) {
        }
        list2.addAll((Collection) obj22);
        if (str4 == null) {
        }
        if (kciVar2 != null) {
        }
        return list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [daj0] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0178 -> B:10:0x0188). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x01ab -> B:13:0x01b1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Lg(List list, fef fefVar, String str, ContinuationImpl continuationImpl) {
        RequiredAltChoiceRadioOptionPresenter$createAltOptions$1 requiredAltChoiceRadioOptionPresenter$createAltOptions$1;
        int i;
        String str2;
        ArrayList arrayList;
        Iterator it;
        fef fefVar2;
        RequiredAltChoiceRadioOptionPresenter$createAltOptions$1 requiredAltChoiceRadioOptionPresenter$createAltOptions$12;
        String str3;
        String str4;
        pex0 pex0Var;
        pex0 b;
        CoroutineSingletons coroutineSingletons;
        ?? r26;
        if (continuationImpl instanceof RequiredAltChoiceRadioOptionPresenter$createAltOptions$1) {
            requiredAltChoiceRadioOptionPresenter$createAltOptions$1 = (RequiredAltChoiceRadioOptionPresenter$createAltOptions$1) continuationImpl;
            int i2 = requiredAltChoiceRadioOptionPresenter$createAltOptions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requiredAltChoiceRadioOptionPresenter$createAltOptions$1.label = i2 - Integer.MIN_VALUE;
                Object obj = requiredAltChoiceRadioOptionPresenter$createAltOptions$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requiredAltChoiceRadioOptionPresenter$createAltOptions$1.label;
                if (i != 0) {
                    str2 = null;
                    kotlin.b.b(obj);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        ru1 ru1Var = ((nu1) obj2).e.l;
                        if (ru1Var != null) {
                            saj0 saj0Var = (saj0) this.N.getValue();
                            if (saj0Var != null && (str4 = saj0Var.e) != null) {
                                mi31 d = b8r.d(this.D, ru1Var.a, str4, 4);
                                if (d != null && (pex0Var = d.a) != null && (b = pex0Var.b()) != null) {
                                    ArrayList b2 = ru.yandex.taxi.tariffs.model.b.b(b);
                                    if (!b2.isEmpty()) {
                                        Iterator it2 = b2.iterator();
                                        while (it2.hasNext()) {
                                            if (jl40.l(((nu1) it2.next()).b, ru1Var.b)) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        arrayList2.add(obj2);
                    }
                    arrayList = new ArrayList(tcc.n(arrayList2, 10));
                    it = arrayList2.iterator();
                    fefVar2 = fefVar;
                    requiredAltChoiceRadioOptionPresenter$createAltOptions$12 = requiredAltChoiceRadioOptionPresenter$createAltOptions$1;
                    str3 = str;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r4 = (Collection) requiredAltChoiceRadioOptionPresenter$createAltOptions$1.L$16;
                    String str5 = (String) requiredAltChoiceRadioOptionPresenter$createAltOptions$1.L$14;
                    String str6 = (String) requiredAltChoiceRadioOptionPresenter$createAltOptions$1.L$13;
                    String str7 = (String) requiredAltChoiceRadioOptionPresenter$createAltOptions$1.L$12;
                    String str8 = (String) requiredAltChoiceRadioOptionPresenter$createAltOptions$1.L$11;
                    String str9 = (String) requiredAltChoiceRadioOptionPresenter$createAltOptions$1.L$10;
                    String str10 = (String) requiredAltChoiceRadioOptionPresenter$createAltOptions$1.L$9;
                    nu1 nu1Var = (nu1) requiredAltChoiceRadioOptionPresenter$createAltOptions$1.L$8;
                    Iterator it3 = (Iterator) requiredAltChoiceRadioOptionPresenter$createAltOptions$1.L$6;
                    ?? r15 = (Collection) requiredAltChoiceRadioOptionPresenter$createAltOptions$1.L$5;
                    String str11 = (String) requiredAltChoiceRadioOptionPresenter$createAltOptions$1.L$2;
                    fef fefVar3 = (fef) requiredAltChoiceRadioOptionPresenter$createAltOptions$1.L$1;
                    kotlin.b.b(obj);
                    Object i3 = obj;
                    ArrayList arrayList3 = r15;
                    Iterator it4 = it3;
                    nu1 nu1Var2 = nu1Var;
                    String str12 = str10;
                    String str13 = str9;
                    String str14 = str8;
                    String str15 = str7;
                    String str16 = str6;
                    String str17 = str5;
                    String str18 = str11;
                    String str19 = null;
                    ArrayList arrayList4 = r4;
                    CharSequence charSequence = (CharSequence) i3;
                    if (charSequence != null) {
                        fefVar2 = fefVar3;
                        arrayList = arrayList4;
                        requiredAltChoiceRadioOptionPresenter$createAltOptions$12 = requiredAltChoiceRadioOptionPresenter$createAltOptions$1;
                        str3 = str18;
                        String str20 = str17;
                        String str21 = str16;
                        String str22 = str15;
                        String str23 = str14;
                        String str24 = str13;
                        String str25 = str12;
                        nu1 nu1Var3 = nu1Var2;
                        it = it4;
                        String str26 = str19;
                        ArrayList arrayList5 = arrayList;
                        RequiredAltChoiceRadioOptionPresenter$createAltOptions$1 requiredAltChoiceRadioOptionPresenter$createAltOptions$13 = requiredAltChoiceRadioOptionPresenter$createAltOptions$12;
                        ArrayList arrayList6 = arrayList5;
                        String str27 = str20;
                        String str28 = str21;
                        String str29 = str22;
                        String str30 = str23;
                        String str31 = str24;
                        String str32 = str25;
                        CharSequence charSequence2 = nu1Var3.e.e;
                        it4 = it;
                        nu1Var2 = nu1Var3;
                        String str33 = str26;
                        su1 su1Var = nu1Var2.e;
                        y051 n051Var = (su1Var.l == null || su1Var.m != null) ? gly0.w : new n051(jl40.l(nu1Var2.b, str3));
                        qu1 qu1Var = nu1Var2.e.g;
                        if (qu1Var != null) {
                            String str34 = qu1Var.a;
                            ufu ufuVar = (ufu) this.A;
                            r26 = new daj0(ufuVar.i(str34), ufuVar.i(qu1Var.b), qu1Var.c);
                        } else {
                            r26 = str33;
                        }
                        arrayList6.add(new waj0(str32, str31, str30, null, str29, str28, str27, charSequence2, r26, n051Var, nu1Var2.d, RequiredOptionType.ALT_CHOICE));
                        requiredAltChoiceRadioOptionPresenter$createAltOptions$12 = requiredAltChoiceRadioOptionPresenter$createAltOptions$13;
                        str2 = str33;
                        it = it4;
                        arrayList = arrayList3;
                        if (!it.hasNext()) {
                            nu1Var3 = (nu1) it.next();
                            str25 = nu1Var3.b;
                            su1 su1Var2 = nu1Var3.e;
                            str24 = su1Var2.h;
                            str23 = su1Var2.b;
                            str22 = su1Var2.c;
                            String str35 = su1Var2.d;
                            if (str35 != null) {
                                coroutineSingletons = coroutineSingletons2;
                                str20 = this.y.a(fefVar2, str35, false, true);
                            } else {
                                coroutineSingletons = coroutineSingletons2;
                                str20 = str2;
                            }
                            str21 = su1Var2.j;
                            FormattedText formattedText = su1Var2.f;
                            ?? r6 = str2;
                            if (formattedText != null) {
                                requiredAltChoiceRadioOptionPresenter$createAltOptions$12.L$0 = r6;
                                requiredAltChoiceRadioOptionPresenter$createAltOptions$12.L$1 = fefVar2;
                                requiredAltChoiceRadioOptionPresenter$createAltOptions$12.L$2 = str3;
                                requiredAltChoiceRadioOptionPresenter$createAltOptions$12.L$3 = r6;
                                requiredAltChoiceRadioOptionPresenter$createAltOptions$12.L$4 = r6;
                                requiredAltChoiceRadioOptionPresenter$createAltOptions$12.L$5 = arrayList;
                                requiredAltChoiceRadioOptionPresenter$createAltOptions$12.L$6 = it;
                                requiredAltChoiceRadioOptionPresenter$createAltOptions$12.L$7 = r6;
                                requiredAltChoiceRadioOptionPresenter$createAltOptions$12.L$8 = nu1Var3;
                                requiredAltChoiceRadioOptionPresenter$createAltOptions$12.L$9 = str25;
                                requiredAltChoiceRadioOptionPresenter$createAltOptions$12.L$10 = str24;
                                requiredAltChoiceRadioOptionPresenter$createAltOptions$12.L$11 = str23;
                                requiredAltChoiceRadioOptionPresenter$createAltOptions$12.L$12 = str22;
                                requiredAltChoiceRadioOptionPresenter$createAltOptions$12.L$13 = str21;
                                requiredAltChoiceRadioOptionPresenter$createAltOptions$12.L$14 = str20;
                                requiredAltChoiceRadioOptionPresenter$createAltOptions$12.L$15 = r6;
                                requiredAltChoiceRadioOptionPresenter$createAltOptions$12.L$16 = arrayList;
                                requiredAltChoiceRadioOptionPresenter$createAltOptions$12.label = 1;
                                fef fefVar4 = fefVar2;
                                i3 = ru.yandex.taxi.widget.c.i(this.F, formattedText, r6, requiredAltChoiceRadioOptionPresenter$createAltOptions$12, 30);
                                coroutineSingletons2 = coroutineSingletons;
                                if (i3 == coroutineSingletons2) {
                                    return coroutineSingletons2;
                                }
                                arrayList3 = arrayList;
                                it4 = it;
                                fefVar3 = fefVar4;
                                nu1Var2 = nu1Var3;
                                str12 = str25;
                                str13 = str24;
                                str14 = str23;
                                str15 = str22;
                                str16 = str21;
                                str17 = str20;
                                str18 = str3;
                                requiredAltChoiceRadioOptionPresenter$createAltOptions$1 = requiredAltChoiceRadioOptionPresenter$createAltOptions$12;
                                arrayList4 = arrayList3;
                                str19 = r6;
                                CharSequence charSequence3 = (CharSequence) i3;
                                if (charSequence3 != null) {
                                    charSequence2 = charSequence3;
                                    fefVar2 = fefVar3;
                                    str27 = str17;
                                    str28 = str16;
                                    str29 = str15;
                                    str30 = str14;
                                    str31 = str13;
                                    str32 = str12;
                                    requiredAltChoiceRadioOptionPresenter$createAltOptions$13 = requiredAltChoiceRadioOptionPresenter$createAltOptions$1;
                                    str3 = str18;
                                    arrayList6 = arrayList4;
                                    str33 = str19;
                                    su1 su1Var3 = nu1Var2.e;
                                    y051 n051Var2 = (su1Var3.l == null || su1Var3.m != null) ? gly0.w : new n051(jl40.l(nu1Var2.b, str3));
                                    qu1 qu1Var2 = nu1Var2.e.g;
                                    if (qu1Var2 != null) {
                                    }
                                    arrayList6.add(new waj0(str32, str31, str30, null, str29, str28, str27, charSequence2, r26, n051Var2, nu1Var2.d, RequiredOptionType.ALT_CHOICE));
                                    requiredAltChoiceRadioOptionPresenter$createAltOptions$12 = requiredAltChoiceRadioOptionPresenter$createAltOptions$13;
                                    str2 = str33;
                                    it = it4;
                                    arrayList = arrayList3;
                                    if (!it.hasNext()) {
                                        return arrayList;
                                    }
                                }
                            } else {
                                coroutineSingletons2 = coroutineSingletons;
                                arrayList3 = arrayList;
                                str26 = r6;
                                ArrayList arrayList52 = arrayList;
                                RequiredAltChoiceRadioOptionPresenter$createAltOptions$1 requiredAltChoiceRadioOptionPresenter$createAltOptions$132 = requiredAltChoiceRadioOptionPresenter$createAltOptions$12;
                                ArrayList arrayList62 = arrayList52;
                                String str272 = str20;
                                String str282 = str21;
                                String str292 = str22;
                                String str302 = str23;
                                String str312 = str24;
                                String str322 = str25;
                                CharSequence charSequence22 = nu1Var3.e.e;
                                it4 = it;
                                nu1Var2 = nu1Var3;
                                String str332 = str26;
                                su1 su1Var32 = nu1Var2.e;
                                y051 n051Var22 = (su1Var32.l == null || su1Var32.m != null) ? gly0.w : new n051(jl40.l(nu1Var2.b, str3));
                                qu1 qu1Var22 = nu1Var2.e.g;
                                if (qu1Var22 != null) {
                                }
                                arrayList62.add(new waj0(str322, str312, str302, null, str292, str282, str272, charSequence22, r26, n051Var22, nu1Var2.d, RequiredOptionType.ALT_CHOICE));
                                requiredAltChoiceRadioOptionPresenter$createAltOptions$12 = requiredAltChoiceRadioOptionPresenter$createAltOptions$132;
                                str2 = str332;
                                it = it4;
                                arrayList = arrayList3;
                                if (!it.hasNext()) {
                                }
                            }
                        }
                    }
                }
            }
        }
        requiredAltChoiceRadioOptionPresenter$createAltOptions$1 = new RequiredAltChoiceRadioOptionPresenter$createAltOptions$1(this, continuationImpl);
        Object obj3 = requiredAltChoiceRadioOptionPresenter$createAltOptions$1.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requiredAltChoiceRadioOptionPresenter$createAltOptions$1.label;
        if (i != 0) {
        }
    }

    public final void Mg(String str) {
        kci kciVar;
        Object obj;
        saj0 saj0Var = (saj0) this.N.getValue();
        if (saj0Var == null || (kciVar = saj0Var.f) == null) {
            return;
        }
        Iterator it = kciVar.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (jl40.l(((nu1) obj).b, str)) {
                    break;
                }
            }
        }
        nu1 nu1Var = (nu1) obj;
        if (nu1Var == null) {
            return;
        }
        this.G.a(nu1Var.b, saj0Var.d);
        this.z.d(SelectionOrigin.USER, nu1Var.a.J0, saj0Var.e, true);
    }
}
