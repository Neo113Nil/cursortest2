package com.squareup.cash.offers.viewmodels;

import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersMessageViewModel;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;

/* loaded from: classes6.dex */
public interface OffersHomeListingViewModel {

    public final class Error implements OffersHomeListingViewModel {
        public final OffersMessageViewModel errorModel;

        public Error(OffersMessageViewModel offersMessageViewModel) {
            this.errorModel = offersMessageViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && this.errorModel.equals(((Error) obj).errorModel);
        }

        public final int hashCode() {
            return this.errorModel.hashCode();
        }

        public final String toString() {
            return "Error(errorModel=" + this.errorModel + ")";
        }
    }

    public final class Initial implements OffersHomeListingViewModel {
        public static final Initial INSTANCE = new Initial();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Initial);
        }

        public final int hashCode() {
            return 695720006;
        }

        public final String toString() {
            return "Initial";
        }
    }

    public final class Loaded implements OffersHomeListingViewModel {
        public final String browseFlowToken;
        public final AbstractPersistentList items;
        public final LegalTextViewModel legalText;

        public Loaded(String str, AbstractPersistentList abstractPersistentList, LegalTextViewModel legalTextViewModel) {
            abstractPersistentList.getClass();
            this.browseFlowToken = str;
            this.items = abstractPersistentList;
            this.legalText = legalTextViewModel;
        }

        public static Loaded copy$default(Loaded loaded, String str, AbstractPersistentList abstractPersistentList, int i) {
            if ((i & 1) != 0) {
                str = loaded.browseFlowToken;
            }
            LegalTextViewModel legalTextViewModel = loaded.legalText;
            abstractPersistentList.getClass();
            return new Loaded(str, abstractPersistentList, legalTextViewModel);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return this.browseFlowToken.equals(loaded.browseFlowToken) && Intrinsics.areEqual(this.items, loaded.items) && Intrinsics.areEqual(this.legalText, loaded.legalText);
        }

        public final int hashCode() {
            int hashCode = (this.items.hashCode() + (this.browseFlowToken.hashCode() * 31)) * 31;
            LegalTextViewModel legalTextViewModel = this.legalText;
            return hashCode + (legalTextViewModel == null ? 0 : legalTextViewModel.hashCode());
        }

        public final String toString() {
            return "Loaded(browseFlowToken=" + this.browseFlowToken + ", items=" + this.items + ", legalText=" + this.legalText + ")";
        }
    }

    public final class Loading implements OffersHomeListingViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -915971522;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
