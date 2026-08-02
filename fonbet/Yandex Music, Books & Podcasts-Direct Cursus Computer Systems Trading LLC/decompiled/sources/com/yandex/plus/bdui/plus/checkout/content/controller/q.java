package com.yandex.plus.bdui.plus.checkout.content.controller;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.plus.bdui.plus.checkout.content.serializer.z2;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.ClosingOfferContentView;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r0w;
import defpackage.s9f;
import defpackage.v75;
import defpackage.xq0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class q extends a {
    public final com.yandex.plus.core.imageloader.b b;
    public final com.yandex.plus.pay.ui.design.api.api.a c;
    public final com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d d;
    public final com.yandex.plus.home.internal.di.y e;
    public final com.yandex.plus.log.api.b f;
    public com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.c g;
    public com.yandex.plus.bdui.content.d h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.yandex.plus.bdui.m mVar, com.yandex.plus.core.imageloader.b bVar, com.yandex.plus.pay.ui.design.api.api.a aVar, com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d dVar, com.yandex.plus.home.internal.di.y yVar, com.yandex.plus.log.api.b bVar2) {
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
        ClosingOfferContentView closingOfferContentView = new ClosingOfferContentView(context, null, 0, 0, 14, null);
        int i = 0;
        int i2 = 0;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.c cVar = new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.c(closingOfferContentView, this.b, this.c, new com.yandex.plus.bdui.flex.factory.d(i2, this, q.class, "onCloseButtonClick", "onCloseButtonClick()V", i, 25), new com.yandex.plus.bdui.flex.factory.d(i2, this, q.class, "onPrimaryButtonClick", "onPrimaryButtonClick()V", i, 26), new com.yandex.plus.bdui.flex.factory.d(i2, this, q.class, "onSecondaryButtonClick", "onSecondaryButtonClick()V", i, 27));
        this.g = cVar;
        com.yandex.plus.core.insets.d dVar = new com.yandex.plus.core.insets.d(0);
        n nVar = new n(cVar, 0);
        com.yandex.plus.core.insets.a aVar = new com.yandex.plus.core.insets.a();
        aVar.b = new LinkedHashSet(2);
        aVar.d();
        aVar.c();
        dVar.b.put(nVar, aVar);
        dVar.b(closingOfferContentView);
        return closingOfferContentView;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.yandex.plus.bdui.ui.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(com.yandex.plus.bdui.content.d dVar, com.yandex.plus.bdui.flex.ui.t tVar, Continuation continuation) {
        o oVar;
        int i;
        com.yandex.plus.log.api.b bVar;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.c cVar;
        Object g;
        com.yandex.plus.log.api.a aVar;
        if (continuation instanceof o) {
            oVar = (o) continuation;
            int i2 = oVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar.n = i2 - Integer.MIN_VALUE;
                Object obj = oVar.l;
                Object obj2 = nm6.a;
                i = oVar.n;
                bVar = this.f;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!dVar.d) {
                        cVar = this.g;
                        if (cVar != null) {
                            this.h = dVar;
                            com.yandex.plus.bdui.plus.checkout.content.h hVar = (com.yandex.plus.bdui.plus.checkout.content.h) dVar.b;
                            oVar.j = dVar;
                            oVar.k = cVar;
                            oVar.n = 1;
                            g = g(hVar, oVar);
                            if (g == obj2) {
                                return obj2;
                            }
                        } else {
                            com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.d;
                            if (bVar.b(aVar2)) {
                                bVar.c(aVar2, "PlusPayClosingOfferContentController", "onUpdateStateAsync(); content view controller not found!");
                            }
                        }
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.c cVar2 = oVar.k;
                com.yandex.plus.bdui.content.d dVar2 = oVar.j;
                qgg.h0(obj);
                cVar = cVar2;
                dVar = dVar2;
                g = obj;
                com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.a aVar3 = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.a) g;
                aVar = com.yandex.plus.log.api.a.c;
                if (bVar.b(aVar)) {
                    bVar.c(aVar, "PlusPayClosingOfferContentController", "onUpdateStateAsync(); set closing offer content = " + aVar3);
                }
                cVar.d(aVar3);
                com.yandex.plus.pay.ui.core.mobile.view.toolbar.h d = a.d(((z2) ((com.yandex.plus.bdui.plus.checkout.content.h) dVar.b)).a);
                if (bVar.b(aVar)) {
                    bVar.c(aVar, "PlusPayClosingOfferContentController", "onUpdateStateAsync(); apply toolbar state = " + d);
                }
                ((com.yandex.plus.pay.ui.core.mobile.view.toolbar.i) cVar.m.getValue()).a(d);
                return Unit.a;
            }
        }
        oVar = new o(this, continuation);
        Object obj3 = oVar.l;
        Object obj22 = nm6.a;
        i = oVar.n;
        bVar = this.f;
        if (i != 0) {
        }
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.a aVar32 = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.a) g;
        aVar = com.yandex.plus.log.api.a.c;
        if (bVar.b(aVar)) {
        }
        cVar.d(aVar32);
        com.yandex.plus.pay.ui.core.mobile.view.toolbar.h d2 = a.d(((z2) ((com.yandex.plus.bdui.plus.checkout.content.h) dVar.b)).a);
        if (bVar.b(aVar)) {
        }
        ((com.yandex.plus.pay.ui.core.mobile.view.toolbar.i) cVar.m.getValue()).a(d2);
        return Unit.a;
    }

    public final void e(com.yandex.plus.bdui.content.d dVar, com.yandex.plus.bdui.action.a aVar) {
        this.a.a.a(aVar, new com.yandex.plus.bdui.action.h(dVar.c), null);
    }

    public final Object f(PlusPayRichText plusPayRichText, p pVar) {
        return ((com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.h) this.d).a(plusPayRichText, new r0w(20, this), pVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0135, code lost:
    
        if (r2 == r4) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x024c -> B:16:0x0251). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0264 -> B:17:0x0261). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(com.yandex.plus.bdui.plus.checkout.content.h hVar, cg6 cg6Var) {
        p pVar;
        com.yandex.plus.core.data.common.y yVar;
        CharSequence charSequence;
        CharSequence charSequence2;
        com.yandex.plus.bdui.plus.checkout.content.h hVar2;
        CharSequence charSequence3;
        com.yandex.plus.bdui.plus.checkout.content.h hVar3;
        p pVar2;
        com.yandex.plus.core.data.common.y yVar2;
        Iterator it;
        Collection collection;
        int i;
        CharSequence charSequence4;
        int i2;
        int i3;
        int i4;
        CharSequence charSequence5;
        CharSequence charSequence6;
        com.yandex.plus.core.data.common.y yVar3;
        com.yandex.plus.bdui.plus.checkout.content.g gVar;
        Collection collection2;
        int i5;
        Object obj;
        com.yandex.plus.bdui.plus.checkout.content.h hVar4;
        int i6;
        int i7;
        Collection collection3;
        Iterator it2;
        nm6 nm6Var;
        CharSequence charSequence7;
        com.yandex.plus.core.data.common.y yVar4;
        CharSequence charSequence8;
        Collection collection4;
        com.yandex.plus.core.data.common.y yVar5;
        CharSequence charSequence9;
        CharSequence charSequence10;
        PlusPayRichText plusPayRichText;
        com.yandex.plus.bdui.plus.checkout.content.h hVar5;
        p pVar3;
        Collection collection5;
        CharSequence charSequence11;
        com.yandex.plus.bdui.plus.checkout.content.h hVar6;
        CharSequence charSequence12;
        Collection collection6;
        Object f;
        List list;
        String str;
        String str2;
        CharSequence charSequence13;
        CharSequence charSequence14;
        com.yandex.plus.core.data.common.y yVar6;
        List list2;
        CharSequence charSequence15;
        String str3;
        String str4;
        CharSequence charSequence16;
        com.yandex.plus.bdui.plus.checkout.content.h hVar7 = hVar;
        if (cg6Var instanceof p) {
            pVar = (p) cg6Var;
            int i8 = pVar.C;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                pVar.C = i8 - Integer.MIN_VALUE;
                Object obj2 = pVar.A;
                nm6 nm6Var2 = nm6.a;
                switch (pVar.C) {
                    case 0:
                        qgg.h0(obj2);
                        z2 z2Var = (z2) hVar7;
                        yVar = z2Var.b;
                        PlusPayRichText plusPayRichText2 = z2Var.c;
                        pVar.j = hVar7;
                        pVar.k = yVar;
                        pVar.C = 1;
                        obj2 = f(plusPayRichText2, pVar);
                        break;
                    case 1:
                        com.yandex.plus.core.data.common.y yVar7 = pVar.k;
                        com.yandex.plus.bdui.plus.checkout.content.h hVar8 = pVar.j;
                        qgg.h0(obj2);
                        yVar = yVar7;
                        hVar7 = hVar8;
                        charSequence = (CharSequence) obj2;
                        PlusPayRichText plusPayRichText3 = ((z2) hVar7).d;
                        if (plusPayRichText3 != null) {
                            pVar.j = hVar7;
                            pVar.k = yVar;
                            pVar.l = charSequence;
                            pVar.C = 2;
                            Object f2 = f(plusPayRichText3, pVar);
                            if (f2 != nm6Var2) {
                                hVar2 = hVar7;
                                charSequence3 = charSequence;
                                obj2 = f2;
                                CharSequence charSequence17 = (CharSequence) obj2;
                                charSequence = charSequence3;
                                hVar7 = hVar2;
                                charSequence2 = charSequence17;
                                ArrayList arrayList = ((z2) hVar7).e;
                                ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                                hVar3 = hVar7;
                                pVar2 = pVar;
                                yVar2 = yVar;
                                it = arrayList.iterator();
                                collection = arrayList2;
                                i = 0;
                                charSequence4 = charSequence;
                                i2 = 0;
                                if (!it.hasNext()) {
                                    com.yandex.plus.bdui.plus.checkout.content.g gVar2 = (com.yandex.plus.bdui.plus.checkout.content.g) it.next();
                                    PlusPayRichText plusPayRichText4 = gVar2.a;
                                    pVar2.j = hVar3;
                                    pVar2.k = null;
                                    pVar2.l = null;
                                    pVar2.m = collection;
                                    pVar2.n = it;
                                    pVar2.o = null;
                                    pVar2.p = gVar2;
                                    pVar2.q = yVar2;
                                    pVar2.r = charSequence4;
                                    pVar2.s = charSequence2;
                                    pVar2.t = collection;
                                    pVar2.u = null;
                                    pVar2.v = null;
                                    pVar2.w = null;
                                    pVar2.x = i2;
                                    pVar2.y = i;
                                    pVar2.z = 0;
                                    pVar2.C = 3;
                                    Object f3 = f(plusPayRichText4, pVar2);
                                    if (f3 != nm6Var2) {
                                        collection2 = collection;
                                        gVar = gVar2;
                                        charSequence6 = charSequence4;
                                        charSequence5 = charSequence2;
                                        i4 = i2;
                                        obj2 = f3;
                                        yVar3 = yVar2;
                                        pVar = pVar2;
                                        i3 = 0;
                                        CharSequence charSequence18 = (CharSequence) obj2;
                                        yVar5 = gVar.b;
                                        nm6 nm6Var3 = nm6Var2;
                                        PlusPayRichText plusPayRichText5 = gVar.c;
                                        pVar.j = hVar3;
                                        com.yandex.plus.bdui.plus.checkout.content.h hVar9 = hVar3;
                                        pVar.k = null;
                                        pVar.l = null;
                                        pVar.m = collection2;
                                        pVar.n = it;
                                        pVar.o = null;
                                        pVar.p = gVar;
                                        pVar.q = charSequence18;
                                        pVar.r = yVar5;
                                        pVar.s = yVar3;
                                        pVar.t = charSequence6;
                                        pVar.u = charSequence5;
                                        pVar.v = collection;
                                        pVar.x = i4;
                                        pVar.y = i;
                                        pVar.z = i3;
                                        pVar.C = 4;
                                        f = f(plusPayRichText5, pVar);
                                        nm6Var = nm6Var3;
                                        if (f != nm6Var) {
                                            int i9 = i4;
                                            hVar4 = hVar9;
                                            obj = f;
                                            charSequence7 = charSequence18;
                                            i5 = i3;
                                            i6 = i;
                                            i7 = i9;
                                            collection3 = collection;
                                            it2 = it;
                                            yVar4 = yVar3;
                                            charSequence8 = charSequence5;
                                            collection4 = collection2;
                                            charSequence9 = charSequence6;
                                            charSequence10 = (CharSequence) obj;
                                            plusPayRichText = gVar.d;
                                            if (plusPayRichText == null) {
                                                pVar.j = hVar4;
                                                com.yandex.plus.bdui.plus.checkout.content.h hVar10 = hVar4;
                                                pVar.k = null;
                                                pVar.l = null;
                                                pVar.m = collection4;
                                                pVar.n = it2;
                                                pVar.o = null;
                                                pVar.p = null;
                                                pVar.q = charSequence7;
                                                pVar.r = yVar5;
                                                pVar.s = charSequence10;
                                                pVar.t = yVar4;
                                                pVar.u = charSequence9;
                                                pVar.v = charSequence8;
                                                pVar.w = collection3;
                                                pVar.x = i7;
                                                pVar.y = i6;
                                                pVar.z = i5;
                                                pVar.C = 5;
                                                obj2 = f(plusPayRichText, pVar);
                                                if (obj2 != nm6Var) {
                                                    hVar6 = hVar10;
                                                    charSequence12 = charSequence10;
                                                    collection6 = collection3;
                                                    CharSequence charSequence19 = charSequence12;
                                                    hVar5 = hVar6;
                                                    charSequence2 = charSequence8;
                                                    collection5 = collection6;
                                                    charSequence10 = charSequence19;
                                                    pVar3 = pVar;
                                                    yVar2 = yVar4;
                                                    it = it2;
                                                    collection = collection4;
                                                    charSequence4 = charSequence9;
                                                    charSequence11 = (CharSequence) obj2;
                                                    i2 = i7;
                                                    i = i6;
                                                    collection5.add(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.item.a(charSequence7, yVar5, charSequence10, charSequence11));
                                                    pVar2 = pVar3;
                                                    nm6Var2 = nm6Var;
                                                    hVar3 = hVar5;
                                                    if (!it.hasNext()) {
                                                        nm6 nm6Var4 = nm6Var2;
                                                        list = (List) collection;
                                                        z2 z2Var2 = (z2) hVar3;
                                                        com.yandex.plus.core.templating.template.j jVar = z2Var2.f;
                                                        s9f[] s9fVarArr = z2.m;
                                                        str = (String) jVar.d(s9fVarArr[0]);
                                                        String str5 = (String) z2Var2.g.d(s9fVarArr[1]);
                                                        PlusPayRichText plusPayRichText6 = z2Var2.h;
                                                        if (plusPayRichText6 == null) {
                                                            str2 = str5;
                                                            charSequence13 = charSequence4;
                                                            charSequence14 = null;
                                                            yVar6 = yVar2;
                                                            list2 = list;
                                                            charSequence15 = charSequence2;
                                                            str3 = str;
                                                            return new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.a(yVar6, charSequence13, charSequence15, list2, str3, str2, charSequence14);
                                                        }
                                                        pVar2.j = null;
                                                        pVar2.k = yVar2;
                                                        pVar2.l = charSequence4;
                                                        pVar2.m = charSequence2;
                                                        pVar2.n = list;
                                                        pVar2.o = str;
                                                        pVar2.p = str5;
                                                        pVar2.q = null;
                                                        pVar2.r = null;
                                                        pVar2.s = null;
                                                        pVar2.t = null;
                                                        pVar2.u = null;
                                                        pVar2.v = null;
                                                        pVar2.w = null;
                                                        pVar2.C = 6;
                                                        Object f4 = f(plusPayRichText6, pVar2);
                                                        if (f4 == nm6Var4) {
                                                            return nm6Var4;
                                                        }
                                                        obj2 = f4;
                                                        str4 = str5;
                                                        charSequence16 = charSequence4;
                                                        str2 = str4;
                                                        charSequence13 = charSequence16;
                                                        charSequence14 = (CharSequence) obj2;
                                                        yVar6 = yVar2;
                                                        str3 = str;
                                                        list2 = list;
                                                        charSequence15 = charSequence2;
                                                        return new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.a(yVar6, charSequence13, charSequence15, list2, str3, str2, charSequence14);
                                                    }
                                                }
                                            } else {
                                                hVar5 = hVar4;
                                                pVar3 = pVar;
                                                charSequence2 = charSequence8;
                                                yVar2 = yVar4;
                                                collection5 = collection3;
                                                it = it2;
                                                collection = collection4;
                                                charSequence4 = charSequence9;
                                                charSequence11 = null;
                                                i2 = i7;
                                                i = i6;
                                                collection5.add(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.item.a(charSequence7, yVar5, charSequence10, charSequence11));
                                                pVar2 = pVar3;
                                                nm6Var2 = nm6Var;
                                                hVar3 = hVar5;
                                                if (!it.hasNext()) {
                                                }
                                            }
                                        }
                                        return nm6Var;
                                    }
                                }
                            }
                            return nm6Var2;
                        }
                        charSequence2 = null;
                        ArrayList arrayList3 = ((z2) hVar7).e;
                        ArrayList arrayList22 = new ArrayList(v75.o(arrayList3, 10));
                        hVar3 = hVar7;
                        pVar2 = pVar;
                        yVar2 = yVar;
                        it = arrayList3.iterator();
                        collection = arrayList22;
                        i = 0;
                        charSequence4 = charSequence;
                        i2 = 0;
                        if (!it.hasNext()) {
                        }
                    case 2:
                        charSequence3 = pVar.l;
                        yVar = pVar.k;
                        hVar2 = pVar.j;
                        qgg.h0(obj2);
                        CharSequence charSequence172 = (CharSequence) obj2;
                        charSequence = charSequence3;
                        hVar7 = hVar2;
                        charSequence2 = charSequence172;
                        ArrayList arrayList32 = ((z2) hVar7).e;
                        ArrayList arrayList222 = new ArrayList(v75.o(arrayList32, 10));
                        hVar3 = hVar7;
                        pVar2 = pVar;
                        yVar2 = yVar;
                        it = arrayList32.iterator();
                        collection = arrayList222;
                        i = 0;
                        charSequence4 = charSequence;
                        i2 = 0;
                        if (!it.hasNext()) {
                        }
                        break;
                    case 3:
                        i3 = pVar.z;
                        i = pVar.y;
                        i4 = pVar.x;
                        collection = (Collection) pVar.t;
                        charSequence5 = (CharSequence) pVar.s;
                        charSequence6 = (CharSequence) pVar.r;
                        yVar3 = (com.yandex.plus.core.data.common.y) pVar.q;
                        com.yandex.plus.bdui.plus.checkout.content.g gVar3 = (com.yandex.plus.bdui.plus.checkout.content.g) pVar.p;
                        it = (Iterator) pVar.n;
                        Collection collection7 = (Collection) pVar.m;
                        hVar3 = pVar.j;
                        qgg.h0(obj2);
                        gVar = gVar3;
                        collection2 = collection7;
                        CharSequence charSequence182 = (CharSequence) obj2;
                        yVar5 = gVar.b;
                        nm6 nm6Var32 = nm6Var2;
                        PlusPayRichText plusPayRichText52 = gVar.c;
                        pVar.j = hVar3;
                        com.yandex.plus.bdui.plus.checkout.content.h hVar92 = hVar3;
                        pVar.k = null;
                        pVar.l = null;
                        pVar.m = collection2;
                        pVar.n = it;
                        pVar.o = null;
                        pVar.p = gVar;
                        pVar.q = charSequence182;
                        pVar.r = yVar5;
                        pVar.s = yVar3;
                        pVar.t = charSequence6;
                        pVar.u = charSequence5;
                        pVar.v = collection;
                        pVar.x = i4;
                        pVar.y = i;
                        pVar.z = i3;
                        pVar.C = 4;
                        f = f(plusPayRichText52, pVar);
                        nm6Var = nm6Var32;
                        if (f != nm6Var) {
                        }
                        return nm6Var;
                    case 4:
                        int i10 = pVar.z;
                        int i11 = pVar.y;
                        int i12 = pVar.x;
                        Collection collection8 = (Collection) pVar.v;
                        CharSequence charSequence20 = pVar.u;
                        charSequence6 = (CharSequence) pVar.t;
                        com.yandex.plus.core.data.common.y yVar8 = (com.yandex.plus.core.data.common.y) pVar.s;
                        com.yandex.plus.core.data.common.y yVar9 = (com.yandex.plus.core.data.common.y) pVar.r;
                        CharSequence charSequence21 = (CharSequence) pVar.q;
                        gVar = (com.yandex.plus.bdui.plus.checkout.content.g) pVar.p;
                        Iterator it3 = (Iterator) pVar.n;
                        Collection collection9 = (Collection) pVar.m;
                        com.yandex.plus.bdui.plus.checkout.content.h hVar11 = pVar.j;
                        qgg.h0(obj2);
                        i5 = i10;
                        obj = obj2;
                        hVar4 = hVar11;
                        i6 = i11;
                        i7 = i12;
                        collection3 = collection8;
                        it2 = it3;
                        nm6Var = nm6Var2;
                        charSequence7 = charSequence21;
                        yVar4 = yVar8;
                        charSequence8 = charSequence20;
                        collection4 = collection9;
                        yVar5 = yVar9;
                        charSequence9 = charSequence6;
                        charSequence10 = (CharSequence) obj;
                        plusPayRichText = gVar.d;
                        if (plusPayRichText == null) {
                        }
                        break;
                    case 5:
                        i6 = pVar.y;
                        i7 = pVar.x;
                        collection6 = pVar.w;
                        charSequence8 = (CharSequence) pVar.v;
                        charSequence9 = pVar.u;
                        yVar4 = (com.yandex.plus.core.data.common.y) pVar.t;
                        charSequence12 = (CharSequence) pVar.s;
                        com.yandex.plus.core.data.common.y yVar10 = (com.yandex.plus.core.data.common.y) pVar.r;
                        CharSequence charSequence22 = (CharSequence) pVar.q;
                        it2 = (Iterator) pVar.n;
                        collection4 = (Collection) pVar.m;
                        hVar6 = pVar.j;
                        qgg.h0(obj2);
                        nm6Var = nm6Var2;
                        charSequence7 = charSequence22;
                        yVar5 = yVar10;
                        CharSequence charSequence192 = charSequence12;
                        hVar5 = hVar6;
                        charSequence2 = charSequence8;
                        collection5 = collection6;
                        charSequence10 = charSequence192;
                        pVar3 = pVar;
                        yVar2 = yVar4;
                        it = it2;
                        collection = collection4;
                        charSequence4 = charSequence9;
                        charSequence11 = (CharSequence) obj2;
                        i2 = i7;
                        i = i6;
                        collection5.add(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.item.a(charSequence7, yVar5, charSequence10, charSequence11));
                        pVar2 = pVar3;
                        nm6Var2 = nm6Var;
                        hVar3 = hVar5;
                        if (!it.hasNext()) {
                        }
                        break;
                    case 6:
                        str4 = (String) pVar.p;
                        str = pVar.o;
                        list = (List) pVar.n;
                        charSequence2 = (CharSequence) pVar.m;
                        charSequence16 = pVar.l;
                        yVar2 = pVar.k;
                        qgg.h0(obj2);
                        str2 = str4;
                        charSequence13 = charSequence16;
                        charSequence14 = (CharSequence) obj2;
                        yVar6 = yVar2;
                        str3 = str;
                        list2 = list;
                        charSequence15 = charSequence2;
                        return new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.a(yVar6, charSequence13, charSequence15, list2, str3, str2, charSequence14);
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        pVar = new p(this, cg6Var);
        Object obj22 = pVar.A;
        nm6 nm6Var22 = nm6.a;
        switch (pVar.C) {
        }
    }
}
