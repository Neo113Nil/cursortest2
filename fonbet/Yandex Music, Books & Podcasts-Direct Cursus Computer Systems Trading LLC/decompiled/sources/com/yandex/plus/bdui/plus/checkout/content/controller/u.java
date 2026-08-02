package com.yandex.plus.bdui.plus.checkout.content.controller;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.plus.bdui.plus.checkout.content.serializer.p3;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.CounterOffersContentView;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r0w;
import defpackage.v75;
import defpackage.xq0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class u extends a {
    public final com.yandex.plus.core.imageloader.b b;
    public final com.yandex.plus.pay.ui.design.api.api.a c;
    public final com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d d;
    public final com.yandex.plus.home.internal.di.y e;
    public final com.yandex.plus.log.api.b f;
    public com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.f g;
    public com.yandex.plus.bdui.content.d h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.yandex.plus.bdui.m mVar, com.yandex.plus.core.imageloader.b bVar, com.yandex.plus.pay.ui.design.api.api.a aVar, com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d dVar, com.yandex.plus.home.internal.di.y yVar, com.yandex.plus.log.api.b bVar2) {
        super(mVar);
        mVar.getClass();
        bVar.getClass();
        aVar.getClass();
        dVar.getClass();
        yVar.getClass();
        bVar2.getClass();
        this.b = bVar;
        this.c = aVar;
        this.d = dVar;
        this.e = yVar;
        this.f = bVar2;
    }

    @Override // com.yandex.plus.bdui.ui.c
    public final void a(View view) {
        view.getClass();
        this.g = null;
        this.h = null;
    }

    @Override // com.yandex.plus.bdui.ui.c
    public final View b(ViewGroup viewGroup) {
        viewGroup.getClass();
        Context context = viewGroup.getContext();
        context.getClass();
        CounterOffersContentView counterOffersContentView = new CounterOffersContentView(context, null, 0, 0, 14, null);
        int i = 0;
        com.yandex.plus.bdui.flex.factory.d dVar = new com.yandex.plus.bdui.flex.factory.d(0, this, u.class, "onCloseClick", "onCloseClick()V", i, 28);
        int i2 = 1;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.f fVar = new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.f(counterOffersContentView, this.b, this.c, dVar, new com.yandex.passport.internal.ui.challenge.vpn.c(i2, this, u.class, "onOfferShow", "onOfferShow(I)V", i, 15), new com.yandex.passport.internal.ui.challenge.vpn.c(i2, this, u.class, "onOfferClick", "onOfferClick(I)V", i, 16));
        this.g = fVar;
        com.yandex.plus.core.insets.d dVar2 = new com.yandex.plus.core.insets.d(0);
        r rVar = new r(fVar, 0);
        com.yandex.plus.core.insets.a aVar = new com.yandex.plus.core.insets.a();
        aVar.b = new LinkedHashSet(2);
        aVar.d();
        aVar.c();
        dVar2.b.put(rVar, aVar);
        dVar2.b(counterOffersContentView);
        return counterOffersContentView;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.yandex.plus.bdui.ui.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(com.yandex.plus.bdui.content.d dVar, com.yandex.plus.bdui.flex.ui.t tVar, Continuation continuation) {
        s sVar;
        int i;
        com.yandex.plus.log.api.b bVar;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.f fVar;
        Object g;
        com.yandex.plus.log.api.a aVar;
        if (continuation instanceof s) {
            sVar = (s) continuation;
            int i2 = sVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sVar.n = i2 - Integer.MIN_VALUE;
                Object obj = sVar.l;
                Object obj2 = nm6.a;
                i = sVar.n;
                bVar = this.f;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!dVar.d) {
                        fVar = this.g;
                        if (fVar != null) {
                            this.h = dVar;
                            p3 p3Var = (p3) dVar.b;
                            sVar.j = dVar;
                            sVar.k = fVar;
                            sVar.n = 1;
                            g = g(p3Var, sVar);
                            if (g == obj2) {
                                return obj2;
                            }
                        } else {
                            com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.d;
                            if (bVar.b(aVar2)) {
                                bVar.c(aVar2, "PlusPayCounterOffersContentController", "onUpdateStateAsync(); content view controller not found!");
                            }
                        }
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.f fVar2 = sVar.k;
                com.yandex.plus.bdui.content.d dVar2 = sVar.j;
                qgg.h0(obj);
                fVar = fVar2;
                dVar = dVar2;
                g = obj;
                com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.d dVar3 = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.d) g;
                aVar = com.yandex.plus.log.api.a.c;
                if (bVar.b(aVar)) {
                    bVar.c(aVar, "PlusPayCounterOffersContentController", "onUpdateStateAsync(); set counter offers content = " + dVar3);
                }
                fVar.a.setVisibility(0);
                fVar.f(dVar3);
                com.yandex.plus.pay.ui.core.mobile.view.toolbar.h d = a.d(((p3) dVar.b).a);
                if (bVar.b(aVar)) {
                    bVar.c(aVar, "PlusPayCounterOffersContentController", "onUpdateStateAsync(); apply toolbar state = " + d);
                }
                fVar.m.a(d);
                return Unit.a;
            }
        }
        sVar = new s(this, continuation);
        Object obj3 = sVar.l;
        Object obj22 = nm6.a;
        i = sVar.n;
        bVar = this.f;
        if (i != 0) {
        }
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.d dVar32 = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.d) g;
        aVar = com.yandex.plus.log.api.a.c;
        if (bVar.b(aVar)) {
        }
        fVar.a.setVisibility(0);
        fVar.f(dVar32);
        com.yandex.plus.pay.ui.core.mobile.view.toolbar.h d2 = a.d(((p3) dVar.b).a);
        if (bVar.b(aVar)) {
        }
        fVar.m.a(d2);
        return Unit.a;
    }

    public final void e(com.yandex.plus.bdui.content.d dVar, com.yandex.plus.bdui.action.a aVar, Map map) {
        if (aVar != null) {
            this.a.a.a(aVar, new com.yandex.plus.bdui.action.h(dVar.c), map);
            return;
        }
        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.d;
        com.yandex.plus.log.api.b bVar = this.f;
        if (bVar.b(aVar2)) {
            bVar.c(aVar2, "PlusPayCounterOffersContentController", "dispatchAction(); action is null");
        }
    }

    public final Object f(PlusPayRichText plusPayRichText, t tVar) {
        return ((com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.h) this.d).a(plusPayRichText, new r0w(21, this), tVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fd, code lost:
    
        if (r2 == r4) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0216 -> B:26:0x0221). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(p3 p3Var, cg6 cg6Var) {
        t tVar;
        CharSequence charSequence;
        PlusPayRichText plusPayRichText;
        CharSequence charSequence2;
        p3 p3Var2;
        CharSequence charSequence3;
        Iterator it;
        CharSequence charSequence4;
        int i;
        int i2;
        CharSequence charSequence5;
        p3 p3Var3;
        int i3;
        List list;
        Iterator it2;
        ArrayList arrayList;
        CharSequence charSequence6;
        ArrayList arrayList2;
        Iterator it3;
        ArrayList arrayList3;
        com.yandex.plus.bdui.plus.checkout.content.i iVar;
        t tVar2;
        int i4;
        CharSequence charSequence7;
        int i5;
        ArrayList arrayList4;
        t tVar3;
        CharSequence charSequence8;
        p3 p3Var4;
        CharSequence charSequence9;
        List list2;
        CharSequence charSequence10;
        p3 p3Var5;
        p3 p3Var6;
        ArrayList arrayList5;
        Collection collection;
        List list3;
        Iterator it4;
        PlusPayRichText plusPayRichText2;
        List list4;
        CharSequence charSequence11;
        CharSequence charSequence12;
        CharSequence charSequence13;
        List list5;
        CharSequence charSequence14;
        CharSequence charSequence15;
        p3 p3Var7 = p3Var;
        if (cg6Var instanceof t) {
            tVar = (t) cg6Var;
            int i6 = tVar.G;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                tVar.G = i6 - Integer.MIN_VALUE;
                Object obj = tVar.E;
                nm6 nm6Var = nm6.a;
                switch (tVar.G) {
                    case 0:
                        qgg.h0(obj);
                        PlusPayRichText plusPayRichText3 = p3Var7.b;
                        if (plusPayRichText3 == null) {
                            charSequence = null;
                            plusPayRichText = p3Var7.c;
                            if (plusPayRichText != null) {
                                charSequence2 = null;
                                ArrayList arrayList6 = p3Var7.d;
                                ArrayList arrayList7 = new ArrayList(v75.o(arrayList6, 10));
                                p3 p3Var8 = p3Var7;
                                it = arrayList6.iterator();
                                int i7 = 0;
                                charSequence4 = charSequence;
                                int i8 = 0;
                                if (!it.hasNext()) {
                                }
                                return nm6Var;
                            }
                            tVar.j = p3Var7;
                            tVar.k = charSequence;
                            tVar.G = 2;
                            Object f = f(plusPayRichText, tVar);
                            if (f != nm6Var) {
                                p3Var2 = p3Var7;
                                charSequence3 = charSequence;
                                obj = f;
                                CharSequence charSequence16 = (CharSequence) obj;
                                charSequence = charSequence3;
                                p3Var7 = p3Var2;
                                charSequence2 = charSequence16;
                                ArrayList arrayList62 = p3Var7.d;
                                ArrayList arrayList72 = new ArrayList(v75.o(arrayList62, 10));
                                p3 p3Var82 = p3Var7;
                                it = arrayList62.iterator();
                                int i72 = 0;
                                charSequence4 = charSequence;
                                int i82 = 0;
                                if (!it.hasNext()) {
                                    com.yandex.plus.bdui.plus.checkout.content.i iVar2 = (com.yandex.plus.bdui.plus.checkout.content.i) it.next();
                                    List list6 = iVar2.a;
                                    PlusPayRichText plusPayRichText4 = iVar2.b;
                                    tVar.j = p3Var82;
                                    tVar.k = null;
                                    tVar.l = null;
                                    ArrayList arrayList8 = arrayList72;
                                    tVar.m = arrayList8;
                                    tVar.n = it;
                                    tVar.o = iVar2;
                                    tVar.p = list6;
                                    tVar.q = charSequence4;
                                    tVar.r = charSequence2;
                                    tVar.s = arrayList8;
                                    tVar.t = null;
                                    tVar.u = null;
                                    tVar.v = null;
                                    tVar.w = null;
                                    tVar.x = null;
                                    tVar.y = null;
                                    tVar.z = i82;
                                    tVar.A = i72;
                                    tVar.B = 0;
                                    tVar.G = 3;
                                    Object f2 = f(plusPayRichText4, tVar);
                                    if (f2 != nm6Var) {
                                        CharSequence charSequence17 = charSequence4;
                                        i2 = i82;
                                        ArrayList arrayList9 = arrayList72;
                                        p3Var3 = p3Var82;
                                        charSequence5 = charSequence2;
                                        i = i72;
                                        ArrayList arrayList10 = iVar2.c;
                                        t tVar4 = tVar;
                                        ArrayList arrayList11 = new ArrayList(v75.o(arrayList10, 10));
                                        Iterator it5 = arrayList10.iterator();
                                        i3 = 0;
                                        list = list6;
                                        it2 = it;
                                        arrayList = arrayList9;
                                        charSequence6 = (CharSequence) f2;
                                        arrayList2 = arrayList11;
                                        it3 = it5;
                                        arrayList3 = arrayList72;
                                        iVar = iVar2;
                                        tVar2 = tVar4;
                                        i4 = 0;
                                        charSequence7 = charSequence17;
                                        i5 = 0;
                                        if (!it3.hasNext()) {
                                            ArrayList arrayList12 = arrayList3;
                                            PlusPayRichText plusPayRichText5 = (PlusPayRichText) it3.next();
                                            tVar2.j = p3Var3;
                                            p3Var6 = p3Var3;
                                            tVar2.k = null;
                                            tVar2.l = null;
                                            tVar2.m = arrayList;
                                            tVar2.n = it2;
                                            tVar2.o = iVar;
                                            tVar2.p = list;
                                            tVar2.q = charSequence6;
                                            tVar2.r = null;
                                            tVar2.s = null;
                                            ArrayList arrayList13 = arrayList2;
                                            tVar2.t = arrayList13;
                                            tVar2.u = it3;
                                            tVar2.v = arrayList13;
                                            tVar2.w = charSequence7;
                                            tVar2.x = charSequence5;
                                            tVar2.y = arrayList12;
                                            tVar2.z = i2;
                                            tVar2.A = i;
                                            tVar2.B = i3;
                                            tVar2.C = i5;
                                            tVar2.D = i4;
                                            tVar2.G = 4;
                                            Object f3 = f(plusPayRichText5, tVar2);
                                            if (f3 != nm6Var) {
                                                arrayList5 = arrayList;
                                                collection = arrayList2;
                                                list3 = list;
                                                it4 = it2;
                                                obj = f3;
                                                arrayList3 = arrayList12;
                                                collection.add((CharSequence) obj);
                                                it2 = it4;
                                                arrayList = arrayList5;
                                                p3Var3 = p3Var6;
                                                list = list3;
                                                if (!it3.hasNext()) {
                                                    arrayList3.add(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.a(list, charSequence6, arrayList2, iVar.d, iVar.e, iVar.f));
                                                    it = it2;
                                                    i72 = i;
                                                    i82 = i2;
                                                    tVar = tVar2;
                                                    charSequence2 = charSequence5;
                                                    charSequence4 = charSequence7;
                                                    p3Var82 = p3Var3;
                                                    arrayList72 = arrayList;
                                                    if (!it.hasNext()) {
                                                        arrayList4 = arrayList72;
                                                        PlusPayRichText plusPayRichText6 = p3Var82.e;
                                                        if (plusPayRichText6 != null) {
                                                            tVar.j = p3Var82;
                                                            tVar.k = charSequence4;
                                                            tVar.l = charSequence2;
                                                            tVar.m = arrayList4;
                                                            tVar.n = null;
                                                            tVar.o = null;
                                                            tVar.p = null;
                                                            tVar.q = null;
                                                            tVar.r = null;
                                                            tVar.s = null;
                                                            tVar.t = null;
                                                            tVar.u = null;
                                                            tVar.v = null;
                                                            tVar.w = null;
                                                            tVar.x = null;
                                                            tVar.y = null;
                                                            tVar.G = 5;
                                                            obj = f(plusPayRichText6, tVar);
                                                            if (obj != nm6Var) {
                                                                p3Var5 = p3Var82;
                                                                CharSequence charSequence18 = charSequence2;
                                                                list2 = arrayList4;
                                                                charSequence10 = (CharSequence) obj;
                                                                tVar3 = tVar;
                                                                p3Var4 = p3Var5;
                                                                charSequence8 = charSequence4;
                                                                charSequence9 = charSequence18;
                                                                plusPayRichText2 = p3Var4.f;
                                                                if (plusPayRichText2 == null) {
                                                                    list4 = list2;
                                                                    charSequence11 = charSequence9;
                                                                    charSequence12 = charSequence8;
                                                                    charSequence13 = null;
                                                                    return new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.d(charSequence12, charSequence11, list4, charSequence10, charSequence13, p3Var4.g, p3Var4.h);
                                                                }
                                                                tVar3.j = p3Var4;
                                                                tVar3.k = charSequence8;
                                                                tVar3.l = charSequence9;
                                                                tVar3.m = list2;
                                                                tVar3.n = charSequence10;
                                                                tVar3.o = null;
                                                                tVar3.p = null;
                                                                tVar3.q = null;
                                                                tVar3.r = null;
                                                                tVar3.s = null;
                                                                tVar3.t = null;
                                                                tVar3.u = null;
                                                                tVar3.v = null;
                                                                tVar3.w = null;
                                                                tVar3.x = null;
                                                                tVar3.y = null;
                                                                tVar3.G = 6;
                                                                obj = f(plusPayRichText2, tVar3);
                                                                if (obj != nm6Var) {
                                                                    list5 = list2;
                                                                    charSequence14 = charSequence9;
                                                                    charSequence15 = charSequence8;
                                                                    list4 = list5;
                                                                    charSequence11 = charSequence14;
                                                                    charSequence12 = charSequence15;
                                                                    charSequence13 = (CharSequence) obj;
                                                                    return new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.d(charSequence12, charSequence11, list4, charSequence10, charSequence13, p3Var4.g, p3Var4.h);
                                                                }
                                                            }
                                                        } else {
                                                            tVar3 = tVar;
                                                            charSequence8 = charSequence4;
                                                            p3Var4 = p3Var82;
                                                            charSequence9 = charSequence2;
                                                            list2 = arrayList4;
                                                            charSequence10 = null;
                                                            plusPayRichText2 = p3Var4.f;
                                                            if (plusPayRichText2 == null) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return nm6Var;
                        }
                        tVar.j = p3Var7;
                        tVar.G = 1;
                        obj = f(plusPayRichText3, tVar);
                        break;
                    case 1:
                        p3Var7 = tVar.j;
                        qgg.h0(obj);
                        charSequence = (CharSequence) obj;
                        plusPayRichText = p3Var7.c;
                        if (plusPayRichText != null) {
                        }
                        break;
                    case 2:
                        charSequence3 = tVar.k;
                        p3Var2 = tVar.j;
                        qgg.h0(obj);
                        CharSequence charSequence162 = (CharSequence) obj;
                        charSequence = charSequence3;
                        p3Var7 = p3Var2;
                        charSequence2 = charSequence162;
                        ArrayList arrayList622 = p3Var7.d;
                        ArrayList arrayList722 = new ArrayList(v75.o(arrayList622, 10));
                        p3 p3Var822 = p3Var7;
                        it = arrayList622.iterator();
                        int i722 = 0;
                        charSequence4 = charSequence;
                        int i822 = 0;
                        if (!it.hasNext()) {
                        }
                        return nm6Var;
                    case 3:
                        int i9 = tVar.B;
                        i = tVar.A;
                        i2 = tVar.z;
                        Collection collection2 = tVar.s;
                        charSequence5 = tVar.r;
                        CharSequence charSequence19 = tVar.q;
                        List list7 = tVar.p;
                        com.yandex.plus.bdui.plus.checkout.content.i iVar3 = tVar.o;
                        Iterator it6 = (Iterator) tVar.n;
                        Collection collection3 = tVar.m;
                        p3 p3Var9 = tVar.j;
                        qgg.h0(obj);
                        p3Var3 = p3Var9;
                        CharSequence charSequence20 = (CharSequence) obj;
                        ArrayList arrayList14 = iVar3.c;
                        t tVar5 = tVar;
                        ArrayList arrayList15 = new ArrayList(v75.o(arrayList14, 10));
                        Iterator it7 = arrayList14.iterator();
                        i3 = i9;
                        list = list7;
                        it2 = it6;
                        arrayList = collection3;
                        charSequence6 = charSequence20;
                        arrayList2 = arrayList15;
                        it3 = it7;
                        arrayList3 = collection2;
                        iVar = iVar3;
                        tVar2 = tVar5;
                        i4 = 0;
                        charSequence7 = charSequence19;
                        i5 = 0;
                        if (!it3.hasNext()) {
                        }
                        break;
                    case 4:
                        int i10 = tVar.D;
                        int i11 = tVar.C;
                        int i12 = tVar.B;
                        int i13 = tVar.A;
                        int i14 = tVar.z;
                        Collection collection4 = tVar.y;
                        CharSequence charSequence21 = tVar.x;
                        CharSequence charSequence22 = tVar.w;
                        collection = tVar.v;
                        Iterator it8 = tVar.u;
                        Collection collection5 = tVar.t;
                        Collection collection6 = tVar.s;
                        CharSequence charSequence23 = tVar.q;
                        List list8 = tVar.p;
                        com.yandex.plus.bdui.plus.checkout.content.i iVar4 = tVar.o;
                        it4 = (Iterator) tVar.n;
                        arrayList5 = tVar.m;
                        p3 p3Var10 = tVar.j;
                        qgg.h0(obj);
                        p3Var6 = p3Var10;
                        iVar = iVar4;
                        list3 = list8;
                        arrayList2 = collection5;
                        charSequence5 = charSequence21;
                        i3 = i12;
                        i5 = i11;
                        i = i13;
                        charSequence6 = charSequence23;
                        i2 = i14;
                        charSequence7 = charSequence22;
                        arrayList3 = collection4;
                        it3 = it8;
                        tVar2 = tVar;
                        i4 = i10;
                        collection.add((CharSequence) obj);
                        it2 = it4;
                        arrayList = arrayList5;
                        p3Var3 = p3Var6;
                        list = list3;
                        if (!it3.hasNext()) {
                        }
                        break;
                    case 5:
                        arrayList4 = (List) tVar.m;
                        charSequence2 = tVar.l;
                        charSequence4 = tVar.k;
                        p3Var5 = tVar.j;
                        qgg.h0(obj);
                        CharSequence charSequence182 = charSequence2;
                        list2 = arrayList4;
                        charSequence10 = (CharSequence) obj;
                        tVar3 = tVar;
                        p3Var4 = p3Var5;
                        charSequence8 = charSequence4;
                        charSequence9 = charSequence182;
                        plusPayRichText2 = p3Var4.f;
                        if (plusPayRichText2 == null) {
                        }
                        break;
                    case 6:
                        charSequence10 = (CharSequence) tVar.n;
                        list5 = (List) tVar.m;
                        charSequence14 = tVar.l;
                        charSequence15 = tVar.k;
                        p3Var4 = tVar.j;
                        qgg.h0(obj);
                        list4 = list5;
                        charSequence11 = charSequence14;
                        charSequence12 = charSequence15;
                        charSequence13 = (CharSequence) obj;
                        return new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.d(charSequence12, charSequence11, list4, charSequence10, charSequence13, p3Var4.g, p3Var4.h);
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        tVar = new t(this, cg6Var);
        Object obj2 = tVar.E;
        nm6 nm6Var2 = nm6.a;
        switch (tVar.G) {
        }
    }
}
