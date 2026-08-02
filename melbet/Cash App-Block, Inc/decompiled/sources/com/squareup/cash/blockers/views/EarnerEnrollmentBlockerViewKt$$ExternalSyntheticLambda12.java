package com.squareup.cash.blockers.views;

import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import coil3.size.DimensionKt;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.blockers.viewmodels.EarnerEnrollmentBlockerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class EarnerEnrollmentBlockerViewKt$$ExternalSyntheticLambda12 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ EarnerEnrollmentBlockerViewModel.Form f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ EarnerEnrollmentBlockerViewKt$$ExternalSyntheticLambda12(EarnerEnrollmentBlockerViewModel.Form form, Function1 function1, int i) {
        this.$r8$classId = 1;
        this.f$0 = form;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        EarnerEnrollmentBlockerViewModel.Form form = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-66402074, new EarnerEnrollmentBlockerViewKt$$ExternalSyntheticLambda13(form, function1, 2), gapComposer), gapComposer, 24576, 15);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                EarnerEnrollmentBlockerViewKt.EarnerEnrollmentContinueButton(form, function1, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                    String str = form.legalAgreementText;
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new BalanceHomeViewKt$$ExternalSyntheticLambda12(function1, false, 28);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    LazyDslKt.m304MarkdownTextpCuZGqc(str, (Function2) rememberedValue, null, ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, 0L, null, null, null, 0, 0, 0, gapComposer2, 0, 2036);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ EarnerEnrollmentBlockerViewKt$$ExternalSyntheticLambda12(EarnerEnrollmentBlockerViewModel.Form form, Function1 function1, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = form;
        this.f$1 = function1;
    }
}
