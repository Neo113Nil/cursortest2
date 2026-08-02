package com.squareup.cash.money.views;

import androidx.camera.core.impl.CameraCaptureCallbacks;
import androidx.camera.core.impl.DynamicRanges;
import androidx.camera.core.impl.utils.MatrixExt;
import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.cardview.widget.CardViewApi21Impl;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacn;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacp;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.history.payments.viewmodels.ProfilePaymentHistoryViewModel;
import com.squareup.cash.merchant.viewmodels.MerchantBlockingViewModel;
import com.squareup.cash.merchant.viewmodels.MerchantInfoFeedbackViewModel;
import com.squareup.cash.merchant.views.MerchantProfileViewKt;
import com.squareup.cash.money.banners.presenters.KybBannerItem;
import com.squareup.cash.money.banners.presenters.KybBannerItemModel;
import com.squareup.cash.money.viewmodels.HypeWelcomeModel;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.SlotContent;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.cash.moneybot.genie.protos.Node;
import com.squareup.cash.moneybot.viewmodels.MoneybotChatHistoryViewModel;
import com.squareup.cash.moneybot.viewmodels.MoneybotDebugOverlayViewModel;
import com.squareup.cash.moneybot.viewmodels.MoneybotOverflowMenuViewModel;
import com.squareup.cash.moneybot.viewmodels.MoneybotPreambleEditorViewModel;
import com.squareup.cash.moneybot.viewmodels.amountinput.MoneybotAmountInputViewModel;
import com.squareup.cash.moneybot.viewmodels.chat.MessageViewModel;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewEvent;
import com.squareup.cash.moneybot.viewmodels.feedback.MoneybotFeedbackViewModel;
import com.squareup.cash.moneybot.views.amountinput.MoneybotAmountInputViewKt;
import com.squareup.cash.moneybot.views.card.InsightChartKt;
import com.squareup.cash.moneybot.views.history.MoneybotChatHistoryViewKt;
import com.squareup.cash.moneybot.views.menu.ExpandableContentKt;
import com.squareup.cash.moneybot.views.plugins.SlottedCompositionChartKt;
import com.squareup.cash.moneybot.views.plugins.SlottedMetricKt;
import com.squareup.cash.moneybot.views.plugins.TextCardKt;
import com.squareup.protos.franklin.cards.CardTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import xyz.block.genie.expressions.EvalHelpersKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class HypeWelcomeUIKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ HypeWelcomeUIKt$$ExternalSyntheticLambda1(ProfilePaymentHistoryViewModel profilePaymentHistoryViewModel, Function1 function1, int i) {
        this.$r8$classId = 5;
        this.f$0 = profilePaymentHistoryViewModel;
        this.f$1 = function1;
        this.f$2 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                HypeWelcomeUIKt.HypeWelcomeUI((HypeWelcomeModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((VerifyCheckDialogPresenter) obj4).m3467models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                MerchantProfileViewKt.SectionTile((MerchantBlockingViewModel.MerchantBlockingSectionViewModel.SectionList.SectionLoaded.SectionRow) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                MerchantProfileViewKt.MerchantInfoSelection((MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                MerchantProfileViewKt.MerchantInfoConfirmation((MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Confirmation) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                MerchantProfileViewKt.PaymentHistory((ProfilePaymentHistoryViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((KybBannerItem) obj4).UI((KybBannerItemModel.Available) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                MoneyTabThemedHeaderKt.CardThemeHeader((CardTheme.Identifier) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                EvalHelpersKt.ComposeBoxView((ComposePlatform.Box) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                CameraCaptureCallbacks.ComposeColumnView((ComposePlatform.Column) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                DynamicRanges.ComposeRowView((ComposePlatform.Row) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                MatrixExt.GenieNodeView((Node) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).intValue();
                MoneybotAmountInputViewKt.MoneybotAmountInputView((MoneybotAmountInputViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                InsightChartKt.m3628DescriptionIconkvuU558((Painter) obj4, (Color) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).intValue();
                Transformations.ErrorUI((MoneybotChatViewEvent) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 15:
                ((Integer) obj2).intValue();
                CardViewApi21Impl.TrackBottomPositionReachedEffect((LazyListState) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 16:
                ((Integer) obj2).intValue();
                zzacn.MoneybotFeedbackContent((MoneybotFeedbackViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 17:
                ((Integer) obj2).intValue();
                zzacn.ObserveCommentChanges((TextFieldState) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 18:
                ((Integer) obj2).intValue();
                MoneybotChatHistoryViewKt.ChatHistory((MoneybotChatHistoryViewModel.Content) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 19:
                ((Integer) obj2).intValue();
                MoneybotChatHistoryViewKt.MoneybotChatHistoryView((MoneybotChatHistoryViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 20:
                ((Integer) obj2).intValue();
                ExpandableContentKt.MoneybotDebugOverlayView((MoneybotDebugOverlayViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 21:
                ((Integer) obj2).intValue();
                ExpandableContentKt.MoneybotDebugSheet((MoneybotDebugOverlayViewModel.Sheet) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 22:
                ((Integer) obj2).intValue();
                ExpandableContentKt.MoneybotOverflowMenuView((MoneybotOverflowMenuViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 23:
                ((Integer) obj2).intValue();
                ExpandableContentKt.MoneybotPreambleEditorView((MoneybotPreambleEditorViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                zzacp.ImageMessageUi((Modifier) obj4, (MessageViewModel.ImageMessageViewModel) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                SlottedCompositionChartKt.SlottedCompositionChart((SlotContent.CompositionChart) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                SlottedMetricKt.SlottedMetric((SlotContent.Metric) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                TextCardKt.SlottedProgressRing((SlotContent.ProgressRing) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                TextCardKt.SlottedStackedImage((SlotContent.StackedImage) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                TextCardKt.TextBubble((SlotContent.StackedImage.Content.Text) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ HypeWelcomeUIKt$$ExternalSyntheticLambda1(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = i;
    }
}
