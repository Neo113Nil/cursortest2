package com.yandex.plus.pay.ui.core.mobile.view.payment.promos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.k8g;
import defpackage.opn;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class e extends k8g {
    public final boolean e;
    public final com.yandex.plus.ui.core.theme.a f;
    public final com.yandex.plus.core.imageloader.b g;
    public final Function1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z, com.yandex.plus.ui.core.theme.a aVar, com.yandex.plus.core.imageloader.b bVar, Function1 function1) {
        super(d.p);
        aVar.getClass();
        bVar.getClass();
        this.e = z;
        this.f = aVar;
        this.g = bVar;
        this.h = function1;
    }

    @Override // defpackage.qon
    public final void j(opn opnVar, int i) {
        c cVar = (c) opnVar;
        if (this.e) {
            Object u = u(i);
            u.getClass();
            cVar.t((f) u);
        } else {
            Object obj = this.d.f.get((r0.f.size() - 1) - i);
            obj.getClass();
            cVar.t((f) obj);
        }
    }

    @Override // defpackage.qon
    public final opn m(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pay_sdk_item_payment_promo, viewGroup, false);
        inflate.getClass();
        return new c(this, inflate);
    }
}
