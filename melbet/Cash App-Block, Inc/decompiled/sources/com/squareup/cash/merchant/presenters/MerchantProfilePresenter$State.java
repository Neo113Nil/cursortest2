package com.squareup.cash.merchant.presenters;

import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewModel;
import com.squareup.cash.loadable.Loadable;
import com.squareup.cash.merchant.viewmodels.MerchantProfileViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MerchantProfilePresenter$State {
    public final GenericTreeElementsViewModel genericTreeModel;
    public final Loadable headerState;
    public final Loadable paymentHistory;
    public final MerchantProfileViewModel.ProfilePhoto profilePhoto;

    public MerchantProfilePresenter$State(Loadable loadable, GenericTreeElementsViewModel genericTreeElementsViewModel, Loadable loadable2, MerchantProfileViewModel.ProfilePhoto profilePhoto) {
        loadable.getClass();
        genericTreeElementsViewModel.getClass();
        loadable2.getClass();
        this.headerState = loadable;
        this.genericTreeModel = genericTreeElementsViewModel;
        this.paymentHistory = loadable2;
        this.profilePhoto = profilePhoto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.squareup.cash.loadable.Loadable] */
    public static MerchantProfilePresenter$State copy$default(MerchantProfilePresenter$State merchantProfilePresenter$State, Loadable loadable, GenericTreeElementsViewModel genericTreeElementsViewModel, Loadable.Loaded loaded, MerchantProfileViewModel.ProfilePhoto profilePhoto, int i) {
        if ((i & 1) != 0) {
            loadable = merchantProfilePresenter$State.headerState;
        }
        if ((i & 2) != 0) {
            genericTreeElementsViewModel = merchantProfilePresenter$State.genericTreeModel;
        }
        Loadable.Loaded loaded2 = loaded;
        if ((i & 4) != 0) {
            loaded2 = merchantProfilePresenter$State.paymentHistory;
        }
        if ((i & 8) != 0) {
            profilePhoto = merchantProfilePresenter$State.profilePhoto;
        }
        merchantProfilePresenter$State.getClass();
        loadable.getClass();
        genericTreeElementsViewModel.getClass();
        loaded2.getClass();
        return new MerchantProfilePresenter$State(loadable, genericTreeElementsViewModel, loaded2, profilePhoto);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MerchantProfilePresenter$State)) {
            return false;
        }
        MerchantProfilePresenter$State merchantProfilePresenter$State = (MerchantProfilePresenter$State) obj;
        return Intrinsics.areEqual(this.headerState, merchantProfilePresenter$State.headerState) && Intrinsics.areEqual(this.genericTreeModel, merchantProfilePresenter$State.genericTreeModel) && Intrinsics.areEqual(this.paymentHistory, merchantProfilePresenter$State.paymentHistory) && Intrinsics.areEqual(this.profilePhoto, merchantProfilePresenter$State.profilePhoto);
    }

    public final int hashCode() {
        int hashCode = (this.paymentHistory.hashCode() + ((this.genericTreeModel.hashCode() + (this.headerState.hashCode() * 31)) * 31)) * 31;
        MerchantProfileViewModel.ProfilePhoto profilePhoto = this.profilePhoto;
        return hashCode + (profilePhoto == null ? 0 : profilePhoto.hashCode());
    }

    public final String toString() {
        return "State(headerState=" + this.headerState + ", genericTreeModel=" + this.genericTreeModel + ", paymentHistory=" + this.paymentHistory + ", profilePhoto=" + this.profilePhoto + ")";
    }
}
