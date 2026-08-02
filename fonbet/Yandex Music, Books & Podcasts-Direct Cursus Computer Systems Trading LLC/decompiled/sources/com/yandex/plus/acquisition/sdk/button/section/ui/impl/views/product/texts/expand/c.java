package com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.expand;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.d;
import defpackage.s9f;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class c implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProductExpandTextsView b;

    public /* synthetic */ c(ProductExpandTextsView productExpandTextsView, int i) {
        this.a = i;
        this.b = productExpandTextsView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        ProductExpandTextsView productExpandTextsView = this.b;
        switch (i) {
            case 0:
                s9f s9fVar = (s9f) obj;
                s9fVar.getClass();
                try {
                    KeyEvent.Callback findViewById = productExpandTextsView.findViewById(R.id.product_texts_view);
                    if (findViewById != null) {
                        return (d) findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.ProductTexts");
                } catch (ClassCastException e) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar, e);
                    return null;
                }
            default:
                s9f s9fVar2 = (s9f) obj;
                s9fVar2.getClass();
                try {
                    View findViewById2 = productExpandTextsView.findViewById(R.id.expand_text_view);
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
