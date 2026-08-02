package com.squareup.cash.earnings.viewmodels.payers;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface AddPayerCustomersViewModel {

    public final class LoadError implements AddPayerCustomersViewModel {
        public final boolean showInOverlay;
        public final String subtitle;
        public final String title;

        public LoadError(String str, String str2, boolean z) {
            str.getClass();
            str2.getClass();
            this.title = str;
            this.subtitle = str2;
            this.showInOverlay = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadError)) {
                return false;
            }
            LoadError loadError = (LoadError) obj;
            return Intrinsics.areEqual(this.title, loadError.title) && Intrinsics.areEqual(this.subtitle, loadError.subtitle) && this.showInOverlay == loadError.showInOverlay;
        }

        @Override // com.squareup.cash.earnings.viewmodels.payers.AddPayerCustomersViewModel
        public final boolean getShowInOverlay() {
            return this.showInOverlay;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.showInOverlay) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LoadError(title=", this.title, ", subtitle=", this.subtitle, ", showInOverlay="), this.showInOverlay, ")");
        }
    }

    public final class Loaded implements AddPayerCustomersViewModel {
        public final List allContacts;
        public final String allContactsSectionTitle;
        public final List currentCustomers;
        public final boolean isSearching;
        public final boolean isToggleSaving;
        public final LoadedData loadedData;
        public final List mostRecent;
        public final String searchQuery;
        public final List searchResults;
        public final boolean showInOverlay;
        public final String subtitle;
        public final String title;

        public Loaded(String str, String str2, String str3, List list, List list2, List list3, String str4, List list4, boolean z, boolean z2, boolean z3, LoadedData loadedData) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            list.getClass();
            list2.getClass();
            list3.getClass();
            str4.getClass();
            list4.getClass();
            this.title = str;
            this.subtitle = str2;
            this.searchQuery = str3;
            this.mostRecent = list;
            this.currentCustomers = list2;
            this.allContacts = list3;
            this.allContactsSectionTitle = str4;
            this.searchResults = list4;
            this.isSearching = z;
            this.isToggleSaving = z2;
            this.showInOverlay = z3;
            this.loadedData = loadedData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.title, loaded.title) && Intrinsics.areEqual(this.subtitle, loaded.subtitle) && Intrinsics.areEqual(this.searchQuery, loaded.searchQuery) && Intrinsics.areEqual(this.mostRecent, loaded.mostRecent) && Intrinsics.areEqual(this.currentCustomers, loaded.currentCustomers) && Intrinsics.areEqual(this.allContacts, loaded.allContacts) && Intrinsics.areEqual(this.allContactsSectionTitle, loaded.allContactsSectionTitle) && Intrinsics.areEqual(this.searchResults, loaded.searchResults) && this.isSearching == loaded.isSearching && this.isToggleSaving == loaded.isToggleSaving && this.showInOverlay == loaded.showInOverlay && this.loadedData.equals(loaded.loadedData);
        }

        @Override // com.squareup.cash.earnings.viewmodels.payers.AddPayerCustomersViewModel
        public final boolean getShowInOverlay() {
            return this.showInOverlay;
        }

        public final int hashCode() {
            return this.loadedData.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle), 31, this.searchQuery), 31, this.mostRecent), 31, this.currentCustomers), 31, this.allContacts), 31, this.allContactsSectionTitle), 31, this.searchResults), 31, this.isSearching), 31, this.isToggleSaving), 31, this.showInOverlay);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loaded(title=", this.title, ", subtitle=", this.subtitle, ", searchQuery=");
            NavAction$$ExternalSyntheticOutline0.m(this.searchQuery, ", mostRecent=", ", currentCustomers=", m, this.mostRecent);
            Request$Priority$EnumUnboxingLocalUtility.m(m, this.currentCustomers, ", allContacts=", this.allContacts, ", allContactsSectionTitle=");
            NavAction$$ExternalSyntheticOutline0.m(this.allContactsSectionTitle, ", searchResults=", ", isSearching=", m, this.searchResults);
            re$$ExternalSyntheticOutline0.m(m, this.isSearching, ", isToggleSaving=", this.isToggleSaving, ", showInOverlay=");
            m.append(this.showInOverlay);
            m.append(", loadedData=");
            m.append(this.loadedData);
            m.append(")");
            return m.toString();
        }
    }

    public final class Loading implements AddPayerCustomersViewModel {
        public final boolean showInOverlay;

        public Loading(boolean z) {
            this.showInOverlay = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && this.showInOverlay == ((Loading) obj).showInOverlay;
        }

        @Override // com.squareup.cash.earnings.viewmodels.payers.AddPayerCustomersViewModel
        public final boolean getShowInOverlay() {
            return this.showInOverlay;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.showInOverlay);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("Loading(showInOverlay=", ")", this.showInOverlay);
        }
    }

    public final class SaveError implements AddPayerCustomersViewModel {
        public final Loaded loaded;

        public SaveError(Loaded loaded) {
            this.loaded = loaded;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SaveError) && this.loaded.equals(((SaveError) obj).loaded);
        }

        @Override // com.squareup.cash.earnings.viewmodels.payers.AddPayerCustomersViewModel
        public final boolean getShowInOverlay() {
            return this.loaded.showInOverlay;
        }

        public final int hashCode() {
            return this.loaded.hashCode();
        }

        public final String toString() {
            return "SaveError(loaded=" + this.loaded + ")";
        }
    }

    public final class Saving implements AddPayerCustomersViewModel {
        public final Loaded loaded;

        public Saving(Loaded loaded) {
            this.loaded = loaded;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Saving) && this.loaded.equals(((Saving) obj).loaded);
        }

        @Override // com.squareup.cash.earnings.viewmodels.payers.AddPayerCustomersViewModel
        public final boolean getShowInOverlay() {
            return this.loaded.showInOverlay;
        }

        public final int hashCode() {
            return this.loaded.hashCode();
        }

        public final String toString() {
            return "Saving(loaded=" + this.loaded + ")";
        }
    }

    boolean getShowInOverlay();
}
