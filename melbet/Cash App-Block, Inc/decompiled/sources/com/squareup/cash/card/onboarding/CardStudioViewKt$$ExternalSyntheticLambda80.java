package com.squareup.cash.card.onboarding;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.fidesmo.viewmodels.FidesmoScanningPulseShape;
import com.squareup.cash.fidesmo.views.ScanningShapePulseKt;
import com.squareup.cash.merchant.views.SquareLoyaltyDetailsView;
import com.squareup.cash.shopping.viewmodels.LogoImage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class CardStudioViewKt$$ExternalSyntheticLambda80 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ float f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ CardStudioViewKt$$ExternalSyntheticLambda80(float f, int i, Function1 function1, Function1 function12, int i2) {
        this.f$0 = f;
        this.f$1 = i;
        this.f$2 = function1;
        this.f$3 = function12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$1;
        float f = this.f$0;
        Object obj3 = this.f$3;
        Object obj4 = this.f$2;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(385);
                CardStudioViewKt.ScalingSlider(this.f$0, this.f$1, (Function1) obj4, (Function1) obj3, (Composer) obj, updateChangedFlags);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ScanningShapePulseKt.m3545ShapeGlowViewuFdPcIQ((FidesmoScanningPulseShape) obj4, f, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((SquareLoyaltyDetailsView) obj4).m3602BulletedSheetLogojt2gSs((LogoImage) obj3, f, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ CardStudioViewKt$$ExternalSyntheticLambda80(FidesmoScanningPulseShape fidesmoScanningPulseShape, float f, Modifier modifier, int i) {
        this.f$2 = fidesmoScanningPulseShape;
        this.f$0 = f;
        this.f$3 = modifier;
        this.f$1 = i;
    }

    public /* synthetic */ CardStudioViewKt$$ExternalSyntheticLambda80(SquareLoyaltyDetailsView squareLoyaltyDetailsView, LogoImage logoImage, float f, int i) {
        this.f$2 = squareLoyaltyDetailsView;
        this.f$3 = logoImage;
        this.f$0 = f;
        this.f$1 = i;
    }
}
