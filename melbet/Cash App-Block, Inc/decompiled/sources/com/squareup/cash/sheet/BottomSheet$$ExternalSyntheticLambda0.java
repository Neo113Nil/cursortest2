package com.squareup.cash.sheet;

import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewGroupKt$children$1;
import androidx.core.view.ViewGroupKt$iterator$1;
import androidx.navigation.fragment.FragmentKt;
import app.cash.broadway.ui.Ui;
import app.cash.directoryui.viewmodels.DirectoryListItem;
import app.cash.directoryui.viewmodels.DirectoryViewEvent$HeaderViewEvent$HeaderButtonClick;
import app.cash.local.views.map.BrandCollectionSheetViewKt$$ExternalSyntheticLambda0;
import com.braze.ui.inappmessage.views.InAppMessageFullView;
import com.google.android.material.textview.MaterialTextView;
import com.google.mlkit.vision.text.zzc;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.workflow.fragment.BarcodeAnalysisFragment;
import com.miteksystems.misnap.workflow.fragment.DocumentAnalysisFragment;
import com.miteksystems.misnap.workflow.fragment.FaceAnalysisFragment;
import com.miteksystems.misnap.workflow.fragment.FaceAnalysisFragment$$ExternalSyntheticLambda10;
import com.miteksystems.misnap.workflow.fragment.FailoverFragment;
import com.miteksystems.misnap.workflow.fragment.NavigationAction$Failover$NavigateRetryAuto;
import com.miteksystems.misnap.workflow.fragment.NavigationError;
import com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment;
import com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment$a$a;
import com.miteksystems.misnap.workflow.view.HintView;
import com.squareup.cash.R;
import com.squareup.cash.advertising.viewmodels.FullscreenAdEvent;
import com.squareup.cash.advertising.viewmodels.FullscreenAdViewModel;
import com.squareup.cash.advertising.views.FullscreenAdView;
import com.squareup.cash.blockers.viewmodels.FormMenuActionViewEvent$ActionClick;
import com.squareup.cash.blockers.viewmodels.InstrumentSelectionDetailsSheetViewEvent;
import com.squareup.cash.blockers.viewmodels.InstrumentSelectionDetailsSheetViewModel;
import com.squareup.cash.blockers.viewmodels.InstrumentSelectionListSheetViewEvent;
import com.squareup.cash.blockers.viewmodels.InstrumentSelectionViewEvent$InstrumentClicked$ShowOptionDetails;
import com.squareup.cash.blockers.viewmodels.InstrumentSelectionViewEvent$InstrumentClicked$ShowOptionsList;
import com.squareup.cash.blockers.viewmodels.InstrumentSelectionViewModel;
import com.squareup.cash.blockers.viewmodels.SelectedInstrumentModel;
import com.squareup.cash.blockers.views.FormMenuActionView;
import com.squareup.cash.blockers.views.InstrumentSelectionDetailsSheet;
import com.squareup.cash.blockers.views.InstrumentSelectionListSheet;
import com.squareup.cash.blockers.views.InstrumentSelectionView;
import com.squareup.cash.buynowpaylater.viewmodels.ActionButton;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderDetailsViewEvent;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderHubRowModel;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderHubViewEvent;
import com.squareup.cash.buynowpaylater.viewmodels.OrderDetailsOverFlowSheetViewEvent;
import com.squareup.cash.buynowpaylater.viewmodels.OverflowActionsModel;
import com.squareup.cash.buynowpaylater.viewmodels.TextWithIcon;
import com.squareup.cash.buynowpaylater.views.AfterPayOrderDetailsOverflowSheetView;
import com.squareup.cash.buynowpaylater.views.AfterPayOrderDetailsPaymentMethodView;
import com.squareup.cash.buynowpaylater.views.AfterPayOrderHubMainHeaderView;
import com.squareup.cash.buynowpaylater.views.AfterPayOrderHubRowItemView;
import com.squareup.cash.buynowpaylater.views.AfterPayTotalOwedRow;
import com.squareup.cash.dialog.ArcadeModal;
import com.squareup.cash.dialog.MooncakeDialog;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.investing.components.categories.CategoryAdapter;
import com.squareup.cash.investing.components.categories.FilterGroupAdapter;
import com.squareup.cash.investing.components.categories.InvestingSubFilterSelection;
import com.squareup.cash.investing.viewmodels.categories.InvestingCategoryTileContentModel;
import com.squareup.cash.investing.viewmodels.categories.InvestingFilterPillViewModel;
import com.squareup.cash.mooncake.components.MooncakeCheckbox;
import com.squareup.cash.mooncake.components.MooncakeEditText;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.onboarding.viewmodels.CountrySelectorViewEvent;
import com.squareup.cash.onboarding.views.CountrySelectorDialog;
import com.squareup.cash.reactions.views.ChooseReactionSheet;
import com.squareup.cash.reactions.views.ReactionBuilder;
import com.squareup.cash.reactions.views.ReactionView;
import com.squareup.cash.security.viewmodels.PasswordEntryViewEvent;
import com.squareup.cash.security.views.PasswordEntryView;
import com.squareup.cash.security.views.databinding.SecurityViewPasswordEntryBinding;
import com.squareup.cash.tax.primitives.TaxMenuItem;
import com.squareup.cash.tax.viewmodels.TaxMenuSheetViewEvent$MenuClick;
import com.squareup.cash.tax.views.TaxMenuSheetView;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.common.Reaction;
import com.squareup.util.android.Keyboards;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class BottomSheet$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ BottomSheet$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MiSnapSettings.Voice voice;
        int i = this.$r8$classId;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj;
                BottomSheetState bottomSheetState = ((BottomSheet) obj2).currentState;
                bottomSheetState.getClass();
                if (bottomSheetState == BottomSheetState.USER_HIDDEN || bottomSheetState == BottomSheetState.SYSTEM_DISMISSED) {
                    return;
                }
                function0.invoke();
                return;
            case 1:
                InAppMessageFullView.resetMessageMargins$lambda$0$0((InAppMessageFullView) obj2, (View) obj, view);
                return;
            case 2:
                BarcodeAnalysisFragment barcodeAnalysisFragment = (BarcodeAnalysisFragment) obj2;
                BarcodeAnalysisFragment.Companion companion = BarcodeAnalysisFragment.Companion;
                barcodeAnalysisFragment.getBinding$workflow_release().k.takePicture();
                ((ConstraintLayout) barcodeAnalysisFragment.getBinding$workflow_release().j.a).setVisibility(0);
                barcodeAnalysisFragment.getBinding$workflow_release().e.setVisibility(4);
                ((AppCompatImageView) obj).setVisibility(4);
                return;
            case 3:
                DocumentAnalysisFragment documentAnalysisFragment = (DocumentAnalysisFragment) obj2;
                DocumentAnalysisFragment.Companion companion2 = DocumentAnalysisFragment.Companion;
                documentAnalysisFragment.getBinding$workflow_release().l.takePicture();
                ((ConstraintLayout) documentAnalysisFragment.getBinding$workflow_release().k.a).setVisibility(0);
                documentAnalysisFragment.getBinding$workflow_release().e.setVisibility(4);
                HintView hintView = documentAnalysisFragment.getBinding$workflow_release().i;
                hintView.setAnimation(null);
                hintView.setVisibility(8);
                hintView.clearText();
                ((AppCompatImageView) obj).setVisibility(4);
                return;
            case 4:
                FaceAnalysisFragment faceAnalysisFragment = (FaceAnalysisFragment) obj2;
                AppCompatImageView appCompatImageView = (AppCompatImageView) obj;
                FaceAnalysisFragment.Companion companion3 = FaceAnalysisFragment.Companion;
                faceAnalysisFragment.getBinding$workflow_release().m.takePicture();
                ((ConstraintLayout) faceAnalysisFragment.getBinding$workflow_release().l.a).setVisibility(0);
                if (!faceAnalysisFragment.g) {
                    faceAnalysisFragment.getBinding$workflow_release().e.setVisibility(4);
                }
                FaceAnalysisFragment$$ExternalSyntheticLambda10 faceAnalysisFragment$$ExternalSyntheticLambda10 = faceAnalysisFragment.r;
                if (faceAnalysisFragment$$ExternalSyntheticLambda10 != null) {
                    faceAnalysisFragment.getBinding$workflow_release().m.w.removeObserver(faceAnalysisFragment$$ExternalSyntheticLambda10);
                }
                faceAnalysisFragment.e$2();
                HintView hintView2 = faceAnalysisFragment.getBinding$workflow_release().j;
                hintView2.setAnimation(null);
                hintView2.setVisibility(8);
                hintView2.clearText();
                appCompatImageView.setVisibility(4);
                return;
            case 5:
                MiSnapSettings miSnapSettings = (MiSnapSettings) obj2;
                FailoverFragment failoverFragment = (FailoverFragment) obj;
                zzc zzcVar = FailoverFragment.Companion;
                MiSnapSettings.UseCase useCase = miSnapSettings.a;
                MiSnapSettings.Analysis analysis = miSnapSettings.analysis;
                if (useCase == MiSnapSettings.UseCase.FACE) {
                    analysis.face.a = MiSnapSettings.Analysis.Face.Trigger.MANUAL;
                } else {
                    analysis.document.e = MiSnapSettings.Analysis.Document.Trigger.MANUAL;
                }
                failoverFragment.b$2().updateState$workflow_release(miSnapSettings);
                try {
                    FragmentKt.findNavController(failoverFragment).navigate(R.id.navigateManualSession);
                    return;
                } catch (Exception e) {
                    Log.e("FailoverScreen", "Nav Graph Error", e);
                    failoverFragment.b$2().postNavigationError$workflow_release(new NavigationError(e, FailoverFragment.class, failoverFragment.hashCode(), NavigationAction$Failover$NavigateRetryAuto.INSTANCE$1));
                    return;
                }
            case 6:
                VoicePhraseSelectionFragment voicePhraseSelectionFragment = (VoicePhraseSelectionFragment) obj2;
                VoicePhraseSelectionFragment$a$a voicePhraseSelectionFragment$a$a = (VoicePhraseSelectionFragment$a$a) obj;
                MiSnapSettings miSnapSettings2 = (MiSnapSettings) voicePhraseSelectionFragment.b$7().f.getValue();
                if (miSnapSettings2 == null || (voice = miSnapSettings2.voice) == null) {
                    return;
                }
                voice.b = ((MaterialTextView) voicePhraseSelectionFragment$a$a.a.c).getText().toString();
                if (voice.a != null) {
                    voicePhraseSelectionFragment.a$1(voicePhraseSelectionFragment.b$7());
                    return;
                }
                return;
            case 7:
                FullscreenAdViewModel.Content.ActionViewModel actionViewModel = (FullscreenAdViewModel.Content.ActionViewModel) obj;
                Ui.EventReceiver eventReceiver = ((FullscreenAdView) obj2).eventReceiver;
                if (eventReceiver != null) {
                    eventReceiver.sendEvent(new FullscreenAdEvent.TapActionButton(actionViewModel.analyticsValue, actionViewModel.urlToOpen));
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
            case 8:
                BlockerAction blockerAction = (BlockerAction) obj;
                Ui.EventReceiver eventReceiver2 = ((FormMenuActionView) obj2).eventReceiver;
                if (eventReceiver2 != null) {
                    eventReceiver2.sendEvent(new FormMenuActionViewEvent$ActionClick(blockerAction));
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
            case 9:
                InstrumentSelectionDetailsSheetViewModel instrumentSelectionDetailsSheetViewModel = (InstrumentSelectionDetailsSheetViewModel) obj;
                Ui.EventReceiver eventReceiver3 = ((InstrumentSelectionDetailsSheet) obj2).eventReceiver;
                if (eventReceiver3 != null) {
                    eventReceiver3.sendEvent(new InstrumentSelectionDetailsSheetViewEvent.Continue(instrumentSelectionDetailsSheetViewModel.optionId, instrumentSelectionDetailsSheetViewModel.continueButtonAction));
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
            case 10:
                Integer num = (Integer) obj;
                Ui.EventReceiver eventReceiver4 = ((InstrumentSelectionListSheet) obj2).eventReceiver;
                if (eventReceiver4 != null) {
                    eventReceiver4.sendEvent(new InstrumentSelectionListSheetViewEvent.SelectInstrument(num.intValue()));
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
            case 11:
                InstrumentSelectionView instrumentSelectionView = (InstrumentSelectionView) obj;
                SelectedInstrumentModel selectedInstrumentModel = ((InstrumentSelectionViewModel.Selecting) obj2).selectedInstrument;
                if (selectedInstrumentModel.showList) {
                    Ui.EventReceiver eventReceiver5 = instrumentSelectionView.eventReceiver;
                    if (eventReceiver5 != null) {
                        eventReceiver5.sendEvent(new InstrumentSelectionViewEvent$InstrumentClicked$ShowOptionsList(false));
                        return;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    }
                }
                if (selectedInstrumentModel.showDialog) {
                    Ui.EventReceiver eventReceiver6 = instrumentSelectionView.eventReceiver;
                    if (eventReceiver6 != null) {
                        eventReceiver6.sendEvent(new InstrumentSelectionViewEvent$InstrumentClicked$ShowOptionDetails(selectedInstrumentModel.id, false));
                        return;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    }
                }
                return;
            case 12:
                SelectedInstrumentModel selectedInstrumentModel2 = (SelectedInstrumentModel) obj2;
                InstrumentSelectionView instrumentSelectionView2 = (InstrumentSelectionView) obj;
                if (selectedInstrumentModel2.showList) {
                    Ui.EventReceiver eventReceiver7 = instrumentSelectionView2.eventReceiver;
                    if (eventReceiver7 != null) {
                        eventReceiver7.sendEvent(new InstrumentSelectionViewEvent$InstrumentClicked$ShowOptionsList(true));
                        return;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    }
                }
                if (selectedInstrumentModel2.showDialog) {
                    Ui.EventReceiver eventReceiver8 = instrumentSelectionView2.eventReceiver;
                    if (eventReceiver8 != null) {
                        eventReceiver8.sendEvent(new InstrumentSelectionViewEvent$InstrumentClicked$ShowOptionDetails(selectedInstrumentModel2.id, true));
                        return;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    }
                }
                return;
            case 13:
                AfterPayOrderDetailsOverflowSheetView afterPayOrderDetailsOverflowSheetView = (AfterPayOrderDetailsOverflowSheetView) obj;
                int i2 = AfterPayOrderDetailsOverflowSheetView.$r8$clinit;
                String str = ((OverflowActionsModel) obj2).clientRoute;
                if (str != null) {
                    Ui.EventReceiver eventReceiver9 = afterPayOrderDetailsOverflowSheetView.eventReceiver;
                    if (eventReceiver9 != null) {
                        eventReceiver9.sendEvent(new OrderDetailsOverFlowSheetViewEvent.OverflowItemClicked(str));
                        return;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    }
                }
                return;
            case 14:
                AfterPayOrderDetailsViewEvent afterPayOrderDetailsViewEvent = (AfterPayOrderDetailsViewEvent) obj;
                Ui.EventReceiver eventReceiver10 = ((AfterPayOrderDetailsPaymentMethodView) obj2).eventReceiver;
                if (eventReceiver10 != null) {
                    eventReceiver10.sendEvent(afterPayOrderDetailsViewEvent);
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
            case 15:
                AfterPayOrderHubRowModel.HeaderModel headerModel = (AfterPayOrderHubRowModel.HeaderModel) obj;
                Ui.EventReceiver eventReceiver11 = ((AfterPayOrderHubMainHeaderView) obj2).eventReceiver;
                if (eventReceiver11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
                TextWithIcon textWithIcon = headerModel.subtitle;
                textWithIcon.getClass();
                eventReceiver11.sendEvent(new AfterPayOrderHubViewEvent.TextWithInfoClicked.AvailableBalanceInfoClicked(textWithIcon.infoSheetViewModel));
                return;
            case 16:
                String str2 = (String) obj;
                Ui.EventReceiver eventReceiver12 = ((AfterPayOrderHubRowItemView) obj2).eventReceiver;
                if (eventReceiver12 != null) {
                    eventReceiver12.sendEvent(new AfterPayOrderHubViewEvent.OrderRowClicked(str2));
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
            case 17:
                ActionButton actionButton = (ActionButton) obj;
                Ui.EventReceiver eventReceiver13 = ((AfterPayOrderHubRowItemView) obj2).eventReceiver;
                if (eventReceiver13 != null) {
                    eventReceiver13.sendEvent(new AfterPayOrderHubViewEvent.ActionButtonClicked(actionButton.actionUrl));
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
            case 18:
                AfterPayOrderHubRowModel.PaymentRowModel paymentRowModel = (AfterPayOrderHubRowModel.PaymentRowModel) obj;
                Ui.EventReceiver eventReceiver14 = ((AfterPayOrderHubRowItemView) obj2).eventReceiver;
                if (eventReceiver14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
                TextWithIcon textWithIcon2 = paymentRowModel.infoIcon;
                textWithIcon2.getClass();
                eventReceiver14.sendEvent(new AfterPayOrderHubViewEvent.TextWithInfoClicked.NonCashAppPayInfoClicked(textWithIcon2.infoSheetViewModel, paymentRowModel.id));
                return;
            case 19:
                AfterPayOrderHubRowModel.HeaderModel headerModel2 = (AfterPayOrderHubRowModel.HeaderModel) obj;
                Ui.EventReceiver eventReceiver15 = ((AfterPayTotalOwedRow) obj2).eventReceiver;
                if (eventReceiver15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
                TextWithIcon textWithIcon3 = headerModel2.totalOwedDetail;
                textWithIcon3.getClass();
                eventReceiver15.sendEvent(new AfterPayOrderHubViewEvent.TextWithInfoClicked.TotalOwedInfoClicked(textWithIcon3.infoSheetViewModel));
                return;
            case 20:
                Function0 function02 = (Function0) obj;
                if (((ArcadeModal) obj2).exiting) {
                    return;
                }
                function02.invoke();
                return;
            case 21:
                Function0 function03 = (Function0) obj;
                if (((MooncakeDialog) obj2).exiting) {
                    return;
                }
                function03.invoke();
                return;
            case 22:
                String str3 = ((DirectoryListItem.Header) obj).actionUrl;
                str3.getClass();
                ((Ui.EventReceiver) obj2).sendEvent(new DirectoryViewEvent$HeaderViewEvent$HeaderButtonClick(str3, null));
                return;
            case 23:
                InvestingCategoryTileContentModel investingCategoryTileContentModel = (InvestingCategoryTileContentModel) obj;
                GpsConfigQueries$$ExternalSyntheticLambda2 gpsConfigQueries$$ExternalSyntheticLambda2 = ((CategoryAdapter) obj2).listener;
                if (gpsConfigQueries$$ExternalSyntheticLambda2 != null) {
                    gpsConfigQueries$$ExternalSyntheticLambda2.invoke(investingCategoryTileContentModel.token);
                    return;
                }
                return;
            case 24:
                InvestingFilterPillViewModel investingFilterPillViewModel = (InvestingFilterPillViewModel) obj;
                BrandCollectionSheetViewKt$$ExternalSyntheticLambda0 brandCollectionSheetViewKt$$ExternalSyntheticLambda0 = ((FilterGroupAdapter) obj2).listener;
                if (brandCollectionSheetViewKt$$ExternalSyntheticLambda0 != null) {
                    brandCollectionSheetViewKt$$ExternalSyntheticLambda0.invoke(investingFilterPillViewModel.filterGroupToken);
                    return;
                }
                return;
            case 25:
                AppCompatTextView appCompatTextView = (AppCompatTextView) obj;
                int i3 = InvestingSubFilterSelection.$r8$clinit;
                Iterator it = new ViewGroupKt$children$1((InvestingSubFilterSelection) obj2).iterator();
                while (true) {
                    ViewGroupKt$iterator$1 viewGroupKt$iterator$1 = (ViewGroupKt$iterator$1) it;
                    if (!viewGroupKt$iterator$1.hasNext()) {
                        appCompatTextView.setSelected(true);
                        return;
                    }
                    ((View) viewGroupKt$iterator$1.next()).setSelected(false);
                }
            case 26:
                Country country = (Country) obj;
                Ui.EventReceiver eventReceiver16 = ((CountrySelectorDialog) obj2).eventReceiver;
                if (eventReceiver16 != null) {
                    eventReceiver16.sendEvent(new CountrySelectorViewEvent.Selected(country));
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
            case 27:
                ChooseReactionSheet chooseReactionSheet = (ChooseReactionSheet) obj2;
                ReactionView reactionView = (ReactionView) obj;
                ReactionBuilder reactionBuilder = chooseReactionSheet.reactionBuilder;
                Reaction reaction = reactionView.reaction;
                reaction.getClass();
                reactionBuilder.appendToReaction(reaction, reactionView, chooseReactionSheet);
                return;
            case 28:
                PasswordEntryView passwordEntryView = (PasswordEntryView) obj;
                SecurityViewPasswordEntryBinding securityViewPasswordEntryBinding = passwordEntryView.binding;
                int i4 = PasswordEntryView.$r8$clinit;
                Keyboards.hideKeyboard((MooncakePillButton) obj2);
                Ui.EventReceiver eventReceiver17 = passwordEntryView.eventReceiver;
                if (eventReceiver17 != null) {
                    eventReceiver17.sendEvent(new PasswordEntryViewEvent.ActionButtonClick(((MooncakeCheckbox) securityViewPasswordEntryBinding.securityViewBiometricsCheckbox).isChecked(), new PasswordEntryViewEvent.ActionButtonClick.PasswordSubmitData(null, String.valueOf(((MooncakeEditText) securityViewPasswordEntryBinding.securityViewPasswordEditText).getText()), 1)));
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
            default:
                TaxMenuItem taxMenuItem = (TaxMenuItem) obj;
                Ui.EventReceiver eventReceiver18 = ((TaxMenuSheetView) obj2).eventReceiver;
                if (eventReceiver18 != null) {
                    eventReceiver18.sendEvent(new TaxMenuSheetViewEvent$MenuClick(taxMenuItem));
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
        }
    }
}
