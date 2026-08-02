package com.yandex.plus.bdui.plus.checkout.content.controller;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.checkout.content.serializer.g4;
import com.yandex.plus.bdui.plus.checkout.content.serializer.j4;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.ErrorContentView;
import defpackage.s9f;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class x extends a {
    public final com.yandex.plus.core.imageloader.b b;
    public final com.yandex.plus.pay.ui.design.api.api.a c;
    public final com.yandex.plus.home.internal.di.y d;
    public final com.yandex.plus.log.api.b e;
    public com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.b f;
    public ErrorContentView g;
    public com.yandex.plus.bdui.content.d h;
    public boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.yandex.plus.bdui.m mVar, com.yandex.plus.core.imageloader.b bVar, com.yandex.plus.pay.ui.design.api.api.a aVar, com.yandex.plus.home.internal.di.y yVar, com.yandex.plus.log.api.b bVar2) {
        super(mVar);
        mVar.getClass();
        bVar.getClass();
        aVar.getClass();
        yVar.getClass();
        bVar2.getClass();
        this.b = bVar;
        this.c = aVar;
        this.d = yVar;
        this.e = bVar2;
    }

    @Override // com.yandex.plus.bdui.ui.c
    public final void a(View view) {
        view.getClass();
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = false;
    }

    @Override // com.yandex.plus.bdui.ui.c
    public final View b(ViewGroup viewGroup) {
        viewGroup.getClass();
        Context context = viewGroup.getContext();
        context.getClass();
        ErrorContentView errorContentView = new ErrorContentView(context, null, 2, null);
        this.g = errorContentView;
        this.h = null;
        this.i = false;
        com.yandex.plus.bdui.flex.factory.d dVar = new com.yandex.plus.bdui.flex.factory.d(0, this, x.class, "onPrimaryButtonClick", "onPrimaryButtonClick()V", 0, 29);
        w wVar = new w(0, this, x.class, "onSecondaryButtonClick", "onSecondaryButtonClick()V", 0, 0);
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.b bVar = new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.b(errorContentView, this.c, this.b, this.d, new w(0, this, x.class, "onCloseButtonClick", "onCloseButtonClick()V", 0, 1), dVar, wVar);
        this.f = bVar;
        com.yandex.plus.core.insets.d dVar2 = new com.yandex.plus.core.insets.d(0);
        v vVar = new v(bVar, 0);
        com.yandex.plus.core.insets.a aVar = new com.yandex.plus.core.insets.a();
        aVar.b = new LinkedHashSet(2);
        aVar.d();
        aVar.c();
        dVar2.b.put(vVar, aVar);
        dVar2.b(errorContentView);
        return errorContentView;
    }

    @Override // com.yandex.plus.bdui.ui.a
    public final Object c(com.yandex.plus.bdui.content.d dVar, com.yandex.plus.bdui.flex.ui.t tVar, Continuation continuation) {
        com.yandex.plus.pay.ui.common.internal.error.content.k kVar;
        String str;
        boolean z = dVar.d;
        com.yandex.plus.bdui.content.a aVar = dVar.b;
        if (!z) {
            com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.b bVar = this.f;
            com.yandex.plus.log.api.b bVar2 = this.e;
            if (bVar != null) {
                this.h = dVar;
                j4 j4Var = (j4) ((com.yandex.plus.bdui.plus.checkout.content.j) aVar);
                com.yandex.plus.core.templating.template.j jVar = j4Var.a;
                s9f[] s9fVarArr = j4.m;
                String str2 = (String) jVar.d(s9fVarArr[0]);
                String str3 = (String) j4Var.b.d(s9fVarArr[1]);
                String str4 = (String) j4Var.c.d(s9fVarArr[2]);
                String str5 = (String) j4Var.d.d(s9fVarArr[3]);
                g4 g4Var = j4Var.e;
                if (g4Var != null) {
                    com.yandex.plus.core.templating.template.j jVar2 = g4Var.a;
                    s9f[] s9fVarArr2 = g4.c;
                    kVar = new com.yandex.plus.pay.ui.common.internal.error.content.k((String) jVar2.d(s9fVarArr2[0]), (String) g4Var.b.d(s9fVarArr2[1]));
                } else {
                    kVar = null;
                }
                String str6 = (String) j4Var.g.d(s9fVarArr[4]);
                com.yandex.plus.pay.ui.common.internal.error.content.k kVar2 = kVar;
                com.yandex.plus.pay.ui.common.internal.error.content.e eVar = com.yandex.plus.pay.ui.common.internal.error.content.e.a;
                com.yandex.plus.pay.ui.common.internal.error.content.h hVar = new com.yandex.plus.pay.ui.common.internal.error.content.h(str2, str3, str4, str5, kVar2, new com.yandex.plus.pay.ui.common.internal.error.content.f(str6, eVar), (j4Var.j == null || (str = (String) j4Var.i.d(s9fVarArr[5])) == null) ? null : new com.yandex.plus.pay.ui.common.internal.error.content.f(str, eVar));
                com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
                if (bVar2.b(aVar2)) {
                    bVar2.c(aVar2, "PlusPayErrorContentController", "onUpdateStateAsync(); set error content = " + hVar);
                }
                bVar.h(hVar);
                if (!this.i) {
                    ErrorContentView errorContentView = this.g;
                    if (errorContentView != null) {
                        r1.O(errorContentView, com.yandex.plus.pay.ui.core.mobile.haptic.a.b);
                    }
                    this.i = true;
                }
                com.yandex.plus.pay.ui.core.mobile.view.toolbar.h d = a.d(j4Var.f);
                if (bVar2.b(aVar2)) {
                    bVar2.c(aVar2, "PlusPayErrorContentController", "onUpdateStateAsync(); apply toolbar state = " + d);
                }
                bVar.b(d);
            } else {
                com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.d;
                if (bVar2.b(aVar3)) {
                    bVar2.c(aVar3, "PlusPayErrorContentController", "onUpdateStateAsync(); content view controller not found!");
                }
            }
        }
        return Unit.a;
    }

    public final void e(com.yandex.plus.bdui.content.d dVar, com.yandex.plus.bdui.action.a aVar) {
        this.a.a.a(aVar, new com.yandex.plus.bdui.action.h(dVar.c), null);
    }
}
