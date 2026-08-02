package com.squareup.cash.arcade.components.cell;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import app.cash.local.viewmodels.LocalCheckoutOrderSummaryViewModel;
import app.cash.local.views.brand.checkout.CheckoutTipSectionKt;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class CellActivityAvatarScope$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ int f$7;
    public final /* synthetic */ int f$8;

    public /* synthetic */ CellActivityAvatarScope$$ExternalSyntheticLambda0(LocalCheckoutOrderSummaryViewModel localCheckoutOrderSummaryViewModel, Modifier modifier, String str, String str2, long j, int i, int i2) {
        this.f$0 = localCheckoutOrderSummaryViewModel;
        this.f$3 = modifier;
        this.f$1 = str;
        this.f$5 = str2;
        this.f$2 = j;
        this.f$7 = i;
        this.f$8 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$7;
        Object obj3 = this.f$5;
        Object obj4 = this.f$3;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                ((RealCellActivityAvatarScope) obj5).m3395AvatarOadGlvw(this.f$1, this.f$2, (AvatarImage) obj4, (AvatarOverlay) obj3, (Composer) obj, updateChangedFlags, this.f$8);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                CheckoutTipSectionKt.m1302CheckoutOrderSummarySectionyrwZFoE((LocalCheckoutOrderSummaryViewModel) obj5, (Modifier) obj4, this.f$1, (String) obj3, this.f$2, (Composer) obj, updateChangedFlags2, this.f$8);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ CellActivityAvatarScope$$ExternalSyntheticLambda0(RealCellActivityAvatarScope realCellActivityAvatarScope, String str, long j, AvatarImage avatarImage, AvatarOverlay avatarOverlay, int i, int i2) {
        this.f$0 = realCellActivityAvatarScope;
        this.f$1 = str;
        this.f$2 = j;
        this.f$3 = avatarImage;
        this.f$5 = avatarOverlay;
        this.f$7 = i;
        this.f$8 = i2;
    }
}
