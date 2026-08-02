package com.squareup.cash.account.settings.viewmodels;

import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import com.squareup.cash.appmessages.InlineAppMessageViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class PersonalScreenViewModel {

    /* loaded from: classes7.dex */
    public final class Default extends PersonalScreenViewModel {
        public final InlineAppMessageViewModel appMessageViewModel;
        public final ContactInfoSectionViewModel contactInfoSectionViewModel;
        public final UiCallbackModel personalInfoSectionViewModel;
        public final RatePlanButtonTreatment ratePlanButtonTreatment;

        public Default(InlineAppMessageViewModel inlineAppMessageViewModel, UiCallbackModel uiCallbackModel, ContactInfoSectionViewModel contactInfoSectionViewModel, RatePlanButtonTreatment ratePlanButtonTreatment) {
            inlineAppMessageViewModel.getClass();
            ratePlanButtonTreatment.getClass();
            this.appMessageViewModel = inlineAppMessageViewModel;
            this.personalInfoSectionViewModel = uiCallbackModel;
            this.contactInfoSectionViewModel = contactInfoSectionViewModel;
            this.ratePlanButtonTreatment = ratePlanButtonTreatment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Default)) {
                return false;
            }
            Default r3 = (Default) obj;
            return Intrinsics.areEqual(this.appMessageViewModel, r3.appMessageViewModel) && Intrinsics.areEqual(this.personalInfoSectionViewModel, r3.personalInfoSectionViewModel) && Intrinsics.areEqual(this.contactInfoSectionViewModel, r3.contactInfoSectionViewModel) && Intrinsics.areEqual(this.ratePlanButtonTreatment, r3.ratePlanButtonTreatment);
        }

        public final int hashCode() {
            int hashCode = this.appMessageViewModel.hashCode() * 31;
            UiCallbackModel uiCallbackModel = this.personalInfoSectionViewModel;
            int hashCode2 = (hashCode + (uiCallbackModel == null ? 0 : uiCallbackModel.hashCode())) * 31;
            ContactInfoSectionViewModel contactInfoSectionViewModel = this.contactInfoSectionViewModel;
            return (this.ratePlanButtonTreatment.hashCode() + ((hashCode2 + (contactInfoSectionViewModel != null ? contactInfoSectionViewModel.hashCode() : 0)) * 31)) * 31;
        }

        public final String toString() {
            return "Default(appMessageViewModel=" + this.appMessageViewModel + ", personalInfoSectionViewModel=" + this.personalInfoSectionViewModel + ", contactInfoSectionViewModel=" + this.contactInfoSectionViewModel + ", ratePlanButtonTreatment=" + this.ratePlanButtonTreatment + ", autoFillViewModel=null)";
        }
    }

    /* loaded from: classes7.dex */
    public final class LoadingState extends PersonalScreenViewModel {
        public static final LoadingState INSTANCE = new LoadingState();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LoadingState);
        }

        public final int hashCode() {
            return -1912590958;
        }

        public final String toString() {
            return "LoadingState";
        }
    }
}
