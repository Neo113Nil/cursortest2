package com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.onsale;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.material.card.MaterialCardView;
import com.yandex.passport.common.util.e;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.content.controller.f;
import defpackage.aa5;
import defpackage.ern;
import defpackage.s9f;
import defpackage.yxm;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class OfferSwitchView extends FrameLayout {
    public static final /* synthetic */ s9f[] b;
    public final f a;

    static {
        yxm yxmVar = new yxm(OfferSwitchView.class, "card", "getCard()Lcom/google/android/material/card/MaterialCardView;", 0);
        ern.a.getClass();
        b = new s9f[]{yxmVar};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferSwitchView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.a = new f(new e(8, this));
        r1.p(this, R.layout.pay_sdk_view_offer_switch, true);
        int j = r1.j(R.attr.pay_sdk_primaryBlockColor, this);
        getCard().setCardBackgroundColor(aa5.l(j, 128));
        getCard().setStrokeColor(aa5.l(j, 140));
    }

    private final MaterialCardView getCard() {
        return (MaterialCardView) this.a.g(b[0]);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OfferSwitchView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ OfferSwitchView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OfferSwitchView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
