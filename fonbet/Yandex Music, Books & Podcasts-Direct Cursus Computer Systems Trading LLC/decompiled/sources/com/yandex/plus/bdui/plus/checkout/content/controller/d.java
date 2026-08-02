package com.yandex.plus.bdui.plus.checkout.content.controller;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.plus.pay.ui.core.mobile.view.toolbar.PlusPayToolbarView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class d extends a {
    public final com.yandex.plus.core.imageloader.b b;
    public final com.yandex.plus.pay.ui.design.api.api.a c;
    public final com.yandex.plus.log.api.b d;
    public com.yandex.plus.pay.ui.core.mobile.view.toolbar.i e;
    public com.yandex.plus.bdui.content.d f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.yandex.plus.bdui.m mVar, com.yandex.plus.core.imageloader.b bVar, com.yandex.plus.pay.ui.design.api.api.a aVar, com.yandex.plus.log.api.b bVar2) {
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
        this.e = null;
        this.f = null;
    }

    @Override // com.yandex.plus.bdui.ui.c
    public final View b(ViewGroup viewGroup) {
        viewGroup.getClass();
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pay_sdk_appbar_view, viewGroup, false);
        inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f = null;
        View findViewById = inflate.findViewById(R.id.payment_appbar);
        findViewById.getClass();
        this.e = new com.yandex.plus.pay.ui.core.mobile.view.toolbar.i((PlusPayToolbarView) findViewById, this.c, this.b, new com.yandex.plus.bdui.flex.factory.d(0, this, d.class, "closeClickListener", "closeClickListener()V", 0, 21));
        return inflate;
    }

    @Override // com.yandex.plus.bdui.ui.a
    public final Object c(com.yandex.plus.bdui.content.d dVar, com.yandex.plus.bdui.flex.ui.t tVar, Continuation continuation) {
        if (!dVar.d) {
            com.yandex.plus.pay.ui.core.mobile.view.toolbar.i iVar = this.e;
            com.yandex.plus.log.api.b bVar = this.d;
            if (iVar != null) {
                this.f = dVar;
                com.yandex.plus.pay.ui.core.mobile.view.toolbar.h d = a.d(((com.yandex.plus.bdui.plus.checkout.content.a) dVar.b).a);
                com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
                if (bVar.b(aVar)) {
                    bVar.c(aVar, "PlusPayAppBarContentController", "onUpdateStateAsync(); apply toolbar state = " + d);
                }
                iVar.a(d);
            } else {
                com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.d;
                if (bVar.b(aVar2)) {
                    bVar.c(aVar2, "PlusPayAppBarContentController", "onUpdateStateAsync(); toolbar controller not found!");
                }
            }
        }
        return Unit.a;
    }
}
