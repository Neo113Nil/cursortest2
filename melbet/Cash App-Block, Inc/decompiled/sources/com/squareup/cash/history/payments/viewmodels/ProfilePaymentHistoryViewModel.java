package com.squareup.cash.history.payments.viewmodels;

import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class ProfilePaymentHistoryViewModel {

    public final class Data extends ProfilePaymentHistoryViewModel {
        public final UiCallbackModel activityEmbeddedViewModel;
        public final ProfileTransactionsBarViewModel transactionsBarViewModel;

        public Data(ProfileTransactionsBarViewModel profileTransactionsBarViewModel, UiCallbackModel uiCallbackModel) {
            this.transactionsBarViewModel = profileTransactionsBarViewModel;
            this.activityEmbeddedViewModel = uiCallbackModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return Intrinsics.areEqual(this.transactionsBarViewModel, data.transactionsBarViewModel) && this.activityEmbeddedViewModel.equals(data.activityEmbeddedViewModel);
        }

        public final int hashCode() {
            ProfileTransactionsBarViewModel profileTransactionsBarViewModel = this.transactionsBarViewModel;
            return this.activityEmbeddedViewModel.hashCode() + ((profileTransactionsBarViewModel == null ? 0 : profileTransactionsBarViewModel.hashCode()) * 31);
        }

        public final String toString() {
            return "Data(transactionsBarViewModel=" + this.transactionsBarViewModel + ", activityEmbeddedViewModel=" + this.activityEmbeddedViewModel + ")";
        }
    }

    public final class Empty extends ProfilePaymentHistoryViewModel {
        public static final Empty INSTANCE = new Empty();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Empty);
        }

        public final int hashCode() {
            return 848079542;
        }

        public final String toString() {
            return "Empty";
        }
    }
}
