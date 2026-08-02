package com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import defpackage.ern;
import defpackage.f1d;
import defpackage.m8f;
import defpackage.opn;
import defpackage.s9f;
import defpackage.yxm;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class c extends opn {
    public static final /* synthetic */ s9f[] B = {new yxm(c.class, "button", "getButton()Landroid/widget/Button;", 0), f1d.c(ern.a, c.class, "cardView", "getCardView()Lcom/google/android/material/card/MaterialCardView;", 0), new yxm(c.class, "logosRecycler", "getLogosRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0), new yxm(c.class, "titleTextView", "getTitleTextView()Landroid/widget/TextView;", 0), new yxm(c.class, "benefitsRecycler", "getBenefitsRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0), new yxm(c.class, "additionalTextView", "getAdditionalTextView()Landroid/widget/TextView;", 0)};
    public final /* synthetic */ com.yandex.plus.core.debug.panel.internal.presentation.adapter.b A;
    public final com.yandex.plus.bdui.plus.content.controller.f u;
    public final com.yandex.plus.bdui.plus.content.controller.f v;
    public final com.yandex.plus.bdui.plus.content.controller.f w;
    public final com.yandex.plus.bdui.plus.content.controller.f x;
    public final com.yandex.plus.bdui.plus.content.controller.f y;
    public final m8f z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.yandex.plus.core.debug.panel.internal.presentation.adapter.b bVar, View view, boolean z) {
        super(view);
        this.A = bVar;
        this.u = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.b(view, 14));
        com.yandex.plus.bdui.plus.content.controller.f fVar = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.b(view, 15));
        this.v = fVar;
        this.w = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.b(view, 16));
        com.yandex.plus.bdui.plus.content.controller.f fVar2 = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.b(view, 17));
        this.x = fVar2;
        this.y = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.b(view, 18));
        m8f m8fVar = new m8f(5);
        this.z = m8fVar;
        s9f[] s9fVarArr = B;
        ((TextView) fVar2.g(s9fVarArr[3])).setMovementMethod(new com.yandex.plus.home.common.ui.a());
        s9f s9fVar = s9fVarArr[4];
        s9fVar.getClass();
        try {
            View findViewById = view.findViewById(R.id.counter_offer_benefits_recycler);
            if (findViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            }
            ((RecyclerView) findViewById).setAdapter(m8fVar);
            if (z) {
                ((MaterialCardView) fVar.g(s9fVarArr[1])).setCardBackgroundColor(((MaterialCardView) fVar.g(s9fVarArr[1])).getCardBackgroundColor().withAlpha(102));
            }
        } catch (ClassCastException e) {
            com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar, e);
            throw null;
        }
    }
}
