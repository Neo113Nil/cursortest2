package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers;

import com.yandex.passport.sloth.ui.p;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayCounterOffers;
import com.yandex.plus.pay.internal.model.PlusPayCounterOffersReason;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.l;
import defpackage.b6e;
import defpackage.bfu;
import defpackage.cdk;
import defpackage.cg6;
import defpackage.dfi;
import defpackage.jhp;
import defpackage.nm6;
import defpackage.nrn;
import defpackage.o7t;
import defpackage.ot0;
import defpackage.qgg;
import defpackage.t75;
import defpackage.u75;
import defpackage.v75;
import defpackage.x97;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.ydr;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;

/* loaded from: classes5.dex */
public final class k extends bfu {
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a k;
    public final com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a l;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.i m;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.f n;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.error.a o;
    public final com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d p;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.c q;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.c r;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.d s;
    public final LinkedHashSet t;
    public PlusPayCounterOffersReason u;
    public PlusPayCounterOffers v;
    public final xdr w;
    public final xdr x;

    public k(com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a aVar, com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a aVar2, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.i iVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.f fVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.error.a aVar3, com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d dVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.c cVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.c cVar2, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.d dVar2) {
        aVar.getClass();
        aVar2.getClass();
        iVar.getClass();
        fVar.getClass();
        aVar3.getClass();
        dVar.getClass();
        cVar.getClass();
        cVar2.getClass();
        dVar2.getClass();
        this.k = aVar;
        this.l = aVar2;
        this.m = iVar;
        this.n = fVar;
        this.o = aVar3;
        this.p = dVar;
        this.q = cVar;
        this.r = cVar2;
        this.s = dVar2;
        this.t = new LinkedHashSet();
        this.u = PlusPayCounterOffersReason.UNEXPECTED;
        xdr a = ydr.a(g.a);
        this.w = a;
        this.x = a;
        x97.y(ot0.F(this), null, null, new p(this, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r15v21, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v51, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x02c8 -> B:25:0x02e0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(k kVar, PlusPayCounterOffers plusPayCounterOffers, cg6 cg6Var) {
        j jVar;
        com.yandex.plus.pay.ui.common.internal.error.content.h a;
        PlusPayCounterOffers plusPayCounterOffers2;
        CharSequence charSequence;
        com.yandex.plus.pay.ui.common.internal.error.content.h hVar;
        Object obj;
        PlusPayRichText subtitle;
        CharSequence charSequence2;
        com.yandex.plus.pay.ui.common.internal.error.content.h hVar2;
        CharSequence charSequence3;
        PlusPayCounterOffers plusPayCounterOffers3;
        Object obj2;
        PlusPayCounterOffers plusPayCounterOffers4;
        Iterator it;
        CharSequence charSequence4;
        CharSequence charSequence5;
        CharSequence charSequence6;
        CharSequence charSequence7;
        ArrayList arrayList;
        Iterator it2;
        List list;
        PlusPayCounterOffers.CounterOffer counterOffer;
        int i;
        nm6 nm6Var;
        ArrayList arrayList2;
        PlusPayCounterOffers plusPayCounterOffers5;
        int i2;
        int i3;
        ArrayList arrayList3;
        int i4;
        int i5;
        Iterator it3;
        com.yandex.plus.pay.ui.common.internal.error.content.h hVar3;
        j jVar2;
        int i6;
        int i7;
        nm6 nm6Var2;
        ArrayList arrayList4;
        CharSequence charSequence8;
        j jVar3;
        com.yandex.plus.pay.ui.common.internal.error.content.h hVar4;
        CharSequence charSequence9;
        com.yandex.plus.pay.ui.common.internal.error.content.h hVar5;
        PlusPayCounterOffers plusPayCounterOffers6;
        ArrayList arrayList5;
        nm6 nm6Var3;
        List list2;
        CharSequence charSequence10;
        com.yandex.plus.pay.ui.common.internal.error.content.h hVar6;
        ArrayList arrayList6;
        int i8;
        int i9;
        Iterator it4;
        CharSequence charSequence11;
        int i10;
        int i11;
        Object obj3;
        j jVar4;
        ArrayList arrayList7;
        Collection collection;
        PlusPayRichText supportText;
        CharSequence charSequence12;
        List list3;
        CharSequence charSequence13;
        CharSequence charSequence14;
        CharSequence charSequence15;
        CharSequence charSequence16;
        List list4;
        CharSequence charSequence17;
        CharSequence charSequence18;
        if (cg6Var instanceof j) {
            jVar = (j) cg6Var;
            int i12 = jVar.J;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                jVar.J = i12 - Integer.MIN_VALUE;
                Object obj4 = jVar.H;
                nm6 nm6Var4 = nm6.a;
                switch (jVar.J) {
                    case 0:
                        qgg.h0(obj4);
                        a = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.error.b) kVar.o).a(kVar.l.a.a());
                        PlusPayRichText title = plusPayCounterOffers.getTitle();
                        if (title != null) {
                            PlusPayRichText G = kVar.G(title);
                            jVar.j = plusPayCounterOffers;
                            jVar.k = a;
                            jVar.J = 1;
                            Object H = kVar.H(G, jVar);
                            if (H != nm6Var4) {
                                hVar = a;
                                obj = H;
                                plusPayCounterOffers2 = plusPayCounterOffers;
                                com.yandex.plus.pay.ui.common.internal.error.content.h hVar7 = hVar;
                                charSequence = (CharSequence) obj;
                                a = hVar7;
                                subtitle = plusPayCounterOffers2.getSubtitle();
                                if (subtitle != null) {
                                    PlusPayRichText G2 = kVar.G(subtitle);
                                    jVar.j = plusPayCounterOffers2;
                                    jVar.k = a;
                                    jVar.l = charSequence;
                                    jVar.J = 2;
                                    Object H2 = kVar.H(G2, jVar);
                                    if (H2 != nm6Var4) {
                                        PlusPayCounterOffers plusPayCounterOffers7 = plusPayCounterOffers2;
                                        hVar2 = a;
                                        charSequence3 = charSequence;
                                        plusPayCounterOffers3 = plusPayCounterOffers7;
                                        obj2 = H2;
                                        charSequence2 = (CharSequence) obj2;
                                        PlusPayCounterOffers plusPayCounterOffers8 = plusPayCounterOffers3;
                                        charSequence = charSequence3;
                                        a = hVar2;
                                        plusPayCounterOffers2 = plusPayCounterOffers8;
                                        List<PlusPayCounterOffers.CounterOffer> offers = plusPayCounterOffers2.getOffers();
                                        ArrayList arrayList8 = new ArrayList(v75.o(offers, 10));
                                        plusPayCounterOffers4 = plusPayCounterOffers2;
                                        it = offers.iterator();
                                        ArrayList arrayList9 = arrayList8;
                                        int i13 = 0;
                                        int i14 = 0;
                                        com.yandex.plus.pay.ui.common.internal.error.content.h hVar8 = a;
                                        CharSequence charSequence19 = charSequence;
                                        charSequence4 = charSequence2;
                                        int i15 = 0;
                                        if (!it.hasNext()) {
                                            Object next = it.next();
                                            int i16 = i13 + 1;
                                            if (i13 < 0) {
                                                u75.n();
                                                throw null;
                                            }
                                            PlusPayCounterOffers.CounterOffer counterOffer2 = (PlusPayCounterOffers.CounterOffer) next;
                                            List c = t75.c(counterOffer2.getIcon());
                                            PlusPayRichText G3 = kVar.G(counterOffer2.getTitle());
                                            jVar.j = plusPayCounterOffers4;
                                            jVar.k = hVar8;
                                            ArrayList arrayList10 = arrayList9;
                                            jVar.l = null;
                                            jVar.m = null;
                                            ArrayList arrayList11 = arrayList10;
                                            jVar.n = arrayList11;
                                            jVar.o = it;
                                            jVar.p = counterOffer2;
                                            jVar.q = c;
                                            jVar.r = charSequence19;
                                            jVar.s = charSequence4;
                                            jVar.t = arrayList11;
                                            jVar.u = null;
                                            jVar.v = null;
                                            jVar.w = null;
                                            jVar.x = null;
                                            jVar.y = null;
                                            jVar.z = null;
                                            jVar.A = i14;
                                            jVar.B = i15;
                                            jVar.C = i16;
                                            jVar.D = i13;
                                            jVar.E = 0;
                                            jVar.J = 3;
                                            Object H3 = kVar.H(G3, jVar);
                                            if (H3 != nm6Var4) {
                                                charSequence6 = charSequence19;
                                                int i17 = i15;
                                                com.yandex.plus.pay.ui.common.internal.error.content.h hVar9 = hVar8;
                                                int i18 = i14;
                                                charSequence5 = charSequence4;
                                                List<PlusPayRichText> benefits = counterOffer2.getBenefits();
                                                j jVar5 = jVar;
                                                int i19 = i13;
                                                charSequence7 = (CharSequence) H3;
                                                arrayList = new ArrayList(v75.o(benefits, 10));
                                                it2 = benefits.iterator();
                                                list = c;
                                                counterOffer = counterOffer2;
                                                i = 0;
                                                nm6Var = nm6Var4;
                                                arrayList2 = arrayList10;
                                                plusPayCounterOffers5 = plusPayCounterOffers4;
                                                i2 = i19;
                                                i3 = i17;
                                                arrayList3 = arrayList10;
                                                i4 = i16;
                                                i5 = i18;
                                                it3 = it;
                                                hVar3 = hVar9;
                                                jVar2 = jVar5;
                                                i6 = 0;
                                                i7 = 0;
                                                if (!it2.hasNext()) {
                                                    arrayList5 = arrayList2;
                                                    PlusPayRichText G4 = kVar.G((PlusPayRichText) it2.next());
                                                    jVar2.j = plusPayCounterOffers5;
                                                    jVar2.k = hVar3;
                                                    PlusPayCounterOffers plusPayCounterOffers9 = plusPayCounterOffers5;
                                                    jVar2.l = null;
                                                    jVar2.m = null;
                                                    jVar2.n = arrayList3;
                                                    jVar2.o = it3;
                                                    jVar2.p = counterOffer;
                                                    jVar2.q = list;
                                                    jVar2.r = charSequence7;
                                                    jVar2.s = null;
                                                    jVar2.t = null;
                                                    ArrayList arrayList12 = arrayList;
                                                    jVar2.u = arrayList12;
                                                    jVar2.v = it2;
                                                    jVar2.w = arrayList12;
                                                    jVar2.x = charSequence6;
                                                    jVar2.y = charSequence5;
                                                    jVar2.z = arrayList5;
                                                    jVar2.A = i5;
                                                    jVar2.B = i3;
                                                    jVar2.C = i4;
                                                    jVar2.D = i2;
                                                    jVar2.E = i;
                                                    int i20 = i7;
                                                    jVar2.F = i20;
                                                    CharSequence charSequence20 = charSequence7;
                                                    jVar2.G = i6;
                                                    jVar2.J = 4;
                                                    Object H4 = kVar.H(G4, jVar2);
                                                    nm6Var3 = nm6Var;
                                                    if (H4 == nm6Var3) {
                                                        return nm6Var3;
                                                    }
                                                    i7 = i20;
                                                    list2 = list;
                                                    charSequence10 = charSequence20;
                                                    plusPayCounterOffers5 = plusPayCounterOffers9;
                                                    hVar6 = hVar3;
                                                    arrayList6 = arrayList3;
                                                    i8 = i3;
                                                    i9 = i5;
                                                    it4 = it2;
                                                    charSequence11 = charSequence6;
                                                    i10 = i;
                                                    i11 = i4;
                                                    obj3 = H4;
                                                    jVar4 = jVar2;
                                                    arrayList7 = arrayList;
                                                    collection = arrayList7;
                                                    collection.add((CharSequence) obj3);
                                                    arrayList = arrayList7;
                                                    jVar2 = jVar4;
                                                    i = i10;
                                                    it2 = it4;
                                                    i4 = i11;
                                                    i3 = i8;
                                                    charSequence6 = charSequence11;
                                                    i5 = i9;
                                                    charSequence7 = charSequence10;
                                                    arrayList3 = arrayList6;
                                                    hVar3 = hVar6;
                                                    nm6Var = nm6Var3;
                                                    list = list2;
                                                    arrayList2 = arrayList5;
                                                    if (!it2.hasNext()) {
                                                        PlusPayCounterOffers plusPayCounterOffers10 = plusPayCounterOffers5;
                                                        ArrayList arrayList13 = arrayList2;
                                                        nm6 nm6Var5 = nm6Var;
                                                        arrayList13.add(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.a(list, charSequence7, arrayList, counterOffer.getButtonText(), counterOffer.getAdditionalButtonText(), i2 == 0));
                                                        jVar = jVar2;
                                                        i13 = i4;
                                                        charSequence4 = charSequence5;
                                                        charSequence19 = charSequence6;
                                                        hVar8 = hVar3;
                                                        i14 = i5;
                                                        nm6Var4 = nm6Var5;
                                                        arrayList9 = arrayList3;
                                                        it = it3;
                                                        i15 = i3;
                                                        plusPayCounterOffers4 = plusPayCounterOffers10;
                                                        if (!it.hasNext()) {
                                                            nm6Var2 = nm6Var4;
                                                            arrayList4 = arrayList9;
                                                            PlusPayRichText alternativeActionText = plusPayCounterOffers4.getAlternativeActionText();
                                                            if (alternativeActionText != null) {
                                                                PlusPayRichText G5 = kVar.G(alternativeActionText);
                                                                jVar.j = plusPayCounterOffers4;
                                                                jVar.k = hVar8;
                                                                jVar.l = charSequence19;
                                                                jVar.m = charSequence4;
                                                                jVar.n = arrayList4;
                                                                jVar.o = null;
                                                                jVar.p = null;
                                                                jVar.q = null;
                                                                jVar.r = null;
                                                                jVar.s = null;
                                                                jVar.t = null;
                                                                jVar.u = null;
                                                                jVar.v = null;
                                                                jVar.w = null;
                                                                jVar.x = null;
                                                                jVar.y = null;
                                                                jVar.z = null;
                                                                jVar.J = 5;
                                                                Object H5 = kVar.H(G5, jVar);
                                                                if (H5 == nm6Var2) {
                                                                    return nm6Var2;
                                                                }
                                                                charSequence8 = charSequence19;
                                                                obj4 = H5;
                                                                hVar5 = hVar8;
                                                                plusPayCounterOffers6 = plusPayCounterOffers4;
                                                                charSequence9 = (CharSequence) obj4;
                                                                jVar3 = jVar;
                                                                hVar4 = hVar5;
                                                                plusPayCounterOffers4 = plusPayCounterOffers6;
                                                                supportText = plusPayCounterOffers4.getSupportText();
                                                                if (supportText == null) {
                                                                    charSequence12 = charSequence9;
                                                                    list3 = arrayList4;
                                                                    charSequence13 = charSequence4;
                                                                    charSequence14 = null;
                                                                    charSequence15 = charSequence8;
                                                                    return new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.d(charSequence15, charSequence13, list3, charSequence12, charSequence14, hVar4.c, hVar4.d);
                                                                }
                                                                PlusPayRichText G6 = kVar.G(supportText);
                                                                jVar3.j = null;
                                                                jVar3.k = hVar4;
                                                                jVar3.l = charSequence8;
                                                                jVar3.m = charSequence4;
                                                                jVar3.n = arrayList4;
                                                                jVar3.o = charSequence9;
                                                                jVar3.p = null;
                                                                jVar3.q = null;
                                                                jVar3.r = null;
                                                                jVar3.s = null;
                                                                jVar3.t = null;
                                                                jVar3.u = null;
                                                                jVar3.v = null;
                                                                jVar3.w = null;
                                                                jVar3.x = null;
                                                                jVar3.y = null;
                                                                jVar3.z = null;
                                                                jVar3.J = 6;
                                                                Object H6 = kVar.H(G6, jVar3);
                                                                if (H6 == nm6Var2) {
                                                                    return nm6Var2;
                                                                }
                                                                CharSequence charSequence21 = charSequence9;
                                                                obj4 = H6;
                                                                charSequence16 = charSequence21;
                                                                list4 = arrayList4;
                                                                charSequence17 = charSequence4;
                                                                charSequence18 = charSequence8;
                                                                charSequence12 = charSequence16;
                                                                list3 = list4;
                                                                charSequence13 = charSequence17;
                                                                charSequence15 = charSequence18;
                                                                charSequence14 = (CharSequence) obj4;
                                                                return new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.d(charSequence15, charSequence13, list3, charSequence12, charSequence14, hVar4.c, hVar4.d);
                                                            }
                                                            charSequence8 = charSequence19;
                                                            jVar3 = jVar;
                                                            hVar4 = hVar8;
                                                            charSequence9 = null;
                                                            supportText = plusPayCounterOffers4.getSupportText();
                                                            if (supportText == null) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    charSequence2 = null;
                                    List<PlusPayCounterOffers.CounterOffer> offers2 = plusPayCounterOffers2.getOffers();
                                    ArrayList arrayList82 = new ArrayList(v75.o(offers2, 10));
                                    plusPayCounterOffers4 = plusPayCounterOffers2;
                                    it = offers2.iterator();
                                    ArrayList arrayList92 = arrayList82;
                                    int i132 = 0;
                                    int i142 = 0;
                                    com.yandex.plus.pay.ui.common.internal.error.content.h hVar82 = a;
                                    CharSequence charSequence192 = charSequence;
                                    charSequence4 = charSequence2;
                                    int i152 = 0;
                                    if (!it.hasNext()) {
                                    }
                                }
                            }
                            return nm6Var4;
                        }
                        plusPayCounterOffers2 = plusPayCounterOffers;
                        charSequence = null;
                        subtitle = plusPayCounterOffers2.getSubtitle();
                        if (subtitle != null) {
                        }
                    case 1:
                        com.yandex.plus.pay.ui.common.internal.error.content.h hVar10 = jVar.k;
                        plusPayCounterOffers2 = jVar.j;
                        qgg.h0(obj4);
                        hVar = hVar10;
                        obj = obj4;
                        com.yandex.plus.pay.ui.common.internal.error.content.h hVar72 = hVar;
                        charSequence = (CharSequence) obj;
                        a = hVar72;
                        subtitle = plusPayCounterOffers2.getSubtitle();
                        if (subtitle != null) {
                        }
                        break;
                    case 2:
                        obj2 = obj4;
                        charSequence3 = jVar.l;
                        hVar2 = jVar.k;
                        plusPayCounterOffers3 = jVar.j;
                        qgg.h0(obj2);
                        charSequence2 = (CharSequence) obj2;
                        PlusPayCounterOffers plusPayCounterOffers82 = plusPayCounterOffers3;
                        charSequence = charSequence3;
                        a = hVar2;
                        plusPayCounterOffers2 = plusPayCounterOffers82;
                        List<PlusPayCounterOffers.CounterOffer> offers22 = plusPayCounterOffers2.getOffers();
                        ArrayList arrayList822 = new ArrayList(v75.o(offers22, 10));
                        plusPayCounterOffers4 = plusPayCounterOffers2;
                        it = offers22.iterator();
                        ArrayList arrayList922 = arrayList822;
                        int i1322 = 0;
                        int i1422 = 0;
                        com.yandex.plus.pay.ui.common.internal.error.content.h hVar822 = a;
                        CharSequence charSequence1922 = charSequence;
                        charSequence4 = charSequence2;
                        int i1522 = 0;
                        if (!it.hasNext()) {
                        }
                        break;
                    case 3:
                        int i21 = jVar.E;
                        int i22 = jVar.D;
                        int i23 = jVar.C;
                        int i24 = jVar.B;
                        int i25 = jVar.A;
                        Collection collection2 = jVar.t;
                        charSequence5 = jVar.s;
                        CharSequence charSequence22 = jVar.r;
                        List list5 = jVar.q;
                        PlusPayCounterOffers.CounterOffer counterOffer3 = jVar.p;
                        Iterator it5 = (Iterator) jVar.o;
                        Collection collection3 = jVar.n;
                        com.yandex.plus.pay.ui.common.internal.error.content.h hVar11 = jVar.k;
                        PlusPayCounterOffers plusPayCounterOffers11 = jVar.j;
                        qgg.h0(obj4);
                        charSequence6 = charSequence22;
                        List<PlusPayRichText> benefits2 = counterOffer3.getBenefits();
                        j jVar6 = jVar;
                        charSequence7 = (CharSequence) obj4;
                        arrayList = new ArrayList(v75.o(benefits2, 10));
                        it2 = benefits2.iterator();
                        list = list5;
                        counterOffer = counterOffer3;
                        i = i21;
                        nm6Var = nm6Var4;
                        arrayList2 = collection2;
                        plusPayCounterOffers5 = plusPayCounterOffers11;
                        i2 = i22;
                        i3 = i24;
                        arrayList3 = collection3;
                        i4 = i23;
                        i5 = i25;
                        it3 = it5;
                        hVar3 = hVar11;
                        jVar2 = jVar6;
                        i6 = 0;
                        i7 = 0;
                        if (!it2.hasNext()) {
                        }
                        break;
                    case 4:
                        int i26 = jVar.G;
                        int i27 = jVar.F;
                        i10 = jVar.E;
                        int i28 = jVar.D;
                        i11 = jVar.C;
                        i8 = jVar.B;
                        int i29 = jVar.A;
                        Collection collection4 = jVar.z;
                        CharSequence charSequence23 = jVar.y;
                        CharSequence charSequence24 = jVar.x;
                        collection = jVar.w;
                        Iterator it6 = jVar.v;
                        Collection collection5 = jVar.u;
                        charSequence10 = jVar.r;
                        List list6 = jVar.q;
                        PlusPayCounterOffers.CounterOffer counterOffer4 = jVar.p;
                        Iterator it7 = (Iterator) jVar.o;
                        arrayList6 = jVar.n;
                        hVar6 = jVar.k;
                        PlusPayCounterOffers plusPayCounterOffers12 = jVar.j;
                        qgg.h0(obj4);
                        i6 = i26;
                        counterOffer = counterOffer4;
                        i7 = i27;
                        charSequence5 = charSequence23;
                        it3 = it7;
                        list2 = list6;
                        i9 = i29;
                        arrayList5 = collection4;
                        nm6Var3 = nm6Var4;
                        charSequence11 = charSequence24;
                        i2 = i28;
                        plusPayCounterOffers5 = plusPayCounterOffers12;
                        it4 = it6;
                        arrayList7 = collection5;
                        jVar4 = jVar;
                        obj3 = obj4;
                        collection.add((CharSequence) obj3);
                        arrayList = arrayList7;
                        jVar2 = jVar4;
                        i = i10;
                        it2 = it4;
                        i4 = i11;
                        i3 = i8;
                        charSequence6 = charSequence11;
                        i5 = i9;
                        charSequence7 = charSequence10;
                        arrayList3 = arrayList6;
                        hVar3 = hVar6;
                        nm6Var = nm6Var3;
                        list = list2;
                        arrayList2 = arrayList5;
                        if (!it2.hasNext()) {
                        }
                        break;
                    case 5:
                        arrayList4 = (List) jVar.n;
                        charSequence4 = jVar.m;
                        charSequence8 = jVar.l;
                        hVar5 = jVar.k;
                        plusPayCounterOffers6 = jVar.j;
                        qgg.h0(obj4);
                        nm6Var2 = nm6Var4;
                        charSequence9 = (CharSequence) obj4;
                        jVar3 = jVar;
                        hVar4 = hVar5;
                        plusPayCounterOffers4 = plusPayCounterOffers6;
                        supportText = plusPayCounterOffers4.getSupportText();
                        if (supportText == null) {
                        }
                        break;
                    case 6:
                        charSequence16 = (CharSequence) jVar.o;
                        list4 = (List) jVar.n;
                        charSequence17 = jVar.m;
                        charSequence18 = jVar.l;
                        hVar4 = jVar.k;
                        qgg.h0(obj4);
                        charSequence12 = charSequence16;
                        list3 = list4;
                        charSequence13 = charSequence17;
                        charSequence15 = charSequence18;
                        charSequence14 = (CharSequence) obj4;
                        return new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.d(charSequence15, charSequence13, list3, charSequence12, charSequence14, hVar4.c, hVar4.d);
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        jVar = new j(kVar, cg6Var);
        Object obj42 = jVar.H;
        nm6 nm6Var42 = nm6.a;
        switch (jVar.J) {
        }
    }

    public final PlusPayRichText G(PlusPayRichText plusPayRichText) {
        l lVar = new l(1, this.q, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.c.class, "isLinkSupported", "isLinkSupported(Ljava/lang/String;)Z", 0, 5);
        plusPayRichText.getClass();
        StringBuilder sb = new StringBuilder(plusPayRichText.getText());
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : com.yandex.plus.pay.ui.common.api.utils.b.a(plusPayRichText).entrySet()) {
            String str = (String) entry.getKey();
            PlusPayRichText.Item item = (PlusPayRichText.Item) entry.getValue();
            if (item instanceof PlusPayRichText.Item.Link) {
                PlusPayRichText.Item.Link link = (PlusPayRichText.Item.Link) item;
                if (((Boolean) lVar.invoke(link.getLink())).booleanValue()) {
                    arrayList.add(item);
                } else {
                    List<IntRange> k = jhp.k(new o7t(Regex.c(new Regex(str, nrn.LITERAL), sb), com.yandex.plus.pay.ui.common.api.utils.a.b));
                    String data = link.getData();
                    for (IntRange intRange : k) {
                        sb.replace(intRange.a, intRange.b + 1, data);
                    }
                }
            } else {
                if (!(item instanceof PlusPayRichText.Item.Icon) && !(item instanceof PlusPayRichText.Item.TextColor) && !(item instanceof PlusPayRichText.Item.Highlight) && !(item instanceof PlusPayRichText.Item.Strikethrough) && !(item instanceof PlusPayRichText.Item.Text)) {
                    b6e.s();
                    return null;
                }
                arrayList.add(item);
            }
        }
        return new PlusPayRichText(sb.toString(), arrayList);
    }

    public final Object H(PlusPayRichText plusPayRichText, j jVar) {
        return ((com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.h) this.p).a(plusPayRichText, new com.yandex.plus.pay.internal.feature.counter_offers.f(4, this), jVar);
    }

    @Override // defpackage.bfu
    public final void onCleared() {
        PlusPayCounterOffers plusPayCounterOffers = this.v;
        if (plusPayCounterOffers != null) {
            com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a = this.l.a.a();
            PlusPayCounterOffersReason plusPayCounterOffersReason = this.u;
            com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e eVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e) this.s;
            eVar.getClass();
            plusPayCounterOffersReason.getClass();
            cdk cdkVar = eVar.a;
            String d = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(a.a);
            PlusPayCompositeOffers.Offer offer = a.b.a;
            PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
            String id = tariffOffer != null ? tariffOffer.getId() : null;
            if (id == null) {
                id = "no_value";
            }
            List<PlusPayCompositeOffers.Offer.Option> optionOffers = offer.getOptionOffers();
            ArrayList arrayList = new ArrayList(v75.o(optionOffers, 10));
            Iterator<T> it = optionOffers.iterator();
            while (it.hasNext()) {
                arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
            }
            String a2 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e.a(plusPayCounterOffers);
            String code = plusPayCounterOffersReason.getCode();
            cdkVar.getClass();
            d.getClass();
            a2.getClass();
            code.getClass();
            LinkedHashMap m = dfi.m("purchase_session_id", d, "product_id", id);
            m.put("options_id", arrayList);
            m.put("target", a2);
            m.put("reason", code);
            m.put("_meta", cdk.c(new HashMap()));
            cdkVar.f("CounterOffers.Screen.Closed", m);
        }
        super.onCleared();
    }
}
