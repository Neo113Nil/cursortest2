package com.squareup.cash.retro.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import coil3.RealImageLoader;
import com.squareup.cash.common.composeui.CircularBadgeShape;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.mooncake.components.SplitButtons;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.mooncake.compose_ui.components.SplitButtonEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class PaymentPlanSummaryViewKt$$ExternalSyntheticLambda28 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Modifier f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ float f$4;
    public final /* synthetic */ float f$5;
    public final /* synthetic */ Object f$6;

    public /* synthetic */ PaymentPlanSummaryViewKt$$ExternalSyntheticLambda28(float f, float f2, int i, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, RealImageLoader realImageLoader, CircularBadgeShape circularBadgeShape, AvatarBadgeViewModel avatarBadgeViewModel) {
        this.f$0 = avatarBadgeViewModel;
        this.f$1 = modifier;
        this.f$2 = realImageLoader;
        this.f$3 = circularBadgeShape;
        this.f$4 = f;
        this.f$5 = f2;
        this.f$6 = composableLambdaImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$6;
        Object obj4 = this.f$3;
        Object obj5 = this.f$2;
        Object obj6 = this.f$0;
        switch (i) {
            case 0:
                AvatarBadgeViewModel avatarBadgeViewModel = (AvatarBadgeViewModel) obj6;
                CircularBadgeShape circularBadgeShape = (CircularBadgeShape) obj4;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj3;
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(1794049);
                float f = this.f$4;
                float f2 = this.f$5;
                PaymentPlanSummaryViewKt.m3734MaybeBadgedBox3GLzNTs(f, f2, updateChangedFlags, (Composer) obj, composableLambdaImpl, this.f$1, (RealImageLoader) obj5, circularBadgeShape, avatarBadgeViewModel);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(36871);
                KeypadKt.m3649SplitButtonsnbWgWpA(this.f$1, (SplitButtons.Style) obj6, (SplitButtons.LayoutMode) obj5, (SplitButtonEntry) obj4, (SplitButtonEntry) obj3, this.f$4, this.f$5, (Composer) obj, updateChangedFlags2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ PaymentPlanSummaryViewKt$$ExternalSyntheticLambda28(Modifier modifier, SplitButtons.Style style, SplitButtons.LayoutMode layoutMode, SplitButtonEntry splitButtonEntry, SplitButtonEntry splitButtonEntry2, float f, float f2, int i) {
        this.f$1 = modifier;
        this.f$0 = style;
        this.f$2 = layoutMode;
        this.f$3 = splitButtonEntry;
        this.f$6 = splitButtonEntry2;
        this.f$4 = f;
        this.f$5 = f2;
    }
}
