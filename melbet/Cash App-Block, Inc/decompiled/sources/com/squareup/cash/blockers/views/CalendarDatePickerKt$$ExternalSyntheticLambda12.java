package com.squareup.cash.blockers.views;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import coil3.size.SizeKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.benefits.views.BenefitsHomeViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda8;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* loaded from: classes4.dex */
public final /* synthetic */ class CalendarDatePickerKt$$ExternalSyntheticLambda12 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ CalendarDatePickerKt$$ExternalSyntheticLambda12(String str, Function0 function0, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = function0;
        this.f$1 = z;
        this.f$2 = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        String str = this.f$2;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    SizeKt.ButtonCta(this.f$0, null, ButtonProminence.PROMINENT, false, this.f$1, null, Expect_jvmKt.rememberComposableLambda(769246280, new SetPinViewKt$$ExternalSyntheticLambda7(str, 6), gapComposer), gapComposer, 1573248, 42);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    SizeKt.ButtonCta(this.f$0, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 16.0f, 1), 1.0f), buttonProminence, false, this.f$1, null, Expect_jvmKt.rememberComposableLambda(-291571225, new BenefitsHomeViewKt$$ExternalSyntheticLambda5(str, 18), gapComposer2), gapComposer2, 1573248, 40);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    SizeKt.Button(this.f$0, null, ButtonProminence.PROMINENT, false, this.f$1, null, Expect_jvmKt.rememberComposableLambda(-350112395, new SheetKt$$ExternalSyntheticLambda8(str, 18), gapComposer3), gapComposer3, 1573248, 42);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
