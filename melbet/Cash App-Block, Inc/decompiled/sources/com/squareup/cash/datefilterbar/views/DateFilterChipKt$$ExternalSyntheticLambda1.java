package com.squareup.cash.datefilterbar.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import app.cash.local.views.brand.checkout.CurbsidePickupCarSheetKt;
import com.fillr.core.analytics.FillrAnalyticsServiceBuilder;
import com.squareup.cash.card.onboarding.pdp.HeroSectionKt;
import com.squareup.cash.investing.components.custom.order.CustomOrderKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class DateFilterChipKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ Modifier f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ ComposableLambdaImpl f$3;

    public /* synthetic */ DateFilterChipKt$$ExternalSyntheticLambda1(Function0 function0, Modifier modifier, boolean z, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = function0;
        this.f$1 = modifier;
        this.f$2 = z;
        this.f$3 = composableLambdaImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                FillrAnalyticsServiceBuilder.DateFilterChip(Updater.updateChangedFlags(3073), (Composer) obj, this.f$3, this.f$1, this.f$0, this.f$2);
                break;
            case 1:
                ((Integer) obj2).getClass();
                CurbsidePickupCarSheetKt.VehicleChip(Updater.updateChangedFlags(3073), (Composer) obj, this.f$3, this.f$1, this.f$0, this.f$2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                HeroSectionKt.OpaqueDisabledButtonCta(Updater.updateChangedFlags(3121), (Composer) obj, this.f$3, this.f$1, this.f$0, this.f$2);
                break;
            default:
                ((Integer) obj2).getClass();
                CustomOrderKt.DimmableBackground(Updater.updateChangedFlags(3073), (Composer) obj, this.f$3, this.f$1, this.f$0, this.f$2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ DateFilterChipKt$$ExternalSyntheticLambda1(boolean z, Function0 function0, Modifier modifier, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.$r8$classId = i2;
        this.f$2 = z;
        this.f$0 = function0;
        this.f$1 = modifier;
        this.f$3 = composableLambdaImpl;
    }
}
