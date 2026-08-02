package com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.badges;

import android.view.KeyEvent;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.d;
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
                    KeyEvent.Callback findViewById = bVar.findViewById(R.id.product_texts_view);
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
                    KeyEvent.Callback findViewById2 = bVar.findViewById(R.id.badges_view);
                    if (findViewById2 != null) {
                        return (com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.badges.b) findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.badges.Badges");
                } catch (ClassCastException e2) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar2, e2);
                    return null;
                }
        }
    }
}
