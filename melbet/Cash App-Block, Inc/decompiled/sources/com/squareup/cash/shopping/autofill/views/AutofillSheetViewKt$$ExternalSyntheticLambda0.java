package com.squareup.cash.shopping.autofill.views;

import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda0;
import com.squareup.cash.shopping.autofill.viewmodels.AutofillViewModel;
import com.squareup.cash.shopping.autofill.views.content.ErrorContentKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class AutofillSheetViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AutofillViewModel f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ AutofillSheetViewKt$$ExternalSyntheticLambda0(AutofillViewModel autofillViewModel, boolean z, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = autofillViewModel;
        this.f$1 = z;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        boolean z = this.f$1;
        AutofillViewModel autofillViewModel = this.f$0;
        int i2 = 1;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1942968734, new AutofillSheetViewKt$$ExternalSyntheticLambda0(autofillViewModel, z, this.f$2, i2), gapComposer), gapComposer, 3072, 7);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                if (!gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    gapComposer2.skipToGroupEnd();
                } else if (!(autofillViewModel instanceof AutofillViewModel.Loading)) {
                    boolean z2 = autofillViewModel instanceof AutofillViewModel.Success;
                    Function1 function1 = this.f$2;
                    if (!z2) {
                        if (!(autofillViewModel instanceof AutofillViewModel.Error)) {
                            if (!(autofillViewModel instanceof AutofillViewModel.Loaded)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                                if (z) {
                                    gapComposer2.startReplaceGroup(-292008589);
                                    ErrorContentKt.LoadedContent(OffsetKt.height(companion, IntrinsicSize.Min), (AutofillViewModel.Loaded) autofillViewModel, function1, gapComposer2, 6, 0);
                                    gapComposer2.end(false);
                                } else {
                                    gapComposer2.startReplaceGroup(-291826805);
                                    ErrorContentKt.MooncakeLoadedContent(OffsetKt.height(companion, IntrinsicSize.Min), (AutofillViewModel.Loaded) autofillViewModel, function1, gapComposer2, 6);
                                    gapComposer2.end(false);
                                }
                            }
                        } else if (z) {
                            gapComposer2.startReplaceGroup(-292215204);
                            ErrorContentKt.ErrorContent((AutofillViewModel.Error) autofillViewModel, function1, gapComposer2, 0);
                            gapComposer2.end(false);
                        } else {
                            gapComposer2.startReplaceGroup(-292137580);
                            ErrorContentKt.MooncakeErrorContent((AutofillViewModel.Error) autofillViewModel, function1, gapComposer2, 0);
                            gapComposer2.end(false);
                        }
                    } else {
                        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                        if (z) {
                            gapComposer2.startReplaceGroup(-292476162);
                            boolean changed = gapComposer2.changed(function1);
                            Object rememberedValue = gapComposer2.rememberedValue();
                            if (changed || rememberedValue == neverEqualPolicy) {
                                rememberedValue = new ScoreHomeKt$$ExternalSyntheticLambda0(11, function1);
                                gapComposer2.updateRememberedValue(rememberedValue);
                            }
                            ErrorContentKt.SuccessContent(0, gapComposer2, null, (Function0) rememberedValue);
                            gapComposer2.end(false);
                        } else {
                            gapComposer2.startReplaceGroup(-292368778);
                            boolean changed2 = gapComposer2.changed(function1);
                            Object rememberedValue2 = gapComposer2.rememberedValue();
                            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                                rememberedValue2 = new ScoreHomeKt$$ExternalSyntheticLambda0(12, function1);
                                gapComposer2.updateRememberedValue(rememberedValue2);
                            }
                            ErrorContentKt.MooncakeSuccessContent(0, gapComposer2, null, (Function0) rememberedValue2);
                            gapComposer2.end(false);
                        }
                    }
                } else if (z) {
                    gapComposer2.startReplaceGroup(-292622854);
                    ErrorContentKt.LoadingContent(null, gapComposer2, 0);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(-292574990);
                    ErrorContentKt.MooncakeLoadingContent(null, gapComposer2, 0);
                    gapComposer2.end(false);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
