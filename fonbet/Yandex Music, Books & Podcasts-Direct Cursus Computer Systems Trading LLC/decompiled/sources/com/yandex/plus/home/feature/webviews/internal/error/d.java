package com.yandex.plus.home.feature.webviews.internal.error;

import android.view.View;
import android.widget.TextView;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import defpackage.ern;
import defpackage.f1d;
import defpackage.s9f;
import defpackage.yxm;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class d {
    public static final /* synthetic */ s9f[] b = {new yxm(d.class, "retryButtonTitle", "getRetryButtonTitle()Landroid/widget/TextView;", 0), f1d.c(ern.a, d.class, "retryButtonSubtitle", "getRetryButtonSubtitle()Landroid/widget/TextView;", 0)};
    public final View a;

    public d(View view, com.yandex.plus.resources.core.a aVar) {
        aVar.getClass();
        this.a = view;
        s9f[] s9fVarArr = b;
        s9f s9fVar = s9fVarArr[0];
        s9fVar.getClass();
        try {
            View findViewById = view.findViewById(R.id.plus_sdk_retry_button_title);
            if (findViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            com.yandex.plus.resources.core.c cVar = (com.yandex.plus.resources.core.c) aVar;
            ((TextView) findViewById).setText(r1.m(cVar.a(R.string.Home_ContentPlaceholder_RetryButton_Title), view));
            s9f s9fVar2 = s9fVarArr[1];
            s9fVar2.getClass();
            try {
                View findViewById2 = view.findViewById(R.id.plus_sdk_retry_button_subtitle);
                if (findViewById2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                ((TextView) findViewById2).setText(r1.m(cVar.a(R.string.Home_ContentPlaceholder_RetryButton_Subtitle), view));
            } catch (ClassCastException e) {
                com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar2, e);
                throw null;
            }
        } catch (ClassCastException e2) {
            com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar, e2);
            throw null;
        }
    }
}
