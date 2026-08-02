package com.squareup.cash.payments.views.nearby;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.payments.viewmodels.NearbyPayRequestHelpViewModel;
import com.squareup.cash.payments.views.WarningDialogViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.pools.views.PoolListSectionKt$$ExternalSyntheticLambda2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class NearbyPayRequestHelpViewKt$$ExternalSyntheticLambda1 implements Function3 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ NearbyPayRequestHelpViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ NearbyPayRequestHelpViewKt$$ExternalSyntheticLambda1(NearbyPayRequestHelpViewModel nearbyPayRequestHelpViewModel, Function1 function1) {
        this.f$0 = nearbyPayRequestHelpViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NearbyPayRequestHelpViewModel nearbyPayRequestHelpViewModel = this.f$0;
        Function1 function1 = this.f$1;
        switch (i) {
            case 0:
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 19) != 18)) {
                    NearbyPayRequestViewKt.NearbyPayRequestHelpContent(nearbyPayRequestHelpViewModel, function1, SpacerKt.padding(companion, paddingValues), gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new WarningDialogViewKt$$ExternalSyntheticLambda5(26, function1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, null, false, false, null, Expect_jvmKt.rememberComposableLambda(1697307720, new PoolListSectionKt$$ExternalSyntheticLambda2(nearbyPayRequestHelpViewModel, 10), gapComposer2), gapComposer2, 1572912, 60);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ NearbyPayRequestHelpViewKt$$ExternalSyntheticLambda1(Function1 function1, NearbyPayRequestHelpViewModel nearbyPayRequestHelpViewModel) {
        this.f$1 = function1;
        this.f$0 = nearbyPayRequestHelpViewModel;
    }
}
