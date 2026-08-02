package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers;

import android.view.View;
import com.yandex.plus.pay.ui.common.api.ui.view.ProgressView;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.CounterOffersContentView;
import defpackage.s9f;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class e implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ e(f fVar, int i) {
        this.a = i;
        this.b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        f fVar = this.b;
        switch (i) {
            case 0:
                s9f s9fVar = (s9f) obj;
                s9fVar.getClass();
                try {
                    View findViewById = fVar.requireView().findViewById(R.id.counter_offers_content_view);
                    if (findViewById != null) {
                        return (CounterOffersContentView) findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.CounterOffersContentView");
                } catch (ClassCastException e) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar, e);
                    return null;
                }
            default:
                s9f s9fVar2 = (s9f) obj;
                s9fVar2.getClass();
                try {
                    View findViewById2 = fVar.requireView().findViewById(R.id.counter_offers_progress_view);
                    if (findViewById2 != null) {
                        return (ProgressView) findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.pay.ui.common.api.ui.view.ProgressView");
                } catch (ClassCastException e2) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar2, e2);
                    return null;
                }
        }
    }
}
