package com.squareup.cash.money.views;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.MutableState;
import com.squareup.cash.card.onboarding.PdpPanelState;
import com.squareup.cash.card.onboarding.ZoomLevel;
import com.squareup.cash.card.onboarding.core.instancing.CardDesignLibraryState;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda10;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneyTabUIKt$$ExternalSyntheticLambda28 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ float f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda28(CardDesignLibraryState cardDesignLibraryState, PdpPanelState pdpPanelState, float f) {
        this.$r8$classId = 1;
        this.f$0 = cardDesignLibraryState;
        this.f$2 = pdpPanelState;
        this.f$1 = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Object obj = this.f$2;
        float f = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                return new CardNestedScrollExpander((Function0) obj2, f, false, new ComposeDialogKt$$ExternalSyntheticLambda10(26, (Function0) obj));
            case 1:
                return Boolean.valueOf(((CardDesignLibraryState) obj2).getZoomLevel() == ZoomLevel.NEAR && ((float) ((PdpPanelState) obj).scrollState.value$delegate.getIntValue()) >= f);
            default:
                return Boolean.valueOf(((String) ((MutableState) obj).getValue()) != null && ((float) ((ScrollState) obj2).value$delegate.getIntValue()) >= f);
        }
    }

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda28(Object obj, float f, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = f;
        this.f$2 = obj2;
    }
}
