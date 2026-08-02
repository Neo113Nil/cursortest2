package com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.badges;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.s9f;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class c implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BadgesView b;

    public /* synthetic */ c(BadgesView badgesView, int i) {
        this.a = i;
        this.b = badgesView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        BadgesView badgesView = this.b;
        switch (i) {
            case 0:
                s9f s9fVar = (s9f) obj;
                s9fVar.getClass();
                try {
                    View findViewById = badgesView.findViewById(R.id.discount_badge_text_view);
                    if (findViewById != null) {
                        return (TextView) findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar, e);
                    return null;
                }
            case 1:
                s9f s9fVar2 = (s9f) obj;
                s9fVar2.getClass();
                try {
                    View findViewById2 = badgesView.findViewById(R.id.plus_points_badge_container);
                    if (findViewById2 != null) {
                        return (LinearLayout) findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
                } catch (ClassCastException e2) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar2, e2);
                    return null;
                }
            default:
                s9f s9fVar3 = (s9f) obj;
                s9fVar3.getClass();
                try {
                    View findViewById3 = badgesView.findViewById(R.id.plus_points_badge_text_view);
                    if (findViewById3 != null) {
                        return (TextView) findViewById3;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e3) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar3, e3);
                    return null;
                }
        }
    }
}
