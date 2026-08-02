package com.squareup.cash.score.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.glance.appwidget.WidgetLayoutKt;
import com.squareup.cash.offers.views.home.OfferTileKt;
import com.squareup.cash.onboarding.accountpicker.views.AliasPickerViewKt;
import com.squareup.cash.p2pblocking.views.P2PListRowKt;
import com.squareup.cash.paychecks.views.PaycheckCircles;
import com.squareup.cash.payments.views.personalization.AlphaKt;
import com.squareup.cash.pools.views.PoolToastKt;
import com.squareup.cash.profile.devicemanager.views.DeviceManagerListViewKt;
import com.squareup.cash.retro.views.PaymentPlanSummaryKt;
import com.squareup.cash.shopping.autofill.views.content.ErrorContentKt;
import com.squareup.cash.shopping.settings.views.ErrorDialogKt;
import com.squareup.cash.shopping.views.ShopErrorKt;
import com.squareup.cash.support.chat.views.transcript.message.compose.MessageFileKt;
import com.squareup.cash.taptopay.views.components.TapToPayPaymentAnimationKt;
import com.squareup.cash.work.views.ClockedInStatusDotKt;
import com.squareup.cash.work.views.pay.PayCellViewKt;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public final /* synthetic */ class ScoreHomeKt$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Modifier f$0;

    public /* synthetic */ ScoreHomeKt$$ExternalSyntheticLambda4(Modifier modifier, int i) {
        this.$r8$classId = i;
        this.f$0 = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier modifier = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                CalloutKt.LoadingContent(modifier, composer, Updater.updateChangedFlags(7));
                break;
            case 1:
                num.getClass();
                OfferTileKt.CircularLoadingBox(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 2:
                num.getClass();
                AliasPickerViewKt.AccountRemoved(modifier, composer, Updater.updateChangedFlags(7));
                break;
            case 3:
                num.getClass();
                P2PListRowKt.LoadingTitleAndSubtitle(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 4:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    PaycheckCircles.INSTANCE.UnknownCircle(MLKEMEngine.KyberPolyBytes, 2, gapComposer, this.f$0, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 5:
                num.getClass();
                AlphaKt.PersonalizedBackgroundLoadingIndicator(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 6:
                num.getClass();
                PoolToastKt.StartPoolSuccess(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 7:
                num.getClass();
                PoolToastKt.NoResults(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 8:
                num.getClass();
                DeviceManagerListViewKt.DeviceMapPlaceholder(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 9:
                num.getClass();
                DeviceManagerListViewKt.DeviceMapNoLocation(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 10:
                int intValue2 = num.intValue();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    DeviceManagerListViewKt.DeviceMapPlaceholder(modifier, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 11:
                num.getClass();
                PaymentPlanSummaryKt.PaddedHorizontalDivider(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 12:
                num.getClass();
                ErrorContentKt.LoadingContent(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 13:
                num.getClass();
                ErrorContentKt.MooncakeLoadingContent(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 14:
                num.getClass();
                ErrorDialogKt.AddressLoadingError(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 15:
                num.getClass();
                ErrorDialogKt.AddressLoading(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 16:
                num.getClass();
                ShopErrorKt.AutofillSuccessToast(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 17:
                num.getClass();
                ShopErrorKt.ShopLoadingProgress(modifier, composer, Updater.updateChangedFlags(7));
                break;
            case 18:
                num.getClass();
                WidgetLayoutKt.LoadingContent(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 19:
                num.getClass();
                MessageFileKt.MessageAvatarAdvocate(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 20:
                num.getClass();
                MessageFileKt.ImagePlaceholderLoading(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 21:
                num.getClass();
                MessageFileKt.MessageTypingIndicator(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 22:
                num.getClass();
                TapToPayPaymentAnimationKt.TapToPayPaymentAnimation(modifier, composer, Updater.updateChangedFlags(7));
                break;
            case 23:
                num.getClass();
                ClockedInStatusDotKt.ClockedInStatusDot(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 24:
                num.getClass();
                ClockedInStatusDotKt.ClockedOutStatusDot(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 25:
                num.getClass();
                PayCellViewKt.PayHistoryListLoading(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 26:
                num.getClass();
                PayCellViewKt.PayHomeLoading(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 27:
                num.getClass();
                PayCellViewKt.TaxFormsListLoading(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 28:
                num.getClass();
                ListItemKt.InstitutionPlaceholder(modifier, composer, Updater.updateChangedFlags(1));
                break;
            default:
                num.getClass();
                ListItemKt.LoadingPill(modifier, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ScoreHomeKt$$ExternalSyntheticLambda4(Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = modifier;
    }
}
