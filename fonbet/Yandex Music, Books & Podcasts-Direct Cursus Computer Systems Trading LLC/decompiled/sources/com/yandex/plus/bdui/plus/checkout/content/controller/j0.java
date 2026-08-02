package com.yandex.plus.bdui.plus.checkout.content.controller;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.checkout.content.serializer.g7;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.SuccessNativeContentView;
import com.yandex.plus.pay.ui.core.mobile.view.confetti.PlusPayConfettiView;
import defpackage.s9f;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class j0 extends a {
    public final com.yandex.plus.core.imageloader.b b;
    public final com.yandex.plus.pay.ui.design.api.api.a c;
    public final com.yandex.plus.log.api.b d;
    public com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.c e;
    public SuccessNativeContentView f;
    public com.yandex.plus.bdui.content.d g;
    public boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.yandex.plus.bdui.m mVar, com.yandex.plus.core.imageloader.b bVar, com.yandex.plus.pay.ui.design.api.api.a aVar, com.yandex.plus.log.api.b bVar2) {
        super(mVar);
        mVar.getClass();
        bVar.getClass();
        aVar.getClass();
        bVar2.getClass();
        this.b = bVar;
        this.c = aVar;
        this.d = bVar2;
    }

    @Override // com.yandex.plus.bdui.ui.c
    public final void a(View view) {
        view.getClass();
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.c cVar = this.e;
        if (cVar != null) {
            cVar.h.o();
        }
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.c cVar2 = this.e;
        if (cVar2 != null) {
            com.yandex.passport.internal.entities.j jVar = cVar2.h;
            jVar.o();
            jVar.a = null;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = false;
    }

    @Override // com.yandex.plus.bdui.ui.c
    public final View b(ViewGroup viewGroup) {
        viewGroup.getClass();
        Context context = viewGroup.getContext();
        context.getClass();
        SuccessNativeContentView successNativeContentView = new SuccessNativeContentView(context, null, 2, null);
        this.f = successNativeContentView;
        this.g = null;
        this.h = false;
        w wVar = new w(0, this, j0.class, "onButtonClick", "onButtonClick()V", 0, 9);
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.c cVar = new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.c(successNativeContentView, this.c, this.b, null, new w(0, this, j0.class, "onCloseButtonClick", "onCloseButtonClick()V", 0, 10), wVar);
        this.e = cVar;
        PlusPayConfettiView plusPayConfettiView = (PlusPayConfettiView) cVar.f.g(com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.c.n[6]);
        com.yandex.passport.internal.entities.j jVar = cVar.h;
        jVar.getClass();
        plusPayConfettiView.getClass();
        jVar.a = plusPayConfettiView;
        com.yandex.plus.core.insets.d dVar = new com.yandex.plus.core.insets.d(0);
        g gVar = new g(2, cVar);
        com.yandex.plus.core.insets.a aVar = new com.yandex.plus.core.insets.a();
        aVar.b = new LinkedHashSet(2);
        aVar.d();
        aVar.c();
        dVar.b.put(gVar, aVar);
        dVar.b(successNativeContentView);
        return successNativeContentView;
    }

    @Override // com.yandex.plus.bdui.ui.a
    public final Object c(com.yandex.plus.bdui.content.d dVar, com.yandex.plus.bdui.flex.ui.t tVar, Continuation continuation) {
        boolean z = dVar.d;
        com.yandex.plus.bdui.content.a aVar = dVar.b;
        if (!z) {
            com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.c cVar = this.e;
            com.yandex.plus.log.api.b bVar = this.d;
            if (cVar != null) {
                this.g = dVar;
                g7 g7Var = (g7) ((com.yandex.plus.bdui.plus.checkout.content.p) aVar);
                List list = g7Var.a;
                com.yandex.plus.core.templating.template.j jVar = g7Var.b;
                s9f[] s9fVarArr = g7.i;
                com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.a aVar2 = new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.a((String) jVar.d(s9fVarArr[0]), (String) g7Var.c.d(s9fVarArr[1]), (String) g7Var.d.d(s9fVarArr[2]), list);
                com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.c;
                if (bVar.b(aVar3)) {
                    bVar.c(aVar3, "PlusPaySuccessContentController", "onUpdateStateAsync(); set success content = " + aVar2);
                }
                cVar.c(aVar2);
                if (!this.h) {
                    SuccessNativeContentView successNativeContentView = this.f;
                    if (successNativeContentView != null) {
                        r1.O(successNativeContentView, com.yandex.plus.pay.ui.core.mobile.haptic.a.a);
                    }
                    this.h = true;
                }
                com.yandex.plus.pay.ui.core.mobile.view.toolbar.h d = a.d(g7Var.e);
                if (bVar.b(aVar3)) {
                    bVar.c(aVar3, "PlusPaySuccessContentController", "onUpdateStateAsync(); apply toolbar state = " + d);
                }
                cVar.g.a(d);
                if (bVar.b(aVar3)) {
                    bVar.c(aVar3, "PlusPaySuccessContentController", "onUpdateStateAsync(); start confetti");
                }
                cVar.d();
            } else {
                com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.d;
                if (bVar.b(aVar4)) {
                    bVar.c(aVar4, "PlusPaySuccessContentController", "onUpdateStateAsync(); content view controller not found!");
                }
            }
        }
        return Unit.a;
    }
}
