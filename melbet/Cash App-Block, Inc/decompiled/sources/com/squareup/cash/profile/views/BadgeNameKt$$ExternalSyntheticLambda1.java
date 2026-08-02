package com.squareup.cash.profile.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import app.cash.local.viewmodels.LocalBottomModalViewModel;
import app.cash.local.viewmodels.sheet.EducationalSheetModel;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.local.views.sheet.LoyaltySheetKt;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.data.profile.Badge;
import com.squareup.cash.score.views.CalloutKt;
import com.squareup.lending.CashCreditScoreHomeData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class BadgeNameKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Modifier f$2;
    public final /* synthetic */ int f$4;
    public final /* synthetic */ int f$5;
    public final /* synthetic */ int f$6;

    public /* synthetic */ BadgeNameKt$$ExternalSyntheticLambda1(int i, Function1 function1, Modifier modifier, Function1 function12, int i2, int i3) {
        this.$r8$classId = 4;
        this.f$4 = i;
        this.f$0 = function1;
        this.f$2 = modifier;
        this.f$1 = function12;
        this.f$5 = i2;
        this.f$6 = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$5;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                BadgeNameKt.m3726BadgeName6ERogkM((String) obj4, (Badge) obj3, this.f$2, this.f$4, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$6);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                Modifier modifier = this.f$2;
                LocalMapKt.LocalBottomModal(modifier, (LocalBottomModalViewModel) obj4, (Function1) obj3, this.f$4, (Composer) obj, updateChangedFlags, this.f$6);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                Modifier modifier2 = this.f$2;
                LoyaltySheetKt.EducationalTiledHeroImage(modifier2, (EducationalSheetModel.Image.TiledHeroImage) obj4, this.f$4, (Function1) obj3, (Composer) obj, updateChangedFlags2, this.f$6);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i2 | 1);
                Modifier modifier3 = this.f$2;
                LoyaltySheetKt.EducationalText(modifier3, (EducationalSheetModel.Text) obj4, this.f$4, (Function1) obj3, (Composer) obj, updateChangedFlags3, this.f$6);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int updateChangedFlags4 = Updater.updateChangedFlags(i2 | 1);
                int i3 = this.f$4;
                ModalKt.SegmentedControl(i3, (Function1) obj4, this.f$2, (Function1) obj3, (Composer) obj, updateChangedFlags4, this.f$6);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags5 = Updater.updateChangedFlags(i2 | 1);
                int i4 = this.f$4;
                CalloutKt.ScoreTextInfo((CashCreditScoreHomeData.ScoreSummary) obj4, i4, (Function1) obj3, this.f$2, (Composer) obj, updateChangedFlags5, this.f$6);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ BadgeNameKt$$ExternalSyntheticLambda1(Modifier modifier, LocalBottomModalViewModel localBottomModalViewModel, Function1 function1, int i, int i2, int i3) {
        this.$r8$classId = 1;
        this.f$2 = modifier;
        this.f$0 = localBottomModalViewModel;
        this.f$1 = function1;
        this.f$4 = i;
        this.f$5 = i2;
        this.f$6 = i3;
    }

    public /* synthetic */ BadgeNameKt$$ExternalSyntheticLambda1(Modifier modifier, EducationalSheetModel.Content content, int i, Function1 function1, int i2, int i3, int i4) {
        this.$r8$classId = i4;
        this.f$2 = modifier;
        this.f$0 = content;
        this.f$4 = i;
        this.f$1 = function1;
        this.f$5 = i2;
        this.f$6 = i3;
    }

    public /* synthetic */ BadgeNameKt$$ExternalSyntheticLambda1(CashCreditScoreHomeData.ScoreSummary scoreSummary, int i, Function1 function1, Modifier modifier, int i2, int i3) {
        this.$r8$classId = 5;
        this.f$0 = scoreSummary;
        this.f$4 = i;
        this.f$1 = function1;
        this.f$2 = modifier;
        this.f$5 = i2;
        this.f$6 = i3;
    }

    public /* synthetic */ BadgeNameKt$$ExternalSyntheticLambda1(String str, Badge badge, Modifier modifier, int i, int i2, int i3) {
        this.$r8$classId = 0;
        this.f$0 = str;
        this.f$1 = badge;
        this.f$2 = modifier;
        this.f$4 = i;
        this.f$5 = i2;
        this.f$6 = i3;
    }
}
