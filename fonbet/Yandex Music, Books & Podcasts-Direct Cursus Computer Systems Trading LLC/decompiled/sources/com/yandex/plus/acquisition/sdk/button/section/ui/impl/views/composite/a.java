package com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite;

import android.view.KeyEvent;
import android.view.View;
import defpackage.s9f;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class a implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ a(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                s9f s9fVar = (s9f) obj;
                s9fVar.getClass();
                try {
                    View findViewById = bVar.findViewById(R.id.composite_products_container);
                    if (findViewById != null) {
                        return (CompositeProductsLayout) findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.CompositeProductsLayout");
                } catch (ClassCastException e) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar, e);
                    return null;
                }
            default:
                s9f s9fVar2 = (s9f) obj;
                s9fVar2.getClass();
                try {
                    KeyEvent.Callback findViewById2 = bVar.findViewById(R.id.composite_offer_view);
                    if (findViewById2 != null) {
                        return (com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.offer.a) findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.offer.CompositeOffer");
                } catch (ClassCastException e2) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar2, e2);
                    return null;
                }
        }
    }
}
