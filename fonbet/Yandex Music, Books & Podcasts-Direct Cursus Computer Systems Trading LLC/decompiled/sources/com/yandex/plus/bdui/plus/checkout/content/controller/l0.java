package com.yandex.plus.bdui.plus.checkout.content.controller;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.plus.bdui.plus.checkout.content.serializer.v7;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.UpsaleContentView;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r0w;
import defpackage.s9f;
import defpackage.xq0;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class l0 extends com.yandex.plus.bdui.plus.content.controller.a {
    public final com.yandex.plus.core.imageloader.b b;
    public final com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d c;
    public final com.yandex.plus.home.internal.di.y d;
    public final com.yandex.plus.log.api.b e;
    public com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.c f;
    public com.yandex.plus.bdui.content.d g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.yandex.plus.bdui.m mVar, com.yandex.plus.core.imageloader.b bVar, com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d dVar, com.yandex.plus.home.internal.di.y yVar, com.yandex.plus.log.api.b bVar2) {
        super(mVar);
        mVar.getClass();
        bVar.getClass();
        dVar.getClass();
        yVar.getClass();
        bVar2.getClass();
        this.b = bVar;
        this.c = dVar;
        this.d = yVar;
        this.e = bVar2;
    }

    @Override // com.yandex.plus.bdui.ui.c
    public final void a(View view) {
        view.getClass();
        this.f = null;
        this.g = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.plus.bdui.ui.c
    public final View b(ViewGroup viewGroup) {
        viewGroup.getClass();
        Context context = viewGroup.getContext();
        context.getClass();
        UpsaleContentView upsaleContentView = new UpsaleContentView(context, null, 2, 0 == true ? 1 : 0);
        this.g = null;
        int i = 0;
        int i2 = 0;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.c cVar = new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.c(upsaleContentView, this.b, new w(i2, this, l0.class, "onUpsaleAccept", "onUpsaleAccept()V", i, 11), new w(i2, this, l0.class, "onUpsaleReject", "onUpsaleReject()V", i, 12), new w(i2, this, l0.class, "onLegalTextShown", "onLegalTextShown()V", i, 13));
        this.f = cVar;
        com.yandex.plus.core.insets.d dVar = new com.yandex.plus.core.insets.d(0);
        g gVar = new g(3, cVar);
        com.yandex.plus.core.insets.a aVar = new com.yandex.plus.core.insets.a();
        aVar.b = new LinkedHashSet(2);
        aVar.d();
        aVar.c();
        dVar.b.put(gVar, aVar);
        dVar.b(upsaleContentView);
        return upsaleContentView;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // com.yandex.plus.bdui.ui.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(com.yandex.plus.bdui.content.d dVar, com.yandex.plus.bdui.flex.ui.t tVar, Continuation continuation) {
        k0 k0Var;
        int i;
        com.yandex.plus.log.api.b bVar;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.c cVar;
        String str;
        String str2;
        String str3;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.c cVar2;
        String str4;
        String str5;
        String str6;
        CharSequence charSequence;
        ArrayList arrayList;
        String str7;
        String str8;
        ArrayList arrayList2;
        String str9;
        com.yandex.plus.log.api.a aVar;
        com.yandex.plus.bdui.content.d dVar2 = dVar;
        if (continuation instanceof k0) {
            k0Var = (k0) continuation;
            int i2 = k0Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k0Var.t = i2 - Integer.MIN_VALUE;
                Object obj = k0Var.r;
                nm6 nm6Var = nm6.a;
                i = k0Var.t;
                bVar = this.e;
                if (i != 0) {
                    qgg.h0(obj);
                    boolean z = dVar2.d;
                    com.yandex.plus.bdui.content.a aVar2 = dVar2.b;
                    if (!z) {
                        cVar = this.f;
                        if (cVar != null) {
                            this.g = dVar2;
                            v7 v7Var = (v7) ((com.yandex.plus.bdui.plus.checkout.content.q) aVar2);
                            com.yandex.plus.core.templating.template.j jVar = v7Var.a;
                            s9f[] s9fVarArr = v7.n;
                            str = (String) jVar.d(s9fVarArr[0]);
                            String str10 = (String) v7Var.b.d(s9fVarArr[1]);
                            String str11 = (String) v7Var.c.d(s9fVarArr[2]);
                            String str12 = (String) v7Var.d.d(s9fVarArr[3]);
                            ArrayList arrayList3 = v7Var.e;
                            str2 = v7Var.f;
                            PlusPayRichText plusPayRichText = v7Var.g;
                            if (plusPayRichText != null) {
                                r0w r0wVar = new r0w(23, this);
                                k0Var.j = dVar2;
                                k0Var.k = cVar;
                                k0Var.l = str;
                                k0Var.m = str10;
                                k0Var.n = str11;
                                k0Var.o = str12;
                                k0Var.p = arrayList3;
                                k0Var.q = str2;
                                k0Var.t = 1;
                                Object a = ((com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.h) this.c).a(plusPayRichText, r0wVar, k0Var);
                                if (a == nm6Var) {
                                    return nm6Var;
                                }
                                str7 = str12;
                                str8 = str11;
                                arrayList2 = arrayList3;
                                str9 = str10;
                                obj = a;
                            } else {
                                str3 = str10;
                                cVar2 = cVar;
                                str4 = str11;
                                str5 = str12;
                                str6 = str;
                                charSequence = null;
                                arrayList = arrayList3;
                                String str13 = str2;
                                com.yandex.plus.core.templating.template.j jVar2 = ((v7) ((com.yandex.plus.bdui.plus.checkout.content.q) dVar2.b)).h;
                                s9f[] s9fVarArr2 = v7.n;
                                com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.a aVar3 = new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.a(str6, str3, str4, str5, (String) ((v7) ((com.yandex.plus.bdui.plus.checkout.content.q) dVar2.b)).i.d(s9fVarArr2[5]), (String) jVar2.d(s9fVarArr2[4]), arrayList, str13, charSequence);
                                aVar = com.yandex.plus.log.api.a.c;
                                if (bVar.b(aVar)) {
                                    bVar.c(aVar, "PlusPayUpsaleContentController", "onUpdateStateAsync(); set upsale content = " + aVar3);
                                }
                                cVar2.c(aVar3);
                            }
                        } else {
                            com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.d;
                            if (bVar.b(aVar4)) {
                                bVar.c(aVar4, "PlusPayUpsaleContentController", "onUpdateStateAsync(); content view controller not found!");
                            }
                        }
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str14 = k0Var.q;
                arrayList2 = k0Var.p;
                str7 = k0Var.o;
                str8 = k0Var.n;
                str9 = k0Var.m;
                str = k0Var.l;
                cVar = k0Var.k;
                com.yandex.plus.bdui.content.d dVar3 = k0Var.j;
                qgg.h0(obj);
                str2 = str14;
                dVar2 = dVar3;
                String str15 = str;
                str3 = str9;
                str6 = str15;
                charSequence = (CharSequence) obj;
                arrayList = arrayList2;
                str5 = str7;
                cVar2 = cVar;
                str4 = str8;
                String str132 = str2;
                com.yandex.plus.core.templating.template.j jVar22 = ((v7) ((com.yandex.plus.bdui.plus.checkout.content.q) dVar2.b)).h;
                s9f[] s9fVarArr22 = v7.n;
                com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.a aVar32 = new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.a(str6, str3, str4, str5, (String) ((v7) ((com.yandex.plus.bdui.plus.checkout.content.q) dVar2.b)).i.d(s9fVarArr22[5]), (String) jVar22.d(s9fVarArr22[4]), arrayList, str132, charSequence);
                aVar = com.yandex.plus.log.api.a.c;
                if (bVar.b(aVar)) {
                }
                cVar2.c(aVar32);
                return Unit.a;
            }
        }
        k0Var = new k0(this, continuation);
        Object obj2 = k0Var.r;
        nm6 nm6Var2 = nm6.a;
        i = k0Var.t;
        bVar = this.e;
        if (i != 0) {
        }
        String str152 = str;
        str3 = str9;
        str6 = str152;
        charSequence = (CharSequence) obj2;
        arrayList = arrayList2;
        str5 = str7;
        cVar2 = cVar;
        str4 = str8;
        String str1322 = str2;
        com.yandex.plus.core.templating.template.j jVar222 = ((v7) ((com.yandex.plus.bdui.plus.checkout.content.q) dVar2.b)).h;
        s9f[] s9fVarArr222 = v7.n;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.a aVar322 = new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.a(str6, str3, str4, str5, (String) ((v7) ((com.yandex.plus.bdui.plus.checkout.content.q) dVar2.b)).i.d(s9fVarArr222[5]), (String) jVar222.d(s9fVarArr222[4]), arrayList, str1322, charSequence);
        aVar = com.yandex.plus.log.api.a.c;
        if (bVar.b(aVar)) {
        }
        cVar2.c(aVar322);
        return Unit.a;
    }

    public final void d(com.yandex.plus.bdui.content.d dVar, com.yandex.plus.bdui.action.a aVar) {
        if (aVar != null) {
            this.a.a.a(aVar, new com.yandex.plus.bdui.action.h(dVar.c), null);
            return;
        }
        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.d;
        com.yandex.plus.log.api.b bVar = this.e;
        if (bVar.b(aVar2)) {
            bVar.c(aVar2, "PlusPayUpsaleContentController", "dispatchAction(); action is null!");
        }
    }
}
