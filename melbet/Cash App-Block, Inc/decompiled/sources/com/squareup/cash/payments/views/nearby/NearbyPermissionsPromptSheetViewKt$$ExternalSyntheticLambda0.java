package com.squareup.cash.payments.views.nearby;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.payments.viewmodels.NearbyPermissionsPromptSheetViewModel;
import com.squareup.cash.payments.views.personalization.ActionMenuKt$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda1;
import com.squareup.cash.sheet.SheetKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class NearbyPermissionsPromptSheetViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ NearbyPermissionsPromptSheetViewModel f$1;

    public /* synthetic */ NearbyPermissionsPromptSheetViewKt$$ExternalSyntheticLambda0(Function1 function1, NearbyPermissionsPromptSheetViewModel nearbyPermissionsPromptSheetViewModel, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = nearbyPermissionsPromptSheetViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        NearbyPermissionsPromptSheetViewModel nearbyPermissionsPromptSheetViewModel = this.f$1;
        Function1 function1 = this.f$0;
        int i2 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-360612926, new NearbyPermissionsPromptSheetViewKt$$ExternalSyntheticLambda0(function1, nearbyPermissionsPromptSheetViewModel, i2), gapComposer), gapComposer, 3072, 7);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new ActionMenuKt$$ExternalSyntheticLambda0(15, function1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    SheetKt.Sheet((Function0) rememberedValue, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(1126824715, new ProfileKt$$ExternalSyntheticLambda1(14, (Object) nearbyPermissionsPromptSheetViewModel, (Object) function1), gapComposer2), gapComposer2, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
