package com.squareup.cash.payments.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PersonalizePaymentViewModel {

    public final class LoadedPersonalizePaymentMenu implements PersonalizePaymentViewModel {
        public final boolean allowTextEdit;
        public final float deleteTopY;
        public final ExpressivePaymentDetailsModel detailsModel;
        public final DialogViewModel dialogModel;
        public final Set elementsBeingDragged;
        public final Personalization personalization;
        public final SelectedTrack selectedTrack;
        public final boolean shouldDisableStickerButton;
        public final boolean shouldDisableTextButton;
        public final boolean shouldShakeOnInvalidEntry;
        public final boolean showCoordinateGraph;
        public final boolean showExpressivePaymentsUi;
        public final boolean showMusicButton;
        public final boolean showStickerButton;
        public final boolean showTextButton;
        public final PersonalizePaymentToolbarViewModel toolbar;

        public final class ConfirmOfflinePaymentDialog implements DialogViewModel {
            public final String message;
            public final String negativeButtonText;
            public final String positiveButtonText;
            public final String title;

            public ConfirmOfflinePaymentDialog(String str, String str2, String str3, String str4) {
                Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
                this.title = str;
                this.message = str2;
                this.positiveButtonText = str3;
                this.negativeButtonText = str4;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ConfirmOfflinePaymentDialog)) {
                    return false;
                }
                ConfirmOfflinePaymentDialog confirmOfflinePaymentDialog = (ConfirmOfflinePaymentDialog) obj;
                return Intrinsics.areEqual(this.title, confirmOfflinePaymentDialog.title) && Intrinsics.areEqual(this.message, confirmOfflinePaymentDialog.message) && Intrinsics.areEqual(this.positiveButtonText, confirmOfflinePaymentDialog.positiveButtonText) && Intrinsics.areEqual(this.negativeButtonText, confirmOfflinePaymentDialog.negativeButtonText);
            }

            @Override // com.squareup.cash.payments.viewmodels.DialogViewModel
            public final String getMessage() {
                return this.message;
            }

            @Override // com.squareup.cash.payments.viewmodels.DialogViewModel
            public final String getNegativeButtonText() {
                return this.negativeButtonText;
            }

            @Override // com.squareup.cash.payments.viewmodels.DialogViewModel
            public final String getPositiveButtonText() {
                return this.positiveButtonText;
            }

            @Override // com.squareup.cash.payments.viewmodels.DialogViewModel
            public final String getTitle() {
                return this.title;
            }

            public final int hashCode() {
                return this.negativeButtonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message), 31, this.positiveButtonText);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ConfirmOfflinePaymentDialog(title=", this.title, ", message=", this.message, ", positiveButtonText="), this.positiveButtonText, ", negativeButtonText=", this.negativeButtonText, ")");
            }
        }

        public final class Personalization {
            public final String amount;
            public final List availableBackgrounds;
            public final int chosenBackgroundIndex;
            public final List elements;

            public Personalization(String str, List list, int i, List list2) {
                str.getClass();
                list.getClass();
                list2.getClass();
                this.amount = str;
                this.availableBackgrounds = list;
                this.chosenBackgroundIndex = i;
                this.elements = list2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Personalization)) {
                    return false;
                }
                Personalization personalization = (Personalization) obj;
                return Intrinsics.areEqual(this.amount, personalization.amount) && Intrinsics.areEqual(this.availableBackgrounds, personalization.availableBackgrounds) && this.chosenBackgroundIndex == personalization.chosenBackgroundIndex && Intrinsics.areEqual(this.elements, personalization.elements);
            }

            public final int hashCode() {
                return this.elements.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.chosenBackgroundIndex, Recorder$$ExternalSyntheticOutline2.m(this.amount.hashCode() * 31, 31, this.availableBackgrounds), 31);
            }

            public final String toString() {
                StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("Personalization(amount=", this.amount, ", availableBackgrounds=", ", chosenBackgroundIndex=", this.availableBackgrounds);
                m.append(this.chosenBackgroundIndex);
                m.append(", elements=");
                m.append(this.elements);
                m.append(")");
                return m.toString();
            }
        }

        public LoadedPersonalizePaymentMenu(PersonalizePaymentToolbarViewModel personalizePaymentToolbarViewModel, ExpressivePaymentDetailsModel expressivePaymentDetailsModel, Personalization personalization, Set set, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, float f, DialogViewModel dialogViewModel, SelectedTrack selectedTrack) {
            set.getClass();
            this.toolbar = personalizePaymentToolbarViewModel;
            this.detailsModel = expressivePaymentDetailsModel;
            this.personalization = personalization;
            this.elementsBeingDragged = set;
            this.shouldShakeOnInvalidEntry = z;
            this.shouldDisableTextButton = z2;
            this.shouldDisableStickerButton = z3;
            this.showCoordinateGraph = z4;
            this.showStickerButton = z5;
            this.showTextButton = z6;
            this.showMusicButton = z7;
            this.allowTextEdit = z8;
            this.showExpressivePaymentsUi = z9;
            this.deleteTopY = f;
            this.dialogModel = dialogViewModel;
            this.selectedTrack = selectedTrack;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadedPersonalizePaymentMenu)) {
                return false;
            }
            LoadedPersonalizePaymentMenu loadedPersonalizePaymentMenu = (LoadedPersonalizePaymentMenu) obj;
            return this.toolbar.equals(loadedPersonalizePaymentMenu.toolbar) && Intrinsics.areEqual(this.detailsModel, loadedPersonalizePaymentMenu.detailsModel) && this.personalization.equals(loadedPersonalizePaymentMenu.personalization) && Intrinsics.areEqual(this.elementsBeingDragged, loadedPersonalizePaymentMenu.elementsBeingDragged) && this.shouldShakeOnInvalidEntry == loadedPersonalizePaymentMenu.shouldShakeOnInvalidEntry && this.shouldDisableTextButton == loadedPersonalizePaymentMenu.shouldDisableTextButton && this.shouldDisableStickerButton == loadedPersonalizePaymentMenu.shouldDisableStickerButton && this.showCoordinateGraph == loadedPersonalizePaymentMenu.showCoordinateGraph && this.showStickerButton == loadedPersonalizePaymentMenu.showStickerButton && this.showTextButton == loadedPersonalizePaymentMenu.showTextButton && this.showMusicButton == loadedPersonalizePaymentMenu.showMusicButton && this.allowTextEdit == loadedPersonalizePaymentMenu.allowTextEdit && this.showExpressivePaymentsUi == loadedPersonalizePaymentMenu.showExpressivePaymentsUi && Float.compare(this.deleteTopY, loadedPersonalizePaymentMenu.deleteTopY) == 0 && Intrinsics.areEqual(this.dialogModel, loadedPersonalizePaymentMenu.dialogModel) && Intrinsics.areEqual(this.selectedTrack, loadedPersonalizePaymentMenu.selectedTrack);
        }

        public final int hashCode() {
            int hashCode = this.toolbar.hashCode() * 31;
            ExpressivePaymentDetailsModel expressivePaymentDetailsModel = this.detailsModel;
            int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.deleteTopY, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.personalization.hashCode() + ((hashCode + (expressivePaymentDetailsModel == null ? 0 : expressivePaymentDetailsModel.hashCode())) * 31)) * 31, 31, this.elementsBeingDragged), 31, this.shouldShakeOnInvalidEntry), 31, this.shouldDisableTextButton), 31, this.shouldDisableStickerButton), 31, this.showCoordinateGraph), 31, this.showStickerButton), 31, this.showTextButton), 31, this.showMusicButton), 31, this.allowTextEdit), 31, this.showExpressivePaymentsUi), 31);
            DialogViewModel dialogViewModel = this.dialogModel;
            int hashCode2 = (m + (dialogViewModel == null ? 0 : dialogViewModel.hashCode())) * 31;
            SelectedTrack selectedTrack = this.selectedTrack;
            return hashCode2 + (selectedTrack != null ? selectedTrack.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LoadedPersonalizePaymentMenu(toolbar=");
            sb.append(this.toolbar);
            sb.append(", detailsModel=");
            sb.append(this.detailsModel);
            sb.append(", personalization=");
            sb.append(this.personalization);
            sb.append(", elementsBeingDragged=");
            sb.append(this.elementsBeingDragged);
            sb.append(", shouldShakeOnInvalidEntry=");
            re$$ExternalSyntheticOutline0.m(sb, this.shouldShakeOnInvalidEntry, ", shouldDisableTextButton=", this.shouldDisableTextButton, ", shouldDisableStickerButton=");
            re$$ExternalSyntheticOutline0.m(sb, this.shouldDisableStickerButton, ", showCoordinateGraph=", this.showCoordinateGraph, ", showStickerButton=");
            re$$ExternalSyntheticOutline0.m(sb, this.showStickerButton, ", showTextButton=", this.showTextButton, ", showMusicButton=");
            re$$ExternalSyntheticOutline0.m(sb, this.showMusicButton, ", allowTextEdit=", this.allowTextEdit, ", showExpressivePaymentsUi=");
            sb.append(this.showExpressivePaymentsUi);
            sb.append(", deleteTopY=");
            sb.append(this.deleteTopY);
            sb.append(", dialogModel=");
            sb.append(this.dialogModel);
            sb.append(", selectedTrack=");
            sb.append(this.selectedTrack);
            sb.append(")");
            return sb.toString();
        }
    }

    public final class LoadingPersonalizePaymentMenu implements PersonalizePaymentViewModel {
        public final ConfirmRetryResourceDialog dialogModel;
        public final boolean showExpressivePaymentsUi;
        public final PersonalizePaymentToolbarViewModel toolbar;

        public LoadingPersonalizePaymentMenu(PersonalizePaymentToolbarViewModel personalizePaymentToolbarViewModel, ConfirmRetryResourceDialog confirmRetryResourceDialog, boolean z) {
            this.toolbar = personalizePaymentToolbarViewModel;
            this.dialogModel = confirmRetryResourceDialog;
            this.showExpressivePaymentsUi = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadingPersonalizePaymentMenu)) {
                return false;
            }
            LoadingPersonalizePaymentMenu loadingPersonalizePaymentMenu = (LoadingPersonalizePaymentMenu) obj;
            return this.toolbar.equals(loadingPersonalizePaymentMenu.toolbar) && Intrinsics.areEqual(this.dialogModel, loadingPersonalizePaymentMenu.dialogModel) && this.showExpressivePaymentsUi == loadingPersonalizePaymentMenu.showExpressivePaymentsUi;
        }

        public final int hashCode() {
            int hashCode = this.toolbar.hashCode() * 31;
            ConfirmRetryResourceDialog confirmRetryResourceDialog = this.dialogModel;
            return Boolean.hashCode(this.showExpressivePaymentsUi) + ((hashCode + (confirmRetryResourceDialog == null ? 0 : confirmRetryResourceDialog.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LoadingPersonalizePaymentMenu(toolbar=");
            sb.append(this.toolbar);
            sb.append(", dialogModel=");
            sb.append(this.dialogModel);
            sb.append(", showExpressivePaymentsUi=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.showExpressivePaymentsUi, ")");
        }
    }
}
