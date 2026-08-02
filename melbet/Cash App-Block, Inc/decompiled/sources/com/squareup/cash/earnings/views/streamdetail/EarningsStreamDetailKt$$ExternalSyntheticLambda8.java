package com.squareup.cash.earnings.views.streamdetail;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.db2.recipients.RecipientQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.earnings.viewmodels.streamdetail.EarningsStreamDetailViewModel;
import com.squareup.cash.ui.widget.text.AnimatedAmountTextView;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class EarningsStreamDetailKt$$ExternalSyntheticLambda8 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ EarningsStreamDetailViewModel f$0;

    public /* synthetic */ EarningsStreamDetailKt$$ExternalSyntheticLambda8(EarningsStreamDetailViewModel earningsStreamDetailViewModel, int i) {
        this.$r8$classId = 1;
        this.f$0 = earningsStreamDetailViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        EarningsStreamDetailViewModel earningsStreamDetailViewModel = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (!gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    gapComposer.skipToGroupEnd();
                } else if (earningsStreamDetailViewModel instanceof EarningsStreamDetailViewModel.Loaded) {
                    gapComposer.startReplaceGroup(-47391209);
                    boolean changedInstance = gapComposer.changedInstance(earningsStreamDetailViewModel);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new RecipientQueries$$ExternalSyntheticLambda0(earningsStreamDetailViewModel, 15);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Modifier semantics = SemanticsModifierKt.semantics(Modifier.Companion.$$INSTANCE, false, (Function1) rememberedValue);
                    TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).numeralLarge;
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    EarningsStreamDetailViewModel.Loaded loaded = (EarningsStreamDetailViewModel.Loaded) earningsStreamDetailViewModel;
                    VisibleKt.m3482AnimatedAmountTextJDMA8c0(semantics, textStyle, colors.semantic.text.standard, 0, new AnimatedAmountTextView.Amount(loaded.totalEarningsRaw, 1L, loaded.totalEarningsText), null, false, 0L, gapComposer, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                    gapComposer.end(false);
                } else {
                    if (!(earningsStreamDetailViewModel instanceof EarningsStreamDetailViewModel.Loading) && !(earningsStreamDetailViewModel instanceof EarningsStreamDetailViewModel.LoadError)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -47393386, false);
                    }
                    gapComposer.startReplaceGroup(-47377522);
                    EarningsStreamDetailKt.ShimmerLine(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).numeralLarge, gapComposer, 0);
                    gapComposer.end(false);
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                EarningsStreamDetailKt.PeriodAndAmount(earningsStreamDetailViewModel, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (!gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                    gapComposer2.skipToGroupEnd();
                } else if (earningsStreamDetailViewModel instanceof EarningsStreamDetailViewModel.Loaded) {
                    gapComposer2.startReplaceGroup(2058412424);
                    String str = ((EarningsStreamDetailViewModel.Loaded) earningsStreamDetailViewModel).periodLabel;
                    TextStyle textStyle2 = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).sectionTitle;
                    Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors2.semantic.text.standard, (Composer) gapComposer2, (Modifier) null, textStyle2, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    gapComposer2.end(false);
                } else {
                    if (!(earningsStreamDetailViewModel instanceof EarningsStreamDetailViewModel.Loading) && !(earningsStreamDetailViewModel instanceof EarningsStreamDetailViewModel.LoadError)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, 2058410247, false);
                    }
                    gapComposer2.startReplaceGroup(2058421585);
                    EarningsStreamDetailKt.ShimmerLine(((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).sectionTitle, gapComposer2, 0);
                    gapComposer2.end(false);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ EarningsStreamDetailKt$$ExternalSyntheticLambda8(EarningsStreamDetailViewModel earningsStreamDetailViewModel, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = earningsStreamDetailViewModel;
    }
}
