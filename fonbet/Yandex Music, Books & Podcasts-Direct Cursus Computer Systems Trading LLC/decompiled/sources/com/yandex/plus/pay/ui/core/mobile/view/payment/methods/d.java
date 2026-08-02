package com.yandex.plus.pay.ui.core.mobile.view.payment.methods;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.plus.bdui.plus.content.controller.f;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.n;
import com.yandex.plus.pay.ui.core.mobile.view.payment.promos.e;
import defpackage.ern;
import defpackage.f1d;
import defpackage.k32;
import defpackage.s9f;
import defpackage.yxm;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class d {
    public static final /* synthetic */ s9f[] g = {new yxm(d.class, "progressView", "getProgressView()Lcom/yandex/plus/pay/ui/common/api/ui/view/ProgressView;", 0), f1d.c(ern.a, d.class, "titleTextView", "getTitleTextView()Landroid/widget/TextView;", 0), new yxm(d.class, "methodsRecyclerView", "getMethodsRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), new yxm(d.class, "promosRecyclerView", "getPromosRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    public final f a;
    public final f b;
    public final f c;
    public final f d;
    public final n e;
    public final e f;

    public d(com.yandex.plus.ui.core.theme.a aVar, PlusPayPaymentMethodsView plusPayPaymentMethodsView, com.yandex.plus.core.imageloader.b bVar, k32 k32Var, k32 k32Var2) {
        com.yandex.plus.pay.ui.common.internal.error.content.b bVar2 = new com.yandex.plus.pay.ui.common.internal.error.content.b(8);
        aVar.getClass();
        plusPayPaymentMethodsView.getClass();
        bVar.getClass();
        this.a = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.b(plusPayPaymentMethodsView, 17));
        this.b = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.b(plusPayPaymentMethodsView, 18));
        f fVar = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.b(plusPayPaymentMethodsView, 19));
        this.c = fVar;
        f fVar2 = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.b(plusPayPaymentMethodsView, 20));
        this.d = fVar2;
        Context context = plusPayPaymentMethodsView.getContext();
        context.getClass();
        boolean z = context.getResources().getBoolean(R.bool.pay_sdk_isTabletMode);
        n nVar = new n(aVar, bVar, k32Var, (Function1) bVar2);
        this.e = nVar;
        e eVar = new e(z, aVar, bVar, k32Var2);
        this.f = eVar;
        s9f[] s9fVarArr = g;
        ((RecyclerView) fVar.g(s9fVarArr[2])).setAdapter(nVar);
        ((RecyclerView) fVar.g(s9fVarArr[2])).setItemAnimator(null);
        ((RecyclerView) fVar2.g(s9fVarArr[3])).setItemAnimator(null);
        RecyclerView recyclerView = (RecyclerView) fVar2.g(s9fVarArr[3]);
        if (!z) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
            linearLayoutManager.v(null);
            if (true != linearLayoutManager.t) {
                linearLayoutManager.t = true;
                linearLayoutManager.R0();
            }
            linearLayoutManager.K1(true);
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        recyclerView.s(new com.yandex.plus.pay.ui.core.mobile.view.payment.promos.a(z));
        recyclerView.setAdapter(eVar);
    }
}
