package com.squareup.cash.pools.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.pdf.view.PdfPreviewView$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.viewmodels.ContributionAnimation;
import com.squareup.cash.pools.viewmodels.PoolDetailsViewModel;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda1;
import com.squareup.util.Strings;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList;

/* loaded from: classes6.dex */
public final /* synthetic */ class PoolDetailsViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PoolDetailsViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ PoolDetailsViewKt$$ExternalSyntheticLambda0(PoolDetailsViewModel poolDetailsViewModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = poolDetailsViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        PoolDetailsViewModel poolDetailsViewModel = this.f$0;
        Function1 function1 = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = 1;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-2144894357, new PoolDetailsViewKt$$ExternalSyntheticLambda0(poolDetailsViewModel, function1, i2), gapComposer), gapComposer, 3072, 7);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, colors.semantic.background.f1047app, ColorKt.RectangleShape);
                    PoolDetailsViewModel poolDetailsViewModel2 = this.f$0;
                    boolean z2 = poolDetailsViewModel2 instanceof PoolDetailsViewModel.Loading;
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new PoolDetailsViewKt$$ExternalSyntheticLambda3(0);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    Strings.LoadableFullScreenContent(poolDetailsViewModel2, z2, m177backgroundbw27NRU, (Function1) rememberedValue, null, Expect_jvmKt.rememberComposableLambda(-382588693, new HeroCardViewKt$$ExternalSyntheticLambda1(function1, r6, 14), gapComposer2), gapComposer2, 199680, 16);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    PoolDetailsViewModel.Loaded loaded = (PoolDetailsViewModel.Loaded) poolDetailsViewModel;
                    String str = loaded.title;
                    String str2 = loaded.subtitle;
                    String str3 = loaded.currentAmount;
                    long j = loaded.currentAmountRaw;
                    String str4 = loaded.totalAmount;
                    ContributionAnimation contributionAnimation = loaded.animationContribution;
                    float f = loaded.currentProgress;
                    float f2 = contributionAnimation != null ? f - contributionAnimation.percentage : RecyclerView.DECELERATION_RATE;
                    boolean z3 = loaded.showAddPeopleButton;
                    boolean z4 = loaded.showClosePoolButton;
                    boolean z5 = loaded.showContributeButton;
                    boolean z6 = loaded.showClosedPoolDisabledButton;
                    String str5 = loaded.showClosedPoolDisabledButtonText;
                    String str6 = loaded.showClosedPoolDisabledButtonSubText;
                    boolean z7 = loaded.showGoalMetAnimation;
                    ImmutableList immutableList = loaded.participantsPreview;
                    boolean z8 = loaded.isActiveAccountInPool;
                    boolean z9 = loaded.showActivitySection;
                    UiCallbackModel uiCallbackModel = loaded.activityEmbeddedModel;
                    boolean z10 = loaded.showShareButton;
                    boolean changed = gapComposer3.changed(function1);
                    Object rememberedValue2 = gapComposer3.rememberedValue();
                    if (changed || rememberedValue2 == neverEqualPolicy) {
                        z = z10;
                        rememberedValue2 = new PoolsListViewKt$$ExternalSyntheticLambda3(11, function1);
                        gapComposer3.updateRememberedValue(rememberedValue2);
                    } else {
                        z = z10;
                    }
                    Function0 function0 = (Function0) rememberedValue2;
                    boolean changed2 = gapComposer3.changed(function1);
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    if (changed2 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new PdfPreviewView$$ExternalSyntheticLambda0(29, function1);
                        gapComposer3.updateRememberedValue(rememberedValue3);
                    }
                    Function0 function02 = (Function0) rememberedValue3;
                    boolean changed3 = gapComposer3.changed(function1);
                    Object rememberedValue4 = gapComposer3.rememberedValue();
                    if (changed3 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new PoolsListViewKt$$ExternalSyntheticLambda3(1, function1);
                        gapComposer3.updateRememberedValue(rememberedValue4);
                    }
                    Function0 function03 = (Function0) rememberedValue4;
                    boolean changed4 = gapComposer3.changed(function1);
                    Object rememberedValue5 = gapComposer3.rememberedValue();
                    if (changed4 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new PoolsListViewKt$$ExternalSyntheticLambda3(2, function1);
                        gapComposer3.updateRememberedValue(rememberedValue5);
                    }
                    Function0 function04 = (Function0) rememberedValue5;
                    boolean changed5 = gapComposer3.changed(function1);
                    Object rememberedValue6 = gapComposer3.rememberedValue();
                    if (changed5 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new PoolsListViewKt$$ExternalSyntheticLambda3(3, function1);
                        gapComposer3.updateRememberedValue(rememberedValue6);
                    }
                    Function0 function05 = (Function0) rememberedValue6;
                    boolean changed6 = gapComposer3.changed(function1);
                    Object rememberedValue7 = gapComposer3.rememberedValue();
                    if (changed6 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new PoolsListViewKt$$ExternalSyntheticLambda3(4, function1);
                        gapComposer3.updateRememberedValue(rememberedValue7);
                    }
                    Function0 function06 = (Function0) rememberedValue7;
                    boolean changed7 = gapComposer3.changed(function1);
                    Object rememberedValue8 = gapComposer3.rememberedValue();
                    if (changed7 || rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new PoolsListViewKt$$ExternalSyntheticLambda3(5, function1);
                        gapComposer3.updateRememberedValue(rememberedValue8);
                    }
                    Function0 function07 = (Function0) rememberedValue8;
                    boolean changed8 = gapComposer3.changed(function1);
                    Object rememberedValue9 = gapComposer3.rememberedValue();
                    if (changed8 || rememberedValue9 == neverEqualPolicy) {
                        rememberedValue9 = new PoolsListViewKt$$ExternalSyntheticLambda3(6, function1);
                        gapComposer3.updateRememberedValue(rememberedValue9);
                    }
                    Function0 function08 = (Function0) rememberedValue9;
                    boolean changed9 = gapComposer3.changed(function1);
                    Object rememberedValue10 = gapComposer3.rememberedValue();
                    if (changed9 || rememberedValue10 == neverEqualPolicy) {
                        rememberedValue10 = new PoolsListViewKt$$ExternalSyntheticLambda3(7, function1);
                        gapComposer3.updateRememberedValue(rememberedValue10);
                    }
                    PoolToastKt.m3718PoolMainDetailsh_vLjUQ(function0, function02, function03, function04, function05, function06, function07, function08, (Function0) rememberedValue10, null, str, str2, str3, j, str4, contributionAnimation, f, f2, z, z3, z4, z5, z6, str5, str6, z7, immutableList, z8, z9, uiCallbackModel, gapComposer3, 0);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
