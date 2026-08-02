package com.yandex.plus.bdui.plus.checkout.content.controller;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.content.serializer.i1;
import com.yandex.plus.bdui.plus.content.serializer.i2;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.ErrorContentView;
import defpackage.s9f;
import java.util.LinkedHashSet;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class z extends com.yandex.plus.bdui.plus.content.controller.a {
    public final com.yandex.plus.pay.ui.core.api.common.a b;
    public final com.yandex.plus.core.imageloader.b c;
    public final com.yandex.plus.pay.ui.design.api.api.a d;
    public final com.yandex.plus.home.internal.di.y e;
    public final com.yandex.plus.bdui.plus.checkout.action.a f;
    public final com.yandex.plus.log.api.b g;
    public com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.b h;
    public ErrorContentView i;
    public y j;
    public boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.yandex.plus.bdui.m mVar, com.yandex.plus.pay.ui.core.api.common.a aVar, com.yandex.plus.core.imageloader.b bVar, com.yandex.plus.pay.ui.design.api.api.a aVar2, com.yandex.plus.home.internal.di.y yVar, com.yandex.plus.bdui.plus.checkout.action.a aVar3, com.yandex.plus.log.api.b bVar2) {
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
        this.f = aVar3;
        this.g = bVar2;
    }

    public static Pair e(String str, String str2, Pair pair, Pair pair2, com.yandex.plus.bdui.shared.b bVar) {
        Pair pair3;
        if (pair != null) {
            pair3 = pair2;
        } else {
            pair = pair2;
            pair3 = null;
        }
        return new Pair(new com.yandex.plus.pay.ui.common.internal.error.content.h(str, str2, null, null, null, (com.yandex.plus.pay.ui.common.internal.error.content.f) pair.a, pair3 != null ? (com.yandex.plus.pay.ui.common.internal.error.content.f) pair3.a : null), new y((com.yandex.plus.bdui.action.a) pair.b, pair3 != null ? (com.yandex.plus.bdui.action.a) pair3.b : null, (com.yandex.plus.bdui.action.a) pair2.b, bVar));
    }

    @Override // com.yandex.plus.bdui.ui.c
    public final void a(View view) {
        view.getClass();
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = false;
    }

    @Override // com.yandex.plus.bdui.ui.c
    public final View b(ViewGroup viewGroup) {
        viewGroup.getClass();
        Context context = viewGroup.getContext();
        context.getClass();
        ErrorContentView errorContentView = new ErrorContentView(context, null, 2, null);
        this.i = errorContentView;
        w wVar = new w(0, this, z.class, "onPrimaryButtonClick", "onPrimaryButtonClick()V", 0, 2);
        w wVar2 = new w(0, this, z.class, "onSecondaryButtonClick", "onSecondaryButtonClick()V", 0, 3);
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.b bVar = new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.b(errorContentView, this.d, this.c, this.e, new w(0, this, z.class, "onCloseButtonClick", "onCloseButtonClick()V", 0, 4), wVar, wVar2);
        bVar.b(null);
        this.h = bVar;
        com.yandex.plus.core.insets.d dVar = new com.yandex.plus.core.insets.d(0);
        v vVar = new v(bVar, 1);
        com.yandex.plus.core.insets.a aVar = new com.yandex.plus.core.insets.a();
        aVar.b = new LinkedHashSet(2);
        aVar.d();
        aVar.c();
        dVar.b.put(vVar, aVar);
        dVar.b(errorContentView);
        this.j = null;
        this.k = false;
        return errorContentView;
    }

    @Override // com.yandex.plus.bdui.ui.a
    public final Object c(com.yandex.plus.bdui.content.d dVar, com.yandex.plus.bdui.flex.ui.t tVar, Continuation continuation) {
        com.yandex.plus.bdui.action.a aVar;
        Pair e;
        if (!dVar.d) {
            com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.b bVar = this.h;
            com.yandex.plus.log.api.b bVar2 = this.g;
            if (bVar != null) {
                com.yandex.plus.bdui.failure.d dVar2 = ((com.yandex.plus.bdui.plus.content.j) dVar.b).a;
                boolean z = dVar2 instanceof com.yandex.plus.bdui.plus.failure.a;
                com.yandex.plus.bdui.shared.b bVar3 = dVar.c;
                com.yandex.plus.pay.ui.core.api.common.a aVar2 = this.b;
                if (z) {
                    com.yandex.plus.bdui.plus.failure.a aVar3 = (com.yandex.plus.bdui.plus.failure.a) dVar2;
                    i2 i2Var = aVar3.a.e.e;
                    com.yandex.plus.bdui.plus.content.controller.m mVar = aVar3.d;
                    com.yandex.plus.core.templating.template.j jVar = i2Var.d;
                    s9f[] s9fVarArr = i2.f;
                    Pair pair = new Pair(new com.yandex.plus.pay.ui.common.internal.error.content.f((String) jVar.d(s9fVarArr[2]), com.yandex.plus.pay.ui.common.internal.error.content.e.b), mVar);
                    com.yandex.plus.bdui.plus.content.s sVar = i2Var.a;
                    com.yandex.plus.bdui.action.a aVar4 = sVar.a;
                    String a = sVar.a();
                    if (a == null) {
                        a = aVar2.get(R.string.PlusPay_Error_Unknown_Button);
                    }
                    e = e((String) i2Var.b.d(s9fVarArr[0]), (String) i2Var.c.d(s9fVarArr[1]), pair, new Pair(new com.yandex.plus.pay.ui.common.internal.error.content.f(a, com.yandex.plus.pay.ui.common.internal.error.content.e.a), aVar4), bVar3);
                } else {
                    Pair pair2 = null;
                    if (dVar2 instanceof i1) {
                        i1 i1Var = (i1) dVar2;
                        com.yandex.plus.bdui.plus.content.b bVar4 = i1Var.d;
                        if (bVar4 != null) {
                            com.yandex.plus.bdui.action.a aVar5 = bVar4.a;
                            String a2 = bVar4.a();
                            if (a2 == null) {
                                a2 = aVar2.get(R.string.PlusPay_Error_Button_Retry);
                            }
                            pair2 = new Pair(new com.yandex.plus.pay.ui.common.internal.error.content.f(a2, com.yandex.plus.pay.ui.common.internal.error.content.e.b), aVar5);
                        }
                        com.yandex.plus.bdui.plus.content.s sVar2 = i1Var.c;
                        com.yandex.plus.bdui.action.a aVar6 = sVar2.a;
                        String a3 = sVar2.a();
                        if (a3 == null) {
                            a3 = aVar2.get(R.string.PlusPay_Error_Unknown_Button);
                        }
                        Pair pair3 = new Pair(new com.yandex.plus.pay.ui.common.internal.error.content.f(a3, com.yandex.plus.pay.ui.common.internal.error.content.e.a), aVar6);
                        com.yandex.plus.core.templating.template.j jVar2 = i1Var.a;
                        s9f[] s9fVarArr2 = i1.f;
                        String str = (String) jVar2.d(s9fVarArr2[0]);
                        if (str == null) {
                            str = aVar2.get(R.string.PlusPay_Error_Unknown_Title);
                        }
                        String str2 = (String) i1Var.b.d(s9fVarArr2[1]);
                        if (str2 == null) {
                            str2 = aVar2.get(R.string.PlusPay_Error_Unknown_Subtitle);
                        }
                        e = e(str, str2, pair2, pair3, bVar3);
                    } else {
                        Pair pair4 = new Pair(new com.yandex.plus.pay.ui.common.internal.error.content.f(aVar2.get(R.string.PlusPay_Error_Button_Retry), com.yandex.plus.pay.ui.common.internal.error.content.e.b), com.yandex.plus.bdui.plus.action.n.a);
                        com.yandex.plus.bdui.action.k kVar = dVar2 instanceof com.yandex.plus.bdui.action.k ? (com.yandex.plus.bdui.action.k) dVar2 : null;
                        if (kVar == null || (aVar = kVar.a()) == null) {
                            com.yandex.plus.bdui.action.j jVar3 = dVar2 instanceof com.yandex.plus.bdui.action.j ? (com.yandex.plus.bdui.action.j) dVar2 : null;
                            com.yandex.plus.bdui.action.a b = jVar3 != null ? jVar3.b() : null;
                            if (b == null) {
                                this.f.getClass();
                                aVar = com.yandex.plus.bdui.plus.checkout.action.a.a(bVar3);
                            } else {
                                aVar = b;
                            }
                        }
                        e = e(aVar2.get(R.string.PlusPay_Error_Unknown_Title), aVar2.get(R.string.PlusPay_Error_Unknown_Subtitle), pair4, new Pair(new com.yandex.plus.pay.ui.common.internal.error.content.f(aVar2.get(R.string.PlusPay_Error_Unknown_Button), com.yandex.plus.pay.ui.common.internal.error.content.e.a), aVar), bVar3);
                    }
                }
                com.yandex.plus.pay.ui.common.internal.error.content.h hVar = (com.yandex.plus.pay.ui.common.internal.error.content.h) e.a;
                this.j = (y) e.b;
                com.yandex.plus.log.api.a aVar7 = com.yandex.plus.log.api.a.c;
                if (bVar2.b(aVar7)) {
                    bVar2.c(aVar7, "PlusPayFailureController", "onUpdateStateAsync(); set content = " + hVar);
                }
                bVar.h(hVar);
                if (!this.k) {
                    ErrorContentView errorContentView = this.i;
                    if (errorContentView != null) {
                        r1.O(errorContentView, com.yandex.plus.pay.ui.core.mobile.haptic.a.b);
                    }
                    this.k = true;
                }
            } else {
                com.yandex.plus.log.api.a aVar8 = com.yandex.plus.log.api.a.d;
                if (bVar2.b(aVar8)) {
                    bVar2.c(aVar8, "PlusPayFailureController", "onUpdateStateAsync(); content view controller not found!");
                }
            }
        }
        return Unit.a;
    }

    public final void d(y yVar, com.yandex.plus.bdui.action.a aVar) {
        this.a.a.a(aVar, new com.yandex.plus.bdui.action.h(yVar.d), null);
    }
}
