package com.yandex.plus.pay.ui.core.mobile.view.payment.methods.adapter;

import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import defpackage.ern;
import defpackage.f1d;
import defpackage.s9f;
import defpackage.vvr;
import defpackage.yxm;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class g extends f {
    public static final /* synthetic */ s9f[] w = {new yxm(g.class, "textView", "getTextView()Landroid/widget/TextView;", 0), f1d.c(ern.a, g.class, "switch", "getSwitch()Landroidx/appcompat/widget/SwitchCompat;", 0), new yxm(g.class, "divider", "getDivider()Landroid/view/View;", 0)};
    public final com.yandex.plus.bdui.plus.content.controller.f u;
    public final com.yandex.plus.bdui.plus.content.controller.f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(View view, Function1 function1) {
        super(view);
        function1.getClass();
        this.u = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.b(view, 27));
        com.yandex.plus.bdui.plus.content.controller.f fVar = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.b(view, 28));
        this.v = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.b(view, 29));
        ((SwitchCompat) fVar.g(w[1])).setOnCheckedChangeListener(new vvr(2, function1));
    }

    @Override // com.yandex.plus.pay.ui.core.mobile.view.payment.methods.adapter.f
    public final void t(d dVar, boolean z) {
        dVar.getClass();
        if (!(dVar instanceof c)) {
            throw new IllegalArgumentException("item must be PaymentMethodsAdapter.Item.PlusPoints");
        }
        s9f[] s9fVarArr = w;
        ((View) this.v.g(s9fVarArr[2])).setVisibility(z ? 0 : 4);
        throw null;
    }
}
