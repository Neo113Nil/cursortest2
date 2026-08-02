package com.squareup.cash.card.onboarding;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import app.cash.local.viewmodels.LocalBrandProfileViewModel;
import app.cash.local.views.brand.profile.LocalBrandLocationRowKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class PaymentDeviceCustomizationViewKt$$ExternalSyntheticLambda41 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ float f$1;
    public final /* synthetic */ float f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ int f$5;

    public /* synthetic */ PaymentDeviceCustomizationViewKt$$ExternalSyntheticLambda41(Object obj, float f, float f2, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = f;
        this.f$2 = f2;
        this.f$3 = obj2;
        this.f$4 = obj3;
        this.f$5 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$5;
        Object obj3 = this.f$4;
        Object obj4 = this.f$3;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                float f = this.f$1;
                float f2 = this.f$2;
                PaymentDeviceCustomizationViewKt.m3438FallbackHero942rkJo((PaymentDeviceItemViewModel) obj5, f, f2, (SharedTransitionScope) obj4, (AnimatedVisibilityScope) obj3, (Composer) obj, updateChangedFlags);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                float f3 = this.f$1;
                float f4 = this.f$2;
                LocalBrandLocationRowKt.ToolbarActions((Modifier) obj5, f3, f4, (LocalBrandProfileViewModel.MoreOptionsMenuModel) obj4, (Function1) obj3, (Composer) obj, updateChangedFlags2);
                break;
        }
        return Unit.INSTANCE;
    }
}
