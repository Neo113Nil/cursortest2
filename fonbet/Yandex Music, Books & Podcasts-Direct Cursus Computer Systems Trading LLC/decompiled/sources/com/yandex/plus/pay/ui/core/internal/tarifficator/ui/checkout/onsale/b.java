package com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.onsale;

import android.transition.TransitionManager;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.content.controller.f;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.i;
import defpackage.ern;
import defpackage.f1d;
import defpackage.f96;
import defpackage.s9f;
import defpackage.yxm;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b {
    public static final /* synthetic */ s9f[] h = {new yxm(b.class, "layout", "getLayout()Landroidx/constraintlayout/widget/ConstraintLayout;", 0), f1d.c(ern.a, b.class, "selectedCard", "getSelectedCard()Lcom/google/android/material/card/MaterialCardView;", 0), new yxm(b.class, "originalTextView", "getOriginalTextView()Landroid/widget/TextView;", 0), new yxm(b.class, "suggestedFlow", "getSuggestedFlow()Landroidx/constraintlayout/helper/widget/Flow;", 0), new yxm(b.class, "suggestedTextView", "getSuggestedTextView()Landroid/widget/TextView;", 0), new yxm(b.class, "badgeTextView", "getBadgeTextView()Landroid/widget/TextView;", 0)};
    public final f a;
    public final f b;
    public final f c;
    public final f d;
    public final f e;
    public final f f;
    public Boolean g;

    public b(OfferSwitchView offerSwitchView, final Function1 function1) {
        offerSwitchView.getClass();
        this.a = new f(new i(offerSwitchView, 9));
        this.b = new f(new i(offerSwitchView, 10));
        f fVar = new f(new i(offerSwitchView, 11));
        this.c = fVar;
        f fVar2 = new f(new i(offerSwitchView, 12));
        this.d = fVar2;
        this.e = new f(new i(offerSwitchView, 13));
        this.f = new f(new i(offerSwitchView, 14));
        s9f[] s9fVarArr = h;
        final int i = 0;
        r1.E((TextView) fVar.g(s9fVarArr[2]), new View.OnClickListener(this) { // from class: com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.onsale.a
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        if (Intrinsics.d(this.b.g, Boolean.TRUE)) {
                            function1.invoke(Boolean.FALSE);
                            break;
                        }
                        break;
                    default:
                        if (Intrinsics.d(this.b.g, Boolean.FALSE)) {
                            function1.invoke(Boolean.TRUE);
                            break;
                        }
                        break;
                }
            }
        });
        Flow flow = (Flow) fVar2.g(s9fVarArr[3]);
        final int i2 = 1;
        r1.E(flow, new View.OnClickListener(this) { // from class: com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.onsale.a
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        if (Intrinsics.d(this.b.g, Boolean.TRUE)) {
                            function1.invoke(Boolean.FALSE);
                            break;
                        }
                        break;
                    default:
                        if (Intrinsics.d(this.b.g, Boolean.FALSE)) {
                            function1.invoke(Boolean.TRUE);
                            break;
                        }
                        break;
                }
            }
        });
    }

    public final void a(View view) {
        f96 f96Var = new f96();
        s9f[] s9fVarArr = h;
        s9f s9fVar = s9fVarArr[0];
        f fVar = this.a;
        TransitionManager.beginDelayedTransition((ConstraintLayout) fVar.g(s9fVar));
        f96Var.f((ConstraintLayout) fVar.g(s9fVarArr[0]));
        s9f s9fVar2 = s9fVarArr[1];
        f fVar2 = this.b;
        f96Var.g(((MaterialCardView) fVar2.g(s9fVar2)).getId(), 6, view.getId(), 6);
        f96Var.g(((MaterialCardView) fVar2.g(s9fVarArr[1])).getId(), 7, view.getId(), 7);
        f96Var.b((ConstraintLayout) fVar.g(s9fVarArr[0]));
    }
}
