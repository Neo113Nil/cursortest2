package com.yandex.plus.bdui.plus.checkout.content.controller;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.plus.bdui.plus.content.serializer.i2;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.ErrorContentView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class r0 extends com.yandex.plus.bdui.plus.content.controller.a {
    public final com.yandex.plus.pay.ui.core.api.common.a b;
    public final com.yandex.plus.core.imageloader.b c;
    public final com.yandex.plus.pay.ui.design.api.api.a d;
    public final com.yandex.plus.home.internal.di.y e;
    public final com.yandex.plus.log.api.b f;
    public com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.b g;
    public q0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.yandex.plus.bdui.m mVar, com.yandex.plus.pay.ui.core.api.common.a aVar, com.yandex.plus.core.imageloader.b bVar, com.yandex.plus.pay.ui.design.api.api.a aVar2, com.yandex.plus.home.internal.di.y yVar, com.yandex.plus.log.api.b bVar2) {
        super(mVar);
        mVar.getClass();
        aVar.getClass();
        bVar.getClass();
        aVar2.getClass();
        yVar.getClass();
        bVar2.getClass();
        this.b = aVar;
        this.c = bVar;
        this.d = aVar2;
        this.e = yVar;
        this.f = bVar2;
    }

    @Override // com.yandex.plus.bdui.ui.c
    public final void a(View view) {
        view.getClass();
        this.g = null;
        this.h = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.plus.bdui.ui.c
    public final View b(ViewGroup viewGroup) {
        viewGroup.getClass();
        Context context = viewGroup.getContext();
        context.getClass();
        ErrorContentView errorContentView = new ErrorContentView(context, null, 2, 0 == true ? 1 : 0);
        this.h = null;
        int i = 0;
        int i2 = 0;
        w wVar = new w(i2, this, r0.class, "onPrimaryButtonClick", "onPrimaryButtonClick()V", i, 14);
        w wVar2 = new w(i2, this, r0.class, "onSecondaryButtonClick", "onSecondaryButtonClick()V", i, 15);
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.b bVar = new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.b(errorContentView, this.d, this.c, this.e, new com.yandex.plus.bdui.plus.action.serializer.s(15), wVar, wVar2);
        bVar.b(null);
        this.g = bVar;
        return errorContentView;
    }

    @Override // com.yandex.plus.bdui.ui.a
    public final Object c(com.yandex.plus.bdui.content.d dVar, com.yandex.plus.bdui.flex.ui.t tVar, Continuation continuation) {
        p0 p0Var;
        String str;
        com.yandex.plus.bdui.plus.content.r rVar;
        if (!dVar.d) {
            com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.b bVar = this.g;
            com.yandex.plus.log.api.b bVar2 = this.f;
            if (bVar != null) {
                com.yandex.plus.bdui.failure.d dVar2 = ((com.yandex.plus.bdui.plus.content.j) dVar.b).a;
                com.yandex.plus.bdui.plus.failure.a aVar = dVar2 instanceof com.yandex.plus.bdui.plus.failure.a ? (com.yandex.plus.bdui.plus.failure.a) dVar2 : null;
                i2 i2Var = (aVar == null || (rVar = aVar.a) == null) ? null : rVar.e.e;
                com.yandex.plus.bdui.plus.content.controller.m mVar = aVar != null ? aVar.d : null;
                p0 p0Var2 = (mVar == null || i2Var == null) ? null : new p0(new com.yandex.plus.pay.ui.common.internal.error.content.f((String) i2Var.d.d(i2.f[2]), com.yandex.plus.pay.ui.common.internal.error.content.e.b), mVar);
                com.yandex.plus.pay.ui.core.api.common.a aVar2 = this.b;
                if (i2Var != null) {
                    com.yandex.plus.bdui.plus.content.s sVar = i2Var.a;
                    String a = sVar.a();
                    if (a == null) {
                        a = aVar2.get(R.string.PlusPay_Error_Unknown_Button);
                    }
                    p0Var = new p0(new com.yandex.plus.pay.ui.common.internal.error.content.f(a, com.yandex.plus.pay.ui.common.internal.error.content.e.a), sVar.a);
                } else {
                    p0Var = null;
                }
                if (p0Var2 == null) {
                    p0Var2 = p0Var;
                    p0Var = null;
                }
                if (i2Var == null || (str = (String) i2Var.b.d(i2.f[0])) == null) {
                    str = aVar2.get(R.string.Home_ContentPlaceholder_RetryButton_Subtitle);
                }
                com.yandex.plus.pay.ui.common.internal.error.content.h hVar = new com.yandex.plus.pay.ui.common.internal.error.content.h(str, i2Var != null ? (String) i2Var.c.d(i2.f[1]) : null, null, null, null, p0Var2 != null ? p0Var2.a : null, p0Var != null ? p0Var.a : null);
                this.h = new q0(p0Var2 != null ? p0Var2.b : null, p0Var != null ? p0Var.b : null, dVar.c);
                com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.c;
                if (bVar2.b(aVar3)) {
                    bVar2.c(aVar3, "PlusPayWebFailureContentController", "onUpdateStateAsync(); set content = " + hVar);
                }
                bVar.h(hVar);
            } else {
                com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.d;
                if (bVar2.b(aVar4)) {
                    bVar2.c(aVar4, "PlusPayWebFailureContentController", "onUpdateStateAsync(); content view controller not found!");
                }
            }
        }
        return Unit.a;
    }
}
