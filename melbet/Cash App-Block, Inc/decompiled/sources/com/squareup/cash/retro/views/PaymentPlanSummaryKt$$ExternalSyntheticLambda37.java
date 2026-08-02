package com.squareup.cash.retro.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.core.content.ContextCompat$Api33Impl;
import com.google.android.gms.internal.mlkit_vision_common.zzb;
import com.squareup.cash.account.components.ThemeSwitcherViewKt;
import com.squareup.cash.moneybot.views.menu.ExpandableContentKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class PaymentPlanSummaryKt$$ExternalSyntheticLambda37 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ float f$0;
    public final /* synthetic */ Modifier f$1;

    public /* synthetic */ PaymentPlanSummaryKt$$ExternalSyntheticLambda37(float f, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = f;
        this.f$1 = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                PaymentPlanSummaryKt.ProgressBar(this.f$0, Updater.updateChangedFlags(1), composer, this.f$1);
                break;
            case 1:
                ThemeSwitcherViewKt.TortoiseWipeAnimation(this.f$0, Updater.updateChangedFlags(49), composer, this.f$1);
                break;
            case 2:
                zzb.DisconnectedAlertIcon(this.f$0, Updater.updateChangedFlags(1), composer, this.f$1);
                break;
            case 3:
                ExpandableContentKt.m3635TokenUsageProgressBar6a0pyJM(this.f$0, Updater.updateChangedFlags(391), composer, this.f$1);
                break;
            default:
                ContextCompat$Api33Impl.m1089MooncakeFavoriteBadgeViewrAjV9yQ(this.f$0, Updater.updateChangedFlags(1), composer, this.f$1);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ PaymentPlanSummaryKt$$ExternalSyntheticLambda37(Modifier modifier, float f, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = modifier;
        this.f$0 = f;
    }
}
