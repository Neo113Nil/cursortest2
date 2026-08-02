package com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.button;

import android.view.View;
import android.widget.TextView;
import defpackage.s9f;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class a implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PurchaseButtonView b;

    public /* synthetic */ a(PurchaseButtonView purchaseButtonView, int i) {
        this.a = i;
        this.b = purchaseButtonView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        PurchaseButtonView purchaseButtonView = this.b;
        switch (i) {
            case 0:
                s9f s9fVar = (s9f) obj;
                s9fVar.getClass();
                try {
                    View findViewById = purchaseButtonView.findViewById(R.id.purchase_text_view);
                    if (findViewById != null) {
                        return (TextView) findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar, e);
                    return null;
                }
            default:
                s9f s9fVar2 = (s9f) obj;
                s9fVar2.getClass();
                try {
                    View findViewById2 = purchaseButtonView.findViewById(R.id.read_more_text_view);
                    if (findViewById2 != null) {
                        return (TextView) findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e2) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar2, e2);
                    return null;
                }
        }
    }
}
