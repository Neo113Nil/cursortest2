package com.squareup.cash.payments.views.personalization;

import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.g6$$ExternalSyntheticLambda11;
import coil3.size.SizeKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.payments.views.composer.ReviewPaymentKt$$ExternalSyntheticLambda20;
import com.squareup.cash.securitysignals.ui.TouchRecorder;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda8;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class ExpressivePaymentsToolbarKt$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ TouchRecorder f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ String f$3;

    public /* synthetic */ ExpressivePaymentsToolbarKt$$ExternalSyntheticLambda5(Function1 function1, TouchRecorder touchRecorder, boolean z, String str) {
        this.f$0 = function1;
        this.f$1 = touchRecorder;
        this.f$2 = z;
        this.f$3 = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        String str = this.f$3;
        TouchRecorder touchRecorder = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    boolean changed = gapComposer.changed(function1) | gapComposer.changedInstance(touchRecorder);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new ReviewPaymentKt$$ExternalSyntheticLambda20(function1, touchRecorder, 1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    SizeKt.Button((Function0) rememberedValue, null, buttonProminence, false, this.f$2, null, Expect_jvmKt.rememberComposableLambda(-589670839, new SheetKt$$ExternalSyntheticLambda8(str, 13), gapComposer), gapComposer, 1573248, 42);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 8.0f, 1);
                    ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
                    boolean z = this.f$2;
                    boolean changed2 = gapComposer2.changed(z) | gapComposer2.changed(function1) | gapComposer2.changedInstance(touchRecorder);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new g6$$ExternalSyntheticLambda11(z, function1, touchRecorder, 9);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    SizeKt.Button((Function0) rememberedValue2, m300paddingVpY3zN4$default, buttonProminence2, false, z, null, Expect_jvmKt.rememberComposableLambda(-1270610368, new SheetKt$$ExternalSyntheticLambda8(str, 14), gapComposer2), gapComposer2, 1573296, 40);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ExpressivePaymentsToolbarKt$$ExternalSyntheticLambda5(boolean z, Function1 function1, TouchRecorder touchRecorder, String str) {
        this.f$2 = z;
        this.f$0 = function1;
        this.f$1 = touchRecorder;
        this.f$3 = str;
    }
}
