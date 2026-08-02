package app.cash.local.views.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.room.util.DBUtil;
import androidx.savedstate.SavedStateWriterKt;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.common.composeui.shimmer.ShimmerCellsKt;
import com.squareup.cash.deposits.physical.view.onboarding.PaperMoneyDepositOnboardingViewKt;
import com.squareup.cash.graphics.views.effect.TortoiseCardEffectKt;
import com.squareup.cash.history.views.ReportAbuseViewKt;
import com.squareup.cash.money.views.HypeWelcomeUIKt;
import com.squareup.cash.moneybot.views.card.CardUiKt;
import com.squareup.cash.score.views.CalloutKt;
import com.squareup.cash.tabs.views.TabToolbarsKt;
import com.squareup.cash.work.views.shift.ShiftSectionView2Kt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class ProgressBarKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ ProgressBarKt$$ExternalSyntheticLambda0(Modifier modifier, int i, int i2, int i3) {
        this.$r8$classId = 0;
        this.f$0 = modifier;
        this.f$1 = i;
        this.f$2 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier modifier = this.f$0;
        int i2 = this.f$2;
        int i3 = this.f$1;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ProgressBarKt.ProgressBar(i3, i2, Updater.updateChangedFlags(1), composer, modifier);
                break;
            case 1:
                ModalKt.HorizontalDivider(Updater.updateChangedFlags(i3 | 1), i2, composer, modifier);
                break;
            case 2:
                ProgressCircularKt.ProgressCircular(Updater.updateChangedFlags(i3 | 1), i2, composer, modifier);
                break;
            case 3:
                DBUtil.SpacerWithinSectionSmall(Updater.updateChangedFlags(i3 | 1), i2, composer, modifier);
                break;
            case 4:
                DBUtil.SpacerBetweenSectionXLargeBelowCell(Updater.updateChangedFlags(i3 | 1), i2, composer, modifier);
                break;
            case 5:
                DBUtil.SpacerBetweenSectionXLarge(Updater.updateChangedFlags(i3 | 1), i2, composer, modifier);
                break;
            case 6:
                ShimmerCellsKt.ShimmerCells(Updater.updateChangedFlags(i3 | 1), i2, composer, modifier);
                break;
            case 7:
                PaperMoneyDepositOnboardingViewKt.PagerDots(i3, i2, Updater.updateChangedFlags(1), composer, modifier);
                break;
            case 8:
                TortoiseCardEffectKt.TortoiseBackground(Updater.updateChangedFlags(i3 | 1), i2, composer, modifier);
                break;
            case 9:
                ReportAbuseViewKt.PasscodePips(i3, i2, Updater.updateChangedFlags(1), composer, modifier);
                break;
            case 10:
                HypeWelcomeUIKt.FallbackImage(i3, Updater.updateChangedFlags(i2 | 1), composer, modifier);
                break;
            case 11:
                CardUiKt.ErrorCard(Updater.updateChangedFlags(i3 | 1), i2, composer, modifier);
                break;
            case 12:
                CalloutKt.ScoreDigits(i3, Updater.updateChangedFlags(i2 | 1), composer, modifier);
                break;
            case 13:
                TabToolbarsKt.SharedTabToolbarSpacer(Updater.updateChangedFlags(i3 | 1), i2, composer, modifier);
                break;
            case 14:
                SavedStateWriterKt.PagerIndicator(i3, i2, Updater.updateChangedFlags(1), composer, modifier);
                break;
            default:
                ShiftSectionView2Kt.PagerDots(i3, i2, Updater.updateChangedFlags(385), composer, modifier);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ProgressBarKt$$ExternalSyntheticLambda0(int i, Modifier modifier, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$1 = i;
        this.f$0 = modifier;
        this.f$2 = i2;
    }

    public /* synthetic */ ProgressBarKt$$ExternalSyntheticLambda0(int i, int i2, Modifier modifier, int i3, int i4) {
        this.$r8$classId = i4;
        this.f$1 = i;
        this.f$2 = i2;
        this.f$0 = modifier;
    }

    public /* synthetic */ ProgressBarKt$$ExternalSyntheticLambda0(Modifier modifier, int i, int i2, int i3, byte b) {
        this.$r8$classId = i3;
        this.f$0 = modifier;
        this.f$1 = i;
        this.f$2 = i2;
    }
}
